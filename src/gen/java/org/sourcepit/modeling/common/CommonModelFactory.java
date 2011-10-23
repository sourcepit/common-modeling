/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.sourcepit.modeling.common;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.sourcepit.modeling.common.CommonModelPackage
 * @generated
 */
public interface CommonModelFactory extends EFactory
{
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   CommonModelFactory eINSTANCE = org.sourcepit.modeling.common.impl.CommonModelFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Annotation</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Annotation</em>'.
    * @generated
    */
   Annotation createAnnotation();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   CommonModelPackage getCommonModelPackage();

} //CommonModelFactory
