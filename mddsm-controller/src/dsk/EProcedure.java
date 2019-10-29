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
 *   <li>{@link Dsk.EProcedure#getId <em>Id</em>}</li>
 *   <li>{@link Dsk.EProcedure#getName <em>Name</em>}</li>
 *   <li>{@link Dsk.EProcedure#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link Dsk.EProcedure#getImpl <em>Impl</em>}</li>
 *   <li>{@link Dsk.EProcedure#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see Dsk.DskPackage#getEProcedure()
 * @model
 * @generated
 */
public interface EProcedure extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Dsk.DskPackage#getEProcedure_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Dsk.EProcedure#getId <em>Id</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Dsk.DskPackage#getEProcedure_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Dsk.EProcedure#getName <em>Name</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see #setClassifier(EDSC)
	 * @see Dsk.DskPackage#getEProcedure_Classifier()
	 * @model required="true"
	 * @generated
	 */
	EDSC getClassifier();

	/**
	 * Sets the value of the '{@link Dsk.EProcedure#getClassifier <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' reference.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(EDSC value);

	/**
	 * Returns the value of the '<em><b>Impl</b></em>' containment reference list.
	 * The list contents are of type {@link Dsk.EExecutionUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl</em>' containment reference list.
	 * @see Dsk.DskPackage#getEProcedure_Impl()
	 * @model containment="true"
	 * @generated
	 */
	EList<EExecutionUnit> getImpl();

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link Dsk.EDSC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see Dsk.DskPackage#getEProcedure_Dependencies()
	 * @model
	 * @generated
	 */
	EList<EDSC> getDependencies();

} // EProcedure
