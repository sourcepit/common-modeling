/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.modeling.common;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.hamcrest.core.IsNot;
import org.junit.Test;

/**
 * @author Bernd
 */
public abstract class AbstractAnnotatableTest
{
   @Test
   public void testGetAnnotation() throws Exception
   {
      int count = 0;

      List<EClass> annotateableTypes = getAnnotateableTypes();
      for (EClass eClass : annotateableTypes)
      {
         count++;

         Annotatable annotateable = createAnnotateable(eClass);
         try
         {
            annotateable.getAnnotation(null);
            fail("Must throw IllegalArgumentException");
         }
         catch (IllegalArgumentException e)
         {
         }
         catch (UnsupportedOperationException e)
         {
            fail("Operation getAnnotation(source) not supported by type " + annotateable.getClass().getSimpleName());
         }

         assertNull(annotateable.getAnnotation("foo"));

         Annotation a = CommonModelFactory.eINSTANCE.createAnnotation();
         a.setSource(annotateable.getClass().getName());

         annotateable.getAnnotations().add(a);

         Annotation aa = annotateable.getAnnotation(annotateable.getClass().getName());
         assertNotNull(aa);
         assertSame(a, aa);

         Annotation aaa = CommonModelFactory.eINSTANCE.createAnnotation();
         aaa.setSource(annotateable.getClass().getName() + "2");

         annotateable.getAnnotations().add(aaa);

         aa = annotateable.getAnnotation(annotateable.getClass().getName());
         assertNotNull(aa);
         assertSame(a, aa);
         assertNotSame(aa, aaa);

         Annotation aaaa = annotateable.getAnnotation(annotateable.getClass().getName() + "2");
         assertNotNull(aaaa);
         assertSame(aaa, aaaa);
         assertNotSame(aa, aaaa);

         assertNull(annotateable.getAnnotation("foo"));
      }
      assertThat(count, IsNot.not(0));
   }
   
   @Test
   public void testGetAnnotationAndCreateOnDemand() throws Exception
   {
      int count = 0;

      List<EClass> annotateableTypes = getAnnotateableTypes();
      for (EClass eClass : annotateableTypes)
      {
         count++;

         Annotatable annotateable = createAnnotateable(eClass);
         try
         {
            annotateable.getAnnotation(null, true);
            fail("Must throw IllegalArgumentException");
         }
         catch (IllegalArgumentException e)
         {
         }
         catch (UnsupportedOperationException e)
         {
            fail("Operation getAnnotation(source) not supported by type " + annotateable.getClass().getSimpleName());
         }

         assertNull(annotateable.getAnnotation("foo", false));
         assertNotNull(annotateable.getAnnotation("foo", true));

         Annotation a = CommonModelFactory.eINSTANCE.createAnnotation();
         a.setSource(annotateable.getClass().getName());

         annotateable.getAnnotations().add(a);

         Annotation aa = annotateable.getAnnotation(annotateable.getClass().getName(), true);
         assertNotNull(aa);
         assertSame(a, aa);

         Annotation aaa = CommonModelFactory.eINSTANCE.createAnnotation();
         aaa.setSource(annotateable.getClass().getName() + "2");

         annotateable.getAnnotations().add(aaa);

         aa = annotateable.getAnnotation(annotateable.getClass().getName(), true);
         assertNotNull(aa);
         assertSame(a, aa);
         assertNotSame(aa, aaa);

         Annotation aaaa = annotateable.getAnnotation(annotateable.getClass().getName() + "2");
         assertNotNull(aaaa);
         assertSame(aaa, aaaa);
         assertNotSame(aa, aaaa);

         assertNotNull(annotateable.getAnnotation("foo", false));
      }
      assertThat(count, IsNot.not(0));
   }

   private Annotatable createAnnotateable(EClass eClass)
   {
      Annotatable annotateable = (Annotatable) eClass.getEPackage().getEFactoryInstance().create(eClass);
      assertNotNull(annotateable);
      return annotateable;
   }

   @Test
   public void testGetAnnotationData() throws Exception
   {
      int count = 0;
      
      List<EClass> annotateableTypes = getAnnotateableTypes();
      for (EClass eClass : annotateableTypes)
      {
         count++;
         
         Annotatable annotateable = createAnnotateable(eClass);
         try
         {
            annotateable.getAnnotationData(null, null);
            fail("Must throw IllegalArgumentException");
         }
         catch (IllegalArgumentException e)
         {
         }
         catch (UnsupportedOperationException e)
         {
            fail("Operation getAnnotation(source) not supported by type " + annotateable.getClass().getSimpleName());
         }

         try
         {
            annotateable.getAnnotationData("source", null);
            fail("Must throw IllegalArgumentException");
         }
         catch (IllegalArgumentException e)
         {
         }

         assertNull(annotateable.getAnnotationData("source", "key"));

         Annotation a = CommonModelFactory.eINSTANCE.createAnnotation();
         a.setSource("source");
         annotateable.getAnnotations().add(a);

         assertNull(annotateable.getAnnotationData("source", "key"));

         a.getData().put("key", "value");

         assertEquals("value", annotateable.getAnnotationData("source", "key"));
      }
      assertThat(count, IsNot.not(0));
   }

   private List<EClass> getAnnotateableTypes()
   {
      EClass annotateableType = CommonModelPackage.eINSTANCE.getAnnotatable();
      List<EClass> annotateableTypes = new ArrayList<EClass>();
      for (EClassifier eClassifier : getAllEClassifiers())
      {
         if (eClassifier instanceof EClass)
         {
            EClass eClass = (EClass) eClassifier;
            if (!eClass.isAbstract() && !eClass.isInterface() && annotateableType.isSuperTypeOf(eClass))
            {
               annotateableTypes.add(eClass);
            }
         }
      }
      assertFalse(annotateableTypes.isEmpty());
      return annotateableTypes;
   }

   private EList<EClassifier> getAllEClassifiers()
   {
      List<EPackage> ePackages = new ArrayList<EPackage>();
      addEPackages(ePackages);
      EList<EClassifier> classifiers = new BasicEList<EClassifier>();
      for (EPackage ePackage : ePackages)
      {
         classifiers.addAll(ePackage.getEClassifiers());
      }
      return classifiers;
   }

   protected abstract void addEPackages(List<EPackage> ePackages);
}
