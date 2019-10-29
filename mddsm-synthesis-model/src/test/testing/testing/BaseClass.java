/**
 */
package testing;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testing.BaseClass#getAttrInt <em>Attr Int</em>}</li>
 *   <li>{@link testing.BaseClass#getAttrString <em>Attr String</em>}</li>
 *   <li>{@link testing.BaseClass#getByReferences <em>By References</em>}</li>
 *   <li>{@link testing.BaseClass#getByComposition <em>By Composition</em>}</li>
 * </ul>
 *
 * @see testing.TestingPackage#getBaseClass()
 * @model
 * @generated
 */
public interface BaseClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Attr Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr Int</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Int</em>' attribute.
	 * @see #setAttrInt(int)
	 * @see testing.TestingPackage#getBaseClass_AttrInt()
	 * @model
	 * @generated
	 */
	int getAttrInt();

	/**
	 * Sets the value of the '{@link testing.BaseClass#getAttrInt <em>Attr Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Int</em>' attribute.
	 * @see #getAttrInt()
	 * @generated
	 */
	void setAttrInt(int value);

	/**
	 * Returns the value of the '<em><b>Attr String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr String</em>' attribute.
	 * @see #setAttrString(String)
	 * @see testing.TestingPackage#getBaseClass_AttrString()
	 * @model
	 * @generated
	 */
	String getAttrString();

	/**
	 * Sets the value of the '{@link testing.BaseClass#getAttrString <em>Attr String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr String</em>' attribute.
	 * @see #getAttrString()
	 * @generated
	 */
	void setAttrString(String value);

	/**
	 * Returns the value of the '<em><b>By References</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By References</em>' reference list.
	 * @see testing.TestingPackage#getBaseClass_ByReferences()
	 * @model
	 * @generated
	 */
	EList<EObject> getByReferences();

	/**
	 * Returns the value of the '<em><b>By Composition</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By Composition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By Composition</em>' containment reference list.
	 * @see testing.TestingPackage#getBaseClass_ByComposition()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getByComposition();

} // BaseClass
