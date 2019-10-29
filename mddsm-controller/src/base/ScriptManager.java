/**
 */
package base;

import base.script.ScriptInterpreter;
import base.script.ScriptProcessor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link base.ScriptManager#getInterpreter <em>Interpreter</em>}</li>
 *   <li>{@link base.ScriptManager#getProcessor <em>Processor</em>}</li>
 * </ul>
 *
 * @see base.BasePackage#getScriptManager()
 * @model
 * @generated
 */
public interface ScriptManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Interpreter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpreter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpreter</em>' containment reference.
	 * @see #setInterpreter(ScriptInterpreter)
	 * @see base.BasePackage#getScriptManager_Interpreter()
	 * @model containment="true"
	 * @generated
	 */
	ScriptInterpreter getInterpreter();

	/**
	 * Sets the value of the '{@link base.ScriptManager#getInterpreter <em>Interpreter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpreter</em>' containment reference.
	 * @see #getInterpreter()
	 * @generated
	 */
	void setInterpreter(ScriptInterpreter value);

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' reference.
	 * @see #setProcessor(ScriptProcessor)
	 * @see base.BasePackage#getScriptManager_Processor()
	 * @model
	 * @generated
	 */
	ScriptProcessor getProcessor();

	/**
	 * Sets the value of the '{@link base.ScriptManager#getProcessor <em>Processor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' reference.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(ScriptProcessor value);

} // ScriptManager
