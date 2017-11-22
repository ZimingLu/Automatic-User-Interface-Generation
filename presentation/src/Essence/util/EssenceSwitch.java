/**
 */
package Essence.util;

import Essence.Access;
import Essence.AccessByIndex;
import Essence.AccessByName;
import Essence.AccessCondition;
import Essence.AccessLevel;
import Essence.AddressBlock;
import Essence.Array;
import Essence.ArrayDimension;
import Essence.BitField;
import Essence.BitFieldElement;
import Essence.BitFieldGapElement;
import Essence.BitFieldSequence;
import Essence.BitFieldSequenceElement;
import Essence.BooleanDecl;
import Essence.BooleanDef;
import Essence.BooleanGenDecl;
import Essence.Bus;
import Essence.BusInstance;
import Essence.BusInterfaceMap;
import Essence.BusNoneInterfaceMap;
import Essence.CablePort;
import Essence.CableSignal;
import Essence.ComplexDataType;
import Essence.Component;
import Essence.ComponentInstance;
import Essence.Connection;
import Essence.ConstDef;
import Essence.ConstDefBlock;
import Essence.DataDecl;
import Essence.DataDef;
import Essence.DataGenDecl;
import Essence.DataType;
import Essence.DataTypeElement;
import Essence.DescriptionItem;
import Essence.DocumentRoot;
import Essence.EnumElement;
import Essence.Enumeration;
import Essence.EnumerationElement;
import Essence.EnumerationInteger;
import Essence.EnumerationSequence;
import Essence.EnumerationString;
import Essence.EssenceBase;
import Essence.EssencePackage;
import Essence.Function;
import Essence.GapElement;
import Essence.GeneralInstance;
import Essence.GeneralInterface;
import Essence.GeneralPad;
import Essence.GeneralPort;
import Essence.GeneralRegister;
import Essence.GenericDecl;
import Essence.GenericDeclBlock;
import Essence.GenericMap;
import Essence.IndexVarUser;
import Essence.Instance;
import Essence.InstanceInterfaceMap;
import Essence.InstancePortMap;
import Essence.InstanceShellInterfaceMap;
import Essence.InstanceShellPortMap;
import Essence.IntegerDecl;
import Essence.IntegerDef;
import Essence.IntegerGenDecl;
import Essence.Interface;
import Essence.InterfaceDefCablePort;
import Essence.InterfaceDefPort;
import Essence.InterfaceDefRole;
import Essence.InterfaceDefTransactionalPort;
import Essence.InterfaceDefView;
import Essence.InterfaceDefWirePort;
import Essence.InterfaceDefinition;
import Essence.InterfaceInstance;
import Essence.InterfacePortMap;
import Essence.InterfaceView;
import Essence.LocalInterfaceMap;
import Essence.LocalPortMap;
import Essence.Memory;
import Essence.MethodDataType;
import Essence.MethodDataTypeElement;
import Essence.ModelRoot;
import Essence.Module;
import Essence.MultiPad;
import Essence.MultiViewRegister;
import Essence.Net;
import Essence.NoneInterface;
import Essence.PackageInstance;
import Essence.Pad;
import Essence.PadMultiplexed;
import Essence.PadNetMap;
import Essence.PadNonMultiplexed;
import Essence.PadSpecial;
import Essence.PadSupply;
import Essence.PadType;
import Essence.PadTypeDB;
import Essence.ParamDecl;
import Essence.ParamDeclBlock;
import Essence.ParamMap;
import Essence.PathRef;
import Essence.Pin;
import Essence.PinNetMap;
import Essence.Port;
import Essence.PortRef;
import Essence.PowerDomain;
import Essence.Product;
import Essence.ProductInstance;
import Essence.ProductInterfaceMap;
import Essence.ProductPadMap;
import Essence.ProductPinMap;
import Essence.Property;
import Essence.RealPort;
import Essence.Record;
import Essence.Reference;
import Essence.RegMemElement;
import Essence.RegMemSequence;
import Essence.RegMemSet;
import Essence.RegViewBlock;
import Essence.Register;
import Essence.RegisterView;
import Essence.ResetType;
import Essence.ReturnDataType;
import Essence.ReturnElementAccess;
import Essence.SequenceElement;
import Essence.ShellInterfaceMap;
import Essence.ShellPortMap;
import Essence.SiComponentInstance;
import Essence.SiInstance;
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
import Essence.Signal;
import Essence.SignalMap;
import Essence.SignalOwner;
import Essence.Silicon;
import Essence.SiliconInstance;
import Essence.SimpleDataType;
import Essence.SimpleSubElementAccess;
import Essence.SinglePad;
import Essence.SingleSourceNode;
import Essence.StringDecl;
import Essence.StringDef;
import Essence.StringGenDecl;
import Essence.SubElementAccess;
import Essence.SystemInstance;
import Essence.Test;
import Essence.TestDB;
import Essence.TestReq;
import Essence.TransactionalPort;
import Essence.TransactionalSignal;
import Essence.Union;
import Essence.VLNV;
import Essence.ValueDataType;
import Essence.VarDef;
import Essence.VarDefBlock;
import Essence.WirePort;
import Essence.WireSignal;
import Essence.XRef;
import Essence.XRefConnection;
import Essence.XRefDataVar;
import Essence.XRefDirect;
import Essence.XRefExternal;
import Essence.XRefExternalInterface;
import Essence.XRefExternalPort;
import Essence.XRefExternalSignal;
import Essence.XRefGenericDecl;
import Essence.XRefIFDPort;
import Essence.XRefIndInterface;
import Essence.XRefIndPin;
import Essence.XRefIndPort;
import Essence.XRefIndSinglePad;
import Essence.XRefIndirect;
import Essence.XRefInstance;
import Essence.XRefInternal;
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
import Essence.XRefVLNV;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Essence.EssencePackage
 * @generated
 */
