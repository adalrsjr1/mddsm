/**
 */
package dsk;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>dsk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Dsk.dsk#getDomain <em>Domain</em>}</li>
 *   <li>{@link Dsk.dsk#getDscs <em>Dscs</em>}</li>
 *   <li>{@link Dsk.dsk#getProcedures <em>Procedures</em>}</li>
 * </ul>
 *
 * @see Dsk.DskPackage#getdsk()
 * @model
 * @generated
 */
public interface Dsk extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see Dsk.DskPackage#getdsk_Domain()
	 * @model
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link Dsk.dsk#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

	/**
	 * Returns the value of the '<em><b>Dscs</b></em>' containment reference list.
	 * The list contents are of type {@link Dsk.EDSC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dscs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dscs</em>' containment reference list.
	 * @see Dsk.DskPackage#getdsk_Dscs()
	 * @model containment="true"
	 * @generated
	 */
	EList<EDSC> getDscs();

	/**
	 * Returns the value of the '<em><b>Procedures</b></em>' containment reference list.
	 * The list contents are of type {@link Dsk.EProcedure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedures</em>' containment reference list.
	 * @see Dsk.DskPackage#getdsk_Procedures()
	 * @model containment="true"
	 * @generated
	 */
	EList<EProcedure> getProcedures();

} // dsk
