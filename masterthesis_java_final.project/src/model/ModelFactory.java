/**
 */
package model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access</em>'.
	 * @generated
	 */
	Access createAccess();

	/**
	 * Returns a new object of class '<em>Access By Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access By Index</em>'.
	 * @generated
	 */
	AccessByIndex createAccessByIndex();

	/**
	 * Returns a new object of class '<em>Access By Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access By Name</em>'.
	 * @generated
	 */
	AccessByName createAccessByName();

	/**
	 * Returns a new object of class '<em>Access Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Condition</em>'.
	 * @generated
	 */
	AccessCondition createAccessCondition();

	/**
	 * Returns a new object of class '<em>Access Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Level</em>'.
	 * @generated
	 */
	AccessLevel createAccessLevel();

	/**
	 * Returns a new object of class '<em>Address Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Block</em>'.
	 * @generated
	 */
	AddressBlock createAddressBlock();

	/**
	 * Returns a new object of class '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array</em>'.
	 * @generated
	 */
	Array createArray();

	/**
	 * Returns a new object of class '<em>Array Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Dimension</em>'.
	 * @generated
	 */
	ArrayDimension createArrayDimension();

	/**
	 * Returns a new object of class '<em>Bit Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bit Field</em>'.
	 * @generated
	 */
	BitField createBitField();

	/**
	 * Returns a new object of class '<em>Bit Field Gap Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bit Field Gap Element</em>'.
	 * @generated
	 */
	BitFieldGapElement createBitFieldGapElement();

	/**
	 * Returns a new object of class '<em>Bit Field Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bit Field Sequence</em>'.
	 * @generated
	 */
	BitFieldSequence createBitFieldSequence();

	/**
	 * Returns a new object of class '<em>Boolean Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Decl</em>'.
	 * @generated
	 */
	BooleanDecl createBooleanDecl();

	/**
	 * Returns a new object of class '<em>Boolean Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Def</em>'.
	 * @generated
	 */
	BooleanDef createBooleanDef();

	/**
	 * Returns a new object of class '<em>Boolean Gen Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Gen Decl</em>'.
	 * @generated
	 */
	BooleanGenDecl createBooleanGenDecl();

	/**
	 * Returns a new object of class '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus</em>'.
	 * @generated
	 */
	Bus createBus();

	/**
	 * Returns a new object of class '<em>Bus Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Instance</em>'.
	 * @generated
	 */
	BusInstance createBusInstance();

	/**
	 * Returns a new object of class '<em>Bus Interface Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Interface Map</em>'.
	 * @generated
	 */
	BusInterfaceMap createBusInterfaceMap();

	/**
	 * Returns a new object of class '<em>Bus None Interface Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus None Interface Map</em>'.
	 * @generated
	 */
	BusNoneInterfaceMap createBusNoneInterfaceMap();

	/**
	 * Returns a new object of class '<em>Cable Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cable Port</em>'.
	 * @generated
	 */
	CablePort createCablePort();

	/**
	 * Returns a new object of class '<em>Cable Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cable Signal</em>'.
	 * @generated
	 */
	CableSignal createCableSignal();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instance</em>'.
	 * @generated
	 */
	ComponentInstance createComponentInstance();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Const Def Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Const Def Block</em>'.
	 * @generated
	 */
	ConstDefBlock createConstDefBlock();

	/**
	 * Returns a new object of class '<em>Data Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Decl</em>'.
	 * @generated
	 */
	DataDecl createDataDecl();

	/**
	 * Returns a new object of class '<em>Data Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Def</em>'.
	 * @generated
	 */
	DataDef createDataDef();

	/**
	 * Returns a new object of class '<em>Data Gen Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Gen Decl</em>'.
	 * @generated
	 */
	DataGenDecl createDataGenDecl();

	/**
	 * Returns a new object of class '<em>Data Type Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type Element</em>'.
	 * @generated
	 */
	DataTypeElement createDataTypeElement();

	/**
	 * Returns a new object of class '<em>Description Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description Item</em>'.
	 * @generated
	 */
	DescriptionItem createDescriptionItem();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum</em>'.
	 * @generated
	 */
	Enum createEnum();

	/**
	 * Returns a new object of class '<em>Enum Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Element</em>'.
	 * @generated
	 */
	EnumElement createEnumElement();

	/**
	 * Returns a new object of class '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration</em>'.
	 * @generated
	 */
	Enumeration createEnumeration();

	/**
	 * Returns a new object of class '<em>Enumeration Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Integer</em>'.
	 * @generated
	 */
	EnumerationInteger createEnumerationInteger();

	/**
	 * Returns a new object of class '<em>Enumeration Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Sequence</em>'.
	 * @generated
	 */
	EnumerationSequence createEnumerationSequence();

	/**
	 * Returns a new object of class '<em>Enumeration String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration String</em>'.
	 * @generated
	 */
	EnumerationString createEnumerationString();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>Gap Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gap Element</em>'.
	 * @generated
	 */
	GapElement createGapElement();

	/**
	 * Returns a new object of class '<em>Generic Decl Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Decl Block</em>'.
	 * @generated
	 */
	GenericDeclBlock createGenericDeclBlock();

	/**
	 * Returns a new object of class '<em>Generic Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Map</em>'.
	 * @generated
	 */
	GenericMap createGenericMap();

	/**
	 * Returns a new object of class '<em>Instance Interface Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Interface Map</em>'.
	 * @generated
	 */
	InstanceInterfaceMap createInstanceInterfaceMap();

	/**
	 * Returns a new object of class '<em>Instance Port Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Port Map</em>'.
	 * @generated
	 */
	InstancePortMap createInstancePortMap();

	/**
	 * Returns a new object of class '<em>Instance Shell Interface Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Shell Interface Map</em>'.
	 * @generated
	 */
	InstanceShellInterfaceMap createInstanceShellInterfaceMap();

	/**
	 * Returns a new object of class '<em>Instance Shell Port Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Shell Port Map</em>'.
	 * @generated
	 */
	InstanceShellPortMap createInstanceShellPortMap();

	/**
	 * Returns a new object of class '<em>Integer Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Decl</em>'.
	 * @generated
	 */
	IntegerDecl createIntegerDecl();

	/**
	 * Returns a new object of class '<em>Integer Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Def</em>'.
	 * @generated
	 */
	IntegerDef createIntegerDef();

	/**
	 * Returns a new object of class '<em>Integer Gen Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Gen Decl</em>'.
	 * @generated
	 */
	IntegerGenDecl createIntegerGenDecl();

	/**
	 * Returns a new object of class '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface</em>'.
	 * @generated
	 */
	Interface createInterface();

	/**
	 * Returns a new object of class '<em>Interface Def Cable Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Def Cable Port</em>'.
	 * @generated
	 */
	InterfaceDefCablePort createInterfaceDefCablePort();

	/**
	 * Returns a new object of class '<em>Interface Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Definition</em>'.
	 * @generated
	 */
	InterfaceDefinition createInterfaceDefinition();

	/**
	 * Returns a new object of class '<em>Interface Def Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Def Role</em>'.
	 * @generated
	 */
	InterfaceDefRole createInterfaceDefRole();

	/**
	 * Returns a new object of class '<em>Interface Def Transactional Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Def Transactional Port</em>'.
	 * @generated
	 */
	InterfaceDefTransactionalPort createInterfaceDefTransactionalPort();

	/**
	 * Returns a new object of class '<em>Interface Def View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Def View</em>'.
	 * @generated
	 */
	InterfaceDefView createInterfaceDefView();

	/**
	 * Returns a new object of class '<em>Interface Def Wire Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Def Wire Port</em>'.
	 * @generated
	 */
	InterfaceDefWirePort createInterfaceDefWirePort();

	/**
	 * Returns a new object of class '<em>Interface Port Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Port Map</em>'.
	 * @generated
	 */
	InterfacePortMap createInterfacePortMap();

	/**
	 * Returns a new object of class '<em>Interface View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface View</em>'.
	 * @generated
	 */
	InterfaceView createInterfaceView();

	/**
	 * Returns a new object of class '<em>Local Interface Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Interface Map</em>'.
	 * @generated
	 */
	LocalInterfaceMap createLocalInterfaceMap();

	/**
	 * Returns a new object of class '<em>Local Port Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Port Map</em>'.
	 * @generated
	 */
	LocalPortMap createLocalPortMap();

	/**
	 * Returns a new object of class '<em>Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory</em>'.
	 * @generated
	 */
	Memory createMemory();

	/**
	 * Returns a new object of class '<em>Method Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Data Type</em>'.
	 * @generated
	 */
	MethodDataType createMethodDataType();

	/**
	 * Returns a new object of class '<em>Method Data Type Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Data Type Element</em>'.
	 * @generated
	 */
	MethodDataTypeElement createMethodDataTypeElement();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	Module createModule();

	/**
	 * Returns a new object of class '<em>Multi Pad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Pad</em>'.
	 * @generated
	 */
	MultiPad createMultiPad();

	/**
	 * Returns a new object of class '<em>Multi View Register</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi View Register</em>'.
	 * @generated
	 */
	MultiViewRegister createMultiViewRegister();

	/**
	 * Returns a new object of class '<em>Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Net</em>'.
	 * @generated
	 */
	Net createNet();

	/**
	 * Returns a new object of class '<em>None Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>None Interface</em>'.
	 * @generated
	 */
	NoneInterface createNoneInterface();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>Package Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Instance</em>'.
	 * @generated
	 */
	PackageInstance createPackageInstance();

	/**
	 * Returns a new object of class '<em>Pad Multiplexed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pad Multiplexed</em>'.
	 * @generated
	 */
	PadMultiplexed createPadMultiplexed();

	/**
	 * Returns a new object of class '<em>Pad Net Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pad Net Map</em>'.
	 * @generated
	 */
	PadNetMap createPadNetMap();

	/**
	 * Returns a new object of class '<em>Pad Non Multiplexed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pad Non Multiplexed</em>'.
	 * @generated
	 */
	PadNonMultiplexed createPadNonMultiplexed();

	/**
	 * Returns a new object of class '<em>Pad Special</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pad Special</em>'.
	 * @generated
	 */
	PadSpecial createPadSpecial();

	/**
	 * Returns a new object of class '<em>Pad Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pad Supply</em>'.
	 * @generated
	 */
	PadSupply createPadSupply();

	/**
	 * Returns a new object of class '<em>Pad Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pad Type</em>'.
	 * @generated
	 */
	PadType createPadType();

	/**
	 * Returns a new object of class '<em>Pad Type DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pad Type DB</em>'.
	 * @generated
	 */
	PadTypeDB createPadTypeDB();

	/**
	 * Returns a new object of class '<em>Param Decl Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param Decl Block</em>'.
	 * @generated
	 */
	ParamDeclBlock createParamDeclBlock();

	/**
	 * Returns a new object of class '<em>Param Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param Map</em>'.
	 * @generated
	 */
	ParamMap createParamMap();

	/**
	 * Returns a new object of class '<em>Path Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Ref</em>'.
	 * @generated
	 */
	PathRef createPathRef();

	/**
	 * Returns a new object of class '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pin</em>'.
	 * @generated
	 */
	Pin createPin();

	/**
	 * Returns a new object of class '<em>Pin Net Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pin Net Map</em>'.
	 * @generated
	 */
	PinNetMap createPinNetMap();

	/**
	 * Returns a new object of class '<em>Port Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Ref</em>'.
	 * @generated
	 */
	PortRef createPortRef();

	/**
	 * Returns a new object of class '<em>Power Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Domain</em>'.
	 * @generated
	 */
	PowerDomain createPowerDomain();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Instance</em>'.
	 * @generated
	 */
	ProductInstance createProductInstance();

	/**
	 * Returns a new object of class '<em>Product Interface Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Interface Map</em>'.
	 * @generated
	 */
	ProductInterfaceMap createProductInterfaceMap();

	/**
	 * Returns a new object of class '<em>Product Pad Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Pad Map</em>'.
	 * @generated
	 */
	ProductPadMap createProductPadMap();

	/**
	 * Returns a new object of class '<em>Product Pin Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Pin Map</em>'.
	 * @generated
	 */
	ProductPinMap createProductPinMap();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record</em>'.
	 * @generated
	 */
	Record createRecord();

	/**
	 * Returns a new object of class '<em>Register</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Register</em>'.
	 * @generated
	 */
	Register createRegister();

	/**
	 * Returns a new object of class '<em>Register View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Register View</em>'.
	 * @generated
	 */
	RegisterView createRegisterView();

	/**
	 * Returns a new object of class '<em>Reg Mem Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reg Mem Sequence</em>'.
	 * @generated
	 */
	RegMemSequence createRegMemSequence();

	/**
	 * Returns a new object of class '<em>Reg Mem Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reg Mem Set</em>'.
	 * @generated
	 */
	RegMemSet createRegMemSet();

	/**
	 * Returns a new object of class '<em>Reg View Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reg View Block</em>'.
	 * @generated
	 */
	RegViewBlock createRegViewBlock();

	/**
	 * Returns a new object of class '<em>Reset Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset Type</em>'.
	 * @generated
	 */
	ResetType createResetType();

	/**
	 * Returns a new object of class '<em>Return Element Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Element Access</em>'.
	 * @generated
	 */
	ReturnElementAccess createReturnElementAccess();

	/**
	 * Returns a new object of class '<em>Shell Interface Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shell Interface Map</em>'.
	 * @generated
	 */
	ShellInterfaceMap createShellInterfaceMap();

	/**
	 * Returns a new object of class '<em>Shell Port Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shell Port Map</em>'.
	 * @generated
	 */
	ShellPortMap createShellPortMap();

	/**
	 * Returns a new object of class '<em>Si Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Si Component Instance</em>'.
	 * @generated
	 */
	SiComponentInstance createSiComponentInstance();

	/**
	 * Returns a new object of class '<em>Signal Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Map</em>'.
	 * @generated
	 */
	SignalMap createSignalMap();

	/**
	 * Returns a new object of class '<em>Si Instance Interface Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Si Instance Interface Map</em>'.
	 * @generated
	 */
	SiInstanceInterfaceMap createSiInstanceInterfaceMap();

	/**
	 * Returns a new object of class '<em>Si Instance Port Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Si Instance Port Map</em>'.
	 * @generated
	 */
	SiInstancePortMap createSiInstancePortMap();

	/**
	 * Returns a new object of class '<em>Si Instance Shell Interface Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Si Instance Shell Interface Map</em>'.
	 * @generated
	 */
	SiInstanceShellInterfaceMap createSiInstanceShellInterfaceMap();

	/**
	 * Returns a new object of class '<em>Si Instance Shell Port Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Si Instance Shell Port Map</em>'.
	 * @generated
	 */
	SiInstanceShellPortMap createSiInstanceShellPortMap();

	/**
	 * Returns a new object of class '<em>Silicon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Silicon</em>'.
	 * @generated
	 */
	Silicon createSilicon();

	/**
	 * Returns a new object of class '<em>Silicon Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Silicon Instance</em>'.
	 * @generated
	 */
	SiliconInstance createSiliconInstance();

	/**
	 * Returns a new object of class '<em>Simple Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Data Type</em>'.
	 * @generated
	 */
	SimpleDataType createSimpleDataType();

	/**
	 * Returns a new object of class '<em>Si Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Si Port</em>'.
	 * @generated
	 */
	SiPort createSiPort();

	/**
	 * Returns a new object of class '<em>Si Port DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Si Port DB</em>'.
	 * @generated
	 */
	SiPortDB createSiPortDB();

	/**
	 * Returns a new object of class '<em>Si Port Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Si Port Req</em>'.
	 * @generated
	 */
	SiPortReq createSiPortReq();

	/**
	 * Returns a new object of class '<em>Si Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Si Signal</em>'.
	 * @generated
	 */
	SiSignal createSiSignal();

	/**
	 * Returns a new object of class '<em>Si Signal DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Si Signal DB</em>'.
	 * @generated
	 */
	SiSignalDB createSiSignalDB();

	/**
	 * Returns a new object of class '<em>Si System Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Si System Instance</em>'.
	 * @generated
	 */
	SiSystemInstance createSiSystemInstance();

	/**
	 * Returns a new object of class '<em>String Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Decl</em>'.
	 * @generated
	 */
	StringDecl createStringDecl();

	/**
	 * Returns a new object of class '<em>String Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Def</em>'.
	 * @generated
	 */
	StringDef createStringDef();

	/**
	 * Returns a new object of class '<em>String Gen Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Gen Decl</em>'.
	 * @generated
	 */
	StringGenDecl createStringGenDecl();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>System Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Instance</em>'.
	 * @generated
	 */
	SystemInstance createSystemInstance();

	/**
	 * Returns a new object of class '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test</em>'.
	 * @generated
	 */
	Test createTest();

	/**
	 * Returns a new object of class '<em>Test DB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test DB</em>'.
	 * @generated
	 */
	TestDB createTestDB();

	/**
	 * Returns a new object of class '<em>Test Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Req</em>'.
	 * @generated
	 */
	TestReq createTestReq();

	/**
	 * Returns a new object of class '<em>Transactional Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transactional Port</em>'.
	 * @generated
	 */
	TransactionalPort createTransactionalPort();

	/**
	 * Returns a new object of class '<em>Transactional Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transactional Signal</em>'.
	 * @generated
	 */
	TransactionalSignal createTransactionalSignal();

	/**
	 * Returns a new object of class '<em>Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union</em>'.
	 * @generated
	 */
	Union createUnion();

	/**
	 * Returns a new object of class '<em>VLNV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VLNV</em>'.
	 * @generated
	 */
	VLNV createVLNV();

	/**
	 * Returns a new object of class '<em>Void</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Void</em>'.
	 * @generated
	 */
	Void createVoid();

	/**
	 * Returns a new object of class '<em>Wire Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wire Port</em>'.
	 * @generated
	 */
	WirePort createWirePort();

	/**
	 * Returns a new object of class '<em>Wire Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wire Signal</em>'.
	 * @generated
	 */
	WireSignal createWireSignal();

	/**
	 * Returns a new object of class '<em>XRef Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Connection</em>'.
	 * @generated
	 */
	XRefConnection createXRefConnection();

	/**
	 * Returns a new object of class '<em>XRef Data Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Data Var</em>'.
	 * @generated
	 */
	XRefDataVar createXRefDataVar();

	/**
	 * Returns a new object of class '<em>XRef External Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef External Interface</em>'.
	 * @generated
	 */
	XRefExternalInterface createXRefExternalInterface();

	/**
	 * Returns a new object of class '<em>XRef External Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef External Port</em>'.
	 * @generated
	 */
	XRefExternalPort createXRefExternalPort();

	/**
	 * Returns a new object of class '<em>XRef External Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef External Signal</em>'.
	 * @generated
	 */
	XRefExternalSignal createXRefExternalSignal();

	/**
	 * Returns a new object of class '<em>XRef Generic Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Generic Decl</em>'.
	 * @generated
	 */
	XRefGenericDecl createXRefGenericDecl();

	/**
	 * Returns a new object of class '<em>XRef IFD Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef IFD Port</em>'.
	 * @generated
	 */
	XRefIFDPort createXRefIFDPort();

	/**
	 * Returns a new object of class '<em>XRef Ind Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Ind Interface</em>'.
	 * @generated
	 */
	XRefIndInterface createXRefIndInterface();

	/**
	 * Returns a new object of class '<em>XRef Ind Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Ind Pin</em>'.
	 * @generated
	 */
	XRefIndPin createXRefIndPin();

	/**
	 * Returns a new object of class '<em>XRef Ind Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Ind Port</em>'.
	 * @generated
	 */
	XRefIndPort createXRefIndPort();

	/**
	 * Returns a new object of class '<em>XRef Ind Single Pad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Ind Single Pad</em>'.
	 * @generated
	 */
	XRefIndSinglePad createXRefIndSinglePad();

	/**
	 * Returns a new object of class '<em>XRef Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Instance</em>'.
	 * @generated
	 */
	XRefInstance createXRefInstance();

	/**
	 * Returns a new object of class '<em>XRef Internal Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Internal Interface</em>'.
	 * @generated
	 */
	XRefInternalInterface createXRefInternalInterface();

	/**
	 * Returns a new object of class '<em>XRef Internal Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Internal Port</em>'.
	 * @generated
	 */
	XRefInternalPort createXRefInternalPort();

	/**
	 * Returns a new object of class '<em>XRef Internal Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Internal Signal</em>'.
	 * @generated
	 */
	XRefInternalSignal createXRefInternalSignal();

	/**
	 * Returns a new object of class '<em>XRef Master Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Master Interface</em>'.
	 * @generated
	 */
	XRefMasterInterface createXRefMasterInterface();

	/**
	 * Returns a new object of class '<em>XRef Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Net</em>'.
	 * @generated
	 */
	XRefNet createXRefNet();

	/**
	 * Returns a new object of class '<em>XRef None Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef None Interface</em>'.
	 * @generated
	 */
	XRefNoneInterface createXRefNoneInterface();

	/**
	 * Returns a new object of class '<em>XRef Pad Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Pad Type</em>'.
	 * @generated
	 */
	XRefPadType createXRefPadType();

	/**
	 * Returns a new object of class '<em>XRef Param Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Param Decl</em>'.
	 * @generated
	 */
	XRefParamDecl createXRefParamDecl();

	/**
	 * Returns a new object of class '<em>XRef Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Pin</em>'.
	 * @generated
	 */
	XRefPin createXRefPin();

	/**
	 * Returns a new object of class '<em>XRef Power Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Power Domain</em>'.
	 * @generated
	 */
	XRefPowerDomain createXRefPowerDomain();

	/**
	 * Returns a new object of class '<em>XRef Real Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Real Port</em>'.
	 * @generated
	 */
	XRefRealPort createXRefRealPort();

	/**
	 * Returns a new object of class '<em>XRef Register View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Register View</em>'.
	 * @generated
	 */
	XRefRegisterView createXRefRegisterView();

	/**
	 * Returns a new object of class '<em>XRef Reg Mem Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Reg Mem Set</em>'.
	 * @generated
	 */
	XRefRegMemSet createXRefRegMemSet();

	/**
	 * Returns a new object of class '<em>XRef Single Pad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Single Pad</em>'.
	 * @generated
	 */
	XRefSinglePad createXRefSinglePad();

	/**
	 * Returns a new object of class '<em>XRef Si Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Si Port</em>'.
	 * @generated
	 */
	XRefSiPort createXRefSiPort();

	/**
	 * Returns a new object of class '<em>XRef Si Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Si Signal</em>'.
	 * @generated
	 */
	XRefSiSignal createXRefSiSignal();

	/**
	 * Returns a new object of class '<em>XRef Slave Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Slave Interface</em>'.
	 * @generated
	 */
	XRefSlaveInterface createXRefSlaveInterface();

	/**
	 * Returns a new object of class '<em>XRef Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRef Test</em>'.
	 * @generated
	 */
	XRefTest createXRefTest();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
