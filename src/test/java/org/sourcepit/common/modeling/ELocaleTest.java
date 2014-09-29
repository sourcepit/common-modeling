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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Locale;

import org.eclipse.emf.ecore.EDataType;
import org.junit.Test;

/**
 * @author Bernd
 */
public class ELocaleTest
{
   @Test
   public void testConvert() throws Exception
   {
      EDataType eLocaleType = CommonModelingPackage.eINSTANCE.getELocale();
      CommonModelingFactory converter = CommonModelingFactory.eINSTANCE;

      assertNull(converter.convertToString(eLocaleType, null));
      assertEquals("", converter.convertToString(eLocaleType, new Locale("")));
      assertEquals("de", converter.convertToString(eLocaleType, new Locale("de")));
      assertEquals("de_DE", converter.convertToString(eLocaleType, new Locale("de", "DE")));
      assertEquals("de_DE_SCHWÄBISCH", converter.convertToString(eLocaleType, new Locale("de", "DE", "SCHWÄBISCH")));
   }

   @Test
   public void testFromString() throws Exception
   {
      EDataType eLocaleType = CommonModelingPackage.eINSTANCE.getELocale();
      CommonModelingFactory converter = CommonModelingFactory.eINSTANCE;

      assertNull(converter.convertToString(eLocaleType, null));
      assertEquals("", converter.convertToString(eLocaleType, new Locale("")));
      assertEquals("de", converter.convertToString(eLocaleType, new Locale("de")));
      assertEquals("de_DE", converter.convertToString(eLocaleType, new Locale("de", "DE")));
      assertEquals("de_DE_SCHWÄBISCH", converter.convertToString(eLocaleType, new Locale("de", "DE", "SCHWÄBISCH")));

      assertNull(converter.createFromString(eLocaleType, null));
      assertEquals(new Locale(""), converter.createFromString(eLocaleType, ""));
      assertEquals(new Locale("de", "DE"), converter.createFromString(eLocaleType, "de_DE"));
      assertEquals(new Locale("de", "DE", "SCHWÄBISCH"), converter.createFromString(eLocaleType, "de_DE_SCHWÄBISCH"));
      assertEquals(new Locale(""), converter.createFromString(eLocaleType, "______"));
   }
}
