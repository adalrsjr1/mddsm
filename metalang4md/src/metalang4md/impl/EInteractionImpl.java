/**
 */
package metalang4md.impl;

import metalang4md.ECardinality;
import metalang4md.EDomainSpecificElement;
import metalang4md.EInteraction;
import metalang4md.EInteractionBehavior;
import metalang4md.EKindInteraction;
import metalang4md.Metalang4mdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EReferenceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EInteraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metalang4md.impl.EInteractionImpl#getInteractionBehavior <em>Interaction Behavior</em>}</li>
 *   <li>{@link metalang4md.impl.EInteractionImpl#getKindInteraction <em>Kind Interaction</em>}</li>
 *   <li>{@link metalang4md.impl.EInteractionImpl#getEInteractionType <em>EInteraction Type</em>}</li>
 *   <li>{@link metalang4md.impl.EInteractionImpl#getTargetCardinality <em>Target Cardinality</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EInteractionImpl extends EReferenceImpl implements EInteraction {
	/**
	 * The default value of the '{@link #getInteractionBehavior() <em>Interaction Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final EInteractionBehavior INTERACTION_BEHAVIOR_EDEFAULT = EInteractionBehavior.SYNC;

	/**
	 * The cached value of the '{@link #getInteractionBehavior() <em>Interaction Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionBehavior()
	 * @generated
	 * @ordered
	 */
	protected EInteractionBehavior interactionBehavior = INTERACTION_BEHAVIOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getKindInteraction() <em>Kind Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindInteraction()
	 * @generated
	 * @ordered
	 */
	protected static final EKindInteraction KIND_INTERACTION_EDEFAULT = EKindInteraction.LOCAL;

	/**
	 * The cached value of the '{@link #getKindInteraction() <em>Kind Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindInteraction()
	 * @generated
	 * @ordered
	 */
	protected EKindInteraction kindInteraction = KIND_INTERACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEInteractionType() <em>EInteraction Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEInteractionType()
	 * @generated
	 * @ordered
	 */
	protected EDomainSpecificElement eInteractionType;

	/**
	 * The default value of the '{@link #getTargetCardinality() <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final ECardinality TARGET_CARDINALITY_EDEFAULT = ECardinality.ONE;

	/**
	 * The cached value of the '{@link #getTargetCardinality() <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCardinality()
	 * @generated
	 * @ordered
	 */
	protected ECardinality targetCardinality = TARGET_CARDINALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Metalang4mdPackage.Literals.EINTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EInteractionBehavior getInteractionBehavior() {
		return interactionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionBehavior(EInteractionBehavior newInteractionBehavior) {
		EInteractionBehavior oldInteractionBehavior = interactionBehavior;
		interactionBehavior = newInteractionBehavior == null ? INTERACTION_BEHAVIOR_EDEFAULT : newInteractionBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metalang4mdPackage.EINTERACTION__INTERACTION_BEHAVIOR, oldInteractionBehavior, interactionBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EKindInteraction getKindInteraction() {
		return kindInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKindInteraction(EKindInteraction newKindInteraction) {
		EKindInteraction oldKindInteraction = kindInteraction;
		kindInteraction = newKindInteraction == null ? KIND_INTERACTION_EDEFAULT : newKindInteraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metalang4mdPackage.EINTERACTION__KIND_INTERACTION, oldKindInteraction, kindInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDomainSpecificElement getEInteractionType() {
		if (eInteractionType != null && eInteractionType.eIsProxy()) {
			InternalEObject oldEInteractionType = (InternalEObject)eInteractionType;
			eInteractionType = (EDomainSpecificElement)eResolveProxy(oldEInteractionType);
			if (eInteractionType != oldEInteractionType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Metalang4mdPackage.EINTERACTION__EINTERACTION_TYPE, oldEInteractionType, eInteractionType));
			}
		}
		return eInteractionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDomainSpecificElement basicGetEInteractionType() {
		return eInteractionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEInteractionType(EDomainSpecificElement newEInteractionType) {
		EDomainSpecificElement oldEInteractionType = eInteractionType;
		eInteractionType = newEInteractionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metalang4mdPackage.EINTERACTION__EINTERACTION_TYPE, oldEInteractionType, eInteractionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECardinality getTargetCardinality() {
		return targetCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetCardinality(ECardinality newTargetCardinality) {
		ECardinality oldTargetCardinality = targetCardinality;
		targetCardinality = newTargetCardinality == null ? TARGET_CARDINALITY_EDEFAULT : newTargetCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metalang4mdPackage.EINTERACTION__TARGET_CARDINALITY, oldTargetCardinality, targetCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Metalang4mdPackage.EINTERACTION__INTERACTION_BEHAVIOR:
				return getInteractionBehavior();
			case Metalang4mdPackage.EINTERACTION__KIND_INTERACTION:
				return getKindInteraction();
			case Metalang4mdPackage.EINTERACTION__EINTERACTION_TYPE:
				if (resolve) return getEInteractionType();
				return basicGetEInteractionType();
			case Metalang4mdPackage.EINTERACTION__TARGET_CARDINALITY:
				return getTargetCardinality();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Metalang4mdPackage.EINTERACTION__INTERACTION_BEHAVIOR:
				setInteractionBehavior((EInteractionBehavior)newValue);
				return;
			case Metalang4mdPackage.EINTERACTION__KIND_INTERACTION:
				setKindInteraction((EKindInteraction)newValue);
				return;
			case Metalang4mdPackage.EINTERACTION__EINTERACTION_TYPE:
				setEInteractionType((EDomainSpecificElement)newValue);
				return;
			case Metalang4mdPackage.EINTERACTION__TARGET_CARDINALITY:
				setTargetCardinality((ECardinality)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Metalang4mdPackage.EINTERACTION__INTERACTION_BEHAVIOR:
				setInteractionBehavior(INTERACTION_BEHAVIOR_EDEFAULT);
				return;
			case Metalang4mdPackage.EINTERACTION__KIND_INTERACTION:
				setKindInteraction(KIND_INTERACTION_EDEFAULT);
				return;
			case Metalang4mdPackage.EINTERACTION__EINTERACTION_TYPE:
				setEInteractionType((EDomainSpecificElement)null);
				return;
			case Metalang4mdPackage.EINTERACTION__TARGET_CARDINALITY:
				setTargetCardinality(TARGET_CARDINALITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Metalang4mdPackage.EINTERACTION__INTERACTION_BEHAVIOR:
				return interactionBehavior != INTERACTION_BEHAVIOR_EDEFAULT;
			case Metalang4mdPackage.EINTERACTION__KIND_INTERACTION:
				return kindInteraction != KIND_INTERACTION_EDEFAULT;
			case Metalang4mdPackage.EINTERACTION__EINTERACTION_TYPE:
				return eInteractionType != null;
			case Metalang4mdPackage.EINTERACTION__TARGET_CARDINALITY:
				return targetCardinality != TARGET_CARDINALITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (interactionBehavior: ");
		result.append(interactionBehavior);
		result.append(", kindInteraction: ");
		result.append(kindInteraction);
		result.append(", targetCardinality: ");
		result.append(targetCardinality);
		result.append(')');
		return result.toString();
	}

} //EInteractionImpl
