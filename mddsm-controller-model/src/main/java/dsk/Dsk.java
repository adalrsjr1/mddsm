/**
 */
package dsk;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsk.Dsk#getDomain <em>Domain</em>}</li>
 *   <li>{@link dsk.Dsk#getDscs <em>Dscs</em>}</li>
 *   <li>{@link dsk.Dsk#getProcedures <em>Procedures</em>}</li>
 * </ul>
 *
 * @see dsk.DskPackage#getDsk()
 * @model
 * @generated
 */
public interface Dsk extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see dsk.DskPackage#getDsk_Domain()
	 * @model
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link dsk.Dsk#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

	/**
	 * Returns the value of the '<em><b>Dscs</b></em>' containment reference list.
	 * The list contents are of type {@link dsk.EDSC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dscs</em>' containment reference list.
	 * @see dsk.DskPackage#getDsk_Dscs()
	 * @model containment="true"
	 * @generated
	 */
	EList<EDSC> getDscs();

	/**
	 * Returns the value of the '<em><b>Procedures</b></em>' containment reference list.
	 * The list contents are of type {@link dsk.EProcedure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedures</em>' containment reference list.
	 * @see dsk.DskPackage#getDsk_Procedures()
	 * @model containment="true"
	 * @generated
	 */
	EList<EProcedure> getProcedures();

} // Dsk
