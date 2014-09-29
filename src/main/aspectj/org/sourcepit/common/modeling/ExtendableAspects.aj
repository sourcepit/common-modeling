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

import org.aspectj.lang.annotation.SuppressAjWarnings;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.sourcepit.common.modeling.impl.ExtendableOperations;

/**
 * @author Bernd
 */
public aspect ExtendableAspects
{
   pointcut getExtension(Extendable e, Class<? extends EObject> t) : target(e) && args(t) && execution(EObject getExtension(Class));

   pointcut getExtensions(Extendable e, Class<? extends EObject> t) : target(e) && args(t) && execution(EList getExtensions(Class));

   pointcut addExtension(Extendable e, EObject extension) : target(e) && args(extension) && execution(void addExtension(EObject));

   pointcut removeExtension(Extendable e, EObject extension) : target(e) && args(extension) && execution(void removeExtension(EObject));

   pointcut removeExtensions(Extendable e, Class<? extends EObject> t) : target(e) && args(t) && execution(void removeExtensions(Class));

   EObject around(Extendable e, Class<? extends EObject> t) : getExtension(e, t){
      return ExtendableOperations.getExtension(e, t);
   }

   @SuppressWarnings("rawtypes")
   @SuppressAjWarnings("uncheckedAdviceConversion")
   EList around(Extendable e, Class<? extends EObject> t) : getExtensions(e, t){
      return ExtendableOperations.getExtensions(e, t);
   }

   void around(Extendable e, EObject extension) : addExtension(e, extension){
      ExtendableOperations.addExtension(e, extension);
   }

   void around(Extendable e, EObject extension) : removeExtension(e, extension){
      ExtendableOperations.removeExtension(e, extension);
   }

   void around(Extendable e, Class<? extends EObject> t) : removeExtensions(e, t){
      ExtendableOperations.removeExtensions(e, t);
   }
}
