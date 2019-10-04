/**
 */
package base.impl;

import base.BasePackage;
import base.Handler;
import base.Manager;
import base.PolicyManager;
import base.ScriptManager;
import base.StateManager;

import base.common.Action;
import base.common.Interface;

import base.metadata.Feature;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link base.impl.ManagerImpl#getName <em>Name</em>}</li>
 *   <li>{@link base.impl.ManagerImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link base.impl.ManagerImpl#getIface <em>Iface</em>}</li>
 *   <li>{@link base.impl.ManagerImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link base.impl.ManagerImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link base.impl.ManagerImpl#getStateManager <em>State Manager</em>}</li>
 *   <li>{@link base.impl.ManagerImpl#getPolicyManager <em>Policy Manager</em>}</li>
 *   <li>{@link base.impl.ManagerImpl#getScriptManager <em>Script Manager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManagerImpl extends MinimalEObjectImpl.Container implements Manager {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The cached value of the '{@link #getIface() <em>Iface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIface()
	 * @generated
	 * @ordered
	 */
	protected Interface iface;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getHandlers() <em>Handlers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList<Handler> handlers;

	/**
	 * The cached value of the '{@link #getStateManager() <em>State Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateManager()
	 * @generated
	 * @ordered
	 */
	protected StateManager stateManager;

	/**
	 * The cached value of the '{@link #getPolicyManager() <em>Policy Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyManager()
	 * @generated
	 * @ordered
	 */
	protected PolicyManager policyManager;

	/**
	 * The cached value of the '{@link #getScriptManager() <em>Script Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptManager()
	 * @generated
	 * @ordered
	 */
	protected ScriptManager scriptManager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MANAGER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this, BasePackage.MANAGER__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getIface() {
		return iface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIface(Interface newIface, NotificationChain msgs) {
		Interface oldIface = iface;
		iface = newIface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.MANAGER__IFACE, oldIface, newIface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIface(Interface newIface) {
		if (newIface != iface) {
			NotificationChain msgs = null;
			if (iface != null)
				msgs = ((InternalEObject)iface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.MANAGER__IFACE, null, msgs);
			if (newIface != null)
				msgs = ((InternalEObject)newIface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.MANAGER__IFACE, null, msgs);
			msgs = basicSetIface(newIface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MANAGER__IFACE, newIface, newIface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, BasePackage.MANAGER__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Handler> getHandlers() {
		if (handlers == null) {
			handlers = new EObjectContainmentEList<Handler>(Handler.class, this, BasePackage.MANAGER__HANDLERS);
		}
		return handlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateManager getStateManager() {
		return stateManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateManager(StateManager newStateManager, NotificationChain msgs) {
		StateManager oldStateManager = stateManager;
		stateManager = newStateManager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.MANAGER__STATE_MANAGER, oldStateManager, newStateManager);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateManager(StateManager newStateManager) {
		if (newStateManager != stateManager) {
			NotificationChain msgs = null;
			if (stateManager != null)
				msgs = ((InternalEObject)stateManager).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.MANAGER__STATE_MANAGER, null, msgs);
			if (newStateManager != null)
				msgs = ((InternalEObject)newStateManager).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.MANAGER__STATE_MANAGER, null, msgs);
			msgs = basicSetStateManager(newStateManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MANAGER__STATE_MANAGER, newStateManager, newStateManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyManager getPolicyManager() {
		return policyManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicyManager(PolicyManager newPolicyManager, NotificationChain msgs) {
		PolicyManager oldPolicyManager = policyManager;
		policyManager = newPolicyManager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.MANAGER__POLICY_MANAGER, oldPolicyManager, newPolicyManager);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyManager(PolicyManager newPolicyManager) {
		if (newPolicyManager != policyManager) {
			NotificationChain msgs = null;
			if (policyManager != null)
				msgs = ((InternalEObject)policyManager).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.MANAGER__POLICY_MANAGER, null, msgs);
			if (newPolicyManager != null)
				msgs = ((InternalEObject)newPolicyManager).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.MANAGER__POLICY_MANAGER, null, msgs);
			msgs = basicSetPolicyManager(newPolicyManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MANAGER__POLICY_MANAGER, newPolicyManager, newPolicyManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptManager getScriptManager() {
		return scriptManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScriptManager(ScriptManager newScriptManager, NotificationChain msgs) {
		ScriptManager oldScriptManager = scriptManager;
		scriptManager = newScriptManager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.MANAGER__SCRIPT_MANAGER, oldScriptManager, newScriptManager);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptManager(ScriptManager newScriptManager) {
		if (newScriptManager != scriptManager) {
			NotificationChain msgs = null;
			if (scriptManager != null)
				msgs = ((InternalEObject)scriptManager).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.MANAGER__SCRIPT_MANAGER, null, msgs);
			if (newScriptManager != null)
				msgs = ((InternalEObject)newScriptManager).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.MANAGER__SCRIPT_MANAGER, null, msgs);
			msgs = basicSetScriptManager(newScriptManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MANAGER__SCRIPT_MANAGER, newScriptManager, newScriptManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasePackage.MANAGER__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case BasePackage.MANAGER__IFACE:
				return basicSetIface(null, msgs);
			case BasePackage.MANAGER__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case BasePackage.MANAGER__HANDLERS:
				return ((InternalEList<?>)getHandlers()).basicRemove(otherEnd, msgs);
			case BasePackage.MANAGER__STATE_MANAGER:
				return basicSetStateManager(null, msgs);
			case BasePackage.MANAGER__POLICY_MANAGER:
				return basicSetPolicyManager(null, msgs);
			case BasePackage.MANAGER__SCRIPT_MANAGER:
				return basicSetScriptManager(null, msgs);
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
			case BasePackage.MANAGER__NAME:
				return getName();
			case BasePackage.MANAGER__FEATURES:
				return getFeatures();
			case BasePackage.MANAGER__IFACE:
				return getIface();
			case BasePackage.MANAGER__ACTIONS:
				return getActions();
			case BasePackage.MANAGER__HANDLERS:
				return getHandlers();
			case BasePackage.MANAGER__STATE_MANAGER:
				return getStateManager();
			case BasePackage.MANAGER__POLICY_MANAGER:
				return getPolicyManager();
			case BasePackage.MANAGER__SCRIPT_MANAGER:
				return getScriptManager();
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
			case BasePackage.MANAGER__NAME:
				setName((String)newValue);
				return;
			case BasePackage.MANAGER__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case BasePackage.MANAGER__IFACE:
				setIface((Interface)newValue);
				return;
			case BasePackage.MANAGER__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case BasePackage.MANAGER__HANDLERS:
				getHandlers().clear();
				getHandlers().addAll((Collection<? extends Handler>)newValue);
				return;
			case BasePackage.MANAGER__STATE_MANAGER:
				setStateManager((StateManager)newValue);
				return;
			case BasePackage.MANAGER__POLICY_MANAGER:
				setPolicyManager((PolicyManager)newValue);
				return;
			case BasePackage.MANAGER__SCRIPT_MANAGER:
				setScriptManager((ScriptManager)newValue);
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
			case BasePackage.MANAGER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BasePackage.MANAGER__FEATURES:
				getFeatures().clear();
				return;
			case BasePackage.MANAGER__IFACE:
				setIface((Interface)null);
				return;
			case BasePackage.MANAGER__ACTIONS:
				getActions().clear();
				return;
			case BasePackage.MANAGER__HANDLERS:
				getHandlers().clear();
				return;
			case BasePackage.MANAGER__STATE_MANAGER:
				setStateManager((StateManager)null);
				return;
			case BasePackage.MANAGER__POLICY_MANAGER:
				setPolicyManager((PolicyManager)null);
				return;
			case BasePackage.MANAGER__SCRIPT_MANAGER:
				setScriptManager((ScriptManager)null);
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
			case BasePackage.MANAGER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BasePackage.MANAGER__FEATURES:
				return features != null && !features.isEmpty();
			case BasePackage.MANAGER__IFACE:
				return iface != null;
			case BasePackage.MANAGER__ACTIONS:
				return actions != null && !actions.isEmpty();
			case BasePackage.MANAGER__HANDLERS:
				return handlers != null && !handlers.isEmpty();
			case BasePackage.MANAGER__STATE_MANAGER:
				return stateManager != null;
			case BasePackage.MANAGER__POLICY_MANAGER:
				return policyManager != null;
			case BasePackage.MANAGER__SCRIPT_MANAGER:
				return scriptManager != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ManagerImpl
