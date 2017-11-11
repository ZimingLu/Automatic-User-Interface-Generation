/**
 */
package model.util;

import java.util.Map;

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
import model.BitFieldElement;
import model.BitFieldGapElement;
import model.BitFieldSequence;
import model.BitFieldSequenceElement;
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
import model.ComplexDataType;
import model.Component;
import model.ComponentInstance;
import model.Connection;
import model.ConstDef;
import model.ConstDefBlock;
import model.DataDecl;
import model.DataDef;
import model.DataGenDecl;
import model.DataType;
import model.DataTypeElement;
import model.DescriptionItem;
import model.DocumentRoot;
import model.EndianType;
import model.EnumElement;
import model.Enumeration;
import model.EnumerationElement;
import model.EnumerationInteger;
import model.EnumerationSequence;
import model.EnumerationString;
import model.EssenceBase;
import model.Function;
import model.FunctionType;
import model.GapElement;
import model.GeneralInstance;
import model.GeneralInterface;
import model.GeneralPad;
import model.GeneralPort;
import model.GeneralRegister;
import model.GenericDecl;
import model.GenericDeclBlock;
import model.GenericMap;
import model.IndexVarUser;
import model.Instance;
import model.InstanceInterfaceMap;
import model.InstancePortMap;
import model.InstanceShellInterfaceMap;
import model.InstanceShellPortMap;
import model.IntegerDecl;
import model.IntegerDef;
import model.IntegerGenDecl;
import model.Interface;
import model.InterfaceDefCablePort;
import model.InterfaceDefPort;
import model.InterfaceDefRole;
import model.InterfaceDefRoleType;
import model.InterfaceDefTransactionalPort;
import model.InterfaceDefView;
import model.InterfaceDefWirePort;
import model.InterfaceDefinition;
import model.InterfaceInstance;
import model.InterfacePortMap;
import model.InterfaceRoleType;
import model.InterfaceView;
import model.LocalInterfaceMap;
import model.LocalPortMap;
import model.Memory;
import model.MessageType;
import model.MethodDataType;
import model.MethodDataTypeElement;
import model.ModelPackage;
import model.ModelRoot;
import model.Module;
import model.MultiPad;
import model.MultiViewRegister;
import model.Net;
import model.NoneInterface;
import model.PackageInstance;
import model.Pad;
import model.PadMultiplexed;
import model.PadNetMap;
import model.PadNonMultiplexed;
import model.PadSpecial;
import model.PadSupply;
import model.PadType;
import model.PadTypeDB;
import model.ParamDecl;
import model.ParamDeclBlock;
import model.ParamMap;
import model.PathRef;
import model.Pin;
import model.PinNetMap;
import model.Port;
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
import model.RealPort;
import model.Record;
import model.Reference;
import model.RegMemElement;
import model.RegMemSequence;
import model.RegMemSet;
import model.RegViewBlock;
import model.Register;
import model.RegisterView;
import model.ReservedType;
import model.ResetType;
import model.ReturnDataType;
import model.ReturnElementAccess;
import model.SequenceElement;
import model.ShellInterfaceMap;
import model.ShellPortMap;
import model.SiComponentInstance;
import model.SiInstance;
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
import model.Signal;
import model.SignalMap;
import model.SignalOwner;
import model.Silicon;
import model.SiliconInstance;
import model.SimpleDataType;
import model.SimpleSubElementAccess;
import model.SinglePad;
import model.SingleSourceNode;
import model.SpecialType;
import model.StringDecl;
import model.StringDef;
import model.StringGenDecl;
import model.StrobeType;
import model.SubElementAccess;
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
import model.ValueDataType;
import model.VarDef;
import model.VarDefBlock;
import model.VirtualType;
import model.WirePort;
import model.WireSignal;
import model.XRef;
import model.XRefConnection;
import model.XRefDataVar;
import model.XRefDirect;
import model.XRefExternal;
import model.XRefExternalInterface;
import model.XRefExternalPort;
import model.XRefExternalSignal;
import model.XRefGenericDecl;
import model.XRefIFDPort;
import model.XRefIndInterface;
import model.XRefIndPin;
import model.XRefIndPort;
import model.XRefIndSinglePad;
import model.XRefIndirect;
import model.XRefInstance;
import model.XRefInternal;
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
import model.XRefVLNV;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public class ModelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ModelValidator INSTANCE = new ModelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "model";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ModelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ModelPackage.ACCESS:
				return validateAccess((Access)value, diagnostics, context);
			case ModelPackage.ACCESS_BY_INDEX:
				return validateAccessByIndex((AccessByIndex)value, diagnostics, context);
			case ModelPackage.ACCESS_BY_NAME:
				return validateAccessByName((AccessByName)value, diagnostics, context);
			case ModelPackage.ACCESS_CONDITION:
				return validateAccessCondition((AccessCondition)value, diagnostics, context);
			case ModelPackage.ACCESS_LEVEL:
				return validateAccessLevel((AccessLevel)value, diagnostics, context);
			case ModelPackage.ADDRESS_BLOCK:
				return validateAddressBlock((AddressBlock)value, diagnostics, context);
			case ModelPackage.ARRAY:
				return validateArray((Array)value, diagnostics, context);
			case ModelPackage.ARRAY_DIMENSION:
				return validateArrayDimension((ArrayDimension)value, diagnostics, context);
			case ModelPackage.BIT_FIELD:
				return validateBitField((BitField)value, diagnostics, context);
			case ModelPackage.BIT_FIELD_ELEMENT:
				return validateBitFieldElement((BitFieldElement)value, diagnostics, context);
			case ModelPackage.BIT_FIELD_GAP_ELEMENT:
				return validateBitFieldGapElement((BitFieldGapElement)value, diagnostics, context);
			case ModelPackage.BIT_FIELD_SEQUENCE:
				return validateBitFieldSequence((BitFieldSequence)value, diagnostics, context);
			case ModelPackage.BIT_FIELD_SEQUENCE_ELEMENT:
				return validateBitFieldSequenceElement((BitFieldSequenceElement)value, diagnostics, context);
			case ModelPackage.BOOLEAN_DECL:
				return validateBooleanDecl((BooleanDecl)value, diagnostics, context);
			case ModelPackage.BOOLEAN_DEF:
				return validateBooleanDef((BooleanDef)value, diagnostics, context);
			case ModelPackage.BOOLEAN_GEN_DECL:
				return validateBooleanGenDecl((BooleanGenDecl)value, diagnostics, context);
			case ModelPackage.BUS:
				return validateBus((Bus)value, diagnostics, context);
			case ModelPackage.BUS_INSTANCE:
				return validateBusInstance((BusInstance)value, diagnostics, context);
			case ModelPackage.BUS_INTERFACE_MAP:
				return validateBusInterfaceMap((BusInterfaceMap)value, diagnostics, context);
			case ModelPackage.BUS_NONE_INTERFACE_MAP:
				return validateBusNoneInterfaceMap((BusNoneInterfaceMap)value, diagnostics, context);
			case ModelPackage.CABLE_PORT:
				return validateCablePort((CablePort)value, diagnostics, context);
			case ModelPackage.CABLE_SIGNAL:
				return validateCableSignal((CableSignal)value, diagnostics, context);
			case ModelPackage.COMPLEX_DATA_TYPE:
				return validateComplexDataType((ComplexDataType)value, diagnostics, context);
			case ModelPackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case ModelPackage.COMPONENT_INSTANCE:
				return validateComponentInstance((ComponentInstance)value, diagnostics, context);
			case ModelPackage.CONNECTION:
				return validateConnection((Connection)value, diagnostics, context);
			case ModelPackage.CONST_DEF:
				return validateConstDef((ConstDef)value, diagnostics, context);
			case ModelPackage.CONST_DEF_BLOCK:
				return validateConstDefBlock((ConstDefBlock)value, diagnostics, context);
			case ModelPackage.DATA_DECL:
				return validateDataDecl((DataDecl)value, diagnostics, context);
			case ModelPackage.DATA_DEF:
				return validateDataDef((DataDef)value, diagnostics, context);
			case ModelPackage.DATA_GEN_DECL:
				return validateDataGenDecl((DataGenDecl)value, diagnostics, context);
			case ModelPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case ModelPackage.DATA_TYPE_ELEMENT:
				return validateDataTypeElement((DataTypeElement)value, diagnostics, context);
			case ModelPackage.DESCRIPTION_ITEM:
				return validateDescriptionItem((DescriptionItem)value, diagnostics, context);
			case ModelPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case ModelPackage.ENUM:
				return validateEnum((model.Enum)value, diagnostics, context);
			case ModelPackage.ENUM_ELEMENT:
				return validateEnumElement((EnumElement)value, diagnostics, context);
			case ModelPackage.ENUMERATION:
				return validateEnumeration((Enumeration)value, diagnostics, context);
			case ModelPackage.ENUMERATION_ELEMENT:
				return validateEnumerationElement((EnumerationElement)value, diagnostics, context);
			case ModelPackage.ENUMERATION_INTEGER:
				return validateEnumerationInteger((EnumerationInteger)value, diagnostics, context);
			case ModelPackage.ENUMERATION_SEQUENCE:
				return validateEnumerationSequence((EnumerationSequence)value, diagnostics, context);
			case ModelPackage.ENUMERATION_STRING:
				return validateEnumerationString((EnumerationString)value, diagnostics, context);
			case ModelPackage.ESSENCE_BASE:
				return validateEssenceBase((EssenceBase)value, diagnostics, context);
			case ModelPackage.FUNCTION:
				return validateFunction((Function)value, diagnostics, context);
			case ModelPackage.GAP_ELEMENT:
				return validateGapElement((GapElement)value, diagnostics, context);
			case ModelPackage.GENERAL_INSTANCE:
				return validateGeneralInstance((GeneralInstance)value, diagnostics, context);
			case ModelPackage.GENERAL_INTERFACE:
				return validateGeneralInterface((GeneralInterface)value, diagnostics, context);
			case ModelPackage.GENERAL_PAD:
				return validateGeneralPad((GeneralPad)value, diagnostics, context);
			case ModelPackage.GENERAL_PORT:
				return validateGeneralPort((GeneralPort)value, diagnostics, context);
			case ModelPackage.GENERAL_REGISTER:
				return validateGeneralRegister((GeneralRegister)value, diagnostics, context);
			case ModelPackage.GENERIC_DECL:
				return validateGenericDecl((GenericDecl)value, diagnostics, context);
			case ModelPackage.GENERIC_DECL_BLOCK:
				return validateGenericDeclBlock((GenericDeclBlock)value, diagnostics, context);
			case ModelPackage.GENERIC_MAP:
				return validateGenericMap((GenericMap)value, diagnostics, context);
			case ModelPackage.INDEX_VAR_USER:
				return validateIndexVarUser((IndexVarUser)value, diagnostics, context);
			case ModelPackage.INSTANCE:
				return validateInstance((Instance)value, diagnostics, context);
			case ModelPackage.INSTANCE_INTERFACE_MAP:
				return validateInstanceInterfaceMap((InstanceInterfaceMap)value, diagnostics, context);
			case ModelPackage.INSTANCE_PORT_MAP:
				return validateInstancePortMap((InstancePortMap)value, diagnostics, context);
			case ModelPackage.INSTANCE_SHELL_INTERFACE_MAP:
				return validateInstanceShellInterfaceMap((InstanceShellInterfaceMap)value, diagnostics, context);
			case ModelPackage.INSTANCE_SHELL_PORT_MAP:
				return validateInstanceShellPortMap((InstanceShellPortMap)value, diagnostics, context);
			case ModelPackage.INTEGER_DECL:
				return validateIntegerDecl((IntegerDecl)value, diagnostics, context);
			case ModelPackage.INTEGER_DEF:
				return validateIntegerDef((IntegerDef)value, diagnostics, context);
			case ModelPackage.INTEGER_GEN_DECL:
				return validateIntegerGenDecl((IntegerGenDecl)value, diagnostics, context);
			case ModelPackage.INTERFACE:
				return validateInterface((Interface)value, diagnostics, context);
			case ModelPackage.INTERFACE_DEF_CABLE_PORT:
				return validateInterfaceDefCablePort((InterfaceDefCablePort)value, diagnostics, context);
			case ModelPackage.INTERFACE_DEFINITION:
				return validateInterfaceDefinition((InterfaceDefinition)value, diagnostics, context);
			case ModelPackage.INTERFACE_DEF_PORT:
				return validateInterfaceDefPort((InterfaceDefPort)value, diagnostics, context);
			case ModelPackage.INTERFACE_DEF_ROLE:
				return validateInterfaceDefRole((InterfaceDefRole)value, diagnostics, context);
			case ModelPackage.INTERFACE_DEF_TRANSACTIONAL_PORT:
				return validateInterfaceDefTransactionalPort((InterfaceDefTransactionalPort)value, diagnostics, context);
			case ModelPackage.INTERFACE_DEF_VIEW:
				return validateInterfaceDefView((InterfaceDefView)value, diagnostics, context);
			case ModelPackage.INTERFACE_DEF_WIRE_PORT:
				return validateInterfaceDefWirePort((InterfaceDefWirePort)value, diagnostics, context);
			case ModelPackage.INTERFACE_INSTANCE:
				return validateInterfaceInstance((InterfaceInstance)value, diagnostics, context);
			case ModelPackage.INTERFACE_PORT_MAP:
				return validateInterfacePortMap((InterfacePortMap)value, diagnostics, context);
			case ModelPackage.INTERFACE_VIEW:
				return validateInterfaceView((InterfaceView)value, diagnostics, context);
			case ModelPackage.LOCAL_INTERFACE_MAP:
				return validateLocalInterfaceMap((LocalInterfaceMap)value, diagnostics, context);
			case ModelPackage.LOCAL_PORT_MAP:
				return validateLocalPortMap((LocalPortMap)value, diagnostics, context);
			case ModelPackage.MEMORY:
				return validateMemory((Memory)value, diagnostics, context);
			case ModelPackage.METHOD_DATA_TYPE:
				return validateMethodDataType((MethodDataType)value, diagnostics, context);
			case ModelPackage.METHOD_DATA_TYPE_ELEMENT:
				return validateMethodDataTypeElement((MethodDataTypeElement)value, diagnostics, context);
			case ModelPackage.MODEL_ROOT:
				return validateModelRoot((ModelRoot)value, diagnostics, context);
			case ModelPackage.MODULE:
				return validateModule((Module)value, diagnostics, context);
			case ModelPackage.MULTI_PAD:
				return validateMultiPad((MultiPad)value, diagnostics, context);
			case ModelPackage.MULTI_VIEW_REGISTER:
				return validateMultiViewRegister((MultiViewRegister)value, diagnostics, context);
			case ModelPackage.NET:
				return validateNet((Net)value, diagnostics, context);
			case ModelPackage.NONE_INTERFACE:
				return validateNoneInterface((NoneInterface)value, diagnostics, context);
			case ModelPackage.PACKAGE:
				return validatePackage((model.Package)value, diagnostics, context);
			case ModelPackage.PACKAGE_INSTANCE:
				return validatePackageInstance((PackageInstance)value, diagnostics, context);
			case ModelPackage.PAD:
				return validatePad((Pad)value, diagnostics, context);
			case ModelPackage.PAD_MULTIPLEXED:
				return validatePadMultiplexed((PadMultiplexed)value, diagnostics, context);
			case ModelPackage.PAD_NET_MAP:
				return validatePadNetMap((PadNetMap)value, diagnostics, context);
			case ModelPackage.PAD_NON_MULTIPLEXED:
				return validatePadNonMultiplexed((PadNonMultiplexed)value, diagnostics, context);
			case ModelPackage.PAD_SPECIAL:
				return validatePadSpecial((PadSpecial)value, diagnostics, context);
			case ModelPackage.PAD_SUPPLY:
				return validatePadSupply((PadSupply)value, diagnostics, context);
			case ModelPackage.PAD_TYPE:
				return validatePadType((PadType)value, diagnostics, context);
			case ModelPackage.PAD_TYPE_DB:
				return validatePadTypeDB((PadTypeDB)value, diagnostics, context);
			case ModelPackage.PARAM_DECL:
				return validateParamDecl((ParamDecl)value, diagnostics, context);
			case ModelPackage.PARAM_DECL_BLOCK:
				return validateParamDeclBlock((ParamDeclBlock)value, diagnostics, context);
			case ModelPackage.PARAM_MAP:
				return validateParamMap((ParamMap)value, diagnostics, context);
			case ModelPackage.PATH_REF:
				return validatePathRef((PathRef)value, diagnostics, context);
			case ModelPackage.PIN:
				return validatePin((Pin)value, diagnostics, context);
			case ModelPackage.PIN_NET_MAP:
				return validatePinNetMap((PinNetMap)value, diagnostics, context);
			case ModelPackage.PORT:
				return validatePort((Port)value, diagnostics, context);
			case ModelPackage.PORT_REF:
				return validatePortRef((PortRef)value, diagnostics, context);
			case ModelPackage.POWER_DOMAIN:
				return validatePowerDomain((PowerDomain)value, diagnostics, context);
			case ModelPackage.PRODUCT:
				return validateProduct((Product)value, diagnostics, context);
			case ModelPackage.PRODUCT_INSTANCE:
				return validateProductInstance((ProductInstance)value, diagnostics, context);
			case ModelPackage.PRODUCT_INTERFACE_MAP:
				return validateProductInterfaceMap((ProductInterfaceMap)value, diagnostics, context);
			case ModelPackage.PRODUCT_PAD_MAP:
				return validateProductPadMap((ProductPadMap)value, diagnostics, context);
			case ModelPackage.PRODUCT_PIN_MAP:
				return validateProductPinMap((ProductPinMap)value, diagnostics, context);
			case ModelPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case ModelPackage.REAL_PORT:
				return validateRealPort((RealPort)value, diagnostics, context);
			case ModelPackage.RECORD:
				return validateRecord((Record)value, diagnostics, context);
			case ModelPackage.REFERENCE:
				return validateReference((Reference)value, diagnostics, context);
			case ModelPackage.REGISTER:
				return validateRegister((Register)value, diagnostics, context);
			case ModelPackage.REGISTER_VIEW:
				return validateRegisterView((RegisterView)value, diagnostics, context);
			case ModelPackage.REG_MEM_ELEMENT:
				return validateRegMemElement((RegMemElement)value, diagnostics, context);
			case ModelPackage.REG_MEM_SEQUENCE:
				return validateRegMemSequence((RegMemSequence)value, diagnostics, context);
			case ModelPackage.REG_MEM_SET:
				return validateRegMemSet((RegMemSet)value, diagnostics, context);
			case ModelPackage.REG_VIEW_BLOCK:
				return validateRegViewBlock((RegViewBlock)value, diagnostics, context);
			case ModelPackage.RESET_TYPE:
				return validateResetType((ResetType)value, diagnostics, context);
			case ModelPackage.RETURN_DATA_TYPE:
				return validateReturnDataType((ReturnDataType)value, diagnostics, context);
			case ModelPackage.RETURN_ELEMENT_ACCESS:
				return validateReturnElementAccess((ReturnElementAccess)value, diagnostics, context);
			case ModelPackage.SEQUENCE_ELEMENT:
				return validateSequenceElement((SequenceElement)value, diagnostics, context);
			case ModelPackage.SHELL_INTERFACE_MAP:
				return validateShellInterfaceMap((ShellInterfaceMap)value, diagnostics, context);
			case ModelPackage.SHELL_PORT_MAP:
				return validateShellPortMap((ShellPortMap)value, diagnostics, context);
			case ModelPackage.SI_COMPONENT_INSTANCE:
				return validateSiComponentInstance((SiComponentInstance)value, diagnostics, context);
			case ModelPackage.SIGNAL:
				return validateSignal((Signal)value, diagnostics, context);
			case ModelPackage.SIGNAL_MAP:
				return validateSignalMap((SignalMap)value, diagnostics, context);
			case ModelPackage.SIGNAL_OWNER:
				return validateSignalOwner((SignalOwner)value, diagnostics, context);
			case ModelPackage.SI_INSTANCE:
				return validateSiInstance((SiInstance)value, diagnostics, context);
			case ModelPackage.SI_INSTANCE_INTERFACE_MAP:
				return validateSiInstanceInterfaceMap((SiInstanceInterfaceMap)value, diagnostics, context);
			case ModelPackage.SI_INSTANCE_PORT_MAP:
				return validateSiInstancePortMap((SiInstancePortMap)value, diagnostics, context);
			case ModelPackage.SI_INSTANCE_SHELL_INTERFACE_MAP:
				return validateSiInstanceShellInterfaceMap((SiInstanceShellInterfaceMap)value, diagnostics, context);
			case ModelPackage.SI_INSTANCE_SHELL_PORT_MAP:
				return validateSiInstanceShellPortMap((SiInstanceShellPortMap)value, diagnostics, context);
			case ModelPackage.SILICON:
				return validateSilicon((Silicon)value, diagnostics, context);
			case ModelPackage.SILICON_INSTANCE:
				return validateSiliconInstance((SiliconInstance)value, diagnostics, context);
			case ModelPackage.SIMPLE_DATA_TYPE:
				return validateSimpleDataType((SimpleDataType)value, diagnostics, context);
			case ModelPackage.SIMPLE_SUB_ELEMENT_ACCESS:
				return validateSimpleSubElementAccess((SimpleSubElementAccess)value, diagnostics, context);
			case ModelPackage.SINGLE_PAD:
				return validateSinglePad((SinglePad)value, diagnostics, context);
			case ModelPackage.SINGLE_SOURCE_NODE:
				return validateSingleSourceNode((SingleSourceNode)value, diagnostics, context);
			case ModelPackage.SI_PORT:
				return validateSiPort((SiPort)value, diagnostics, context);
			case ModelPackage.SI_PORT_DB:
				return validateSiPortDB((SiPortDB)value, diagnostics, context);
			case ModelPackage.SI_PORT_REQ:
				return validateSiPortReq((SiPortReq)value, diagnostics, context);
			case ModelPackage.SI_SIGNAL:
				return validateSiSignal((SiSignal)value, diagnostics, context);
			case ModelPackage.SI_SIGNAL_DB:
				return validateSiSignalDB((SiSignalDB)value, diagnostics, context);
			case ModelPackage.SI_SYSTEM_INSTANCE:
				return validateSiSystemInstance((SiSystemInstance)value, diagnostics, context);
			case ModelPackage.STRING_DECL:
				return validateStringDecl((StringDecl)value, diagnostics, context);
			case ModelPackage.STRING_DEF:
				return validateStringDef((StringDef)value, diagnostics, context);
			case ModelPackage.STRING_GEN_DECL:
				return validateStringGenDecl((StringGenDecl)value, diagnostics, context);
			case ModelPackage.SUB_ELEMENT_ACCESS:
				return validateSubElementAccess((SubElementAccess)value, diagnostics, context);
			case ModelPackage.SYSTEM:
				return validateSystem((model.System)value, diagnostics, context);
			case ModelPackage.SYSTEM_INSTANCE:
				return validateSystemInstance((SystemInstance)value, diagnostics, context);
			case ModelPackage.TEST:
				return validateTest((Test)value, diagnostics, context);
			case ModelPackage.TEST_DB:
				return validateTestDB((TestDB)value, diagnostics, context);
			case ModelPackage.TEST_REQ:
				return validateTestReq((TestReq)value, diagnostics, context);
			case ModelPackage.TRANSACTIONAL_PORT:
				return validateTransactionalPort((TransactionalPort)value, diagnostics, context);
			case ModelPackage.TRANSACTIONAL_SIGNAL:
				return validateTransactionalSignal((TransactionalSignal)value, diagnostics, context);
			case ModelPackage.UNION:
				return validateUnion((Union)value, diagnostics, context);
			case ModelPackage.VALUE_DATA_TYPE:
				return validateValueDataType((ValueDataType)value, diagnostics, context);
			case ModelPackage.VAR_DEF:
				return validateVarDef((VarDef)value, diagnostics, context);
			case ModelPackage.VAR_DEF_BLOCK:
				return validateVarDefBlock((VarDefBlock)value, diagnostics, context);
			case ModelPackage.VLNV:
				return validateVLNV((VLNV)value, diagnostics, context);
			case ModelPackage.VOID:
				return validateVoid((model.Void)value, diagnostics, context);
			case ModelPackage.WIRE_PORT:
				return validateWirePort((WirePort)value, diagnostics, context);
			case ModelPackage.WIRE_SIGNAL:
				return validateWireSignal((WireSignal)value, diagnostics, context);
			case ModelPackage.XREF:
				return validateXRef((XRef)value, diagnostics, context);
			case ModelPackage.XREF_CONNECTION:
				return validateXRefConnection((XRefConnection)value, diagnostics, context);
			case ModelPackage.XREF_DATA_VAR:
				return validateXRefDataVar((XRefDataVar)value, diagnostics, context);
			case ModelPackage.XREF_DIRECT:
				return validateXRefDirect((XRefDirect)value, diagnostics, context);
			case ModelPackage.XREF_EXTERNAL:
				return validateXRefExternal((XRefExternal)value, diagnostics, context);
			case ModelPackage.XREF_EXTERNAL_INTERFACE:
				return validateXRefExternalInterface((XRefExternalInterface)value, diagnostics, context);
			case ModelPackage.XREF_EXTERNAL_PORT:
				return validateXRefExternalPort((XRefExternalPort)value, diagnostics, context);
			case ModelPackage.XREF_EXTERNAL_SIGNAL:
				return validateXRefExternalSignal((XRefExternalSignal)value, diagnostics, context);
			case ModelPackage.XREF_GENERIC_DECL:
				return validateXRefGenericDecl((XRefGenericDecl)value, diagnostics, context);
			case ModelPackage.XREF_IFD_PORT:
				return validateXRefIFDPort((XRefIFDPort)value, diagnostics, context);
			case ModelPackage.XREF_IND_INTERFACE:
				return validateXRefIndInterface((XRefIndInterface)value, diagnostics, context);
			case ModelPackage.XREF_INDIRECT:
				return validateXRefIndirect((XRefIndirect)value, diagnostics, context);
			case ModelPackage.XREF_IND_PIN:
				return validateXRefIndPin((XRefIndPin)value, diagnostics, context);
			case ModelPackage.XREF_IND_PORT:
				return validateXRefIndPort((XRefIndPort)value, diagnostics, context);
			case ModelPackage.XREF_IND_SINGLE_PAD:
				return validateXRefIndSinglePad((XRefIndSinglePad)value, diagnostics, context);
			case ModelPackage.XREF_INSTANCE:
				return validateXRefInstance((XRefInstance)value, diagnostics, context);
			case ModelPackage.XREF_INTERNAL:
				return validateXRefInternal((XRefInternal)value, diagnostics, context);
			case ModelPackage.XREF_INTERNAL_INTERFACE:
				return validateXRefInternalInterface((XRefInternalInterface)value, diagnostics, context);
			case ModelPackage.XREF_INTERNAL_PORT:
				return validateXRefInternalPort((XRefInternalPort)value, diagnostics, context);
			case ModelPackage.XREF_INTERNAL_SIGNAL:
				return validateXRefInternalSignal((XRefInternalSignal)value, diagnostics, context);
			case ModelPackage.XREF_MASTER_INTERFACE:
				return validateXRefMasterInterface((XRefMasterInterface)value, diagnostics, context);
			case ModelPackage.XREF_NET:
				return validateXRefNet((XRefNet)value, diagnostics, context);
			case ModelPackage.XREF_NONE_INTERFACE:
				return validateXRefNoneInterface((XRefNoneInterface)value, diagnostics, context);
			case ModelPackage.XREF_PAD_TYPE:
				return validateXRefPadType((XRefPadType)value, diagnostics, context);
			case ModelPackage.XREF_PARAM_DECL:
				return validateXRefParamDecl((XRefParamDecl)value, diagnostics, context);
			case ModelPackage.XREF_PIN:
				return validateXRefPin((XRefPin)value, diagnostics, context);
			case ModelPackage.XREF_POWER_DOMAIN:
				return validateXRefPowerDomain((XRefPowerDomain)value, diagnostics, context);
			case ModelPackage.XREF_REAL_PORT:
				return validateXRefRealPort((XRefRealPort)value, diagnostics, context);
			case ModelPackage.XREF_REGISTER_VIEW:
				return validateXRefRegisterView((XRefRegisterView)value, diagnostics, context);
			case ModelPackage.XREF_REG_MEM_SET:
				return validateXRefRegMemSet((XRefRegMemSet)value, diagnostics, context);
			case ModelPackage.XREF_SINGLE_PAD:
				return validateXRefSinglePad((XRefSinglePad)value, diagnostics, context);
			case ModelPackage.XREF_SI_PORT:
				return validateXRefSiPort((XRefSiPort)value, diagnostics, context);
			case ModelPackage.XREF_SI_SIGNAL:
				return validateXRefSiSignal((XRefSiSignal)value, diagnostics, context);
			case ModelPackage.XREF_SLAVE_INTERFACE:
				return validateXRefSlaveInterface((XRefSlaveInterface)value, diagnostics, context);
			case ModelPackage.XREF_TEST:
				return validateXRefTest((XRefTest)value, diagnostics, context);
			case ModelPackage.XREF_VLNV:
				return validateXRefVLNV((XRefVLNV)value, diagnostics, context);
			case ModelPackage.ACCESS_TYPE:
				return validateAccessType((AccessType)value, diagnostics, context);
			case ModelPackage.ACTION_TYPE:
				return validateActionType((ActionType)value, diagnostics, context);
			case ModelPackage.BEHAVIOR_TYPE:
				return validateBehaviorType((BehaviorType)value, diagnostics, context);
			case ModelPackage.BUS_ERROR_TYPE:
				return validateBusErrorType((BusErrorType)value, diagnostics, context);
			case ModelPackage.ENDIAN_TYPE:
				return validateEndianType((EndianType)value, diagnostics, context);
			case ModelPackage.FUNCTION_TYPE:
				return validateFunctionType((FunctionType)value, diagnostics, context);
			case ModelPackage.INTERFACE_DEF_ROLE_TYPE:
				return validateInterfaceDefRoleType((InterfaceDefRoleType)value, diagnostics, context);
			case ModelPackage.INTERFACE_ROLE_TYPE:
				return validateInterfaceRoleType((InterfaceRoleType)value, diagnostics, context);
			case ModelPackage.MESSAGE_TYPE:
				return validateMessageType((MessageType)value, diagnostics, context);
			case ModelPackage.PORT_DIRECTION:
				return validatePortDirection((PortDirection)value, diagnostics, context);
			case ModelPackage.PORT_INITIATIVE:
				return validatePortInitiative((PortInitiative)value, diagnostics, context);
			case ModelPackage.RESERVED_TYPE:
				return validateReservedType((ReservedType)value, diagnostics, context);
			case ModelPackage.SIGN_TYPE:
				return validateSignType((SignType)value, diagnostics, context);
			case ModelPackage.SPECIAL_TYPE:
				return validateSpecialType((SpecialType)value, diagnostics, context);
			case ModelPackage.STROBE_TYPE:
				return validateStrobeType((StrobeType)value, diagnostics, context);
			case ModelPackage.SYNC_MODE:
				return validateSyncMode((SyncMode)value, diagnostics, context);
			case ModelPackage.TOP_SPIN_TYPE:
				return validateTopSpinType((TopSpinType)value, diagnostics, context);
			case ModelPackage.VIRTUAL_TYPE:
				return validateVirtualType((VirtualType)value, diagnostics, context);
			case ModelPackage.ACCESS_TYPE_OBJECT:
				return validateAccessTypeObject((AccessType)value, diagnostics, context);
			case ModelPackage.ACTION_TYPE_OBJECT:
				return validateActionTypeObject((ActionType)value, diagnostics, context);
			case ModelPackage.BEHAVIOR_TYPE_OBJECT:
				return validateBehaviorTypeObject((BehaviorType)value, diagnostics, context);
			case ModelPackage.BOOLEAN_EXPR:
				return validateBooleanExpr((String)value, diagnostics, context);
			case ModelPackage.BOOLEAN_LITERAL:
				return validateBooleanLiteral((String)value, diagnostics, context);
			case ModelPackage.BUS_ERROR_TYPE_OBJECT:
				return validateBusErrorTypeObject((BusErrorType)value, diagnostics, context);
			case ModelPackage.COMMON_EXPR:
				return validateCommonExpr((String)value, diagnostics, context);
			case ModelPackage.ENDIAN_TYPE_OBJECT:
				return validateEndianTypeObject((EndianType)value, diagnostics, context);
			case ModelPackage.FUNCTION_TYPE_OBJECT:
				return validateFunctionTypeObject((FunctionType)value, diagnostics, context);
			case ModelPackage.INTEGER_EXPR:
				return validateIntegerExpr((String)value, diagnostics, context);
			case ModelPackage.INTEGER_LITERAL:
				return validateIntegerLiteral((String)value, diagnostics, context);
			case ModelPackage.INTERFACE_DEF_ROLE_TYPE_OBJECT:
				return validateInterfaceDefRoleTypeObject((InterfaceDefRoleType)value, diagnostics, context);
			case ModelPackage.INTERFACE_ROLE_TYPE_OBJECT:
				return validateInterfaceRoleTypeObject((InterfaceRoleType)value, diagnostics, context);
			case ModelPackage.MESSAGE_TYPE_OBJECT:
				return validateMessageTypeObject((MessageType)value, diagnostics, context);
			case ModelPackage.PATH_EXPR:
				return validatePathExpr((String)value, diagnostics, context);
			case ModelPackage.PORT_DIRECTION_OBJECT:
				return validatePortDirectionObject((PortDirection)value, diagnostics, context);
			case ModelPackage.PORT_INITIATIVE_OBJECT:
				return validatePortInitiativeObject((PortInitiative)value, diagnostics, context);
			case ModelPackage.RESERVED_TYPE_OBJECT:
				return validateReservedTypeObject((ReservedType)value, diagnostics, context);
			case ModelPackage.SIGN_TYPE_OBJECT:
				return validateSignTypeObject((SignType)value, diagnostics, context);
			case ModelPackage.SPECIAL_TYPE_OBJECT:
				return validateSpecialTypeObject((SpecialType)value, diagnostics, context);
			case ModelPackage.STRING_EXPR:
				return validateStringExpr((String)value, diagnostics, context);
			case ModelPackage.STRING_LITERAL:
				return validateStringLiteral((String)value, diagnostics, context);
			case ModelPackage.STROBE_TYPE_OBJECT:
				return validateStrobeTypeObject((StrobeType)value, diagnostics, context);
			case ModelPackage.SYNC_MODE_OBJECT:
				return validateSyncModeObject((SyncMode)value, diagnostics, context);
			case ModelPackage.TOP_SPIN_TYPE_OBJECT:
				return validateTopSpinTypeObject((TopSpinType)value, diagnostics, context);
			case ModelPackage.VIRTUAL_TYPE_OBJECT:
				return validateVirtualTypeObject((VirtualType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccess(Access access, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(access, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessByIndex(AccessByIndex accessByIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accessByIndex, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessByName(AccessByName accessByName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accessByName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessCondition(AccessCondition accessCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(accessCondition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(accessCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(accessCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(accessCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(accessCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(accessCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(accessCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(accessCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(accessCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(accessCondition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessLevel(AccessLevel accessLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(accessLevel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(accessLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(accessLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(accessLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(accessLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(accessLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(accessLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(accessLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(accessLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(accessLevel, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressBlock(AddressBlock addressBlock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressBlock, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArray(Array array, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(array, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayDimension(ArrayDimension arrayDimension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayDimension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitField(BitField bitField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bitField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bitField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bitField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bitField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bitField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bitField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bitField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bitField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bitField, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(bitField, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitFieldElement(BitFieldElement bitFieldElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bitFieldElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bitFieldElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bitFieldElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bitFieldElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bitFieldElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bitFieldElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bitFieldElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bitFieldElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bitFieldElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(bitFieldElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitFieldGapElement(BitFieldGapElement bitFieldGapElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bitFieldGapElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bitFieldGapElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bitFieldGapElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bitFieldGapElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bitFieldGapElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bitFieldGapElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bitFieldGapElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bitFieldGapElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bitFieldGapElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(bitFieldGapElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitFieldSequence(BitFieldSequence bitFieldSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bitFieldSequence, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bitFieldSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bitFieldSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bitFieldSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bitFieldSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bitFieldSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bitFieldSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bitFieldSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bitFieldSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(bitFieldSequence, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitFieldSequenceElement(BitFieldSequenceElement bitFieldSequenceElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bitFieldSequenceElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bitFieldSequenceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bitFieldSequenceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bitFieldSequenceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bitFieldSequenceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bitFieldSequenceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bitFieldSequenceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bitFieldSequenceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bitFieldSequenceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(bitFieldSequenceElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanDecl(BooleanDecl booleanDecl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(booleanDecl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(booleanDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(booleanDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(booleanDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(booleanDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(booleanDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(booleanDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(booleanDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(booleanDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(booleanDecl, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanDef(BooleanDef booleanDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(booleanDef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(booleanDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(booleanDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(booleanDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(booleanDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(booleanDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(booleanDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(booleanDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(booleanDef, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(booleanDef, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanGenDecl(BooleanGenDecl booleanGenDecl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(booleanGenDecl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(booleanGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(booleanGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(booleanGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(booleanGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(booleanGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(booleanGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(booleanGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(booleanGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(booleanGenDecl, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBus(Bus bus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bus, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(bus, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusInstance(BusInstance busInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(busInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(busInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(busInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(busInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(busInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(busInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(busInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(busInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(busInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(busInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusInterfaceMap(BusInterfaceMap busInterfaceMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(busInterfaceMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(busInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(busInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(busInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(busInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(busInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(busInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(busInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(busInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(busInterfaceMap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusNoneInterfaceMap(BusNoneInterfaceMap busNoneInterfaceMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(busNoneInterfaceMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(busNoneInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(busNoneInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(busNoneInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(busNoneInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(busNoneInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(busNoneInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(busNoneInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(busNoneInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(busNoneInterfaceMap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCablePort(CablePort cablePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cablePort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cablePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cablePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cablePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cablePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cablePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cablePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cablePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cablePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(cablePort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCableSignal(CableSignal cableSignal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cableSignal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cableSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cableSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cableSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cableSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cableSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cableSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cableSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cableSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(cableSignal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexDataType(ComplexDataType complexDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complexDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(component, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(component, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentInstance(ComponentInstance componentInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(componentInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(componentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(componentInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection(Connection connection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connection, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(connection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstDef(ConstDef constDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(constDef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(constDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(constDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(constDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(constDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(constDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(constDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(constDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(constDef, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(constDef, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstDefBlock(ConstDefBlock constDefBlock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(constDefBlock, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(constDefBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(constDefBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(constDefBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(constDefBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(constDefBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(constDefBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(constDefBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(constDefBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(constDefBlock, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataDecl(DataDecl dataDecl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataDecl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(dataDecl, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataDef(DataDef dataDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataDef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataDef, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(dataDef, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataGenDecl(DataGenDecl dataGenDecl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataGenDecl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(dataGenDecl, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeElement(DataTypeElement dataTypeElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataTypeElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionItem(DescriptionItem descriptionItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(descriptionItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnum(model.Enum enum_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enum_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumElement(EnumElement enumElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration(Enumeration enumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumeration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumeration, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(enumeration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationElement(EnumerationElement enumerationElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumerationElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumerationElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumerationElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumerationElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumerationElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumerationElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumerationElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumerationElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumerationElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(enumerationElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationInteger(EnumerationInteger enumerationInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationInteger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationSequence(EnumerationSequence enumerationSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumerationSequence, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumerationSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumerationSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumerationSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumerationSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumerationSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumerationSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumerationSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumerationSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(enumerationSequence, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumerationString(EnumerationString enumerationString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumerationString, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEssenceBase(EssenceBase essenceBase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(essenceBase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunction(Function function, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(function, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(function, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(function, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGapElement(GapElement gapElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gapElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gapElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gapElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gapElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gapElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gapElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gapElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gapElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gapElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(gapElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralInstance(GeneralInstance generalInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generalInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(generalInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(generalInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralInterface(GeneralInterface generalInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalInterface, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(generalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(generalInterface, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralPad(GeneralPad generalPad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalPad, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generalPad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalPad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalPad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(generalPad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalPad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalPad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalPad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalPad, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(generalPad, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralPort(GeneralPort generalPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(generalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(generalPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralRegister(GeneralRegister generalRegister, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalRegister, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generalRegister, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalRegister, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalRegister, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(generalRegister, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalRegister, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalRegister, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalRegister, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalRegister, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(generalRegister, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericDecl(GenericDecl genericDecl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(genericDecl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(genericDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(genericDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(genericDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(genericDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(genericDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(genericDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(genericDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(genericDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(genericDecl, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericDeclBlock(GenericDeclBlock genericDeclBlock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(genericDeclBlock, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(genericDeclBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(genericDeclBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(genericDeclBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(genericDeclBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(genericDeclBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(genericDeclBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(genericDeclBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(genericDeclBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(genericDeclBlock, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericMap(GenericMap genericMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(genericMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(genericMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(genericMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(genericMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(genericMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(genericMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(genericMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(genericMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(genericMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(genericMap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexVarUser(IndexVarUser indexVarUser, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(indexVarUser, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(indexVarUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(indexVarUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(indexVarUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(indexVarUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(indexVarUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(indexVarUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(indexVarUser, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(indexVarUser, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(indexVarUser, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstance(Instance instance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(instance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceInterfaceMap(InstanceInterfaceMap instanceInterfaceMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instanceInterfaceMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instanceInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instanceInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instanceInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instanceInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instanceInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instanceInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instanceInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instanceInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(instanceInterfaceMap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstancePortMap(InstancePortMap instancePortMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instancePortMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instancePortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instancePortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instancePortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instancePortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instancePortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instancePortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instancePortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instancePortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(instancePortMap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceShellInterfaceMap(InstanceShellInterfaceMap instanceShellInterfaceMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instanceShellInterfaceMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instanceShellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instanceShellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instanceShellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instanceShellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instanceShellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instanceShellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instanceShellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instanceShellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(instanceShellInterfaceMap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceShellPortMap(InstanceShellPortMap instanceShellPortMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instanceShellPortMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instanceShellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instanceShellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instanceShellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instanceShellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instanceShellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instanceShellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instanceShellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instanceShellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(instanceShellPortMap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerDecl(IntegerDecl integerDecl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(integerDecl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(integerDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(integerDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(integerDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(integerDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(integerDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(integerDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(integerDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(integerDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(integerDecl, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerDef(IntegerDef integerDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(integerDef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(integerDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(integerDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(integerDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(integerDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(integerDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(integerDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(integerDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(integerDef, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(integerDef, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerGenDecl(IntegerGenDecl integerGenDecl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(integerGenDecl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(integerGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(integerGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(integerGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(integerGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(integerGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(integerGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(integerGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(integerGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(integerGenDecl, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterface(Interface interface_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interface_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interface_, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(interface_, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceDefCablePort(InterfaceDefCablePort interfaceDefCablePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceDefCablePort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceDefCablePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceDefCablePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceDefCablePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceDefCablePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceDefCablePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceDefCablePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceDefCablePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceDefCablePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(interfaceDefCablePort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceDefinition(InterfaceDefinition interfaceDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(interfaceDefinition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceDefPort(InterfaceDefPort interfaceDefPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceDefPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceDefPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceDefPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceDefPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceDefPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceDefPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceDefPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceDefPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceDefPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(interfaceDefPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceDefRole(InterfaceDefRole interfaceDefRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceDefRole, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceDefRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceDefRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceDefRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceDefRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceDefRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceDefRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceDefRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceDefRole, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(interfaceDefRole, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceDefTransactionalPort(InterfaceDefTransactionalPort interfaceDefTransactionalPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceDefTransactionalPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceDefTransactionalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceDefTransactionalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceDefTransactionalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceDefTransactionalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceDefTransactionalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceDefTransactionalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceDefTransactionalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceDefTransactionalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(interfaceDefTransactionalPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceDefView(InterfaceDefView interfaceDefView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceDefView, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceDefView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceDefView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceDefView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceDefView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceDefView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceDefView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceDefView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceDefView, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(interfaceDefView, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceDefWirePort(InterfaceDefWirePort interfaceDefWirePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceDefWirePort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceDefWirePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceDefWirePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceDefWirePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceDefWirePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceDefWirePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceDefWirePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceDefWirePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceDefWirePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(interfaceDefWirePort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceInstance(InterfaceInstance interfaceInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(interfaceInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfacePortMap(InterfacePortMap interfacePortMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interfacePortMap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceView(InterfaceView interfaceView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interfaceView, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interfaceView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interfaceView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interfaceView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interfaceView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interfaceView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interfaceView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interfaceView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interfaceView, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(interfaceView, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalInterfaceMap(LocalInterfaceMap localInterfaceMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(localInterfaceMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(localInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(localInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(localInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(localInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(localInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(localInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(localInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(localInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(localInterfaceMap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalPortMap(LocalPortMap localPortMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(localPortMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(localPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(localPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(localPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(localPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(localPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(localPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(localPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(localPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(localPortMap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemory(Memory memory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(memory, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(memory, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(memory, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodDataType(MethodDataType methodDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(methodDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodDataTypeElement(MethodDataTypeElement methodDataTypeElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(methodDataTypeElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelRoot(ModelRoot modelRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(modelRoot, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(modelRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(modelRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(modelRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(modelRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(modelRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(modelRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(modelRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(modelRoot, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(modelRoot, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModule(Module module, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(module, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(module, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(module, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(module, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiPad(MultiPad multiPad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multiPad, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(multiPad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(multiPad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(multiPad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(multiPad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(multiPad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(multiPad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(multiPad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(multiPad, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(multiPad, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiViewRegister(MultiViewRegister multiViewRegister, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multiViewRegister, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(multiViewRegister, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(multiViewRegister, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(multiViewRegister, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(multiViewRegister, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(multiViewRegister, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(multiViewRegister, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(multiViewRegister, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(multiViewRegister, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(multiViewRegister, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNet(Net net, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(net, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(net, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(net, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(net, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(net, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(net, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(net, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(net, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(net, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(net, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoneInterface(NoneInterface noneInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(noneInterface, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(noneInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(noneInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(noneInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(noneInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(noneInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(noneInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(noneInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(noneInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(noneInterface, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage(model.Package package_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(package_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(package_, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackageInstance(PackageInstance packageInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(packageInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(packageInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(packageInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(packageInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(packageInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(packageInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(packageInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(packageInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(packageInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(packageInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePad(Pad pad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pad, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pad, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(pad, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePadMultiplexed(PadMultiplexed padMultiplexed, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(padMultiplexed, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(padMultiplexed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(padMultiplexed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(padMultiplexed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(padMultiplexed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(padMultiplexed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(padMultiplexed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(padMultiplexed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(padMultiplexed, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(padMultiplexed, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePadNetMap(PadNetMap padNetMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(padNetMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(padNetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(padNetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(padNetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(padNetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(padNetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(padNetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(padNetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(padNetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(padNetMap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePadNonMultiplexed(PadNonMultiplexed padNonMultiplexed, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(padNonMultiplexed, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(padNonMultiplexed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(padNonMultiplexed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(padNonMultiplexed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(padNonMultiplexed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(padNonMultiplexed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(padNonMultiplexed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(padNonMultiplexed, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(padNonMultiplexed, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(padNonMultiplexed, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePadSpecial(PadSpecial padSpecial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(padSpecial, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(padSpecial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(padSpecial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(padSpecial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(padSpecial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(padSpecial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(padSpecial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(padSpecial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(padSpecial, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(padSpecial, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePadSupply(PadSupply padSupply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(padSupply, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(padSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(padSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(padSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(padSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(padSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(padSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(padSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(padSupply, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(padSupply, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePadType(PadType padType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(padType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(padType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(padType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(padType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(padType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(padType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(padType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(padType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(padType, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(padType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePadTypeDB(PadTypeDB padTypeDB, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(padTypeDB, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(padTypeDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(padTypeDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(padTypeDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(padTypeDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(padTypeDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(padTypeDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(padTypeDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(padTypeDB, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(padTypeDB, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParamDecl(ParamDecl paramDecl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(paramDecl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(paramDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(paramDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(paramDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(paramDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(paramDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(paramDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(paramDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(paramDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(paramDecl, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParamDeclBlock(ParamDeclBlock paramDeclBlock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(paramDeclBlock, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(paramDeclBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(paramDeclBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(paramDeclBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(paramDeclBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(paramDeclBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(paramDeclBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(paramDeclBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(paramDeclBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(paramDeclBlock, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParamMap(ParamMap paramMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(paramMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(paramMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(paramMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(paramMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(paramMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(paramMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(paramMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(paramMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(paramMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(paramMap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePathRef(PathRef pathRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pathRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePin(Pin pin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pin, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(pin, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePinNetMap(PinNetMap pinNetMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pinNetMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pinNetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pinNetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pinNetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pinNetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pinNetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pinNetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pinNetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pinNetMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(pinNetMap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(port, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(port, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(port, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(port, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortRef(PortRef portRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(portRef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(portRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(portRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(portRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(portRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(portRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(portRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(portRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(portRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(portRef, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerDomain(PowerDomain powerDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(powerDomain, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(powerDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(powerDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(powerDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(powerDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(powerDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(powerDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(powerDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(powerDomain, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(powerDomain, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(product, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(product, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(product, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductInstance(ProductInstance productInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(productInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(productInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductInterfaceMap(ProductInterfaceMap productInterfaceMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(productInterfaceMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(productInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(productInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(productInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(productInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(productInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(productInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(productInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(productInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(productInterfaceMap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductPadMap(ProductPadMap productPadMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(productPadMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(productPadMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(productPadMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(productPadMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(productPadMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(productPadMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(productPadMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(productPadMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(productPadMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(productPadMap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductPinMap(ProductPinMap productPinMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(productPinMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(productPinMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(productPinMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(productPinMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(productPinMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(productPinMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(productPinMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(productPinMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(productPinMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(productPinMap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealPort(RealPort realPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(realPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(realPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(realPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(realPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(realPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(realPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(realPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(realPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(realPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(realPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecord(Record record, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(record, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegister(Register register, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(register, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(register, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(register, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(register, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(register, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(register, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(register, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(register, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(register, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(register, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegisterView(RegisterView registerView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(registerView, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(registerView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(registerView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(registerView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(registerView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(registerView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(registerView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(registerView, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(registerView, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(registerView, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegMemElement(RegMemElement regMemElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(regMemElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(regMemElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(regMemElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(regMemElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(regMemElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(regMemElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(regMemElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(regMemElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(regMemElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(regMemElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegMemSequence(RegMemSequence regMemSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(regMemSequence, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(regMemSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(regMemSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(regMemSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(regMemSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(regMemSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(regMemSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(regMemSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(regMemSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(regMemSequence, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegMemSet(RegMemSet regMemSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(regMemSet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(regMemSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(regMemSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(regMemSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(regMemSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(regMemSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(regMemSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(regMemSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(regMemSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(regMemSet, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegViewBlock(RegViewBlock regViewBlock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(regViewBlock, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(regViewBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(regViewBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(regViewBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(regViewBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(regViewBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(regViewBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(regViewBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(regViewBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(regViewBlock, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResetType(ResetType resetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resetType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resetType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resetType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resetType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resetType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resetType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resetType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resetType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resetType, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(resetType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnDataType(ReturnDataType returnDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(returnDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnElementAccess(ReturnElementAccess returnElementAccess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(returnElementAccess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceElement(SequenceElement sequenceElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sequenceElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sequenceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sequenceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sequenceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sequenceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sequenceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sequenceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sequenceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sequenceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(sequenceElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShellInterfaceMap(ShellInterfaceMap shellInterfaceMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(shellInterfaceMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(shellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(shellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(shellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(shellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(shellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(shellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(shellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(shellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(shellInterfaceMap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShellPortMap(ShellPortMap shellPortMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(shellPortMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(shellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(shellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(shellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(shellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(shellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(shellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(shellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(shellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(shellPortMap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSiComponentInstance(SiComponentInstance siComponentInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(siComponentInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(siComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(siComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(siComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(siComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(siComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(siComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(siComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(siComponentInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(siComponentInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignal(Signal signal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(signal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(signal, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(signal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalMap(SignalMap signalMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signalMap, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalOwner(SignalOwner signalOwner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(signalOwner, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(signalOwner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(signalOwner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(signalOwner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(signalOwner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(signalOwner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(signalOwner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(signalOwner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(signalOwner, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(signalOwner, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSiInstance(SiInstance siInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(siInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(siInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(siInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(siInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(siInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(siInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(siInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(siInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(siInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(siInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSiInstanceInterfaceMap(SiInstanceInterfaceMap siInstanceInterfaceMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(siInstanceInterfaceMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(siInstanceInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(siInstanceInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(siInstanceInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(siInstanceInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(siInstanceInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(siInstanceInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(siInstanceInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(siInstanceInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(siInstanceInterfaceMap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSiInstancePortMap(SiInstancePortMap siInstancePortMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(siInstancePortMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(siInstancePortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(siInstancePortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(siInstancePortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(siInstancePortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(siInstancePortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(siInstancePortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(siInstancePortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(siInstancePortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(siInstancePortMap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSiInstanceShellInterfaceMap(SiInstanceShellInterfaceMap siInstanceShellInterfaceMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(siInstanceShellInterfaceMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(siInstanceShellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(siInstanceShellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(siInstanceShellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(siInstanceShellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(siInstanceShellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(siInstanceShellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(siInstanceShellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(siInstanceShellInterfaceMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(siInstanceShellInterfaceMap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSiInstanceShellPortMap(SiInstanceShellPortMap siInstanceShellPortMap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(siInstanceShellPortMap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(siInstanceShellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(siInstanceShellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(siInstanceShellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(siInstanceShellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(siInstanceShellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(siInstanceShellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(siInstanceShellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(siInstanceShellPortMap, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(siInstanceShellPortMap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSilicon(Silicon silicon, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(silicon, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(silicon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(silicon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(silicon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(silicon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(silicon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(silicon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(silicon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(silicon, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(silicon, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSiliconInstance(SiliconInstance siliconInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(siliconInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(siliconInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(siliconInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(siliconInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(siliconInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(siliconInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(siliconInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(siliconInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(siliconInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(siliconInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleDataType(SimpleDataType simpleDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleSubElementAccess(SimpleSubElementAccess simpleSubElementAccess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleSubElementAccess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSinglePad(SinglePad singlePad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(singlePad, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(singlePad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(singlePad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(singlePad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(singlePad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(singlePad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(singlePad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(singlePad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(singlePad, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(singlePad, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleSourceNode(SingleSourceNode singleSourceNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(singleSourceNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(singleSourceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(singleSourceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(singleSourceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(singleSourceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(singleSourceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(singleSourceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(singleSourceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(singleSourceNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(singleSourceNode, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CustomConstraint constraint of '<em>Single Source Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleSourceNode_CustomConstraint(SingleSourceNode singleSourceNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "CustomConstraint", getObjectLabel(singleSourceNode, context) },
						 new Object[] { singleSourceNode },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSiPort(SiPort siPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(siPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(siPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(siPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(siPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(siPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(siPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(siPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(siPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(siPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(siPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSiPortDB(SiPortDB siPortDB, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(siPortDB, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(siPortDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(siPortDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(siPortDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(siPortDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(siPortDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(siPortDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(siPortDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(siPortDB, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(siPortDB, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSiPortReq(SiPortReq siPortReq, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(siPortReq, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSiSignal(SiSignal siSignal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(siSignal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(siSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(siSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(siSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(siSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(siSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(siSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(siSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(siSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(siSignal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSiSignalDB(SiSignalDB siSignalDB, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(siSignalDB, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(siSignalDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(siSignalDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(siSignalDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(siSignalDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(siSignalDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(siSignalDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(siSignalDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(siSignalDB, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(siSignalDB, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSiSystemInstance(SiSystemInstance siSystemInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(siSystemInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(siSystemInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(siSystemInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(siSystemInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(siSystemInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(siSystemInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(siSystemInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(siSystemInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(siSystemInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(siSystemInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringDecl(StringDecl stringDecl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stringDecl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stringDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stringDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stringDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stringDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stringDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stringDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stringDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stringDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(stringDecl, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringDef(StringDef stringDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stringDef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stringDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stringDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stringDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stringDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stringDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stringDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stringDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stringDef, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(stringDef, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringGenDecl(StringGenDecl stringGenDecl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stringGenDecl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stringGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stringGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stringGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stringGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stringGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stringGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stringGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stringGenDecl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(stringGenDecl, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubElementAccess(SubElementAccess subElementAccess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subElementAccess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem(model.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(system, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(system, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(system, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(system, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemInstance(SystemInstance systemInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(systemInstance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTest(Test test, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(test, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(test, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(test, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(test, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(test, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(test, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(test, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(test, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(test, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(test, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestDB(TestDB testDB, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(testDB, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(testDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(testDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(testDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(testDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(testDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(testDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(testDB, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(testDB, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(testDB, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestReq(TestReq testReq, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testReq, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionalPort(TransactionalPort transactionalPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transactionalPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transactionalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transactionalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transactionalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transactionalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transactionalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transactionalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transactionalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transactionalPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(transactionalPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionalSignal(TransactionalSignal transactionalSignal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transactionalSignal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transactionalSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transactionalSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transactionalSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transactionalSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transactionalSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transactionalSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transactionalSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transactionalSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(transactionalSignal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnion(Union union, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(union, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueDataType(ValueDataType valueDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVarDef(VarDef varDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(varDef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(varDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(varDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(varDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(varDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(varDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(varDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(varDef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(varDef, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(varDef, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVarDefBlock(VarDefBlock varDefBlock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(varDefBlock, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(varDefBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(varDefBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(varDefBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(varDefBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(varDefBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(varDefBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(varDefBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(varDefBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(varDefBlock, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVLNV(VLNV vlnv, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vlnv, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoid(model.Void void_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(void_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWirePort(WirePort wirePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wirePort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(wirePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wirePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wirePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(wirePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wirePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wirePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wirePort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wirePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(wirePort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWireSignal(WireSignal wireSignal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wireSignal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(wireSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wireSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wireSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(wireSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wireSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wireSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wireSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wireSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleSourceNode_CustomConstraint(wireSignal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRef(XRef xRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefConnection(XRefConnection xRefConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefConnection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefDataVar(XRefDataVar xRefDataVar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefDataVar, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefDirect(XRefDirect xRefDirect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefDirect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefExternal(XRefExternal xRefExternal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefExternal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefExternalInterface(XRefExternalInterface xRefExternalInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefExternalInterface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefExternalPort(XRefExternalPort xRefExternalPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefExternalPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefExternalSignal(XRefExternalSignal xRefExternalSignal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefExternalSignal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefGenericDecl(XRefGenericDecl xRefGenericDecl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefGenericDecl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefIFDPort(XRefIFDPort xRefIFDPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefIFDPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefIndInterface(XRefIndInterface xRefIndInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefIndInterface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefIndirect(XRefIndirect xRefIndirect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefIndirect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefIndPin(XRefIndPin xRefIndPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefIndPin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefIndPort(XRefIndPort xRefIndPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefIndPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefIndSinglePad(XRefIndSinglePad xRefIndSinglePad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefIndSinglePad, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefInstance(XRefInstance xRefInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefInternal(XRefInternal xRefInternal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefInternal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefInternalInterface(XRefInternalInterface xRefInternalInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefInternalInterface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefInternalPort(XRefInternalPort xRefInternalPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefInternalPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefInternalSignal(XRefInternalSignal xRefInternalSignal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefInternalSignal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefMasterInterface(XRefMasterInterface xRefMasterInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefMasterInterface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefNet(XRefNet xRefNet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefNet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefNoneInterface(XRefNoneInterface xRefNoneInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefNoneInterface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefPadType(XRefPadType xRefPadType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefPadType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefParamDecl(XRefParamDecl xRefParamDecl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefParamDecl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefPin(XRefPin xRefPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefPin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefPowerDomain(XRefPowerDomain xRefPowerDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefPowerDomain, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefRealPort(XRefRealPort xRefRealPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefRealPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefRegisterView(XRefRegisterView xRefRegisterView, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefRegisterView, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefRegMemSet(XRefRegMemSet xRefRegMemSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefRegMemSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefSinglePad(XRefSinglePad xRefSinglePad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefSinglePad, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefSiPort(XRefSiPort xRefSiPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefSiPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefSiSignal(XRefSiSignal xRefSiSignal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefSiSignal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefSlaveInterface(XRefSlaveInterface xRefSlaveInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefSlaveInterface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefTest(XRefTest xRefTest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefTest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXRefVLNV(XRefVLNV xRefVLNV, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xRefVLNV, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessType(AccessType accessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionType(ActionType actionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehaviorType(BehaviorType behaviorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusErrorType(BusErrorType busErrorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndianType(EndianType endianType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionType(FunctionType functionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceDefRoleType(InterfaceDefRoleType interfaceDefRoleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceRoleType(InterfaceRoleType interfaceRoleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageType(MessageType messageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortDirection(PortDirection portDirection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortInitiative(PortInitiative portInitiative, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservedType(ReservedType reservedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignType(SignType signType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialType(SpecialType specialType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrobeType(StrobeType strobeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSyncMode(SyncMode syncMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopSpinType(TopSpinType topSpinType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVirtualType(VirtualType virtualType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessTypeObject(AccessType accessTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionTypeObject(ActionType actionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehaviorTypeObject(BehaviorType behaviorTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanExpr(String booleanExpr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanLiteral(String booleanLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusErrorTypeObject(BusErrorType busErrorTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommonExpr(String commonExpr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndianTypeObject(EndianType endianTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeObject(FunctionType functionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerExpr(String integerExpr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerLiteral(String integerLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceDefRoleTypeObject(InterfaceDefRoleType interfaceDefRoleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceRoleTypeObject(InterfaceRoleType interfaceRoleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageTypeObject(MessageType messageTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePathExpr(String pathExpr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortDirectionObject(PortDirection portDirectionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortInitiativeObject(PortInitiative portInitiativeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReservedTypeObject(ReservedType reservedTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignTypeObject(SignType signTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialTypeObject(SpecialType specialTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringExpr(String stringExpr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringLiteral(String stringLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrobeTypeObject(StrobeType strobeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSyncModeObject(SyncMode syncModeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopSpinTypeObject(TopSpinType topSpinTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVirtualTypeObject(VirtualType virtualTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ModelValidator
