/**
 */
package br.ufg.inf.metalang4md;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDomain Specific Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metalang4md.EDomainSpecificElement#getCommandPriority <em>Command Priority</em>}</li>
 * </ul>
 *
 * @see metalang4md.Metalang4mdPackage#getEDomainSpecificElement()
 * @model
 * @generated
 */
public interface EDomainSpecificElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Priority</em>' attribute.
	 * @see #setCommandPriority(int)
	 * @see metalang4md.Metalang4mdPackage#getEDomainSpecificElement_CommandPriority()
	 * @model
	 * @generated
	 */
	int getCommandPriority();

	/**
	 * Sets the value of the '{@link metalang4md.EDomainSpecificElement#getCommandPriority <em>Command Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Priority</em>' attribute.
	 * @see #getCommandPriority()
	 * @generated
	 */
	void setCommandPriority(int value);

} // EDomainSpecificElement
