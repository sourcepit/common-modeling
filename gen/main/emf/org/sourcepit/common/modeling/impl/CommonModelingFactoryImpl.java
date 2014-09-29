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

import java.io.File;
import java.net.URL;
import java.util.Locale;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.sourcepit.common.modeling.Annotation;
import org.sourcepit.common.modeling.CommonModelingFactory;
import org.sourcepit.common.modeling.CommonModelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class CommonModelingFactoryImpl extends EFactoryImpl implements CommonModelingFactory
{
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static CommonModelingFactory init()
   {
      try
      {
         CommonModelingFactory theCommonModelingFactory = (CommonModelingFactory) EPackage.Registry.INSTANCE
            .getEFactory("http://www.sourcepit.org/common/modeling/0.1");
         if (theCommonModelingFactory != null)
         {
            return theCommonModelingFactory;
         }
      }
      catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new CommonModelingFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public CommonModelingFactoryImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public EObject create(EClass eClass)
   {
      switch (eClass.getClassifierID())
      {
         case CommonModelingPackage.ANNOTATION :
            return createAnnotation();
         case CommonModelingPackage.ESTRING_MAP_ENTRY :
            return (EObject) createEStringMapEntry();
         case CommonModelingPackage.ECONTAINMENT_MAP_ENTRY :
            return (EObject) createEContainmentMapEntry();
         case CommonModelingPackage.EREFERENCE_MAP_ENTRY :
            return (EObject) createEReferenceMapEntry();
         default :
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public Object createFromString(EDataType eDataType, String initialValue)
   {
      switch (eDataType.getClassifierID())
      {
         case CommonModelingPackage.EFILE :
            return createEFileFromString(eDataType, initialValue);
         case CommonModelingPackage.ELOCALE :
            return createELocaleFromString(eDataType, initialValue);
         case CommonModelingPackage.EURL :
            return createEURLFromString(eDataType, initialValue);
         default :
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public String convertToString(EDataType eDataType, Object instanceValue)
   {
      switch (eDataType.getClassifierID())
      {
         case CommonModelingPackage.EFILE :
            return convertEFileToString(eDataType, instanceValue);
         case CommonModelingPackage.ELOCALE :
            return convertELocaleToString(eDataType, instanceValue);
         case CommonModelingPackage.EURL :
            return convertEURLToString(eDataType, instanceValue);
         default :
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public Annotation createAnnotation()
   {
      AnnotationImpl annotation = new AnnotationImpl();
      return annotation;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public Entry<String, String> createEStringMapEntry()
   {
      EStringMapEntryImpl eStringMapEntry = new EStringMapEntryImpl();
      return eStringMapEntry;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public Entry<String, EObject> createEContainmentMapEntry()
   {
      EContainmentMapEntryImpl eContainmentMapEntry = new EContainmentMapEntryImpl();
      return eContainmentMapEntry;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public Entry<String, EObject> createEReferenceMapEntry()
   {
      EReferenceMapEntryImpl eReferenceMapEntry = new EReferenceMapEntryImpl();
      return eReferenceMapEntry;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public File createEFileFromString(EDataType eDataType, String initialValue)
   {
      return (File) super.createFromString(eDataType, initialValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String convertEFileToString(EDataType eDataType, Object instanceValue)
   {
      return super.convertToString(eDataType, instanceValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public Locale createELocaleFromString(EDataType eDataType, String initialValue)
   {
      return (Locale) super.createFromString(eDataType, initialValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String convertELocaleToString(EDataType eDataType, Object instanceValue)
   {
      return super.convertToString(eDataType, instanceValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public URL createEURLFromString(EDataType eDataType, String initialValue)
   {
      return (URL) super.createFromString(eDataType, initialValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String convertEURLToString(EDataType eDataType, Object instanceValue)
   {
      return super.convertToString(eDataType, instanceValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public CommonModelingPackage getCommonModelingPackage()
   {
      return (CommonModelingPackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @deprecated
    * @generated
    */
   @Deprecated
   public static CommonModelingPackage getPackage()
   {
      return CommonModelingPackage.eINSTANCE;
   }

} // CommonModelingFactoryImpl
