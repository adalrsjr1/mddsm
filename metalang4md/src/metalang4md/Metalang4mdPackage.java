/**
 */
package metalang4md;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

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
 * @see metalang4md.Metalang4mdFactory
 * @model kind="package"
 * @generated
 */
public interface Metalang4mdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metalang4md";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.ufg.br/metalang4md";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ml4md";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Metalang4mdPackage eINSTANCE = metalang4md.impl.Metalang4mdPackageImpl.init();

	/**
	 * The meta object id for the '{@link metalang4md.impl.EDomainSpecificElementImpl <em>EDomain Specific Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metalang4md.impl.EDomainSpecificElementImpl
	 * @see metalang4md.impl.Metalang4mdPackageImpl#getEDomainSpecificElement()
	 * @generated
	 */
	int EDOMAIN_SPECIFIC_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__EANNOTATIONS = EcorePackage.ECLASS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__NAME = EcorePackage.ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__INSTANCE_CLASS_NAME = EcorePackage.ECLASS__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__INSTANCE_CLASS = EcorePackage.ECLASS__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__DEFAULT_VALUE = EcorePackage.ECLASS__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__INSTANCE_TYPE_NAME = EcorePackage.ECLASS__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__EPACKAGE = EcorePackage.ECLASS__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__ETYPE_PARAMETERS = EcorePackage.ECLASS__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__ABSTRACT = EcorePackage.ECLASS__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__INTERFACE = EcorePackage.ECLASS__INTERFACE;

	/**
	 * The feature id for the '<em><b>ESuper Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__ESUPER_TYPES = EcorePackage.ECLASS__ESUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__EOPERATIONS = EcorePackage.ECLASS__EOPERATIONS;

	/**
	 * The feature id for the '<em><b>EAll Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__EALL_ATTRIBUTES = EcorePackage.ECLASS__EALL_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>EAll References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__EALL_REFERENCES = EcorePackage.ECLASS__EALL_REFERENCES;

	/**
	 * The feature id for the '<em><b>EReferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__EREFERENCES = EcorePackage.ECLASS__EREFERENCES;

	/**
	 * The feature id for the '<em><b>EAttributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__EATTRIBUTES = EcorePackage.ECLASS__EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>EAll Containments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__EALL_CONTAINMENTS = EcorePackage.ECLASS__EALL_CONTAINMENTS;

	/**
	 * The feature id for the '<em><b>EAll Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__EALL_OPERATIONS = EcorePackage.ECLASS__EALL_OPERATIONS;

	/**
	 * The feature id for the '<em><b>EAll Structural Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__EALL_STRUCTURAL_FEATURES = EcorePackage.ECLASS__EALL_STRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>EAll Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__EALL_SUPER_TYPES = EcorePackage.ECLASS__EALL_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EID Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__EID_ATTRIBUTE = EcorePackage.ECLASS__EID_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>EStructural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__ESTRUCTURAL_FEATURES = EcorePackage.ECLASS__ESTRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>EGeneric Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__EGENERIC_SUPER_TYPES = EcorePackage.ECLASS__EGENERIC_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EAll Generic Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__EALL_GENERIC_SUPER_TYPES = EcorePackage.ECLASS__EALL_GENERIC_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EDomain Specific Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__EDOMAIN_SPECIFIC_PROPERTY = EcorePackage.ECLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EInteractions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__EINTERACTIONS = EcorePackage.ECLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EDomain Specific Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT_FEATURE_COUNT = EcorePackage.ECLASS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT___GET_EANNOTATION__STRING = EcorePackage.ECLASS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT___IS_INSTANCE__OBJECT = EcorePackage.ECLASS___IS_INSTANCE__OBJECT;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT___GET_CLASSIFIER_ID = EcorePackage.ECLASS___GET_CLASSIFIER_ID;

	/**
	 * The operation id for the '<em>Is Super Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT___IS_SUPER_TYPE_OF__ECLASS = EcorePackage.ECLASS___IS_SUPER_TYPE_OF__ECLASS;

	/**
	 * The operation id for the '<em>Get Feature Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT___GET_FEATURE_COUNT = EcorePackage.ECLASS___GET_FEATURE_COUNT;

	/**
	 * The operation id for the '<em>Get EStructural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT___GET_ESTRUCTURAL_FEATURE__INT = EcorePackage.ECLASS___GET_ESTRUCTURAL_FEATURE__INT;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT___GET_FEATURE_ID__ESTRUCTURALFEATURE = EcorePackage.ECLASS___GET_FEATURE_ID__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Get EStructural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT___GET_ESTRUCTURAL_FEATURE__STRING = EcorePackage.ECLASS___GET_ESTRUCTURAL_FEATURE__STRING;

	/**
	 * The operation id for the '<em>Get Operation Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT___GET_OPERATION_COUNT = EcorePackage.ECLASS___GET_OPERATION_COUNT;

	/**
	 * The operation id for the '<em>Get EOperation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT___GET_EOPERATION__INT = EcorePackage.ECLASS___GET_EOPERATION__INT;

	/**
	 * The operation id for the '<em>Get Operation ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT___GET_OPERATION_ID__EOPERATION = EcorePackage.ECLASS___GET_OPERATION_ID__EOPERATION;

	/**
	 * The operation id for the '<em>Get Override</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT___GET_OVERRIDE__EOPERATION = EcorePackage.ECLASS___GET_OVERRIDE__EOPERATION;

	/**
	 * The operation id for the '<em>Get Feature Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT___GET_FEATURE_TYPE__ESTRUCTURALFEATURE = EcorePackage.ECLASS___GET_FEATURE_TYPE__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>EDomain Specific Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT_OPERATION_COUNT = EcorePackage.ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metalang4md.impl.EActorImpl <em>EActor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metalang4md.impl.EActorImpl
	 * @see metalang4md.impl.Metalang4mdPackageImpl#getEActor()
	 * @generated
	 */
	int EACTOR = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__EANNOTATIONS = EDOMAIN_SPECIFIC_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__NAME = EDOMAIN_SPECIFIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__INSTANCE_CLASS_NAME = EDOMAIN_SPECIFIC_ELEMENT__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__INSTANCE_CLASS = EDOMAIN_SPECIFIC_ELEMENT__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__DEFAULT_VALUE = EDOMAIN_SPECIFIC_ELEMENT__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__INSTANCE_TYPE_NAME = EDOMAIN_SPECIFIC_ELEMENT__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__EPACKAGE = EDOMAIN_SPECIFIC_ELEMENT__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__ETYPE_PARAMETERS = EDOMAIN_SPECIFIC_ELEMENT__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__ABSTRACT = EDOMAIN_SPECIFIC_ELEMENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__INTERFACE = EDOMAIN_SPECIFIC_ELEMENT__INTERFACE;

	/**
	 * The feature id for the '<em><b>ESuper Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__ESUPER_TYPES = EDOMAIN_SPECIFIC_ELEMENT__ESUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__EOPERATIONS = EDOMAIN_SPECIFIC_ELEMENT__EOPERATIONS;

	/**
	 * The feature id for the '<em><b>EAll Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__EALL_ATTRIBUTES = EDOMAIN_SPECIFIC_ELEMENT__EALL_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>EAll References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__EALL_REFERENCES = EDOMAIN_SPECIFIC_ELEMENT__EALL_REFERENCES;

	/**
	 * The feature id for the '<em><b>EReferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__EREFERENCES = EDOMAIN_SPECIFIC_ELEMENT__EREFERENCES;

	/**
	 * The feature id for the '<em><b>EAttributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__EATTRIBUTES = EDOMAIN_SPECIFIC_ELEMENT__EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>EAll Containments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__EALL_CONTAINMENTS = EDOMAIN_SPECIFIC_ELEMENT__EALL_CONTAINMENTS;

	/**
	 * The feature id for the '<em><b>EAll Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__EALL_OPERATIONS = EDOMAIN_SPECIFIC_ELEMENT__EALL_OPERATIONS;

	/**
	 * The feature id for the '<em><b>EAll Structural Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__EALL_STRUCTURAL_FEATURES = EDOMAIN_SPECIFIC_ELEMENT__EALL_STRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>EAll Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__EALL_SUPER_TYPES = EDOMAIN_SPECIFIC_ELEMENT__EALL_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EID Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__EID_ATTRIBUTE = EDOMAIN_SPECIFIC_ELEMENT__EID_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>EStructural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__ESTRUCTURAL_FEATURES = EDOMAIN_SPECIFIC_ELEMENT__ESTRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>EGeneric Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__EGENERIC_SUPER_TYPES = EDOMAIN_SPECIFIC_ELEMENT__EGENERIC_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EAll Generic Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__EALL_GENERIC_SUPER_TYPES = EDOMAIN_SPECIFIC_ELEMENT__EALL_GENERIC_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EDomain Specific Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__EDOMAIN_SPECIFIC_PROPERTY = EDOMAIN_SPECIFIC_ELEMENT__EDOMAIN_SPECIFIC_PROPERTY;

	/**
	 * The feature id for the '<em><b>EInteractions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__EINTERACTIONS = EDOMAIN_SPECIFIC_ELEMENT__EINTERACTIONS;

	/**
	 * The number of structural features of the '<em>EActor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR_FEATURE_COUNT = EDOMAIN_SPECIFIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR___GET_EANNOTATION__STRING = EDOMAIN_SPECIFIC_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR___IS_INSTANCE__OBJECT = EDOMAIN_SPECIFIC_ELEMENT___IS_INSTANCE__OBJECT;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR___GET_CLASSIFIER_ID = EDOMAIN_SPECIFIC_ELEMENT___GET_CLASSIFIER_ID;

	/**
	 * The operation id for the '<em>Is Super Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR___IS_SUPER_TYPE_OF__ECLASS = EDOMAIN_SPECIFIC_ELEMENT___IS_SUPER_TYPE_OF__ECLASS;

	/**
	 * The operation id for the '<em>Get Feature Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR___GET_FEATURE_COUNT = EDOMAIN_SPECIFIC_ELEMENT___GET_FEATURE_COUNT;

	/**
	 * The operation id for the '<em>Get EStructural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR___GET_ESTRUCTURAL_FEATURE__INT = EDOMAIN_SPECIFIC_ELEMENT___GET_ESTRUCTURAL_FEATURE__INT;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR___GET_FEATURE_ID__ESTRUCTURALFEATURE = EDOMAIN_SPECIFIC_ELEMENT___GET_FEATURE_ID__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Get EStructural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR___GET_ESTRUCTURAL_FEATURE__STRING = EDOMAIN_SPECIFIC_ELEMENT___GET_ESTRUCTURAL_FEATURE__STRING;

	/**
	 * The operation id for the '<em>Get Operation Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR___GET_OPERATION_COUNT = EDOMAIN_SPECIFIC_ELEMENT___GET_OPERATION_COUNT;

	/**
	 * The operation id for the '<em>Get EOperation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR___GET_EOPERATION__INT = EDOMAIN_SPECIFIC_ELEMENT___GET_EOPERATION__INT;

	/**
	 * The operation id for the '<em>Get Operation ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR___GET_OPERATION_ID__EOPERATION = EDOMAIN_SPECIFIC_ELEMENT___GET_OPERATION_ID__EOPERATION;

	/**
	 * The operation id for the '<em>Get Override</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR___GET_OVERRIDE__EOPERATION = EDOMAIN_SPECIFIC_ELEMENT___GET_OVERRIDE__EOPERATION;

	/**
	 * The operation id for the '<em>Get Feature Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR___GET_FEATURE_TYPE__ESTRUCTURALFEATURE = EDOMAIN_SPECIFIC_ELEMENT___GET_FEATURE_TYPE__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>EActor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR_OPERATION_COUNT = EDOMAIN_SPECIFIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metalang4md.impl.EItemImpl <em>EItem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metalang4md.impl.EItemImpl
	 * @see metalang4md.impl.Metalang4mdPackageImpl#getEItem()
	 * @generated
	 */
	int EITEM = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__EANNOTATIONS = EDOMAIN_SPECIFIC_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__NAME = EDOMAIN_SPECIFIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__INSTANCE_CLASS_NAME = EDOMAIN_SPECIFIC_ELEMENT__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__INSTANCE_CLASS = EDOMAIN_SPECIFIC_ELEMENT__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__DEFAULT_VALUE = EDOMAIN_SPECIFIC_ELEMENT__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__INSTANCE_TYPE_NAME = EDOMAIN_SPECIFIC_ELEMENT__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__EPACKAGE = EDOMAIN_SPECIFIC_ELEMENT__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__ETYPE_PARAMETERS = EDOMAIN_SPECIFIC_ELEMENT__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__ABSTRACT = EDOMAIN_SPECIFIC_ELEMENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__INTERFACE = EDOMAIN_SPECIFIC_ELEMENT__INTERFACE;

	/**
	 * The feature id for the '<em><b>ESuper Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__ESUPER_TYPES = EDOMAIN_SPECIFIC_ELEMENT__ESUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__EOPERATIONS = EDOMAIN_SPECIFIC_ELEMENT__EOPERATIONS;

	/**
	 * The feature id for the '<em><b>EAll Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__EALL_ATTRIBUTES = EDOMAIN_SPECIFIC_ELEMENT__EALL_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>EAll References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__EALL_REFERENCES = EDOMAIN_SPECIFIC_ELEMENT__EALL_REFERENCES;

	/**
	 * The feature id for the '<em><b>EReferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__EREFERENCES = EDOMAIN_SPECIFIC_ELEMENT__EREFERENCES;

	/**
	 * The feature id for the '<em><b>EAttributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__EATTRIBUTES = EDOMAIN_SPECIFIC_ELEMENT__EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>EAll Containments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__EALL_CONTAINMENTS = EDOMAIN_SPECIFIC_ELEMENT__EALL_CONTAINMENTS;

	/**
	 * The feature id for the '<em><b>EAll Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__EALL_OPERATIONS = EDOMAIN_SPECIFIC_ELEMENT__EALL_OPERATIONS;

	/**
	 * The feature id for the '<em><b>EAll Structural Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__EALL_STRUCTURAL_FEATURES = EDOMAIN_SPECIFIC_ELEMENT__EALL_STRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>EAll Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__EALL_SUPER_TYPES = EDOMAIN_SPECIFIC_ELEMENT__EALL_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EID Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__EID_ATTRIBUTE = EDOMAIN_SPECIFIC_ELEMENT__EID_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>EStructural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__ESTRUCTURAL_FEATURES = EDOMAIN_SPECIFIC_ELEMENT__ESTRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>EGeneric Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__EGENERIC_SUPER_TYPES = EDOMAIN_SPECIFIC_ELEMENT__EGENERIC_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EAll Generic Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__EALL_GENERIC_SUPER_TYPES = EDOMAIN_SPECIFIC_ELEMENT__EALL_GENERIC_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EDomain Specific Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__EDOMAIN_SPECIFIC_PROPERTY = EDOMAIN_SPECIFIC_ELEMENT__EDOMAIN_SPECIFIC_PROPERTY;

	/**
	 * The feature id for the '<em><b>EInteractions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__EINTERACTIONS = EDOMAIN_SPECIFIC_ELEMENT__EINTERACTIONS;

	/**
	 * The feature id for the '<em><b>Arising Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__ARISING_BEHAVIOR = EDOMAIN_SPECIFIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EItem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM_FEATURE_COUNT = EDOMAIN_SPECIFIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM___GET_EANNOTATION__STRING = EDOMAIN_SPECIFIC_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM___IS_INSTANCE__OBJECT = EDOMAIN_SPECIFIC_ELEMENT___IS_INSTANCE__OBJECT;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM___GET_CLASSIFIER_ID = EDOMAIN_SPECIFIC_ELEMENT___GET_CLASSIFIER_ID;

	/**
	 * The operation id for the '<em>Is Super Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM___IS_SUPER_TYPE_OF__ECLASS = EDOMAIN_SPECIFIC_ELEMENT___IS_SUPER_TYPE_OF__ECLASS;

	/**
	 * The operation id for the '<em>Get Feature Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM___GET_FEATURE_COUNT = EDOMAIN_SPECIFIC_ELEMENT___GET_FEATURE_COUNT;

	/**
	 * The operation id for the '<em>Get EStructural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM___GET_ESTRUCTURAL_FEATURE__INT = EDOMAIN_SPECIFIC_ELEMENT___GET_ESTRUCTURAL_FEATURE__INT;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM___GET_FEATURE_ID__ESTRUCTURALFEATURE = EDOMAIN_SPECIFIC_ELEMENT___GET_FEATURE_ID__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Get EStructural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM___GET_ESTRUCTURAL_FEATURE__STRING = EDOMAIN_SPECIFIC_ELEMENT___GET_ESTRUCTURAL_FEATURE__STRING;

	/**
	 * The operation id for the '<em>Get Operation Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM___GET_OPERATION_COUNT = EDOMAIN_SPECIFIC_ELEMENT___GET_OPERATION_COUNT;

	/**
	 * The operation id for the '<em>Get EOperation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM___GET_EOPERATION__INT = EDOMAIN_SPECIFIC_ELEMENT___GET_EOPERATION__INT;

	/**
	 * The operation id for the '<em>Get Operation ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM___GET_OPERATION_ID__EOPERATION = EDOMAIN_SPECIFIC_ELEMENT___GET_OPERATION_ID__EOPERATION;

	/**
	 * The operation id for the '<em>Get Override</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM___GET_OVERRIDE__EOPERATION = EDOMAIN_SPECIFIC_ELEMENT___GET_OVERRIDE__EOPERATION;

	/**
	 * The operation id for the '<em>Get Feature Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM___GET_FEATURE_TYPE__ESTRUCTURALFEATURE = EDOMAIN_SPECIFIC_ELEMENT___GET_FEATURE_TYPE__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>EItem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM_OPERATION_COUNT = EDOMAIN_SPECIFIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metalang4md.impl.EInteractionImpl <em>EInteraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metalang4md.impl.EInteractionImpl
	 * @see metalang4md.impl.Metalang4mdPackageImpl#getEInteraction()
	 * @generated
	 */
	int EINTERACTION = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__EANNOTATIONS = EcorePackage.EREFERENCE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__NAME = EcorePackage.EREFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__ORDERED = EcorePackage.EREFERENCE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__UNIQUE = EcorePackage.EREFERENCE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__LOWER_BOUND = EcorePackage.EREFERENCE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__UPPER_BOUND = EcorePackage.EREFERENCE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__MANY = EcorePackage.EREFERENCE__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__REQUIRED = EcorePackage.EREFERENCE__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__ETYPE = EcorePackage.EREFERENCE__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__EGENERIC_TYPE = EcorePackage.EREFERENCE__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__CHANGEABLE = EcorePackage.EREFERENCE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__VOLATILE = EcorePackage.EREFERENCE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__TRANSIENT = EcorePackage.EREFERENCE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__DEFAULT_VALUE_LITERAL = EcorePackage.EREFERENCE__DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__DEFAULT_VALUE = EcorePackage.EREFERENCE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__UNSETTABLE = EcorePackage.EREFERENCE__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__DERIVED = EcorePackage.EREFERENCE__DERIVED;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__ECONTAINING_CLASS = EcorePackage.EREFERENCE__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__CONTAINMENT = EcorePackage.EREFERENCE__CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__CONTAINER = EcorePackage.EREFERENCE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Resolve Proxies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__RESOLVE_PROXIES = EcorePackage.EREFERENCE__RESOLVE_PROXIES;

	/**
	 * The feature id for the '<em><b>EOpposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__EOPPOSITE = EcorePackage.EREFERENCE__EOPPOSITE;

	/**
	 * The feature id for the '<em><b>EReference Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__EREFERENCE_TYPE = EcorePackage.EREFERENCE__EREFERENCE_TYPE;

	/**
	 * The feature id for the '<em><b>EKeys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__EKEYS = EcorePackage.EREFERENCE__EKEYS;

	/**
	 * The feature id for the '<em><b>Interaction Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__INTERACTION_BEHAVIOR = EcorePackage.EREFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__KIND_INTERACTION = EcorePackage.EREFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EInteraction Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__EINTERACTION_TYPE = EcorePackage.EREFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION__TARGET_CARDINALITY = EcorePackage.EREFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EInteraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION_FEATURE_COUNT = EcorePackage.EREFERENCE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION___GET_EANNOTATION__STRING = EcorePackage.EREFERENCE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION___GET_FEATURE_ID = EcorePackage.EREFERENCE___GET_FEATURE_ID;

	/**
	 * The operation id for the '<em>Get Container Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION___GET_CONTAINER_CLASS = EcorePackage.EREFERENCE___GET_CONTAINER_CLASS;

	/**
	 * The number of operations of the '<em>EInteraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINTERACTION_OPERATION_COUNT = EcorePackage.EREFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metalang4md.impl.EDomainSpecificTypeImpl <em>EDomain Specific Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metalang4md.impl.EDomainSpecificTypeImpl
	 * @see metalang4md.impl.Metalang4mdPackageImpl#getEDomainSpecificType()
	 * @generated
	 */
	int EDOMAIN_SPECIFIC_TYPE = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__EANNOTATIONS = EDOMAIN_SPECIFIC_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__NAME = EDOMAIN_SPECIFIC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__INSTANCE_CLASS_NAME = EDOMAIN_SPECIFIC_ELEMENT__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__INSTANCE_CLASS = EDOMAIN_SPECIFIC_ELEMENT__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__DEFAULT_VALUE = EDOMAIN_SPECIFIC_ELEMENT__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__INSTANCE_TYPE_NAME = EDOMAIN_SPECIFIC_ELEMENT__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__EPACKAGE = EDOMAIN_SPECIFIC_ELEMENT__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__ETYPE_PARAMETERS = EDOMAIN_SPECIFIC_ELEMENT__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__ABSTRACT = EDOMAIN_SPECIFIC_ELEMENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__INTERFACE = EDOMAIN_SPECIFIC_ELEMENT__INTERFACE;

	/**
	 * The feature id for the '<em><b>ESuper Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__ESUPER_TYPES = EDOMAIN_SPECIFIC_ELEMENT__ESUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__EOPERATIONS = EDOMAIN_SPECIFIC_ELEMENT__EOPERATIONS;

	/**
	 * The feature id for the '<em><b>EAll Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__EALL_ATTRIBUTES = EDOMAIN_SPECIFIC_ELEMENT__EALL_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>EAll References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__EALL_REFERENCES = EDOMAIN_SPECIFIC_ELEMENT__EALL_REFERENCES;

	/**
	 * The feature id for the '<em><b>EReferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__EREFERENCES = EDOMAIN_SPECIFIC_ELEMENT__EREFERENCES;

	/**
	 * The feature id for the '<em><b>EAttributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__EATTRIBUTES = EDOMAIN_SPECIFIC_ELEMENT__EATTRIBUTES;

	/**
	 * The feature id for the '<em><b>EAll Containments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__EALL_CONTAINMENTS = EDOMAIN_SPECIFIC_ELEMENT__EALL_CONTAINMENTS;

	/**
	 * The feature id for the '<em><b>EAll Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__EALL_OPERATIONS = EDOMAIN_SPECIFIC_ELEMENT__EALL_OPERATIONS;

	/**
	 * The feature id for the '<em><b>EAll Structural Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__EALL_STRUCTURAL_FEATURES = EDOMAIN_SPECIFIC_ELEMENT__EALL_STRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>EAll Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__EALL_SUPER_TYPES = EDOMAIN_SPECIFIC_ELEMENT__EALL_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EID Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__EID_ATTRIBUTE = EDOMAIN_SPECIFIC_ELEMENT__EID_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>EStructural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__ESTRUCTURAL_FEATURES = EDOMAIN_SPECIFIC_ELEMENT__ESTRUCTURAL_FEATURES;

	/**
	 * The feature id for the '<em><b>EGeneric Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__EGENERIC_SUPER_TYPES = EDOMAIN_SPECIFIC_ELEMENT__EGENERIC_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EAll Generic Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__EALL_GENERIC_SUPER_TYPES = EDOMAIN_SPECIFIC_ELEMENT__EALL_GENERIC_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>EDomain Specific Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__EDOMAIN_SPECIFIC_PROPERTY = EDOMAIN_SPECIFIC_ELEMENT__EDOMAIN_SPECIFIC_PROPERTY;

	/**
	 * The feature id for the '<em><b>EInteractions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__EINTERACTIONS = EDOMAIN_SPECIFIC_ELEMENT__EINTERACTIONS;

	/**
	 * The number of structural features of the '<em>EDomain Specific Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT = EDOMAIN_SPECIFIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE___GET_EANNOTATION__STRING = EDOMAIN_SPECIFIC_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE___IS_INSTANCE__OBJECT = EDOMAIN_SPECIFIC_ELEMENT___IS_INSTANCE__OBJECT;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE___GET_CLASSIFIER_ID = EDOMAIN_SPECIFIC_ELEMENT___GET_CLASSIFIER_ID;

	/**
	 * The operation id for the '<em>Is Super Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE___IS_SUPER_TYPE_OF__ECLASS = EDOMAIN_SPECIFIC_ELEMENT___IS_SUPER_TYPE_OF__ECLASS;

	/**
	 * The operation id for the '<em>Get Feature Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE___GET_FEATURE_COUNT = EDOMAIN_SPECIFIC_ELEMENT___GET_FEATURE_COUNT;

	/**
	 * The operation id for the '<em>Get EStructural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE___GET_ESTRUCTURAL_FEATURE__INT = EDOMAIN_SPECIFIC_ELEMENT___GET_ESTRUCTURAL_FEATURE__INT;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE___GET_FEATURE_ID__ESTRUCTURALFEATURE = EDOMAIN_SPECIFIC_ELEMENT___GET_FEATURE_ID__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Get EStructural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE___GET_ESTRUCTURAL_FEATURE__STRING = EDOMAIN_SPECIFIC_ELEMENT___GET_ESTRUCTURAL_FEATURE__STRING;

	/**
	 * The operation id for the '<em>Get Operation Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE___GET_OPERATION_COUNT = EDOMAIN_SPECIFIC_ELEMENT___GET_OPERATION_COUNT;

	/**
	 * The operation id for the '<em>Get EOperation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE___GET_EOPERATION__INT = EDOMAIN_SPECIFIC_ELEMENT___GET_EOPERATION__INT;

	/**
	 * The operation id for the '<em>Get Operation ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE___GET_OPERATION_ID__EOPERATION = EDOMAIN_SPECIFIC_ELEMENT___GET_OPERATION_ID__EOPERATION;

	/**
	 * The operation id for the '<em>Get Override</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE___GET_OVERRIDE__EOPERATION = EDOMAIN_SPECIFIC_ELEMENT___GET_OVERRIDE__EOPERATION;

	/**
	 * The operation id for the '<em>Get Feature Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE___GET_FEATURE_TYPE__ESTRUCTURALFEATURE = EDOMAIN_SPECIFIC_ELEMENT___GET_FEATURE_TYPE__ESTRUCTURALFEATURE;

	/**
	 * The number of operations of the '<em>EDomain Specific Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE_OPERATION_COUNT = EDOMAIN_SPECIFIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metalang4md.impl.EDomainSpecificPackageImpl <em>EDomain Specific Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metalang4md.impl.EDomainSpecificPackageImpl
	 * @see metalang4md.impl.Metalang4mdPackageImpl#getEDomainSpecificPackage()
	 * @generated
	 */
	int EDOMAIN_SPECIFIC_PACKAGE = 5;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PACKAGE__EANNOTATIONS = EcorePackage.EPACKAGE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PACKAGE__NAME = EcorePackage.EPACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PACKAGE__NS_URI = EcorePackage.EPACKAGE__NS_URI;

	/**
	 * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PACKAGE__NS_PREFIX = EcorePackage.EPACKAGE__NS_PREFIX;

	/**
	 * The feature id for the '<em><b>EFactory Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PACKAGE__EFACTORY_INSTANCE = EcorePackage.EPACKAGE__EFACTORY_INSTANCE;

	/**
	 * The feature id for the '<em><b>EClassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PACKAGE__ECLASSIFIERS = EcorePackage.EPACKAGE__ECLASSIFIERS;

	/**
	 * The feature id for the '<em><b>ESubpackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PACKAGE__ESUBPACKAGES = EcorePackage.EPACKAGE__ESUBPACKAGES;

	/**
	 * The feature id for the '<em><b>ESuper Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PACKAGE__ESUPER_PACKAGE = EcorePackage.EPACKAGE__ESUPER_PACKAGE;

	/**
	 * The number of structural features of the '<em>EDomain Specific Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PACKAGE_FEATURE_COUNT = EcorePackage.EPACKAGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PACKAGE___GET_EANNOTATION__STRING = EcorePackage.EPACKAGE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get EClassifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PACKAGE___GET_ECLASSIFIER__STRING = EcorePackage.EPACKAGE___GET_ECLASSIFIER__STRING;

	/**
	 * The number of operations of the '<em>EDomain Specific Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PACKAGE_OPERATION_COUNT = EcorePackage.EPACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metalang4md.impl.EDomainSpecificPropertyImpl <em>EDomain Specific Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metalang4md.impl.EDomainSpecificPropertyImpl
	 * @see metalang4md.impl.Metalang4mdPackageImpl#getEDomainSpecificProperty()
	 * @generated
	 */
	int EDOMAIN_SPECIFIC_PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PROPERTY__EANNOTATIONS = EcorePackage.ETYPED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PROPERTY__NAME = EcorePackage.ETYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PROPERTY__ORDERED = EcorePackage.ETYPED_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PROPERTY__UNIQUE = EcorePackage.ETYPED_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PROPERTY__LOWER_BOUND = EcorePackage.ETYPED_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PROPERTY__UPPER_BOUND = EcorePackage.ETYPED_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PROPERTY__MANY = EcorePackage.ETYPED_ELEMENT__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PROPERTY__REQUIRED = EcorePackage.ETYPED_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PROPERTY__ETYPE = EcorePackage.ETYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PROPERTY__EGENERIC_TYPE = EcorePackage.ETYPED_ELEMENT__EGENERIC_TYPE;

	/**
	 * The number of structural features of the '<em>EDomain Specific Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PROPERTY_FEATURE_COUNT = EcorePackage.ETYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PROPERTY___GET_EANNOTATION__STRING = EcorePackage.ETYPED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>EDomain Specific Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_PROPERTY_OPERATION_COUNT = EcorePackage.ETYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metalang4md.impl.EComposablePropertyImpl <em>EComposable Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metalang4md.impl.EComposablePropertyImpl
	 * @see metalang4md.impl.Metalang4mdPackageImpl#getEComposableProperty()
	 * @generated
	 */
	int ECOMPOSABLE_PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSABLE_PROPERTY__EANNOTATIONS = EDOMAIN_SPECIFIC_PROPERTY__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSABLE_PROPERTY__NAME = EDOMAIN_SPECIFIC_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSABLE_PROPERTY__ORDERED = EDOMAIN_SPECIFIC_PROPERTY__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSABLE_PROPERTY__UNIQUE = EDOMAIN_SPECIFIC_PROPERTY__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSABLE_PROPERTY__LOWER_BOUND = EDOMAIN_SPECIFIC_PROPERTY__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSABLE_PROPERTY__UPPER_BOUND = EDOMAIN_SPECIFIC_PROPERTY__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSABLE_PROPERTY__MANY = EDOMAIN_SPECIFIC_PROPERTY__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSABLE_PROPERTY__REQUIRED = EDOMAIN_SPECIFIC_PROPERTY__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSABLE_PROPERTY__ETYPE = EDOMAIN_SPECIFIC_PROPERTY__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSABLE_PROPERTY__EGENERIC_TYPE = EDOMAIN_SPECIFIC_PROPERTY__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>ESub Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSABLE_PROPERTY__ESUB_PROPERTY = EDOMAIN_SPECIFIC_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EComposable Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSABLE_PROPERTY_FEATURE_COUNT = EDOMAIN_SPECIFIC_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSABLE_PROPERTY___GET_EANNOTATION__STRING = EDOMAIN_SPECIFIC_PROPERTY___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>EComposable Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSABLE_PROPERTY_OPERATION_COUNT = EDOMAIN_SPECIFIC_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metalang4md.impl.ELeafPropertyImpl <em>ELeaf Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metalang4md.impl.ELeafPropertyImpl
	 * @see metalang4md.impl.Metalang4mdPackageImpl#getELeafProperty()
	 * @generated
	 */
	int ELEAF_PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEAF_PROPERTY__EANNOTATIONS = EDOMAIN_SPECIFIC_PROPERTY__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEAF_PROPERTY__NAME = EDOMAIN_SPECIFIC_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEAF_PROPERTY__ORDERED = EDOMAIN_SPECIFIC_PROPERTY__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEAF_PROPERTY__UNIQUE = EDOMAIN_SPECIFIC_PROPERTY__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEAF_PROPERTY__LOWER_BOUND = EDOMAIN_SPECIFIC_PROPERTY__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEAF_PROPERTY__UPPER_BOUND = EDOMAIN_SPECIFIC_PROPERTY__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEAF_PROPERTY__MANY = EDOMAIN_SPECIFIC_PROPERTY__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEAF_PROPERTY__REQUIRED = EDOMAIN_SPECIFIC_PROPERTY__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEAF_PROPERTY__ETYPE = EDOMAIN_SPECIFIC_PROPERTY__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEAF_PROPERTY__EGENERIC_TYPE = EDOMAIN_SPECIFIC_PROPERTY__EGENERIC_TYPE;

	/**
	 * The number of structural features of the '<em>ELeaf Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEAF_PROPERTY_FEATURE_COUNT = EDOMAIN_SPECIFIC_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEAF_PROPERTY___GET_EANNOTATION__STRING = EDOMAIN_SPECIFIC_PROPERTY___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>ELeaf Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEAF_PROPERTY_OPERATION_COUNT = EDOMAIN_SPECIFIC_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metalang4md.impl.ECompositionInteractionImpl <em>EComposition Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metalang4md.impl.ECompositionInteractionImpl
	 * @see metalang4md.impl.Metalang4mdPackageImpl#getECompositionInteraction()
	 * @generated
	 */
	int ECOMPOSITION_INTERACTION = 9;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__EANNOTATIONS = EINTERACTION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__NAME = EINTERACTION__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__ORDERED = EINTERACTION__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__UNIQUE = EINTERACTION__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__LOWER_BOUND = EINTERACTION__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__UPPER_BOUND = EINTERACTION__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__MANY = EINTERACTION__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__REQUIRED = EINTERACTION__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__ETYPE = EINTERACTION__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__EGENERIC_TYPE = EINTERACTION__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__CHANGEABLE = EINTERACTION__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__VOLATILE = EINTERACTION__VOLATILE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__TRANSIENT = EINTERACTION__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__DEFAULT_VALUE_LITERAL = EINTERACTION__DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__DEFAULT_VALUE = EINTERACTION__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__UNSETTABLE = EINTERACTION__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__DERIVED = EINTERACTION__DERIVED;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__ECONTAINING_CLASS = EINTERACTION__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__CONTAINMENT = EINTERACTION__CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__CONTAINER = EINTERACTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Resolve Proxies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__RESOLVE_PROXIES = EINTERACTION__RESOLVE_PROXIES;

	/**
	 * The feature id for the '<em><b>EOpposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__EOPPOSITE = EINTERACTION__EOPPOSITE;

	/**
	 * The feature id for the '<em><b>EReference Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__EREFERENCE_TYPE = EINTERACTION__EREFERENCE_TYPE;

	/**
	 * The feature id for the '<em><b>EKeys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__EKEYS = EINTERACTION__EKEYS;

	/**
	 * The feature id for the '<em><b>Interaction Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__INTERACTION_BEHAVIOR = EINTERACTION__INTERACTION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Kind Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__KIND_INTERACTION = EINTERACTION__KIND_INTERACTION;

	/**
	 * The feature id for the '<em><b>EInteraction Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__EINTERACTION_TYPE = EINTERACTION__EINTERACTION_TYPE;

	/**
	 * The feature id for the '<em><b>Target Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION__TARGET_CARDINALITY = EINTERACTION__TARGET_CARDINALITY;

	/**
	 * The number of structural features of the '<em>EComposition Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION_FEATURE_COUNT = EINTERACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION___GET_EANNOTATION__STRING = EINTERACTION___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION___GET_FEATURE_ID = EINTERACTION___GET_FEATURE_ID;

	/**
	 * The operation id for the '<em>Get Container Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION___GET_CONTAINER_CLASS = EINTERACTION___GET_CONTAINER_CLASS;

	/**
	 * The number of operations of the '<em>EComposition Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPOSITION_INTERACTION_OPERATION_COUNT = EINTERACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metalang4md.impl.EBindinginteractionImpl <em>EBindinginteraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metalang4md.impl.EBindinginteractionImpl
	 * @see metalang4md.impl.Metalang4mdPackageImpl#getEBindinginteraction()
	 * @generated
	 */
	int EBINDINGINTERACTION = 10;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__EANNOTATIONS = EINTERACTION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__NAME = EINTERACTION__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__ORDERED = EINTERACTION__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__UNIQUE = EINTERACTION__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__LOWER_BOUND = EINTERACTION__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__UPPER_BOUND = EINTERACTION__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__MANY = EINTERACTION__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__REQUIRED = EINTERACTION__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__ETYPE = EINTERACTION__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__EGENERIC_TYPE = EINTERACTION__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__CHANGEABLE = EINTERACTION__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__VOLATILE = EINTERACTION__VOLATILE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__TRANSIENT = EINTERACTION__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__DEFAULT_VALUE_LITERAL = EINTERACTION__DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__DEFAULT_VALUE = EINTERACTION__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__UNSETTABLE = EINTERACTION__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__DERIVED = EINTERACTION__DERIVED;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__ECONTAINING_CLASS = EINTERACTION__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__CONTAINMENT = EINTERACTION__CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__CONTAINER = EINTERACTION__CONTAINER;

	/**
	 * The feature id for the '<em><b>Resolve Proxies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__RESOLVE_PROXIES = EINTERACTION__RESOLVE_PROXIES;

	/**
	 * The feature id for the '<em><b>EOpposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__EOPPOSITE = EINTERACTION__EOPPOSITE;

	/**
	 * The feature id for the '<em><b>EReference Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__EREFERENCE_TYPE = EINTERACTION__EREFERENCE_TYPE;

	/**
	 * The feature id for the '<em><b>EKeys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__EKEYS = EINTERACTION__EKEYS;

	/**
	 * The feature id for the '<em><b>Interaction Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__INTERACTION_BEHAVIOR = EINTERACTION__INTERACTION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Kind Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__KIND_INTERACTION = EINTERACTION__KIND_INTERACTION;

	/**
	 * The feature id for the '<em><b>EInteraction Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__EINTERACTION_TYPE = EINTERACTION__EINTERACTION_TYPE;

	/**
	 * The feature id for the '<em><b>Target Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION__TARGET_CARDINALITY = EINTERACTION__TARGET_CARDINALITY;

	/**
	 * The number of structural features of the '<em>EBindinginteraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION_FEATURE_COUNT = EINTERACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION___GET_EANNOTATION__STRING = EINTERACTION___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION___GET_FEATURE_ID = EINTERACTION___GET_FEATURE_ID;

	/**
	 * The operation id for the '<em>Get Container Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION___GET_CONTAINER_CLASS = EINTERACTION___GET_CONTAINER_CLASS;

	/**
	 * The number of operations of the '<em>EBindinginteraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDINGINTERACTION_OPERATION_COUNT = EINTERACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metalang4md.ECardinality <em>ECardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metalang4md.ECardinality
	 * @see metalang4md.impl.Metalang4mdPackageImpl#getECardinality()
	 * @generated
	 */
	int ECARDINALITY = 11;

	/**
	 * The meta object id for the '{@link metalang4md.EInteractionBehavior <em>EInteraction Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metalang4md.EInteractionBehavior
	 * @see metalang4md.impl.Metalang4mdPackageImpl#getEInteractionBehavior()
	 * @generated
	 */
	int EINTERACTION_BEHAVIOR = 12;

	/**
	 * The meta object id for the '{@link metalang4md.EArising <em>EArising</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metalang4md.EArising
	 * @see metalang4md.impl.Metalang4mdPackageImpl#getEArising()
	 * @generated
	 */
	int EARISING = 13;

	/**
	 * The meta object id for the '{@link metalang4md.EKindInteraction <em>EKind Interaction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metalang4md.EKindInteraction
	 * @see metalang4md.impl.Metalang4mdPackageImpl#getEKindInteraction()
	 * @generated
	 */
	int EKIND_INTERACTION = 14;


	/**
	 * Returns the meta object for class '{@link metalang4md.EActor <em>EActor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EActor</em>'.
	 * @see metalang4md.EActor
	 * @generated
	 */
	EClass getEActor();

	/**
	 * Returns the meta object for class '{@link metalang4md.EItem <em>EItem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EItem</em>'.
	 * @see metalang4md.EItem
	 * @generated
	 */
	EClass getEItem();

	/**
	 * Returns the meta object for the attribute '{@link metalang4md.EItem#getArisingBehavior <em>Arising Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arising Behavior</em>'.
	 * @see metalang4md.EItem#getArisingBehavior()
	 * @see #getEItem()
	 * @generated
	 */
	EAttribute getEItem_ArisingBehavior();

	/**
	 * Returns the meta object for class '{@link metalang4md.EInteraction <em>EInteraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EInteraction</em>'.
	 * @see metalang4md.EInteraction
	 * @generated
	 */
	EClass getEInteraction();

	/**
	 * Returns the meta object for the attribute '{@link metalang4md.EInteraction#getInteractionBehavior <em>Interaction Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interaction Behavior</em>'.
	 * @see metalang4md.EInteraction#getInteractionBehavior()
	 * @see #getEInteraction()
	 * @generated
	 */
	EAttribute getEInteraction_InteractionBehavior();

	/**
	 * Returns the meta object for the attribute '{@link metalang4md.EInteraction#getKindInteraction <em>Kind Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind Interaction</em>'.
	 * @see metalang4md.EInteraction#getKindInteraction()
	 * @see #getEInteraction()
	 * @generated
	 */
	EAttribute getEInteraction_KindInteraction();

	/**
	 * Returns the meta object for the reference '{@link metalang4md.EInteraction#getEInteractionType <em>EInteraction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EInteraction Type</em>'.
	 * @see metalang4md.EInteraction#getEInteractionType()
	 * @see #getEInteraction()
	 * @generated
	 */
	EReference getEInteraction_EInteractionType();

	/**
	 * Returns the meta object for the attribute '{@link metalang4md.EInteraction#getTargetCardinality <em>Target Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Cardinality</em>'.
	 * @see metalang4md.EInteraction#getTargetCardinality()
	 * @see #getEInteraction()
	 * @generated
	 */
	EAttribute getEInteraction_TargetCardinality();

	/**
	 * Returns the meta object for class '{@link metalang4md.EDomainSpecificType <em>EDomain Specific Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDomain Specific Type</em>'.
	 * @see metalang4md.EDomainSpecificType
	 * @generated
	 */
	EClass getEDomainSpecificType();

	/**
	 * Returns the meta object for class '{@link metalang4md.EDomainSpecificElement <em>EDomain Specific Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDomain Specific Element</em>'.
	 * @see metalang4md.EDomainSpecificElement
	 * @generated
	 */
	EClass getEDomainSpecificElement();

	/**
	 * Returns the meta object for the containment reference list '{@link metalang4md.EDomainSpecificElement#getEDomainSpecificProperty <em>EDomain Specific Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EDomain Specific Property</em>'.
	 * @see metalang4md.EDomainSpecificElement#getEDomainSpecificProperty()
	 * @see #getEDomainSpecificElement()
	 * @generated
	 */
	EReference getEDomainSpecificElement_EDomainSpecificProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link metalang4md.EDomainSpecificElement#getEInteractions <em>EInteractions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EInteractions</em>'.
	 * @see metalang4md.EDomainSpecificElement#getEInteractions()
	 * @see #getEDomainSpecificElement()
	 * @generated
	 */
	EReference getEDomainSpecificElement_EInteractions();

	/**
	 * Returns the meta object for class '{@link metalang4md.EDomainSpecificPackage <em>EDomain Specific Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDomain Specific Package</em>'.
	 * @see metalang4md.EDomainSpecificPackage
	 * @generated
	 */
	EClass getEDomainSpecificPackage();

	/**
	 * Returns the meta object for class '{@link metalang4md.EDomainSpecificProperty <em>EDomain Specific Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDomain Specific Property</em>'.
	 * @see metalang4md.EDomainSpecificProperty
	 * @generated
	 */
	EClass getEDomainSpecificProperty();

	/**
	 * Returns the meta object for class '{@link metalang4md.EComposableProperty <em>EComposable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EComposable Property</em>'.
	 * @see metalang4md.EComposableProperty
	 * @generated
	 */
	EClass getEComposableProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link metalang4md.EComposableProperty#getESubProperty <em>ESub Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ESub Property</em>'.
	 * @see metalang4md.EComposableProperty#getESubProperty()
	 * @see #getEComposableProperty()
	 * @generated
	 */
	EReference getEComposableProperty_ESubProperty();

	/**
	 * Returns the meta object for class '{@link metalang4md.ELeafProperty <em>ELeaf Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ELeaf Property</em>'.
	 * @see metalang4md.ELeafProperty
	 * @generated
	 */
	EClass getELeafProperty();

	/**
	 * Returns the meta object for class '{@link metalang4md.ECompositionInteraction <em>EComposition Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EComposition Interaction</em>'.
	 * @see metalang4md.ECompositionInteraction
	 * @generated
	 */
	EClass getECompositionInteraction();

	/**
	 * Returns the meta object for class '{@link metalang4md.EBindinginteraction <em>EBindinginteraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EBindinginteraction</em>'.
	 * @see metalang4md.EBindinginteraction
	 * @generated
	 */
	EClass getEBindinginteraction();

	/**
	 * Returns the meta object for enum '{@link metalang4md.ECardinality <em>ECardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ECardinality</em>'.
	 * @see metalang4md.ECardinality
	 * @generated
	 */
	EEnum getECardinality();

	/**
	 * Returns the meta object for enum '{@link metalang4md.EInteractionBehavior <em>EInteraction Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EInteraction Behavior</em>'.
	 * @see metalang4md.EInteractionBehavior
	 * @generated
	 */
	EEnum getEInteractionBehavior();

	/**
	 * Returns the meta object for enum '{@link metalang4md.EArising <em>EArising</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EArising</em>'.
	 * @see metalang4md.EArising
	 * @generated
	 */
	EEnum getEArising();

	/**
	 * Returns the meta object for enum '{@link metalang4md.EKindInteraction <em>EKind Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EKind Interaction</em>'.
	 * @see metalang4md.EKindInteraction
	 * @generated
	 */
	EEnum getEKindInteraction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Metalang4mdFactory getMetalang4mdFactory();

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
		 * The meta object literal for the '{@link metalang4md.impl.EActorImpl <em>EActor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metalang4md.impl.EActorImpl
		 * @see metalang4md.impl.Metalang4mdPackageImpl#getEActor()
		 * @generated
		 */
		EClass EACTOR = eINSTANCE.getEActor();

		/**
		 * The meta object literal for the '{@link metalang4md.impl.EItemImpl <em>EItem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metalang4md.impl.EItemImpl
		 * @see metalang4md.impl.Metalang4mdPackageImpl#getEItem()
		 * @generated
		 */
		EClass EITEM = eINSTANCE.getEItem();

		/**
		 * The meta object literal for the '<em><b>Arising Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EITEM__ARISING_BEHAVIOR = eINSTANCE.getEItem_ArisingBehavior();

		/**
		 * The meta object literal for the '{@link metalang4md.impl.EInteractionImpl <em>EInteraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metalang4md.impl.EInteractionImpl
		 * @see metalang4md.impl.Metalang4mdPackageImpl#getEInteraction()
		 * @generated
		 */
		EClass EINTERACTION = eINSTANCE.getEInteraction();

		/**
		 * The meta object literal for the '<em><b>Interaction Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINTERACTION__INTERACTION_BEHAVIOR = eINSTANCE.getEInteraction_InteractionBehavior();

		/**
		 * The meta object literal for the '<em><b>Kind Interaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINTERACTION__KIND_INTERACTION = eINSTANCE.getEInteraction_KindInteraction();

		/**
		 * The meta object literal for the '<em><b>EInteraction Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EINTERACTION__EINTERACTION_TYPE = eINSTANCE.getEInteraction_EInteractionType();

		/**
		 * The meta object literal for the '<em><b>Target Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINTERACTION__TARGET_CARDINALITY = eINSTANCE.getEInteraction_TargetCardinality();

		/**
		 * The meta object literal for the '{@link metalang4md.impl.EDomainSpecificTypeImpl <em>EDomain Specific Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metalang4md.impl.EDomainSpecificTypeImpl
		 * @see metalang4md.impl.Metalang4mdPackageImpl#getEDomainSpecificType()
		 * @generated
		 */
		EClass EDOMAIN_SPECIFIC_TYPE = eINSTANCE.getEDomainSpecificType();

		/**
		 * The meta object literal for the '{@link metalang4md.impl.EDomainSpecificElementImpl <em>EDomain Specific Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metalang4md.impl.EDomainSpecificElementImpl
		 * @see metalang4md.impl.Metalang4mdPackageImpl#getEDomainSpecificElement()
		 * @generated
		 */
		EClass EDOMAIN_SPECIFIC_ELEMENT = eINSTANCE.getEDomainSpecificElement();

		/**
		 * The meta object literal for the '<em><b>EDomain Specific Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDOMAIN_SPECIFIC_ELEMENT__EDOMAIN_SPECIFIC_PROPERTY = eINSTANCE.getEDomainSpecificElement_EDomainSpecificProperty();

		/**
		 * The meta object literal for the '<em><b>EInteractions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDOMAIN_SPECIFIC_ELEMENT__EINTERACTIONS = eINSTANCE.getEDomainSpecificElement_EInteractions();

		/**
		 * The meta object literal for the '{@link metalang4md.impl.EDomainSpecificPackageImpl <em>EDomain Specific Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metalang4md.impl.EDomainSpecificPackageImpl
		 * @see metalang4md.impl.Metalang4mdPackageImpl#getEDomainSpecificPackage()
		 * @generated
		 */
		EClass EDOMAIN_SPECIFIC_PACKAGE = eINSTANCE.getEDomainSpecificPackage();

		/**
		 * The meta object literal for the '{@link metalang4md.impl.EDomainSpecificPropertyImpl <em>EDomain Specific Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metalang4md.impl.EDomainSpecificPropertyImpl
		 * @see metalang4md.impl.Metalang4mdPackageImpl#getEDomainSpecificProperty()
		 * @generated
		 */
		EClass EDOMAIN_SPECIFIC_PROPERTY = eINSTANCE.getEDomainSpecificProperty();

		/**
		 * The meta object literal for the '{@link metalang4md.impl.EComposablePropertyImpl <em>EComposable Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metalang4md.impl.EComposablePropertyImpl
		 * @see metalang4md.impl.Metalang4mdPackageImpl#getEComposableProperty()
		 * @generated
		 */
		EClass ECOMPOSABLE_PROPERTY = eINSTANCE.getEComposableProperty();

		/**
		 * The meta object literal for the '<em><b>ESub Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOMPOSABLE_PROPERTY__ESUB_PROPERTY = eINSTANCE.getEComposableProperty_ESubProperty();

		/**
		 * The meta object literal for the '{@link metalang4md.impl.ELeafPropertyImpl <em>ELeaf Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metalang4md.impl.ELeafPropertyImpl
		 * @see metalang4md.impl.Metalang4mdPackageImpl#getELeafProperty()
		 * @generated
		 */
		EClass ELEAF_PROPERTY = eINSTANCE.getELeafProperty();

		/**
		 * The meta object literal for the '{@link metalang4md.impl.ECompositionInteractionImpl <em>EComposition Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metalang4md.impl.ECompositionInteractionImpl
		 * @see metalang4md.impl.Metalang4mdPackageImpl#getECompositionInteraction()
		 * @generated
		 */
		EClass ECOMPOSITION_INTERACTION = eINSTANCE.getECompositionInteraction();

		/**
		 * The meta object literal for the '{@link metalang4md.impl.EBindinginteractionImpl <em>EBindinginteraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metalang4md.impl.EBindinginteractionImpl
		 * @see metalang4md.impl.Metalang4mdPackageImpl#getEBindinginteraction()
		 * @generated
		 */
		EClass EBINDINGINTERACTION = eINSTANCE.getEBindinginteraction();

		/**
		 * The meta object literal for the '{@link metalang4md.ECardinality <em>ECardinality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metalang4md.ECardinality
		 * @see metalang4md.impl.Metalang4mdPackageImpl#getECardinality()
		 * @generated
		 */
		EEnum ECARDINALITY = eINSTANCE.getECardinality();

		/**
		 * The meta object literal for the '{@link metalang4md.EInteractionBehavior <em>EInteraction Behavior</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metalang4md.EInteractionBehavior
		 * @see metalang4md.impl.Metalang4mdPackageImpl#getEInteractionBehavior()
		 * @generated
		 */
		EEnum EINTERACTION_BEHAVIOR = eINSTANCE.getEInteractionBehavior();

		/**
		 * The meta object literal for the '{@link metalang4md.EArising <em>EArising</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metalang4md.EArising
		 * @see metalang4md.impl.Metalang4mdPackageImpl#getEArising()
		 * @generated
		 */
		EEnum EARISING = eINSTANCE.getEArising();

		/**
		 * The meta object literal for the '{@link metalang4md.EKindInteraction <em>EKind Interaction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metalang4md.EKindInteraction
		 * @see metalang4md.impl.Metalang4mdPackageImpl#getEKindInteraction()
		 * @generated
		 */
		EEnum EKIND_INTERACTION = eINSTANCE.getEKindInteraction();

	}

} //Metalang4mdPackage
