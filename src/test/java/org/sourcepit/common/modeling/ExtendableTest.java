/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.modeling;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import javax.validation.ConstraintViolationException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNull;
import org.hamcrest.core.IsSame;
import org.junit.Test;

/**
 * CapableTest
 * 
 * @author Bernd
 */
public class ExtendableTest
{

   // mock object. operations implemented by aspects
   private class ExtendableImpl extends EObjectImpl implements Extendable
   {
      private EList<EObject> extensions = new BasicEList<EObject>();

      public EList<EObject> getExtensions()
      {
         return extensions;
      }

      public <T extends EObject> T getExtension(Class<T> extensionType)
      {
         return null;
      }

      public <T extends EObject> EList<T> getExtensions(Class<T> extensionType)
      {
         return null;
      }

      public <T extends EObject> void addExtension(T extension)
      {
      }

      public <T extends EObject> void removeExtension(T extension)
      {
      }

      public <T extends EObject> void removeExtensions(Class<T> extentionType)
      {
      }
   }

   @Test
   public void testNullArgs()
   {
      final Extendable extendable = new ExtendableImpl();
      try
      {
         extendable.getExtension(null);
         fail();
      }
      catch (ConstraintViolationException e)
      {
      }

      try
      {
         extendable.getExtensions(null);
         fail();
      }
      catch (ConstraintViolationException e)
      {
      }

      try
      {
         extendable.addExtension(null);
         fail();
      }
      catch (ConstraintViolationException e)
      {
      }

      try
      {
         extendable.removeExtension(null);
         fail();
      }
      catch (ConstraintViolationException e)
      {
      }

      try
      {
         extendable.removeExtensions(null);
         fail();
      }
      catch (ConstraintViolationException e)
      {
      }
   }

   @Test
   public void testGetExtension() throws Exception
   {
      final Extendable extendable = new ExtendableImpl();

      Annotatable extension = extendable.getExtension(Annotatable.class);
      assertThat(extension, IsNull.nullValue());

      Annotatable mock = mock(Annotatable.class);
      extendable.addExtension(mock);

      extension = extendable.getExtension(Annotatable.class);
      assertThat(extension, IsNull.notNullValue());
      assertThat(extension, IsSame.sameInstance(mock));

      extension = (Annotatable) extendable.getExtension(EObject.class);
      assertThat(extension, IsNull.notNullValue());
      assertThat(extension, IsSame.sameInstance(mock));

      extendable.removeExtension(mock);
      extension = extendable.getExtension(Annotatable.class);
      assertThat(extension, IsNull.nullValue());
   }

   @Test
   public void testGetExtensions() throws Exception
   {
      final Extendable extendable = new ExtendableImpl();

      Annotatable mock1 = mock(Annotatable.class);
      extendable.addExtension(mock1);

      Annotatable mock2 = mock(Annotatable.class);
      extendable.addExtension(mock2);

      Annotation mock3 = mock(Annotation.class);
      extendable.addExtension(mock3);

      assertThat(extendable.getExtensions().size(), Is.is(3));

      EList<Annotatable> extensions = extendable.getExtensions(Annotatable.class);
      assertThat(extensions.size(), Is.is(3));

      assertThat(extensions.get(0), IsSame.sameInstance(mock1));
      assertThat(extensions.get(1), IsSame.sameInstance(mock2));
      assertThat(((Annotation) extensions.get(2)), IsSame.sameInstance(mock3));

      EList<Annotation> extensions2 = extendable.getExtensions(Annotation.class);
      assertThat(extensions2.size(), Is.is(1));

      extendable.removeExtensions(Annotation.class);
      assertThat(extendable.getExtensions().size(), Is.is(2));

      extendable.removeExtensions(Annotatable.class);
      assertThat(extendable.getExtensions().size(), Is.is(0));
   }
}
