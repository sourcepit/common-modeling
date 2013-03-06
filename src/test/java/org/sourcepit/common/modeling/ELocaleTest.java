/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
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
