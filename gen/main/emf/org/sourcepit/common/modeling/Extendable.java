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
 * <li>{@link org.sourcepit.common.modeling.Extendable#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.common.modeling.CommonModelingPackage#getExtendable()
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
    * @see org.sourcepit.common.modeling.CommonModelingPackage#getExtendable_Extensions()
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
