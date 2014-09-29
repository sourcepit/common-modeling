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
 * A representation of the model object '<em><b>Annotatable</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.common.modeling.Annotatable#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.common.modeling.CommonModelingPackage#getAnnotatable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Annotatable extends EObject
{
   /**
    * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.common.modeling.Annotation}.
    * It is bidirectional and its opposite is '{@link org.sourcepit.common.modeling.Annotation#getTarget
    * <em>Target</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear, there really should be more
    * of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Annotations</em>' containment reference list.
    * @see org.sourcepit.common.modeling.CommonModelingPackage#getAnnotatable_Annotations()
    * @see org.sourcepit.common.modeling.Annotation#getTarget
    * @model opposite="target" containment="true"
    * @generated
    */
   EList<Annotation> getAnnotations();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   Annotation getAnnotation(String source);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   Annotation getAnnotation(String source, boolean createOnDemand);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   String getAnnotationData(String source, String key);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model required="true"
    * @generated
    */
   String setAnnotationData(String source, String key, String value);

} // Annotatable
