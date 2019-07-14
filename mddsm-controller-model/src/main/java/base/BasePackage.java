/**
 */
package base;

import base.metadata.MetadataPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see base.BaseFactory
 * @model kind="package"
 * @generated
 */
public interface BasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "base";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.ufg.br/controller/base";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "controller.base";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasePackage eINSTANCE = base.impl.BasePackageImpl.init();

	/**
	 * The meta object id for the '{@link base.impl.ManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.ManagerImpl
	 * @see base.impl.BasePackageImpl#getManager()
	 * @generated
	 */
	int MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__NAME = MetadataPackage.ANNOTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__FEATURES = MetadataPackage.ANNOTABLE__FEATURES;

	/**
	 * The feature id for the '<em><b>Iface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__IFACE = MetadataPackage.ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__ACTIONS = MetadataPackage.ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__HANDLERS = MetadataPackage.ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__STATE_MANAGER = MetadataPackage.ANNOTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Policy Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__POLICY_MANAGER = MetadataPackage.ANNOTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Script Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__SCRIPT_MANAGER = MetadataPackage.ANNOTABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_FEATURE_COUNT = MetadataPackage.ANNOTABLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_OPERATION_COUNT = MetadataPackage.ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link base.impl.StateManagerImpl <em>State Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.StateManagerImpl
	 * @see base.impl.BasePackageImpl#getStateManager()
	 * @generated
	 */
	int STATE_MANAGER = 1;

	/**
	 * The feature id for the '<em><b>State Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MANAGER__STATE_TYPES = 0;

	/**
	 * The number of structural features of the '<em>State Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MANAGER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>State Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link base.impl.PolicyManagerImpl <em>Policy Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.PolicyManagerImpl
	 * @see base.impl.BasePackageImpl#getPolicyManager()
	 * @generated
	 */
	int POLICY_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_MANAGER__POINTS = 0;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_MANAGER__HANDLERS = 1;

	/**
	 * The feature id for the '<em><b>Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_MANAGER__POLICIES = 2;

	/**
	 * The number of structural features of the '<em>Policy Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_MANAGER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Policy Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_MANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link base.impl.HandlerImpl <em>Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.HandlerImpl
	 * @see base.impl.BasePackageImpl#getHandler()
	 * @generated
	 */
	int HANDLER = 3;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__SIGNAL = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__ENABLED = 2;

	/**
	 * The number of structural features of the '<em>Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link base.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.InstanceImpl
	 * @see base.impl.BasePackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__NAME = MetadataPackage.ANNOTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__FEATURES = MetadataPackage.ANNOTABLE__FEATURES;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__IMPL = MetadataPackage.ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__IFACE = MetadataPackage.ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = MetadataPackage.ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_COUNT = MetadataPackage.ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link base.impl.ScriptManagerImpl <em>Script Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.ScriptManagerImpl
	 * @see base.impl.BasePackageImpl#getScriptManager()
	 * @generated
	 */
	int SCRIPT_MANAGER = 5;

	/**
	 * The feature id for the '<em><b>Interpreter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MANAGER__INTERPRETER = 0;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MANAGER__PROCESSOR = 1;

	/**
	 * The number of structural features of the '<em>Script Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MANAGER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Script Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_MANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link base.impl.RepositoryManagerImpl <em>Repository Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.RepositoryManagerImpl
	 * @see base.impl.BasePackageImpl#getRepositoryManager()
	 * @generated
	 */
	int REPOSITORY_MANAGER = 6;

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
	 * The meta object id for the '{@link base.impl.EventManagerImpl <em>Event Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.impl.EventManagerImpl
	 * @see base.impl.BasePackageImpl#getEventManager()
	 * @generated
	 */
	int EVENT_MANAGER = 7;

	/**
	 * The number of structural features of the '<em>Event Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Event Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MANAGER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link base.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see base.Manager
	 * @generated
	 */
	EClass getManager();

	/**
	 * Returns the meta object for the containment reference '{@link base.Manager#getIface <em>Iface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iface</em>'.
	 * @see base.Manager#getIface()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_Iface();

	/**
	 * Returns the meta object for the containment reference list '{@link base.Manager#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see base.Manager#getActions()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link base.Manager#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handlers</em>'.
	 * @see base.Manager#getHandlers()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_Handlers();

	/**
	 * Returns the meta object for the containment reference '{@link base.Manager#getStateManager <em>State Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State Manager</em>'.
	 * @see base.Manager#getStateManager()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_StateManager();

	/**
	 * Returns the meta object for the containment reference '{@link base.Manager#getPolicyManager <em>Policy Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policy Manager</em>'.
	 * @see base.Manager#getPolicyManager()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_PolicyManager();

	/**
	 * Returns the meta object for the containment reference '{@link base.Manager#getScriptManager <em>Script Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script Manager</em>'.
	 * @see base.Manager#getScriptManager()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_ScriptManager();

	/**
	 * Returns the meta object for class '{@link base.StateManager <em>State Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Manager</em>'.
	 * @see base.StateManager
	 * @generated
	 */
	EClass getStateManager();

	/**
	 * Returns the meta object for the containment reference list '{@link base.StateManager#getStateTypes <em>State Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Types</em>'.
	 * @see base.StateManager#getStateTypes()
	 * @see #getStateManager()
	 * @generated
	 */
	EReference getStateManager_StateTypes();

	/**
	 * Returns the meta object for class '{@link base.PolicyManager <em>Policy Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Manager</em>'.
	 * @see base.PolicyManager
	 * @generated
	 */
	EClass getPolicyManager();

	/**
	 * Returns the meta object for the containment reference list '{@link base.PolicyManager#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points</em>'.
	 * @see base.PolicyManager#getPoints()
	 * @see #getPolicyManager()
	 * @generated
	 */
	EReference getPolicyManager_Points();

	/**
	 * Returns the meta object for the containment reference list '{@link base.PolicyManager#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handlers</em>'.
	 * @see base.PolicyManager#getHandlers()
	 * @see #getPolicyManager()
	 * @generated
	 */
	EReference getPolicyManager_Handlers();

	/**
	 * Returns the meta object for the containment reference list '{@link base.PolicyManager#getPolicies <em>Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policies</em>'.
	 * @see base.PolicyManager#getPolicies()
	 * @see #getPolicyManager()
	 * @generated
	 */
	EReference getPolicyManager_Policies();

	/**
	 * Returns the meta object for class '{@link base.Handler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handler</em>'.
	 * @see base.Handler
	 * @generated
	 */
	EClass getHandler();

	/**
	 * Returns the meta object for the reference '{@link base.Handler#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see base.Handler#getSignal()
	 * @see #getHandler()
	 * @generated
	 */
	EReference getHandler_Signal();

	/**
	 * Returns the meta object for the containment reference '{@link base.Handler#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see base.Handler#getAction()
	 * @see #getHandler()
	 * @generated
	 */
	EReference getHandler_Action();

	/**
	 * Returns the meta object for the attribute '{@link base.Handler#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see base.Handler#isEnabled()
	 * @see #getHandler()
	 * @generated
	 */
	EAttribute getHandler_Enabled();

	/**
	 * Returns the meta object for class '{@link base.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see base.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the attribute '{@link base.Instance#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impl</em>'.
	 * @see base.Instance#getImpl()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Impl();

	/**
	 * Returns the meta object for the reference '{@link base.Instance#getIface <em>Iface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Iface</em>'.
	 * @see base.Instance#getIface()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Iface();

	/**
	 * Returns the meta object for class '{@link base.ScriptManager <em>Script Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Manager</em>'.
	 * @see base.ScriptManager
	 * @generated
	 */
	EClass getScriptManager();

	/**
	 * Returns the meta object for the containment reference '{@link base.ScriptManager#getInterpreter <em>Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interpreter</em>'.
	 * @see base.ScriptManager#getInterpreter()
	 * @see #getScriptManager()
	 * @generated
	 */
	EReference getScriptManager_Interpreter();

	/**
	 * Returns the meta object for the reference '{@link base.ScriptManager#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processor</em>'.
	 * @see base.ScriptManager#getProcessor()
	 * @see #getScriptManager()
	 * @generated
	 */
	EReference getScriptManager_Processor();

	/**
	 * Returns the meta object for class '{@link base.RepositoryManager <em>Repository Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Manager</em>'.
	 * @see base.RepositoryManager
	 * @generated
	 */
	EClass getRepositoryManager();

	/**
	 * Returns the meta object for class '{@link base.EventManager <em>Event Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Manager</em>'.
	 * @see base.EventManager
	 * @generated
	 */
	EClass getEventManager();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BaseFactory getBaseFactory();

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
		 * The meta object literal for the '{@link base.impl.ManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.ManagerImpl
		 * @see base.impl.BasePackageImpl#getManager()
		 * @generated
		 */
		EClass MANAGER = eINSTANCE.getManager();

		/**
		 * The meta object literal for the '<em><b>Iface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__IFACE = eINSTANCE.getManager_Iface();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__ACTIONS = eINSTANCE.getManager_Actions();

		/**
		 * The meta object literal for the '<em><b>Handlers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__HANDLERS = eINSTANCE.getManager_Handlers();

		/**
		 * The meta object literal for the '<em><b>State Manager</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__STATE_MANAGER = eINSTANCE.getManager_StateManager();

		/**
		 * The meta object literal for the '<em><b>Policy Manager</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__POLICY_MANAGER = eINSTANCE.getManager_PolicyManager();

		/**
		 * The meta object literal for the '<em><b>Script Manager</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__SCRIPT_MANAGER = eINSTANCE.getManager_ScriptManager();

		/**
		 * The meta object literal for the '{@link base.impl.StateManagerImpl <em>State Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.StateManagerImpl
		 * @see base.impl.BasePackageImpl#getStateManager()
		 * @generated
		 */
		EClass STATE_MANAGER = eINSTANCE.getStateManager();

		/**
		 * The meta object literal for the '<em><b>State Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MANAGER__STATE_TYPES = eINSTANCE.getStateManager_StateTypes();

		/**
		 * The meta object literal for the '{@link base.impl.PolicyManagerImpl <em>Policy Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.PolicyManagerImpl
		 * @see base.impl.BasePackageImpl#getPolicyManager()
		 * @generated
		 */
		EClass POLICY_MANAGER = eINSTANCE.getPolicyManager();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_MANAGER__POINTS = eINSTANCE.getPolicyManager_Points();

		/**
		 * The meta object literal for the '<em><b>Handlers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_MANAGER__HANDLERS = eINSTANCE.getPolicyManager_Handlers();

		/**
		 * The meta object literal for the '<em><b>Policies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_MANAGER__POLICIES = eINSTANCE.getPolicyManager_Policies();

		/**
		 * The meta object literal for the '{@link base.impl.HandlerImpl <em>Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.HandlerImpl
		 * @see base.impl.BasePackageImpl#getHandler()
		 * @generated
		 */
		EClass HANDLER = eINSTANCE.getHandler();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANDLER__SIGNAL = eINSTANCE.getHandler_Signal();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HANDLER__ACTION = eINSTANCE.getHandler_Action();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLER__ENABLED = eINSTANCE.getHandler_Enabled();

		/**
		 * The meta object literal for the '{@link base.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.InstanceImpl
		 * @see base.impl.BasePackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Impl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__IMPL = eINSTANCE.getInstance_Impl();

		/**
		 * The meta object literal for the '<em><b>Iface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__IFACE = eINSTANCE.getInstance_Iface();

		/**
		 * The meta object literal for the '{@link base.impl.ScriptManagerImpl <em>Script Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.ScriptManagerImpl
		 * @see base.impl.BasePackageImpl#getScriptManager()
		 * @generated
		 */
		EClass SCRIPT_MANAGER = eINSTANCE.getScriptManager();

		/**
		 * The meta object literal for the '<em><b>Interpreter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT_MANAGER__INTERPRETER = eINSTANCE.getScriptManager_Interpreter();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT_MANAGER__PROCESSOR = eINSTANCE.getScriptManager_Processor();

		/**
		 * The meta object literal for the '{@link base.impl.RepositoryManagerImpl <em>Repository Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.RepositoryManagerImpl
		 * @see base.impl.BasePackageImpl#getRepositoryManager()
		 * @generated
		 */
		EClass REPOSITORY_MANAGER = eINSTANCE.getRepositoryManager();

		/**
		 * The meta object literal for the '{@link base.impl.EventManagerImpl <em>Event Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.impl.EventManagerImpl
		 * @see base.impl.BasePackageImpl#getEventManager()
		 * @generated
		 */
		EClass EVENT_MANAGER = eINSTANCE.getEventManager();

	}

} //BasePackage
