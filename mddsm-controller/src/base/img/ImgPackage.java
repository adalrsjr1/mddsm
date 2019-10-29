/**
 */
package base.img;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see base.img.ImgFactory
 * @model kind="package"
 * @generated
 */
public interface ImgPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "img";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.ufg.br/mestrado/controller/base/img";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "controller.base.img";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImgPackage eINSTANCE = base.img.impl.ImgPackageImpl.init();

	/**
	 * The meta object id for the '{@link base.img.impl.IMGeneratorImpl <em>IM Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.img.impl.IMGeneratorImpl
	 * @see base.img.impl.ImgPackageImpl#getIMGenerator()
	 * @generated
	 */
	int IM_GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IM_GENERATOR__REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Build</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IM_GENERATOR__BUILD = 1;

	/**
	 * The number of structural features of the '<em>IM Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IM_GENERATOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IM Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IM_GENERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link base.img.impl.BuildIMImpl <em>Build IM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.img.impl.BuildIMImpl
	 * @see base.img.impl.ImgPackageImpl#getBuildIM()
	 * @generated
	 */
	int BUILD_IM = 1;

	/**
	 * The number of structural features of the '<em>Build IM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_IM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Build IM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_IM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link base.img.impl.IMExecutorImpl <em>IM Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.img.impl.IMExecutorImpl
	 * @see base.img.impl.ImgPackageImpl#getIMExecutor()
	 * @generated
	 */
	int IM_EXECUTOR = 2;

	/**
	 * The number of structural features of the '<em>IM Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IM_EXECUTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IM Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IM_EXECUTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link base.img.impl.RepositoryManagerImpl <em>Repository Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.img.impl.RepositoryManagerImpl
	 * @see base.img.impl.ImgPackageImpl#getRepositoryManager()
	 * @generated
	 */
	int REPOSITORY_MANAGER = 3;

	/**
	 * The number of structural features of the '<em>Repository Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Repository Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_MANAGER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link base.img.IMGenerator <em>IM Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IM Generator</em>'.
	 * @see base.img.IMGenerator
	 * @generated
	 */
	EClass getIMGenerator();

	/**
	 * Returns the meta object for the reference '{@link base.img.IMGenerator#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repository</em>'.
	 * @see base.img.IMGenerator#getRepository()
	 * @see #getIMGenerator()
	 * @generated
	 */
	EReference getIMGenerator_Repository();

	/**
	 * Returns the meta object for the reference '{@link base.img.IMGenerator#getBuild <em>Build</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Build</em>'.
	 * @see base.img.IMGenerator#getBuild()
	 * @see #getIMGenerator()
	 * @generated
	 */
	EReference getIMGenerator_Build();

	/**
	 * Returns the meta object for class '{@link base.img.BuildIM <em>Build IM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build IM</em>'.
	 * @see base.img.BuildIM
	 * @generated
	 */
	EClass getBuildIM();

	/**
	 * Returns the meta object for class '{@link base.img.IMExecutor <em>IM Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IM Executor</em>'.
	 * @see base.img.IMExecutor
	 * @generated
	 */
	EClass getIMExecutor();

	/**
	 * Returns the meta object for class '{@link base.img.RepositoryManager <em>Repository Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Manager</em>'.
	 * @see base.img.RepositoryManager
	 * @generated
	 */
	EClass getRepositoryManager();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImgFactory getImgFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link base.img.impl.IMGeneratorImpl <em>IM Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.img.impl.IMGeneratorImpl
		 * @see base.img.impl.ImgPackageImpl#getIMGenerator()
		 * @generated
		 */
		EClass IM_GENERATOR = eINSTANCE.getIMGenerator();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IM_GENERATOR__REPOSITORY = eINSTANCE.getIMGenerator_Repository();

		/**
		 * The meta object literal for the '<em><b>Build</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IM_GENERATOR__BUILD = eINSTANCE.getIMGenerator_Build();

		/**
		 * The meta object literal for the '{@link base.img.impl.BuildIMImpl <em>Build IM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.img.impl.BuildIMImpl
		 * @see base.img.impl.ImgPackageImpl#getBuildIM()
		 * @generated
		 */
		EClass BUILD_IM = eINSTANCE.getBuildIM();

		/**
		 * The meta object literal for the '{@link base.img.impl.IMExecutorImpl <em>IM Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.img.impl.IMExecutorImpl
		 * @see base.img.impl.ImgPackageImpl#getIMExecutor()
		 * @generated
		 */
		EClass IM_EXECUTOR = eINSTANCE.getIMExecutor();

		/**
		 * The meta object literal for the '{@link base.img.impl.RepositoryManagerImpl <em>Repository Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.img.impl.RepositoryManagerImpl
		 * @see base.img.impl.ImgPackageImpl#getRepositoryManager()
		 * @generated
		 */
		EClass REPOSITORY_MANAGER = eINSTANCE.getRepositoryManager();

	}

} //ImgPackage
