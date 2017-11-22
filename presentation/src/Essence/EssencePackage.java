/**
 */
package Essence;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see Essence.EssenceFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface EssencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Essence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/masterthesis_java_test1004.project2/src/Essence.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Essence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EssencePackage eINSTANCE = Essence.impl.EssencePackageImpl.init();

	/**
	 * The meta object id for the '{@link Essence.impl.EssenceBaseImpl <em>Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.EssenceBaseImpl
	 * @see Essence.impl.EssencePackageImpl#getEssenceBase()
	 * @generated
	 */
	int ESSENCE_BASE = 42;

	/**
	 * The number of structural features of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENCE_BASE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENCE_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Essence.impl.AccessImpl <em>Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.AccessImpl
	 * @see Essence.impl.EssencePackageImpl#getAccess()
	 * @generated
	 */
	int ACCESS = 0;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__ACCESS_TYPE = ESSENCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strobe Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__STROBE_TYPE = ESSENCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__ACTION_TYPE = ESSENCE_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_FEATURE_COUNT = ESSENCE_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_OPERATION_COUNT = ESSENCE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SubElementAccessImpl <em>Sub Element Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SubElementAccessImpl
	 * @see Essence.impl.EssencePackageImpl#getSubElementAccess()
	 * @generated
	 */
	int SUB_ELEMENT_ACCESS = 148;

	/**
	 * The number of structural features of the '<em>Sub Element Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ELEMENT_ACCESS_FEATURE_COUNT = ESSENCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sub Element Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ELEMENT_ACCESS_OPERATION_COUNT = ESSENCE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SimpleSubElementAccessImpl <em>Simple Sub Element Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SimpleSubElementAccessImpl
	 * @see Essence.impl.EssencePackageImpl#getSimpleSubElementAccess()
	 * @generated
	 */
	int SIMPLE_SUB_ELEMENT_ACCESS = 136;

	/**
	 * The number of structural features of the '<em>Simple Sub Element Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SUB_ELEMENT_ACCESS_FEATURE_COUNT = SUB_ELEMENT_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Sub Element Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SUB_ELEMENT_ACCESS_OPERATION_COUNT = SUB_ELEMENT_ACCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.AccessByIndexImpl <em>Access By Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.AccessByIndexImpl
	 * @see Essence.impl.EssencePackageImpl#getAccessByIndex()
	 * @generated
	 */
	int ACCESS_BY_INDEX = 1;

	/**
	 * The feature id for the '<em><b>Ascending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_BY_INDEX__ASCENDING = SIMPLE_SUB_ELEMENT_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_BY_INDEX__LEFT = SIMPLE_SUB_ELEMENT_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_BY_INDEX__RIGHT = SIMPLE_SUB_ELEMENT_ACCESS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Simple Sub Element Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_BY_INDEX__SIMPLE_SUB_ELEMENT_ACCESS = SIMPLE_SUB_ELEMENT_ACCESS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Access By Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_BY_INDEX_FEATURE_COUNT = SIMPLE_SUB_ELEMENT_ACCESS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Access By Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_BY_INDEX_OPERATION_COUNT = SIMPLE_SUB_ELEMENT_ACCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.AccessByNameImpl <em>Access By Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.AccessByNameImpl
	 * @see Essence.impl.EssencePackageImpl#getAccessByName()
	 * @generated
	 */
	int ACCESS_BY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_BY_NAME__NAME = SIMPLE_SUB_ELEMENT_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Simple Sub Element Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_BY_NAME__SIMPLE_SUB_ELEMENT_ACCESS = SIMPLE_SUB_ELEMENT_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Access By Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_BY_NAME_FEATURE_COUNT = SIMPLE_SUB_ELEMENT_ACCESS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Access By Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_BY_NAME_OPERATION_COUNT = SIMPLE_SUB_ELEMENT_ACCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SingleSourceNodeImpl <em>Single Source Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SingleSourceNodeImpl
	 * @see Essence.impl.EssencePackageImpl#getSingleSourceNode()
	 * @generated
	 */
	int SINGLE_SOURCE_NODE = 138;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_SOURCE_NODE__CUSTOM = ESSENCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_SOURCE_NODE__HIDDEN = ESSENCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_SOURCE_NODE__ID = ESSENCE_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_SOURCE_NODE__LONG_DESCRIPTION = ESSENCE_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_SOURCE_NODE__NAME = ESSENCE_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_SOURCE_NODE__SHORT_DESCRIPTION = ESSENCE_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_SOURCE_NODE__SHORT_NAME = ESSENCE_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_SOURCE_NODE__PROPERTY = ESSENCE_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_SOURCE_NODE__XREF_EXTENSION = ESSENCE_BASE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Single Source Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_SOURCE_NODE_FEATURE_COUNT = ESSENCE_BASE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Single Source Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_SOURCE_NODE_OPERATION_COUNT = ESSENCE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.IndexVarUserImpl <em>Index Var User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.IndexVarUserImpl
	 * @see Essence.impl.EssencePackageImpl#getIndexVarUser()
	 * @generated
	 */
	int INDEX_VAR_USER = 53;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_VAR_USER__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_VAR_USER__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_VAR_USER__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_VAR_USER__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_VAR_USER__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_VAR_USER__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_VAR_USER__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_VAR_USER__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_VAR_USER__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The number of structural features of the '<em>Index Var User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_VAR_USER_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Index Var User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_VAR_USER_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.AccessConditionImpl <em>Access Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.AccessConditionImpl
	 * @see Essence.impl.EssencePackageImpl#getAccessCondition()
	 * @generated
	 */
	int ACCESS_CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION__CUSTOM = INDEX_VAR_USER__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION__HIDDEN = INDEX_VAR_USER__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION__ID = INDEX_VAR_USER__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION__LONG_DESCRIPTION = INDEX_VAR_USER__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION__NAME = INDEX_VAR_USER__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION__SHORT_DESCRIPTION = INDEX_VAR_USER__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION__SHORT_NAME = INDEX_VAR_USER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION__PROPERTY = INDEX_VAR_USER__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION__XREF_EXTENSION = INDEX_VAR_USER__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Access Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION__ACCESS_LEVEL = INDEX_VAR_USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bus Error Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION__BUS_ERROR_TYPE = INDEX_VAR_USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Access Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION_FEATURE_COUNT = INDEX_VAR_USER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Access Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION_OPERATION_COUNT = INDEX_VAR_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.AccessLevelImpl <em>Access Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.AccessLevelImpl
	 * @see Essence.impl.EssencePackageImpl#getAccessLevel()
	 * @generated
	 */
	int ACCESS_LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LEVEL__CUSTOM = INDEX_VAR_USER__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LEVEL__HIDDEN = INDEX_VAR_USER__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LEVEL__ID = INDEX_VAR_USER__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LEVEL__LONG_DESCRIPTION = INDEX_VAR_USER__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LEVEL__NAME = INDEX_VAR_USER__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LEVEL__SHORT_DESCRIPTION = INDEX_VAR_USER__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LEVEL__SHORT_NAME = INDEX_VAR_USER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LEVEL__PROPERTY = INDEX_VAR_USER__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LEVEL__XREF_EXTENSION = INDEX_VAR_USER__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Access Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LEVEL__ACCESS_LEVEL = INDEX_VAR_USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LEVEL__ACCESS_TYPE = INDEX_VAR_USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Access Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LEVEL_FEATURE_COUNT = INDEX_VAR_USER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Access Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LEVEL_OPERATION_COUNT = INDEX_VAR_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.AddressBlockImpl <em>Address Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.AddressBlockImpl
	 * @see Essence.impl.EssencePackageImpl#getAddressBlock()
	 * @generated
	 */
	int ADDRESS_BLOCK = 5;

	/**
	 * The feature id for the '<em><b>XRef Reg Mem Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_BLOCK__XREF_REG_MEM_SET = ESSENCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRef Master Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_BLOCK__XREF_MASTER_INTERFACE = ESSENCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XRef Slave Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_BLOCK__XREF_SLAVE_INTERFACE = ESSENCE_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Address Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_BLOCK_FEATURE_COUNT = ESSENCE_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Address Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_BLOCK_OPERATION_COUNT = ESSENCE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.DataTypeImpl
	 * @see Essence.impl.EssencePackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 31;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = ESSENCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = ESSENCE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ReturnDataTypeImpl <em>Return Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ReturnDataTypeImpl
	 * @see Essence.impl.EssencePackageImpl#getReturnDataType()
	 * @generated
	 */
	int RETURN_DATA_TYPE = 119;

	/**
	 * The number of structural features of the '<em>Return Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Return Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_DATA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ValueDataTypeImpl <em>Value Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ValueDataTypeImpl
	 * @see Essence.impl.EssencePackageImpl#getValueDataType()
	 * @generated
	 */
	int VALUE_DATA_TYPE = 157;

	/**
	 * The feature id for the '<em><b>Sign Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DATA_TYPE__SIGN_INTERPRETATION = RETURN_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DATA_TYPE__OBJECT_TYPE = RETURN_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DATA_TYPE__VECTOR = RETURN_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Value Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DATA_TYPE_FEATURE_COUNT = RETURN_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Value Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DATA_TYPE_OPERATION_COUNT = RETURN_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ComplexDataTypeImpl <em>Complex Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ComplexDataTypeImpl
	 * @see Essence.impl.EssencePackageImpl#getComplexDataType()
	 * @generated
	 */
	int COMPLEX_DATA_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Sign Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_TYPE__SIGN_INTERPRETATION = VALUE_DATA_TYPE__SIGN_INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_TYPE__OBJECT_TYPE = VALUE_DATA_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_TYPE__VECTOR = VALUE_DATA_TYPE__VECTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_TYPE__NAME = VALUE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_TYPE_FEATURE_COUNT = VALUE_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complex Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_TYPE_OPERATION_COUNT = VALUE_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ArrayImpl
	 * @see Essence.impl.EssencePackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 6;

	/**
	 * The feature id for the '<em><b>Sign Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__SIGN_INTERPRETATION = COMPLEX_DATA_TYPE__SIGN_INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__OBJECT_TYPE = COMPLEX_DATA_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__VECTOR = COMPLEX_DATA_TYPE__VECTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__NAME = COMPLEX_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__DATA_TYPE = COMPLEX_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Array Dimension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__ARRAY_DIMENSION = COMPLEX_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = COMPLEX_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OPERATION_COUNT = COMPLEX_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ArrayDimensionImpl <em>Array Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ArrayDimensionImpl
	 * @see Essence.impl.EssencePackageImpl#getArrayDimension()
	 * @generated
	 */
	int ARRAY_DIMENSION = 7;

	/**
	 * The feature id for the '<em><b>Ascending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DIMENSION__ASCENDING = ESSENCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DIMENSION__LEFT = ESSENCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DIMENSION__RIGHT = ESSENCE_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Array Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DIMENSION_FEATURE_COUNT = ESSENCE_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Array Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DIMENSION_OPERATION_COUNT = ESSENCE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.BitFieldElementImpl <em>Bit Field Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.BitFieldElementImpl
	 * @see Essence.impl.EssencePackageImpl#getBitFieldElement()
	 * @generated
	 */
	int BIT_FIELD_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_ELEMENT__CUSTOM = INDEX_VAR_USER__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_ELEMENT__HIDDEN = INDEX_VAR_USER__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_ELEMENT__ID = INDEX_VAR_USER__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_ELEMENT__LONG_DESCRIPTION = INDEX_VAR_USER__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_ELEMENT__NAME = INDEX_VAR_USER__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_ELEMENT__SHORT_DESCRIPTION = INDEX_VAR_USER__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_ELEMENT__SHORT_NAME = INDEX_VAR_USER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_ELEMENT__PROPERTY = INDEX_VAR_USER__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_ELEMENT__XREF_EXTENSION = INDEX_VAR_USER__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_ELEMENT__OFFSET = INDEX_VAR_USER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bit Field Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_ELEMENT_FEATURE_COUNT = INDEX_VAR_USER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bit Field Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_ELEMENT_OPERATION_COUNT = INDEX_VAR_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.BitFieldSequenceElementImpl <em>Bit Field Sequence Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.BitFieldSequenceElementImpl
	 * @see Essence.impl.EssencePackageImpl#getBitFieldSequenceElement()
	 * @generated
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT__CUSTOM = BIT_FIELD_ELEMENT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT__HIDDEN = BIT_FIELD_ELEMENT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT__ID = BIT_FIELD_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT__LONG_DESCRIPTION = BIT_FIELD_ELEMENT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT__NAME = BIT_FIELD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT__SHORT_DESCRIPTION = BIT_FIELD_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT__SHORT_NAME = BIT_FIELD_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT__PROPERTY = BIT_FIELD_ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT__XREF_EXTENSION = BIT_FIELD_ELEMENT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT__OFFSET = BIT_FIELD_ELEMENT__OFFSET;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT__WIDTH = BIT_FIELD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bit Field Sequence Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT = BIT_FIELD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bit Field Sequence Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT_OPERATION_COUNT = BIT_FIELD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.BitFieldImpl <em>Bit Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.BitFieldImpl
	 * @see Essence.impl.EssencePackageImpl#getBitField()
	 * @generated
	 */
	int BIT_FIELD = 8;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__CUSTOM = BIT_FIELD_SEQUENCE_ELEMENT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__HIDDEN = BIT_FIELD_SEQUENCE_ELEMENT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__ID = BIT_FIELD_SEQUENCE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__LONG_DESCRIPTION = BIT_FIELD_SEQUENCE_ELEMENT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__NAME = BIT_FIELD_SEQUENCE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__SHORT_DESCRIPTION = BIT_FIELD_SEQUENCE_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__SHORT_NAME = BIT_FIELD_SEQUENCE_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__PROPERTY = BIT_FIELD_SEQUENCE_ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__XREF_EXTENSION = BIT_FIELD_SEQUENCE_ELEMENT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__OFFSET = BIT_FIELD_SEQUENCE_ELEMENT__OFFSET;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__WIDTH = BIT_FIELD_SEQUENCE_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Access External</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__ACCESS_EXTERNAL = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Internal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__ACCESS_INTERNAL = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__MAX_VAL = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__MIN_VAL = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__RESERVED = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sign Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__SIGN_INTERPRETATION = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__VIRTUAL = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__DEFAULT_VALUE = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Default Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__DEFAULT_MASK = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Access Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__ACCESS_LEVEL = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Enumeration Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__ENUMERATION_ELEMENT = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Bit Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_FEATURE_COUNT = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Bit Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_OPERATION_COUNT = BIT_FIELD_SEQUENCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.BitFieldGapElementImpl <em>Bit Field Gap Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.BitFieldGapElementImpl
	 * @see Essence.impl.EssencePackageImpl#getBitFieldGapElement()
	 * @generated
	 */
	int BIT_FIELD_GAP_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT__CUSTOM = BIT_FIELD_SEQUENCE_ELEMENT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT__HIDDEN = BIT_FIELD_SEQUENCE_ELEMENT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT__ID = BIT_FIELD_SEQUENCE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT__LONG_DESCRIPTION = BIT_FIELD_SEQUENCE_ELEMENT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT__NAME = BIT_FIELD_SEQUENCE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT__SHORT_DESCRIPTION = BIT_FIELD_SEQUENCE_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT__SHORT_NAME = BIT_FIELD_SEQUENCE_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT__PROPERTY = BIT_FIELD_SEQUENCE_ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT__XREF_EXTENSION = BIT_FIELD_SEQUENCE_ELEMENT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT__OFFSET = BIT_FIELD_SEQUENCE_ELEMENT__OFFSET;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT__WIDTH = BIT_FIELD_SEQUENCE_ELEMENT__WIDTH;

	/**
	 * The number of structural features of the '<em>Bit Field Gap Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT_FEATURE_COUNT = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bit Field Gap Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT_OPERATION_COUNT = BIT_FIELD_SEQUENCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.BitFieldSequenceImpl <em>Bit Field Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.BitFieldSequenceImpl
	 * @see Essence.impl.EssencePackageImpl#getBitFieldSequence()
	 * @generated
	 */
	int BIT_FIELD_SEQUENCE = 11;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE__CUSTOM = BIT_FIELD_ELEMENT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE__HIDDEN = BIT_FIELD_ELEMENT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE__ID = BIT_FIELD_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE__LONG_DESCRIPTION = BIT_FIELD_ELEMENT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE__NAME = BIT_FIELD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE__SHORT_DESCRIPTION = BIT_FIELD_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE__SHORT_NAME = BIT_FIELD_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE__PROPERTY = BIT_FIELD_ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE__XREF_EXTENSION = BIT_FIELD_ELEMENT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE__OFFSET = BIT_FIELD_ELEMENT__OFFSET;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE__COUNT = BIT_FIELD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE__MIN_INDEX = BIT_FIELD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Index Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE__INDEX_STEP = BIT_FIELD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Index Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE__INDEX_VAR = BIT_FIELD_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alt Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE__ALT_FORMAT = BIT_FIELD_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bit Field Sequence Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE__BIT_FIELD_SEQUENCE_ELEMENT = BIT_FIELD_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Bit Field Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_FEATURE_COUNT = BIT_FIELD_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Bit Field Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_OPERATION_COUNT = BIT_FIELD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.VarDefImpl <em>Var Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.VarDefImpl
	 * @see Essence.impl.EssencePackageImpl#getVarDef()
	 * @generated
	 */
	int VAR_DEF = 158;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The number of structural features of the '<em>Var Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Var Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ParamDeclImpl <em>Param Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ParamDeclImpl
	 * @see Essence.impl.EssencePackageImpl#getParamDecl()
	 * @generated
	 */
	int PARAM_DECL = 94;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL__CUSTOM = VAR_DEF__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL__HIDDEN = VAR_DEF__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL__ID = VAR_DEF__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL__LONG_DESCRIPTION = VAR_DEF__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL__NAME = VAR_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL__SHORT_DESCRIPTION = VAR_DEF__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL__SHORT_NAME = VAR_DEF__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL__PROPERTY = VAR_DEF__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL__XREF_EXTENSION = VAR_DEF__XREF_EXTENSION;

	/**
	 * The number of structural features of the '<em>Param Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL_FEATURE_COUNT = VAR_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Param Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL_OPERATION_COUNT = VAR_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.BooleanDeclImpl <em>Boolean Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.BooleanDeclImpl
	 * @see Essence.impl.EssencePackageImpl#getBooleanDecl()
	 * @generated
	 */
	int BOOLEAN_DECL = 13;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DECL__CUSTOM = PARAM_DECL__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DECL__HIDDEN = PARAM_DECL__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DECL__ID = PARAM_DECL__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DECL__LONG_DESCRIPTION = PARAM_DECL__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DECL__NAME = PARAM_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DECL__SHORT_DESCRIPTION = PARAM_DECL__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DECL__SHORT_NAME = PARAM_DECL__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DECL__PROPERTY = PARAM_DECL__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DECL__XREF_EXTENSION = PARAM_DECL__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DECL__DEFAULT_VALUE = PARAM_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DECL_FEATURE_COUNT = PARAM_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DECL_OPERATION_COUNT = PARAM_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ConstDefImpl <em>Const Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ConstDefImpl
	 * @see Essence.impl.EssencePackageImpl#getConstDef()
	 * @generated
	 */
	int CONST_DEF = 26;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF__CUSTOM = VAR_DEF__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF__HIDDEN = VAR_DEF__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF__ID = VAR_DEF__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF__LONG_DESCRIPTION = VAR_DEF__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF__NAME = VAR_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF__SHORT_DESCRIPTION = VAR_DEF__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF__SHORT_NAME = VAR_DEF__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF__PROPERTY = VAR_DEF__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF__XREF_EXTENSION = VAR_DEF__XREF_EXTENSION;

	/**
	 * The number of structural features of the '<em>Const Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF_FEATURE_COUNT = VAR_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Const Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF_OPERATION_COUNT = VAR_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.BooleanDefImpl <em>Boolean Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.BooleanDefImpl
	 * @see Essence.impl.EssencePackageImpl#getBooleanDef()
	 * @generated
	 */
	int BOOLEAN_DEF = 14;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DEF__CUSTOM = CONST_DEF__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DEF__HIDDEN = CONST_DEF__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DEF__ID = CONST_DEF__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DEF__LONG_DESCRIPTION = CONST_DEF__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DEF__NAME = CONST_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DEF__SHORT_DESCRIPTION = CONST_DEF__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DEF__SHORT_NAME = CONST_DEF__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DEF__PROPERTY = CONST_DEF__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DEF__XREF_EXTENSION = CONST_DEF__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DEF__VALUE = CONST_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DEF_FEATURE_COUNT = CONST_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DEF_OPERATION_COUNT = CONST_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.GenericDeclImpl <em>Generic Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.GenericDeclImpl
	 * @see Essence.impl.EssencePackageImpl#getGenericDecl()
	 * @generated
	 */
	int GENERIC_DECL = 50;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL__CUSTOM = VAR_DEF__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL__HIDDEN = VAR_DEF__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL__ID = VAR_DEF__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL__LONG_DESCRIPTION = VAR_DEF__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL__NAME = VAR_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL__SHORT_DESCRIPTION = VAR_DEF__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL__SHORT_NAME = VAR_DEF__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL__PROPERTY = VAR_DEF__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL__XREF_EXTENSION = VAR_DEF__XREF_EXTENSION;

	/**
	 * The number of structural features of the '<em>Generic Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL_FEATURE_COUNT = VAR_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generic Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL_OPERATION_COUNT = VAR_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.BooleanGenDeclImpl <em>Boolean Gen Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.BooleanGenDeclImpl
	 * @see Essence.impl.EssencePackageImpl#getBooleanGenDecl()
	 * @generated
	 */
	int BOOLEAN_GEN_DECL = 15;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GEN_DECL__CUSTOM = GENERIC_DECL__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GEN_DECL__HIDDEN = GENERIC_DECL__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GEN_DECL__ID = GENERIC_DECL__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GEN_DECL__LONG_DESCRIPTION = GENERIC_DECL__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GEN_DECL__NAME = GENERIC_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GEN_DECL__SHORT_DESCRIPTION = GENERIC_DECL__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GEN_DECL__SHORT_NAME = GENERIC_DECL__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GEN_DECL__PROPERTY = GENERIC_DECL__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GEN_DECL__XREF_EXTENSION = GENERIC_DECL__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GEN_DECL__DEFAULT_VALUE = GENERIC_DECL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Gen Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GEN_DECL_FEATURE_COUNT = GENERIC_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Gen Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GEN_DECL_OPERATION_COUNT = GENERIC_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ModelRootImpl <em>Model Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ModelRootImpl
	 * @see Essence.impl.EssencePackageImpl#getModelRoot()
	 * @generated
	 */
	int MODEL_ROOT = 78;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Const Def Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__CONST_DEF_BLOCK = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Essence Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__ESSENCE_VERSION = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generic Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__GENERIC_DECL_BLOCK = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__MODULE = SINGLE_SOURCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Param Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__PARAM_DECL_BLOCK = SINGLE_SOURCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__VLNV = SINGLE_SOURCE_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Model Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Model Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.BusImpl
	 * @see Essence.impl.EssencePackageImpl#getBus()
	 * @generated
	 */
	int BUS = 16;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__CUSTOM = MODEL_ROOT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__HIDDEN = MODEL_ROOT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__ID = MODEL_ROOT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__LONG_DESCRIPTION = MODEL_ROOT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__NAME = MODEL_ROOT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__SHORT_DESCRIPTION = MODEL_ROOT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__SHORT_NAME = MODEL_ROOT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__PROPERTY = MODEL_ROOT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__XREF_EXTENSION = MODEL_ROOT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Const Def Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__CONST_DEF_BLOCK = MODEL_ROOT__CONST_DEF_BLOCK;

	/**
	 * The feature id for the '<em><b>Essence Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__ESSENCE_VERSION = MODEL_ROOT__ESSENCE_VERSION;

	/**
	 * The feature id for the '<em><b>Generic Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__GENERIC_DECL_BLOCK = MODEL_ROOT__GENERIC_DECL_BLOCK;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__MODULE = MODEL_ROOT__MODULE;

	/**
	 * The feature id for the '<em><b>Param Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__PARAM_DECL_BLOCK = MODEL_ROOT__PARAM_DECL_BLOCK;

	/**
	 * The feature id for the '<em><b>VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__VLNV = MODEL_ROOT__VLNV;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__EXT_VLNV = MODEL_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Masters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__MAX_MASTERS = MODEL_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Slaves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__MAX_SLAVES = MODEL_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>None Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__NONE_INTERFACE = MODEL_ROOT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FEATURE_COUNT = MODEL_ROOT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_OPERATION_COUNT = MODEL_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.GeneralInstanceImpl <em>General Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.GeneralInstanceImpl
	 * @see Essence.impl.EssencePackageImpl#getGeneralInstance()
	 * @generated
	 */
	int GENERAL_INSTANCE = 45;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INSTANCE__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INSTANCE__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INSTANCE__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INSTANCE__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INSTANCE__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INSTANCE__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INSTANCE__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INSTANCE__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INSTANCE__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INSTANCE__EXT_VLNV = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Param Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INSTANCE__PARAM_MAP = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INSTANCE__GENERIC_MAP = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>General Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INSTANCE_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>General Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INSTANCE_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.InstanceImpl
	 * @see Essence.impl.EssencePackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 54;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__CUSTOM = GENERAL_INSTANCE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__HIDDEN = GENERAL_INSTANCE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__ID = GENERAL_INSTANCE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__LONG_DESCRIPTION = GENERAL_INSTANCE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__NAME = GENERAL_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__SHORT_DESCRIPTION = GENERAL_INSTANCE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__SHORT_NAME = GENERAL_INSTANCE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__PROPERTY = GENERAL_INSTANCE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__XREF_EXTENSION = GENERAL_INSTANCE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__EXT_VLNV = GENERAL_INSTANCE__EXT_VLNV;

	/**
	 * The feature id for the '<em><b>Param Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__PARAM_MAP = GENERAL_INSTANCE__PARAM_MAP;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__GENERIC_MAP = GENERAL_INSTANCE__GENERIC_MAP;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = GENERAL_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_COUNT = GENERAL_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.BusInstanceImpl <em>Bus Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.BusInstanceImpl
	 * @see Essence.impl.EssencePackageImpl#getBusInstance()
	 * @generated
	 */
	int BUS_INSTANCE = 17;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__CUSTOM = INSTANCE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__HIDDEN = INSTANCE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__ID = INSTANCE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__LONG_DESCRIPTION = INSTANCE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__NAME = INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__SHORT_DESCRIPTION = INSTANCE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__SHORT_NAME = INSTANCE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__PROPERTY = INSTANCE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__XREF_EXTENSION = INSTANCE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__EXT_VLNV = INSTANCE__EXT_VLNV;

	/**
	 * The feature id for the '<em><b>Param Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__PARAM_MAP = INSTANCE__PARAM_MAP;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__GENERIC_MAP = INSTANCE__GENERIC_MAP;

	/**
	 * The feature id for the '<em><b>Bus Interface Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__BUS_INTERFACE_MAP = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bus None Interface Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__BUS_NONE_INTERFACE_MAP = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bus Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bus Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE_OPERATION_COUNT = INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.BusInterfaceMapImpl <em>Bus Interface Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.BusInterfaceMapImpl
	 * @see Essence.impl.EssencePackageImpl#getBusInterfaceMap()
	 * @generated
	 */
	int BUS_INTERFACE_MAP = 18;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INTERFACE_MAP__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INTERFACE_MAP__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INTERFACE_MAP__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INTERFACE_MAP__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INTERFACE_MAP__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INTERFACE_MAP__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INTERFACE_MAP__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INTERFACE_MAP__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INTERFACE_MAP__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INTERFACE_MAP__XREF_CONNECTION = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bus Interface Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INTERFACE_MAP_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bus Interface Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INTERFACE_MAP_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.BusNoneInterfaceMapImpl <em>Bus None Interface Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.BusNoneInterfaceMapImpl
	 * @see Essence.impl.EssencePackageImpl#getBusNoneInterfaceMap()
	 * @generated
	 */
	int BUS_NONE_INTERFACE_MAP = 19;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NONE_INTERFACE_MAP__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NONE_INTERFACE_MAP__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NONE_INTERFACE_MAP__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NONE_INTERFACE_MAP__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NONE_INTERFACE_MAP__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NONE_INTERFACE_MAP__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NONE_INTERFACE_MAP__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NONE_INTERFACE_MAP__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NONE_INTERFACE_MAP__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Bus None Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NONE_INTERFACE_MAP__XREF_BUS_NONE_INTERFACE = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRef Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NONE_INTERFACE_MAP__XREF_CONNECTION = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance Port Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NONE_INTERFACE_MAP__INSTANCE_PORT_MAP = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bus None Interface Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NONE_INTERFACE_MAP_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Bus None Interface Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NONE_INTERFACE_MAP_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.GeneralPortImpl <em>General Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.GeneralPortImpl
	 * @see Essence.impl.EssencePackageImpl#getGeneralPort()
	 * @generated
	 */
	int GENERAL_PORT = 48;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PORT__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PORT__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PORT__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PORT__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PORT__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PORT__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PORT__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PORT__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PORT__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The number of structural features of the '<em>General Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PORT_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>General Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PORT_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.PortImpl
	 * @see Essence.impl.EssencePackageImpl#getPort()
	 * @generated
	 */
	int PORT = 100;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CUSTOM = GENERAL_PORT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__HIDDEN = GENERAL_PORT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ID = GENERAL_PORT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__LONG_DESCRIPTION = GENERAL_PORT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = GENERAL_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__SHORT_DESCRIPTION = GENERAL_PORT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__SHORT_NAME = GENERAL_PORT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PROPERTY = GENERAL_PORT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__XREF_EXTENSION = GENERAL_PORT__XREF_EXTENSION;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = GENERAL_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = GENERAL_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.RealPortImpl <em>Real Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.RealPortImpl
	 * @see Essence.impl.EssencePackageImpl#getRealPort()
	 * @generated
	 */
	int REAL_PORT = 109;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_PORT__CUSTOM = PORT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_PORT__HIDDEN = PORT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_PORT__ID = PORT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_PORT__LONG_DESCRIPTION = PORT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_PORT__SHORT_DESCRIPTION = PORT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_PORT__SHORT_NAME = PORT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_PORT__PROPERTY = PORT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_PORT__XREF_EXTENSION = PORT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_PORT__DIRECTION = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRef Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_PORT__XREF_DEFAULT_VALUE = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Real Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Real Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.CablePortImpl <em>Cable Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.CablePortImpl
	 * @see Essence.impl.EssencePackageImpl#getCablePort()
	 * @generated
	 */
	int CABLE_PORT = 20;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_PORT__CUSTOM = REAL_PORT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_PORT__HIDDEN = REAL_PORT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_PORT__ID = REAL_PORT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_PORT__LONG_DESCRIPTION = REAL_PORT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_PORT__NAME = REAL_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_PORT__SHORT_DESCRIPTION = REAL_PORT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_PORT__SHORT_NAME = REAL_PORT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_PORT__PROPERTY = REAL_PORT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_PORT__XREF_EXTENSION = REAL_PORT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_PORT__DIRECTION = REAL_PORT__DIRECTION;

	/**
	 * The feature id for the '<em><b>XRef Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_PORT__XREF_DEFAULT_VALUE = REAL_PORT__XREF_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_PORT__DATA_TYPE = REAL_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cable Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_PORT_FEATURE_COUNT = REAL_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cable Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_PORT_OPERATION_COUNT = REAL_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SignalImpl
	 * @see Essence.impl.EssencePackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 125;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__XREF_DEFAULT_VALUE = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.CableSignalImpl <em>Cable Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.CableSignalImpl
	 * @see Essence.impl.EssencePackageImpl#getCableSignal()
	 * @generated
	 */
	int CABLE_SIGNAL = 21;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_SIGNAL__CUSTOM = SIGNAL__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_SIGNAL__HIDDEN = SIGNAL__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_SIGNAL__ID = SIGNAL__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_SIGNAL__LONG_DESCRIPTION = SIGNAL__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_SIGNAL__NAME = SIGNAL__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_SIGNAL__SHORT_DESCRIPTION = SIGNAL__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_SIGNAL__SHORT_NAME = SIGNAL__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_SIGNAL__PROPERTY = SIGNAL__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_SIGNAL__XREF_EXTENSION = SIGNAL__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_SIGNAL__XREF_DEFAULT_VALUE = SIGNAL__XREF_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_SIGNAL__DATA_TYPE = SIGNAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cable Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_SIGNAL_FEATURE_COUNT = SIGNAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cable Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_SIGNAL_OPERATION_COUNT = SIGNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ComponentImpl
	 * @see Essence.impl.EssencePackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 23;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CUSTOM = MODEL_ROOT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__HIDDEN = MODEL_ROOT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = MODEL_ROOT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LONG_DESCRIPTION = MODEL_ROOT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = MODEL_ROOT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SHORT_DESCRIPTION = MODEL_ROOT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SHORT_NAME = MODEL_ROOT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROPERTY = MODEL_ROOT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__XREF_EXTENSION = MODEL_ROOT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Const Def Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONST_DEF_BLOCK = MODEL_ROOT__CONST_DEF_BLOCK;

	/**
	 * The feature id for the '<em><b>Essence Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ESSENCE_VERSION = MODEL_ROOT__ESSENCE_VERSION;

	/**
	 * The feature id for the '<em><b>Generic Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__GENERIC_DECL_BLOCK = MODEL_ROOT__GENERIC_DECL_BLOCK;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MODULE = MODEL_ROOT__MODULE;

	/**
	 * The feature id for the '<em><b>Param Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PARAM_DECL_BLOCK = MODEL_ROOT__PARAM_DECL_BLOCK;

	/**
	 * The feature id for the '<em><b>VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__VLNV = MODEL_ROOT__VLNV;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INTERFACE = MODEL_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reg View Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REG_VIEW_BLOCK = MODEL_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Top Spin Clk Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TOP_SPIN_CLK_STYLE = MODEL_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reg Mem Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REG_MEM_SET = MODEL_ROOT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = MODEL_ROOT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = MODEL_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.InterfaceInstanceImpl <em>Interface Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.InterfaceInstanceImpl
	 * @see Essence.impl.EssencePackageImpl#getInterfaceInstance()
	 * @generated
	 */
	int INTERFACE_INSTANCE = 70;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INSTANCE__CUSTOM = INSTANCE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INSTANCE__HIDDEN = INSTANCE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INSTANCE__ID = INSTANCE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INSTANCE__LONG_DESCRIPTION = INSTANCE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INSTANCE__NAME = INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INSTANCE__SHORT_DESCRIPTION = INSTANCE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INSTANCE__SHORT_NAME = INSTANCE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INSTANCE__PROPERTY = INSTANCE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INSTANCE__XREF_EXTENSION = INSTANCE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INSTANCE__EXT_VLNV = INSTANCE__EXT_VLNV;

	/**
	 * The feature id for the '<em><b>Param Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INSTANCE__PARAM_MAP = INSTANCE__PARAM_MAP;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INSTANCE__GENERIC_MAP = INSTANCE__GENERIC_MAP;

	/**
	 * The feature id for the '<em><b>Instance Interface Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INSTANCE__INSTANCE_INTERFACE_MAP = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INSTANCE_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INSTANCE_OPERATION_COUNT = INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ComponentInstanceImpl
	 * @see Essence.impl.EssencePackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 24;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__CUSTOM = INTERFACE_INSTANCE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__HIDDEN = INTERFACE_INSTANCE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__ID = INTERFACE_INSTANCE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__LONG_DESCRIPTION = INTERFACE_INSTANCE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAME = INTERFACE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__SHORT_DESCRIPTION = INTERFACE_INSTANCE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__SHORT_NAME = INTERFACE_INSTANCE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PROPERTY = INTERFACE_INSTANCE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__XREF_EXTENSION = INTERFACE_INSTANCE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__EXT_VLNV = INTERFACE_INSTANCE__EXT_VLNV;

	/**
	 * The feature id for the '<em><b>Param Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PARAM_MAP = INTERFACE_INSTANCE__PARAM_MAP;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__GENERIC_MAP = INTERFACE_INSTANCE__GENERIC_MAP;

	/**
	 * The feature id for the '<em><b>Instance Interface Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__INSTANCE_INTERFACE_MAP = INTERFACE_INSTANCE__INSTANCE_INTERFACE_MAP;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = INTERFACE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OPERATION_COUNT = INTERFACE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SignalOwnerImpl <em>Signal Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SignalOwnerImpl
	 * @see Essence.impl.EssencePackageImpl#getSignalOwner()
	 * @generated
	 */
	int SIGNAL_OWNER = 127;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OWNER__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OWNER__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OWNER__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OWNER__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OWNER__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OWNER__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OWNER__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OWNER__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OWNER__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OWNER__SIGNAL = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signal Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OWNER__SIGNAL_MAP = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signal Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OWNER_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Signal Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OWNER_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ConnectionImpl
	 * @see Essence.impl.EssencePackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 25;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CUSTOM = SIGNAL_OWNER__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__HIDDEN = SIGNAL_OWNER__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ID = SIGNAL_OWNER__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__LONG_DESCRIPTION = SIGNAL_OWNER__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = SIGNAL_OWNER__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SHORT_DESCRIPTION = SIGNAL_OWNER__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SHORT_NAME = SIGNAL_OWNER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PROPERTY = SIGNAL_OWNER__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__XREF_EXTENSION = SIGNAL_OWNER__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SIGNAL = SIGNAL_OWNER__SIGNAL;

	/**
	 * The feature id for the '<em><b>Signal Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SIGNAL_MAP = SIGNAL_OWNER__SIGNAL_MAP;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__EXT_VLNV = SIGNAL_OWNER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = SIGNAL_OWNER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = SIGNAL_OWNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.VarDefBlockImpl <em>Var Def Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.VarDefBlockImpl
	 * @see Essence.impl.EssencePackageImpl#getVarDefBlock()
	 * @generated
	 */
	int VAR_DEF_BLOCK = 159;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF_BLOCK__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF_BLOCK__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF_BLOCK__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF_BLOCK__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF_BLOCK__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF_BLOCK__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF_BLOCK__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF_BLOCK__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF_BLOCK__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The number of structural features of the '<em>Var Def Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF_BLOCK_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Var Def Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF_BLOCK_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ConstDefBlockImpl <em>Const Def Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ConstDefBlockImpl
	 * @see Essence.impl.EssencePackageImpl#getConstDefBlock()
	 * @generated
	 */
	int CONST_DEF_BLOCK = 27;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF_BLOCK__CUSTOM = VAR_DEF_BLOCK__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF_BLOCK__HIDDEN = VAR_DEF_BLOCK__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF_BLOCK__ID = VAR_DEF_BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF_BLOCK__LONG_DESCRIPTION = VAR_DEF_BLOCK__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF_BLOCK__NAME = VAR_DEF_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF_BLOCK__SHORT_DESCRIPTION = VAR_DEF_BLOCK__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF_BLOCK__SHORT_NAME = VAR_DEF_BLOCK__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF_BLOCK__PROPERTY = VAR_DEF_BLOCK__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF_BLOCK__XREF_EXTENSION = VAR_DEF_BLOCK__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Const Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF_BLOCK__CONST_DEF = VAR_DEF_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Const Def Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF_BLOCK_FEATURE_COUNT = VAR_DEF_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Const Def Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF_BLOCK_OPERATION_COUNT = VAR_DEF_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.DataDeclImpl <em>Data Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.DataDeclImpl
	 * @see Essence.impl.EssencePackageImpl#getDataDecl()
	 * @generated
	 */
	int DATA_DECL = 28;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECL__CUSTOM = PARAM_DECL__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECL__HIDDEN = PARAM_DECL__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECL__ID = PARAM_DECL__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECL__LONG_DESCRIPTION = PARAM_DECL__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECL__NAME = PARAM_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECL__SHORT_DESCRIPTION = PARAM_DECL__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECL__SHORT_NAME = PARAM_DECL__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECL__PROPERTY = PARAM_DECL__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECL__XREF_EXTENSION = PARAM_DECL__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECL__DATA_TYPE = PARAM_DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECL__DEFAULT_VALUE = PARAM_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECL_FEATURE_COUNT = PARAM_DECL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECL_OPERATION_COUNT = PARAM_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.DataDefImpl <em>Data Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.DataDefImpl
	 * @see Essence.impl.EssencePackageImpl#getDataDef()
	 * @generated
	 */
	int DATA_DEF = 29;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF__CUSTOM = CONST_DEF__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF__HIDDEN = CONST_DEF__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF__ID = CONST_DEF__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF__LONG_DESCRIPTION = CONST_DEF__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF__NAME = CONST_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF__SHORT_DESCRIPTION = CONST_DEF__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF__SHORT_NAME = CONST_DEF__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF__PROPERTY = CONST_DEF__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF__XREF_EXTENSION = CONST_DEF__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF__DATA_TYPE = CONST_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF__VALUE = CONST_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF_FEATURE_COUNT = CONST_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF_OPERATION_COUNT = CONST_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.DataGenDeclImpl <em>Data Gen Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.DataGenDeclImpl
	 * @see Essence.impl.EssencePackageImpl#getDataGenDecl()
	 * @generated
	 */
	int DATA_GEN_DECL = 30;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GEN_DECL__CUSTOM = GENERIC_DECL__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GEN_DECL__HIDDEN = GENERIC_DECL__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GEN_DECL__ID = GENERIC_DECL__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GEN_DECL__LONG_DESCRIPTION = GENERIC_DECL__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GEN_DECL__NAME = GENERIC_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GEN_DECL__SHORT_DESCRIPTION = GENERIC_DECL__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GEN_DECL__SHORT_NAME = GENERIC_DECL__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GEN_DECL__PROPERTY = GENERIC_DECL__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GEN_DECL__XREF_EXTENSION = GENERIC_DECL__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GEN_DECL__DATA_TYPE = GENERIC_DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GEN_DECL__DEFAULT_VALUE = GENERIC_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Gen Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GEN_DECL_FEATURE_COUNT = GENERIC_DECL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Gen Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GEN_DECL_OPERATION_COUNT = GENERIC_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.DataTypeElementImpl <em>Data Type Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.DataTypeElementImpl
	 * @see Essence.impl.EssencePackageImpl#getDataTypeElement()
	 * @generated
	 */
	int DATA_TYPE_ELEMENT = 32;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ELEMENT__DATA_TYPE = ESSENCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ELEMENT__NAME = ESSENCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Type Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ELEMENT_FEATURE_COUNT = ESSENCE_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Type Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ELEMENT_OPERATION_COUNT = ESSENCE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.DescriptionItemImpl <em>Description Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.DescriptionItemImpl
	 * @see Essence.impl.EssencePackageImpl#getDescriptionItem()
	 * @generated
	 */
	int DESCRIPTION_ITEM = 33;

	/**
	 * The feature id for the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ITEM__HTML = ESSENCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dita</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ITEM__DITA = ESSENCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Description Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ITEM_FEATURE_COUNT = ESSENCE_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Description Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ITEM_OPERATION_COUNT = ESSENCE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.DocumentRootImpl
	 * @see Essence.impl.EssencePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 34;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BUS = 3;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Interface Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTERFACE_DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PACKAGE = 6;

	/**
	 * The feature id for the '<em><b>Pad Type DB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAD_TYPE_DB = 7;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRODUCT = 8;

	/**
	 * The feature id for the '<em><b>Silicon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SILICON = 9;

	/**
	 * The feature id for the '<em><b>Si Port DB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SI_PORT_DB = 10;

	/**
	 * The feature id for the '<em><b>Si Signal DB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SI_SIGNAL_DB = 11;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SYSTEM = 12;

	/**
	 * The feature id for the '<em><b>Test DB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEST_DB = 13;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Essence.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.EnumImpl
	 * @see Essence.impl.EssencePackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 35;

	/**
	 * The feature id for the '<em><b>Sign Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__SIGN_INTERPRETATION = COMPLEX_DATA_TYPE__SIGN_INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__OBJECT_TYPE = COMPLEX_DATA_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__VECTOR = COMPLEX_DATA_TYPE__VECTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__NAME = COMPLEX_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Enum Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__ENUM_ELEMENT = COMPLEX_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = COMPLEX_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = COMPLEX_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.EnumElementImpl <em>Enum Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.EnumElementImpl
	 * @see Essence.impl.EssencePackageImpl#getEnumElement()
	 * @generated
	 */
	int ENUM_ELEMENT = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ELEMENT__NAME = ESSENCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ELEMENT__VALUE = ESSENCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ELEMENT_FEATURE_COUNT = ESSENCE_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enum Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ELEMENT_OPERATION_COUNT = ESSENCE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.EnumerationElementImpl <em>Enumeration Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.EnumerationElementImpl
	 * @see Essence.impl.EssencePackageImpl#getEnumerationElement()
	 * @generated
	 */
	int ENUMERATION_ELEMENT = 38;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT__CUSTOM = INDEX_VAR_USER__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT__HIDDEN = INDEX_VAR_USER__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT__ID = INDEX_VAR_USER__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT__LONG_DESCRIPTION = INDEX_VAR_USER__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT__NAME = INDEX_VAR_USER__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT__SHORT_DESCRIPTION = INDEX_VAR_USER__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT__SHORT_NAME = INDEX_VAR_USER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT__PROPERTY = INDEX_VAR_USER__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT__XREF_EXTENSION = INDEX_VAR_USER__XREF_EXTENSION;

	/**
	 * The number of structural features of the '<em>Enumeration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT_FEATURE_COUNT = INDEX_VAR_USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enumeration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT_OPERATION_COUNT = INDEX_VAR_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.EnumerationImpl
	 * @see Essence.impl.EssencePackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 37;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__CUSTOM = ENUMERATION_ELEMENT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__HIDDEN = ENUMERATION_ELEMENT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ID = ENUMERATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LONG_DESCRIPTION = ENUMERATION_ELEMENT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = ENUMERATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__SHORT_DESCRIPTION = ENUMERATION_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__SHORT_NAME = ENUMERATION_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__PROPERTY = ENUMERATION_ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__XREF_EXTENSION = ENUMERATION_ELEMENT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__VALUE = ENUMERATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = ENUMERATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = ENUMERATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.EnumerationIntegerImpl <em>Enumeration Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.EnumerationIntegerImpl
	 * @see Essence.impl.EssencePackageImpl#getEnumerationInteger()
	 * @generated
	 */
	int ENUMERATION_INTEGER = 39;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_INTEGER__VALUE = ESSENCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_INTEGER_FEATURE_COUNT = ESSENCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_INTEGER_OPERATION_COUNT = ESSENCE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.EnumerationSequenceImpl <em>Enumeration Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.EnumerationSequenceImpl
	 * @see Essence.impl.EssencePackageImpl#getEnumerationSequence()
	 * @generated
	 */
	int ENUMERATION_SEQUENCE = 40;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE__CUSTOM = ENUMERATION_ELEMENT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE__HIDDEN = ENUMERATION_ELEMENT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE__ID = ENUMERATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE__LONG_DESCRIPTION = ENUMERATION_ELEMENT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE__NAME = ENUMERATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE__SHORT_DESCRIPTION = ENUMERATION_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE__SHORT_NAME = ENUMERATION_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE__PROPERTY = ENUMERATION_ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE__XREF_EXTENSION = ENUMERATION_ELEMENT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE__COUNT = ENUMERATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE__MIN_INDEX = ENUMERATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Index Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE__INDEX_STEP = ENUMERATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Index Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE__INDEX_VAR = ENUMERATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alt Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE__ALT_FORMAT = ENUMERATION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE__ENUMERATION = ENUMERATION_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Enumeration Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE_FEATURE_COUNT = ENUMERATION_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Enumeration Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE_OPERATION_COUNT = ENUMERATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.EnumerationStringImpl <em>Enumeration String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.EnumerationStringImpl
	 * @see Essence.impl.EssencePackageImpl#getEnumerationString()
	 * @generated
	 */
	int ENUMERATION_STRING = 41;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_STRING__VALUE = ESSENCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_STRING_FEATURE_COUNT = ESSENCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_STRING_OPERATION_COUNT = ESSENCE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.FunctionImpl
	 * @see Essence.impl.EssencePackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 43;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__TYPE = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__MODULE = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XRef Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__XREF_SIGNAL = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.RegMemElementImpl <em>Reg Mem Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.RegMemElementImpl
	 * @see Essence.impl.EssencePackageImpl#getRegMemElement()
	 * @generated
	 */
	int REG_MEM_ELEMENT = 114;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT__CUSTOM = INDEX_VAR_USER__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT__HIDDEN = INDEX_VAR_USER__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT__ID = INDEX_VAR_USER__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT__LONG_DESCRIPTION = INDEX_VAR_USER__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT__NAME = INDEX_VAR_USER__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT__SHORT_DESCRIPTION = INDEX_VAR_USER__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT__SHORT_NAME = INDEX_VAR_USER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT__PROPERTY = INDEX_VAR_USER__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT__XREF_EXTENSION = INDEX_VAR_USER__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT__OFFSET = INDEX_VAR_USER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reg Mem Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT_FEATURE_COUNT = INDEX_VAR_USER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reg Mem Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT_OPERATION_COUNT = INDEX_VAR_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SequenceElementImpl <em>Sequence Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SequenceElementImpl
	 * @see Essence.impl.EssencePackageImpl#getSequenceElement()
	 * @generated
	 */
	int SEQUENCE_ELEMENT = 121;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT__CUSTOM = REG_MEM_ELEMENT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT__HIDDEN = REG_MEM_ELEMENT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT__ID = REG_MEM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT__LONG_DESCRIPTION = REG_MEM_ELEMENT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT__NAME = REG_MEM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT__SHORT_DESCRIPTION = REG_MEM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT__SHORT_NAME = REG_MEM_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT__PROPERTY = REG_MEM_ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT__XREF_EXTENSION = REG_MEM_ELEMENT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT__OFFSET = REG_MEM_ELEMENT__OFFSET;

	/**
	 * The feature id for the '<em><b>Data Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT__DATA_WIDTH = REG_MEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT__ACCESS_CONDITION = REG_MEM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sequence Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT_FEATURE_COUNT = REG_MEM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sequence Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT_OPERATION_COUNT = REG_MEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.GapElementImpl <em>Gap Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.GapElementImpl
	 * @see Essence.impl.EssencePackageImpl#getGapElement()
	 * @generated
	 */
	int GAP_ELEMENT = 44;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT__CUSTOM = SEQUENCE_ELEMENT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT__HIDDEN = SEQUENCE_ELEMENT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT__ID = SEQUENCE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT__LONG_DESCRIPTION = SEQUENCE_ELEMENT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT__NAME = SEQUENCE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT__SHORT_DESCRIPTION = SEQUENCE_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT__SHORT_NAME = SEQUENCE_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT__PROPERTY = SEQUENCE_ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT__XREF_EXTENSION = SEQUENCE_ELEMENT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT__OFFSET = SEQUENCE_ELEMENT__OFFSET;

	/**
	 * The feature id for the '<em><b>Data Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT__DATA_WIDTH = SEQUENCE_ELEMENT__DATA_WIDTH;

	/**
	 * The feature id for the '<em><b>Access Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT__ACCESS_CONDITION = SEQUENCE_ELEMENT__ACCESS_CONDITION;

	/**
	 * The number of structural features of the '<em>Gap Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT_FEATURE_COUNT = SEQUENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gap Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT_OPERATION_COUNT = SEQUENCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.GeneralInterfaceImpl <em>General Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.GeneralInterfaceImpl
	 * @see Essence.impl.EssencePackageImpl#getGeneralInterface()
	 * @generated
	 */
	int GENERAL_INTERFACE = 46;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INTERFACE__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INTERFACE__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INTERFACE__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INTERFACE__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INTERFACE__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INTERFACE__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INTERFACE__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INTERFACE__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INTERFACE__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Interface View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INTERFACE__INTERFACE_VIEW = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>General Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INTERFACE_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>General Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INTERFACE_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.PadImpl <em>Pad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.PadImpl
	 * @see Essence.impl.EssencePackageImpl#getPad()
	 * @generated
	 */
	int PAD = 86;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The number of structural features of the '<em>Pad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SinglePadImpl <em>Single Pad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SinglePadImpl
	 * @see Essence.impl.EssencePackageImpl#getSinglePad()
	 * @generated
	 */
	int SINGLE_PAD = 137;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAD__CUSTOM = PAD__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAD__HIDDEN = PAD__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAD__ID = PAD__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAD__LONG_DESCRIPTION = PAD__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAD__NAME = PAD__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAD__SHORT_DESCRIPTION = PAD__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAD__SHORT_NAME = PAD__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAD__PROPERTY = PAD__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAD__XREF_EXTENSION = PAD__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAD__XCOORDINATE = PAD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAD__YCOORDINATE = PAD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Spacer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAD__SPACER = PAD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Opening</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAD__OPENING = PAD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAD__LOCATION = PAD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pad Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAD__PAD_COUNT = PAD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAD__PLACE = PAD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAD__ORIENTATION = PAD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAD__POWER = PAD_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAD__GROUND = PAD_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Single Pad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAD_FEATURE_COUNT = PAD_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Single Pad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAD_OPERATION_COUNT = PAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.GeneralPadImpl <em>General Pad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.GeneralPadImpl
	 * @see Essence.impl.EssencePackageImpl#getGeneralPad()
	 * @generated
	 */
	int GENERAL_PAD = 47;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__CUSTOM = SINGLE_PAD__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__HIDDEN = SINGLE_PAD__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__ID = SINGLE_PAD__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__LONG_DESCRIPTION = SINGLE_PAD__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__NAME = SINGLE_PAD__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__SHORT_DESCRIPTION = SINGLE_PAD__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__SHORT_NAME = SINGLE_PAD__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__PROPERTY = SINGLE_PAD__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__XREF_EXTENSION = SINGLE_PAD__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__XCOORDINATE = SINGLE_PAD__XCOORDINATE;

	/**
	 * The feature id for the '<em><b>YCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__YCOORDINATE = SINGLE_PAD__YCOORDINATE;

	/**
	 * The feature id for the '<em><b>Spacer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__SPACER = SINGLE_PAD__SPACER;

	/**
	 * The feature id for the '<em><b>Opening</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__OPENING = SINGLE_PAD__OPENING;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__LOCATION = SINGLE_PAD__LOCATION;

	/**
	 * The feature id for the '<em><b>Pad Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__PAD_COUNT = SINGLE_PAD__PAD_COUNT;

	/**
	 * The feature id for the '<em><b>Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__PLACE = SINGLE_PAD__PLACE;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__ORIENTATION = SINGLE_PAD__ORIENTATION;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__POWER = SINGLE_PAD__POWER;

	/**
	 * The feature id for the '<em><b>Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__GROUND = SINGLE_PAD__GROUND;

	/**
	 * The feature id for the '<em><b>XRef Pad Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__XREF_PAD_TYPE = SINGLE_PAD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lib</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__LIB = SINGLE_PAD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__WIDTH = SINGLE_PAD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>General Pad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD_FEATURE_COUNT = SINGLE_PAD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>General Pad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD_OPERATION_COUNT = SINGLE_PAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.GeneralRegisterImpl <em>General Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.GeneralRegisterImpl
	 * @see Essence.impl.EssencePackageImpl#getGeneralRegister()
	 * @generated
	 */
	int GENERAL_REGISTER = 49;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER__CUSTOM = SEQUENCE_ELEMENT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER__HIDDEN = SEQUENCE_ELEMENT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER__ID = SEQUENCE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER__LONG_DESCRIPTION = SEQUENCE_ELEMENT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER__NAME = SEQUENCE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER__SHORT_DESCRIPTION = SEQUENCE_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER__SHORT_NAME = SEQUENCE_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER__PROPERTY = SEQUENCE_ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER__XREF_EXTENSION = SEQUENCE_ELEMENT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER__OFFSET = SEQUENCE_ELEMENT__OFFSET;

	/**
	 * The feature id for the '<em><b>Data Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER__DATA_WIDTH = SEQUENCE_ELEMENT__DATA_WIDTH;

	/**
	 * The feature id for the '<em><b>Access Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER__ACCESS_CONDITION = SEQUENCE_ELEMENT__ACCESS_CONDITION;

	/**
	 * The feature id for the '<em><b>No Shadow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER__NO_SHADOW = SEQUENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reset Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER__RESET_TYPE = SEQUENCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>General Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER_FEATURE_COUNT = SEQUENCE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>General Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER_OPERATION_COUNT = SEQUENCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.GenericDeclBlockImpl <em>Generic Decl Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.GenericDeclBlockImpl
	 * @see Essence.impl.EssencePackageImpl#getGenericDeclBlock()
	 * @generated
	 */
	int GENERIC_DECL_BLOCK = 51;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL_BLOCK__CUSTOM = VAR_DEF_BLOCK__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL_BLOCK__HIDDEN = VAR_DEF_BLOCK__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL_BLOCK__ID = VAR_DEF_BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL_BLOCK__LONG_DESCRIPTION = VAR_DEF_BLOCK__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL_BLOCK__NAME = VAR_DEF_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL_BLOCK__SHORT_DESCRIPTION = VAR_DEF_BLOCK__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL_BLOCK__SHORT_NAME = VAR_DEF_BLOCK__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL_BLOCK__PROPERTY = VAR_DEF_BLOCK__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL_BLOCK__XREF_EXTENSION = VAR_DEF_BLOCK__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Generic Decl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL_BLOCK__GENERIC_DECL = VAR_DEF_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generic Decl Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL_BLOCK_FEATURE_COUNT = VAR_DEF_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Generic Decl Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL_BLOCK_OPERATION_COUNT = VAR_DEF_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.GenericMapImpl <em>Generic Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.GenericMapImpl
	 * @see Essence.impl.EssencePackageImpl#getGenericMap()
	 * @generated
	 */
	int GENERIC_MAP = 52;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MAP__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MAP__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MAP__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MAP__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MAP__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MAP__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MAP__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MAP__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MAP__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Generic Decl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MAP__XREF_GENERIC_DECL = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MAP__VALUE = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generic Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MAP_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Generic Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MAP_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.InstanceInterfaceMapImpl <em>Instance Interface Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.InstanceInterfaceMapImpl
	 * @see Essence.impl.EssencePackageImpl#getInstanceInterfaceMap()
	 * @generated
	 */
	int INSTANCE_INTERFACE_MAP = 55;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_INTERFACE_MAP__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_INTERFACE_MAP__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_INTERFACE_MAP__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_INTERFACE_MAP__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_INTERFACE_MAP__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_INTERFACE_MAP__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_INTERFACE_MAP__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_INTERFACE_MAP__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_INTERFACE_MAP__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Instance Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_INTERFACE_MAP__XREF_INSTANCE_INTERFACE = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRef Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_INTERFACE_MAP__XREF_CONNECTION = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance Port Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_INTERFACE_MAP__INSTANCE_PORT_MAP = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instance Interface Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_INTERFACE_MAP_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Instance Interface Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_INTERFACE_MAP_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.InstancePortMapImpl <em>Instance Port Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.InstancePortMapImpl
	 * @see Essence.impl.EssencePackageImpl#getInstancePortMap()
	 * @generated
	 */
	int INSTANCE_PORT_MAP = 56;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PORT_MAP__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PORT_MAP__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PORT_MAP__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PORT_MAP__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PORT_MAP__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PORT_MAP__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PORT_MAP__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PORT_MAP__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PORT_MAP__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Instance Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PORT_MAP__XREF_INSTANCE_PORT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRef Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PORT_MAP__XREF_SIGNAL = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance Port Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PORT_MAP_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Instance Port Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PORT_MAP_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.InstanceShellInterfaceMapImpl <em>Instance Shell Interface Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.InstanceShellInterfaceMapImpl
	 * @see Essence.impl.EssencePackageImpl#getInstanceShellInterfaceMap()
	 * @generated
	 */
	int INSTANCE_SHELL_INTERFACE_MAP = 57;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_INTERFACE_MAP__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_INTERFACE_MAP__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_INTERFACE_MAP__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_INTERFACE_MAP__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_INTERFACE_MAP__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_INTERFACE_MAP__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_INTERFACE_MAP__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_INTERFACE_MAP__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_INTERFACE_MAP__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Instance Shell Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_INTERFACE_MAP__XREF_INSTANCE_SHELL_INTERFACE = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRef Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_INTERFACE_MAP__XREF_CONNECTION = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance Shell Port Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_INTERFACE_MAP__INSTANCE_SHELL_PORT_MAP = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instance Shell Interface Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_INTERFACE_MAP_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Instance Shell Interface Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_INTERFACE_MAP_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.InstanceShellPortMapImpl <em>Instance Shell Port Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.InstanceShellPortMapImpl
	 * @see Essence.impl.EssencePackageImpl#getInstanceShellPortMap()
	 * @generated
	 */
	int INSTANCE_SHELL_PORT_MAP = 58;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_PORT_MAP__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_PORT_MAP__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_PORT_MAP__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_PORT_MAP__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_PORT_MAP__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_PORT_MAP__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_PORT_MAP__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_PORT_MAP__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_PORT_MAP__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Instance Shell Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_PORT_MAP__XREF_INSTANCE_SHELL_PORT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRef Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_PORT_MAP__XREF_SIGNAL = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance Shell Port Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_PORT_MAP_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Instance Shell Port Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_PORT_MAP_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.IntegerDeclImpl <em>Integer Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.IntegerDeclImpl
	 * @see Essence.impl.EssencePackageImpl#getIntegerDecl()
	 * @generated
	 */
	int INTEGER_DECL = 59;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DECL__CUSTOM = PARAM_DECL__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DECL__HIDDEN = PARAM_DECL__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DECL__ID = PARAM_DECL__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DECL__LONG_DESCRIPTION = PARAM_DECL__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DECL__NAME = PARAM_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DECL__SHORT_DESCRIPTION = PARAM_DECL__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DECL__SHORT_NAME = PARAM_DECL__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DECL__PROPERTY = PARAM_DECL__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DECL__XREF_EXTENSION = PARAM_DECL__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DECL__DEFAULT_VALUE = PARAM_DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DECL__ENUMERATION = PARAM_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DECL_FEATURE_COUNT = PARAM_DECL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Integer Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DECL_OPERATION_COUNT = PARAM_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.IntegerDefImpl <em>Integer Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.IntegerDefImpl
	 * @see Essence.impl.EssencePackageImpl#getIntegerDef()
	 * @generated
	 */
	int INTEGER_DEF = 60;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DEF__CUSTOM = CONST_DEF__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DEF__HIDDEN = CONST_DEF__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DEF__ID = CONST_DEF__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DEF__LONG_DESCRIPTION = CONST_DEF__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DEF__NAME = CONST_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DEF__SHORT_DESCRIPTION = CONST_DEF__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DEF__SHORT_NAME = CONST_DEF__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DEF__PROPERTY = CONST_DEF__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DEF__XREF_EXTENSION = CONST_DEF__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DEF__VALUE = CONST_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DEF_FEATURE_COUNT = CONST_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DEF_OPERATION_COUNT = CONST_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.IntegerGenDeclImpl <em>Integer Gen Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.IntegerGenDeclImpl
	 * @see Essence.impl.EssencePackageImpl#getIntegerGenDecl()
	 * @generated
	 */
	int INTEGER_GEN_DECL = 61;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GEN_DECL__CUSTOM = GENERIC_DECL__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GEN_DECL__HIDDEN = GENERIC_DECL__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GEN_DECL__ID = GENERIC_DECL__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GEN_DECL__LONG_DESCRIPTION = GENERIC_DECL__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GEN_DECL__NAME = GENERIC_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GEN_DECL__SHORT_DESCRIPTION = GENERIC_DECL__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GEN_DECL__SHORT_NAME = GENERIC_DECL__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GEN_DECL__PROPERTY = GENERIC_DECL__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GEN_DECL__XREF_EXTENSION = GENERIC_DECL__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GEN_DECL__DEFAULT_VALUE = GENERIC_DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GEN_DECL__ENUMERATION = GENERIC_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Gen Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GEN_DECL_FEATURE_COUNT = GENERIC_DECL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Integer Gen Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GEN_DECL_OPERATION_COUNT = GENERIC_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.InterfaceImpl
	 * @see Essence.impl.EssencePackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 62;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CUSTOM = GENERAL_INTERFACE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__HIDDEN = GENERAL_INTERFACE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ID = GENERAL_INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__LONG_DESCRIPTION = GENERAL_INTERFACE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = GENERAL_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SHORT_DESCRIPTION = GENERAL_INTERFACE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SHORT_NAME = GENERAL_INTERFACE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PROPERTY = GENERAL_INTERFACE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__XREF_EXTENSION = GENERAL_INTERFACE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Interface View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__INTERFACE_VIEW = GENERAL_INTERFACE__INTERFACE_VIEW;

	/**
	 * The feature id for the '<em><b>Address Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ADDRESS_UNIT = GENERAL_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DATA_UNIT = GENERAL_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__BASE_ADDRESS = GENERAL_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__EXT_VLNV = GENERAL_INTERFACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__RANGE = GENERAL_INTERFACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ROLE = GENERAL_INTERFACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>System Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SYSTEM_GROUP = GENERAL_INTERFACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Address Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ADDRESS_BLOCK = GENERAL_INTERFACE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = GENERAL_INTERFACE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = GENERAL_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.InterfaceDefPortImpl <em>Interface Def Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.InterfaceDefPortImpl
	 * @see Essence.impl.EssencePackageImpl#getInterfaceDefPort()
	 * @generated
	 */
	int INTERFACE_DEF_PORT = 65;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_PORT__CUSTOM = GENERAL_PORT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_PORT__HIDDEN = GENERAL_PORT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_PORT__ID = GENERAL_PORT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_PORT__LONG_DESCRIPTION = GENERAL_PORT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_PORT__NAME = GENERAL_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_PORT__SHORT_DESCRIPTION = GENERAL_PORT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_PORT__SHORT_NAME = GENERAL_PORT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_PORT__PROPERTY = GENERAL_PORT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_PORT__XREF_EXTENSION = GENERAL_PORT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_PORT__XREF_SIGNAL = GENERAL_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_PORT__DIRECTION = GENERAL_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface Def Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_PORT_FEATURE_COUNT = GENERAL_PORT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interface Def Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_PORT_OPERATION_COUNT = GENERAL_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.InterfaceDefCablePortImpl <em>Interface Def Cable Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.InterfaceDefCablePortImpl
	 * @see Essence.impl.EssencePackageImpl#getInterfaceDefCablePort()
	 * @generated
	 */
	int INTERFACE_DEF_CABLE_PORT = 63;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_CABLE_PORT__CUSTOM = INTERFACE_DEF_PORT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_CABLE_PORT__HIDDEN = INTERFACE_DEF_PORT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_CABLE_PORT__ID = INTERFACE_DEF_PORT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_CABLE_PORT__LONG_DESCRIPTION = INTERFACE_DEF_PORT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_CABLE_PORT__NAME = INTERFACE_DEF_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_CABLE_PORT__SHORT_DESCRIPTION = INTERFACE_DEF_PORT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_CABLE_PORT__SHORT_NAME = INTERFACE_DEF_PORT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_CABLE_PORT__PROPERTY = INTERFACE_DEF_PORT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_CABLE_PORT__XREF_EXTENSION = INTERFACE_DEF_PORT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_CABLE_PORT__XREF_SIGNAL = INTERFACE_DEF_PORT__XREF_SIGNAL;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_CABLE_PORT__DIRECTION = INTERFACE_DEF_PORT__DIRECTION;

	/**
	 * The number of structural features of the '<em>Interface Def Cable Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_CABLE_PORT_FEATURE_COUNT = INTERFACE_DEF_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface Def Cable Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_CABLE_PORT_OPERATION_COUNT = INTERFACE_DEF_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.InterfaceDefinitionImpl <em>Interface Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.InterfaceDefinitionImpl
	 * @see Essence.impl.EssencePackageImpl#getInterfaceDefinition()
	 * @generated
	 */
	int INTERFACE_DEFINITION = 64;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__CUSTOM = MODEL_ROOT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__HIDDEN = MODEL_ROOT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__ID = MODEL_ROOT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__LONG_DESCRIPTION = MODEL_ROOT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__NAME = MODEL_ROOT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__SHORT_DESCRIPTION = MODEL_ROOT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__SHORT_NAME = MODEL_ROOT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__PROPERTY = MODEL_ROOT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__XREF_EXTENSION = MODEL_ROOT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Const Def Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__CONST_DEF_BLOCK = MODEL_ROOT__CONST_DEF_BLOCK;

	/**
	 * The feature id for the '<em><b>Essence Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__ESSENCE_VERSION = MODEL_ROOT__ESSENCE_VERSION;

	/**
	 * The feature id for the '<em><b>Generic Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__GENERIC_DECL_BLOCK = MODEL_ROOT__GENERIC_DECL_BLOCK;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__MODULE = MODEL_ROOT__MODULE;

	/**
	 * The feature id for the '<em><b>Param Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__PARAM_DECL_BLOCK = MODEL_ROOT__PARAM_DECL_BLOCK;

	/**
	 * The feature id for the '<em><b>VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__VLNV = MODEL_ROOT__VLNV;

	/**
	 * The feature id for the '<em><b>Address Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__ADDRESS_UNIT = MODEL_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__DATA_UNIT = MODEL_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__EXT_VLNV = MODEL_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interface Def View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__INTERFACE_DEF_VIEW = MODEL_ROOT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interface Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION_FEATURE_COUNT = MODEL_ROOT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Interface Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION_OPERATION_COUNT = MODEL_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.InterfaceDefRoleImpl <em>Interface Def Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.InterfaceDefRoleImpl
	 * @see Essence.impl.EssencePackageImpl#getInterfaceDefRole()
	 * @generated
	 */
	int INTERFACE_DEF_ROLE = 66;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_ROLE__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_ROLE__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_ROLE__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_ROLE__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_ROLE__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_ROLE__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_ROLE__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_ROLE__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_ROLE__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_ROLE__ROLE = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_ROLE__SYSTEM_GROUP = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface Def Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_ROLE__INTERFACE_DEF_PORT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interface Def Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_ROLE_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Interface Def Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_ROLE_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.InterfaceDefTransactionalPortImpl <em>Interface Def Transactional Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.InterfaceDefTransactionalPortImpl
	 * @see Essence.impl.EssencePackageImpl#getInterfaceDefTransactionalPort()
	 * @generated
	 */
	int INTERFACE_DEF_TRANSACTIONAL_PORT = 67;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_TRANSACTIONAL_PORT__CUSTOM = INTERFACE_DEF_PORT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_TRANSACTIONAL_PORT__HIDDEN = INTERFACE_DEF_PORT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_TRANSACTIONAL_PORT__ID = INTERFACE_DEF_PORT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_TRANSACTIONAL_PORT__LONG_DESCRIPTION = INTERFACE_DEF_PORT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_TRANSACTIONAL_PORT__NAME = INTERFACE_DEF_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_TRANSACTIONAL_PORT__SHORT_DESCRIPTION = INTERFACE_DEF_PORT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_TRANSACTIONAL_PORT__SHORT_NAME = INTERFACE_DEF_PORT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_TRANSACTIONAL_PORT__PROPERTY = INTERFACE_DEF_PORT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_TRANSACTIONAL_PORT__XREF_EXTENSION = INTERFACE_DEF_PORT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_TRANSACTIONAL_PORT__XREF_SIGNAL = INTERFACE_DEF_PORT__XREF_SIGNAL;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_TRANSACTIONAL_PORT__DIRECTION = INTERFACE_DEF_PORT__DIRECTION;

	/**
	 * The feature id for the '<em><b>Initiative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_TRANSACTIONAL_PORT__INITIATIVE = INTERFACE_DEF_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Def Transactional Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_TRANSACTIONAL_PORT_FEATURE_COUNT = INTERFACE_DEF_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface Def Transactional Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_TRANSACTIONAL_PORT_OPERATION_COUNT = INTERFACE_DEF_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.InterfaceDefViewImpl <em>Interface Def View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.InterfaceDefViewImpl
	 * @see Essence.impl.EssencePackageImpl#getInterfaceDefView()
	 * @generated
	 */
	int INTERFACE_DEF_VIEW = 68;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_VIEW__CUSTOM = SIGNAL_OWNER__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_VIEW__HIDDEN = SIGNAL_OWNER__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_VIEW__ID = SIGNAL_OWNER__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_VIEW__LONG_DESCRIPTION = SIGNAL_OWNER__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_VIEW__NAME = SIGNAL_OWNER__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_VIEW__SHORT_DESCRIPTION = SIGNAL_OWNER__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_VIEW__SHORT_NAME = SIGNAL_OWNER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_VIEW__PROPERTY = SIGNAL_OWNER__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_VIEW__XREF_EXTENSION = SIGNAL_OWNER__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_VIEW__SIGNAL = SIGNAL_OWNER__SIGNAL;

	/**
	 * The feature id for the '<em><b>Signal Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_VIEW__SIGNAL_MAP = SIGNAL_OWNER__SIGNAL_MAP;

	/**
	 * The feature id for the '<em><b>Interface Def Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_VIEW__INTERFACE_DEF_ROLE = SIGNAL_OWNER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Def View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_VIEW_FEATURE_COUNT = SIGNAL_OWNER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface Def View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_VIEW_OPERATION_COUNT = SIGNAL_OWNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.InterfaceDefWirePortImpl <em>Interface Def Wire Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.InterfaceDefWirePortImpl
	 * @see Essence.impl.EssencePackageImpl#getInterfaceDefWirePort()
	 * @generated
	 */
	int INTERFACE_DEF_WIRE_PORT = 69;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_WIRE_PORT__CUSTOM = INTERFACE_DEF_PORT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_WIRE_PORT__HIDDEN = INTERFACE_DEF_PORT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_WIRE_PORT__ID = INTERFACE_DEF_PORT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_WIRE_PORT__LONG_DESCRIPTION = INTERFACE_DEF_PORT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_WIRE_PORT__NAME = INTERFACE_DEF_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_WIRE_PORT__SHORT_DESCRIPTION = INTERFACE_DEF_PORT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_WIRE_PORT__SHORT_NAME = INTERFACE_DEF_PORT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_WIRE_PORT__PROPERTY = INTERFACE_DEF_PORT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_WIRE_PORT__XREF_EXTENSION = INTERFACE_DEF_PORT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_WIRE_PORT__XREF_SIGNAL = INTERFACE_DEF_PORT__XREF_SIGNAL;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_WIRE_PORT__DIRECTION = INTERFACE_DEF_PORT__DIRECTION;

	/**
	 * The number of structural features of the '<em>Interface Def Wire Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_WIRE_PORT_FEATURE_COUNT = INTERFACE_DEF_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface Def Wire Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_WIRE_PORT_OPERATION_COUNT = INTERFACE_DEF_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.InterfacePortMapImpl <em>Interface Port Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.InterfacePortMapImpl
	 * @see Essence.impl.EssencePackageImpl#getInterfacePortMap()
	 * @generated
	 */
	int INTERFACE_PORT_MAP = 71;

	/**
	 * The feature id for the '<em><b>XRef Local Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PORT_MAP__XREF_LOCAL_PORT = ESSENCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRef Interface Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PORT_MAP__XREF_INTERFACE_PORT = ESSENCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface Port Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PORT_MAP_FEATURE_COUNT = ESSENCE_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interface Port Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PORT_MAP_OPERATION_COUNT = ESSENCE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.InterfaceViewImpl <em>Interface View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.InterfaceViewImpl
	 * @see Essence.impl.EssencePackageImpl#getInterfaceView()
	 * @generated
	 */
	int INTERFACE_VIEW = 72;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VIEW__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VIEW__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VIEW__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VIEW__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VIEW__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VIEW__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VIEW__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VIEW__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VIEW__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Interface Port Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VIEW__INTERFACE_PORT_MAP = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VIEW__PORT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interface View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VIEW_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interface View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VIEW_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.LocalInterfaceMapImpl <em>Local Interface Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.LocalInterfaceMapImpl
	 * @see Essence.impl.EssencePackageImpl#getLocalInterfaceMap()
	 * @generated
	 */
	int LOCAL_INTERFACE_MAP = 73;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERFACE_MAP__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERFACE_MAP__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERFACE_MAP__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERFACE_MAP__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERFACE_MAP__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERFACE_MAP__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERFACE_MAP__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERFACE_MAP__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERFACE_MAP__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Local Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERFACE_MAP__XREF_LOCAL_INTERFACE = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRef Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERFACE_MAP__XREF_CONNECTION = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Local Port Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERFACE_MAP__LOCAL_PORT_MAP = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Local Interface Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERFACE_MAP_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Local Interface Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERFACE_MAP_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.LocalPortMapImpl <em>Local Port Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.LocalPortMapImpl
	 * @see Essence.impl.EssencePackageImpl#getLocalPortMap()
	 * @generated
	 */
	int LOCAL_PORT_MAP = 74;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PORT_MAP__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PORT_MAP__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PORT_MAP__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PORT_MAP__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PORT_MAP__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PORT_MAP__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PORT_MAP__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PORT_MAP__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PORT_MAP__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Local Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PORT_MAP__XREF_LOCAL_PORT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRef Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PORT_MAP__XREF_SIGNAL = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Local Port Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PORT_MAP_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Local Port Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PORT_MAP_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.MemoryImpl <em>Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.MemoryImpl
	 * @see Essence.impl.EssencePackageImpl#getMemory()
	 * @generated
	 */
	int MEMORY = 75;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__CUSTOM = SEQUENCE_ELEMENT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__HIDDEN = SEQUENCE_ELEMENT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__ID = SEQUENCE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__LONG_DESCRIPTION = SEQUENCE_ELEMENT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__NAME = SEQUENCE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__SHORT_DESCRIPTION = SEQUENCE_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__SHORT_NAME = SEQUENCE_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__PROPERTY = SEQUENCE_ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__XREF_EXTENSION = SEQUENCE_ELEMENT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__OFFSET = SEQUENCE_ELEMENT__OFFSET;

	/**
	 * The feature id for the '<em><b>Data Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__DATA_WIDTH = SEQUENCE_ELEMENT__DATA_WIDTH;

	/**
	 * The feature id for the '<em><b>Access Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__ACCESS_CONDITION = SEQUENCE_ELEMENT__ACCESS_CONDITION;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__ACCESS_TYPE = SEQUENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__SIZE = SEQUENCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Endianness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__ENDIANNESS = SEQUENCE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_FEATURE_COUNT = SEQUENCE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_OPERATION_COUNT = SEQUENCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.MethodDataTypeImpl <em>Method Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.MethodDataTypeImpl
	 * @see Essence.impl.EssencePackageImpl#getMethodDataType()
	 * @generated
	 */
	int METHOD_DATA_TYPE = 76;

	/**
	 * The feature id for the '<em><b>Return Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DATA_TYPE__RETURN_DATA_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DATA_TYPE__REFERENCE = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method Data Type Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DATA_TYPE__METHOD_DATA_TYPE_ELEMENT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Method Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Method Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DATA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.MethodDataTypeElementImpl <em>Method Data Type Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.MethodDataTypeElementImpl
	 * @see Essence.impl.EssencePackageImpl#getMethodDataTypeElement()
	 * @generated
	 */
	int METHOD_DATA_TYPE_ELEMENT = 77;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DATA_TYPE_ELEMENT__DATA_TYPE = ESSENCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DATA_TYPE_ELEMENT__NAME = ESSENCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DATA_TYPE_ELEMENT__REFERENCE = ESSENCE_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Method Data Type Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DATA_TYPE_ELEMENT_FEATURE_COUNT = ESSENCE_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Method Data Type Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DATA_TYPE_ELEMENT_OPERATION_COUNT = ESSENCE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ModuleImpl
	 * @see Essence.impl.EssencePackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 79;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODULE = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.MultiPadImpl <em>Multi Pad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.MultiPadImpl
	 * @see Essence.impl.EssencePackageImpl#getMultiPad()
	 * @generated
	 */
	int MULTI_PAD = 80;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAD__CUSTOM = PAD__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAD__HIDDEN = PAD__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAD__ID = PAD__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAD__LONG_DESCRIPTION = PAD__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAD__NAME = PAD__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAD__SHORT_DESCRIPTION = PAD__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAD__SHORT_NAME = PAD__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAD__PROPERTY = PAD__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAD__XREF_EXTENSION = PAD__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Single Pad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAD__SINGLE_PAD = PAD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Pad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAD_FEATURE_COUNT = PAD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multi Pad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAD_OPERATION_COUNT = PAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.MultiViewRegisterImpl <em>Multi View Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.MultiViewRegisterImpl
	 * @see Essence.impl.EssencePackageImpl#getMultiViewRegister()
	 * @generated
	 */
	int MULTI_VIEW_REGISTER = 81;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER__CUSTOM = GENERAL_REGISTER__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER__HIDDEN = GENERAL_REGISTER__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER__ID = GENERAL_REGISTER__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER__LONG_DESCRIPTION = GENERAL_REGISTER__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER__NAME = GENERAL_REGISTER__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER__SHORT_DESCRIPTION = GENERAL_REGISTER__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER__SHORT_NAME = GENERAL_REGISTER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER__PROPERTY = GENERAL_REGISTER__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER__XREF_EXTENSION = GENERAL_REGISTER__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER__OFFSET = GENERAL_REGISTER__OFFSET;

	/**
	 * The feature id for the '<em><b>Data Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER__DATA_WIDTH = GENERAL_REGISTER__DATA_WIDTH;

	/**
	 * The feature id for the '<em><b>Access Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER__ACCESS_CONDITION = GENERAL_REGISTER__ACCESS_CONDITION;

	/**
	 * The feature id for the '<em><b>No Shadow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER__NO_SHADOW = GENERAL_REGISTER__NO_SHADOW;

	/**
	 * The feature id for the '<em><b>Reset Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER__RESET_TYPE = GENERAL_REGISTER__RESET_TYPE;

	/**
	 * The feature id for the '<em><b>XRef Register View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER__XREF_REGISTER_VIEW = GENERAL_REGISTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Register View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER__REGISTER_VIEW = GENERAL_REGISTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multi View Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER_FEATURE_COUNT = GENERAL_REGISTER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Multi View Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER_OPERATION_COUNT = GENERAL_REGISTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.NetImpl <em>Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.NetImpl
	 * @see Essence.impl.EssencePackageImpl#getNet()
	 * @generated
	 */
	int NET = 82;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The number of structural features of the '<em>Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.NoneInterfaceImpl <em>None Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.NoneInterfaceImpl
	 * @see Essence.impl.EssencePackageImpl#getNoneInterface()
	 * @generated
	 */
	int NONE_INTERFACE = 83;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_INTERFACE__CUSTOM = GENERAL_INTERFACE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_INTERFACE__HIDDEN = GENERAL_INTERFACE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_INTERFACE__ID = GENERAL_INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_INTERFACE__LONG_DESCRIPTION = GENERAL_INTERFACE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_INTERFACE__NAME = GENERAL_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_INTERFACE__SHORT_DESCRIPTION = GENERAL_INTERFACE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_INTERFACE__SHORT_NAME = GENERAL_INTERFACE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_INTERFACE__PROPERTY = GENERAL_INTERFACE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_INTERFACE__XREF_EXTENSION = GENERAL_INTERFACE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Interface View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_INTERFACE__INTERFACE_VIEW = GENERAL_INTERFACE__INTERFACE_VIEW;

	/**
	 * The number of structural features of the '<em>None Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_INTERFACE_FEATURE_COUNT = GENERAL_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>None Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_INTERFACE_OPERATION_COUNT = GENERAL_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.PackageImpl
	 * @see Essence.impl.EssencePackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 84;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CUSTOM = MODEL_ROOT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__HIDDEN = MODEL_ROOT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ID = MODEL_ROOT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__LONG_DESCRIPTION = MODEL_ROOT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = MODEL_ROOT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SHORT_DESCRIPTION = MODEL_ROOT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SHORT_NAME = MODEL_ROOT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PROPERTY = MODEL_ROOT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__XREF_EXTENSION = MODEL_ROOT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Const Def Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONST_DEF_BLOCK = MODEL_ROOT__CONST_DEF_BLOCK;

	/**
	 * The feature id for the '<em><b>Essence Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ESSENCE_VERSION = MODEL_ROOT__ESSENCE_VERSION;

	/**
	 * The feature id for the '<em><b>Generic Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__GENERIC_DECL_BLOCK = MODEL_ROOT__GENERIC_DECL_BLOCK;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MODULE = MODEL_ROOT__MODULE;

	/**
	 * The feature id for the '<em><b>Param Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PARAM_DECL_BLOCK = MODEL_ROOT__PARAM_DECL_BLOCK;

	/**
	 * The feature id for the '<em><b>VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__VLNV = MODEL_ROOT__VLNV;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TYPE = MODEL_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PIN = MODEL_ROOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = MODEL_ROOT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = MODEL_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.PackageInstanceImpl <em>Package Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.PackageInstanceImpl
	 * @see Essence.impl.EssencePackageImpl#getPackageInstance()
	 * @generated
	 */
	int PACKAGE_INSTANCE = 85;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_INSTANCE__CUSTOM = GENERAL_INSTANCE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_INSTANCE__HIDDEN = GENERAL_INSTANCE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_INSTANCE__ID = GENERAL_INSTANCE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_INSTANCE__LONG_DESCRIPTION = GENERAL_INSTANCE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_INSTANCE__NAME = GENERAL_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_INSTANCE__SHORT_DESCRIPTION = GENERAL_INSTANCE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_INSTANCE__SHORT_NAME = GENERAL_INSTANCE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_INSTANCE__PROPERTY = GENERAL_INSTANCE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_INSTANCE__XREF_EXTENSION = GENERAL_INSTANCE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_INSTANCE__EXT_VLNV = GENERAL_INSTANCE__EXT_VLNV;

	/**
	 * The feature id for the '<em><b>Param Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_INSTANCE__PARAM_MAP = GENERAL_INSTANCE__PARAM_MAP;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_INSTANCE__GENERIC_MAP = GENERAL_INSTANCE__GENERIC_MAP;

	/**
	 * The feature id for the '<em><b>Pin Net Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_INSTANCE__PIN_NET_MAP = GENERAL_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_INSTANCE_FEATURE_COUNT = GENERAL_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Package Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_INSTANCE_OPERATION_COUNT = GENERAL_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.PadMultiplexedImpl <em>Pad Multiplexed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.PadMultiplexedImpl
	 * @see Essence.impl.EssencePackageImpl#getPadMultiplexed()
	 * @generated
	 */
	int PAD_MULTIPLEXED = 87;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__CUSTOM = SINGLE_PAD__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__HIDDEN = SINGLE_PAD__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__ID = SINGLE_PAD__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__LONG_DESCRIPTION = SINGLE_PAD__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__NAME = SINGLE_PAD__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__SHORT_DESCRIPTION = SINGLE_PAD__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__SHORT_NAME = SINGLE_PAD__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__PROPERTY = SINGLE_PAD__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__XREF_EXTENSION = SINGLE_PAD__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__XCOORDINATE = SINGLE_PAD__XCOORDINATE;

	/**
	 * The feature id for the '<em><b>YCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__YCOORDINATE = SINGLE_PAD__YCOORDINATE;

	/**
	 * The feature id for the '<em><b>Spacer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__SPACER = SINGLE_PAD__SPACER;

	/**
	 * The feature id for the '<em><b>Opening</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__OPENING = SINGLE_PAD__OPENING;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__LOCATION = SINGLE_PAD__LOCATION;

	/**
	 * The feature id for the '<em><b>Pad Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__PAD_COUNT = SINGLE_PAD__PAD_COUNT;

	/**
	 * The feature id for the '<em><b>Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__PLACE = SINGLE_PAD__PLACE;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__ORIENTATION = SINGLE_PAD__ORIENTATION;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__POWER = SINGLE_PAD__POWER;

	/**
	 * The feature id for the '<em><b>Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__GROUND = SINGLE_PAD__GROUND;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__EXT_VLNV = SINGLE_PAD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRef Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__XREF_PORT = SINGLE_PAD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__PORT_GROUP = SINGLE_PAD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pad Multiplexed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED_FEATURE_COUNT = SINGLE_PAD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pad Multiplexed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED_OPERATION_COUNT = SINGLE_PAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.PadNetMapImpl <em>Pad Net Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.PadNetMapImpl
	 * @see Essence.impl.EssencePackageImpl#getPadNetMap()
	 * @generated
	 */
	int PAD_NET_MAP = 88;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NET_MAP__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NET_MAP__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NET_MAP__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NET_MAP__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NET_MAP__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NET_MAP__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NET_MAP__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NET_MAP__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NET_MAP__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Pad</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NET_MAP__XREF_PAD = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRef Net</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NET_MAP__XREF_NET = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pad Net Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NET_MAP_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pad Net Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NET_MAP_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.PadNonMultiplexedImpl <em>Pad Non Multiplexed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.PadNonMultiplexedImpl
	 * @see Essence.impl.EssencePackageImpl#getPadNonMultiplexed()
	 * @generated
	 */
	int PAD_NON_MULTIPLEXED = 89;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__CUSTOM = SINGLE_PAD__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__HIDDEN = SINGLE_PAD__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__ID = SINGLE_PAD__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__LONG_DESCRIPTION = SINGLE_PAD__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__NAME = SINGLE_PAD__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__SHORT_DESCRIPTION = SINGLE_PAD__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__SHORT_NAME = SINGLE_PAD__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__PROPERTY = SINGLE_PAD__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__XREF_EXTENSION = SINGLE_PAD__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__XCOORDINATE = SINGLE_PAD__XCOORDINATE;

	/**
	 * The feature id for the '<em><b>YCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__YCOORDINATE = SINGLE_PAD__YCOORDINATE;

	/**
	 * The feature id for the '<em><b>Spacer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__SPACER = SINGLE_PAD__SPACER;

	/**
	 * The feature id for the '<em><b>Opening</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__OPENING = SINGLE_PAD__OPENING;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__LOCATION = SINGLE_PAD__LOCATION;

	/**
	 * The feature id for the '<em><b>Pad Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__PAD_COUNT = SINGLE_PAD__PAD_COUNT;

	/**
	 * The feature id for the '<em><b>Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__PLACE = SINGLE_PAD__PLACE;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__ORIENTATION = SINGLE_PAD__ORIENTATION;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__POWER = SINGLE_PAD__POWER;

	/**
	 * The feature id for the '<em><b>Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__GROUND = SINGLE_PAD__GROUND;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__EXT_VLNV = SINGLE_PAD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Si Port Req</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__SI_PORT_REQ = SINGLE_PAD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XRef Pad Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__XREF_PAD_TYPE = SINGLE_PAD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__FUNCTION = SINGLE_PAD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Pad Non Multiplexed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED_FEATURE_COUNT = SINGLE_PAD_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Pad Non Multiplexed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED_OPERATION_COUNT = SINGLE_PAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.PadSpecialImpl <em>Pad Special</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.PadSpecialImpl
	 * @see Essence.impl.EssencePackageImpl#getPadSpecial()
	 * @generated
	 */
	int PAD_SPECIAL = 90;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__CUSTOM = GENERAL_PAD__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__HIDDEN = GENERAL_PAD__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__ID = GENERAL_PAD__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__LONG_DESCRIPTION = GENERAL_PAD__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__NAME = GENERAL_PAD__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__SHORT_DESCRIPTION = GENERAL_PAD__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__SHORT_NAME = GENERAL_PAD__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__PROPERTY = GENERAL_PAD__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__XREF_EXTENSION = GENERAL_PAD__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__XCOORDINATE = GENERAL_PAD__XCOORDINATE;

	/**
	 * The feature id for the '<em><b>YCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__YCOORDINATE = GENERAL_PAD__YCOORDINATE;

	/**
	 * The feature id for the '<em><b>Spacer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__SPACER = GENERAL_PAD__SPACER;

	/**
	 * The feature id for the '<em><b>Opening</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__OPENING = GENERAL_PAD__OPENING;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__LOCATION = GENERAL_PAD__LOCATION;

	/**
	 * The feature id for the '<em><b>Pad Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__PAD_COUNT = GENERAL_PAD__PAD_COUNT;

	/**
	 * The feature id for the '<em><b>Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__PLACE = GENERAL_PAD__PLACE;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__ORIENTATION = GENERAL_PAD__ORIENTATION;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__POWER = GENERAL_PAD__POWER;

	/**
	 * The feature id for the '<em><b>Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__GROUND = GENERAL_PAD__GROUND;

	/**
	 * The feature id for the '<em><b>XRef Pad Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__XREF_PAD_TYPE = GENERAL_PAD__XREF_PAD_TYPE;

	/**
	 * The feature id for the '<em><b>Lib</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__LIB = GENERAL_PAD__LIB;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__WIDTH = GENERAL_PAD__WIDTH;

	/**
	 * The number of structural features of the '<em>Pad Special</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL_FEATURE_COUNT = GENERAL_PAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pad Special</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL_OPERATION_COUNT = GENERAL_PAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.PadSupplyImpl <em>Pad Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.PadSupplyImpl
	 * @see Essence.impl.EssencePackageImpl#getPadSupply()
	 * @generated
	 */
	int PAD_SUPPLY = 91;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__CUSTOM = GENERAL_PAD__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__HIDDEN = GENERAL_PAD__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__ID = GENERAL_PAD__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__LONG_DESCRIPTION = GENERAL_PAD__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__NAME = GENERAL_PAD__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__SHORT_DESCRIPTION = GENERAL_PAD__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__SHORT_NAME = GENERAL_PAD__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__PROPERTY = GENERAL_PAD__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__XREF_EXTENSION = GENERAL_PAD__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__XCOORDINATE = GENERAL_PAD__XCOORDINATE;

	/**
	 * The feature id for the '<em><b>YCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__YCOORDINATE = GENERAL_PAD__YCOORDINATE;

	/**
	 * The feature id for the '<em><b>Spacer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__SPACER = GENERAL_PAD__SPACER;

	/**
	 * The feature id for the '<em><b>Opening</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__OPENING = GENERAL_PAD__OPENING;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__LOCATION = GENERAL_PAD__LOCATION;

	/**
	 * The feature id for the '<em><b>Pad Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__PAD_COUNT = GENERAL_PAD__PAD_COUNT;

	/**
	 * The feature id for the '<em><b>Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__PLACE = GENERAL_PAD__PLACE;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__ORIENTATION = GENERAL_PAD__ORIENTATION;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__POWER = GENERAL_PAD__POWER;

	/**
	 * The feature id for the '<em><b>Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__GROUND = GENERAL_PAD__GROUND;

	/**
	 * The feature id for the '<em><b>XRef Pad Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__XREF_PAD_TYPE = GENERAL_PAD__XREF_PAD_TYPE;

	/**
	 * The feature id for the '<em><b>Lib</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__LIB = GENERAL_PAD__LIB;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__WIDTH = GENERAL_PAD__WIDTH;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__SPEC = GENERAL_PAD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRef Power Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__XREF_POWER_DOMAIN = GENERAL_PAD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pad Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY_FEATURE_COUNT = GENERAL_PAD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pad Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY_OPERATION_COUNT = GENERAL_PAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.PadTypeImpl <em>Pad Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.PadTypeImpl
	 * @see Essence.impl.EssencePackageImpl#getPadType()
	 * @generated
	 */
	int PAD_TYPE = 92;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Lib</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE__LIB = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE__TYPE = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Driver Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE__DRIVER_STRENGTH = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE__SET = SINGLE_SOURCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE__WIDTH = SINGLE_SOURCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE__SPEC = SINGLE_SOURCE_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Pad Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Pad Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.PadTypeDBImpl <em>Pad Type DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.PadTypeDBImpl
	 * @see Essence.impl.EssencePackageImpl#getPadTypeDB()
	 * @generated
	 */
	int PAD_TYPE_DB = 93;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_DB__CUSTOM = MODEL_ROOT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_DB__HIDDEN = MODEL_ROOT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_DB__ID = MODEL_ROOT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_DB__LONG_DESCRIPTION = MODEL_ROOT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_DB__NAME = MODEL_ROOT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_DB__SHORT_DESCRIPTION = MODEL_ROOT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_DB__SHORT_NAME = MODEL_ROOT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_DB__PROPERTY = MODEL_ROOT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_DB__XREF_EXTENSION = MODEL_ROOT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Const Def Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_DB__CONST_DEF_BLOCK = MODEL_ROOT__CONST_DEF_BLOCK;

	/**
	 * The feature id for the '<em><b>Essence Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_DB__ESSENCE_VERSION = MODEL_ROOT__ESSENCE_VERSION;

	/**
	 * The feature id for the '<em><b>Generic Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_DB__GENERIC_DECL_BLOCK = MODEL_ROOT__GENERIC_DECL_BLOCK;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_DB__MODULE = MODEL_ROOT__MODULE;

	/**
	 * The feature id for the '<em><b>Param Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_DB__PARAM_DECL_BLOCK = MODEL_ROOT__PARAM_DECL_BLOCK;

	/**
	 * The feature id for the '<em><b>VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_DB__VLNV = MODEL_ROOT__VLNV;

	/**
	 * The feature id for the '<em><b>Pad Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_DB__PAD_TYPE = MODEL_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pad Type DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_DB_FEATURE_COUNT = MODEL_ROOT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pad Type DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_DB_OPERATION_COUNT = MODEL_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ParamDeclBlockImpl <em>Param Decl Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ParamDeclBlockImpl
	 * @see Essence.impl.EssencePackageImpl#getParamDeclBlock()
	 * @generated
	 */
	int PARAM_DECL_BLOCK = 95;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL_BLOCK__CUSTOM = VAR_DEF_BLOCK__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL_BLOCK__HIDDEN = VAR_DEF_BLOCK__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL_BLOCK__ID = VAR_DEF_BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL_BLOCK__LONG_DESCRIPTION = VAR_DEF_BLOCK__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL_BLOCK__NAME = VAR_DEF_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL_BLOCK__SHORT_DESCRIPTION = VAR_DEF_BLOCK__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL_BLOCK__SHORT_NAME = VAR_DEF_BLOCK__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL_BLOCK__PROPERTY = VAR_DEF_BLOCK__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL_BLOCK__XREF_EXTENSION = VAR_DEF_BLOCK__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Param Decl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL_BLOCK__PARAM_DECL = VAR_DEF_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Param Decl Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL_BLOCK_FEATURE_COUNT = VAR_DEF_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Param Decl Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL_BLOCK_OPERATION_COUNT = VAR_DEF_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ParamMapImpl <em>Param Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ParamMapImpl
	 * @see Essence.impl.EssencePackageImpl#getParamMap()
	 * @generated
	 */
	int PARAM_MAP = 96;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_MAP__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_MAP__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_MAP__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_MAP__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_MAP__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_MAP__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_MAP__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_MAP__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_MAP__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Param Decl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_MAP__XREF_PARAM_DECL = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_MAP__VALUE = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Param Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_MAP_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Param Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_MAP_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ReferenceImpl
	 * @see Essence.impl.EssencePackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 111;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = ESSENCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = ESSENCE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.PathRefImpl <em>Path Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.PathRefImpl
	 * @see Essence.impl.EssencePackageImpl#getPathRef()
	 * @generated
	 */
	int PATH_REF = 97;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_REF__LOCATION = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_REF__NAME = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Path Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_REF_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Path Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_REF_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.PinImpl <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.PinImpl
	 * @see Essence.impl.EssencePackageImpl#getPin()
	 * @generated
	 */
	int PIN = 98;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.PinNetMapImpl <em>Pin Net Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.PinNetMapImpl
	 * @see Essence.impl.EssencePackageImpl#getPinNetMap()
	 * @generated
	 */
	int PIN_NET_MAP = 99;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_NET_MAP__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_NET_MAP__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_NET_MAP__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_NET_MAP__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_NET_MAP__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_NET_MAP__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_NET_MAP__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_NET_MAP__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_NET_MAP__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Pin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_NET_MAP__XREF_PIN = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRef Net</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_NET_MAP__XREF_NET = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pin Net Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_NET_MAP_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pin Net Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_NET_MAP_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.PortRefImpl <em>Port Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.PortRefImpl
	 * @see Essence.impl.EssencePackageImpl#getPortRef()
	 * @generated
	 */
	int PORT_REF = 101;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REF__CUSTOM = PORT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REF__HIDDEN = PORT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REF__ID = PORT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REF__LONG_DESCRIPTION = PORT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REF__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REF__SHORT_DESCRIPTION = PORT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REF__SHORT_NAME = PORT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REF__PROPERTY = PORT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REF__XREF_EXTENSION = PORT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Local Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REF__XREF_LOCAL_PORT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REF_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REF_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.PowerDomainImpl <em>Power Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.PowerDomainImpl
	 * @see Essence.impl.EssencePackageImpl#getPowerDomain()
	 * @generated
	 */
	int POWER_DOMAIN = 102;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_DOMAIN__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_DOMAIN__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_DOMAIN__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_DOMAIN__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_DOMAIN__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_DOMAIN__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_DOMAIN__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_DOMAIN__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_DOMAIN__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Power Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_DOMAIN__POWER_CONSUMPTION = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_DOMAIN__MAX_CURRENT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Average Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_DOMAIN__AVERAGE_CURRENT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Power Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_DOMAIN_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Power Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_DOMAIN_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ProductImpl
	 * @see Essence.impl.EssencePackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 103;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CUSTOM = MODEL_ROOT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__HIDDEN = MODEL_ROOT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ID = MODEL_ROOT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__LONG_DESCRIPTION = MODEL_ROOT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = MODEL_ROOT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SHORT_DESCRIPTION = MODEL_ROOT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SHORT_NAME = MODEL_ROOT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PROPERTY = MODEL_ROOT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__XREF_EXTENSION = MODEL_ROOT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Const Def Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CONST_DEF_BLOCK = MODEL_ROOT__CONST_DEF_BLOCK;

	/**
	 * The feature id for the '<em><b>Essence Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ESSENCE_VERSION = MODEL_ROOT__ESSENCE_VERSION;

	/**
	 * The feature id for the '<em><b>Generic Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__GENERIC_DECL_BLOCK = MODEL_ROOT__GENERIC_DECL_BLOCK;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__MODULE = MODEL_ROOT__MODULE;

	/**
	 * The feature id for the '<em><b>Param Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PARAM_DECL_BLOCK = MODEL_ROOT__PARAM_DECL_BLOCK;

	/**
	 * The feature id for the '<em><b>VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__VLNV = MODEL_ROOT__VLNV;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__STEP = MODEL_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PACKAGE_INSTANCE = MODEL_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Silicon Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SILICON_INSTANCE = MODEL_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Net</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NET = MODEL_ROOT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = MODEL_ROOT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = MODEL_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ProductInstanceImpl <em>Product Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ProductInstanceImpl
	 * @see Essence.impl.EssencePackageImpl#getProductInstance()
	 * @generated
	 */
	int PRODUCT_INSTANCE = 104;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__CUSTOM = INSTANCE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__HIDDEN = INSTANCE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__ID = INSTANCE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__LONG_DESCRIPTION = INSTANCE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__NAME = INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__SHORT_DESCRIPTION = INSTANCE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__SHORT_NAME = INSTANCE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__PROPERTY = INSTANCE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__XREF_EXTENSION = INSTANCE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__EXT_VLNV = INSTANCE__EXT_VLNV;

	/**
	 * The feature id for the '<em><b>Param Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__PARAM_MAP = INSTANCE__PARAM_MAP;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__GENERIC_MAP = INSTANCE__GENERIC_MAP;

	/**
	 * The feature id for the '<em><b>Product Interface Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__PRODUCT_INTERFACE_MAP = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Product Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE_OPERATION_COUNT = INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ProductInterfaceMapImpl <em>Product Interface Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ProductInterfaceMapImpl
	 * @see Essence.impl.EssencePackageImpl#getProductInterfaceMap()
	 * @generated
	 */
	int PRODUCT_INTERFACE_MAP = 105;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INTERFACE_MAP__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INTERFACE_MAP__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INTERFACE_MAP__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INTERFACE_MAP__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INTERFACE_MAP__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INTERFACE_MAP__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INTERFACE_MAP__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INTERFACE_MAP__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INTERFACE_MAP__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INTERFACE_MAP__XREF_CONNECTION = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Pin Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INTERFACE_MAP__PRODUCT_PIN_MAP = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product Pad Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INTERFACE_MAP__PRODUCT_PAD_MAP = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product Interface Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INTERFACE_MAP_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Product Interface Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INTERFACE_MAP_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ProductPadMapImpl <em>Product Pad Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ProductPadMapImpl
	 * @see Essence.impl.EssencePackageImpl#getProductPadMap()
	 * @generated
	 */
	int PRODUCT_PAD_MAP = 106;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAD_MAP__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAD_MAP__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAD_MAP__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAD_MAP__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAD_MAP__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAD_MAP__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAD_MAP__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAD_MAP__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAD_MAP__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Pad</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAD_MAP__XREF_PAD = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRef Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAD_MAP__XREF_SIGNAL = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Product Pad Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAD_MAP_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Product Pad Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAD_MAP_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ProductPinMapImpl <em>Product Pin Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ProductPinMapImpl
	 * @see Essence.impl.EssencePackageImpl#getProductPinMap()
	 * @generated
	 */
	int PRODUCT_PIN_MAP = 107;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PIN_MAP__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PIN_MAP__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PIN_MAP__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PIN_MAP__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PIN_MAP__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PIN_MAP__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PIN_MAP__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PIN_MAP__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PIN_MAP__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Pin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PIN_MAP__XREF_PIN = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRef Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PIN_MAP__XREF_SIGNAL = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Product Pin Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PIN_MAP_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Product Pin Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PIN_MAP_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.PropertyImpl
	 * @see Essence.impl.EssencePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 108;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__KEY = ESSENCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PROPERTY = ESSENCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = ESSENCE_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = ESSENCE_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = ESSENCE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.RecordImpl <em>Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.RecordImpl
	 * @see Essence.impl.EssencePackageImpl#getRecord()
	 * @generated
	 */
	int RECORD = 110;

	/**
	 * The feature id for the '<em><b>Sign Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__SIGN_INTERPRETATION = COMPLEX_DATA_TYPE__SIGN_INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__OBJECT_TYPE = COMPLEX_DATA_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__VECTOR = COMPLEX_DATA_TYPE__VECTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__NAME = COMPLEX_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Data Type Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__DATA_TYPE_ELEMENT = COMPLEX_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FEATURE_COUNT = COMPLEX_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_OPERATION_COUNT = COMPLEX_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.RegisterImpl <em>Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.RegisterImpl
	 * @see Essence.impl.EssencePackageImpl#getRegister()
	 * @generated
	 */
	int REGISTER = 112;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__CUSTOM = GENERAL_REGISTER__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__HIDDEN = GENERAL_REGISTER__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__ID = GENERAL_REGISTER__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__LONG_DESCRIPTION = GENERAL_REGISTER__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__NAME = GENERAL_REGISTER__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__SHORT_DESCRIPTION = GENERAL_REGISTER__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__SHORT_NAME = GENERAL_REGISTER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__PROPERTY = GENERAL_REGISTER__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__XREF_EXTENSION = GENERAL_REGISTER__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__OFFSET = GENERAL_REGISTER__OFFSET;

	/**
	 * The feature id for the '<em><b>Data Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__DATA_WIDTH = GENERAL_REGISTER__DATA_WIDTH;

	/**
	 * The feature id for the '<em><b>Access Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__ACCESS_CONDITION = GENERAL_REGISTER__ACCESS_CONDITION;

	/**
	 * The feature id for the '<em><b>No Shadow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__NO_SHADOW = GENERAL_REGISTER__NO_SHADOW;

	/**
	 * The feature id for the '<em><b>Reset Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__RESET_TYPE = GENERAL_REGISTER__RESET_TYPE;

	/**
	 * The feature id for the '<em><b>Mirror Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__MIRROR_SIZE = GENERAL_REGISTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Top Spin Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__TOP_SPIN_TYPE = GENERAL_REGISTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XRef Register View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__XREF_REGISTER_VIEW = GENERAL_REGISTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bit Field Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__BIT_FIELD_ELEMENT = GENERAL_REGISTER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_FEATURE_COUNT = GENERAL_REGISTER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_OPERATION_COUNT = GENERAL_REGISTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.RegisterViewImpl <em>Register View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.RegisterViewImpl
	 * @see Essence.impl.EssencePackageImpl#getRegisterView()
	 * @generated
	 */
	int REGISTER_VIEW = 113;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW__CUSTOM = INDEX_VAR_USER__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW__HIDDEN = INDEX_VAR_USER__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW__ID = INDEX_VAR_USER__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW__LONG_DESCRIPTION = INDEX_VAR_USER__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW__NAME = INDEX_VAR_USER__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW__SHORT_DESCRIPTION = INDEX_VAR_USER__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW__SHORT_NAME = INDEX_VAR_USER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW__PROPERTY = INDEX_VAR_USER__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW__XREF_EXTENSION = INDEX_VAR_USER__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW__DEPTH = INDEX_VAR_USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Depth Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW__DEPTH_VAR = INDEX_VAR_USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bit Field Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW__BIT_FIELD_ELEMENT = INDEX_VAR_USER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Register View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW_FEATURE_COUNT = INDEX_VAR_USER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Register View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW_OPERATION_COUNT = INDEX_VAR_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.RegMemSequenceImpl <em>Reg Mem Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.RegMemSequenceImpl
	 * @see Essence.impl.EssencePackageImpl#getRegMemSequence()
	 * @generated
	 */
	int REG_MEM_SEQUENCE = 115;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE__CUSTOM = REG_MEM_ELEMENT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE__HIDDEN = REG_MEM_ELEMENT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE__ID = REG_MEM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE__LONG_DESCRIPTION = REG_MEM_ELEMENT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE__NAME = REG_MEM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE__SHORT_DESCRIPTION = REG_MEM_ELEMENT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE__SHORT_NAME = REG_MEM_ELEMENT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE__PROPERTY = REG_MEM_ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE__XREF_EXTENSION = REG_MEM_ELEMENT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE__OFFSET = REG_MEM_ELEMENT__OFFSET;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE__COUNT = REG_MEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE__MIN_INDEX = REG_MEM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Index Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE__INDEX_STEP = REG_MEM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Index Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE__INDEX_VAR = REG_MEM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alt Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE__ALT_FORMAT = REG_MEM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pilot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE__PILOT = REG_MEM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sequence Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE__SEQUENCE_ELEMENT = REG_MEM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Reg Mem Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE_FEATURE_COUNT = REG_MEM_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Reg Mem Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE_OPERATION_COUNT = REG_MEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.RegMemSetImpl <em>Reg Mem Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.RegMemSetImpl
	 * @see Essence.impl.EssencePackageImpl#getRegMemSet()
	 * @generated
	 */
	int REG_MEM_SET = 116;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SET__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SET__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SET__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SET__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SET__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SET__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SET__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SET__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SET__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Address Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SET__ADDRESS_UNIT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SET__DATA_UNIT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Special</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SET__SPECIAL = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SET__MESSAGE_TYPE = SINGLE_SOURCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Op Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SET__OP_CODE = SINGLE_SOURCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reg Mem Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SET__REG_MEM_ELEMENT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Reg Mem Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SET_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Reg Mem Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SET_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.RegViewBlockImpl <em>Reg View Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.RegViewBlockImpl
	 * @see Essence.impl.EssencePackageImpl#getRegViewBlock()
	 * @generated
	 */
	int REG_VIEW_BLOCK = 117;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_VIEW_BLOCK__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_VIEW_BLOCK__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_VIEW_BLOCK__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_VIEW_BLOCK__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_VIEW_BLOCK__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_VIEW_BLOCK__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_VIEW_BLOCK__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_VIEW_BLOCK__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_VIEW_BLOCK__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Register View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_VIEW_BLOCK__REGISTER_VIEW = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reg View Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_VIEW_BLOCK_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reg View Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_VIEW_BLOCK_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ResetTypeImpl <em>Reset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ResetTypeImpl
	 * @see Essence.impl.EssencePackageImpl#getResetType()
	 * @generated
	 */
	int RESET_TYPE = 118;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TYPE__CUSTOM = INDEX_VAR_USER__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TYPE__HIDDEN = INDEX_VAR_USER__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TYPE__ID = INDEX_VAR_USER__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TYPE__LONG_DESCRIPTION = INDEX_VAR_USER__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TYPE__NAME = INDEX_VAR_USER__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TYPE__SHORT_DESCRIPTION = INDEX_VAR_USER__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TYPE__SHORT_NAME = INDEX_VAR_USER__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TYPE__PROPERTY = INDEX_VAR_USER__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TYPE__XREF_EXTENSION = INDEX_VAR_USER__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Reset Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TYPE__RESET_LEVEL = INDEX_VAR_USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reset Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TYPE__RESET_MASK = INDEX_VAR_USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reset Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TYPE__RESET_MODE = INDEX_VAR_USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reset Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TYPE__RESET_TYPE = INDEX_VAR_USER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reset Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TYPE__RESET_VALUE = INDEX_VAR_USER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Reset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TYPE_FEATURE_COUNT = INDEX_VAR_USER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Reset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TYPE_OPERATION_COUNT = INDEX_VAR_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ReturnElementAccessImpl <em>Return Element Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ReturnElementAccessImpl
	 * @see Essence.impl.EssencePackageImpl#getReturnElementAccess()
	 * @generated
	 */
	int RETURN_ELEMENT_ACCESS = 120;

	/**
	 * The feature id for the '<em><b>Simple Sub Element Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ELEMENT_ACCESS__SIMPLE_SUB_ELEMENT_ACCESS = SUB_ELEMENT_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Element Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ELEMENT_ACCESS_FEATURE_COUNT = SUB_ELEMENT_ACCESS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Return Element Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ELEMENT_ACCESS_OPERATION_COUNT = SUB_ELEMENT_ACCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ShellInterfaceMapImpl <em>Shell Interface Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ShellInterfaceMapImpl
	 * @see Essence.impl.EssencePackageImpl#getShellInterfaceMap()
	 * @generated
	 */
	int SHELL_INTERFACE_MAP = 122;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INTERFACE_MAP__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INTERFACE_MAP__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INTERFACE_MAP__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INTERFACE_MAP__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INTERFACE_MAP__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INTERFACE_MAP__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INTERFACE_MAP__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INTERFACE_MAP__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INTERFACE_MAP__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Shell Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INTERFACE_MAP__XREF_SHELL_INTERFACE = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRef Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INTERFACE_MAP__XREF_CONNECTION = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shell Port Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INTERFACE_MAP__SHELL_PORT_MAP = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Shell Interface Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INTERFACE_MAP_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Shell Interface Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INTERFACE_MAP_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.ShellPortMapImpl <em>Shell Port Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.ShellPortMapImpl
	 * @see Essence.impl.EssencePackageImpl#getShellPortMap()
	 * @generated
	 */
	int SHELL_PORT_MAP = 123;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_PORT_MAP__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_PORT_MAP__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_PORT_MAP__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_PORT_MAP__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_PORT_MAP__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_PORT_MAP__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_PORT_MAP__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_PORT_MAP__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_PORT_MAP__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Shell Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_PORT_MAP__XREF_SHELL_PORT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRef Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_PORT_MAP__XREF_SIGNAL = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shell Port Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_PORT_MAP_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Shell Port Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_PORT_MAP_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SiInstanceImpl <em>Si Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SiInstanceImpl
	 * @see Essence.impl.EssencePackageImpl#getSiInstance()
	 * @generated
	 */
	int SI_INSTANCE = 128;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE__CUSTOM = GENERAL_INSTANCE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE__HIDDEN = GENERAL_INSTANCE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE__ID = GENERAL_INSTANCE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE__LONG_DESCRIPTION = GENERAL_INSTANCE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE__NAME = GENERAL_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE__SHORT_DESCRIPTION = GENERAL_INSTANCE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE__SHORT_NAME = GENERAL_INSTANCE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE__PROPERTY = GENERAL_INSTANCE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE__XREF_EXTENSION = GENERAL_INSTANCE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE__EXT_VLNV = GENERAL_INSTANCE__EXT_VLNV;

	/**
	 * The feature id for the '<em><b>Param Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE__PARAM_MAP = GENERAL_INSTANCE__PARAM_MAP;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE__GENERIC_MAP = GENERAL_INSTANCE__GENERIC_MAP;

	/**
	 * The feature id for the '<em><b>Si Instance Interface Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE__SI_INSTANCE_INTERFACE_MAP = GENERAL_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Si Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_FEATURE_COUNT = GENERAL_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Si Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_OPERATION_COUNT = GENERAL_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SiComponentInstanceImpl <em>Si Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SiComponentInstanceImpl
	 * @see Essence.impl.EssencePackageImpl#getSiComponentInstance()
	 * @generated
	 */
	int SI_COMPONENT_INSTANCE = 124;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_COMPONENT_INSTANCE__CUSTOM = SI_INSTANCE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_COMPONENT_INSTANCE__HIDDEN = SI_INSTANCE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_COMPONENT_INSTANCE__ID = SI_INSTANCE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_COMPONENT_INSTANCE__LONG_DESCRIPTION = SI_INSTANCE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_COMPONENT_INSTANCE__NAME = SI_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_COMPONENT_INSTANCE__SHORT_DESCRIPTION = SI_INSTANCE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_COMPONENT_INSTANCE__SHORT_NAME = SI_INSTANCE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_COMPONENT_INSTANCE__PROPERTY = SI_INSTANCE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_COMPONENT_INSTANCE__XREF_EXTENSION = SI_INSTANCE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_COMPONENT_INSTANCE__EXT_VLNV = SI_INSTANCE__EXT_VLNV;

	/**
	 * The feature id for the '<em><b>Param Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_COMPONENT_INSTANCE__PARAM_MAP = SI_INSTANCE__PARAM_MAP;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_COMPONENT_INSTANCE__GENERIC_MAP = SI_INSTANCE__GENERIC_MAP;

	/**
	 * The feature id for the '<em><b>Si Instance Interface Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_COMPONENT_INSTANCE__SI_INSTANCE_INTERFACE_MAP = SI_INSTANCE__SI_INSTANCE_INTERFACE_MAP;

	/**
	 * The number of structural features of the '<em>Si Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_COMPONENT_INSTANCE_FEATURE_COUNT = SI_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Si Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_COMPONENT_INSTANCE_OPERATION_COUNT = SI_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SignalMapImpl <em>Signal Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SignalMapImpl
	 * @see Essence.impl.EssencePackageImpl#getSignalMap()
	 * @generated
	 */
	int SIGNAL_MAP = 126;

	/**
	 * The feature id for the '<em><b>XRef Local Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_MAP__XREF_LOCAL_SIGNAL = ESSENCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRef Interface Def Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_MAP__XREF_INTERFACE_DEF_SIGNAL = ESSENCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signal Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_MAP_FEATURE_COUNT = ESSENCE_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Signal Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_MAP_OPERATION_COUNT = ESSENCE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SiInstanceInterfaceMapImpl <em>Si Instance Interface Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SiInstanceInterfaceMapImpl
	 * @see Essence.impl.EssencePackageImpl#getSiInstanceInterfaceMap()
	 * @generated
	 */
	int SI_INSTANCE_INTERFACE_MAP = 129;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_INTERFACE_MAP__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_INTERFACE_MAP__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_INTERFACE_MAP__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_INTERFACE_MAP__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_INTERFACE_MAP__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_INTERFACE_MAP__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_INTERFACE_MAP__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_INTERFACE_MAP__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_INTERFACE_MAP__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Instance Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_INTERFACE_MAP__XREF_INSTANCE_INTERFACE = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Si Instance Port Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_INTERFACE_MAP__SI_INSTANCE_PORT_MAP = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Si Instance Interface Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_INTERFACE_MAP_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Si Instance Interface Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_INTERFACE_MAP_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SiInstancePortMapImpl <em>Si Instance Port Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SiInstancePortMapImpl
	 * @see Essence.impl.EssencePackageImpl#getSiInstancePortMap()
	 * @generated
	 */
	int SI_INSTANCE_PORT_MAP = 130;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_PORT_MAP__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_PORT_MAP__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_PORT_MAP__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_PORT_MAP__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_PORT_MAP__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_PORT_MAP__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_PORT_MAP__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_PORT_MAP__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_PORT_MAP__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Instance Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_PORT_MAP__XREF_INSTANCE_PORT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRef Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_PORT_MAP__XREF_SIGNAL = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Si Instance Port Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_PORT_MAP_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Si Instance Port Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_PORT_MAP_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SiInstanceShellInterfaceMapImpl <em>Si Instance Shell Interface Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SiInstanceShellInterfaceMapImpl
	 * @see Essence.impl.EssencePackageImpl#getSiInstanceShellInterfaceMap()
	 * @generated
	 */
	int SI_INSTANCE_SHELL_INTERFACE_MAP = 131;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_INTERFACE_MAP__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_INTERFACE_MAP__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_INTERFACE_MAP__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_INTERFACE_MAP__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_INTERFACE_MAP__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_INTERFACE_MAP__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_INTERFACE_MAP__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_INTERFACE_MAP__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_INTERFACE_MAP__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Instance Shell Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_INTERFACE_MAP__XREF_INSTANCE_SHELL_INTERFACE = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Si Instance Shell Port Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_INTERFACE_MAP__SI_INSTANCE_SHELL_PORT_MAP = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Si Instance Shell Interface Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_INTERFACE_MAP_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Si Instance Shell Interface Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_INTERFACE_MAP_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SiInstanceShellPortMapImpl <em>Si Instance Shell Port Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SiInstanceShellPortMapImpl
	 * @see Essence.impl.EssencePackageImpl#getSiInstanceShellPortMap()
	 * @generated
	 */
	int SI_INSTANCE_SHELL_PORT_MAP = 132;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_PORT_MAP__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_PORT_MAP__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_PORT_MAP__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_PORT_MAP__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_PORT_MAP__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_PORT_MAP__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_PORT_MAP__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_PORT_MAP__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_PORT_MAP__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Instance Shell Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_PORT_MAP__XREF_INSTANCE_SHELL_PORT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRef Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_PORT_MAP__XREF_SIGNAL = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Si Instance Shell Port Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_PORT_MAP_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Si Instance Shell Port Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_PORT_MAP_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SiliconImpl <em>Silicon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SiliconImpl
	 * @see Essence.impl.EssencePackageImpl#getSilicon()
	 * @generated
	 */
	int SILICON = 133;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__CUSTOM = MODEL_ROOT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__HIDDEN = MODEL_ROOT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__ID = MODEL_ROOT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__LONG_DESCRIPTION = MODEL_ROOT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__NAME = MODEL_ROOT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__SHORT_DESCRIPTION = MODEL_ROOT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__SHORT_NAME = MODEL_ROOT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__PROPERTY = MODEL_ROOT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__XREF_EXTENSION = MODEL_ROOT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Const Def Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__CONST_DEF_BLOCK = MODEL_ROOT__CONST_DEF_BLOCK;

	/**
	 * The feature id for the '<em><b>Essence Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__ESSENCE_VERSION = MODEL_ROOT__ESSENCE_VERSION;

	/**
	 * The feature id for the '<em><b>Generic Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__GENERIC_DECL_BLOCK = MODEL_ROOT__GENERIC_DECL_BLOCK;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__MODULE = MODEL_ROOT__MODULE;

	/**
	 * The feature id for the '<em><b>Param Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__PARAM_DECL_BLOCK = MODEL_ROOT__PARAM_DECL_BLOCK;

	/**
	 * The feature id for the '<em><b>VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__VLNV = MODEL_ROOT__VLNV;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__STEP = MODEL_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pad Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__PAD_HEIGHT = MODEL_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kerf Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__KERF_WIDTH = MODEL_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kerf Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__KERF_HEIGHT = MODEL_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__INSTANCE = MODEL_ROOT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__PAD = MODEL_ROOT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Power Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__POWER_DOMAIN = MODEL_ROOT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Silicon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON_FEATURE_COUNT = MODEL_ROOT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Silicon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON_OPERATION_COUNT = MODEL_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SiliconInstanceImpl <em>Silicon Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SiliconInstanceImpl
	 * @see Essence.impl.EssencePackageImpl#getSiliconInstance()
	 * @generated
	 */
	int SILICON_INSTANCE = 134;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON_INSTANCE__CUSTOM = GENERAL_INSTANCE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON_INSTANCE__HIDDEN = GENERAL_INSTANCE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON_INSTANCE__ID = GENERAL_INSTANCE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON_INSTANCE__LONG_DESCRIPTION = GENERAL_INSTANCE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON_INSTANCE__NAME = GENERAL_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON_INSTANCE__SHORT_DESCRIPTION = GENERAL_INSTANCE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON_INSTANCE__SHORT_NAME = GENERAL_INSTANCE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON_INSTANCE__PROPERTY = GENERAL_INSTANCE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON_INSTANCE__XREF_EXTENSION = GENERAL_INSTANCE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON_INSTANCE__EXT_VLNV = GENERAL_INSTANCE__EXT_VLNV;

	/**
	 * The feature id for the '<em><b>Param Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON_INSTANCE__PARAM_MAP = GENERAL_INSTANCE__PARAM_MAP;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON_INSTANCE__GENERIC_MAP = GENERAL_INSTANCE__GENERIC_MAP;

	/**
	 * The feature id for the '<em><b>Pad Net Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON_INSTANCE__PAD_NET_MAP = GENERAL_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Silicon Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON_INSTANCE_FEATURE_COUNT = GENERAL_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Silicon Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON_INSTANCE_OPERATION_COUNT = GENERAL_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SimpleDataTypeImpl <em>Simple Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SimpleDataTypeImpl
	 * @see Essence.impl.EssencePackageImpl#getSimpleDataType()
	 * @generated
	 */
	int SIMPLE_DATA_TYPE = 135;

	/**
	 * The feature id for the '<em><b>Sign Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA_TYPE__SIGN_INTERPRETATION = VALUE_DATA_TYPE__SIGN_INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA_TYPE__OBJECT_TYPE = VALUE_DATA_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA_TYPE__VECTOR = VALUE_DATA_TYPE__VECTOR;

	/**
	 * The number of structural features of the '<em>Simple Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA_TYPE_FEATURE_COUNT = VALUE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA_TYPE_OPERATION_COUNT = VALUE_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SiPortImpl <em>Si Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SiPortImpl
	 * @see Essence.impl.EssencePackageImpl#getSiPort()
	 * @generated
	 */
	int SI_PORT = 139;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Pdr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT__PDR = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRef Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT__XREF_TEST = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Si Port Req</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT__SI_PORT_REQ = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT__FUNCTION = SINGLE_SOURCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Si Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Si Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SiPortDBImpl <em>Si Port DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SiPortDBImpl
	 * @see Essence.impl.EssencePackageImpl#getSiPortDB()
	 * @generated
	 */
	int SI_PORT_DB = 140;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_DB__CUSTOM = MODEL_ROOT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_DB__HIDDEN = MODEL_ROOT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_DB__ID = MODEL_ROOT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_DB__LONG_DESCRIPTION = MODEL_ROOT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_DB__NAME = MODEL_ROOT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_DB__SHORT_DESCRIPTION = MODEL_ROOT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_DB__SHORT_NAME = MODEL_ROOT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_DB__PROPERTY = MODEL_ROOT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_DB__XREF_EXTENSION = MODEL_ROOT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Const Def Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_DB__CONST_DEF_BLOCK = MODEL_ROOT__CONST_DEF_BLOCK;

	/**
	 * The feature id for the '<em><b>Essence Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_DB__ESSENCE_VERSION = MODEL_ROOT__ESSENCE_VERSION;

	/**
	 * The feature id for the '<em><b>Generic Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_DB__GENERIC_DECL_BLOCK = MODEL_ROOT__GENERIC_DECL_BLOCK;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_DB__MODULE = MODEL_ROOT__MODULE;

	/**
	 * The feature id for the '<em><b>Param Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_DB__PARAM_DECL_BLOCK = MODEL_ROOT__PARAM_DECL_BLOCK;

	/**
	 * The feature id for the '<em><b>VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_DB__VLNV = MODEL_ROOT__VLNV;

	/**
	 * The feature id for the '<em><b>Si Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_DB__SI_PORT = MODEL_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Si Port DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_DB_FEATURE_COUNT = MODEL_ROOT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Si Port DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_DB_OPERATION_COUNT = MODEL_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SiPortReqImpl <em>Si Port Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SiPortReqImpl
	 * @see Essence.impl.EssencePackageImpl#getSiPortReq()
	 * @generated
	 */
	int SI_PORT_REQ = 141;

	/**
	 * The feature id for the '<em><b>Driver Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_REQ__DRIVER_STRENGTH = ESSENCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_REQ__SET = ESSENCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_REQ__TYPE = ESSENCE_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Si Port Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_REQ_FEATURE_COUNT = ESSENCE_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Si Port Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_REQ_OPERATION_COUNT = ESSENCE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SiSignalImpl <em>Si Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SiSignalImpl
	 * @see Essence.impl.EssencePackageImpl#getSiSignal()
	 * @generated
	 */
	int SI_SIGNAL = 142;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The number of structural features of the '<em>Si Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Si Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SiSignalDBImpl <em>Si Signal DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SiSignalDBImpl
	 * @see Essence.impl.EssencePackageImpl#getSiSignalDB()
	 * @generated
	 */
	int SI_SIGNAL_DB = 143;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_DB__CUSTOM = MODEL_ROOT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_DB__HIDDEN = MODEL_ROOT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_DB__ID = MODEL_ROOT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_DB__LONG_DESCRIPTION = MODEL_ROOT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_DB__NAME = MODEL_ROOT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_DB__SHORT_DESCRIPTION = MODEL_ROOT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_DB__SHORT_NAME = MODEL_ROOT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_DB__PROPERTY = MODEL_ROOT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_DB__XREF_EXTENSION = MODEL_ROOT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Const Def Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_DB__CONST_DEF_BLOCK = MODEL_ROOT__CONST_DEF_BLOCK;

	/**
	 * The feature id for the '<em><b>Essence Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_DB__ESSENCE_VERSION = MODEL_ROOT__ESSENCE_VERSION;

	/**
	 * The feature id for the '<em><b>Generic Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_DB__GENERIC_DECL_BLOCK = MODEL_ROOT__GENERIC_DECL_BLOCK;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_DB__MODULE = MODEL_ROOT__MODULE;

	/**
	 * The feature id for the '<em><b>Param Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_DB__PARAM_DECL_BLOCK = MODEL_ROOT__PARAM_DECL_BLOCK;

	/**
	 * The feature id for the '<em><b>VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_DB__VLNV = MODEL_ROOT__VLNV;

	/**
	 * The feature id for the '<em><b>Si Signal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_DB__SI_SIGNAL = MODEL_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Si Signal DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_DB_FEATURE_COUNT = MODEL_ROOT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Si Signal DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_DB_OPERATION_COUNT = MODEL_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SiSystemInstanceImpl <em>Si System Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SiSystemInstanceImpl
	 * @see Essence.impl.EssencePackageImpl#getSiSystemInstance()
	 * @generated
	 */
	int SI_SYSTEM_INSTANCE = 144;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SYSTEM_INSTANCE__CUSTOM = SI_INSTANCE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SYSTEM_INSTANCE__HIDDEN = SI_INSTANCE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SYSTEM_INSTANCE__ID = SI_INSTANCE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SYSTEM_INSTANCE__LONG_DESCRIPTION = SI_INSTANCE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SYSTEM_INSTANCE__NAME = SI_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SYSTEM_INSTANCE__SHORT_DESCRIPTION = SI_INSTANCE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SYSTEM_INSTANCE__SHORT_NAME = SI_INSTANCE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SYSTEM_INSTANCE__PROPERTY = SI_INSTANCE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SYSTEM_INSTANCE__XREF_EXTENSION = SI_INSTANCE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SYSTEM_INSTANCE__EXT_VLNV = SI_INSTANCE__EXT_VLNV;

	/**
	 * The feature id for the '<em><b>Param Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SYSTEM_INSTANCE__PARAM_MAP = SI_INSTANCE__PARAM_MAP;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SYSTEM_INSTANCE__GENERIC_MAP = SI_INSTANCE__GENERIC_MAP;

	/**
	 * The feature id for the '<em><b>Si Instance Interface Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SYSTEM_INSTANCE__SI_INSTANCE_INTERFACE_MAP = SI_INSTANCE__SI_INSTANCE_INTERFACE_MAP;

	/**
	 * The feature id for the '<em><b>Si Instance Shell Interface Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SYSTEM_INSTANCE__SI_INSTANCE_SHELL_INTERFACE_MAP = SI_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Si System Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SYSTEM_INSTANCE_FEATURE_COUNT = SI_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Si System Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SYSTEM_INSTANCE_OPERATION_COUNT = SI_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.StringDeclImpl <em>String Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.StringDeclImpl
	 * @see Essence.impl.EssencePackageImpl#getStringDecl()
	 * @generated
	 */
	int STRING_DECL = 145;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DECL__CUSTOM = PARAM_DECL__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DECL__HIDDEN = PARAM_DECL__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DECL__ID = PARAM_DECL__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DECL__LONG_DESCRIPTION = PARAM_DECL__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DECL__NAME = PARAM_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DECL__SHORT_DESCRIPTION = PARAM_DECL__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DECL__SHORT_NAME = PARAM_DECL__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DECL__PROPERTY = PARAM_DECL__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DECL__XREF_EXTENSION = PARAM_DECL__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DECL__DEFAULT_VALUE = PARAM_DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DECL__ENUMERATION = PARAM_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DECL_FEATURE_COUNT = PARAM_DECL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>String Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DECL_OPERATION_COUNT = PARAM_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.StringDefImpl <em>String Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.StringDefImpl
	 * @see Essence.impl.EssencePackageImpl#getStringDef()
	 * @generated
	 */
	int STRING_DEF = 146;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF__CUSTOM = CONST_DEF__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF__HIDDEN = CONST_DEF__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF__ID = CONST_DEF__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF__LONG_DESCRIPTION = CONST_DEF__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF__NAME = CONST_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF__SHORT_DESCRIPTION = CONST_DEF__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF__SHORT_NAME = CONST_DEF__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF__PROPERTY = CONST_DEF__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF__XREF_EXTENSION = CONST_DEF__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF__VALUE = CONST_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF_FEATURE_COUNT = CONST_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF_OPERATION_COUNT = CONST_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.StringGenDeclImpl <em>String Gen Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.StringGenDeclImpl
	 * @see Essence.impl.EssencePackageImpl#getStringGenDecl()
	 * @generated
	 */
	int STRING_GEN_DECL = 147;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GEN_DECL__CUSTOM = GENERIC_DECL__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GEN_DECL__HIDDEN = GENERIC_DECL__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GEN_DECL__ID = GENERIC_DECL__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GEN_DECL__LONG_DESCRIPTION = GENERIC_DECL__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GEN_DECL__NAME = GENERIC_DECL__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GEN_DECL__SHORT_DESCRIPTION = GENERIC_DECL__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GEN_DECL__SHORT_NAME = GENERIC_DECL__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GEN_DECL__PROPERTY = GENERIC_DECL__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GEN_DECL__XREF_EXTENSION = GENERIC_DECL__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GEN_DECL__DEFAULT_VALUE = GENERIC_DECL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GEN_DECL__ENUMERATION = GENERIC_DECL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Gen Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GEN_DECL_FEATURE_COUNT = GENERIC_DECL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>String Gen Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GEN_DECL_OPERATION_COUNT = GENERIC_DECL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SystemImpl
	 * @see Essence.impl.EssencePackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 149;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CUSTOM = MODEL_ROOT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__HIDDEN = MODEL_ROOT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ID = MODEL_ROOT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__LONG_DESCRIPTION = MODEL_ROOT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = MODEL_ROOT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SHORT_DESCRIPTION = MODEL_ROOT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SHORT_NAME = MODEL_ROOT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PROPERTY = MODEL_ROOT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__XREF_EXTENSION = MODEL_ROOT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Const Def Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONST_DEF_BLOCK = MODEL_ROOT__CONST_DEF_BLOCK;

	/**
	 * The feature id for the '<em><b>Essence Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ESSENCE_VERSION = MODEL_ROOT__ESSENCE_VERSION;

	/**
	 * The feature id for the '<em><b>Generic Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__GENERIC_DECL_BLOCK = MODEL_ROOT__GENERIC_DECL_BLOCK;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__MODULE = MODEL_ROOT__MODULE;

	/**
	 * The feature id for the '<em><b>Param Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PARAM_DECL_BLOCK = MODEL_ROOT__PARAM_DECL_BLOCK;

	/**
	 * The feature id for the '<em><b>VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__VLNV = MODEL_ROOT__VLNV;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__EXT_VLNV = MODEL_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__INTERFACE = MODEL_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONNECTION = MODEL_ROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Local Interface Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__LOCAL_INTERFACE_MAP = MODEL_ROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__INSTANCE = MODEL_ROOT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Shell Interface Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SHELL_INTERFACE_MAP = MODEL_ROOT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = MODEL_ROOT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = MODEL_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.SystemInstanceImpl <em>System Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.SystemInstanceImpl
	 * @see Essence.impl.EssencePackageImpl#getSystemInstance()
	 * @generated
	 */
	int SYSTEM_INSTANCE = 150;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__CUSTOM = INTERFACE_INSTANCE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__HIDDEN = INTERFACE_INSTANCE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__ID = INTERFACE_INSTANCE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__LONG_DESCRIPTION = INTERFACE_INSTANCE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__NAME = INTERFACE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__SHORT_DESCRIPTION = INTERFACE_INSTANCE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__SHORT_NAME = INTERFACE_INSTANCE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__PROPERTY = INTERFACE_INSTANCE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__XREF_EXTENSION = INTERFACE_INSTANCE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__EXT_VLNV = INTERFACE_INSTANCE__EXT_VLNV;

	/**
	 * The feature id for the '<em><b>Param Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__PARAM_MAP = INTERFACE_INSTANCE__PARAM_MAP;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__GENERIC_MAP = INTERFACE_INSTANCE__GENERIC_MAP;

	/**
	 * The feature id for the '<em><b>Instance Interface Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__INSTANCE_INTERFACE_MAP = INTERFACE_INSTANCE__INSTANCE_INTERFACE_MAP;

	/**
	 * The feature id for the '<em><b>Instance Shell Interface Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__INSTANCE_SHELL_INTERFACE_MAP = INTERFACE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE_FEATURE_COUNT = INTERFACE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE_OPERATION_COUNT = INTERFACE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.TestImpl
	 * @see Essence.impl.EssencePackageImpl#getTest()
	 * @generated
	 */
	int TEST = 151;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__CUSTOM = SINGLE_SOURCE_NODE__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__HIDDEN = SINGLE_SOURCE_NODE__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ID = SINGLE_SOURCE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__LONG_DESCRIPTION = SINGLE_SOURCE_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__NAME = SINGLE_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__SHORT_DESCRIPTION = SINGLE_SOURCE_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__SHORT_NAME = SINGLE_SOURCE_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__PROPERTY = SINGLE_SOURCE_NODE__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__XREF_EXTENSION = SINGLE_SOURCE_NODE__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Parallel Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__PARALLEL_FACTOR = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test Req</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__TEST_REQ = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__FUNCTION = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.TestDBImpl <em>Test DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.TestDBImpl
	 * @see Essence.impl.EssencePackageImpl#getTestDB()
	 * @generated
	 */
	int TEST_DB = 152;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DB__CUSTOM = MODEL_ROOT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DB__HIDDEN = MODEL_ROOT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DB__ID = MODEL_ROOT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DB__LONG_DESCRIPTION = MODEL_ROOT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DB__NAME = MODEL_ROOT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DB__SHORT_DESCRIPTION = MODEL_ROOT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DB__SHORT_NAME = MODEL_ROOT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DB__PROPERTY = MODEL_ROOT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DB__XREF_EXTENSION = MODEL_ROOT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Const Def Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DB__CONST_DEF_BLOCK = MODEL_ROOT__CONST_DEF_BLOCK;

	/**
	 * The feature id for the '<em><b>Essence Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DB__ESSENCE_VERSION = MODEL_ROOT__ESSENCE_VERSION;

	/**
	 * The feature id for the '<em><b>Generic Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DB__GENERIC_DECL_BLOCK = MODEL_ROOT__GENERIC_DECL_BLOCK;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DB__MODULE = MODEL_ROOT__MODULE;

	/**
	 * The feature id for the '<em><b>Param Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DB__PARAM_DECL_BLOCK = MODEL_ROOT__PARAM_DECL_BLOCK;

	/**
	 * The feature id for the '<em><b>VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DB__VLNV = MODEL_ROOT__VLNV;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DB__TEST = MODEL_ROOT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DB_FEATURE_COUNT = MODEL_ROOT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Test DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DB_OPERATION_COUNT = MODEL_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.TestReqImpl <em>Test Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.TestReqImpl
	 * @see Essence.impl.EssencePackageImpl#getTestReq()
	 * @generated
	 */
	int TEST_REQ = 153;

	/**
	 * The feature id for the '<em><b>Driver Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_REQ__DRIVER_STRENGTH = ESSENCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_REQ_FEATURE_COUNT = ESSENCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Test Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_REQ_OPERATION_COUNT = ESSENCE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.TransactionalPortImpl <em>Transactional Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.TransactionalPortImpl
	 * @see Essence.impl.EssencePackageImpl#getTransactionalPort()
	 * @generated
	 */
	int TRANSACTIONAL_PORT = 154;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_PORT__CUSTOM = REAL_PORT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_PORT__HIDDEN = REAL_PORT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_PORT__ID = REAL_PORT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_PORT__LONG_DESCRIPTION = REAL_PORT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_PORT__NAME = REAL_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_PORT__SHORT_DESCRIPTION = REAL_PORT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_PORT__SHORT_NAME = REAL_PORT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_PORT__PROPERTY = REAL_PORT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_PORT__XREF_EXTENSION = REAL_PORT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_PORT__DIRECTION = REAL_PORT__DIRECTION;

	/**
	 * The feature id for the '<em><b>XRef Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_PORT__XREF_DEFAULT_VALUE = REAL_PORT__XREF_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_PORT__DATA_TYPE = REAL_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initiative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_PORT__INITIATIVE = REAL_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transactional Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_PORT_FEATURE_COUNT = REAL_PORT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transactional Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_PORT_OPERATION_COUNT = REAL_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.TransactionalSignalImpl <em>Transactional Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.TransactionalSignalImpl
	 * @see Essence.impl.EssencePackageImpl#getTransactionalSignal()
	 * @generated
	 */
	int TRANSACTIONAL_SIGNAL = 155;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_SIGNAL__CUSTOM = SIGNAL__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_SIGNAL__HIDDEN = SIGNAL__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_SIGNAL__ID = SIGNAL__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_SIGNAL__LONG_DESCRIPTION = SIGNAL__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_SIGNAL__NAME = SIGNAL__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_SIGNAL__SHORT_DESCRIPTION = SIGNAL__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_SIGNAL__SHORT_NAME = SIGNAL__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_SIGNAL__PROPERTY = SIGNAL__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_SIGNAL__XREF_EXTENSION = SIGNAL__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_SIGNAL__XREF_DEFAULT_VALUE = SIGNAL__XREF_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_SIGNAL__DATA_TYPE = SIGNAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transactional Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_SIGNAL_FEATURE_COUNT = SIGNAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transactional Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_SIGNAL_OPERATION_COUNT = SIGNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.UnionImpl <em>Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.UnionImpl
	 * @see Essence.impl.EssencePackageImpl#getUnion()
	 * @generated
	 */
	int UNION = 156;

	/**
	 * The feature id for the '<em><b>Sign Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__SIGN_INTERPRETATION = COMPLEX_DATA_TYPE__SIGN_INTERPRETATION;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__OBJECT_TYPE = COMPLEX_DATA_TYPE__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__VECTOR = COMPLEX_DATA_TYPE__VECTOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__NAME = COMPLEX_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Data Type Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__DATA_TYPE_ELEMENT = COMPLEX_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FEATURE_COUNT = COMPLEX_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_OPERATION_COUNT = COMPLEX_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.VLNVImpl <em>VLNV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.VLNVImpl
	 * @see Essence.impl.EssencePackageImpl#getVLNV()
	 * @generated
	 */
	int VLNV = 160;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLNV__VENDOR = ESSENCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLNV__LIBRARY = ESSENCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLNV__NAME = ESSENCE_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLNV__VERSION = ESSENCE_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>VLNV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLNV_FEATURE_COUNT = ESSENCE_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>VLNV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLNV_OPERATION_COUNT = ESSENCE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.VoidImpl <em>Void</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.VoidImpl
	 * @see Essence.impl.EssencePackageImpl#getVoid()
	 * @generated
	 */
	int VOID = 161;

	/**
	 * The number of structural features of the '<em>Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_FEATURE_COUNT = RETURN_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERATION_COUNT = RETURN_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.WirePortImpl <em>Wire Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.WirePortImpl
	 * @see Essence.impl.EssencePackageImpl#getWirePort()
	 * @generated
	 */
	int WIRE_PORT = 162;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_PORT__CUSTOM = REAL_PORT__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_PORT__HIDDEN = REAL_PORT__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_PORT__ID = REAL_PORT__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_PORT__LONG_DESCRIPTION = REAL_PORT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_PORT__NAME = REAL_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_PORT__SHORT_DESCRIPTION = REAL_PORT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_PORT__SHORT_NAME = REAL_PORT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_PORT__PROPERTY = REAL_PORT__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_PORT__XREF_EXTENSION = REAL_PORT__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_PORT__DIRECTION = REAL_PORT__DIRECTION;

	/**
	 * The feature id for the '<em><b>XRef Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_PORT__XREF_DEFAULT_VALUE = REAL_PORT__XREF_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_PORT__DATA_TYPE = REAL_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wire Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_PORT_FEATURE_COUNT = REAL_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wire Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_PORT_OPERATION_COUNT = REAL_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.WireSignalImpl <em>Wire Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.WireSignalImpl
	 * @see Essence.impl.EssencePackageImpl#getWireSignal()
	 * @generated
	 */
	int WIRE_SIGNAL = 163;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_SIGNAL__CUSTOM = SIGNAL__CUSTOM;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_SIGNAL__HIDDEN = SIGNAL__HIDDEN;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_SIGNAL__ID = SIGNAL__ID;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_SIGNAL__LONG_DESCRIPTION = SIGNAL__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_SIGNAL__NAME = SIGNAL__NAME;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_SIGNAL__SHORT_DESCRIPTION = SIGNAL__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_SIGNAL__SHORT_NAME = SIGNAL__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_SIGNAL__PROPERTY = SIGNAL__PROPERTY;

	/**
	 * The feature id for the '<em><b>XRef Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_SIGNAL__XREF_EXTENSION = SIGNAL__XREF_EXTENSION;

	/**
	 * The feature id for the '<em><b>XRef Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_SIGNAL__XREF_DEFAULT_VALUE = SIGNAL__XREF_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_SIGNAL__DATA_TYPE = SIGNAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wire Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_SIGNAL_FEATURE_COUNT = SIGNAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wire Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_SIGNAL_OPERATION_COUNT = SIGNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefImpl <em>XRef</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefImpl
	 * @see Essence.impl.EssencePackageImpl#getXRef()
	 * @generated
	 */
	int XREF = 164;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF__XREF_TARGET_ID = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XRef</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XRef</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefInternalImpl <em>XRef Internal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefInternalImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefInternal()
	 * @generated
	 */
	int XREF_INTERNAL = 180;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL__XREF_TARGET_ID = XREF__XREF_TARGET_ID;

	/**
	 * The number of structural features of the '<em>XRef Internal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_FEATURE_COUNT = XREF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef Internal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_OPERATION_COUNT = XREF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefConnectionImpl <em>XRef Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefConnectionImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefConnection()
	 * @generated
	 */
	int XREF_CONNECTION = 165;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_CONNECTION__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The number of structural features of the '<em>XRef Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_CONNECTION_FEATURE_COUNT = XREF_INTERNAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_CONNECTION_OPERATION_COUNT = XREF_INTERNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefDataVarImpl <em>XRef Data Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefDataVarImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefDataVar()
	 * @generated
	 */
	int XREF_DATA_VAR = 166;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_DATA_VAR__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The number of structural features of the '<em>XRef Data Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_DATA_VAR_FEATURE_COUNT = XREF_INTERNAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef Data Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_DATA_VAR_OPERATION_COUNT = XREF_INTERNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefExternalImpl <em>XRef External</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefExternalImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefExternal()
	 * @generated
	 */
	int XREF_EXTERNAL = 168;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL__XREF_TARGET_ID = XREF__XREF_TARGET_ID;

	/**
	 * The number of structural features of the '<em>XRef External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_FEATURE_COUNT = XREF_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_OPERATION_COUNT = XREF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefDirectImpl <em>XRef Direct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefDirectImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefDirect()
	 * @generated
	 */
	int XREF_DIRECT = 167;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_DIRECT__XREF_TARGET_ID = XREF_EXTERNAL__XREF_TARGET_ID;

	/**
	 * The number of structural features of the '<em>XRef Direct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_DIRECT_FEATURE_COUNT = XREF_EXTERNAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef Direct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_DIRECT_OPERATION_COUNT = XREF_EXTERNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefExternalInterfaceImpl <em>XRef External Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefExternalInterfaceImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefExternalInterface()
	 * @generated
	 */
	int XREF_EXTERNAL_INTERFACE = 169;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_INTERFACE__XREF_TARGET_ID = XREF_DIRECT__XREF_TARGET_ID;

	/**
	 * The number of structural features of the '<em>XRef External Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_INTERFACE_FEATURE_COUNT = XREF_DIRECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef External Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_INTERFACE_OPERATION_COUNT = XREF_DIRECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefExternalPortImpl <em>XRef External Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefExternalPortImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefExternalPort()
	 * @generated
	 */
	int XREF_EXTERNAL_PORT = 170;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_PORT__XREF_TARGET_ID = XREF_DIRECT__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>Sub Element Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_PORT__SUB_ELEMENT_ACCESS = XREF_DIRECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XRef External Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_PORT_FEATURE_COUNT = XREF_DIRECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XRef External Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_PORT_OPERATION_COUNT = XREF_DIRECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefExternalSignalImpl <em>XRef External Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefExternalSignalImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefExternalSignal()
	 * @generated
	 */
	int XREF_EXTERNAL_SIGNAL = 171;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_SIGNAL__XREF_TARGET_ID = XREF_DIRECT__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>Sub Element Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_SIGNAL__SUB_ELEMENT_ACCESS = XREF_DIRECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XRef External Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_SIGNAL_FEATURE_COUNT = XREF_DIRECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XRef External Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_SIGNAL_OPERATION_COUNT = XREF_DIRECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefGenericDeclImpl <em>XRef Generic Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefGenericDeclImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefGenericDecl()
	 * @generated
	 */
	int XREF_GENERIC_DECL = 172;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_GENERIC_DECL__XREF_TARGET_ID = XREF_DIRECT__XREF_TARGET_ID;

	/**
	 * The number of structural features of the '<em>XRef Generic Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_GENERIC_DECL_FEATURE_COUNT = XREF_DIRECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef Generic Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_GENERIC_DECL_OPERATION_COUNT = XREF_DIRECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefIFDPortImpl <em>XRef IFD Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefIFDPortImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefIFDPort()
	 * @generated
	 */
	int XREF_IFD_PORT = 173;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IFD_PORT__XREF_TARGET_ID = XREF_DIRECT__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>Sub Element Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IFD_PORT__SUB_ELEMENT_ACCESS = XREF_DIRECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XRef IFD Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IFD_PORT_FEATURE_COUNT = XREF_DIRECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XRef IFD Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IFD_PORT_OPERATION_COUNT = XREF_DIRECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefIndirectImpl <em>XRef Indirect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefIndirectImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefIndirect()
	 * @generated
	 */
	int XREF_INDIRECT = 175;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INDIRECT__XREF_TARGET_ID = XREF_EXTERNAL__XREF_TARGET_ID;

	/**
	 * The number of structural features of the '<em>XRef Indirect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INDIRECT_FEATURE_COUNT = XREF_EXTERNAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef Indirect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INDIRECT_OPERATION_COUNT = XREF_EXTERNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefIndInterfaceImpl <em>XRef Ind Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefIndInterfaceImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefIndInterface()
	 * @generated
	 */
	int XREF_IND_INTERFACE = 174;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_INTERFACE__XREF_TARGET_ID = XREF_INDIRECT__XREF_TARGET_ID;

	/**
	 * The number of structural features of the '<em>XRef Ind Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_INTERFACE_FEATURE_COUNT = XREF_INDIRECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef Ind Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_INTERFACE_OPERATION_COUNT = XREF_INDIRECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefIndPinImpl <em>XRef Ind Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefIndPinImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefIndPin()
	 * @generated
	 */
	int XREF_IND_PIN = 176;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_PIN__XREF_TARGET_ID = XREF_INDIRECT__XREF_TARGET_ID;

	/**
	 * The number of structural features of the '<em>XRef Ind Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_PIN_FEATURE_COUNT = XREF_INDIRECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef Ind Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_PIN_OPERATION_COUNT = XREF_INDIRECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefIndPortImpl <em>XRef Ind Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefIndPortImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefIndPort()
	 * @generated
	 */
	int XREF_IND_PORT = 177;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_PORT__XREF_TARGET_ID = XREF_INDIRECT__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>Sub Element Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_PORT__SUB_ELEMENT_ACCESS = XREF_INDIRECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XRef Ind Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_PORT_FEATURE_COUNT = XREF_INDIRECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XRef Ind Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_PORT_OPERATION_COUNT = XREF_INDIRECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefIndSinglePadImpl <em>XRef Ind Single Pad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefIndSinglePadImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefIndSinglePad()
	 * @generated
	 */
	int XREF_IND_SINGLE_PAD = 178;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_SINGLE_PAD__XREF_TARGET_ID = XREF_INDIRECT__XREF_TARGET_ID;

	/**
	 * The number of structural features of the '<em>XRef Ind Single Pad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_SINGLE_PAD_FEATURE_COUNT = XREF_INDIRECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef Ind Single Pad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_SINGLE_PAD_OPERATION_COUNT = XREF_INDIRECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefInstanceImpl <em>XRef Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefInstanceImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefInstance()
	 * @generated
	 */
	int XREF_INSTANCE = 179;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INSTANCE__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The number of structural features of the '<em>XRef Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INSTANCE_FEATURE_COUNT = XREF_INTERNAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INSTANCE_OPERATION_COUNT = XREF_INTERNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefInternalInterfaceImpl <em>XRef Internal Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefInternalInterfaceImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefInternalInterface()
	 * @generated
	 */
	int XREF_INTERNAL_INTERFACE = 181;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_INTERFACE__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The number of structural features of the '<em>XRef Internal Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_INTERFACE_FEATURE_COUNT = XREF_INTERNAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef Internal Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_INTERFACE_OPERATION_COUNT = XREF_INTERNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefInternalPortImpl <em>XRef Internal Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefInternalPortImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefInternalPort()
	 * @generated
	 */
	int XREF_INTERNAL_PORT = 182;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_PORT__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>Sub Element Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_PORT__SUB_ELEMENT_ACCESS = XREF_INTERNAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XRef Internal Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_PORT_FEATURE_COUNT = XREF_INTERNAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XRef Internal Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_PORT_OPERATION_COUNT = XREF_INTERNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefInternalSignalImpl <em>XRef Internal Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefInternalSignalImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefInternalSignal()
	 * @generated
	 */
	int XREF_INTERNAL_SIGNAL = 183;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_SIGNAL__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>Sub Element Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_SIGNAL__SUB_ELEMENT_ACCESS = XREF_INTERNAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XRef Internal Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_SIGNAL_FEATURE_COUNT = XREF_INTERNAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XRef Internal Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_SIGNAL_OPERATION_COUNT = XREF_INTERNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefMasterInterfaceImpl <em>XRef Master Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefMasterInterfaceImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefMasterInterface()
	 * @generated
	 */
	int XREF_MASTER_INTERFACE = 184;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_MASTER_INTERFACE__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_MASTER_INTERFACE__RANGE = XREF_INTERNAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_MASTER_INTERFACE__SRC_OFFSET = XREF_INTERNAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tgt Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_MASTER_INTERFACE__TGT_OFFSET = XREF_INTERNAL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>XRef Master Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_MASTER_INTERFACE_FEATURE_COUNT = XREF_INTERNAL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>XRef Master Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_MASTER_INTERFACE_OPERATION_COUNT = XREF_INTERNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefNetImpl <em>XRef Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefNetImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefNet()
	 * @generated
	 */
	int XREF_NET = 185;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_NET__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The number of structural features of the '<em>XRef Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_NET_FEATURE_COUNT = XREF_INTERNAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_NET_OPERATION_COUNT = XREF_INTERNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefNoneInterfaceImpl <em>XRef None Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefNoneInterfaceImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefNoneInterface()
	 * @generated
	 */
	int XREF_NONE_INTERFACE = 186;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_NONE_INTERFACE__XREF_TARGET_ID = XREF_DIRECT__XREF_TARGET_ID;

	/**
	 * The number of structural features of the '<em>XRef None Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_NONE_INTERFACE_FEATURE_COUNT = XREF_DIRECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef None Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_NONE_INTERFACE_OPERATION_COUNT = XREF_DIRECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefVLNVImpl <em>XRef VLNV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefVLNVImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefVLNV()
	 * @generated
	 */
	int XREF_VLNV = 199;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_VLNV__XREF_TARGET_ID = XREF_DIRECT__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_VLNV__EXT_VLNV = XREF_DIRECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XRef VLNV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_VLNV_FEATURE_COUNT = XREF_DIRECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XRef VLNV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_VLNV_OPERATION_COUNT = XREF_DIRECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefPadTypeImpl <em>XRef Pad Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefPadTypeImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefPadType()
	 * @generated
	 */
	int XREF_PAD_TYPE = 187;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_PAD_TYPE__XREF_TARGET_ID = XREF_VLNV__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_PAD_TYPE__EXT_VLNV = XREF_VLNV__EXT_VLNV;

	/**
	 * The number of structural features of the '<em>XRef Pad Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_PAD_TYPE_FEATURE_COUNT = XREF_VLNV_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef Pad Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_PAD_TYPE_OPERATION_COUNT = XREF_VLNV_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefParamDeclImpl <em>XRef Param Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefParamDeclImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefParamDecl()
	 * @generated
	 */
	int XREF_PARAM_DECL = 188;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_PARAM_DECL__XREF_TARGET_ID = XREF_DIRECT__XREF_TARGET_ID;

	/**
	 * The number of structural features of the '<em>XRef Param Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_PARAM_DECL_FEATURE_COUNT = XREF_DIRECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef Param Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_PARAM_DECL_OPERATION_COUNT = XREF_DIRECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefPinImpl <em>XRef Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefPinImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefPin()
	 * @generated
	 */
	int XREF_PIN = 189;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_PIN__XREF_TARGET_ID = XREF_DIRECT__XREF_TARGET_ID;

	/**
	 * The number of structural features of the '<em>XRef Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_PIN_FEATURE_COUNT = XREF_DIRECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_PIN_OPERATION_COUNT = XREF_DIRECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefPowerDomainImpl <em>XRef Power Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefPowerDomainImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefPowerDomain()
	 * @generated
	 */
	int XREF_POWER_DOMAIN = 190;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_POWER_DOMAIN__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The number of structural features of the '<em>XRef Power Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_POWER_DOMAIN_FEATURE_COUNT = XREF_INTERNAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef Power Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_POWER_DOMAIN_OPERATION_COUNT = XREF_INTERNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefRealPortImpl <em>XRef Real Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefRealPortImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefRealPort()
	 * @generated
	 */
	int XREF_REAL_PORT = 191;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REAL_PORT__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>Sub Element Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REAL_PORT__SUB_ELEMENT_ACCESS = XREF_INTERNAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XRef Real Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REAL_PORT_FEATURE_COUNT = XREF_INTERNAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XRef Real Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REAL_PORT_OPERATION_COUNT = XREF_INTERNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefRegisterViewImpl <em>XRef Register View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefRegisterViewImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefRegisterView()
	 * @generated
	 */
	int XREF_REGISTER_VIEW = 192;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REGISTER_VIEW__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The number of structural features of the '<em>XRef Register View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REGISTER_VIEW_FEATURE_COUNT = XREF_INTERNAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef Register View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REGISTER_VIEW_OPERATION_COUNT = XREF_INTERNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefRegMemSetImpl <em>XRef Reg Mem Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefRegMemSetImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefRegMemSet()
	 * @generated
	 */
	int XREF_REG_MEM_SET = 193;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REG_MEM_SET__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REG_MEM_SET__OFFSET = XREF_INTERNAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REG_MEM_SET__ACCESS_CONDITION = XREF_INTERNAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XRef Reg Mem Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REG_MEM_SET_FEATURE_COUNT = XREF_INTERNAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>XRef Reg Mem Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REG_MEM_SET_OPERATION_COUNT = XREF_INTERNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefSinglePadImpl <em>XRef Single Pad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefSinglePadImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefSinglePad()
	 * @generated
	 */
	int XREF_SINGLE_PAD = 194;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SINGLE_PAD__XREF_TARGET_ID = XREF_DIRECT__XREF_TARGET_ID;

	/**
	 * The number of structural features of the '<em>XRef Single Pad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SINGLE_PAD_FEATURE_COUNT = XREF_DIRECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef Single Pad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SINGLE_PAD_OPERATION_COUNT = XREF_DIRECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefSiPortImpl <em>XRef Si Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefSiPortImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefSiPort()
	 * @generated
	 */
	int XREF_SI_PORT = 195;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SI_PORT__XREF_TARGET_ID = XREF_VLNV__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SI_PORT__EXT_VLNV = XREF_VLNV__EXT_VLNV;

	/**
	 * The number of structural features of the '<em>XRef Si Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SI_PORT_FEATURE_COUNT = XREF_VLNV_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef Si Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SI_PORT_OPERATION_COUNT = XREF_VLNV_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefSiSignalImpl <em>XRef Si Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefSiSignalImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefSiSignal()
	 * @generated
	 */
	int XREF_SI_SIGNAL = 196;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SI_SIGNAL__XREF_TARGET_ID = XREF_VLNV__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SI_SIGNAL__EXT_VLNV = XREF_VLNV__EXT_VLNV;

	/**
	 * The number of structural features of the '<em>XRef Si Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SI_SIGNAL_FEATURE_COUNT = XREF_VLNV_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef Si Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SI_SIGNAL_OPERATION_COUNT = XREF_VLNV_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefSlaveInterfaceImpl <em>XRef Slave Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefSlaveInterfaceImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefSlaveInterface()
	 * @generated
	 */
	int XREF_SLAVE_INTERFACE = 197;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SLAVE_INTERFACE__XREF_TARGET_ID = XREF_EXTERNAL__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SLAVE_INTERFACE__RANGE = XREF_EXTERNAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SLAVE_INTERFACE__SRC_OFFSET = XREF_EXTERNAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tgt Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SLAVE_INTERFACE__TGT_OFFSET = XREF_EXTERNAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>XRef Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SLAVE_INTERFACE__XREF_INSTANCE = XREF_EXTERNAL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>XRef Slave Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SLAVE_INTERFACE_FEATURE_COUNT = XREF_EXTERNAL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>XRef Slave Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SLAVE_INTERFACE_OPERATION_COUNT = XREF_EXTERNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.impl.XRefTestImpl <em>XRef Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.impl.XRefTestImpl
	 * @see Essence.impl.EssencePackageImpl#getXRefTest()
	 * @generated
	 */
	int XREF_TEST = 198;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_TEST__XREF_TARGET_ID = XREF_VLNV__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_TEST__EXT_VLNV = XREF_VLNV__EXT_VLNV;

	/**
	 * The number of structural features of the '<em>XRef Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_TEST_FEATURE_COUNT = XREF_VLNV_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XRef Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_TEST_OPERATION_COUNT = XREF_VLNV_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Essence.AccessType <em>Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.AccessType
	 * @see Essence.impl.EssencePackageImpl#getAccessType()
	 * @generated
	 */
	int ACCESS_TYPE = 200;

	/**
	 * The meta object id for the '{@link Essence.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.ActionType
	 * @see Essence.impl.EssencePackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 201;

	/**
	 * The meta object id for the '{@link Essence.BehaviorType <em>Behavior Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.BehaviorType
	 * @see Essence.impl.EssencePackageImpl#getBehaviorType()
	 * @generated
	 */
	int BEHAVIOR_TYPE = 202;

	/**
	 * The meta object id for the '{@link Essence.BusErrorType <em>Bus Error Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.BusErrorType
	 * @see Essence.impl.EssencePackageImpl#getBusErrorType()
	 * @generated
	 */
	int BUS_ERROR_TYPE = 203;

	/**
	 * The meta object id for the '{@link Essence.EndianType <em>Endian Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.EndianType
	 * @see Essence.impl.EssencePackageImpl#getEndianType()
	 * @generated
	 */
	int ENDIAN_TYPE = 204;

	/**
	 * The meta object id for the '{@link Essence.FunctionType <em>Function Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.FunctionType
	 * @see Essence.impl.EssencePackageImpl#getFunctionType()
	 * @generated
	 */
	int FUNCTION_TYPE = 205;

	/**
	 * The meta object id for the '{@link Essence.InterfaceDefRoleType <em>Interface Def Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.InterfaceDefRoleType
	 * @see Essence.impl.EssencePackageImpl#getInterfaceDefRoleType()
	 * @generated
	 */
	int INTERFACE_DEF_ROLE_TYPE = 206;

	/**
	 * The meta object id for the '{@link Essence.InterfaceRoleType <em>Interface Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.InterfaceRoleType
	 * @see Essence.impl.EssencePackageImpl#getInterfaceRoleType()
	 * @generated
	 */
	int INTERFACE_ROLE_TYPE = 207;

	/**
	 * The meta object id for the '{@link Essence.MessageType <em>Message Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.MessageType
	 * @see Essence.impl.EssencePackageImpl#getMessageType()
	 * @generated
	 */
	int MESSAGE_TYPE = 208;

	/**
	 * The meta object id for the '{@link Essence.PortDirection <em>Port Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.PortDirection
	 * @see Essence.impl.EssencePackageImpl#getPortDirection()
	 * @generated
	 */
	int PORT_DIRECTION = 209;

	/**
	 * The meta object id for the '{@link Essence.PortInitiative <em>Port Initiative</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.PortInitiative
	 * @see Essence.impl.EssencePackageImpl#getPortInitiative()
	 * @generated
	 */
	int PORT_INITIATIVE = 210;

	/**
	 * The meta object id for the '{@link Essence.ReservedType <em>Reserved Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.ReservedType
	 * @see Essence.impl.EssencePackageImpl#getReservedType()
	 * @generated
	 */
	int RESERVED_TYPE = 211;

	/**
	 * The meta object id for the '{@link Essence.SignType <em>Sign Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.SignType
	 * @see Essence.impl.EssencePackageImpl#getSignType()
	 * @generated
	 */
	int SIGN_TYPE = 212;

	/**
	 * The meta object id for the '{@link Essence.SpecialType <em>Special Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.SpecialType
	 * @see Essence.impl.EssencePackageImpl#getSpecialType()
	 * @generated
	 */
	int SPECIAL_TYPE = 213;

	/**
	 * The meta object id for the '{@link Essence.StrobeType <em>Strobe Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.StrobeType
	 * @see Essence.impl.EssencePackageImpl#getStrobeType()
	 * @generated
	 */
	int STROBE_TYPE = 214;

	/**
	 * The meta object id for the '{@link Essence.SyncMode <em>Sync Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.SyncMode
	 * @see Essence.impl.EssencePackageImpl#getSyncMode()
	 * @generated
	 */
	int SYNC_MODE = 215;

	/**
	 * The meta object id for the '{@link Essence.TopSpinType <em>Top Spin Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.TopSpinType
	 * @see Essence.impl.EssencePackageImpl#getTopSpinType()
	 * @generated
	 */
	int TOP_SPIN_TYPE = 216;

	/**
	 * The meta object id for the '{@link Essence.VirtualType <em>Virtual Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.VirtualType
	 * @see Essence.impl.EssencePackageImpl#getVirtualType()
	 * @generated
	 */
	int VIRTUAL_TYPE = 217;

	/**
	 * The meta object id for the '<em>Access Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.AccessType
	 * @see Essence.impl.EssencePackageImpl#getAccessTypeObject()
	 * @generated
	 */
	int ACCESS_TYPE_OBJECT = 218;

	/**
	 * The meta object id for the '<em>Action Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.ActionType
	 * @see Essence.impl.EssencePackageImpl#getActionTypeObject()
	 * @generated
	 */
	int ACTION_TYPE_OBJECT = 219;

	/**
	 * The meta object id for the '<em>Behavior Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.BehaviorType
	 * @see Essence.impl.EssencePackageImpl#getBehaviorTypeObject()
	 * @generated
	 */
	int BEHAVIOR_TYPE_OBJECT = 220;

	/**
	 * The meta object id for the '<em>Boolean Expr</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see Essence.impl.EssencePackageImpl#getBooleanExpr()
	 * @generated
	 */
	int BOOLEAN_EXPR = 221;

	/**
	 * The meta object id for the '<em>Boolean Literal</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see Essence.impl.EssencePackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 222;

	/**
	 * The meta object id for the '<em>Bus Error Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.BusErrorType
	 * @see Essence.impl.EssencePackageImpl#getBusErrorTypeObject()
	 * @generated
	 */
	int BUS_ERROR_TYPE_OBJECT = 223;

	/**
	 * The meta object id for the '<em>Common Expr</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see Essence.impl.EssencePackageImpl#getCommonExpr()
	 * @generated
	 */
	int COMMON_EXPR = 224;

	/**
	 * The meta object id for the '<em>Endian Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.EndianType
	 * @see Essence.impl.EssencePackageImpl#getEndianTypeObject()
	 * @generated
	 */
	int ENDIAN_TYPE_OBJECT = 225;

	/**
	 * The meta object id for the '<em>Function Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.FunctionType
	 * @see Essence.impl.EssencePackageImpl#getFunctionTypeObject()
	 * @generated
	 */
	int FUNCTION_TYPE_OBJECT = 226;

	/**
	 * The meta object id for the '<em>Integer Expr</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see Essence.impl.EssencePackageImpl#getIntegerExpr()
	 * @generated
	 */
	int INTEGER_EXPR = 227;

	/**
	 * The meta object id for the '<em>Integer Literal</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see Essence.impl.EssencePackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 228;

	/**
	 * The meta object id for the '<em>Interface Def Role Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.InterfaceDefRoleType
	 * @see Essence.impl.EssencePackageImpl#getInterfaceDefRoleTypeObject()
	 * @generated
	 */
	int INTERFACE_DEF_ROLE_TYPE_OBJECT = 229;

	/**
	 * The meta object id for the '<em>Interface Role Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.InterfaceRoleType
	 * @see Essence.impl.EssencePackageImpl#getInterfaceRoleTypeObject()
	 * @generated
	 */
	int INTERFACE_ROLE_TYPE_OBJECT = 230;

	/**
	 * The meta object id for the '<em>Message Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.MessageType
	 * @see Essence.impl.EssencePackageImpl#getMessageTypeObject()
	 * @generated
	 */
	int MESSAGE_TYPE_OBJECT = 231;

	/**
	 * The meta object id for the '<em>Path Expr</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see Essence.impl.EssencePackageImpl#getPathExpr()
	 * @generated
	 */
	int PATH_EXPR = 232;

	/**
	 * The meta object id for the '<em>Port Direction Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.PortDirection
	 * @see Essence.impl.EssencePackageImpl#getPortDirectionObject()
	 * @generated
	 */
	int PORT_DIRECTION_OBJECT = 233;

	/**
	 * The meta object id for the '<em>Port Initiative Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.PortInitiative
	 * @see Essence.impl.EssencePackageImpl#getPortInitiativeObject()
	 * @generated
	 */
	int PORT_INITIATIVE_OBJECT = 234;

	/**
	 * The meta object id for the '<em>Reserved Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.ReservedType
	 * @see Essence.impl.EssencePackageImpl#getReservedTypeObject()
	 * @generated
	 */
	int RESERVED_TYPE_OBJECT = 235;

	/**
	 * The meta object id for the '<em>Sign Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.SignType
	 * @see Essence.impl.EssencePackageImpl#getSignTypeObject()
	 * @generated
	 */
	int SIGN_TYPE_OBJECT = 236;

	/**
	 * The meta object id for the '<em>Special Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.SpecialType
	 * @see Essence.impl.EssencePackageImpl#getSpecialTypeObject()
	 * @generated
	 */
	int SPECIAL_TYPE_OBJECT = 237;

	/**
	 * The meta object id for the '<em>String Expr</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see Essence.impl.EssencePackageImpl#getStringExpr()
	 * @generated
	 */
	int STRING_EXPR = 238;

	/**
	 * The meta object id for the '<em>String Literal</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see Essence.impl.EssencePackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 239;

	/**
	 * The meta object id for the '<em>Strobe Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.StrobeType
	 * @see Essence.impl.EssencePackageImpl#getStrobeTypeObject()
	 * @generated
	 */
	int STROBE_TYPE_OBJECT = 240;

	/**
	 * The meta object id for the '<em>Sync Mode Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.SyncMode
	 * @see Essence.impl.EssencePackageImpl#getSyncModeObject()
	 * @generated
	 */
	int SYNC_MODE_OBJECT = 241;

	/**
	 * The meta object id for the '<em>Top Spin Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.TopSpinType
	 * @see Essence.impl.EssencePackageImpl#getTopSpinTypeObject()
	 * @generated
	 */
	int TOP_SPIN_TYPE_OBJECT = 242;

	/**
	 * The meta object id for the '<em>Virtual Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Essence.VirtualType
	 * @see Essence.impl.EssencePackageImpl#getVirtualTypeObject()
	 * @generated
	 */
	int VIRTUAL_TYPE_OBJECT = 243;


	/**
	 * Returns the meta object for class '{@link Essence.Access <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access</em>'.
	 * @see Essence.Access
	 * @generated
	 */
	EClass getAccess();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Access#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Type</em>'.
	 * @see Essence.Access#getAccessType()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_AccessType();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Access#getStrobeType <em>Strobe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strobe Type</em>'.
	 * @see Essence.Access#getStrobeType()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_StrobeType();

	/**
	 * Returns the meta object for the attribute list '{@link Essence.Access#getActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Action Type</em>'.
	 * @see Essence.Access#getActionType()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_ActionType();

	/**
	 * Returns the meta object for class '{@link Essence.AccessByIndex <em>Access By Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access By Index</em>'.
	 * @see Essence.AccessByIndex
	 * @generated
	 */
	EClass getAccessByIndex();

	/**
	 * Returns the meta object for the attribute '{@link Essence.AccessByIndex#isAscending <em>Ascending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ascending</em>'.
	 * @see Essence.AccessByIndex#isAscending()
	 * @see #getAccessByIndex()
	 * @generated
	 */
	EAttribute getAccessByIndex_Ascending();

	/**
	 * Returns the meta object for the attribute '{@link Essence.AccessByIndex#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see Essence.AccessByIndex#getLeft()
	 * @see #getAccessByIndex()
	 * @generated
	 */
	EAttribute getAccessByIndex_Left();

	/**
	 * Returns the meta object for the attribute '{@link Essence.AccessByIndex#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see Essence.AccessByIndex#getRight()
	 * @see #getAccessByIndex()
	 * @generated
	 */
	EAttribute getAccessByIndex_Right();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.AccessByIndex#getSimpleSubElementAccess <em>Simple Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Sub Element Access</em>'.
	 * @see Essence.AccessByIndex#getSimpleSubElementAccess()
	 * @see #getAccessByIndex()
	 * @generated
	 */
	EReference getAccessByIndex_SimpleSubElementAccess();

	/**
	 * Returns the meta object for class '{@link Essence.AccessByName <em>Access By Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access By Name</em>'.
	 * @see Essence.AccessByName
	 * @generated
	 */
	EClass getAccessByName();

	/**
	 * Returns the meta object for the attribute '{@link Essence.AccessByName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Essence.AccessByName#getName()
	 * @see #getAccessByName()
	 * @generated
	 */
	EAttribute getAccessByName_Name();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.AccessByName#getSimpleSubElementAccess <em>Simple Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Sub Element Access</em>'.
	 * @see Essence.AccessByName#getSimpleSubElementAccess()
	 * @see #getAccessByName()
	 * @generated
	 */
	EReference getAccessByName_SimpleSubElementAccess();

	/**
	 * Returns the meta object for class '{@link Essence.AccessCondition <em>Access Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Condition</em>'.
	 * @see Essence.AccessCondition
	 * @generated
	 */
	EClass getAccessCondition();

	/**
	 * Returns the meta object for the attribute '{@link Essence.AccessCondition#getAccessLevel <em>Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Level</em>'.
	 * @see Essence.AccessCondition#getAccessLevel()
	 * @see #getAccessCondition()
	 * @generated
	 */
	EAttribute getAccessCondition_AccessLevel();

	/**
	 * Returns the meta object for the attribute '{@link Essence.AccessCondition#getBusErrorType <em>Bus Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Error Type</em>'.
	 * @see Essence.AccessCondition#getBusErrorType()
	 * @see #getAccessCondition()
	 * @generated
	 */
	EAttribute getAccessCondition_BusErrorType();

	/**
	 * Returns the meta object for class '{@link Essence.AccessLevel <em>Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Level</em>'.
	 * @see Essence.AccessLevel
	 * @generated
	 */
	EClass getAccessLevel();

	/**
	 * Returns the meta object for the attribute '{@link Essence.AccessLevel#getAccessLevel <em>Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Level</em>'.
	 * @see Essence.AccessLevel#getAccessLevel()
	 * @see #getAccessLevel()
	 * @generated
	 */
	EAttribute getAccessLevel_AccessLevel();

	/**
	 * Returns the meta object for the attribute '{@link Essence.AccessLevel#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Type</em>'.
	 * @see Essence.AccessLevel#getAccessType()
	 * @see #getAccessLevel()
	 * @generated
	 */
	EAttribute getAccessLevel_AccessType();

	/**
	 * Returns the meta object for class '{@link Essence.AddressBlock <em>Address Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Block</em>'.
	 * @see Essence.AddressBlock
	 * @generated
	 */
	EClass getAddressBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.AddressBlock#getXRefRegMemSet <em>XRef Reg Mem Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>XRef Reg Mem Set</em>'.
	 * @see Essence.AddressBlock#getXRefRegMemSet()
	 * @see #getAddressBlock()
	 * @generated
	 */
	EReference getAddressBlock_XRefRegMemSet();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.AddressBlock#getXRefMasterInterface <em>XRef Master Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>XRef Master Interface</em>'.
	 * @see Essence.AddressBlock#getXRefMasterInterface()
	 * @see #getAddressBlock()
	 * @generated
	 */
	EReference getAddressBlock_XRefMasterInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.AddressBlock#getXRefSlaveInterface <em>XRef Slave Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>XRef Slave Interface</em>'.
	 * @see Essence.AddressBlock#getXRefSlaveInterface()
	 * @see #getAddressBlock()
	 * @generated
	 */
	EReference getAddressBlock_XRefSlaveInterface();

	/**
	 * Returns the meta object for class '{@link Essence.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see Essence.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.Array#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see Essence.Array#getDataType()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_DataType();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.Array#getArrayDimension <em>Array Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Dimension</em>'.
	 * @see Essence.Array#getArrayDimension()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_ArrayDimension();

	/**
	 * Returns the meta object for class '{@link Essence.ArrayDimension <em>Array Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Dimension</em>'.
	 * @see Essence.ArrayDimension
	 * @generated
	 */
	EClass getArrayDimension();

	/**
	 * Returns the meta object for the attribute '{@link Essence.ArrayDimension#isAscending <em>Ascending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ascending</em>'.
	 * @see Essence.ArrayDimension#isAscending()
	 * @see #getArrayDimension()
	 * @generated
	 */
	EAttribute getArrayDimension_Ascending();

	/**
	 * Returns the meta object for the attribute '{@link Essence.ArrayDimension#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see Essence.ArrayDimension#getLeft()
	 * @see #getArrayDimension()
	 * @generated
	 */
	EAttribute getArrayDimension_Left();

	/**
	 * Returns the meta object for the attribute '{@link Essence.ArrayDimension#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see Essence.ArrayDimension#getRight()
	 * @see #getArrayDimension()
	 * @generated
	 */
	EAttribute getArrayDimension_Right();

	/**
	 * Returns the meta object for class '{@link Essence.BitField <em>Bit Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Field</em>'.
	 * @see Essence.BitField
	 * @generated
	 */
	EClass getBitField();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.BitField#getAccessExternal <em>Access External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access External</em>'.
	 * @see Essence.BitField#getAccessExternal()
	 * @see #getBitField()
	 * @generated
	 */
	EReference getBitField_AccessExternal();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.BitField#getAccessInternal <em>Access Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Internal</em>'.
	 * @see Essence.BitField#getAccessInternal()
	 * @see #getBitField()
	 * @generated
	 */
	EReference getBitField_AccessInternal();

	/**
	 * Returns the meta object for the attribute '{@link Essence.BitField#getMaxVal <em>Max Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Val</em>'.
	 * @see Essence.BitField#getMaxVal()
	 * @see #getBitField()
	 * @generated
	 */
	EAttribute getBitField_MaxVal();

	/**
	 * Returns the meta object for the attribute '{@link Essence.BitField#getMinVal <em>Min Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Val</em>'.
	 * @see Essence.BitField#getMinVal()
	 * @see #getBitField()
	 * @generated
	 */
	EAttribute getBitField_MinVal();

	/**
	 * Returns the meta object for the attribute '{@link Essence.BitField#getReserved <em>Reserved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved</em>'.
	 * @see Essence.BitField#getReserved()
	 * @see #getBitField()
	 * @generated
	 */
	EAttribute getBitField_Reserved();

	/**
	 * Returns the meta object for the attribute '{@link Essence.BitField#getSignInterpretation <em>Sign Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sign Interpretation</em>'.
	 * @see Essence.BitField#getSignInterpretation()
	 * @see #getBitField()
	 * @generated
	 */
	EAttribute getBitField_SignInterpretation();

	/**
	 * Returns the meta object for the attribute '{@link Essence.BitField#getVirtual <em>Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual</em>'.
	 * @see Essence.BitField#getVirtual()
	 * @see #getBitField()
	 * @generated
	 */
	EAttribute getBitField_Virtual();

	/**
	 * Returns the meta object for the attribute '{@link Essence.BitField#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see Essence.BitField#getDefaultValue()
	 * @see #getBitField()
	 * @generated
	 */
	EAttribute getBitField_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link Essence.BitField#getDefaultMask <em>Default Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Mask</em>'.
	 * @see Essence.BitField#getDefaultMask()
	 * @see #getBitField()
	 * @generated
	 */
	EAttribute getBitField_DefaultMask();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.BitField#getAccessLevel <em>Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Level</em>'.
	 * @see Essence.BitField#getAccessLevel()
	 * @see #getBitField()
	 * @generated
	 */
	EReference getBitField_AccessLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.BitField#getEnumerationElement <em>Enumeration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration Element</em>'.
	 * @see Essence.BitField#getEnumerationElement()
	 * @see #getBitField()
	 * @generated
	 */
	EReference getBitField_EnumerationElement();

	/**
	 * Returns the meta object for class '{@link Essence.BitFieldElement <em>Bit Field Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Field Element</em>'.
	 * @see Essence.BitFieldElement
	 * @generated
	 */
	EClass getBitFieldElement();

	/**
	 * Returns the meta object for the attribute '{@link Essence.BitFieldElement#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see Essence.BitFieldElement#getOffset()
	 * @see #getBitFieldElement()
	 * @generated
	 */
	EAttribute getBitFieldElement_Offset();

	/**
	 * Returns the meta object for class '{@link Essence.BitFieldGapElement <em>Bit Field Gap Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Field Gap Element</em>'.
	 * @see Essence.BitFieldGapElement
	 * @generated
	 */
	EClass getBitFieldGapElement();

	/**
	 * Returns the meta object for class '{@link Essence.BitFieldSequence <em>Bit Field Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Field Sequence</em>'.
	 * @see Essence.BitFieldSequence
	 * @generated
	 */
	EClass getBitFieldSequence();

	/**
	 * Returns the meta object for the attribute '{@link Essence.BitFieldSequence#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see Essence.BitFieldSequence#getCount()
	 * @see #getBitFieldSequence()
	 * @generated
	 */
	EAttribute getBitFieldSequence_Count();

	/**
	 * Returns the meta object for the attribute '{@link Essence.BitFieldSequence#getMinIndex <em>Min Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Index</em>'.
	 * @see Essence.BitFieldSequence#getMinIndex()
	 * @see #getBitFieldSequence()
	 * @generated
	 */
	EAttribute getBitFieldSequence_MinIndex();

	/**
	 * Returns the meta object for the attribute '{@link Essence.BitFieldSequence#getIndexStep <em>Index Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Step</em>'.
	 * @see Essence.BitFieldSequence#getIndexStep()
	 * @see #getBitFieldSequence()
	 * @generated
	 */
	EAttribute getBitFieldSequence_IndexStep();

	/**
	 * Returns the meta object for the attribute '{@link Essence.BitFieldSequence#getIndexVar <em>Index Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Var</em>'.
	 * @see Essence.BitFieldSequence#getIndexVar()
	 * @see #getBitFieldSequence()
	 * @generated
	 */
	EAttribute getBitFieldSequence_IndexVar();

	/**
	 * Returns the meta object for the attribute '{@link Essence.BitFieldSequence#getAltFormat <em>Alt Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Format</em>'.
	 * @see Essence.BitFieldSequence#getAltFormat()
	 * @see #getBitFieldSequence()
	 * @generated
	 */
	EAttribute getBitFieldSequence_AltFormat();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.BitFieldSequence#getBitFieldSequenceElement <em>Bit Field Sequence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bit Field Sequence Element</em>'.
	 * @see Essence.BitFieldSequence#getBitFieldSequenceElement()
	 * @see #getBitFieldSequence()
	 * @generated
	 */
	EReference getBitFieldSequence_BitFieldSequenceElement();

	/**
	 * Returns the meta object for class '{@link Essence.BitFieldSequenceElement <em>Bit Field Sequence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Field Sequence Element</em>'.
	 * @see Essence.BitFieldSequenceElement
	 * @generated
	 */
	EClass getBitFieldSequenceElement();

	/**
	 * Returns the meta object for the attribute '{@link Essence.BitFieldSequenceElement#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see Essence.BitFieldSequenceElement#getWidth()
	 * @see #getBitFieldSequenceElement()
	 * @generated
	 */
	EAttribute getBitFieldSequenceElement_Width();

	/**
	 * Returns the meta object for class '{@link Essence.BooleanDecl <em>Boolean Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Decl</em>'.
	 * @see Essence.BooleanDecl
	 * @generated
	 */
	EClass getBooleanDecl();

	/**
	 * Returns the meta object for the attribute '{@link Essence.BooleanDecl#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see Essence.BooleanDecl#getDefaultValue()
	 * @see #getBooleanDecl()
	 * @generated
	 */
	EAttribute getBooleanDecl_DefaultValue();

	/**
	 * Returns the meta object for class '{@link Essence.BooleanDef <em>Boolean Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Def</em>'.
	 * @see Essence.BooleanDef
	 * @generated
	 */
	EClass getBooleanDef();

	/**
	 * Returns the meta object for the attribute '{@link Essence.BooleanDef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Essence.BooleanDef#getValue()
	 * @see #getBooleanDef()
	 * @generated
	 */
	EAttribute getBooleanDef_Value();

	/**
	 * Returns the meta object for class '{@link Essence.BooleanGenDecl <em>Boolean Gen Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Gen Decl</em>'.
	 * @see Essence.BooleanGenDecl
	 * @generated
	 */
	EClass getBooleanGenDecl();

	/**
	 * Returns the meta object for the attribute '{@link Essence.BooleanGenDecl#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see Essence.BooleanGenDecl#getDefaultValue()
	 * @see #getBooleanGenDecl()
	 * @generated
	 */
	EAttribute getBooleanGenDecl_DefaultValue();

	/**
	 * Returns the meta object for class '{@link Essence.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see Essence.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.Bus#getExtVLNV <em>Ext VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ext VLNV</em>'.
	 * @see Essence.Bus#getExtVLNV()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_ExtVLNV();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Bus#getMaxMasters <em>Max Masters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Masters</em>'.
	 * @see Essence.Bus#getMaxMasters()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_MaxMasters();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Bus#getMaxSlaves <em>Max Slaves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Slaves</em>'.
	 * @see Essence.Bus#getMaxSlaves()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_MaxSlaves();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.Bus#getNoneInterface <em>None Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>None Interface</em>'.
	 * @see Essence.Bus#getNoneInterface()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_NoneInterface();

	/**
	 * Returns the meta object for class '{@link Essence.BusInstance <em>Bus Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Instance</em>'.
	 * @see Essence.BusInstance
	 * @generated
	 */
	EClass getBusInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.BusInstance#getBusInterfaceMap <em>Bus Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Interface Map</em>'.
	 * @see Essence.BusInstance#getBusInterfaceMap()
	 * @see #getBusInstance()
	 * @generated
	 */
	EReference getBusInstance_BusInterfaceMap();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.BusInstance#getBusNoneInterfaceMap <em>Bus None Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus None Interface Map</em>'.
	 * @see Essence.BusInstance#getBusNoneInterfaceMap()
	 * @see #getBusInstance()
	 * @generated
	 */
	EReference getBusInstance_BusNoneInterfaceMap();

	/**
	 * Returns the meta object for class '{@link Essence.BusInterfaceMap <em>Bus Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Interface Map</em>'.
	 * @see Essence.BusInterfaceMap
	 * @generated
	 */
	EClass getBusInterfaceMap();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.BusInterfaceMap#getXRefConnection <em>XRef Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Connection</em>'.
	 * @see Essence.BusInterfaceMap#getXRefConnection()
	 * @see #getBusInterfaceMap()
	 * @generated
	 */
	EReference getBusInterfaceMap_XRefConnection();

	/**
	 * Returns the meta object for class '{@link Essence.BusNoneInterfaceMap <em>Bus None Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus None Interface Map</em>'.
	 * @see Essence.BusNoneInterfaceMap
	 * @generated
	 */
	EClass getBusNoneInterfaceMap();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.BusNoneInterfaceMap#getXRefBusNoneInterface <em>XRef Bus None Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Bus None Interface</em>'.
	 * @see Essence.BusNoneInterfaceMap#getXRefBusNoneInterface()
	 * @see #getBusNoneInterfaceMap()
	 * @generated
	 */
	EReference getBusNoneInterfaceMap_XRefBusNoneInterface();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.BusNoneInterfaceMap#getXRefConnection <em>XRef Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Connection</em>'.
	 * @see Essence.BusNoneInterfaceMap#getXRefConnection()
	 * @see #getBusNoneInterfaceMap()
	 * @generated
	 */
	EReference getBusNoneInterfaceMap_XRefConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.BusNoneInterfaceMap#getInstancePortMap <em>Instance Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Port Map</em>'.
	 * @see Essence.BusNoneInterfaceMap#getInstancePortMap()
	 * @see #getBusNoneInterfaceMap()
	 * @generated
	 */
	EReference getBusNoneInterfaceMap_InstancePortMap();

	/**
	 * Returns the meta object for class '{@link Essence.CablePort <em>Cable Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cable Port</em>'.
	 * @see Essence.CablePort
	 * @generated
	 */
	EClass getCablePort();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.CablePort#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see Essence.CablePort#getDataType()
	 * @see #getCablePort()
	 * @generated
	 */
	EReference getCablePort_DataType();

	/**
	 * Returns the meta object for class '{@link Essence.CableSignal <em>Cable Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cable Signal</em>'.
	 * @see Essence.CableSignal
	 * @generated
	 */
	EClass getCableSignal();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.CableSignal#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see Essence.CableSignal#getDataType()
	 * @see #getCableSignal()
	 * @generated
	 */
	EReference getCableSignal_DataType();

	/**
	 * Returns the meta object for class '{@link Essence.ComplexDataType <em>Complex Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Data Type</em>'.
	 * @see Essence.ComplexDataType
	 * @generated
	 */
	EClass getComplexDataType();

	/**
	 * Returns the meta object for the attribute '{@link Essence.ComplexDataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Essence.ComplexDataType#getName()
	 * @see #getComplexDataType()
	 * @generated
	 */
	EAttribute getComplexDataType_Name();

	/**
	 * Returns the meta object for class '{@link Essence.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see Essence.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.Component#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see Essence.Component#getInterface()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Interface();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.Component#getRegViewBlock <em>Reg View Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reg View Block</em>'.
	 * @see Essence.Component#getRegViewBlock()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_RegViewBlock();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Component#getTopSpinClkStyle <em>Top Spin Clk Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Spin Clk Style</em>'.
	 * @see Essence.Component#getTopSpinClkStyle()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_TopSpinClkStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.Component#getRegMemSet <em>Reg Mem Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reg Mem Set</em>'.
	 * @see Essence.Component#getRegMemSet()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_RegMemSet();

	/**
	 * Returns the meta object for class '{@link Essence.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see Essence.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for class '{@link Essence.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see Essence.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.Connection#getExtVLNV <em>Ext VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ext VLNV</em>'.
	 * @see Essence.Connection#getExtVLNV()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_ExtVLNV();

	/**
	 * Returns the meta object for class '{@link Essence.ConstDef <em>Const Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Const Def</em>'.
	 * @see Essence.ConstDef
	 * @generated
	 */
	EClass getConstDef();

	/**
	 * Returns the meta object for class '{@link Essence.ConstDefBlock <em>Const Def Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Const Def Block</em>'.
	 * @see Essence.ConstDefBlock
	 * @generated
	 */
	EClass getConstDefBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.ConstDefBlock#getConstDef <em>Const Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Const Def</em>'.
	 * @see Essence.ConstDefBlock#getConstDef()
	 * @see #getConstDefBlock()
	 * @generated
	 */
	EReference getConstDefBlock_ConstDef();

	/**
	 * Returns the meta object for class '{@link Essence.DataDecl <em>Data Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Decl</em>'.
	 * @see Essence.DataDecl
	 * @generated
	 */
	EClass getDataDecl();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.DataDecl#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see Essence.DataDecl#getDataType()
	 * @see #getDataDecl()
	 * @generated
	 */
	EReference getDataDecl_DataType();

	/**
	 * Returns the meta object for the attribute '{@link Essence.DataDecl#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see Essence.DataDecl#getDefaultValue()
	 * @see #getDataDecl()
	 * @generated
	 */
	EAttribute getDataDecl_DefaultValue();

	/**
	 * Returns the meta object for class '{@link Essence.DataDef <em>Data Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Def</em>'.
	 * @see Essence.DataDef
	 * @generated
	 */
	EClass getDataDef();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.DataDef#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see Essence.DataDef#getDataType()
	 * @see #getDataDef()
	 * @generated
	 */
	EReference getDataDef_DataType();

	/**
	 * Returns the meta object for the attribute '{@link Essence.DataDef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Essence.DataDef#getValue()
	 * @see #getDataDef()
	 * @generated
	 */
	EAttribute getDataDef_Value();

	/**
	 * Returns the meta object for class '{@link Essence.DataGenDecl <em>Data Gen Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Gen Decl</em>'.
	 * @see Essence.DataGenDecl
	 * @generated
	 */
	EClass getDataGenDecl();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.DataGenDecl#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see Essence.DataGenDecl#getDataType()
	 * @see #getDataGenDecl()
	 * @generated
	 */
	EReference getDataGenDecl_DataType();

	/**
	 * Returns the meta object for the attribute '{@link Essence.DataGenDecl#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see Essence.DataGenDecl#getDefaultValue()
	 * @see #getDataGenDecl()
	 * @generated
	 */
	EAttribute getDataGenDecl_DefaultValue();

	/**
	 * Returns the meta object for class '{@link Essence.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see Essence.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link Essence.DataTypeElement <em>Data Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Element</em>'.
	 * @see Essence.DataTypeElement
	 * @generated
	 */
	EClass getDataTypeElement();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.DataTypeElement#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see Essence.DataTypeElement#getDataType()
	 * @see #getDataTypeElement()
	 * @generated
	 */
	EReference getDataTypeElement_DataType();

	/**
	 * Returns the meta object for the attribute '{@link Essence.DataTypeElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Essence.DataTypeElement#getName()
	 * @see #getDataTypeElement()
	 * @generated
	 */
	EAttribute getDataTypeElement_Name();

	/**
	 * Returns the meta object for class '{@link Essence.DescriptionItem <em>Description Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Item</em>'.
	 * @see Essence.DescriptionItem
	 * @generated
	 */
	EClass getDescriptionItem();

	/**
	 * Returns the meta object for the attribute '{@link Essence.DescriptionItem#getHtml <em>Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html</em>'.
	 * @see Essence.DescriptionItem#getHtml()
	 * @see #getDescriptionItem()
	 * @generated
	 */
	EAttribute getDescriptionItem_Html();

	/**
	 * Returns the meta object for the attribute '{@link Essence.DescriptionItem#getDita <em>Dita</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dita</em>'.
	 * @see Essence.DescriptionItem#getDita()
	 * @see #getDescriptionItem()
	 * @generated
	 */
	EAttribute getDescriptionItem_Dita();

	/**
	 * Returns the meta object for class '{@link Essence.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see Essence.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link Essence.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Essence.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link Essence.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see Essence.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link Essence.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see Essence.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.DocumentRoot#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bus</em>'.
	 * @see Essence.DocumentRoot#getBus()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Bus();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.DocumentRoot#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component</em>'.
	 * @see Essence.DocumentRoot#getComponent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Component();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.DocumentRoot#getInterfaceDefinition <em>Interface Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface Definition</em>'.
	 * @see Essence.DocumentRoot#getInterfaceDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InterfaceDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.DocumentRoot#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package</em>'.
	 * @see Essence.DocumentRoot#getPackage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Package();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.DocumentRoot#getPadTypeDB <em>Pad Type DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pad Type DB</em>'.
	 * @see Essence.DocumentRoot#getPadTypeDB()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PadTypeDB();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.DocumentRoot#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Product</em>'.
	 * @see Essence.DocumentRoot#getProduct()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Product();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.DocumentRoot#getSilicon <em>Silicon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Silicon</em>'.
	 * @see Essence.DocumentRoot#getSilicon()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Silicon();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.DocumentRoot#getSiPortDB <em>Si Port DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Si Port DB</em>'.
	 * @see Essence.DocumentRoot#getSiPortDB()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SiPortDB();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.DocumentRoot#getSiSignalDB <em>Si Signal DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Si Signal DB</em>'.
	 * @see Essence.DocumentRoot#getSiSignalDB()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SiSignalDB();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.DocumentRoot#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see Essence.DocumentRoot#getSystem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_System();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.DocumentRoot#getTestDB <em>Test DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test DB</em>'.
	 * @see Essence.DocumentRoot#getTestDB()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TestDB();

	/**
	 * Returns the meta object for class '{@link Essence.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see Essence.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.Enum#getEnumElement <em>Enum Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Element</em>'.
	 * @see Essence.Enum#getEnumElement()
	 * @see #getEnum()
	 * @generated
	 */
	EReference getEnum_EnumElement();

	/**
	 * Returns the meta object for class '{@link Essence.EnumElement <em>Enum Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Element</em>'.
	 * @see Essence.EnumElement
	 * @generated
	 */
	EClass getEnumElement();

	/**
	 * Returns the meta object for the attribute '{@link Essence.EnumElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Essence.EnumElement#getName()
	 * @see #getEnumElement()
	 * @generated
	 */
	EAttribute getEnumElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link Essence.EnumElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Essence.EnumElement#getValue()
	 * @see #getEnumElement()
	 * @generated
	 */
	EAttribute getEnumElement_Value();

	/**
	 * Returns the meta object for class '{@link Essence.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see Essence.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Enumeration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Essence.Enumeration#getValue()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_Value();

	/**
	 * Returns the meta object for class '{@link Essence.EnumerationElement <em>Enumeration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Element</em>'.
	 * @see Essence.EnumerationElement
	 * @generated
	 */
	EClass getEnumerationElement();

	/**
	 * Returns the meta object for class '{@link Essence.EnumerationInteger <em>Enumeration Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Integer</em>'.
	 * @see Essence.EnumerationInteger
	 * @generated
	 */
	EClass getEnumerationInteger();

	/**
	 * Returns the meta object for the attribute '{@link Essence.EnumerationInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Essence.EnumerationInteger#getValue()
	 * @see #getEnumerationInteger()
	 * @generated
	 */
	EAttribute getEnumerationInteger_Value();

	/**
	 * Returns the meta object for class '{@link Essence.EnumerationSequence <em>Enumeration Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Sequence</em>'.
	 * @see Essence.EnumerationSequence
	 * @generated
	 */
	EClass getEnumerationSequence();

	/**
	 * Returns the meta object for the attribute '{@link Essence.EnumerationSequence#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see Essence.EnumerationSequence#getCount()
	 * @see #getEnumerationSequence()
	 * @generated
	 */
	EAttribute getEnumerationSequence_Count();

	/**
	 * Returns the meta object for the attribute '{@link Essence.EnumerationSequence#getMinIndex <em>Min Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Index</em>'.
	 * @see Essence.EnumerationSequence#getMinIndex()
	 * @see #getEnumerationSequence()
	 * @generated
	 */
	EAttribute getEnumerationSequence_MinIndex();

	/**
	 * Returns the meta object for the attribute '{@link Essence.EnumerationSequence#getIndexStep <em>Index Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Step</em>'.
	 * @see Essence.EnumerationSequence#getIndexStep()
	 * @see #getEnumerationSequence()
	 * @generated
	 */
	EAttribute getEnumerationSequence_IndexStep();

	/**
	 * Returns the meta object for the attribute '{@link Essence.EnumerationSequence#getIndexVar <em>Index Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Var</em>'.
	 * @see Essence.EnumerationSequence#getIndexVar()
	 * @see #getEnumerationSequence()
	 * @generated
	 */
	EAttribute getEnumerationSequence_IndexVar();

	/**
	 * Returns the meta object for the attribute '{@link Essence.EnumerationSequence#getAltFormat <em>Alt Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Format</em>'.
	 * @see Essence.EnumerationSequence#getAltFormat()
	 * @see #getEnumerationSequence()
	 * @generated
	 */
	EAttribute getEnumerationSequence_AltFormat();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.EnumerationSequence#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration</em>'.
	 * @see Essence.EnumerationSequence#getEnumeration()
	 * @see #getEnumerationSequence()
	 * @generated
	 */
	EReference getEnumerationSequence_Enumeration();

	/**
	 * Returns the meta object for class '{@link Essence.EnumerationString <em>Enumeration String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration String</em>'.
	 * @see Essence.EnumerationString
	 * @generated
	 */
	EClass getEnumerationString();

	/**
	 * Returns the meta object for the attribute '{@link Essence.EnumerationString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Essence.EnumerationString#getValue()
	 * @see #getEnumerationString()
	 * @generated
	 */
	EAttribute getEnumerationString_Value();

	/**
	 * Returns the meta object for class '{@link Essence.EssenceBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base</em>'.
	 * @see Essence.EssenceBase
	 * @generated
	 */
	EClass getEssenceBase();

	/**
	 * Returns the meta object for class '{@link Essence.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see Essence.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Function#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Essence.Function#getType()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Type();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Function#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module</em>'.
	 * @see Essence.Function#getModule()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Module();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.Function#getXRefSignal <em>XRef Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Signal</em>'.
	 * @see Essence.Function#getXRefSignal()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_XRefSignal();

	/**
	 * Returns the meta object for class '{@link Essence.GapElement <em>Gap Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gap Element</em>'.
	 * @see Essence.GapElement
	 * @generated
	 */
	EClass getGapElement();

	/**
	 * Returns the meta object for class '{@link Essence.GeneralInstance <em>General Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Instance</em>'.
	 * @see Essence.GeneralInstance
	 * @generated
	 */
	EClass getGeneralInstance();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.GeneralInstance#getExtVLNV <em>Ext VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ext VLNV</em>'.
	 * @see Essence.GeneralInstance#getExtVLNV()
	 * @see #getGeneralInstance()
	 * @generated
	 */
	EReference getGeneralInstance_ExtVLNV();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.GeneralInstance#getParamMap <em>Param Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param Map</em>'.
	 * @see Essence.GeneralInstance#getParamMap()
	 * @see #getGeneralInstance()
	 * @generated
	 */
	EReference getGeneralInstance_ParamMap();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.GeneralInstance#getGenericMap <em>Generic Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Map</em>'.
	 * @see Essence.GeneralInstance#getGenericMap()
	 * @see #getGeneralInstance()
	 * @generated
	 */
	EReference getGeneralInstance_GenericMap();

	/**
	 * Returns the meta object for class '{@link Essence.GeneralInterface <em>General Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Interface</em>'.
	 * @see Essence.GeneralInterface
	 * @generated
	 */
	EClass getGeneralInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.GeneralInterface#getInterfaceView <em>Interface View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface View</em>'.
	 * @see Essence.GeneralInterface#getInterfaceView()
	 * @see #getGeneralInterface()
	 * @generated
	 */
	EReference getGeneralInterface_InterfaceView();

	/**
	 * Returns the meta object for class '{@link Essence.GeneralPad <em>General Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Pad</em>'.
	 * @see Essence.GeneralPad
	 * @generated
	 */
	EClass getGeneralPad();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.GeneralPad#getXRefPadType <em>XRef Pad Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Pad Type</em>'.
	 * @see Essence.GeneralPad#getXRefPadType()
	 * @see #getGeneralPad()
	 * @generated
	 */
	EReference getGeneralPad_XRefPadType();

	/**
	 * Returns the meta object for the attribute '{@link Essence.GeneralPad#getLib <em>Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lib</em>'.
	 * @see Essence.GeneralPad#getLib()
	 * @see #getGeneralPad()
	 * @generated
	 */
	EAttribute getGeneralPad_Lib();

	/**
	 * Returns the meta object for the attribute '{@link Essence.GeneralPad#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see Essence.GeneralPad#getWidth()
	 * @see #getGeneralPad()
	 * @generated
	 */
	EAttribute getGeneralPad_Width();

	/**
	 * Returns the meta object for class '{@link Essence.GeneralPort <em>General Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Port</em>'.
	 * @see Essence.GeneralPort
	 * @generated
	 */
	EClass getGeneralPort();

	/**
	 * Returns the meta object for class '{@link Essence.GeneralRegister <em>General Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Register</em>'.
	 * @see Essence.GeneralRegister
	 * @generated
	 */
	EClass getGeneralRegister();

	/**
	 * Returns the meta object for the attribute '{@link Essence.GeneralRegister#isNoShadow <em>No Shadow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Shadow</em>'.
	 * @see Essence.GeneralRegister#isNoShadow()
	 * @see #getGeneralRegister()
	 * @generated
	 */
	EAttribute getGeneralRegister_NoShadow();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.GeneralRegister#getResetType <em>Reset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reset Type</em>'.
	 * @see Essence.GeneralRegister#getResetType()
	 * @see #getGeneralRegister()
	 * @generated
	 */
	EReference getGeneralRegister_ResetType();

	/**
	 * Returns the meta object for class '{@link Essence.GenericDecl <em>Generic Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Decl</em>'.
	 * @see Essence.GenericDecl
	 * @generated
	 */
	EClass getGenericDecl();

	/**
	 * Returns the meta object for class '{@link Essence.GenericDeclBlock <em>Generic Decl Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Decl Block</em>'.
	 * @see Essence.GenericDeclBlock
	 * @generated
	 */
	EClass getGenericDeclBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.GenericDeclBlock#getGenericDecl <em>Generic Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Decl</em>'.
	 * @see Essence.GenericDeclBlock#getGenericDecl()
	 * @see #getGenericDeclBlock()
	 * @generated
	 */
	EReference getGenericDeclBlock_GenericDecl();

	/**
	 * Returns the meta object for class '{@link Essence.GenericMap <em>Generic Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Map</em>'.
	 * @see Essence.GenericMap
	 * @generated
	 */
	EClass getGenericMap();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.GenericMap#getXRefGenericDecl <em>XRef Generic Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Generic Decl</em>'.
	 * @see Essence.GenericMap#getXRefGenericDecl()
	 * @see #getGenericMap()
	 * @generated
	 */
	EReference getGenericMap_XRefGenericDecl();

	/**
	 * Returns the meta object for the attribute '{@link Essence.GenericMap#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Essence.GenericMap#getValue()
	 * @see #getGenericMap()
	 * @generated
	 */
	EAttribute getGenericMap_Value();

	/**
	 * Returns the meta object for class '{@link Essence.IndexVarUser <em>Index Var User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Var User</em>'.
	 * @see Essence.IndexVarUser
	 * @generated
	 */
	EClass getIndexVarUser();

	/**
	 * Returns the meta object for class '{@link Essence.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see Essence.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for class '{@link Essence.InstanceInterfaceMap <em>Instance Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Interface Map</em>'.
	 * @see Essence.InstanceInterfaceMap
	 * @generated
	 */
	EClass getInstanceInterfaceMap();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.InstanceInterfaceMap#getXRefInstanceInterface <em>XRef Instance Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Instance Interface</em>'.
	 * @see Essence.InstanceInterfaceMap#getXRefInstanceInterface()
	 * @see #getInstanceInterfaceMap()
	 * @generated
	 */
	EReference getInstanceInterfaceMap_XRefInstanceInterface();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.InstanceInterfaceMap#getXRefConnection <em>XRef Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Connection</em>'.
	 * @see Essence.InstanceInterfaceMap#getXRefConnection()
	 * @see #getInstanceInterfaceMap()
	 * @generated
	 */
	EReference getInstanceInterfaceMap_XRefConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.InstanceInterfaceMap#getInstancePortMap <em>Instance Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Port Map</em>'.
	 * @see Essence.InstanceInterfaceMap#getInstancePortMap()
	 * @see #getInstanceInterfaceMap()
	 * @generated
	 */
	EReference getInstanceInterfaceMap_InstancePortMap();

	/**
	 * Returns the meta object for class '{@link Essence.InstancePortMap <em>Instance Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Port Map</em>'.
	 * @see Essence.InstancePortMap
	 * @generated
	 */
	EClass getInstancePortMap();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.InstancePortMap#getXRefInstancePort <em>XRef Instance Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Instance Port</em>'.
	 * @see Essence.InstancePortMap#getXRefInstancePort()
	 * @see #getInstancePortMap()
	 * @generated
	 */
	EReference getInstancePortMap_XRefInstancePort();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.InstancePortMap#getXRefSignal <em>XRef Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Signal</em>'.
	 * @see Essence.InstancePortMap#getXRefSignal()
	 * @see #getInstancePortMap()
	 * @generated
	 */
	EReference getInstancePortMap_XRefSignal();

	/**
	 * Returns the meta object for class '{@link Essence.InstanceShellInterfaceMap <em>Instance Shell Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Shell Interface Map</em>'.
	 * @see Essence.InstanceShellInterfaceMap
	 * @generated
	 */
	EClass getInstanceShellInterfaceMap();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.InstanceShellInterfaceMap#getXRefInstanceShellInterface <em>XRef Instance Shell Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Instance Shell Interface</em>'.
	 * @see Essence.InstanceShellInterfaceMap#getXRefInstanceShellInterface()
	 * @see #getInstanceShellInterfaceMap()
	 * @generated
	 */
	EReference getInstanceShellInterfaceMap_XRefInstanceShellInterface();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.InstanceShellInterfaceMap#getXRefConnection <em>XRef Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Connection</em>'.
	 * @see Essence.InstanceShellInterfaceMap#getXRefConnection()
	 * @see #getInstanceShellInterfaceMap()
	 * @generated
	 */
	EReference getInstanceShellInterfaceMap_XRefConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.InstanceShellInterfaceMap#getInstanceShellPortMap <em>Instance Shell Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Shell Port Map</em>'.
	 * @see Essence.InstanceShellInterfaceMap#getInstanceShellPortMap()
	 * @see #getInstanceShellInterfaceMap()
	 * @generated
	 */
	EReference getInstanceShellInterfaceMap_InstanceShellPortMap();

	/**
	 * Returns the meta object for class '{@link Essence.InstanceShellPortMap <em>Instance Shell Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Shell Port Map</em>'.
	 * @see Essence.InstanceShellPortMap
	 * @generated
	 */
	EClass getInstanceShellPortMap();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.InstanceShellPortMap#getXRefInstanceShellPort <em>XRef Instance Shell Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Instance Shell Port</em>'.
	 * @see Essence.InstanceShellPortMap#getXRefInstanceShellPort()
	 * @see #getInstanceShellPortMap()
	 * @generated
	 */
	EReference getInstanceShellPortMap_XRefInstanceShellPort();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.InstanceShellPortMap#getXRefSignal <em>XRef Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Signal</em>'.
	 * @see Essence.InstanceShellPortMap#getXRefSignal()
	 * @see #getInstanceShellPortMap()
	 * @generated
	 */
	EReference getInstanceShellPortMap_XRefSignal();

	/**
	 * Returns the meta object for class '{@link Essence.IntegerDecl <em>Integer Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Decl</em>'.
	 * @see Essence.IntegerDecl
	 * @generated
	 */
	EClass getIntegerDecl();

	/**
	 * Returns the meta object for the attribute '{@link Essence.IntegerDecl#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see Essence.IntegerDecl#getDefaultValue()
	 * @see #getIntegerDecl()
	 * @generated
	 */
	EAttribute getIntegerDecl_DefaultValue();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.IntegerDecl#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration</em>'.
	 * @see Essence.IntegerDecl#getEnumeration()
	 * @see #getIntegerDecl()
	 * @generated
	 */
	EReference getIntegerDecl_Enumeration();

	/**
	 * Returns the meta object for class '{@link Essence.IntegerDef <em>Integer Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Def</em>'.
	 * @see Essence.IntegerDef
	 * @generated
	 */
	EClass getIntegerDef();

	/**
	 * Returns the meta object for the attribute '{@link Essence.IntegerDef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Essence.IntegerDef#getValue()
	 * @see #getIntegerDef()
	 * @generated
	 */
	EAttribute getIntegerDef_Value();

	/**
	 * Returns the meta object for class '{@link Essence.IntegerGenDecl <em>Integer Gen Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Gen Decl</em>'.
	 * @see Essence.IntegerGenDecl
	 * @generated
	 */
	EClass getIntegerGenDecl();

	/**
	 * Returns the meta object for the attribute '{@link Essence.IntegerGenDecl#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see Essence.IntegerGenDecl#getDefaultValue()
	 * @see #getIntegerGenDecl()
	 * @generated
	 */
	EAttribute getIntegerGenDecl_DefaultValue();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.IntegerGenDecl#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration</em>'.
	 * @see Essence.IntegerGenDecl#getEnumeration()
	 * @see #getIntegerGenDecl()
	 * @generated
	 */
	EReference getIntegerGenDecl_Enumeration();

	/**
	 * Returns the meta object for class '{@link Essence.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see Essence.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Interface#getAddressUnit <em>Address Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Unit</em>'.
	 * @see Essence.Interface#getAddressUnit()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_AddressUnit();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Interface#getDataUnit <em>Data Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Unit</em>'.
	 * @see Essence.Interface#getDataUnit()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_DataUnit();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Interface#getBaseAddress <em>Base Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Address</em>'.
	 * @see Essence.Interface#getBaseAddress()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_BaseAddress();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.Interface#getExtVLNV <em>Ext VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ext VLNV</em>'.
	 * @see Essence.Interface#getExtVLNV()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_ExtVLNV();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Interface#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see Essence.Interface#getRange()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Range();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Interface#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see Essence.Interface#getRole()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Role();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Interface#getSystemGroup <em>System Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Group</em>'.
	 * @see Essence.Interface#getSystemGroup()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_SystemGroup();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.Interface#getAddressBlock <em>Address Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Block</em>'.
	 * @see Essence.Interface#getAddressBlock()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_AddressBlock();

	/**
	 * Returns the meta object for class '{@link Essence.InterfaceDefCablePort <em>Interface Def Cable Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Def Cable Port</em>'.
	 * @see Essence.InterfaceDefCablePort
	 * @generated
	 */
	EClass getInterfaceDefCablePort();

	/**
	 * Returns the meta object for class '{@link Essence.InterfaceDefinition <em>Interface Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Definition</em>'.
	 * @see Essence.InterfaceDefinition
	 * @generated
	 */
	EClass getInterfaceDefinition();

	/**
	 * Returns the meta object for the attribute '{@link Essence.InterfaceDefinition#getAddressUnit <em>Address Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Unit</em>'.
	 * @see Essence.InterfaceDefinition#getAddressUnit()
	 * @see #getInterfaceDefinition()
	 * @generated
	 */
	EAttribute getInterfaceDefinition_AddressUnit();

	/**
	 * Returns the meta object for the attribute '{@link Essence.InterfaceDefinition#getDataUnit <em>Data Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Unit</em>'.
	 * @see Essence.InterfaceDefinition#getDataUnit()
	 * @see #getInterfaceDefinition()
	 * @generated
	 */
	EAttribute getInterfaceDefinition_DataUnit();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.InterfaceDefinition#getExtVLNV <em>Ext VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ext VLNV</em>'.
	 * @see Essence.InterfaceDefinition#getExtVLNV()
	 * @see #getInterfaceDefinition()
	 * @generated
	 */
	EReference getInterfaceDefinition_ExtVLNV();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.InterfaceDefinition#getInterfaceDefView <em>Interface Def View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Def View</em>'.
	 * @see Essence.InterfaceDefinition#getInterfaceDefView()
	 * @see #getInterfaceDefinition()
	 * @generated
	 */
	EReference getInterfaceDefinition_InterfaceDefView();

	/**
	 * Returns the meta object for class '{@link Essence.InterfaceDefPort <em>Interface Def Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Def Port</em>'.
	 * @see Essence.InterfaceDefPort
	 * @generated
	 */
	EClass getInterfaceDefPort();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.InterfaceDefPort#getXRefSignal <em>XRef Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Signal</em>'.
	 * @see Essence.InterfaceDefPort#getXRefSignal()
	 * @see #getInterfaceDefPort()
	 * @generated
	 */
	EReference getInterfaceDefPort_XRefSignal();

	/**
	 * Returns the meta object for the attribute '{@link Essence.InterfaceDefPort#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see Essence.InterfaceDefPort#getDirection()
	 * @see #getInterfaceDefPort()
	 * @generated
	 */
	EAttribute getInterfaceDefPort_Direction();

	/**
	 * Returns the meta object for class '{@link Essence.InterfaceDefRole <em>Interface Def Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Def Role</em>'.
	 * @see Essence.InterfaceDefRole
	 * @generated
	 */
	EClass getInterfaceDefRole();

	/**
	 * Returns the meta object for the attribute '{@link Essence.InterfaceDefRole#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see Essence.InterfaceDefRole#getRole()
	 * @see #getInterfaceDefRole()
	 * @generated
	 */
	EAttribute getInterfaceDefRole_Role();

	/**
	 * Returns the meta object for the attribute '{@link Essence.InterfaceDefRole#getSystemGroup <em>System Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Group</em>'.
	 * @see Essence.InterfaceDefRole#getSystemGroup()
	 * @see #getInterfaceDefRole()
	 * @generated
	 */
	EAttribute getInterfaceDefRole_SystemGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.InterfaceDefRole#getInterfaceDefPort <em>Interface Def Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Def Port</em>'.
	 * @see Essence.InterfaceDefRole#getInterfaceDefPort()
	 * @see #getInterfaceDefRole()
	 * @generated
	 */
	EReference getInterfaceDefRole_InterfaceDefPort();

	/**
	 * Returns the meta object for class '{@link Essence.InterfaceDefTransactionalPort <em>Interface Def Transactional Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Def Transactional Port</em>'.
	 * @see Essence.InterfaceDefTransactionalPort
	 * @generated
	 */
	EClass getInterfaceDefTransactionalPort();

	/**
	 * Returns the meta object for the attribute '{@link Essence.InterfaceDefTransactionalPort#getInitiative <em>Initiative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiative</em>'.
	 * @see Essence.InterfaceDefTransactionalPort#getInitiative()
	 * @see #getInterfaceDefTransactionalPort()
	 * @generated
	 */
	EAttribute getInterfaceDefTransactionalPort_Initiative();

	/**
	 * Returns the meta object for class '{@link Essence.InterfaceDefView <em>Interface Def View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Def View</em>'.
	 * @see Essence.InterfaceDefView
	 * @generated
	 */
	EClass getInterfaceDefView();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.InterfaceDefView#getInterfaceDefRole <em>Interface Def Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Def Role</em>'.
	 * @see Essence.InterfaceDefView#getInterfaceDefRole()
	 * @see #getInterfaceDefView()
	 * @generated
	 */
	EReference getInterfaceDefView_InterfaceDefRole();

	/**
	 * Returns the meta object for class '{@link Essence.InterfaceDefWirePort <em>Interface Def Wire Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Def Wire Port</em>'.
	 * @see Essence.InterfaceDefWirePort
	 * @generated
	 */
	EClass getInterfaceDefWirePort();

	/**
	 * Returns the meta object for class '{@link Essence.InterfaceInstance <em>Interface Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Instance</em>'.
	 * @see Essence.InterfaceInstance
	 * @generated
	 */
	EClass getInterfaceInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.InterfaceInstance#getInstanceInterfaceMap <em>Instance Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Interface Map</em>'.
	 * @see Essence.InterfaceInstance#getInstanceInterfaceMap()
	 * @see #getInterfaceInstance()
	 * @generated
	 */
	EReference getInterfaceInstance_InstanceInterfaceMap();

	/**
	 * Returns the meta object for class '{@link Essence.InterfacePortMap <em>Interface Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Port Map</em>'.
	 * @see Essence.InterfacePortMap
	 * @generated
	 */
	EClass getInterfacePortMap();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.InterfacePortMap#getXRefLocalPort <em>XRef Local Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Local Port</em>'.
	 * @see Essence.InterfacePortMap#getXRefLocalPort()
	 * @see #getInterfacePortMap()
	 * @generated
	 */
	EReference getInterfacePortMap_XRefLocalPort();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.InterfacePortMap#getXRefInterfacePort <em>XRef Interface Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Interface Port</em>'.
	 * @see Essence.InterfacePortMap#getXRefInterfacePort()
	 * @see #getInterfacePortMap()
	 * @generated
	 */
	EReference getInterfacePortMap_XRefInterfacePort();

	/**
	 * Returns the meta object for class '{@link Essence.InterfaceView <em>Interface View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface View</em>'.
	 * @see Essence.InterfaceView
	 * @generated
	 */
	EClass getInterfaceView();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.InterfaceView#getInterfacePortMap <em>Interface Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Port Map</em>'.
	 * @see Essence.InterfaceView#getInterfacePortMap()
	 * @see #getInterfaceView()
	 * @generated
	 */
	EReference getInterfaceView_InterfacePortMap();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.InterfaceView#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see Essence.InterfaceView#getPort()
	 * @see #getInterfaceView()
	 * @generated
	 */
	EReference getInterfaceView_Port();

	/**
	 * Returns the meta object for class '{@link Essence.LocalInterfaceMap <em>Local Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Interface Map</em>'.
	 * @see Essence.LocalInterfaceMap
	 * @generated
	 */
	EClass getLocalInterfaceMap();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.LocalInterfaceMap#getXRefLocalInterface <em>XRef Local Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Local Interface</em>'.
	 * @see Essence.LocalInterfaceMap#getXRefLocalInterface()
	 * @see #getLocalInterfaceMap()
	 * @generated
	 */
	EReference getLocalInterfaceMap_XRefLocalInterface();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.LocalInterfaceMap#getXRefConnection <em>XRef Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Connection</em>'.
	 * @see Essence.LocalInterfaceMap#getXRefConnection()
	 * @see #getLocalInterfaceMap()
	 * @generated
	 */
	EReference getLocalInterfaceMap_XRefConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.LocalInterfaceMap#getLocalPortMap <em>Local Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Port Map</em>'.
	 * @see Essence.LocalInterfaceMap#getLocalPortMap()
	 * @see #getLocalInterfaceMap()
	 * @generated
	 */
	EReference getLocalInterfaceMap_LocalPortMap();

	/**
	 * Returns the meta object for class '{@link Essence.LocalPortMap <em>Local Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Port Map</em>'.
	 * @see Essence.LocalPortMap
	 * @generated
	 */
	EClass getLocalPortMap();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.LocalPortMap#getXRefLocalPort <em>XRef Local Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Local Port</em>'.
	 * @see Essence.LocalPortMap#getXRefLocalPort()
	 * @see #getLocalPortMap()
	 * @generated
	 */
	EReference getLocalPortMap_XRefLocalPort();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.LocalPortMap#getXRefSignal <em>XRef Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Signal</em>'.
	 * @see Essence.LocalPortMap#getXRefSignal()
	 * @see #getLocalPortMap()
	 * @generated
	 */
	EReference getLocalPortMap_XRefSignal();

	/**
	 * Returns the meta object for class '{@link Essence.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory</em>'.
	 * @see Essence.Memory
	 * @generated
	 */
	EClass getMemory();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Memory#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Type</em>'.
	 * @see Essence.Memory#getAccessType()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_AccessType();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Memory#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see Essence.Memory#getSize()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_Size();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Memory#getEndianness <em>Endianness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endianness</em>'.
	 * @see Essence.Memory#getEndianness()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_Endianness();

	/**
	 * Returns the meta object for class '{@link Essence.MethodDataType <em>Method Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Data Type</em>'.
	 * @see Essence.MethodDataType
	 * @generated
	 */
	EClass getMethodDataType();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.MethodDataType#getReturnDataType <em>Return Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Data Type</em>'.
	 * @see Essence.MethodDataType#getReturnDataType()
	 * @see #getMethodDataType()
	 * @generated
	 */
	EReference getMethodDataType_ReturnDataType();

	/**
	 * Returns the meta object for the attribute '{@link Essence.MethodDataType#isReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see Essence.MethodDataType#isReference()
	 * @see #getMethodDataType()
	 * @generated
	 */
	EAttribute getMethodDataType_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.MethodDataType#getMethodDataTypeElement <em>Method Data Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method Data Type Element</em>'.
	 * @see Essence.MethodDataType#getMethodDataTypeElement()
	 * @see #getMethodDataType()
	 * @generated
	 */
	EReference getMethodDataType_MethodDataTypeElement();

	/**
	 * Returns the meta object for class '{@link Essence.MethodDataTypeElement <em>Method Data Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Data Type Element</em>'.
	 * @see Essence.MethodDataTypeElement
	 * @generated
	 */
	EClass getMethodDataTypeElement();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.MethodDataTypeElement#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see Essence.MethodDataTypeElement#getDataType()
	 * @see #getMethodDataTypeElement()
	 * @generated
	 */
	EReference getMethodDataTypeElement_DataType();

	/**
	 * Returns the meta object for the attribute '{@link Essence.MethodDataTypeElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Essence.MethodDataTypeElement#getName()
	 * @see #getMethodDataTypeElement()
	 * @generated
	 */
	EAttribute getMethodDataTypeElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link Essence.MethodDataTypeElement#isReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see Essence.MethodDataTypeElement#isReference()
	 * @see #getMethodDataTypeElement()
	 * @generated
	 */
	EAttribute getMethodDataTypeElement_Reference();

	/**
	 * Returns the meta object for class '{@link Essence.ModelRoot <em>Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Root</em>'.
	 * @see Essence.ModelRoot
	 * @generated
	 */
	EClass getModelRoot();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.ModelRoot#getConstDefBlock <em>Const Def Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Const Def Block</em>'.
	 * @see Essence.ModelRoot#getConstDefBlock()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_ConstDefBlock();

	/**
	 * Returns the meta object for the attribute '{@link Essence.ModelRoot#getEssenceVersion <em>Essence Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Essence Version</em>'.
	 * @see Essence.ModelRoot#getEssenceVersion()
	 * @see #getModelRoot()
	 * @generated
	 */
	EAttribute getModelRoot_EssenceVersion();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.ModelRoot#getGenericDeclBlock <em>Generic Decl Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Decl Block</em>'.
	 * @see Essence.ModelRoot#getGenericDeclBlock()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_GenericDeclBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.ModelRoot#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module</em>'.
	 * @see Essence.ModelRoot#getModule()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_Module();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.ModelRoot#getParamDeclBlock <em>Param Decl Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param Decl Block</em>'.
	 * @see Essence.ModelRoot#getParamDeclBlock()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_ParamDeclBlock();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.ModelRoot#getVLNV <em>VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VLNV</em>'.
	 * @see Essence.ModelRoot#getVLNV()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_VLNV();

	/**
	 * Returns the meta object for class '{@link Essence.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see Essence.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.Module#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module</em>'.
	 * @see Essence.Module#getModule()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Module();

	/**
	 * Returns the meta object for class '{@link Essence.MultiPad <em>Multi Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Pad</em>'.
	 * @see Essence.MultiPad
	 * @generated
	 */
	EClass getMultiPad();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.MultiPad#getSinglePad <em>Single Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Single Pad</em>'.
	 * @see Essence.MultiPad#getSinglePad()
	 * @see #getMultiPad()
	 * @generated
	 */
	EReference getMultiPad_SinglePad();

	/**
	 * Returns the meta object for class '{@link Essence.MultiViewRegister <em>Multi View Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi View Register</em>'.
	 * @see Essence.MultiViewRegister
	 * @generated
	 */
	EClass getMultiViewRegister();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.MultiViewRegister#getXRefRegisterView <em>XRef Register View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>XRef Register View</em>'.
	 * @see Essence.MultiViewRegister#getXRefRegisterView()
	 * @see #getMultiViewRegister()
	 * @generated
	 */
	EReference getMultiViewRegister_XRefRegisterView();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.MultiViewRegister#getRegisterView <em>Register View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Register View</em>'.
	 * @see Essence.MultiViewRegister#getRegisterView()
	 * @see #getMultiViewRegister()
	 * @generated
	 */
	EReference getMultiViewRegister_RegisterView();

	/**
	 * Returns the meta object for class '{@link Essence.Net <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Net</em>'.
	 * @see Essence.Net
	 * @generated
	 */
	EClass getNet();

	/**
	 * Returns the meta object for class '{@link Essence.NoneInterface <em>None Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>None Interface</em>'.
	 * @see Essence.NoneInterface
	 * @generated
	 */
	EClass getNoneInterface();

	/**
	 * Returns the meta object for class '{@link Essence.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see Essence.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Package#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Essence.Package#getType()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.Package#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pin</em>'.
	 * @see Essence.Package#getPin()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Pin();

	/**
	 * Returns the meta object for class '{@link Essence.PackageInstance <em>Package Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Instance</em>'.
	 * @see Essence.PackageInstance
	 * @generated
	 */
	EClass getPackageInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.PackageInstance#getPinNetMap <em>Pin Net Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pin Net Map</em>'.
	 * @see Essence.PackageInstance#getPinNetMap()
	 * @see #getPackageInstance()
	 * @generated
	 */
	EReference getPackageInstance_PinNetMap();

	/**
	 * Returns the meta object for class '{@link Essence.Pad <em>Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pad</em>'.
	 * @see Essence.Pad
	 * @generated
	 */
	EClass getPad();

	/**
	 * Returns the meta object for class '{@link Essence.PadMultiplexed <em>Pad Multiplexed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pad Multiplexed</em>'.
	 * @see Essence.PadMultiplexed
	 * @generated
	 */
	EClass getPadMultiplexed();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.PadMultiplexed#getExtVLNV <em>Ext VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ext VLNV</em>'.
	 * @see Essence.PadMultiplexed#getExtVLNV()
	 * @see #getPadMultiplexed()
	 * @generated
	 */
	EReference getPadMultiplexed_ExtVLNV();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.PadMultiplexed#getXRefPort <em>XRef Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Port</em>'.
	 * @see Essence.PadMultiplexed#getXRefPort()
	 * @see #getPadMultiplexed()
	 * @generated
	 */
	EReference getPadMultiplexed_XRefPort();

	/**
	 * Returns the meta object for the attribute '{@link Essence.PadMultiplexed#getPortGroup <em>Port Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Group</em>'.
	 * @see Essence.PadMultiplexed#getPortGroup()
	 * @see #getPadMultiplexed()
	 * @generated
	 */
	EAttribute getPadMultiplexed_PortGroup();

	/**
	 * Returns the meta object for class '{@link Essence.PadNetMap <em>Pad Net Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pad Net Map</em>'.
	 * @see Essence.PadNetMap
	 * @generated
	 */
	EClass getPadNetMap();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.PadNetMap#getXRefPad <em>XRef Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Pad</em>'.
	 * @see Essence.PadNetMap#getXRefPad()
	 * @see #getPadNetMap()
	 * @generated
	 */
	EReference getPadNetMap_XRefPad();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.PadNetMap#getXRefNet <em>XRef Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Net</em>'.
	 * @see Essence.PadNetMap#getXRefNet()
	 * @see #getPadNetMap()
	 * @generated
	 */
	EReference getPadNetMap_XRefNet();

	/**
	 * Returns the meta object for class '{@link Essence.PadNonMultiplexed <em>Pad Non Multiplexed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pad Non Multiplexed</em>'.
	 * @see Essence.PadNonMultiplexed
	 * @generated
	 */
	EClass getPadNonMultiplexed();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.PadNonMultiplexed#getExtVLNV <em>Ext VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ext VLNV</em>'.
	 * @see Essence.PadNonMultiplexed#getExtVLNV()
	 * @see #getPadNonMultiplexed()
	 * @generated
	 */
	EReference getPadNonMultiplexed_ExtVLNV();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.PadNonMultiplexed#getSiPortReq <em>Si Port Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Si Port Req</em>'.
	 * @see Essence.PadNonMultiplexed#getSiPortReq()
	 * @see #getPadNonMultiplexed()
	 * @generated
	 */
	EReference getPadNonMultiplexed_SiPortReq();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.PadNonMultiplexed#getXRefPadType <em>XRef Pad Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Pad Type</em>'.
	 * @see Essence.PadNonMultiplexed#getXRefPadType()
	 * @see #getPadNonMultiplexed()
	 * @generated
	 */
	EReference getPadNonMultiplexed_XRefPadType();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.PadNonMultiplexed#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see Essence.PadNonMultiplexed#getFunction()
	 * @see #getPadNonMultiplexed()
	 * @generated
	 */
	EReference getPadNonMultiplexed_Function();

	/**
	 * Returns the meta object for class '{@link Essence.PadSpecial <em>Pad Special</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pad Special</em>'.
	 * @see Essence.PadSpecial
	 * @generated
	 */
	EClass getPadSpecial();

	/**
	 * Returns the meta object for class '{@link Essence.PadSupply <em>Pad Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pad Supply</em>'.
	 * @see Essence.PadSupply
	 * @generated
	 */
	EClass getPadSupply();

	/**
	 * Returns the meta object for the attribute '{@link Essence.PadSupply#getSpec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spec</em>'.
	 * @see Essence.PadSupply#getSpec()
	 * @see #getPadSupply()
	 * @generated
	 */
	EAttribute getPadSupply_Spec();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.PadSupply#getXRefPowerDomain <em>XRef Power Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Power Domain</em>'.
	 * @see Essence.PadSupply#getXRefPowerDomain()
	 * @see #getPadSupply()
	 * @generated
	 */
	EReference getPadSupply_XRefPowerDomain();

	/**
	 * Returns the meta object for class '{@link Essence.PadType <em>Pad Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pad Type</em>'.
	 * @see Essence.PadType
	 * @generated
	 */
	EClass getPadType();

	/**
	 * Returns the meta object for the attribute '{@link Essence.PadType#getLib <em>Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lib</em>'.
	 * @see Essence.PadType#getLib()
	 * @see #getPadType()
	 * @generated
	 */
	EAttribute getPadType_Lib();

	/**
	 * Returns the meta object for the attribute '{@link Essence.PadType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Essence.PadType#getType()
	 * @see #getPadType()
	 * @generated
	 */
	EAttribute getPadType_Type();

	/**
	 * Returns the meta object for the attribute '{@link Essence.PadType#getDriverStrength <em>Driver Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Strength</em>'.
	 * @see Essence.PadType#getDriverStrength()
	 * @see #getPadType()
	 * @generated
	 */
	EAttribute getPadType_DriverStrength();

	/**
	 * Returns the meta object for the attribute '{@link Essence.PadType#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set</em>'.
	 * @see Essence.PadType#getSet()
	 * @see #getPadType()
	 * @generated
	 */
	EAttribute getPadType_Set();

	/**
	 * Returns the meta object for the attribute '{@link Essence.PadType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see Essence.PadType#getWidth()
	 * @see #getPadType()
	 * @generated
	 */
	EAttribute getPadType_Width();

	/**
	 * Returns the meta object for the attribute '{@link Essence.PadType#getSpec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spec</em>'.
	 * @see Essence.PadType#getSpec()
	 * @see #getPadType()
	 * @generated
	 */
	EAttribute getPadType_Spec();

	/**
	 * Returns the meta object for class '{@link Essence.PadTypeDB <em>Pad Type DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pad Type DB</em>'.
	 * @see Essence.PadTypeDB
	 * @generated
	 */
	EClass getPadTypeDB();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.PadTypeDB#getPadType <em>Pad Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pad Type</em>'.
	 * @see Essence.PadTypeDB#getPadType()
	 * @see #getPadTypeDB()
	 * @generated
	 */
	EReference getPadTypeDB_PadType();

	/**
	 * Returns the meta object for class '{@link Essence.ParamDecl <em>Param Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Decl</em>'.
	 * @see Essence.ParamDecl
	 * @generated
	 */
	EClass getParamDecl();

	/**
	 * Returns the meta object for class '{@link Essence.ParamDeclBlock <em>Param Decl Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Decl Block</em>'.
	 * @see Essence.ParamDeclBlock
	 * @generated
	 */
	EClass getParamDeclBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.ParamDeclBlock#getParamDecl <em>Param Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param Decl</em>'.
	 * @see Essence.ParamDeclBlock#getParamDecl()
	 * @see #getParamDeclBlock()
	 * @generated
	 */
	EReference getParamDeclBlock_ParamDecl();

	/**
	 * Returns the meta object for class '{@link Essence.ParamMap <em>Param Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Map</em>'.
	 * @see Essence.ParamMap
	 * @generated
	 */
	EClass getParamMap();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.ParamMap#getXRefParamDecl <em>XRef Param Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Param Decl</em>'.
	 * @see Essence.ParamMap#getXRefParamDecl()
	 * @see #getParamMap()
	 * @generated
	 */
	EReference getParamMap_XRefParamDecl();

	/**
	 * Returns the meta object for the attribute '{@link Essence.ParamMap#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Essence.ParamMap#getValue()
	 * @see #getParamMap()
	 * @generated
	 */
	EAttribute getParamMap_Value();

	/**
	 * Returns the meta object for class '{@link Essence.PathRef <em>Path Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Ref</em>'.
	 * @see Essence.PathRef
	 * @generated
	 */
	EClass getPathRef();

	/**
	 * Returns the meta object for the attribute '{@link Essence.PathRef#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see Essence.PathRef#getLocation()
	 * @see #getPathRef()
	 * @generated
	 */
	EAttribute getPathRef_Location();

	/**
	 * Returns the meta object for the attribute '{@link Essence.PathRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Essence.PathRef#getName()
	 * @see #getPathRef()
	 * @generated
	 */
	EAttribute getPathRef_Name();

	/**
	 * Returns the meta object for class '{@link Essence.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see Essence.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for class '{@link Essence.PinNetMap <em>Pin Net Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin Net Map</em>'.
	 * @see Essence.PinNetMap
	 * @generated
	 */
	EClass getPinNetMap();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.PinNetMap#getXRefPin <em>XRef Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Pin</em>'.
	 * @see Essence.PinNetMap#getXRefPin()
	 * @see #getPinNetMap()
	 * @generated
	 */
	EReference getPinNetMap_XRefPin();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.PinNetMap#getXRefNet <em>XRef Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Net</em>'.
	 * @see Essence.PinNetMap#getXRefNet()
	 * @see #getPinNetMap()
	 * @generated
	 */
	EReference getPinNetMap_XRefNet();

	/**
	 * Returns the meta object for class '{@link Essence.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see Essence.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for class '{@link Essence.PortRef <em>Port Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Ref</em>'.
	 * @see Essence.PortRef
	 * @generated
	 */
	EClass getPortRef();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.PortRef#getXRefLocalPort <em>XRef Local Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Local Port</em>'.
	 * @see Essence.PortRef#getXRefLocalPort()
	 * @see #getPortRef()
	 * @generated
	 */
	EReference getPortRef_XRefLocalPort();

	/**
	 * Returns the meta object for class '{@link Essence.PowerDomain <em>Power Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Domain</em>'.
	 * @see Essence.PowerDomain
	 * @generated
	 */
	EClass getPowerDomain();

	/**
	 * Returns the meta object for the attribute '{@link Essence.PowerDomain#getPowerConsumption <em>Power Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Consumption</em>'.
	 * @see Essence.PowerDomain#getPowerConsumption()
	 * @see #getPowerDomain()
	 * @generated
	 */
	EAttribute getPowerDomain_PowerConsumption();

	/**
	 * Returns the meta object for the attribute '{@link Essence.PowerDomain#getMaxCurrent <em>Max Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Current</em>'.
	 * @see Essence.PowerDomain#getMaxCurrent()
	 * @see #getPowerDomain()
	 * @generated
	 */
	EAttribute getPowerDomain_MaxCurrent();

	/**
	 * Returns the meta object for the attribute '{@link Essence.PowerDomain#getAverageCurrent <em>Average Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Current</em>'.
	 * @see Essence.PowerDomain#getAverageCurrent()
	 * @see #getPowerDomain()
	 * @generated
	 */
	EAttribute getPowerDomain_AverageCurrent();

	/**
	 * Returns the meta object for class '{@link Essence.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see Essence.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Product#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see Essence.Product#getStep()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Step();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.Product#getPackageInstance <em>Package Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package Instance</em>'.
	 * @see Essence.Product#getPackageInstance()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_PackageInstance();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.Product#getSiliconInstance <em>Silicon Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Silicon Instance</em>'.
	 * @see Essence.Product#getSiliconInstance()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_SiliconInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.Product#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Net</em>'.
	 * @see Essence.Product#getNet()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Net();

	/**
	 * Returns the meta object for class '{@link Essence.ProductInstance <em>Product Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Instance</em>'.
	 * @see Essence.ProductInstance
	 * @generated
	 */
	EClass getProductInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.ProductInstance#getProductInterfaceMap <em>Product Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product Interface Map</em>'.
	 * @see Essence.ProductInstance#getProductInterfaceMap()
	 * @see #getProductInstance()
	 * @generated
	 */
	EReference getProductInstance_ProductInterfaceMap();

	/**
	 * Returns the meta object for class '{@link Essence.ProductInterfaceMap <em>Product Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Interface Map</em>'.
	 * @see Essence.ProductInterfaceMap
	 * @generated
	 */
	EClass getProductInterfaceMap();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.ProductInterfaceMap#getXRefConnection <em>XRef Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Connection</em>'.
	 * @see Essence.ProductInterfaceMap#getXRefConnection()
	 * @see #getProductInterfaceMap()
	 * @generated
	 */
	EReference getProductInterfaceMap_XRefConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.ProductInterfaceMap#getProductPinMap <em>Product Pin Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product Pin Map</em>'.
	 * @see Essence.ProductInterfaceMap#getProductPinMap()
	 * @see #getProductInterfaceMap()
	 * @generated
	 */
	EReference getProductInterfaceMap_ProductPinMap();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.ProductInterfaceMap#getProductPadMap <em>Product Pad Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product Pad Map</em>'.
	 * @see Essence.ProductInterfaceMap#getProductPadMap()
	 * @see #getProductInterfaceMap()
	 * @generated
	 */
	EReference getProductInterfaceMap_ProductPadMap();

	/**
	 * Returns the meta object for class '{@link Essence.ProductPadMap <em>Product Pad Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Pad Map</em>'.
	 * @see Essence.ProductPadMap
	 * @generated
	 */
	EClass getProductPadMap();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.ProductPadMap#getXRefPad <em>XRef Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Pad</em>'.
	 * @see Essence.ProductPadMap#getXRefPad()
	 * @see #getProductPadMap()
	 * @generated
	 */
	EReference getProductPadMap_XRefPad();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.ProductPadMap#getXRefSignal <em>XRef Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Signal</em>'.
	 * @see Essence.ProductPadMap#getXRefSignal()
	 * @see #getProductPadMap()
	 * @generated
	 */
	EReference getProductPadMap_XRefSignal();

	/**
	 * Returns the meta object for class '{@link Essence.ProductPinMap <em>Product Pin Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Pin Map</em>'.
	 * @see Essence.ProductPinMap
	 * @generated
	 */
	EClass getProductPinMap();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.ProductPinMap#getXRefPin <em>XRef Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Pin</em>'.
	 * @see Essence.ProductPinMap#getXRefPin()
	 * @see #getProductPinMap()
	 * @generated
	 */
	EReference getProductPinMap_XRefPin();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.ProductPinMap#getXRefSignal <em>XRef Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Signal</em>'.
	 * @see Essence.ProductPinMap#getXRefSignal()
	 * @see #getProductPinMap()
	 * @generated
	 */
	EReference getProductPinMap_XRefSignal();

	/**
	 * Returns the meta object for class '{@link Essence.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see Essence.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Property#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see Essence.Property#getKey()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.Property#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see Essence.Property#getProperty()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Property();

	/**
	 * Returns the meta object for the attribute list '{@link Essence.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see Essence.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link Essence.RealPort <em>Real Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Port</em>'.
	 * @see Essence.RealPort
	 * @generated
	 */
	EClass getRealPort();

	/**
	 * Returns the meta object for the attribute '{@link Essence.RealPort#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see Essence.RealPort#getDirection()
	 * @see #getRealPort()
	 * @generated
	 */
	EAttribute getRealPort_Direction();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.RealPort#getXRefDefaultValue <em>XRef Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Default Value</em>'.
	 * @see Essence.RealPort#getXRefDefaultValue()
	 * @see #getRealPort()
	 * @generated
	 */
	EReference getRealPort_XRefDefaultValue();

	/**
	 * Returns the meta object for class '{@link Essence.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record</em>'.
	 * @see Essence.Record
	 * @generated
	 */
	EClass getRecord();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.Record#getDataTypeElement <em>Data Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Type Element</em>'.
	 * @see Essence.Record#getDataTypeElement()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_DataTypeElement();

	/**
	 * Returns the meta object for class '{@link Essence.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see Essence.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for class '{@link Essence.Register <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register</em>'.
	 * @see Essence.Register
	 * @generated
	 */
	EClass getRegister();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Register#getMirrorSize <em>Mirror Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mirror Size</em>'.
	 * @see Essence.Register#getMirrorSize()
	 * @see #getRegister()
	 * @generated
	 */
	EAttribute getRegister_MirrorSize();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Register#getTopSpinType <em>Top Spin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Spin Type</em>'.
	 * @see Essence.Register#getTopSpinType()
	 * @see #getRegister()
	 * @generated
	 */
	EAttribute getRegister_TopSpinType();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.Register#getXRefRegisterView <em>XRef Register View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Register View</em>'.
	 * @see Essence.Register#getXRefRegisterView()
	 * @see #getRegister()
	 * @generated
	 */
	EReference getRegister_XRefRegisterView();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.Register#getBitFieldElement <em>Bit Field Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bit Field Element</em>'.
	 * @see Essence.Register#getBitFieldElement()
	 * @see #getRegister()
	 * @generated
	 */
	EReference getRegister_BitFieldElement();

	/**
	 * Returns the meta object for class '{@link Essence.RegisterView <em>Register View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register View</em>'.
	 * @see Essence.RegisterView
	 * @generated
	 */
	EClass getRegisterView();

	/**
	 * Returns the meta object for the attribute '{@link Essence.RegisterView#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see Essence.RegisterView#getDepth()
	 * @see #getRegisterView()
	 * @generated
	 */
	EAttribute getRegisterView_Depth();

	/**
	 * Returns the meta object for the attribute '{@link Essence.RegisterView#getDepthVar <em>Depth Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth Var</em>'.
	 * @see Essence.RegisterView#getDepthVar()
	 * @see #getRegisterView()
	 * @generated
	 */
	EAttribute getRegisterView_DepthVar();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.RegisterView#getBitFieldElement <em>Bit Field Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bit Field Element</em>'.
	 * @see Essence.RegisterView#getBitFieldElement()
	 * @see #getRegisterView()
	 * @generated
	 */
	EReference getRegisterView_BitFieldElement();

	/**
	 * Returns the meta object for class '{@link Essence.RegMemElement <em>Reg Mem Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reg Mem Element</em>'.
	 * @see Essence.RegMemElement
	 * @generated
	 */
	EClass getRegMemElement();

	/**
	 * Returns the meta object for the attribute '{@link Essence.RegMemElement#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see Essence.RegMemElement#getOffset()
	 * @see #getRegMemElement()
	 * @generated
	 */
	EAttribute getRegMemElement_Offset();

	/**
	 * Returns the meta object for class '{@link Essence.RegMemSequence <em>Reg Mem Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reg Mem Sequence</em>'.
	 * @see Essence.RegMemSequence
	 * @generated
	 */
	EClass getRegMemSequence();

	/**
	 * Returns the meta object for the attribute '{@link Essence.RegMemSequence#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see Essence.RegMemSequence#getCount()
	 * @see #getRegMemSequence()
	 * @generated
	 */
	EAttribute getRegMemSequence_Count();

	/**
	 * Returns the meta object for the attribute '{@link Essence.RegMemSequence#getMinIndex <em>Min Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Index</em>'.
	 * @see Essence.RegMemSequence#getMinIndex()
	 * @see #getRegMemSequence()
	 * @generated
	 */
	EAttribute getRegMemSequence_MinIndex();

	/**
	 * Returns the meta object for the attribute '{@link Essence.RegMemSequence#getIndexStep <em>Index Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Step</em>'.
	 * @see Essence.RegMemSequence#getIndexStep()
	 * @see #getRegMemSequence()
	 * @generated
	 */
	EAttribute getRegMemSequence_IndexStep();

	/**
	 * Returns the meta object for the attribute '{@link Essence.RegMemSequence#getIndexVar <em>Index Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Var</em>'.
	 * @see Essence.RegMemSequence#getIndexVar()
	 * @see #getRegMemSequence()
	 * @generated
	 */
	EAttribute getRegMemSequence_IndexVar();

	/**
	 * Returns the meta object for the attribute '{@link Essence.RegMemSequence#getAltFormat <em>Alt Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Format</em>'.
	 * @see Essence.RegMemSequence#getAltFormat()
	 * @see #getRegMemSequence()
	 * @generated
	 */
	EAttribute getRegMemSequence_AltFormat();

	/**
	 * Returns the meta object for the attribute '{@link Essence.RegMemSequence#isPilot <em>Pilot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pilot</em>'.
	 * @see Essence.RegMemSequence#isPilot()
	 * @see #getRegMemSequence()
	 * @generated
	 */
	EAttribute getRegMemSequence_Pilot();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.RegMemSequence#getSequenceElement <em>Sequence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Element</em>'.
	 * @see Essence.RegMemSequence#getSequenceElement()
	 * @see #getRegMemSequence()
	 * @generated
	 */
	EReference getRegMemSequence_SequenceElement();

	/**
	 * Returns the meta object for class '{@link Essence.RegMemSet <em>Reg Mem Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reg Mem Set</em>'.
	 * @see Essence.RegMemSet
	 * @generated
	 */
	EClass getRegMemSet();

	/**
	 * Returns the meta object for the attribute '{@link Essence.RegMemSet#getAddressUnit <em>Address Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Unit</em>'.
	 * @see Essence.RegMemSet#getAddressUnit()
	 * @see #getRegMemSet()
	 * @generated
	 */
	EAttribute getRegMemSet_AddressUnit();

	/**
	 * Returns the meta object for the attribute '{@link Essence.RegMemSet#getDataUnit <em>Data Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Unit</em>'.
	 * @see Essence.RegMemSet#getDataUnit()
	 * @see #getRegMemSet()
	 * @generated
	 */
	EAttribute getRegMemSet_DataUnit();

	/**
	 * Returns the meta object for the attribute '{@link Essence.RegMemSet#getSpecial <em>Special</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special</em>'.
	 * @see Essence.RegMemSet#getSpecial()
	 * @see #getRegMemSet()
	 * @generated
	 */
	EAttribute getRegMemSet_Special();

	/**
	 * Returns the meta object for the attribute '{@link Essence.RegMemSet#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see Essence.RegMemSet#getMessageType()
	 * @see #getRegMemSet()
	 * @generated
	 */
	EAttribute getRegMemSet_MessageType();

	/**
	 * Returns the meta object for the attribute '{@link Essence.RegMemSet#getOpCode <em>Op Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op Code</em>'.
	 * @see Essence.RegMemSet#getOpCode()
	 * @see #getRegMemSet()
	 * @generated
	 */
	EAttribute getRegMemSet_OpCode();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.RegMemSet#getRegMemElement <em>Reg Mem Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reg Mem Element</em>'.
	 * @see Essence.RegMemSet#getRegMemElement()
	 * @see #getRegMemSet()
	 * @generated
	 */
	EReference getRegMemSet_RegMemElement();

	/**
	 * Returns the meta object for class '{@link Essence.RegViewBlock <em>Reg View Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reg View Block</em>'.
	 * @see Essence.RegViewBlock
	 * @generated
	 */
	EClass getRegViewBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.RegViewBlock#getRegisterView <em>Register View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Register View</em>'.
	 * @see Essence.RegViewBlock#getRegisterView()
	 * @see #getRegViewBlock()
	 * @generated
	 */
	EReference getRegViewBlock_RegisterView();

	/**
	 * Returns the meta object for class '{@link Essence.ResetType <em>Reset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Type</em>'.
	 * @see Essence.ResetType
	 * @generated
	 */
	EClass getResetType();

	/**
	 * Returns the meta object for the attribute '{@link Essence.ResetType#getResetLevel <em>Reset Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset Level</em>'.
	 * @see Essence.ResetType#getResetLevel()
	 * @see #getResetType()
	 * @generated
	 */
	EAttribute getResetType_ResetLevel();

	/**
	 * Returns the meta object for the attribute '{@link Essence.ResetType#getResetMask <em>Reset Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset Mask</em>'.
	 * @see Essence.ResetType#getResetMask()
	 * @see #getResetType()
	 * @generated
	 */
	EAttribute getResetType_ResetMask();

	/**
	 * Returns the meta object for the attribute '{@link Essence.ResetType#getResetMode <em>Reset Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset Mode</em>'.
	 * @see Essence.ResetType#getResetMode()
	 * @see #getResetType()
	 * @generated
	 */
	EAttribute getResetType_ResetMode();

	/**
	 * Returns the meta object for the attribute '{@link Essence.ResetType#getResetType <em>Reset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset Type</em>'.
	 * @see Essence.ResetType#getResetType()
	 * @see #getResetType()
	 * @generated
	 */
	EAttribute getResetType_ResetType();

	/**
	 * Returns the meta object for the attribute '{@link Essence.ResetType#getResetValue <em>Reset Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset Value</em>'.
	 * @see Essence.ResetType#getResetValue()
	 * @see #getResetType()
	 * @generated
	 */
	EAttribute getResetType_ResetValue();

	/**
	 * Returns the meta object for class '{@link Essence.ReturnDataType <em>Return Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Data Type</em>'.
	 * @see Essence.ReturnDataType
	 * @generated
	 */
	EClass getReturnDataType();

	/**
	 * Returns the meta object for class '{@link Essence.ReturnElementAccess <em>Return Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Element Access</em>'.
	 * @see Essence.ReturnElementAccess
	 * @generated
	 */
	EClass getReturnElementAccess();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.ReturnElementAccess#getSimpleSubElementAccess <em>Simple Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Sub Element Access</em>'.
	 * @see Essence.ReturnElementAccess#getSimpleSubElementAccess()
	 * @see #getReturnElementAccess()
	 * @generated
	 */
	EReference getReturnElementAccess_SimpleSubElementAccess();

	/**
	 * Returns the meta object for class '{@link Essence.SequenceElement <em>Sequence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Element</em>'.
	 * @see Essence.SequenceElement
	 * @generated
	 */
	EClass getSequenceElement();

	/**
	 * Returns the meta object for the attribute '{@link Essence.SequenceElement#getDataWidth <em>Data Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Width</em>'.
	 * @see Essence.SequenceElement#getDataWidth()
	 * @see #getSequenceElement()
	 * @generated
	 */
	EAttribute getSequenceElement_DataWidth();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.SequenceElement#getAccessCondition <em>Access Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Condition</em>'.
	 * @see Essence.SequenceElement#getAccessCondition()
	 * @see #getSequenceElement()
	 * @generated
	 */
	EReference getSequenceElement_AccessCondition();

	/**
	 * Returns the meta object for class '{@link Essence.ShellInterfaceMap <em>Shell Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shell Interface Map</em>'.
	 * @see Essence.ShellInterfaceMap
	 * @generated
	 */
	EClass getShellInterfaceMap();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.ShellInterfaceMap#getXRefShellInterface <em>XRef Shell Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Shell Interface</em>'.
	 * @see Essence.ShellInterfaceMap#getXRefShellInterface()
	 * @see #getShellInterfaceMap()
	 * @generated
	 */
	EReference getShellInterfaceMap_XRefShellInterface();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.ShellInterfaceMap#getXRefConnection <em>XRef Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Connection</em>'.
	 * @see Essence.ShellInterfaceMap#getXRefConnection()
	 * @see #getShellInterfaceMap()
	 * @generated
	 */
	EReference getShellInterfaceMap_XRefConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.ShellInterfaceMap#getShellPortMap <em>Shell Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shell Port Map</em>'.
	 * @see Essence.ShellInterfaceMap#getShellPortMap()
	 * @see #getShellInterfaceMap()
	 * @generated
	 */
	EReference getShellInterfaceMap_ShellPortMap();

	/**
	 * Returns the meta object for class '{@link Essence.ShellPortMap <em>Shell Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shell Port Map</em>'.
	 * @see Essence.ShellPortMap
	 * @generated
	 */
	EClass getShellPortMap();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.ShellPortMap#getXRefShellPort <em>XRef Shell Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Shell Port</em>'.
	 * @see Essence.ShellPortMap#getXRefShellPort()
	 * @see #getShellPortMap()
	 * @generated
	 */
	EReference getShellPortMap_XRefShellPort();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.ShellPortMap#getXRefSignal <em>XRef Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Signal</em>'.
	 * @see Essence.ShellPortMap#getXRefSignal()
	 * @see #getShellPortMap()
	 * @generated
	 */
	EReference getShellPortMap_XRefSignal();

	/**
	 * Returns the meta object for class '{@link Essence.SiComponentInstance <em>Si Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si Component Instance</em>'.
	 * @see Essence.SiComponentInstance
	 * @generated
	 */
	EClass getSiComponentInstance();

	/**
	 * Returns the meta object for class '{@link Essence.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see Essence.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.Signal#getXRefDefaultValue <em>XRef Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Default Value</em>'.
	 * @see Essence.Signal#getXRefDefaultValue()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_XRefDefaultValue();

	/**
	 * Returns the meta object for class '{@link Essence.SignalMap <em>Signal Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Map</em>'.
	 * @see Essence.SignalMap
	 * @generated
	 */
	EClass getSignalMap();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.SignalMap#getXRefLocalSignal <em>XRef Local Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Local Signal</em>'.
	 * @see Essence.SignalMap#getXRefLocalSignal()
	 * @see #getSignalMap()
	 * @generated
	 */
	EReference getSignalMap_XRefLocalSignal();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.SignalMap#getXRefInterfaceDefSignal <em>XRef Interface Def Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Interface Def Signal</em>'.
	 * @see Essence.SignalMap#getXRefInterfaceDefSignal()
	 * @see #getSignalMap()
	 * @generated
	 */
	EReference getSignalMap_XRefInterfaceDefSignal();

	/**
	 * Returns the meta object for class '{@link Essence.SignalOwner <em>Signal Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Owner</em>'.
	 * @see Essence.SignalOwner
	 * @generated
	 */
	EClass getSignalOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.SignalOwner#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signal</em>'.
	 * @see Essence.SignalOwner#getSignal()
	 * @see #getSignalOwner()
	 * @generated
	 */
	EReference getSignalOwner_Signal();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.SignalOwner#getSignalMap <em>Signal Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signal Map</em>'.
	 * @see Essence.SignalOwner#getSignalMap()
	 * @see #getSignalOwner()
	 * @generated
	 */
	EReference getSignalOwner_SignalMap();

	/**
	 * Returns the meta object for class '{@link Essence.SiInstance <em>Si Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si Instance</em>'.
	 * @see Essence.SiInstance
	 * @generated
	 */
	EClass getSiInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.SiInstance#getSiInstanceInterfaceMap <em>Si Instance Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Si Instance Interface Map</em>'.
	 * @see Essence.SiInstance#getSiInstanceInterfaceMap()
	 * @see #getSiInstance()
	 * @generated
	 */
	EReference getSiInstance_SiInstanceInterfaceMap();

	/**
	 * Returns the meta object for class '{@link Essence.SiInstanceInterfaceMap <em>Si Instance Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si Instance Interface Map</em>'.
	 * @see Essence.SiInstanceInterfaceMap
	 * @generated
	 */
	EClass getSiInstanceInterfaceMap();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.SiInstanceInterfaceMap#getXRefInstanceInterface <em>XRef Instance Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Instance Interface</em>'.
	 * @see Essence.SiInstanceInterfaceMap#getXRefInstanceInterface()
	 * @see #getSiInstanceInterfaceMap()
	 * @generated
	 */
	EReference getSiInstanceInterfaceMap_XRefInstanceInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.SiInstanceInterfaceMap#getSiInstancePortMap <em>Si Instance Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Si Instance Port Map</em>'.
	 * @see Essence.SiInstanceInterfaceMap#getSiInstancePortMap()
	 * @see #getSiInstanceInterfaceMap()
	 * @generated
	 */
	EReference getSiInstanceInterfaceMap_SiInstancePortMap();

	/**
	 * Returns the meta object for class '{@link Essence.SiInstancePortMap <em>Si Instance Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si Instance Port Map</em>'.
	 * @see Essence.SiInstancePortMap
	 * @generated
	 */
	EClass getSiInstancePortMap();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.SiInstancePortMap#getXRefInstancePort <em>XRef Instance Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Instance Port</em>'.
	 * @see Essence.SiInstancePortMap#getXRefInstancePort()
	 * @see #getSiInstancePortMap()
	 * @generated
	 */
	EReference getSiInstancePortMap_XRefInstancePort();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.SiInstancePortMap#getXRefSignal <em>XRef Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Signal</em>'.
	 * @see Essence.SiInstancePortMap#getXRefSignal()
	 * @see #getSiInstancePortMap()
	 * @generated
	 */
	EReference getSiInstancePortMap_XRefSignal();

	/**
	 * Returns the meta object for class '{@link Essence.SiInstanceShellInterfaceMap <em>Si Instance Shell Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si Instance Shell Interface Map</em>'.
	 * @see Essence.SiInstanceShellInterfaceMap
	 * @generated
	 */
	EClass getSiInstanceShellInterfaceMap();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.SiInstanceShellInterfaceMap#getXRefInstanceShellInterface <em>XRef Instance Shell Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Instance Shell Interface</em>'.
	 * @see Essence.SiInstanceShellInterfaceMap#getXRefInstanceShellInterface()
	 * @see #getSiInstanceShellInterfaceMap()
	 * @generated
	 */
	EReference getSiInstanceShellInterfaceMap_XRefInstanceShellInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.SiInstanceShellInterfaceMap#getSiInstanceShellPortMap <em>Si Instance Shell Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Si Instance Shell Port Map</em>'.
	 * @see Essence.SiInstanceShellInterfaceMap#getSiInstanceShellPortMap()
	 * @see #getSiInstanceShellInterfaceMap()
	 * @generated
	 */
	EReference getSiInstanceShellInterfaceMap_SiInstanceShellPortMap();

	/**
	 * Returns the meta object for class '{@link Essence.SiInstanceShellPortMap <em>Si Instance Shell Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si Instance Shell Port Map</em>'.
	 * @see Essence.SiInstanceShellPortMap
	 * @generated
	 */
	EClass getSiInstanceShellPortMap();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.SiInstanceShellPortMap#getXRefInstanceShellPort <em>XRef Instance Shell Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Instance Shell Port</em>'.
	 * @see Essence.SiInstanceShellPortMap#getXRefInstanceShellPort()
	 * @see #getSiInstanceShellPortMap()
	 * @generated
	 */
	EReference getSiInstanceShellPortMap_XRefInstanceShellPort();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.SiInstanceShellPortMap#getXRefSignal <em>XRef Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Signal</em>'.
	 * @see Essence.SiInstanceShellPortMap#getXRefSignal()
	 * @see #getSiInstanceShellPortMap()
	 * @generated
	 */
	EReference getSiInstanceShellPortMap_XRefSignal();

	/**
	 * Returns the meta object for class '{@link Essence.Silicon <em>Silicon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Silicon</em>'.
	 * @see Essence.Silicon
	 * @generated
	 */
	EClass getSilicon();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Silicon#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see Essence.Silicon#getStep()
	 * @see #getSilicon()
	 * @generated
	 */
	EAttribute getSilicon_Step();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Silicon#getPadHeight <em>Pad Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pad Height</em>'.
	 * @see Essence.Silicon#getPadHeight()
	 * @see #getSilicon()
	 * @generated
	 */
	EAttribute getSilicon_PadHeight();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Silicon#getKerfWidth <em>Kerf Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kerf Width</em>'.
	 * @see Essence.Silicon#getKerfWidth()
	 * @see #getSilicon()
	 * @generated
	 */
	EAttribute getSilicon_KerfWidth();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Silicon#getKerfHeight <em>Kerf Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kerf Height</em>'.
	 * @see Essence.Silicon#getKerfHeight()
	 * @see #getSilicon()
	 * @generated
	 */
	EAttribute getSilicon_KerfHeight();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.Silicon#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance</em>'.
	 * @see Essence.Silicon#getInstance()
	 * @see #getSilicon()
	 * @generated
	 */
	EReference getSilicon_Instance();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.Silicon#getPad <em>Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pad</em>'.
	 * @see Essence.Silicon#getPad()
	 * @see #getSilicon()
	 * @generated
	 */
	EReference getSilicon_Pad();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.Silicon#getPowerDomain <em>Power Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Power Domain</em>'.
	 * @see Essence.Silicon#getPowerDomain()
	 * @see #getSilicon()
	 * @generated
	 */
	EReference getSilicon_PowerDomain();

	/**
	 * Returns the meta object for class '{@link Essence.SiliconInstance <em>Silicon Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Silicon Instance</em>'.
	 * @see Essence.SiliconInstance
	 * @generated
	 */
	EClass getSiliconInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.SiliconInstance#getPadNetMap <em>Pad Net Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pad Net Map</em>'.
	 * @see Essence.SiliconInstance#getPadNetMap()
	 * @see #getSiliconInstance()
	 * @generated
	 */
	EReference getSiliconInstance_PadNetMap();

	/**
	 * Returns the meta object for class '{@link Essence.SimpleDataType <em>Simple Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Data Type</em>'.
	 * @see Essence.SimpleDataType
	 * @generated
	 */
	EClass getSimpleDataType();

	/**
	 * Returns the meta object for class '{@link Essence.SimpleSubElementAccess <em>Simple Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Sub Element Access</em>'.
	 * @see Essence.SimpleSubElementAccess
	 * @generated
	 */
	EClass getSimpleSubElementAccess();

	/**
	 * Returns the meta object for class '{@link Essence.SinglePad <em>Single Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Pad</em>'.
	 * @see Essence.SinglePad
	 * @generated
	 */
	EClass getSinglePad();

	/**
	 * Returns the meta object for the attribute '{@link Essence.SinglePad#getXCoordinate <em>XCoordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XCoordinate</em>'.
	 * @see Essence.SinglePad#getXCoordinate()
	 * @see #getSinglePad()
	 * @generated
	 */
	EAttribute getSinglePad_XCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link Essence.SinglePad#getYCoordinate <em>YCoordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YCoordinate</em>'.
	 * @see Essence.SinglePad#getYCoordinate()
	 * @see #getSinglePad()
	 * @generated
	 */
	EAttribute getSinglePad_YCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link Essence.SinglePad#getSpacer <em>Spacer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spacer</em>'.
	 * @see Essence.SinglePad#getSpacer()
	 * @see #getSinglePad()
	 * @generated
	 */
	EAttribute getSinglePad_Spacer();

	/**
	 * Returns the meta object for the attribute '{@link Essence.SinglePad#getOpening <em>Opening</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opening</em>'.
	 * @see Essence.SinglePad#getOpening()
	 * @see #getSinglePad()
	 * @generated
	 */
	EAttribute getSinglePad_Opening();

	/**
	 * Returns the meta object for the attribute '{@link Essence.SinglePad#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see Essence.SinglePad#getLocation()
	 * @see #getSinglePad()
	 * @generated
	 */
	EAttribute getSinglePad_Location();

	/**
	 * Returns the meta object for the attribute '{@link Essence.SinglePad#getPadCount <em>Pad Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pad Count</em>'.
	 * @see Essence.SinglePad#getPadCount()
	 * @see #getSinglePad()
	 * @generated
	 */
	EAttribute getSinglePad_PadCount();

	/**
	 * Returns the meta object for the attribute '{@link Essence.SinglePad#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Place</em>'.
	 * @see Essence.SinglePad#getPlace()
	 * @see #getSinglePad()
	 * @generated
	 */
	EAttribute getSinglePad_Place();

	/**
	 * Returns the meta object for the attribute '{@link Essence.SinglePad#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see Essence.SinglePad#getOrientation()
	 * @see #getSinglePad()
	 * @generated
	 */
	EAttribute getSinglePad_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link Essence.SinglePad#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see Essence.SinglePad#getPower()
	 * @see #getSinglePad()
	 * @generated
	 */
	EAttribute getSinglePad_Power();

	/**
	 * Returns the meta object for the attribute '{@link Essence.SinglePad#getGround <em>Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ground</em>'.
	 * @see Essence.SinglePad#getGround()
	 * @see #getSinglePad()
	 * @generated
	 */
	EAttribute getSinglePad_Ground();

	/**
	 * Returns the meta object for class '{@link Essence.SingleSourceNode <em>Single Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Source Node</em>'.
	 * @see Essence.SingleSourceNode
	 * @generated
	 */
	EClass getSingleSourceNode();

	/**
	 * Returns the meta object for the attribute '{@link Essence.SingleSourceNode#getCustom <em>Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom</em>'.
	 * @see Essence.SingleSourceNode#getCustom()
	 * @see #getSingleSourceNode()
	 * @generated
	 */
	EAttribute getSingleSourceNode_Custom();

	/**
	 * Returns the meta object for the attribute '{@link Essence.SingleSourceNode#getHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see Essence.SingleSourceNode#getHidden()
	 * @see #getSingleSourceNode()
	 * @generated
	 */
	EAttribute getSingleSourceNode_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link Essence.SingleSourceNode#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see Essence.SingleSourceNode#getID()
	 * @see #getSingleSourceNode()
	 * @generated
	 */
	EAttribute getSingleSourceNode_ID();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.SingleSourceNode#getLongDescription <em>Long Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Long Description</em>'.
	 * @see Essence.SingleSourceNode#getLongDescription()
	 * @see #getSingleSourceNode()
	 * @generated
	 */
	EReference getSingleSourceNode_LongDescription();

	/**
	 * Returns the meta object for the attribute '{@link Essence.SingleSourceNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Essence.SingleSourceNode#getName()
	 * @see #getSingleSourceNode()
	 * @generated
	 */
	EAttribute getSingleSourceNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link Essence.SingleSourceNode#getShortDescription <em>Short Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Description</em>'.
	 * @see Essence.SingleSourceNode#getShortDescription()
	 * @see #getSingleSourceNode()
	 * @generated
	 */
	EAttribute getSingleSourceNode_ShortDescription();

	/**
	 * Returns the meta object for the attribute '{@link Essence.SingleSourceNode#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see Essence.SingleSourceNode#getShortName()
	 * @see #getSingleSourceNode()
	 * @generated
	 */
	EAttribute getSingleSourceNode_ShortName();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.SingleSourceNode#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see Essence.SingleSourceNode#getProperty()
	 * @see #getSingleSourceNode()
	 * @generated
	 */
	EReference getSingleSourceNode_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.SingleSourceNode#getXRefExtension <em>XRef Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>XRef Extension</em>'.
	 * @see Essence.SingleSourceNode#getXRefExtension()
	 * @see #getSingleSourceNode()
	 * @generated
	 */
	EReference getSingleSourceNode_XRefExtension();

	/**
	 * Returns the meta object for class '{@link Essence.SiPort <em>Si Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si Port</em>'.
	 * @see Essence.SiPort
	 * @generated
	 */
	EClass getSiPort();

	/**
	 * Returns the meta object for the attribute '{@link Essence.SiPort#getPdr <em>Pdr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pdr</em>'.
	 * @see Essence.SiPort#getPdr()
	 * @see #getSiPort()
	 * @generated
	 */
	EAttribute getSiPort_Pdr();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.SiPort#getXRefTest <em>XRef Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Test</em>'.
	 * @see Essence.SiPort#getXRefTest()
	 * @see #getSiPort()
	 * @generated
	 */
	EReference getSiPort_XRefTest();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.SiPort#getSiPortReq <em>Si Port Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Si Port Req</em>'.
	 * @see Essence.SiPort#getSiPortReq()
	 * @see #getSiPort()
	 * @generated
	 */
	EReference getSiPort_SiPortReq();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.SiPort#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see Essence.SiPort#getFunction()
	 * @see #getSiPort()
	 * @generated
	 */
	EReference getSiPort_Function();

	/**
	 * Returns the meta object for class '{@link Essence.SiPortDB <em>Si Port DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si Port DB</em>'.
	 * @see Essence.SiPortDB
	 * @generated
	 */
	EClass getSiPortDB();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.SiPortDB#getSiPort <em>Si Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Si Port</em>'.
	 * @see Essence.SiPortDB#getSiPort()
	 * @see #getSiPortDB()
	 * @generated
	 */
	EReference getSiPortDB_SiPort();

	/**
	 * Returns the meta object for class '{@link Essence.SiPortReq <em>Si Port Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si Port Req</em>'.
	 * @see Essence.SiPortReq
	 * @generated
	 */
	EClass getSiPortReq();

	/**
	 * Returns the meta object for the attribute '{@link Essence.SiPortReq#getDriverStrength <em>Driver Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Strength</em>'.
	 * @see Essence.SiPortReq#getDriverStrength()
	 * @see #getSiPortReq()
	 * @generated
	 */
	EAttribute getSiPortReq_DriverStrength();

	/**
	 * Returns the meta object for the attribute '{@link Essence.SiPortReq#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set</em>'.
	 * @see Essence.SiPortReq#getSet()
	 * @see #getSiPortReq()
	 * @generated
	 */
	EAttribute getSiPortReq_Set();

	/**
	 * Returns the meta object for the attribute '{@link Essence.SiPortReq#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Essence.SiPortReq#getType()
	 * @see #getSiPortReq()
	 * @generated
	 */
	EAttribute getSiPortReq_Type();

	/**
	 * Returns the meta object for class '{@link Essence.SiSignal <em>Si Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si Signal</em>'.
	 * @see Essence.SiSignal
	 * @generated
	 */
	EClass getSiSignal();

	/**
	 * Returns the meta object for class '{@link Essence.SiSignalDB <em>Si Signal DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si Signal DB</em>'.
	 * @see Essence.SiSignalDB
	 * @generated
	 */
	EClass getSiSignalDB();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.SiSignalDB#getSiSignal <em>Si Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Si Signal</em>'.
	 * @see Essence.SiSignalDB#getSiSignal()
	 * @see #getSiSignalDB()
	 * @generated
	 */
	EReference getSiSignalDB_SiSignal();

	/**
	 * Returns the meta object for class '{@link Essence.SiSystemInstance <em>Si System Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si System Instance</em>'.
	 * @see Essence.SiSystemInstance
	 * @generated
	 */
	EClass getSiSystemInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.SiSystemInstance#getSiInstanceShellInterfaceMap <em>Si Instance Shell Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Si Instance Shell Interface Map</em>'.
	 * @see Essence.SiSystemInstance#getSiInstanceShellInterfaceMap()
	 * @see #getSiSystemInstance()
	 * @generated
	 */
	EReference getSiSystemInstance_SiInstanceShellInterfaceMap();

	/**
	 * Returns the meta object for class '{@link Essence.StringDecl <em>String Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Decl</em>'.
	 * @see Essence.StringDecl
	 * @generated
	 */
	EClass getStringDecl();

	/**
	 * Returns the meta object for the attribute '{@link Essence.StringDecl#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see Essence.StringDecl#getDefaultValue()
	 * @see #getStringDecl()
	 * @generated
	 */
	EAttribute getStringDecl_DefaultValue();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.StringDecl#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration</em>'.
	 * @see Essence.StringDecl#getEnumeration()
	 * @see #getStringDecl()
	 * @generated
	 */
	EReference getStringDecl_Enumeration();

	/**
	 * Returns the meta object for class '{@link Essence.StringDef <em>String Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Def</em>'.
	 * @see Essence.StringDef
	 * @generated
	 */
	EClass getStringDef();

	/**
	 * Returns the meta object for the attribute '{@link Essence.StringDef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Essence.StringDef#getValue()
	 * @see #getStringDef()
	 * @generated
	 */
	EAttribute getStringDef_Value();

	/**
	 * Returns the meta object for class '{@link Essence.StringGenDecl <em>String Gen Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Gen Decl</em>'.
	 * @see Essence.StringGenDecl
	 * @generated
	 */
	EClass getStringGenDecl();

	/**
	 * Returns the meta object for the attribute '{@link Essence.StringGenDecl#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see Essence.StringGenDecl#getDefaultValue()
	 * @see #getStringGenDecl()
	 * @generated
	 */
	EAttribute getStringGenDecl_DefaultValue();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.StringGenDecl#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration</em>'.
	 * @see Essence.StringGenDecl#getEnumeration()
	 * @see #getStringGenDecl()
	 * @generated
	 */
	EReference getStringGenDecl_Enumeration();

	/**
	 * Returns the meta object for class '{@link Essence.SubElementAccess <em>Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Element Access</em>'.
	 * @see Essence.SubElementAccess
	 * @generated
	 */
	EClass getSubElementAccess();

	/**
	 * Returns the meta object for class '{@link Essence.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see Essence.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.System#getExtVLNV <em>Ext VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ext VLNV</em>'.
	 * @see Essence.System#getExtVLNV()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_ExtVLNV();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.System#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see Essence.System#getInterface()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Interface();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.System#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see Essence.System#getConnection()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Connection();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.System#getLocalInterfaceMap <em>Local Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Interface Map</em>'.
	 * @see Essence.System#getLocalInterfaceMap()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_LocalInterfaceMap();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.System#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance</em>'.
	 * @see Essence.System#getInstance()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Instance();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.System#getShellInterfaceMap <em>Shell Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shell Interface Map</em>'.
	 * @see Essence.System#getShellInterfaceMap()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_ShellInterfaceMap();

	/**
	 * Returns the meta object for class '{@link Essence.SystemInstance <em>System Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Instance</em>'.
	 * @see Essence.SystemInstance
	 * @generated
	 */
	EClass getSystemInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.SystemInstance#getInstanceShellInterfaceMap <em>Instance Shell Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Shell Interface Map</em>'.
	 * @see Essence.SystemInstance#getInstanceShellInterfaceMap()
	 * @see #getSystemInstance()
	 * @generated
	 */
	EReference getSystemInstance_InstanceShellInterfaceMap();

	/**
	 * Returns the meta object for class '{@link Essence.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see Essence.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the attribute '{@link Essence.Test#getParallelFactor <em>Parallel Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallel Factor</em>'.
	 * @see Essence.Test#getParallelFactor()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_ParallelFactor();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.Test#getTestReq <em>Test Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Req</em>'.
	 * @see Essence.Test#getTestReq()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_TestReq();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.Test#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see Essence.Test#getFunction()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Function();

	/**
	 * Returns the meta object for class '{@link Essence.TestDB <em>Test DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test DB</em>'.
	 * @see Essence.TestDB
	 * @generated
	 */
	EClass getTestDB();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.TestDB#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test</em>'.
	 * @see Essence.TestDB#getTest()
	 * @see #getTestDB()
	 * @generated
	 */
	EReference getTestDB_Test();

	/**
	 * Returns the meta object for class '{@link Essence.TestReq <em>Test Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Req</em>'.
	 * @see Essence.TestReq
	 * @generated
	 */
	EClass getTestReq();

	/**
	 * Returns the meta object for the attribute '{@link Essence.TestReq#getDriverStrength <em>Driver Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Strength</em>'.
	 * @see Essence.TestReq#getDriverStrength()
	 * @see #getTestReq()
	 * @generated
	 */
	EAttribute getTestReq_DriverStrength();

	/**
	 * Returns the meta object for class '{@link Essence.TransactionalPort <em>Transactional Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transactional Port</em>'.
	 * @see Essence.TransactionalPort
	 * @generated
	 */
	EClass getTransactionalPort();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.TransactionalPort#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see Essence.TransactionalPort#getDataType()
	 * @see #getTransactionalPort()
	 * @generated
	 */
	EReference getTransactionalPort_DataType();

	/**
	 * Returns the meta object for the attribute '{@link Essence.TransactionalPort#getInitiative <em>Initiative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiative</em>'.
	 * @see Essence.TransactionalPort#getInitiative()
	 * @see #getTransactionalPort()
	 * @generated
	 */
	EAttribute getTransactionalPort_Initiative();

	/**
	 * Returns the meta object for class '{@link Essence.TransactionalSignal <em>Transactional Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transactional Signal</em>'.
	 * @see Essence.TransactionalSignal
	 * @generated
	 */
	EClass getTransactionalSignal();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.TransactionalSignal#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see Essence.TransactionalSignal#getDataType()
	 * @see #getTransactionalSignal()
	 * @generated
	 */
	EReference getTransactionalSignal_DataType();

	/**
	 * Returns the meta object for class '{@link Essence.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union</em>'.
	 * @see Essence.Union
	 * @generated
	 */
	EClass getUnion();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.Union#getDataTypeElement <em>Data Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Type Element</em>'.
	 * @see Essence.Union#getDataTypeElement()
	 * @see #getUnion()
	 * @generated
	 */
	EReference getUnion_DataTypeElement();

	/**
	 * Returns the meta object for class '{@link Essence.ValueDataType <em>Value Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Data Type</em>'.
	 * @see Essence.ValueDataType
	 * @generated
	 */
	EClass getValueDataType();

	/**
	 * Returns the meta object for the attribute '{@link Essence.ValueDataType#getSignInterpretation <em>Sign Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sign Interpretation</em>'.
	 * @see Essence.ValueDataType#getSignInterpretation()
	 * @see #getValueDataType()
	 * @generated
	 */
	EAttribute getValueDataType_SignInterpretation();

	/**
	 * Returns the meta object for the attribute '{@link Essence.ValueDataType#getObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Type</em>'.
	 * @see Essence.ValueDataType#getObjectType()
	 * @see #getValueDataType()
	 * @generated
	 */
	EAttribute getValueDataType_ObjectType();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.ValueDataType#getVector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vector</em>'.
	 * @see Essence.ValueDataType#getVector()
	 * @see #getValueDataType()
	 * @generated
	 */
	EReference getValueDataType_Vector();

	/**
	 * Returns the meta object for class '{@link Essence.VarDef <em>Var Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Def</em>'.
	 * @see Essence.VarDef
	 * @generated
	 */
	EClass getVarDef();

	/**
	 * Returns the meta object for class '{@link Essence.VarDefBlock <em>Var Def Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Def Block</em>'.
	 * @see Essence.VarDefBlock
	 * @generated
	 */
	EClass getVarDefBlock();

	/**
	 * Returns the meta object for class '{@link Essence.VLNV <em>VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VLNV</em>'.
	 * @see Essence.VLNV
	 * @generated
	 */
	EClass getVLNV();

	/**
	 * Returns the meta object for the attribute '{@link Essence.VLNV#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see Essence.VLNV#getVendor()
	 * @see #getVLNV()
	 * @generated
	 */
	EAttribute getVLNV_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link Essence.VLNV#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see Essence.VLNV#getLibrary()
	 * @see #getVLNV()
	 * @generated
	 */
	EAttribute getVLNV_Library();

	/**
	 * Returns the meta object for the attribute '{@link Essence.VLNV#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Essence.VLNV#getName()
	 * @see #getVLNV()
	 * @generated
	 */
	EAttribute getVLNV_Name();

	/**
	 * Returns the meta object for the attribute '{@link Essence.VLNV#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see Essence.VLNV#getVersion()
	 * @see #getVLNV()
	 * @generated
	 */
	EAttribute getVLNV_Version();

	/**
	 * Returns the meta object for class '{@link Essence.Void <em>Void</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void</em>'.
	 * @see Essence.Void
	 * @generated
	 */
	EClass getVoid();

	/**
	 * Returns the meta object for class '{@link Essence.WirePort <em>Wire Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire Port</em>'.
	 * @see Essence.WirePort
	 * @generated
	 */
	EClass getWirePort();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.WirePort#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see Essence.WirePort#getDataType()
	 * @see #getWirePort()
	 * @generated
	 */
	EReference getWirePort_DataType();

	/**
	 * Returns the meta object for class '{@link Essence.WireSignal <em>Wire Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire Signal</em>'.
	 * @see Essence.WireSignal
	 * @generated
	 */
	EClass getWireSignal();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.WireSignal#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see Essence.WireSignal#getDataType()
	 * @see #getWireSignal()
	 * @generated
	 */
	EReference getWireSignal_DataType();

	/**
	 * Returns the meta object for class '{@link Essence.XRef <em>XRef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef</em>'.
	 * @see Essence.XRef
	 * @generated
	 */
	EClass getXRef();

	/**
	 * Returns the meta object for the attribute '{@link Essence.XRef#getXRefTargetID <em>XRef Target ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XRef Target ID</em>'.
	 * @see Essence.XRef#getXRefTargetID()
	 * @see #getXRef()
	 * @generated
	 */
	EAttribute getXRef_XRefTargetID();

	/**
	 * Returns the meta object for class '{@link Essence.XRefConnection <em>XRef Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Connection</em>'.
	 * @see Essence.XRefConnection
	 * @generated
	 */
	EClass getXRefConnection();

	/**
	 * Returns the meta object for class '{@link Essence.XRefDataVar <em>XRef Data Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Data Var</em>'.
	 * @see Essence.XRefDataVar
	 * @generated
	 */
	EClass getXRefDataVar();

	/**
	 * Returns the meta object for class '{@link Essence.XRefDirect <em>XRef Direct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Direct</em>'.
	 * @see Essence.XRefDirect
	 * @generated
	 */
	EClass getXRefDirect();

	/**
	 * Returns the meta object for class '{@link Essence.XRefExternal <em>XRef External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef External</em>'.
	 * @see Essence.XRefExternal
	 * @generated
	 */
	EClass getXRefExternal();

	/**
	 * Returns the meta object for class '{@link Essence.XRefExternalInterface <em>XRef External Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef External Interface</em>'.
	 * @see Essence.XRefExternalInterface
	 * @generated
	 */
	EClass getXRefExternalInterface();

	/**
	 * Returns the meta object for class '{@link Essence.XRefExternalPort <em>XRef External Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef External Port</em>'.
	 * @see Essence.XRefExternalPort
	 * @generated
	 */
	EClass getXRefExternalPort();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.XRefExternalPort#getSubElementAccess <em>Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Element Access</em>'.
	 * @see Essence.XRefExternalPort#getSubElementAccess()
	 * @see #getXRefExternalPort()
	 * @generated
	 */
	EReference getXRefExternalPort_SubElementAccess();

	/**
	 * Returns the meta object for class '{@link Essence.XRefExternalSignal <em>XRef External Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef External Signal</em>'.
	 * @see Essence.XRefExternalSignal
	 * @generated
	 */
	EClass getXRefExternalSignal();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.XRefExternalSignal#getSubElementAccess <em>Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Element Access</em>'.
	 * @see Essence.XRefExternalSignal#getSubElementAccess()
	 * @see #getXRefExternalSignal()
	 * @generated
	 */
	EReference getXRefExternalSignal_SubElementAccess();

	/**
	 * Returns the meta object for class '{@link Essence.XRefGenericDecl <em>XRef Generic Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Generic Decl</em>'.
	 * @see Essence.XRefGenericDecl
	 * @generated
	 */
	EClass getXRefGenericDecl();

	/**
	 * Returns the meta object for class '{@link Essence.XRefIFDPort <em>XRef IFD Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef IFD Port</em>'.
	 * @see Essence.XRefIFDPort
	 * @generated
	 */
	EClass getXRefIFDPort();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.XRefIFDPort#getSubElementAccess <em>Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Element Access</em>'.
	 * @see Essence.XRefIFDPort#getSubElementAccess()
	 * @see #getXRefIFDPort()
	 * @generated
	 */
	EReference getXRefIFDPort_SubElementAccess();

	/**
	 * Returns the meta object for class '{@link Essence.XRefIndInterface <em>XRef Ind Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Ind Interface</em>'.
	 * @see Essence.XRefIndInterface
	 * @generated
	 */
	EClass getXRefIndInterface();

	/**
	 * Returns the meta object for class '{@link Essence.XRefIndirect <em>XRef Indirect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Indirect</em>'.
	 * @see Essence.XRefIndirect
	 * @generated
	 */
	EClass getXRefIndirect();

	/**
	 * Returns the meta object for class '{@link Essence.XRefIndPin <em>XRef Ind Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Ind Pin</em>'.
	 * @see Essence.XRefIndPin
	 * @generated
	 */
	EClass getXRefIndPin();

	/**
	 * Returns the meta object for class '{@link Essence.XRefIndPort <em>XRef Ind Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Ind Port</em>'.
	 * @see Essence.XRefIndPort
	 * @generated
	 */
	EClass getXRefIndPort();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.XRefIndPort#getSubElementAccess <em>Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Element Access</em>'.
	 * @see Essence.XRefIndPort#getSubElementAccess()
	 * @see #getXRefIndPort()
	 * @generated
	 */
	EReference getXRefIndPort_SubElementAccess();

	/**
	 * Returns the meta object for class '{@link Essence.XRefIndSinglePad <em>XRef Ind Single Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Ind Single Pad</em>'.
	 * @see Essence.XRefIndSinglePad
	 * @generated
	 */
	EClass getXRefIndSinglePad();

	/**
	 * Returns the meta object for class '{@link Essence.XRefInstance <em>XRef Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Instance</em>'.
	 * @see Essence.XRefInstance
	 * @generated
	 */
	EClass getXRefInstance();

	/**
	 * Returns the meta object for class '{@link Essence.XRefInternal <em>XRef Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Internal</em>'.
	 * @see Essence.XRefInternal
	 * @generated
	 */
	EClass getXRefInternal();

	/**
	 * Returns the meta object for class '{@link Essence.XRefInternalInterface <em>XRef Internal Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Internal Interface</em>'.
	 * @see Essence.XRefInternalInterface
	 * @generated
	 */
	EClass getXRefInternalInterface();

	/**
	 * Returns the meta object for class '{@link Essence.XRefInternalPort <em>XRef Internal Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Internal Port</em>'.
	 * @see Essence.XRefInternalPort
	 * @generated
	 */
	EClass getXRefInternalPort();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.XRefInternalPort#getSubElementAccess <em>Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Element Access</em>'.
	 * @see Essence.XRefInternalPort#getSubElementAccess()
	 * @see #getXRefInternalPort()
	 * @generated
	 */
	EReference getXRefInternalPort_SubElementAccess();

	/**
	 * Returns the meta object for class '{@link Essence.XRefInternalSignal <em>XRef Internal Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Internal Signal</em>'.
	 * @see Essence.XRefInternalSignal
	 * @generated
	 */
	EClass getXRefInternalSignal();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.XRefInternalSignal#getSubElementAccess <em>Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Element Access</em>'.
	 * @see Essence.XRefInternalSignal#getSubElementAccess()
	 * @see #getXRefInternalSignal()
	 * @generated
	 */
	EReference getXRefInternalSignal_SubElementAccess();

	/**
	 * Returns the meta object for class '{@link Essence.XRefMasterInterface <em>XRef Master Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Master Interface</em>'.
	 * @see Essence.XRefMasterInterface
	 * @generated
	 */
	EClass getXRefMasterInterface();

	/**
	 * Returns the meta object for the attribute '{@link Essence.XRefMasterInterface#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see Essence.XRefMasterInterface#getRange()
	 * @see #getXRefMasterInterface()
	 * @generated
	 */
	EAttribute getXRefMasterInterface_Range();

	/**
	 * Returns the meta object for the attribute '{@link Essence.XRefMasterInterface#getSrcOffset <em>Src Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src Offset</em>'.
	 * @see Essence.XRefMasterInterface#getSrcOffset()
	 * @see #getXRefMasterInterface()
	 * @generated
	 */
	EAttribute getXRefMasterInterface_SrcOffset();

	/**
	 * Returns the meta object for the attribute '{@link Essence.XRefMasterInterface#getTgtOffset <em>Tgt Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tgt Offset</em>'.
	 * @see Essence.XRefMasterInterface#getTgtOffset()
	 * @see #getXRefMasterInterface()
	 * @generated
	 */
	EAttribute getXRefMasterInterface_TgtOffset();

	/**
	 * Returns the meta object for class '{@link Essence.XRefNet <em>XRef Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Net</em>'.
	 * @see Essence.XRefNet
	 * @generated
	 */
	EClass getXRefNet();

	/**
	 * Returns the meta object for class '{@link Essence.XRefNoneInterface <em>XRef None Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef None Interface</em>'.
	 * @see Essence.XRefNoneInterface
	 * @generated
	 */
	EClass getXRefNoneInterface();

	/**
	 * Returns the meta object for class '{@link Essence.XRefPadType <em>XRef Pad Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Pad Type</em>'.
	 * @see Essence.XRefPadType
	 * @generated
	 */
	EClass getXRefPadType();

	/**
	 * Returns the meta object for class '{@link Essence.XRefParamDecl <em>XRef Param Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Param Decl</em>'.
	 * @see Essence.XRefParamDecl
	 * @generated
	 */
	EClass getXRefParamDecl();

	/**
	 * Returns the meta object for class '{@link Essence.XRefPin <em>XRef Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Pin</em>'.
	 * @see Essence.XRefPin
	 * @generated
	 */
	EClass getXRefPin();

	/**
	 * Returns the meta object for class '{@link Essence.XRefPowerDomain <em>XRef Power Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Power Domain</em>'.
	 * @see Essence.XRefPowerDomain
	 * @generated
	 */
	EClass getXRefPowerDomain();

	/**
	 * Returns the meta object for class '{@link Essence.XRefRealPort <em>XRef Real Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Real Port</em>'.
	 * @see Essence.XRefRealPort
	 * @generated
	 */
	EClass getXRefRealPort();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.XRefRealPort#getSubElementAccess <em>Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Element Access</em>'.
	 * @see Essence.XRefRealPort#getSubElementAccess()
	 * @see #getXRefRealPort()
	 * @generated
	 */
	EReference getXRefRealPort_SubElementAccess();

	/**
	 * Returns the meta object for class '{@link Essence.XRefRegisterView <em>XRef Register View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Register View</em>'.
	 * @see Essence.XRefRegisterView
	 * @generated
	 */
	EClass getXRefRegisterView();

	/**
	 * Returns the meta object for class '{@link Essence.XRefRegMemSet <em>XRef Reg Mem Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Reg Mem Set</em>'.
	 * @see Essence.XRefRegMemSet
	 * @generated
	 */
	EClass getXRefRegMemSet();

	/**
	 * Returns the meta object for the attribute '{@link Essence.XRefRegMemSet#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see Essence.XRefRegMemSet#getOffset()
	 * @see #getXRefRegMemSet()
	 * @generated
	 */
	EAttribute getXRefRegMemSet_Offset();

	/**
	 * Returns the meta object for the containment reference list '{@link Essence.XRefRegMemSet#getAccessCondition <em>Access Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Condition</em>'.
	 * @see Essence.XRefRegMemSet#getAccessCondition()
	 * @see #getXRefRegMemSet()
	 * @generated
	 */
	EReference getXRefRegMemSet_AccessCondition();

	/**
	 * Returns the meta object for class '{@link Essence.XRefSinglePad <em>XRef Single Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Single Pad</em>'.
	 * @see Essence.XRefSinglePad
	 * @generated
	 */
	EClass getXRefSinglePad();

	/**
	 * Returns the meta object for class '{@link Essence.XRefSiPort <em>XRef Si Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Si Port</em>'.
	 * @see Essence.XRefSiPort
	 * @generated
	 */
	EClass getXRefSiPort();

	/**
	 * Returns the meta object for class '{@link Essence.XRefSiSignal <em>XRef Si Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Si Signal</em>'.
	 * @see Essence.XRefSiSignal
	 * @generated
	 */
	EClass getXRefSiSignal();

	/**
	 * Returns the meta object for class '{@link Essence.XRefSlaveInterface <em>XRef Slave Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Slave Interface</em>'.
	 * @see Essence.XRefSlaveInterface
	 * @generated
	 */
	EClass getXRefSlaveInterface();

	/**
	 * Returns the meta object for the attribute '{@link Essence.XRefSlaveInterface#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see Essence.XRefSlaveInterface#getRange()
	 * @see #getXRefSlaveInterface()
	 * @generated
	 */
	EAttribute getXRefSlaveInterface_Range();

	/**
	 * Returns the meta object for the attribute '{@link Essence.XRefSlaveInterface#getSrcOffset <em>Src Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src Offset</em>'.
	 * @see Essence.XRefSlaveInterface#getSrcOffset()
	 * @see #getXRefSlaveInterface()
	 * @generated
	 */
	EAttribute getXRefSlaveInterface_SrcOffset();

	/**
	 * Returns the meta object for the attribute '{@link Essence.XRefSlaveInterface#getTgtOffset <em>Tgt Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tgt Offset</em>'.
	 * @see Essence.XRefSlaveInterface#getTgtOffset()
	 * @see #getXRefSlaveInterface()
	 * @generated
	 */
	EAttribute getXRefSlaveInterface_TgtOffset();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.XRefSlaveInterface#getXRefInstance <em>XRef Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Instance</em>'.
	 * @see Essence.XRefSlaveInterface#getXRefInstance()
	 * @see #getXRefSlaveInterface()
	 * @generated
	 */
	EReference getXRefSlaveInterface_XRefInstance();

	/**
	 * Returns the meta object for class '{@link Essence.XRefTest <em>XRef Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Test</em>'.
	 * @see Essence.XRefTest
	 * @generated
	 */
	EClass getXRefTest();

	/**
	 * Returns the meta object for class '{@link Essence.XRefVLNV <em>XRef VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef VLNV</em>'.
	 * @see Essence.XRefVLNV
	 * @generated
	 */
	EClass getXRefVLNV();

	/**
	 * Returns the meta object for the containment reference '{@link Essence.XRefVLNV#getExtVLNV <em>Ext VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ext VLNV</em>'.
	 * @see Essence.XRefVLNV#getExtVLNV()
	 * @see #getXRefVLNV()
	 * @generated
	 */
	EReference getXRefVLNV_ExtVLNV();

	/**
	 * Returns the meta object for enum '{@link Essence.AccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Type</em>'.
	 * @see Essence.AccessType
	 * @generated
	 */
	EEnum getAccessType();

	/**
	 * Returns the meta object for enum '{@link Essence.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see Essence.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for enum '{@link Essence.BehaviorType <em>Behavior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Behavior Type</em>'.
	 * @see Essence.BehaviorType
	 * @generated
	 */
	EEnum getBehaviorType();

	/**
	 * Returns the meta object for enum '{@link Essence.BusErrorType <em>Bus Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bus Error Type</em>'.
	 * @see Essence.BusErrorType
	 * @generated
	 */
	EEnum getBusErrorType();

	/**
	 * Returns the meta object for enum '{@link Essence.EndianType <em>Endian Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Endian Type</em>'.
	 * @see Essence.EndianType
	 * @generated
	 */
	EEnum getEndianType();

	/**
	 * Returns the meta object for enum '{@link Essence.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Type</em>'.
	 * @see Essence.FunctionType
	 * @generated
	 */
	EEnum getFunctionType();

	/**
	 * Returns the meta object for enum '{@link Essence.InterfaceDefRoleType <em>Interface Def Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interface Def Role Type</em>'.
	 * @see Essence.InterfaceDefRoleType
	 * @generated
	 */
	EEnum getInterfaceDefRoleType();

	/**
	 * Returns the meta object for enum '{@link Essence.InterfaceRoleType <em>Interface Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interface Role Type</em>'.
	 * @see Essence.InterfaceRoleType
	 * @generated
	 */
	EEnum getInterfaceRoleType();

	/**
	 * Returns the meta object for enum '{@link Essence.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Type</em>'.
	 * @see Essence.MessageType
	 * @generated
	 */
	EEnum getMessageType();

	/**
	 * Returns the meta object for enum '{@link Essence.PortDirection <em>Port Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Direction</em>'.
	 * @see Essence.PortDirection
	 * @generated
	 */
	EEnum getPortDirection();

	/**
	 * Returns the meta object for enum '{@link Essence.PortInitiative <em>Port Initiative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Initiative</em>'.
	 * @see Essence.PortInitiative
	 * @generated
	 */
	EEnum getPortInitiative();

	/**
	 * Returns the meta object for enum '{@link Essence.ReservedType <em>Reserved Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reserved Type</em>'.
	 * @see Essence.ReservedType
	 * @generated
	 */
	EEnum getReservedType();

	/**
	 * Returns the meta object for enum '{@link Essence.SignType <em>Sign Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sign Type</em>'.
	 * @see Essence.SignType
	 * @generated
	 */
	EEnum getSignType();

	/**
	 * Returns the meta object for enum '{@link Essence.SpecialType <em>Special Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Special Type</em>'.
	 * @see Essence.SpecialType
	 * @generated
	 */
	EEnum getSpecialType();

	/**
	 * Returns the meta object for enum '{@link Essence.StrobeType <em>Strobe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Strobe Type</em>'.
	 * @see Essence.StrobeType
	 * @generated
	 */
	EEnum getStrobeType();

	/**
	 * Returns the meta object for enum '{@link Essence.SyncMode <em>Sync Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sync Mode</em>'.
	 * @see Essence.SyncMode
	 * @generated
	 */
	EEnum getSyncMode();

	/**
	 * Returns the meta object for enum '{@link Essence.TopSpinType <em>Top Spin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Top Spin Type</em>'.
	 * @see Essence.TopSpinType
	 * @generated
	 */
	EEnum getTopSpinType();

	/**
	 * Returns the meta object for enum '{@link Essence.VirtualType <em>Virtual Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Virtual Type</em>'.
	 * @see Essence.VirtualType
	 * @generated
	 */
	EEnum getVirtualType();

	/**
	 * Returns the meta object for data type '{@link Essence.AccessType <em>Access Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Access Type Object</em>'.
	 * @see Essence.AccessType
	 * @model instanceClass="Essence.AccessType"
	 *        extendedMetaData="name='AccessType:Object' baseType='AccessType'"
	 * @generated
	 */
	EDataType getAccessTypeObject();

	/**
	 * Returns the meta object for data type '{@link Essence.ActionType <em>Action Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Action Type Object</em>'.
	 * @see Essence.ActionType
	 * @model instanceClass="Essence.ActionType"
	 *        extendedMetaData="name='ActionType:Object' baseType='ActionType'"
	 * @generated
	 */
	EDataType getActionTypeObject();

	/**
	 * Returns the meta object for data type '{@link Essence.BehaviorType <em>Behavior Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Behavior Type Object</em>'.
	 * @see Essence.BehaviorType
	 * @model instanceClass="Essence.BehaviorType"
	 *        extendedMetaData="name='BehaviorType:Object' baseType='BehaviorType'"
	 * @generated
	 */
	EDataType getBehaviorTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Boolean Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean Expr</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='BooleanExpr' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getBooleanExpr();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean Literal</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='BooleanLiteral' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getBooleanLiteral();

	/**
	 * Returns the meta object for data type '{@link Essence.BusErrorType <em>Bus Error Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bus Error Type Object</em>'.
	 * @see Essence.BusErrorType
	 * @model instanceClass="Essence.BusErrorType"
	 *        extendedMetaData="name='BusErrorType:Object' baseType='BusErrorType'"
	 * @generated
	 */
	EDataType getBusErrorTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Common Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Common Expr</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CommonExpr' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getCommonExpr();

	/**
	 * Returns the meta object for data type '{@link Essence.EndianType <em>Endian Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Endian Type Object</em>'.
	 * @see Essence.EndianType
	 * @model instanceClass="Essence.EndianType"
	 *        extendedMetaData="name='EndianType:Object' baseType='EndianType'"
	 * @generated
	 */
	EDataType getEndianTypeObject();

	/**
	 * Returns the meta object for data type '{@link Essence.FunctionType <em>Function Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Function Type Object</em>'.
	 * @see Essence.FunctionType
	 * @model instanceClass="Essence.FunctionType"
	 *        extendedMetaData="name='FunctionType:Object' baseType='FunctionType'"
	 * @generated
	 */
	EDataType getFunctionTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Integer Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer Expr</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='IntegerExpr' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getIntegerExpr();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer Literal</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='IntegerLiteral' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getIntegerLiteral();

	/**
	 * Returns the meta object for data type '{@link Essence.InterfaceDefRoleType <em>Interface Def Role Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Interface Def Role Type Object</em>'.
	 * @see Essence.InterfaceDefRoleType
	 * @model instanceClass="Essence.InterfaceDefRoleType"
	 *        extendedMetaData="name='InterfaceDefRoleType:Object' baseType='InterfaceDefRoleType'"
	 * @generated
	 */
	EDataType getInterfaceDefRoleTypeObject();

	/**
	 * Returns the meta object for data type '{@link Essence.InterfaceRoleType <em>Interface Role Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Interface Role Type Object</em>'.
	 * @see Essence.InterfaceRoleType
	 * @model instanceClass="Essence.InterfaceRoleType"
	 *        extendedMetaData="name='InterfaceRoleType:Object' baseType='InterfaceRoleType'"
	 * @generated
	 */
	EDataType getInterfaceRoleTypeObject();

	/**
	 * Returns the meta object for data type '{@link Essence.MessageType <em>Message Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Type Object</em>'.
	 * @see Essence.MessageType
	 * @model instanceClass="Essence.MessageType"
	 *        extendedMetaData="name='MessageType:Object' baseType='MessageType'"
	 * @generated
	 */
	EDataType getMessageTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Path Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Path Expr</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='PathExpr' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getPathExpr();

	/**
	 * Returns the meta object for data type '{@link Essence.PortDirection <em>Port Direction Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Port Direction Object</em>'.
	 * @see Essence.PortDirection
	 * @model instanceClass="Essence.PortDirection"
	 *        extendedMetaData="name='PortDirection:Object' baseType='PortDirection'"
	 * @generated
	 */
	EDataType getPortDirectionObject();

	/**
	 * Returns the meta object for data type '{@link Essence.PortInitiative <em>Port Initiative Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Port Initiative Object</em>'.
	 * @see Essence.PortInitiative
	 * @model instanceClass="Essence.PortInitiative"
	 *        extendedMetaData="name='PortInitiative:Object' baseType='PortInitiative'"
	 * @generated
	 */
	EDataType getPortInitiativeObject();

	/**
	 * Returns the meta object for data type '{@link Essence.ReservedType <em>Reserved Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reserved Type Object</em>'.
	 * @see Essence.ReservedType
	 * @model instanceClass="Essence.ReservedType"
	 *        extendedMetaData="name='ReservedType:Object' baseType='ReservedType'"
	 * @generated
	 */
	EDataType getReservedTypeObject();

	/**
	 * Returns the meta object for data type '{@link Essence.SignType <em>Sign Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sign Type Object</em>'.
	 * @see Essence.SignType
	 * @model instanceClass="Essence.SignType"
	 *        extendedMetaData="name='SignType:Object' baseType='SignType'"
	 * @generated
	 */
	EDataType getSignTypeObject();

	/**
	 * Returns the meta object for data type '{@link Essence.SpecialType <em>Special Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Special Type Object</em>'.
	 * @see Essence.SpecialType
	 * @model instanceClass="Essence.SpecialType"
	 *        extendedMetaData="name='SpecialType:Object' baseType='SpecialType'"
	 * @generated
	 */
	EDataType getSpecialTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String Expr</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='StringExpr' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getStringExpr();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String Literal</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='StringLiteral' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getStringLiteral();

	/**
	 * Returns the meta object for data type '{@link Essence.StrobeType <em>Strobe Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Strobe Type Object</em>'.
	 * @see Essence.StrobeType
	 * @model instanceClass="Essence.StrobeType"
	 *        extendedMetaData="name='StrobeType:Object' baseType='StrobeType'"
	 * @generated
	 */
	EDataType getStrobeTypeObject();

	/**
	 * Returns the meta object for data type '{@link Essence.SyncMode <em>Sync Mode Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sync Mode Object</em>'.
	 * @see Essence.SyncMode
	 * @model instanceClass="Essence.SyncMode"
	 *        extendedMetaData="name='SyncMode:Object' baseType='SyncMode'"
	 * @generated
	 */
	EDataType getSyncModeObject();

	/**
	 * Returns the meta object for data type '{@link Essence.TopSpinType <em>Top Spin Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Top Spin Type Object</em>'.
	 * @see Essence.TopSpinType
	 * @model instanceClass="Essence.TopSpinType"
	 *        extendedMetaData="name='TopSpinType:Object' baseType='TopSpinType'"
	 * @generated
	 */
	EDataType getTopSpinTypeObject();

	/**
	 * Returns the meta object for data type '{@link Essence.VirtualType <em>Virtual Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Virtual Type Object</em>'.
	 * @see Essence.VirtualType
	 * @model instanceClass="Essence.VirtualType"
	 *        extendedMetaData="name='VirtualType:Object' baseType='VirtualType'"
	 * @generated
	 */
	EDataType getVirtualTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EssenceFactory getEssenceFactory();

} //EssencePackage
