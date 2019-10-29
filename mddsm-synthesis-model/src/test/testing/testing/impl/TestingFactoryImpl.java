/**
 */
package testing.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import testing.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestingFactoryImpl extends EFactoryImpl implements TestingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TestingFactory init() {
		try {
			TestingFactory theTestingFactory = (TestingFactory)EPackage.Registry.INSTANCE.getEFactory(TestingPackage.eNS_URI);
			if (theTestingFactory != null) {
				return theTestingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TestingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestingFactoryImpl() {
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
			case TestingPackage.CLASS_ITEM: return createClassItem();
			case TestingPackage.CLASS_ACTOR: return createClassActor();
			case TestingPackage.CLASS_TYPE: return createClassType();
			case TestingPackage.BASE_CLASS: return createBaseClass();
			case TestingPackage.SANDBOX: return createSandbox();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassItem createClassItem() {
		ClassItemImpl classItem = new ClassItemImpl();
		return classItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassActor createClassActor() {
		ClassActorImpl classActor = new ClassActorImpl();
		return classActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType createClassType() {
		ClassTypeImpl classType = new ClassTypeImpl();
		return classType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseClass createBaseClass() {
		BaseClassImpl baseClass = new BaseClassImpl();
		return baseClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sandbox createSandbox() {
		SandboxImpl sandbox = new SandboxImpl();
		return sandbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestingPackage getTestingPackage() {
		return (TestingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TestingPackage getPackage() {
		return TestingPackage.eINSTANCE;
	}

} //TestingFactoryImpl
