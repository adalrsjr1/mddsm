/**
 */
package dsk;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import dsk.impl.DskPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Dsk.DskFactory
 * @model kind="package"
 * @generated
 */
public interface DskPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dsk";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.ufg.br/controller/dsk";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dsk";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DskPackage eINSTANCE = DskPackageImpl.init();

	/**
	 * The meta object id for the '{@link Dsk.impl.dskImpl <em>dsk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Dsk.impl.dskImpl
	 * @see Dsk.impl.DskPackageImpl#getdsk()
	 * @generated
	 */
	int DSK = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSK__DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Dscs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSK__DSCS = 1;

	/**
	 * The feature id for the '<em><b>Procedures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSK__PROCEDURES = 2;

	/**
	 * The number of structural features of the '<em>dsk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>dsk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Dsk.impl.EProcedureImpl <em>EProcedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Dsk.impl.EProcedureImpl
	 * @see Dsk.impl.DskPackageImpl#getEProcedure()
	 * @generated
	 */
	int EPROCEDURE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__CLASSIFIER = 2;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__IMPL = 3;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__DEPENDENCIES = 4;

	/**
	 * The number of structural features of the '<em>EProcedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>EProcedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Dsk.impl.EDSCImpl <em>EDSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Dsk.impl.EDSCImpl
	 * @see Dsk.impl.DskPackageImpl#getEDSC()
	 * @generated
	 */
	int EDSC = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSC__KIND = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSC__PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>EDSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>EDSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Dsk.impl.EExecutionUnitImpl <em>EExecution Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Dsk.impl.EExecutionUnitImpl
	 * @see Dsk.impl.DskPackageImpl#getEExecutionUnit()
	 * @generated
	 */
	int EEXECUTION_UNIT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXECUTION_UNIT__ID = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXECUTION_UNIT__BODY = 1;

	/**
	 * The number of structural features of the '<em>EExecution Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXECUTION_UNIT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EExecution Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXECUTION_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Dsk.EKind <em>EKind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Dsk.EKind
	 * @see Dsk.impl.DskPackageImpl#getEKind()
	 * @generated
	 */
	int EKIND = 4;


	/**
	 * Returns the meta object for class '{@link Dsk.dsk <em>dsk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>dsk</em>'.
	 * @see Dsk.dsk
	 * @generated
	 */
	EClass getdsk();

	/**
	 * Returns the meta object for the attribute '{@link Dsk.dsk#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see Dsk.dsk#getDomain()
	 * @see #getdsk()
	 * @generated
	 */
	EAttribute getdsk_Domain();

	/**
	 * Returns the meta object for the containment reference list '{@link Dsk.dsk#getDscs <em>Dscs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dscs</em>'.
	 * @see Dsk.dsk#getDscs()
	 * @see #getdsk()
	 * @generated
	 */
	EReference getdsk_Dscs();

	/**
	 * Returns the meta object for the containment reference list '{@link Dsk.dsk#getProcedures <em>Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Procedures</em>'.
	 * @see Dsk.dsk#getProcedures()
	 * @see #getdsk()
	 * @generated
	 */
	EReference getdsk_Procedures();

	/**
	 * Returns the meta object for class '{@link Dsk.EProcedure <em>EProcedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EProcedure</em>'.
	 * @see Dsk.EProcedure
	 * @generated
	 */
	EClass getEProcedure();

	/**
	 * Returns the meta object for the attribute '{@link Dsk.EProcedure#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Dsk.EProcedure#getId()
	 * @see #getEProcedure()
	 * @generated
	 */
	EAttribute getEProcedure_Id();

	/**
	 * Returns the meta object for the attribute '{@link Dsk.EProcedure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Dsk.EProcedure#getName()
	 * @see #getEProcedure()
	 * @generated
	 */
	EAttribute getEProcedure_Name();

	/**
	 * Returns the meta object for the reference '{@link Dsk.EProcedure#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see Dsk.EProcedure#getClassifier()
	 * @see #getEProcedure()
	 * @generated
	 */
	EReference getEProcedure_Classifier();

	/**
	 * Returns the meta object for the containment reference list '{@link Dsk.EProcedure#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Impl</em>'.
	 * @see Dsk.EProcedure#getImpl()
	 * @see #getEProcedure()
	 * @generated
	 */
	EReference getEProcedure_Impl();

	/**
	 * Returns the meta object for the reference list '{@link Dsk.EProcedure#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see Dsk.EProcedure#getDependencies()
	 * @see #getEProcedure()
	 * @generated
	 */
	EReference getEProcedure_Dependencies();

	/**
	 * Returns the meta object for class '{@link Dsk.EDSC <em>EDSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDSC</em>'.
	 * @see Dsk.EDSC
	 * @generated
	 */
	EClass getEDSC();

	/**
	 * Returns the meta object for the attribute '{@link Dsk.EDSC#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Dsk.EDSC#getName()
	 * @see #getEDSC()
	 * @generated
	 */
	EAttribute getEDSC_Name();

	/**
	 * Returns the meta object for the attribute '{@link Dsk.EDSC#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see Dsk.EDSC#getKind()
	 * @see #getEDSC()
	 * @generated
	 */
	EAttribute getEDSC_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link Dsk.EDSC#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see Dsk.EDSC#getParameters()
	 * @see #getEDSC()
	 * @generated
	 */
	EReference getEDSC_Parameters();

	/**
	 * Returns the meta object for class '{@link Dsk.EExecutionUnit <em>EExecution Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EExecution Unit</em>'.
	 * @see Dsk.EExecutionUnit
	 * @generated
	 */
	EClass getEExecutionUnit();

	/**
	 * Returns the meta object for the attribute '{@link Dsk.EExecutionUnit#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Dsk.EExecutionUnit#getId()
	 * @see #getEExecutionUnit()
	 * @generated
	 */
	EAttribute getEExecutionUnit_Id();

	/**
	 * Returns the meta object for the attribute '{@link Dsk.EExecutionUnit#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see Dsk.EExecutionUnit#getBody()
	 * @see #getEExecutionUnit()
	 * @generated
	 */
	EAttribute getEExecutionUnit_Body();

	/**
	 * Returns the meta object for enum '{@link Dsk.EKind <em>EKind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EKind</em>'.
	 * @see Dsk.EKind
	 * @generated
	 */
	EEnum getEKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DskFactory getDskFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Dsk.impl.dskImpl <em>dsk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Dsk.impl.dskImpl
		 * @see Dsk.impl.DskPackageImpl#getdsk()
		 * @generated
		 */
		EClass DSK = eINSTANCE.getdsk();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSK__DOMAIN = eINSTANCE.getdsk_Domain();

		/**
		 * The meta object literal for the '<em><b>Dscs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSK__DSCS = eINSTANCE.getdsk_Dscs();

		/**
		 * The meta object literal for the '<em><b>Procedures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSK__PROCEDURES = eINSTANCE.getdsk_Procedures();

		/**
		 * The meta object literal for the '{@link Dsk.impl.EProcedureImpl <em>EProcedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Dsk.impl.EProcedureImpl
		 * @see Dsk.impl.DskPackageImpl#getEProcedure()
		 * @generated
		 */
		EClass EPROCEDURE = eINSTANCE.getEProcedure();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPROCEDURE__ID = eINSTANCE.getEProcedure_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPROCEDURE__NAME = eINSTANCE.getEProcedure_Name();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPROCEDURE__CLASSIFIER = eINSTANCE.getEProcedure_Classifier();

		/**
		 * The meta object literal for the '<em><b>Impl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPROCEDURE__IMPL = eINSTANCE.getEProcedure_Impl();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPROCEDURE__DEPENDENCIES = eINSTANCE.getEProcedure_Dependencies();

		/**
		 * The meta object literal for the '{@link Dsk.impl.EDSCImpl <em>EDSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Dsk.impl.EDSCImpl
		 * @see Dsk.impl.DskPackageImpl#getEDSC()
		 * @generated
		 */
		EClass EDSC = eINSTANCE.getEDSC();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDSC__NAME = eINSTANCE.getEDSC_Name();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDSC__KIND = eINSTANCE.getEDSC_Kind();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDSC__PARAMETERS = eINSTANCE.getEDSC_Parameters();

		/**
		 * The meta object literal for the '{@link Dsk.impl.EExecutionUnitImpl <em>EExecution Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Dsk.impl.EExecutionUnitImpl
		 * @see Dsk.impl.DskPackageImpl#getEExecutionUnit()
		 * @generated
		 */
		EClass EEXECUTION_UNIT = eINSTANCE.getEExecutionUnit();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEXECUTION_UNIT__ID = eINSTANCE.getEExecutionUnit_Id();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEXECUTION_UNIT__BODY = eINSTANCE.getEExecutionUnit_Body();

		/**
		 * The meta object literal for the '{@link Dsk.EKind <em>EKind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Dsk.EKind
		 * @see Dsk.impl.DskPackageImpl#getEKind()
		 * @generated
		 */
		EEnum EKIND = eINSTANCE.getEKind();

	}

} //DskPackage
