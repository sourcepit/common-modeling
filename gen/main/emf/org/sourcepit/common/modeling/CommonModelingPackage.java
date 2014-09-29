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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.common.modeling.CommonModelingFactory
 * @model kind="package"
 * @generated
 */
public interface CommonModelingPackage extends EPackage
{
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNAME = "modeling";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_URI = "http://www.sourcepit.org/common/modeling/0.1";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_PREFIX = "common-modeling";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   CommonModelingPackage eINSTANCE = org.sourcepit.common.modeling.impl.CommonModelingPackageImpl.init();

   /**
    * The meta object id for the '{@link org.sourcepit.common.modeling.Annotatable <em>Annotatable</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.modeling.Annotatable
    * @see org.sourcepit.common.modeling.impl.CommonModelingPackageImpl#getAnnotatable()
    * @generated
    */
   int ANNOTATABLE = 0;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATABLE__ANNOTATIONS = 0;

   /**
    * The number of structural features of the '<em>Annotatable</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATABLE_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.common.modeling.impl.AnnotationImpl <em>Annotation</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.modeling.impl.AnnotationImpl
    * @see org.sourcepit.common.modeling.impl.CommonModelingPackageImpl#getAnnotation()
    * @generated
    */
   int ANNOTATION = 1;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION__ANNOTATIONS = ANNOTATABLE__ANNOTATIONS;

   /**
    * The feature id for the '<em><b>Target</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION__TARGET = ANNOTATABLE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Source</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION__SOURCE = ANNOTATABLE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Data</b></em>' map.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION__DATA = ANNOTATABLE_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Contents</b></em>' map.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION__CONTENTS = ANNOTATABLE_FEATURE_COUNT + 3;

   /**
    * The feature id for the '<em><b>References</b></em>' map.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION__REFERENCES = ANNOTATABLE_FEATURE_COUNT + 4;

   /**
    * The feature id for the '<em><b>Content</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION__CONTENT = ANNOTATABLE_FEATURE_COUNT + 5;

   /**
    * The number of structural features of the '<em>Annotation</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ANNOTATION_FEATURE_COUNT = ANNOTATABLE_FEATURE_COUNT + 6;

   /**
    * The meta object id for the '{@link org.sourcepit.common.modeling.impl.EStringMapEntryImpl
    * <em>EString Map Entry</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.modeling.impl.EStringMapEntryImpl
    * @see org.sourcepit.common.modeling.impl.CommonModelingPackageImpl#getEStringMapEntry()
    * @generated
    */
   int ESTRING_MAP_ENTRY = 2;

   /**
    * The feature id for the '<em><b>Key</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ESTRING_MAP_ENTRY__KEY = 0;

   /**
    * The feature id for the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ESTRING_MAP_ENTRY__VALUE = 1;

   /**
    * The number of structural features of the '<em>EString Map Entry</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ESTRING_MAP_ENTRY_FEATURE_COUNT = 2;

   /**
    * The meta object id for the '{@link org.sourcepit.common.modeling.impl.EContainmentMapEntryImpl
    * <em>EContainment Map Entry</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.modeling.impl.EContainmentMapEntryImpl
    * @see org.sourcepit.common.modeling.impl.CommonModelingPackageImpl#getEContainmentMapEntry()
    * @generated
    */
   int ECONTAINMENT_MAP_ENTRY = 3;

   /**
    * The feature id for the '<em><b>Key</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ECONTAINMENT_MAP_ENTRY__KEY = 0;

   /**
    * The feature id for the '<em><b>Value</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ECONTAINMENT_MAP_ENTRY__VALUE = 1;

   /**
    * The number of structural features of the '<em>EContainment Map Entry</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ECONTAINMENT_MAP_ENTRY_FEATURE_COUNT = 2;

   /**
    * The meta object id for the '{@link org.sourcepit.common.modeling.impl.EReferenceMapEntryImpl
    * <em>EReference Map Entry</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.modeling.impl.EReferenceMapEntryImpl
    * @see org.sourcepit.common.modeling.impl.CommonModelingPackageImpl#getEReferenceMapEntry()
    * @generated
    */
   int EREFERENCE_MAP_ENTRY = 4;

   /**
    * The feature id for the '<em><b>Key</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int EREFERENCE_MAP_ENTRY__KEY = 0;

   /**
    * The feature id for the '<em><b>Value</b></em>' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int EREFERENCE_MAP_ENTRY__VALUE = 1;

   /**
    * The number of structural features of the '<em>EReference Map Entry</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int EREFERENCE_MAP_ENTRY_FEATURE_COUNT = 2;

   /**
    * The meta object id for the '{@link org.sourcepit.common.modeling.Extendable <em>Extendable</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.modeling.Extendable
    * @see org.sourcepit.common.modeling.impl.CommonModelingPackageImpl#getExtendable()
    * @generated
    */
   int EXTENDABLE = 5;

