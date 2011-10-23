
package org.sourcepit.modeling.common;

import org.sourcepit.modeling.common.impl.AnnotatableOperations;
import org.sourcepit.modeling.common.impl.AnnotationOperations;

/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

public abstract aspect CommonModelOperationsAspects extends CommonModelOperationsPCDs
{
   Annotation around(Annotatable a, String source) : getAnnotation(a, source){
      return AnnotatableOperations.getAnnotation(a.getAnnotations(), source);
   }

   Annotation around(Annotatable a, String source, boolean createOnDemand) : getAnnotationAndCreate(a, source, createOnDemand){
      return AnnotatableOperations.getAnnotation(a.getAnnotations(), source, createOnDemand);
   }
   
   String around(Annotatable a, String source, String key) : getAnnotationData(a, source, key){
      return AnnotatableOperations.getAnnotationData(a.getAnnotations(), source, key);
   }
   
   boolean around(Annotation a, String key, boolean defaultValue) : getData(a, key, defaultValue){
      return AnnotationOperations.getData(a, key, defaultValue);
   }

   void around(Annotation a, String key, boolean value) : setData(a, key, value){
      AnnotationOperations.setData(a, key, value);
   }
}
