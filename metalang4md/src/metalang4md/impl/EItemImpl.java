/**
 */
package metalang4md.impl;

import metalang4md.EArising;
import metalang4md.EItem;
import metalang4md.Metalang4mdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EItem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metalang4md.impl.EItemImpl#getArisingBehavior <em>Arising Behavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EItemImpl extends EDomainSpecificElementImpl implements EItem {
	/**
	 * The default value of the '{@link #getArisingBehavior() <em>Arising Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArisingBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final EArising ARISING_BEHAVIOR_EDEFAULT = EArising.STATIC;

	/**
	 * The cached value of the '{@link #getArisingBehavior() <em>Arising Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArisingBehavior()
	 * @generated
	 * @ordered
	 */
	protected EArising arisingBehavior = ARISING_BEHAVIOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Metalang4mdPackage.Literals.EITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EArising getArisingBehavior() {
		return arisingBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArisingBehavior(EArising newArisingBehavior) {
		EArising oldArisingBehavior = arisingBehavior;
		arisingBehavior = newArisingBehavior == null ? ARISING_BEHAVIOR_EDEFAULT : newArisingBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metalang4mdPackage.EITEM__ARISING_BEHAVIOR, oldArisingBehavior, arisingBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Metalang4mdPackage.EITEM__ARISING_BEHAVIOR:
				return getArisingBehavior();
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
			case Metalang4mdPackage.EITEM__ARISING_BEHAVIOR:
				setArisingBehavior((EArising)newValue);
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
			case Metalang4mdPackage.EITEM__ARISING_BEHAVIOR:
				setArisingBehavior(ARISING_BEHAVIOR_EDEFAULT);
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
			case Metalang4mdPackage.EITEM__ARISING_BEHAVIOR:
				return arisingBehavior != ARISING_BEHAVIOR_EDEFAULT;
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
		result.append(" (arisingBehavior: ");
		result.append(arisingBehavior);
		result.append(')');
		return result.toString();
	}

} //EItemImpl
