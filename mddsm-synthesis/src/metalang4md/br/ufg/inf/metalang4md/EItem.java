/**
 */
package br.ufg.inf.metalang4md;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EItem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metalang4md.EItem#getArisingBehavior <em>Arising Behavior</em>}</li>
 * </ul>
 *
 * @see metalang4md.Metalang4mdPackage#getEItem()
 * @model
 * @generated
 */
public interface EItem extends EDomainSpecificElement {
	/**
	 * Returns the value of the '<em><b>Arising Behavior</b></em>' attribute.
	 * The literals are from the enumeration {@link metalang4md.EArising}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arising Behavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arising Behavior</em>' attribute.
	 * @see metalang4md.EArising
	 * @see #setArisingBehavior(EArising)
	 * @see metalang4md.Metalang4mdPackage#getEItem_ArisingBehavior()
	 * @model
	 * @generated
	 */
	EArising getArisingBehavior();

	/**
	 * Sets the value of the '{@link metalang4md.EItem#getArisingBehavior <em>Arising Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arising Behavior</em>' attribute.
	 * @see metalang4md.EArising
	 * @see #getArisingBehavior()
	 * @generated
	 */
	void setArisingBehavior(EArising value);

} // EItem
