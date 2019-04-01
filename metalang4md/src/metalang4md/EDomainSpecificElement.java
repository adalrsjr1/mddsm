/**
 */
package metalang4md;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDomain Specific Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metalang4md.EDomainSpecificElement#getEDomainSpecificProperty <em>EDomain Specific Property</em>}</li>
 *   <li>{@link metalang4md.EDomainSpecificElement#getEInteractions <em>EInteractions</em>}</li>
 * </ul>
 *
 * @see metalang4md.Metalang4mdPackage#getEDomainSpecificElement()
 * @model abstract="true"
 * @generated
 */
public interface EDomainSpecificElement extends EClass {
	/**
	 * Returns the value of the '<em><b>EDomain Specific Property</b></em>' containment reference list.
	 * The list contents are of type {@link metalang4md.EDomainSpecificProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EDomain Specific Property</em>' containment reference list.
	 * @see metalang4md.Metalang4mdPackage#getEDomainSpecificElement_EDomainSpecificProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<EDomainSpecificProperty> getEDomainSpecificProperty();

	/**
	 * Returns the value of the '<em><b>EInteractions</b></em>' containment reference list.
	 * The list contents are of type {@link metalang4md.EInteraction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EInteractions</em>' containment reference list.
	 * @see metalang4md.Metalang4mdPackage#getEDomainSpecificElement_EInteractions()
	 * @model containment="true"
	 * @generated
	 */
	EList<EInteraction> getEInteractions();

} // EDomainSpecificElement
