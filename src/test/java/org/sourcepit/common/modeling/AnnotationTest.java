/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.modeling;

import java.io.ByteArrayOutputStream;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.junit.Test;

public class AnnotationTest
{

   @Test
   public void test() throws Exception
   {
      Annotation annotation = CommonModelingFactory.eINSTANCE.createAnnotation();
      annotation.setSource("srcpit");

      annotation.getData().put("foo", "bar");
      annotation.getData().put("jdshfd", "sökdfdslfkdsjf");

      Annotation content = CommonModelingFactory.eINSTANCE.createAnnotation();
      content.getData().put("murk", "nicht");

      annotation.getContents().put("hans", content);

      annotation.getReferences().put("ref", content);

      Annotation parent = CommonModelingFactory.eINSTANCE.createAnnotation();
      parent.getAnnotations().add(annotation);

      Resource res = new XMLResourceImpl();
      res.getContents().add(parent);

      ByteArrayOutputStream out = new ByteArrayOutputStream();
      res.save(out, null);

      System.out.println(out);
   }

}
