/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.sourcepit.modeling.common.impl;

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

import org.sourcepit.modeling.common.Annotatable;
import org.sourcepit.modeling.common.Annotation;
import org.sourcepit.modeling.common.CommonModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sourcepit.modeling.common.impl.AnnotationImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.sourcepit.modeling.common.impl.AnnotationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.sourcepit.modeling.common.impl.AnnotationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.sourcepit.modeling.common.impl.AnnotationImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.sourcepit.modeling.common.impl.AnnotationImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link org.sourcepit.modeling.common.impl.AnnotationImpl#getReferences <em>References</em>}</li>
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
    * @see #getAnnotations()
    * @generated
    * @ordered
    */
   protected EList<Annotation> annotations;

   /**
    * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSource()
    * @generated
    * @ordered
    */
   protected static final String SOURCE_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSource()
    * @generated
    * @ordered
    */
   protected String source = SOURCE_EDEFAULT;

   /**
    * The cached value of the '{@link #getData() <em>Data</em>}' map.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getData()
    * @generated
    * @ordered
    */
   protected EMap<String, String> data;

   /**
    * The cached value of the '{@link #getContents() <em>Contents</em>}' map.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getContents()
    * @generated
    * @ordered
    */
   protected EMap<String, EObject> contents;

   /**
    * The cached value of the '{@link #getReferences() <em>References</em>}' map.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getReferences()
    * @generated
    * @ordered
    */
   protected EMap<String, EObject> references;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected AnnotationImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass()
   {
      return CommonModelPackage.Literals.ANNOTATION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Annotation> getAnnotations()
   {
      if (annotations == null)
      {
         annotations = new EObjectContainmentWithInverseEList<Annotation>(Annotation.class, this, CommonModelPackage.ANNOTATION__ANNOTATIONS, CommonModelPackage.ANNOTATION__TARGET);
      }
      return annotations;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Annotatable getTarget()
   {
      if (eContainerFeatureID() != CommonModelPackage.ANNOTATION__TARGET) return null;
      return (Annotatable)eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetTarget(Annotatable newTarget, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject)newTarget, CommonModelPackage.ANNOTATION__TARGET, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setTarget(Annotatable newTarget)
   {
      if (newTarget != eInternalContainer() || (eContainerFeatureID() != CommonModelPackage.ANNOTATION__TARGET && newTarget != null))
      {
         if (EcoreUtil.isAncestor(this, newTarget))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newTarget != null)
            msgs = ((InternalEObject)newTarget).eInverseAdd(this, CommonModelPackage.ANNOTATABLE__ANNOTATIONS, Annotatable.class, msgs);
         msgs = basicSetTarget(newTarget, msgs);
         if (msgs != null) msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CommonModelPackage.ANNOTATION__TARGET, newTarget, newTarget));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getSource()
   {
      return source;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSource(String newSource)
   {
      String oldSource = source;
      source = newSource;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, CommonModelPackage.ANNOTATION__SOURCE, oldSource, source));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EMap<String, String> getData()
   {
      if (data == null)
      {
         data = new EcoreEMap<String,String>(CommonModelPackage.Literals.ESTRING_MAP_ENTRY, EStringMapEntryImpl.class, this, CommonModelPackage.ANNOTATION__DATA);
      }
      return data;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EMap<String, EObject> getContents()
   {
      if (contents == null)
      {
         contents = new EcoreEMap<String,EObject>(CommonModelPackage.Literals.ECONTAINMENT_MAP_ENTRY, EContainmentMapEntryImpl.class, this, CommonModelPackage.ANNOTATION__CONTENTS);
      }
      return contents;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EMap<String, EObject> getReferences()
   {
      if (references == null)
      {
         references = new EcoreEMap<String,EObject>(CommonModelPackage.Literals.EREFERENCE_MAP_ENTRY, EReferenceMapEntryImpl.class, this, CommonModelPackage.ANNOTATION__REFERENCES);
      }
      return references;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
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
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case CommonModelPackage.ANNOTATION__ANNOTATIONS:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnnotations()).basicAdd(otherEnd, msgs);
         case CommonModelPackage.ANNOTATION__TARGET:
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetTarget((Annotatable)otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case CommonModelPackage.ANNOTATION__ANNOTATIONS:
            return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
         case CommonModelPackage.ANNOTATION__TARGET:
            return basicSetTarget(null, msgs);
         case CommonModelPackage.ANNOTATION__DATA:
            return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
         case CommonModelPackage.ANNOTATION__CONTENTS:
            return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
         case CommonModelPackage.ANNOTATION__REFERENCES:
            return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
   {
      switch (eContainerFeatureID())
      {
         case CommonModelPackage.ANNOTATION__TARGET:
            return eInternalContainer().eInverseRemove(this, CommonModelPackage.ANNOTATABLE__ANNOTATIONS, Annotatable.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case CommonModelPackage.ANNOTATION__ANNOTATIONS:
            return getAnnotations();
         case CommonModelPackage.ANNOTATION__TARGET:
            return getTarget();
         case CommonModelPackage.ANNOTATION__SOURCE:
            return getSource();
         case CommonModelPackage.ANNOTATION__DATA:
            if (coreType) return getData();
            else return getData().map();
         case CommonModelPackage.ANNOTATION__CONTENTS:
            if (coreType) return getContents();
            else return getContents().map();
         case CommonModelPackage.ANNOTATION__REFERENCES:
            if (coreType) return getReferences();
            else return getReferences().map();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
         case CommonModelPackage.ANNOTATION__ANNOTATIONS:
            getAnnotations().clear();
            getAnnotations().addAll((Collection<? extends Annotation>)newValue);
            return;
         case CommonModelPackage.ANNOTATION__TARGET:
            setTarget((Annotatable)newValue);
            return;
         case CommonModelPackage.ANNOTATION__SOURCE:
            setSource((String)newValue);
            return;
         case CommonModelPackage.ANNOTATION__DATA:
            ((EStructuralFeature.Setting)getData()).set(newValue);
            return;
         case CommonModelPackage.ANNOTATION__CONTENTS:
            ((EStructuralFeature.Setting)getContents()).set(newValue);
            return;
         case CommonModelPackage.ANNOTATION__REFERENCES:
            ((EStructuralFeature.Setting)getReferences()).set(newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset(int featureID)
   {
      switch (featureID)
      {
         case CommonModelPackage.ANNOTATION__ANNOTATIONS:
            getAnnotations().clear();
            return;
         case CommonModelPackage.ANNOTATION__TARGET:
            setTarget((Annotatable)null);
            return;
         case CommonModelPackage.ANNOTATION__SOURCE:
            setSource(SOURCE_EDEFAULT);
            return;
         case CommonModelPackage.ANNOTATION__DATA:
            getData().clear();
            return;
         case CommonModelPackage.ANNOTATION__CONTENTS:
            getContents().clear();
            return;
         case CommonModelPackage.ANNOTATION__REFERENCES:
            getReferences().clear();
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID)
   {
      switch (featureID)
      {
         case CommonModelPackage.ANNOTATION__ANNOTATIONS:
            return annotations != null && !annotations.isEmpty();
         case CommonModelPackage.ANNOTATION__TARGET:
            return getTarget() != null;
         case CommonModelPackage.ANNOTATION__SOURCE:
            return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
         case CommonModelPackage.ANNOTATION__DATA:
            return data != null && !data.isEmpty();
         case CommonModelPackage.ANNOTATION__CONTENTS:
            return contents != null && !contents.isEmpty();
         case CommonModelPackage.ANNOTATION__REFERENCES:
            return references != null && !references.isEmpty();
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString()
   {
      if (eIsProxy()) return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (source: ");
      result.append(source);
      result.append(')');
      return result.toString();
   }

} //AnnotationImpl
