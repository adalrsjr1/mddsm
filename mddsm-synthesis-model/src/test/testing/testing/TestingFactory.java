/**
 */
package testing;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see testing.TestingPackage
 * @generated
 */
public interface TestingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestingFactory eINSTANCE = testing.impl.TestingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Class Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Item</em>'.
	 * @generated
	 */
	ClassItem createClassItem();

	/**
	 * Returns a new object of class '<em>Class Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Actor</em>'.
	 * @generated
	 */
	ClassActor createClassActor();

	/**
	 * Returns a new object of class '<em>Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Type</em>'.
	 * @generated
	 */
	ClassType createClassType();

	/**
	 * Returns a new object of class '<em>Base Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Class</em>'.
	 * @generated
	 */
	BaseClass createBaseClass();

	/**
	 * Returns a new object of class '<em>Sandbox</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sandbox</em>'.
	 * @generated
	 */
	Sandbox createSandbox();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TestingPackage getTestingPackage();

} //TestingFactory
