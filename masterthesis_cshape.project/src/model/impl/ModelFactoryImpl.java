/**
 */
package model.impl;

import model.Access;
import model.AccessByIndex;
import model.AccessByName;
import model.AccessCondition;
import model.AccessLevel;
import model.AccessType;
import model.ActionType;
import model.AddressBlock;
import model.Array;
import model.ArrayDimension;
import model.BehaviorType;
import model.BitField;
import model.BitFieldGapElement;
import model.BitFieldSequence;
import model.BooleanDecl;
import model.BooleanDef;
import model.BooleanGenDecl;
import model.Bus;
import model.BusErrorType;
import model.BusInstance;
import model.BusInterfaceMap;
import model.BusNoneInterfaceMap;
import model.CablePort;
import model.CableSignal;
import model.Component;
import model.ComponentInstance;
import model.Connection;
import model.ConstDefBlock;
import model.DataDecl;
import model.DataDef;
import model.DataGenDecl;
import model.DataTypeElement;
import model.DescriptionItem;
import model.DocumentRoot;
import model.EndianType;
import model.EnumElement;
import model.Enumeration;
import model.EnumerationInteger;
import model.EnumerationSequence;
import model.EnumerationString;
import model.Function;
import model.FunctionType;
import model.GapElement;
import model.GenericDeclBlock;
import model.GenericMap;
import model.InstanceInterfaceMap;
import model.InstancePortMap;
import model.InstanceShellInterfaceMap;
import model.InstanceShellPortMap;
import model.IntegerDecl;
import model.IntegerDef;
import model.IntegerGenDecl;
import model.Interface;
import model.InterfaceDefCablePort;
import model.InterfaceDefRole;
import model.InterfaceDefRoleType;
import model.InterfaceDefTransactionalPort;
import model.InterfaceDefView;
import model.InterfaceDefWirePort;
import model.InterfaceDefinition;
import model.InterfacePortMap;
import model.InterfaceRoleType;
import model.InterfaceView;
import model.LocalInterfaceMap;
import model.LocalPortMap;
import model.Memory;
import model.MessageType;
import model.MethodDataType;
import model.MethodDataTypeElement;
import model.ModelFactory;
import model.ModelPackage;
import model.Module;
import model.MultiPad;
import model.MultiViewRegister;
import model.Net;
import model.NoneInterface;
import model.PackageInstance;
import model.PadMultiplexed;
import model.PadNetMap;
import model.PadNonMultiplexed;
import model.PadSpecial;
import model.PadSupply;
import model.PadType;
import model.PadTypeDB;
import model.ParamDeclBlock;
import model.ParamMap;
import model.PathRef;
import model.Pin;
import model.PinNetMap;
import model.PortDirection;
import model.PortInitiative;
import model.PortRef;
import model.PowerDomain;
import model.Product;
import model.ProductInstance;
import model.ProductInterfaceMap;
import model.ProductPadMap;
import model.ProductPinMap;
import model.Property;
import model.Record;
import model.RegMemSequence;
import model.RegMemSet;
import model.RegViewBlock;
import model.Register;
import model.RegisterView;
import model.ReservedType;
import model.ResetType;
import model.ReturnElementAccess;
import model.ShellInterfaceMap;
import model.ShellPortMap;
import model.SiComponentInstance;
import model.SiInstanceInterfaceMap;
import model.SiInstancePortMap;
import model.SiInstanceShellInterfaceMap;
import model.SiInstanceShellPortMap;
import model.SiPort;
import model.SiPortDB;
import model.SiPortReq;
import model.SiSignal;
import model.SiSignalDB;
import model.SiSystemInstance;
import model.SignType;
import model.SignalMap;
import model.Silicon;
import model.SiliconInstance;
import model.SimpleDataType;
import model.SpecialType;
import model.StringDecl;
import model.StringDef;
import model.StringGenDecl;
import model.StrobeType;
import model.SyncMode;
import model.SystemInstance;
import model.Test;
import model.TestDB;
import model.TestReq;
import model.TopSpinType;
import model.TransactionalPort;
import model.TransactionalSignal;
import model.Union;
import model.VLNV;
import model.VirtualType;
import model.WirePort;
import model.WireSignal;
import model.XRefConnection;
import model.XRefDataVar;
import model.XRefExternalInterface;
import model.XRefExternalPort;
import model.XRefExternalSignal;
import model.XRefGenericDecl;
import model.XRefIFDPort;
import model.XRefIndInterface;
import model.XRefIndPin;
import model.XRefIndPort;
import model.XRefIndSinglePad;
import model.XRefInstance;
import model.XRefInternalInterface;
import model.XRefInternalPort;
import model.XRefInternalSignal;
import model.XRefMasterInterface;
import model.XRefNet;
import model.XRefNoneInterface;
import model.XRefPadType;
import model.XRefParamDecl;
import model.XRefPin;
import model.XRefPowerDomain;
import model.XRefRealPort;
import model.XRefRegMemSet;
import model.XRefRegisterView;
import model.XRefSiPort;
import model.XRefSiSignal;
import model.XRefSinglePad;
import model.XRefSlaveInterface;
import model.XRefTest;

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
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
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
			case ModelPackage.ACCESS: return createAccess();
			case ModelPackage.ACCESS_BY_INDEX: return createAccessByIndex();
			case ModelPackage.ACCESS_BY_NAME: return createAccessByName();
			case ModelPackage.ACCESS_CONDITION: return createAccessCondition();
			case ModelPackage.ACCESS_LEVEL: return createAccessLevel();
			case ModelPackage.ADDRESS_BLOCK: return createAddressBlock();
			case ModelPackage.ARRAY: return createArray();
			case ModelPackage.ARRAY_DIMENSION: return createArrayDimension();
			case ModelPackage.BIT_FIELD: return createBitField();
			case ModelPackage.BIT_FIELD_GAP_ELEMENT: return createBitFieldGapElement();
			case ModelPackage.BIT_FIELD_SEQUENCE: return createBitFieldSequence();
			case ModelPackage.BOOLEAN_DECL: return createBooleanDecl();
			case ModelPackage.BOOLEAN_DEF: return createBooleanDef();
			case ModelPackage.BOOLEAN_GEN_DECL: return createBooleanGenDecl();
			case ModelPackage.BUS: return createBus();
			case ModelPackage.BUS_INSTANCE: return createBusInstance();
			case ModelPackage.BUS_INTERFACE_MAP: return createBusInterfaceMap();
			case ModelPackage.BUS_NONE_INTERFACE_MAP: return createBusNoneInterfaceMap();
			case ModelPackage.CABLE_PORT: return createCablePort();
			case ModelPackage.CABLE_SIGNAL: return createCableSignal();
			case ModelPackage.COMPONENT: return createComponent();
			case ModelPackage.COMPONENT_INSTANCE: return createComponentInstance();
			case ModelPackage.CONNECTION: return createConnection();
			case ModelPackage.CONST_DEF_BLOCK: return createConstDefBlock();
			case ModelPackage.DATA_DECL: return createDataDecl();
			case ModelPackage.DATA_DEF: return createDataDef();
			case ModelPackage.DATA_GEN_DECL: return createDataGenDecl();
			case ModelPackage.DATA_TYPE_ELEMENT: return createDataTypeElement();
			case ModelPackage.DESCRIPTION_ITEM: return createDescriptionItem();
			case ModelPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ModelPackage.ENUM: return createEnum();
			case ModelPackage.ENUM_ELEMENT: return createEnumElement();
			case ModelPackage.ENUMERATION: return createEnumeration();
			case ModelPackage.ENUMERATION_INTEGER: return createEnumerationInteger();
			case ModelPackage.ENUMERATION_SEQUENCE: return createEnumerationSequence();
			case ModelPackage.ENUMERATION_STRING: return createEnumerationString();
			case ModelPackage.FUNCTION: return createFunction();
			case ModelPackage.GAP_ELEMENT: return createGapElement();
			case ModelPackage.GENERIC_DECL_BLOCK: return createGenericDeclBlock();
			case ModelPackage.GENERIC_MAP: return createGenericMap();
			case ModelPackage.INSTANCE_INTERFACE_MAP: return createInstanceInterfaceMap();
			case ModelPackage.INSTANCE_PORT_MAP: return createInstancePortMap();
			case ModelPackage.INSTANCE_SHELL_INTERFACE_MAP: return createInstanceShellInterfaceMap();
			case ModelPackage.INSTANCE_SHELL_PORT_MAP: return createInstanceShellPortMap();
			case ModelPackage.INTEGER_DECL: return createIntegerDecl();
			case ModelPackage.INTEGER_DEF: return createIntegerDef();
			case ModelPackage.INTEGER_GEN_DECL: return createIntegerGenDecl();
			case ModelPackage.INTERFACE: return createInterface();
			case ModelPackage.INTERFACE_DEF_CABLE_PORT: return createInterfaceDefCablePort();
			case ModelPackage.INTERFACE_DEFINITION: return createInterfaceDefinition();
			case ModelPackage.INTERFACE_DEF_ROLE: return createInterfaceDefRole();
			case ModelPackage.INTERFACE_DEF_TRANSACTIONAL_PORT: return createInterfaceDefTransactionalPort();
			case ModelPackage.INTERFACE_DEF_VIEW: return createInterfaceDefView();
			case ModelPackage.INTERFACE_DEF_WIRE_PORT: return createInterfaceDefWirePort();
			case ModelPackage.INTERFACE_PORT_MAP: return createInterfacePortMap();
			case ModelPackage.INTERFACE_VIEW: return createInterfaceView();
			case ModelPackage.LOCAL_INTERFACE_MAP: return createLocalInterfaceMap();
			case ModelPackage.LOCAL_PORT_MAP: return createLocalPortMap();
			case ModelPackage.MEMORY: return createMemory();
			case ModelPackage.METHOD_DATA_TYPE: return createMethodDataType();
			case ModelPackage.METHOD_DATA_TYPE_ELEMENT: return createMethodDataTypeElement();
			case ModelPackage.MODULE: return createModule();
			case ModelPackage.MULTI_PAD: return createMultiPad();
			case ModelPackage.MULTI_VIEW_REGISTER: return createMultiViewRegister();
			case ModelPackage.NET: return createNet();
			case ModelPackage.NONE_INTERFACE: return createNoneInterface();
			case ModelPackage.PACKAGE: return createPackage();
			case ModelPackage.PACKAGE_INSTANCE: return createPackageInstance();
			case ModelPackage.PAD_MULTIPLEXED: return createPadMultiplexed();
			case ModelPackage.PAD_NET_MAP: return createPadNetMap();
			case ModelPackage.PAD_NON_MULTIPLEXED: return createPadNonMultiplexed();
			case ModelPackage.PAD_SPECIAL: return createPadSpecial();
			case ModelPackage.PAD_SUPPLY: return createPadSupply();
			case ModelPackage.PAD_TYPE: return createPadType();
			case ModelPackage.PAD_TYPE_DB: return createPadTypeDB();
			case ModelPackage.PARAM_DECL_BLOCK: return createParamDeclBlock();
			case ModelPackage.PARAM_MAP: return createParamMap();
			case ModelPackage.PATH_REF: return createPathRef();
			case ModelPackage.PIN: return createPin();
			case ModelPackage.PIN_NET_MAP: return createPinNetMap();
			case ModelPackage.PORT_REF: return createPortRef();
			case ModelPackage.POWER_DOMAIN: return createPowerDomain();
			case ModelPackage.PRODUCT: return createProduct();
			case ModelPackage.PRODUCT_INSTANCE: return createProductInstance();
			case ModelPackage.PRODUCT_INTERFACE_MAP: return createProductInterfaceMap();
			case ModelPackage.PRODUCT_PAD_MAP: return createProductPadMap();
			case ModelPackage.PRODUCT_PIN_MAP: return createProductPinMap();
			case ModelPackage.PROPERTY: return createProperty();
			case ModelPackage.RECORD: return createRecord();
			case ModelPackage.REGISTER: return createRegister();
			case ModelPackage.REGISTER_VIEW: return createRegisterView();
			case ModelPackage.REG_MEM_SEQUENCE: return createRegMemSequence();
			case ModelPackage.REG_MEM_SET: return createRegMemSet();
			case ModelPackage.REG_VIEW_BLOCK: return createRegViewBlock();
			case ModelPackage.RESET_TYPE: return createResetType();
			case ModelPackage.RETURN_ELEMENT_ACCESS: return createReturnElementAccess();
			case ModelPackage.SHELL_INTERFACE_MAP: return createShellInterfaceMap();
			case ModelPackage.SHELL_PORT_MAP: return createShellPortMap();
			case ModelPackage.SI_COMPONENT_INSTANCE: return createSiComponentInstance();
			case ModelPackage.SIGNAL_MAP: return createSignalMap();
			case ModelPackage.SI_INSTANCE_INTERFACE_MAP: return createSiInstanceInterfaceMap();
			case ModelPackage.SI_INSTANCE_PORT_MAP: return createSiInstancePortMap();
			case ModelPackage.SI_INSTANCE_SHELL_INTERFACE_MAP: return createSiInstanceShellInterfaceMap();
			case ModelPackage.SI_INSTANCE_SHELL_PORT_MAP: return createSiInstanceShellPortMap();
			case ModelPackage.SILICON: return createSilicon();
			case ModelPackage.SILICON_INSTANCE: return createSiliconInstance();
			case ModelPackage.SIMPLE_DATA_TYPE: return createSimpleDataType();
			case ModelPackage.SI_PORT: return createSiPort();
			case ModelPackage.SI_PORT_DB: return createSiPortDB();
			case ModelPackage.SI_PORT_REQ: return createSiPortReq();
			case ModelPackage.SI_SIGNAL: return createSiSignal();
			case ModelPackage.SI_SIGNAL_DB: return createSiSignalDB();
			case ModelPackage.SI_SYSTEM_INSTANCE: return createSiSystemInstance();
			case ModelPackage.STRING_DECL: return createStringDecl();
			case ModelPackage.STRING_DEF: return createStringDef();
			case ModelPackage.STRING_GEN_DECL: return createStringGenDecl();
			case ModelPackage.SYSTEM: return createSystem();
			case ModelPackage.SYSTEM_INSTANCE: return createSystemInstance();
			case ModelPackage.TEST: return createTest();
			case ModelPackage.TEST_DB: return createTestDB();
			case ModelPackage.TEST_REQ: return createTestReq();
			case ModelPackage.TRANSACTIONAL_PORT: return createTransactionalPort();
			case ModelPackage.TRANSACTIONAL_SIGNAL: return createTransactionalSignal();
			case ModelPackage.UNION: return createUnion();
			case ModelPackage.VLNV: return createVLNV();
			case ModelPackage.VOID: return createVoid();
			case ModelPackage.WIRE_PORT: return createWirePort();
			case ModelPackage.WIRE_SIGNAL: return createWireSignal();
			case ModelPackage.XREF_CONNECTION: return createXRefConnection();
			case ModelPackage.XREF_DATA_VAR: return createXRefDataVar();
			case ModelPackage.XREF_EXTERNAL_INTERFACE: return createXRefExternalInterface();
			case ModelPackage.XREF_EXTERNAL_PORT: return createXRefExternalPort();
			case ModelPackage.XREF_EXTERNAL_SIGNAL: return createXRefExternalSignal();
			case ModelPackage.XREF_GENERIC_DECL: return createXRefGenericDecl();
			case ModelPackage.XREF_IFD_PORT: return createXRefIFDPort();
			case ModelPackage.XREF_IND_INTERFACE: return createXRefIndInterface();
			case ModelPackage.XREF_IND_PIN: return createXRefIndPin();
			case ModelPackage.XREF_IND_PORT: return createXRefIndPort();
			case ModelPackage.XREF_IND_SINGLE_PAD: return createXRefIndSinglePad();
			case ModelPackage.XREF_INSTANCE: return createXRefInstance();
			case ModelPackage.XREF_INTERNAL_INTERFACE: return createXRefInternalInterface();
			case ModelPackage.XREF_INTERNAL_PORT: return createXRefInternalPort();
			case ModelPackage.XREF_INTERNAL_SIGNAL: return createXRefInternalSignal();
			case ModelPackage.XREF_MASTER_INTERFACE: return createXRefMasterInterface();
			case ModelPackage.XREF_NET: return createXRefNet();
			case ModelPackage.XREF_NONE_INTERFACE: return createXRefNoneInterface();
			case ModelPackage.XREF_PAD_TYPE: return createXRefPadType();
			case ModelPackage.XREF_PARAM_DECL: return createXRefParamDecl();
			case ModelPackage.XREF_PIN: return createXRefPin();
			case ModelPackage.XREF_POWER_DOMAIN: return createXRefPowerDomain();
			case ModelPackage.XREF_REAL_PORT: return createXRefRealPort();
			case ModelPackage.XREF_REGISTER_VIEW: return createXRefRegisterView();
			case ModelPackage.XREF_REG_MEM_SET: return createXRefRegMemSet();
			case ModelPackage.XREF_SINGLE_PAD: return createXRefSinglePad();
			case ModelPackage.XREF_SI_PORT: return createXRefSiPort();
			case ModelPackage.XREF_SI_SIGNAL: return createXRefSiSignal();
			case ModelPackage.XREF_SLAVE_INTERFACE: return createXRefSlaveInterface();
			case ModelPackage.XREF_TEST: return createXRefTest();
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
			case ModelPackage.ACCESS_TYPE:
				return createAccessTypeFromString(eDataType, initialValue);
			case ModelPackage.ACTION_TYPE:
				return createActionTypeFromString(eDataType, initialValue);
			case ModelPackage.BEHAVIOR_TYPE:
				return createBehaviorTypeFromString(eDataType, initialValue);
			case ModelPackage.BUS_ERROR_TYPE:
				return createBusErrorTypeFromString(eDataType, initialValue);
			case ModelPackage.ENDIAN_TYPE:
				return createEndianTypeFromString(eDataType, initialValue);
			case ModelPackage.FUNCTION_TYPE:
				return createFunctionTypeFromString(eDataType, initialValue);
			case ModelPackage.INTERFACE_DEF_ROLE_TYPE:
				return createInterfaceDefRoleTypeFromString(eDataType, initialValue);
			case ModelPackage.INTERFACE_ROLE_TYPE:
				return createInterfaceRoleTypeFromString(eDataType, initialValue);
			case ModelPackage.MESSAGE_TYPE:
				return createMessageTypeFromString(eDataType, initialValue);
			case ModelPackage.PORT_DIRECTION:
				return createPortDirectionFromString(eDataType, initialValue);
			case ModelPackage.PORT_INITIATIVE:
				return createPortInitiativeFromString(eDataType, initialValue);
			case ModelPackage.RESERVED_TYPE:
				return createReservedTypeFromString(eDataType, initialValue);
			case ModelPackage.SIGN_TYPE:
				return createSignTypeFromString(eDataType, initialValue);
			case ModelPackage.SPECIAL_TYPE:
				return createSpecialTypeFromString(eDataType, initialValue);
			case ModelPackage.STROBE_TYPE:
				return createStrobeTypeFromString(eDataType, initialValue);
			case ModelPackage.SYNC_MODE:
				return createSyncModeFromString(eDataType, initialValue);
			case ModelPackage.TOP_SPIN_TYPE:
				return createTopSpinTypeFromString(eDataType, initialValue);
			case ModelPackage.VIRTUAL_TYPE:
				return createVirtualTypeFromString(eDataType, initialValue);
			case ModelPackage.ACCESS_TYPE_OBJECT:
				return createAccessTypeObjectFromString(eDataType, initialValue);
			case ModelPackage.ACTION_TYPE_OBJECT:
				return createActionTypeObjectFromString(eDataType, initialValue);
			case ModelPackage.BEHAVIOR_TYPE_OBJECT:
				return createBehaviorTypeObjectFromString(eDataType, initialValue);
			case ModelPackage.BOOLEAN_EXPR:
				return createBooleanExprFromString(eDataType, initialValue);
			case ModelPackage.BOOLEAN_LITERAL:
				return createBooleanLiteralFromString(eDataType, initialValue);
			case ModelPackage.BUS_ERROR_TYPE_OBJECT:
				return createBusErrorTypeObjectFromString(eDataType, initialValue);
			case ModelPackage.COMMON_EXPR:
				return createCommonExprFromString(eDataType, initialValue);
			case ModelPackage.ENDIAN_TYPE_OBJECT:
				return createEndianTypeObjectFromString(eDataType, initialValue);
			case ModelPackage.FUNCTION_TYPE_OBJECT:
				return createFunctionTypeObjectFromString(eDataType, initialValue);
			case ModelPackage.INTEGER_EXPR:
				return createIntegerExprFromString(eDataType, initialValue);
			case ModelPackage.INTEGER_LITERAL:
				return createIntegerLiteralFromString(eDataType, initialValue);
			case ModelPackage.INTERFACE_DEF_ROLE_TYPE_OBJECT:
				return createInterfaceDefRoleTypeObjectFromString(eDataType, initialValue);
			case ModelPackage.INTERFACE_ROLE_TYPE_OBJECT:
				return createInterfaceRoleTypeObjectFromString(eDataType, initialValue);
			case ModelPackage.MESSAGE_TYPE_OBJECT:
				return createMessageTypeObjectFromString(eDataType, initialValue);
			case ModelPackage.PATH_EXPR:
				return createPathExprFromString(eDataType, initialValue);
			case ModelPackage.PORT_DIRECTION_OBJECT:
				return createPortDirectionObjectFromString(eDataType, initialValue);
			case ModelPackage.PORT_INITIATIVE_OBJECT:
				return createPortInitiativeObjectFromString(eDataType, initialValue);
			case ModelPackage.RESERVED_TYPE_OBJECT:
				return createReservedTypeObjectFromString(eDataType, initialValue);
			case ModelPackage.SIGN_TYPE_OBJECT:
				return createSignTypeObjectFromString(eDataType, initialValue);
			case ModelPackage.SPECIAL_TYPE_OBJECT:
				return createSpecialTypeObjectFromString(eDataType, initialValue);
			case ModelPackage.STRING_EXPR:
				return createStringExprFromString(eDataType, initialValue);
			case ModelPackage.STRING_LITERAL:
				return createStringLiteralFromString(eDataType, initialValue);
			case ModelPackage.STROBE_TYPE_OBJECT:
				return createStrobeTypeObjectFromString(eDataType, initialValue);
			case ModelPackage.SYNC_MODE_OBJECT:
				return createSyncModeObjectFromString(eDataType, initialValue);
			case ModelPackage.TOP_SPIN_TYPE_OBJECT:
				return createTopSpinTypeObjectFromString(eDataType, initialValue);
			case ModelPackage.VIRTUAL_TYPE_OBJECT:
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
			case ModelPackage.ACCESS_TYPE:
				return convertAccessTypeToString(eDataType, instanceValue);
			case ModelPackage.ACTION_TYPE:
				return convertActionTypeToString(eDataType, instanceValue);
			case ModelPackage.BEHAVIOR_TYPE:
				return convertBehaviorTypeToString(eDataType, instanceValue);
			case ModelPackage.BUS_ERROR_TYPE:
				return convertBusErrorTypeToString(eDataType, instanceValue);
			case ModelPackage.ENDIAN_TYPE:
				return convertEndianTypeToString(eDataType, instanceValue);
			case ModelPackage.FUNCTION_TYPE:
				return convertFunctionTypeToString(eDataType, instanceValue);
			case ModelPackage.INTERFACE_DEF_ROLE_TYPE:
				return convertInterfaceDefRoleTypeToString(eDataType, instanceValue);
			case ModelPackage.INTERFACE_ROLE_TYPE:
				return convertInterfaceRoleTypeToString(eDataType, instanceValue);
			case ModelPackage.MESSAGE_TYPE:
				return convertMessageTypeToString(eDataType, instanceValue);
			case ModelPackage.PORT_DIRECTION:
				return convertPortDirectionToString(eDataType, instanceValue);
			case ModelPackage.PORT_INITIATIVE:
				return convertPortInitiativeToString(eDataType, instanceValue);
			case ModelPackage.RESERVED_TYPE:
				return convertReservedTypeToString(eDataType, instanceValue);
			case ModelPackage.SIGN_TYPE:
				return convertSignTypeToString(eDataType, instanceValue);
			case ModelPackage.SPECIAL_TYPE:
				return convertSpecialTypeToString(eDataType, instanceValue);
			case ModelPackage.STROBE_TYPE:
				return convertStrobeTypeToString(eDataType, instanceValue);
			case ModelPackage.SYNC_MODE:
				return convertSyncModeToString(eDataType, instanceValue);
			case ModelPackage.TOP_SPIN_TYPE:
				return convertTopSpinTypeToString(eDataType, instanceValue);
			case ModelPackage.VIRTUAL_TYPE:
				return convertVirtualTypeToString(eDataType, instanceValue);
			case ModelPackage.ACCESS_TYPE_OBJECT:
				return convertAccessTypeObjectToString(eDataType, instanceValue);
			case ModelPackage.ACTION_TYPE_OBJECT:
				return convertActionTypeObjectToString(eDataType, instanceValue);
			case ModelPackage.BEHAVIOR_TYPE_OBJECT:
				return convertBehaviorTypeObjectToString(eDataType, instanceValue);
			case ModelPackage.BOOLEAN_EXPR:
				return convertBooleanExprToString(eDataType, instanceValue);
			case ModelPackage.BOOLEAN_LITERAL:
				return convertBooleanLiteralToString(eDataType, instanceValue);
			case ModelPackage.BUS_ERROR_TYPE_OBJECT:
				return convertBusErrorTypeObjectToString(eDataType, instanceValue);
			case ModelPackage.COMMON_EXPR:
				return convertCommonExprToString(eDataType, instanceValue);
			case ModelPackage.ENDIAN_TYPE_OBJECT:
				return convertEndianTypeObjectToString(eDataType, instanceValue);
			case ModelPackage.FUNCTION_TYPE_OBJECT:
				return convertFunctionTypeObjectToString(eDataType, instanceValue);
			case ModelPackage.INTEGER_EXPR:
				return convertIntegerExprToString(eDataType, instanceValue);
			case ModelPackage.INTEGER_LITERAL:
				return convertIntegerLiteralToString(eDataType, instanceValue);
			case ModelPackage.INTERFACE_DEF_ROLE_TYPE_OBJECT:
				return convertInterfaceDefRoleTypeObjectToString(eDataType, instanceValue);
			case ModelPackage.INTERFACE_ROLE_TYPE_OBJECT:
				return convertInterfaceRoleTypeObjectToString(eDataType, instanceValue);
			case ModelPackage.MESSAGE_TYPE_OBJECT:
				return convertMessageTypeObjectToString(eDataType, instanceValue);
			case ModelPackage.PATH_EXPR:
				return convertPathExprToString(eDataType, instanceValue);
			case ModelPackage.PORT_DIRECTION_OBJECT:
				return convertPortDirectionObjectToString(eDataType, instanceValue);
			case ModelPackage.PORT_INITIATIVE_OBJECT:
				return convertPortInitiativeObjectToString(eDataType, instanceValue);
			case ModelPackage.RESERVED_TYPE_OBJECT:
				return convertReservedTypeObjectToString(eDataType, instanceValue);
			case ModelPackage.SIGN_TYPE_OBJECT:
				return convertSignTypeObjectToString(eDataType, instanceValue);
			case ModelPackage.SPECIAL_TYPE_OBJECT:
				return convertSpecialTypeObjectToString(eDataType, instanceValue);
			case ModelPackage.STRING_EXPR:
				return convertStringExprToString(eDataType, instanceValue);
			case ModelPackage.STRING_LITERAL:
				return convertStringLiteralToString(eDataType, instanceValue);
			case ModelPackage.STROBE_TYPE_OBJECT:
				return convertStrobeTypeObjectToString(eDataType, instanceValue);
			case ModelPackage.SYNC_MODE_OBJECT:
				return convertSyncModeObjectToString(eDataType, instanceValue);
			case ModelPackage.TOP_SPIN_TYPE_OBJECT:
				return convertTopSpinTypeObjectToString(eDataType, instanceValue);
			case ModelPackage.VIRTUAL_TYPE_OBJECT:
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
	public model.Enum createEnum() {
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
	public model.Package createPackage() {
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
	public model.System createSystem() {
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
	public model.Void createVoid() {
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
		return createAccessTypeFromString(ModelPackage.eINSTANCE.getAccessType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAccessTypeToString(ModelPackage.eINSTANCE.getAccessType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createActionTypeFromString(ModelPackage.eINSTANCE.getActionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionTypeToString(ModelPackage.eINSTANCE.getActionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorType createBehaviorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createBehaviorTypeFromString(ModelPackage.eINSTANCE.getBehaviorType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBehaviorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBehaviorTypeToString(ModelPackage.eINSTANCE.getBehaviorType(), instanceValue);
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
		return createBusErrorTypeFromString(ModelPackage.eINSTANCE.getBusErrorType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBusErrorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBusErrorTypeToString(ModelPackage.eINSTANCE.getBusErrorType(), instanceValue);
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
		return createEndianTypeFromString(ModelPackage.eINSTANCE.getEndianType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndianTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEndianTypeToString(ModelPackage.eINSTANCE.getEndianType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType createFunctionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFunctionTypeFromString(ModelPackage.eINSTANCE.getFunctionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFunctionTypeToString(ModelPackage.eINSTANCE.getFunctionType(), instanceValue);
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
		return createInterfaceDefRoleTypeFromString(ModelPackage.eINSTANCE.getInterfaceDefRoleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceDefRoleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInterfaceDefRoleTypeToString(ModelPackage.eINSTANCE.getInterfaceDefRoleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRoleType createInterfaceRoleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInterfaceRoleTypeFromString(ModelPackage.eINSTANCE.getInterfaceRoleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceRoleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInterfaceRoleTypeToString(ModelPackage.eINSTANCE.getInterfaceRoleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType createMessageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMessageTypeFromString(ModelPackage.eINSTANCE.getMessageType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMessageTypeToString(ModelPackage.eINSTANCE.getMessageType(), instanceValue);
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
		return createPortDirectionFromString(ModelPackage.eINSTANCE.getPortDirection(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortDirectionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPortDirectionToString(ModelPackage.eINSTANCE.getPortDirection(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInitiative createPortInitiativeObjectFromString(EDataType eDataType, String initialValue) {
		return createPortInitiativeFromString(ModelPackage.eINSTANCE.getPortInitiative(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortInitiativeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPortInitiativeToString(ModelPackage.eINSTANCE.getPortInitiative(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservedType createReservedTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createReservedTypeFromString(ModelPackage.eINSTANCE.getReservedType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReservedTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReservedTypeToString(ModelPackage.eINSTANCE.getReservedType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignType createSignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSignTypeFromString(ModelPackage.eINSTANCE.getSignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSignTypeToString(ModelPackage.eINSTANCE.getSignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialType createSpecialTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSpecialTypeFromString(ModelPackage.eINSTANCE.getSpecialType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecialTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSpecialTypeToString(ModelPackage.eINSTANCE.getSpecialType(), instanceValue);
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
		return createStrobeTypeFromString(ModelPackage.eINSTANCE.getStrobeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrobeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStrobeTypeToString(ModelPackage.eINSTANCE.getStrobeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncMode createSyncModeObjectFromString(EDataType eDataType, String initialValue) {
		return createSyncModeFromString(ModelPackage.eINSTANCE.getSyncMode(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSyncModeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSyncModeToString(ModelPackage.eINSTANCE.getSyncMode(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopSpinType createTopSpinTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTopSpinTypeFromString(ModelPackage.eINSTANCE.getTopSpinType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTopSpinTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTopSpinTypeToString(ModelPackage.eINSTANCE.getTopSpinType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualType createVirtualTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVirtualTypeFromString(ModelPackage.eINSTANCE.getVirtualType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVirtualTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVirtualTypeToString(ModelPackage.eINSTANCE.getVirtualType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
