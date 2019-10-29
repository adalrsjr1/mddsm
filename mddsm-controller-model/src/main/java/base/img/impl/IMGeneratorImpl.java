/**
 */
package base.img.impl;

import base.img.BuildIM;
import base.img.IMGenerator;
import base.img.ImgPackage;
import base.img.RepositoryManager;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IM Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link base.img.impl.IMGeneratorImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link base.img.impl.IMGeneratorImpl#getBuild <em>Build</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IMGeneratorImpl extends MinimalEObjectImpl.Container implements IMGenerator {
	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected RepositoryManager repository;

	/**
	 * The cached value of the '{@link #getBuild() <em>Build</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuild()
	 * @generated
	 * @ordered
	 */
	protected BuildIM build;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IMGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImgPackage.Literals.IM_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryManager getRepository() {
		if (repository != null && repository.eIsProxy()) {
			InternalEObject oldRepository = (InternalEObject)repository;
			repository = (RepositoryManager)eResolveProxy(oldRepository);
			if (repository != oldRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImgPackage.IM_GENERATOR__REPOSITORY, oldRepository, repository));
			}
		}
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryManager basicGetRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(RepositoryManager newRepository) {
		RepositoryManager oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImgPackage.IM_GENERATOR__REPOSITORY, oldRepository, repository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildIM getBuild() {
		if (build != null && build.eIsProxy()) {
			InternalEObject oldBuild = (InternalEObject)build;
			build = (BuildIM)eResolveProxy(oldBuild);
			if (build != oldBuild) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImgPackage.IM_GENERATOR__BUILD, oldBuild, build));
			}
		}
		return build;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildIM basicGetBuild() {
		return build;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuild(BuildIM newBuild) {
		BuildIM oldBuild = build;
		build = newBuild;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImgPackage.IM_GENERATOR__BUILD, oldBuild, build));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImgPackage.IM_GENERATOR__REPOSITORY:
				if (resolve) return getRepository();
				return basicGetRepository();
			case ImgPackage.IM_GENERATOR__BUILD:
				if (resolve) return getBuild();
				return basicGetBuild();
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
			case ImgPackage.IM_GENERATOR__REPOSITORY:
				setRepository((RepositoryManager)newValue);
				return;
			case ImgPackage.IM_GENERATOR__BUILD:
				setBuild((BuildIM)newValue);
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
			case ImgPackage.IM_GENERATOR__REPOSITORY:
				setRepository((RepositoryManager)null);
				return;
			case ImgPackage.IM_GENERATOR__BUILD:
				setBuild((BuildIM)null);
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
			case ImgPackage.IM_GENERATOR__REPOSITORY:
				return repository != null;
			case ImgPackage.IM_GENERATOR__BUILD:
				return build != null;
		}
		return super.eIsSet(featureID);
	}

} //IMGeneratorImpl