   /**
    * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int EXTENDABLE__EXTENSIONS = 0;

   /**
    * The number of structural features of the '<em>Extendable</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int EXTENDABLE_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.common.modeling.impl.XAnnotatableImpl <em>XAnnotatable</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.modeling.impl.XAnnotatableImpl
    * @see org.sourcepit.common.modeling.impl.CommonModelingPackageImpl#getXAnnotatable()
    * @generated
    */
   int XANNOTATABLE = 6;

   /**
    * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int XANNOTATABLE__EXTENSIONS = EXTENDABLE__EXTENSIONS;

   /**
    * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int XANNOTATABLE__ANNOTATIONS = EXTENDABLE_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>XAnnotatable</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int XANNOTATABLE_FEATURE_COUNT = EXTENDABLE_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '<em>EFile</em>' data type.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see java.io.File
    * @see org.sourcepit.common.modeling.impl.CommonModelingPackageImpl#getEFile()
    * @generated
    */
   int EFILE = 7;

   /**
    * The meta object id for the '<em>ELocale</em>' data type.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see java.util.Locale
    * @see org.sourcepit.common.modeling.impl.CommonModelingPackageImpl#getELocale()
    * @generated
    */
   int ELOCALE = 8;

   /**
    * The meta object id for the '<em>EURL</em>' data type.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see java.net.URL
    * @see org.sourcepit.common.modeling.impl.CommonModelingPackageImpl#getEURL()
    * @generated
    */
   int EURL = 9;


   /**
    * Returns the meta object for class '{@link org.sourcepit.common.modeling.Annotatable <em>Annotatable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Annotatable</em>'.
    * @see org.sourcepit.common.modeling.Annotatable
    * @generated
    */
   EClass getAnnotatable();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.common.modeling.Annotatable#getAnnotations <em>Annotations</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Annotations</em>'.
    * @see org.sourcepit.common.modeling.Annotatable#getAnnotations()
    * @see #getAnnotatable()
    * @generated
    */
   EReference getAnnotatable_Annotations();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.modeling.Annotation <em>Annotation</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Annotation</em>'.
    * @see org.sourcepit.common.modeling.Annotation
    * @generated
    */
   EClass getAnnotation();

   /**
    * Returns the meta object for the container reference '{@link org.sourcepit.common.modeling.Annotation#getTarget
    * <em>Target</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the container reference '<em>Target</em>'.
    * @see org.sourcepit.common.modeling.Annotation#getTarget()
    * @see #getAnnotation()
    * @generated
    */
   EReference getAnnotation_Target();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.common.modeling.Annotation#getSource
    * <em>Source</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Source</em>'.
    * @see org.sourcepit.common.modeling.Annotation#getSource()
    * @see #getAnnotation()
    * @generated
    */
   EAttribute getAnnotation_Source();

   /**
    * Returns the meta object for the map '{@link org.sourcepit.common.modeling.Annotation#getData <em>Data</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the map '<em>Data</em>'.
    * @see org.sourcepit.common.modeling.Annotation#getData()
    * @see #getAnnotation()
    * @generated
    */
   EReference getAnnotation_Data();

   /**
    * Returns the meta object for the map '{@link org.sourcepit.common.modeling.Annotation#getContents
    * <em>Contents</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the map '<em>Contents</em>'.
    * @see org.sourcepit.common.modeling.Annotation#getContents()
    * @see #getAnnotation()
    * @generated
    */
   EReference getAnnotation_Contents();

   /**
    * Returns the meta object for the map '{@link org.sourcepit.common.modeling.Annotation#getReferences
    * <em>References</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the map '<em>References</em>'.
    * @see org.sourcepit.common.modeling.Annotation#getReferences()
    * @see #getAnnotation()
    * @generated
    */
   EReference getAnnotation_References();

   /**
    * Returns the meta object for the containment reference '{@link org.sourcepit.common.modeling.Annotation#getContent
    * <em>Content</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Content</em>'.
    * @see org.sourcepit.common.modeling.Annotation#getContent()
    * @see #getAnnotation()
    * @generated
    */
   EReference getAnnotation_Content();

