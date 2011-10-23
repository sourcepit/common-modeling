/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.modeling.common;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;

public class AnnotatableTest extends AbstractAnnotatableTest
{
   @Override
   protected void addEPackages(List<EPackage> ePackages)
   {
      ePackages.add(CommonModelPackage.eINSTANCE);
   }

}
