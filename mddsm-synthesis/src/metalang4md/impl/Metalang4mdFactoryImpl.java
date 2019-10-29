/**
 */
package metalang4md.impl;

import metalang4md.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Metalang4mdFactoryImpl extends EFactoryImpl implements Metalang4mdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Metalang4mdFactory init() {
		try {
			Metalang4mdFactory theMetalang4mdFactory = (Metalang4mdFactory)EPackage.Registry.INSTANCE.getEFactory(Metalang4mdPackage.eNS_URI);
			if (theMetalang4mdFactory != null) {
				return theMetalang4mdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Metalang4mdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metalang4mdFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Metalang4mdPackage.EACTOR: return createEActor();
			case Metalang4mdPackage.EITEM: return createEItem();
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_TYPE: return createEDomainSpecificType();
			case Metalang4mdPackage.EDOMAIN_SPECIFIC_ELEMENT: return createEDomainSpecificElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Metalang4mdPackage.ECARDINALITY:
				return createECardinalityFromString(eDataType, initialValue);
			case Metalang4mdPackage.EINTERACTION_BEHAVIOR:
				return createEInteractionBehaviorFromString(eDataType, initialValue);
			case Metalang4mdPackage.EARISING:
				return createEArisingFromString(eDataType, initialValue);
			case Metalang4mdPackage.ECOORDINATION_BEHAVIOR:
				return createECoordinationBehaviorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Metalang4mdPackage.ECARDINALITY:
				return convertECardinalityToString(eDataType, instanceValue);
			case Metalang4mdPackage.EINTERACTION_BEHAVIOR:
				return convertEInteractionBehaviorToString(eDataType, instanceValue);
			case Metalang4mdPackage.EARISING:
				return convertEArisingToString(eDataType, instanceValue);
			case Metalang4mdPackage.ECOORDINATION_BEHAVIOR:
				return convertECoordinationBehaviorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EActor createEActor() {
		EActorImpl eActor = new EActorImpl();
		return eActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EItem createEItem() {
		EItemImpl eItem = new EItemImpl();
		return eItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDomainSpecificType createEDomainSpecificType() {
		EDomainSpecificTypeImpl eDomainSpecificType = new EDomainSpecificTypeImpl();
		return eDomainSpecificType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDomainSpecificElement createEDomainSpecificElement() {
		EDomainSpecificElementImpl eDomainSpecificElement = new EDomainSpecificElementImpl();
		return eDomainSpecificElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECardinality createECardinalityFromString(EDataType eDataType, String initialValue) {
		ECardinality result = ECardinality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertECardinalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EInteractionBehavior createEInteractionBehaviorFromString(EDataType eDataType, String initialValue) {
		EInteractionBehavior result = EInteractionBehavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEInteractionBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EArising createEArisingFromString(EDataType eDataType, String initialValue) {
		EArising result = EArising.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEArisingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECoordinationBehavior createECoordinationBehaviorFromString(EDataType eDataType, String initialValue) {
		ECoordinationBehavior result = ECoordinationBehavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertECoordinationBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metalang4mdPackage getMetalang4mdPackage() {
		return (Metalang4mdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Metalang4mdPackage getPackage() {
		return Metalang4mdPackage.eINSTANCE;
	}

} //Metalang4mdFactoryImpl
