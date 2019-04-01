/**
 */
package metalang4md.impl;

import java.util.Collection;

import metalang4md.EComposableProperty;
import metalang4md.EDomainSpecificProperty;
import metalang4md.Metalang4mdPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EComposable Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metalang4md.impl.EComposablePropertyImpl#getESubProperty <em>ESub Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EComposablePropertyImpl extends EDomainSpecificPropertyImpl implements EComposableProperty {
	/**
	 * The cached value of the '{@link #getESubProperty() <em>ESub Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESubProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<EDomainSpecificProperty> eSubProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EComposablePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Metalang4mdPackage.Literals.ECOMPOSABLE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EDomainSpecificProperty> getESubProperty() {
		if (eSubProperty == null) {
			eSubProperty = new EObjectContainmentEList<EDomainSpecificProperty>(EDomainSpecificProperty.class, this, Metalang4mdPackage.ECOMPOSABLE_PROPERTY__ESUB_PROPERTY);
		}
		return eSubProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Metalang4mdPackage.ECOMPOSABLE_PROPERTY__ESUB_PROPERTY:
				return ((InternalEList<?>)getESubProperty()).basicRemove(otherEnd, msgs);
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
			case Metalang4mdPackage.ECOMPOSABLE_PROPERTY__ESUB_PROPERTY:
				return getESubProperty();
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
			case Metalang4mdPackage.ECOMPOSABLE_PROPERTY__ESUB_PROPERTY:
				getESubProperty().clear();
				getESubProperty().addAll((Collection<? extends EDomainSpecificProperty>)newValue);
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
			case Metalang4mdPackage.ECOMPOSABLE_PROPERTY__ESUB_PROPERTY:
				getESubProperty().clear();
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
			case Metalang4mdPackage.ECOMPOSABLE_PROPERTY__ESUB_PROPERTY:
				return eSubProperty != null && !eSubProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EComposablePropertyImpl
