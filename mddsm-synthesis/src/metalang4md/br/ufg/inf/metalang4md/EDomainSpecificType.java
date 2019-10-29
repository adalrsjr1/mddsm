/**
 */
package br.ufg.inf.metalang4md;

import org.eclipse.emf.common.util.EList;

import br.ufg.inf.metalang4md.metalang4md.ECardinality;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDomain Specific Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metalang4md.EDomainSpecificType#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link metalang4md.EDomainSpecificType#getInteractionBehavior <em>Interaction Behavior</em>}</li>
 *   <li>{@link metalang4md.EDomainSpecificType#getKindInteraction <em>Kind Interaction</em>}</li>
 *   <li>{@link metalang4md.EDomainSpecificType#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @see metalang4md.Metalang4mdPackage#getEDomainSpecificType()
 * @model
 * @generated
 */
public interface EDomainSpecificType extends EDomainSpecificElement {
	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link metalang4md.ECardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see metalang4md.ECardinality
	 * @see #setCardinality(ECardinality)
	 * @see metalang4md.Metalang4mdPackage#getEDomainSpecificType_Cardinality()
	 * @model
	 * @generated
	 */
	ECardinality getCardinality();

	/**
	 * Sets the value of the '{@link metalang4md.EDomainSpecificType#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see metalang4md.ECardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(ECardinality value);

	/**
	 * Returns the value of the '<em><b>Interaction Behavior</b></em>' attribute.
	 * The literals are from the enumeration {@link metalang4md.EInteractionBehavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Behavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Behavior</em>' attribute.
	 * @see metalang4md.EInteractionBehavior
	 * @see #setInteractionBehavior(EInteractionBehavior)
	 * @see metalang4md.Metalang4mdPackage#getEDomainSpecificType_InteractionBehavior()
	 * @model
	 * @generated
	 */
	EInteractionBehavior getInteractionBehavior();

	/**
	 * Sets the value of the '{@link metalang4md.EDomainSpecificType#getInteractionBehavior <em>Interaction Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Behavior</em>' attribute.
	 * @see metalang4md.EInteractionBehavior
	 * @see #getInteractionBehavior()
	 * @generated
	 */
	void setInteractionBehavior(EInteractionBehavior value);

	/**
	 * Returns the value of the '<em><b>Kind Interaction</b></em>' attribute.
	 * The literals are from the enumeration {@link metalang4md.ECoordinationBehavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind Interaction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind Interaction</em>' attribute.
	 * @see metalang4md.ECoordinationBehavior
	 * @see #setKindInteraction(ECoordinationBehavior)
	 * @see metalang4md.Metalang4mdPackage#getEDomainSpecificType_KindInteraction()
	 * @model
	 * @generated
	 */
	ECoordinationBehavior getKindInteraction();

	/**
	 * Sets the value of the '{@link metalang4md.EDomainSpecificType#getKindInteraction <em>Kind Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind Interaction</em>' attribute.
	 * @see metalang4md.ECoordinationBehavior
	 * @see #getKindInteraction()
	 * @generated
	 */
	void setKindInteraction(ECoordinationBehavior value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference list.
	 * The list contents are of type {@link metalang4md.EDomainSpecificType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference list.
	 * @see metalang4md.Metalang4mdPackage#getEDomainSpecificType_Binding()
	 * @model
	 * @generated
	 */
	EList<EDomainSpecificType> getBinding();

} // EDomainSpecificType