public class EssenceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EssencePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EssenceSwitch() {
		if (modelPackage == null) {
			modelPackage = EssencePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EssencePackage.ACCESS: {
				Access access = (Access)theEObject;
				T result = caseAccess(access);
				if (result == null) result = caseEssenceBase(access);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.ACCESS_BY_INDEX: {
				AccessByIndex accessByIndex = (AccessByIndex)theEObject;
				T result = caseAccessByIndex(accessByIndex);
				if (result == null) result = caseSimpleSubElementAccess(accessByIndex);
				if (result == null) result = caseSubElementAccess(accessByIndex);
				if (result == null) result = caseEssenceBase(accessByIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.ACCESS_BY_NAME: {
				AccessByName accessByName = (AccessByName)theEObject;
				T result = caseAccessByName(accessByName);
				if (result == null) result = caseSimpleSubElementAccess(accessByName);
				if (result == null) result = caseSubElementAccess(accessByName);
				if (result == null) result = caseEssenceBase(accessByName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.ACCESS_CONDITION: {
				AccessCondition accessCondition = (AccessCondition)theEObject;
				T result = caseAccessCondition(accessCondition);
				if (result == null) result = caseIndexVarUser(accessCondition);
				if (result == null) result = caseSingleSourceNode(accessCondition);
				if (result == null) result = caseEssenceBase(accessCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.ACCESS_LEVEL: {
				AccessLevel accessLevel = (AccessLevel)theEObject;
				T result = caseAccessLevel(accessLevel);
				if (result == null) result = caseIndexVarUser(accessLevel);
				if (result == null) result = caseSingleSourceNode(accessLevel);
				if (result == null) result = caseEssenceBase(accessLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.ADDRESS_BLOCK: {
				AddressBlock addressBlock = (AddressBlock)theEObject;
				T result = caseAddressBlock(addressBlock);
				if (result == null) result = caseEssenceBase(addressBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.ARRAY: {
				Array array = (Array)theEObject;
				T result = caseArray(array);
				if (result == null) result = caseComplexDataType(array);
				if (result == null) result = caseValueDataType(array);
				if (result == null) result = caseReturnDataType(array);
				if (result == null) result = caseDataType(array);
				if (result == null) result = caseEssenceBase(array);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.ARRAY_DIMENSION: {
				ArrayDimension arrayDimension = (ArrayDimension)theEObject;
				T result = caseArrayDimension(arrayDimension);
				if (result == null) result = caseEssenceBase(arrayDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.BIT_FIELD: {
				BitField bitField = (BitField)theEObject;
				T result = caseBitField(bitField);
				if (result == null) result = caseBitFieldSequenceElement(bitField);
				if (result == null) result = caseBitFieldElement(bitField);
				if (result == null) result = caseIndexVarUser(bitField);
				if (result == null) result = caseSingleSourceNode(bitField);
				if (result == null) result = caseEssenceBase(bitField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.BIT_FIELD_ELEMENT: {
				BitFieldElement bitFieldElement = (BitFieldElement)theEObject;
				T result = caseBitFieldElement(bitFieldElement);
				if (result == null) result = caseIndexVarUser(bitFieldElement);
				if (result == null) result = caseSingleSourceNode(bitFieldElement);
				if (result == null) result = caseEssenceBase(bitFieldElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.BIT_FIELD_GAP_ELEMENT: {
				BitFieldGapElement bitFieldGapElement = (BitFieldGapElement)theEObject;
				T result = caseBitFieldGapElement(bitFieldGapElement);
				if (result == null) result = caseBitFieldSequenceElement(bitFieldGapElement);
				if (result == null) result = caseBitFieldElement(bitFieldGapElement);
				if (result == null) result = caseIndexVarUser(bitFieldGapElement);
				if (result == null) result = caseSingleSourceNode(bitFieldGapElement);
				if (result == null) result = caseEssenceBase(bitFieldGapElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.BIT_FIELD_SEQUENCE: {
				BitFieldSequence bitFieldSequence = (BitFieldSequence)theEObject;
				T result = caseBitFieldSequence(bitFieldSequence);
				if (result == null) result = caseBitFieldElement(bitFieldSequence);
				if (result == null) result = caseIndexVarUser(bitFieldSequence);
				if (result == null) result = caseSingleSourceNode(bitFieldSequence);
				if (result == null) result = caseEssenceBase(bitFieldSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.BIT_FIELD_SEQUENCE_ELEMENT: {
				BitFieldSequenceElement bitFieldSequenceElement = (BitFieldSequenceElement)theEObject;
				T result = caseBitFieldSequenceElement(bitFieldSequenceElement);
				if (result == null) result = caseBitFieldElement(bitFieldSequenceElement);
				if (result == null) result = caseIndexVarUser(bitFieldSequenceElement);
				if (result == null) result = caseSingleSourceNode(bitFieldSequenceElement);
				if (result == null) result = caseEssenceBase(bitFieldSequenceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.BOOLEAN_DECL: {
				BooleanDecl booleanDecl = (BooleanDecl)theEObject;
				T result = caseBooleanDecl(booleanDecl);
				if (result == null) result = caseParamDecl(booleanDecl);
				if (result == null) result = caseVarDef(booleanDecl);
				if (result == null) result = caseSingleSourceNode(booleanDecl);
				if (result == null) result = caseEssenceBase(booleanDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.BOOLEAN_DEF: {
				BooleanDef booleanDef = (BooleanDef)theEObject;
				T result = caseBooleanDef(booleanDef);
				if (result == null) result = caseConstDef(booleanDef);
				if (result == null) result = caseVarDef(booleanDef);
				if (result == null) result = caseSingleSourceNode(booleanDef);
				if (result == null) result = caseEssenceBase(booleanDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.BOOLEAN_GEN_DECL: {
				BooleanGenDecl booleanGenDecl = (BooleanGenDecl)theEObject;
				T result = caseBooleanGenDecl(booleanGenDecl);
				if (result == null) result = caseGenericDecl(booleanGenDecl);
				if (result == null) result = caseVarDef(booleanGenDecl);
				if (result == null) result = caseSingleSourceNode(booleanGenDecl);
				if (result == null) result = caseEssenceBase(booleanGenDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.BUS: {
				Bus bus = (Bus)theEObject;
				T result = caseBus(bus);
				if (result == null) result = caseModelRoot(bus);
				if (result == null) result = caseSingleSourceNode(bus);
				if (result == null) result = caseEssenceBase(bus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.BUS_INSTANCE: {
				BusInstance busInstance = (BusInstance)theEObject;
				T result = caseBusInstance(busInstance);
				if (result == null) result = caseInstance(busInstance);
				if (result == null) result = caseGeneralInstance(busInstance);
				if (result == null) result = caseSingleSourceNode(busInstance);
				if (result == null) result = caseEssenceBase(busInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.BUS_INTERFACE_MAP: {
				BusInterfaceMap busInterfaceMap = (BusInterfaceMap)theEObject;
				T result = caseBusInterfaceMap(busInterfaceMap);
				if (result == null) result = caseSingleSourceNode(busInterfaceMap);
				if (result == null) result = caseEssenceBase(busInterfaceMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.BUS_NONE_INTERFACE_MAP: {
				BusNoneInterfaceMap busNoneInterfaceMap = (BusNoneInterfaceMap)theEObject;
				T result = caseBusNoneInterfaceMap(busNoneInterfaceMap);
				if (result == null) result = caseSingleSourceNode(busNoneInterfaceMap);
				if (result == null) result = caseEssenceBase(busNoneInterfaceMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.CABLE_PORT: {
				CablePort cablePort = (CablePort)theEObject;
				T result = caseCablePort(cablePort);
				if (result == null) result = caseRealPort(cablePort);
				if (result == null) result = casePort(cablePort);
				if (result == null) result = caseGeneralPort(cablePort);
				if (result == null) result = caseSingleSourceNode(cablePort);
				if (result == null) result = caseEssenceBase(cablePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.CABLE_SIGNAL: {
				CableSignal cableSignal = (CableSignal)theEObject;
				T result = caseCableSignal(cableSignal);
				if (result == null) result = caseSignal(cableSignal);
				if (result == null) result = caseSingleSourceNode(cableSignal);
				if (result == null) result = caseEssenceBase(cableSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.COMPLEX_DATA_TYPE: {
				ComplexDataType complexDataType = (ComplexDataType)theEObject;
				T result = caseComplexDataType(complexDataType);
				if (result == null) result = caseValueDataType(complexDataType);
				if (result == null) result = caseReturnDataType(complexDataType);
				if (result == null) result = caseDataType(complexDataType);
				if (result == null) result = caseEssenceBase(complexDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseModelRoot(component);
				if (result == null) result = caseSingleSourceNode(component);
				if (result == null) result = caseEssenceBase(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.COMPONENT_INSTANCE: {
				ComponentInstance componentInstance = (ComponentInstance)theEObject;
				T result = caseComponentInstance(componentInstance);
				if (result == null) result = caseInterfaceInstance(componentInstance);
				if (result == null) result = caseInstance(componentInstance);
				if (result == null) result = caseGeneralInstance(componentInstance);
				if (result == null) result = caseSingleSourceNode(componentInstance);
				if (result == null) result = caseEssenceBase(componentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = caseSignalOwner(connection);
				if (result == null) result = caseSingleSourceNode(connection);
				if (result == null) result = caseEssenceBase(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.CONST_DEF: {
				ConstDef constDef = (ConstDef)theEObject;
				T result = caseConstDef(constDef);
				if (result == null) result = caseVarDef(constDef);
				if (result == null) result = caseSingleSourceNode(constDef);
				if (result == null) result = caseEssenceBase(constDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.CONST_DEF_BLOCK: {
				ConstDefBlock constDefBlock = (ConstDefBlock)theEObject;
				T result = caseConstDefBlock(constDefBlock);
				if (result == null) result = caseVarDefBlock(constDefBlock);
				if (result == null) result = caseSingleSourceNode(constDefBlock);
				if (result == null) result = caseEssenceBase(constDefBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.DATA_DECL: {
				DataDecl dataDecl = (DataDecl)theEObject;
				T result = caseDataDecl(dataDecl);
				if (result == null) result = caseParamDecl(dataDecl);
				if (result == null) result = caseVarDef(dataDecl);
				if (result == null) result = caseSingleSourceNode(dataDecl);
				if (result == null) result = caseEssenceBase(dataDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.DATA_DEF: {
				DataDef dataDef = (DataDef)theEObject;
				T result = caseDataDef(dataDef);
				if (result == null) result = caseConstDef(dataDef);
				if (result == null) result = caseVarDef(dataDef);
				if (result == null) result = caseSingleSourceNode(dataDef);
				if (result == null) result = caseEssenceBase(dataDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.DATA_GEN_DECL: {
				DataGenDecl dataGenDecl = (DataGenDecl)theEObject;
				T result = caseDataGenDecl(dataGenDecl);
				if (result == null) result = caseGenericDecl(dataGenDecl);
				if (result == null) result = caseVarDef(dataGenDecl);
				if (result == null) result = caseSingleSourceNode(dataGenDecl);
				if (result == null) result = caseEssenceBase(dataGenDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseEssenceBase(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.DATA_TYPE_ELEMENT: {
				DataTypeElement dataTypeElement = (DataTypeElement)theEObject;
				T result = caseDataTypeElement(dataTypeElement);
				if (result == null) result = caseEssenceBase(dataTypeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.DESCRIPTION_ITEM: {
				DescriptionItem descriptionItem = (DescriptionItem)theEObject;
				T result = caseDescriptionItem(descriptionItem);
				if (result == null) result = caseEssenceBase(descriptionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.ENUM: {
				Essence.Enum enum_ = (Essence.Enum)theEObject;
				T result = caseEnum(enum_);
				if (result == null) result = caseComplexDataType(enum_);
				if (result == null) result = caseValueDataType(enum_);
				if (result == null) result = caseReturnDataType(enum_);
				if (result == null) result = caseDataType(enum_);
				if (result == null) result = caseEssenceBase(enum_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.ENUM_ELEMENT: {
				EnumElement enumElement = (EnumElement)theEObject;
				T result = caseEnumElement(enumElement);
				if (result == null) result = caseEssenceBase(enumElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = caseEnumerationElement(enumeration);
				if (result == null) result = caseIndexVarUser(enumeration);
				if (result == null) result = caseSingleSourceNode(enumeration);
				if (result == null) result = caseEssenceBase(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.ENUMERATION_ELEMENT: {
				EnumerationElement enumerationElement = (EnumerationElement)theEObject;
				T result = caseEnumerationElement(enumerationElement);
				if (result == null) result = caseIndexVarUser(enumerationElement);
				if (result == null) result = caseSingleSourceNode(enumerationElement);
				if (result == null) result = caseEssenceBase(enumerationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.ENUMERATION_INTEGER: {
				EnumerationInteger enumerationInteger = (EnumerationInteger)theEObject;
				T result = caseEnumerationInteger(enumerationInteger);
				if (result == null) result = caseEssenceBase(enumerationInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.ENUMERATION_SEQUENCE: {
				EnumerationSequence enumerationSequence = (EnumerationSequence)theEObject;
				T result = caseEnumerationSequence(enumerationSequence);
				if (result == null) result = caseEnumerationElement(enumerationSequence);
				if (result == null) result = caseIndexVarUser(enumerationSequence);
				if (result == null) result = caseSingleSourceNode(enumerationSequence);
				if (result == null) result = caseEssenceBase(enumerationSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.ENUMERATION_STRING: {
				EnumerationString enumerationString = (EnumerationString)theEObject;
				T result = caseEnumerationString(enumerationString);
				if (result == null) result = caseEssenceBase(enumerationString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.ESSENCE_BASE: {
				EssenceBase essenceBase = (EssenceBase)theEObject;
				T result = caseEssenceBase(essenceBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseSingleSourceNode(function);
				if (result == null) result = caseEssenceBase(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.GAP_ELEMENT: {
				GapElement gapElement = (GapElement)theEObject;
				T result = caseGapElement(gapElement);
				if (result == null) result = caseSequenceElement(gapElement);
				if (result == null) result = caseRegMemElement(gapElement);
				if (result == null) result = caseIndexVarUser(gapElement);
				if (result == null) result = caseSingleSourceNode(gapElement);
				if (result == null) result = caseEssenceBase(gapElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.GENERAL_INSTANCE: {
				GeneralInstance generalInstance = (GeneralInstance)theEObject;
				T result = caseGeneralInstance(generalInstance);
				if (result == null) result = caseSingleSourceNode(generalInstance);
				if (result == null) result = caseEssenceBase(generalInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.GENERAL_INTERFACE: {
				GeneralInterface generalInterface = (GeneralInterface)theEObject;
				T result = caseGeneralInterface(generalInterface);
				if (result == null) result = caseSingleSourceNode(generalInterface);
				if (result == null) result = caseEssenceBase(generalInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.GENERAL_PAD: {
				GeneralPad generalPad = (GeneralPad)theEObject;
				T result = caseGeneralPad(generalPad);
				if (result == null) result = caseSinglePad(generalPad);
				if (result == null) result = casePad(generalPad);
				if (result == null) result = caseSingleSourceNode(generalPad);
				if (result == null) result = caseEssenceBase(generalPad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.GENERAL_PORT: {
				GeneralPort generalPort = (GeneralPort)theEObject;
				T result = caseGeneralPort(generalPort);
				if (result == null) result = caseSingleSourceNode(generalPort);
				if (result == null) result = caseEssenceBase(generalPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.GENERAL_REGISTER: {
				GeneralRegister generalRegister = (GeneralRegister)theEObject;
				T result = caseGeneralRegister(generalRegister);
				if (result == null) result = caseSequenceElement(generalRegister);
				if (result == null) result = caseRegMemElement(generalRegister);
				if (result == null) result = caseIndexVarUser(generalRegister);
				if (result == null) result = caseSingleSourceNode(generalRegister);
				if (result == null) result = caseEssenceBase(generalRegister);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.GENERIC_DECL: {
				GenericDecl genericDecl = (GenericDecl)theEObject;
				T result = caseGenericDecl(genericDecl);
				if (result == null) result = caseVarDef(genericDecl);
				if (result == null) result = caseSingleSourceNode(genericDecl);
				if (result == null) result = caseEssenceBase(genericDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.GENERIC_DECL_BLOCK: {
				GenericDeclBlock genericDeclBlock = (GenericDeclBlock)theEObject;
				T result = caseGenericDeclBlock(genericDeclBlock);
				if (result == null) result = caseVarDefBlock(genericDeclBlock);
				if (result == null) result = caseSingleSourceNode(genericDeclBlock);
				if (result == null) result = caseEssenceBase(genericDeclBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.GENERIC_MAP: {
				GenericMap genericMap = (GenericMap)theEObject;
				T result = caseGenericMap(genericMap);
				if (result == null) result = caseSingleSourceNode(genericMap);
				if (result == null) result = caseEssenceBase(genericMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.INDEX_VAR_USER: {
				IndexVarUser indexVarUser = (IndexVarUser)theEObject;
				T result = caseIndexVarUser(indexVarUser);
				if (result == null) result = caseSingleSourceNode(indexVarUser);
				if (result == null) result = caseEssenceBase(indexVarUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.INSTANCE: {
				Instance instance = (Instance)theEObject;
				T result = caseInstance(instance);
				if (result == null) result = caseGeneralInstance(instance);
				if (result == null) result = caseSingleSourceNode(instance);
				if (result == null) result = caseEssenceBase(instance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.INSTANCE_INTERFACE_MAP: {
				InstanceInterfaceMap instanceInterfaceMap = (InstanceInterfaceMap)theEObject;
				T result = caseInstanceInterfaceMap(instanceInterfaceMap);
				if (result == null) result = caseSingleSourceNode(instanceInterfaceMap);
				if (result == null) result = caseEssenceBase(instanceInterfaceMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.INSTANCE_PORT_MAP: {
				InstancePortMap instancePortMap = (InstancePortMap)theEObject;
				T result = caseInstancePortMap(instancePortMap);
				if (result == null) result = caseSingleSourceNode(instancePortMap);
				if (result == null) result = caseEssenceBase(instancePortMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.INSTANCE_SHELL_INTERFACE_MAP: {
				InstanceShellInterfaceMap instanceShellInterfaceMap = (InstanceShellInterfaceMap)theEObject;
				T result = caseInstanceShellInterfaceMap(instanceShellInterfaceMap);
				if (result == null) result = caseSingleSourceNode(instanceShellInterfaceMap);
				if (result == null) result = caseEssenceBase(instanceShellInterfaceMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.INSTANCE_SHELL_PORT_MAP: {
				InstanceShellPortMap instanceShellPortMap = (InstanceShellPortMap)theEObject;
				T result = caseInstanceShellPortMap(instanceShellPortMap);
				if (result == null) result = caseSingleSourceNode(instanceShellPortMap);
				if (result == null) result = caseEssenceBase(instanceShellPortMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.INTEGER_DECL: {
				IntegerDecl integerDecl = (IntegerDecl)theEObject;
				T result = caseIntegerDecl(integerDecl);
				if (result == null) result = caseParamDecl(integerDecl);
				if (result == null) result = caseVarDef(integerDecl);
				if (result == null) result = caseSingleSourceNode(integerDecl);
				if (result == null) result = caseEssenceBase(integerDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.INTEGER_DEF: {
				IntegerDef integerDef = (IntegerDef)theEObject;
				T result = caseIntegerDef(integerDef);
				if (result == null) result = caseConstDef(integerDef);
				if (result == null) result = caseVarDef(integerDef);
				if (result == null) result = caseSingleSourceNode(integerDef);
				if (result == null) result = caseEssenceBase(integerDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.INTEGER_GEN_DECL: {
				IntegerGenDecl integerGenDecl = (IntegerGenDecl)theEObject;
				T result = caseIntegerGenDecl(integerGenDecl);
				if (result == null) result = caseGenericDecl(integerGenDecl);
				if (result == null) result = caseVarDef(integerGenDecl);
				if (result == null) result = caseSingleSourceNode(integerGenDecl);
				if (result == null) result = caseEssenceBase(integerGenDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = caseGeneralInterface(interface_);
				if (result == null) result = caseSingleSourceNode(interface_);
				if (result == null) result = caseEssenceBase(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.INTERFACE_DEF_CABLE_PORT: {
				InterfaceDefCablePort interfaceDefCablePort = (InterfaceDefCablePort)theEObject;
				T result = caseInterfaceDefCablePort(interfaceDefCablePort);
				if (result == null) result = caseInterfaceDefPort(interfaceDefCablePort);
				if (result == null) result = caseGeneralPort(interfaceDefCablePort);
				if (result == null) result = caseSingleSourceNode(interfaceDefCablePort);
				if (result == null) result = caseEssenceBase(interfaceDefCablePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.INTERFACE_DEFINITION: {
				InterfaceDefinition interfaceDefinition = (InterfaceDefinition)theEObject;
				T result = caseInterfaceDefinition(interfaceDefinition);
				if (result == null) result = caseModelRoot(interfaceDefinition);
				if (result == null) result = caseSingleSourceNode(interfaceDefinition);
				if (result == null) result = caseEssenceBase(interfaceDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.INTERFACE_DEF_PORT: {
				InterfaceDefPort interfaceDefPort = (InterfaceDefPort)theEObject;
				T result = caseInterfaceDefPort(interfaceDefPort);
				if (result == null) result = caseGeneralPort(interfaceDefPort);
				if (result == null) result = caseSingleSourceNode(interfaceDefPort);
				if (result == null) result = caseEssenceBase(interfaceDefPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.INTERFACE_DEF_ROLE: {
				InterfaceDefRole interfaceDefRole = (InterfaceDefRole)theEObject;
				T result = caseInterfaceDefRole(interfaceDefRole);
				if (result == null) result = caseSingleSourceNode(interfaceDefRole);
				if (result == null) result = caseEssenceBase(interfaceDefRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.INTERFACE_DEF_TRANSACTIONAL_PORT: {
				InterfaceDefTransactionalPort interfaceDefTransactionalPort = (InterfaceDefTransactionalPort)theEObject;
				T result = caseInterfaceDefTransactionalPort(interfaceDefTransactionalPort);
				if (result == null) result = caseInterfaceDefPort(interfaceDefTransactionalPort);
				if (result == null) result = caseGeneralPort(interfaceDefTransactionalPort);
				if (result == null) result = caseSingleSourceNode(interfaceDefTransactionalPort);
				if (result == null) result = caseEssenceBase(interfaceDefTransactionalPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.INTERFACE_DEF_VIEW: {
				InterfaceDefView interfaceDefView = (InterfaceDefView)theEObject;
				T result = caseInterfaceDefView(interfaceDefView);
				if (result == null) result = caseSignalOwner(interfaceDefView);
				if (result == null) result = caseSingleSourceNode(interfaceDefView);
				if (result == null) result = caseEssenceBase(interfaceDefView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.INTERFACE_DEF_WIRE_PORT: {
				InterfaceDefWirePort interfaceDefWirePort = (InterfaceDefWirePort)theEObject;
				T result = caseInterfaceDefWirePort(interfaceDefWirePort);
				if (result == null) result = caseInterfaceDefPort(interfaceDefWirePort);
				if (result == null) result = caseGeneralPort(interfaceDefWirePort);
				if (result == null) result = caseSingleSourceNode(interfaceDefWirePort);
				if (result == null) result = caseEssenceBase(interfaceDefWirePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.INTERFACE_INSTANCE: {
				InterfaceInstance interfaceInstance = (InterfaceInstance)theEObject;
				T result = caseInterfaceInstance(interfaceInstance);
				if (result == null) result = caseInstance(interfaceInstance);
				if (result == null) result = caseGeneralInstance(interfaceInstance);
				if (result == null) result = caseSingleSourceNode(interfaceInstance);
				if (result == null) result = caseEssenceBase(interfaceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.INTERFACE_PORT_MAP: {
				InterfacePortMap interfacePortMap = (InterfacePortMap)theEObject;
				T result = caseInterfacePortMap(interfacePortMap);
				if (result == null) result = caseEssenceBase(interfacePortMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.INTERFACE_VIEW: {
				InterfaceView interfaceView = (InterfaceView)theEObject;
				T result = caseInterfaceView(interfaceView);
				if (result == null) result = caseSingleSourceNode(interfaceView);
				if (result == null) result = caseEssenceBase(interfaceView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.LOCAL_INTERFACE_MAP: {
				LocalInterfaceMap localInterfaceMap = (LocalInterfaceMap)theEObject;
				T result = caseLocalInterfaceMap(localInterfaceMap);
				if (result == null) result = caseSingleSourceNode(localInterfaceMap);
				if (result == null) result = caseEssenceBase(localInterfaceMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.LOCAL_PORT_MAP: {
				LocalPortMap localPortMap = (LocalPortMap)theEObject;
				T result = caseLocalPortMap(localPortMap);
				if (result == null) result = caseSingleSourceNode(localPortMap);
				if (result == null) result = caseEssenceBase(localPortMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.MEMORY: {
				Memory memory = (Memory)theEObject;
				T result = caseMemory(memory);
				if (result == null) result = caseSequenceElement(memory);
				if (result == null) result = caseRegMemElement(memory);
				if (result == null) result = caseIndexVarUser(memory);
				if (result == null) result = caseSingleSourceNode(memory);
				if (result == null) result = caseEssenceBase(memory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.METHOD_DATA_TYPE: {
				MethodDataType methodDataType = (MethodDataType)theEObject;
				T result = caseMethodDataType(methodDataType);
				if (result == null) result = caseDataType(methodDataType);
				if (result == null) result = caseEssenceBase(methodDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.METHOD_DATA_TYPE_ELEMENT: {
				MethodDataTypeElement methodDataTypeElement = (MethodDataTypeElement)theEObject;
				T result = caseMethodDataTypeElement(methodDataTypeElement);
				if (result == null) result = caseEssenceBase(methodDataTypeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.MODEL_ROOT: {
				ModelRoot modelRoot = (ModelRoot)theEObject;
				T result = caseModelRoot(modelRoot);
				if (result == null) result = caseSingleSourceNode(modelRoot);
				if (result == null) result = caseEssenceBase(modelRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.MODULE: {
				Module module = (Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseSingleSourceNode(module);
				if (result == null) result = caseEssenceBase(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.MULTI_PAD: {
				MultiPad multiPad = (MultiPad)theEObject;
				T result = caseMultiPad(multiPad);
				if (result == null) result = casePad(multiPad);
				if (result == null) result = caseSingleSourceNode(multiPad);
				if (result == null) result = caseEssenceBase(multiPad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.MULTI_VIEW_REGISTER: {
				MultiViewRegister multiViewRegister = (MultiViewRegister)theEObject;
				T result = caseMultiViewRegister(multiViewRegister);
				if (result == null) result = caseGeneralRegister(multiViewRegister);
				if (result == null) result = caseSequenceElement(multiViewRegister);
				if (result == null) result = caseRegMemElement(multiViewRegister);
				if (result == null) result = caseIndexVarUser(multiViewRegister);
				if (result == null) result = caseSingleSourceNode(multiViewRegister);
				if (result == null) result = caseEssenceBase(multiViewRegister);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.NET: {
				Net net = (Net)theEObject;
				T result = caseNet(net);
				if (result == null) result = caseSingleSourceNode(net);
				if (result == null) result = caseEssenceBase(net);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.NONE_INTERFACE: {
				NoneInterface noneInterface = (NoneInterface)theEObject;
				T result = caseNoneInterface(noneInterface);
				if (result == null) result = caseGeneralInterface(noneInterface);
				if (result == null) result = caseSingleSourceNode(noneInterface);
				if (result == null) result = caseEssenceBase(noneInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PACKAGE: {
				Essence.Package package_ = (Essence.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseModelRoot(package_);
				if (result == null) result = caseSingleSourceNode(package_);
				if (result == null) result = caseEssenceBase(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PACKAGE_INSTANCE: {
				PackageInstance packageInstance = (PackageInstance)theEObject;
				T result = casePackageInstance(packageInstance);
				if (result == null) result = caseGeneralInstance(packageInstance);
				if (result == null) result = caseSingleSourceNode(packageInstance);
				if (result == null) result = caseEssenceBase(packageInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PAD: {
				Pad pad = (Pad)theEObject;
				T result = casePad(pad);
				if (result == null) result = caseSingleSourceNode(pad);
				if (result == null) result = caseEssenceBase(pad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PAD_MULTIPLEXED: {
				PadMultiplexed padMultiplexed = (PadMultiplexed)theEObject;
				T result = casePadMultiplexed(padMultiplexed);
				if (result == null) result = caseSinglePad(padMultiplexed);
				if (result == null) result = casePad(padMultiplexed);
				if (result == null) result = caseSingleSourceNode(padMultiplexed);
				if (result == null) result = caseEssenceBase(padMultiplexed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PAD_NET_MAP: {
				PadNetMap padNetMap = (PadNetMap)theEObject;
				T result = casePadNetMap(padNetMap);
				if (result == null) result = caseSingleSourceNode(padNetMap);
				if (result == null) result = caseEssenceBase(padNetMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PAD_NON_MULTIPLEXED: {
				PadNonMultiplexed padNonMultiplexed = (PadNonMultiplexed)theEObject;
				T result = casePadNonMultiplexed(padNonMultiplexed);
				if (result == null) result = caseSinglePad(padNonMultiplexed);
				if (result == null) result = casePad(padNonMultiplexed);
				if (result == null) result = caseSingleSourceNode(padNonMultiplexed);
				if (result == null) result = caseEssenceBase(padNonMultiplexed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PAD_SPECIAL: {
				PadSpecial padSpecial = (PadSpecial)theEObject;
				T result = casePadSpecial(padSpecial);
				if (result == null) result = caseGeneralPad(padSpecial);
				if (result == null) result = caseSinglePad(padSpecial);
				if (result == null) result = casePad(padSpecial);
				if (result == null) result = caseSingleSourceNode(padSpecial);
				if (result == null) result = caseEssenceBase(padSpecial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PAD_SUPPLY: {
				PadSupply padSupply = (PadSupply)theEObject;
				T result = casePadSupply(padSupply);
				if (result == null) result = caseGeneralPad(padSupply);
				if (result == null) result = caseSinglePad(padSupply);
				if (result == null) result = casePad(padSupply);
				if (result == null) result = caseSingleSourceNode(padSupply);
				if (result == null) result = caseEssenceBase(padSupply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PAD_TYPE: {
				PadType padType = (PadType)theEObject;
				T result = casePadType(padType);
				if (result == null) result = caseSingleSourceNode(padType);
				if (result == null) result = caseEssenceBase(padType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PAD_TYPE_DB: {
				PadTypeDB padTypeDB = (PadTypeDB)theEObject;
				T result = casePadTypeDB(padTypeDB);
				if (result == null) result = caseModelRoot(padTypeDB);
				if (result == null) result = caseSingleSourceNode(padTypeDB);
				if (result == null) result = caseEssenceBase(padTypeDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PARAM_DECL: {
				ParamDecl paramDecl = (ParamDecl)theEObject;
				T result = caseParamDecl(paramDecl);
				if (result == null) result = caseVarDef(paramDecl);
				if (result == null) result = caseSingleSourceNode(paramDecl);
				if (result == null) result = caseEssenceBase(paramDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PARAM_DECL_BLOCK: {
				ParamDeclBlock paramDeclBlock = (ParamDeclBlock)theEObject;
				T result = caseParamDeclBlock(paramDeclBlock);
				if (result == null) result = caseVarDefBlock(paramDeclBlock);
				if (result == null) result = caseSingleSourceNode(paramDeclBlock);
				if (result == null) result = caseEssenceBase(paramDeclBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PARAM_MAP: {
				ParamMap paramMap = (ParamMap)theEObject;
				T result = caseParamMap(paramMap);
				if (result == null) result = caseSingleSourceNode(paramMap);
				if (result == null) result = caseEssenceBase(paramMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PATH_REF: {
				PathRef pathRef = (PathRef)theEObject;
				T result = casePathRef(pathRef);
				if (result == null) result = caseReference(pathRef);
				if (result == null) result = caseEssenceBase(pathRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PIN: {
				Pin pin = (Pin)theEObject;
				T result = casePin(pin);
				if (result == null) result = caseSingleSourceNode(pin);
				if (result == null) result = caseEssenceBase(pin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PIN_NET_MAP: {
				PinNetMap pinNetMap = (PinNetMap)theEObject;
				T result = casePinNetMap(pinNetMap);
				if (result == null) result = caseSingleSourceNode(pinNetMap);
				if (result == null) result = caseEssenceBase(pinNetMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseGeneralPort(port);
				if (result == null) result = caseSingleSourceNode(port);
				if (result == null) result = caseEssenceBase(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PORT_REF: {
				PortRef portRef = (PortRef)theEObject;
				T result = casePortRef(portRef);
				if (result == null) result = casePort(portRef);
				if (result == null) result = caseGeneralPort(portRef);
				if (result == null) result = caseSingleSourceNode(portRef);
				if (result == null) result = caseEssenceBase(portRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.POWER_DOMAIN: {
				PowerDomain powerDomain = (PowerDomain)theEObject;
				T result = casePowerDomain(powerDomain);
				if (result == null) result = caseSingleSourceNode(powerDomain);
				if (result == null) result = caseEssenceBase(powerDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PRODUCT: {
				Product product = (Product)theEObject;
				T result = caseProduct(product);
				if (result == null) result = caseModelRoot(product);
				if (result == null) result = caseSingleSourceNode(product);
				if (result == null) result = caseEssenceBase(product);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PRODUCT_INSTANCE: {
				ProductInstance productInstance = (ProductInstance)theEObject;
				T result = caseProductInstance(productInstance);
				if (result == null) result = caseInstance(productInstance);
				if (result == null) result = caseGeneralInstance(productInstance);
				if (result == null) result = caseSingleSourceNode(productInstance);
				if (result == null) result = caseEssenceBase(productInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PRODUCT_INTERFACE_MAP: {
				ProductInterfaceMap productInterfaceMap = (ProductInterfaceMap)theEObject;
				T result = caseProductInterfaceMap(productInterfaceMap);
				if (result == null) result = caseSingleSourceNode(productInterfaceMap);
				if (result == null) result = caseEssenceBase(productInterfaceMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PRODUCT_PAD_MAP: {
				ProductPadMap productPadMap = (ProductPadMap)theEObject;
				T result = caseProductPadMap(productPadMap);
				if (result == null) result = caseSingleSourceNode(productPadMap);
				if (result == null) result = caseEssenceBase(productPadMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PRODUCT_PIN_MAP: {
				ProductPinMap productPinMap = (ProductPinMap)theEObject;
				T result = caseProductPinMap(productPinMap);
				if (result == null) result = caseSingleSourceNode(productPinMap);
				if (result == null) result = caseEssenceBase(productPinMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseEssenceBase(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.REAL_PORT: {
				RealPort realPort = (RealPort)theEObject;
				T result = caseRealPort(realPort);
				if (result == null) result = casePort(realPort);
				if (result == null) result = caseGeneralPort(realPort);
				if (result == null) result = caseSingleSourceNode(realPort);
				if (result == null) result = caseEssenceBase(realPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.RECORD: {
				Record record = (Record)theEObject;
				T result = caseRecord(record);
				if (result == null) result = caseComplexDataType(record);
				if (result == null) result = caseValueDataType(record);
				if (result == null) result = caseReturnDataType(record);
				if (result == null) result = caseDataType(record);
				if (result == null) result = caseEssenceBase(record);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseEssenceBase(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.REGISTER: {
				Register register = (Register)theEObject;
				T result = caseRegister(register);
				if (result == null) result = caseGeneralRegister(register);
				if (result == null) result = caseSequenceElement(register);
				if (result == null) result = caseRegMemElement(register);
				if (result == null) result = caseIndexVarUser(register);
				if (result == null) result = caseSingleSourceNode(register);
				if (result == null) result = caseEssenceBase(register);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.REGISTER_VIEW: {
				RegisterView registerView = (RegisterView)theEObject;
				T result = caseRegisterView(registerView);
				if (result == null) result = caseIndexVarUser(registerView);
				if (result == null) result = caseSingleSourceNode(registerView);
				if (result == null) result = caseEssenceBase(registerView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.REG_MEM_ELEMENT: {
				RegMemElement regMemElement = (RegMemElement)theEObject;
				T result = caseRegMemElement(regMemElement);
				if (result == null) result = caseIndexVarUser(regMemElement);
				if (result == null) result = caseSingleSourceNode(regMemElement);
				if (result == null) result = caseEssenceBase(regMemElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.REG_MEM_SEQUENCE: {
				RegMemSequence regMemSequence = (RegMemSequence)theEObject;
				T result = caseRegMemSequence(regMemSequence);
				if (result == null) result = caseRegMemElement(regMemSequence);
				if (result == null) result = caseIndexVarUser(regMemSequence);
				if (result == null) result = caseSingleSourceNode(regMemSequence);
				if (result == null) result = caseEssenceBase(regMemSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.REG_MEM_SET: {
				RegMemSet regMemSet = (RegMemSet)theEObject;
				T result = caseRegMemSet(regMemSet);
				if (result == null) result = caseSingleSourceNode(regMemSet);
				if (result == null) result = caseEssenceBase(regMemSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.REG_VIEW_BLOCK: {
				RegViewBlock regViewBlock = (RegViewBlock)theEObject;
				T result = caseRegViewBlock(regViewBlock);
				if (result == null) result = caseSingleSourceNode(regViewBlock);
				if (result == null) result = caseEssenceBase(regViewBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.RESET_TYPE: {
				ResetType resetType = (ResetType)theEObject;
				T result = caseResetType(resetType);
				if (result == null) result = caseIndexVarUser(resetType);
				if (result == null) result = caseSingleSourceNode(resetType);
				if (result == null) result = caseEssenceBase(resetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.RETURN_DATA_TYPE: {
				ReturnDataType returnDataType = (ReturnDataType)theEObject;
				T result = caseReturnDataType(returnDataType);
				if (result == null) result = caseDataType(returnDataType);
				if (result == null) result = caseEssenceBase(returnDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.RETURN_ELEMENT_ACCESS: {
				ReturnElementAccess returnElementAccess = (ReturnElementAccess)theEObject;
				T result = caseReturnElementAccess(returnElementAccess);
				if (result == null) result = caseSubElementAccess(returnElementAccess);
				if (result == null) result = caseEssenceBase(returnElementAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SEQUENCE_ELEMENT: {
				SequenceElement sequenceElement = (SequenceElement)theEObject;
				T result = caseSequenceElement(sequenceElement);
				if (result == null) result = caseRegMemElement(sequenceElement);
				if (result == null) result = caseIndexVarUser(sequenceElement);
				if (result == null) result = caseSingleSourceNode(sequenceElement);
				if (result == null) result = caseEssenceBase(sequenceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SHELL_INTERFACE_MAP: {
				ShellInterfaceMap shellInterfaceMap = (ShellInterfaceMap)theEObject;
				T result = caseShellInterfaceMap(shellInterfaceMap);
				if (result == null) result = caseSingleSourceNode(shellInterfaceMap);
				if (result == null) result = caseEssenceBase(shellInterfaceMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SHELL_PORT_MAP: {
				ShellPortMap shellPortMap = (ShellPortMap)theEObject;
				T result = caseShellPortMap(shellPortMap);
				if (result == null) result = caseSingleSourceNode(shellPortMap);
				if (result == null) result = caseEssenceBase(shellPortMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SI_COMPONENT_INSTANCE: {
				SiComponentInstance siComponentInstance = (SiComponentInstance)theEObject;
				T result = caseSiComponentInstance(siComponentInstance);
				if (result == null) result = caseSiInstance(siComponentInstance);
				if (result == null) result = caseGeneralInstance(siComponentInstance);
				if (result == null) result = caseSingleSourceNode(siComponentInstance);
				if (result == null) result = caseEssenceBase(siComponentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SIGNAL: {
				Signal signal = (Signal)theEObject;
				T result = caseSignal(signal);
				if (result == null) result = caseSingleSourceNode(signal);
				if (result == null) result = caseEssenceBase(signal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SIGNAL_MAP: {
				SignalMap signalMap = (SignalMap)theEObject;
				T result = caseSignalMap(signalMap);
				if (result == null) result = caseEssenceBase(signalMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SIGNAL_OWNER: {
				SignalOwner signalOwner = (SignalOwner)theEObject;
				T result = caseSignalOwner(signalOwner);
				if (result == null) result = caseSingleSourceNode(signalOwner);
				if (result == null) result = caseEssenceBase(signalOwner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SI_INSTANCE: {
				SiInstance siInstance = (SiInstance)theEObject;
				T result = caseSiInstance(siInstance);
				if (result == null) result = caseGeneralInstance(siInstance);
				if (result == null) result = caseSingleSourceNode(siInstance);
				if (result == null) result = caseEssenceBase(siInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SI_INSTANCE_INTERFACE_MAP: {
				SiInstanceInterfaceMap siInstanceInterfaceMap = (SiInstanceInterfaceMap)theEObject;
				T result = caseSiInstanceInterfaceMap(siInstanceInterfaceMap);
				if (result == null) result = caseSingleSourceNode(siInstanceInterfaceMap);
				if (result == null) result = caseEssenceBase(siInstanceInterfaceMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SI_INSTANCE_PORT_MAP: {
				SiInstancePortMap siInstancePortMap = (SiInstancePortMap)theEObject;
				T result = caseSiInstancePortMap(siInstancePortMap);
				if (result == null) result = caseSingleSourceNode(siInstancePortMap);
				if (result == null) result = caseEssenceBase(siInstancePortMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SI_INSTANCE_SHELL_INTERFACE_MAP: {
				SiInstanceShellInterfaceMap siInstanceShellInterfaceMap = (SiInstanceShellInterfaceMap)theEObject;
				T result = caseSiInstanceShellInterfaceMap(siInstanceShellInterfaceMap);
				if (result == null) result = caseSingleSourceNode(siInstanceShellInterfaceMap);
				if (result == null) result = caseEssenceBase(siInstanceShellInterfaceMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SI_INSTANCE_SHELL_PORT_MAP: {
				SiInstanceShellPortMap siInstanceShellPortMap = (SiInstanceShellPortMap)theEObject;
				T result = caseSiInstanceShellPortMap(siInstanceShellPortMap);
				if (result == null) result = caseSingleSourceNode(siInstanceShellPortMap);
				if (result == null) result = caseEssenceBase(siInstanceShellPortMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SILICON: {
				Silicon silicon = (Silicon)theEObject;
				T result = caseSilicon(silicon);
				if (result == null) result = caseModelRoot(silicon);
				if (result == null) result = caseSingleSourceNode(silicon);
				if (result == null) result = caseEssenceBase(silicon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SILICON_INSTANCE: {
				SiliconInstance siliconInstance = (SiliconInstance)theEObject;
				T result = caseSiliconInstance(siliconInstance);
				if (result == null) result = caseGeneralInstance(siliconInstance);
				if (result == null) result = caseSingleSourceNode(siliconInstance);
				if (result == null) result = caseEssenceBase(siliconInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SIMPLE_DATA_TYPE: {
				SimpleDataType simpleDataType = (SimpleDataType)theEObject;
				T result = caseSimpleDataType(simpleDataType);
				if (result == null) result = caseValueDataType(simpleDataType);
				if (result == null) result = caseReturnDataType(simpleDataType);
				if (result == null) result = caseDataType(simpleDataType);
				if (result == null) result = caseEssenceBase(simpleDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SIMPLE_SUB_ELEMENT_ACCESS: {
				SimpleSubElementAccess simpleSubElementAccess = (SimpleSubElementAccess)theEObject;
				T result = caseSimpleSubElementAccess(simpleSubElementAccess);
				if (result == null) result = caseSubElementAccess(simpleSubElementAccess);
				if (result == null) result = caseEssenceBase(simpleSubElementAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SINGLE_PAD: {
				SinglePad singlePad = (SinglePad)theEObject;
				T result = caseSinglePad(singlePad);
				if (result == null) result = casePad(singlePad);
				if (result == null) result = caseSingleSourceNode(singlePad);
				if (result == null) result = caseEssenceBase(singlePad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SINGLE_SOURCE_NODE: {
				SingleSourceNode singleSourceNode = (SingleSourceNode)theEObject;
				T result = caseSingleSourceNode(singleSourceNode);
				if (result == null) result = caseEssenceBase(singleSourceNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SI_PORT: {
				SiPort siPort = (SiPort)theEObject;
				T result = caseSiPort(siPort);
				if (result == null) result = caseSingleSourceNode(siPort);
				if (result == null) result = caseEssenceBase(siPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SI_PORT_DB: {
				SiPortDB siPortDB = (SiPortDB)theEObject;
				T result = caseSiPortDB(siPortDB);
				if (result == null) result = caseModelRoot(siPortDB);
				if (result == null) result = caseSingleSourceNode(siPortDB);
				if (result == null) result = caseEssenceBase(siPortDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SI_PORT_REQ: {
				SiPortReq siPortReq = (SiPortReq)theEObject;
				T result = caseSiPortReq(siPortReq);
				if (result == null) result = caseEssenceBase(siPortReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SI_SIGNAL: {
				SiSignal siSignal = (SiSignal)theEObject;
				T result = caseSiSignal(siSignal);
				if (result == null) result = caseSingleSourceNode(siSignal);
				if (result == null) result = caseEssenceBase(siSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SI_SIGNAL_DB: {
				SiSignalDB siSignalDB = (SiSignalDB)theEObject;
				T result = caseSiSignalDB(siSignalDB);
				if (result == null) result = caseModelRoot(siSignalDB);
				if (result == null) result = caseSingleSourceNode(siSignalDB);
				if (result == null) result = caseEssenceBase(siSignalDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SI_SYSTEM_INSTANCE: {
				SiSystemInstance siSystemInstance = (SiSystemInstance)theEObject;
				T result = caseSiSystemInstance(siSystemInstance);
				if (result == null) result = caseSiInstance(siSystemInstance);
				if (result == null) result = caseGeneralInstance(siSystemInstance);
				if (result == null) result = caseSingleSourceNode(siSystemInstance);
				if (result == null) result = caseEssenceBase(siSystemInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.STRING_DECL: {
				StringDecl stringDecl = (StringDecl)theEObject;
				T result = caseStringDecl(stringDecl);
				if (result == null) result = caseParamDecl(stringDecl);
				if (result == null) result = caseVarDef(stringDecl);
				if (result == null) result = caseSingleSourceNode(stringDecl);
				if (result == null) result = caseEssenceBase(stringDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.STRING_DEF: {
				StringDef stringDef = (StringDef)theEObject;
				T result = caseStringDef(stringDef);
				if (result == null) result = caseConstDef(stringDef);
				if (result == null) result = caseVarDef(stringDef);
				if (result == null) result = caseSingleSourceNode(stringDef);
				if (result == null) result = caseEssenceBase(stringDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.STRING_GEN_DECL: {
				StringGenDecl stringGenDecl = (StringGenDecl)theEObject;
				T result = caseStringGenDecl(stringGenDecl);
				if (result == null) result = caseGenericDecl(stringGenDecl);
				if (result == null) result = caseVarDef(stringGenDecl);
				if (result == null) result = caseSingleSourceNode(stringGenDecl);
				if (result == null) result = caseEssenceBase(stringGenDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SUB_ELEMENT_ACCESS: {
				SubElementAccess subElementAccess = (SubElementAccess)theEObject;
				T result = caseSubElementAccess(subElementAccess);
				if (result == null) result = caseEssenceBase(subElementAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SYSTEM: {
				Essence.System system = (Essence.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = caseModelRoot(system);
				if (result == null) result = caseSingleSourceNode(system);
				if (result == null) result = caseEssenceBase(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.SYSTEM_INSTANCE: {
				SystemInstance systemInstance = (SystemInstance)theEObject;
				T result = caseSystemInstance(systemInstance);
				if (result == null) result = caseInterfaceInstance(systemInstance);
				if (result == null) result = caseInstance(systemInstance);
				if (result == null) result = caseGeneralInstance(systemInstance);
				if (result == null) result = caseSingleSourceNode(systemInstance);
				if (result == null) result = caseEssenceBase(systemInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.TEST: {
				Test test = (Test)theEObject;
				T result = caseTest(test);
				if (result == null) result = caseSingleSourceNode(test);
				if (result == null) result = caseEssenceBase(test);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.TEST_DB: {
				TestDB testDB = (TestDB)theEObject;
				T result = caseTestDB(testDB);
				if (result == null) result = caseModelRoot(testDB);
				if (result == null) result = caseSingleSourceNode(testDB);
				if (result == null) result = caseEssenceBase(testDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.TEST_REQ: {
				TestReq testReq = (TestReq)theEObject;
				T result = caseTestReq(testReq);
				if (result == null) result = caseEssenceBase(testReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.TRANSACTIONAL_PORT: {
				TransactionalPort transactionalPort = (TransactionalPort)theEObject;
				T result = caseTransactionalPort(transactionalPort);
				if (result == null) result = caseRealPort(transactionalPort);
				if (result == null) result = casePort(transactionalPort);
				if (result == null) result = caseGeneralPort(transactionalPort);
				if (result == null) result = caseSingleSourceNode(transactionalPort);
				if (result == null) result = caseEssenceBase(transactionalPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.TRANSACTIONAL_SIGNAL: {
				TransactionalSignal transactionalSignal = (TransactionalSignal)theEObject;
				T result = caseTransactionalSignal(transactionalSignal);
				if (result == null) result = caseSignal(transactionalSignal);
				if (result == null) result = caseSingleSourceNode(transactionalSignal);
				if (result == null) result = caseEssenceBase(transactionalSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.UNION: {
				Union union = (Union)theEObject;
				T result = caseUnion(union);
				if (result == null) result = caseComplexDataType(union);
				if (result == null) result = caseValueDataType(union);
				if (result == null) result = caseReturnDataType(union);
				if (result == null) result = caseDataType(union);
				if (result == null) result = caseEssenceBase(union);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.VALUE_DATA_TYPE: {
				ValueDataType valueDataType = (ValueDataType)theEObject;
				T result = caseValueDataType(valueDataType);
				if (result == null) result = caseReturnDataType(valueDataType);
				if (result == null) result = caseDataType(valueDataType);
				if (result == null) result = caseEssenceBase(valueDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.VAR_DEF: {
				VarDef varDef = (VarDef)theEObject;
				T result = caseVarDef(varDef);
				if (result == null) result = caseSingleSourceNode(varDef);
				if (result == null) result = caseEssenceBase(varDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.VAR_DEF_BLOCK: {
				VarDefBlock varDefBlock = (VarDefBlock)theEObject;
				T result = caseVarDefBlock(varDefBlock);
				if (result == null) result = caseSingleSourceNode(varDefBlock);
				if (result == null) result = caseEssenceBase(varDefBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.VLNV: {
				VLNV vlnv = (VLNV)theEObject;
				T result = caseVLNV(vlnv);
				if (result == null) result = caseEssenceBase(vlnv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.VOID: {
				Essence.Void void_ = (Essence.Void)theEObject;
				T result = caseVoid(void_);
				if (result == null) result = caseReturnDataType(void_);
				if (result == null) result = caseDataType(void_);
				if (result == null) result = caseEssenceBase(void_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.WIRE_PORT: {
				WirePort wirePort = (WirePort)theEObject;
				T result = caseWirePort(wirePort);
				if (result == null) result = caseRealPort(wirePort);
				if (result == null) result = casePort(wirePort);
				if (result == null) result = caseGeneralPort(wirePort);
				if (result == null) result = caseSingleSourceNode(wirePort);
				if (result == null) result = caseEssenceBase(wirePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.WIRE_SIGNAL: {
				WireSignal wireSignal = (WireSignal)theEObject;
				T result = caseWireSignal(wireSignal);
				if (result == null) result = caseSignal(wireSignal);
				if (result == null) result = caseSingleSourceNode(wireSignal);
				if (result == null) result = caseEssenceBase(wireSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF: {
				XRef xRef = (XRef)theEObject;
				T result = caseXRef(xRef);
				if (result == null) result = caseReference(xRef);
				if (result == null) result = caseEssenceBase(xRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_CONNECTION: {
				XRefConnection xRefConnection = (XRefConnection)theEObject;
				T result = caseXRefConnection(xRefConnection);
				if (result == null) result = caseXRefInternal(xRefConnection);
				if (result == null) result = caseXRef(xRefConnection);
				if (result == null) result = caseReference(xRefConnection);
				if (result == null) result = caseEssenceBase(xRefConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_DATA_VAR: {
				XRefDataVar xRefDataVar = (XRefDataVar)theEObject;
				T result = caseXRefDataVar(xRefDataVar);
				if (result == null) result = caseXRefInternal(xRefDataVar);
				if (result == null) result = caseXRef(xRefDataVar);
				if (result == null) result = caseReference(xRefDataVar);
				if (result == null) result = caseEssenceBase(xRefDataVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_DIRECT: {
				XRefDirect xRefDirect = (XRefDirect)theEObject;
				T result = caseXRefDirect(xRefDirect);
				if (result == null) result = caseXRefExternal(xRefDirect);
				if (result == null) result = caseXRef(xRefDirect);
				if (result == null) result = caseReference(xRefDirect);
				if (result == null) result = caseEssenceBase(xRefDirect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_EXTERNAL: {
				XRefExternal xRefExternal = (XRefExternal)theEObject;
				T result = caseXRefExternal(xRefExternal);
				if (result == null) result = caseXRef(xRefExternal);
				if (result == null) result = caseReference(xRefExternal);
				if (result == null) result = caseEssenceBase(xRefExternal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_EXTERNAL_INTERFACE: {
				XRefExternalInterface xRefExternalInterface = (XRefExternalInterface)theEObject;
				T result = caseXRefExternalInterface(xRefExternalInterface);
				if (result == null) result = caseXRefDirect(xRefExternalInterface);
				if (result == null) result = caseXRefExternal(xRefExternalInterface);
				if (result == null) result = caseXRef(xRefExternalInterface);
				if (result == null) result = caseReference(xRefExternalInterface);
				if (result == null) result = caseEssenceBase(xRefExternalInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_EXTERNAL_PORT: {
				XRefExternalPort xRefExternalPort = (XRefExternalPort)theEObject;
				T result = caseXRefExternalPort(xRefExternalPort);
				if (result == null) result = caseXRefDirect(xRefExternalPort);
				if (result == null) result = caseXRefExternal(xRefExternalPort);
				if (result == null) result = caseXRef(xRefExternalPort);
				if (result == null) result = caseReference(xRefExternalPort);
				if (result == null) result = caseEssenceBase(xRefExternalPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_EXTERNAL_SIGNAL: {
				XRefExternalSignal xRefExternalSignal = (XRefExternalSignal)theEObject;
				T result = caseXRefExternalSignal(xRefExternalSignal);
				if (result == null) result = caseXRefDirect(xRefExternalSignal);
				if (result == null) result = caseXRefExternal(xRefExternalSignal);
				if (result == null) result = caseXRef(xRefExternalSignal);
				if (result == null) result = caseReference(xRefExternalSignal);
				if (result == null) result = caseEssenceBase(xRefExternalSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_GENERIC_DECL: {
				XRefGenericDecl xRefGenericDecl = (XRefGenericDecl)theEObject;
				T result = caseXRefGenericDecl(xRefGenericDecl);
				if (result == null) result = caseXRefDirect(xRefGenericDecl);
				if (result == null) result = caseXRefExternal(xRefGenericDecl);
				if (result == null) result = caseXRef(xRefGenericDecl);
				if (result == null) result = caseReference(xRefGenericDecl);
				if (result == null) result = caseEssenceBase(xRefGenericDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_IFD_PORT: {
				XRefIFDPort xRefIFDPort = (XRefIFDPort)theEObject;
				T result = caseXRefIFDPort(xRefIFDPort);
				if (result == null) result = caseXRefDirect(xRefIFDPort);
				if (result == null) result = caseXRefExternal(xRefIFDPort);
				if (result == null) result = caseXRef(xRefIFDPort);
				if (result == null) result = caseReference(xRefIFDPort);
				if (result == null) result = caseEssenceBase(xRefIFDPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_IND_INTERFACE: {
				XRefIndInterface xRefIndInterface = (XRefIndInterface)theEObject;
				T result = caseXRefIndInterface(xRefIndInterface);
				if (result == null) result = caseXRefIndirect(xRefIndInterface);
				if (result == null) result = caseXRefExternal(xRefIndInterface);
				if (result == null) result = caseXRef(xRefIndInterface);
				if (result == null) result = caseReference(xRefIndInterface);
				if (result == null) result = caseEssenceBase(xRefIndInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_INDIRECT: {
				XRefIndirect xRefIndirect = (XRefIndirect)theEObject;
				T result = caseXRefIndirect(xRefIndirect);
				if (result == null) result = caseXRefExternal(xRefIndirect);
				if (result == null) result = caseXRef(xRefIndirect);
				if (result == null) result = caseReference(xRefIndirect);
				if (result == null) result = caseEssenceBase(xRefIndirect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_IND_PIN: {
				XRefIndPin xRefIndPin = (XRefIndPin)theEObject;
				T result = caseXRefIndPin(xRefIndPin);
				if (result == null) result = caseXRefIndirect(xRefIndPin);
				if (result == null) result = caseXRefExternal(xRefIndPin);
				if (result == null) result = caseXRef(xRefIndPin);
				if (result == null) result = caseReference(xRefIndPin);
				if (result == null) result = caseEssenceBase(xRefIndPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_IND_PORT: {
				XRefIndPort xRefIndPort = (XRefIndPort)theEObject;
				T result = caseXRefIndPort(xRefIndPort);
				if (result == null) result = caseXRefIndirect(xRefIndPort);
				if (result == null) result = caseXRefExternal(xRefIndPort);
				if (result == null) result = caseXRef(xRefIndPort);
				if (result == null) result = caseReference(xRefIndPort);
				if (result == null) result = caseEssenceBase(xRefIndPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_IND_SINGLE_PAD: {
				XRefIndSinglePad xRefIndSinglePad = (XRefIndSinglePad)theEObject;
				T result = caseXRefIndSinglePad(xRefIndSinglePad);
				if (result == null) result = caseXRefIndirect(xRefIndSinglePad);
				if (result == null) result = caseXRefExternal(xRefIndSinglePad);
				if (result == null) result = caseXRef(xRefIndSinglePad);
				if (result == null) result = caseReference(xRefIndSinglePad);
				if (result == null) result = caseEssenceBase(xRefIndSinglePad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_INSTANCE: {
				XRefInstance xRefInstance = (XRefInstance)theEObject;
				T result = caseXRefInstance(xRefInstance);
				if (result == null) result = caseXRefInternal(xRefInstance);
				if (result == null) result = caseXRef(xRefInstance);
				if (result == null) result = caseReference(xRefInstance);
				if (result == null) result = caseEssenceBase(xRefInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_INTERNAL: {
				XRefInternal xRefInternal = (XRefInternal)theEObject;
				T result = caseXRefInternal(xRefInternal);
				if (result == null) result = caseXRef(xRefInternal);
				if (result == null) result = caseReference(xRefInternal);
				if (result == null) result = caseEssenceBase(xRefInternal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_INTERNAL_INTERFACE: {
				XRefInternalInterface xRefInternalInterface = (XRefInternalInterface)theEObject;
				T result = caseXRefInternalInterface(xRefInternalInterface);
				if (result == null) result = caseXRefInternal(xRefInternalInterface);
				if (result == null) result = caseXRef(xRefInternalInterface);
				if (result == null) result = caseReference(xRefInternalInterface);
				if (result == null) result = caseEssenceBase(xRefInternalInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_INTERNAL_PORT: {
				XRefInternalPort xRefInternalPort = (XRefInternalPort)theEObject;
				T result = caseXRefInternalPort(xRefInternalPort);
				if (result == null) result = caseXRefInternal(xRefInternalPort);
				if (result == null) result = caseXRef(xRefInternalPort);
				if (result == null) result = caseReference(xRefInternalPort);
				if (result == null) result = caseEssenceBase(xRefInternalPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_INTERNAL_SIGNAL: {
				XRefInternalSignal xRefInternalSignal = (XRefInternalSignal)theEObject;
				T result = caseXRefInternalSignal(xRefInternalSignal);
				if (result == null) result = caseXRefInternal(xRefInternalSignal);
				if (result == null) result = caseXRef(xRefInternalSignal);
				if (result == null) result = caseReference(xRefInternalSignal);
				if (result == null) result = caseEssenceBase(xRefInternalSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_MASTER_INTERFACE: {
				XRefMasterInterface xRefMasterInterface = (XRefMasterInterface)theEObject;
				T result = caseXRefMasterInterface(xRefMasterInterface);
				if (result == null) result = caseXRefInternal(xRefMasterInterface);
				if (result == null) result = caseXRef(xRefMasterInterface);
				if (result == null) result = caseReference(xRefMasterInterface);
				if (result == null) result = caseEssenceBase(xRefMasterInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_NET: {
				XRefNet xRefNet = (XRefNet)theEObject;
				T result = caseXRefNet(xRefNet);
				if (result == null) result = caseXRefInternal(xRefNet);
				if (result == null) result = caseXRef(xRefNet);
				if (result == null) result = caseReference(xRefNet);
				if (result == null) result = caseEssenceBase(xRefNet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_NONE_INTERFACE: {
				XRefNoneInterface xRefNoneInterface = (XRefNoneInterface)theEObject;
				T result = caseXRefNoneInterface(xRefNoneInterface);
				if (result == null) result = caseXRefDirect(xRefNoneInterface);
				if (result == null) result = caseXRefExternal(xRefNoneInterface);
				if (result == null) result = caseXRef(xRefNoneInterface);
				if (result == null) result = caseReference(xRefNoneInterface);
				if (result == null) result = caseEssenceBase(xRefNoneInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_PAD_TYPE: {
				XRefPadType xRefPadType = (XRefPadType)theEObject;
				T result = caseXRefPadType(xRefPadType);
				if (result == null) result = caseXRefVLNV(xRefPadType);
				if (result == null) result = caseXRefDirect(xRefPadType);
				if (result == null) result = caseXRefExternal(xRefPadType);
				if (result == null) result = caseXRef(xRefPadType);
				if (result == null) result = caseReference(xRefPadType);
				if (result == null) result = caseEssenceBase(xRefPadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_PARAM_DECL: {
				XRefParamDecl xRefParamDecl = (XRefParamDecl)theEObject;
				T result = caseXRefParamDecl(xRefParamDecl);
				if (result == null) result = caseXRefDirect(xRefParamDecl);
				if (result == null) result = caseXRefExternal(xRefParamDecl);
				if (result == null) result = caseXRef(xRefParamDecl);
				if (result == null) result = caseReference(xRefParamDecl);
				if (result == null) result = caseEssenceBase(xRefParamDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_PIN: {
				XRefPin xRefPin = (XRefPin)theEObject;
				T result = caseXRefPin(xRefPin);
				if (result == null) result = caseXRefDirect(xRefPin);
				if (result == null) result = caseXRefExternal(xRefPin);
				if (result == null) result = caseXRef(xRefPin);
				if (result == null) result = caseReference(xRefPin);
				if (result == null) result = caseEssenceBase(xRefPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_POWER_DOMAIN: {
				XRefPowerDomain xRefPowerDomain = (XRefPowerDomain)theEObject;
				T result = caseXRefPowerDomain(xRefPowerDomain);
				if (result == null) result = caseXRefInternal(xRefPowerDomain);
				if (result == null) result = caseXRef(xRefPowerDomain);
				if (result == null) result = caseReference(xRefPowerDomain);
				if (result == null) result = caseEssenceBase(xRefPowerDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_REAL_PORT: {
				XRefRealPort xRefRealPort = (XRefRealPort)theEObject;
				T result = caseXRefRealPort(xRefRealPort);
				if (result == null) result = caseXRefInternal(xRefRealPort);
				if (result == null) result = caseXRef(xRefRealPort);
				if (result == null) result = caseReference(xRefRealPort);
				if (result == null) result = caseEssenceBase(xRefRealPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_REGISTER_VIEW: {
				XRefRegisterView xRefRegisterView = (XRefRegisterView)theEObject;
				T result = caseXRefRegisterView(xRefRegisterView);
				if (result == null) result = caseXRefInternal(xRefRegisterView);
				if (result == null) result = caseXRef(xRefRegisterView);
				if (result == null) result = caseReference(xRefRegisterView);
				if (result == null) result = caseEssenceBase(xRefRegisterView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_REG_MEM_SET: {
				XRefRegMemSet xRefRegMemSet = (XRefRegMemSet)theEObject;
				T result = caseXRefRegMemSet(xRefRegMemSet);
				if (result == null) result = caseXRefInternal(xRefRegMemSet);
				if (result == null) result = caseXRef(xRefRegMemSet);
				if (result == null) result = caseReference(xRefRegMemSet);
				if (result == null) result = caseEssenceBase(xRefRegMemSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_SINGLE_PAD: {
				XRefSinglePad xRefSinglePad = (XRefSinglePad)theEObject;
				T result = caseXRefSinglePad(xRefSinglePad);
				if (result == null) result = caseXRefDirect(xRefSinglePad);
				if (result == null) result = caseXRefExternal(xRefSinglePad);
				if (result == null) result = caseXRef(xRefSinglePad);
				if (result == null) result = caseReference(xRefSinglePad);
				if (result == null) result = caseEssenceBase(xRefSinglePad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_SI_PORT: {
				XRefSiPort xRefSiPort = (XRefSiPort)theEObject;
				T result = caseXRefSiPort(xRefSiPort);
				if (result == null) result = caseXRefVLNV(xRefSiPort);
				if (result == null) result = caseXRefDirect(xRefSiPort);
				if (result == null) result = caseXRefExternal(xRefSiPort);
				if (result == null) result = caseXRef(xRefSiPort);
				if (result == null) result = caseReference(xRefSiPort);
				if (result == null) result = caseEssenceBase(xRefSiPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_SI_SIGNAL: {
				XRefSiSignal xRefSiSignal = (XRefSiSignal)theEObject;
				T result = caseXRefSiSignal(xRefSiSignal);
				if (result == null) result = caseXRefVLNV(xRefSiSignal);
				if (result == null) result = caseXRefDirect(xRefSiSignal);
				if (result == null) result = caseXRefExternal(xRefSiSignal);
				if (result == null) result = caseXRef(xRefSiSignal);
				if (result == null) result = caseReference(xRefSiSignal);
				if (result == null) result = caseEssenceBase(xRefSiSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_SLAVE_INTERFACE: {
				XRefSlaveInterface xRefSlaveInterface = (XRefSlaveInterface)theEObject;
				T result = caseXRefSlaveInterface(xRefSlaveInterface);
				if (result == null) result = caseXRefExternal(xRefSlaveInterface);
				if (result == null) result = caseXRef(xRefSlaveInterface);
				if (result == null) result = caseReference(xRefSlaveInterface);
				if (result == null) result = caseEssenceBase(xRefSlaveInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_TEST: {
				XRefTest xRefTest = (XRefTest)theEObject;
				T result = caseXRefTest(xRefTest);
				if (result == null) result = caseXRefVLNV(xRefTest);
				if (result == null) result = caseXRefDirect(xRefTest);
				if (result == null) result = caseXRefExternal(xRefTest);
				if (result == null) result = caseXRef(xRefTest);
				if (result == null) result = caseReference(xRefTest);
				if (result == null) result = caseEssenceBase(xRefTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EssencePackage.XREF_VLNV: {
				XRefVLNV xRefVLNV = (XRefVLNV)theEObject;
				T result = caseXRefVLNV(xRefVLNV);
				if (result == null) result = caseXRefDirect(xRefVLNV);
				if (result == null) result = caseXRefExternal(xRefVLNV);
				if (result == null) result = caseXRef(xRefVLNV);
				if (result == null) result = caseReference(xRefVLNV);
				if (result == null) result = caseEssenceBase(xRefVLNV);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccess(Access object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access By Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access By Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessByIndex(AccessByIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access By Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access By Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessByName(AccessByName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessCondition(AccessCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessLevel(AccessLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressBlock(AddressBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArray(Array object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayDimension(ArrayDimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitField(BitField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Field Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Field Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitFieldElement(BitFieldElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Field Gap Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Field Gap Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitFieldGapElement(BitFieldGapElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Field Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Field Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitFieldSequence(BitFieldSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Field Sequence Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Field Sequence Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitFieldSequenceElement(BitFieldSequenceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanDecl(BooleanDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanDef(BooleanDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Gen Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Gen Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanGenDecl(BooleanGenDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBus(Bus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusInstance(BusInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Interface Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Interface Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusInterfaceMap(BusInterfaceMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus None Interface Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus None Interface Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusNoneInterfaceMap(BusNoneInterfaceMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cable Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cable Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCablePort(CablePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cable Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cable Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCableSignal(CableSignal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexDataType(ComplexDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInstance(ComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Const Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Const Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstDef(ConstDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Const Def Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Const Def Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstDefBlock(ConstDefBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDecl(DataDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDef(DataDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Gen Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Gen Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataGenDecl(DataGenDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeElement(DataTypeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionItem(DescriptionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnum(Essence.Enum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumElement(EnumElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationElement(EnumerationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationInteger(EnumerationInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationSequence(EnumerationSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationString(EnumerationString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEssenceBase(EssenceBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gap Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gap Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGapElement(GapElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralInstance(GeneralInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralInterface(GeneralInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Pad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Pad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralPad(GeneralPad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralPort(GeneralPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Register</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Register</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralRegister(GeneralRegister object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericDecl(GenericDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Decl Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Decl Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericDeclBlock(GenericDeclBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericMap(GenericMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Var User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Var User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexVarUser(IndexVarUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstance(Instance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Interface Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Interface Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceInterfaceMap(InstanceInterfaceMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Port Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Port Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstancePortMap(InstancePortMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Shell Interface Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Shell Interface Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceShellInterfaceMap(InstanceShellInterfaceMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Shell Port Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Shell Port Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceShellPortMap(InstanceShellPortMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerDecl(IntegerDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerDef(IntegerDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Gen Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Gen Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerGenDecl(IntegerGenDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Def Cable Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Def Cable Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDefCablePort(InterfaceDefCablePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDefinition(InterfaceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Def Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Def Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDefPort(InterfaceDefPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Def Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Def Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDefRole(InterfaceDefRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Def Transactional Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Def Transactional Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDefTransactionalPort(InterfaceDefTransactionalPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Def View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Def View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDefView(InterfaceDefView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Def Wire Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Def Wire Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDefWirePort(InterfaceDefWirePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceInstance(InterfaceInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Port Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Port Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfacePortMap(InterfacePortMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceView(InterfaceView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Interface Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Interface Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalInterfaceMap(LocalInterfaceMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Port Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Port Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalPortMap(LocalPortMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemory(Memory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodDataType(MethodDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Data Type Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Data Type Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodDataTypeElement(MethodDataTypeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelRoot(ModelRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Pad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Pad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiPad(MultiPad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi View Register</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi View Register</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiViewRegister(MultiViewRegister object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNet(Net object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>None Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>None Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoneInterface(NoneInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(Essence.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageInstance(PackageInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePad(Pad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pad Multiplexed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pad Multiplexed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePadMultiplexed(PadMultiplexed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pad Net Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pad Net Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePadNetMap(PadNetMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pad Non Multiplexed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pad Non Multiplexed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePadNonMultiplexed(PadNonMultiplexed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pad Special</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pad Special</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePadSpecial(PadSpecial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pad Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pad Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePadSupply(PadSupply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pad Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pad Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePadType(PadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pad Type DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pad Type DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePadTypeDB(PadTypeDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamDecl(ParamDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Decl Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Decl Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamDeclBlock(ParamDeclBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamMap(ParamMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathRef(PathRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePin(Pin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin Net Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin Net Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePinNetMap(PinNetMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortRef(PortRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerDomain(PowerDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduct(Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductInstance(ProductInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Interface Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Interface Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductInterfaceMap(ProductInterfaceMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Pad Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Pad Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductPadMap(ProductPadMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Pin Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Pin Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductPinMap(ProductPinMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealPort(RealPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecord(Record object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegister(Register object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisterView(RegisterView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reg Mem Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reg Mem Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegMemElement(RegMemElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reg Mem Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reg Mem Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegMemSequence(RegMemSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reg Mem Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reg Mem Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegMemSet(RegMemSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reg View Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reg View Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegViewBlock(RegViewBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResetType(ResetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnDataType(ReturnDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Element Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Element Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnElementAccess(ReturnElementAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceElement(SequenceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shell Interface Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shell Interface Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShellInterfaceMap(ShellInterfaceMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shell Port Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shell Port Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShellPortMap(ShellPortMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Si Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Si Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiComponentInstance(SiComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal(Signal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalMap(SignalMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalOwner(SignalOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Si Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Si Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiInstance(SiInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Si Instance Interface Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Si Instance Interface Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiInstanceInterfaceMap(SiInstanceInterfaceMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Si Instance Port Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Si Instance Port Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiInstancePortMap(SiInstancePortMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Si Instance Shell Interface Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Si Instance Shell Interface Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiInstanceShellInterfaceMap(SiInstanceShellInterfaceMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Si Instance Shell Port Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Si Instance Shell Port Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiInstanceShellPortMap(SiInstanceShellPortMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Silicon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Silicon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSilicon(Silicon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Silicon Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Silicon Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiliconInstance(SiliconInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleDataType(SimpleDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Sub Element Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Sub Element Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleSubElementAccess(SimpleSubElementAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Pad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Pad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinglePad(SinglePad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Source Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Source Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleSourceNode(SingleSourceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Si Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Si Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiPort(SiPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Si Port DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Si Port DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiPortDB(SiPortDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Si Port Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Si Port Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiPortReq(SiPortReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Si Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Si Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiSignal(SiSignal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Si Signal DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Si Signal DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiSignalDB(SiSignalDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Si System Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Si System Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiSystemInstance(SiSystemInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringDecl(StringDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringDef(StringDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Gen Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Gen Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringGenDecl(StringGenDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Element Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Element Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubElementAccess(SubElementAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(Essence.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemInstance(SystemInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTest(Test object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestDB(TestDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestReq(TestReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transactional Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transactional Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionalPort(TransactionalPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transactional Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transactional Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionalSignal(TransactionalSignal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnion(Union object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueDataType(ValueDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarDef(VarDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Def Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Def Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarDefBlock(VarDefBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VLNV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VLNV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVLNV(VLNV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Void</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoid(Essence.Void object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wire Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wire Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWirePort(WirePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wire Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wire Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWireSignal(WireSignal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRef(XRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefConnection(XRefConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Data Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Data Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefDataVar(XRefDataVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Direct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Direct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefDirect(XRefDirect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef External</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef External</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefExternal(XRefExternal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef External Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef External Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefExternalInterface(XRefExternalInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef External Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef External Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefExternalPort(XRefExternalPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef External Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef External Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefExternalSignal(XRefExternalSignal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Generic Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Generic Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefGenericDecl(XRefGenericDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef IFD Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef IFD Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefIFDPort(XRefIFDPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Ind Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Ind Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefIndInterface(XRefIndInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Indirect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Indirect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefIndirect(XRefIndirect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Ind Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Ind Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefIndPin(XRefIndPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Ind Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Ind Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefIndPort(XRefIndPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Ind Single Pad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Ind Single Pad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefIndSinglePad(XRefIndSinglePad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefInstance(XRefInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Internal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Internal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefInternal(XRefInternal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Internal Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Internal Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefInternalInterface(XRefInternalInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Internal Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Internal Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefInternalPort(XRefInternalPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Internal Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Internal Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefInternalSignal(XRefInternalSignal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Master Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Master Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefMasterInterface(XRefMasterInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefNet(XRefNet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef None Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef None Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefNoneInterface(XRefNoneInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Pad Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Pad Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefPadType(XRefPadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Param Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Param Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefParamDecl(XRefParamDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefPin(XRefPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Power Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Power Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefPowerDomain(XRefPowerDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Real Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Real Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefRealPort(XRefRealPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Register View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Register View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefRegisterView(XRefRegisterView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Reg Mem Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Reg Mem Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefRegMemSet(XRefRegMemSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Single Pad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Single Pad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefSinglePad(XRefSinglePad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Si Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Si Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefSiPort(XRefSiPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Si Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Si Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefSiSignal(XRefSiSignal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Slave Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Slave Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefSlaveInterface(XRefSlaveInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefTest(XRefTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRef VLNV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRef VLNV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRefVLNV(XRefVLNV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EssenceSwitch
