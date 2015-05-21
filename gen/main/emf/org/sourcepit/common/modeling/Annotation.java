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

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.common.modeling.Annotation#getTarget <em>Target</em>}</li>
 * <li>{@link org.sourcepit.common.modeling.Annotation#getSource <em>Source</em>}</li>
 * <li>{@link org.sourcepit.common.modeling.Annotation#getData <em>Data</em>}</li>
 * <li>{@link org.sourcepit.common.modeling.Annotation#getContents <em>Contents</em>}</li>
 * <li>{@link org.sourcepit.common.modeling.Annotation#getReferences <em>References</em>}</li>
 * <li>{@link org.sourcepit.common.modeling.Annotation#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.common.modeling.CommonModelingPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends Annotatable {
   /**
    * Returns the value of the '<em><b>Target</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.sourcepit.common.modeling.Annotatable#getAnnotations
    * <em>Annotations</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Target</em>' container reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Target</em>' container reference.
    * @see #setTarget(Annotatable)
    * @see org.sourcepit.common.modeling.CommonModelingPackage#getAnnotation_Target()
    * @see org.sourcepit.common.modeling.Annotatable#getAnnotations
    * @model opposite="annotations" required="true"
    * @generated
    */
   Annotatable getTarget();

   /**
    * Sets the value of the '{@link org.sourcepit.common.modeling.Annotation#getTarget <em>Target</em>}' container
    * reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Target</em>' container reference.
    * @see #getTarget()
    * @generated
    */
   void setTarget(Annotatable value);

   /**
    * Returns the value of the '<em><b>Source</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Source</em>' attribute isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Source</em>' attribute.
    * @see #setSource(String)
    * @see org.sourcepit.common.modeling.CommonModelingPackage#getAnnotation_Source()
    * @model required="true"
    * @generated
    */
   String getSource();

   /**
    * Sets the value of the '{@link org.sourcepit.common.modeling.Annotation#getSource <em>Source</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Source</em>' attribute.
    * @see #getSource()
    * @generated
    */
   void setSource(String value);

   /**
    * Returns the value of the '<em><b>Data</b></em>' map.
    * The key is of type {@link java.lang.String},
    * and the value is of type {@link java.lang.String},
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Data</em>' map isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Data</em>' map.
    * @see org.sourcepit.common.modeling.CommonModelingPackage#getAnnotation_Data()
    * @model mapType=
    *        "org.sourcepit.common.modeling.EStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
    * @generated
    */
   EMap<String, String> getData();

   /**
    * Returns the value of the '<em><b>Contents</b></em>' map.
    * The key is of type {@link java.lang.String},
    * and the value is of type {@link org.eclipse.emf.ecore.EObject},
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Contents</em>' map isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Contents</em>' map.
    * @see org.sourcepit.common.modeling.CommonModelingPackage#getAnnotation_Contents()
    * @model mapType=
    *        "org.sourcepit.common.modeling.EContainmentMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EObject>"
    * @generated
    */
   EMap<String, EObject> getContents();

   /**
    * Returns the value of the '<em><b>References</b></em>' map.
    * The key is of type {@link java.lang.String},
    * and the value is of type {@link org.eclipse.emf.ecore.EObject},
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>References</em>' map isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>References</em>' map.
    * @see org.sourcepit.common.modeling.CommonModelingPackage#getAnnotation_References()
    * @model mapType=
    *        "org.sourcepit.common.modeling.EReferenceMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EObject>"
    * @generated
    */
   EMap<String, EObject> getReferences();

   /**
    * Returns the value of the '<em><b>Content</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Content</em>' containment reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Content</em>' containment reference.
    * @see #setContent(EObject)
    * @see org.sourcepit.common.modeling.CommonModelingPackage#getAnnotation_Content()
    * @model containment="true"
    * @generated
    */
   EObject getContent();

   /**
    * Sets the value of the '{@link org.sourcepit.common.modeling.Annotation#getContent <em>Content</em>}' containment
    * reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Content</em>' containment reference.
    * @see #getContent()
    * @generated
    */
   void setContent(EObject value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   boolean getData(String key, boolean defaultValue);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   void setData(String key, boolean value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   String getData(String key, String defaultValue);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   void setData(String key, String defaultValue);

} // Annotation
