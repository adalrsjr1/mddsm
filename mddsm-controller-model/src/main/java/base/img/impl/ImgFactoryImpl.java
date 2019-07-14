/**
 */
package base.img.impl;

import base.img.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImgFactoryImpl extends EFactoryImpl implements ImgFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImgFactory init() {
		try {
			ImgFactory theImgFactory = (ImgFactory)EPackage.Registry.INSTANCE.getEFactory(ImgPackage.eNS_URI);
			if (theImgFactory != null) {
				return theImgFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ImgFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImgFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ImgPackage.IM_GENERATOR: return createIMGenerator();
			case ImgPackage.BUILD_IM: return createBuildIM();
			case ImgPackage.IM_EXECUTOR: return createIMExecutor();
			case ImgPackage.REPOSITORY_MANAGER: return createRepositoryManager();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMGenerator createIMGenerator() {
		IMGeneratorImpl imGenerator = new IMGeneratorImpl();
		return imGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildIM createBuildIM() {
		BuildIMImpl buildIM = new BuildIMImpl();
		return buildIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMExecutor createIMExecutor() {
		IMExecutorImpl imExecutor = new IMExecutorImpl();
		return imExecutor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryManager createRepositoryManager() {
		RepositoryManagerImpl repositoryManager = new RepositoryManagerImpl();
		return repositoryManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImgPackage getImgPackage() {
		return (ImgPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ImgPackage getPackage() {
		return ImgPackage.eINSTANCE;
	}

} //ImgFactoryImpl
