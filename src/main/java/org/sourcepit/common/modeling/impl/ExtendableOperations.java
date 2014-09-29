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

import org.sourcepit.common.constraints.NotNull;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.sourcepit.common.modeling.Extendable;

/**
 * @author Bernd
 */
public class ExtendableOperations
{
   @SuppressWarnings("unchecked")
   public static <T extends EObject> T getExtension(@NotNull Extendable extendable, @NotNull Class<T> extensionType)
   {
      for (EObject extension : extendable.getExtensions())
      {
         if (extensionType.isAssignableFrom(extension.getClass()))
         {
            return (T) extension;
         }
      }
      return null;
   }

   @SuppressWarnings("unchecked")
   public static <T extends EObject> EList<T> getExtensions(@NotNull Extendable extendable,
      @NotNull Class<? extends EObject> extensionType)
   {
      final EList<T> extensions = new BasicEList<T>();
      for (EObject extension : extendable.getExtensions())
      {
         if (extensionType.isAssignableFrom(extension.getClass()))
         {
            extensions.add((T) extension);
         }
      }
      return extensions;
   }

   public static void addExtension(@NotNull Extendable extendable, @NotNull EObject extension)
   {
      extendable.getExtensions().add(extension);
   }

   public static void removeExtension(@NotNull Extendable extendable, @NotNull EObject extension)
   {
      extendable.getExtensions().remove(extension);
   }

   public static void removeExtensions(@NotNull Extendable extendable, @NotNull Class<? extends EObject> extensionType)
   {
      final EList<EObject> extensions = getExtensions(extendable, extensionType);
      if (!extensions.isEmpty())
      {
         extendable.getExtensions().removeAll(extensions);
      }
   }
}
