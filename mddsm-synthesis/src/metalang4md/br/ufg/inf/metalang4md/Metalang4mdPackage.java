/**
 */
package br.ufg.inf.metalang4md;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import br.ufg.inf.metalang4md.metalang4md.ECardinality;

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
	String eNS_PREFIX = "metalang4md";

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
	int EDOMAIN_SPECIFIC_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT__COMMAND_PRIORITY = 0;

	/**
	 * The number of structural features of the '<em>EDomain Specific Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EDomain Specific Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ELEMENT_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__COMMAND_PRIORITY = EDOMAIN_SPECIFIC_ELEMENT__COMMAND_PRIORITY;

	/**
	 * The number of structural features of the '<em>EActor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR_FEATURE_COUNT = EDOMAIN_SPECIFIC_ELEMENT_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__COMMAND_PRIORITY = EDOMAIN_SPECIFIC_ELEMENT__COMMAND_PRIORITY;

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
	 * The number of operations of the '<em>EItem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM_OPERATION_COUNT = EDOMAIN_SPECIFIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metalang4md.impl.EDomainSpecificTypeImpl <em>EDomain Specific Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metalang4md.impl.EDomainSpecificTypeImpl
	 * @see metalang4md.impl.Metalang4mdPackageImpl#getEDomainSpecificType()
	 * @generated
	 */
	int EDOMAIN_SPECIFIC_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__COMMAND_PRIORITY = EDOMAIN_SPECIFIC_ELEMENT__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__CARDINALITY = EDOMAIN_SPECIFIC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interaction Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__INTERACTION_BEHAVIOR = EDOMAIN_SPECIFIC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__KIND_INTERACTION = EDOMAIN_SPECIFIC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__BINDING = EDOMAIN_SPECIFIC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EDomain Specific Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT = EDOMAIN_SPECIFIC_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>EDomain Specific Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE_OPERATION_COUNT = EDOMAIN_SPECIFIC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metalang4md.ECardinality <em>ECardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metalang4md.ECardinality
	 * @see metalang4md.impl.Metalang4mdPackageImpl#getECardinality()
	 * @generated
	 */
	int ECARDINALITY = 4;

	/**
	 * The meta object id for the '{@link metalang4md.EInteractionBehavior <em>EInteraction Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metalang4md.EInteractionBehavior
	 * @see metalang4md.impl.Metalang4mdPackageImpl#getEInteractionBehavior()
	 * @generated
	 */
	int EINTERACTION_BEHAVIOR = 5;

	/**
	 * The meta object id for the '{@link metalang4md.EArising <em>EArising</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metalang4md.EArising
	 * @see metalang4md.impl.Metalang4mdPackageImpl#getEArising()
	 * @generated
	 */
	int EARISING = 6;

	/**
	 * The meta object id for the '{@link metalang4md.ECoordinationBehavior <em>ECoordination Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metalang4md.ECoordinationBehavior
	 * @see metalang4md.impl.Metalang4mdPackageImpl#getECoordinationBehavior()
	 * @generated
	 */
	int ECOORDINATION_BEHAVIOR = 7;


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
	 * Returns the meta object for class '{@link metalang4md.EDomainSpecificType <em>EDomain Specific Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDomain Specific Type</em>'.
	 * @see metalang4md.EDomainSpecificType
	 * @generated
	 */
	EClass getEDomainSpecificType();

	/**
	 * Returns the meta object for the attribute '{@link metalang4md.EDomainSpecificType#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see metalang4md.EDomainSpecificType#getCardinality()
	 * @see #getEDomainSpecificType()
	 * @generated
	 */
	EAttribute getEDomainSpecificType_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link metalang4md.EDomainSpecificType#getInteractionBehavior <em>Interaction Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interaction Behavior</em>'.
	 * @see metalang4md.EDomainSpecificType#getInteractionBehavior()
	 * @see #getEDomainSpecificType()
	 * @generated
	 */
	EAttribute getEDomainSpecificType_InteractionBehavior();

	/**
	 * Returns the meta object for the attribute '{@link metalang4md.EDomainSpecificType#getKindInteraction <em>Kind Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind Interaction</em>'.
	 * @see metalang4md.EDomainSpecificType#getKindInteraction()
	 * @see #getEDomainSpecificType()
	 * @generated
	 */
	EAttribute getEDomainSpecificType_KindInteraction();

	/**
	 * Returns the meta object for the reference list '{@link metalang4md.EDomainSpecificType#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Binding</em>'.
	 * @see metalang4md.EDomainSpecificType#getBinding()
	 * @see #getEDomainSpecificType()
	 * @generated
	 */
	EReference getEDomainSpecificType_Binding();

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
	 * Returns the meta object for the attribute '{@link metalang4md.EDomainSpecificElement#getCommandPriority <em>Command Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command Priority</em>'.
	 * @see metalang4md.EDomainSpecificElement#getCommandPriority()
	 * @see #getEDomainSpecificElement()
	 * @generated
	 */
	EAttribute getEDomainSpecificElement_CommandPriority();

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
	 * Returns the meta object for enum '{@link metalang4md.ECoordinationBehavior <em>ECoordination Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ECoordination Behavior</em>'.
	 * @see metalang4md.ECoordinationBehavior
	 * @generated
	 */
	EEnum getECoordinationBehavior();

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
		 * The meta object literal for the '{@link metalang4md.impl.EDomainSpecificTypeImpl <em>EDomain Specific Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metalang4md.impl.EDomainSpecificTypeImpl
		 * @see metalang4md.impl.Metalang4mdPackageImpl#getEDomainSpecificType()
		 * @generated
		 */
		EClass EDOMAIN_SPECIFIC_TYPE = eINSTANCE.getEDomainSpecificType();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDOMAIN_SPECIFIC_TYPE__CARDINALITY = eINSTANCE.getEDomainSpecificType_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Interaction Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDOMAIN_SPECIFIC_TYPE__INTERACTION_BEHAVIOR = eINSTANCE.getEDomainSpecificType_InteractionBehavior();

		/**
		 * The meta object literal for the '<em><b>Kind Interaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDOMAIN_SPECIFIC_TYPE__KIND_INTERACTION = eINSTANCE.getEDomainSpecificType_KindInteraction();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDOMAIN_SPECIFIC_TYPE__BINDING = eINSTANCE.getEDomainSpecificType_Binding();

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
		 * The meta object literal for the '<em><b>Command Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDOMAIN_SPECIFIC_ELEMENT__COMMAND_PRIORITY = eINSTANCE.getEDomainSpecificElement_CommandPriority();

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
		 * The meta object literal for the '{@link metalang4md.ECoordinationBehavior <em>ECoordination Behavior</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metalang4md.ECoordinationBehavior
		 * @see metalang4md.impl.Metalang4mdPackageImpl#getECoordinationBehavior()
		 * @generated
		 */
		EEnum ECOORDINATION_BEHAVIOR = eINSTANCE.getECoordinationBehavior();

	}

} //Metalang4mdPackage
