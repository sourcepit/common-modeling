/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.modeling.common;

import org.sourcepit.modeling.common.impl.AnnotatableOperations;

/**
 * @author Bernd
 */
public aspect AnnotatableAspects
{
   pointcut getAnnotation(Annotatable a, String source): target(a) && args(source) && execution(Annotation getAnnotation(String));

   pointcut getAnnotationAndCreate(Annotatable a, String source, boolean createOnDemand): target(a) && args(source, createOnDemand) && execution(Annotation getAnnotation(String, boolean));

   pointcut getAnnotationData(Annotatable a, String source, String key): target(a) && args(source, key) && execution(String getAnnotationData(String, String));

   Annotation around(Annotatable a, String source) : getAnnotation(a, source){
      return AnnotatableOperations.getAnnotation(a.getAnnotations(), source);
   }

   Annotation around(Annotatable a, String source, boolean createOnDemand) : getAnnotationAndCreate(a, source, createOnDemand){
      return AnnotatableOperations.getAnnotation(a.getAnnotations(), source, createOnDemand);
   }

   String around(Annotatable a, String source, String key) : getAnnotationData(a, source, key){
      return AnnotatableOperations.getAnnotationData(a.getAnnotations(), source, key);
   }
}
