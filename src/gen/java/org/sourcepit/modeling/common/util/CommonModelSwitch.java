/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.sourcepit.modeling.common.util;

import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.sourcepit.modeling.common.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.sourcepit.modeling.common.CommonModelPackage
 * @generated
 */
public class CommonModelSwitch<T> extends Switch<T>
{
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static CommonModelPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CommonModelSwitch()
   {
      if (modelPackage == null)
      {
         modelPackage = CommonModelPackage.eINSTANCE;
      }
   }

   /**
    * Checks whether this is a switch for the given package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @parameter ePackage the package in question.
    * @return whether this is a switch for the given package.
    * @generated
    */
   @Override
   protected boolean isSwitchFor(EPackage ePackage)
   {
      return ePackage == modelPackage;
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   @Override
   protected T doSwitch(int classifierID, EObject theEObject)
   {
      switch (classifierID)
      {
         case CommonModelPackage.ANNOTATABLE:
         {
            Annotatable annotatable = (Annotatable)theEObject;
            T result = caseAnnotatable(annotatable);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case CommonModelPackage.ANNOTATION:
         {
            Annotation annotation = (Annotation)theEObject;
            T result = caseAnnotation(annotation);
            if (result == null) result = caseAnnotatable(annotation);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case CommonModelPackage.ESTRING_MAP_ENTRY:
         {
            @SuppressWarnings("unchecked") Entry<String, String> eStringMapEntry = (Entry<String, String>)theEObject;
            T result = caseEStringMapEntry(eStringMapEntry);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case CommonModelPackage.ECONTAINMENT_MAP_ENTRY:
         {
            @SuppressWarnings("unchecked") Entry<String, EObject> eContainmentMapEntry = (Entry<String, EObject>)theEObject;
            T result = caseEContainmentMapEntry(eContainmentMapEntry);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case CommonModelPackage.EREFERENCE_MAP_ENTRY:
         {
            @SuppressWarnings("unchecked") Entry<String, EObject> eReferenceMapEntry = (Entry<String, EObject>)theEObject;
            T result = caseEReferenceMapEntry(eReferenceMapEntry);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         default: return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Annotatable</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Annotatable</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAnnotatable(Annotatable object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAnnotation(Annotation object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EString Map Entry</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EString Map Entry</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseEStringMapEntry(Entry<String, String> object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EContainment Map Entry</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EContainment Map Entry</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseEContainmentMapEntry(Entry<String, EObject> object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EReference Map Entry</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EReference Map Entry</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseEReferenceMapEntry(Entry<String, EObject> object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch, but this is the last case anyway.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   @Override
   public T defaultCase(EObject object)
   {
      return null;
   }

} //CommonModelSwitch
