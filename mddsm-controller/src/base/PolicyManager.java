/**
 */
package base;

import base.policy.Policy;
import base.policy.PolicyEvaluationHandler;
import base.policy.PolicyEvaluationPoint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link base.PolicyManager#getPoints <em>Points</em>}</li>
 *   <li>{@link base.PolicyManager#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link base.PolicyManager#getPolicies <em>Policies</em>}</li>
 * </ul>
 *
 * @see base.BasePackage#getPolicyManager()
 * @model
 * @generated
 */
public interface PolicyManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference list.
	 * The list contents are of type {@link base.policy.PolicyEvaluationPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' containment reference list.
	 * @see base.BasePackage#getPolicyManager_Points()
	 * @model containment="true"
	 * @generated
	 */
	EList<PolicyEvaluationPoint> getPoints();

	/**
	 * Returns the value of the '<em><b>Handlers</b></em>' containment reference list.
	 * The list contents are of type {@link base.policy.PolicyEvaluationHandler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handlers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handlers</em>' containment reference list.
	 * @see base.BasePackage#getPolicyManager_Handlers()
	 * @model containment="true"
	 * @generated
	 */
	EList<PolicyEvaluationHandler> getHandlers();

	/**
	 * Returns the value of the '<em><b>Policies</b></em>' containment reference list.
	 * The list contents are of type {@link base.policy.Policy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policies</em>' containment reference list.
	 * @see base.BasePackage#getPolicyManager_Policies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Policy> getPolicies();

} // PolicyManager
