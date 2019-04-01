/**
 */
package metalang4md.util;

import metalang4md.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see metalang4md.Metalang4mdPackage
 * @generated
 */
public class Metalang4mdSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Metalang4mdPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metalang4mdSwitch() {
		if (modelPackage == null) {
			modelPackage = Metalang4mdPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Metalang4mdPackage.EACTOR: {
				EActor eActor = (EActor)theEObject;
				T result = caseEActor(eActor);
				if (result == null) result = caseEDomainSpecificElement(eActor);
				if (result == null) result = caseEClass(eActor);
				if (result == null) result = caseEClassifier(eActor);
				if (result == null) result = caseENamedElement(eActor);
				if (result == null) result = caseEModelElement(eActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metalang4mdPackage.EITEM: {
				EItem eItem = (EItem)theEObject;
				T result = caseEItem(eItem);
				if (result == null) result = caseEDomainSpecificElement(eItem);
				if (result == null) result = caseEClass(eItem);
				if (result == null) result = caseEClassifier(eItem);
				if (result == null) result = caseENamedElement(eItem);
				if (result == null) result = caseEModelElement(eItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metalang4mdPackage.EINTERACTION: {
				EInteraction eInteraction = (EInteraction)theEObject;
				T result = caseEInteraction(eInteraction);
				if (result == null) result = caseEReference(eInteraction);
				if (result == null) result = caseEStructuralFeature(eInteraction);
				if (result == null) result = caseETypedElement(eInteraction);
				if (result == null) result = caseENamedElement(eInteraction);
				if (result == null) result = caseEModelElement(eInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE: {
				EDomainSpecificType eDomainSpecificType = (EDomainSpecificType)theEObject;
				T result = caseEDomainSpecificType(eDomainSpecificType);
				if (result == null) result = caseEDomainSpecificElement(eDomainSpecificType);
				if (result == null) result = caseEClass(eDomainSpecificType);
				if (result == null) result = caseEClassifier(eDomainSpecificType);
				if (result == null) result = caseENamedElement(eDomainSpecificType);
				if (result == null) result = caseEModelElement(eDomainSpecificType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_ELEMENT: {
				EDomainSpecificElement eDomainSpecificElement = (EDomainSpecificElement)theEObject;
				T result = caseEDomainSpecificElement(eDomainSpecificElement);
				if (result == null) result = caseEClass(eDomainSpecificElement);
				if (result == null) result = caseEClassifier(eDomainSpecificElement);
				if (result == null) result = caseENamedElement(eDomainSpecificElement);
				if (result == null) result = caseEModelElement(eDomainSpecificElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_PACKAGE: {
				EDomainSpecificPackage eDomainSpecificPackage = (EDomainSpecificPackage)theEObject;
				T result = caseEDomainSpecificPackage(eDomainSpecificPackage);
				if (result == null) result = caseEPackage(eDomainSpecificPackage);
				if (result == null) result = caseENamedElement(eDomainSpecificPackage);
				if (result == null) result = caseEModelElement(eDomainSpecificPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_PROPERTY: {
				EDomainSpecificProperty eDomainSpecificProperty = (EDomainSpecificProperty)theEObject;
				T result = caseEDomainSpecificProperty(eDomainSpecificProperty);
				if (result == null) result = caseETypedElement(eDomainSpecificProperty);
				if (result == null) result = caseENamedElement(eDomainSpecificProperty);
				if (result == null) result = caseEModelElement(eDomainSpecificProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metalang4mdPackage.ECOMPOSABLE_PROPERTY: {
				EComposableProperty eComposableProperty = (EComposableProperty)theEObject;
				T result = caseEComposableProperty(eComposableProperty);
				if (result == null) result = caseEDomainSpecificProperty(eComposableProperty);
				if (result == null) result = caseETypedElement(eComposableProperty);
				if (result == null) result = caseENamedElement(eComposableProperty);
				if (result == null) result = caseEModelElement(eComposableProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metalang4mdPackage.ELEAF_PROPERTY: {
				ELeafProperty eLeafProperty = (ELeafProperty)theEObject;
				T result = caseELeafProperty(eLeafProperty);
				if (result == null) result = caseEDomainSpecificProperty(eLeafProperty);
				if (result == null) result = caseETypedElement(eLeafProperty);
				if (result == null) result = caseENamedElement(eLeafProperty);
				if (result == null) result = caseEModelElement(eLeafProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metalang4mdPackage.ECOMPOSITION_INTERACTION: {
				ECompositionInteraction eCompositionInteraction = (ECompositionInteraction)theEObject;
				T result = caseECompositionInteraction(eCompositionInteraction);
				if (result == null) result = caseEInteraction(eCompositionInteraction);
				if (result == null) result = caseEReference(eCompositionInteraction);
				if (result == null) result = caseEStructuralFeature(eCompositionInteraction);
				if (result == null) result = caseETypedElement(eCompositionInteraction);
				if (result == null) result = caseENamedElement(eCompositionInteraction);
				if (result == null) result = caseEModelElement(eCompositionInteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metalang4mdPackage.EBINDINGINTERACTION: {
				EBindinginteraction eBindinginteraction = (EBindinginteraction)theEObject;
				T result = caseEBindinginteraction(eBindinginteraction);
				if (result == null) result = caseEInteraction(eBindinginteraction);
				if (result == null) result = caseEReference(eBindinginteraction);
				if (result == null) result = caseEStructuralFeature(eBindinginteraction);
				if (result == null) result = caseETypedElement(eBindinginteraction);
				if (result == null) result = caseENamedElement(eBindinginteraction);
				if (result == null) result = caseEModelElement(eBindinginteraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EActor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EActor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEActor(EActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EItem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EItem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEItem(EItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EInteraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EInteraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEInteraction(EInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDomain Specific Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDomain Specific Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDomainSpecificType(EDomainSpecificType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDomain Specific Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDomain Specific Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDomainSpecificElement(EDomainSpecificElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDomain Specific Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDomain Specific Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDomainSpecificPackage(EDomainSpecificPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDomain Specific Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDomain Specific Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDomainSpecificProperty(EDomainSpecificProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EComposable Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EComposable Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEComposableProperty(EComposableProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ELeaf Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ELeaf Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELeafProperty(ELeafProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EComposition Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EComposition Interaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECompositionInteraction(ECompositionInteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EBindinginteraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EBindinginteraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEBindinginteraction(EBindinginteraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEModelElement(EModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENamedElement(ENamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClassifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClassifier(EClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClass(EClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETyped Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETypedElement(ETypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EStructural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EStructural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStructuralFeature(EStructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EReference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EReference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEReference(EReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEPackage(EPackage object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //Metalang4mdSwitch
