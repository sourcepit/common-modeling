/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */


package org.sourcepit.modeling.common;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Annotatable</b></em>'. <!-- end-user-doc -->
 * 
 * <p
 * The following features are supported:
 * <ul>
 * <li>@
 * <li>g.sourcepit.modeling.common.Annotatable#getAnnotations <em>Annotations</em></li>
 * </ul>
 * </p>
 * 
 * @se
 *     rg.sourcepit.modeling.common.CommonModelPackage#getAnnotatable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Annotatable extends EObject
{
   /**
    * Returns the value of the '<em><b>Annotations</b></em>' containment reference list. The list contents are of type
    * {@link org.sourcepit.modeling.common.Annotation}. It is bidirectional and its opposite is ' {@link org.so
    * org.sourcepit.modeling.common.Annotation#getTarget
    * get</em>}'. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Annotations</em>' containment ' containment reference list isn't clear, there really
    * should be more of a description here...
    * </p>
    * r-doc -->
    * 
    * @retu
    *       n the value of the '<em>Annotations</em>' containment reference list.
    * @see org.sourcepit.modeling.common.CommonModelPackage#getAnnotatable_Annotations()
    * @see org.sourcepit.modeling.common.Annotation#getTarget
    * @model opposite="target" containment="true"
    * @generated
    */
   EList<Annotation> getAnnotations();

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @mod
    *      l
    * @generated
    */
   Annotation getAnnotation(String source);

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @mo
    *     el
    * @generated
    */
   Annotation getAnnotation(String source, boolean createOnDemand);

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @m
    *    del
    * @generated
    */
   String getAnnotationData(String source, String key);

} // Annotatable
