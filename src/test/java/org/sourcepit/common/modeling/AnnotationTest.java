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
