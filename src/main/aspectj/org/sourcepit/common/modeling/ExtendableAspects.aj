/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
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
