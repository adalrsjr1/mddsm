/**
 */
package dsk;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EProcedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsk.EProcedure#getId <em>Id</em>}</li>
 *   <li>{@link dsk.EProcedure#getName <em>Name</em>}</li>
 *   <li>{@link dsk.EProcedure#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link dsk.EProcedure#getImpl <em>Impl</em>}</li>
 *   <li>{@link dsk.EProcedure#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see dsk.DskPackage#getEProcedure()
 * @model
 * @generated
 */
public interface EProcedure extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see dsk.DskPackage#getEProcedure_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link dsk.EProcedure#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dsk.DskPackage#getEProcedure_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dsk.EProcedure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see #setClassifier(EDSC)
	 * @see dsk.DskPackage#getEProcedure_Classifier()
	 * @model required="true"
	 * @generated
	 */
	EDSC getClassifier();

	/**
	 * Sets the value of the '{@link dsk.EProcedure#getClassifier <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' reference.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(EDSC value);

	/**
	 * Returns the value of the '<em><b>Impl</b></em>' containment reference list.
	 * The list contents are of type {@link dsk.EExecutionUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl</em>' containment reference list.
	 * @see dsk.DskPackage#getEProcedure_Impl()
	 * @model containment="true"
	 * @generated
	 */
	EList<EExecutionUnit> getImpl();

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link dsk.EDSC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see dsk.DskPackage#getEProcedure_Dependencies()
	 * @model
	 * @generated
	 */
	EList<EDSC> getDependencies();

} // EProcedure
