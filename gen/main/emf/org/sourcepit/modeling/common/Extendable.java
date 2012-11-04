/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.modeling.common;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extendable</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.modeling.common.Extendable#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.modeling.common.CommonModelPackage#getExtendable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Extendable extends EObject
{
   /**
    * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
    * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Extensions</em>' containment reference list isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Extensions</em>' containment reference list.
    * @see org.sourcepit.modeling.common.CommonModelPackage#getExtendable_Extensions()
    * @model containment="true"
    * @generated
    */
   EList<EObject> getExtensions();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model extensionTypeRequired="true"
    * @generated
    */
   <T extends EObject> T getExtension(Class<T> extensionType);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model extensionTypeRequired="true"
    * @generated
    */
   <T extends EObject> EList<T> getExtensions(Class<T> extensionType);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   <T extends EObject> void addExtension(T extension);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   <T extends EObject> void removeExtension(T extension);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   <T extends EObject> void removeExtensions(Class<T> extentionType);

} // Extendable
