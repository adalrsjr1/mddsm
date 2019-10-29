/**
 */
package base.impl;

import base.BasePackage;
import base.ScriptManager;

import base.script.ScriptInterpreter;
import base.script.ScriptProcessor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link base.impl.ScriptManagerImpl#getInterpreter <em>Interpreter</em>}</li>
 *   <li>{@link base.impl.ScriptManagerImpl#getProcessor <em>Processor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptManagerImpl extends MinimalEObjectImpl.Container implements ScriptManager {
	/**
	 * The cached value of the '{@link #getInterpreter() <em>Interpreter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpreter()
	 * @generated
	 * @ordered
	 */
	protected ScriptInterpreter interpreter;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected ScriptProcessor processor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.SCRIPT_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptInterpreter getInterpreter() {
		return interpreter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterpreter(ScriptInterpreter newInterpreter, NotificationChain msgs) {
		ScriptInterpreter oldInterpreter = interpreter;
		interpreter = newInterpreter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.SCRIPT_MANAGER__INTERPRETER, oldInterpreter, newInterpreter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpreter(ScriptInterpreter newInterpreter) {
		if (newInterpreter != interpreter) {
			NotificationChain msgs = null;
			if (interpreter != null)
				msgs = ((InternalEObject)interpreter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.SCRIPT_MANAGER__INTERPRETER, null, msgs);
			if (newInterpreter != null)
				msgs = ((InternalEObject)newInterpreter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.SCRIPT_MANAGER__INTERPRETER, null, msgs);
			msgs = basicSetInterpreter(newInterpreter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.SCRIPT_MANAGER__INTERPRETER, newInterpreter, newInterpreter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptProcessor getProcessor() {
		if (processor != null && processor.eIsProxy()) {
			InternalEObject oldProcessor = (InternalEObject)processor;
			processor = (ScriptProcessor)eResolveProxy(oldProcessor);
			if (processor != oldProcessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.SCRIPT_MANAGER__PROCESSOR, oldProcessor, processor));
			}
		}
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptProcessor basicGetProcessor() {
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessor(ScriptProcessor newProcessor) {
		ScriptProcessor oldProcessor = processor;
		processor = newProcessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.SCRIPT_MANAGER__PROCESSOR, oldProcessor, processor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasePackage.SCRIPT_MANAGER__INTERPRETER:
				return basicSetInterpreter(null, msgs);
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
			case BasePackage.SCRIPT_MANAGER__INTERPRETER:
				return getInterpreter();
			case BasePackage.SCRIPT_MANAGER__PROCESSOR:
				if (resolve) return getProcessor();
				return basicGetProcessor();
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
			case BasePackage.SCRIPT_MANAGER__INTERPRETER:
				setInterpreter((ScriptInterpreter)newValue);
				return;
			case BasePackage.SCRIPT_MANAGER__PROCESSOR:
				setProcessor((ScriptProcessor)newValue);
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
			case BasePackage.SCRIPT_MANAGER__INTERPRETER:
				setInterpreter((ScriptInterpreter)null);
				return;
			case BasePackage.SCRIPT_MANAGER__PROCESSOR:
				setProcessor((ScriptProcessor)null);
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
			case BasePackage.SCRIPT_MANAGER__INTERPRETER:
				return interpreter != null;
			case BasePackage.SCRIPT_MANAGER__PROCESSOR:
				return processor != null;
		}
		return super.eIsSet(featureID);
	}

} //ScriptManagerImpl
