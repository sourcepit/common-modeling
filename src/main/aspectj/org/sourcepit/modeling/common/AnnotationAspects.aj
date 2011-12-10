/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.modeling.common;

import org.sourcepit.modeling.common.impl.AnnotationOperations;

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
