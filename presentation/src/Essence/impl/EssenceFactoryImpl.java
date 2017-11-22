/**
 */
package Essence.impl;

import Essence.Access;
import Essence.AccessByIndex;
import Essence.AccessByName;
import Essence.AccessCondition;
import Essence.AccessLevel;
import Essence.AccessType;
import Essence.ActionType;
import Essence.AddressBlock;
import Essence.Array;
import Essence.ArrayDimension;
import Essence.BehaviorType;
import Essence.BitField;
import Essence.BitFieldGapElement;
import Essence.BitFieldSequence;
import Essence.BooleanDecl;
import Essence.BooleanDef;
import Essence.BooleanGenDecl;
import Essence.Bus;
import Essence.BusErrorType;
import Essence.BusInstance;
import Essence.BusInterfaceMap;
import Essence.BusNoneInterfaceMap;
import Essence.CablePort;
import Essence.CableSignal;
import Essence.Component;
import Essence.ComponentInstance;
import Essence.Connection;
import Essence.ConstDefBlock;
import Essence.DataDecl;
import Essence.DataDef;
import Essence.DataGenDecl;
import Essence.DataTypeElement;
import Essence.DescriptionItem;
import Essence.DocumentRoot;
import Essence.EndianType;
import Essence.EnumElement;
import Essence.Enumeration;
import Essence.EnumerationInteger;
import Essence.EnumerationSequence;
import Essence.EnumerationString;
import Essence.EssenceFactory;
import Essence.EssencePackage;
import Essence.Function;
import Essence.FunctionType;
import Essence.GapElement;
import Essence.GenericDeclBlock;
import Essence.GenericMap;
import Essence.InstanceInterfaceMap;
import Essence.InstancePortMap;
import Essence.InstanceShellInterfaceMap;
import Essence.InstanceShellPortMap;
import Essence.IntegerDecl;
import Essence.IntegerDef;
import Essence.IntegerGenDecl;
import Essence.Interface;
import Essence.InterfaceDefCablePort;
import Essence.InterfaceDefRole;
import Essence.InterfaceDefRoleType;
import Essence.InterfaceDefTransactionalPort;
import Essence.InterfaceDefView;
import Essence.InterfaceDefWirePort;
import Essence.InterfaceDefinition;
import Essence.InterfacePortMap;
import Essence.InterfaceRoleType;
import Essence.InterfaceView;
import Essence.LocalInterfaceMap;
import Essence.LocalPortMap;
import Essence.Memory;
import Essence.MessageType;
import Essence.MethodDataType;
import Essence.MethodDataTypeElement;
import Essence.Module;
import Essence.MultiPad;
import Essence.MultiViewRegister;
import Essence.Net;
import Essence.NoneInterface;
import Essence.PackageInstance;
import Essence.PadMultiplexed;
import Essence.PadNetMap;
import Essence.PadNonMultiplexed;
import Essence.PadSpecial;
import Essence.PadSupply;
import Essence.PadType;
import Essence.PadTypeDB;
import Essence.ParamDeclBlock;
import Essence.ParamMap;
import Essence.PathRef;
import Essence.Pin;
import Essence.PinNetMap;
import Essence.PortDirection;
import Essence.PortInitiative;
import Essence.PortRef;
import Essence.PowerDomain;
import Essence.Product;
import Essence.ProductInstance;
import Essence.ProductInterfaceMap;
import Essence.ProductPadMap;
import Essence.ProductPinMap;
import Essence.Property;
import Essence.Record;
import Essence.RegMemSequence;
import Essence.RegMemSet;
import Essence.RegViewBlock;
import Essence.Register;
import Essence.RegisterView;
import Essence.ReservedType;
import Essence.ResetType;
import Essence.ReturnElementAccess;
import Essence.ShellInterfaceMap;
import Essence.ShellPortMap;
import Essence.SiComponentInstance;
import Essence.SiInstanceInterfaceMap;
import Essence.SiInstancePortMap;
import Essence.SiInstanceShellInterfaceMap;
import Essence.SiInstanceShellPortMap;
import Essence.SiPort;
import Essence.SiPortDB;
import Essence.SiPortReq;
import Essence.SiSignal;
import Essence.SiSignalDB;
import Essence.SiSystemInstance;
import Essence.SignType;
import Essence.SignalMap;
import Essence.Silicon;
import Essence.SiliconInstance;
import Essence.SimpleDataType;
import Essence.SpecialType;
import Essence.StringDecl;
import Essence.StringDef;
import Essence.StringGenDecl;
import Essence.StrobeType;
import Essence.SyncMode;
import Essence.SystemInstance;
import Essence.Test;
import Essence.TestDB;
import Essence.TestReq;
import Essence.TopSpinType;
import Essence.TransactionalPort;
import Essence.TransactionalSignal;
import Essence.Union;
import Essence.VLNV;
import Essence.VirtualType;
import Essence.WirePort;
import Essence.WireSignal;
import Essence.XRefConnection;
import Essence.XRefDataVar;
import Essence.XRefExternalInterface;
import Essence.XRefExternalPort;
import Essence.XRefExternalSignal;
import Essence.XRefGenericDecl;
import Essence.XRefIFDPort;
import Essence.XRefIndInterface;
import Essence.XRefIndPin;
import Essence.XRefIndPort;
import Essence.XRefIndSinglePad;
import Essence.XRefInstance;
import Essence.XRefInternalInterface;
import Essence.XRefInternalPort;
import Essence.XRefInternalSignal;
import Essence.XRefMasterInterface;
import Essence.XRefNet;
import Essence.XRefNoneInterface;
import Essence.XRefPadType;
import Essence.XRefParamDecl;
import Essence.XRefPin;
import Essence.XRefPowerDomain;
import Essence.XRefRealPort;
import Essence.XRefRegMemSet;
import Essence.XRefRegisterView;
import Essence.XRefSiPort;
import Essence.XRefSiSignal;
import Essence.XRefSinglePad;
import Essence.XRefSlaveInterface;
import Essence.XRefTest;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EssenceFactoryImpl extends EFactoryImpl implements EssenceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EssenceFactory init() {
		try {
			EssenceFactory theEssenceFactory = (EssenceFactory)EPackage.Registry.INSTANCE.getEFactory(EssencePackage.eNS_URI);
			if (theEssenceFactory != null) {
				return theEssenceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EssenceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EssenceFactoryImpl() {
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
			case EssencePackage.ACCESS: return createAccess();
			case EssencePackage.ACCESS_BY_INDEX: return createAccessByIndex();
			case EssencePackage.ACCESS_BY_NAME: return createAccessByName();
			case EssencePackage.ACCESS_CONDITION: return createAccessCondition();
			case EssencePackage.ACCESS_LEVEL: return createAccessLevel();
			case EssencePackage.ADDRESS_BLOCK: return createAddressBlock();
			case EssencePackage.ARRAY: return createArray();
			case EssencePackage.ARRAY_DIMENSION: return createArrayDimension();
			case EssencePackage.BIT_FIELD: return createBitField();
			case EssencePackage.BIT_FIELD_GAP_ELEMENT: return createBitFieldGapElement();
			case EssencePackage.BIT_FIELD_SEQUENCE: return createBitFieldSequence();
			case EssencePackage.BOOLEAN_DECL: return createBooleanDecl();
			case EssencePackage.BOOLEAN_DEF: return createBooleanDef();
			case EssencePackage.BOOLEAN_GEN_DECL: return createBooleanGenDecl();
			case EssencePackage.BUS: return createBus();
			case EssencePackage.BUS_INSTANCE: return createBusInstance();
			case EssencePackage.BUS_INTERFACE_MAP: return createBusInterfaceMap();
			case EssencePackage.BUS_NONE_INTERFACE_MAP: return createBusNoneInterfaceMap();
			case EssencePackage.CABLE_PORT: return createCablePort();
			case EssencePackage.CABLE_SIGNAL: return createCableSignal();
			case EssencePackage.COMPONENT: return createComponent();
			case EssencePackage.COMPONENT_INSTANCE: return createComponentInstance();
			case EssencePackage.CONNECTION: return createConnection();
			case EssencePackage.CONST_DEF_BLOCK: return createConstDefBlock();
			case EssencePackage.DATA_DECL: return createDataDecl();
			case EssencePackage.DATA_DEF: return createDataDef();
			case EssencePackage.DATA_GEN_DECL: return createDataGenDecl();
			case EssencePackage.DATA_TYPE_ELEMENT: return createDataTypeElement();
			case EssencePackage.DESCRIPTION_ITEM: return createDescriptionItem();
			case EssencePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case EssencePackage.ENUM: return createEnum();
			case EssencePackage.ENUM_ELEMENT: return createEnumElement();
			case EssencePackage.ENUMERATION: return createEnumeration();
			case EssencePackage.ENUMERATION_INTEGER: return createEnumerationInteger();
			case EssencePackage.ENUMERATION_SEQUENCE: return createEnumerationSequence();
			case EssencePackage.ENUMERATION_STRING: return createEnumerationString();
			case EssencePackage.FUNCTION: return createFunction();
			case EssencePackage.GAP_ELEMENT: return createGapElement();
			case EssencePackage.GENERIC_DECL_BLOCK: return createGenericDeclBlock();
			case EssencePackage.GENERIC_MAP: return createGenericMap();
			case EssencePackage.INSTANCE_INTERFACE_MAP: return createInstanceInterfaceMap();
			case EssencePackage.INSTANCE_PORT_MAP: return createInstancePortMap();
			case EssencePackage.INSTANCE_SHELL_INTERFACE_MAP: return createInstanceShellInterfaceMap();
			case EssencePackage.INSTANCE_SHELL_PORT_MAP: return createInstanceShellPortMap();
			case EssencePackage.INTEGER_DECL: return createIntegerDecl();
			case EssencePackage.INTEGER_DEF: return createIntegerDef();
			case EssencePackage.INTEGER_GEN_DECL: return createIntegerGenDecl();
			case EssencePackage.INTERFACE: return createInterface();
			case EssencePackage.INTERFACE_DEF_CABLE_PORT: return createInterfaceDefCablePort();
			case EssencePackage.INTERFACE_DEFINITION: return createInterfaceDefinition();
			case EssencePackage.INTERFACE_DEF_ROLE: return createInterfaceDefRole();
			case EssencePackage.INTERFACE_DEF_TRANSACTIONAL_PORT: return createInterfaceDefTransactionalPort();
			case EssencePackage.INTERFACE_DEF_VIEW: return createInterfaceDefView();
			case EssencePackage.INTERFACE_DEF_WIRE_PORT: return createInterfaceDefWirePort();
			case EssencePackage.INTERFACE_PORT_MAP: return createInterfacePortMap();
			case EssencePackage.INTERFACE_VIEW: return createInterfaceView();
			case EssencePackage.LOCAL_INTERFACE_MAP: return createLocalInterfaceMap();
			case EssencePackage.LOCAL_PORT_MAP: return createLocalPortMap();
			case EssencePackage.MEMORY: return createMemory();
			case EssencePackage.METHOD_DATA_TYPE: return createMethodDataType();
			case EssencePackage.METHOD_DATA_TYPE_ELEMENT: return createMethodDataTypeElement();
			case EssencePackage.MODULE: return createModule();
			case EssencePackage.MULTI_PAD: return createMultiPad();
			case EssencePackage.MULTI_VIEW_REGISTER: return createMultiViewRegister();
			case EssencePackage.NET: return createNet();
			case EssencePackage.NONE_INTERFACE: return createNoneInterface();
			case EssencePackage.PACKAGE: return createPackage();
			case EssencePackage.PACKAGE_INSTANCE: return createPackageInstance();
			case EssencePackage.PAD_MULTIPLEXED: return createPadMultiplexed();
			case EssencePackage.PAD_NET_MAP: return createPadNetMap();
			case EssencePackage.PAD_NON_MULTIPLEXED: return createPadNonMultiplexed();
			case EssencePackage.PAD_SPECIAL: return createPadSpecial();
			case EssencePackage.PAD_SUPPLY: return createPadSupply();
			case EssencePackage.PAD_TYPE: return createPadType();
			case EssencePackage.PAD_TYPE_DB: return createPadTypeDB();
			case EssencePackage.PARAM_DECL_BLOCK: return createParamDeclBlock();
			case EssencePackage.PARAM_MAP: return createParamMap();
			case EssencePackage.PATH_REF: return createPathRef();
			case EssencePackage.PIN: return createPin();
			case EssencePackage.PIN_NET_MAP: return createPinNetMap();
			case EssencePackage.PORT_REF: return createPortRef();
			case EssencePackage.POWER_DOMAIN: return createPowerDomain();
			case EssencePackage.PRODUCT: return createProduct();
			case EssencePackage.PRODUCT_INSTANCE: return createProductInstance();
			case EssencePackage.PRODUCT_INTERFACE_MAP: return createProductInterfaceMap();
			case EssencePackage.PRODUCT_PAD_MAP: return createProductPadMap();
			case EssencePackage.PRODUCT_PIN_MAP: return createProductPinMap();
			case EssencePackage.PROPERTY: return createProperty();
			case EssencePackage.RECORD: return createRecord();
			case EssencePackage.REGISTER: return createRegister();
			case EssencePackage.REGISTER_VIEW: return createRegisterView();
			case EssencePackage.REG_MEM_SEQUENCE: return createRegMemSequence();
			case EssencePackage.REG_MEM_SET: return createRegMemSet();
			case EssencePackage.REG_VIEW_BLOCK: return createRegViewBlock();
			case EssencePackage.RESET_TYPE: return createResetType();
			case EssencePackage.RETURN_ELEMENT_ACCESS: return createReturnElementAccess();
			case EssencePackage.SHELL_INTERFACE_MAP: return createShellInterfaceMap();
			case EssencePackage.SHELL_PORT_MAP: return createShellPortMap();
			case EssencePackage.SI_COMPONENT_INSTANCE: return createSiComponentInstance();
			case EssencePackage.SIGNAL_MAP: return createSignalMap();
			case EssencePackage.SI_INSTANCE_INTERFACE_MAP: return createSiInstanceInterfaceMap();
			case EssencePackage.SI_INSTANCE_PORT_MAP: return createSiInstancePortMap();
			case EssencePackage.SI_INSTANCE_SHELL_INTERFACE_MAP: return createSiInstanceShellInterfaceMap();
			case EssencePackage.SI_INSTANCE_SHELL_PORT_MAP: return createSiInstanceShellPortMap();
			case EssencePackage.SILICON: return createSilicon();
			case EssencePackage.SILICON_INSTANCE: return createSiliconInstance();
			case EssencePackage.SIMPLE_DATA_TYPE: return createSimpleDataType();
			case EssencePackage.SI_PORT: return createSiPort();
			case EssencePackage.SI_PORT_DB: return createSiPortDB();
			case EssencePackage.SI_PORT_REQ: return createSiPortReq();
			case EssencePackage.SI_SIGNAL: return createSiSignal();
			case EssencePackage.SI_SIGNAL_DB: return createSiSignalDB();
			case EssencePackage.SI_SYSTEM_INSTANCE: return createSiSystemInstance();
			case EssencePackage.STRING_DECL: return createStringDecl();
			case EssencePackage.STRING_DEF: return createStringDef();
			case EssencePackage.STRING_GEN_DECL: return createStringGenDecl();
			case EssencePackage.SYSTEM: return createSystem();
			case EssencePackage.SYSTEM_INSTANCE: return createSystemInstance();
			case EssencePackage.TEST: return createTest();
			case EssencePackage.TEST_DB: return createTestDB();
			case EssencePackage.TEST_REQ: return createTestReq();
			case EssencePackage.TRANSACTIONAL_PORT: return createTransactionalPort();
			case EssencePackage.TRANSACTIONAL_SIGNAL: return createTransactionalSignal();
			case EssencePackage.UNION: return createUnion();
			case EssencePackage.VLNV: return createVLNV();
			case EssencePackage.VOID: return createVoid();
			case EssencePackage.WIRE_PORT: return createWirePort();
			case EssencePackage.WIRE_SIGNAL: return createWireSignal();
			case EssencePackage.XREF_CONNECTION: return createXRefConnection();
			case EssencePackage.XREF_DATA_VAR: return createXRefDataVar();
			case EssencePackage.XREF_EXTERNAL_INTERFACE: return createXRefExternalInterface();
			case EssencePackage.XREF_EXTERNAL_PORT: return createXRefExternalPort();
			case EssencePackage.XREF_EXTERNAL_SIGNAL: return createXRefExternalSignal();
			case EssencePackage.XREF_GENERIC_DECL: return createXRefGenericDecl();
			case EssencePackage.XREF_IFD_PORT: return createXRefIFDPort();
			case EssencePackage.XREF_IND_INTERFACE: return createXRefIndInterface();
			case EssencePackage.XREF_IND_PIN: return createXRefIndPin();
			case EssencePackage.XREF_IND_PORT: return createXRefIndPort();
			case EssencePackage.XREF_IND_SINGLE_PAD: return createXRefIndSinglePad();
			case EssencePackage.XREF_INSTANCE: return createXRefInstance();
			case EssencePackage.XREF_INTERNAL_INTERFACE: return createXRefInternalInterface();
			case EssencePackage.XREF_INTERNAL_PORT: return createXRefInternalPort();
			case EssencePackage.XREF_INTERNAL_SIGNAL: return createXRefInternalSignal();
			case EssencePackage.XREF_MASTER_INTERFACE: return createXRefMasterInterface();
			case EssencePackage.XREF_NET: return createXRefNet();
			case EssencePackage.XREF_NONE_INTERFACE: return createXRefNoneInterface();
			case EssencePackage.XREF_PAD_TYPE: return createXRefPadType();
			case EssencePackage.XREF_PARAM_DECL: return createXRefParamDecl();
			case EssencePackage.XREF_PIN: return createXRefPin();
			case EssencePackage.XREF_POWER_DOMAIN: return createXRefPowerDomain();
			case EssencePackage.XREF_REAL_PORT: return createXRefRealPort();
			case EssencePackage.XREF_REGISTER_VIEW: return createXRefRegisterView();
			case EssencePackage.XREF_REG_MEM_SET: return createXRefRegMemSet();
			case EssencePackage.XREF_SINGLE_PAD: return createXRefSinglePad();
			case EssencePackage.XREF_SI_PORT: return createXRefSiPort();
			case EssencePackage.XREF_SI_SIGNAL: return createXRefSiSignal();
			case EssencePackage.XREF_SLAVE_INTERFACE: return createXRefSlaveInterface();
			case EssencePackage.XREF_TEST: return createXRefTest();
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
			case EssencePackage.ACCESS_TYPE:
				return createAccessTypeFromString(eDataType, initialValue);
			case EssencePackage.ACTION_TYPE:
				return createActionTypeFromString(eDataType, initialValue);
			case EssencePackage.BEHAVIOR_TYPE:
				return createBehaviorTypeFromString(eDataType, initialValue);
			case EssencePackage.BUS_ERROR_TYPE:
				return createBusErrorTypeFromString(eDataType, initialValue);
			case EssencePackage.ENDIAN_TYPE:
				return createEndianTypeFromString(eDataType, initialValue);
			case EssencePackage.FUNCTION_TYPE:
				return createFunctionTypeFromString(eDataType, initialValue);
			case EssencePackage.INTERFACE_DEF_ROLE_TYPE:
				return createInterfaceDefRoleTypeFromString(eDataType, initialValue);
			case EssencePackage.INTERFACE_ROLE_TYPE:
				return createInterfaceRoleTypeFromString(eDataType, initialValue);
			case EssencePackage.MESSAGE_TYPE:
				return createMessageTypeFromString(eDataType, initialValue);
			case EssencePackage.PORT_DIRECTION:
				return createPortDirectionFromString(eDataType, initialValue);
			case EssencePackage.PORT_INITIATIVE:
				return createPortInitiativeFromString(eDataType, initialValue);
			case EssencePackage.RESERVED_TYPE:
				return createReservedTypeFromString(eDataType, initialValue);
			case EssencePackage.SIGN_TYPE:
				return createSignTypeFromString(eDataType, initialValue);
			case EssencePackage.SPECIAL_TYPE:
				return createSpecialTypeFromString(eDataType, initialValue);
			case EssencePackage.STROBE_TYPE:
				return createStrobeTypeFromString(eDataType, initialValue);
			case EssencePackage.SYNC_MODE:
				return createSyncModeFromString(eDataType, initialValue);
			case EssencePackage.TOP_SPIN_TYPE:
				return createTopSpinTypeFromString(eDataType, initialValue);
			case EssencePackage.VIRTUAL_TYPE:
				return createVirtualTypeFromString(eDataType, initialValue);
			case EssencePackage.ACCESS_TYPE_OBJECT:
				return createAccessTypeObjectFromString(eDataType, initialValue);
			case EssencePackage.ACTION_TYPE_OBJECT:
				return createActionTypeObjectFromString(eDataType, initialValue);
			case EssencePackage.BEHAVIOR_TYPE_OBJECT:
				return createBehaviorTypeObjectFromString(eDataType, initialValue);
			case EssencePackage.BOOLEAN_EXPR:
				return createBooleanExprFromString(eDataType, initialValue);
			case EssencePackage.BOOLEAN_LITERAL:
				return createBooleanLiteralFromString(eDataType, initialValue);
			case EssencePackage.BUS_ERROR_TYPE_OBJECT:
				return createBusErrorTypeObjectFromString(eDataType, initialValue);
			case EssencePackage.COMMON_EXPR:
				return createCommonExprFromString(eDataType, initialValue);
			case EssencePackage.ENDIAN_TYPE_OBJECT:
				return createEndianTypeObjectFromString(eDataType, initialValue);
			case EssencePackage.FUNCTION_TYPE_OBJECT:
				return createFunctionTypeObjectFromString(eDataType, initialValue);
			case EssencePackage.INTEGER_EXPR:
				return createIntegerExprFromString(eDataType, initialValue);
			case EssencePackage.INTEGER_LITERAL:
				return createIntegerLiteralFromString(eDataType, initialValue);
			case EssencePackage.INTERFACE_DEF_ROLE_TYPE_OBJECT:
				return createInterfaceDefRoleTypeObjectFromString(eDataType, initialValue);
			case EssencePackage.INTERFACE_ROLE_TYPE_OBJECT:
				return createInterfaceRoleTypeObjectFromString(eDataType, initialValue);
			case EssencePackage.MESSAGE_TYPE_OBJECT:
				return createMessageTypeObjectFromString(eDataType, initialValue);
			case EssencePackage.PATH_EXPR:
				return createPathExprFromString(eDataType, initialValue);
			case EssencePackage.PORT_DIRECTION_OBJECT:
				return createPortDirectionObjectFromString(eDataType, initialValue);
			case EssencePackage.PORT_INITIATIVE_OBJECT:
				return createPortInitiativeObjectFromString(eDataType, initialValue);
			case EssencePackage.RESERVED_TYPE_OBJECT:
				return createReservedTypeObjectFromString(eDataType, initialValue);
			case EssencePackage.SIGN_TYPE_OBJECT:
				return createSignTypeObjectFromString(eDataType, initialValue);
			case EssencePackage.SPECIAL_TYPE_OBJECT:
				return createSpecialTypeObjectFromString(eDataType, initialValue);
			case EssencePackage.STRING_EXPR:
				return createStringExprFromString(eDataType, initialValue);
			case EssencePackage.STRING_LITERAL:
				return createStringLiteralFromString(eDataType, initialValue);
			case EssencePackage.STROBE_TYPE_OBJECT:
				return createStrobeTypeObjectFromString(eDataType, initialValue);
			case EssencePackage.SYNC_MODE_OBJECT:
				return createSyncModeObjectFromString(eDataType, initialValue);
			case EssencePackage.TOP_SPIN_TYPE_OBJECT:
				return createTopSpinTypeObjectFromString(eDataType, initialValue);
			case EssencePackage.VIRTUAL_TYPE_OBJECT:
				return createVirtualTypeObjectFromString(eDataType, initialValue);
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
			case EssencePackage.ACCESS_TYPE:
				return convertAccessTypeToString(eDataType, instanceValue);
			case EssencePackage.ACTION_TYPE:
				return convertActionTypeToString(eDataType, instanceValue);
			case EssencePackage.BEHAVIOR_TYPE:
				return convertBehaviorTypeToString(eDataType, instanceValue);
			case EssencePackage.BUS_ERROR_TYPE:
				return convertBusErrorTypeToString(eDataType, instanceValue);
			case EssencePackage.ENDIAN_TYPE:
				return convertEndianTypeToString(eDataType, instanceValue);
			case EssencePackage.FUNCTION_TYPE:
				return convertFunctionTypeToString(eDataType, instanceValue);
			case EssencePackage.INTERFACE_DEF_ROLE_TYPE:
				return convertInterfaceDefRoleTypeToString(eDataType, instanceValue);
			case EssencePackage.INTERFACE_ROLE_TYPE:
				return convertInterfaceRoleTypeToString(eDataType, instanceValue);
			case EssencePackage.MESSAGE_TYPE:
				return convertMessageTypeToString(eDataType, instanceValue);
			case EssencePackage.PORT_DIRECTION:
				return convertPortDirectionToString(eDataType, instanceValue);
			case EssencePackage.PORT_INITIATIVE:
				return convertPortInitiativeToString(eDataType, instanceValue);
			case EssencePackage.RESERVED_TYPE:
				return convertReservedTypeToString(eDataType, instanceValue);
			case EssencePackage.SIGN_TYPE:
				return convertSignTypeToString(eDataType, instanceValue);
			case EssencePackage.SPECIAL_TYPE:
				return convertSpecialTypeToString(eDataType, instanceValue);
			case EssencePackage.STROBE_TYPE:
				return convertStrobeTypeToString(eDataType, instanceValue);
			case EssencePackage.SYNC_MODE:
				return convertSyncModeToString(eDataType, instanceValue);
			case EssencePackage.TOP_SPIN_TYPE:
				return convertTopSpinTypeToString(eDataType, instanceValue);
			case EssencePackage.VIRTUAL_TYPE:
				return convertVirtualTypeToString(eDataType, instanceValue);
			case EssencePackage.ACCESS_TYPE_OBJECT:
				return convertAccessTypeObjectToString(eDataType, instanceValue);
			case EssencePackage.ACTION_TYPE_OBJECT:
				return convertActionTypeObjectToString(eDataType, instanceValue);
			case EssencePackage.BEHAVIOR_TYPE_OBJECT:
				return convertBehaviorTypeObjectToString(eDataType, instanceValue);
			case EssencePackage.BOOLEAN_EXPR:
				return convertBooleanExprToString(eDataType, instanceValue);
			case EssencePackage.BOOLEAN_LITERAL:
				return convertBooleanLiteralToString(eDataType, instanceValue);
			case EssencePackage.BUS_ERROR_TYPE_OBJECT:
				return convertBusErrorTypeObjectToString(eDataType, instanceValue);
			case EssencePackage.COMMON_EXPR:
				return convertCommonExprToString(eDataType, instanceValue);
			case EssencePackage.ENDIAN_TYPE_OBJECT:
				return convertEndianTypeObjectToString(eDataType, instanceValue);
			case EssencePackage.FUNCTION_TYPE_OBJECT:
				return convertFunctionTypeObjectToString(eDataType, instanceValue);
			case EssencePackage.INTEGER_EXPR:
				return convertIntegerExprToString(eDataType, instanceValue);
			case EssencePackage.INTEGER_LITERAL:
				return convertIntegerLiteralToString(eDataType, instanceValue);
			case EssencePackage.INTERFACE_DEF_ROLE_TYPE_OBJECT:
				return convertInterfaceDefRoleTypeObjectToString(eDataType, instanceValue);
			case EssencePackage.INTERFACE_ROLE_TYPE_OBJECT:
				return convertInterfaceRoleTypeObjectToString(eDataType, instanceValue);
			case EssencePackage.MESSAGE_TYPE_OBJECT:
				return convertMessageTypeObjectToString(eDataType, instanceValue);
			case EssencePackage.PATH_EXPR:
				return convertPathExprToString(eDataType, instanceValue);
			case EssencePackage.PORT_DIRECTION_OBJECT:
				return convertPortDirectionObjectToString(eDataType, instanceValue);
			case EssencePackage.PORT_INITIATIVE_OBJECT:
				return convertPortInitiativeObjectToString(eDataType, instanceValue);
			case EssencePackage.RESERVED_TYPE_OBJECT:
				return convertReservedTypeObjectToString(eDataType, instanceValue);
			case EssencePackage.SIGN_TYPE_OBJECT:
				return convertSignTypeObjectToString(eDataType, instanceValue);
			case EssencePackage.SPECIAL_TYPE_OBJECT:
				return convertSpecialTypeObjectToString(eDataType, instanceValue);
			case EssencePackage.STRING_EXPR:
				return convertStringExprToString(eDataType, instanceValue);
			case EssencePackage.STRING_LITERAL:
				return convertStringLiteralToString(eDataType, instanceValue);
			case EssencePackage.STROBE_TYPE_OBJECT:
				return convertStrobeTypeObjectToString(eDataType, instanceValue);
			case EssencePackage.SYNC_MODE_OBJECT:
				return convertSyncModeObjectToString(eDataType, instanceValue);
			case EssencePackage.TOP_SPIN_TYPE_OBJECT:
				return convertTopSpinTypeObjectToString(eDataType, instanceValue);
			case EssencePackage.VIRTUAL_TYPE_OBJECT:
				return convertVirtualTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Access createAccess() {
		AccessImpl access = new AccessImpl();
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessByIndex createAccessByIndex() {
		AccessByIndexImpl accessByIndex = new AccessByIndexImpl();
		return accessByIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessByName createAccessByName() {
		AccessByNameImpl accessByName = new AccessByNameImpl();
		return accessByName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessCondition createAccessCondition() {
		AccessConditionImpl accessCondition = new AccessConditionImpl();
		return accessCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessLevel createAccessLevel() {
		AccessLevelImpl accessLevel = new AccessLevelImpl();
		return accessLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressBlock createAddressBlock() {
		AddressBlockImpl addressBlock = new AddressBlockImpl();
		return addressBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Array createArray() {
		ArrayImpl array = new ArrayImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayDimension createArrayDimension() {
		ArrayDimensionImpl arrayDimension = new ArrayDimensionImpl();
		return arrayDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitField createBitField() {
		BitFieldImpl bitField = new BitFieldImpl();
		return bitField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitFieldGapElement createBitFieldGapElement() {
		BitFieldGapElementImpl bitFieldGapElement = new BitFieldGapElementImpl();
		return bitFieldGapElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitFieldSequence createBitFieldSequence() {
		BitFieldSequenceImpl bitFieldSequence = new BitFieldSequenceImpl();
		return bitFieldSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanDecl createBooleanDecl() {
		BooleanDeclImpl booleanDecl = new BooleanDeclImpl();
		return booleanDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanDef createBooleanDef() {
		BooleanDefImpl booleanDef = new BooleanDefImpl();
		return booleanDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanGenDecl createBooleanGenDecl() {
		BooleanGenDeclImpl booleanGenDecl = new BooleanGenDeclImpl();
		return booleanGenDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus createBus() {
		BusImpl bus = new BusImpl();
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusInstance createBusInstance() {
		BusInstanceImpl busInstance = new BusInstanceImpl();
		return busInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusInterfaceMap createBusInterfaceMap() {
		BusInterfaceMapImpl busInterfaceMap = new BusInterfaceMapImpl();
		return busInterfaceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusNoneInterfaceMap createBusNoneInterfaceMap() {
		BusNoneInterfaceMapImpl busNoneInterfaceMap = new BusNoneInterfaceMapImpl();
		return busNoneInterfaceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CablePort createCablePort() {
		CablePortImpl cablePort = new CablePortImpl();
		return cablePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CableSignal createCableSignal() {
		CableSignalImpl cableSignal = new CableSignalImpl();
		return cableSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance createComponentInstance() {
		ComponentInstanceImpl componentInstance = new ComponentInstanceImpl();
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstDefBlock createConstDefBlock() {
		ConstDefBlockImpl constDefBlock = new ConstDefBlockImpl();
		return constDefBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDecl createDataDecl() {
		DataDeclImpl dataDecl = new DataDeclImpl();
		return dataDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDef createDataDef() {
		DataDefImpl dataDef = new DataDefImpl();
		return dataDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataGenDecl createDataGenDecl() {
		DataGenDeclImpl dataGenDecl = new DataGenDeclImpl();
		return dataGenDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeElement createDataTypeElement() {
		DataTypeElementImpl dataTypeElement = new DataTypeElementImpl();
		return dataTypeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionItem createDescriptionItem() {
		DescriptionItemImpl descriptionItem = new DescriptionItemImpl();
		return descriptionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Essence.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumElement createEnumElement() {
		EnumElementImpl enumElement = new EnumElementImpl();
		return enumElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationInteger createEnumerationInteger() {
		EnumerationIntegerImpl enumerationInteger = new EnumerationIntegerImpl();
		return enumerationInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationSequence createEnumerationSequence() {
		EnumerationSequenceImpl enumerationSequence = new EnumerationSequenceImpl();
		return enumerationSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationString createEnumerationString() {
		EnumerationStringImpl enumerationString = new EnumerationStringImpl();
		return enumerationString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GapElement createGapElement() {
		GapElementImpl gapElement = new GapElementImpl();
		return gapElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericDeclBlock createGenericDeclBlock() {
		GenericDeclBlockImpl genericDeclBlock = new GenericDeclBlockImpl();
		return genericDeclBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericMap createGenericMap() {
		GenericMapImpl genericMap = new GenericMapImpl();
		return genericMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceInterfaceMap createInstanceInterfaceMap() {
		InstanceInterfaceMapImpl instanceInterfaceMap = new InstanceInterfaceMapImpl();
		return instanceInterfaceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancePortMap createInstancePortMap() {
		InstancePortMapImpl instancePortMap = new InstancePortMapImpl();
		return instancePortMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceShellInterfaceMap createInstanceShellInterfaceMap() {
		InstanceShellInterfaceMapImpl instanceShellInterfaceMap = new InstanceShellInterfaceMapImpl();
		return instanceShellInterfaceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceShellPortMap createInstanceShellPortMap() {
		InstanceShellPortMapImpl instanceShellPortMap = new InstanceShellPortMapImpl();
		return instanceShellPortMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerDecl createIntegerDecl() {
		IntegerDeclImpl integerDecl = new IntegerDeclImpl();
		return integerDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerDef createIntegerDef() {
		IntegerDefImpl integerDef = new IntegerDefImpl();
		return integerDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerGenDecl createIntegerGenDecl() {
		IntegerGenDeclImpl integerGenDecl = new IntegerGenDeclImpl();
		return integerGenDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDefCablePort createInterfaceDefCablePort() {
		InterfaceDefCablePortImpl interfaceDefCablePort = new InterfaceDefCablePortImpl();
		return interfaceDefCablePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDefinition createInterfaceDefinition() {
		InterfaceDefinitionImpl interfaceDefinition = new InterfaceDefinitionImpl();
		return interfaceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDefRole createInterfaceDefRole() {
		InterfaceDefRoleImpl interfaceDefRole = new InterfaceDefRoleImpl();
		return interfaceDefRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDefTransactionalPort createInterfaceDefTransactionalPort() {
		InterfaceDefTransactionalPortImpl interfaceDefTransactionalPort = new InterfaceDefTransactionalPortImpl();
		return interfaceDefTransactionalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDefView createInterfaceDefView() {
		InterfaceDefViewImpl interfaceDefView = new InterfaceDefViewImpl();
		return interfaceDefView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDefWirePort createInterfaceDefWirePort() {
		InterfaceDefWirePortImpl interfaceDefWirePort = new InterfaceDefWirePortImpl();
		return interfaceDefWirePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacePortMap createInterfacePortMap() {
		InterfacePortMapImpl interfacePortMap = new InterfacePortMapImpl();
		return interfacePortMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceView createInterfaceView() {
		InterfaceViewImpl interfaceView = new InterfaceViewImpl();
		return interfaceView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalInterfaceMap createLocalInterfaceMap() {
		LocalInterfaceMapImpl localInterfaceMap = new LocalInterfaceMapImpl();
		return localInterfaceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalPortMap createLocalPortMap() {
		LocalPortMapImpl localPortMap = new LocalPortMapImpl();
		return localPortMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memory createMemory() {
		MemoryImpl memory = new MemoryImpl();
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodDataType createMethodDataType() {
		MethodDataTypeImpl methodDataType = new MethodDataTypeImpl();
		return methodDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodDataTypeElement createMethodDataTypeElement() {
		MethodDataTypeElementImpl methodDataTypeElement = new MethodDataTypeElementImpl();
		return methodDataTypeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPad createMultiPad() {
		MultiPadImpl multiPad = new MultiPadImpl();
		return multiPad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiViewRegister createMultiViewRegister() {
		MultiViewRegisterImpl multiViewRegister = new MultiViewRegisterImpl();
		return multiViewRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Net createNet() {
		NetImpl net = new NetImpl();
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoneInterface createNoneInterface() {
		NoneInterfaceImpl noneInterface = new NoneInterfaceImpl();
		return noneInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Essence.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageInstance createPackageInstance() {
		PackageInstanceImpl packageInstance = new PackageInstanceImpl();
		return packageInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PadMultiplexed createPadMultiplexed() {
		PadMultiplexedImpl padMultiplexed = new PadMultiplexedImpl();
		return padMultiplexed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PadNetMap createPadNetMap() {
		PadNetMapImpl padNetMap = new PadNetMapImpl();
		return padNetMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PadNonMultiplexed createPadNonMultiplexed() {
		PadNonMultiplexedImpl padNonMultiplexed = new PadNonMultiplexedImpl();
		return padNonMultiplexed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PadSpecial createPadSpecial() {
		PadSpecialImpl padSpecial = new PadSpecialImpl();
		return padSpecial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PadSupply createPadSupply() {
		PadSupplyImpl padSupply = new PadSupplyImpl();
		return padSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PadType createPadType() {
		PadTypeImpl padType = new PadTypeImpl();
		return padType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PadTypeDB createPadTypeDB() {
		PadTypeDBImpl padTypeDB = new PadTypeDBImpl();
		return padTypeDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamDeclBlock createParamDeclBlock() {
		ParamDeclBlockImpl paramDeclBlock = new ParamDeclBlockImpl();
		return paramDeclBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamMap createParamMap() {
		ParamMapImpl paramMap = new ParamMapImpl();
		return paramMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathRef createPathRef() {
		PathRefImpl pathRef = new PathRefImpl();
		return pathRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin createPin() {
		PinImpl pin = new PinImpl();
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinNetMap createPinNetMap() {
		PinNetMapImpl pinNetMap = new PinNetMapImpl();
		return pinNetMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRef createPortRef() {
		PortRefImpl portRef = new PortRefImpl();
		return portRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerDomain createPowerDomain() {
		PowerDomainImpl powerDomain = new PowerDomainImpl();
		return powerDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInstance createProductInstance() {
		ProductInstanceImpl productInstance = new ProductInstanceImpl();
		return productInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductInterfaceMap createProductInterfaceMap() {
		ProductInterfaceMapImpl productInterfaceMap = new ProductInterfaceMapImpl();
		return productInterfaceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductPadMap createProductPadMap() {
		ProductPadMapImpl productPadMap = new ProductPadMapImpl();
		return productPadMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductPinMap createProductPinMap() {
		ProductPinMapImpl productPinMap = new ProductPinMapImpl();
		return productPinMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Record createRecord() {
		RecordImpl record = new RecordImpl();
		return record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Register createRegister() {
		RegisterImpl register = new RegisterImpl();
		return register;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterView createRegisterView() {
		RegisterViewImpl registerView = new RegisterViewImpl();
		return registerView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegMemSequence createRegMemSequence() {
		RegMemSequenceImpl regMemSequence = new RegMemSequenceImpl();
		return regMemSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegMemSet createRegMemSet() {
		RegMemSetImpl regMemSet = new RegMemSetImpl();
		return regMemSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegViewBlock createRegViewBlock() {
		RegViewBlockImpl regViewBlock = new RegViewBlockImpl();
		return regViewBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetType createResetType() {
		ResetTypeImpl resetType = new ResetTypeImpl();
		return resetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnElementAccess createReturnElementAccess() {
		ReturnElementAccessImpl returnElementAccess = new ReturnElementAccessImpl();
		return returnElementAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShellInterfaceMap createShellInterfaceMap() {
		ShellInterfaceMapImpl shellInterfaceMap = new ShellInterfaceMapImpl();
		return shellInterfaceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShellPortMap createShellPortMap() {
		ShellPortMapImpl shellPortMap = new ShellPortMapImpl();
		return shellPortMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiComponentInstance createSiComponentInstance() {
		SiComponentInstanceImpl siComponentInstance = new SiComponentInstanceImpl();
		return siComponentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalMap createSignalMap() {
		SignalMapImpl signalMap = new SignalMapImpl();
		return signalMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiInstanceInterfaceMap createSiInstanceInterfaceMap() {
		SiInstanceInterfaceMapImpl siInstanceInterfaceMap = new SiInstanceInterfaceMapImpl();
		return siInstanceInterfaceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiInstancePortMap createSiInstancePortMap() {
		SiInstancePortMapImpl siInstancePortMap = new SiInstancePortMapImpl();
		return siInstancePortMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiInstanceShellInterfaceMap createSiInstanceShellInterfaceMap() {
		SiInstanceShellInterfaceMapImpl siInstanceShellInterfaceMap = new SiInstanceShellInterfaceMapImpl();
		return siInstanceShellInterfaceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiInstanceShellPortMap createSiInstanceShellPortMap() {
		SiInstanceShellPortMapImpl siInstanceShellPortMap = new SiInstanceShellPortMapImpl();
		return siInstanceShellPortMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Silicon createSilicon() {
		SiliconImpl silicon = new SiliconImpl();
		return silicon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiliconInstance createSiliconInstance() {
		SiliconInstanceImpl siliconInstance = new SiliconInstanceImpl();
		return siliconInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleDataType createSimpleDataType() {
		SimpleDataTypeImpl simpleDataType = new SimpleDataTypeImpl();
		return simpleDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiPort createSiPort() {
		SiPortImpl siPort = new SiPortImpl();
		return siPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiPortDB createSiPortDB() {
		SiPortDBImpl siPortDB = new SiPortDBImpl();
		return siPortDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiPortReq createSiPortReq() {
		SiPortReqImpl siPortReq = new SiPortReqImpl();
		return siPortReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiSignal createSiSignal() {
		SiSignalImpl siSignal = new SiSignalImpl();
		return siSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiSignalDB createSiSignalDB() {
		SiSignalDBImpl siSignalDB = new SiSignalDBImpl();
		return siSignalDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiSystemInstance createSiSystemInstance() {
		SiSystemInstanceImpl siSystemInstance = new SiSystemInstanceImpl();
		return siSystemInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringDecl createStringDecl() {
		StringDeclImpl stringDecl = new StringDeclImpl();
		return stringDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringDef createStringDef() {
		StringDefImpl stringDef = new StringDefImpl();
		return stringDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringGenDecl createStringGenDecl() {
		StringGenDeclImpl stringGenDecl = new StringGenDeclImpl();
		return stringGenDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Essence.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemInstance createSystemInstance() {
		SystemInstanceImpl systemInstance = new SystemInstanceImpl();
		return systemInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test createTest() {
		TestImpl test = new TestImpl();
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestDB createTestDB() {
		TestDBImpl testDB = new TestDBImpl();
		return testDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReq createTestReq() {
		TestReqImpl testReq = new TestReqImpl();
		return testReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionalPort createTransactionalPort() {
		TransactionalPortImpl transactionalPort = new TransactionalPortImpl();
		return transactionalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionalSignal createTransactionalSignal() {
		TransactionalSignalImpl transactionalSignal = new TransactionalSignalImpl();
		return transactionalSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Union createUnion() {
		UnionImpl union = new UnionImpl();
		return union;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VLNV createVLNV() {
		VLNVImpl vlnv = new VLNVImpl();
		return vlnv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Essence.Void createVoid() {
		VoidImpl void_ = new VoidImpl();
		return void_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WirePort createWirePort() {
		WirePortImpl wirePort = new WirePortImpl();
		return wirePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireSignal createWireSignal() {
		WireSignalImpl wireSignal = new WireSignalImpl();
		return wireSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefConnection createXRefConnection() {
		XRefConnectionImpl xRefConnection = new XRefConnectionImpl();
		return xRefConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefDataVar createXRefDataVar() {
		XRefDataVarImpl xRefDataVar = new XRefDataVarImpl();
		return xRefDataVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefExternalInterface createXRefExternalInterface() {
		XRefExternalInterfaceImpl xRefExternalInterface = new XRefExternalInterfaceImpl();
		return xRefExternalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefExternalPort createXRefExternalPort() {
		XRefExternalPortImpl xRefExternalPort = new XRefExternalPortImpl();
		return xRefExternalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefExternalSignal createXRefExternalSignal() {
		XRefExternalSignalImpl xRefExternalSignal = new XRefExternalSignalImpl();
		return xRefExternalSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefGenericDecl createXRefGenericDecl() {
		XRefGenericDeclImpl xRefGenericDecl = new XRefGenericDeclImpl();
		return xRefGenericDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefIFDPort createXRefIFDPort() {
		XRefIFDPortImpl xRefIFDPort = new XRefIFDPortImpl();
		return xRefIFDPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefIndInterface createXRefIndInterface() {
		XRefIndInterfaceImpl xRefIndInterface = new XRefIndInterfaceImpl();
		return xRefIndInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefIndPin createXRefIndPin() {
		XRefIndPinImpl xRefIndPin = new XRefIndPinImpl();
		return xRefIndPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefIndPort createXRefIndPort() {
		XRefIndPortImpl xRefIndPort = new XRefIndPortImpl();
		return xRefIndPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefIndSinglePad createXRefIndSinglePad() {
		XRefIndSinglePadImpl xRefIndSinglePad = new XRefIndSinglePadImpl();
		return xRefIndSinglePad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefInstance createXRefInstance() {
		XRefInstanceImpl xRefInstance = new XRefInstanceImpl();
		return xRefInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefInternalInterface createXRefInternalInterface() {
		XRefInternalInterfaceImpl xRefInternalInterface = new XRefInternalInterfaceImpl();
		return xRefInternalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefInternalPort createXRefInternalPort() {
		XRefInternalPortImpl xRefInternalPort = new XRefInternalPortImpl();
		return xRefInternalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefInternalSignal createXRefInternalSignal() {
		XRefInternalSignalImpl xRefInternalSignal = new XRefInternalSignalImpl();
		return xRefInternalSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefMasterInterface createXRefMasterInterface() {
		XRefMasterInterfaceImpl xRefMasterInterface = new XRefMasterInterfaceImpl();
		return xRefMasterInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefNet createXRefNet() {
		XRefNetImpl xRefNet = new XRefNetImpl();
		return xRefNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefNoneInterface createXRefNoneInterface() {
		XRefNoneInterfaceImpl xRefNoneInterface = new XRefNoneInterfaceImpl();
		return xRefNoneInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefPadType createXRefPadType() {
		XRefPadTypeImpl xRefPadType = new XRefPadTypeImpl();
		return xRefPadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefParamDecl createXRefParamDecl() {
		XRefParamDeclImpl xRefParamDecl = new XRefParamDeclImpl();
		return xRefParamDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefPin createXRefPin() {
		XRefPinImpl xRefPin = new XRefPinImpl();
		return xRefPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefPowerDomain createXRefPowerDomain() {
		XRefPowerDomainImpl xRefPowerDomain = new XRefPowerDomainImpl();
		return xRefPowerDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefRealPort createXRefRealPort() {
		XRefRealPortImpl xRefRealPort = new XRefRealPortImpl();
		return xRefRealPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefRegisterView createXRefRegisterView() {
		XRefRegisterViewImpl xRefRegisterView = new XRefRegisterViewImpl();
		return xRefRegisterView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefRegMemSet createXRefRegMemSet() {
		XRefRegMemSetImpl xRefRegMemSet = new XRefRegMemSetImpl();
		return xRefRegMemSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefSinglePad createXRefSinglePad() {
		XRefSinglePadImpl xRefSinglePad = new XRefSinglePadImpl();
		return xRefSinglePad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefSiPort createXRefSiPort() {
		XRefSiPortImpl xRefSiPort = new XRefSiPortImpl();
		return xRefSiPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefSiSignal createXRefSiSignal() {
		XRefSiSignalImpl xRefSiSignal = new XRefSiSignalImpl();
		return xRefSiSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefSlaveInterface createXRefSlaveInterface() {
		XRefSlaveInterfaceImpl xRefSlaveInterface = new XRefSlaveInterfaceImpl();
		return xRefSlaveInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefTest createXRefTest() {
		XRefTestImpl xRefTest = new XRefTestImpl();
		return xRefTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType createAccessTypeFromString(EDataType eDataType, String initialValue) {
		AccessType result = AccessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionTypeFromString(EDataType eDataType, String initialValue) {
		ActionType result = ActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorType createBehaviorTypeFromString(EDataType eDataType, String initialValue) {
		BehaviorType result = BehaviorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBehaviorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusErrorType createBusErrorTypeFromString(EDataType eDataType, String initialValue) {
		BusErrorType result = BusErrorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBusErrorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndianType createEndianTypeFromString(EDataType eDataType, String initialValue) {
		EndianType result = EndianType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndianTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType createFunctionTypeFromString(EDataType eDataType, String initialValue) {
		FunctionType result = FunctionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDefRoleType createInterfaceDefRoleTypeFromString(EDataType eDataType, String initialValue) {
		InterfaceDefRoleType result = InterfaceDefRoleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceDefRoleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRoleType createInterfaceRoleTypeFromString(EDataType eDataType, String initialValue) {
		InterfaceRoleType result = InterfaceRoleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceRoleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType createMessageTypeFromString(EDataType eDataType, String initialValue) {
		MessageType result = MessageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDirection createPortDirectionFromString(EDataType eDataType, String initialValue) {
		PortDirection result = PortDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInitiative createPortInitiativeFromString(EDataType eDataType, String initialValue) {
		PortInitiative result = PortInitiative.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortInitiativeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservedType createReservedTypeFromString(EDataType eDataType, String initialValue) {
		ReservedType result = ReservedType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReservedTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignType createSignTypeFromString(EDataType eDataType, String initialValue) {
		SignType result = SignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialType createSpecialTypeFromString(EDataType eDataType, String initialValue) {
		SpecialType result = SpecialType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecialTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrobeType createStrobeTypeFromString(EDataType eDataType, String initialValue) {
		StrobeType result = StrobeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrobeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncMode createSyncModeFromString(EDataType eDataType, String initialValue) {
		SyncMode result = SyncMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSyncModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopSpinType createTopSpinTypeFromString(EDataType eDataType, String initialValue) {
		TopSpinType result = TopSpinType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTopSpinTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualType createVirtualTypeFromString(EDataType eDataType, String initialValue) {
		VirtualType result = VirtualType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVirtualTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType createAccessTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAccessTypeFromString(EssencePackage.eINSTANCE.getAccessType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAccessTypeToString(EssencePackage.eINSTANCE.getAccessType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createActionTypeFromString(EssencePackage.eINSTANCE.getActionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionTypeToString(EssencePackage.eINSTANCE.getActionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorType createBehaviorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBehaviorTypeFromString(EssencePackage.eINSTANCE.getBehaviorType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBehaviorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBehaviorTypeToString(EssencePackage.eINSTANCE.getBehaviorType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBooleanExprFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanExprToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBooleanLiteralFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanLiteralToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusErrorType createBusErrorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBusErrorTypeFromString(EssencePackage.eINSTANCE.getBusErrorType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBusErrorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBusErrorTypeToString(EssencePackage.eINSTANCE.getBusErrorType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCommonExprFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommonExprToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndianType createEndianTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEndianTypeFromString(EssencePackage.eINSTANCE.getEndianType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndianTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEndianTypeToString(EssencePackage.eINSTANCE.getEndianType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType createFunctionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFunctionTypeFromString(EssencePackage.eINSTANCE.getFunctionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFunctionTypeToString(EssencePackage.eINSTANCE.getFunctionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIntegerExprFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerExprToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIntegerLiteralFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerLiteralToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDefRoleType createInterfaceDefRoleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInterfaceDefRoleTypeFromString(EssencePackage.eINSTANCE.getInterfaceDefRoleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceDefRoleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInterfaceDefRoleTypeToString(EssencePackage.eINSTANCE.getInterfaceDefRoleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRoleType createInterfaceRoleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInterfaceRoleTypeFromString(EssencePackage.eINSTANCE.getInterfaceRoleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceRoleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInterfaceRoleTypeToString(EssencePackage.eINSTANCE.getInterfaceRoleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType createMessageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMessageTypeFromString(EssencePackage.eINSTANCE.getMessageType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMessageTypeToString(EssencePackage.eINSTANCE.getMessageType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPathExprFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPathExprToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDirection createPortDirectionObjectFromString(EDataType eDataType, String initialValue) {
		return createPortDirectionFromString(EssencePackage.eINSTANCE.getPortDirection(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortDirectionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPortDirectionToString(EssencePackage.eINSTANCE.getPortDirection(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInitiative createPortInitiativeObjectFromString(EDataType eDataType, String initialValue) {
		return createPortInitiativeFromString(EssencePackage.eINSTANCE.getPortInitiative(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortInitiativeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPortInitiativeToString(EssencePackage.eINSTANCE.getPortInitiative(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservedType createReservedTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createReservedTypeFromString(EssencePackage.eINSTANCE.getReservedType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReservedTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReservedTypeToString(EssencePackage.eINSTANCE.getReservedType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignType createSignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSignTypeFromString(EssencePackage.eINSTANCE.getSignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSignTypeToString(EssencePackage.eINSTANCE.getSignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialType createSpecialTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSpecialTypeFromString(EssencePackage.eINSTANCE.getSpecialType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecialTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSpecialTypeToString(EssencePackage.eINSTANCE.getSpecialType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringExprFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringExprToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringLiteralFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringLiteralToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrobeType createStrobeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStrobeTypeFromString(EssencePackage.eINSTANCE.getStrobeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrobeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStrobeTypeToString(EssencePackage.eINSTANCE.getStrobeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncMode createSyncModeObjectFromString(EDataType eDataType, String initialValue) {
		return createSyncModeFromString(EssencePackage.eINSTANCE.getSyncMode(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSyncModeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSyncModeToString(EssencePackage.eINSTANCE.getSyncMode(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopSpinType createTopSpinTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTopSpinTypeFromString(EssencePackage.eINSTANCE.getTopSpinType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTopSpinTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTopSpinTypeToString(EssencePackage.eINSTANCE.getTopSpinType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualType createVirtualTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVirtualTypeFromString(EssencePackage.eINSTANCE.getVirtualType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVirtualTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVirtualTypeToString(EssencePackage.eINSTANCE.getVirtualType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EssencePackage getEssencePackage() {
		return (EssencePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EssencePackage getPackage() {
		return EssencePackage.eINSTANCE;
	}

} //EssenceFactoryImpl
