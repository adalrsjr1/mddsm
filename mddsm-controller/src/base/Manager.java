/**
 */
package base;

import base.common.Action;
import base.common.Interface;

import base.metadata.Annotable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link base.Manager#getIface <em>Iface</em>}</li>
 *   <li>{@link base.Manager#getActions <em>Actions</em>}</li>
 *   <li>{@link base.Manager#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link base.Manager#getStateManager <em>State Manager</em>}</li>
 *   <li>{@link base.Manager#getPolicyManager <em>Policy Manager</em>}</li>
 *   <li>{@link base.Manager#getScriptManager <em>Script Manager</em>}</li>
 * </ul>
 *
 * @see base.BasePackage#getManager()
 * @model
 * @generated
 */
public interface Manager extends Annotable {
	/**
	 * Returns the value of the '<em><b>Iface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iface</em>' containment reference.
	 * @see #setIface(Interface)
	 * @see base.BasePackage#getManager_Iface()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Interface getIface();

	/**
	 * Sets the value of the '{@link base.Manager#getIface <em>Iface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iface</em>' containment reference.
	 * @see #getIface()
	 * @generated
	 */
	void setIface(Interface value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link base.common.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see base.BasePackage#getManager_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Handlers</b></em>' containment reference list.
	 * The list contents are of type {@link base.Handler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handlers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handlers</em>' containment reference list.
	 * @see base.BasePackage#getManager_Handlers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Handler> getHandlers();

	/**
	 * Returns the value of the '<em><b>State Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Manager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Manager</em>' containment reference.
	 * @see #setStateManager(StateManager)
	 * @see base.BasePackage#getManager_StateManager()
	 * @model containment="true"
	 * @generated
	 */
	StateManager getStateManager();

	/**
	 * Sets the value of the '{@link base.Manager#getStateManager <em>State Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Manager</em>' containment reference.
	 * @see #getStateManager()
	 * @generated
	 */
	void setStateManager(StateManager value);

	/**
	 * Returns the value of the '<em><b>Policy Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Manager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Manager</em>' containment reference.
	 * @see #setPolicyManager(PolicyManager)
	 * @see base.BasePackage#getManager_PolicyManager()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PolicyManager getPolicyManager();

	/**
	 * Sets the value of the '{@link base.Manager#getPolicyManager <em>Policy Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Manager</em>' containment reference.
	 * @see #getPolicyManager()
	 * @generated
	 */
	void setPolicyManager(PolicyManager value);

	/**
	 * Returns the value of the '<em><b>Script Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Manager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Manager</em>' containment reference.
	 * @see #setScriptManager(ScriptManager)
	 * @see base.BasePackage#getManager_ScriptManager()
	 * @model containment="true"
	 * @generated
	 */
	ScriptManager getScriptManager();

	/**
	 * Sets the value of the '{@link base.Manager#getScriptManager <em>Script Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Manager</em>' containment reference.
	 * @see #getScriptManager()
	 * @generated
	 */
	void setScriptManager(ScriptManager value);

} // Manager
