/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.modeling.common;


public abstract aspect CommonModelOperationsPCDs
{
   pointcut getAnnotation(Annotatable a, String source): target(a) && args(source) && execution(Annotation getAnnotation(String));

   pointcut getAnnotationAndCreate(Annotatable a, String source, boolean createOnDemand): target(a) && args(source, createOnDemand) && execution(Annotation getAnnotation(String, boolean));

   pointcut getAnnotationData(Annotatable a, String source, String key): target(a) && args(source, key) && execution(String getAnnotationData(String, String));

   pointcut getStringData(Annotation a, String key, String defaultValue): target(a) && args(key, defaultValue) && execution(String getData(String, String));

   pointcut setStringData(Annotation a, String key, String value): target(a) && args(key, value) && execution(void setData(String, String));

   pointcut getBooleanData(Annotation a, String key, boolean defaultValue): target(a) && args(key, defaultValue) && execution(boolean getData(String, boolean));

   pointcut setBooleanData(Annotation a, String key, boolean value): target(a) && args(key, value) && execution(void setData(String, boolean));
}
