/**
 */
package metalang4md.impl;

import metalang4md.EActor;
import metalang4md.EArising;
import metalang4md.ECardinality;
import metalang4md.ECoordinationBehavior;
import metalang4md.EDomainSpecificElement;
import metalang4md.EDomainSpecificType;
import metalang4md.EInteractionBehavior;
import metalang4md.EItem;
import metalang4md.Metalang4mdFactory;
import metalang4md.Metalang4mdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Metalang4mdPackageImpl extends EPackageImpl implements Metalang4mdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDomainSpecificTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDomainSpecificElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eCardinalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eInteractionBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eArisingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eCoordinationBehaviorEEnum = null;

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
	 * @see metalang4md.Metalang4mdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Metalang4mdPackageImpl() {
		super(eNS_URI, Metalang4mdFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Metalang4mdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Metalang4mdPackage init() {
		if (isInited) return (Metalang4mdPackage)EPackage.Registry.INSTANCE.getEPackage(Metalang4mdPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMetalang4mdPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Metalang4mdPackageImpl theMetalang4mdPackage = registeredMetalang4mdPackage instanceof Metalang4mdPackageImpl ? (Metalang4mdPackageImpl)registeredMetalang4mdPackage : new Metalang4mdPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMetalang4mdPackage.createPackageContents();

		// Initialize created meta-data
		theMetalang4mdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetalang4mdPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Metalang4mdPackage.eNS_URI, theMetalang4mdPackage);
		return theMetalang4mdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEActor() {
		return eActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEItem() {
		return eItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEItem_ArisingBehavior() {
		return (EAttribute)eItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDomainSpecificType() {
		return eDomainSpecificTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDomainSpecificType_Cardinality() {
		return (EAttribute)eDomainSpecificTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDomainSpecificType_InteractionBehavior() {
		return (EAttribute)eDomainSpecificTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDomainSpecificType_KindInteraction() {
		return (EAttribute)eDomainSpecificTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDomainSpecificType_Binding() {
		return (EReference)eDomainSpecificTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDomainSpecificElement() {
		return eDomainSpecificElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDomainSpecificElement_CommandPriority() {
		return (EAttribute)eDomainSpecificElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getECardinality() {
		return eCardinalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEInteractionBehavior() {
		return eInteractionBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEArising() {
		return eArisingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getECoordinationBehavior() {
		return eCoordinationBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metalang4mdFactory getMetalang4mdFactory() {
		return (Metalang4mdFactory)getEFactoryInstance();
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
		eActorEClass = createEClass(EACTOR);

		eItemEClass = createEClass(EITEM);
		createEAttribute(eItemEClass, EITEM__ARISING_BEHAVIOR);

		eDomainSpecificTypeEClass = createEClass(EDOMAIN_SPECIFIC_TYPE);
		createEAttribute(eDomainSpecificTypeEClass, EDOMAIN_SPECIFIC_TYPE__CARDINALITY);
		createEAttribute(eDomainSpecificTypeEClass, EDOMAIN_SPECIFIC_TYPE__INTERACTION_BEHAVIOR);
		createEAttribute(eDomainSpecificTypeEClass, EDOMAIN_SPECIFIC_TYPE__KIND_INTERACTION);
		createEReference(eDomainSpecificTypeEClass, EDOMAIN_SPECIFIC_TYPE__BINDING);

		eDomainSpecificElementEClass = createEClass(EDOMAIN_SPECIFIC_ELEMENT);
		createEAttribute(eDomainSpecificElementEClass, EDOMAIN_SPECIFIC_ELEMENT__COMMAND_PRIORITY);

		// Create enums
		eCardinalityEEnum = createEEnum(ECARDINALITY);
		eInteractionBehaviorEEnum = createEEnum(EINTERACTION_BEHAVIOR);
		eArisingEEnum = createEEnum(EARISING);
		eCoordinationBehaviorEEnum = createEEnum(ECOORDINATION_BEHAVIOR);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eActorEClass.getESuperTypes().add(this.getEDomainSpecificElement());
		eItemEClass.getESuperTypes().add(this.getEDomainSpecificElement());
		eDomainSpecificTypeEClass.getESuperTypes().add(this.getEDomainSpecificElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(eActorEClass, EActor.class, "EActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eItemEClass, EItem.class, "EItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEItem_ArisingBehavior(), this.getEArising(), "arisingBehavior", null, 0, 1, EItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eDomainSpecificTypeEClass, EDomainSpecificType.class, "EDomainSpecificType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDomainSpecificType_Cardinality(), this.getECardinality(), "cardinality", null, 0, 1, EDomainSpecificType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDomainSpecificType_InteractionBehavior(), this.getEInteractionBehavior(), "interactionBehavior", null, 0, 1, EDomainSpecificType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDomainSpecificType_KindInteraction(), this.getECoordinationBehavior(), "kindInteraction", null, 0, 1, EDomainSpecificType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDomainSpecificType_Binding(), this.getEDomainSpecificType(), null, "binding", null, 0, -1, EDomainSpecificType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eDomainSpecificElementEClass, EDomainSpecificElement.class, "EDomainSpecificElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDomainSpecificElement_CommandPriority(), ecorePackage.getEInt(), "commandPriority", null, 0, 1, EDomainSpecificElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eCardinalityEEnum, ECardinality.class, "ECardinality");
		addEEnumLiteral(eCardinalityEEnum, ECardinality.ONE);
		addEEnumLiteral(eCardinalityEEnum, ECardinality.MANY);

		initEEnum(eInteractionBehaviorEEnum, EInteractionBehavior.class, "EInteractionBehavior");
		addEEnumLiteral(eInteractionBehaviorEEnum, EInteractionBehavior.SYNC);
		addEEnumLiteral(eInteractionBehaviorEEnum, EInteractionBehavior.ASYNC);

		initEEnum(eArisingEEnum, EArising.class, "EArising");
		addEEnumLiteral(eArisingEEnum, EArising.STATIC);
		addEEnumLiteral(eArisingEEnum, EArising.DYNAMIC);

		initEEnum(eCoordinationBehaviorEEnum, ECoordinationBehavior.class, "ECoordinationBehavior");
		addEEnumLiteral(eCoordinationBehaviorEEnum, ECoordinationBehavior.LOCAL);
		addEEnumLiteral(eCoordinationBehaviorEEnum, ECoordinationBehavior.DISTRIBUTED);

		// Create resource
		createResource(eNS_URI);
	}

} //Metalang4mdPackageImpl
