/**
 */
package base.script.impl;

import base.img.IMExecutor;
import base.img.IMGenerator;

import base.script.ScriptPackage;
import base.script.ScriptProcessor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link base.script.impl.ScriptProcessorImpl#getImg <em>Img</em>}</li>
 *   <li>{@link base.script.impl.ScriptProcessorImpl#getIme <em>Ime</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptProcessorImpl extends MinimalEObjectImpl.Container implements ScriptProcessor {
	/**
	 * The cached value of the '{@link #getImg() <em>Img</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImg()
	 * @generated
	 * @ordered
	 */
	protected IMGenerator img;

	/**
	 * The cached value of the '{@link #getIme() <em>Ime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIme()
	 * @generated
	 * @ordered
	 */
	protected IMExecutor ime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScriptPackage.Literals.SCRIPT_PROCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMGenerator getImg() {
		return img;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImg(IMGenerator newImg, NotificationChain msgs) {
		IMGenerator oldImg = img;
		img = newImg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScriptPackage.SCRIPT_PROCESSOR__IMG, oldImg, newImg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImg(IMGenerator newImg) {
		if (newImg != img) {
			NotificationChain msgs = null;
			if (img != null)
				msgs = ((InternalEObject)img).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScriptPackage.SCRIPT_PROCESSOR__IMG, null, msgs);
			if (newImg != null)
				msgs = ((InternalEObject)newImg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScriptPackage.SCRIPT_PROCESSOR__IMG, null, msgs);
			msgs = basicSetImg(newImg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.SCRIPT_PROCESSOR__IMG, newImg, newImg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMExecutor getIme() {
		return ime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIme(IMExecutor newIme, NotificationChain msgs) {
		IMExecutor oldIme = ime;
		ime = newIme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScriptPackage.SCRIPT_PROCESSOR__IME, oldIme, newIme);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIme(IMExecutor newIme) {
		if (newIme != ime) {
			NotificationChain msgs = null;
			if (ime != null)
				msgs = ((InternalEObject)ime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScriptPackage.SCRIPT_PROCESSOR__IME, null, msgs);
			if (newIme != null)
				msgs = ((InternalEObject)newIme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScriptPackage.SCRIPT_PROCESSOR__IME, null, msgs);
			msgs = basicSetIme(newIme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.SCRIPT_PROCESSOR__IME, newIme, newIme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScriptPackage.SCRIPT_PROCESSOR__IMG:
				return basicSetImg(null, msgs);
			case ScriptPackage.SCRIPT_PROCESSOR__IME:
				return basicSetIme(null, msgs);
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
			case ScriptPackage.SCRIPT_PROCESSOR__IMG:
				return getImg();
			case ScriptPackage.SCRIPT_PROCESSOR__IME:
				return getIme();
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
			case ScriptPackage.SCRIPT_PROCESSOR__IMG:
				setImg((IMGenerator)newValue);
				return;
			case ScriptPackage.SCRIPT_PROCESSOR__IME:
				setIme((IMExecutor)newValue);
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
			case ScriptPackage.SCRIPT_PROCESSOR__IMG:
				setImg((IMGenerator)null);
				return;
			case ScriptPackage.SCRIPT_PROCESSOR__IME:
				setIme((IMExecutor)null);
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
			case ScriptPackage.SCRIPT_PROCESSOR__IMG:
				return img != null;
			case ScriptPackage.SCRIPT_PROCESSOR__IME:
				return ime != null;
		}
		return super.eIsSet(featureID);
	}

} //ScriptProcessorImpl
