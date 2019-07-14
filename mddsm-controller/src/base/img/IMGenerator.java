/**
 */
package base.img;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IM Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link base.img.IMGenerator#getRepository <em>Repository</em>}</li>
 *   <li>{@link base.img.IMGenerator#getBuild <em>Build</em>}</li>
 * </ul>
 *
 * @see base.img.ImgPackage#getIMGenerator()
 * @model
 * @generated
 */
public interface IMGenerator extends EObject {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' reference.
	 * @see #setRepository(RepositoryManager)
	 * @see base.img.ImgPackage#getIMGenerator_Repository()
	 * @model
	 * @generated
	 */
	RepositoryManager getRepository();

	/**
	 * Sets the value of the '{@link base.img.IMGenerator#getRepository <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(RepositoryManager value);

	/**
	 * Returns the value of the '<em><b>Build</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build</em>' reference.
	 * @see #setBuild(BuildIM)
	 * @see base.img.ImgPackage#getIMGenerator_Build()
	 * @model
	 * @generated
	 */
	BuildIM getBuild();

	/**
	 * Sets the value of the '{@link base.img.IMGenerator#getBuild <em>Build</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build</em>' reference.
	 * @see #getBuild()
	 * @generated
	 */
	void setBuild(BuildIM value);

} // IMGenerator
