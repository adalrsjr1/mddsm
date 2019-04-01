/**
 */
package metalang4md.impl;

import java.util.Collection;

import metalang4md.EDomainSpecificElement;
import metalang4md.EDomainSpecificProperty;
import metalang4md.EInteraction;
import metalang4md.Metalang4mdPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EClassImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDomain Specific Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metalang4md.impl.EDomainSpecificElementImpl#getEDomainSpecificProperty <em>EDomain Specific Property</em>}</li>
 *   <li>{@link metalang4md.impl.EDomainSpecificElementImpl#getEInteractions <em>EInteractions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EDomainSpecificElementImpl extends EClassImpl implements EDomainSpecificElement {
	/**
	 * The cached value of the '{@link #getEDomainSpecificProperty() <em>EDomain Specific Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDomainSpecificProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<EDomainSpecificProperty> eDomainSpecificProperty;

	/**
	 * The cached value of the '{@link #getEInteractions() <em>EInteractions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<EInteraction> eInteractions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDomainSpecificElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Metalang4mdPackage.Literals.EDOMAIN_SPECIFIC_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EDomainSpecificProperty> getEDomainSpecificProperty() {
		if (eDomainSpecificProperty == null) {
			eDomainSpecificProperty = new EObjectContainmentEList<EDomainSpecificProperty>(EDomainSpecificProperty.class, this, Metalang4mdPackage.EDOMAIN_SPECIFIC_ELEMENT__EDOMAIN_SPECIFIC_PROPERTY);
		}
		return eDomainSpecificProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EInteraction> getEInteractions() {
		if (eInteractions == null) {
			eInteractions = new EObjectContainmentEList<EInteraction>(EInteraction.class, this, Metalang4mdPackage.EDOMAIN_SPECIFIC_ELEMENT__EINTERACTIONS);
		}
		return eInteractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_ELEMENT__EDOMAIN_SPECIFIC_PROPERTY:
				return ((InternalEList<?>)getEDomainSpecificProperty()).basicRemove(otherEnd, msgs);
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_ELEMENT__EINTERACTIONS:
				return ((InternalEList<?>)getEInteractions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_ELEMENT__EDOMAIN_SPECIFIC_PROPERTY:
				return getEDomainSpecificProperty();
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_ELEMENT__EINTERACTIONS:
				return getEInteractions();
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
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_ELEMENT__EDOMAIN_SPECIFIC_PROPERTY:
				getEDomainSpecificProperty().clear();
				getEDomainSpecificProperty().addAll((Collection<? extends EDomainSpecificProperty>)newValue);
				return;
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_ELEMENT__EINTERACTIONS:
				getEInteractions().clear();
				getEInteractions().addAll((Collection<? extends EInteraction>)newValue);
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
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_ELEMENT__EDOMAIN_SPECIFIC_PROPERTY:
				getEDomainSpecificProperty().clear();
				return;
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_ELEMENT__EINTERACTIONS:
				getEInteractions().clear();
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
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_ELEMENT__EDOMAIN_SPECIFIC_PROPERTY:
				return eDomainSpecificProperty != null && !eDomainSpecificProperty.isEmpty();
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_ELEMENT__EINTERACTIONS:
				return eInteractions != null && !eInteractions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EDomainSpecificElementImpl
