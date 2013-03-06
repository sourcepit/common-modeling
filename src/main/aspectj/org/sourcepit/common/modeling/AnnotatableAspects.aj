/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
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
