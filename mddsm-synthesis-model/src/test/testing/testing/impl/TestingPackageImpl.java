/**
 */
package testing.impl;

import metalang4md.Metalang4mdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import testing.BaseClass;
import testing.ClassActor;
import testing.ClassItem;
import testing.ClassType;
import testing.Sandbox;
import testing.TestingFactory;
import testing.TestingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestingPackageImpl extends EPackageImpl implements TestingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sandboxEClass = null;

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
	 * @see testing.TestingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestingPackageImpl() {
		super(eNS_URI, TestingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TestingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestingPackage init() {
		if (isInited) return (TestingPackage)EPackage.Registry.INSTANCE.getEPackage(TestingPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestingPackageImpl theTestingPackage = registeredTestingPackage instanceof TestingPackageImpl ? (TestingPackageImpl)registeredTestingPackage : new TestingPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		Metalang4mdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTestingPackage.createPackageContents();

		// Initialize created meta-data
		theTestingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestingPackage.eNS_URI, theTestingPackage);
		return theTestingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassItem() {
		return classItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassActor() {
		return classActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassType() {
		return classTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseClass() {
		return baseClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseClass_AttrInt() {
		return (EAttribute)baseClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseClass_AttrString() {
		return (EAttribute)baseClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseClass_ByReferences() {
		return (EReference)baseClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseClass_ByComposition() {
		return (EReference)baseClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSandbox() {
		return sandboxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSandbox_Elements() {
		return (EReference)sandboxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestingFactory getTestingFactory() {
		return (TestingFactory)getEFactoryInstance();
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
		classItemEClass = createEClass(CLASS_ITEM);

		classActorEClass = createEClass(CLASS_ACTOR);

		classTypeEClass = createEClass(CLASS_TYPE);

		baseClassEClass = createEClass(BASE_CLASS);
		createEAttribute(baseClassEClass, BASE_CLASS__ATTR_INT);
		createEAttribute(baseClassEClass, BASE_CLASS__ATTR_STRING);
		createEReference(baseClassEClass, BASE_CLASS__BY_REFERENCES);
		createEReference(baseClassEClass, BASE_CLASS__BY_COMPOSITION);

		sandboxEClass = createEClass(SANDBOX);
		createEReference(sandboxEClass, SANDBOX__ELEMENTS);
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
		Metalang4mdPackage theMetalang4mdPackage = (Metalang4mdPackage)EPackage.Registry.INSTANCE.getEPackage(Metalang4mdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		classItemEClass.getESuperTypes().add(theMetalang4mdPackage.getEItem());
		classItemEClass.getESuperTypes().add(this.getBaseClass());
		classActorEClass.getESuperTypes().add(theMetalang4mdPackage.getEActor());
		classActorEClass.getESuperTypes().add(this.getBaseClass());
		classTypeEClass.getESuperTypes().add(theMetalang4mdPackage.getEDomainSpecificType());
		classTypeEClass.getESuperTypes().add(this.getBaseClass());

		// Initialize classes, features, and operations; add parameters
		initEClass(classItemEClass, ClassItem.class, "ClassItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classActorEClass, ClassActor.class, "ClassActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classTypeEClass, ClassType.class, "ClassType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(baseClassEClass, BaseClass.class, "BaseClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseClass_AttrInt(), ecorePackage.getEInt(), "attrInt", null, 0, 1, BaseClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseClass_AttrString(), ecorePackage.getEString(), "attrString", null, 0, 1, BaseClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseClass_ByReferences(), ecorePackage.getEObject(), null, "byReferences", null, 0, -1, BaseClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseClass_ByComposition(), ecorePackage.getEObject(), null, "byComposition", null, 0, -1, BaseClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sandboxEClass, Sandbox.class, "Sandbox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSandbox_Elements(), this.getBaseClass(), null, "elements", null, 0, -1, Sandbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TestingPackageImpl
