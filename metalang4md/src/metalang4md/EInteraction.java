/**
 */
package metalang4md;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EInteraction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metalang4md.EInteraction#getInteractionBehavior <em>Interaction Behavior</em>}</li>
 *   <li>{@link metalang4md.EInteraction#getKindInteraction <em>Kind Interaction</em>}</li>
 *   <li>{@link metalang4md.EInteraction#getEInteractionType <em>EInteraction Type</em>}</li>
 *   <li>{@link metalang4md.EInteraction#getTargetCardinality <em>Target Cardinality</em>}</li>
 * </ul>
 *
 * @see metalang4md.Metalang4mdPackage#getEInteraction()
 * @model abstract="true"
 * @generated
 */
public interface EInteraction extends EReference {
	/**
	 * Returns the value of the '<em><b>Interaction Behavior</b></em>' attribute.
	 * The literals are from the enumeration {@link metalang4md.EInteractionBehavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Behavior</em>' attribute.
	 * @see metalang4md.EInteractionBehavior
	 * @see #setInteractionBehavior(EInteractionBehavior)
	 * @see metalang4md.Metalang4mdPackage#getEInteraction_InteractionBehavior()
	 * @model
	 * @generated
	 */
	EInteractionBehavior getInteractionBehavior();

	/**
	 * Sets the value of the '{@link metalang4md.EInteraction#getInteractionBehavior <em>Interaction Behavior</em>}' attribute.
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
	 * The literals are from the enumeration {@link metalang4md.EKindInteraction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind Interaction</em>' attribute.
	 * @see metalang4md.EKindInteraction
	 * @see #setKindInteraction(EKindInteraction)
	 * @see metalang4md.Metalang4mdPackage#getEInteraction_KindInteraction()
	 * @model
	 * @generated
	 */
	EKindInteraction getKindInteraction();

	/**
	 * Sets the value of the '{@link metalang4md.EInteraction#getKindInteraction <em>Kind Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind Interaction</em>' attribute.
	 * @see metalang4md.EKindInteraction
	 * @see #getKindInteraction()
	 * @generated
	 */
	void setKindInteraction(EKindInteraction value);

	/**
	 * Returns the value of the '<em><b>EInteraction Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EInteraction Type</em>' reference.
	 * @see #setEInteractionType(EDomainSpecificElement)
	 * @see metalang4md.Metalang4mdPackage#getEInteraction_EInteractionType()
	 * @model
	 * @generated
	 */
	EDomainSpecificElement getEInteractionType();

	/**
	 * Sets the value of the '{@link metalang4md.EInteraction#getEInteractionType <em>EInteraction Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EInteraction Type</em>' reference.
	 * @see #getEInteractionType()
	 * @generated
	 */
	void setEInteractionType(EDomainSpecificElement value);

	/**
	 * Returns the value of the '<em><b>Target Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link metalang4md.ECardinality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Cardinality</em>' attribute.
	 * @see metalang4md.ECardinality
	 * @see #setTargetCardinality(ECardinality)
	 * @see metalang4md.Metalang4mdPackage#getEInteraction_TargetCardinality()
	 * @model
	 * @generated
	 */
	ECardinality getTargetCardinality();

	/**
	 * Sets the value of the '{@link metalang4md.EInteraction#getTargetCardinality <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Cardinality</em>' attribute.
	 * @see metalang4md.ECardinality
	 * @see #getTargetCardinality()
	 * @generated
	 */
	void setTargetCardinality(ECardinality value);

} // EInteraction
