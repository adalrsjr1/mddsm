/**
 */
package metalang4md.impl;

import java.util.Collection;

import metalang4md.ECardinality;
import metalang4md.ECoordinationBehavior;
import metalang4md.EDomainSpecificType;
import metalang4md.EInteractionBehavior;
import metalang4md.Metalang4mdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDomain Specific Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metalang4md.impl.EDomainSpecificTypeImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link metalang4md.impl.EDomainSpecificTypeImpl#getInteractionBehavior <em>Interaction Behavior</em>}</li>
 *   <li>{@link metalang4md.impl.EDomainSpecificTypeImpl#getKindInteraction <em>Kind Interaction</em>}</li>
 *   <li>{@link metalang4md.impl.EDomainSpecificTypeImpl#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDomainSpecificTypeImpl extends EDomainSpecificElementImpl implements EDomainSpecificType {
	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final ECardinality CARDINALITY_EDEFAULT = ECardinality.ONE;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected ECardinality cardinality = CARDINALITY_EDEFAULT;

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
	protected static final ECoordinationBehavior KIND_INTERACTION_EDEFAULT = ECoordinationBehavior.LOCAL;

	/**
	 * The cached value of the '{@link #getKindInteraction() <em>Kind Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindInteraction()
	 * @generated
	 * @ordered
	 */
	protected ECoordinationBehavior kindInteraction = KIND_INTERACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<EDomainSpecificType> binding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDomainSpecificTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Metalang4mdPackage.Literals.EDOMAIN_SPECIFIC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(ECardinality newCardinality) {
		ECardinality oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__CARDINALITY, oldCardinality, cardinality));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__INTERACTION_BEHAVIOR, oldInteractionBehavior, interactionBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECoordinationBehavior getKindInteraction() {
		return kindInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKindInteraction(ECoordinationBehavior newKindInteraction) {
		ECoordinationBehavior oldKindInteraction = kindInteraction;
		kindInteraction = newKindInteraction == null ? KIND_INTERACTION_EDEFAULT : newKindInteraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__KIND_INTERACTION, oldKindInteraction, kindInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EDomainSpecificType> getBinding() {
		if (binding == null) {
			binding = new EObjectResolvingEList<EDomainSpecificType>(EDomainSpecificType.class, this, Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__BINDING);
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__CARDINALITY:
				return getCardinality();
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__INTERACTION_BEHAVIOR:
				return getInteractionBehavior();
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__KIND_INTERACTION:
				return getKindInteraction();
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__BINDING:
				return getBinding();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__CARDINALITY:
				setCardinality((ECardinality)newValue);
				return;
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__INTERACTION_BEHAVIOR:
				setInteractionBehavior((EInteractionBehavior)newValue);
				return;
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__KIND_INTERACTION:
				setKindInteraction((ECoordinationBehavior)newValue);
				return;
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__BINDING:
				getBinding().clear();
				getBinding().addAll((Collection<? extends EDomainSpecificType>)newValue);
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
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__INTERACTION_BEHAVIOR:
				setInteractionBehavior(INTERACTION_BEHAVIOR_EDEFAULT);
				return;
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__KIND_INTERACTION:
				setKindInteraction(KIND_INTERACTION_EDEFAULT);
				return;
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__BINDING:
				getBinding().clear();
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
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__INTERACTION_BEHAVIOR:
				return interactionBehavior != INTERACTION_BEHAVIOR_EDEFAULT;
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__KIND_INTERACTION:
				return kindInteraction != KIND_INTERACTION_EDEFAULT;
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__BINDING:
				return binding != null && !binding.isEmpty();
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
		result.append(" (cardinality: ");
		result.append(cardinality);
		result.append(", interactionBehavior: ");
		result.append(interactionBehavior);
		result.append(", kindInteraction: ");
		result.append(kindInteraction);
		result.append(')');
		return result.toString();
	}

} //EDomainSpecificTypeImpl
