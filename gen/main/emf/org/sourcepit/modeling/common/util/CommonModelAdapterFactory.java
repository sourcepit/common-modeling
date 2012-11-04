/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.modeling.common.util;

import java.util.Map.Entry;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.sourcepit.modeling.common.Annotatable;
import org.sourcepit.modeling.common.Annotation;
import org.sourcepit.modeling.common.CommonModelPackage;
import org.sourcepit.modeling.common.Extendable;
import org.sourcepit.modeling.common.XAnnotatable;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.modeling.common.CommonModelPackage
 * @generated
 */
public class CommonModelAdapterFactory extends AdapterFactoryImpl
{
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected static CommonModelPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public CommonModelAdapterFactory()
   {
      if (modelPackage == null)
      {
         modelPackage = CommonModelPackage.eINSTANCE;
      }
   }

   /**
    * Returns whether this factory is applicable for the type of the object.
    * <!-- begin-user-doc -->
    * This implementation returns <code>true</code> if the object is either the model's package or is an instance object
    * of the model.
    * <!-- end-user-doc -->
    * 
    * @return whether this factory is applicable for the type of the object.
    * @generated
    */
   @Override
   public boolean isFactoryForType(Object object)
   {
      if (object == modelPackage)
      {
         return true;
      }
      if (object instanceof EObject)
      {
         return ((EObject) object).eClass().getEPackage() == modelPackage;
      }
      return false;
   }

   /**
    * The switch that delegates to the <code>createXXX</code> methods.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected CommonModelSwitch<Adapter> modelSwitch = new CommonModelSwitch<Adapter>()
   {
      @Override
      public Adapter caseAnnotatable(Annotatable object)
      {
         return createAnnotatableAdapter();
      }

      @Override
      public Adapter caseAnnotation(Annotation object)
      {
         return createAnnotationAdapter();
      }

      @Override
      public Adapter caseEStringMapEntry(Entry<String, String> object)
      {
         return createEStringMapEntryAdapter();
      }

      @Override
      public Adapter caseEContainmentMapEntry(Entry<String, EObject> object)
      {
         return createEContainmentMapEntryAdapter();
      }

      @Override
      public Adapter caseEReferenceMapEntry(Entry<String, EObject> object)
      {
         return createEReferenceMapEntryAdapter();
      }

      @Override
      public Adapter caseExtendable(Extendable object)
      {
         return createExtendableAdapter();
      }

      @Override
      public Adapter caseXAnnotatable(XAnnotatable object)
      {
         return createXAnnotatableAdapter();
      }

      @Override
      public Adapter defaultCase(EObject object)
      {
         return createEObjectAdapter();
      }
   };

   /**
    * Creates an adapter for the <code>target</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param target the object to adapt.
    * @return the adapter for the <code>target</code>.
    * @generated
    */
   @Override
   public Adapter createAdapter(Notifier target)
   {
      return modelSwitch.doSwitch((EObject) target);
   }


   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.modeling.common.Annotatable
    * <em>Annotatable</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.modeling.common.Annotatable
    * @generated
    */
   public Adapter createAnnotatableAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.modeling.common.Annotation <em>Annotation</em>}
    * '.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.modeling.common.Annotation
    * @generated
    */
   public Adapter createAnnotationAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>EString Map Entry</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see java.util.Map.Entry
    * @generated
    */
   public Adapter createEStringMapEntryAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>EContainment Map Entry</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see java.util.Map.Entry
    * @generated
    */
   public Adapter createEContainmentMapEntryAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>EReference Map Entry</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see java.util.Map.Entry
    * @generated
    */
   public Adapter createEReferenceMapEntryAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.modeling.common.Extendable <em>Extendable</em>}
    * '.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.modeling.common.Extendable
    * @generated
    */
   public Adapter createExtendableAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.modeling.common.XAnnotatable
    * <em>XAnnotatable</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.modeling.common.XAnnotatable
    * @generated
    */
   public Adapter createXAnnotatableAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for the default case.
    * <!-- begin-user-doc -->
    * This default implementation returns null.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @generated
    */
   public Adapter createEObjectAdapter()
   {
      return null;
   }

} // CommonModelAdapterFactory
