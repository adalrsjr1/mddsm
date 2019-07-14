/**
 */
package base.script;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see base.script.ScriptFactory
 * @model kind="package"
 * @generated
 */
public interface ScriptPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "script";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.ufg.br/mestrado/controller/base/script";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "controller.base.script";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScriptPackage eINSTANCE = base.script.impl.ScriptPackageImpl.init();

	/**
	 * The meta object id for the '{@link base.script.impl.ScriptInterpreterImpl <em>Interpreter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.script.impl.ScriptInterpreterImpl
	 * @see base.script.impl.ScriptPackageImpl#getScriptInterpreter()
	 * @generated
	 */
	int SCRIPT_INTERPRETER = 0;

	/**
	 * The number of structural features of the '<em>Interpreter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_INTERPRETER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interpreter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_INTERPRETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link base.script.impl.ScriptProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see base.script.impl.ScriptProcessorImpl
	 * @see base.script.impl.ScriptPackageImpl#getScriptProcessor()
	 * @generated
	 */
	int SCRIPT_PROCESSOR = 1;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_PROCESSOR__IMG = 0;

	/**
	 * The feature id for the '<em><b>Ime</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_PROCESSOR__IME = 1;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_PROCESSOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_PROCESSOR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link base.script.ScriptInterpreter <em>Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interpreter</em>'.
	 * @see base.script.ScriptInterpreter
	 * @generated
	 */
	EClass getScriptInterpreter();

	/**
	 * Returns the meta object for class '{@link base.script.ScriptProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see base.script.ScriptProcessor
	 * @generated
	 */
	EClass getScriptProcessor();

	/**
	 * Returns the meta object for the containment reference '{@link base.script.ScriptProcessor#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Img</em>'.
	 * @see base.script.ScriptProcessor#getImg()
	 * @see #getScriptProcessor()
	 * @generated
	 */
	EReference getScriptProcessor_Img();

	/**
	 * Returns the meta object for the containment reference '{@link base.script.ScriptProcessor#getIme <em>Ime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ime</em>'.
	 * @see base.script.ScriptProcessor#getIme()
	 * @see #getScriptProcessor()
	 * @generated
	 */
	EReference getScriptProcessor_Ime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScriptFactory getScriptFactory();

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
		 * The meta object literal for the '{@link base.script.impl.ScriptInterpreterImpl <em>Interpreter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.script.impl.ScriptInterpreterImpl
		 * @see base.script.impl.ScriptPackageImpl#getScriptInterpreter()
		 * @generated
		 */
		EClass SCRIPT_INTERPRETER = eINSTANCE.getScriptInterpreter();

		/**
		 * The meta object literal for the '{@link base.script.impl.ScriptProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see base.script.impl.ScriptProcessorImpl
		 * @see base.script.impl.ScriptPackageImpl#getScriptProcessor()
		 * @generated
		 */
		EClass SCRIPT_PROCESSOR = eINSTANCE.getScriptProcessor();

		/**
		 * The meta object literal for the '<em><b>Img</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT_PROCESSOR__IMG = eINSTANCE.getScriptProcessor_Img();

		/**
		 * The meta object literal for the '<em><b>Ime</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT_PROCESSOR__IME = eINSTANCE.getScriptProcessor_Ime();

	}

} //ScriptPackage
