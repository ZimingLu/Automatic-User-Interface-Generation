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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseAccess(Access object) {
				return createAccessAdapter();
			}
			@Override
			public Adapter caseAccessByIndex(AccessByIndex object) {
				return createAccessByIndexAdapter();
			}
			@Override
			public Adapter caseAccessByName(AccessByName object) {
				return createAccessByNameAdapter();
			}
			@Override
			public Adapter caseAccessCondition(AccessCondition object) {
				return createAccessConditionAdapter();
			}
			@Override
			public Adapter caseAccessLevel(AccessLevel object) {
				return createAccessLevelAdapter();
			}
			@Override
			public Adapter caseAddressBlock(AddressBlock object) {
				return createAddressBlockAdapter();
			}
			@Override
			public Adapter caseArray(Array object) {
				return createArrayAdapter();
			}
			@Override
			public Adapter caseArrayDimension(ArrayDimension object) {
				return createArrayDimensionAdapter();
			}
			@Override
			public Adapter caseBitField(BitField object) {
				return createBitFieldAdapter();
			}
			@Override
			public Adapter caseBitFieldElement(BitFieldElement object) {
				return createBitFieldElementAdapter();
			}
			@Override
			public Adapter caseBitFieldGapElement(BitFieldGapElement object) {
				return createBitFieldGapElementAdapter();
			}
			@Override
			public Adapter caseBitFieldSequence(BitFieldSequence object) {
				return createBitFieldSequenceAdapter();
			}
			@Override
			public Adapter caseBitFieldSequenceElement(BitFieldSequenceElement object) {
				return createBitFieldSequenceElementAdapter();
			}
			@Override
			public Adapter caseBooleanDecl(BooleanDecl object) {
				return createBooleanDeclAdapter();
			}
			@Override
			public Adapter caseBooleanDef(BooleanDef object) {
				return createBooleanDefAdapter();
			}
			@Override
			public Adapter caseBooleanGenDecl(BooleanGenDecl object) {
				return createBooleanGenDeclAdapter();
			}
			@Override
			public Adapter caseBus(Bus object) {
				return createBusAdapter();
			}
			@Override
			public Adapter caseBusInstance(BusInstance object) {
				return createBusInstanceAdapter();
			}
			@Override
			public Adapter caseBusInterfaceMap(BusInterfaceMap object) {
				return createBusInterfaceMapAdapter();
			}
			@Override
			public Adapter caseBusNoneInterfaceMap(BusNoneInterfaceMap object) {
				return createBusNoneInterfaceMapAdapter();
			}
			@Override
			public Adapter caseCablePort(CablePort object) {
				return createCablePortAdapter();
			}
			@Override
			public Adapter caseCableSignal(CableSignal object) {
				return createCableSignalAdapter();
			}
			@Override
			public Adapter caseComplexDataType(ComplexDataType object) {
				return createComplexDataTypeAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseComponentInstance(ComponentInstance object) {
				return createComponentInstanceAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseConstDef(ConstDef object) {
				return createConstDefAdapter();
			}
			@Override
			public Adapter caseConstDefBlock(ConstDefBlock object) {
				return createConstDefBlockAdapter();
			}
			@Override
			public Adapter caseDataDecl(DataDecl object) {
				return createDataDeclAdapter();
			}
			@Override
			public Adapter caseDataDef(DataDef object) {
				return createDataDefAdapter();
			}
			@Override
			public Adapter caseDataGenDecl(DataGenDecl object) {
				return createDataGenDeclAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseDataTypeElement(DataTypeElement object) {
				return createDataTypeElementAdapter();
			}
			@Override
			public Adapter caseDescriptionItem(DescriptionItem object) {
				return createDescriptionItemAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEnum(model.Enum object) {
				return createEnumAdapter();
			}
			@Override
			public Adapter caseEnumElement(EnumElement object) {
				return createEnumElementAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseEnumerationElement(EnumerationElement object) {
				return createEnumerationElementAdapter();
			}
			@Override
			public Adapter caseEnumerationInteger(EnumerationInteger object) {
				return createEnumerationIntegerAdapter();
			}
			@Override
			public Adapter caseEnumerationSequence(EnumerationSequence object) {
				return createEnumerationSequenceAdapter();
			}
			@Override
			public Adapter caseEnumerationString(EnumerationString object) {
				return createEnumerationStringAdapter();
			}
			@Override
			public Adapter caseEssenceBase(EssenceBase object) {
				return createEssenceBaseAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseGapElement(GapElement object) {
				return createGapElementAdapter();
			}
			@Override
			public Adapter caseGeneralInstance(GeneralInstance object) {
				return createGeneralInstanceAdapter();
			}
			@Override
			public Adapter caseGeneralInterface(GeneralInterface object) {
				return createGeneralInterfaceAdapter();
			}
			@Override
			public Adapter caseGeneralPad(GeneralPad object) {
				return createGeneralPadAdapter();
			}
			@Override
			public Adapter caseGeneralPort(GeneralPort object) {
				return createGeneralPortAdapter();
			}
			@Override
			public Adapter caseGeneralRegister(GeneralRegister object) {
				return createGeneralRegisterAdapter();
			}
			@Override
			public Adapter caseGenericDecl(GenericDecl object) {
				return createGenericDeclAdapter();
			}
			@Override
			public Adapter caseGenericDeclBlock(GenericDeclBlock object) {
				return createGenericDeclBlockAdapter();
			}
			@Override
			public Adapter caseGenericMap(GenericMap object) {
				return createGenericMapAdapter();
			}
			@Override
			public Adapter caseIndexVarUser(IndexVarUser object) {
				return createIndexVarUserAdapter();
			}
			@Override
			public Adapter caseInstance(Instance object) {
				return createInstanceAdapter();
			}
			@Override
			public Adapter caseInstanceInterfaceMap(InstanceInterfaceMap object) {
				return createInstanceInterfaceMapAdapter();
			}
			@Override
			public Adapter caseInstancePortMap(InstancePortMap object) {
				return createInstancePortMapAdapter();
			}
			@Override
			public Adapter caseInstanceShellInterfaceMap(InstanceShellInterfaceMap object) {
				return createInstanceShellInterfaceMapAdapter();
			}
			@Override
			public Adapter caseInstanceShellPortMap(InstanceShellPortMap object) {
				return createInstanceShellPortMapAdapter();
			}
			@Override
			public Adapter caseIntegerDecl(IntegerDecl object) {
				return createIntegerDeclAdapter();
			}
			@Override
			public Adapter caseIntegerDef(IntegerDef object) {
				return createIntegerDefAdapter();
			}
			@Override
			public Adapter caseIntegerGenDecl(IntegerGenDecl object) {
				return createIntegerGenDeclAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseInterfaceDefCablePort(InterfaceDefCablePort object) {
				return createInterfaceDefCablePortAdapter();
			}
			@Override
			public Adapter caseInterfaceDefinition(InterfaceDefinition object) {
				return createInterfaceDefinitionAdapter();
			}
			@Override
			public Adapter caseInterfaceDefPort(InterfaceDefPort object) {
				return createInterfaceDefPortAdapter();
			}
			@Override
			public Adapter caseInterfaceDefRole(InterfaceDefRole object) {
				return createInterfaceDefRoleAdapter();
			}
			@Override
			public Adapter caseInterfaceDefTransactionalPort(InterfaceDefTransactionalPort object) {
				return createInterfaceDefTransactionalPortAdapter();
			}
			@Override
			public Adapter caseInterfaceDefView(InterfaceDefView object) {
				return createInterfaceDefViewAdapter();
			}
			@Override
			public Adapter caseInterfaceDefWirePort(InterfaceDefWirePort object) {
				return createInterfaceDefWirePortAdapter();
			}
			@Override
			public Adapter caseInterfaceInstance(InterfaceInstance object) {
				return createInterfaceInstanceAdapter();
			}
			@Override
			public Adapter caseInterfacePortMap(InterfacePortMap object) {
				return createInterfacePortMapAdapter();
			}
			@Override
			public Adapter caseInterfaceView(InterfaceView object) {
				return createInterfaceViewAdapter();
			}
			@Override
			public Adapter caseLocalInterfaceMap(LocalInterfaceMap object) {
				return createLocalInterfaceMapAdapter();
			}
			@Override
			public Adapter caseLocalPortMap(LocalPortMap object) {
				return createLocalPortMapAdapter();
			}
			@Override
			public Adapter caseMemory(Memory object) {
				return createMemoryAdapter();
			}
			@Override
			public Adapter caseMethodDataType(MethodDataType object) {
				return createMethodDataTypeAdapter();
			}
			@Override
			public Adapter caseMethodDataTypeElement(MethodDataTypeElement object) {
				return createMethodDataTypeElementAdapter();
			}
			@Override
			public Adapter caseModelRoot(ModelRoot object) {
				return createModelRootAdapter();
			}
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseMultiPad(MultiPad object) {
				return createMultiPadAdapter();
			}
			@Override
			public Adapter caseMultiViewRegister(MultiViewRegister object) {
				return createMultiViewRegisterAdapter();
			}
			@Override
			public Adapter caseNet(Net object) {
				return createNetAdapter();
			}
			@Override
			public Adapter caseNoneInterface(NoneInterface object) {
				return createNoneInterfaceAdapter();
			}
			@Override
			public Adapter casePackage(model.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter casePackageInstance(PackageInstance object) {
				return createPackageInstanceAdapter();
			}
			@Override
			public Adapter casePad(Pad object) {
				return createPadAdapter();
			}
			@Override
			public Adapter casePadMultiplexed(PadMultiplexed object) {
				return createPadMultiplexedAdapter();
			}
			@Override
			public Adapter casePadNetMap(PadNetMap object) {
				return createPadNetMapAdapter();
			}
			@Override
			public Adapter casePadNonMultiplexed(PadNonMultiplexed object) {
				return createPadNonMultiplexedAdapter();
			}
			@Override
			public Adapter casePadSpecial(PadSpecial object) {
				return createPadSpecialAdapter();
			}
			@Override
			public Adapter casePadSupply(PadSupply object) {
				return createPadSupplyAdapter();
			}
			@Override
			public Adapter casePadType(PadType object) {
				return createPadTypeAdapter();
			}
			@Override
			public Adapter casePadTypeDB(PadTypeDB object) {
				return createPadTypeDBAdapter();
			}
			@Override
			public Adapter caseParamDecl(ParamDecl object) {
				return createParamDeclAdapter();
			}
			@Override
			public Adapter caseParamDeclBlock(ParamDeclBlock object) {
				return createParamDeclBlockAdapter();
			}
			@Override
			public Adapter caseParamMap(ParamMap object) {
				return createParamMapAdapter();
			}
			@Override
			public Adapter casePathRef(PathRef object) {
				return createPathRefAdapter();
			}
			@Override
			public Adapter casePin(Pin object) {
				return createPinAdapter();
			}
			@Override
			public Adapter casePinNetMap(PinNetMap object) {
				return createPinNetMapAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter casePortRef(PortRef object) {
				return createPortRefAdapter();
			}
			@Override
			public Adapter casePowerDomain(PowerDomain object) {
				return createPowerDomainAdapter();
			}
			@Override
			public Adapter caseProduct(Product object) {
				return createProductAdapter();
			}
			@Override
			public Adapter caseProductInstance(ProductInstance object) {
				return createProductInstanceAdapter();
			}
			@Override
			public Adapter caseProductInterfaceMap(ProductInterfaceMap object) {
				return createProductInterfaceMapAdapter();
			}
			@Override
			public Adapter caseProductPadMap(ProductPadMap object) {
				return createProductPadMapAdapter();
			}
			@Override
			public Adapter caseProductPinMap(ProductPinMap object) {
				return createProductPinMapAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseRealPort(RealPort object) {
				return createRealPortAdapter();
			}
			@Override
			public Adapter caseRecord(Record object) {
				return createRecordAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseRegister(Register object) {
				return createRegisterAdapter();
			}
			@Override
			public Adapter caseRegisterView(RegisterView object) {
				return createRegisterViewAdapter();
			}
			@Override
			public Adapter caseRegMemElement(RegMemElement object) {
				return createRegMemElementAdapter();
			}
			@Override
			public Adapter caseRegMemSequence(RegMemSequence object) {
				return createRegMemSequenceAdapter();
			}
			@Override
			public Adapter caseRegMemSet(RegMemSet object) {
				return createRegMemSetAdapter();
			}
			@Override
			public Adapter caseRegViewBlock(RegViewBlock object) {
				return createRegViewBlockAdapter();
			}
			@Override
			public Adapter caseResetType(ResetType object) {
				return createResetTypeAdapter();
			}
			@Override
			public Adapter caseReturnDataType(ReturnDataType object) {
				return createReturnDataTypeAdapter();
			}
			@Override
			public Adapter caseReturnElementAccess(ReturnElementAccess object) {
				return createReturnElementAccessAdapter();
			}
			@Override
			public Adapter caseSequenceElement(SequenceElement object) {
				return createSequenceElementAdapter();
			}
			@Override
			public Adapter caseShellInterfaceMap(ShellInterfaceMap object) {
				return createShellInterfaceMapAdapter();
			}
			@Override
			public Adapter caseShellPortMap(ShellPortMap object) {
				return createShellPortMapAdapter();
			}
			@Override
			public Adapter caseSiComponentInstance(SiComponentInstance object) {
				return createSiComponentInstanceAdapter();
			}
			@Override
			public Adapter caseSignal(Signal object) {
				return createSignalAdapter();
			}
			@Override
			public Adapter caseSignalMap(SignalMap object) {
				return createSignalMapAdapter();
			}
			@Override
			public Adapter caseSignalOwner(SignalOwner object) {
				return createSignalOwnerAdapter();
			}
			@Override
			public Adapter caseSiInstance(SiInstance object) {
				return createSiInstanceAdapter();
			}
			@Override
			public Adapter caseSiInstanceInterfaceMap(SiInstanceInterfaceMap object) {
				return createSiInstanceInterfaceMapAdapter();
			}
			@Override
			public Adapter caseSiInstancePortMap(SiInstancePortMap object) {
				return createSiInstancePortMapAdapter();
			}
			@Override
			public Adapter caseSiInstanceShellInterfaceMap(SiInstanceShellInterfaceMap object) {
				return createSiInstanceShellInterfaceMapAdapter();
			}
			@Override
			public Adapter caseSiInstanceShellPortMap(SiInstanceShellPortMap object) {
				return createSiInstanceShellPortMapAdapter();
			}
			@Override
			public Adapter caseSilicon(Silicon object) {
				return createSiliconAdapter();
			}
			@Override
			public Adapter caseSiliconInstance(SiliconInstance object) {
				return createSiliconInstanceAdapter();
			}
			@Override
			public Adapter caseSimpleDataType(SimpleDataType object) {
				return createSimpleDataTypeAdapter();
			}
			@Override
			public Adapter caseSimpleSubElementAccess(SimpleSubElementAccess object) {
				return createSimpleSubElementAccessAdapter();
			}
			@Override
			public Adapter caseSinglePad(SinglePad object) {
				return createSinglePadAdapter();
			}
			@Override
			public Adapter caseSingleSourceNode(SingleSourceNode object) {
				return createSingleSourceNodeAdapter();
			}
			@Override
			public Adapter caseSiPort(SiPort object) {
				return createSiPortAdapter();
			}
			@Override
			public Adapter caseSiPortDB(SiPortDB object) {
				return createSiPortDBAdapter();
			}
			@Override
			public Adapter caseSiPortReq(SiPortReq object) {
				return createSiPortReqAdapter();
			}
			@Override
			public Adapter caseSiSignal(SiSignal object) {
				return createSiSignalAdapter();
			}
			@Override
			public Adapter caseSiSignalDB(SiSignalDB object) {
				return createSiSignalDBAdapter();
			}
			@Override
			public Adapter caseSiSystemInstance(SiSystemInstance object) {
				return createSiSystemInstanceAdapter();
			}
			@Override
			public Adapter caseStringDecl(StringDecl object) {
				return createStringDeclAdapter();
			}
			@Override
			public Adapter caseStringDef(StringDef object) {
				return createStringDefAdapter();
			}
			@Override
			public Adapter caseStringGenDecl(StringGenDecl object) {
				return createStringGenDeclAdapter();
			}
			@Override
			public Adapter caseSubElementAccess(SubElementAccess object) {
				return createSubElementAccessAdapter();
			}
			@Override
			public Adapter caseSystem(model.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseSystemInstance(SystemInstance object) {
				return createSystemInstanceAdapter();
			}
			@Override
			public Adapter caseTest(Test object) {
				return createTestAdapter();
			}
			@Override
			public Adapter caseTestDB(TestDB object) {
				return createTestDBAdapter();
			}
			@Override
			public Adapter caseTestReq(TestReq object) {
				return createTestReqAdapter();
			}
			@Override
			public Adapter caseTransactionalPort(TransactionalPort object) {
				return createTransactionalPortAdapter();
			}
			@Override
			public Adapter caseTransactionalSignal(TransactionalSignal object) {
				return createTransactionalSignalAdapter();
			}
			@Override
			public Adapter caseUnion(Union object) {
				return createUnionAdapter();
			}
			@Override
			public Adapter caseValueDataType(ValueDataType object) {
				return createValueDataTypeAdapter();
			}
			@Override
			public Adapter caseVarDef(VarDef object) {
				return createVarDefAdapter();
			}
			@Override
			public Adapter caseVarDefBlock(VarDefBlock object) {
				return createVarDefBlockAdapter();
			}
			@Override
			public Adapter caseVLNV(VLNV object) {
				return createVLNVAdapter();
			}
			@Override
			public Adapter caseVoid(model.Void object) {
				return createVoidAdapter();
			}
			@Override
			public Adapter caseWirePort(WirePort object) {
				return createWirePortAdapter();
			}
			@Override
			public Adapter caseWireSignal(WireSignal object) {
				return createWireSignalAdapter();
			}
			@Override
			public Adapter caseXRef(XRef object) {
				return createXRefAdapter();
			}
			@Override
			public Adapter caseXRefConnection(XRefConnection object) {
				return createXRefConnectionAdapter();
			}
			@Override
			public Adapter caseXRefDataVar(XRefDataVar object) {
				return createXRefDataVarAdapter();
			}
			@Override
			public Adapter caseXRefDirect(XRefDirect object) {
				return createXRefDirectAdapter();
			}
			@Override
			public Adapter caseXRefExternal(XRefExternal object) {
				return createXRefExternalAdapter();
			}
			@Override
			public Adapter caseXRefExternalInterface(XRefExternalInterface object) {
				return createXRefExternalInterfaceAdapter();
			}
			@Override
			public Adapter caseXRefExternalPort(XRefExternalPort object) {
				return createXRefExternalPortAdapter();
			}
			@Override
			public Adapter caseXRefExternalSignal(XRefExternalSignal object) {
				return createXRefExternalSignalAdapter();
			}
			@Override
			public Adapter caseXRefGenericDecl(XRefGenericDecl object) {
				return createXRefGenericDeclAdapter();
			}
			@Override
			public Adapter caseXRefIFDPort(XRefIFDPort object) {
				return createXRefIFDPortAdapter();
			}
			@Override
			public Adapter caseXRefIndInterface(XRefIndInterface object) {
				return createXRefIndInterfaceAdapter();
			}
			@Override
			public Adapter caseXRefIndirect(XRefIndirect object) {
				return createXRefIndirectAdapter();
			}
			@Override
			public Adapter caseXRefIndPin(XRefIndPin object) {
				return createXRefIndPinAdapter();
			}
			@Override
			public Adapter caseXRefIndPort(XRefIndPort object) {
				return createXRefIndPortAdapter();
			}
			@Override
			public Adapter caseXRefIndSinglePad(XRefIndSinglePad object) {
				return createXRefIndSinglePadAdapter();
			}
			@Override
			public Adapter caseXRefInstance(XRefInstance object) {
				return createXRefInstanceAdapter();
			}
			@Override
			public Adapter caseXRefInternal(XRefInternal object) {
				return createXRefInternalAdapter();
			}
			@Override
			public Adapter caseXRefInternalInterface(XRefInternalInterface object) {
				return createXRefInternalInterfaceAdapter();
			}
			@Override
			public Adapter caseXRefInternalPort(XRefInternalPort object) {
				return createXRefInternalPortAdapter();
			}
			@Override
			public Adapter caseXRefInternalSignal(XRefInternalSignal object) {
				return createXRefInternalSignalAdapter();
			}
			@Override
			public Adapter caseXRefMasterInterface(XRefMasterInterface object) {
				return createXRefMasterInterfaceAdapter();
			}
			@Override
			public Adapter caseXRefNet(XRefNet object) {
				return createXRefNetAdapter();
			}
			@Override
			public Adapter caseXRefNoneInterface(XRefNoneInterface object) {
				return createXRefNoneInterfaceAdapter();
			}
			@Override
			public Adapter caseXRefPadType(XRefPadType object) {
				return createXRefPadTypeAdapter();
			}
			@Override
			public Adapter caseXRefParamDecl(XRefParamDecl object) {
				return createXRefParamDeclAdapter();
			}
			@Override
			public Adapter caseXRefPin(XRefPin object) {
				return createXRefPinAdapter();
			}
			@Override
			public Adapter caseXRefPowerDomain(XRefPowerDomain object) {
				return createXRefPowerDomainAdapter();
			}
			@Override
			public Adapter caseXRefRealPort(XRefRealPort object) {
				return createXRefRealPortAdapter();
			}
			@Override
			public Adapter caseXRefRegisterView(XRefRegisterView object) {
				return createXRefRegisterViewAdapter();
			}
			@Override
			public Adapter caseXRefRegMemSet(XRefRegMemSet object) {
				return createXRefRegMemSetAdapter();
			}
			@Override
			public Adapter caseXRefSinglePad(XRefSinglePad object) {
				return createXRefSinglePadAdapter();
			}
			@Override
			public Adapter caseXRefSiPort(XRefSiPort object) {
				return createXRefSiPortAdapter();
			}
			@Override
			public Adapter caseXRefSiSignal(XRefSiSignal object) {
				return createXRefSiSignalAdapter();
			}
			@Override
			public Adapter caseXRefSlaveInterface(XRefSlaveInterface object) {
				return createXRefSlaveInterfaceAdapter();
			}
			@Override
			public Adapter caseXRefTest(XRefTest object) {
				return createXRefTestAdapter();
			}
			@Override
			public Adapter caseXRefVLNV(XRefVLNV object) {
				return createXRefVLNVAdapter();
			}
			@Override
			public Adapter caseEssenceBaseExtension(EssenceBaseExtension object) {
				return createEssenceBaseExtensionAdapter();
			}
			@Override
			public Adapter caseSequenceElementBase(SequenceElementBase object) {
				return createSequenceElementBaseAdapter();
			}
			@Override
			public Adapter caseOffset(Offset object) {
				return createOffsetAdapter();
			}
			@Override
			public Adapter caseOffsetSequenceElement(OffsetSequenceElement object) {
				return createOffsetSequenceElementAdapter();
			}
			@Override
			public Adapter caseBitResetType(BitResetType object) {
				return createBitResetTypeAdapter();
			}
			@Override
			public <T extends SequenceElementBase> Adapter caseSequenceBase(SequenceBase<T> object) {
				return createSequenceBaseAdapter();
			}
			@Override
			public <T extends OffsetSequenceElement> Adapter caseOffsetSequence(OffsetSequence<T> object) {
				return createOffsetSequenceAdapter();
			}
			@Override
			public Adapter caseDataTypeOwner(DataTypeOwner object) {
				return createDataTypeOwnerAdapter();
			}
			@Override
			public Adapter caseCommonAccessLevel(CommonAccessLevel object) {
				return createCommonAccessLevelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link model.Access <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Access
	 * @generated
	 */
	public Adapter createAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.AccessByIndex <em>Access By Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.AccessByIndex
	 * @generated
	 */
	public Adapter createAccessByIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.AccessByName <em>Access By Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.AccessByName
	 * @generated
	 */
	public Adapter createAccessByNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.AccessCondition <em>Access Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.AccessCondition
	 * @generated
	 */
	public Adapter createAccessConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.AccessLevel <em>Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.AccessLevel
	 * @generated
	 */
	public Adapter createAccessLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.AddressBlock <em>Address Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.AddressBlock
	 * @generated
	 */
	public Adapter createAddressBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Array
	 * @generated
	 */
	public Adapter createArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ArrayDimension <em>Array Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ArrayDimension
	 * @generated
	 */
	public Adapter createArrayDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BitField <em>Bit Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BitField
	 * @generated
	 */
	public Adapter createBitFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BitFieldElement <em>Bit Field Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BitFieldElement
	 * @generated
	 */
	public Adapter createBitFieldElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BitFieldGapElement <em>Bit Field Gap Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BitFieldGapElement
	 * @generated
	 */
	public Adapter createBitFieldGapElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BitFieldSequence <em>Bit Field Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BitFieldSequence
	 * @generated
	 */
	public Adapter createBitFieldSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BitFieldSequenceElement <em>Bit Field Sequence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BitFieldSequenceElement
	 * @generated
	 */
	public Adapter createBitFieldSequenceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BooleanDecl <em>Boolean Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BooleanDecl
	 * @generated
	 */
	public Adapter createBooleanDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BooleanDef <em>Boolean Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BooleanDef
	 * @generated
	 */
	public Adapter createBooleanDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BooleanGenDecl <em>Boolean Gen Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BooleanGenDecl
	 * @generated
	 */
	public Adapter createBooleanGenDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Bus
	 * @generated
	 */
	public Adapter createBusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BusInstance <em>Bus Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BusInstance
	 * @generated
	 */
	public Adapter createBusInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BusInterfaceMap <em>Bus Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BusInterfaceMap
	 * @generated
	 */
	public Adapter createBusInterfaceMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BusNoneInterfaceMap <em>Bus None Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BusNoneInterfaceMap
	 * @generated
	 */
	public Adapter createBusNoneInterfaceMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.CablePort <em>Cable Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.CablePort
	 * @generated
	 */
	public Adapter createCablePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.CableSignal <em>Cable Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.CableSignal
	 * @generated
	 */
	public Adapter createCableSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ComplexDataType <em>Complex Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ComplexDataType
	 * @generated
	 */
	public Adapter createComplexDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ComponentInstance
	 * @generated
	 */
	public Adapter createComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ConstDef <em>Const Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ConstDef
	 * @generated
	 */
	public Adapter createConstDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ConstDefBlock <em>Const Def Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ConstDefBlock
	 * @generated
	 */
	public Adapter createConstDefBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.DataDecl <em>Data Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.DataDecl
	 * @generated
	 */
	public Adapter createDataDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.DataDef <em>Data Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.DataDef
	 * @generated
	 */
	public Adapter createDataDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.DataGenDecl <em>Data Gen Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.DataGenDecl
	 * @generated
	 */
	public Adapter createDataGenDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.DataTypeElement <em>Data Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.DataTypeElement
	 * @generated
	 */
	public Adapter createDataTypeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.DescriptionItem <em>Description Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.DescriptionItem
	 * @generated
	 */
	public Adapter createDescriptionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Enum
	 * @generated
	 */
	public Adapter createEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.EnumElement <em>Enum Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.EnumElement
	 * @generated
	 */
	public Adapter createEnumElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.EnumerationElement <em>Enumeration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.EnumerationElement
	 * @generated
	 */
	public Adapter createEnumerationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.EnumerationInteger <em>Enumeration Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.EnumerationInteger
	 * @generated
	 */
	public Adapter createEnumerationIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.EnumerationSequence <em>Enumeration Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.EnumerationSequence
	 * @generated
	 */
	public Adapter createEnumerationSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.EnumerationString <em>Enumeration String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.EnumerationString
	 * @generated
	 */
	public Adapter createEnumerationStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.EssenceBase <em>Essence Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.EssenceBase
	 * @generated
	 */
	public Adapter createEssenceBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.GapElement <em>Gap Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.GapElement
	 * @generated
	 */
	public Adapter createGapElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.GeneralInstance <em>General Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.GeneralInstance
	 * @generated
	 */
	public Adapter createGeneralInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.GeneralInterface <em>General Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.GeneralInterface
	 * @generated
	 */
	public Adapter createGeneralInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.GeneralPad <em>General Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.GeneralPad
	 * @generated
	 */
	public Adapter createGeneralPadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.GeneralPort <em>General Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.GeneralPort
	 * @generated
	 */
	public Adapter createGeneralPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.GeneralRegister <em>General Register</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.GeneralRegister
	 * @generated
	 */
	public Adapter createGeneralRegisterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.GenericDecl <em>Generic Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.GenericDecl
	 * @generated
	 */
	public Adapter createGenericDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.GenericDeclBlock <em>Generic Decl Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.GenericDeclBlock
	 * @generated
	 */
	public Adapter createGenericDeclBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.GenericMap <em>Generic Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.GenericMap
	 * @generated
	 */
	public Adapter createGenericMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.IndexVarUser <em>Index Var User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.IndexVarUser
	 * @generated
	 */
	public Adapter createIndexVarUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Instance
	 * @generated
	 */
	public Adapter createInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.InstanceInterfaceMap <em>Instance Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.InstanceInterfaceMap
	 * @generated
	 */
	public Adapter createInstanceInterfaceMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.InstancePortMap <em>Instance Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.InstancePortMap
	 * @generated
	 */
	public Adapter createInstancePortMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.InstanceShellInterfaceMap <em>Instance Shell Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.InstanceShellInterfaceMap
	 * @generated
	 */
	public Adapter createInstanceShellInterfaceMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.InstanceShellPortMap <em>Instance Shell Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.InstanceShellPortMap
	 * @generated
	 */
	public Adapter createInstanceShellPortMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.IntegerDecl <em>Integer Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.IntegerDecl
	 * @generated
	 */
	public Adapter createIntegerDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.IntegerDef <em>Integer Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.IntegerDef
	 * @generated
	 */
	public Adapter createIntegerDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.IntegerGenDecl <em>Integer Gen Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.IntegerGenDecl
	 * @generated
	 */
	public Adapter createIntegerGenDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.InterfaceDefCablePort <em>Interface Def Cable Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.InterfaceDefCablePort
	 * @generated
	 */
	public Adapter createInterfaceDefCablePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.InterfaceDefinition <em>Interface Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.InterfaceDefinition
	 * @generated
	 */
	public Adapter createInterfaceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.InterfaceDefPort <em>Interface Def Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.InterfaceDefPort
	 * @generated
	 */
	public Adapter createInterfaceDefPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.InterfaceDefRole <em>Interface Def Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.InterfaceDefRole
	 * @generated
	 */
	public Adapter createInterfaceDefRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.InterfaceDefTransactionalPort <em>Interface Def Transactional Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.InterfaceDefTransactionalPort
	 * @generated
	 */
	public Adapter createInterfaceDefTransactionalPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.InterfaceDefView <em>Interface Def View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.InterfaceDefView
	 * @generated
	 */
	public Adapter createInterfaceDefViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.InterfaceDefWirePort <em>Interface Def Wire Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.InterfaceDefWirePort
	 * @generated
	 */
	public Adapter createInterfaceDefWirePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.InterfaceInstance <em>Interface Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.InterfaceInstance
	 * @generated
	 */
	public Adapter createInterfaceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.InterfacePortMap <em>Interface Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.InterfacePortMap
	 * @generated
	 */
	public Adapter createInterfacePortMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.InterfaceView <em>Interface View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.InterfaceView
	 * @generated
	 */
	public Adapter createInterfaceViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.LocalInterfaceMap <em>Local Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.LocalInterfaceMap
	 * @generated
	 */
	public Adapter createLocalInterfaceMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.LocalPortMap <em>Local Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.LocalPortMap
	 * @generated
	 */
	public Adapter createLocalPortMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Memory
	 * @generated
	 */
	public Adapter createMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.MethodDataType <em>Method Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.MethodDataType
	 * @generated
	 */
	public Adapter createMethodDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.MethodDataTypeElement <em>Method Data Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.MethodDataTypeElement
	 * @generated
	 */
	public Adapter createMethodDataTypeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ModelRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ModelRoot
	 * @generated
	 */
	public Adapter createModelRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.MultiPad <em>Multi Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.MultiPad
	 * @generated
	 */
	public Adapter createMultiPadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.MultiViewRegister <em>Multi View Register</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.MultiViewRegister
	 * @generated
	 */
	public Adapter createMultiViewRegisterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Net <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Net
	 * @generated
	 */
	public Adapter createNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.NoneInterface <em>None Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.NoneInterface
	 * @generated
	 */
	public Adapter createNoneInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.PackageInstance <em>Package Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.PackageInstance
	 * @generated
	 */
	public Adapter createPackageInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Pad <em>Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Pad
	 * @generated
	 */
	public Adapter createPadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.PadMultiplexed <em>Pad Multiplexed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.PadMultiplexed
	 * @generated
	 */
	public Adapter createPadMultiplexedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.PadNetMap <em>Pad Net Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.PadNetMap
	 * @generated
	 */
	public Adapter createPadNetMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.PadNonMultiplexed <em>Pad Non Multiplexed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.PadNonMultiplexed
	 * @generated
	 */
	public Adapter createPadNonMultiplexedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.PadSpecial <em>Pad Special</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.PadSpecial
	 * @generated
	 */
	public Adapter createPadSpecialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.PadSupply <em>Pad Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.PadSupply
	 * @generated
	 */
	public Adapter createPadSupplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.PadType <em>Pad Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.PadType
	 * @generated
	 */
	public Adapter createPadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.PadTypeDB <em>Pad Type DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.PadTypeDB
	 * @generated
	 */
	public Adapter createPadTypeDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ParamDecl <em>Param Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ParamDecl
	 * @generated
	 */
	public Adapter createParamDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ParamDeclBlock <em>Param Decl Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ParamDeclBlock
	 * @generated
	 */
	public Adapter createParamDeclBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ParamMap <em>Param Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ParamMap
	 * @generated
	 */
	public Adapter createParamMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.PathRef <em>Path Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.PathRef
	 * @generated
	 */
	public Adapter createPathRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Pin
	 * @generated
	 */
	public Adapter createPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.PinNetMap <em>Pin Net Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.PinNetMap
	 * @generated
	 */
	public Adapter createPinNetMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.PortRef <em>Port Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.PortRef
	 * @generated
	 */
	public Adapter createPortRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.PowerDomain <em>Power Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.PowerDomain
	 * @generated
	 */
	public Adapter createPowerDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ProductInstance <em>Product Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ProductInstance
	 * @generated
	 */
	public Adapter createProductInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ProductInterfaceMap <em>Product Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ProductInterfaceMap
	 * @generated
	 */
	public Adapter createProductInterfaceMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ProductPadMap <em>Product Pad Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ProductPadMap
	 * @generated
	 */
	public Adapter createProductPadMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ProductPinMap <em>Product Pin Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ProductPinMap
	 * @generated
	 */
	public Adapter createProductPinMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.RealPort <em>Real Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.RealPort
	 * @generated
	 */
	public Adapter createRealPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Record
	 * @generated
	 */
	public Adapter createRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Register <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Register
	 * @generated
	 */
	public Adapter createRegisterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.RegisterView <em>Register View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.RegisterView
	 * @generated
	 */
	public Adapter createRegisterViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.RegMemElement <em>Reg Mem Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.RegMemElement
	 * @generated
	 */
	public Adapter createRegMemElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.RegMemSequence <em>Reg Mem Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.RegMemSequence
	 * @generated
	 */
	public Adapter createRegMemSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.RegMemSet <em>Reg Mem Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.RegMemSet
	 * @generated
	 */
	public Adapter createRegMemSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.RegViewBlock <em>Reg View Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.RegViewBlock
	 * @generated
	 */
	public Adapter createRegViewBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ResetType <em>Reset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ResetType
	 * @generated
	 */
	public Adapter createResetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ReturnDataType <em>Return Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ReturnDataType
	 * @generated
	 */
	public Adapter createReturnDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ReturnElementAccess <em>Return Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ReturnElementAccess
	 * @generated
	 */
	public Adapter createReturnElementAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SequenceElement <em>Sequence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SequenceElement
	 * @generated
	 */
	public Adapter createSequenceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ShellInterfaceMap <em>Shell Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ShellInterfaceMap
	 * @generated
	 */
	public Adapter createShellInterfaceMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ShellPortMap <em>Shell Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ShellPortMap
	 * @generated
	 */
	public Adapter createShellPortMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SiComponentInstance <em>Si Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SiComponentInstance
	 * @generated
	 */
	public Adapter createSiComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Signal
	 * @generated
	 */
	public Adapter createSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SignalMap <em>Signal Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SignalMap
	 * @generated
	 */
	public Adapter createSignalMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SignalOwner <em>Signal Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SignalOwner
	 * @generated
	 */
	public Adapter createSignalOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SiInstance <em>Si Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SiInstance
	 * @generated
	 */
	public Adapter createSiInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SiInstanceInterfaceMap <em>Si Instance Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SiInstanceInterfaceMap
	 * @generated
	 */
	public Adapter createSiInstanceInterfaceMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SiInstancePortMap <em>Si Instance Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SiInstancePortMap
	 * @generated
	 */
	public Adapter createSiInstancePortMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SiInstanceShellInterfaceMap <em>Si Instance Shell Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SiInstanceShellInterfaceMap
	 * @generated
	 */
	public Adapter createSiInstanceShellInterfaceMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SiInstanceShellPortMap <em>Si Instance Shell Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SiInstanceShellPortMap
	 * @generated
	 */
	public Adapter createSiInstanceShellPortMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Silicon <em>Silicon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Silicon
	 * @generated
	 */
	public Adapter createSiliconAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SiliconInstance <em>Silicon Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SiliconInstance
	 * @generated
	 */
	public Adapter createSiliconInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SimpleDataType <em>Simple Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SimpleDataType
	 * @generated
	 */
	public Adapter createSimpleDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SimpleSubElementAccess <em>Simple Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SimpleSubElementAccess
	 * @generated
	 */
	public Adapter createSimpleSubElementAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SinglePad <em>Single Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SinglePad
	 * @generated
	 */
	public Adapter createSinglePadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SingleSourceNode <em>Single Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SingleSourceNode
	 * @generated
	 */
	public Adapter createSingleSourceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SiPort <em>Si Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SiPort
	 * @generated
	 */
	public Adapter createSiPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SiPortDB <em>Si Port DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SiPortDB
	 * @generated
	 */
	public Adapter createSiPortDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SiPortReq <em>Si Port Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SiPortReq
	 * @generated
	 */
	public Adapter createSiPortReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SiSignal <em>Si Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SiSignal
	 * @generated
	 */
	public Adapter createSiSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SiSignalDB <em>Si Signal DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SiSignalDB
	 * @generated
	 */
	public Adapter createSiSignalDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SiSystemInstance <em>Si System Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SiSystemInstance
	 * @generated
	 */
	public Adapter createSiSystemInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.StringDecl <em>String Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.StringDecl
	 * @generated
	 */
	public Adapter createStringDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.StringDef <em>String Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.StringDef
	 * @generated
	 */
	public Adapter createStringDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.StringGenDecl <em>String Gen Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.StringGenDecl
	 * @generated
	 */
	public Adapter createStringGenDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SubElementAccess <em>Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SubElementAccess
	 * @generated
	 */
	public Adapter createSubElementAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SystemInstance <em>System Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SystemInstance
	 * @generated
	 */
	public Adapter createSystemInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Test
	 * @generated
	 */
	public Adapter createTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.TestDB <em>Test DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.TestDB
	 * @generated
	 */
	public Adapter createTestDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.TestReq <em>Test Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.TestReq
	 * @generated
	 */
	public Adapter createTestReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.TransactionalPort <em>Transactional Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.TransactionalPort
	 * @generated
	 */
	public Adapter createTransactionalPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.TransactionalSignal <em>Transactional Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.TransactionalSignal
	 * @generated
	 */
	public Adapter createTransactionalSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Union
	 * @generated
	 */
	public Adapter createUnionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ValueDataType <em>Value Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ValueDataType
	 * @generated
	 */
	public Adapter createValueDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.VarDef <em>Var Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.VarDef
	 * @generated
	 */
	public Adapter createVarDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.VarDefBlock <em>Var Def Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.VarDefBlock
	 * @generated
	 */
	public Adapter createVarDefBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.VLNV <em>VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.VLNV
	 * @generated
	 */
	public Adapter createVLNVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Void <em>Void</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Void
	 * @generated
	 */
	public Adapter createVoidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.WirePort <em>Wire Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.WirePort
	 * @generated
	 */
	public Adapter createWirePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.WireSignal <em>Wire Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.WireSignal
	 * @generated
	 */
	public Adapter createWireSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRef <em>XRef</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRef
	 * @generated
	 */
	public Adapter createXRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefConnection <em>XRef Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefConnection
	 * @generated
	 */
	public Adapter createXRefConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefDataVar <em>XRef Data Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefDataVar
	 * @generated
	 */
	public Adapter createXRefDataVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefDirect <em>XRef Direct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefDirect
	 * @generated
	 */
	public Adapter createXRefDirectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefExternal <em>XRef External</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefExternal
	 * @generated
	 */
	public Adapter createXRefExternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefExternalInterface <em>XRef External Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefExternalInterface
	 * @generated
	 */
	public Adapter createXRefExternalInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefExternalPort <em>XRef External Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefExternalPort
	 * @generated
	 */
	public Adapter createXRefExternalPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefExternalSignal <em>XRef External Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefExternalSignal
	 * @generated
	 */
	public Adapter createXRefExternalSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefGenericDecl <em>XRef Generic Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefGenericDecl
	 * @generated
	 */
	public Adapter createXRefGenericDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefIFDPort <em>XRef IFD Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefIFDPort
	 * @generated
	 */
	public Adapter createXRefIFDPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefIndInterface <em>XRef Ind Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefIndInterface
	 * @generated
	 */
	public Adapter createXRefIndInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefIndirect <em>XRef Indirect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefIndirect
	 * @generated
	 */
	public Adapter createXRefIndirectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefIndPin <em>XRef Ind Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefIndPin
	 * @generated
	 */
	public Adapter createXRefIndPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefIndPort <em>XRef Ind Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefIndPort
	 * @generated
	 */
	public Adapter createXRefIndPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefIndSinglePad <em>XRef Ind Single Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefIndSinglePad
	 * @generated
	 */
	public Adapter createXRefIndSinglePadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefInstance <em>XRef Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefInstance
	 * @generated
	 */
	public Adapter createXRefInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefInternal <em>XRef Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefInternal
	 * @generated
	 */
	public Adapter createXRefInternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefInternalInterface <em>XRef Internal Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefInternalInterface
	 * @generated
	 */
	public Adapter createXRefInternalInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefInternalPort <em>XRef Internal Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefInternalPort
	 * @generated
	 */
	public Adapter createXRefInternalPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefInternalSignal <em>XRef Internal Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefInternalSignal
	 * @generated
	 */
	public Adapter createXRefInternalSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefMasterInterface <em>XRef Master Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefMasterInterface
	 * @generated
	 */
	public Adapter createXRefMasterInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefNet <em>XRef Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefNet
	 * @generated
	 */
	public Adapter createXRefNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefNoneInterface <em>XRef None Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefNoneInterface
	 * @generated
	 */
	public Adapter createXRefNoneInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefPadType <em>XRef Pad Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefPadType
	 * @generated
	 */
	public Adapter createXRefPadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefParamDecl <em>XRef Param Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefParamDecl
	 * @generated
	 */
	public Adapter createXRefParamDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefPin <em>XRef Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefPin
	 * @generated
	 */
	public Adapter createXRefPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefPowerDomain <em>XRef Power Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefPowerDomain
	 * @generated
	 */
	public Adapter createXRefPowerDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefRealPort <em>XRef Real Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefRealPort
	 * @generated
	 */
	public Adapter createXRefRealPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefRegisterView <em>XRef Register View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefRegisterView
	 * @generated
	 */
	public Adapter createXRefRegisterViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefRegMemSet <em>XRef Reg Mem Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefRegMemSet
	 * @generated
	 */
	public Adapter createXRefRegMemSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefSinglePad <em>XRef Single Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefSinglePad
	 * @generated
	 */
	public Adapter createXRefSinglePadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefSiPort <em>XRef Si Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefSiPort
	 * @generated
	 */
	public Adapter createXRefSiPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefSiSignal <em>XRef Si Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefSiSignal
	 * @generated
	 */
	public Adapter createXRefSiSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefSlaveInterface <em>XRef Slave Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefSlaveInterface
	 * @generated
	 */
	public Adapter createXRefSlaveInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefTest <em>XRef Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefTest
	 * @generated
	 */
	public Adapter createXRefTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.XRefVLNV <em>XRef VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.XRefVLNV
	 * @generated
	 */
	public Adapter createXRefVLNVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelextension.EssenceBaseExtension <em>Essence Base Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelextension.EssenceBaseExtension
	 * @generated
	 */
	public Adapter createEssenceBaseExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelextension.SequenceElementBase <em>Sequence Element Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelextension.SequenceElementBase
	 * @generated
	 */
	public Adapter createSequenceElementBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelextension.Offset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelextension.Offset
	 * @generated
	 */
	public Adapter createOffsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelextension.OffsetSequenceElement <em>Offset Sequence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelextension.OffsetSequenceElement
	 * @generated
	 */
	public Adapter createOffsetSequenceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelextension.BitResetType <em>Bit Reset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelextension.BitResetType
	 * @generated
	 */
	public Adapter createBitResetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelextension.SequenceBase <em>Sequence Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelextension.SequenceBase
	 * @generated
	 */
	public Adapter createSequenceBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelextension.OffsetSequence <em>Offset Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelextension.OffsetSequence
	 * @generated
	 */
	public Adapter createOffsetSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelextension.DataTypeOwner <em>Data Type Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelextension.DataTypeOwner
	 * @generated
	 */
	public Adapter createDataTypeOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelextension.CommonAccessLevel <em>Common Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelextension.CommonAccessLevel
	 * @generated
	 */
	public Adapter createCommonAccessLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
