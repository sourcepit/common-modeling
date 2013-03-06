/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.modeling.impl;

import org.eclipse.emf.common.util.EList;
import org.sourcepit.common.modeling.Annotation;
import org.sourcepit.common.modeling.CommonModelingFactory;

public final class AnnotatableOperations
{
   private AnnotatableOperations()
   {
      super();
   }

   public static Annotation getAnnotation(EList<Annotation> annotations, String source)
   {
      return getAnnotation(annotations, source, false);
   }

   public static Annotation getAnnotation(EList<Annotation> annotations, String source, boolean createOnDemand)
   {
      if (source == null)
      {
         throw new IllegalArgumentException("Source must not be null");
      }
      if (annotations == null)
      {
         throw new IllegalArgumentException("Annotations must not be null.");
      }
      for (Annotation annotation : annotations)
      {
         if (source.equals(annotation.getSource()))
         {
            return annotation;
         }
      }
      if (createOnDemand)
      {
         Annotation annotation = CommonModelingFactory.eINSTANCE.createAnnotation();
         annotation.setSource(source);
         annotations.add(annotation);
         return annotation;
      }
      return null;
   }

   public static String getAnnotationData(EList<Annotation> annotations, String source, String key)
   {
      if (key == null)
      {
         throw new IllegalArgumentException("Key must not be null.");
      }
      final Annotation annotation = getAnnotation(annotations, source);
      if (annotation != null)
      {
         return annotation.getData().get(key);
      }
      return null;
   }

   public static String setAnnotationData(EList<Annotation> annotations, String source, String key, String value)
   {
      if (key == null)
      {
         throw new IllegalArgumentException("Key must not be null.");
      }
      Annotation annotation = getAnnotation(annotations, source);
      if (annotation == null)
      {
         annotation = CommonModelingFactory.eINSTANCE.createAnnotation();
         annotation.setSource(source);
         annotations.add(annotation);
      }
      return annotation.getData().put(key, value);
   }
}
