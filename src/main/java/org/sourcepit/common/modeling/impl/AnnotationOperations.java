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

import org.sourcepit.common.modeling.Annotation;

public final class AnnotationOperations {
   private AnnotationOperations() {
      super();
   }

   public static String getData(Annotation annotation, String key, String defaultValue) {
      final String value = annotation.getData().get(key);
      if (value != null) {
         return value;
      }
      return defaultValue;
   }

   public static void setData(Annotation annotation, String key, String value) {
      annotation.getData().put(key, value);
   }

   public static boolean getData(Annotation annotation, String key, boolean defaultValue) {
      final String value = annotation.getData().get(key);
      if (value != null) {
         return Boolean.valueOf(value);
      }
      return defaultValue;
   }

   public static void setData(Annotation annotation, String key, boolean value) {
      annotation.getData().put(key, Boolean.toString(value));
   }
}
