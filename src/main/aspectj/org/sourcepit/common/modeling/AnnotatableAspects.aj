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

import org.sourcepit.common.modeling.Annotatable;
import org.sourcepit.common.modeling.impl.AnnotatableOperations;

/**
 * @author Bernd
 */
public aspect AnnotatableAspects
{
   pointcut getAnnotation(Annotatable a, String source): target(a) && args(source) && execution(Annotation getAnnotation(String));

   pointcut getAnnotationAndCreate(Annotatable a, String source, boolean createOnDemand): target(a) && args(source, createOnDemand) && execution(Annotation getAnnotation(String, boolean));

   pointcut getAnnotationData(Annotatable a, String source, String key): target(a) && args(source, key) && execution(String getAnnotationData(String, String));

   pointcut setAnnotationData(Annotatable a, String source, String key, String value): target(a) && args(source, key, value) && execution(String setAnnotationData(String, String, String));

   Annotation around(Annotatable a, String source) : getAnnotation(a, source){
      return AnnotatableOperations.getAnnotation(a.getAnnotations(), source);
   }

   Annotation around(Annotatable a, String source, boolean createOnDemand) : getAnnotationAndCreate(a, source, createOnDemand){
      return AnnotatableOperations.getAnnotation(a.getAnnotations(), source, createOnDemand);
   }

   String around(Annotatable a, String source, String key) : getAnnotationData(a, source, key){
      return AnnotatableOperations.getAnnotationData(a.getAnnotations(), source, key);
   }

   String around(Annotatable a, String source, String key, String value) : setAnnotationData(a, source, key, value){
      return AnnotatableOperations.setAnnotationData(a.getAnnotations(), source, key, value);
   }
}
