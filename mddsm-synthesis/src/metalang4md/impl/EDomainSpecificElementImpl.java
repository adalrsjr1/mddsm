/**
 */
package metalang4md.impl;

import metalang4md.EDomainSpecificElement;
import metalang4md.Metalang4mdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDomain Specific Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metalang4md.impl.EDomainSpecificElementImpl#getCommandPriority <em>Command Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDomainSpecificElementImpl extends MinimalEObjectImpl.Container implements EDomainSpecificElement {
	/**
	 * The default value of the '{@link #getCommandPriority() <em>Command Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int COMMAND_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCommandPriority() <em>Command Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandPriority()
	 * @generated
	 * @ordered
	 */
	protected int commandPriority = COMMAND_PRIORITY_EDEFAULT;

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
	public int getCommandPriority() {
		return commandPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandPriority(int newCommandPriority) {
		int oldCommandPriority = commandPriority;
		commandPriority = newCommandPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metalang4mdPackage.EDOMAIN_SPECIFIC_ELEMENT__COMMAND_PRIORITY, oldCommandPriority, commandPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_ELEMENT__COMMAND_PRIORITY:
				return getCommandPriority();
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
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_ELEMENT__COMMAND_PRIORITY:
				setCommandPriority((Integer)newValue);
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
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_ELEMENT__COMMAND_PRIORITY:
				setCommandPriority(COMMAND_PRIORITY_EDEFAULT);
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
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_ELEMENT__COMMAND_PRIORITY:
				return commandPriority != COMMAND_PRIORITY_EDEFAULT;
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
		result.append(" (commandPriority: ");
		result.append(commandPriority);
		result.append(')');
		return result.toString();
	}

} //EDomainSpecificElementImpl
