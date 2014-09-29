/*
 * Copyright 2014 Bernd Vogt and others.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
