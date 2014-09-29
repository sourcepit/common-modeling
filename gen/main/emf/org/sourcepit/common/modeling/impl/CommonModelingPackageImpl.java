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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.sourcepit.common.modeling.Annotatable;
import org.sourcepit.common.modeling.Annotation;
import org.sourcepit.common.modeling.CommonModelingFactory;
import org.sourcepit.common.modeling.CommonModelingPackage;
import org.sourcepit.common.modeling.Extendable;
import org.sourcepit.common.modeling.XAnnotatable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class CommonModelingPackageImpl extends EPackageImpl implements CommonModelingPackage
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass annotatableEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass annotationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass eStringMapEntryEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass eContainmentMapEntryEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass eReferenceMapEntryEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass extendableEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass xAnnotatableEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EDataType eFileEDataType = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EDataType eLocaleEDataType = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EDataType eurlEDataType = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
    * EPackage.Registry} by the package
    * package URI value.
    * <p>
    * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
    * performs initialization of the package, or returns the registered package, if one already exists. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see org.sourcepit.common.modeling.CommonModelingPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private CommonModelingPackageImpl()
   {
      super(eNS_URI, CommonModelingFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>
    * This method is used to initialize {@link CommonModelingPackage#eINSTANCE} when that field is accessed. Clients
    * should not invoke it directly. Instead, they should simply access that field to obtain the package. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static CommonModelingPackage init()
   {
      if (isInited)
         return (CommonModelingPackage) EPackage.Registry.INSTANCE.getEPackage(CommonModelingPackage.eNS_URI);

      // Obtain or create and register package
      CommonModelingPackageImpl theCommonModelingPackage = (CommonModelingPackageImpl) (EPackage.Registry.INSTANCE
         .get(eNS_URI) instanceof CommonModelingPackageImpl
         ? EPackage.Registry.INSTANCE.get(eNS_URI)
         : new CommonModelingPackageImpl());

      isInited = true;

      // Create package meta-data objects
      theCommonModelingPackage.createPackageContents();

      // Initialize created meta-data
      theCommonModelingPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theCommonModelingPackage.freeze();


      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(CommonModelingPackage.eNS_URI, theCommonModelingPackage);
      return theCommonModelingPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getAnnotatable()
   {
      return annotatableEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getAnnotatable_Annotations()
   {
      return (EReference) annotatableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getAnnotation()
   {
      return annotationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getAnnotation_Target()
   {
      return (EReference) annotationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getAnnotation_Source()
   {
      return (EAttribute) annotationEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getAnnotation_Data()
   {
      return (EReference) annotationEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getAnnotation_Contents()
   {
      return (EReference) annotationEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getAnnotation_References()
   {
      return (EReference) annotationEClass.getEStructuralFeatures().get(4);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getAnnotation_Content()
   {
      return (EReference) annotationEClass.getEStructuralFeatures().get(5);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getEStringMapEntry()
   {
      return eStringMapEntryEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getEStringMapEntry_Key()
   {
      return (EAttribute) eStringMapEntryEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getEStringMapEntry_Value()
   {
      return (EAttribute) eStringMapEntryEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getEContainmentMapEntry()
   {
      return eContainmentMapEntryEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getEContainmentMapEntry_Key()
   {
      return (EAttribute) eContainmentMapEntryEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getEContainmentMapEntry_Value()
   {
      return (EReference) eContainmentMapEntryEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getEReferenceMapEntry()
   {
      return eReferenceMapEntryEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getEReferenceMapEntry_Key()
   {
      return (EAttribute) eReferenceMapEntryEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getEReferenceMapEntry_Value()
   {
      return (EReference) eReferenceMapEntryEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getExtendable()
   {
      return extendableEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getExtendable_Extensions()
   {
      return (EReference) extendableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getXAnnotatable()
   {
      return xAnnotatableEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EDataType getEFile()
   {
      return eFileEDataType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EDataType getELocale()
   {
      return eLocaleEDataType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EDataType getEURL()
   {
      return eurlEDataType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public CommonModelingFactory getCommonModelingFactory()
   {
      return (CommonModelingFactory) getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package. This method is
    * guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void createPackageContents()
   {
      if (isCreated)
         return;
      isCreated = true;

      // Create classes and their features
      annotatableEClass = createEClass(ANNOTATABLE);
      createEReference(annotatableEClass, ANNOTATABLE__ANNOTATIONS);

      annotationEClass = createEClass(ANNOTATION);
      createEReference(annotationEClass, ANNOTATION__TARGET);
      createEAttribute(annotationEClass, ANNOTATION__SOURCE);
      createEReference(annotationEClass, ANNOTATION__DATA);
      createEReference(annotationEClass, ANNOTATION__CONTENTS);
      createEReference(annotationEClass, ANNOTATION__REFERENCES);
      createEReference(annotationEClass, ANNOTATION__CONTENT);

      eStringMapEntryEClass = createEClass(ESTRING_MAP_ENTRY);
      createEAttribute(eStringMapEntryEClass, ESTRING_MAP_ENTRY__KEY);
      createEAttribute(eStringMapEntryEClass, ESTRING_MAP_ENTRY__VALUE);

      eContainmentMapEntryEClass = createEClass(ECONTAINMENT_MAP_ENTRY);
      createEAttribute(eContainmentMapEntryEClass, ECONTAINMENT_MAP_ENTRY__KEY);
      createEReference(eContainmentMapEntryEClass, ECONTAINMENT_MAP_ENTRY__VALUE);

      eReferenceMapEntryEClass = createEClass(EREFERENCE_MAP_ENTRY);
      createEAttribute(eReferenceMapEntryEClass, EREFERENCE_MAP_ENTRY__KEY);
      createEReference(eReferenceMapEntryEClass, EREFERENCE_MAP_ENTRY__VALUE);

      extendableEClass = createEClass(EXTENDABLE);
      createEReference(extendableEClass, EXTENDABLE__EXTENSIONS);

      xAnnotatableEClass = createEClass(XANNOTATABLE);

      // Create data types
      eFileEDataType = createEDataType(EFILE);
      eLocaleEDataType = createEDataType(ELOCALE);
      eurlEDataType = createEDataType(EURL);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model. This
    * method is guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void initializePackageContents()
   {
      if (isInitialized)
         return;
      isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Create type parameters

      // Set bounds for type parameters

      // Add supertypes to classes
      annotationEClass.getESuperTypes().add(this.getAnnotatable());
      xAnnotatableEClass.getESuperTypes().add(this.getExtendable());
      xAnnotatableEClass.getESuperTypes().add(this.getAnnotatable());

      // Initialize classes and features; add operations and parameters
      initEClass(annotatableEClass, Annotatable.class, "Annotatable", IS_ABSTRACT, IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAnnotatable_Annotations(), this.getAnnotation(), this.getAnnotation_Target(), "annotations",
         null, 0, -1, Annotatable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      EOperation op = addEOperation(annotatableEClass, this.getAnnotation(), "getAnnotation", 0, 1, IS_UNIQUE,
         IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(annotatableEClass, this.getAnnotation(), "getAnnotation", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEBoolean(), "createOnDemand", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(annotatableEClass, ecorePackage.getEString(), "getAnnotationData", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(annotatableEClass, ecorePackage.getEString(), "setAnnotationData", 1, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getAnnotation_Target(), this.getAnnotatable(), this.getAnnotatable_Annotations(), "target", null,
         1, 1, Annotation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getAnnotation_Source(), ecorePackage.getEString(), "source", null, 1, 1, Annotation.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getAnnotation_Data(), this.getEStringMapEntry(), null, "data", null, 0, -1, Annotation.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);
      initEReference(getAnnotation_Contents(), this.getEContainmentMapEntry(), null, "contents", null, 0, -1,
         Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getAnnotation_References(), this.getEReferenceMapEntry(), null, "references", null, 0, -1,
         Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getAnnotation_Content(), ecorePackage.getEObject(), null, "content", null, 0, 1, Annotation.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      op = addEOperation(annotationEClass, ecorePackage.getEBoolean(), "getData", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEBoolean(), "defaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(annotationEClass, null, "setData", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEBoolean(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(annotationEClass, ecorePackage.getEString(), "getData", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "defaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(annotationEClass, null, "setData", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "defaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(eStringMapEntryEClass, Entry.class, "EStringMapEntry", !IS_ABSTRACT, !IS_INTERFACE,
         !IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getEStringMapEntry_Key(), ecorePackage.getEString(), "key", null, 1, 1, Entry.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getEStringMapEntry_Value(), ecorePackage.getEString(), "value", null, 0, 1, Entry.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(eContainmentMapEntryEClass, Entry.class, "EContainmentMapEntry", !IS_ABSTRACT, !IS_INTERFACE,
         !IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getEContainmentMapEntry_Key(), ecorePackage.getEString(), "key", null, 1, 1, Entry.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getEContainmentMapEntry_Value(), ecorePackage.getEObject(), null, "value", null, 0, 1,
         Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
         IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(eReferenceMapEntryEClass, Entry.class, "EReferenceMapEntry", !IS_ABSTRACT, !IS_INTERFACE,
         !IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getEReferenceMapEntry_Key(), ecorePackage.getEString(), "key", null, 1, 1, Entry.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getEReferenceMapEntry_Value(), ecorePackage.getEObject(), null, "value", null, 0, 1, Entry.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(extendableEClass, Extendable.class, "Extendable", IS_ABSTRACT, IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getExtendable_Extensions(), ecorePackage.getEObject(), null, "extensions", null, 0, -1,
         Extendable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      op = addEOperation(extendableEClass, null, "getExtension", 0, 1, IS_UNIQUE, IS_ORDERED);
      ETypeParameter t1 = addETypeParameter(op, "T");
      EGenericType g1 = createEGenericType(ecorePackage.getEObject());
      t1.getEBounds().add(g1);
      g1 = createEGenericType(ecorePackage.getEJavaClass());
      EGenericType g2 = createEGenericType(t1);
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "extensionType", 1, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(t1);
      initEOperation(op, g1);

      op = addEOperation(extendableEClass, null, "getExtensions", 0, -1, IS_UNIQUE, IS_ORDERED);
      t1 = addETypeParameter(op, "T");
      g1 = createEGenericType(ecorePackage.getEObject());
      t1.getEBounds().add(g1);
      g1 = createEGenericType(ecorePackage.getEJavaClass());
      g2 = createEGenericType(t1);
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "extensionType", 1, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(t1);
      initEOperation(op, g1);

      op = addEOperation(extendableEClass, null, "addExtension", 0, 1, IS_UNIQUE, IS_ORDERED);
      t1 = addETypeParameter(op, "T");
      g1 = createEGenericType(ecorePackage.getEObject());
      t1.getEBounds().add(g1);
      g1 = createEGenericType(t1);
      addEParameter(op, g1, "extension", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(extendableEClass, null, "removeExtension", 0, 1, IS_UNIQUE, IS_ORDERED);
      t1 = addETypeParameter(op, "T");
      g1 = createEGenericType(ecorePackage.getEObject());
      t1.getEBounds().add(g1);
      g1 = createEGenericType(t1);
      addEParameter(op, g1, "extension", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(extendableEClass, null, "removeExtensions", 0, 1, IS_UNIQUE, IS_ORDERED);
      t1 = addETypeParameter(op, "T");
      g1 = createEGenericType(ecorePackage.getEObject());
      t1.getEBounds().add(g1);
      g1 = createEGenericType(ecorePackage.getEJavaClass());
      g2 = createEGenericType(t1);
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "extentionType", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(xAnnotatableEClass, XAnnotatable.class, "XAnnotatable", IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      // Initialize data types
      initEDataType(eFileEDataType, File.class, "EFile", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
      initEDataType(eLocaleEDataType, Locale.class, "ELocale", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
      initEDataType(eurlEDataType, URL.class, "EURL", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

      // Create resource
      createResource(eNS_URI);
   }

} // CommonModelingPackageImpl
