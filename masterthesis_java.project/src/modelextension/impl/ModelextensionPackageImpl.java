/**
 */
package modelextension.impl;

import model.ModelPackage;

import model.impl.ModelPackageImpl;

import modelextension.BitResetType;
import modelextension.CommonAccessLevel;
import modelextension.DataTypeOwner;
import modelextension.EssenceBaseExtension;
import modelextension.ModelextensionFactory;
import modelextension.ModelextensionPackage;
import modelextension.Offset;
import modelextension.OffsetSequence;
import modelextension.OffsetSequenceElement;
import modelextension.SequenceBase;
import modelextension.SequenceElementBase;
import modelextension.UnresolvedReference;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelextensionPackageImpl extends EPackageImpl implements ModelextensionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass essenceBaseExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceElementBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offsetSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offsetSequenceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonAccessLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitResetTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see modelextension.ModelextensionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelextensionPackageImpl() {
		super(eNS_URI, ModelextensionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelextensionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelextensionPackage init() {
		if (isInited) return (ModelextensionPackage)EPackage.Registry.INSTANCE.getEPackage(ModelextensionPackage.eNS_URI);

		// Obtain or create and register package
		ModelextensionPackageImpl theModelextensionPackage = (ModelextensionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelextensionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelextensionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);

		// Load packages
		theModelPackage.loadPackage();

		// Create package meta-data objects
		theModelextensionPackage.createPackageContents();

		// Initialize created meta-data
		theModelextensionPackage.initializePackageContents();

		// Fix loaded packages
		theModelPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelextensionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelextensionPackage.eNS_URI, theModelextensionPackage);
		return theModelextensionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnresolvedReference() {
		return unresolvedReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEssenceBaseExtension() {
		return essenceBaseExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEssenceBaseExtension_Parent() {
		return (EReference)essenceBaseExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceBase() {
		return sequenceBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceBase__GetCountValue__Map() {
		return sequenceBaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceBase__GetMinIndexValue__Map() {
		return sequenceBaseEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceBase__GetIndexStepValue__Map() {
		return sequenceBaseEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceBase__GetIndexVar() {
		return sequenceBaseEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceBase__GetElement() {
		return sequenceBaseEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceBase__GetAltFormat() {
		return sequenceBaseEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceElementBase() {
		return sequenceElementBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceElementBase_SequenceIndex() {
		return (EAttribute)sequenceElementBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffset() {
		return offsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOffset__GetOffsetValue__Map() {
		return offsetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOffset__SetOffset__String() {
		return offsetEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffsetSequence() {
		return offsetSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOffsetSequence__GetLength__Map() {
		return offsetSequenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOffsetSequence__GetElement() {
		return offsetSequenceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffsetSequenceElement() {
		return offsetSequenceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOffsetSequenceElement__GetLength__Map() {
		return offsetSequenceElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOffsetSequenceElement__GetFullLength__Map() {
		return offsetSequenceElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonAccessLevel() {
		return commonAccessLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonAccessLevel_CommonAccessLevel() {
		return (EReference)commonAccessLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommonAccessLevel__RefreshCommonAccessLevel() {
		return commonAccessLevelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeOwner() {
		return dataTypeOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataTypeOwner__GetDataType() {
		return dataTypeOwnerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitResetType() {
		return bitResetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBitResetType_BitResetType() {
		return (EReference)bitResetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBitResetType__RefreshBitResetType() {
		return bitResetTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelextensionFactory getModelextensionFactory() {
		return (ModelextensionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		unresolvedReferenceEClass = createEClass(UNRESOLVED_REFERENCE);

		essenceBaseExtensionEClass = createEClass(ESSENCE_BASE_EXTENSION);
		createEReference(essenceBaseExtensionEClass, ESSENCE_BASE_EXTENSION__PARENT);

		sequenceBaseEClass = createEClass(SEQUENCE_BASE);
		createEOperation(sequenceBaseEClass, SEQUENCE_BASE___GET_COUNT_VALUE__MAP);
		createEOperation(sequenceBaseEClass, SEQUENCE_BASE___GET_MIN_INDEX_VALUE__MAP);
		createEOperation(sequenceBaseEClass, SEQUENCE_BASE___GET_INDEX_STEP_VALUE__MAP);
		createEOperation(sequenceBaseEClass, SEQUENCE_BASE___GET_INDEX_VAR);
		createEOperation(sequenceBaseEClass, SEQUENCE_BASE___GET_ELEMENT);
		createEOperation(sequenceBaseEClass, SEQUENCE_BASE___GET_ALT_FORMAT);

		sequenceElementBaseEClass = createEClass(SEQUENCE_ELEMENT_BASE);
		createEAttribute(sequenceElementBaseEClass, SEQUENCE_ELEMENT_BASE__SEQUENCE_INDEX);

		offsetEClass = createEClass(OFFSET);
		createEOperation(offsetEClass, OFFSET___GET_OFFSET_VALUE__MAP);
		createEOperation(offsetEClass, OFFSET___SET_OFFSET__STRING);

		offsetSequenceEClass = createEClass(OFFSET_SEQUENCE);
		createEOperation(offsetSequenceEClass, OFFSET_SEQUENCE___GET_LENGTH__MAP);
		createEOperation(offsetSequenceEClass, OFFSET_SEQUENCE___GET_ELEMENT);

		offsetSequenceElementEClass = createEClass(OFFSET_SEQUENCE_ELEMENT);
		createEOperation(offsetSequenceElementEClass, OFFSET_SEQUENCE_ELEMENT___GET_LENGTH__MAP);
		createEOperation(offsetSequenceElementEClass, OFFSET_SEQUENCE_ELEMENT___GET_FULL_LENGTH__MAP);

		commonAccessLevelEClass = createEClass(COMMON_ACCESS_LEVEL);
		createEReference(commonAccessLevelEClass, COMMON_ACCESS_LEVEL__COMMON_ACCESS_LEVEL);
		createEOperation(commonAccessLevelEClass, COMMON_ACCESS_LEVEL___REFRESH_COMMON_ACCESS_LEVEL);

		dataTypeOwnerEClass = createEClass(DATA_TYPE_OWNER);
		createEOperation(dataTypeOwnerEClass, DATA_TYPE_OWNER___GET_DATA_TYPE);

		bitResetTypeEClass = createEClass(BIT_RESET_TYPE);
		createEReference(bitResetTypeEClass, BIT_RESET_TYPE__BIT_RESET_TYPE);
		createEOperation(bitResetTypeEClass, BIT_RESET_TYPE___REFRESH_BIT_RESET_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Create type parameters
		ETypeParameter sequenceBaseEClass_T = addETypeParameter(sequenceBaseEClass, "T");
		ETypeParameter offsetSequenceEClass_T = addETypeParameter(offsetSequenceEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getSequenceElementBase());
		sequenceBaseEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getOffsetSequenceElement());
		offsetSequenceEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		unresolvedReferenceEClass.getESuperTypes().add(theModelPackage.getSingleSourceNode());
		g1 = createEGenericType(this.getOffset());
		offsetSequenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSequenceBase());
		EGenericType g2 = createEGenericType(offsetSequenceEClass_T);
		g1.getETypeArguments().add(g2);
		offsetSequenceEClass.getEGenericSuperTypes().add(g1);
		offsetSequenceElementEClass.getESuperTypes().add(this.getSequenceElementBase());
		offsetSequenceElementEClass.getESuperTypes().add(this.getOffset());

		// Initialize classes, features, and operations; add parameters
		initEClass(unresolvedReferenceEClass, UnresolvedReference.class, "UnresolvedReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(essenceBaseExtensionEClass, EssenceBaseExtension.class, "EssenceBaseExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEssenceBaseExtension_Parent(), theModelPackage.getEssenceBase(), null, "Parent", null, 0, 1, EssenceBaseExtension.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(sequenceBaseEClass, SequenceBase.class, "SequenceBase", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getSequenceBase__GetCountValue__Map(), ecorePackage.getEBigInteger(), "getCountValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ixVars", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSequenceBase__GetMinIndexValue__Map(), ecorePackage.getEBigInteger(), "getMinIndexValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ixVars", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSequenceBase__GetIndexStepValue__Map(), ecorePackage.getEBigInteger(), "getIndexStepValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ixVars", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSequenceBase__GetIndexVar(), ecorePackage.getEString(), "getIndexVar", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSequenceBase__GetElement(), null, "getElement", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(sequenceBaseEClass_T);
		initEOperation(op, g1);

		initEOperation(getSequenceBase__GetAltFormat(), ecorePackage.getEString(), "getAltFormat", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sequenceElementBaseEClass, SequenceElementBase.class, "SequenceElementBase", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSequenceElementBase_SequenceIndex(), ecorePackage.getEInt(), "SequenceIndex", null, 0, 1, SequenceElementBase.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offsetEClass, Offset.class, "Offset", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getOffset__GetOffsetValue__Map(), ecorePackage.getEBigInteger(), "getOffsetValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ixVars", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOffset__SetOffset__String(), null, "setOffset", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "offset", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(offsetSequenceEClass, OffsetSequence.class, "OffsetSequence", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getOffsetSequence__GetLength__Map(), ecorePackage.getEBigInteger(), "getLength", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ixVars", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOffsetSequence__GetElement(), null, "getElement", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(offsetSequenceEClass_T);
		initEOperation(op, g1);

		initEClass(offsetSequenceElementEClass, OffsetSequenceElement.class, "OffsetSequenceElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getOffsetSequenceElement__GetLength__Map(), ecorePackage.getEBigInteger(), "getLength", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ixVars", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOffsetSequenceElement__GetFullLength__Map(), ecorePackage.getEBigInteger(), "getFullLength", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ixVars", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(commonAccessLevelEClass, CommonAccessLevel.class, "CommonAccessLevel", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommonAccessLevel_CommonAccessLevel(), theModelPackage.getAccessLevel(), null, "CommonAccessLevel", null, 0, -1, CommonAccessLevel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getCommonAccessLevel__RefreshCommonAccessLevel(), null, "refreshCommonAccessLevel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataTypeOwnerEClass, DataTypeOwner.class, "DataTypeOwner", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDataTypeOwner__GetDataType(), theModelPackage.getDataType(), "getDataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(bitResetTypeEClass, BitResetType.class, "BitResetType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBitResetType_BitResetType(), theModelPackage.getResetType(), null, "BitResetType", null, 0, -1, BitResetType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getBitResetType__RefreshBitResetType(), null, "refreshBitResetType", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelextensionPackageImpl
