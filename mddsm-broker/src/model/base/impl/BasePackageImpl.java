/**
 */
package base.impl;

import base.AutonomicManager;
import base.BaseFactory;
import base.BasePackage;
import base.Handler;
import base.Instance;
import base.InstanceResourceManager;
import base.Manager;
import base.PolicyManager;
import base.ResourceManager;
import base.StateManager;

import base.autonomic.AutonomicPackage;

import base.autonomic.impl.AutonomicPackageImpl;

import base.common.CommonPackage;

import base.common.impl.CommonPackageImpl;

import base.context.ContextPackage;

import base.context.impl.ContextPackageImpl;

import base.metadata.MetadataPackage;

import base.metadata.impl.MetadataPackageImpl;

import base.policy.PolicyPackage;

import base.policy.impl.PolicyPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasePackageImpl extends EPackageImpl implements BasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autonomicManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass handlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceResourceManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see base.BasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasePackageImpl() {
		super(eNS_URI, BaseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasePackage init() {
		if (isInited)
			return (BasePackage) EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBasePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BasePackageImpl theBasePackage = registeredBasePackage instanceof BasePackageImpl
				? (BasePackageImpl) registeredBasePackage
				: new BasePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		ContextPackageImpl theContextPackage = (ContextPackageImpl) (registeredPackage instanceof ContextPackageImpl
				? registeredPackage
				: ContextPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MetadataPackage.eNS_URI);
		MetadataPackageImpl theMetadataPackage = (MetadataPackageImpl) (registeredPackage instanceof MetadataPackageImpl
				? registeredPackage
				: MetadataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AutonomicPackage.eNS_URI);
		AutonomicPackageImpl theAutonomicPackage = (AutonomicPackageImpl) (registeredPackage instanceof AutonomicPackageImpl
				? registeredPackage
				: AutonomicPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);
		PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl) (registeredPackage instanceof PolicyPackageImpl
				? registeredPackage
				: PolicyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl) (registeredPackage instanceof CommonPackageImpl
				? registeredPackage
				: CommonPackage.eINSTANCE);

		// Create package meta-data objects
		theBasePackage.createPackageContents();
		theContextPackage.createPackageContents();
		theMetadataPackage.createPackageContents();
		theAutonomicPackage.createPackageContents();
		thePolicyPackage.createPackageContents();
		theCommonPackage.createPackageContents();

		// Initialize created meta-data
		theBasePackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theMetadataPackage.initializePackageContents();
		theAutonomicPackage.initializePackageContents();
		thePolicyPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasePackage.eNS_URI, theBasePackage);
		return theBasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManager() {
		return managerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManager_Iface() {
		return (EReference) managerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManager_Actions() {
		return (EReference) managerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManager_Handlers() {
		return (EReference) managerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManager_StateManager() {
		return (EReference) managerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManager_ResourceManager() {
		return (EReference) managerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManager_AutonomicManager() {
		return (EReference) managerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManager_PolicyManager() {
		return (EReference) managerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceManager() {
		return resourceManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceManager_Iface() {
		return (EReference) resourceManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateManager() {
		return stateManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateManager_StateTypes() {
		return (EReference) stateManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAutonomicManager() {
		return autonomicManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAutonomicManager_Identifies() {
		return (EReference) autonomicManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAutonomicManager_Requests() {
		return (EReference) autonomicManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAutonomicManager_Plans() {
		return (EReference) autonomicManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicyManager() {
		return policyManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPolicyManager_Points() {
		return (EReference) policyManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPolicyManager_Handlers() {
		return (EReference) policyManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPolicyManager_Policies() {
		return (EReference) policyManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHandler() {
		return handlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHandler_Signal() {
		return (EReference) handlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHandler_Action() {
		return (EReference) handlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHandler_Enabled() {
		return (EAttribute) handlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstanceResourceManager() {
		return instanceResourceManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstanceResourceManager_Instances() {
		return (EReference) instanceResourceManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceResourceManager_Name() {
		return (EAttribute) instanceResourceManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstance() {
		return instanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstance_Impl() {
		return (EAttribute) instanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstance_Iface() {
		return (EReference) instanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseFactory getBaseFactory() {
		return (BaseFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		managerEClass = createEClass(MANAGER);
		createEReference(managerEClass, MANAGER__IFACE);
		createEReference(managerEClass, MANAGER__ACTIONS);
		createEReference(managerEClass, MANAGER__HANDLERS);
		createEReference(managerEClass, MANAGER__STATE_MANAGER);
		createEReference(managerEClass, MANAGER__RESOURCE_MANAGER);
		createEReference(managerEClass, MANAGER__AUTONOMIC_MANAGER);
		createEReference(managerEClass, MANAGER__POLICY_MANAGER);

		resourceManagerEClass = createEClass(RESOURCE_MANAGER);
		createEReference(resourceManagerEClass, RESOURCE_MANAGER__IFACE);

		stateManagerEClass = createEClass(STATE_MANAGER);
		createEReference(stateManagerEClass, STATE_MANAGER__STATE_TYPES);

		autonomicManagerEClass = createEClass(AUTONOMIC_MANAGER);
		createEReference(autonomicManagerEClass, AUTONOMIC_MANAGER__IDENTIFIES);
		createEReference(autonomicManagerEClass, AUTONOMIC_MANAGER__REQUESTS);
		createEReference(autonomicManagerEClass, AUTONOMIC_MANAGER__PLANS);

		policyManagerEClass = createEClass(POLICY_MANAGER);
		createEReference(policyManagerEClass, POLICY_MANAGER__POINTS);
		createEReference(policyManagerEClass, POLICY_MANAGER__HANDLERS);
		createEReference(policyManagerEClass, POLICY_MANAGER__POLICIES);

		handlerEClass = createEClass(HANDLER);
		createEReference(handlerEClass, HANDLER__SIGNAL);
		createEReference(handlerEClass, HANDLER__ACTION);
		createEAttribute(handlerEClass, HANDLER__ENABLED);

		instanceResourceManagerEClass = createEClass(INSTANCE_RESOURCE_MANAGER);
		createEReference(instanceResourceManagerEClass, INSTANCE_RESOURCE_MANAGER__INSTANCES);
		createEAttribute(instanceResourceManagerEClass, INSTANCE_RESOURCE_MANAGER__NAME);

		instanceEClass = createEClass(INSTANCE);
		createEAttribute(instanceEClass, INSTANCE__IMPL);
		createEReference(instanceEClass, INSTANCE__IFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ContextPackage theContextPackage = (ContextPackage) EPackage.Registry.INSTANCE
				.getEPackage(ContextPackage.eNS_URI);
		MetadataPackage theMetadataPackage = (MetadataPackage) EPackage.Registry.INSTANCE
				.getEPackage(MetadataPackage.eNS_URI);
		AutonomicPackage theAutonomicPackage = (AutonomicPackage) EPackage.Registry.INSTANCE
				.getEPackage(AutonomicPackage.eNS_URI);
		PolicyPackage thePolicyPackage = (PolicyPackage) EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage) EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theContextPackage);
		getESubpackages().add(theMetadataPackage);
		getESubpackages().add(theAutonomicPackage);
		getESubpackages().add(thePolicyPackage);
		getESubpackages().add(theCommonPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		managerEClass.getESuperTypes().add(theMetadataPackage.getAnnotable());
		instanceResourceManagerEClass.getESuperTypes().add(this.getResourceManager());
		instanceEClass.getESuperTypes().add(theMetadataPackage.getAnnotable());

		// Initialize classes, features, and operations; add parameters
		initEClass(managerEClass, Manager.class, "Manager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManager_Iface(), theCommonPackage.getInterface(), null, "iface", null, 1, 1, Manager.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_Actions(), theCommonPackage.getAction(), null, "actions", null, 0, -1, Manager.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_Handlers(), this.getHandler(), null, "handlers", null, 0, -1, Manager.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_StateManager(), this.getStateManager(), null, "stateManager", null, 0, 1,
				Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_ResourceManager(), this.getResourceManager(), null, "resourceManager", null, 0, 1,
				Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_AutonomicManager(), this.getAutonomicManager(), null, "autonomicManager", null, 0, 1,
				Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManager_PolicyManager(), this.getPolicyManager(), null, "policyManager", null, 1, 1,
				Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceManagerEClass, ResourceManager.class, "ResourceManager", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceManager_Iface(), theCommonPackage.getInterface(), null, "iface", null, 1, 1,
				ResourceManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateManagerEClass, StateManager.class, "StateManager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateManager_StateTypes(), theContextPackage.getState(), null, "stateTypes", null, 0, -1,
				StateManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(autonomicManagerEClass, AutonomicManager.class, "AutonomicManager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAutonomicManager_Identifies(), theAutonomicPackage.getSymptom(), null, "identifies", null, 0,
				-1, AutonomicManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutonomicManager_Requests(), theAutonomicPackage.getChangeRequest(), null, "requests", null,
				0, -1, AutonomicManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutonomicManager_Plans(), theAutonomicPackage.getChangePlan(), null, "plans", null, 0, -1,
				AutonomicManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyManagerEClass, PolicyManager.class, "PolicyManager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicyManager_Points(), thePolicyPackage.getPolicyEvaluationPoint(), null, "points", null, 0,
				-1, PolicyManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyManager_Handlers(), thePolicyPackage.getPolicyEvaluationHandler(), null, "handlers",
				null, 0, -1, PolicyManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyManager_Policies(), thePolicyPackage.getPolicy(), null, "policies", null, 0, -1,
				PolicyManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(handlerEClass, Handler.class, "Handler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHandler_Signal(), theCommonPackage.getSignal(), null, "signal", null, 1, 1, Handler.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHandler_Action(), theCommonPackage.getActionExecution(), null, "action", null, 1, 1,
				Handler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHandler_Enabled(), ecorePackage.getEBoolean(), "enabled", "true", 1, 1, Handler.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceResourceManagerEClass, InstanceResourceManager.class, "InstanceResourceManager",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceResourceManager_Instances(), this.getInstance(), null, "instances", null, 0, -1,
				InstanceResourceManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceResourceManager_Name(), ecorePackage.getEString(), "Name", null, 0, 1,
				InstanceResourceManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstance_Impl(), ecorePackage.getEString(), "impl", null, 1, 1, Instance.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstance_Iface(), theCommonPackage.getInterface(), null, "iface", null, 1, 1, Instance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BasePackageImpl
