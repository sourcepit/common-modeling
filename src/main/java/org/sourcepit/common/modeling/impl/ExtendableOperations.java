/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
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
