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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Essence.EssencePackage
 * @generated
 */
public class EssenceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EssencePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EssenceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EssencePackage.eINSTANCE;
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
	protected EssenceSwitch<Adapter> modelSwitch =
		new EssenceSwitch<Adapter>() {
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
			public Adapter caseEnum(Essence.Enum object) {
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
			public Adapter casePackage(Essence.Package object) {
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
			public Adapter caseSystem(Essence.System object) {
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
			public Adapter caseVoid(Essence.Void object) {
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
	 * Creates a new adapter for an object of class '{@link Essence.Access <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Access
	 * @generated
	 */
	public Adapter createAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.AccessByIndex <em>Access By Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.AccessByIndex
	 * @generated
	 */
	public Adapter createAccessByIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.AccessByName <em>Access By Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.AccessByName
	 * @generated
	 */
	public Adapter createAccessByNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.AccessCondition <em>Access Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.AccessCondition
	 * @generated
	 */
	public Adapter createAccessConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.AccessLevel <em>Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.AccessLevel
	 * @generated
	 */
	public Adapter createAccessLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.AddressBlock <em>Address Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.AddressBlock
	 * @generated
	 */
	public Adapter createAddressBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Array
	 * @generated
	 */
	public Adapter createArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.ArrayDimension <em>Array Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.ArrayDimension
	 * @generated
	 */
	public Adapter createArrayDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.BitField <em>Bit Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.BitField
	 * @generated
	 */
	public Adapter createBitFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.BitFieldElement <em>Bit Field Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.BitFieldElement
	 * @generated
	 */
	public Adapter createBitFieldElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.BitFieldGapElement <em>Bit Field Gap Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.BitFieldGapElement
	 * @generated
	 */
	public Adapter createBitFieldGapElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.BitFieldSequence <em>Bit Field Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.BitFieldSequence
	 * @generated
	 */
	public Adapter createBitFieldSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.BitFieldSequenceElement <em>Bit Field Sequence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.BitFieldSequenceElement
	 * @generated
	 */
	public Adapter createBitFieldSequenceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.BooleanDecl <em>Boolean Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.BooleanDecl
	 * @generated
	 */
	public Adapter createBooleanDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.BooleanDef <em>Boolean Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.BooleanDef
	 * @generated
	 */
	public Adapter createBooleanDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.BooleanGenDecl <em>Boolean Gen Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.BooleanGenDecl
	 * @generated
	 */
	public Adapter createBooleanGenDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Bus
	 * @generated
	 */
	public Adapter createBusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.BusInstance <em>Bus Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.BusInstance
	 * @generated
	 */
	public Adapter createBusInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.BusInterfaceMap <em>Bus Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.BusInterfaceMap
	 * @generated
	 */
	public Adapter createBusInterfaceMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.BusNoneInterfaceMap <em>Bus None Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.BusNoneInterfaceMap
	 * @generated
	 */
	public Adapter createBusNoneInterfaceMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.CablePort <em>Cable Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.CablePort
	 * @generated
	 */
	public Adapter createCablePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.CableSignal <em>Cable Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.CableSignal
	 * @generated
	 */
	public Adapter createCableSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.ComplexDataType <em>Complex Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.ComplexDataType
	 * @generated
	 */
	public Adapter createComplexDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.ComponentInstance
	 * @generated
	 */
	public Adapter createComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.ConstDef <em>Const Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.ConstDef
	 * @generated
	 */
	public Adapter createConstDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.ConstDefBlock <em>Const Def Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.ConstDefBlock
	 * @generated
	 */
	public Adapter createConstDefBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.DataDecl <em>Data Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.DataDecl
	 * @generated
	 */
	public Adapter createDataDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.DataDef <em>Data Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.DataDef
	 * @generated
	 */
	public Adapter createDataDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.DataGenDecl <em>Data Gen Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.DataGenDecl
	 * @generated
	 */
	public Adapter createDataGenDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.DataTypeElement <em>Data Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.DataTypeElement
	 * @generated
	 */
	public Adapter createDataTypeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.DescriptionItem <em>Description Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.DescriptionItem
	 * @generated
	 */
	public Adapter createDescriptionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Enum
	 * @generated
	 */
	public Adapter createEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.EnumElement <em>Enum Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.EnumElement
	 * @generated
	 */
	public Adapter createEnumElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.EnumerationElement <em>Enumeration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.EnumerationElement
	 * @generated
	 */
	public Adapter createEnumerationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.EnumerationInteger <em>Enumeration Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.EnumerationInteger
	 * @generated
	 */
	public Adapter createEnumerationIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.EnumerationSequence <em>Enumeration Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.EnumerationSequence
	 * @generated
	 */
	public Adapter createEnumerationSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.EnumerationString <em>Enumeration String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.EnumerationString
	 * @generated
	 */
	public Adapter createEnumerationStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.EssenceBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.EssenceBase
	 * @generated
	 */
	public Adapter createEssenceBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.GapElement <em>Gap Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.GapElement
	 * @generated
	 */
	public Adapter createGapElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.GeneralInstance <em>General Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.GeneralInstance
	 * @generated
	 */
	public Adapter createGeneralInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.GeneralInterface <em>General Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.GeneralInterface
	 * @generated
	 */
	public Adapter createGeneralInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.GeneralPad <em>General Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.GeneralPad
	 * @generated
	 */
	public Adapter createGeneralPadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.GeneralPort <em>General Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.GeneralPort
	 * @generated
	 */
	public Adapter createGeneralPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.GeneralRegister <em>General Register</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.GeneralRegister
	 * @generated
	 */
	public Adapter createGeneralRegisterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.GenericDecl <em>Generic Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.GenericDecl
	 * @generated
	 */
	public Adapter createGenericDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.GenericDeclBlock <em>Generic Decl Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.GenericDeclBlock
	 * @generated
	 */
	public Adapter createGenericDeclBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.GenericMap <em>Generic Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.GenericMap
	 * @generated
	 */
	public Adapter createGenericMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.IndexVarUser <em>Index Var User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.IndexVarUser
	 * @generated
	 */
	public Adapter createIndexVarUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Instance
	 * @generated
	 */
	public Adapter createInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.InstanceInterfaceMap <em>Instance Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.InstanceInterfaceMap
	 * @generated
	 */
	public Adapter createInstanceInterfaceMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.InstancePortMap <em>Instance Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.InstancePortMap
	 * @generated
	 */
	public Adapter createInstancePortMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.InstanceShellInterfaceMap <em>Instance Shell Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.InstanceShellInterfaceMap
	 * @generated
	 */
	public Adapter createInstanceShellInterfaceMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.InstanceShellPortMap <em>Instance Shell Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.InstanceShellPortMap
	 * @generated
	 */
	public Adapter createInstanceShellPortMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.IntegerDecl <em>Integer Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.IntegerDecl
	 * @generated
	 */
	public Adapter createIntegerDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.IntegerDef <em>Integer Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.IntegerDef
	 * @generated
	 */
	public Adapter createIntegerDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.IntegerGenDecl <em>Integer Gen Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.IntegerGenDecl
	 * @generated
	 */
	public Adapter createIntegerGenDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.InterfaceDefCablePort <em>Interface Def Cable Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.InterfaceDefCablePort
	 * @generated
	 */
	public Adapter createInterfaceDefCablePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.InterfaceDefinition <em>Interface Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.InterfaceDefinition
	 * @generated
	 */
	public Adapter createInterfaceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.InterfaceDefPort <em>Interface Def Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.InterfaceDefPort
	 * @generated
	 */
	public Adapter createInterfaceDefPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.InterfaceDefRole <em>Interface Def Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.InterfaceDefRole
	 * @generated
	 */
	public Adapter createInterfaceDefRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.InterfaceDefTransactionalPort <em>Interface Def Transactional Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.InterfaceDefTransactionalPort
	 * @generated
	 */
	public Adapter createInterfaceDefTransactionalPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.InterfaceDefView <em>Interface Def View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.InterfaceDefView
	 * @generated
	 */
	public Adapter createInterfaceDefViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.InterfaceDefWirePort <em>Interface Def Wire Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.InterfaceDefWirePort
	 * @generated
	 */
	public Adapter createInterfaceDefWirePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.InterfaceInstance <em>Interface Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.InterfaceInstance
	 * @generated
	 */
	public Adapter createInterfaceInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.InterfacePortMap <em>Interface Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.InterfacePortMap
	 * @generated
	 */
	public Adapter createInterfacePortMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.InterfaceView <em>Interface View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.InterfaceView
	 * @generated
	 */
	public Adapter createInterfaceViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.LocalInterfaceMap <em>Local Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.LocalInterfaceMap
	 * @generated
	 */
	public Adapter createLocalInterfaceMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.LocalPortMap <em>Local Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.LocalPortMap
	 * @generated
	 */
	public Adapter createLocalPortMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Memory
	 * @generated
	 */
	public Adapter createMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.MethodDataType <em>Method Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.MethodDataType
	 * @generated
	 */
	public Adapter createMethodDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.MethodDataTypeElement <em>Method Data Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.MethodDataTypeElement
	 * @generated
	 */
	public Adapter createMethodDataTypeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.ModelRoot <em>Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.ModelRoot
	 * @generated
	 */
	public Adapter createModelRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.MultiPad <em>Multi Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.MultiPad
	 * @generated
	 */
	public Adapter createMultiPadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.MultiViewRegister <em>Multi View Register</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.MultiViewRegister
	 * @generated
	 */
	public Adapter createMultiViewRegisterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Net <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Net
	 * @generated
	 */
	public Adapter createNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.NoneInterface <em>None Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.NoneInterface
	 * @generated
	 */
	public Adapter createNoneInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.PackageInstance <em>Package Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.PackageInstance
	 * @generated
	 */
	public Adapter createPackageInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Pad <em>Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Pad
	 * @generated
	 */
	public Adapter createPadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.PadMultiplexed <em>Pad Multiplexed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.PadMultiplexed
	 * @generated
	 */
	public Adapter createPadMultiplexedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.PadNetMap <em>Pad Net Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.PadNetMap
	 * @generated
	 */
	public Adapter createPadNetMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.PadNonMultiplexed <em>Pad Non Multiplexed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.PadNonMultiplexed
	 * @generated
	 */
	public Adapter createPadNonMultiplexedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.PadSpecial <em>Pad Special</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.PadSpecial
	 * @generated
	 */
	public Adapter createPadSpecialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.PadSupply <em>Pad Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.PadSupply
	 * @generated
	 */
	public Adapter createPadSupplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.PadType <em>Pad Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.PadType
	 * @generated
	 */
	public Adapter createPadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.PadTypeDB <em>Pad Type DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.PadTypeDB
	 * @generated
	 */
	public Adapter createPadTypeDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.ParamDecl <em>Param Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.ParamDecl
	 * @generated
	 */
	public Adapter createParamDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.ParamDeclBlock <em>Param Decl Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.ParamDeclBlock
	 * @generated
	 */
	public Adapter createParamDeclBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.ParamMap <em>Param Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.ParamMap
	 * @generated
	 */
	public Adapter createParamMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.PathRef <em>Path Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.PathRef
	 * @generated
	 */
	public Adapter createPathRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Pin
	 * @generated
	 */
	public Adapter createPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.PinNetMap <em>Pin Net Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.PinNetMap
	 * @generated
	 */
	public Adapter createPinNetMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.PortRef <em>Port Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.PortRef
	 * @generated
	 */
	public Adapter createPortRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.PowerDomain <em>Power Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.PowerDomain
	 * @generated
	 */
	public Adapter createPowerDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.ProductInstance <em>Product Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.ProductInstance
	 * @generated
	 */
	public Adapter createProductInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.ProductInterfaceMap <em>Product Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.ProductInterfaceMap
	 * @generated
	 */
	public Adapter createProductInterfaceMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.ProductPadMap <em>Product Pad Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.ProductPadMap
	 * @generated
	 */
	public Adapter createProductPadMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.ProductPinMap <em>Product Pin Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.ProductPinMap
	 * @generated
	 */
	public Adapter createProductPinMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.RealPort <em>Real Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.RealPort
	 * @generated
	 */
	public Adapter createRealPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Record
	 * @generated
	 */
	public Adapter createRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Register <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Register
	 * @generated
	 */
	public Adapter createRegisterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.RegisterView <em>Register View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.RegisterView
	 * @generated
	 */
	public Adapter createRegisterViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.RegMemElement <em>Reg Mem Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.RegMemElement
	 * @generated
	 */
	public Adapter createRegMemElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.RegMemSequence <em>Reg Mem Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.RegMemSequence
	 * @generated
	 */
	public Adapter createRegMemSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.RegMemSet <em>Reg Mem Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.RegMemSet
	 * @generated
	 */
	public Adapter createRegMemSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.RegViewBlock <em>Reg View Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.RegViewBlock
	 * @generated
	 */
	public Adapter createRegViewBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.ResetType <em>Reset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.ResetType
	 * @generated
	 */
	public Adapter createResetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.ReturnDataType <em>Return Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.ReturnDataType
	 * @generated
	 */
	public Adapter createReturnDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.ReturnElementAccess <em>Return Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.ReturnElementAccess
	 * @generated
	 */
	public Adapter createReturnElementAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.SequenceElement <em>Sequence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.SequenceElement
	 * @generated
	 */
	public Adapter createSequenceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.ShellInterfaceMap <em>Shell Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.ShellInterfaceMap
	 * @generated
	 */
	public Adapter createShellInterfaceMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.ShellPortMap <em>Shell Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.ShellPortMap
	 * @generated
	 */
	public Adapter createShellPortMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.SiComponentInstance <em>Si Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.SiComponentInstance
	 * @generated
	 */
	public Adapter createSiComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Signal
	 * @generated
	 */
	public Adapter createSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.SignalMap <em>Signal Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.SignalMap
	 * @generated
	 */
	public Adapter createSignalMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.SignalOwner <em>Signal Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.SignalOwner
	 * @generated
	 */
	public Adapter createSignalOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.SiInstance <em>Si Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.SiInstance
	 * @generated
	 */
	public Adapter createSiInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.SiInstanceInterfaceMap <em>Si Instance Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.SiInstanceInterfaceMap
	 * @generated
	 */
	public Adapter createSiInstanceInterfaceMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.SiInstancePortMap <em>Si Instance Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.SiInstancePortMap
	 * @generated
	 */
	public Adapter createSiInstancePortMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.SiInstanceShellInterfaceMap <em>Si Instance Shell Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.SiInstanceShellInterfaceMap
	 * @generated
	 */
	public Adapter createSiInstanceShellInterfaceMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.SiInstanceShellPortMap <em>Si Instance Shell Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.SiInstanceShellPortMap
	 * @generated
	 */
	public Adapter createSiInstanceShellPortMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Silicon <em>Silicon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Silicon
	 * @generated
	 */
	public Adapter createSiliconAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.SiliconInstance <em>Silicon Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.SiliconInstance
	 * @generated
	 */
	public Adapter createSiliconInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.SimpleDataType <em>Simple Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.SimpleDataType
	 * @generated
	 */
	public Adapter createSimpleDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.SimpleSubElementAccess <em>Simple Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.SimpleSubElementAccess
	 * @generated
	 */
	public Adapter createSimpleSubElementAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.SinglePad <em>Single Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.SinglePad
	 * @generated
	 */
	public Adapter createSinglePadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.SingleSourceNode <em>Single Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.SingleSourceNode
	 * @generated
	 */
	public Adapter createSingleSourceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.SiPort <em>Si Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.SiPort
	 * @generated
	 */
	public Adapter createSiPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.SiPortDB <em>Si Port DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.SiPortDB
	 * @generated
	 */
	public Adapter createSiPortDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.SiPortReq <em>Si Port Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.SiPortReq
	 * @generated
	 */
	public Adapter createSiPortReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.SiSignal <em>Si Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.SiSignal
	 * @generated
	 */
	public Adapter createSiSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.SiSignalDB <em>Si Signal DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.SiSignalDB
	 * @generated
	 */
	public Adapter createSiSignalDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.SiSystemInstance <em>Si System Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.SiSystemInstance
	 * @generated
	 */
	public Adapter createSiSystemInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.StringDecl <em>String Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.StringDecl
	 * @generated
	 */
	public Adapter createStringDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.StringDef <em>String Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.StringDef
	 * @generated
	 */
	public Adapter createStringDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.StringGenDecl <em>String Gen Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.StringGenDecl
	 * @generated
	 */
	public Adapter createStringGenDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.SubElementAccess <em>Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.SubElementAccess
	 * @generated
	 */
	public Adapter createSubElementAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.SystemInstance <em>System Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.SystemInstance
	 * @generated
	 */
	public Adapter createSystemInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Test
	 * @generated
	 */
	public Adapter createTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.TestDB <em>Test DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.TestDB
	 * @generated
	 */
	public Adapter createTestDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.TestReq <em>Test Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.TestReq
	 * @generated
	 */
	public Adapter createTestReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.TransactionalPort <em>Transactional Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.TransactionalPort
	 * @generated
	 */
	public Adapter createTransactionalPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.TransactionalSignal <em>Transactional Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.TransactionalSignal
	 * @generated
	 */
	public Adapter createTransactionalSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Union
	 * @generated
	 */
	public Adapter createUnionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.ValueDataType <em>Value Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.ValueDataType
	 * @generated
	 */
	public Adapter createValueDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.VarDef <em>Var Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.VarDef
	 * @generated
	 */
	public Adapter createVarDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.VarDefBlock <em>Var Def Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.VarDefBlock
	 * @generated
	 */
	public Adapter createVarDefBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.VLNV <em>VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.VLNV
	 * @generated
	 */
	public Adapter createVLNVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.Void <em>Void</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.Void
	 * @generated
	 */
	public Adapter createVoidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.WirePort <em>Wire Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.WirePort
	 * @generated
	 */
	public Adapter createWirePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.WireSignal <em>Wire Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.WireSignal
	 * @generated
	 */
	public Adapter createWireSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRef <em>XRef</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRef
	 * @generated
	 */
	public Adapter createXRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefConnection <em>XRef Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefConnection
	 * @generated
	 */
	public Adapter createXRefConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefDataVar <em>XRef Data Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefDataVar
	 * @generated
	 */
	public Adapter createXRefDataVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefDirect <em>XRef Direct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefDirect
	 * @generated
	 */
	public Adapter createXRefDirectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefExternal <em>XRef External</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefExternal
	 * @generated
	 */
	public Adapter createXRefExternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefExternalInterface <em>XRef External Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefExternalInterface
	 * @generated
	 */
	public Adapter createXRefExternalInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefExternalPort <em>XRef External Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefExternalPort
	 * @generated
	 */
	public Adapter createXRefExternalPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefExternalSignal <em>XRef External Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefExternalSignal
	 * @generated
	 */
	public Adapter createXRefExternalSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefGenericDecl <em>XRef Generic Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefGenericDecl
	 * @generated
	 */
	public Adapter createXRefGenericDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefIFDPort <em>XRef IFD Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefIFDPort
	 * @generated
	 */
	public Adapter createXRefIFDPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefIndInterface <em>XRef Ind Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefIndInterface
	 * @generated
	 */
	public Adapter createXRefIndInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefIndirect <em>XRef Indirect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefIndirect
	 * @generated
	 */
	public Adapter createXRefIndirectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefIndPin <em>XRef Ind Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefIndPin
	 * @generated
	 */
	public Adapter createXRefIndPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefIndPort <em>XRef Ind Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefIndPort
	 * @generated
	 */
	public Adapter createXRefIndPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefIndSinglePad <em>XRef Ind Single Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefIndSinglePad
	 * @generated
	 */
	public Adapter createXRefIndSinglePadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefInstance <em>XRef Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefInstance
	 * @generated
	 */
	public Adapter createXRefInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefInternal <em>XRef Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefInternal
	 * @generated
	 */
	public Adapter createXRefInternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefInternalInterface <em>XRef Internal Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefInternalInterface
	 * @generated
	 */
	public Adapter createXRefInternalInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefInternalPort <em>XRef Internal Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefInternalPort
	 * @generated
	 */
	public Adapter createXRefInternalPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefInternalSignal <em>XRef Internal Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefInternalSignal
	 * @generated
	 */
	public Adapter createXRefInternalSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefMasterInterface <em>XRef Master Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefMasterInterface
	 * @generated
	 */
	public Adapter createXRefMasterInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefNet <em>XRef Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefNet
	 * @generated
	 */
	public Adapter createXRefNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefNoneInterface <em>XRef None Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefNoneInterface
	 * @generated
	 */
	public Adapter createXRefNoneInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefPadType <em>XRef Pad Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefPadType
	 * @generated
	 */
	public Adapter createXRefPadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefParamDecl <em>XRef Param Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefParamDecl
	 * @generated
	 */
	public Adapter createXRefParamDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefPin <em>XRef Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefPin
	 * @generated
	 */
	public Adapter createXRefPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefPowerDomain <em>XRef Power Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefPowerDomain
	 * @generated
	 */
	public Adapter createXRefPowerDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefRealPort <em>XRef Real Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefRealPort
	 * @generated
	 */
	public Adapter createXRefRealPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefRegisterView <em>XRef Register View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefRegisterView
	 * @generated
	 */
	public Adapter createXRefRegisterViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefRegMemSet <em>XRef Reg Mem Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefRegMemSet
	 * @generated
	 */
	public Adapter createXRefRegMemSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefSinglePad <em>XRef Single Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefSinglePad
	 * @generated
	 */
	public Adapter createXRefSinglePadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefSiPort <em>XRef Si Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefSiPort
	 * @generated
	 */
	public Adapter createXRefSiPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefSiSignal <em>XRef Si Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefSiSignal
	 * @generated
	 */
	public Adapter createXRefSiSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefSlaveInterface <em>XRef Slave Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefSlaveInterface
	 * @generated
	 */
	public Adapter createXRefSlaveInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefTest <em>XRef Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefTest
	 * @generated
	 */
	public Adapter createXRefTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Essence.XRefVLNV <em>XRef VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Essence.XRefVLNV
	 * @generated
	 */
	public Adapter createXRefVLNVAdapter() {
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

} //EssenceAdapterFactory
