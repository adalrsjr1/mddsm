/**
 */
package br.ufg.inf.metalang4md;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see metalang4md.Metalang4mdPackage
 * @generated
 */
public interface Metalang4mdFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Metalang4mdFactory eINSTANCE = metalang4md.impl.Metalang4mdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EActor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EActor</em>'.
	 * @generated
	 */
	EActor createEActor();

	/**
	 * Returns a new object of class '<em>EItem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EItem</em>'.
	 * @generated
	 */
	EItem createEItem();

	/**
	 * Returns a new object of class '<em>EDomain Specific Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDomain Specific Type</em>'.
	 * @generated
	 */
	EDomainSpecificType createEDomainSpecificType();

	/**
	 * Returns a new object of class '<em>EDomain Specific Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDomain Specific Element</em>'.
	 * @generated
	 */
	EDomainSpecificElement createEDomainSpecificElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Metalang4mdPackage getMetalang4mdPackage();

} //Metalang4mdFactory
