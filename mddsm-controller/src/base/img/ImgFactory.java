/**
 */
package base.img;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see base.img.ImgPackage
 * @generated
 */
public interface ImgFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImgFactory eINSTANCE = base.img.impl.ImgFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>IM Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IM Generator</em>'.
	 * @generated
	 */
	IMGenerator createIMGenerator();

	/**
	 * Returns a new object of class '<em>Build IM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build IM</em>'.
	 * @generated
	 */
	BuildIM createBuildIM();

	/**
	 * Returns a new object of class '<em>IM Executor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IM Executor</em>'.
	 * @generated
	 */
	IMExecutor createIMExecutor();

	/**
	 * Returns a new object of class '<em>Repository Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository Manager</em>'.
	 * @generated
	 */
	RepositoryManager createRepositoryManager();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ImgPackage getImgPackage();

} //ImgFactory
