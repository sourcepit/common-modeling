/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.sourcepit.modeling.common;

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
 *   <li>{@link org.sourcepit.modeling.common.Annotatable#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.modeling.common.CommonModelPackage#getAnnotatable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Annotatable extends EObject
{
   /**
    * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.modeling.common.Annotation}.
    * It is bidirectional and its opposite is '{@link org.sourcepit.modeling.common.Annotation#getTarget <em>Target</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Annotations</em>' containment reference list.
    * @see org.sourcepit.modeling.common.CommonModelPackage#getAnnotatable_Annotations()
    * @see org.sourcepit.modeling.common.Annotation#getTarget
    * @model opposite="target" containment="true"
    * @generated
    */
   EList<Annotation> getAnnotations();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   Annotation getAnnotation(String source);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   Annotation getAnnotation(String source, boolean createOnDemand);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   String getAnnotationData(String source, String key);

} // Annotatable
