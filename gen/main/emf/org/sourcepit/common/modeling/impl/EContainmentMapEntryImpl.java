/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.modeling.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.sourcepit.common.modeling.CommonModelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EContainment Map Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.common.modeling.impl.EContainmentMapEntryImpl#getTypedKey <em>Key</em>}</li>
 * <li>{@link org.sourcepit.common.modeling.impl.EContainmentMapEntryImpl#getTypedValue <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class EContainmentMapEntryImpl extends EObjectImpl implements BasicEMap.Entry<String, EObject>
{
   /**
    * The default value of the '{@link #getTypedKey() <em>Key</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getTypedKey()
    * @generated
    * @ordered
    */
   protected static final String KEY_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getTypedKey() <em>Key</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getTypedKey()
    * @generated
    * @ordered
    */
   protected String key = KEY_EDEFAULT;

   /**
    * The cached value of the '{@link #getTypedValue() <em>Value</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getTypedValue()
    * @generated
    * @ordered
    */
   protected EObject value;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected EContainmentMapEntryImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   protected EClass eStaticClass()
   {
      return CommonModelingPackage.Literals.ECONTAINMENT_MAP_ENTRY;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getTypedKey()
   {
      return key;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setTypedKey(String newKey)
   {
      String oldKey = key;
      key = newKey;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CommonModelingPackage.ECONTAINMENT_MAP_ENTRY__KEY,
            oldKey, key));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EObject getTypedValue()
   {
      return value;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetTypedValue(EObject newValue, NotificationChain msgs)
   {
      EObject oldValue = value;
      value = newValue;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            CommonModelingPackage.ECONTAINMENT_MAP_ENTRY__VALUE, oldValue, newValue);
         if (msgs == null)
            msgs = notification;
         else
            msgs.add(notification);
      }
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setTypedValue(EObject newValue)
   {
      if (newValue != value)
      {
         NotificationChain msgs = null;
         if (value != null)
            msgs = ((InternalEObject) value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - CommonModelingPackage.ECONTAINMENT_MAP_ENTRY__VALUE, null, msgs);
         if (newValue != null)
            msgs = ((InternalEObject) newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - CommonModelingPackage.ECONTAINMENT_MAP_ENTRY__VALUE, null, msgs);
         msgs = basicSetTypedValue(newValue, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CommonModelingPackage.ECONTAINMENT_MAP_ENTRY__VALUE,
            newValue, newValue));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case CommonModelingPackage.ECONTAINMENT_MAP_ENTRY__VALUE :
            return basicSetTypedValue(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case CommonModelingPackage.ECONTAINMENT_MAP_ENTRY__KEY :
            return getTypedKey();
         case CommonModelingPackage.ECONTAINMENT_MAP_ENTRY__VALUE :
            return getTypedValue();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
         case CommonModelingPackage.ECONTAINMENT_MAP_ENTRY__KEY :
            setTypedKey((String) newValue);
            return;
         case CommonModelingPackage.ECONTAINMENT_MAP_ENTRY__VALUE :
            setTypedValue((EObject) newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public void eUnset(int featureID)
   {
      switch (featureID)
      {
         case CommonModelingPackage.ECONTAINMENT_MAP_ENTRY__KEY :
            setTypedKey(KEY_EDEFAULT);
            return;
         case CommonModelingPackage.ECONTAINMENT_MAP_ENTRY__VALUE :
            setTypedValue((EObject) null);
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID)
   {
      switch (featureID)
      {
         case CommonModelingPackage.ECONTAINMENT_MAP_ENTRY__KEY :
            return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
         case CommonModelingPackage.ECONTAINMENT_MAP_ENTRY__VALUE :
            return value != null;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public String toString()
   {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (key: ");
      result.append(key);
      result.append(')');
      return result.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected int hash = -1;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public int getHash()
   {
      if (hash == -1)
      {
         Object theKey = getKey();
         hash = (theKey == null ? 0 : theKey.hashCode());
      }
      return hash;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setHash(int hash)
   {
      this.hash = hash;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getKey()
   {
      return getTypedKey();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setKey(String key)
   {
      setTypedKey(key);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EObject getValue()
   {
      return getTypedValue();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EObject setValue(EObject value)
   {
      EObject oldValue = getValue();
      setTypedValue(value);
      return oldValue;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @SuppressWarnings("unchecked")
   public EMap<String, EObject> getEMap()
   {
      EObject container = eContainer();
      return container == null ? null : (EMap<String, EObject>) container.eGet(eContainmentFeature());
   }

} // EContainmentMapEntryImpl