   /**
    * Returns the meta object for class '{@link java.util.Map.Entry <em>EString Map Entry</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>EString Map Entry</em>'.
    * @see java.util.Map.Entry
    * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
    *        valueDataType="org.eclipse.emf.ecore.EString"
    * @generated
    */
   EClass getEStringMapEntry();

   /**
    * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Key</em>'.
    * @see java.util.Map.Entry
    * @see #getEStringMapEntry()
    * @generated
    */
   EAttribute getEStringMapEntry_Key();

   /**
    * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Value</em>'.
    * @see java.util.Map.Entry
    * @see #getEStringMapEntry()
    * @generated
    */
   EAttribute getEStringMapEntry_Value();

   /**
    * Returns the meta object for class '{@link java.util.Map.Entry <em>EContainment Map Entry</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>EContainment Map Entry</em>'.
    * @see java.util.Map.Entry
    * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
    *        valueType="org.eclipse.emf.ecore.EObject" valueContainment="true"
    * @generated
    */
   EClass getEContainmentMapEntry();

   /**
    * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Key</em>'.
    * @see java.util.Map.Entry
    * @see #getEContainmentMapEntry()
    * @generated
    */
   EAttribute getEContainmentMapEntry_Key();

   /**
    * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference '<em>Value</em>'.
    * @see java.util.Map.Entry
    * @see #getEContainmentMapEntry()
    * @generated
    */
   EReference getEContainmentMapEntry_Value();

   /**
    * Returns the meta object for class '{@link java.util.Map.Entry <em>EReference Map Entry</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>EReference Map Entry</em>'.
    * @see java.util.Map.Entry
    * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
    *        valueType="org.eclipse.emf.ecore.EObject"
    * @generated
    */
   EClass getEReferenceMapEntry();

   /**
    * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Key</em>'.
    * @see java.util.Map.Entry
    * @see #getEReferenceMapEntry()
    * @generated
    */
   EAttribute getEReferenceMapEntry_Key();

   /**
    * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the reference '<em>Value</em>'.
    * @see java.util.Map.Entry
    * @see #getEReferenceMapEntry()
    * @generated
    */
   EReference getEReferenceMapEntry_Value();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.modeling.Extendable <em>Extendable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Extendable</em>'.
    * @see org.sourcepit.common.modeling.Extendable
    * @generated
    */
   EClass getExtendable();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.common.modeling.Extendable#getExtensions <em>Extensions</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Extensions</em>'.
    * @see org.sourcepit.common.modeling.Extendable#getExtensions()
    * @see #getExtendable()
    * @generated
    */
   EReference getExtendable_Extensions();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.modeling.XAnnotatable <em>XAnnotatable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>XAnnotatable</em>'.
    * @see org.sourcepit.common.modeling.XAnnotatable
    * @generated
    */
   EClass getXAnnotatable();

   /**
    * Returns the meta object for data type '{@link java.io.File <em>EFile</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for data type '<em>EFile</em>'.
    * @see java.io.File
    * @model instanceClass="java.io.File"
    * @generated
    */
   EDataType getEFile();

   /**
    * Returns the meta object for data type '{@link java.util.Locale <em>ELocale</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for data type '<em>ELocale</em>'.
    * @see java.util.Locale
    * @model instanceClass="java.util.Locale"
    * @generated
    */
   EDataType getELocale();

   /**
    * Returns the meta object for data type '{@link java.net.URL <em>EURL</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for data type '<em>EURL</em>'.
    * @see java.net.URL
    * @model instanceClass="java.net.URL"
    * @generated
    */
   EDataType getEURL();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the factory that creates the instances of the model.
    * @generated
    */
   CommonModelingFactory getCommonModelingFactory();

   /**
    * <!-- begin-user-doc -->
    * Defines literals for the meta objects that represent
    * <ul>
    * <li>each class,</li>
    * <li>each feature of each class,</li>
    * <li>each enum,</li>
    * <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   interface Literals
   {
      /**
       * The meta object literal for the '{@link org.sourcepit.common.modeling.Annotatable <em>Annotatable</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.modeling.Annotatable
       * @see org.sourcepit.common.modeling.impl.CommonModelingPackageImpl#getAnnotatable()
       * @generated
       */
      EClass ANNOTATABLE = eINSTANCE.getAnnotatable();

      /**
       * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ANNOTATABLE__ANNOTATIONS = eINSTANCE.getAnnotatable_Annotations();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.modeling.impl.AnnotationImpl <em>Annotation</em>}'
       * class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.modeling.impl.AnnotationImpl
       * @see org.sourcepit.common.modeling.impl.CommonModelingPackageImpl#getAnnotation()
       * @generated
       */
      EClass ANNOTATION = eINSTANCE.getAnnotation();

