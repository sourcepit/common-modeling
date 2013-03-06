/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.modeling.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.sourcepit.common.modeling.Annotatable;
import org.sourcepit.common.modeling.Annotation;
import org.sourcepit.common.modeling.CommonModelingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.common.modeling.impl.AnnotationImpl#getAnnotations <em>Annotations</em>}</li>
 * <li>{@link org.sourcepit.common.modeling.impl.AnnotationImpl#getTarget <em>Target</em>}</li>
 * <li>{@link org.sourcepit.common.modeling.impl.AnnotationImpl#getSource <em>Source</em>}</li>
 * <li>{@link org.sourcepit.common.modeling.impl.AnnotationImpl#getData <em>Data</em>}</li>
 * <li>{@link org.sourcepit.common.modeling.impl.AnnotationImpl#getContents <em>Contents</em>}</li>
 * <li>{@link org.sourcepit.common.modeling.impl.AnnotationImpl#getReferences <em>References</em>}</li>
 * <li>{@link org.sourcepit.common.modeling.impl.AnnotationImpl#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AnnotationImpl extends EObjectImpl implements Annotation
{
   /**
    * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getAnnotations()
    * @generated
    * @ordered
    */
   protected EList<Annotation> annotations;

   /**
    * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getSource()
    * @generated
    * @ordered
    */
   protected static final String SOURCE_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getSource()
    * @generated
    * @ordered
    */
   protected String source = SOURCE_EDEFAULT;

   /**
    * The cached value of the '{@link #getData() <em>Data</em>}' map.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getData()
    * @generated
    * @ordered
    */
   protected EMap<String, String> data;

   /**
    * The cached value of the '{@link #getContents() <em>Contents</em>}' map.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getContents()
    * @generated
    * @ordered
    */
   protected EMap<String, EObject> contents;

   /**
    * The cached value of the '{@link #getReferences() <em>References</em>}' map.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getReferences()
    * @generated
    * @ordered
    */
   protected EMap<String, EObject> references;

   /**
    * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getContent()
    * @generated
    * @ordered
    */
   protected EObject content;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected AnnotationImpl()
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
      return CommonModelingPackage.Literals.ANNOTATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<Annotation> getAnnotations()
   {
      if (annotations == null)
      {
         annotations = new EObjectContainmentWithInverseEList<Annotation>(Annotation.class, this,
            CommonModelingPackage.ANNOTATION__ANNOTATIONS, CommonModelingPackage.ANNOTATION__TARGET);
      }
      return annotations;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public Annotatable getTarget()
   {
      if (eContainerFeatureID() != CommonModelingPackage.ANNOTATION__TARGET)
         return null;
      return (Annotatable) eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetTarget(Annotatable newTarget, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newTarget, CommonModelingPackage.ANNOTATION__TARGET, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setTarget(Annotatable newTarget)
   {
      if (newTarget != eInternalContainer()
         || (eContainerFeatureID() != CommonModelingPackage.ANNOTATION__TARGET && newTarget != null))
      {
         if (EcoreUtil.isAncestor(this, newTarget))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newTarget != null)
            msgs = ((InternalEObject) newTarget).eInverseAdd(this, CommonModelingPackage.ANNOTATABLE__ANNOTATIONS,
               Annotatable.class, msgs);
         msgs = basicSetTarget(newTarget, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CommonModelingPackage.ANNOTATION__TARGET, newTarget,
            newTarget));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getSource()
   {
      return source;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setSource(String newSource)
   {
      String oldSource = source;
      source = newSource;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CommonModelingPackage.ANNOTATION__SOURCE, oldSource,
            source));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EMap<String, String> getData()
   {
      if (data == null)
      {
         data = new EcoreEMap<String, String>(CommonModelingPackage.Literals.ESTRING_MAP_ENTRY,
            EStringMapEntryImpl.class, this, CommonModelingPackage.ANNOTATION__DATA);
      }
      return data;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EMap<String, EObject> getContents()
   {
      if (contents == null)
      {
         contents = new EcoreEMap<String, EObject>(CommonModelingPackage.Literals.ECONTAINMENT_MAP_ENTRY,
            EContainmentMapEntryImpl.class, this, CommonModelingPackage.ANNOTATION__CONTENTS);
      }
      return contents;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EMap<String, EObject> getReferences()
   {
      if (references == null)
      {
         references = new EcoreEMap<String, EObject>(CommonModelingPackage.Literals.EREFERENCE_MAP_ENTRY,
            EReferenceMapEntryImpl.class, this, CommonModelingPackage.ANNOTATION__REFERENCES);
      }
      return references;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EObject getContent()
   {
      return content;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetContent(EObject newContent, NotificationChain msgs)
   {
      EObject oldContent = content;
      content = newContent;
      if (eNotificationRequired())
      {
         ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
            CommonModelingPackage.ANNOTATION__CONTENT, oldContent, newContent);
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
   public void setContent(EObject newContent)
   {
      if (newContent != content)
      {
         NotificationChain msgs = null;
         if (content != null)
            msgs = ((InternalEObject) content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
               - CommonModelingPackage.ANNOTATION__CONTENT, null, msgs);
         if (newContent != null)
            msgs = ((InternalEObject) newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
               - CommonModelingPackage.ANNOTATION__CONTENT, null, msgs);
         msgs = basicSetContent(newContent, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CommonModelingPackage.ANNOTATION__CONTENT, newContent,
            newContent));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean getData(String key, boolean defaultValue)
   {
      // TODO: implement this method
      // Ensure that you remove @generated or mark it @generated NOT
      throw new UnsupportedOperationException();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setData(String key, boolean value)
   {
      // TODO: implement this method
      // Ensure that you remove @generated or mark it @generated NOT
      throw new UnsupportedOperationException();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getData(String key, String defaultValue)
   {
      // TODO: implement this method
      // Ensure that you remove @generated or mark it @generated NOT
      throw new UnsupportedOperationException();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setData(String key, String defaultValue)
   {
      // TODO: implement this method
      // Ensure that you remove @generated or mark it @generated NOT
      throw new UnsupportedOperationException();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public Annotation getAnnotation(String source)
   {
      // TODO: implement this method
      // Ensure that you remove @generated or mark it @generated NOT
      throw new UnsupportedOperationException();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public Annotation getAnnotation(String source, boolean createOnDemand)
   {
      // TODO: implement this method
      // Ensure that you remove @generated or mark it @generated NOT
      throw new UnsupportedOperationException();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getAnnotationData(String source, String key)
   {
      // TODO: implement this method
      // Ensure that you remove @generated or mark it @generated NOT
      throw new UnsupportedOperationException();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String setAnnotationData(String source, String key, String value)
   {
      // TODO: implement this method
      // Ensure that you remove @generated or mark it @generated NOT
      throw new UnsupportedOperationException();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case CommonModelingPackage.ANNOTATION__ANNOTATIONS :
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getAnnotations()).basicAdd(otherEnd, msgs);
         case CommonModelingPackage.ANNOTATION__TARGET :
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetTarget((Annotatable) otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
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
         case CommonModelingPackage.ANNOTATION__ANNOTATIONS :
            return ((InternalEList<?>) getAnnotations()).basicRemove(otherEnd, msgs);
         case CommonModelingPackage.ANNOTATION__TARGET :
            return basicSetTarget(null, msgs);
         case CommonModelingPackage.ANNOTATION__DATA :
            return ((InternalEList<?>) getData()).basicRemove(otherEnd, msgs);
         case CommonModelingPackage.ANNOTATION__CONTENTS :
            return ((InternalEList<?>) getContents()).basicRemove(otherEnd, msgs);
         case CommonModelingPackage.ANNOTATION__REFERENCES :
            return ((InternalEList<?>) getReferences()).basicRemove(otherEnd, msgs);
         case CommonModelingPackage.ANNOTATION__CONTENT :
            return basicSetContent(null, msgs);
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
   public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
   {
      switch (eContainerFeatureID())
      {
         case CommonModelingPackage.ANNOTATION__TARGET :
            return eInternalContainer().eInverseRemove(this, CommonModelingPackage.ANNOTATABLE__ANNOTATIONS,
               Annotatable.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
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
         case CommonModelingPackage.ANNOTATION__ANNOTATIONS :
            return getAnnotations();
         case CommonModelingPackage.ANNOTATION__TARGET :
            return getTarget();
         case CommonModelingPackage.ANNOTATION__SOURCE :
            return getSource();
         case CommonModelingPackage.ANNOTATION__DATA :
            if (coreType)
               return getData();
            else
               return getData().map();
         case CommonModelingPackage.ANNOTATION__CONTENTS :
            if (coreType)
               return getContents();
            else
               return getContents().map();
         case CommonModelingPackage.ANNOTATION__REFERENCES :
            if (coreType)
               return getReferences();
            else
               return getReferences().map();
         case CommonModelingPackage.ANNOTATION__CONTENT :
            return getContent();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
         case CommonModelingPackage.ANNOTATION__ANNOTATIONS :
            getAnnotations().clear();
            getAnnotations().addAll((Collection<? extends Annotation>) newValue);
            return;
         case CommonModelingPackage.ANNOTATION__TARGET :
            setTarget((Annotatable) newValue);
            return;
         case CommonModelingPackage.ANNOTATION__SOURCE :
            setSource((String) newValue);
            return;
         case CommonModelingPackage.ANNOTATION__DATA :
            ((EStructuralFeature.Setting) getData()).set(newValue);
            return;
         case CommonModelingPackage.ANNOTATION__CONTENTS :
            ((EStructuralFeature.Setting) getContents()).set(newValue);
            return;
         case CommonModelingPackage.ANNOTATION__REFERENCES :
            ((EStructuralFeature.Setting) getReferences()).set(newValue);
            return;
         case CommonModelingPackage.ANNOTATION__CONTENT :
            setContent((EObject) newValue);
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
         case CommonModelingPackage.ANNOTATION__ANNOTATIONS :
            getAnnotations().clear();
            return;
         case CommonModelingPackage.ANNOTATION__TARGET :
            setTarget((Annotatable) null);
            return;
         case CommonModelingPackage.ANNOTATION__SOURCE :
            setSource(SOURCE_EDEFAULT);
            return;
         case CommonModelingPackage.ANNOTATION__DATA :
            getData().clear();
            return;
         case CommonModelingPackage.ANNOTATION__CONTENTS :
            getContents().clear();
            return;
         case CommonModelingPackage.ANNOTATION__REFERENCES :
            getReferences().clear();
            return;
         case CommonModelingPackage.ANNOTATION__CONTENT :
            setContent((EObject) null);
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
         case CommonModelingPackage.ANNOTATION__ANNOTATIONS :
            return annotations != null && !annotations.isEmpty();
         case CommonModelingPackage.ANNOTATION__TARGET :
            return getTarget() != null;
         case CommonModelingPackage.ANNOTATION__SOURCE :
            return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
         case CommonModelingPackage.ANNOTATION__DATA :
            return data != null && !data.isEmpty();
         case CommonModelingPackage.ANNOTATION__CONTENTS :
            return contents != null && !contents.isEmpty();
         case CommonModelingPackage.ANNOTATION__REFERENCES :
            return references != null && !references.isEmpty();
         case CommonModelingPackage.ANNOTATION__CONTENT :
            return content != null;
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
      result.append(" (source: ");
      result.append(source);
      result.append(')');
      return result.toString();
   }

} // AnnotationImpl
