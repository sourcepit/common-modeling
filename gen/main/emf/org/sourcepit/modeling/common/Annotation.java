/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.modeling.common;

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
 * <li>{@link org.sourcepit.modeling.common.Annotation#getTarget <em>Target</em>}</li>
 * <li>{@link org.sourcepit.modeling.common.Annotation#getSource <em>Source</em>}</li>
 * <li>{@link org.sourcepit.modeling.common.Annotation#getData <em>Data</em>}</li>
 * <li>{@link org.sourcepit.modeling.common.Annotation#getContents <em>Contents</em>}</li>
 * <li>{@link org.sourcepit.modeling.common.Annotation#getReferences <em>References</em>}</li>
 * <li>{@link org.sourcepit.modeling.common.Annotation#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.modeling.common.CommonModelPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends Annotatable
{
   /**
    * Returns the value of the '<em><b>Target</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.sourcepit.modeling.common.Annotatable#getAnnotations
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
    * @see org.sourcepit.modeling.common.CommonModelPackage#getAnnotation_Target()
    * @see org.sourcepit.modeling.common.Annotatable#getAnnotations
    * @model opposite="annotations" required="true"
    * @generated
    */
   Annotatable getTarget();

   /**
    * Sets the value of the '{@link org.sourcepit.modeling.common.Annotation#getTarget <em>Target</em>}' container
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
    * @see org.sourcepit.modeling.common.CommonModelPackage#getAnnotation_Source()
    * @model required="true"
    * @generated
    */
   String getSource();

   /**
    * Sets the value of the '{@link org.sourcepit.modeling.common.Annotation#getSource <em>Source</em>}' attribute.
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
    * @see org.sourcepit.modeling.common.CommonModelPackage#getAnnotation_Data()
    * @model mapType=
    *        "org.sourcepit.modeling.common.EStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
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
    * @see org.sourcepit.modeling.common.CommonModelPackage#getAnnotation_Contents()
    * @model mapType=
    *        "org.sourcepit.modeling.common.EContainmentMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EObject>"
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
    * @see org.sourcepit.modeling.common.CommonModelPackage#getAnnotation_References()
    * @model mapType=
    *        "org.sourcepit.modeling.common.EReferenceMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EObject>"
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
    * @see org.sourcepit.modeling.common.CommonModelPackage#getAnnotation_Content()
    * @model containment="true"
    * @generated
    */
   EObject getContent();

   /**
    * Sets the value of the '{@link org.sourcepit.modeling.common.Annotation#getContent <em>Content</em>}' containment
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
