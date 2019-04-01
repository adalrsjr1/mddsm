/**
 */
package metalang4md;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EComposable Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metalang4md.EComposableProperty#getESubProperty <em>ESub Property</em>}</li>
 * </ul>
 *
 * @see metalang4md.Metalang4mdPackage#getEComposableProperty()
 * @model
 * @generated
 */
public interface EComposableProperty extends EDomainSpecificProperty {
	/**
	 * Returns the value of the '<em><b>ESub Property</b></em>' containment reference list.
	 * The list contents are of type {@link metalang4md.EDomainSpecificProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESub Property</em>' containment reference list.
	 * @see metalang4md.Metalang4mdPackage#getEComposableProperty_ESubProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<EDomainSpecificProperty> getESubProperty();

} // EComposableProperty
