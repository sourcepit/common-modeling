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

package org.sourcepit.common.modeling;

import org.sourcepit.common.modeling.impl.AnnotationOperations;

/**
 * @author Bernd
 */
public aspect AnnotationAspects
{
   pointcut getStringData(Annotation a, String key, String defaultValue): target(a) && args(key, defaultValue) && execution(String getData(String, String));

   pointcut setStringData(Annotation a, String key, String value): target(a) && args(key, value) && execution(void setData(String, String));

   pointcut getBooleanData(Annotation a, String key, boolean defaultValue): target(a) && args(key, defaultValue) && execution(boolean getData(String, boolean));

   pointcut setBooleanData(Annotation a, String key, boolean value): target(a) && args(key, value) && execution(void setData(String, boolean));

   String around(Annotation a, String key, String defaultValue) : getStringData(a, key, defaultValue){
      return AnnotationOperations.getData(a, key, defaultValue);
   }

   void around(Annotation a, String key, String value) : setStringData(a, key, value){
      AnnotationOperations.setData(a, key, value);
   }

   boolean around(Annotation a, String key, boolean defaultValue) : getBooleanData(a, key, defaultValue){
      return AnnotationOperations.getData(a, key, defaultValue);
   }

   void around(Annotation a, String key, boolean value) : setBooleanData(a, key, value){
      AnnotationOperations.setData(a, key, value);
   }
}