      /**
       * The meta object literal for the '<em><b>Target</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ANNOTATION__TARGET = eINSTANCE.getAnnotation_Target();

      /**
       * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ANNOTATION__SOURCE = eINSTANCE.getAnnotation_Source();

      /**
       * The meta object literal for the '<em><b>Data</b></em>' map feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ANNOTATION__DATA = eINSTANCE.getAnnotation_Data();

      /**
       * The meta object literal for the '<em><b>Contents</b></em>' map feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ANNOTATION__CONTENTS = eINSTANCE.getAnnotation_Contents();

      /**
       * The meta object literal for the '<em><b>References</b></em>' map feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ANNOTATION__REFERENCES = eINSTANCE.getAnnotation_References();

      /**
       * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ANNOTATION__CONTENT = eINSTANCE.getAnnotation_Content();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.modeling.impl.EStringMapEntryImpl
       * <em>EString Map Entry</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.modeling.impl.EStringMapEntryImpl
       * @see org.sourcepit.common.modeling.impl.CommonModelingPackageImpl#getEStringMapEntry()
       * @generated
       */
      EClass ESTRING_MAP_ENTRY = eINSTANCE.getEStringMapEntry();

      /**
       * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ESTRING_MAP_ENTRY__KEY = eINSTANCE.getEStringMapEntry_Key();

      /**
       * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ESTRING_MAP_ENTRY__VALUE = eINSTANCE.getEStringMapEntry_Value();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.modeling.impl.EContainmentMapEntryImpl
       * <em>EContainment Map Entry</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.modeling.impl.EContainmentMapEntryImpl
       * @see org.sourcepit.common.modeling.impl.CommonModelingPackageImpl#getEContainmentMapEntry()
       * @generated
       */
      EClass ECONTAINMENT_MAP_ENTRY = eINSTANCE.getEContainmentMapEntry();

      /**
       * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute ECONTAINMENT_MAP_ENTRY__KEY = eINSTANCE.getEContainmentMapEntry_Key();

      /**
       * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference ECONTAINMENT_MAP_ENTRY__VALUE = eINSTANCE.getEContainmentMapEntry_Value();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.modeling.impl.EReferenceMapEntryImpl
       * <em>EReference Map Entry</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.modeling.impl.EReferenceMapEntryImpl
       * @see org.sourcepit.common.modeling.impl.CommonModelingPackageImpl#getEReferenceMapEntry()
       * @generated
       */
      EClass EREFERENCE_MAP_ENTRY = eINSTANCE.getEReferenceMapEntry();

      /**
       * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute EREFERENCE_MAP_ENTRY__KEY = eINSTANCE.getEReferenceMapEntry_Key();

      /**
       * The meta object literal for the '<em><b>Value</b></em>' reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference EREFERENCE_MAP_ENTRY__VALUE = eINSTANCE.getEReferenceMapEntry_Value();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.modeling.Extendable <em>Extendable</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.modeling.Extendable
       * @see org.sourcepit.common.modeling.impl.CommonModelingPackageImpl#getExtendable()
       * @generated
       */
      EClass EXTENDABLE = eINSTANCE.getExtendable();

      /**
       * The meta object literal for the '<em><b>Extensions</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference EXTENDABLE__EXTENSIONS = eINSTANCE.getExtendable_Extensions();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.modeling.impl.XAnnotatableImpl
       * <em>XAnnotatable</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.modeling.impl.XAnnotatableImpl
       * @see org.sourcepit.common.modeling.impl.CommonModelingPackageImpl#getXAnnotatable()
       * @generated
       */
      EClass XANNOTATABLE = eINSTANCE.getXAnnotatable();

      /**
       * The meta object literal for the '<em>EFile</em>' data type.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see java.io.File
       * @see org.sourcepit.common.modeling.impl.CommonModelingPackageImpl#getEFile()
       * @generated
       */
      EDataType EFILE = eINSTANCE.getEFile();

      /**
       * The meta object literal for the '<em>ELocale</em>' data type.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see java.util.Locale
       * @see org.sourcepit.common.modeling.impl.CommonModelingPackageImpl#getELocale()
       * @generated
       */
      EDataType ELOCALE = eINSTANCE.getELocale();

      /**
       * The meta object literal for the '<em>EURL</em>' data type.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see java.net.URL
       * @see org.sourcepit.common.modeling.impl.CommonModelingPackageImpl#getEURL()
       * @generated
       */
      EDataType EURL = eINSTANCE.getEURL();

   }

} // CommonModelingPackage
