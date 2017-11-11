/**
 */
package model.util;

import model.Access;
import model.AccessByIndex;
import model.AccessByName;
import model.AccessCondition;
import model.AccessLevel;
import model.AddressBlock;
import model.Array;
import model.ArrayDimension;
import model.BitField;
import model.BitFieldElement;
import model.BitFieldGapElement;
import model.BitFieldSequence;
import model.BitFieldSequenceElement;
import model.BooleanDecl;
import model.BooleanDef;
import model.BooleanGenDecl;
import model.Bus;
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
import model.EnumElement;
import model.Enumeration;
import model.EnumerationElement;
import model.EnumerationInteger;
import model.EnumerationSequence;
import model.EnumerationString;
import model.EssenceBase;
import model.Function;
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
import model.InterfaceDefTransactionalPort;
import model.InterfaceDefView;
import model.InterfaceDefWirePort;
import model.InterfaceDefinition;
import model.InterfaceInstance;
import model.InterfacePortMap;
import model.InterfaceView;
import model.LocalInterfaceMap;
import model.LocalPortMap;
import model.Memory;
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
import model.Signal;
import model.SignalMap;
import model.SignalOwner;
import model.Silicon;
import model.SiliconInstance;
import model.SimpleDataType;
import model.SimpleSubElementAccess;
import model.SinglePad;
import model.SingleSourceNode;
import model.StringDecl;
import model.StringDef;
import model.StringGenDecl;
import model.SubElementAccess;
import model.SystemInstance;
import model.Test;
import model.TestDB;
import model.TestReq;
import model.TransactionalPort;
import model.TransactionalSignal;
import model.Union;
import model.VLNV;
import model.ValueDataType;
import model.VarDef;
import model.VarDefBlock;
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

import modelextension.BitResetType;
import modelextension.CommonAccessLevel;
import modelextension.DataTypeOwner;
import modelextension.EssenceBaseExtension;
import modelextension.Offset;
import modelextension.OffsetSequence;
import modelextension.OffsetSequenceElement;
import modelextension.SequenceBase;
import modelextension.SequenceElementBase;

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
 * @see model.ModelPackage
 * @generated
 */
