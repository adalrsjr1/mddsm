/**
 */
package base.script;

import base.img.IMExecutor;
import base.img.IMGenerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link base.script.ScriptProcessor#getImg <em>Img</em>}</li>
 *   <li>{@link base.script.ScriptProcessor#getIme <em>Ime</em>}</li>
 * </ul>
 *
 * @see base.script.ScriptPackage#getScriptProcessor()
 * @model
 * @generated
 */
public interface ScriptProcessor extends EObject {
	/**
	 * Returns the value of the '<em><b>Img</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Img</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Img</em>' containment reference.
	 * @see #setImg(IMGenerator)
	 * @see base.script.ScriptPackage#getScriptProcessor_Img()
	 * @model containment="true"
	 * @generated
	 */
	IMGenerator getImg();

	/**
	 * Sets the value of the '{@link base.script.ScriptProcessor#getImg <em>Img</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Img</em>' containment reference.
	 * @see #getImg()
	 * @generated
	 */
	void setImg(IMGenerator value);

	/**
	 * Returns the value of the '<em><b>Ime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ime</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ime</em>' containment reference.
	 * @see #setIme(IMExecutor)
	 * @see base.script.ScriptPackage#getScriptProcessor_Ime()
	 * @model containment="true"
	 * @generated
	 */
	IMExecutor getIme();

	/**
	 * Sets the value of the '{@link base.script.ScriptProcessor#getIme <em>Ime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ime</em>' containment reference.
	 * @see #getIme()
	 * @generated
	 */
	void setIme(IMExecutor value);

} // ScriptProcessor
