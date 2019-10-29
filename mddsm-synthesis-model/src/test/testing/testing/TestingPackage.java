/**
 */
package testing;

import metalang4md.Metalang4mdPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see testing.TestingFactory
 * @model kind="package"
 * @generated
 */
public interface TestingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "testing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.ufg.br/metalang4md/testing";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "testing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestingPackage eINSTANCE = testing.impl.TestingPackageImpl.init();

	/**
	 * The meta object id for the '{@link testing.impl.ClassItemImpl <em>Class Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testing.impl.ClassItemImpl
	 * @see testing.impl.TestingPackageImpl#getClassItem()
	 * @generated
	 */
	int CLASS_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ITEM__COMMAND_PRIORITY = Metalang4mdPackage.EITEM__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Arising Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ITEM__ARISING_BEHAVIOR = Metalang4mdPackage.EITEM__ARISING_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Attr Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ITEM__ATTR_INT = Metalang4mdPackage.EITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ITEM__ATTR_STRING = Metalang4mdPackage.EITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>By References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ITEM__BY_REFERENCES = Metalang4mdPackage.EITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>By Composition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ITEM__BY_COMPOSITION = Metalang4mdPackage.EITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Class Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ITEM_FEATURE_COUNT = Metalang4mdPackage.EITEM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Class Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ITEM_OPERATION_COUNT = Metalang4mdPackage.EITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link testing.impl.ClassActorImpl <em>Class Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testing.impl.ClassActorImpl
	 * @see testing.impl.TestingPackageImpl#getClassActor()
	 * @generated
	 */
	int CLASS_ACTOR = 1;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ACTOR__COMMAND_PRIORITY = Metalang4mdPackage.EACTOR__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Attr Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ACTOR__ATTR_INT = Metalang4mdPackage.EACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ACTOR__ATTR_STRING = Metalang4mdPackage.EACTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>By References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ACTOR__BY_REFERENCES = Metalang4mdPackage.EACTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>By Composition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ACTOR__BY_COMPOSITION = Metalang4mdPackage.EACTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Class Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ACTOR_FEATURE_COUNT = Metalang4mdPackage.EACTOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Class Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ACTOR_OPERATION_COUNT = Metalang4mdPackage.EACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link testing.impl.ClassTypeImpl <em>Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testing.impl.ClassTypeImpl
	 * @see testing.impl.TestingPackageImpl#getClassType()
	 * @generated
	 */
	int CLASS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__COMMAND_PRIORITY = Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__CARDINALITY = Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Interaction Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__INTERACTION_BEHAVIOR = Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__INTERACTION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Kind Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__KIND_INTERACTION = Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__KIND_INTERACTION;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__BINDING = Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE__BINDING;

	/**
	 * The feature id for the '<em><b>Attr Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__ATTR_INT = Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__ATTR_STRING = Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>By References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__BY_REFERENCES = Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>By Composition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__BY_COMPOSITION = Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE_FEATURE_COUNT = Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE_OPERATION_COUNT = Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link testing.impl.BaseClassImpl <em>Base Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testing.impl.BaseClassImpl
	 * @see testing.impl.TestingPackageImpl#getBaseClass()
	 * @generated
	 */
	int BASE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Attr Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CLASS__ATTR_INT = 0;

	/**
	 * The feature id for the '<em><b>Attr String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CLASS__ATTR_STRING = 1;

	/**
	 * The feature id for the '<em><b>By References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CLASS__BY_REFERENCES = 2;

	/**
	 * The feature id for the '<em><b>By Composition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CLASS__BY_COMPOSITION = 3;

	/**
	 * The number of structural features of the '<em>Base Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CLASS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Base Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link testing.impl.SandboxImpl <em>Sandbox</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testing.impl.SandboxImpl
	 * @see testing.impl.TestingPackageImpl#getSandbox()
	 * @generated
	 */
	int SANDBOX = 4;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANDBOX__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Sandbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANDBOX_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sandbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANDBOX_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link testing.ClassItem <em>Class Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Item</em>'.
	 * @see testing.ClassItem
	 * @generated
	 */
	EClass getClassItem();

	/**
	 * Returns the meta object for class '{@link testing.ClassActor <em>Class Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Actor</em>'.
	 * @see testing.ClassActor
	 * @generated
	 */
	EClass getClassActor();

	/**
	 * Returns the meta object for class '{@link testing.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Type</em>'.
	 * @see testing.ClassType
	 * @generated
	 */
	EClass getClassType();

	/**
	 * Returns the meta object for class '{@link testing.BaseClass <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Class</em>'.
	 * @see testing.BaseClass
	 * @generated
	 */
	EClass getBaseClass();

	/**
	 * Returns the meta object for the attribute '{@link testing.BaseClass#getAttrInt <em>Attr Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Int</em>'.
	 * @see testing.BaseClass#getAttrInt()
	 * @see #getBaseClass()
	 * @generated
	 */
	EAttribute getBaseClass_AttrInt();

	/**
	 * Returns the meta object for the attribute '{@link testing.BaseClass#getAttrString <em>Attr String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr String</em>'.
	 * @see testing.BaseClass#getAttrString()
	 * @see #getBaseClass()
	 * @generated
	 */
	EAttribute getBaseClass_AttrString();

	/**
	 * Returns the meta object for the reference list '{@link testing.BaseClass#getByReferences <em>By References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>By References</em>'.
	 * @see testing.BaseClass#getByReferences()
	 * @see #getBaseClass()
	 * @generated
	 */
	EReference getBaseClass_ByReferences();

	/**
	 * Returns the meta object for the containment reference list '{@link testing.BaseClass#getByComposition <em>By Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>By Composition</em>'.
	 * @see testing.BaseClass#getByComposition()
	 * @see #getBaseClass()
	 * @generated
	 */
	EReference getBaseClass_ByComposition();

	/**
	 * Returns the meta object for class '{@link testing.Sandbox <em>Sandbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sandbox</em>'.
	 * @see testing.Sandbox
	 * @generated
	 */
	EClass getSandbox();

	/**
	 * Returns the meta object for the containment reference list '{@link testing.Sandbox#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see testing.Sandbox#getElements()
	 * @see #getSandbox()
	 * @generated
	 */
	EReference getSandbox_Elements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestingFactory getTestingFactory();

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
		 * The meta object literal for the '{@link testing.impl.ClassItemImpl <em>Class Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testing.impl.ClassItemImpl
		 * @see testing.impl.TestingPackageImpl#getClassItem()
		 * @generated
		 */
		EClass CLASS_ITEM = eINSTANCE.getClassItem();

		/**
		 * The meta object literal for the '{@link testing.impl.ClassActorImpl <em>Class Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testing.impl.ClassActorImpl
		 * @see testing.impl.TestingPackageImpl#getClassActor()
		 * @generated
		 */
		EClass CLASS_ACTOR = eINSTANCE.getClassActor();

		/**
		 * The meta object literal for the '{@link testing.impl.ClassTypeImpl <em>Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testing.impl.ClassTypeImpl
		 * @see testing.impl.TestingPackageImpl#getClassType()
		 * @generated
		 */
		EClass CLASS_TYPE = eINSTANCE.getClassType();

		/**
		 * The meta object literal for the '{@link testing.impl.BaseClassImpl <em>Base Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testing.impl.BaseClassImpl
		 * @see testing.impl.TestingPackageImpl#getBaseClass()
		 * @generated
		 */
		EClass BASE_CLASS = eINSTANCE.getBaseClass();

		/**
		 * The meta object literal for the '<em><b>Attr Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_CLASS__ATTR_INT = eINSTANCE.getBaseClass_AttrInt();

		/**
		 * The meta object literal for the '<em><b>Attr String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_CLASS__ATTR_STRING = eINSTANCE.getBaseClass_AttrString();

		/**
		 * The meta object literal for the '<em><b>By References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_CLASS__BY_REFERENCES = eINSTANCE.getBaseClass_ByReferences();

		/**
		 * The meta object literal for the '<em><b>By Composition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_CLASS__BY_COMPOSITION = eINSTANCE.getBaseClass_ByComposition();

		/**
		 * The meta object literal for the '{@link testing.impl.SandboxImpl <em>Sandbox</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testing.impl.SandboxImpl
		 * @see testing.impl.TestingPackageImpl#getSandbox()
		 * @generated
		 */
		EClass SANDBOX = eINSTANCE.getSandbox();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SANDBOX__ELEMENTS = eINSTANCE.getSandbox_Elements();

	}

} //TestingPackage
