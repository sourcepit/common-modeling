
package org.sourcepit.modeling.common;

import java.util.Locale;

import org.eclipse.emf.ecore.EDataType;
import org.sourcepit.modeling.common.impl.CommonModelFactoryImpl;
import org.sourcepit.modeling.common.impl.AnnotatableOperations;
import org.sourcepit.modeling.common.impl.AnnotationOperations;

/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

public aspect CommonModelOperations
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

   pointcut getData(Annotation a, String key, boolean defaultValue): target(a) && args(key, defaultValue) && execution(boolean getData(String, boolean));

   pointcut setData(Annotation a, String key, boolean value): target(a) && args(key, value) && execution(void setData(String, boolean));

   boolean around(Annotation a, String key, boolean defaultValue) : getData(a, key, defaultValue){
      return AnnotationOperations.getData(a, key, defaultValue);
   }

   void around(Annotation a, String key, boolean value) : setData(a, key, value){
      AnnotationOperations.setData(a, key, value);
   }
   
   pointcut createELocaleFromString(EDataType eDataType, String initialValue):  args(eDataType, initialValue) && execution(Locale CommonModelFactoryImpl.createELocaleFromString(EDataType, String));

   Locale around(EDataType eDataType, String initialValue) : createELocaleFromString(eDataType, initialValue) {
      if (initialValue == null)
      {
         return null;
      }
      String[] groups = initialValue.split("_");
      final String[] segments = new String[3];
      for (int i = 0; i < segments.length; i++)
      {
         String group = groups.length > i ? groups[i] : null;
         segments[i] = group == null ? "" : group.startsWith("_") ? group.substring(1) : group;
      }
      return new Locale(segments[0], segments[1], segments[2]);
   }
}
