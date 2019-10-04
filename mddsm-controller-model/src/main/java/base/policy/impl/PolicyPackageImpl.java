/**
 */
package base.policy.impl;

import base.BasePackage;

import base.common.CommonPackage;

import base.common.impl.CommonPackageImpl;

import base.context.ContextPackage;

import base.context.impl.ContextPackageImpl;

import base.img.ImgPackage;

import base.img.impl.ImgPackageImpl;

import base.impl.BasePackageImpl;

import base.metadata.MetadataPackage;

import base.metadata.impl.MetadataPackageImpl;

import base.policy.Policy;
import base.policy.PolicyDecision;
import base.policy.PolicyEvaluation;
import base.policy.PolicyEvaluationContext;
import base.policy.PolicyEvaluationHandler;
import base.policy.PolicyEvaluationPoint;
import base.policy.PolicyEvaluationRequest;
import base.policy.PolicyFactory;
import base.policy.PolicyPackage;

import base.script.ScriptPackage;

import base.script.impl.ScriptPackageImpl;

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
public class PolicyPackageImpl extends EPackageImpl implements PolicyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyEvaluationPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyEvaluationRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyEvaluationHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyEvaluationContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyEvaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyDecisionEClass = null;

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
	 * @see base.policy.PolicyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PolicyPackageImpl() {
		super(eNS_URI, PolicyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PolicyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PolicyPackage init() {
		if (isInited) return (PolicyPackage)EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPolicyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PolicyPackageImpl thePolicyPackage = registeredPolicyPackage instanceof PolicyPackageImpl ? (PolicyPackageImpl)registeredPolicyPackage : new PolicyPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		BasePackageImpl theBasePackage = (BasePackageImpl)(registeredPackage instanceof BasePackageImpl ? registeredPackage : BasePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		ContextPackageImpl theContextPackage = (ContextPackageImpl)(registeredPackage instanceof ContextPackageImpl ? registeredPackage : ContextPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MetadataPackage.eNS_URI);
		MetadataPackageImpl theMetadataPackage = (MetadataPackageImpl)(registeredPackage instanceof MetadataPackageImpl ? registeredPackage : MetadataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(registeredPackage instanceof CommonPackageImpl ? registeredPackage : CommonPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI);
		ScriptPackageImpl theScriptPackage = (ScriptPackageImpl)(registeredPackage instanceof ScriptPackageImpl ? registeredPackage : ScriptPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ImgPackage.eNS_URI);
		ImgPackageImpl theImgPackage = (ImgPackageImpl)(registeredPackage instanceof ImgPackageImpl ? registeredPackage : ImgPackage.eINSTANCE);

		// Create package meta-data objects
		thePolicyPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theContextPackage.createPackageContents();
		theMetadataPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theScriptPackage.createPackageContents();
		theImgPackage.createPackageContents();

		// Initialize created meta-data
		thePolicyPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theMetadataPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theScriptPackage.initializePackageContents();
		theImgPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePolicyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PolicyPackage.eNS_URI, thePolicyPackage);
		return thePolicyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyEvaluationPoint() {
		return policyEvaluationPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyEvaluationPoint_Signal() {
		return (EReference)policyEvaluationPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyEvaluationPoint_Request() {
		return (EReference)policyEvaluationPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyEvaluationRequest() {
		return policyEvaluationRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyEvaluationRequest_Handler() {
		return (EReference)policyEvaluationRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyEvaluationRequest_Bindings() {
		return (EReference)policyEvaluationRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyEvaluationHandler() {
		return policyEvaluationHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyEvaluationHandler_Parameters() {
		return (EReference)policyEvaluationHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyEvaluationHandler_HandlerImpl() {
		return (EAttribute)policyEvaluationHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyEvaluationHandler_Evaluation() {
		return (EReference)policyEvaluationHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyEvaluationContext() {
		return policyEvaluationContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyEvaluationContext_Parameters() {
		return (EReference)policyEvaluationContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyEvaluation() {
		return policyEvaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyEvaluation_Feature() {
		return (EReference)policyEvaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyEvaluation_ContextBinding() {
		return (EReference)policyEvaluationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyEvaluation_Context() {
		return (EReference)policyEvaluationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicy() {
		return policyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicy_Name() {
		return (EAttribute)policyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicy_BusinessValue() {
		return (EAttribute)policyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicy_Feature() {
		return (EAttribute)policyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicy_Decision() {
		return (EReference)policyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyDecision() {
		return policyDecisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyDecision_Parameter() {
		return (EAttribute)policyDecisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyDecision_Operation() {
		return (EAttribute)policyDecisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyDecision_Value() {
		return (EAttribute)policyDecisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyFactory getPolicyFactory() {
		return (PolicyFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		policyEvaluationPointEClass = createEClass(POLICY_EVALUATION_POINT);
		createEReference(policyEvaluationPointEClass, POLICY_EVALUATION_POINT__SIGNAL);
		createEReference(policyEvaluationPointEClass, POLICY_EVALUATION_POINT__REQUEST);

		policyEvaluationRequestEClass = createEClass(POLICY_EVALUATION_REQUEST);
		createEReference(policyEvaluationRequestEClass, POLICY_EVALUATION_REQUEST__HANDLER);
		createEReference(policyEvaluationRequestEClass, POLICY_EVALUATION_REQUEST__BINDINGS);

		policyEvaluationHandlerEClass = createEClass(POLICY_EVALUATION_HANDLER);
		createEReference(policyEvaluationHandlerEClass, POLICY_EVALUATION_HANDLER__PARAMETERS);
		createEAttribute(policyEvaluationHandlerEClass, POLICY_EVALUATION_HANDLER__HANDLER_IMPL);
		createEReference(policyEvaluationHandlerEClass, POLICY_EVALUATION_HANDLER__EVALUATION);

		policyEvaluationContextEClass = createEClass(POLICY_EVALUATION_CONTEXT);
		createEReference(policyEvaluationContextEClass, POLICY_EVALUATION_CONTEXT__PARAMETERS);

		policyEvaluationEClass = createEClass(POLICY_EVALUATION);
		createEReference(policyEvaluationEClass, POLICY_EVALUATION__FEATURE);
		createEReference(policyEvaluationEClass, POLICY_EVALUATION__CONTEXT_BINDING);
		createEReference(policyEvaluationEClass, POLICY_EVALUATION__CONTEXT);

		policyEClass = createEClass(POLICY);
		createEAttribute(policyEClass, POLICY__NAME);
		createEAttribute(policyEClass, POLICY__BUSINESS_VALUE);
		createEAttribute(policyEClass, POLICY__FEATURE);
		createEReference(policyEClass, POLICY__DECISION);

		policyDecisionEClass = createEClass(POLICY_DECISION);
		createEAttribute(policyDecisionEClass, POLICY_DECISION__PARAMETER);
		createEAttribute(policyDecisionEClass, POLICY_DECISION__OPERATION);
		createEAttribute(policyDecisionEClass, POLICY_DECISION__VALUE);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(policyEvaluationPointEClass, PolicyEvaluationPoint.class, "PolicyEvaluationPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicyEvaluationPoint_Signal(), theCommonPackage.getSignal(), null, "signal", null, 1, 1, PolicyEvaluationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyEvaluationPoint_Request(), this.getPolicyEvaluationRequest(), null, "request", null, 1, 1, PolicyEvaluationPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyEvaluationRequestEClass, PolicyEvaluationRequest.class, "PolicyEvaluationRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicyEvaluationRequest_Handler(), this.getPolicyEvaluationHandler(), null, "handler", null, 1, 1, PolicyEvaluationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyEvaluationRequest_Bindings(), theCommonPackage.getParameterBinding(), null, "bindings", null, 0, -1, PolicyEvaluationRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyEvaluationHandlerEClass, PolicyEvaluationHandler.class, "PolicyEvaluationHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicyEvaluationHandler_Parameters(), theCommonPackage.getParameter(), null, "parameters", null, 0, -1, PolicyEvaluationHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyEvaluationHandler_HandlerImpl(), ecorePackage.getEString(), "handlerImpl", null, 1, 1, PolicyEvaluationHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyEvaluationHandler_Evaluation(), this.getPolicyEvaluation(), null, "evaluation", null, 1, 1, PolicyEvaluationHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyEvaluationContextEClass, PolicyEvaluationContext.class, "PolicyEvaluationContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicyEvaluationContext_Parameters(), theCommonPackage.getParameter(), null, "parameters", null, 0, -1, PolicyEvaluationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyEvaluationEClass, PolicyEvaluation.class, "PolicyEvaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolicyEvaluation_Feature(), theCommonPackage.getValue(), null, "feature", null, 1, 1, PolicyEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyEvaluation_ContextBinding(), theCommonPackage.getParameterBinding(), null, "contextBinding", null, 0, -1, PolicyEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyEvaluation_Context(), this.getPolicyEvaluationContext(), null, "context", null, 1, 1, PolicyEvaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyEClass, Policy.class, "Policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicy_Name(), ecorePackage.getEString(), "name", null, 1, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicy_BusinessValue(), ecorePackage.getEIntegerObject(), "businessValue", null, 1, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicy_Feature(), ecorePackage.getEString(), "feature", null, 1, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicy_Decision(), this.getPolicyDecision(), null, "decision", null, 1, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyDecisionEClass, PolicyDecision.class, "PolicyDecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicyDecision_Parameter(), ecorePackage.getEString(), "parameter", null, 1, 1, PolicyDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDecision_Operation(), ecorePackage.getEString(), "operation", null, 1, 1, PolicyDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolicyDecision_Value(), ecorePackage.getEString(), "value", null, 1, 1, PolicyDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //PolicyPackageImpl
