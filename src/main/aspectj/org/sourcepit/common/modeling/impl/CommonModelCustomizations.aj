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

import java.util.Locale;

import org.eclipse.emf.ecore.EDataType;

public aspect CommonModelCustomizations
{
   pointcut createELocaleFromString(EDataType eDataType, String initialValue):  args(eDataType, initialValue) && execution(Locale CommonModelingFactoryImpl.createELocaleFromString(EDataType, String));

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