public class ModelSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
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
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.ACCESS: {
				Access access = (Access)theEObject;
				T1 result = caseAccess(access);
				if (result == null) result = caseEssenceBase(access);
				if (result == null) result = caseEssenceBaseExtension(access);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ACCESS_BY_INDEX: {
				AccessByIndex accessByIndex = (AccessByIndex)theEObject;
				T1 result = caseAccessByIndex(accessByIndex);
				if (result == null) result = caseSimpleSubElementAccess(accessByIndex);
				if (result == null) result = caseSubElementAccess(accessByIndex);
				if (result == null) result = caseEssenceBase(accessByIndex);
				if (result == null) result = caseEssenceBaseExtension(accessByIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ACCESS_BY_NAME: {
				AccessByName accessByName = (AccessByName)theEObject;
				T1 result = caseAccessByName(accessByName);
				if (result == null) result = caseSimpleSubElementAccess(accessByName);
				if (result == null) result = caseSubElementAccess(accessByName);
				if (result == null) result = caseEssenceBase(accessByName);
				if (result == null) result = caseEssenceBaseExtension(accessByName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ACCESS_CONDITION: {
				AccessCondition accessCondition = (AccessCondition)theEObject;
				T1 result = caseAccessCondition(accessCondition);
				if (result == null) result = caseIndexVarUser(accessCondition);
				if (result == null) result = caseSingleSourceNode(accessCondition);
				if (result == null) result = caseEssenceBase(accessCondition);
				if (result == null) result = caseEssenceBaseExtension(accessCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ACCESS_LEVEL: {
				AccessLevel accessLevel = (AccessLevel)theEObject;
				T1 result = caseAccessLevel(accessLevel);
				if (result == null) result = caseIndexVarUser(accessLevel);
				if (result == null) result = caseSingleSourceNode(accessLevel);
				if (result == null) result = caseEssenceBase(accessLevel);
				if (result == null) result = caseEssenceBaseExtension(accessLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ADDRESS_BLOCK: {
				AddressBlock addressBlock = (AddressBlock)theEObject;
				T1 result = caseAddressBlock(addressBlock);
				if (result == null) result = caseEssenceBase(addressBlock);
				if (result == null) result = caseEssenceBaseExtension(addressBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ARRAY: {
				Array array = (Array)theEObject;
				T1 result = caseArray(array);
				if (result == null) result = caseComplexDataType(array);
				if (result == null) result = caseValueDataType(array);
				if (result == null) result = caseReturnDataType(array);
				if (result == null) result = caseDataType(array);
				if (result == null) result = caseEssenceBase(array);
				if (result == null) result = caseEssenceBaseExtension(array);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ARRAY_DIMENSION: {
				ArrayDimension arrayDimension = (ArrayDimension)theEObject;
				T1 result = caseArrayDimension(arrayDimension);
				if (result == null) result = caseEssenceBase(arrayDimension);
				if (result == null) result = caseEssenceBaseExtension(arrayDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BIT_FIELD: {
				BitField bitField = (BitField)theEObject;
				T1 result = caseBitField(bitField);
				if (result == null) result = caseBitFieldSequenceElement(bitField);
				if (result == null) result = caseBitResetType(bitField);
				if (result == null) result = caseBitFieldElement(bitField);
				if (result == null) result = caseOffsetSequenceElement(bitField);
				if (result == null) result = caseIndexVarUser(bitField);
				if (result == null) result = caseSequenceElementBase(bitField);
				if (result == null) result = caseOffset(bitField);
				if (result == null) result = caseSingleSourceNode(bitField);
				if (result == null) result = caseEssenceBase(bitField);
				if (result == null) result = caseEssenceBaseExtension(bitField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BIT_FIELD_ELEMENT: {
				BitFieldElement bitFieldElement = (BitFieldElement)theEObject;
				T1 result = caseBitFieldElement(bitFieldElement);
				if (result == null) result = caseIndexVarUser(bitFieldElement);
				if (result == null) result = caseSingleSourceNode(bitFieldElement);
				if (result == null) result = caseEssenceBase(bitFieldElement);
				if (result == null) result = caseEssenceBaseExtension(bitFieldElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BIT_FIELD_GAP_ELEMENT: {
				BitFieldGapElement bitFieldGapElement = (BitFieldGapElement)theEObject;
				T1 result = caseBitFieldGapElement(bitFieldGapElement);
				if (result == null) result = caseBitFieldSequenceElement(bitFieldGapElement);
				if (result == null) result = caseBitFieldElement(bitFieldGapElement);
				if (result == null) result = caseOffsetSequenceElement(bitFieldGapElement);
				if (result == null) result = caseIndexVarUser(bitFieldGapElement);
				if (result == null) result = caseSequenceElementBase(bitFieldGapElement);
				if (result == null) result = caseOffset(bitFieldGapElement);
				if (result == null) result = caseSingleSourceNode(bitFieldGapElement);
				if (result == null) result = caseEssenceBase(bitFieldGapElement);
				if (result == null) result = caseEssenceBaseExtension(bitFieldGapElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BIT_FIELD_SEQUENCE: {
				BitFieldSequence bitFieldSequence = (BitFieldSequence)theEObject;
				T1 result = caseBitFieldSequence(bitFieldSequence);
				if (result == null) result = caseBitFieldElement(bitFieldSequence);
				if (result == null) result = caseOffsetSequence(bitFieldSequence);
				if (result == null) result = caseIndexVarUser(bitFieldSequence);
				if (result == null) result = caseOffset(bitFieldSequence);
				if (result == null) result = caseSequenceBase(bitFieldSequence);
				if (result == null) result = caseSingleSourceNode(bitFieldSequence);
				if (result == null) result = caseEssenceBase(bitFieldSequence);
				if (result == null) result = caseEssenceBaseExtension(bitFieldSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BIT_FIELD_SEQUENCE_ELEMENT: {
				BitFieldSequenceElement bitFieldSequenceElement = (BitFieldSequenceElement)theEObject;
				T1 result = caseBitFieldSequenceElement(bitFieldSequenceElement);
				if (result == null) result = caseBitFieldElement(bitFieldSequenceElement);
				if (result == null) result = caseOffsetSequenceElement(bitFieldSequenceElement);
				if (result == null) result = caseIndexVarUser(bitFieldSequenceElement);
				if (result == null) result = caseSequenceElementBase(bitFieldSequenceElement);
				if (result == null) result = caseOffset(bitFieldSequenceElement);
				if (result == null) result = caseSingleSourceNode(bitFieldSequenceElement);
				if (result == null) result = caseEssenceBase(bitFieldSequenceElement);
				if (result == null) result = caseEssenceBaseExtension(bitFieldSequenceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BOOLEAN_DECL: {
				BooleanDecl booleanDecl = (BooleanDecl)theEObject;
				T1 result = caseBooleanDecl(booleanDecl);
				if (result == null) result = caseParamDecl(booleanDecl);
				if (result == null) result = caseVarDef(booleanDecl);
				if (result == null) result = caseSingleSourceNode(booleanDecl);
				if (result == null) result = caseEssenceBase(booleanDecl);
				if (result == null) result = caseEssenceBaseExtension(booleanDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BOOLEAN_DEF: {
				BooleanDef booleanDef = (BooleanDef)theEObject;
				T1 result = caseBooleanDef(booleanDef);
				if (result == null) result = caseConstDef(booleanDef);
				if (result == null) result = caseVarDef(booleanDef);
				if (result == null) result = caseSingleSourceNode(booleanDef);
				if (result == null) result = caseEssenceBase(booleanDef);
				if (result == null) result = caseEssenceBaseExtension(booleanDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BOOLEAN_GEN_DECL: {
				BooleanGenDecl booleanGenDecl = (BooleanGenDecl)theEObject;
				T1 result = caseBooleanGenDecl(booleanGenDecl);
				if (result == null) result = caseGenericDecl(booleanGenDecl);
				if (result == null) result = caseVarDef(booleanGenDecl);
				if (result == null) result = caseSingleSourceNode(booleanGenDecl);
				if (result == null) result = caseEssenceBase(booleanGenDecl);
				if (result == null) result = caseEssenceBaseExtension(booleanGenDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BUS: {
				Bus bus = (Bus)theEObject;
				T1 result = caseBus(bus);
				if (result == null) result = caseModelRoot(bus);
				if (result == null) result = caseSingleSourceNode(bus);
				if (result == null) result = caseEssenceBase(bus);
				if (result == null) result = caseEssenceBaseExtension(bus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BUS_INSTANCE: {
				BusInstance busInstance = (BusInstance)theEObject;
				T1 result = caseBusInstance(busInstance);
				if (result == null) result = caseInstance(busInstance);
				if (result == null) result = caseGeneralInstance(busInstance);
				if (result == null) result = caseSingleSourceNode(busInstance);
				if (result == null) result = caseEssenceBase(busInstance);
				if (result == null) result = caseEssenceBaseExtension(busInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BUS_INTERFACE_MAP: {
				BusInterfaceMap busInterfaceMap = (BusInterfaceMap)theEObject;
				T1 result = caseBusInterfaceMap(busInterfaceMap);
				if (result == null) result = caseSingleSourceNode(busInterfaceMap);
				if (result == null) result = caseEssenceBase(busInterfaceMap);
				if (result == null) result = caseEssenceBaseExtension(busInterfaceMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BUS_NONE_INTERFACE_MAP: {
				BusNoneInterfaceMap busNoneInterfaceMap = (BusNoneInterfaceMap)theEObject;
				T1 result = caseBusNoneInterfaceMap(busNoneInterfaceMap);
				if (result == null) result = caseSingleSourceNode(busNoneInterfaceMap);
				if (result == null) result = caseEssenceBase(busNoneInterfaceMap);
				if (result == null) result = caseEssenceBaseExtension(busNoneInterfaceMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CABLE_PORT: {
				CablePort cablePort = (CablePort)theEObject;
				T1 result = caseCablePort(cablePort);
				if (result == null) result = caseRealPort(cablePort);
				if (result == null) result = casePort(cablePort);
				if (result == null) result = caseDataTypeOwner(cablePort);
				if (result == null) result = caseGeneralPort(cablePort);
				if (result == null) result = caseSingleSourceNode(cablePort);
				if (result == null) result = caseEssenceBase(cablePort);
				if (result == null) result = caseEssenceBaseExtension(cablePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CABLE_SIGNAL: {
				CableSignal cableSignal = (CableSignal)theEObject;
				T1 result = caseCableSignal(cableSignal);
				if (result == null) result = caseSignal(cableSignal);
				if (result == null) result = caseSingleSourceNode(cableSignal);
				if (result == null) result = caseDataTypeOwner(cableSignal);
				if (result == null) result = caseEssenceBase(cableSignal);
				if (result == null) result = caseEssenceBaseExtension(cableSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COMPLEX_DATA_TYPE: {
				ComplexDataType complexDataType = (ComplexDataType)theEObject;
				T1 result = caseComplexDataType(complexDataType);
				if (result == null) result = caseValueDataType(complexDataType);
				if (result == null) result = caseReturnDataType(complexDataType);
				if (result == null) result = caseDataType(complexDataType);
				if (result == null) result = caseEssenceBase(complexDataType);
				if (result == null) result = caseEssenceBaseExtension(complexDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T1 result = caseComponent(component);
				if (result == null) result = caseModelRoot(component);
				if (result == null) result = caseSingleSourceNode(component);
				if (result == null) result = caseEssenceBase(component);
				if (result == null) result = caseEssenceBaseExtension(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COMPONENT_INSTANCE: {
				ComponentInstance componentInstance = (ComponentInstance)theEObject;
				T1 result = caseComponentInstance(componentInstance);
				if (result == null) result = caseInterfaceInstance(componentInstance);
				if (result == null) result = caseInstance(componentInstance);
				if (result == null) result = caseGeneralInstance(componentInstance);
				if (result == null) result = caseSingleSourceNode(componentInstance);
				if (result == null) result = caseEssenceBase(componentInstance);
				if (result == null) result = caseEssenceBaseExtension(componentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T1 result = caseConnection(connection);
				if (result == null) result = caseSignalOwner(connection);
				if (result == null) result = caseSingleSourceNode(connection);
				if (result == null) result = caseEssenceBase(connection);
				if (result == null) result = caseEssenceBaseExtension(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CONST_DEF: {
				ConstDef constDef = (ConstDef)theEObject;
				T1 result = caseConstDef(constDef);
				if (result == null) result = caseVarDef(constDef);
				if (result == null) result = caseSingleSourceNode(constDef);
				if (result == null) result = caseEssenceBase(constDef);
				if (result == null) result = caseEssenceBaseExtension(constDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CONST_DEF_BLOCK: {
				ConstDefBlock constDefBlock = (ConstDefBlock)theEObject;
				T1 result = caseConstDefBlock(constDefBlock);
				if (result == null) result = caseVarDefBlock(constDefBlock);
				if (result == null) result = caseSingleSourceNode(constDefBlock);
				if (result == null) result = caseEssenceBase(constDefBlock);
				if (result == null) result = caseEssenceBaseExtension(constDefBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DATA_DECL: {
				DataDecl dataDecl = (DataDecl)theEObject;
				T1 result = caseDataDecl(dataDecl);
				if (result == null) result = caseParamDecl(dataDecl);
				if (result == null) result = caseVarDef(dataDecl);
				if (result == null) result = caseSingleSourceNode(dataDecl);
				if (result == null) result = caseEssenceBase(dataDecl);
				if (result == null) result = caseEssenceBaseExtension(dataDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DATA_DEF: {
				DataDef dataDef = (DataDef)theEObject;
				T1 result = caseDataDef(dataDef);
				if (result == null) result = caseConstDef(dataDef);
				if (result == null) result = caseVarDef(dataDef);
				if (result == null) result = caseSingleSourceNode(dataDef);
				if (result == null) result = caseEssenceBase(dataDef);
				if (result == null) result = caseEssenceBaseExtension(dataDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DATA_GEN_DECL: {
				DataGenDecl dataGenDecl = (DataGenDecl)theEObject;
				T1 result = caseDataGenDecl(dataGenDecl);
				if (result == null) result = caseGenericDecl(dataGenDecl);
				if (result == null) result = caseVarDef(dataGenDecl);
				if (result == null) result = caseSingleSourceNode(dataGenDecl);
				if (result == null) result = caseEssenceBase(dataGenDecl);
				if (result == null) result = caseEssenceBaseExtension(dataGenDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T1 result = caseDataType(dataType);
				if (result == null) result = caseEssenceBase(dataType);
				if (result == null) result = caseEssenceBaseExtension(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DATA_TYPE_ELEMENT: {
				DataTypeElement dataTypeElement = (DataTypeElement)theEObject;
				T1 result = caseDataTypeElement(dataTypeElement);
				if (result == null) result = caseEssenceBase(dataTypeElement);
				if (result == null) result = caseEssenceBaseExtension(dataTypeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DESCRIPTION_ITEM: {
				DescriptionItem descriptionItem = (DescriptionItem)theEObject;
				T1 result = caseDescriptionItem(descriptionItem);
				if (result == null) result = caseEssenceBase(descriptionItem);
				if (result == null) result = caseEssenceBaseExtension(descriptionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T1 result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ENUM: {
				model.Enum enum_ = (model.Enum)theEObject;
				T1 result = caseEnum(enum_);
				if (result == null) result = caseComplexDataType(enum_);
				if (result == null) result = caseValueDataType(enum_);
				if (result == null) result = caseReturnDataType(enum_);
				if (result == null) result = caseDataType(enum_);
				if (result == null) result = caseEssenceBase(enum_);
				if (result == null) result = caseEssenceBaseExtension(enum_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ENUM_ELEMENT: {
				EnumElement enumElement = (EnumElement)theEObject;
				T1 result = caseEnumElement(enumElement);
				if (result == null) result = caseEssenceBase(enumElement);
				if (result == null) result = caseEssenceBaseExtension(enumElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T1 result = caseEnumeration(enumeration);
				if (result == null) result = caseEnumerationElement(enumeration);
				if (result == null) result = caseSequenceElementBase(enumeration);
				if (result == null) result = caseIndexVarUser(enumeration);
				if (result == null) result = caseSingleSourceNode(enumeration);
				if (result == null) result = caseEssenceBase(enumeration);
				if (result == null) result = caseEssenceBaseExtension(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ENUMERATION_ELEMENT: {
				EnumerationElement enumerationElement = (EnumerationElement)theEObject;
				T1 result = caseEnumerationElement(enumerationElement);
				if (result == null) result = caseIndexVarUser(enumerationElement);
				if (result == null) result = caseSingleSourceNode(enumerationElement);
				if (result == null) result = caseEssenceBase(enumerationElement);
				if (result == null) result = caseEssenceBaseExtension(enumerationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ENUMERATION_INTEGER: {
				EnumerationInteger enumerationInteger = (EnumerationInteger)theEObject;
				T1 result = caseEnumerationInteger(enumerationInteger);
				if (result == null) result = caseEssenceBase(enumerationInteger);
				if (result == null) result = caseEssenceBaseExtension(enumerationInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ENUMERATION_SEQUENCE: {
				EnumerationSequence enumerationSequence = (EnumerationSequence)theEObject;
				T1 result = caseEnumerationSequence(enumerationSequence);
				if (result == null) result = caseEnumerationElement(enumerationSequence);
				if (result == null) result = caseSequenceBase(enumerationSequence);
				if (result == null) result = caseIndexVarUser(enumerationSequence);
				if (result == null) result = caseSingleSourceNode(enumerationSequence);
				if (result == null) result = caseEssenceBase(enumerationSequence);
				if (result == null) result = caseEssenceBaseExtension(enumerationSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ENUMERATION_STRING: {
				EnumerationString enumerationString = (EnumerationString)theEObject;
				T1 result = caseEnumerationString(enumerationString);
				if (result == null) result = caseEssenceBase(enumerationString);
				if (result == null) result = caseEssenceBaseExtension(enumerationString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ESSENCE_BASE: {
				EssenceBase essenceBase = (EssenceBase)theEObject;
				T1 result = caseEssenceBase(essenceBase);
				if (result == null) result = caseEssenceBaseExtension(essenceBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T1 result = caseFunction(function);
				if (result == null) result = caseSingleSourceNode(function);
				if (result == null) result = caseEssenceBase(function);
				if (result == null) result = caseEssenceBaseExtension(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GAP_ELEMENT: {
				GapElement gapElement = (GapElement)theEObject;
				T1 result = caseGapElement(gapElement);
				if (result == null) result = caseSequenceElement(gapElement);
				if (result == null) result = caseRegMemElement(gapElement);
				if (result == null) result = caseIndexVarUser(gapElement);
				if (result == null) result = caseOffsetSequenceElement(gapElement);
				if (result == null) result = caseSingleSourceNode(gapElement);
				if (result == null) result = caseSequenceElementBase(gapElement);
				if (result == null) result = caseOffset(gapElement);
				if (result == null) result = caseEssenceBase(gapElement);
				if (result == null) result = caseEssenceBaseExtension(gapElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GENERAL_INSTANCE: {
				GeneralInstance generalInstance = (GeneralInstance)theEObject;
				T1 result = caseGeneralInstance(generalInstance);
				if (result == null) result = caseSingleSourceNode(generalInstance);
				if (result == null) result = caseEssenceBase(generalInstance);
				if (result == null) result = caseEssenceBaseExtension(generalInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GENERAL_INTERFACE: {
				GeneralInterface generalInterface = (GeneralInterface)theEObject;
				T1 result = caseGeneralInterface(generalInterface);
				if (result == null) result = caseSingleSourceNode(generalInterface);
				if (result == null) result = caseEssenceBase(generalInterface);
				if (result == null) result = caseEssenceBaseExtension(generalInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GENERAL_PAD: {
				GeneralPad generalPad = (GeneralPad)theEObject;
				T1 result = caseGeneralPad(generalPad);
				if (result == null) result = caseSinglePad(generalPad);
				if (result == null) result = casePad(generalPad);
				if (result == null) result = caseSingleSourceNode(generalPad);
				if (result == null) result = caseEssenceBase(generalPad);
				if (result == null) result = caseEssenceBaseExtension(generalPad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GENERAL_PORT: {
				GeneralPort generalPort = (GeneralPort)theEObject;
				T1 result = caseGeneralPort(generalPort);
				if (result == null) result = caseSingleSourceNode(generalPort);
				if (result == null) result = caseEssenceBase(generalPort);
				if (result == null) result = caseEssenceBaseExtension(generalPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GENERAL_REGISTER: {
				GeneralRegister generalRegister = (GeneralRegister)theEObject;
				T1 result = caseGeneralRegister(generalRegister);
				if (result == null) result = caseSequenceElement(generalRegister);
				if (result == null) result = caseRegMemElement(generalRegister);
				if (result == null) result = caseIndexVarUser(generalRegister);
				if (result == null) result = caseOffsetSequenceElement(generalRegister);
				if (result == null) result = caseSingleSourceNode(generalRegister);
				if (result == null) result = caseSequenceElementBase(generalRegister);
				if (result == null) result = caseOffset(generalRegister);
				if (result == null) result = caseEssenceBase(generalRegister);
				if (result == null) result = caseEssenceBaseExtension(generalRegister);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GENERIC_DECL: {
				GenericDecl genericDecl = (GenericDecl)theEObject;
				T1 result = caseGenericDecl(genericDecl);
				if (result == null) result = caseVarDef(genericDecl);
				if (result == null) result = caseSingleSourceNode(genericDecl);
				if (result == null) result = caseEssenceBase(genericDecl);
				if (result == null) result = caseEssenceBaseExtension(genericDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GENERIC_DECL_BLOCK: {
				GenericDeclBlock genericDeclBlock = (GenericDeclBlock)theEObject;
				T1 result = caseGenericDeclBlock(genericDeclBlock);
				if (result == null) result = caseVarDefBlock(genericDeclBlock);
				if (result == null) result = caseSingleSourceNode(genericDeclBlock);
				if (result == null) result = caseEssenceBase(genericDeclBlock);
				if (result == null) result = caseEssenceBaseExtension(genericDeclBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GENERIC_MAP: {
				GenericMap genericMap = (GenericMap)theEObject;
				T1 result = caseGenericMap(genericMap);
				if (result == null) result = caseSingleSourceNode(genericMap);
				if (result == null) result = caseEssenceBase(genericMap);
				if (result == null) result = caseEssenceBaseExtension(genericMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INDEX_VAR_USER: {
				IndexVarUser indexVarUser = (IndexVarUser)theEObject;
				T1 result = caseIndexVarUser(indexVarUser);
				if (result == null) result = caseSingleSourceNode(indexVarUser);
				if (result == null) result = caseEssenceBase(indexVarUser);
				if (result == null) result = caseEssenceBaseExtension(indexVarUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INSTANCE: {
				Instance instance = (Instance)theEObject;
				T1 result = caseInstance(instance);
				if (result == null) result = caseGeneralInstance(instance);
				if (result == null) result = caseSingleSourceNode(instance);
				if (result == null) result = caseEssenceBase(instance);
				if (result == null) result = caseEssenceBaseExtension(instance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INSTANCE_INTERFACE_MAP: {
				InstanceInterfaceMap instanceInterfaceMap = (InstanceInterfaceMap)theEObject;
				T1 result = caseInstanceInterfaceMap(instanceInterfaceMap);
				if (result == null) result = caseSingleSourceNode(instanceInterfaceMap);
				if (result == null) result = caseEssenceBase(instanceInterfaceMap);
				if (result == null) result = caseEssenceBaseExtension(instanceInterfaceMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INSTANCE_PORT_MAP: {
				InstancePortMap instancePortMap = (InstancePortMap)theEObject;
				T1 result = caseInstancePortMap(instancePortMap);
				if (result == null) result = caseSingleSourceNode(instancePortMap);
				if (result == null) result = caseEssenceBase(instancePortMap);
				if (result == null) result = caseEssenceBaseExtension(instancePortMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INSTANCE_SHELL_INTERFACE_MAP: {
				InstanceShellInterfaceMap instanceShellInterfaceMap = (InstanceShellInterfaceMap)theEObject;
				T1 result = caseInstanceShellInterfaceMap(instanceShellInterfaceMap);
				if (result == null) result = caseSingleSourceNode(instanceShellInterfaceMap);
				if (result == null) result = caseEssenceBase(instanceShellInterfaceMap);
				if (result == null) result = caseEssenceBaseExtension(instanceShellInterfaceMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INSTANCE_SHELL_PORT_MAP: {
				InstanceShellPortMap instanceShellPortMap = (InstanceShellPortMap)theEObject;
				T1 result = caseInstanceShellPortMap(instanceShellPortMap);
				if (result == null) result = caseSingleSourceNode(instanceShellPortMap);
				if (result == null) result = caseEssenceBase(instanceShellPortMap);
				if (result == null) result = caseEssenceBaseExtension(instanceShellPortMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTEGER_DECL: {
				IntegerDecl integerDecl = (IntegerDecl)theEObject;
				T1 result = caseIntegerDecl(integerDecl);
				if (result == null) result = caseParamDecl(integerDecl);
				if (result == null) result = caseVarDef(integerDecl);
				if (result == null) result = caseSingleSourceNode(integerDecl);
				if (result == null) result = caseEssenceBase(integerDecl);
				if (result == null) result = caseEssenceBaseExtension(integerDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTEGER_DEF: {
				IntegerDef integerDef = (IntegerDef)theEObject;
				T1 result = caseIntegerDef(integerDef);
				if (result == null) result = caseConstDef(integerDef);
				if (result == null) result = caseVarDef(integerDef);
				if (result == null) result = caseSingleSourceNode(integerDef);
				if (result == null) result = caseEssenceBase(integerDef);
				if (result == null) result = caseEssenceBaseExtension(integerDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTEGER_GEN_DECL: {
				IntegerGenDecl integerGenDecl = (IntegerGenDecl)theEObject;
				T1 result = caseIntegerGenDecl(integerGenDecl);
				if (result == null) result = caseGenericDecl(integerGenDecl);
				if (result == null) result = caseVarDef(integerGenDecl);
				if (result == null) result = caseSingleSourceNode(integerGenDecl);
				if (result == null) result = caseEssenceBase(integerGenDecl);
				if (result == null) result = caseEssenceBaseExtension(integerGenDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T1 result = caseInterface(interface_);
				if (result == null) result = caseGeneralInterface(interface_);
				if (result == null) result = caseSingleSourceNode(interface_);
				if (result == null) result = caseEssenceBase(interface_);
				if (result == null) result = caseEssenceBaseExtension(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTERFACE_DEF_CABLE_PORT: {
				InterfaceDefCablePort interfaceDefCablePort = (InterfaceDefCablePort)theEObject;
				T1 result = caseInterfaceDefCablePort(interfaceDefCablePort);
				if (result == null) result = caseInterfaceDefPort(interfaceDefCablePort);
				if (result == null) result = caseGeneralPort(interfaceDefCablePort);
				if (result == null) result = caseSingleSourceNode(interfaceDefCablePort);
				if (result == null) result = caseEssenceBase(interfaceDefCablePort);
				if (result == null) result = caseEssenceBaseExtension(interfaceDefCablePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTERFACE_DEFINITION: {
				InterfaceDefinition interfaceDefinition = (InterfaceDefinition)theEObject;
				T1 result = caseInterfaceDefinition(interfaceDefinition);
				if (result == null) result = caseModelRoot(interfaceDefinition);
				if (result == null) result = caseSingleSourceNode(interfaceDefinition);
				if (result == null) result = caseEssenceBase(interfaceDefinition);
				if (result == null) result = caseEssenceBaseExtension(interfaceDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTERFACE_DEF_PORT: {
				InterfaceDefPort interfaceDefPort = (InterfaceDefPort)theEObject;
				T1 result = caseInterfaceDefPort(interfaceDefPort);
				if (result == null) result = caseGeneralPort(interfaceDefPort);
				if (result == null) result = caseSingleSourceNode(interfaceDefPort);
				if (result == null) result = caseEssenceBase(interfaceDefPort);
				if (result == null) result = caseEssenceBaseExtension(interfaceDefPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTERFACE_DEF_ROLE: {
				InterfaceDefRole interfaceDefRole = (InterfaceDefRole)theEObject;
				T1 result = caseInterfaceDefRole(interfaceDefRole);
				if (result == null) result = caseSingleSourceNode(interfaceDefRole);
				if (result == null) result = caseEssenceBase(interfaceDefRole);
				if (result == null) result = caseEssenceBaseExtension(interfaceDefRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTERFACE_DEF_TRANSACTIONAL_PORT: {
				InterfaceDefTransactionalPort interfaceDefTransactionalPort = (InterfaceDefTransactionalPort)theEObject;
				T1 result = caseInterfaceDefTransactionalPort(interfaceDefTransactionalPort);
				if (result == null) result = caseInterfaceDefPort(interfaceDefTransactionalPort);
				if (result == null) result = caseGeneralPort(interfaceDefTransactionalPort);
				if (result == null) result = caseSingleSourceNode(interfaceDefTransactionalPort);
				if (result == null) result = caseEssenceBase(interfaceDefTransactionalPort);
				if (result == null) result = caseEssenceBaseExtension(interfaceDefTransactionalPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTERFACE_DEF_VIEW: {
				InterfaceDefView interfaceDefView = (InterfaceDefView)theEObject;
				T1 result = caseInterfaceDefView(interfaceDefView);
				if (result == null) result = caseSignalOwner(interfaceDefView);
				if (result == null) result = caseSingleSourceNode(interfaceDefView);
				if (result == null) result = caseEssenceBase(interfaceDefView);
				if (result == null) result = caseEssenceBaseExtension(interfaceDefView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTERFACE_DEF_WIRE_PORT: {
				InterfaceDefWirePort interfaceDefWirePort = (InterfaceDefWirePort)theEObject;
				T1 result = caseInterfaceDefWirePort(interfaceDefWirePort);
				if (result == null) result = caseInterfaceDefPort(interfaceDefWirePort);
				if (result == null) result = caseGeneralPort(interfaceDefWirePort);
				if (result == null) result = caseSingleSourceNode(interfaceDefWirePort);
				if (result == null) result = caseEssenceBase(interfaceDefWirePort);
				if (result == null) result = caseEssenceBaseExtension(interfaceDefWirePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTERFACE_INSTANCE: {
				InterfaceInstance interfaceInstance = (InterfaceInstance)theEObject;
				T1 result = caseInterfaceInstance(interfaceInstance);
				if (result == null) result = caseInstance(interfaceInstance);
				if (result == null) result = caseGeneralInstance(interfaceInstance);
				if (result == null) result = caseSingleSourceNode(interfaceInstance);
				if (result == null) result = caseEssenceBase(interfaceInstance);
				if (result == null) result = caseEssenceBaseExtension(interfaceInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTERFACE_PORT_MAP: {
				InterfacePortMap interfacePortMap = (InterfacePortMap)theEObject;
				T1 result = caseInterfacePortMap(interfacePortMap);
				if (result == null) result = caseEssenceBase(interfacePortMap);
				if (result == null) result = caseEssenceBaseExtension(interfacePortMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.INTERFACE_VIEW: {
				InterfaceView interfaceView = (InterfaceView)theEObject;
				T1 result = caseInterfaceView(interfaceView);
				if (result == null) result = caseSingleSourceNode(interfaceView);
				if (result == null) result = caseEssenceBase(interfaceView);
				if (result == null) result = caseEssenceBaseExtension(interfaceView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LOCAL_INTERFACE_MAP: {
				LocalInterfaceMap localInterfaceMap = (LocalInterfaceMap)theEObject;
				T1 result = caseLocalInterfaceMap(localInterfaceMap);
				if (result == null) result = caseSingleSourceNode(localInterfaceMap);
				if (result == null) result = caseEssenceBase(localInterfaceMap);
				if (result == null) result = caseEssenceBaseExtension(localInterfaceMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.LOCAL_PORT_MAP: {
				LocalPortMap localPortMap = (LocalPortMap)theEObject;
				T1 result = caseLocalPortMap(localPortMap);
				if (result == null) result = caseSingleSourceNode(localPortMap);
				if (result == null) result = caseEssenceBase(localPortMap);
				if (result == null) result = caseEssenceBaseExtension(localPortMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MEMORY: {
				Memory memory = (Memory)theEObject;
				T1 result = caseMemory(memory);
				if (result == null) result = caseSequenceElement(memory);
				if (result == null) result = caseRegMemElement(memory);
				if (result == null) result = caseIndexVarUser(memory);
				if (result == null) result = caseOffsetSequenceElement(memory);
				if (result == null) result = caseSingleSourceNode(memory);
				if (result == null) result = caseSequenceElementBase(memory);
				if (result == null) result = caseOffset(memory);
				if (result == null) result = caseEssenceBase(memory);
				if (result == null) result = caseEssenceBaseExtension(memory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.METHOD_DATA_TYPE: {
				MethodDataType methodDataType = (MethodDataType)theEObject;
				T1 result = caseMethodDataType(methodDataType);
				if (result == null) result = caseDataType(methodDataType);
				if (result == null) result = caseEssenceBase(methodDataType);
				if (result == null) result = caseEssenceBaseExtension(methodDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.METHOD_DATA_TYPE_ELEMENT: {
				MethodDataTypeElement methodDataTypeElement = (MethodDataTypeElement)theEObject;
				T1 result = caseMethodDataTypeElement(methodDataTypeElement);
				if (result == null) result = caseEssenceBase(methodDataTypeElement);
				if (result == null) result = caseEssenceBaseExtension(methodDataTypeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MODEL_ROOT: {
				ModelRoot modelRoot = (ModelRoot)theEObject;
				T1 result = caseModelRoot(modelRoot);
				if (result == null) result = caseSingleSourceNode(modelRoot);
				if (result == null) result = caseEssenceBase(modelRoot);
				if (result == null) result = caseEssenceBaseExtension(modelRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MODULE: {
				Module module = (Module)theEObject;
				T1 result = caseModule(module);
				if (result == null) result = caseSingleSourceNode(module);
				if (result == null) result = caseEssenceBase(module);
				if (result == null) result = caseEssenceBaseExtension(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MULTI_PAD: {
				MultiPad multiPad = (MultiPad)theEObject;
				T1 result = caseMultiPad(multiPad);
				if (result == null) result = casePad(multiPad);
				if (result == null) result = caseSingleSourceNode(multiPad);
				if (result == null) result = caseEssenceBase(multiPad);
				if (result == null) result = caseEssenceBaseExtension(multiPad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MULTI_VIEW_REGISTER: {
				MultiViewRegister multiViewRegister = (MultiViewRegister)theEObject;
				T1 result = caseMultiViewRegister(multiViewRegister);
				if (result == null) result = caseGeneralRegister(multiViewRegister);
				if (result == null) result = caseSequenceElement(multiViewRegister);
				if (result == null) result = caseRegMemElement(multiViewRegister);
				if (result == null) result = caseIndexVarUser(multiViewRegister);
				if (result == null) result = caseOffsetSequenceElement(multiViewRegister);
				if (result == null) result = caseSingleSourceNode(multiViewRegister);
				if (result == null) result = caseSequenceElementBase(multiViewRegister);
				if (result == null) result = caseOffset(multiViewRegister);
				if (result == null) result = caseEssenceBase(multiViewRegister);
				if (result == null) result = caseEssenceBaseExtension(multiViewRegister);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.NET: {
				Net net = (Net)theEObject;
				T1 result = caseNet(net);
				if (result == null) result = caseSingleSourceNode(net);
				if (result == null) result = caseEssenceBase(net);
				if (result == null) result = caseEssenceBaseExtension(net);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.NONE_INTERFACE: {
				NoneInterface noneInterface = (NoneInterface)theEObject;
				T1 result = caseNoneInterface(noneInterface);
				if (result == null) result = caseGeneralInterface(noneInterface);
				if (result == null) result = caseSingleSourceNode(noneInterface);
				if (result == null) result = caseEssenceBase(noneInterface);
				if (result == null) result = caseEssenceBaseExtension(noneInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PACKAGE: {
				model.Package package_ = (model.Package)theEObject;
				T1 result = casePackage(package_);
				if (result == null) result = caseModelRoot(package_);
				if (result == null) result = caseSingleSourceNode(package_);
				if (result == null) result = caseEssenceBase(package_);
				if (result == null) result = caseEssenceBaseExtension(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PACKAGE_INSTANCE: {
				PackageInstance packageInstance = (PackageInstance)theEObject;
				T1 result = casePackageInstance(packageInstance);
				if (result == null) result = caseGeneralInstance(packageInstance);
				if (result == null) result = caseSingleSourceNode(packageInstance);
				if (result == null) result = caseEssenceBase(packageInstance);
				if (result == null) result = caseEssenceBaseExtension(packageInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PAD: {
				Pad pad = (Pad)theEObject;
				T1 result = casePad(pad);
				if (result == null) result = caseSingleSourceNode(pad);
				if (result == null) result = caseEssenceBase(pad);
				if (result == null) result = caseEssenceBaseExtension(pad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PAD_MULTIPLEXED: {
				PadMultiplexed padMultiplexed = (PadMultiplexed)theEObject;
				T1 result = casePadMultiplexed(padMultiplexed);
				if (result == null) result = caseSinglePad(padMultiplexed);
				if (result == null) result = casePad(padMultiplexed);
				if (result == null) result = caseSingleSourceNode(padMultiplexed);
				if (result == null) result = caseEssenceBase(padMultiplexed);
				if (result == null) result = caseEssenceBaseExtension(padMultiplexed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PAD_NET_MAP: {
				PadNetMap padNetMap = (PadNetMap)theEObject;
				T1 result = casePadNetMap(padNetMap);
				if (result == null) result = caseSingleSourceNode(padNetMap);
				if (result == null) result = caseEssenceBase(padNetMap);
				if (result == null) result = caseEssenceBaseExtension(padNetMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PAD_NON_MULTIPLEXED: {
				PadNonMultiplexed padNonMultiplexed = (PadNonMultiplexed)theEObject;
				T1 result = casePadNonMultiplexed(padNonMultiplexed);
				if (result == null) result = caseSinglePad(padNonMultiplexed);
				if (result == null) result = casePad(padNonMultiplexed);
				if (result == null) result = caseSingleSourceNode(padNonMultiplexed);
				if (result == null) result = caseEssenceBase(padNonMultiplexed);
				if (result == null) result = caseEssenceBaseExtension(padNonMultiplexed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PAD_SPECIAL: {
				PadSpecial padSpecial = (PadSpecial)theEObject;
				T1 result = casePadSpecial(padSpecial);
				if (result == null) result = caseGeneralPad(padSpecial);
				if (result == null) result = caseSinglePad(padSpecial);
				if (result == null) result = casePad(padSpecial);
				if (result == null) result = caseSingleSourceNode(padSpecial);
				if (result == null) result = caseEssenceBase(padSpecial);
				if (result == null) result = caseEssenceBaseExtension(padSpecial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PAD_SUPPLY: {
				PadSupply padSupply = (PadSupply)theEObject;
				T1 result = casePadSupply(padSupply);
				if (result == null) result = caseGeneralPad(padSupply);
				if (result == null) result = caseSinglePad(padSupply);
				if (result == null) result = casePad(padSupply);
				if (result == null) result = caseSingleSourceNode(padSupply);
				if (result == null) result = caseEssenceBase(padSupply);
				if (result == null) result = caseEssenceBaseExtension(padSupply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PAD_TYPE: {
				PadType padType = (PadType)theEObject;
				T1 result = casePadType(padType);
				if (result == null) result = caseSingleSourceNode(padType);
				if (result == null) result = caseEssenceBase(padType);
				if (result == null) result = caseEssenceBaseExtension(padType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PAD_TYPE_DB: {
				PadTypeDB padTypeDB = (PadTypeDB)theEObject;
				T1 result = casePadTypeDB(padTypeDB);
				if (result == null) result = caseModelRoot(padTypeDB);
				if (result == null) result = caseSingleSourceNode(padTypeDB);
				if (result == null) result = caseEssenceBase(padTypeDB);
				if (result == null) result = caseEssenceBaseExtension(padTypeDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PARAM_DECL: {
				ParamDecl paramDecl = (ParamDecl)theEObject;
				T1 result = caseParamDecl(paramDecl);
				if (result == null) result = caseVarDef(paramDecl);
				if (result == null) result = caseSingleSourceNode(paramDecl);
				if (result == null) result = caseEssenceBase(paramDecl);
				if (result == null) result = caseEssenceBaseExtension(paramDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PARAM_DECL_BLOCK: {
				ParamDeclBlock paramDeclBlock = (ParamDeclBlock)theEObject;
				T1 result = caseParamDeclBlock(paramDeclBlock);
				if (result == null) result = caseVarDefBlock(paramDeclBlock);
				if (result == null) result = caseSingleSourceNode(paramDeclBlock);
				if (result == null) result = caseEssenceBase(paramDeclBlock);
				if (result == null) result = caseEssenceBaseExtension(paramDeclBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PARAM_MAP: {
				ParamMap paramMap = (ParamMap)theEObject;
				T1 result = caseParamMap(paramMap);
				if (result == null) result = caseSingleSourceNode(paramMap);
				if (result == null) result = caseEssenceBase(paramMap);
				if (result == null) result = caseEssenceBaseExtension(paramMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PATH_REF: {
				PathRef pathRef = (PathRef)theEObject;
				T1 result = casePathRef(pathRef);
				if (result == null) result = caseReference(pathRef);
				if (result == null) result = caseEssenceBase(pathRef);
				if (result == null) result = caseEssenceBaseExtension(pathRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PIN: {
				Pin pin = (Pin)theEObject;
				T1 result = casePin(pin);
				if (result == null) result = caseSingleSourceNode(pin);
				if (result == null) result = caseEssenceBase(pin);
				if (result == null) result = caseEssenceBaseExtension(pin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PIN_NET_MAP: {
				PinNetMap pinNetMap = (PinNetMap)theEObject;
				T1 result = casePinNetMap(pinNetMap);
				if (result == null) result = caseSingleSourceNode(pinNetMap);
				if (result == null) result = caseEssenceBase(pinNetMap);
				if (result == null) result = caseEssenceBaseExtension(pinNetMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PORT: {
				Port port = (Port)theEObject;
				T1 result = casePort(port);
				if (result == null) result = caseGeneralPort(port);
				if (result == null) result = caseSingleSourceNode(port);
				if (result == null) result = caseEssenceBase(port);
				if (result == null) result = caseEssenceBaseExtension(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PORT_REF: {
				PortRef portRef = (PortRef)theEObject;
				T1 result = casePortRef(portRef);
				if (result == null) result = casePort(portRef);
				if (result == null) result = caseGeneralPort(portRef);
				if (result == null) result = caseSingleSourceNode(portRef);
				if (result == null) result = caseEssenceBase(portRef);
				if (result == null) result = caseEssenceBaseExtension(portRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.POWER_DOMAIN: {
				PowerDomain powerDomain = (PowerDomain)theEObject;
				T1 result = casePowerDomain(powerDomain);
				if (result == null) result = caseSingleSourceNode(powerDomain);
				if (result == null) result = caseEssenceBase(powerDomain);
				if (result == null) result = caseEssenceBaseExtension(powerDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PRODUCT: {
				Product product = (Product)theEObject;
				T1 result = caseProduct(product);
				if (result == null) result = caseModelRoot(product);
				if (result == null) result = caseSingleSourceNode(product);
				if (result == null) result = caseEssenceBase(product);
				if (result == null) result = caseEssenceBaseExtension(product);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PRODUCT_INSTANCE: {
				ProductInstance productInstance = (ProductInstance)theEObject;
				T1 result = caseProductInstance(productInstance);
				if (result == null) result = caseInstance(productInstance);
				if (result == null) result = caseGeneralInstance(productInstance);
				if (result == null) result = caseSingleSourceNode(productInstance);
				if (result == null) result = caseEssenceBase(productInstance);
				if (result == null) result = caseEssenceBaseExtension(productInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PRODUCT_INTERFACE_MAP: {
				ProductInterfaceMap productInterfaceMap = (ProductInterfaceMap)theEObject;
				T1 result = caseProductInterfaceMap(productInterfaceMap);
				if (result == null) result = caseSingleSourceNode(productInterfaceMap);
				if (result == null) result = caseEssenceBase(productInterfaceMap);
				if (result == null) result = caseEssenceBaseExtension(productInterfaceMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PRODUCT_PAD_MAP: {
				ProductPadMap productPadMap = (ProductPadMap)theEObject;
				T1 result = caseProductPadMap(productPadMap);
				if (result == null) result = caseSingleSourceNode(productPadMap);
				if (result == null) result = caseEssenceBase(productPadMap);
				if (result == null) result = caseEssenceBaseExtension(productPadMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PRODUCT_PIN_MAP: {
				ProductPinMap productPinMap = (ProductPinMap)theEObject;
				T1 result = caseProductPinMap(productPinMap);
				if (result == null) result = caseSingleSourceNode(productPinMap);
				if (result == null) result = caseEssenceBase(productPinMap);
				if (result == null) result = caseEssenceBaseExtension(productPinMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T1 result = caseProperty(property);
				if (result == null) result = caseEssenceBase(property);
				if (result == null) result = caseEssenceBaseExtension(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.REAL_PORT: {
				RealPort realPort = (RealPort)theEObject;
				T1 result = caseRealPort(realPort);
				if (result == null) result = casePort(realPort);
				if (result == null) result = caseDataTypeOwner(realPort);
				if (result == null) result = caseGeneralPort(realPort);
				if (result == null) result = caseSingleSourceNode(realPort);
				if (result == null) result = caseEssenceBase(realPort);
				if (result == null) result = caseEssenceBaseExtension(realPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RECORD: {
				Record record = (Record)theEObject;
				T1 result = caseRecord(record);
				if (result == null) result = caseComplexDataType(record);
				if (result == null) result = caseValueDataType(record);
				if (result == null) result = caseReturnDataType(record);
				if (result == null) result = caseDataType(record);
				if (result == null) result = caseEssenceBase(record);
				if (result == null) result = caseEssenceBaseExtension(record);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T1 result = caseReference(reference);
				if (result == null) result = caseEssenceBase(reference);
				if (result == null) result = caseEssenceBaseExtension(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.REGISTER: {
				Register register = (Register)theEObject;
				T1 result = caseRegister(register);
				if (result == null) result = caseGeneralRegister(register);
				if (result == null) result = caseCommonAccessLevel(register);
				if (result == null) result = caseSequenceElement(register);
				if (result == null) result = caseRegMemElement(register);
				if (result == null) result = caseIndexVarUser(register);
				if (result == null) result = caseOffsetSequenceElement(register);
				if (result == null) result = caseSingleSourceNode(register);
				if (result == null) result = caseSequenceElementBase(register);
				if (result == null) result = caseOffset(register);
				if (result == null) result = caseEssenceBase(register);
				if (result == null) result = caseEssenceBaseExtension(register);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.REGISTER_VIEW: {
				RegisterView registerView = (RegisterView)theEObject;
				T1 result = caseRegisterView(registerView);
				if (result == null) result = caseIndexVarUser(registerView);
				if (result == null) result = caseCommonAccessLevel(registerView);
				if (result == null) result = caseSingleSourceNode(registerView);
				if (result == null) result = caseEssenceBase(registerView);
				if (result == null) result = caseEssenceBaseExtension(registerView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.REG_MEM_ELEMENT: {
				RegMemElement regMemElement = (RegMemElement)theEObject;
				T1 result = caseRegMemElement(regMemElement);
				if (result == null) result = caseIndexVarUser(regMemElement);
				if (result == null) result = caseOffsetSequenceElement(regMemElement);
				if (result == null) result = caseSingleSourceNode(regMemElement);
				if (result == null) result = caseSequenceElementBase(regMemElement);
				if (result == null) result = caseOffset(regMemElement);
				if (result == null) result = caseEssenceBase(regMemElement);
				if (result == null) result = caseEssenceBaseExtension(regMemElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.REG_MEM_SEQUENCE: {
				RegMemSequence regMemSequence = (RegMemSequence)theEObject;
				T1 result = caseRegMemSequence(regMemSequence);
				if (result == null) result = caseRegMemElement(regMemSequence);
				if (result == null) result = caseOffsetSequence(regMemSequence);
				if (result == null) result = caseIndexVarUser(regMemSequence);
				if (result == null) result = caseOffsetSequenceElement(regMemSequence);
				if (result == null) result = caseSequenceBase(regMemSequence);
				if (result == null) result = caseSingleSourceNode(regMemSequence);
				if (result == null) result = caseSequenceElementBase(regMemSequence);
				if (result == null) result = caseOffset(regMemSequence);
				if (result == null) result = caseEssenceBase(regMemSequence);
				if (result == null) result = caseEssenceBaseExtension(regMemSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.REG_MEM_SET: {
				RegMemSet regMemSet = (RegMemSet)theEObject;
				T1 result = caseRegMemSet(regMemSet);
				if (result == null) result = caseSingleSourceNode(regMemSet);
				if (result == null) result = caseEssenceBase(regMemSet);
				if (result == null) result = caseEssenceBaseExtension(regMemSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.REG_VIEW_BLOCK: {
				RegViewBlock regViewBlock = (RegViewBlock)theEObject;
				T1 result = caseRegViewBlock(regViewBlock);
				if (result == null) result = caseSingleSourceNode(regViewBlock);
				if (result == null) result = caseEssenceBase(regViewBlock);
				if (result == null) result = caseEssenceBaseExtension(regViewBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RESET_TYPE: {
				ResetType resetType = (ResetType)theEObject;
				T1 result = caseResetType(resetType);
				if (result == null) result = caseIndexVarUser(resetType);
				if (result == null) result = caseSingleSourceNode(resetType);
				if (result == null) result = caseEssenceBase(resetType);
				if (result == null) result = caseEssenceBaseExtension(resetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RETURN_DATA_TYPE: {
				ReturnDataType returnDataType = (ReturnDataType)theEObject;
				T1 result = caseReturnDataType(returnDataType);
				if (result == null) result = caseDataType(returnDataType);
				if (result == null) result = caseEssenceBase(returnDataType);
				if (result == null) result = caseEssenceBaseExtension(returnDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RETURN_ELEMENT_ACCESS: {
				ReturnElementAccess returnElementAccess = (ReturnElementAccess)theEObject;
				T1 result = caseReturnElementAccess(returnElementAccess);
				if (result == null) result = caseSubElementAccess(returnElementAccess);
				if (result == null) result = caseEssenceBase(returnElementAccess);
				if (result == null) result = caseEssenceBaseExtension(returnElementAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SEQUENCE_ELEMENT: {
				SequenceElement sequenceElement = (SequenceElement)theEObject;
				T1 result = caseSequenceElement(sequenceElement);
				if (result == null) result = caseRegMemElement(sequenceElement);
				if (result == null) result = caseIndexVarUser(sequenceElement);
				if (result == null) result = caseOffsetSequenceElement(sequenceElement);
				if (result == null) result = caseSingleSourceNode(sequenceElement);
				if (result == null) result = caseSequenceElementBase(sequenceElement);
				if (result == null) result = caseOffset(sequenceElement);
				if (result == null) result = caseEssenceBase(sequenceElement);
				if (result == null) result = caseEssenceBaseExtension(sequenceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SHELL_INTERFACE_MAP: {
				ShellInterfaceMap shellInterfaceMap = (ShellInterfaceMap)theEObject;
				T1 result = caseShellInterfaceMap(shellInterfaceMap);
				if (result == null) result = caseSingleSourceNode(shellInterfaceMap);
				if (result == null) result = caseEssenceBase(shellInterfaceMap);
				if (result == null) result = caseEssenceBaseExtension(shellInterfaceMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SHELL_PORT_MAP: {
				ShellPortMap shellPortMap = (ShellPortMap)theEObject;
				T1 result = caseShellPortMap(shellPortMap);
				if (result == null) result = caseSingleSourceNode(shellPortMap);
				if (result == null) result = caseEssenceBase(shellPortMap);
				if (result == null) result = caseEssenceBaseExtension(shellPortMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SI_COMPONENT_INSTANCE: {
				SiComponentInstance siComponentInstance = (SiComponentInstance)theEObject;
				T1 result = caseSiComponentInstance(siComponentInstance);
				if (result == null) result = caseSiInstance(siComponentInstance);
				if (result == null) result = caseGeneralInstance(siComponentInstance);
				if (result == null) result = caseSingleSourceNode(siComponentInstance);
				if (result == null) result = caseEssenceBase(siComponentInstance);
				if (result == null) result = caseEssenceBaseExtension(siComponentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SIGNAL: {
				Signal signal = (Signal)theEObject;
				T1 result = caseSignal(signal);
				if (result == null) result = caseSingleSourceNode(signal);
				if (result == null) result = caseDataTypeOwner(signal);
				if (result == null) result = caseEssenceBase(signal);
				if (result == null) result = caseEssenceBaseExtension(signal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SIGNAL_MAP: {
				SignalMap signalMap = (SignalMap)theEObject;
				T1 result = caseSignalMap(signalMap);
				if (result == null) result = caseEssenceBase(signalMap);
				if (result == null) result = caseEssenceBaseExtension(signalMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SIGNAL_OWNER: {
				SignalOwner signalOwner = (SignalOwner)theEObject;
				T1 result = caseSignalOwner(signalOwner);
				if (result == null) result = caseSingleSourceNode(signalOwner);
				if (result == null) result = caseEssenceBase(signalOwner);
				if (result == null) result = caseEssenceBaseExtension(signalOwner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SI_INSTANCE: {
				SiInstance siInstance = (SiInstance)theEObject;
				T1 result = caseSiInstance(siInstance);
				if (result == null) result = caseGeneralInstance(siInstance);
				if (result == null) result = caseSingleSourceNode(siInstance);
				if (result == null) result = caseEssenceBase(siInstance);
				if (result == null) result = caseEssenceBaseExtension(siInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SI_INSTANCE_INTERFACE_MAP: {
				SiInstanceInterfaceMap siInstanceInterfaceMap = (SiInstanceInterfaceMap)theEObject;
				T1 result = caseSiInstanceInterfaceMap(siInstanceInterfaceMap);
				if (result == null) result = caseSingleSourceNode(siInstanceInterfaceMap);
				if (result == null) result = caseEssenceBase(siInstanceInterfaceMap);
				if (result == null) result = caseEssenceBaseExtension(siInstanceInterfaceMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SI_INSTANCE_PORT_MAP: {
				SiInstancePortMap siInstancePortMap = (SiInstancePortMap)theEObject;
				T1 result = caseSiInstancePortMap(siInstancePortMap);
				if (result == null) result = caseSingleSourceNode(siInstancePortMap);
				if (result == null) result = caseEssenceBase(siInstancePortMap);
				if (result == null) result = caseEssenceBaseExtension(siInstancePortMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SI_INSTANCE_SHELL_INTERFACE_MAP: {
				SiInstanceShellInterfaceMap siInstanceShellInterfaceMap = (SiInstanceShellInterfaceMap)theEObject;
				T1 result = caseSiInstanceShellInterfaceMap(siInstanceShellInterfaceMap);
				if (result == null) result = caseSingleSourceNode(siInstanceShellInterfaceMap);
				if (result == null) result = caseEssenceBase(siInstanceShellInterfaceMap);
				if (result == null) result = caseEssenceBaseExtension(siInstanceShellInterfaceMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SI_INSTANCE_SHELL_PORT_MAP: {
				SiInstanceShellPortMap siInstanceShellPortMap = (SiInstanceShellPortMap)theEObject;
				T1 result = caseSiInstanceShellPortMap(siInstanceShellPortMap);
				if (result == null) result = caseSingleSourceNode(siInstanceShellPortMap);
				if (result == null) result = caseEssenceBase(siInstanceShellPortMap);
				if (result == null) result = caseEssenceBaseExtension(siInstanceShellPortMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SILICON: {
				Silicon silicon = (Silicon)theEObject;
				T1 result = caseSilicon(silicon);
				if (result == null) result = caseModelRoot(silicon);
				if (result == null) result = caseSingleSourceNode(silicon);
				if (result == null) result = caseEssenceBase(silicon);
				if (result == null) result = caseEssenceBaseExtension(silicon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SILICON_INSTANCE: {
				SiliconInstance siliconInstance = (SiliconInstance)theEObject;
				T1 result = caseSiliconInstance(siliconInstance);
				if (result == null) result = caseGeneralInstance(siliconInstance);
				if (result == null) result = caseSingleSourceNode(siliconInstance);
				if (result == null) result = caseEssenceBase(siliconInstance);
				if (result == null) result = caseEssenceBaseExtension(siliconInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SIMPLE_DATA_TYPE: {
				SimpleDataType simpleDataType = (SimpleDataType)theEObject;
				T1 result = caseSimpleDataType(simpleDataType);
				if (result == null) result = caseValueDataType(simpleDataType);
				if (result == null) result = caseReturnDataType(simpleDataType);
				if (result == null) result = caseDataType(simpleDataType);
				if (result == null) result = caseEssenceBase(simpleDataType);
				if (result == null) result = caseEssenceBaseExtension(simpleDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SIMPLE_SUB_ELEMENT_ACCESS: {
				SimpleSubElementAccess simpleSubElementAccess = (SimpleSubElementAccess)theEObject;
				T1 result = caseSimpleSubElementAccess(simpleSubElementAccess);
				if (result == null) result = caseSubElementAccess(simpleSubElementAccess);
				if (result == null) result = caseEssenceBase(simpleSubElementAccess);
				if (result == null) result = caseEssenceBaseExtension(simpleSubElementAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SINGLE_PAD: {
				SinglePad singlePad = (SinglePad)theEObject;
				T1 result = caseSinglePad(singlePad);
				if (result == null) result = casePad(singlePad);
				if (result == null) result = caseSingleSourceNode(singlePad);
				if (result == null) result = caseEssenceBase(singlePad);
				if (result == null) result = caseEssenceBaseExtension(singlePad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SINGLE_SOURCE_NODE: {
				SingleSourceNode singleSourceNode = (SingleSourceNode)theEObject;
				T1 result = caseSingleSourceNode(singleSourceNode);
				if (result == null) result = caseEssenceBase(singleSourceNode);
				if (result == null) result = caseEssenceBaseExtension(singleSourceNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SI_PORT: {
				SiPort siPort = (SiPort)theEObject;
				T1 result = caseSiPort(siPort);
				if (result == null) result = caseSingleSourceNode(siPort);
				if (result == null) result = caseEssenceBase(siPort);
				if (result == null) result = caseEssenceBaseExtension(siPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SI_PORT_DB: {
				SiPortDB siPortDB = (SiPortDB)theEObject;
				T1 result = caseSiPortDB(siPortDB);
				if (result == null) result = caseModelRoot(siPortDB);
				if (result == null) result = caseSingleSourceNode(siPortDB);
				if (result == null) result = caseEssenceBase(siPortDB);
				if (result == null) result = caseEssenceBaseExtension(siPortDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SI_PORT_REQ: {
				SiPortReq siPortReq = (SiPortReq)theEObject;
				T1 result = caseSiPortReq(siPortReq);
				if (result == null) result = caseEssenceBase(siPortReq);
				if (result == null) result = caseEssenceBaseExtension(siPortReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SI_SIGNAL: {
				SiSignal siSignal = (SiSignal)theEObject;
				T1 result = caseSiSignal(siSignal);
				if (result == null) result = caseSingleSourceNode(siSignal);
				if (result == null) result = caseEssenceBase(siSignal);
				if (result == null) result = caseEssenceBaseExtension(siSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SI_SIGNAL_DB: {
				SiSignalDB siSignalDB = (SiSignalDB)theEObject;
				T1 result = caseSiSignalDB(siSignalDB);
				if (result == null) result = caseModelRoot(siSignalDB);
				if (result == null) result = caseSingleSourceNode(siSignalDB);
				if (result == null) result = caseEssenceBase(siSignalDB);
				if (result == null) result = caseEssenceBaseExtension(siSignalDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SI_SYSTEM_INSTANCE: {
				SiSystemInstance siSystemInstance = (SiSystemInstance)theEObject;
				T1 result = caseSiSystemInstance(siSystemInstance);
				if (result == null) result = caseSiInstance(siSystemInstance);
				if (result == null) result = caseGeneralInstance(siSystemInstance);
				if (result == null) result = caseSingleSourceNode(siSystemInstance);
				if (result == null) result = caseEssenceBase(siSystemInstance);
				if (result == null) result = caseEssenceBaseExtension(siSystemInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.STRING_DECL: {
				StringDecl stringDecl = (StringDecl)theEObject;
				T1 result = caseStringDecl(stringDecl);
				if (result == null) result = caseParamDecl(stringDecl);
				if (result == null) result = caseVarDef(stringDecl);
				if (result == null) result = caseSingleSourceNode(stringDecl);
				if (result == null) result = caseEssenceBase(stringDecl);
				if (result == null) result = caseEssenceBaseExtension(stringDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.STRING_DEF: {
				StringDef stringDef = (StringDef)theEObject;
				T1 result = caseStringDef(stringDef);
				if (result == null) result = caseConstDef(stringDef);
				if (result == null) result = caseVarDef(stringDef);
				if (result == null) result = caseSingleSourceNode(stringDef);
				if (result == null) result = caseEssenceBase(stringDef);
				if (result == null) result = caseEssenceBaseExtension(stringDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.STRING_GEN_DECL: {
				StringGenDecl stringGenDecl = (StringGenDecl)theEObject;
				T1 result = caseStringGenDecl(stringGenDecl);
				if (result == null) result = caseGenericDecl(stringGenDecl);
				if (result == null) result = caseVarDef(stringGenDecl);
				if (result == null) result = caseSingleSourceNode(stringGenDecl);
				if (result == null) result = caseEssenceBase(stringGenDecl);
				if (result == null) result = caseEssenceBaseExtension(stringGenDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SUB_ELEMENT_ACCESS: {
				SubElementAccess subElementAccess = (SubElementAccess)theEObject;
				T1 result = caseSubElementAccess(subElementAccess);
				if (result == null) result = caseEssenceBase(subElementAccess);
				if (result == null) result = caseEssenceBaseExtension(subElementAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SYSTEM: {
				model.System system = (model.System)theEObject;
				T1 result = caseSystem(system);
				if (result == null) result = caseModelRoot(system);
				if (result == null) result = caseSingleSourceNode(system);
				if (result == null) result = caseEssenceBase(system);
				if (result == null) result = caseEssenceBaseExtension(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SYSTEM_INSTANCE: {
				SystemInstance systemInstance = (SystemInstance)theEObject;
				T1 result = caseSystemInstance(systemInstance);
				if (result == null) result = caseInterfaceInstance(systemInstance);
				if (result == null) result = caseInstance(systemInstance);
				if (result == null) result = caseGeneralInstance(systemInstance);
				if (result == null) result = caseSingleSourceNode(systemInstance);
				if (result == null) result = caseEssenceBase(systemInstance);
				if (result == null) result = caseEssenceBaseExtension(systemInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TEST: {
				Test test = (Test)theEObject;
				T1 result = caseTest(test);
				if (result == null) result = caseSingleSourceNode(test);
				if (result == null) result = caseEssenceBase(test);
				if (result == null) result = caseEssenceBaseExtension(test);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TEST_DB: {
				TestDB testDB = (TestDB)theEObject;
				T1 result = caseTestDB(testDB);
				if (result == null) result = caseModelRoot(testDB);
				if (result == null) result = caseSingleSourceNode(testDB);
				if (result == null) result = caseEssenceBase(testDB);
				if (result == null) result = caseEssenceBaseExtension(testDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TEST_REQ: {
				TestReq testReq = (TestReq)theEObject;
				T1 result = caseTestReq(testReq);
				if (result == null) result = caseEssenceBase(testReq);
				if (result == null) result = caseEssenceBaseExtension(testReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TRANSACTIONAL_PORT: {
				TransactionalPort transactionalPort = (TransactionalPort)theEObject;
				T1 result = caseTransactionalPort(transactionalPort);
				if (result == null) result = caseRealPort(transactionalPort);
				if (result == null) result = casePort(transactionalPort);
				if (result == null) result = caseDataTypeOwner(transactionalPort);
				if (result == null) result = caseGeneralPort(transactionalPort);
				if (result == null) result = caseSingleSourceNode(transactionalPort);
				if (result == null) result = caseEssenceBase(transactionalPort);
				if (result == null) result = caseEssenceBaseExtension(transactionalPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TRANSACTIONAL_SIGNAL: {
				TransactionalSignal transactionalSignal = (TransactionalSignal)theEObject;
				T1 result = caseTransactionalSignal(transactionalSignal);
				if (result == null) result = caseSignal(transactionalSignal);
				if (result == null) result = caseSingleSourceNode(transactionalSignal);
				if (result == null) result = caseDataTypeOwner(transactionalSignal);
				if (result == null) result = caseEssenceBase(transactionalSignal);
				if (result == null) result = caseEssenceBaseExtension(transactionalSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.UNION: {
				Union union = (Union)theEObject;
				T1 result = caseUnion(union);
				if (result == null) result = caseComplexDataType(union);
				if (result == null) result = caseValueDataType(union);
				if (result == null) result = caseReturnDataType(union);
				if (result == null) result = caseDataType(union);
				if (result == null) result = caseEssenceBase(union);
				if (result == null) result = caseEssenceBaseExtension(union);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VALUE_DATA_TYPE: {
				ValueDataType valueDataType = (ValueDataType)theEObject;
				T1 result = caseValueDataType(valueDataType);
				if (result == null) result = caseReturnDataType(valueDataType);
				if (result == null) result = caseDataType(valueDataType);
				if (result == null) result = caseEssenceBase(valueDataType);
				if (result == null) result = caseEssenceBaseExtension(valueDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VAR_DEF: {
				VarDef varDef = (VarDef)theEObject;
				T1 result = caseVarDef(varDef);
				if (result == null) result = caseSingleSourceNode(varDef);
				if (result == null) result = caseEssenceBase(varDef);
				if (result == null) result = caseEssenceBaseExtension(varDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VAR_DEF_BLOCK: {
				VarDefBlock varDefBlock = (VarDefBlock)theEObject;
				T1 result = caseVarDefBlock(varDefBlock);
				if (result == null) result = caseSingleSourceNode(varDefBlock);
				if (result == null) result = caseEssenceBase(varDefBlock);
				if (result == null) result = caseEssenceBaseExtension(varDefBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VLNV: {
				VLNV vlnv = (VLNV)theEObject;
				T1 result = caseVLNV(vlnv);
				if (result == null) result = caseEssenceBase(vlnv);
				if (result == null) result = caseEssenceBaseExtension(vlnv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.VOID: {
				model.Void void_ = (model.Void)theEObject;
				T1 result = caseVoid(void_);
				if (result == null) result = caseReturnDataType(void_);
				if (result == null) result = caseDataType(void_);
				if (result == null) result = caseEssenceBase(void_);
				if (result == null) result = caseEssenceBaseExtension(void_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.WIRE_PORT: {
				WirePort wirePort = (WirePort)theEObject;
				T1 result = caseWirePort(wirePort);
				if (result == null) result = caseRealPort(wirePort);
				if (result == null) result = casePort(wirePort);
				if (result == null) result = caseDataTypeOwner(wirePort);
				if (result == null) result = caseGeneralPort(wirePort);
				if (result == null) result = caseSingleSourceNode(wirePort);
				if (result == null) result = caseEssenceBase(wirePort);
				if (result == null) result = caseEssenceBaseExtension(wirePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.WIRE_SIGNAL: {
				WireSignal wireSignal = (WireSignal)theEObject;
				T1 result = caseWireSignal(wireSignal);
				if (result == null) result = caseSignal(wireSignal);
				if (result == null) result = caseSingleSourceNode(wireSignal);
				if (result == null) result = caseDataTypeOwner(wireSignal);
				if (result == null) result = caseEssenceBase(wireSignal);
				if (result == null) result = caseEssenceBaseExtension(wireSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF: {
				XRef xRef = (XRef)theEObject;
				T1 result = caseXRef(xRef);
				if (result == null) result = caseReference(xRef);
				if (result == null) result = caseEssenceBase(xRef);
				if (result == null) result = caseEssenceBaseExtension(xRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_CONNECTION: {
				XRefConnection xRefConnection = (XRefConnection)theEObject;
				T1 result = caseXRefConnection(xRefConnection);
				if (result == null) result = caseXRefInternal(xRefConnection);
				if (result == null) result = caseXRef(xRefConnection);
				if (result == null) result = caseReference(xRefConnection);
				if (result == null) result = caseEssenceBase(xRefConnection);
				if (result == null) result = caseEssenceBaseExtension(xRefConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_DATA_VAR: {
				XRefDataVar xRefDataVar = (XRefDataVar)theEObject;
				T1 result = caseXRefDataVar(xRefDataVar);
				if (result == null) result = caseXRefInternal(xRefDataVar);
				if (result == null) result = caseXRef(xRefDataVar);
				if (result == null) result = caseReference(xRefDataVar);
				if (result == null) result = caseEssenceBase(xRefDataVar);
				if (result == null) result = caseEssenceBaseExtension(xRefDataVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_DIRECT: {
				XRefDirect xRefDirect = (XRefDirect)theEObject;
				T1 result = caseXRefDirect(xRefDirect);
				if (result == null) result = caseXRefExternal(xRefDirect);
				if (result == null) result = caseXRef(xRefDirect);
				if (result == null) result = caseReference(xRefDirect);
				if (result == null) result = caseEssenceBase(xRefDirect);
				if (result == null) result = caseEssenceBaseExtension(xRefDirect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_EXTERNAL: {
				XRefExternal xRefExternal = (XRefExternal)theEObject;
				T1 result = caseXRefExternal(xRefExternal);
				if (result == null) result = caseXRef(xRefExternal);
				if (result == null) result = caseReference(xRefExternal);
				if (result == null) result = caseEssenceBase(xRefExternal);
				if (result == null) result = caseEssenceBaseExtension(xRefExternal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_EXTERNAL_INTERFACE: {
				XRefExternalInterface xRefExternalInterface = (XRefExternalInterface)theEObject;
				T1 result = caseXRefExternalInterface(xRefExternalInterface);
				if (result == null) result = caseXRefDirect(xRefExternalInterface);
				if (result == null) result = caseXRefExternal(xRefExternalInterface);
				if (result == null) result = caseXRef(xRefExternalInterface);
				if (result == null) result = caseReference(xRefExternalInterface);
				if (result == null) result = caseEssenceBase(xRefExternalInterface);
				if (result == null) result = caseEssenceBaseExtension(xRefExternalInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_EXTERNAL_PORT: {
				XRefExternalPort xRefExternalPort = (XRefExternalPort)theEObject;
				T1 result = caseXRefExternalPort(xRefExternalPort);
				if (result == null) result = caseXRefDirect(xRefExternalPort);
				if (result == null) result = caseXRefExternal(xRefExternalPort);
				if (result == null) result = caseXRef(xRefExternalPort);
				if (result == null) result = caseReference(xRefExternalPort);
				if (result == null) result = caseEssenceBase(xRefExternalPort);
				if (result == null) result = caseEssenceBaseExtension(xRefExternalPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_EXTERNAL_SIGNAL: {
				XRefExternalSignal xRefExternalSignal = (XRefExternalSignal)theEObject;
				T1 result = caseXRefExternalSignal(xRefExternalSignal);
				if (result == null) result = caseXRefDirect(xRefExternalSignal);
				if (result == null) result = caseXRefExternal(xRefExternalSignal);
				if (result == null) result = caseXRef(xRefExternalSignal);
				if (result == null) result = caseReference(xRefExternalSignal);
				if (result == null) result = caseEssenceBase(xRefExternalSignal);
				if (result == null) result = caseEssenceBaseExtension(xRefExternalSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_GENERIC_DECL: {
				XRefGenericDecl xRefGenericDecl = (XRefGenericDecl)theEObject;
				T1 result = caseXRefGenericDecl(xRefGenericDecl);
				if (result == null) result = caseXRefDirect(xRefGenericDecl);
				if (result == null) result = caseXRefExternal(xRefGenericDecl);
				if (result == null) result = caseXRef(xRefGenericDecl);
				if (result == null) result = caseReference(xRefGenericDecl);
				if (result == null) result = caseEssenceBase(xRefGenericDecl);
				if (result == null) result = caseEssenceBaseExtension(xRefGenericDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_IFD_PORT: {
				XRefIFDPort xRefIFDPort = (XRefIFDPort)theEObject;
				T1 result = caseXRefIFDPort(xRefIFDPort);
				if (result == null) result = caseXRefDirect(xRefIFDPort);
				if (result == null) result = caseXRefExternal(xRefIFDPort);
				if (result == null) result = caseXRef(xRefIFDPort);
				if (result == null) result = caseReference(xRefIFDPort);
				if (result == null) result = caseEssenceBase(xRefIFDPort);
				if (result == null) result = caseEssenceBaseExtension(xRefIFDPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_IND_INTERFACE: {
				XRefIndInterface xRefIndInterface = (XRefIndInterface)theEObject;
				T1 result = caseXRefIndInterface(xRefIndInterface);
				if (result == null) result = caseXRefIndirect(xRefIndInterface);
				if (result == null) result = caseXRefExternal(xRefIndInterface);
				if (result == null) result = caseXRef(xRefIndInterface);
				if (result == null) result = caseReference(xRefIndInterface);
				if (result == null) result = caseEssenceBase(xRefIndInterface);
				if (result == null) result = caseEssenceBaseExtension(xRefIndInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_INDIRECT: {
				XRefIndirect xRefIndirect = (XRefIndirect)theEObject;
				T1 result = caseXRefIndirect(xRefIndirect);
				if (result == null) result = caseXRefExternal(xRefIndirect);
				if (result == null) result = caseXRef(xRefIndirect);
				if (result == null) result = caseReference(xRefIndirect);
				if (result == null) result = caseEssenceBase(xRefIndirect);
				if (result == null) result = caseEssenceBaseExtension(xRefIndirect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_IND_PIN: {
				XRefIndPin xRefIndPin = (XRefIndPin)theEObject;
				T1 result = caseXRefIndPin(xRefIndPin);
				if (result == null) result = caseXRefIndirect(xRefIndPin);
				if (result == null) result = caseXRefExternal(xRefIndPin);
				if (result == null) result = caseXRef(xRefIndPin);
				if (result == null) result = caseReference(xRefIndPin);
				if (result == null) result = caseEssenceBase(xRefIndPin);
				if (result == null) result = caseEssenceBaseExtension(xRefIndPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_IND_PORT: {
				XRefIndPort xRefIndPort = (XRefIndPort)theEObject;
				T1 result = caseXRefIndPort(xRefIndPort);
				if (result == null) result = caseXRefIndirect(xRefIndPort);
				if (result == null) result = caseXRefExternal(xRefIndPort);
				if (result == null) result = caseXRef(xRefIndPort);
				if (result == null) result = caseReference(xRefIndPort);
				if (result == null) result = caseEssenceBase(xRefIndPort);
				if (result == null) result = caseEssenceBaseExtension(xRefIndPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_IND_SINGLE_PAD: {
				XRefIndSinglePad xRefIndSinglePad = (XRefIndSinglePad)theEObject;
				T1 result = caseXRefIndSinglePad(xRefIndSinglePad);
				if (result == null) result = caseXRefIndirect(xRefIndSinglePad);
				if (result == null) result = caseXRefExternal(xRefIndSinglePad);
				if (result == null) result = caseXRef(xRefIndSinglePad);
				if (result == null) result = caseReference(xRefIndSinglePad);
				if (result == null) result = caseEssenceBase(xRefIndSinglePad);
				if (result == null) result = caseEssenceBaseExtension(xRefIndSinglePad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_INSTANCE: {
				XRefInstance xRefInstance = (XRefInstance)theEObject;
				T1 result = caseXRefInstance(xRefInstance);
				if (result == null) result = caseXRefInternal(xRefInstance);
				if (result == null) result = caseXRef(xRefInstance);
				if (result == null) result = caseReference(xRefInstance);
				if (result == null) result = caseEssenceBase(xRefInstance);
				if (result == null) result = caseEssenceBaseExtension(xRefInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_INTERNAL: {
				XRefInternal xRefInternal = (XRefInternal)theEObject;
				T1 result = caseXRefInternal(xRefInternal);
				if (result == null) result = caseXRef(xRefInternal);
				if (result == null) result = caseReference(xRefInternal);
				if (result == null) result = caseEssenceBase(xRefInternal);
				if (result == null) result = caseEssenceBaseExtension(xRefInternal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_INTERNAL_INTERFACE: {
				XRefInternalInterface xRefInternalInterface = (XRefInternalInterface)theEObject;
				T1 result = caseXRefInternalInterface(xRefInternalInterface);
				if (result == null) result = caseXRefInternal(xRefInternalInterface);
				if (result == null) result = caseXRef(xRefInternalInterface);
				if (result == null) result = caseReference(xRefInternalInterface);
				if (result == null) result = caseEssenceBase(xRefInternalInterface);
				if (result == null) result = caseEssenceBaseExtension(xRefInternalInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_INTERNAL_PORT: {
				XRefInternalPort xRefInternalPort = (XRefInternalPort)theEObject;
				T1 result = caseXRefInternalPort(xRefInternalPort);
				if (result == null) result = caseXRefInternal(xRefInternalPort);
				if (result == null) result = caseXRef(xRefInternalPort);
				if (result == null) result = caseReference(xRefInternalPort);
				if (result == null) result = caseEssenceBase(xRefInternalPort);
				if (result == null) result = caseEssenceBaseExtension(xRefInternalPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_INTERNAL_SIGNAL: {
				XRefInternalSignal xRefInternalSignal = (XRefInternalSignal)theEObject;
				T1 result = caseXRefInternalSignal(xRefInternalSignal);
				if (result == null) result = caseXRefInternal(xRefInternalSignal);
				if (result == null) result = caseXRef(xRefInternalSignal);
				if (result == null) result = caseReference(xRefInternalSignal);
				if (result == null) result = caseEssenceBase(xRefInternalSignal);
				if (result == null) result = caseEssenceBaseExtension(xRefInternalSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_MASTER_INTERFACE: {
				XRefMasterInterface xRefMasterInterface = (XRefMasterInterface)theEObject;
				T1 result = caseXRefMasterInterface(xRefMasterInterface);
				if (result == null) result = caseXRefInternal(xRefMasterInterface);
				if (result == null) result = caseXRef(xRefMasterInterface);
				if (result == null) result = caseReference(xRefMasterInterface);
				if (result == null) result = caseEssenceBase(xRefMasterInterface);
				if (result == null) result = caseEssenceBaseExtension(xRefMasterInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_NET: {
				XRefNet xRefNet = (XRefNet)theEObject;
				T1 result = caseXRefNet(xRefNet);
				if (result == null) result = caseXRefInternal(xRefNet);
				if (result == null) result = caseXRef(xRefNet);
				if (result == null) result = caseReference(xRefNet);
				if (result == null) result = caseEssenceBase(xRefNet);
				if (result == null) result = caseEssenceBaseExtension(xRefNet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_NONE_INTERFACE: {
				XRefNoneInterface xRefNoneInterface = (XRefNoneInterface)theEObject;
				T1 result = caseXRefNoneInterface(xRefNoneInterface);
				if (result == null) result = caseXRefDirect(xRefNoneInterface);
				if (result == null) result = caseXRefExternal(xRefNoneInterface);
				if (result == null) result = caseXRef(xRefNoneInterface);
				if (result == null) result = caseReference(xRefNoneInterface);
				if (result == null) result = caseEssenceBase(xRefNoneInterface);
				if (result == null) result = caseEssenceBaseExtension(xRefNoneInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_PAD_TYPE: {
				XRefPadType xRefPadType = (XRefPadType)theEObject;
				T1 result = caseXRefPadType(xRefPadType);
				if (result == null) result = caseXRefVLNV(xRefPadType);
				if (result == null) result = caseXRefDirect(xRefPadType);
				if (result == null) result = caseXRefExternal(xRefPadType);
				if (result == null) result = caseXRef(xRefPadType);
				if (result == null) result = caseReference(xRefPadType);
				if (result == null) result = caseEssenceBase(xRefPadType);
				if (result == null) result = caseEssenceBaseExtension(xRefPadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_PARAM_DECL: {
				XRefParamDecl xRefParamDecl = (XRefParamDecl)theEObject;
				T1 result = caseXRefParamDecl(xRefParamDecl);
				if (result == null) result = caseXRefDirect(xRefParamDecl);
				if (result == null) result = caseXRefExternal(xRefParamDecl);
				if (result == null) result = caseXRef(xRefParamDecl);
				if (result == null) result = caseReference(xRefParamDecl);
				if (result == null) result = caseEssenceBase(xRefParamDecl);
				if (result == null) result = caseEssenceBaseExtension(xRefParamDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_PIN: {
				XRefPin xRefPin = (XRefPin)theEObject;
				T1 result = caseXRefPin(xRefPin);
				if (result == null) result = caseXRefDirect(xRefPin);
				if (result == null) result = caseXRefExternal(xRefPin);
				if (result == null) result = caseXRef(xRefPin);
				if (result == null) result = caseReference(xRefPin);
				if (result == null) result = caseEssenceBase(xRefPin);
				if (result == null) result = caseEssenceBaseExtension(xRefPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_POWER_DOMAIN: {
				XRefPowerDomain xRefPowerDomain = (XRefPowerDomain)theEObject;
				T1 result = caseXRefPowerDomain(xRefPowerDomain);
				if (result == null) result = caseXRefInternal(xRefPowerDomain);
				if (result == null) result = caseXRef(xRefPowerDomain);
				if (result == null) result = caseReference(xRefPowerDomain);
				if (result == null) result = caseEssenceBase(xRefPowerDomain);
				if (result == null) result = caseEssenceBaseExtension(xRefPowerDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_REAL_PORT: {
				XRefRealPort xRefRealPort = (XRefRealPort)theEObject;
				T1 result = caseXRefRealPort(xRefRealPort);
				if (result == null) result = caseXRefInternal(xRefRealPort);
				if (result == null) result = caseXRef(xRefRealPort);
				if (result == null) result = caseReference(xRefRealPort);
				if (result == null) result = caseEssenceBase(xRefRealPort);
				if (result == null) result = caseEssenceBaseExtension(xRefRealPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_REGISTER_VIEW: {
				XRefRegisterView xRefRegisterView = (XRefRegisterView)theEObject;
				T1 result = caseXRefRegisterView(xRefRegisterView);
				if (result == null) result = caseXRefInternal(xRefRegisterView);
				if (result == null) result = caseXRef(xRefRegisterView);
				if (result == null) result = caseReference(xRefRegisterView);
				if (result == null) result = caseEssenceBase(xRefRegisterView);
				if (result == null) result = caseEssenceBaseExtension(xRefRegisterView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_REG_MEM_SET: {
				XRefRegMemSet xRefRegMemSet = (XRefRegMemSet)theEObject;
				T1 result = caseXRefRegMemSet(xRefRegMemSet);
				if (result == null) result = caseXRefInternal(xRefRegMemSet);
				if (result == null) result = caseXRef(xRefRegMemSet);
				if (result == null) result = caseReference(xRefRegMemSet);
				if (result == null) result = caseEssenceBase(xRefRegMemSet);
				if (result == null) result = caseEssenceBaseExtension(xRefRegMemSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_SINGLE_PAD: {
				XRefSinglePad xRefSinglePad = (XRefSinglePad)theEObject;
				T1 result = caseXRefSinglePad(xRefSinglePad);
				if (result == null) result = caseXRefDirect(xRefSinglePad);
				if (result == null) result = caseXRefExternal(xRefSinglePad);
				if (result == null) result = caseXRef(xRefSinglePad);
				if (result == null) result = caseReference(xRefSinglePad);
				if (result == null) result = caseEssenceBase(xRefSinglePad);
				if (result == null) result = caseEssenceBaseExtension(xRefSinglePad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_SI_PORT: {
				XRefSiPort xRefSiPort = (XRefSiPort)theEObject;
				T1 result = caseXRefSiPort(xRefSiPort);
				if (result == null) result = caseXRefVLNV(xRefSiPort);
				if (result == null) result = caseXRefDirect(xRefSiPort);
				if (result == null) result = caseXRefExternal(xRefSiPort);
				if (result == null) result = caseXRef(xRefSiPort);
				if (result == null) result = caseReference(xRefSiPort);
				if (result == null) result = caseEssenceBase(xRefSiPort);
				if (result == null) result = caseEssenceBaseExtension(xRefSiPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_SI_SIGNAL: {
				XRefSiSignal xRefSiSignal = (XRefSiSignal)theEObject;
				T1 result = caseXRefSiSignal(xRefSiSignal);
				if (result == null) result = caseXRefVLNV(xRefSiSignal);
				if (result == null) result = caseXRefDirect(xRefSiSignal);
				if (result == null) result = caseXRefExternal(xRefSiSignal);
				if (result == null) result = caseXRef(xRefSiSignal);
				if (result == null) result = caseReference(xRefSiSignal);
				if (result == null) result = caseEssenceBase(xRefSiSignal);
				if (result == null) result = caseEssenceBaseExtension(xRefSiSignal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_SLAVE_INTERFACE: {
				XRefSlaveInterface xRefSlaveInterface = (XRefSlaveInterface)theEObject;
				T1 result = caseXRefSlaveInterface(xRefSlaveInterface);
				if (result == null) result = caseXRefExternal(xRefSlaveInterface);
				if (result == null) result = caseXRef(xRefSlaveInterface);
				if (result == null) result = caseReference(xRefSlaveInterface);
				if (result == null) result = caseEssenceBase(xRefSlaveInterface);
				if (result == null) result = caseEssenceBaseExtension(xRefSlaveInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_TEST: {
				XRefTest xRefTest = (XRefTest)theEObject;
				T1 result = caseXRefTest(xRefTest);
				if (result == null) result = caseXRefVLNV(xRefTest);
				if (result == null) result = caseXRefDirect(xRefTest);
				if (result == null) result = caseXRefExternal(xRefTest);
				if (result == null) result = caseXRef(xRefTest);
				if (result == null) result = caseReference(xRefTest);
				if (result == null) result = caseEssenceBase(xRefTest);
				if (result == null) result = caseEssenceBaseExtension(xRefTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XREF_VLNV: {
				XRefVLNV xRefVLNV = (XRefVLNV)theEObject;
				T1 result = caseXRefVLNV(xRefVLNV);
				if (result == null) result = caseXRefDirect(xRefVLNV);
				if (result == null) result = caseXRefExternal(xRefVLNV);
				if (result == null) result = caseXRef(xRefVLNV);
				if (result == null) result = caseReference(xRefVLNV);
				if (result == null) result = caseEssenceBase(xRefVLNV);
				if (result == null) result = caseEssenceBaseExtension(xRefVLNV);
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
	public T1 caseAccess(Access object) {
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
	public T1 caseAccessByIndex(AccessByIndex object) {
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
	public T1 caseAccessByName(AccessByName object) {
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
	public T1 caseAccessCondition(AccessCondition object) {
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
	public T1 caseAccessLevel(AccessLevel object) {
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
	public T1 caseAddressBlock(AddressBlock object) {
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
	public T1 caseArray(Array object) {
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
	public T1 caseArrayDimension(ArrayDimension object) {
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
	public T1 caseBitField(BitField object) {
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
	public T1 caseBitFieldElement(BitFieldElement object) {
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
	public T1 caseBitFieldGapElement(BitFieldGapElement object) {
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
	public T1 caseBitFieldSequence(BitFieldSequence object) {
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
	public T1 caseBitFieldSequenceElement(BitFieldSequenceElement object) {
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
	public T1 caseBooleanDecl(BooleanDecl object) {
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
	public T1 caseBooleanDef(BooleanDef object) {
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
	public T1 caseBooleanGenDecl(BooleanGenDecl object) {
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
	public T1 caseBus(Bus object) {
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
	public T1 caseBusInstance(BusInstance object) {
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
	public T1 caseBusInterfaceMap(BusInterfaceMap object) {
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
	public T1 caseBusNoneInterfaceMap(BusNoneInterfaceMap object) {
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
	public T1 caseCablePort(CablePort object) {
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
	public T1 caseCableSignal(CableSignal object) {
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
	public T1 caseComplexDataType(ComplexDataType object) {
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
	public T1 caseComponent(Component object) {
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
	public T1 caseComponentInstance(ComponentInstance object) {
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
	public T1 caseConnection(Connection object) {
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
	public T1 caseConstDef(ConstDef object) {
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
	public T1 caseConstDefBlock(ConstDefBlock object) {
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
	public T1 caseDataDecl(DataDecl object) {
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
	public T1 caseDataDef(DataDef object) {
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
	public T1 caseDataGenDecl(DataGenDecl object) {
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
	public T1 caseDataType(DataType object) {
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
	public T1 caseDataTypeElement(DataTypeElement object) {
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
	public T1 caseDescriptionItem(DescriptionItem object) {
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
	public T1 caseDocumentRoot(DocumentRoot object) {
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
	public T1 caseEnum(model.Enum object) {
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
	public T1 caseEnumElement(EnumElement object) {
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
	public T1 caseEnumeration(Enumeration object) {
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
	public T1 caseEnumerationElement(EnumerationElement object) {
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
	public T1 caseEnumerationInteger(EnumerationInteger object) {
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
	public T1 caseEnumerationSequence(EnumerationSequence object) {
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
	public T1 caseEnumerationString(EnumerationString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Essence Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Essence Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEssenceBase(EssenceBase object) {
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
	public T1 caseFunction(Function object) {
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
	public T1 caseGapElement(GapElement object) {
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
	public T1 caseGeneralInstance(GeneralInstance object) {
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
	public T1 caseGeneralInterface(GeneralInterface object) {
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
	public T1 caseGeneralPad(GeneralPad object) {
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
	public T1 caseGeneralPort(GeneralPort object) {
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
	public T1 caseGeneralRegister(GeneralRegister object) {
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
	public T1 caseGenericDecl(GenericDecl object) {
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
	public T1 caseGenericDeclBlock(GenericDeclBlock object) {
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
	public T1 caseGenericMap(GenericMap object) {
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
	public T1 caseIndexVarUser(IndexVarUser object) {
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
	public T1 caseInstance(Instance object) {
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
	public T1 caseInstanceInterfaceMap(InstanceInterfaceMap object) {
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
	public T1 caseInstancePortMap(InstancePortMap object) {
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
	public T1 caseInstanceShellInterfaceMap(InstanceShellInterfaceMap object) {
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
	public T1 caseInstanceShellPortMap(InstanceShellPortMap object) {
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
	public T1 caseIntegerDecl(IntegerDecl object) {
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
	public T1 caseIntegerDef(IntegerDef object) {
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
	public T1 caseIntegerGenDecl(IntegerGenDecl object) {
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
	public T1 caseInterface(Interface object) {
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
	public T1 caseInterfaceDefCablePort(InterfaceDefCablePort object) {
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
	public T1 caseInterfaceDefinition(InterfaceDefinition object) {
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
	public T1 caseInterfaceDefPort(InterfaceDefPort object) {
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
	public T1 caseInterfaceDefRole(InterfaceDefRole object) {
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
	public T1 caseInterfaceDefTransactionalPort(InterfaceDefTransactionalPort object) {
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
	public T1 caseInterfaceDefView(InterfaceDefView object) {
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
	public T1 caseInterfaceDefWirePort(InterfaceDefWirePort object) {
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
	public T1 caseInterfaceInstance(InterfaceInstance object) {
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
	public T1 caseInterfacePortMap(InterfacePortMap object) {
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
	public T1 caseInterfaceView(InterfaceView object) {
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
	public T1 caseLocalInterfaceMap(LocalInterfaceMap object) {
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
	public T1 caseLocalPortMap(LocalPortMap object) {
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
	public T1 caseMemory(Memory object) {
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
	public T1 caseMethodDataType(MethodDataType object) {
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
	public T1 caseMethodDataTypeElement(MethodDataTypeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModelRoot(ModelRoot object) {
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
	public T1 caseModule(Module object) {
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
	public T1 caseMultiPad(MultiPad object) {
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
	public T1 caseMultiViewRegister(MultiViewRegister object) {
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
	public T1 caseNet(Net object) {
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
	public T1 caseNoneInterface(NoneInterface object) {
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
	public T1 casePackage(model.Package object) {
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
	public T1 casePackageInstance(PackageInstance object) {
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
	public T1 casePad(Pad object) {
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
	public T1 casePadMultiplexed(PadMultiplexed object) {
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
	public T1 casePadNetMap(PadNetMap object) {
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
	public T1 casePadNonMultiplexed(PadNonMultiplexed object) {
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
	public T1 casePadSpecial(PadSpecial object) {
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
	public T1 casePadSupply(PadSupply object) {
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
	public T1 casePadType(PadType object) {
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
	public T1 casePadTypeDB(PadTypeDB object) {
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
	public T1 caseParamDecl(ParamDecl object) {
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
	public T1 caseParamDeclBlock(ParamDeclBlock object) {
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
	public T1 caseParamMap(ParamMap object) {
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
	public T1 casePathRef(PathRef object) {
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
	public T1 casePin(Pin object) {
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
	public T1 casePinNetMap(PinNetMap object) {
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
	public T1 casePort(Port object) {
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
	public T1 casePortRef(PortRef object) {
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
	public T1 casePowerDomain(PowerDomain object) {
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
	public T1 caseProduct(Product object) {
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
	public T1 caseProductInstance(ProductInstance object) {
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
	public T1 caseProductInterfaceMap(ProductInterfaceMap object) {
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
	public T1 caseProductPadMap(ProductPadMap object) {
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
	public T1 caseProductPinMap(ProductPinMap object) {
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
	public T1 caseProperty(Property object) {
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
	public T1 caseRealPort(RealPort object) {
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
	public T1 caseRecord(Record object) {
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
	public T1 caseReference(Reference object) {
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
	public T1 caseRegister(Register object) {
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
	public T1 caseRegisterView(RegisterView object) {
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
	public T1 caseRegMemElement(RegMemElement object) {
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
	public T1 caseRegMemSequence(RegMemSequence object) {
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
	public T1 caseRegMemSet(RegMemSet object) {
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
	public T1 caseRegViewBlock(RegViewBlock object) {
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
	public T1 caseResetType(ResetType object) {
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
	public T1 caseReturnDataType(ReturnDataType object) {
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
	public T1 caseReturnElementAccess(ReturnElementAccess object) {
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
	public T1 caseSequenceElement(SequenceElement object) {
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
	public T1 caseShellInterfaceMap(ShellInterfaceMap object) {
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
	public T1 caseShellPortMap(ShellPortMap object) {
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
	public T1 caseSiComponentInstance(SiComponentInstance object) {
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
	public T1 caseSignal(Signal object) {
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
	public T1 caseSignalMap(SignalMap object) {
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
	public T1 caseSignalOwner(SignalOwner object) {
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
	public T1 caseSiInstance(SiInstance object) {
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
	public T1 caseSiInstanceInterfaceMap(SiInstanceInterfaceMap object) {
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
	public T1 caseSiInstancePortMap(SiInstancePortMap object) {
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
	public T1 caseSiInstanceShellInterfaceMap(SiInstanceShellInterfaceMap object) {
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
	public T1 caseSiInstanceShellPortMap(SiInstanceShellPortMap object) {
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
	public T1 caseSilicon(Silicon object) {
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
	public T1 caseSiliconInstance(SiliconInstance object) {
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
	public T1 caseSimpleDataType(SimpleDataType object) {
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
	public T1 caseSimpleSubElementAccess(SimpleSubElementAccess object) {
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
	public T1 caseSinglePad(SinglePad object) {
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
	public T1 caseSingleSourceNode(SingleSourceNode object) {
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
	public T1 caseSiPort(SiPort object) {
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
	public T1 caseSiPortDB(SiPortDB object) {
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
	public T1 caseSiPortReq(SiPortReq object) {
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
	public T1 caseSiSignal(SiSignal object) {
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
	public T1 caseSiSignalDB(SiSignalDB object) {
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
	public T1 caseSiSystemInstance(SiSystemInstance object) {
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
	public T1 caseStringDecl(StringDecl object) {
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
	public T1 caseStringDef(StringDef object) {
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
	public T1 caseStringGenDecl(StringGenDecl object) {
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
	public T1 caseSubElementAccess(SubElementAccess object) {
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
	public T1 caseSystem(model.System object) {
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
	public T1 caseSystemInstance(SystemInstance object) {
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
	public T1 caseTest(Test object) {
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
	public T1 caseTestDB(TestDB object) {
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
	public T1 caseTestReq(TestReq object) {
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
	public T1 caseTransactionalPort(TransactionalPort object) {
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
	public T1 caseTransactionalSignal(TransactionalSignal object) {
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
	public T1 caseUnion(Union object) {
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
	public T1 caseValueDataType(ValueDataType object) {
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
	public T1 caseVarDef(VarDef object) {
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
	public T1 caseVarDefBlock(VarDefBlock object) {
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
	public T1 caseVLNV(VLNV object) {
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
	public T1 caseVoid(model.Void object) {
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
	public T1 caseWirePort(WirePort object) {
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
	public T1 caseWireSignal(WireSignal object) {
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
	public T1 caseXRef(XRef object) {
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
	public T1 caseXRefConnection(XRefConnection object) {
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
	public T1 caseXRefDataVar(XRefDataVar object) {
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
	public T1 caseXRefDirect(XRefDirect object) {
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
	public T1 caseXRefExternal(XRefExternal object) {
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
	public T1 caseXRefExternalInterface(XRefExternalInterface object) {
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
	public T1 caseXRefExternalPort(XRefExternalPort object) {
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
	public T1 caseXRefExternalSignal(XRefExternalSignal object) {
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
	public T1 caseXRefGenericDecl(XRefGenericDecl object) {
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
	public T1 caseXRefIFDPort(XRefIFDPort object) {
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
	public T1 caseXRefIndInterface(XRefIndInterface object) {
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
	public T1 caseXRefIndirect(XRefIndirect object) {
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
	public T1 caseXRefIndPin(XRefIndPin object) {
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
	public T1 caseXRefIndPort(XRefIndPort object) {
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
	public T1 caseXRefIndSinglePad(XRefIndSinglePad object) {
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
	public T1 caseXRefInstance(XRefInstance object) {
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
	public T1 caseXRefInternal(XRefInternal object) {
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
	public T1 caseXRefInternalInterface(XRefInternalInterface object) {
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
	public T1 caseXRefInternalPort(XRefInternalPort object) {
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
	public T1 caseXRefInternalSignal(XRefInternalSignal object) {
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
	public T1 caseXRefMasterInterface(XRefMasterInterface object) {
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
	public T1 caseXRefNet(XRefNet object) {
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
	public T1 caseXRefNoneInterface(XRefNoneInterface object) {
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
	public T1 caseXRefPadType(XRefPadType object) {
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
	public T1 caseXRefParamDecl(XRefParamDecl object) {
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
	public T1 caseXRefPin(XRefPin object) {
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
	public T1 caseXRefPowerDomain(XRefPowerDomain object) {
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
	public T1 caseXRefRealPort(XRefRealPort object) {
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
	public T1 caseXRefRegisterView(XRefRegisterView object) {
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
	public T1 caseXRefRegMemSet(XRefRegMemSet object) {
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
	public T1 caseXRefSinglePad(XRefSinglePad object) {
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
	public T1 caseXRefSiPort(XRefSiPort object) {
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
	public T1 caseXRefSiSignal(XRefSiSignal object) {
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
	public T1 caseXRefSlaveInterface(XRefSlaveInterface object) {
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
	public T1 caseXRefTest(XRefTest object) {
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
	public T1 caseXRefVLNV(XRefVLNV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Essence Base Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Essence Base Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEssenceBaseExtension(EssenceBaseExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Element Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Element Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSequenceElementBase(SequenceElementBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOffset(Offset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offset Sequence Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offset Sequence Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOffsetSequenceElement(OffsetSequenceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Reset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Reset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBitResetType(BitResetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends SequenceElementBase> T1 caseSequenceBase(SequenceBase<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offset Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offset Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends OffsetSequenceElement> T1 caseOffsetSequence(OffsetSequence<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataTypeOwner(DataTypeOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Common Access Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Common Access Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCommonAccessLevel(CommonAccessLevel object) {
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
	public T1 defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
