/**
 */
package metalang4md.util;

import metalang4md.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

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
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metalang4mdPackage.EITEM: {
				EItem eItem = (EItem)theEObject;
				T result = caseEItem(eItem);
				if (result == null) result = caseEDomainSpecificElement(eItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE: {
				EDomainSpecificType eDomainSpecificType = (EDomainSpecificType)theEObject;
				T result = caseEDomainSpecificType(eDomainSpecificType);
				if (result == null) result = caseEDomainSpecificElement(eDomainSpecificType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_ELEMENT: {
				EDomainSpecificElement eDomainSpecificElement = (EDomainSpecificElement)theEObject;
				T result = caseEDomainSpecificElement(eDomainSpecificElement);
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
