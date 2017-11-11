/**
 */
package modelextension;

import model.ModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see modelextension.ModelextensionFactory
 * @model kind="package"
 * @generated
 */
public interface ModelextensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modelextension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.infineon.com/essence/modelextension";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "essenceextension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelextensionPackage eINSTANCE = modelextension.impl.ModelextensionPackageImpl.init();

	/**
	 * The meta object id for the '{@link modelextension.impl.EssenceBaseExtensionImpl <em>Essence Base Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelextension.impl.EssenceBaseExtensionImpl
	 * @see modelextension.impl.ModelextensionPackageImpl#getEssenceBaseExtension()
	 * @generated
	 */
	int ESSENCE_BASE_EXTENSION = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENCE_BASE_EXTENSION__PARENT = 0;

	/**
	 * The number of structural features of the '<em>Essence Base Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENCE_BASE_EXTENSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Essence Base Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENCE_BASE_EXTENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelextension.impl.UnresolvedReferenceImpl <em>Unresolved Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelextension.impl.UnresolvedReferenceImpl
	 * @see modelextension.impl.ModelextensionPackageImpl#getUnresolvedReference()
	 * @generated
	 */
	int UNRESOLVED_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE__PARENT = ModelPackage.SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE__CLASS_NAME = ModelPackage.SINGLE_SOURCE_NODE__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE__CUSTOM = ModelPackage.SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE__HIDDEN = ModelPackage.SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE__ID = ModelPackage.SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE__LONG_DESCRIPTION = ModelPackage.SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE__NAME = ModelPackage.SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE__SHORT_DESCRIPTION = ModelPackage.SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE__SHORT_NAME = ModelPackage.SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE__PROPERTY = ModelPackage.SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE__XREF_EXTENSION = ModelPackage.SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The number of structural features of the '<em>Unresolved Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE_FEATURE_COUNT = ModelPackage.SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unresolved Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_REFERENCE_OPERATION_COUNT = ModelPackage.SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelextension.SequenceBase <em>Sequence Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelextension.SequenceBase
	 * @see modelextension.impl.ModelextensionPackageImpl#getSequenceBase()
	 * @generated
	 */
	int SEQUENCE_BASE = 2;

	/**
	 * The number of structural features of the '<em>Sequence Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_BASE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Count Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_BASE___GET_COUNT_VALUE__MAP = 0;

	/**
	 * The operation id for the '<em>Get Min Index Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_BASE___GET_MIN_INDEX_VALUE__MAP = 1;

	/**
	 * The operation id for the '<em>Get Index Step Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_BASE___GET_INDEX_STEP_VALUE__MAP = 2;

	/**
	 * The operation id for the '<em>Get Index Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_BASE___GET_INDEX_VAR = 3;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_BASE___GET_ELEMENT = 4;

	/**
	 * The operation id for the '<em>Get Alt Format</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_BASE___GET_ALT_FORMAT = 5;

	/**
	 * The number of operations of the '<em>Sequence Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_BASE_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link modelextension.SequenceElementBase <em>Sequence Element Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelextension.SequenceElementBase
	 * @see modelextension.impl.ModelextensionPackageImpl#getSequenceElementBase()
	 * @generated
	 */
	int SEQUENCE_ELEMENT_BASE = 3;

	/**
	 * The feature id for the '<em><b>Sequence Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT_BASE__SEQUENCE_INDEX = 0;

	/**
	 * The number of structural features of the '<em>Sequence Element Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT_BASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sequence Element Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelextension.Offset <em>Offset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelextension.Offset
	 * @see modelextension.impl.ModelextensionPackageImpl#getOffset()
	 * @generated
	 */
	int OFFSET = 4;

	/**
	 * The number of structural features of the '<em>Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Offset Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET___GET_OFFSET_VALUE__MAP = 0;

	/**
	 * The operation id for the '<em>Set Offset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET___SET_OFFSET__STRING = 1;

	/**
	 * The number of operations of the '<em>Offset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link modelextension.OffsetSequence <em>Offset Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelextension.OffsetSequence
	 * @see modelextension.impl.ModelextensionPackageImpl#getOffsetSequence()
	 * @generated
	 */
	int OFFSET_SEQUENCE = 5;

	/**
	 * The number of structural features of the '<em>Offset Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_SEQUENCE_FEATURE_COUNT = OFFSET_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Offset Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_SEQUENCE___GET_OFFSET_VALUE__MAP = OFFSET___GET_OFFSET_VALUE__MAP;

	/**
	 * The operation id for the '<em>Set Offset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_SEQUENCE___SET_OFFSET__STRING = OFFSET___SET_OFFSET__STRING;

	/**
	 * The operation id for the '<em>Get Count Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_SEQUENCE___GET_COUNT_VALUE__MAP = OFFSET_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Min Index Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_SEQUENCE___GET_MIN_INDEX_VALUE__MAP = OFFSET_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Index Step Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_SEQUENCE___GET_INDEX_STEP_VALUE__MAP = OFFSET_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Index Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_SEQUENCE___GET_INDEX_VAR = OFFSET_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Alt Format</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_SEQUENCE___GET_ALT_FORMAT = OFFSET_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_SEQUENCE___GET_LENGTH__MAP = OFFSET_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_SEQUENCE___GET_ELEMENT = OFFSET_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Offset Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_SEQUENCE_OPERATION_COUNT = OFFSET_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link modelextension.OffsetSequenceElement <em>Offset Sequence Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelextension.OffsetSequenceElement
	 * @see modelextension.impl.ModelextensionPackageImpl#getOffsetSequenceElement()
	 * @generated
	 */
	int OFFSET_SEQUENCE_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Sequence Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_SEQUENCE_ELEMENT__SEQUENCE_INDEX = SEQUENCE_ELEMENT_BASE__SEQUENCE_INDEX;

	/**
	 * The number of structural features of the '<em>Offset Sequence Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_SEQUENCE_ELEMENT_FEATURE_COUNT = SEQUENCE_ELEMENT_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Offset Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_SEQUENCE_ELEMENT___GET_OFFSET_VALUE__MAP = SEQUENCE_ELEMENT_BASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Offset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_SEQUENCE_ELEMENT___SET_OFFSET__STRING = SEQUENCE_ELEMENT_BASE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_SEQUENCE_ELEMENT___GET_LENGTH__MAP = SEQUENCE_ELEMENT_BASE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Full Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_SEQUENCE_ELEMENT___GET_FULL_LENGTH__MAP = SEQUENCE_ELEMENT_BASE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Offset Sequence Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFSET_SEQUENCE_ELEMENT_OPERATION_COUNT = SEQUENCE_ELEMENT_BASE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link modelextension.CommonAccessLevel <em>Common Access Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelextension.CommonAccessLevel
	 * @see modelextension.impl.ModelextensionPackageImpl#getCommonAccessLevel()
	 * @generated
	 */
	int COMMON_ACCESS_LEVEL = 7;

	/**
	 * The feature id for the '<em><b>Common Access Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_ACCESS_LEVEL__COMMON_ACCESS_LEVEL = 0;

	/**
	 * The number of structural features of the '<em>Common Access Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_ACCESS_LEVEL_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Refresh Common Access Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_ACCESS_LEVEL___REFRESH_COMMON_ACCESS_LEVEL = 0;

	/**
	 * The number of operations of the '<em>Common Access Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_ACCESS_LEVEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link modelextension.DataTypeOwner <em>Data Type Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelextension.DataTypeOwner
	 * @see modelextension.impl.ModelextensionPackageImpl#getDataTypeOwner()
	 * @generated
	 */
	int DATA_TYPE_OWNER = 8;

	/**
	 * The number of structural features of the '<em>Data Type Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OWNER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OWNER___GET_DATA_TYPE = 0;

	/**
	 * The number of operations of the '<em>Data Type Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OWNER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link modelextension.BitResetType <em>Bit Reset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelextension.BitResetType
	 * @see modelextension.impl.ModelextensionPackageImpl#getBitResetType()
	 * @generated
	 */
	int BIT_RESET_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Bit Reset Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_RESET_TYPE__BIT_RESET_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Bit Reset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_RESET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Refresh Bit Reset Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_RESET_TYPE___REFRESH_BIT_RESET_TYPE = 0;

	/**
	 * The number of operations of the '<em>Bit Reset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_RESET_TYPE_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link modelextension.UnresolvedReference <em>Unresolved Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Reference</em>'.
	 * @see modelextension.UnresolvedReference
	 * @generated
	 */
	EClass getUnresolvedReference();

	/**
	 * Returns the meta object for class '{@link modelextension.EssenceBaseExtension <em>Essence Base Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Essence Base Extension</em>'.
	 * @see modelextension.EssenceBaseExtension
	 * @generated
	 */
	EClass getEssenceBaseExtension();

	/**
	 * Returns the meta object for the reference '{@link modelextension.EssenceBaseExtension#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see modelextension.EssenceBaseExtension#getParent()
	 * @see #getEssenceBaseExtension()
	 * @generated
	 */
	EReference getEssenceBaseExtension_Parent();

	/**
	 * Returns the meta object for class '{@link modelextension.SequenceBase <em>Sequence Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Base</em>'.
	 * @see modelextension.SequenceBase
	 * @generated
	 */
	EClass getSequenceBase();

	/**
	 * Returns the meta object for the '{@link modelextension.SequenceBase#getCountValue(java.util.Map) <em>Get Count Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count Value</em>' operation.
	 * @see modelextension.SequenceBase#getCountValue(java.util.Map)
	 * @generated
	 */
	EOperation getSequenceBase__GetCountValue__Map();

	/**
	 * Returns the meta object for the '{@link modelextension.SequenceBase#getMinIndexValue(java.util.Map) <em>Get Min Index Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Min Index Value</em>' operation.
	 * @see modelextension.SequenceBase#getMinIndexValue(java.util.Map)
	 * @generated
	 */
	EOperation getSequenceBase__GetMinIndexValue__Map();

	/**
	 * Returns the meta object for the '{@link modelextension.SequenceBase#getIndexStepValue(java.util.Map) <em>Get Index Step Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Index Step Value</em>' operation.
	 * @see modelextension.SequenceBase#getIndexStepValue(java.util.Map)
	 * @generated
	 */
	EOperation getSequenceBase__GetIndexStepValue__Map();

	/**
	 * Returns the meta object for the '{@link modelextension.SequenceBase#getIndexVar() <em>Get Index Var</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Index Var</em>' operation.
	 * @see modelextension.SequenceBase#getIndexVar()
	 * @generated
	 */
	EOperation getSequenceBase__GetIndexVar();

	/**
	 * Returns the meta object for the '{@link modelextension.SequenceBase#getElement() <em>Get Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Element</em>' operation.
	 * @see modelextension.SequenceBase#getElement()
	 * @generated
	 */
	EOperation getSequenceBase__GetElement();

	/**
	 * Returns the meta object for the '{@link modelextension.SequenceBase#getAltFormat() <em>Get Alt Format</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alt Format</em>' operation.
	 * @see modelextension.SequenceBase#getAltFormat()
	 * @generated
	 */
	EOperation getSequenceBase__GetAltFormat();

	/**
	 * Returns the meta object for class '{@link modelextension.SequenceElementBase <em>Sequence Element Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Element Base</em>'.
	 * @see modelextension.SequenceElementBase
	 * @generated
	 */
	EClass getSequenceElementBase();

	/**
	 * Returns the meta object for the attribute '{@link modelextension.SequenceElementBase#getSequenceIndex <em>Sequence Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Index</em>'.
	 * @see modelextension.SequenceElementBase#getSequenceIndex()
	 * @see #getSequenceElementBase()
	 * @generated
	 */
	EAttribute getSequenceElementBase_SequenceIndex();

	/**
	 * Returns the meta object for class '{@link modelextension.Offset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offset</em>'.
	 * @see modelextension.Offset
	 * @generated
	 */
	EClass getOffset();

	/**
	 * Returns the meta object for the '{@link modelextension.Offset#getOffsetValue(java.util.Map) <em>Get Offset Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Offset Value</em>' operation.
	 * @see modelextension.Offset#getOffsetValue(java.util.Map)
	 * @generated
	 */
	EOperation getOffset__GetOffsetValue__Map();

	/**
	 * Returns the meta object for the '{@link modelextension.Offset#setOffset(java.lang.String) <em>Set Offset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Offset</em>' operation.
	 * @see modelextension.Offset#setOffset(java.lang.String)
	 * @generated
	 */
	EOperation getOffset__SetOffset__String();

	/**
	 * Returns the meta object for class '{@link modelextension.OffsetSequence <em>Offset Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offset Sequence</em>'.
	 * @see modelextension.OffsetSequence
	 * @generated
	 */
	EClass getOffsetSequence();

	/**
	 * Returns the meta object for the '{@link modelextension.OffsetSequence#getLength(java.util.Map) <em>Get Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Length</em>' operation.
	 * @see modelextension.OffsetSequence#getLength(java.util.Map)
	 * @generated
	 */
	EOperation getOffsetSequence__GetLength__Map();

	/**
	 * Returns the meta object for the '{@link modelextension.OffsetSequence#getElement() <em>Get Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Element</em>' operation.
	 * @see modelextension.OffsetSequence#getElement()
	 * @generated
	 */
	EOperation getOffsetSequence__GetElement();

	/**
	 * Returns the meta object for class '{@link modelextension.OffsetSequenceElement <em>Offset Sequence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offset Sequence Element</em>'.
	 * @see modelextension.OffsetSequenceElement
	 * @generated
	 */
	EClass getOffsetSequenceElement();

	/**
	 * Returns the meta object for the '{@link modelextension.OffsetSequenceElement#getLength(java.util.Map) <em>Get Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Length</em>' operation.
	 * @see modelextension.OffsetSequenceElement#getLength(java.util.Map)
	 * @generated
	 */
	EOperation getOffsetSequenceElement__GetLength__Map();

	/**
	 * Returns the meta object for the '{@link modelextension.OffsetSequenceElement#getFullLength(java.util.Map) <em>Get Full Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Full Length</em>' operation.
	 * @see modelextension.OffsetSequenceElement#getFullLength(java.util.Map)
	 * @generated
	 */
	EOperation getOffsetSequenceElement__GetFullLength__Map();

	/**
	 * Returns the meta object for class '{@link modelextension.CommonAccessLevel <em>Common Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Access Level</em>'.
	 * @see modelextension.CommonAccessLevel
	 * @generated
	 */
	EClass getCommonAccessLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link modelextension.CommonAccessLevel#getCommonAccessLevel <em>Common Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Common Access Level</em>'.
	 * @see modelextension.CommonAccessLevel#getCommonAccessLevel()
	 * @see #getCommonAccessLevel()
	 * @generated
	 */
	EReference getCommonAccessLevel_CommonAccessLevel();

	/**
	 * Returns the meta object for the '{@link modelextension.CommonAccessLevel#refreshCommonAccessLevel() <em>Refresh Common Access Level</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Common Access Level</em>' operation.
	 * @see modelextension.CommonAccessLevel#refreshCommonAccessLevel()
	 * @generated
	 */
	EOperation getCommonAccessLevel__RefreshCommonAccessLevel();

	/**
	 * Returns the meta object for class '{@link modelextension.DataTypeOwner <em>Data Type Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Owner</em>'.
	 * @see modelextension.DataTypeOwner
	 * @generated
	 */
	EClass getDataTypeOwner();

	/**
	 * Returns the meta object for the '{@link modelextension.DataTypeOwner#getDataType() <em>Get Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Data Type</em>' operation.
	 * @see modelextension.DataTypeOwner#getDataType()
	 * @generated
	 */
	EOperation getDataTypeOwner__GetDataType();

	/**
	 * Returns the meta object for class '{@link modelextension.BitResetType <em>Bit Reset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Reset Type</em>'.
	 * @see modelextension.BitResetType
	 * @generated
	 */
	EClass getBitResetType();

	/**
	 * Returns the meta object for the containment reference list '{@link modelextension.BitResetType#getBitResetType <em>Bit Reset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bit Reset Type</em>'.
	 * @see modelextension.BitResetType#getBitResetType()
	 * @see #getBitResetType()
	 * @generated
	 */
	EReference getBitResetType_BitResetType();

	/**
	 * Returns the meta object for the '{@link modelextension.BitResetType#refreshBitResetType() <em>Refresh Bit Reset Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Bit Reset Type</em>' operation.
	 * @see modelextension.BitResetType#refreshBitResetType()
	 * @generated
	 */
	EOperation getBitResetType__RefreshBitResetType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelextensionFactory getModelextensionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link modelextension.impl.UnresolvedReferenceImpl <em>Unresolved Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelextension.impl.UnresolvedReferenceImpl
		 * @see modelextension.impl.ModelextensionPackageImpl#getUnresolvedReference()
		 * @generated
		 */
		EClass UNRESOLVED_REFERENCE = eINSTANCE.getUnresolvedReference();

		/**
		 * The meta object literal for the '{@link modelextension.impl.EssenceBaseExtensionImpl <em>Essence Base Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelextension.impl.EssenceBaseExtensionImpl
		 * @see modelextension.impl.ModelextensionPackageImpl#getEssenceBaseExtension()
		 * @generated
		 */
		EClass ESSENCE_BASE_EXTENSION = eINSTANCE.getEssenceBaseExtension();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESSENCE_BASE_EXTENSION__PARENT = eINSTANCE.getEssenceBaseExtension_Parent();

		/**
		 * The meta object literal for the '{@link modelextension.SequenceBase <em>Sequence Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelextension.SequenceBase
		 * @see modelextension.impl.ModelextensionPackageImpl#getSequenceBase()
		 * @generated
		 */
		EClass SEQUENCE_BASE = eINSTANCE.getSequenceBase();

		/**
		 * The meta object literal for the '<em><b>Get Count Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEQUENCE_BASE___GET_COUNT_VALUE__MAP = eINSTANCE.getSequenceBase__GetCountValue__Map();

		/**
		 * The meta object literal for the '<em><b>Get Min Index Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEQUENCE_BASE___GET_MIN_INDEX_VALUE__MAP = eINSTANCE.getSequenceBase__GetMinIndexValue__Map();

		/**
		 * The meta object literal for the '<em><b>Get Index Step Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEQUENCE_BASE___GET_INDEX_STEP_VALUE__MAP = eINSTANCE.getSequenceBase__GetIndexStepValue__Map();

		/**
		 * The meta object literal for the '<em><b>Get Index Var</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEQUENCE_BASE___GET_INDEX_VAR = eINSTANCE.getSequenceBase__GetIndexVar();

		/**
		 * The meta object literal for the '<em><b>Get Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEQUENCE_BASE___GET_ELEMENT = eINSTANCE.getSequenceBase__GetElement();

		/**
		 * The meta object literal for the '<em><b>Get Alt Format</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEQUENCE_BASE___GET_ALT_FORMAT = eINSTANCE.getSequenceBase__GetAltFormat();

		/**
		 * The meta object literal for the '{@link modelextension.SequenceElementBase <em>Sequence Element Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelextension.SequenceElementBase
		 * @see modelextension.impl.ModelextensionPackageImpl#getSequenceElementBase()
		 * @generated
		 */
		EClass SEQUENCE_ELEMENT_BASE = eINSTANCE.getSequenceElementBase();

		/**
		 * The meta object literal for the '<em><b>Sequence Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_ELEMENT_BASE__SEQUENCE_INDEX = eINSTANCE.getSequenceElementBase_SequenceIndex();

		/**
		 * The meta object literal for the '{@link modelextension.Offset <em>Offset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelextension.Offset
		 * @see modelextension.impl.ModelextensionPackageImpl#getOffset()
		 * @generated
		 */
		EClass OFFSET = eINSTANCE.getOffset();

		/**
		 * The meta object literal for the '<em><b>Get Offset Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OFFSET___GET_OFFSET_VALUE__MAP = eINSTANCE.getOffset__GetOffsetValue__Map();

		/**
		 * The meta object literal for the '<em><b>Set Offset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OFFSET___SET_OFFSET__STRING = eINSTANCE.getOffset__SetOffset__String();

		/**
		 * The meta object literal for the '{@link modelextension.OffsetSequence <em>Offset Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelextension.OffsetSequence
		 * @see modelextension.impl.ModelextensionPackageImpl#getOffsetSequence()
		 * @generated
		 */
		EClass OFFSET_SEQUENCE = eINSTANCE.getOffsetSequence();

		/**
		 * The meta object literal for the '<em><b>Get Length</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OFFSET_SEQUENCE___GET_LENGTH__MAP = eINSTANCE.getOffsetSequence__GetLength__Map();

		/**
		 * The meta object literal for the '<em><b>Get Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OFFSET_SEQUENCE___GET_ELEMENT = eINSTANCE.getOffsetSequence__GetElement();

		/**
		 * The meta object literal for the '{@link modelextension.OffsetSequenceElement <em>Offset Sequence Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelextension.OffsetSequenceElement
		 * @see modelextension.impl.ModelextensionPackageImpl#getOffsetSequenceElement()
		 * @generated
		 */
		EClass OFFSET_SEQUENCE_ELEMENT = eINSTANCE.getOffsetSequenceElement();

		/**
		 * The meta object literal for the '<em><b>Get Length</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OFFSET_SEQUENCE_ELEMENT___GET_LENGTH__MAP = eINSTANCE.getOffsetSequenceElement__GetLength__Map();

		/**
		 * The meta object literal for the '<em><b>Get Full Length</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OFFSET_SEQUENCE_ELEMENT___GET_FULL_LENGTH__MAP = eINSTANCE.getOffsetSequenceElement__GetFullLength__Map();

		/**
		 * The meta object literal for the '{@link modelextension.CommonAccessLevel <em>Common Access Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelextension.CommonAccessLevel
		 * @see modelextension.impl.ModelextensionPackageImpl#getCommonAccessLevel()
		 * @generated
		 */
		EClass COMMON_ACCESS_LEVEL = eINSTANCE.getCommonAccessLevel();

		/**
		 * The meta object literal for the '<em><b>Common Access Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMON_ACCESS_LEVEL__COMMON_ACCESS_LEVEL = eINSTANCE.getCommonAccessLevel_CommonAccessLevel();

		/**
		 * The meta object literal for the '<em><b>Refresh Common Access Level</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMON_ACCESS_LEVEL___REFRESH_COMMON_ACCESS_LEVEL = eINSTANCE.getCommonAccessLevel__RefreshCommonAccessLevel();

		/**
		 * The meta object literal for the '{@link modelextension.DataTypeOwner <em>Data Type Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelextension.DataTypeOwner
		 * @see modelextension.impl.ModelextensionPackageImpl#getDataTypeOwner()
		 * @generated
		 */
		EClass DATA_TYPE_OWNER = eINSTANCE.getDataTypeOwner();

		/**
		 * The meta object literal for the '<em><b>Get Data Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE_OWNER___GET_DATA_TYPE = eINSTANCE.getDataTypeOwner__GetDataType();

		/**
		 * The meta object literal for the '{@link modelextension.BitResetType <em>Bit Reset Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelextension.BitResetType
		 * @see modelextension.impl.ModelextensionPackageImpl#getBitResetType()
		 * @generated
		 */
		EClass BIT_RESET_TYPE = eINSTANCE.getBitResetType();

		/**
		 * The meta object literal for the '<em><b>Bit Reset Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIT_RESET_TYPE__BIT_RESET_TYPE = eINSTANCE.getBitResetType_BitResetType();

		/**
		 * The meta object literal for the '<em><b>Refresh Bit Reset Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIT_RESET_TYPE___REFRESH_BIT_RESET_TYPE = eINSTANCE.getBitResetType__RefreshBitResetType();

	}

} //ModelextensionPackage
