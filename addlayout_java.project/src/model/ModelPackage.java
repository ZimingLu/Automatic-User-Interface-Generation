/**
 */
package model;

import modelextension.ModelextensionPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see model.ModelFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.infineon.com/essence.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "essence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.EssenceBaseImpl <em>Essence Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.EssenceBaseImpl
	 * @see model.impl.ModelPackageImpl#getEssenceBase()
	 * @generated
	 */
	int ESSENCE_BASE = 42;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENCE_BASE__PARENT = ModelextensionPackage.ESSENCE_BASE_EXTENSION__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENCE_BASE__CLASS_NAME = ModelextensionPackage.ESSENCE_BASE_EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Essence Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENCE_BASE_FEATURE_COUNT = ModelextensionPackage.ESSENCE_BASE_EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Essence Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESSENCE_BASE_OPERATION_COUNT = ModelextensionPackage.ESSENCE_BASE_EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.AccessImpl <em>Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AccessImpl
	 * @see model.impl.ModelPackageImpl#getAccess()
	 * @generated
	 */
	int ACCESS = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__PARENT = ESSENCE_BASE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__CLASS_NAME = ESSENCE_BASE__CLASS_NAME;

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
	 * The feature id for the '<em><b>Clear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__CLEAR = ESSENCE_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__ENABLE = ESSENCE_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Interrupt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__INTERRUPT = ESSENCE_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pulse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__PULSE = ESSENCE_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__RESET = ESSENCE_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__SET = ESSENCE_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__STATUS = ESSENCE_BASE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Toggle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__TOGGLE = ESSENCE_BASE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Register</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__REGISTER = ESSENCE_BASE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS__TRIGGER = ESSENCE_BASE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_FEATURE_COUNT = ESSENCE_BASE_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_OPERATION_COUNT = ESSENCE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.SubElementAccessImpl <em>Sub Element Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SubElementAccessImpl
	 * @see model.impl.ModelPackageImpl#getSubElementAccess()
	 * @generated
	 */
	int SUB_ELEMENT_ACCESS = 148;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ELEMENT_ACCESS__PARENT = ESSENCE_BASE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ELEMENT_ACCESS__CLASS_NAME = ESSENCE_BASE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.SimpleSubElementAccessImpl <em>Simple Sub Element Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SimpleSubElementAccessImpl
	 * @see model.impl.ModelPackageImpl#getSimpleSubElementAccess()
	 * @generated
	 */
	int SIMPLE_SUB_ELEMENT_ACCESS = 136;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SUB_ELEMENT_ACCESS__PARENT = SUB_ELEMENT_ACCESS__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SUB_ELEMENT_ACCESS__CLASS_NAME = SUB_ELEMENT_ACCESS__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.AccessByIndexImpl <em>Access By Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AccessByIndexImpl
	 * @see model.impl.ModelPackageImpl#getAccessByIndex()
	 * @generated
	 */
	int ACCESS_BY_INDEX = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_BY_INDEX__PARENT = SIMPLE_SUB_ELEMENT_ACCESS__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_BY_INDEX__CLASS_NAME = SIMPLE_SUB_ELEMENT_ACCESS__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.AccessByNameImpl <em>Access By Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AccessByNameImpl
	 * @see model.impl.ModelPackageImpl#getAccessByName()
	 * @generated
	 */
	int ACCESS_BY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_BY_NAME__PARENT = SIMPLE_SUB_ELEMENT_ACCESS__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_BY_NAME__CLASS_NAME = SIMPLE_SUB_ELEMENT_ACCESS__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.SingleSourceNodeImpl <em>Single Source Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SingleSourceNodeImpl
	 * @see model.impl.ModelPackageImpl#getSingleSourceNode()
	 * @generated
	 */
	int SINGLE_SOURCE_NODE = 138;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_SOURCE_NODE__PARENT = ESSENCE_BASE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_SOURCE_NODE__CLASS_NAME = ESSENCE_BASE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.IndexVarUserImpl <em>Index Var User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.IndexVarUserImpl
	 * @see model.impl.ModelPackageImpl#getIndexVarUser()
	 * @generated
	 */
	int INDEX_VAR_USER = 53;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_VAR_USER__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_VAR_USER__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The operation id for the '<em>Create Ix Var Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_VAR_USER___CREATE_IX_VAR_MAP = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_VAR_USER___GET_NAME_VALUE__MAP = SINGLE_SOURCE_NODE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Hidden Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_VAR_USER___GET_HIDDEN_VALUE__MAP = SINGLE_SOURCE_NODE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Short Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_VAR_USER___GET_SHORT_NAME_VALUE__MAP = SINGLE_SOURCE_NODE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Index Var User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_VAR_USER_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link model.impl.AccessConditionImpl <em>Access Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AccessConditionImpl
	 * @see model.impl.ModelPackageImpl#getAccessCondition()
	 * @generated
	 */
	int ACCESS_CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION__PARENT = INDEX_VAR_USER__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION__CLASS_NAME = INDEX_VAR_USER__CLASS_NAME;

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
	 * The operation id for the '<em>Create Ix Var Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION___CREATE_IX_VAR_MAP = INDEX_VAR_USER___CREATE_IX_VAR_MAP;

	/**
	 * The operation id for the '<em>Get Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION___GET_NAME_VALUE__MAP = INDEX_VAR_USER___GET_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Hidden Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION___GET_HIDDEN_VALUE__MAP = INDEX_VAR_USER___GET_HIDDEN_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Short Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION___GET_SHORT_NAME_VALUE__MAP = INDEX_VAR_USER___GET_SHORT_NAME_VALUE__MAP;

	/**
	 * The number of operations of the '<em>Access Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONDITION_OPERATION_COUNT = INDEX_VAR_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.AccessLevelImpl <em>Access Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AccessLevelImpl
	 * @see model.impl.ModelPackageImpl#getAccessLevel()
	 * @generated
	 */
	int ACCESS_LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LEVEL__PARENT = INDEX_VAR_USER__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LEVEL__CLASS_NAME = INDEX_VAR_USER__CLASS_NAME;

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
	 * The operation id for the '<em>Create Ix Var Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LEVEL___CREATE_IX_VAR_MAP = INDEX_VAR_USER___CREATE_IX_VAR_MAP;

	/**
	 * The operation id for the '<em>Get Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LEVEL___GET_NAME_VALUE__MAP = INDEX_VAR_USER___GET_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Hidden Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LEVEL___GET_HIDDEN_VALUE__MAP = INDEX_VAR_USER___GET_HIDDEN_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Short Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LEVEL___GET_SHORT_NAME_VALUE__MAP = INDEX_VAR_USER___GET_SHORT_NAME_VALUE__MAP;

	/**
	 * The number of operations of the '<em>Access Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_LEVEL_OPERATION_COUNT = INDEX_VAR_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.AddressBlockImpl <em>Address Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AddressBlockImpl
	 * @see model.impl.ModelPackageImpl#getAddressBlock()
	 * @generated
	 */
	int ADDRESS_BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_BLOCK__PARENT = ESSENCE_BASE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_BLOCK__CLASS_NAME = ESSENCE_BASE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DataTypeImpl
	 * @see model.impl.ModelPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__PARENT = ESSENCE_BASE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__CLASS_NAME = ESSENCE_BASE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.ReturnDataTypeImpl <em>Return Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ReturnDataTypeImpl
	 * @see model.impl.ModelPackageImpl#getReturnDataType()
	 * @generated
	 */
	int RETURN_DATA_TYPE = 119;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_DATA_TYPE__PARENT = DATA_TYPE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_DATA_TYPE__CLASS_NAME = DATA_TYPE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.ValueDataTypeImpl <em>Value Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ValueDataTypeImpl
	 * @see model.impl.ModelPackageImpl#getValueDataType()
	 * @generated
	 */
	int VALUE_DATA_TYPE = 157;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DATA_TYPE__PARENT = RETURN_DATA_TYPE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DATA_TYPE__CLASS_NAME = RETURN_DATA_TYPE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.ComplexDataTypeImpl <em>Complex Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ComplexDataTypeImpl
	 * @see model.impl.ModelPackageImpl#getComplexDataType()
	 * @generated
	 */
	int COMPLEX_DATA_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_TYPE__PARENT = VALUE_DATA_TYPE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_TYPE__CLASS_NAME = VALUE_DATA_TYPE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ArrayImpl
	 * @see model.impl.ModelPackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__PARENT = COMPLEX_DATA_TYPE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__CLASS_NAME = COMPLEX_DATA_TYPE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.ArrayDimensionImpl <em>Array Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ArrayDimensionImpl
	 * @see model.impl.ModelPackageImpl#getArrayDimension()
	 * @generated
	 */
	int ARRAY_DIMENSION = 7;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DIMENSION__PARENT = ESSENCE_BASE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_DIMENSION__CLASS_NAME = ESSENCE_BASE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.BitFieldElementImpl <em>Bit Field Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BitFieldElementImpl
	 * @see model.impl.ModelPackageImpl#getBitFieldElement()
	 * @generated
	 */
	int BIT_FIELD_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_ELEMENT__PARENT = INDEX_VAR_USER__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_ELEMENT__CLASS_NAME = INDEX_VAR_USER__CLASS_NAME;

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
	 * The operation id for the '<em>Create Ix Var Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_ELEMENT___CREATE_IX_VAR_MAP = INDEX_VAR_USER___CREATE_IX_VAR_MAP;

	/**
	 * The operation id for the '<em>Get Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_ELEMENT___GET_NAME_VALUE__MAP = INDEX_VAR_USER___GET_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Hidden Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_ELEMENT___GET_HIDDEN_VALUE__MAP = INDEX_VAR_USER___GET_HIDDEN_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Short Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_ELEMENT___GET_SHORT_NAME_VALUE__MAP = INDEX_VAR_USER___GET_SHORT_NAME_VALUE__MAP;

	/**
	 * The number of operations of the '<em>Bit Field Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_ELEMENT_OPERATION_COUNT = INDEX_VAR_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.BitFieldSequenceElementImpl <em>Bit Field Sequence Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BitFieldSequenceElementImpl
	 * @see model.impl.ModelPackageImpl#getBitFieldSequenceElement()
	 * @generated
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT__PARENT = BIT_FIELD_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT__CLASS_NAME = BIT_FIELD_ELEMENT__CLASS_NAME;

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
	 * The feature id for the '<em><b>Sequence Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT__SEQUENCE_INDEX = BIT_FIELD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT__WIDTH = BIT_FIELD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bit Field Sequence Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT = BIT_FIELD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Ix Var Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT___CREATE_IX_VAR_MAP = BIT_FIELD_ELEMENT___CREATE_IX_VAR_MAP;

	/**
	 * The operation id for the '<em>Get Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT___GET_NAME_VALUE__MAP = BIT_FIELD_ELEMENT___GET_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Hidden Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT___GET_HIDDEN_VALUE__MAP = BIT_FIELD_ELEMENT___GET_HIDDEN_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Short Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT___GET_SHORT_NAME_VALUE__MAP = BIT_FIELD_ELEMENT___GET_SHORT_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Offset Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT___GET_OFFSET_VALUE__MAP = BIT_FIELD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Offset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT___SET_OFFSET__STRING = BIT_FIELD_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT___GET_LENGTH__MAP = BIT_FIELD_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Full Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT___GET_FULL_LENGTH__MAP = BIT_FIELD_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Bit Field Sequence Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_ELEMENT_OPERATION_COUNT = BIT_FIELD_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link model.impl.BitFieldImpl <em>Bit Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BitFieldImpl
	 * @see model.impl.ModelPackageImpl#getBitField()
	 * @generated
	 */
	int BIT_FIELD = 8;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__PARENT = BIT_FIELD_SEQUENCE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__CLASS_NAME = BIT_FIELD_SEQUENCE_ELEMENT__CLASS_NAME;

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
	 * The feature id for the '<em><b>Sequence Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__SEQUENCE_INDEX = BIT_FIELD_SEQUENCE_ELEMENT__SEQUENCE_INDEX;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__WIDTH = BIT_FIELD_SEQUENCE_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Bit Reset Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__BIT_RESET_TYPE = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access External</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__ACCESS_EXTERNAL = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access Internal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__ACCESS_INTERNAL = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__MAX_VAL = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__MIN_VAL = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__RESERVED = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sign Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__SIGN_INTERPRETATION = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__VIRTUAL = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__DEFAULT_VALUE = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Default Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__DEFAULT_MASK = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Access Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__ACCESS_LEVEL = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Enumeration Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__ENUMERATION_ELEMENT = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Check Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD__CHECK_PARENT = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Bit Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_FEATURE_COUNT = BIT_FIELD_SEQUENCE_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Create Ix Var Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD___CREATE_IX_VAR_MAP = BIT_FIELD_SEQUENCE_ELEMENT___CREATE_IX_VAR_MAP;

	/**
	 * The operation id for the '<em>Get Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD___GET_NAME_VALUE__MAP = BIT_FIELD_SEQUENCE_ELEMENT___GET_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Hidden Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD___GET_HIDDEN_VALUE__MAP = BIT_FIELD_SEQUENCE_ELEMENT___GET_HIDDEN_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Short Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD___GET_SHORT_NAME_VALUE__MAP = BIT_FIELD_SEQUENCE_ELEMENT___GET_SHORT_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Offset Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD___GET_OFFSET_VALUE__MAP = BIT_FIELD_SEQUENCE_ELEMENT___GET_OFFSET_VALUE__MAP;

	/**
	 * The operation id for the '<em>Set Offset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD___SET_OFFSET__STRING = BIT_FIELD_SEQUENCE_ELEMENT___SET_OFFSET__STRING;

	/**
	 * The operation id for the '<em>Get Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD___GET_LENGTH__MAP = BIT_FIELD_SEQUENCE_ELEMENT___GET_LENGTH__MAP;

	/**
	 * The operation id for the '<em>Get Full Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD___GET_FULL_LENGTH__MAP = BIT_FIELD_SEQUENCE_ELEMENT___GET_FULL_LENGTH__MAP;

	/**
	 * The operation id for the '<em>Refresh Bit Reset Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD___REFRESH_BIT_RESET_TYPE = BIT_FIELD_SEQUENCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Min Val Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD___GET_MIN_VAL_VALUE__MAP = BIT_FIELD_SEQUENCE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Max Val Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD___GET_MAX_VAL_VALUE__MAP = BIT_FIELD_SEQUENCE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bit Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_OPERATION_COUNT = BIT_FIELD_SEQUENCE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link model.impl.BitFieldGapElementImpl <em>Bit Field Gap Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BitFieldGapElementImpl
	 * @see model.impl.ModelPackageImpl#getBitFieldGapElement()
	 * @generated
	 */
	int BIT_FIELD_GAP_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT__PARENT = BIT_FIELD_SEQUENCE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT__CLASS_NAME = BIT_FIELD_SEQUENCE_ELEMENT__CLASS_NAME;

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
	 * The feature id for the '<em><b>Sequence Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT__SEQUENCE_INDEX = BIT_FIELD_SEQUENCE_ELEMENT__SEQUENCE_INDEX;

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
	 * The operation id for the '<em>Create Ix Var Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT___CREATE_IX_VAR_MAP = BIT_FIELD_SEQUENCE_ELEMENT___CREATE_IX_VAR_MAP;

	/**
	 * The operation id for the '<em>Get Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT___GET_NAME_VALUE__MAP = BIT_FIELD_SEQUENCE_ELEMENT___GET_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Hidden Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT___GET_HIDDEN_VALUE__MAP = BIT_FIELD_SEQUENCE_ELEMENT___GET_HIDDEN_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Short Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT___GET_SHORT_NAME_VALUE__MAP = BIT_FIELD_SEQUENCE_ELEMENT___GET_SHORT_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Offset Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT___GET_OFFSET_VALUE__MAP = BIT_FIELD_SEQUENCE_ELEMENT___GET_OFFSET_VALUE__MAP;

	/**
	 * The operation id for the '<em>Set Offset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT___SET_OFFSET__STRING = BIT_FIELD_SEQUENCE_ELEMENT___SET_OFFSET__STRING;

	/**
	 * The operation id for the '<em>Get Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT___GET_LENGTH__MAP = BIT_FIELD_SEQUENCE_ELEMENT___GET_LENGTH__MAP;

	/**
	 * The operation id for the '<em>Get Full Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT___GET_FULL_LENGTH__MAP = BIT_FIELD_SEQUENCE_ELEMENT___GET_FULL_LENGTH__MAP;

	/**
	 * The number of operations of the '<em>Bit Field Gap Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_GAP_ELEMENT_OPERATION_COUNT = BIT_FIELD_SEQUENCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.BitFieldSequenceImpl <em>Bit Field Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BitFieldSequenceImpl
	 * @see model.impl.ModelPackageImpl#getBitFieldSequence()
	 * @generated
	 */
	int BIT_FIELD_SEQUENCE = 11;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE__PARENT = BIT_FIELD_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE__CLASS_NAME = BIT_FIELD_ELEMENT__CLASS_NAME;

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
	 * The operation id for the '<em>Create Ix Var Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE___CREATE_IX_VAR_MAP = BIT_FIELD_ELEMENT___CREATE_IX_VAR_MAP;

	/**
	 * The operation id for the '<em>Get Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE___GET_NAME_VALUE__MAP = BIT_FIELD_ELEMENT___GET_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Hidden Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE___GET_HIDDEN_VALUE__MAP = BIT_FIELD_ELEMENT___GET_HIDDEN_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Short Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE___GET_SHORT_NAME_VALUE__MAP = BIT_FIELD_ELEMENT___GET_SHORT_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Offset Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE___GET_OFFSET_VALUE__MAP = BIT_FIELD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Offset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE___SET_OFFSET__STRING = BIT_FIELD_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Count Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE___GET_COUNT_VALUE__MAP = BIT_FIELD_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Min Index Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE___GET_MIN_INDEX_VALUE__MAP = BIT_FIELD_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Index Step Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE___GET_INDEX_STEP_VALUE__MAP = BIT_FIELD_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Index Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE___GET_INDEX_VAR = BIT_FIELD_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Alt Format</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE___GET_ALT_FORMAT = BIT_FIELD_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE___GET_LENGTH__MAP = BIT_FIELD_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE___GET_ELEMENT = BIT_FIELD_ELEMENT_OPERATION_COUNT + 10;

	/**
	 * The number of operations of the '<em>Bit Field Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FIELD_SEQUENCE_OPERATION_COUNT = BIT_FIELD_ELEMENT_OPERATION_COUNT + 11;

	/**
	 * The meta object id for the '{@link model.impl.VarDefImpl <em>Var Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.VarDefImpl
	 * @see model.impl.ModelPackageImpl#getVarDef()
	 * @generated
	 */
	int VAR_DEF = 158;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF__TYPE = SINGLE_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Var Def Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF__VAR_DEF_VALUE = SINGLE_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Var Def Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF__VAR_DEF_OVERRIDE = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Var Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Var Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ParamDeclImpl <em>Param Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ParamDeclImpl
	 * @see model.impl.ModelPackageImpl#getParamDecl()
	 * @generated
	 */
	int PARAM_DECL = 94;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL__PARENT = VAR_DEF__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL__CLASS_NAME = VAR_DEF__CLASS_NAME;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL__TYPE = VAR_DEF__TYPE;

	/**
	 * The feature id for the '<em><b>Var Def Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL__VAR_DEF_VALUE = VAR_DEF__VAR_DEF_VALUE;

	/**
	 * The feature id for the '<em><b>Var Def Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL__VAR_DEF_OVERRIDE = VAR_DEF__VAR_DEF_OVERRIDE;

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
	 * The meta object id for the '{@link model.impl.BooleanDeclImpl <em>Boolean Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BooleanDeclImpl
	 * @see model.impl.ModelPackageImpl#getBooleanDecl()
	 * @generated
	 */
	int BOOLEAN_DECL = 13;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DECL__PARENT = PARAM_DECL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DECL__CLASS_NAME = PARAM_DECL__CLASS_NAME;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DECL__TYPE = PARAM_DECL__TYPE;

	/**
	 * The feature id for the '<em><b>Var Def Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DECL__VAR_DEF_VALUE = PARAM_DECL__VAR_DEF_VALUE;

	/**
	 * The feature id for the '<em><b>Var Def Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DECL__VAR_DEF_OVERRIDE = PARAM_DECL__VAR_DEF_OVERRIDE;

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
	 * The meta object id for the '{@link model.impl.ConstDefImpl <em>Const Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ConstDefImpl
	 * @see model.impl.ModelPackageImpl#getConstDef()
	 * @generated
	 */
	int CONST_DEF = 26;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF__PARENT = VAR_DEF__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF__CLASS_NAME = VAR_DEF__CLASS_NAME;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF__TYPE = VAR_DEF__TYPE;

	/**
	 * The feature id for the '<em><b>Var Def Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF__VAR_DEF_VALUE = VAR_DEF__VAR_DEF_VALUE;

	/**
	 * The feature id for the '<em><b>Var Def Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF__VAR_DEF_OVERRIDE = VAR_DEF__VAR_DEF_OVERRIDE;

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
	 * The meta object id for the '{@link model.impl.BooleanDefImpl <em>Boolean Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BooleanDefImpl
	 * @see model.impl.ModelPackageImpl#getBooleanDef()
	 * @generated
	 */
	int BOOLEAN_DEF = 14;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DEF__PARENT = CONST_DEF__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DEF__CLASS_NAME = CONST_DEF__CLASS_NAME;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DEF__TYPE = CONST_DEF__TYPE;

	/**
	 * The feature id for the '<em><b>Var Def Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DEF__VAR_DEF_VALUE = CONST_DEF__VAR_DEF_VALUE;

	/**
	 * The feature id for the '<em><b>Var Def Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_DEF__VAR_DEF_OVERRIDE = CONST_DEF__VAR_DEF_OVERRIDE;

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
	 * The meta object id for the '{@link model.impl.GenericDeclImpl <em>Generic Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.GenericDeclImpl
	 * @see model.impl.ModelPackageImpl#getGenericDecl()
	 * @generated
	 */
	int GENERIC_DECL = 50;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL__PARENT = VAR_DEF__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL__CLASS_NAME = VAR_DEF__CLASS_NAME;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL__TYPE = VAR_DEF__TYPE;

	/**
	 * The feature id for the '<em><b>Var Def Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL__VAR_DEF_VALUE = VAR_DEF__VAR_DEF_VALUE;

	/**
	 * The feature id for the '<em><b>Var Def Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL__VAR_DEF_OVERRIDE = VAR_DEF__VAR_DEF_OVERRIDE;

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
	 * The meta object id for the '{@link model.impl.BooleanGenDeclImpl <em>Boolean Gen Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BooleanGenDeclImpl
	 * @see model.impl.ModelPackageImpl#getBooleanGenDecl()
	 * @generated
	 */
	int BOOLEAN_GEN_DECL = 15;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GEN_DECL__PARENT = GENERIC_DECL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GEN_DECL__CLASS_NAME = GENERIC_DECL__CLASS_NAME;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GEN_DECL__TYPE = GENERIC_DECL__TYPE;

	/**
	 * The feature id for the '<em><b>Var Def Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GEN_DECL__VAR_DEF_VALUE = GENERIC_DECL__VAR_DEF_VALUE;

	/**
	 * The feature id for the '<em><b>Var Def Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_GEN_DECL__VAR_DEF_OVERRIDE = GENERIC_DECL__VAR_DEF_OVERRIDE;

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
	 * The meta object id for the '{@link model.impl.ModelRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ModelRootImpl
	 * @see model.impl.ModelPackageImpl#getModelRoot()
	 * @generated
	 */
	int MODEL_ROOT = 78;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The feature id for the '<em><b>Param Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__PARAM_MAP = SINGLE_SOURCE_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__GENERIC_MAP = SINGLE_SOURCE_NODE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BusImpl
	 * @see model.impl.ModelPackageImpl#getBus()
	 * @generated
	 */
	int BUS = 16;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__PARENT = MODEL_ROOT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__CLASS_NAME = MODEL_ROOT__CLASS_NAME;

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
	 * The feature id for the '<em><b>Param Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__PARAM_MAP = MODEL_ROOT__PARAM_MAP;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__GENERIC_MAP = MODEL_ROOT__GENERIC_MAP;

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
	 * The meta object id for the '{@link model.impl.GeneralInstanceImpl <em>General Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.GeneralInstanceImpl
	 * @see model.impl.ModelPackageImpl#getGeneralInstance()
	 * @generated
	 */
	int GENERAL_INSTANCE = 45;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INSTANCE__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INSTANCE__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InstanceImpl
	 * @see model.impl.ModelPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 54;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__PARENT = GENERAL_INSTANCE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__CLASS_NAME = GENERAL_INSTANCE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.BusInstanceImpl <em>Bus Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BusInstanceImpl
	 * @see model.impl.ModelPackageImpl#getBusInstance()
	 * @generated
	 */
	int BUS_INSTANCE = 17;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__PARENT = INSTANCE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INSTANCE__CLASS_NAME = INSTANCE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.BusInterfaceMapImpl <em>Bus Interface Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BusInterfaceMapImpl
	 * @see model.impl.ModelPackageImpl#getBusInterfaceMap()
	 * @generated
	 */
	int BUS_INTERFACE_MAP = 18;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INTERFACE_MAP__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_INTERFACE_MAP__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.BusNoneInterfaceMapImpl <em>Bus None Interface Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BusNoneInterfaceMapImpl
	 * @see model.impl.ModelPackageImpl#getBusNoneInterfaceMap()
	 * @generated
	 */
	int BUS_NONE_INTERFACE_MAP = 19;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NONE_INTERFACE_MAP__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NONE_INTERFACE_MAP__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.GeneralPortImpl <em>General Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.GeneralPortImpl
	 * @see model.impl.ModelPackageImpl#getGeneralPort()
	 * @generated
	 */
	int GENERAL_PORT = 48;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PORT__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PORT__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PortImpl
	 * @see model.impl.ModelPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 100;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PARENT = GENERAL_PORT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CLASS_NAME = GENERAL_PORT__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.RealPortImpl <em>Real Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RealPortImpl
	 * @see model.impl.ModelPackageImpl#getRealPort()
	 * @generated
	 */
	int REAL_PORT = 109;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_PORT__PARENT = PORT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_PORT__CLASS_NAME = PORT__CLASS_NAME;

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
	 * The operation id for the '<em>Get Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_PORT___GET_DATA_TYPE = PORT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link model.impl.CablePortImpl <em>Cable Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CablePortImpl
	 * @see model.impl.ModelPackageImpl#getCablePort()
	 * @generated
	 */
	int CABLE_PORT = 20;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_PORT__PARENT = REAL_PORT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_PORT__CLASS_NAME = REAL_PORT__CLASS_NAME;

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
	 * The operation id for the '<em>Get Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_PORT___GET_DATA_TYPE = REAL_PORT___GET_DATA_TYPE;

	/**
	 * The number of operations of the '<em>Cable Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_PORT_OPERATION_COUNT = REAL_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SignalImpl
	 * @see model.impl.ModelPackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 125;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The operation id for the '<em>Get Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL___GET_DATA_TYPE = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link model.impl.CableSignalImpl <em>Cable Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CableSignalImpl
	 * @see model.impl.ModelPackageImpl#getCableSignal()
	 * @generated
	 */
	int CABLE_SIGNAL = 21;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_SIGNAL__PARENT = SIGNAL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_SIGNAL__CLASS_NAME = SIGNAL__CLASS_NAME;

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
	 * The operation id for the '<em>Get Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_SIGNAL___GET_DATA_TYPE = SIGNAL___GET_DATA_TYPE;

	/**
	 * The number of operations of the '<em>Cable Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_SIGNAL_OPERATION_COUNT = SIGNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ComponentImpl
	 * @see model.impl.ModelPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 23;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PARENT = MODEL_ROOT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CLASS_NAME = MODEL_ROOT__CLASS_NAME;

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
	 * The feature id for the '<em><b>Param Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PARAM_MAP = MODEL_ROOT__PARAM_MAP;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__GENERIC_MAP = MODEL_ROOT__GENERIC_MAP;

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
	 * The meta object id for the '{@link model.impl.InterfaceInstanceImpl <em>Interface Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InterfaceInstanceImpl
	 * @see model.impl.ModelPackageImpl#getInterfaceInstance()
	 * @generated
	 */
	int INTERFACE_INSTANCE = 70;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INSTANCE__PARENT = INSTANCE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_INSTANCE__CLASS_NAME = INSTANCE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ComponentInstanceImpl
	 * @see model.impl.ModelPackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 24;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PARENT = INTERFACE_INSTANCE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__CLASS_NAME = INTERFACE_INSTANCE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.SignalOwnerImpl <em>Signal Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SignalOwnerImpl
	 * @see model.impl.ModelPackageImpl#getSignalOwner()
	 * @generated
	 */
	int SIGNAL_OWNER = 127;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OWNER__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OWNER__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ConnectionImpl
	 * @see model.impl.ModelPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 25;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PARENT = SIGNAL_OWNER__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CLASS_NAME = SIGNAL_OWNER__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.VarDefBlockImpl <em>Var Def Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.VarDefBlockImpl
	 * @see model.impl.ModelPackageImpl#getVarDefBlock()
	 * @generated
	 */
	int VAR_DEF_BLOCK = 159;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF_BLOCK__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEF_BLOCK__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.ConstDefBlockImpl <em>Const Def Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ConstDefBlockImpl
	 * @see model.impl.ModelPackageImpl#getConstDefBlock()
	 * @generated
	 */
	int CONST_DEF_BLOCK = 27;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF_BLOCK__PARENT = VAR_DEF_BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONST_DEF_BLOCK__CLASS_NAME = VAR_DEF_BLOCK__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.DataDeclImpl <em>Data Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DataDeclImpl
	 * @see model.impl.ModelPackageImpl#getDataDecl()
	 * @generated
	 */
	int DATA_DECL = 28;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECL__PARENT = PARAM_DECL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECL__CLASS_NAME = PARAM_DECL__CLASS_NAME;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECL__TYPE = PARAM_DECL__TYPE;

	/**
	 * The feature id for the '<em><b>Var Def Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECL__VAR_DEF_VALUE = PARAM_DECL__VAR_DEF_VALUE;

	/**
	 * The feature id for the '<em><b>Var Def Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DECL__VAR_DEF_OVERRIDE = PARAM_DECL__VAR_DEF_OVERRIDE;

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
	 * The meta object id for the '{@link model.impl.DataDefImpl <em>Data Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DataDefImpl
	 * @see model.impl.ModelPackageImpl#getDataDef()
	 * @generated
	 */
	int DATA_DEF = 29;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF__PARENT = CONST_DEF__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF__CLASS_NAME = CONST_DEF__CLASS_NAME;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF__TYPE = CONST_DEF__TYPE;

	/**
	 * The feature id for the '<em><b>Var Def Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF__VAR_DEF_VALUE = CONST_DEF__VAR_DEF_VALUE;

	/**
	 * The feature id for the '<em><b>Var Def Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF__VAR_DEF_OVERRIDE = CONST_DEF__VAR_DEF_OVERRIDE;

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
	 * The meta object id for the '{@link model.impl.DataGenDeclImpl <em>Data Gen Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DataGenDeclImpl
	 * @see model.impl.ModelPackageImpl#getDataGenDecl()
	 * @generated
	 */
	int DATA_GEN_DECL = 30;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GEN_DECL__PARENT = GENERIC_DECL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GEN_DECL__CLASS_NAME = GENERIC_DECL__CLASS_NAME;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GEN_DECL__TYPE = GENERIC_DECL__TYPE;

	/**
	 * The feature id for the '<em><b>Var Def Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GEN_DECL__VAR_DEF_VALUE = GENERIC_DECL__VAR_DEF_VALUE;

	/**
	 * The feature id for the '<em><b>Var Def Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GEN_DECL__VAR_DEF_OVERRIDE = GENERIC_DECL__VAR_DEF_OVERRIDE;

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
	 * The meta object id for the '{@link model.impl.DataTypeElementImpl <em>Data Type Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DataTypeElementImpl
	 * @see model.impl.ModelPackageImpl#getDataTypeElement()
	 * @generated
	 */
	int DATA_TYPE_ELEMENT = 32;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ELEMENT__PARENT = ESSENCE_BASE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_ELEMENT__CLASS_NAME = ESSENCE_BASE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.DescriptionItemImpl <em>Description Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DescriptionItemImpl
	 * @see model.impl.ModelPackageImpl#getDescriptionItem()
	 * @generated
	 */
	int DESCRIPTION_ITEM = 33;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ITEM__PARENT = ESSENCE_BASE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_ITEM__CLASS_NAME = ESSENCE_BASE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DocumentRootImpl
	 * @see model.impl.ModelPackageImpl#getDocumentRoot()
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
	 * The meta object id for the '{@link model.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.EnumImpl
	 * @see model.impl.ModelPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 35;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__PARENT = COMPLEX_DATA_TYPE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__CLASS_NAME = COMPLEX_DATA_TYPE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.EnumElementImpl <em>Enum Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.EnumElementImpl
	 * @see model.impl.ModelPackageImpl#getEnumElement()
	 * @generated
	 */
	int ENUM_ELEMENT = 36;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ELEMENT__PARENT = ESSENCE_BASE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ELEMENT__CLASS_NAME = ESSENCE_BASE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.EnumerationElementImpl <em>Enumeration Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.EnumerationElementImpl
	 * @see model.impl.ModelPackageImpl#getEnumerationElement()
	 * @generated
	 */
	int ENUMERATION_ELEMENT = 38;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT__PARENT = INDEX_VAR_USER__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT__CLASS_NAME = INDEX_VAR_USER__CLASS_NAME;

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
	 * The operation id for the '<em>Create Ix Var Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT___CREATE_IX_VAR_MAP = INDEX_VAR_USER___CREATE_IX_VAR_MAP;

	/**
	 * The operation id for the '<em>Get Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT___GET_NAME_VALUE__MAP = INDEX_VAR_USER___GET_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Hidden Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT___GET_HIDDEN_VALUE__MAP = INDEX_VAR_USER___GET_HIDDEN_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Short Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT___GET_SHORT_NAME_VALUE__MAP = INDEX_VAR_USER___GET_SHORT_NAME_VALUE__MAP;

	/**
	 * The number of operations of the '<em>Enumeration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_ELEMENT_OPERATION_COUNT = INDEX_VAR_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.EnumerationImpl
	 * @see model.impl.ModelPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 37;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__PARENT = ENUMERATION_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__CLASS_NAME = ENUMERATION_ELEMENT__CLASS_NAME;

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
	 * The feature id for the '<em><b>Sequence Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__SEQUENCE_INDEX = ENUMERATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__VALUE = ENUMERATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = ENUMERATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Ix Var Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___CREATE_IX_VAR_MAP = ENUMERATION_ELEMENT___CREATE_IX_VAR_MAP;

	/**
	 * The operation id for the '<em>Get Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___GET_NAME_VALUE__MAP = ENUMERATION_ELEMENT___GET_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Hidden Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___GET_HIDDEN_VALUE__MAP = ENUMERATION_ELEMENT___GET_HIDDEN_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Short Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___GET_SHORT_NAME_VALUE__MAP = ENUMERATION_ELEMENT___GET_SHORT_NAME_VALUE__MAP;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = ENUMERATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.EnumerationIntegerImpl <em>Enumeration Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.EnumerationIntegerImpl
	 * @see model.impl.ModelPackageImpl#getEnumerationInteger()
	 * @generated
	 */
	int ENUMERATION_INTEGER = 39;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_INTEGER__PARENT = ESSENCE_BASE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_INTEGER__CLASS_NAME = ESSENCE_BASE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.EnumerationSequenceImpl <em>Enumeration Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.EnumerationSequenceImpl
	 * @see model.impl.ModelPackageImpl#getEnumerationSequence()
	 * @generated
	 */
	int ENUMERATION_SEQUENCE = 40;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE__PARENT = ENUMERATION_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE__CLASS_NAME = ENUMERATION_ELEMENT__CLASS_NAME;

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
	 * The operation id for the '<em>Create Ix Var Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE___CREATE_IX_VAR_MAP = ENUMERATION_ELEMENT___CREATE_IX_VAR_MAP;

	/**
	 * The operation id for the '<em>Get Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE___GET_NAME_VALUE__MAP = ENUMERATION_ELEMENT___GET_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Hidden Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE___GET_HIDDEN_VALUE__MAP = ENUMERATION_ELEMENT___GET_HIDDEN_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Short Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE___GET_SHORT_NAME_VALUE__MAP = ENUMERATION_ELEMENT___GET_SHORT_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Count Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE___GET_COUNT_VALUE__MAP = ENUMERATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Min Index Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE___GET_MIN_INDEX_VALUE__MAP = ENUMERATION_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Index Step Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE___GET_INDEX_STEP_VALUE__MAP = ENUMERATION_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Index Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE___GET_INDEX_VAR = ENUMERATION_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Alt Format</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE___GET_ALT_FORMAT = ENUMERATION_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE___GET_ELEMENT = ENUMERATION_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Enumeration Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_SEQUENCE_OPERATION_COUNT = ENUMERATION_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link model.impl.EnumerationStringImpl <em>Enumeration String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.EnumerationStringImpl
	 * @see model.impl.ModelPackageImpl#getEnumerationString()
	 * @generated
	 */
	int ENUMERATION_STRING = 41;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_STRING__PARENT = ESSENCE_BASE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_STRING__CLASS_NAME = ESSENCE_BASE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.FunctionImpl
	 * @see model.impl.ModelPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 43;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.RegMemElementImpl <em>Reg Mem Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RegMemElementImpl
	 * @see model.impl.ModelPackageImpl#getRegMemElement()
	 * @generated
	 */
	int REG_MEM_ELEMENT = 114;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT__PARENT = INDEX_VAR_USER__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT__CLASS_NAME = INDEX_VAR_USER__CLASS_NAME;

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
	 * The feature id for the '<em><b>Sequence Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT__SEQUENCE_INDEX = INDEX_VAR_USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT__OFFSET = INDEX_VAR_USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rel Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT__REL_OFFSET = INDEX_VAR_USER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reg Mem Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT_FEATURE_COUNT = INDEX_VAR_USER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Create Ix Var Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT___CREATE_IX_VAR_MAP = INDEX_VAR_USER___CREATE_IX_VAR_MAP;

	/**
	 * The operation id for the '<em>Get Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT___GET_NAME_VALUE__MAP = INDEX_VAR_USER___GET_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Hidden Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT___GET_HIDDEN_VALUE__MAP = INDEX_VAR_USER___GET_HIDDEN_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Short Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT___GET_SHORT_NAME_VALUE__MAP = INDEX_VAR_USER___GET_SHORT_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Offset Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT___GET_OFFSET_VALUE__MAP = INDEX_VAR_USER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Offset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT___SET_OFFSET__STRING = INDEX_VAR_USER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT___GET_LENGTH__MAP = INDEX_VAR_USER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Full Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT___GET_FULL_LENGTH__MAP = INDEX_VAR_USER_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Reg Mem Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_ELEMENT_OPERATION_COUNT = INDEX_VAR_USER_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link model.impl.SequenceElementImpl <em>Sequence Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SequenceElementImpl
	 * @see model.impl.ModelPackageImpl#getSequenceElement()
	 * @generated
	 */
	int SEQUENCE_ELEMENT = 121;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT__PARENT = REG_MEM_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT__CLASS_NAME = REG_MEM_ELEMENT__CLASS_NAME;

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
	 * The feature id for the '<em><b>Sequence Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT__SEQUENCE_INDEX = REG_MEM_ELEMENT__SEQUENCE_INDEX;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT__OFFSET = REG_MEM_ELEMENT__OFFSET;

	/**
	 * The feature id for the '<em><b>Rel Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT__REL_OFFSET = REG_MEM_ELEMENT__REL_OFFSET;

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
	 * The operation id for the '<em>Create Ix Var Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT___CREATE_IX_VAR_MAP = REG_MEM_ELEMENT___CREATE_IX_VAR_MAP;

	/**
	 * The operation id for the '<em>Get Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT___GET_NAME_VALUE__MAP = REG_MEM_ELEMENT___GET_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Hidden Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT___GET_HIDDEN_VALUE__MAP = REG_MEM_ELEMENT___GET_HIDDEN_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Short Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT___GET_SHORT_NAME_VALUE__MAP = REG_MEM_ELEMENT___GET_SHORT_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Offset Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT___GET_OFFSET_VALUE__MAP = REG_MEM_ELEMENT___GET_OFFSET_VALUE__MAP;

	/**
	 * The operation id for the '<em>Set Offset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT___SET_OFFSET__STRING = REG_MEM_ELEMENT___SET_OFFSET__STRING;

	/**
	 * The operation id for the '<em>Get Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT___GET_LENGTH__MAP = REG_MEM_ELEMENT___GET_LENGTH__MAP;

	/**
	 * The operation id for the '<em>Get Full Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT___GET_FULL_LENGTH__MAP = REG_MEM_ELEMENT___GET_FULL_LENGTH__MAP;

	/**
	 * The number of operations of the '<em>Sequence Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_ELEMENT_OPERATION_COUNT = REG_MEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.GapElementImpl <em>Gap Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.GapElementImpl
	 * @see model.impl.ModelPackageImpl#getGapElement()
	 * @generated
	 */
	int GAP_ELEMENT = 44;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT__PARENT = SEQUENCE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT__CLASS_NAME = SEQUENCE_ELEMENT__CLASS_NAME;

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
	 * The feature id for the '<em><b>Sequence Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT__SEQUENCE_INDEX = SEQUENCE_ELEMENT__SEQUENCE_INDEX;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT__OFFSET = SEQUENCE_ELEMENT__OFFSET;

	/**
	 * The feature id for the '<em><b>Rel Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT__REL_OFFSET = SEQUENCE_ELEMENT__REL_OFFSET;

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
	 * The operation id for the '<em>Create Ix Var Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT___CREATE_IX_VAR_MAP = SEQUENCE_ELEMENT___CREATE_IX_VAR_MAP;

	/**
	 * The operation id for the '<em>Get Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT___GET_NAME_VALUE__MAP = SEQUENCE_ELEMENT___GET_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Hidden Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT___GET_HIDDEN_VALUE__MAP = SEQUENCE_ELEMENT___GET_HIDDEN_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Short Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT___GET_SHORT_NAME_VALUE__MAP = SEQUENCE_ELEMENT___GET_SHORT_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Offset Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT___GET_OFFSET_VALUE__MAP = SEQUENCE_ELEMENT___GET_OFFSET_VALUE__MAP;

	/**
	 * The operation id for the '<em>Set Offset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT___SET_OFFSET__STRING = SEQUENCE_ELEMENT___SET_OFFSET__STRING;

	/**
	 * The operation id for the '<em>Get Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT___GET_LENGTH__MAP = SEQUENCE_ELEMENT___GET_LENGTH__MAP;

	/**
	 * The operation id for the '<em>Get Full Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT___GET_FULL_LENGTH__MAP = SEQUENCE_ELEMENT___GET_FULL_LENGTH__MAP;

	/**
	 * The number of operations of the '<em>Gap Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_ELEMENT_OPERATION_COUNT = SEQUENCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.GeneralInterfaceImpl <em>General Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.GeneralInterfaceImpl
	 * @see model.impl.ModelPackageImpl#getGeneralInterface()
	 * @generated
	 */
	int GENERAL_INTERFACE = 46;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INTERFACE__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_INTERFACE__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.PadImpl <em>Pad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PadImpl
	 * @see model.impl.ModelPackageImpl#getPad()
	 * @generated
	 */
	int PAD = 86;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.SinglePadImpl <em>Single Pad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SinglePadImpl
	 * @see model.impl.ModelPackageImpl#getSinglePad()
	 * @generated
	 */
	int SINGLE_PAD = 137;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAD__PARENT = PAD__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PAD__CLASS_NAME = PAD__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.GeneralPadImpl <em>General Pad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.GeneralPadImpl
	 * @see model.impl.ModelPackageImpl#getGeneralPad()
	 * @generated
	 */
	int GENERAL_PAD = 47;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__PARENT = SINGLE_PAD__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PAD__CLASS_NAME = SINGLE_PAD__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.GeneralRegisterImpl <em>General Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.GeneralRegisterImpl
	 * @see model.impl.ModelPackageImpl#getGeneralRegister()
	 * @generated
	 */
	int GENERAL_REGISTER = 49;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER__PARENT = SEQUENCE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER__CLASS_NAME = SEQUENCE_ELEMENT__CLASS_NAME;

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
	 * The feature id for the '<em><b>Sequence Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER__SEQUENCE_INDEX = SEQUENCE_ELEMENT__SEQUENCE_INDEX;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER__OFFSET = SEQUENCE_ELEMENT__OFFSET;

	/**
	 * The feature id for the '<em><b>Rel Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER__REL_OFFSET = SEQUENCE_ELEMENT__REL_OFFSET;

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
	 * The operation id for the '<em>Create Ix Var Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER___CREATE_IX_VAR_MAP = SEQUENCE_ELEMENT___CREATE_IX_VAR_MAP;

	/**
	 * The operation id for the '<em>Get Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER___GET_NAME_VALUE__MAP = SEQUENCE_ELEMENT___GET_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Hidden Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER___GET_HIDDEN_VALUE__MAP = SEQUENCE_ELEMENT___GET_HIDDEN_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Short Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER___GET_SHORT_NAME_VALUE__MAP = SEQUENCE_ELEMENT___GET_SHORT_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Offset Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER___GET_OFFSET_VALUE__MAP = SEQUENCE_ELEMENT___GET_OFFSET_VALUE__MAP;

	/**
	 * The operation id for the '<em>Set Offset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER___SET_OFFSET__STRING = SEQUENCE_ELEMENT___SET_OFFSET__STRING;

	/**
	 * The operation id for the '<em>Get Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER___GET_LENGTH__MAP = SEQUENCE_ELEMENT___GET_LENGTH__MAP;

	/**
	 * The operation id for the '<em>Get Full Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER___GET_FULL_LENGTH__MAP = SEQUENCE_ELEMENT___GET_FULL_LENGTH__MAP;

	/**
	 * The number of operations of the '<em>General Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_REGISTER_OPERATION_COUNT = SEQUENCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.GenericDeclBlockImpl <em>Generic Decl Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.GenericDeclBlockImpl
	 * @see model.impl.ModelPackageImpl#getGenericDeclBlock()
	 * @generated
	 */
	int GENERIC_DECL_BLOCK = 51;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL_BLOCK__PARENT = VAR_DEF_BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DECL_BLOCK__CLASS_NAME = VAR_DEF_BLOCK__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.GenericMapImpl <em>Generic Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.GenericMapImpl
	 * @see model.impl.ModelPackageImpl#getGenericMap()
	 * @generated
	 */
	int GENERIC_MAP = 52;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MAP__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_MAP__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.InstanceInterfaceMapImpl <em>Instance Interface Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InstanceInterfaceMapImpl
	 * @see model.impl.ModelPackageImpl#getInstanceInterfaceMap()
	 * @generated
	 */
	int INSTANCE_INTERFACE_MAP = 55;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_INTERFACE_MAP__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_INTERFACE_MAP__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.InstancePortMapImpl <em>Instance Port Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InstancePortMapImpl
	 * @see model.impl.ModelPackageImpl#getInstancePortMap()
	 * @generated
	 */
	int INSTANCE_PORT_MAP = 56;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PORT_MAP__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PORT_MAP__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.InstanceShellInterfaceMapImpl <em>Instance Shell Interface Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InstanceShellInterfaceMapImpl
	 * @see model.impl.ModelPackageImpl#getInstanceShellInterfaceMap()
	 * @generated
	 */
	int INSTANCE_SHELL_INTERFACE_MAP = 57;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_INTERFACE_MAP__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_INTERFACE_MAP__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.InstanceShellPortMapImpl <em>Instance Shell Port Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InstanceShellPortMapImpl
	 * @see model.impl.ModelPackageImpl#getInstanceShellPortMap()
	 * @generated
	 */
	int INSTANCE_SHELL_PORT_MAP = 58;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_PORT_MAP__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_SHELL_PORT_MAP__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.IntegerDeclImpl <em>Integer Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.IntegerDeclImpl
	 * @see model.impl.ModelPackageImpl#getIntegerDecl()
	 * @generated
	 */
	int INTEGER_DECL = 59;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DECL__PARENT = PARAM_DECL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DECL__CLASS_NAME = PARAM_DECL__CLASS_NAME;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DECL__TYPE = PARAM_DECL__TYPE;

	/**
	 * The feature id for the '<em><b>Var Def Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DECL__VAR_DEF_VALUE = PARAM_DECL__VAR_DEF_VALUE;

	/**
	 * The feature id for the '<em><b>Var Def Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DECL__VAR_DEF_OVERRIDE = PARAM_DECL__VAR_DEF_OVERRIDE;

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
	 * The meta object id for the '{@link model.impl.IntegerDefImpl <em>Integer Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.IntegerDefImpl
	 * @see model.impl.ModelPackageImpl#getIntegerDef()
	 * @generated
	 */
	int INTEGER_DEF = 60;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DEF__PARENT = CONST_DEF__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DEF__CLASS_NAME = CONST_DEF__CLASS_NAME;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DEF__TYPE = CONST_DEF__TYPE;

	/**
	 * The feature id for the '<em><b>Var Def Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DEF__VAR_DEF_VALUE = CONST_DEF__VAR_DEF_VALUE;

	/**
	 * The feature id for the '<em><b>Var Def Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_DEF__VAR_DEF_OVERRIDE = CONST_DEF__VAR_DEF_OVERRIDE;

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
	 * The meta object id for the '{@link model.impl.IntegerGenDeclImpl <em>Integer Gen Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.IntegerGenDeclImpl
	 * @see model.impl.ModelPackageImpl#getIntegerGenDecl()
	 * @generated
	 */
	int INTEGER_GEN_DECL = 61;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GEN_DECL__PARENT = GENERIC_DECL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GEN_DECL__CLASS_NAME = GENERIC_DECL__CLASS_NAME;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GEN_DECL__TYPE = GENERIC_DECL__TYPE;

	/**
	 * The feature id for the '<em><b>Var Def Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GEN_DECL__VAR_DEF_VALUE = GENERIC_DECL__VAR_DEF_VALUE;

	/**
	 * The feature id for the '<em><b>Var Def Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_GEN_DECL__VAR_DEF_OVERRIDE = GENERIC_DECL__VAR_DEF_OVERRIDE;

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
	 * The meta object id for the '{@link model.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InterfaceImpl
	 * @see model.impl.ModelPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 62;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PARENT = GENERAL_INTERFACE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CLASS_NAME = GENERAL_INTERFACE__CLASS_NAME;

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
	 * The feature id for the '<em><b>Ext VLNV Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__EXT_VLNV_NAME = GENERAL_INTERFACE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = GENERAL_INTERFACE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = GENERAL_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.InterfaceDefPortImpl <em>Interface Def Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InterfaceDefPortImpl
	 * @see model.impl.ModelPackageImpl#getInterfaceDefPort()
	 * @generated
	 */
	int INTERFACE_DEF_PORT = 65;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_PORT__PARENT = GENERAL_PORT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_PORT__CLASS_NAME = GENERAL_PORT__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.InterfaceDefCablePortImpl <em>Interface Def Cable Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InterfaceDefCablePortImpl
	 * @see model.impl.ModelPackageImpl#getInterfaceDefCablePort()
	 * @generated
	 */
	int INTERFACE_DEF_CABLE_PORT = 63;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_CABLE_PORT__PARENT = INTERFACE_DEF_PORT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_CABLE_PORT__CLASS_NAME = INTERFACE_DEF_PORT__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.InterfaceDefinitionImpl <em>Interface Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InterfaceDefinitionImpl
	 * @see model.impl.ModelPackageImpl#getInterfaceDefinition()
	 * @generated
	 */
	int INTERFACE_DEFINITION = 64;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__PARENT = MODEL_ROOT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__CLASS_NAME = MODEL_ROOT__CLASS_NAME;

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
	 * The feature id for the '<em><b>Param Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__PARAM_MAP = MODEL_ROOT__PARAM_MAP;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__GENERIC_MAP = MODEL_ROOT__GENERIC_MAP;

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
	 * The meta object id for the '{@link model.impl.InterfaceDefRoleImpl <em>Interface Def Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InterfaceDefRoleImpl
	 * @see model.impl.ModelPackageImpl#getInterfaceDefRole()
	 * @generated
	 */
	int INTERFACE_DEF_ROLE = 66;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_ROLE__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_ROLE__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.InterfaceDefTransactionalPortImpl <em>Interface Def Transactional Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InterfaceDefTransactionalPortImpl
	 * @see model.impl.ModelPackageImpl#getInterfaceDefTransactionalPort()
	 * @generated
	 */
	int INTERFACE_DEF_TRANSACTIONAL_PORT = 67;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_TRANSACTIONAL_PORT__PARENT = INTERFACE_DEF_PORT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_TRANSACTIONAL_PORT__CLASS_NAME = INTERFACE_DEF_PORT__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.InterfaceDefViewImpl <em>Interface Def View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InterfaceDefViewImpl
	 * @see model.impl.ModelPackageImpl#getInterfaceDefView()
	 * @generated
	 */
	int INTERFACE_DEF_VIEW = 68;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_VIEW__PARENT = SIGNAL_OWNER__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_VIEW__CLASS_NAME = SIGNAL_OWNER__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.InterfaceDefWirePortImpl <em>Interface Def Wire Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InterfaceDefWirePortImpl
	 * @see model.impl.ModelPackageImpl#getInterfaceDefWirePort()
	 * @generated
	 */
	int INTERFACE_DEF_WIRE_PORT = 69;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_WIRE_PORT__PARENT = INTERFACE_DEF_PORT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEF_WIRE_PORT__CLASS_NAME = INTERFACE_DEF_PORT__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.InterfacePortMapImpl <em>Interface Port Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InterfacePortMapImpl
	 * @see model.impl.ModelPackageImpl#getInterfacePortMap()
	 * @generated
	 */
	int INTERFACE_PORT_MAP = 71;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PORT_MAP__PARENT = ESSENCE_BASE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_PORT_MAP__CLASS_NAME = ESSENCE_BASE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.InterfaceViewImpl <em>Interface View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.InterfaceViewImpl
	 * @see model.impl.ModelPackageImpl#getInterfaceView()
	 * @generated
	 */
	int INTERFACE_VIEW = 72;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VIEW__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VIEW__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The feature id for the '<em><b>Unassigned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VIEW__UNASSIGNED_PORT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interface View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VIEW_FEATURE_COUNT = SINGLE_SOURCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Interface View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_VIEW_OPERATION_COUNT = SINGLE_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.LocalInterfaceMapImpl <em>Local Interface Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.LocalInterfaceMapImpl
	 * @see model.impl.ModelPackageImpl#getLocalInterfaceMap()
	 * @generated
	 */
	int LOCAL_INTERFACE_MAP = 73;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERFACE_MAP__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INTERFACE_MAP__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.LocalPortMapImpl <em>Local Port Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.LocalPortMapImpl
	 * @see model.impl.ModelPackageImpl#getLocalPortMap()
	 * @generated
	 */
	int LOCAL_PORT_MAP = 74;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PORT_MAP__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PORT_MAP__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.MemoryImpl <em>Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.MemoryImpl
	 * @see model.impl.ModelPackageImpl#getMemory()
	 * @generated
	 */
	int MEMORY = 75;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__PARENT = SEQUENCE_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__CLASS_NAME = SEQUENCE_ELEMENT__CLASS_NAME;

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
	 * The feature id for the '<em><b>Sequence Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__SEQUENCE_INDEX = SEQUENCE_ELEMENT__SEQUENCE_INDEX;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__OFFSET = SEQUENCE_ELEMENT__OFFSET;

	/**
	 * The feature id for the '<em><b>Rel Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY__REL_OFFSET = SEQUENCE_ELEMENT__REL_OFFSET;

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
	 * The operation id for the '<em>Create Ix Var Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY___CREATE_IX_VAR_MAP = SEQUENCE_ELEMENT___CREATE_IX_VAR_MAP;

	/**
	 * The operation id for the '<em>Get Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY___GET_NAME_VALUE__MAP = SEQUENCE_ELEMENT___GET_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Hidden Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY___GET_HIDDEN_VALUE__MAP = SEQUENCE_ELEMENT___GET_HIDDEN_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Short Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY___GET_SHORT_NAME_VALUE__MAP = SEQUENCE_ELEMENT___GET_SHORT_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Offset Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY___GET_OFFSET_VALUE__MAP = SEQUENCE_ELEMENT___GET_OFFSET_VALUE__MAP;

	/**
	 * The operation id for the '<em>Set Offset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY___SET_OFFSET__STRING = SEQUENCE_ELEMENT___SET_OFFSET__STRING;

	/**
	 * The operation id for the '<em>Get Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY___GET_LENGTH__MAP = SEQUENCE_ELEMENT___GET_LENGTH__MAP;

	/**
	 * The operation id for the '<em>Get Full Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY___GET_FULL_LENGTH__MAP = SEQUENCE_ELEMENT___GET_FULL_LENGTH__MAP;

	/**
	 * The number of operations of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_OPERATION_COUNT = SEQUENCE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.MethodDataTypeImpl <em>Method Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.MethodDataTypeImpl
	 * @see model.impl.ModelPackageImpl#getMethodDataType()
	 * @generated
	 */
	int METHOD_DATA_TYPE = 76;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DATA_TYPE__PARENT = DATA_TYPE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DATA_TYPE__CLASS_NAME = DATA_TYPE__CLASS_NAME;

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
	 * The feature id for the '<em><b>Check Void</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DATA_TYPE__CHECK_VOID = DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Method Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Method Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DATA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.MethodDataTypeElementImpl <em>Method Data Type Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.MethodDataTypeElementImpl
	 * @see model.impl.ModelPackageImpl#getMethodDataTypeElement()
	 * @generated
	 */
	int METHOD_DATA_TYPE_ELEMENT = 77;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DATA_TYPE_ELEMENT__PARENT = ESSENCE_BASE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DATA_TYPE_ELEMENT__CLASS_NAME = ESSENCE_BASE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ModuleImpl
	 * @see model.impl.ModelPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 79;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.MultiPadImpl <em>Multi Pad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.MultiPadImpl
	 * @see model.impl.ModelPackageImpl#getMultiPad()
	 * @generated
	 */
	int MULTI_PAD = 80;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAD__PARENT = PAD__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PAD__CLASS_NAME = PAD__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.MultiViewRegisterImpl <em>Multi View Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.MultiViewRegisterImpl
	 * @see model.impl.ModelPackageImpl#getMultiViewRegister()
	 * @generated
	 */
	int MULTI_VIEW_REGISTER = 81;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER__PARENT = GENERAL_REGISTER__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER__CLASS_NAME = GENERAL_REGISTER__CLASS_NAME;

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
	 * The feature id for the '<em><b>Sequence Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER__SEQUENCE_INDEX = GENERAL_REGISTER__SEQUENCE_INDEX;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER__OFFSET = GENERAL_REGISTER__OFFSET;

	/**
	 * The feature id for the '<em><b>Rel Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER__REL_OFFSET = GENERAL_REGISTER__REL_OFFSET;

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
	 * The operation id for the '<em>Create Ix Var Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER___CREATE_IX_VAR_MAP = GENERAL_REGISTER___CREATE_IX_VAR_MAP;

	/**
	 * The operation id for the '<em>Get Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER___GET_NAME_VALUE__MAP = GENERAL_REGISTER___GET_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Hidden Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER___GET_HIDDEN_VALUE__MAP = GENERAL_REGISTER___GET_HIDDEN_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Short Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER___GET_SHORT_NAME_VALUE__MAP = GENERAL_REGISTER___GET_SHORT_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Offset Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER___GET_OFFSET_VALUE__MAP = GENERAL_REGISTER___GET_OFFSET_VALUE__MAP;

	/**
	 * The operation id for the '<em>Set Offset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER___SET_OFFSET__STRING = GENERAL_REGISTER___SET_OFFSET__STRING;

	/**
	 * The operation id for the '<em>Get Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER___GET_LENGTH__MAP = GENERAL_REGISTER___GET_LENGTH__MAP;

	/**
	 * The operation id for the '<em>Get Full Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER___GET_FULL_LENGTH__MAP = GENERAL_REGISTER___GET_FULL_LENGTH__MAP;

	/**
	 * The number of operations of the '<em>Multi View Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_VIEW_REGISTER_OPERATION_COUNT = GENERAL_REGISTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.NetImpl <em>Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.NetImpl
	 * @see model.impl.ModelPackageImpl#getNet()
	 * @generated
	 */
	int NET = 82;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.NoneInterfaceImpl <em>None Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.NoneInterfaceImpl
	 * @see model.impl.ModelPackageImpl#getNoneInterface()
	 * @generated
	 */
	int NONE_INTERFACE = 83;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_INTERFACE__PARENT = GENERAL_INTERFACE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_INTERFACE__CLASS_NAME = GENERAL_INTERFACE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PackageImpl
	 * @see model.impl.ModelPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 84;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PARENT = MODEL_ROOT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CLASS_NAME = MODEL_ROOT__CLASS_NAME;

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
	 * The feature id for the '<em><b>Param Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PARAM_MAP = MODEL_ROOT__PARAM_MAP;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__GENERIC_MAP = MODEL_ROOT__GENERIC_MAP;

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
	 * The meta object id for the '{@link model.impl.PackageInstanceImpl <em>Package Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PackageInstanceImpl
	 * @see model.impl.ModelPackageImpl#getPackageInstance()
	 * @generated
	 */
	int PACKAGE_INSTANCE = 85;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_INSTANCE__PARENT = GENERAL_INSTANCE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_INSTANCE__CLASS_NAME = GENERAL_INSTANCE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.PadMultiplexedImpl <em>Pad Multiplexed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PadMultiplexedImpl
	 * @see model.impl.ModelPackageImpl#getPadMultiplexed()
	 * @generated
	 */
	int PAD_MULTIPLEXED = 87;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__PARENT = SINGLE_PAD__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_MULTIPLEXED__CLASS_NAME = SINGLE_PAD__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.PadNetMapImpl <em>Pad Net Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PadNetMapImpl
	 * @see model.impl.ModelPackageImpl#getPadNetMap()
	 * @generated
	 */
	int PAD_NET_MAP = 88;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NET_MAP__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NET_MAP__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.PadNonMultiplexedImpl <em>Pad Non Multiplexed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PadNonMultiplexedImpl
	 * @see model.impl.ModelPackageImpl#getPadNonMultiplexed()
	 * @generated
	 */
	int PAD_NON_MULTIPLEXED = 89;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__PARENT = SINGLE_PAD__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_NON_MULTIPLEXED__CLASS_NAME = SINGLE_PAD__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.PadSpecialImpl <em>Pad Special</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PadSpecialImpl
	 * @see model.impl.ModelPackageImpl#getPadSpecial()
	 * @generated
	 */
	int PAD_SPECIAL = 90;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__PARENT = GENERAL_PAD__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SPECIAL__CLASS_NAME = GENERAL_PAD__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.PadSupplyImpl <em>Pad Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PadSupplyImpl
	 * @see model.impl.ModelPackageImpl#getPadSupply()
	 * @generated
	 */
	int PAD_SUPPLY = 91;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__PARENT = GENERAL_PAD__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_SUPPLY__CLASS_NAME = GENERAL_PAD__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.PadTypeImpl <em>Pad Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PadTypeImpl
	 * @see model.impl.ModelPackageImpl#getPadType()
	 * @generated
	 */
	int PAD_TYPE = 92;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.PadTypeDBImpl <em>Pad Type DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PadTypeDBImpl
	 * @see model.impl.ModelPackageImpl#getPadTypeDB()
	 * @generated
	 */
	int PAD_TYPE_DB = 93;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_DB__PARENT = MODEL_ROOT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_DB__CLASS_NAME = MODEL_ROOT__CLASS_NAME;

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
	 * The feature id for the '<em><b>Param Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_DB__PARAM_MAP = MODEL_ROOT__PARAM_MAP;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_TYPE_DB__GENERIC_MAP = MODEL_ROOT__GENERIC_MAP;

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
	 * The meta object id for the '{@link model.impl.ParamDeclBlockImpl <em>Param Decl Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ParamDeclBlockImpl
	 * @see model.impl.ModelPackageImpl#getParamDeclBlock()
	 * @generated
	 */
	int PARAM_DECL_BLOCK = 95;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL_BLOCK__PARENT = VAR_DEF_BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DECL_BLOCK__CLASS_NAME = VAR_DEF_BLOCK__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.ParamMapImpl <em>Param Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ParamMapImpl
	 * @see model.impl.ModelPackageImpl#getParamMap()
	 * @generated
	 */
	int PARAM_MAP = 96;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_MAP__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_MAP__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ReferenceImpl
	 * @see model.impl.ModelPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 111;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__PARENT = ESSENCE_BASE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__CLASS_NAME = ESSENCE_BASE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.PathRefImpl <em>Path Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PathRefImpl
	 * @see model.impl.ModelPackageImpl#getPathRef()
	 * @generated
	 */
	int PATH_REF = 97;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_REF__PARENT = REFERENCE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_REF__CLASS_NAME = REFERENCE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.PinImpl <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PinImpl
	 * @see model.impl.ModelPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 98;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.PinNetMapImpl <em>Pin Net Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PinNetMapImpl
	 * @see model.impl.ModelPackageImpl#getPinNetMap()
	 * @generated
	 */
	int PIN_NET_MAP = 99;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_NET_MAP__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_NET_MAP__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.PortRefImpl <em>Port Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PortRefImpl
	 * @see model.impl.ModelPackageImpl#getPortRef()
	 * @generated
	 */
	int PORT_REF = 101;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REF__PARENT = PORT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_REF__CLASS_NAME = PORT__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.PowerDomainImpl <em>Power Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PowerDomainImpl
	 * @see model.impl.ModelPackageImpl#getPowerDomain()
	 * @generated
	 */
	int POWER_DOMAIN = 102;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_DOMAIN__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_DOMAIN__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ProductImpl
	 * @see model.impl.ModelPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 103;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PARENT = MODEL_ROOT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CLASS_NAME = MODEL_ROOT__CLASS_NAME;

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
	 * The feature id for the '<em><b>Param Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PARAM_MAP = MODEL_ROOT__PARAM_MAP;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__GENERIC_MAP = MODEL_ROOT__GENERIC_MAP;

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
	 * The meta object id for the '{@link model.impl.ProductInstanceImpl <em>Product Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ProductInstanceImpl
	 * @see model.impl.ModelPackageImpl#getProductInstance()
	 * @generated
	 */
	int PRODUCT_INSTANCE = 104;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__PARENT = INSTANCE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INSTANCE__CLASS_NAME = INSTANCE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.ProductInterfaceMapImpl <em>Product Interface Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ProductInterfaceMapImpl
	 * @see model.impl.ModelPackageImpl#getProductInterfaceMap()
	 * @generated
	 */
	int PRODUCT_INTERFACE_MAP = 105;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INTERFACE_MAP__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_INTERFACE_MAP__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.ProductPadMapImpl <em>Product Pad Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ProductPadMapImpl
	 * @see model.impl.ModelPackageImpl#getProductPadMap()
	 * @generated
	 */
	int PRODUCT_PAD_MAP = 106;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAD_MAP__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAD_MAP__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.ProductPinMapImpl <em>Product Pin Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ProductPinMapImpl
	 * @see model.impl.ModelPackageImpl#getProductPinMap()
	 * @generated
	 */
	int PRODUCT_PIN_MAP = 107;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PIN_MAP__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PIN_MAP__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PropertyImpl
	 * @see model.impl.ModelPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 108;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PARENT = ESSENCE_BASE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CLASS_NAME = ESSENCE_BASE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.RecordImpl <em>Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RecordImpl
	 * @see model.impl.ModelPackageImpl#getRecord()
	 * @generated
	 */
	int RECORD = 110;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__PARENT = COMPLEX_DATA_TYPE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__CLASS_NAME = COMPLEX_DATA_TYPE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.RegisterImpl <em>Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RegisterImpl
	 * @see model.impl.ModelPackageImpl#getRegister()
	 * @generated
	 */
	int REGISTER = 112;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__PARENT = GENERAL_REGISTER__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__CLASS_NAME = GENERAL_REGISTER__CLASS_NAME;

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
	 * The feature id for the '<em><b>Sequence Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__SEQUENCE_INDEX = GENERAL_REGISTER__SEQUENCE_INDEX;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__OFFSET = GENERAL_REGISTER__OFFSET;

	/**
	 * The feature id for the '<em><b>Rel Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__REL_OFFSET = GENERAL_REGISTER__REL_OFFSET;

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
	 * The feature id for the '<em><b>Common Access Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__COMMON_ACCESS_LEVEL = GENERAL_REGISTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mirror Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__MIRROR_SIZE = GENERAL_REGISTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Top Spin Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__TOP_SPIN_TYPE = GENERAL_REGISTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>XRef Register View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__XREF_REGISTER_VIEW = GENERAL_REGISTER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bit Field Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__BIT_FIELD_ELEMENT = GENERAL_REGISTER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bit Field</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__BIT_FIELD = GENERAL_REGISTER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bit Field Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__BIT_FIELD_SEQUENCE = GENERAL_REGISTER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_FEATURE_COUNT = GENERAL_REGISTER_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Create Ix Var Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER___CREATE_IX_VAR_MAP = GENERAL_REGISTER___CREATE_IX_VAR_MAP;

	/**
	 * The operation id for the '<em>Get Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER___GET_NAME_VALUE__MAP = GENERAL_REGISTER___GET_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Hidden Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER___GET_HIDDEN_VALUE__MAP = GENERAL_REGISTER___GET_HIDDEN_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Short Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER___GET_SHORT_NAME_VALUE__MAP = GENERAL_REGISTER___GET_SHORT_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Offset Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER___GET_OFFSET_VALUE__MAP = GENERAL_REGISTER___GET_OFFSET_VALUE__MAP;

	/**
	 * The operation id for the '<em>Set Offset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER___SET_OFFSET__STRING = GENERAL_REGISTER___SET_OFFSET__STRING;

	/**
	 * The operation id for the '<em>Get Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER___GET_LENGTH__MAP = GENERAL_REGISTER___GET_LENGTH__MAP;

	/**
	 * The operation id for the '<em>Get Full Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER___GET_FULL_LENGTH__MAP = GENERAL_REGISTER___GET_FULL_LENGTH__MAP;

	/**
	 * The operation id for the '<em>Refresh Common Access Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER___REFRESH_COMMON_ACCESS_LEVEL = GENERAL_REGISTER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_OPERATION_COUNT = GENERAL_REGISTER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link model.impl.RegisterViewImpl <em>Register View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RegisterViewImpl
	 * @see model.impl.ModelPackageImpl#getRegisterView()
	 * @generated
	 */
	int REGISTER_VIEW = 113;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW__PARENT = INDEX_VAR_USER__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW__CLASS_NAME = INDEX_VAR_USER__CLASS_NAME;

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
	 * The feature id for the '<em><b>Common Access Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW__COMMON_ACCESS_LEVEL = INDEX_VAR_USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW__DEPTH = INDEX_VAR_USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Depth Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW__DEPTH_VAR = INDEX_VAR_USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bit Field Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW__BIT_FIELD_ELEMENT = INDEX_VAR_USER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Register View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW_FEATURE_COUNT = INDEX_VAR_USER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Create Ix Var Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW___CREATE_IX_VAR_MAP = INDEX_VAR_USER___CREATE_IX_VAR_MAP;

	/**
	 * The operation id for the '<em>Get Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW___GET_NAME_VALUE__MAP = INDEX_VAR_USER___GET_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Hidden Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW___GET_HIDDEN_VALUE__MAP = INDEX_VAR_USER___GET_HIDDEN_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Short Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW___GET_SHORT_NAME_VALUE__MAP = INDEX_VAR_USER___GET_SHORT_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Refresh Common Access Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW___REFRESH_COMMON_ACCESS_LEVEL = INDEX_VAR_USER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Register View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VIEW_OPERATION_COUNT = INDEX_VAR_USER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link model.impl.RegMemSequenceImpl <em>Reg Mem Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RegMemSequenceImpl
	 * @see model.impl.ModelPackageImpl#getRegMemSequence()
	 * @generated
	 */
	int REG_MEM_SEQUENCE = 115;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE__PARENT = REG_MEM_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE__CLASS_NAME = REG_MEM_ELEMENT__CLASS_NAME;

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
	 * The feature id for the '<em><b>Sequence Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE__SEQUENCE_INDEX = REG_MEM_ELEMENT__SEQUENCE_INDEX;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE__OFFSET = REG_MEM_ELEMENT__OFFSET;

	/**
	 * The feature id for the '<em><b>Rel Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE__REL_OFFSET = REG_MEM_ELEMENT__REL_OFFSET;

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
	 * The operation id for the '<em>Create Ix Var Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE___CREATE_IX_VAR_MAP = REG_MEM_ELEMENT___CREATE_IX_VAR_MAP;

	/**
	 * The operation id for the '<em>Get Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE___GET_NAME_VALUE__MAP = REG_MEM_ELEMENT___GET_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Hidden Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE___GET_HIDDEN_VALUE__MAP = REG_MEM_ELEMENT___GET_HIDDEN_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Short Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE___GET_SHORT_NAME_VALUE__MAP = REG_MEM_ELEMENT___GET_SHORT_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Offset Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE___GET_OFFSET_VALUE__MAP = REG_MEM_ELEMENT___GET_OFFSET_VALUE__MAP;

	/**
	 * The operation id for the '<em>Set Offset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE___SET_OFFSET__STRING = REG_MEM_ELEMENT___SET_OFFSET__STRING;

	/**
	 * The operation id for the '<em>Get Full Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE___GET_FULL_LENGTH__MAP = REG_MEM_ELEMENT___GET_FULL_LENGTH__MAP;

	/**
	 * The operation id for the '<em>Get Count Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE___GET_COUNT_VALUE__MAP = REG_MEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Min Index Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE___GET_MIN_INDEX_VALUE__MAP = REG_MEM_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Index Step Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE___GET_INDEX_STEP_VALUE__MAP = REG_MEM_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Index Var</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE___GET_INDEX_VAR = REG_MEM_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Alt Format</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE___GET_ALT_FORMAT = REG_MEM_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE___GET_LENGTH__MAP = REG_MEM_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE___GET_ELEMENT = REG_MEM_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>Reg Mem Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SEQUENCE_OPERATION_COUNT = REG_MEM_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link model.impl.RegMemSetImpl <em>Reg Mem Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RegMemSetImpl
	 * @see model.impl.ModelPackageImpl#getRegMemSet()
	 * @generated
	 */
	int REG_MEM_SET = 116;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SET__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_MEM_SET__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.RegViewBlockImpl <em>Reg View Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RegViewBlockImpl
	 * @see model.impl.ModelPackageImpl#getRegViewBlock()
	 * @generated
	 */
	int REG_VIEW_BLOCK = 117;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_VIEW_BLOCK__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REG_VIEW_BLOCK__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.ResetTypeImpl <em>Reset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ResetTypeImpl
	 * @see model.impl.ModelPackageImpl#getResetType()
	 * @generated
	 */
	int RESET_TYPE = 118;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TYPE__PARENT = INDEX_VAR_USER__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TYPE__CLASS_NAME = INDEX_VAR_USER__CLASS_NAME;

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
	 * The operation id for the '<em>Create Ix Var Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TYPE___CREATE_IX_VAR_MAP = INDEX_VAR_USER___CREATE_IX_VAR_MAP;

	/**
	 * The operation id for the '<em>Get Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TYPE___GET_NAME_VALUE__MAP = INDEX_VAR_USER___GET_NAME_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Hidden Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TYPE___GET_HIDDEN_VALUE__MAP = INDEX_VAR_USER___GET_HIDDEN_VALUE__MAP;

	/**
	 * The operation id for the '<em>Get Short Name Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TYPE___GET_SHORT_NAME_VALUE__MAP = INDEX_VAR_USER___GET_SHORT_NAME_VALUE__MAP;

	/**
	 * The number of operations of the '<em>Reset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_TYPE_OPERATION_COUNT = INDEX_VAR_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ReturnElementAccessImpl <em>Return Element Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ReturnElementAccessImpl
	 * @see model.impl.ModelPackageImpl#getReturnElementAccess()
	 * @generated
	 */
	int RETURN_ELEMENT_ACCESS = 120;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ELEMENT_ACCESS__PARENT = SUB_ELEMENT_ACCESS__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ELEMENT_ACCESS__CLASS_NAME = SUB_ELEMENT_ACCESS__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.ShellInterfaceMapImpl <em>Shell Interface Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ShellInterfaceMapImpl
	 * @see model.impl.ModelPackageImpl#getShellInterfaceMap()
	 * @generated
	 */
	int SHELL_INTERFACE_MAP = 122;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INTERFACE_MAP__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_INTERFACE_MAP__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.ShellPortMapImpl <em>Shell Port Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ShellPortMapImpl
	 * @see model.impl.ModelPackageImpl#getShellPortMap()
	 * @generated
	 */
	int SHELL_PORT_MAP = 123;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_PORT_MAP__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELL_PORT_MAP__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.SiInstanceImpl <em>Si Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SiInstanceImpl
	 * @see model.impl.ModelPackageImpl#getSiInstance()
	 * @generated
	 */
	int SI_INSTANCE = 128;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE__PARENT = GENERAL_INSTANCE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE__CLASS_NAME = GENERAL_INSTANCE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.SiComponentInstanceImpl <em>Si Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SiComponentInstanceImpl
	 * @see model.impl.ModelPackageImpl#getSiComponentInstance()
	 * @generated
	 */
	int SI_COMPONENT_INSTANCE = 124;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_COMPONENT_INSTANCE__PARENT = SI_INSTANCE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_COMPONENT_INSTANCE__CLASS_NAME = SI_INSTANCE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.SignalMapImpl <em>Signal Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SignalMapImpl
	 * @see model.impl.ModelPackageImpl#getSignalMap()
	 * @generated
	 */
	int SIGNAL_MAP = 126;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_MAP__PARENT = ESSENCE_BASE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_MAP__CLASS_NAME = ESSENCE_BASE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.SiInstanceInterfaceMapImpl <em>Si Instance Interface Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SiInstanceInterfaceMapImpl
	 * @see model.impl.ModelPackageImpl#getSiInstanceInterfaceMap()
	 * @generated
	 */
	int SI_INSTANCE_INTERFACE_MAP = 129;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_INTERFACE_MAP__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_INTERFACE_MAP__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.SiInstancePortMapImpl <em>Si Instance Port Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SiInstancePortMapImpl
	 * @see model.impl.ModelPackageImpl#getSiInstancePortMap()
	 * @generated
	 */
	int SI_INSTANCE_PORT_MAP = 130;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_PORT_MAP__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_PORT_MAP__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.SiInstanceShellInterfaceMapImpl <em>Si Instance Shell Interface Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SiInstanceShellInterfaceMapImpl
	 * @see model.impl.ModelPackageImpl#getSiInstanceShellInterfaceMap()
	 * @generated
	 */
	int SI_INSTANCE_SHELL_INTERFACE_MAP = 131;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_INTERFACE_MAP__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_INTERFACE_MAP__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.SiInstanceShellPortMapImpl <em>Si Instance Shell Port Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SiInstanceShellPortMapImpl
	 * @see model.impl.ModelPackageImpl#getSiInstanceShellPortMap()
	 * @generated
	 */
	int SI_INSTANCE_SHELL_PORT_MAP = 132;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_PORT_MAP__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_INSTANCE_SHELL_PORT_MAP__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.SiliconImpl <em>Silicon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SiliconImpl
	 * @see model.impl.ModelPackageImpl#getSilicon()
	 * @generated
	 */
	int SILICON = 133;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__PARENT = MODEL_ROOT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__CLASS_NAME = MODEL_ROOT__CLASS_NAME;

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
	 * The feature id for the '<em><b>Param Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__PARAM_MAP = MODEL_ROOT__PARAM_MAP;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON__GENERIC_MAP = MODEL_ROOT__GENERIC_MAP;

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
	 * The meta object id for the '{@link model.impl.SiliconInstanceImpl <em>Silicon Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SiliconInstanceImpl
	 * @see model.impl.ModelPackageImpl#getSiliconInstance()
	 * @generated
	 */
	int SILICON_INSTANCE = 134;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON_INSTANCE__PARENT = GENERAL_INSTANCE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILICON_INSTANCE__CLASS_NAME = GENERAL_INSTANCE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.SimpleDataTypeImpl <em>Simple Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SimpleDataTypeImpl
	 * @see model.impl.ModelPackageImpl#getSimpleDataType()
	 * @generated
	 */
	int SIMPLE_DATA_TYPE = 135;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA_TYPE__PARENT = VALUE_DATA_TYPE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA_TYPE__CLASS_NAME = VALUE_DATA_TYPE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.SiPortImpl <em>Si Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SiPortImpl
	 * @see model.impl.ModelPackageImpl#getSiPort()
	 * @generated
	 */
	int SI_PORT = 139;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.SiPortDBImpl <em>Si Port DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SiPortDBImpl
	 * @see model.impl.ModelPackageImpl#getSiPortDB()
	 * @generated
	 */
	int SI_PORT_DB = 140;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_DB__PARENT = MODEL_ROOT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_DB__CLASS_NAME = MODEL_ROOT__CLASS_NAME;

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
	 * The feature id for the '<em><b>Param Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_DB__PARAM_MAP = MODEL_ROOT__PARAM_MAP;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_DB__GENERIC_MAP = MODEL_ROOT__GENERIC_MAP;

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
	 * The meta object id for the '{@link model.impl.SiPortReqImpl <em>Si Port Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SiPortReqImpl
	 * @see model.impl.ModelPackageImpl#getSiPortReq()
	 * @generated
	 */
	int SI_PORT_REQ = 141;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_REQ__PARENT = ESSENCE_BASE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_PORT_REQ__CLASS_NAME = ESSENCE_BASE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.SiSignalImpl <em>Si Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SiSignalImpl
	 * @see model.impl.ModelPackageImpl#getSiSignal()
	 * @generated
	 */
	int SI_SIGNAL = 142;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.SiSignalDBImpl <em>Si Signal DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SiSignalDBImpl
	 * @see model.impl.ModelPackageImpl#getSiSignalDB()
	 * @generated
	 */
	int SI_SIGNAL_DB = 143;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_DB__PARENT = MODEL_ROOT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_DB__CLASS_NAME = MODEL_ROOT__CLASS_NAME;

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
	 * The feature id for the '<em><b>Param Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_DB__PARAM_MAP = MODEL_ROOT__PARAM_MAP;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SIGNAL_DB__GENERIC_MAP = MODEL_ROOT__GENERIC_MAP;

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
	 * The meta object id for the '{@link model.impl.SiSystemInstanceImpl <em>Si System Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SiSystemInstanceImpl
	 * @see model.impl.ModelPackageImpl#getSiSystemInstance()
	 * @generated
	 */
	int SI_SYSTEM_INSTANCE = 144;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SYSTEM_INSTANCE__PARENT = SI_INSTANCE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SI_SYSTEM_INSTANCE__CLASS_NAME = SI_INSTANCE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.StringDeclImpl <em>String Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.StringDeclImpl
	 * @see model.impl.ModelPackageImpl#getStringDecl()
	 * @generated
	 */
	int STRING_DECL = 145;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DECL__PARENT = PARAM_DECL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DECL__CLASS_NAME = PARAM_DECL__CLASS_NAME;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DECL__TYPE = PARAM_DECL__TYPE;

	/**
	 * The feature id for the '<em><b>Var Def Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DECL__VAR_DEF_VALUE = PARAM_DECL__VAR_DEF_VALUE;

	/**
	 * The feature id for the '<em><b>Var Def Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DECL__VAR_DEF_OVERRIDE = PARAM_DECL__VAR_DEF_OVERRIDE;

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
	 * The meta object id for the '{@link model.impl.StringDefImpl <em>String Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.StringDefImpl
	 * @see model.impl.ModelPackageImpl#getStringDef()
	 * @generated
	 */
	int STRING_DEF = 146;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF__PARENT = CONST_DEF__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF__CLASS_NAME = CONST_DEF__CLASS_NAME;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF__TYPE = CONST_DEF__TYPE;

	/**
	 * The feature id for the '<em><b>Var Def Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF__VAR_DEF_VALUE = CONST_DEF__VAR_DEF_VALUE;

	/**
	 * The feature id for the '<em><b>Var Def Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF__VAR_DEF_OVERRIDE = CONST_DEF__VAR_DEF_OVERRIDE;

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
	 * The meta object id for the '{@link model.impl.StringGenDeclImpl <em>String Gen Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.StringGenDeclImpl
	 * @see model.impl.ModelPackageImpl#getStringGenDecl()
	 * @generated
	 */
	int STRING_GEN_DECL = 147;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GEN_DECL__PARENT = GENERIC_DECL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GEN_DECL__CLASS_NAME = GENERIC_DECL__CLASS_NAME;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GEN_DECL__TYPE = GENERIC_DECL__TYPE;

	/**
	 * The feature id for the '<em><b>Var Def Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GEN_DECL__VAR_DEF_VALUE = GENERIC_DECL__VAR_DEF_VALUE;

	/**
	 * The feature id for the '<em><b>Var Def Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_GEN_DECL__VAR_DEF_OVERRIDE = GENERIC_DECL__VAR_DEF_OVERRIDE;

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
	 * The meta object id for the '{@link model.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SystemImpl
	 * @see model.impl.ModelPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 149;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PARENT = MODEL_ROOT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CLASS_NAME = MODEL_ROOT__CLASS_NAME;

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
	 * The feature id for the '<em><b>Param Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PARAM_MAP = MODEL_ROOT__PARAM_MAP;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__GENERIC_MAP = MODEL_ROOT__GENERIC_MAP;

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
	 * The meta object id for the '{@link model.impl.SystemInstanceImpl <em>System Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SystemInstanceImpl
	 * @see model.impl.ModelPackageImpl#getSystemInstance()
	 * @generated
	 */
	int SYSTEM_INSTANCE = 150;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__PARENT = INTERFACE_INSTANCE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INSTANCE__CLASS_NAME = INTERFACE_INSTANCE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TestImpl
	 * @see model.impl.ModelPackageImpl#getTest()
	 * @generated
	 */
	int TEST = 151;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__PARENT = SINGLE_SOURCE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__CLASS_NAME = SINGLE_SOURCE_NODE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.TestDBImpl <em>Test DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TestDBImpl
	 * @see model.impl.ModelPackageImpl#getTestDB()
	 * @generated
	 */
	int TEST_DB = 152;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DB__PARENT = MODEL_ROOT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DB__CLASS_NAME = MODEL_ROOT__CLASS_NAME;

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
	 * The feature id for the '<em><b>Param Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DB__PARAM_MAP = MODEL_ROOT__PARAM_MAP;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DB__GENERIC_MAP = MODEL_ROOT__GENERIC_MAP;

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
	 * The meta object id for the '{@link model.impl.TestReqImpl <em>Test Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TestReqImpl
	 * @see model.impl.ModelPackageImpl#getTestReq()
	 * @generated
	 */
	int TEST_REQ = 153;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_REQ__PARENT = ESSENCE_BASE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_REQ__CLASS_NAME = ESSENCE_BASE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.TransactionalPortImpl <em>Transactional Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TransactionalPortImpl
	 * @see model.impl.ModelPackageImpl#getTransactionalPort()
	 * @generated
	 */
	int TRANSACTIONAL_PORT = 154;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_PORT__PARENT = REAL_PORT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_PORT__CLASS_NAME = REAL_PORT__CLASS_NAME;

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
	 * The operation id for the '<em>Get Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_PORT___GET_DATA_TYPE = REAL_PORT___GET_DATA_TYPE;

	/**
	 * The number of operations of the '<em>Transactional Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_PORT_OPERATION_COUNT = REAL_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.TransactionalSignalImpl <em>Transactional Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TransactionalSignalImpl
	 * @see model.impl.ModelPackageImpl#getTransactionalSignal()
	 * @generated
	 */
	int TRANSACTIONAL_SIGNAL = 155;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_SIGNAL__PARENT = SIGNAL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_SIGNAL__CLASS_NAME = SIGNAL__CLASS_NAME;

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
	 * The operation id for the '<em>Get Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_SIGNAL___GET_DATA_TYPE = SIGNAL___GET_DATA_TYPE;

	/**
	 * The number of operations of the '<em>Transactional Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTIONAL_SIGNAL_OPERATION_COUNT = SIGNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.UnionImpl <em>Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.UnionImpl
	 * @see model.impl.ModelPackageImpl#getUnion()
	 * @generated
	 */
	int UNION = 156;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__PARENT = COMPLEX_DATA_TYPE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__CLASS_NAME = COMPLEX_DATA_TYPE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.VLNVImpl <em>VLNV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.VLNVImpl
	 * @see model.impl.ModelPackageImpl#getVLNV()
	 * @generated
	 */
	int VLNV = 160;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLNV__PARENT = ESSENCE_BASE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLNV__CLASS_NAME = ESSENCE_BASE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.VoidImpl <em>Void</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.VoidImpl
	 * @see model.impl.ModelPackageImpl#getVoid()
	 * @generated
	 */
	int VOID = 161;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID__PARENT = RETURN_DATA_TYPE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID__CLASS_NAME = RETURN_DATA_TYPE__CLASS_NAME;

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
	 * The meta object id for the '{@link model.impl.WirePortImpl <em>Wire Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.WirePortImpl
	 * @see model.impl.ModelPackageImpl#getWirePort()
	 * @generated
	 */
	int WIRE_PORT = 162;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_PORT__PARENT = REAL_PORT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_PORT__CLASS_NAME = REAL_PORT__CLASS_NAME;

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
	 * The operation id for the '<em>Get Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_PORT___GET_DATA_TYPE = REAL_PORT___GET_DATA_TYPE;

	/**
	 * The number of operations of the '<em>Wire Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_PORT_OPERATION_COUNT = REAL_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.WireSignalImpl <em>Wire Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.WireSignalImpl
	 * @see model.impl.ModelPackageImpl#getWireSignal()
	 * @generated
	 */
	int WIRE_SIGNAL = 163;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_SIGNAL__PARENT = SIGNAL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_SIGNAL__CLASS_NAME = SIGNAL__CLASS_NAME;

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
	 * The operation id for the '<em>Get Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_SIGNAL___GET_DATA_TYPE = SIGNAL___GET_DATA_TYPE;

	/**
	 * The number of operations of the '<em>Wire Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_SIGNAL_OPERATION_COUNT = SIGNAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.XRefImpl <em>XRef</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefImpl
	 * @see model.impl.ModelPackageImpl#getXRef()
	 * @generated
	 */
	int XREF = 164;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF__PARENT = REFERENCE__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF__CLASS_NAME = REFERENCE__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF__XREF_TARGET_ID = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF__XREF_TARGET = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XRef</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>XRef</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.XRefInternalImpl <em>XRef Internal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefInternalImpl
	 * @see model.impl.ModelPackageImpl#getXRefInternal()
	 * @generated
	 */
	int XREF_INTERNAL = 180;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL__PARENT = XREF__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL__CLASS_NAME = XREF__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL__XREF_TARGET_ID = XREF__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL__XREF_TARGET = XREF__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefConnectionImpl <em>XRef Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefConnectionImpl
	 * @see model.impl.ModelPackageImpl#getXRefConnection()
	 * @generated
	 */
	int XREF_CONNECTION = 165;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_CONNECTION__PARENT = XREF_INTERNAL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_CONNECTION__CLASS_NAME = XREF_INTERNAL__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_CONNECTION__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_CONNECTION__XREF_TARGET = XREF_INTERNAL__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefDataVarImpl <em>XRef Data Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefDataVarImpl
	 * @see model.impl.ModelPackageImpl#getXRefDataVar()
	 * @generated
	 */
	int XREF_DATA_VAR = 166;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_DATA_VAR__PARENT = XREF_INTERNAL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_DATA_VAR__CLASS_NAME = XREF_INTERNAL__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_DATA_VAR__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_DATA_VAR__XREF_TARGET = XREF_INTERNAL__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefExternalImpl <em>XRef External</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefExternalImpl
	 * @see model.impl.ModelPackageImpl#getXRefExternal()
	 * @generated
	 */
	int XREF_EXTERNAL = 168;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL__PARENT = XREF__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL__CLASS_NAME = XREF__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL__XREF_TARGET_ID = XREF__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL__XREF_TARGET = XREF__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefDirectImpl <em>XRef Direct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefDirectImpl
	 * @see model.impl.ModelPackageImpl#getXRefDirect()
	 * @generated
	 */
	int XREF_DIRECT = 167;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_DIRECT__PARENT = XREF_EXTERNAL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_DIRECT__CLASS_NAME = XREF_EXTERNAL__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_DIRECT__XREF_TARGET_ID = XREF_EXTERNAL__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_DIRECT__XREF_TARGET = XREF_EXTERNAL__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefExternalInterfaceImpl <em>XRef External Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefExternalInterfaceImpl
	 * @see model.impl.ModelPackageImpl#getXRefExternalInterface()
	 * @generated
	 */
	int XREF_EXTERNAL_INTERFACE = 169;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_INTERFACE__PARENT = XREF_DIRECT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_INTERFACE__CLASS_NAME = XREF_DIRECT__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_INTERFACE__XREF_TARGET_ID = XREF_DIRECT__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_INTERFACE__XREF_TARGET = XREF_DIRECT__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefExternalPortImpl <em>XRef External Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefExternalPortImpl
	 * @see model.impl.ModelPackageImpl#getXRefExternalPort()
	 * @generated
	 */
	int XREF_EXTERNAL_PORT = 170;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_PORT__PARENT = XREF_DIRECT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_PORT__CLASS_NAME = XREF_DIRECT__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_PORT__XREF_TARGET_ID = XREF_DIRECT__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_PORT__XREF_TARGET = XREF_DIRECT__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefExternalSignalImpl <em>XRef External Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefExternalSignalImpl
	 * @see model.impl.ModelPackageImpl#getXRefExternalSignal()
	 * @generated
	 */
	int XREF_EXTERNAL_SIGNAL = 171;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_SIGNAL__PARENT = XREF_DIRECT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_SIGNAL__CLASS_NAME = XREF_DIRECT__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_SIGNAL__XREF_TARGET_ID = XREF_DIRECT__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_EXTERNAL_SIGNAL__XREF_TARGET = XREF_DIRECT__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefGenericDeclImpl <em>XRef Generic Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefGenericDeclImpl
	 * @see model.impl.ModelPackageImpl#getXRefGenericDecl()
	 * @generated
	 */
	int XREF_GENERIC_DECL = 172;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_GENERIC_DECL__PARENT = XREF_DIRECT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_GENERIC_DECL__CLASS_NAME = XREF_DIRECT__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_GENERIC_DECL__XREF_TARGET_ID = XREF_DIRECT__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_GENERIC_DECL__XREF_TARGET = XREF_DIRECT__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefIFDPortImpl <em>XRef IFD Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefIFDPortImpl
	 * @see model.impl.ModelPackageImpl#getXRefIFDPort()
	 * @generated
	 */
	int XREF_IFD_PORT = 173;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IFD_PORT__PARENT = XREF_DIRECT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IFD_PORT__CLASS_NAME = XREF_DIRECT__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IFD_PORT__XREF_TARGET_ID = XREF_DIRECT__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IFD_PORT__XREF_TARGET = XREF_DIRECT__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefIndirectImpl <em>XRef Indirect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefIndirectImpl
	 * @see model.impl.ModelPackageImpl#getXRefIndirect()
	 * @generated
	 */
	int XREF_INDIRECT = 175;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INDIRECT__PARENT = XREF_EXTERNAL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INDIRECT__CLASS_NAME = XREF_EXTERNAL__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INDIRECT__XREF_TARGET_ID = XREF_EXTERNAL__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INDIRECT__XREF_TARGET = XREF_EXTERNAL__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefIndInterfaceImpl <em>XRef Ind Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefIndInterfaceImpl
	 * @see model.impl.ModelPackageImpl#getXRefIndInterface()
	 * @generated
	 */
	int XREF_IND_INTERFACE = 174;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_INTERFACE__PARENT = XREF_INDIRECT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_INTERFACE__CLASS_NAME = XREF_INDIRECT__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_INTERFACE__XREF_TARGET_ID = XREF_INDIRECT__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_INTERFACE__XREF_TARGET = XREF_INDIRECT__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefIndPinImpl <em>XRef Ind Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefIndPinImpl
	 * @see model.impl.ModelPackageImpl#getXRefIndPin()
	 * @generated
	 */
	int XREF_IND_PIN = 176;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_PIN__PARENT = XREF_INDIRECT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_PIN__CLASS_NAME = XREF_INDIRECT__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_PIN__XREF_TARGET_ID = XREF_INDIRECT__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_PIN__XREF_TARGET = XREF_INDIRECT__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefIndPortImpl <em>XRef Ind Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefIndPortImpl
	 * @see model.impl.ModelPackageImpl#getXRefIndPort()
	 * @generated
	 */
	int XREF_IND_PORT = 177;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_PORT__PARENT = XREF_INDIRECT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_PORT__CLASS_NAME = XREF_INDIRECT__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_PORT__XREF_TARGET_ID = XREF_INDIRECT__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_PORT__XREF_TARGET = XREF_INDIRECT__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefIndSinglePadImpl <em>XRef Ind Single Pad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefIndSinglePadImpl
	 * @see model.impl.ModelPackageImpl#getXRefIndSinglePad()
	 * @generated
	 */
	int XREF_IND_SINGLE_PAD = 178;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_SINGLE_PAD__PARENT = XREF_INDIRECT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_SINGLE_PAD__CLASS_NAME = XREF_INDIRECT__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_SINGLE_PAD__XREF_TARGET_ID = XREF_INDIRECT__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_IND_SINGLE_PAD__XREF_TARGET = XREF_INDIRECT__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefInstanceImpl <em>XRef Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefInstanceImpl
	 * @see model.impl.ModelPackageImpl#getXRefInstance()
	 * @generated
	 */
	int XREF_INSTANCE = 179;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INSTANCE__PARENT = XREF_INTERNAL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INSTANCE__CLASS_NAME = XREF_INTERNAL__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INSTANCE__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INSTANCE__XREF_TARGET = XREF_INTERNAL__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefInternalInterfaceImpl <em>XRef Internal Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefInternalInterfaceImpl
	 * @see model.impl.ModelPackageImpl#getXRefInternalInterface()
	 * @generated
	 */
	int XREF_INTERNAL_INTERFACE = 181;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_INTERFACE__PARENT = XREF_INTERNAL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_INTERFACE__CLASS_NAME = XREF_INTERNAL__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_INTERFACE__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_INTERFACE__XREF_TARGET = XREF_INTERNAL__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefInternalPortImpl <em>XRef Internal Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefInternalPortImpl
	 * @see model.impl.ModelPackageImpl#getXRefInternalPort()
	 * @generated
	 */
	int XREF_INTERNAL_PORT = 182;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_PORT__PARENT = XREF_INTERNAL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_PORT__CLASS_NAME = XREF_INTERNAL__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_PORT__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_PORT__XREF_TARGET = XREF_INTERNAL__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefInternalSignalImpl <em>XRef Internal Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefInternalSignalImpl
	 * @see model.impl.ModelPackageImpl#getXRefInternalSignal()
	 * @generated
	 */
	int XREF_INTERNAL_SIGNAL = 183;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_SIGNAL__PARENT = XREF_INTERNAL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_SIGNAL__CLASS_NAME = XREF_INTERNAL__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_SIGNAL__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_INTERNAL_SIGNAL__XREF_TARGET = XREF_INTERNAL__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefMasterInterfaceImpl <em>XRef Master Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefMasterInterfaceImpl
	 * @see model.impl.ModelPackageImpl#getXRefMasterInterface()
	 * @generated
	 */
	int XREF_MASTER_INTERFACE = 184;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_MASTER_INTERFACE__PARENT = XREF_INTERNAL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_MASTER_INTERFACE__CLASS_NAME = XREF_INTERNAL__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_MASTER_INTERFACE__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_MASTER_INTERFACE__XREF_TARGET = XREF_INTERNAL__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefNetImpl <em>XRef Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefNetImpl
	 * @see model.impl.ModelPackageImpl#getXRefNet()
	 * @generated
	 */
	int XREF_NET = 185;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_NET__PARENT = XREF_INTERNAL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_NET__CLASS_NAME = XREF_INTERNAL__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_NET__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_NET__XREF_TARGET = XREF_INTERNAL__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefNoneInterfaceImpl <em>XRef None Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefNoneInterfaceImpl
	 * @see model.impl.ModelPackageImpl#getXRefNoneInterface()
	 * @generated
	 */
	int XREF_NONE_INTERFACE = 186;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_NONE_INTERFACE__PARENT = XREF_DIRECT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_NONE_INTERFACE__CLASS_NAME = XREF_DIRECT__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_NONE_INTERFACE__XREF_TARGET_ID = XREF_DIRECT__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_NONE_INTERFACE__XREF_TARGET = XREF_DIRECT__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefVLNVImpl <em>XRef VLNV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefVLNVImpl
	 * @see model.impl.ModelPackageImpl#getXRefVLNV()
	 * @generated
	 */
	int XREF_VLNV = 199;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_VLNV__PARENT = XREF_DIRECT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_VLNV__CLASS_NAME = XREF_DIRECT__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_VLNV__XREF_TARGET_ID = XREF_DIRECT__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_VLNV__XREF_TARGET = XREF_DIRECT__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefPadTypeImpl <em>XRef Pad Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefPadTypeImpl
	 * @see model.impl.ModelPackageImpl#getXRefPadType()
	 * @generated
	 */
	int XREF_PAD_TYPE = 187;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_PAD_TYPE__PARENT = XREF_VLNV__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_PAD_TYPE__CLASS_NAME = XREF_VLNV__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_PAD_TYPE__XREF_TARGET_ID = XREF_VLNV__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_PAD_TYPE__XREF_TARGET = XREF_VLNV__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefParamDeclImpl <em>XRef Param Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefParamDeclImpl
	 * @see model.impl.ModelPackageImpl#getXRefParamDecl()
	 * @generated
	 */
	int XREF_PARAM_DECL = 188;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_PARAM_DECL__PARENT = XREF_DIRECT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_PARAM_DECL__CLASS_NAME = XREF_DIRECT__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_PARAM_DECL__XREF_TARGET_ID = XREF_DIRECT__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_PARAM_DECL__XREF_TARGET = XREF_DIRECT__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefPinImpl <em>XRef Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefPinImpl
	 * @see model.impl.ModelPackageImpl#getXRefPin()
	 * @generated
	 */
	int XREF_PIN = 189;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_PIN__PARENT = XREF_DIRECT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_PIN__CLASS_NAME = XREF_DIRECT__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_PIN__XREF_TARGET_ID = XREF_DIRECT__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_PIN__XREF_TARGET = XREF_DIRECT__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefPowerDomainImpl <em>XRef Power Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefPowerDomainImpl
	 * @see model.impl.ModelPackageImpl#getXRefPowerDomain()
	 * @generated
	 */
	int XREF_POWER_DOMAIN = 190;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_POWER_DOMAIN__PARENT = XREF_INTERNAL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_POWER_DOMAIN__CLASS_NAME = XREF_INTERNAL__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_POWER_DOMAIN__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_POWER_DOMAIN__XREF_TARGET = XREF_INTERNAL__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefRealPortImpl <em>XRef Real Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefRealPortImpl
	 * @see model.impl.ModelPackageImpl#getXRefRealPort()
	 * @generated
	 */
	int XREF_REAL_PORT = 191;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REAL_PORT__PARENT = XREF_INTERNAL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REAL_PORT__CLASS_NAME = XREF_INTERNAL__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REAL_PORT__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REAL_PORT__XREF_TARGET = XREF_INTERNAL__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefRegisterViewImpl <em>XRef Register View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefRegisterViewImpl
	 * @see model.impl.ModelPackageImpl#getXRefRegisterView()
	 * @generated
	 */
	int XREF_REGISTER_VIEW = 192;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REGISTER_VIEW__PARENT = XREF_INTERNAL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REGISTER_VIEW__CLASS_NAME = XREF_INTERNAL__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REGISTER_VIEW__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REGISTER_VIEW__XREF_TARGET = XREF_INTERNAL__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefRegMemSetImpl <em>XRef Reg Mem Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefRegMemSetImpl
	 * @see model.impl.ModelPackageImpl#getXRefRegMemSet()
	 * @generated
	 */
	int XREF_REG_MEM_SET = 193;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REG_MEM_SET__PARENT = XREF_INTERNAL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REG_MEM_SET__CLASS_NAME = XREF_INTERNAL__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REG_MEM_SET__XREF_TARGET_ID = XREF_INTERNAL__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_REG_MEM_SET__XREF_TARGET = XREF_INTERNAL__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefSinglePadImpl <em>XRef Single Pad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefSinglePadImpl
	 * @see model.impl.ModelPackageImpl#getXRefSinglePad()
	 * @generated
	 */
	int XREF_SINGLE_PAD = 194;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SINGLE_PAD__PARENT = XREF_DIRECT__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SINGLE_PAD__CLASS_NAME = XREF_DIRECT__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SINGLE_PAD__XREF_TARGET_ID = XREF_DIRECT__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SINGLE_PAD__XREF_TARGET = XREF_DIRECT__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefSiPortImpl <em>XRef Si Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefSiPortImpl
	 * @see model.impl.ModelPackageImpl#getXRefSiPort()
	 * @generated
	 */
	int XREF_SI_PORT = 195;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SI_PORT__PARENT = XREF_VLNV__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SI_PORT__CLASS_NAME = XREF_VLNV__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SI_PORT__XREF_TARGET_ID = XREF_VLNV__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SI_PORT__XREF_TARGET = XREF_VLNV__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefSiSignalImpl <em>XRef Si Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefSiSignalImpl
	 * @see model.impl.ModelPackageImpl#getXRefSiSignal()
	 * @generated
	 */
	int XREF_SI_SIGNAL = 196;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SI_SIGNAL__PARENT = XREF_VLNV__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SI_SIGNAL__CLASS_NAME = XREF_VLNV__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SI_SIGNAL__XREF_TARGET_ID = XREF_VLNV__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SI_SIGNAL__XREF_TARGET = XREF_VLNV__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefSlaveInterfaceImpl <em>XRef Slave Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefSlaveInterfaceImpl
	 * @see model.impl.ModelPackageImpl#getXRefSlaveInterface()
	 * @generated
	 */
	int XREF_SLAVE_INTERFACE = 197;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SLAVE_INTERFACE__PARENT = XREF_EXTERNAL__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SLAVE_INTERFACE__CLASS_NAME = XREF_EXTERNAL__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SLAVE_INTERFACE__XREF_TARGET_ID = XREF_EXTERNAL__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_SLAVE_INTERFACE__XREF_TARGET = XREF_EXTERNAL__XREF_TARGET;

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
	 * The meta object id for the '{@link model.impl.XRefTestImpl <em>XRef Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.XRefTestImpl
	 * @see model.impl.ModelPackageImpl#getXRefTest()
	 * @generated
	 */
	int XREF_TEST = 198;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_TEST__PARENT = XREF_VLNV__PARENT;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_TEST__CLASS_NAME = XREF_VLNV__CLASS_NAME;

	/**
	 * The feature id for the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_TEST__XREF_TARGET_ID = XREF_VLNV__XREF_TARGET_ID;

	/**
	 * The feature id for the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREF_TEST__XREF_TARGET = XREF_VLNV__XREF_TARGET;

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
	 * The meta object id for the '{@link model.AccessType <em>Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.AccessType
	 * @see model.impl.ModelPackageImpl#getAccessType()
	 * @generated
	 */
	int ACCESS_TYPE = 200;

	/**
	 * The meta object id for the '{@link model.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.ActionType
	 * @see model.impl.ModelPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 201;

	/**
	 * The meta object id for the '{@link model.BehaviorType <em>Behavior Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.BehaviorType
	 * @see model.impl.ModelPackageImpl#getBehaviorType()
	 * @generated
	 */
	int BEHAVIOR_TYPE = 202;

	/**
	 * The meta object id for the '{@link model.BusErrorType <em>Bus Error Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.BusErrorType
	 * @see model.impl.ModelPackageImpl#getBusErrorType()
	 * @generated
	 */
	int BUS_ERROR_TYPE = 203;

	/**
	 * The meta object id for the '{@link model.EndianType <em>Endian Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.EndianType
	 * @see model.impl.ModelPackageImpl#getEndianType()
	 * @generated
	 */
	int ENDIAN_TYPE = 204;

	/**
	 * The meta object id for the '{@link model.FunctionType <em>Function Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.FunctionType
	 * @see model.impl.ModelPackageImpl#getFunctionType()
	 * @generated
	 */
	int FUNCTION_TYPE = 205;

	/**
	 * The meta object id for the '{@link model.InterfaceDefRoleType <em>Interface Def Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.InterfaceDefRoleType
	 * @see model.impl.ModelPackageImpl#getInterfaceDefRoleType()
	 * @generated
	 */
	int INTERFACE_DEF_ROLE_TYPE = 206;

	/**
	 * The meta object id for the '{@link model.InterfaceRoleType <em>Interface Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.InterfaceRoleType
	 * @see model.impl.ModelPackageImpl#getInterfaceRoleType()
	 * @generated
	 */
	int INTERFACE_ROLE_TYPE = 207;

	/**
	 * The meta object id for the '{@link model.MessageType <em>Message Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.MessageType
	 * @see model.impl.ModelPackageImpl#getMessageType()
	 * @generated
	 */
	int MESSAGE_TYPE = 208;

	/**
	 * The meta object id for the '{@link model.PortDirection <em>Port Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.PortDirection
	 * @see model.impl.ModelPackageImpl#getPortDirection()
	 * @generated
	 */
	int PORT_DIRECTION = 209;

	/**
	 * The meta object id for the '{@link model.PortInitiative <em>Port Initiative</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.PortInitiative
	 * @see model.impl.ModelPackageImpl#getPortInitiative()
	 * @generated
	 */
	int PORT_INITIATIVE = 210;

	/**
	 * The meta object id for the '{@link model.ReservedType <em>Reserved Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.ReservedType
	 * @see model.impl.ModelPackageImpl#getReservedType()
	 * @generated
	 */
	int RESERVED_TYPE = 211;

	/**
	 * The meta object id for the '{@link model.SignType <em>Sign Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.SignType
	 * @see model.impl.ModelPackageImpl#getSignType()
	 * @generated
	 */
	int SIGN_TYPE = 212;

	/**
	 * The meta object id for the '{@link model.SpecialType <em>Special Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.SpecialType
	 * @see model.impl.ModelPackageImpl#getSpecialType()
	 * @generated
	 */
	int SPECIAL_TYPE = 213;

	/**
	 * The meta object id for the '{@link model.StrobeType <em>Strobe Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.StrobeType
	 * @see model.impl.ModelPackageImpl#getStrobeType()
	 * @generated
	 */
	int STROBE_TYPE = 214;

	/**
	 * The meta object id for the '{@link model.SyncMode <em>Sync Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.SyncMode
	 * @see model.impl.ModelPackageImpl#getSyncMode()
	 * @generated
	 */
	int SYNC_MODE = 215;

	/**
	 * The meta object id for the '{@link model.TopSpinType <em>Top Spin Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.TopSpinType
	 * @see model.impl.ModelPackageImpl#getTopSpinType()
	 * @generated
	 */
	int TOP_SPIN_TYPE = 216;

	/**
	 * The meta object id for the '{@link model.VirtualType <em>Virtual Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.VirtualType
	 * @see model.impl.ModelPackageImpl#getVirtualType()
	 * @generated
	 */
	int VIRTUAL_TYPE = 217;

	/**
	 * The meta object id for the '<em>Access Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.AccessType
	 * @see model.impl.ModelPackageImpl#getAccessTypeObject()
	 * @generated
	 */
	int ACCESS_TYPE_OBJECT = 218;

	/**
	 * The meta object id for the '<em>Action Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.ActionType
	 * @see model.impl.ModelPackageImpl#getActionTypeObject()
	 * @generated
	 */
	int ACTION_TYPE_OBJECT = 219;

	/**
	 * The meta object id for the '<em>Behavior Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.BehaviorType
	 * @see model.impl.ModelPackageImpl#getBehaviorTypeObject()
	 * @generated
	 */
	int BEHAVIOR_TYPE_OBJECT = 220;

	/**
	 * The meta object id for the '<em>Boolean Expr</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see model.impl.ModelPackageImpl#getBooleanExpr()
	 * @generated
	 */
	int BOOLEAN_EXPR = 221;

	/**
	 * The meta object id for the '<em>Boolean Literal</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see model.impl.ModelPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 222;

	/**
	 * The meta object id for the '<em>Bus Error Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.BusErrorType
	 * @see model.impl.ModelPackageImpl#getBusErrorTypeObject()
	 * @generated
	 */
	int BUS_ERROR_TYPE_OBJECT = 223;

	/**
	 * The meta object id for the '<em>Common Expr</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see model.impl.ModelPackageImpl#getCommonExpr()
	 * @generated
	 */
	int COMMON_EXPR = 224;

	/**
	 * The meta object id for the '<em>Endian Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.EndianType
	 * @see model.impl.ModelPackageImpl#getEndianTypeObject()
	 * @generated
	 */
	int ENDIAN_TYPE_OBJECT = 225;

	/**
	 * The meta object id for the '<em>Function Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.FunctionType
	 * @see model.impl.ModelPackageImpl#getFunctionTypeObject()
	 * @generated
	 */
	int FUNCTION_TYPE_OBJECT = 226;

	/**
	 * The meta object id for the '<em>Integer Expr</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see model.impl.ModelPackageImpl#getIntegerExpr()
	 * @generated
	 */
	int INTEGER_EXPR = 227;

	/**
	 * The meta object id for the '<em>Integer Literal</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see model.impl.ModelPackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 228;

	/**
	 * The meta object id for the '<em>Interface Def Role Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.InterfaceDefRoleType
	 * @see model.impl.ModelPackageImpl#getInterfaceDefRoleTypeObject()
	 * @generated
	 */
	int INTERFACE_DEF_ROLE_TYPE_OBJECT = 229;

	/**
	 * The meta object id for the '<em>Interface Role Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.InterfaceRoleType
	 * @see model.impl.ModelPackageImpl#getInterfaceRoleTypeObject()
	 * @generated
	 */
	int INTERFACE_ROLE_TYPE_OBJECT = 230;

	/**
	 * The meta object id for the '<em>Message Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.MessageType
	 * @see model.impl.ModelPackageImpl#getMessageTypeObject()
	 * @generated
	 */
	int MESSAGE_TYPE_OBJECT = 231;

	/**
	 * The meta object id for the '<em>Path Expr</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see model.impl.ModelPackageImpl#getPathExpr()
	 * @generated
	 */
	int PATH_EXPR = 232;

	/**
	 * The meta object id for the '<em>Port Direction Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.PortDirection
	 * @see model.impl.ModelPackageImpl#getPortDirectionObject()
	 * @generated
	 */
	int PORT_DIRECTION_OBJECT = 233;

	/**
	 * The meta object id for the '<em>Port Initiative Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.PortInitiative
	 * @see model.impl.ModelPackageImpl#getPortInitiativeObject()
	 * @generated
	 */
	int PORT_INITIATIVE_OBJECT = 234;

	/**
	 * The meta object id for the '<em>Reserved Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.ReservedType
	 * @see model.impl.ModelPackageImpl#getReservedTypeObject()
	 * @generated
	 */
	int RESERVED_TYPE_OBJECT = 235;

	/**
	 * The meta object id for the '<em>Sign Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.SignType
	 * @see model.impl.ModelPackageImpl#getSignTypeObject()
	 * @generated
	 */
	int SIGN_TYPE_OBJECT = 236;

	/**
	 * The meta object id for the '<em>Special Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.SpecialType
	 * @see model.impl.ModelPackageImpl#getSpecialTypeObject()
	 * @generated
	 */
	int SPECIAL_TYPE_OBJECT = 237;

	/**
	 * The meta object id for the '<em>String Expr</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see model.impl.ModelPackageImpl#getStringExpr()
	 * @generated
	 */
	int STRING_EXPR = 238;

	/**
	 * The meta object id for the '<em>String Literal</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see model.impl.ModelPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 239;

	/**
	 * The meta object id for the '<em>Strobe Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.StrobeType
	 * @see model.impl.ModelPackageImpl#getStrobeTypeObject()
	 * @generated
	 */
	int STROBE_TYPE_OBJECT = 240;

	/**
	 * The meta object id for the '<em>Sync Mode Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.SyncMode
	 * @see model.impl.ModelPackageImpl#getSyncModeObject()
	 * @generated
	 */
	int SYNC_MODE_OBJECT = 241;

	/**
	 * The meta object id for the '<em>Top Spin Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.TopSpinType
	 * @see model.impl.ModelPackageImpl#getTopSpinTypeObject()
	 * @generated
	 */
	int TOP_SPIN_TYPE_OBJECT = 242;

	/**
	 * The meta object id for the '<em>Virtual Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.VirtualType
	 * @see model.impl.ModelPackageImpl#getVirtualTypeObject()
	 * @generated
	 */
	int VIRTUAL_TYPE_OBJECT = 243;


	/**
	 * Returns the meta object for class '{@link model.Access <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access</em>'.
	 * @see model.Access
	 * @generated
	 */
	EClass getAccess();

	/**
	 * Returns the meta object for the attribute '{@link model.Access#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Type</em>'.
	 * @see model.Access#getAccessType()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_AccessType();

	/**
	 * Returns the meta object for the attribute '{@link model.Access#getStrobeType <em>Strobe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strobe Type</em>'.
	 * @see model.Access#getStrobeType()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_StrobeType();

	/**
	 * Returns the meta object for the attribute list '{@link model.Access#getActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Action Type</em>'.
	 * @see model.Access#getActionType()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_ActionType();

	/**
	 * Returns the meta object for the attribute '{@link model.Access#isClear <em>Clear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clear</em>'.
	 * @see model.Access#isClear()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_Clear();

	/**
	 * Returns the meta object for the attribute '{@link model.Access#isEnable <em>Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable</em>'.
	 * @see model.Access#isEnable()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_Enable();

	/**
	 * Returns the meta object for the attribute '{@link model.Access#isInterrupt <em>Interrupt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interrupt</em>'.
	 * @see model.Access#isInterrupt()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_Interrupt();

	/**
	 * Returns the meta object for the attribute '{@link model.Access#isPulse <em>Pulse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pulse</em>'.
	 * @see model.Access#isPulse()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_Pulse();

	/**
	 * Returns the meta object for the attribute '{@link model.Access#isReset <em>Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset</em>'.
	 * @see model.Access#isReset()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_Reset();

	/**
	 * Returns the meta object for the attribute '{@link model.Access#isSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set</em>'.
	 * @see model.Access#isSet()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_Set();

	/**
	 * Returns the meta object for the attribute '{@link model.Access#isStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see model.Access#isStatus()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_Status();

	/**
	 * Returns the meta object for the attribute '{@link model.Access#isToggle <em>Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Toggle</em>'.
	 * @see model.Access#isToggle()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_Toggle();

	/**
	 * Returns the meta object for the attribute '{@link model.Access#isRegister <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Register</em>'.
	 * @see model.Access#isRegister()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_Register();

	/**
	 * Returns the meta object for the attribute '{@link model.Access#isTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see model.Access#isTrigger()
	 * @see #getAccess()
	 * @generated
	 */
	EAttribute getAccess_Trigger();

	/**
	 * Returns the meta object for class '{@link model.AccessByIndex <em>Access By Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access By Index</em>'.
	 * @see model.AccessByIndex
	 * @generated
	 */
	EClass getAccessByIndex();

	/**
	 * Returns the meta object for the attribute '{@link model.AccessByIndex#isAscending <em>Ascending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ascending</em>'.
	 * @see model.AccessByIndex#isAscending()
	 * @see #getAccessByIndex()
	 * @generated
	 */
	EAttribute getAccessByIndex_Ascending();

	/**
	 * Returns the meta object for the attribute '{@link model.AccessByIndex#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see model.AccessByIndex#getLeft()
	 * @see #getAccessByIndex()
	 * @generated
	 */
	EAttribute getAccessByIndex_Left();

	/**
	 * Returns the meta object for the attribute '{@link model.AccessByIndex#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see model.AccessByIndex#getRight()
	 * @see #getAccessByIndex()
	 * @generated
	 */
	EAttribute getAccessByIndex_Right();

	/**
	 * Returns the meta object for the containment reference '{@link model.AccessByIndex#getSimpleSubElementAccess <em>Simple Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Sub Element Access</em>'.
	 * @see model.AccessByIndex#getSimpleSubElementAccess()
	 * @see #getAccessByIndex()
	 * @generated
	 */
	EReference getAccessByIndex_SimpleSubElementAccess();

	/**
	 * Returns the meta object for class '{@link model.AccessByName <em>Access By Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access By Name</em>'.
	 * @see model.AccessByName
	 * @generated
	 */
	EClass getAccessByName();

	/**
	 * Returns the meta object for the attribute '{@link model.AccessByName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.AccessByName#getName()
	 * @see #getAccessByName()
	 * @generated
	 */
	EAttribute getAccessByName_Name();

	/**
	 * Returns the meta object for the containment reference '{@link model.AccessByName#getSimpleSubElementAccess <em>Simple Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Sub Element Access</em>'.
	 * @see model.AccessByName#getSimpleSubElementAccess()
	 * @see #getAccessByName()
	 * @generated
	 */
	EReference getAccessByName_SimpleSubElementAccess();

	/**
	 * Returns the meta object for class '{@link model.AccessCondition <em>Access Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Condition</em>'.
	 * @see model.AccessCondition
	 * @generated
	 */
	EClass getAccessCondition();

	/**
	 * Returns the meta object for the attribute '{@link model.AccessCondition#getAccessLevel <em>Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Level</em>'.
	 * @see model.AccessCondition#getAccessLevel()
	 * @see #getAccessCondition()
	 * @generated
	 */
	EAttribute getAccessCondition_AccessLevel();

	/**
	 * Returns the meta object for the attribute '{@link model.AccessCondition#getBusErrorType <em>Bus Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Error Type</em>'.
	 * @see model.AccessCondition#getBusErrorType()
	 * @see #getAccessCondition()
	 * @generated
	 */
	EAttribute getAccessCondition_BusErrorType();

	/**
	 * Returns the meta object for class '{@link model.AccessLevel <em>Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Level</em>'.
	 * @see model.AccessLevel
	 * @generated
	 */
	EClass getAccessLevel();

	/**
	 * Returns the meta object for the attribute '{@link model.AccessLevel#getAccessLevel <em>Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Level</em>'.
	 * @see model.AccessLevel#getAccessLevel()
	 * @see #getAccessLevel()
	 * @generated
	 */
	EAttribute getAccessLevel_AccessLevel();

	/**
	 * Returns the meta object for the attribute '{@link model.AccessLevel#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Type</em>'.
	 * @see model.AccessLevel#getAccessType()
	 * @see #getAccessLevel()
	 * @generated
	 */
	EAttribute getAccessLevel_AccessType();

	/**
	 * Returns the meta object for class '{@link model.AddressBlock <em>Address Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Block</em>'.
	 * @see model.AddressBlock
	 * @generated
	 */
	EClass getAddressBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link model.AddressBlock#getXRefRegMemSet <em>XRef Reg Mem Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>XRef Reg Mem Set</em>'.
	 * @see model.AddressBlock#getXRefRegMemSet()
	 * @see #getAddressBlock()
	 * @generated
	 */
	EReference getAddressBlock_XRefRegMemSet();

	/**
	 * Returns the meta object for the containment reference list '{@link model.AddressBlock#getXRefMasterInterface <em>XRef Master Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>XRef Master Interface</em>'.
	 * @see model.AddressBlock#getXRefMasterInterface()
	 * @see #getAddressBlock()
	 * @generated
	 */
	EReference getAddressBlock_XRefMasterInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link model.AddressBlock#getXRefSlaveInterface <em>XRef Slave Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>XRef Slave Interface</em>'.
	 * @see model.AddressBlock#getXRefSlaveInterface()
	 * @see #getAddressBlock()
	 * @generated
	 */
	EReference getAddressBlock_XRefSlaveInterface();

	/**
	 * Returns the meta object for class '{@link model.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see model.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the containment reference '{@link model.Array#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see model.Array#getDataType()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_DataType();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Array#getArrayDimension <em>Array Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Array Dimension</em>'.
	 * @see model.Array#getArrayDimension()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_ArrayDimension();

	/**
	 * Returns the meta object for class '{@link model.ArrayDimension <em>Array Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Dimension</em>'.
	 * @see model.ArrayDimension
	 * @generated
	 */
	EClass getArrayDimension();

	/**
	 * Returns the meta object for the attribute '{@link model.ArrayDimension#isAscending <em>Ascending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ascending</em>'.
	 * @see model.ArrayDimension#isAscending()
	 * @see #getArrayDimension()
	 * @generated
	 */
	EAttribute getArrayDimension_Ascending();

	/**
	 * Returns the meta object for the attribute '{@link model.ArrayDimension#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see model.ArrayDimension#getLeft()
	 * @see #getArrayDimension()
	 * @generated
	 */
	EAttribute getArrayDimension_Left();

	/**
	 * Returns the meta object for the attribute '{@link model.ArrayDimension#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see model.ArrayDimension#getRight()
	 * @see #getArrayDimension()
	 * @generated
	 */
	EAttribute getArrayDimension_Right();

	/**
	 * Returns the meta object for class '{@link model.BitField <em>Bit Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Field</em>'.
	 * @see model.BitField
	 * @generated
	 */
	EClass getBitField();

	/**
	 * Returns the meta object for the containment reference '{@link model.BitField#getAccessExternal <em>Access External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access External</em>'.
	 * @see model.BitField#getAccessExternal()
	 * @see #getBitField()
	 * @generated
	 */
	EReference getBitField_AccessExternal();

	/**
	 * Returns the meta object for the containment reference '{@link model.BitField#getAccessInternal <em>Access Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Internal</em>'.
	 * @see model.BitField#getAccessInternal()
	 * @see #getBitField()
	 * @generated
	 */
	EReference getBitField_AccessInternal();

	/**
	 * Returns the meta object for the attribute '{@link model.BitField#getMaxVal <em>Max Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Val</em>'.
	 * @see model.BitField#getMaxVal()
	 * @see #getBitField()
	 * @generated
	 */
	EAttribute getBitField_MaxVal();

	/**
	 * Returns the meta object for the attribute '{@link model.BitField#getMinVal <em>Min Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Val</em>'.
	 * @see model.BitField#getMinVal()
	 * @see #getBitField()
	 * @generated
	 */
	EAttribute getBitField_MinVal();

	/**
	 * Returns the meta object for the attribute '{@link model.BitField#getReserved <em>Reserved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved</em>'.
	 * @see model.BitField#getReserved()
	 * @see #getBitField()
	 * @generated
	 */
	EAttribute getBitField_Reserved();

	/**
	 * Returns the meta object for the attribute '{@link model.BitField#getSignInterpretation <em>Sign Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sign Interpretation</em>'.
	 * @see model.BitField#getSignInterpretation()
	 * @see #getBitField()
	 * @generated
	 */
	EAttribute getBitField_SignInterpretation();

	/**
	 * Returns the meta object for the attribute '{@link model.BitField#getVirtual <em>Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual</em>'.
	 * @see model.BitField#getVirtual()
	 * @see #getBitField()
	 * @generated
	 */
	EAttribute getBitField_Virtual();

	/**
	 * Returns the meta object for the attribute '{@link model.BitField#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see model.BitField#getDefaultValue()
	 * @see #getBitField()
	 * @generated
	 */
	EAttribute getBitField_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link model.BitField#getDefaultMask <em>Default Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Mask</em>'.
	 * @see model.BitField#getDefaultMask()
	 * @see #getBitField()
	 * @generated
	 */
	EAttribute getBitField_DefaultMask();

	/**
	 * Returns the meta object for the containment reference list '{@link model.BitField#getAccessLevel <em>Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Level</em>'.
	 * @see model.BitField#getAccessLevel()
	 * @see #getBitField()
	 * @generated
	 */
	EReference getBitField_AccessLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link model.BitField#getEnumerationElement <em>Enumeration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration Element</em>'.
	 * @see model.BitField#getEnumerationElement()
	 * @see #getBitField()
	 * @generated
	 */
	EReference getBitField_EnumerationElement();

	/**
	 * Returns the meta object for the attribute '{@link model.BitField#isCheckParent <em>Check Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Parent</em>'.
	 * @see model.BitField#isCheckParent()
	 * @see #getBitField()
	 * @generated
	 */
	EAttribute getBitField_CheckParent();

	/**
	 * Returns the meta object for the '{@link model.BitField#getMinValValue(java.util.Map) <em>Get Min Val Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Min Val Value</em>' operation.
	 * @see model.BitField#getMinValValue(java.util.Map)
	 * @generated
	 */
	EOperation getBitField__GetMinValValue__Map();

	/**
	 * Returns the meta object for the '{@link model.BitField#getMaxValValue(java.util.Map) <em>Get Max Val Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Max Val Value</em>' operation.
	 * @see model.BitField#getMaxValValue(java.util.Map)
	 * @generated
	 */
	EOperation getBitField__GetMaxValValue__Map();

	/**
	 * Returns the meta object for class '{@link model.BitFieldElement <em>Bit Field Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Field Element</em>'.
	 * @see model.BitFieldElement
	 * @generated
	 */
	EClass getBitFieldElement();

	/**
	 * Returns the meta object for the attribute '{@link model.BitFieldElement#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see model.BitFieldElement#getOffset()
	 * @see #getBitFieldElement()
	 * @generated
	 */
	EAttribute getBitFieldElement_Offset();

	/**
	 * Returns the meta object for class '{@link model.BitFieldGapElement <em>Bit Field Gap Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Field Gap Element</em>'.
	 * @see model.BitFieldGapElement
	 * @generated
	 */
	EClass getBitFieldGapElement();

	/**
	 * Returns the meta object for class '{@link model.BitFieldSequence <em>Bit Field Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Field Sequence</em>'.
	 * @see model.BitFieldSequence
	 * @generated
	 */
	EClass getBitFieldSequence();

	/**
	 * Returns the meta object for the attribute '{@link model.BitFieldSequence#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see model.BitFieldSequence#getCount()
	 * @see #getBitFieldSequence()
	 * @generated
	 */
	EAttribute getBitFieldSequence_Count();

	/**
	 * Returns the meta object for the attribute '{@link model.BitFieldSequence#getMinIndex <em>Min Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Index</em>'.
	 * @see model.BitFieldSequence#getMinIndex()
	 * @see #getBitFieldSequence()
	 * @generated
	 */
	EAttribute getBitFieldSequence_MinIndex();

	/**
	 * Returns the meta object for the attribute '{@link model.BitFieldSequence#getIndexStep <em>Index Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Step</em>'.
	 * @see model.BitFieldSequence#getIndexStep()
	 * @see #getBitFieldSequence()
	 * @generated
	 */
	EAttribute getBitFieldSequence_IndexStep();

	/**
	 * Returns the meta object for the attribute '{@link model.BitFieldSequence#getIndexVar <em>Index Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Var</em>'.
	 * @see model.BitFieldSequence#getIndexVar()
	 * @see #getBitFieldSequence()
	 * @generated
	 */
	EAttribute getBitFieldSequence_IndexVar();

	/**
	 * Returns the meta object for the attribute '{@link model.BitFieldSequence#getAltFormat <em>Alt Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Format</em>'.
	 * @see model.BitFieldSequence#getAltFormat()
	 * @see #getBitFieldSequence()
	 * @generated
	 */
	EAttribute getBitFieldSequence_AltFormat();

	/**
	 * Returns the meta object for the containment reference list '{@link model.BitFieldSequence#getBitFieldSequenceElement <em>Bit Field Sequence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bit Field Sequence Element</em>'.
	 * @see model.BitFieldSequence#getBitFieldSequenceElement()
	 * @see #getBitFieldSequence()
	 * @generated
	 */
	EReference getBitFieldSequence_BitFieldSequenceElement();

	/**
	 * Returns the meta object for the '{@link model.BitFieldSequence#getElement() <em>Get Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Element</em>' operation.
	 * @see model.BitFieldSequence#getElement()
	 * @generated
	 */
	EOperation getBitFieldSequence__GetElement();

	/**
	 * Returns the meta object for class '{@link model.BitFieldSequenceElement <em>Bit Field Sequence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Field Sequence Element</em>'.
	 * @see model.BitFieldSequenceElement
	 * @generated
	 */
	EClass getBitFieldSequenceElement();

	/**
	 * Returns the meta object for the attribute '{@link model.BitFieldSequenceElement#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see model.BitFieldSequenceElement#getWidth()
	 * @see #getBitFieldSequenceElement()
	 * @generated
	 */
	EAttribute getBitFieldSequenceElement_Width();

	/**
	 * Returns the meta object for class '{@link model.BooleanDecl <em>Boolean Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Decl</em>'.
	 * @see model.BooleanDecl
	 * @generated
	 */
	EClass getBooleanDecl();

	/**
	 * Returns the meta object for the attribute '{@link model.BooleanDecl#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see model.BooleanDecl#getDefaultValue()
	 * @see #getBooleanDecl()
	 * @generated
	 */
	EAttribute getBooleanDecl_DefaultValue();

	/**
	 * Returns the meta object for class '{@link model.BooleanDef <em>Boolean Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Def</em>'.
	 * @see model.BooleanDef
	 * @generated
	 */
	EClass getBooleanDef();

	/**
	 * Returns the meta object for the attribute '{@link model.BooleanDef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see model.BooleanDef#getValue()
	 * @see #getBooleanDef()
	 * @generated
	 */
	EAttribute getBooleanDef_Value();

	/**
	 * Returns the meta object for class '{@link model.BooleanGenDecl <em>Boolean Gen Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Gen Decl</em>'.
	 * @see model.BooleanGenDecl
	 * @generated
	 */
	EClass getBooleanGenDecl();

	/**
	 * Returns the meta object for the attribute '{@link model.BooleanGenDecl#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see model.BooleanGenDecl#getDefaultValue()
	 * @see #getBooleanGenDecl()
	 * @generated
	 */
	EAttribute getBooleanGenDecl_DefaultValue();

	/**
	 * Returns the meta object for class '{@link model.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see model.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for the containment reference '{@link model.Bus#getExtVLNV <em>Ext VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ext VLNV</em>'.
	 * @see model.Bus#getExtVLNV()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_ExtVLNV();

	/**
	 * Returns the meta object for the attribute '{@link model.Bus#getMaxMasters <em>Max Masters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Masters</em>'.
	 * @see model.Bus#getMaxMasters()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_MaxMasters();

	/**
	 * Returns the meta object for the attribute '{@link model.Bus#getMaxSlaves <em>Max Slaves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Slaves</em>'.
	 * @see model.Bus#getMaxSlaves()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_MaxSlaves();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Bus#getNoneInterface <em>None Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>None Interface</em>'.
	 * @see model.Bus#getNoneInterface()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_NoneInterface();

	/**
	 * Returns the meta object for class '{@link model.BusInstance <em>Bus Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Instance</em>'.
	 * @see model.BusInstance
	 * @generated
	 */
	EClass getBusInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link model.BusInstance#getBusInterfaceMap <em>Bus Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus Interface Map</em>'.
	 * @see model.BusInstance#getBusInterfaceMap()
	 * @see #getBusInstance()
	 * @generated
	 */
	EReference getBusInstance_BusInterfaceMap();

	/**
	 * Returns the meta object for the containment reference list '{@link model.BusInstance#getBusNoneInterfaceMap <em>Bus None Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus None Interface Map</em>'.
	 * @see model.BusInstance#getBusNoneInterfaceMap()
	 * @see #getBusInstance()
	 * @generated
	 */
	EReference getBusInstance_BusNoneInterfaceMap();

	/**
	 * Returns the meta object for class '{@link model.BusInterfaceMap <em>Bus Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Interface Map</em>'.
	 * @see model.BusInterfaceMap
	 * @generated
	 */
	EClass getBusInterfaceMap();

	/**
	 * Returns the meta object for the containment reference '{@link model.BusInterfaceMap#getXRefConnection <em>XRef Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Connection</em>'.
	 * @see model.BusInterfaceMap#getXRefConnection()
	 * @see #getBusInterfaceMap()
	 * @generated
	 */
	EReference getBusInterfaceMap_XRefConnection();

	/**
	 * Returns the meta object for class '{@link model.BusNoneInterfaceMap <em>Bus None Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus None Interface Map</em>'.
	 * @see model.BusNoneInterfaceMap
	 * @generated
	 */
	EClass getBusNoneInterfaceMap();

	/**
	 * Returns the meta object for the containment reference '{@link model.BusNoneInterfaceMap#getXRefBusNoneInterface <em>XRef Bus None Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Bus None Interface</em>'.
	 * @see model.BusNoneInterfaceMap#getXRefBusNoneInterface()
	 * @see #getBusNoneInterfaceMap()
	 * @generated
	 */
	EReference getBusNoneInterfaceMap_XRefBusNoneInterface();

	/**
	 * Returns the meta object for the containment reference '{@link model.BusNoneInterfaceMap#getXRefConnection <em>XRef Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Connection</em>'.
	 * @see model.BusNoneInterfaceMap#getXRefConnection()
	 * @see #getBusNoneInterfaceMap()
	 * @generated
	 */
	EReference getBusNoneInterfaceMap_XRefConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link model.BusNoneInterfaceMap#getInstancePortMap <em>Instance Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Port Map</em>'.
	 * @see model.BusNoneInterfaceMap#getInstancePortMap()
	 * @see #getBusNoneInterfaceMap()
	 * @generated
	 */
	EReference getBusNoneInterfaceMap_InstancePortMap();

	/**
	 * Returns the meta object for class '{@link model.CablePort <em>Cable Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cable Port</em>'.
	 * @see model.CablePort
	 * @generated
	 */
	EClass getCablePort();

	/**
	 * Returns the meta object for the containment reference '{@link model.CablePort#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see model.CablePort#getDataType()
	 * @see #getCablePort()
	 * @generated
	 */
	EReference getCablePort_DataType();

	/**
	 * Returns the meta object for class '{@link model.CableSignal <em>Cable Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cable Signal</em>'.
	 * @see model.CableSignal
	 * @generated
	 */
	EClass getCableSignal();

	/**
	 * Returns the meta object for the containment reference '{@link model.CableSignal#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see model.CableSignal#getDataType()
	 * @see #getCableSignal()
	 * @generated
	 */
	EReference getCableSignal_DataType();

	/**
	 * Returns the meta object for class '{@link model.ComplexDataType <em>Complex Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Data Type</em>'.
	 * @see model.ComplexDataType
	 * @generated
	 */
	EClass getComplexDataType();

	/**
	 * Returns the meta object for the attribute '{@link model.ComplexDataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.ComplexDataType#getName()
	 * @see #getComplexDataType()
	 * @generated
	 */
	EAttribute getComplexDataType_Name();

	/**
	 * Returns the meta object for class '{@link model.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see model.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Component#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see model.Component#getInterface()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Interface();

	/**
	 * Returns the meta object for the containment reference '{@link model.Component#getRegViewBlock <em>Reg View Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reg View Block</em>'.
	 * @see model.Component#getRegViewBlock()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_RegViewBlock();

	/**
	 * Returns the meta object for the attribute '{@link model.Component#getTopSpinClkStyle <em>Top Spin Clk Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Spin Clk Style</em>'.
	 * @see model.Component#getTopSpinClkStyle()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_TopSpinClkStyle();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Component#getRegMemSet <em>Reg Mem Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reg Mem Set</em>'.
	 * @see model.Component#getRegMemSet()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_RegMemSet();

	/**
	 * Returns the meta object for class '{@link model.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see model.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for class '{@link model.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see model.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the containment reference '{@link model.Connection#getExtVLNV <em>Ext VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ext VLNV</em>'.
	 * @see model.Connection#getExtVLNV()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_ExtVLNV();

	/**
	 * Returns the meta object for class '{@link model.ConstDef <em>Const Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Const Def</em>'.
	 * @see model.ConstDef
	 * @generated
	 */
	EClass getConstDef();

	/**
	 * Returns the meta object for class '{@link model.ConstDefBlock <em>Const Def Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Const Def Block</em>'.
	 * @see model.ConstDefBlock
	 * @generated
	 */
	EClass getConstDefBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link model.ConstDefBlock#getConstDef <em>Const Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Const Def</em>'.
	 * @see model.ConstDefBlock#getConstDef()
	 * @see #getConstDefBlock()
	 * @generated
	 */
	EReference getConstDefBlock_ConstDef();

	/**
	 * Returns the meta object for class '{@link model.DataDecl <em>Data Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Decl</em>'.
	 * @see model.DataDecl
	 * @generated
	 */
	EClass getDataDecl();

	/**
	 * Returns the meta object for the containment reference '{@link model.DataDecl#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see model.DataDecl#getDataType()
	 * @see #getDataDecl()
	 * @generated
	 */
	EReference getDataDecl_DataType();

	/**
	 * Returns the meta object for the attribute '{@link model.DataDecl#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see model.DataDecl#getDefaultValue()
	 * @see #getDataDecl()
	 * @generated
	 */
	EAttribute getDataDecl_DefaultValue();

	/**
	 * Returns the meta object for class '{@link model.DataDef <em>Data Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Def</em>'.
	 * @see model.DataDef
	 * @generated
	 */
	EClass getDataDef();

	/**
	 * Returns the meta object for the containment reference '{@link model.DataDef#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see model.DataDef#getDataType()
	 * @see #getDataDef()
	 * @generated
	 */
	EReference getDataDef_DataType();

	/**
	 * Returns the meta object for the attribute '{@link model.DataDef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see model.DataDef#getValue()
	 * @see #getDataDef()
	 * @generated
	 */
	EAttribute getDataDef_Value();

	/**
	 * Returns the meta object for class '{@link model.DataGenDecl <em>Data Gen Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Gen Decl</em>'.
	 * @see model.DataGenDecl
	 * @generated
	 */
	EClass getDataGenDecl();

	/**
	 * Returns the meta object for the containment reference '{@link model.DataGenDecl#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see model.DataGenDecl#getDataType()
	 * @see #getDataGenDecl()
	 * @generated
	 */
	EReference getDataGenDecl_DataType();

	/**
	 * Returns the meta object for the attribute '{@link model.DataGenDecl#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see model.DataGenDecl#getDefaultValue()
	 * @see #getDataGenDecl()
	 * @generated
	 */
	EAttribute getDataGenDecl_DefaultValue();

	/**
	 * Returns the meta object for class '{@link model.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see model.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link model.DataTypeElement <em>Data Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Element</em>'.
	 * @see model.DataTypeElement
	 * @generated
	 */
	EClass getDataTypeElement();

	/**
	 * Returns the meta object for the containment reference '{@link model.DataTypeElement#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see model.DataTypeElement#getDataType()
	 * @see #getDataTypeElement()
	 * @generated
	 */
	EReference getDataTypeElement_DataType();

	/**
	 * Returns the meta object for the attribute '{@link model.DataTypeElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.DataTypeElement#getName()
	 * @see #getDataTypeElement()
	 * @generated
	 */
	EAttribute getDataTypeElement_Name();

	/**
	 * Returns the meta object for class '{@link model.DescriptionItem <em>Description Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Item</em>'.
	 * @see model.DescriptionItem
	 * @generated
	 */
	EClass getDescriptionItem();

	/**
	 * Returns the meta object for the attribute '{@link model.DescriptionItem#getHtml <em>Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html</em>'.
	 * @see model.DescriptionItem#getHtml()
	 * @see #getDescriptionItem()
	 * @generated
	 */
	EAttribute getDescriptionItem_Html();

	/**
	 * Returns the meta object for the attribute '{@link model.DescriptionItem#getDita <em>Dita</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dita</em>'.
	 * @see model.DescriptionItem#getDita()
	 * @see #getDescriptionItem()
	 * @generated
	 */
	EAttribute getDescriptionItem_Dita();

	/**
	 * Returns the meta object for class '{@link model.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see model.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link model.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see model.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link model.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see model.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link model.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see model.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link model.DocumentRoot#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bus</em>'.
	 * @see model.DocumentRoot#getBus()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Bus();

	/**
	 * Returns the meta object for the containment reference '{@link model.DocumentRoot#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component</em>'.
	 * @see model.DocumentRoot#getComponent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Component();

	/**
	 * Returns the meta object for the containment reference '{@link model.DocumentRoot#getInterfaceDefinition <em>Interface Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface Definition</em>'.
	 * @see model.DocumentRoot#getInterfaceDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InterfaceDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link model.DocumentRoot#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package</em>'.
	 * @see model.DocumentRoot#getPackage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Package();

	/**
	 * Returns the meta object for the containment reference '{@link model.DocumentRoot#getPadTypeDB <em>Pad Type DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pad Type DB</em>'.
	 * @see model.DocumentRoot#getPadTypeDB()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PadTypeDB();

	/**
	 * Returns the meta object for the containment reference '{@link model.DocumentRoot#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Product</em>'.
	 * @see model.DocumentRoot#getProduct()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Product();

	/**
	 * Returns the meta object for the containment reference '{@link model.DocumentRoot#getSilicon <em>Silicon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Silicon</em>'.
	 * @see model.DocumentRoot#getSilicon()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Silicon();

	/**
	 * Returns the meta object for the containment reference '{@link model.DocumentRoot#getSiPortDB <em>Si Port DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Si Port DB</em>'.
	 * @see model.DocumentRoot#getSiPortDB()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SiPortDB();

	/**
	 * Returns the meta object for the containment reference '{@link model.DocumentRoot#getSiSignalDB <em>Si Signal DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Si Signal DB</em>'.
	 * @see model.DocumentRoot#getSiSignalDB()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SiSignalDB();

	/**
	 * Returns the meta object for the containment reference '{@link model.DocumentRoot#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see model.DocumentRoot#getSystem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_System();

	/**
	 * Returns the meta object for the containment reference '{@link model.DocumentRoot#getTestDB <em>Test DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test DB</em>'.
	 * @see model.DocumentRoot#getTestDB()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TestDB();

	/**
	 * Returns the meta object for class '{@link model.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see model.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Enum#getEnumElement <em>Enum Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Element</em>'.
	 * @see model.Enum#getEnumElement()
	 * @see #getEnum()
	 * @generated
	 */
	EReference getEnum_EnumElement();

	/**
	 * Returns the meta object for class '{@link model.EnumElement <em>Enum Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Element</em>'.
	 * @see model.EnumElement
	 * @generated
	 */
	EClass getEnumElement();

	/**
	 * Returns the meta object for the attribute '{@link model.EnumElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.EnumElement#getName()
	 * @see #getEnumElement()
	 * @generated
	 */
	EAttribute getEnumElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link model.EnumElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see model.EnumElement#getValue()
	 * @see #getEnumElement()
	 * @generated
	 */
	EAttribute getEnumElement_Value();

	/**
	 * Returns the meta object for class '{@link model.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see model.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the attribute '{@link model.Enumeration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see model.Enumeration#getValue()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_Value();

	/**
	 * Returns the meta object for class '{@link model.EnumerationElement <em>Enumeration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Element</em>'.
	 * @see model.EnumerationElement
	 * @generated
	 */
	EClass getEnumerationElement();

	/**
	 * Returns the meta object for class '{@link model.EnumerationInteger <em>Enumeration Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Integer</em>'.
	 * @see model.EnumerationInteger
	 * @generated
	 */
	EClass getEnumerationInteger();

	/**
	 * Returns the meta object for the attribute '{@link model.EnumerationInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see model.EnumerationInteger#getValue()
	 * @see #getEnumerationInteger()
	 * @generated
	 */
	EAttribute getEnumerationInteger_Value();

	/**
	 * Returns the meta object for class '{@link model.EnumerationSequence <em>Enumeration Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Sequence</em>'.
	 * @see model.EnumerationSequence
	 * @generated
	 */
	EClass getEnumerationSequence();

	/**
	 * Returns the meta object for the attribute '{@link model.EnumerationSequence#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see model.EnumerationSequence#getCount()
	 * @see #getEnumerationSequence()
	 * @generated
	 */
	EAttribute getEnumerationSequence_Count();

	/**
	 * Returns the meta object for the attribute '{@link model.EnumerationSequence#getMinIndex <em>Min Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Index</em>'.
	 * @see model.EnumerationSequence#getMinIndex()
	 * @see #getEnumerationSequence()
	 * @generated
	 */
	EAttribute getEnumerationSequence_MinIndex();

	/**
	 * Returns the meta object for the attribute '{@link model.EnumerationSequence#getIndexStep <em>Index Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Step</em>'.
	 * @see model.EnumerationSequence#getIndexStep()
	 * @see #getEnumerationSequence()
	 * @generated
	 */
	EAttribute getEnumerationSequence_IndexStep();

	/**
	 * Returns the meta object for the attribute '{@link model.EnumerationSequence#getIndexVar <em>Index Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Var</em>'.
	 * @see model.EnumerationSequence#getIndexVar()
	 * @see #getEnumerationSequence()
	 * @generated
	 */
	EAttribute getEnumerationSequence_IndexVar();

	/**
	 * Returns the meta object for the attribute '{@link model.EnumerationSequence#getAltFormat <em>Alt Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Format</em>'.
	 * @see model.EnumerationSequence#getAltFormat()
	 * @see #getEnumerationSequence()
	 * @generated
	 */
	EAttribute getEnumerationSequence_AltFormat();

	/**
	 * Returns the meta object for the containment reference list '{@link model.EnumerationSequence#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration</em>'.
	 * @see model.EnumerationSequence#getEnumeration()
	 * @see #getEnumerationSequence()
	 * @generated
	 */
	EReference getEnumerationSequence_Enumeration();

	/**
	 * Returns the meta object for the '{@link model.EnumerationSequence#getElement() <em>Get Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Element</em>' operation.
	 * @see model.EnumerationSequence#getElement()
	 * @generated
	 */
	EOperation getEnumerationSequence__GetElement();

	/**
	 * Returns the meta object for class '{@link model.EnumerationString <em>Enumeration String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration String</em>'.
	 * @see model.EnumerationString
	 * @generated
	 */
	EClass getEnumerationString();

	/**
	 * Returns the meta object for the attribute '{@link model.EnumerationString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see model.EnumerationString#getValue()
	 * @see #getEnumerationString()
	 * @generated
	 */
	EAttribute getEnumerationString_Value();

	/**
	 * Returns the meta object for class '{@link model.EssenceBase <em>Essence Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Essence Base</em>'.
	 * @see model.EssenceBase
	 * @generated
	 */
	EClass getEssenceBase();

	/**
	 * Returns the meta object for the attribute '{@link model.EssenceBase#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see model.EssenceBase#getClassName()
	 * @see #getEssenceBase()
	 * @generated
	 */
	EAttribute getEssenceBase_ClassName();

	/**
	 * Returns the meta object for class '{@link model.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see model.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link model.Function#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see model.Function#getType()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Type();

	/**
	 * Returns the meta object for the attribute '{@link model.Function#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module</em>'.
	 * @see model.Function#getModule()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Module();

	/**
	 * Returns the meta object for the containment reference '{@link model.Function#getXRefSignal <em>XRef Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Signal</em>'.
	 * @see model.Function#getXRefSignal()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_XRefSignal();

	/**
	 * Returns the meta object for class '{@link model.GapElement <em>Gap Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gap Element</em>'.
	 * @see model.GapElement
	 * @generated
	 */
	EClass getGapElement();

	/**
	 * Returns the meta object for class '{@link model.GeneralInstance <em>General Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Instance</em>'.
	 * @see model.GeneralInstance
	 * @generated
	 */
	EClass getGeneralInstance();

	/**
	 * Returns the meta object for the containment reference '{@link model.GeneralInstance#getExtVLNV <em>Ext VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ext VLNV</em>'.
	 * @see model.GeneralInstance#getExtVLNV()
	 * @see #getGeneralInstance()
	 * @generated
	 */
	EReference getGeneralInstance_ExtVLNV();

	/**
	 * Returns the meta object for the containment reference list '{@link model.GeneralInstance#getParamMap <em>Param Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param Map</em>'.
	 * @see model.GeneralInstance#getParamMap()
	 * @see #getGeneralInstance()
	 * @generated
	 */
	EReference getGeneralInstance_ParamMap();

	/**
	 * Returns the meta object for the containment reference list '{@link model.GeneralInstance#getGenericMap <em>Generic Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Map</em>'.
	 * @see model.GeneralInstance#getGenericMap()
	 * @see #getGeneralInstance()
	 * @generated
	 */
	EReference getGeneralInstance_GenericMap();

	/**
	 * Returns the meta object for class '{@link model.GeneralInterface <em>General Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Interface</em>'.
	 * @see model.GeneralInterface
	 * @generated
	 */
	EClass getGeneralInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link model.GeneralInterface#getInterfaceView <em>Interface View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface View</em>'.
	 * @see model.GeneralInterface#getInterfaceView()
	 * @see #getGeneralInterface()
	 * @generated
	 */
	EReference getGeneralInterface_InterfaceView();

	/**
	 * Returns the meta object for class '{@link model.GeneralPad <em>General Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Pad</em>'.
	 * @see model.GeneralPad
	 * @generated
	 */
	EClass getGeneralPad();

	/**
	 * Returns the meta object for the containment reference '{@link model.GeneralPad#getXRefPadType <em>XRef Pad Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Pad Type</em>'.
	 * @see model.GeneralPad#getXRefPadType()
	 * @see #getGeneralPad()
	 * @generated
	 */
	EReference getGeneralPad_XRefPadType();

	/**
	 * Returns the meta object for the attribute '{@link model.GeneralPad#getLib <em>Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lib</em>'.
	 * @see model.GeneralPad#getLib()
	 * @see #getGeneralPad()
	 * @generated
	 */
	EAttribute getGeneralPad_Lib();

	/**
	 * Returns the meta object for the attribute '{@link model.GeneralPad#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see model.GeneralPad#getWidth()
	 * @see #getGeneralPad()
	 * @generated
	 */
	EAttribute getGeneralPad_Width();

	/**
	 * Returns the meta object for class '{@link model.GeneralPort <em>General Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Port</em>'.
	 * @see model.GeneralPort
	 * @generated
	 */
	EClass getGeneralPort();

	/**
	 * Returns the meta object for class '{@link model.GeneralRegister <em>General Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Register</em>'.
	 * @see model.GeneralRegister
	 * @generated
	 */
	EClass getGeneralRegister();

	/**
	 * Returns the meta object for the attribute '{@link model.GeneralRegister#isNoShadow <em>No Shadow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Shadow</em>'.
	 * @see model.GeneralRegister#isNoShadow()
	 * @see #getGeneralRegister()
	 * @generated
	 */
	EAttribute getGeneralRegister_NoShadow();

	/**
	 * Returns the meta object for the containment reference list '{@link model.GeneralRegister#getResetType <em>Reset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reset Type</em>'.
	 * @see model.GeneralRegister#getResetType()
	 * @see #getGeneralRegister()
	 * @generated
	 */
	EReference getGeneralRegister_ResetType();

	/**
	 * Returns the meta object for class '{@link model.GenericDecl <em>Generic Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Decl</em>'.
	 * @see model.GenericDecl
	 * @generated
	 */
	EClass getGenericDecl();

	/**
	 * Returns the meta object for class '{@link model.GenericDeclBlock <em>Generic Decl Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Decl Block</em>'.
	 * @see model.GenericDeclBlock
	 * @generated
	 */
	EClass getGenericDeclBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link model.GenericDeclBlock#getGenericDecl <em>Generic Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Decl</em>'.
	 * @see model.GenericDeclBlock#getGenericDecl()
	 * @see #getGenericDeclBlock()
	 * @generated
	 */
	EReference getGenericDeclBlock_GenericDecl();

	/**
	 * Returns the meta object for class '{@link model.GenericMap <em>Generic Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Map</em>'.
	 * @see model.GenericMap
	 * @generated
	 */
	EClass getGenericMap();

	/**
	 * Returns the meta object for the containment reference '{@link model.GenericMap#getXRefGenericDecl <em>XRef Generic Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Generic Decl</em>'.
	 * @see model.GenericMap#getXRefGenericDecl()
	 * @see #getGenericMap()
	 * @generated
	 */
	EReference getGenericMap_XRefGenericDecl();

	/**
	 * Returns the meta object for the attribute '{@link model.GenericMap#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see model.GenericMap#getValue()
	 * @see #getGenericMap()
	 * @generated
	 */
	EAttribute getGenericMap_Value();

	/**
	 * Returns the meta object for class '{@link model.IndexVarUser <em>Index Var User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Var User</em>'.
	 * @see model.IndexVarUser
	 * @generated
	 */
	EClass getIndexVarUser();

	/**
	 * Returns the meta object for the '{@link model.IndexVarUser#createIxVarMap() <em>Create Ix Var Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Ix Var Map</em>' operation.
	 * @see model.IndexVarUser#createIxVarMap()
	 * @generated
	 */
	EOperation getIndexVarUser__CreateIxVarMap();

	/**
	 * Returns the meta object for the '{@link model.IndexVarUser#getNameValue(java.util.Map) <em>Get Name Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name Value</em>' operation.
	 * @see model.IndexVarUser#getNameValue(java.util.Map)
	 * @generated
	 */
	EOperation getIndexVarUser__GetNameValue__Map();

	/**
	 * Returns the meta object for the '{@link model.IndexVarUser#getHiddenValue(java.util.Map) <em>Get Hidden Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Hidden Value</em>' operation.
	 * @see model.IndexVarUser#getHiddenValue(java.util.Map)
	 * @generated
	 */
	EOperation getIndexVarUser__GetHiddenValue__Map();

	/**
	 * Returns the meta object for the '{@link model.IndexVarUser#getShortNameValue(java.util.Map) <em>Get Short Name Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Short Name Value</em>' operation.
	 * @see model.IndexVarUser#getShortNameValue(java.util.Map)
	 * @generated
	 */
	EOperation getIndexVarUser__GetShortNameValue__Map();

	/**
	 * Returns the meta object for class '{@link model.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see model.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for class '{@link model.InstanceInterfaceMap <em>Instance Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Interface Map</em>'.
	 * @see model.InstanceInterfaceMap
	 * @generated
	 */
	EClass getInstanceInterfaceMap();

	/**
	 * Returns the meta object for the containment reference '{@link model.InstanceInterfaceMap#getXRefInstanceInterface <em>XRef Instance Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Instance Interface</em>'.
	 * @see model.InstanceInterfaceMap#getXRefInstanceInterface()
	 * @see #getInstanceInterfaceMap()
	 * @generated
	 */
	EReference getInstanceInterfaceMap_XRefInstanceInterface();

	/**
	 * Returns the meta object for the containment reference '{@link model.InstanceInterfaceMap#getXRefConnection <em>XRef Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Connection</em>'.
	 * @see model.InstanceInterfaceMap#getXRefConnection()
	 * @see #getInstanceInterfaceMap()
	 * @generated
	 */
	EReference getInstanceInterfaceMap_XRefConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link model.InstanceInterfaceMap#getInstancePortMap <em>Instance Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Port Map</em>'.
	 * @see model.InstanceInterfaceMap#getInstancePortMap()
	 * @see #getInstanceInterfaceMap()
	 * @generated
	 */
	EReference getInstanceInterfaceMap_InstancePortMap();

	/**
	 * Returns the meta object for class '{@link model.InstancePortMap <em>Instance Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Port Map</em>'.
	 * @see model.InstancePortMap
	 * @generated
	 */
	EClass getInstancePortMap();

	/**
	 * Returns the meta object for the containment reference '{@link model.InstancePortMap#getXRefInstancePort <em>XRef Instance Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Instance Port</em>'.
	 * @see model.InstancePortMap#getXRefInstancePort()
	 * @see #getInstancePortMap()
	 * @generated
	 */
	EReference getInstancePortMap_XRefInstancePort();

	/**
	 * Returns the meta object for the containment reference '{@link model.InstancePortMap#getXRefSignal <em>XRef Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Signal</em>'.
	 * @see model.InstancePortMap#getXRefSignal()
	 * @see #getInstancePortMap()
	 * @generated
	 */
	EReference getInstancePortMap_XRefSignal();

	/**
	 * Returns the meta object for class '{@link model.InstanceShellInterfaceMap <em>Instance Shell Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Shell Interface Map</em>'.
	 * @see model.InstanceShellInterfaceMap
	 * @generated
	 */
	EClass getInstanceShellInterfaceMap();

	/**
	 * Returns the meta object for the containment reference '{@link model.InstanceShellInterfaceMap#getXRefInstanceShellInterface <em>XRef Instance Shell Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Instance Shell Interface</em>'.
	 * @see model.InstanceShellInterfaceMap#getXRefInstanceShellInterface()
	 * @see #getInstanceShellInterfaceMap()
	 * @generated
	 */
	EReference getInstanceShellInterfaceMap_XRefInstanceShellInterface();

	/**
	 * Returns the meta object for the containment reference '{@link model.InstanceShellInterfaceMap#getXRefConnection <em>XRef Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Connection</em>'.
	 * @see model.InstanceShellInterfaceMap#getXRefConnection()
	 * @see #getInstanceShellInterfaceMap()
	 * @generated
	 */
	EReference getInstanceShellInterfaceMap_XRefConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link model.InstanceShellInterfaceMap#getInstanceShellPortMap <em>Instance Shell Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Shell Port Map</em>'.
	 * @see model.InstanceShellInterfaceMap#getInstanceShellPortMap()
	 * @see #getInstanceShellInterfaceMap()
	 * @generated
	 */
	EReference getInstanceShellInterfaceMap_InstanceShellPortMap();

	/**
	 * Returns the meta object for class '{@link model.InstanceShellPortMap <em>Instance Shell Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Shell Port Map</em>'.
	 * @see model.InstanceShellPortMap
	 * @generated
	 */
	EClass getInstanceShellPortMap();

	/**
	 * Returns the meta object for the containment reference '{@link model.InstanceShellPortMap#getXRefInstanceShellPort <em>XRef Instance Shell Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Instance Shell Port</em>'.
	 * @see model.InstanceShellPortMap#getXRefInstanceShellPort()
	 * @see #getInstanceShellPortMap()
	 * @generated
	 */
	EReference getInstanceShellPortMap_XRefInstanceShellPort();

	/**
	 * Returns the meta object for the containment reference '{@link model.InstanceShellPortMap#getXRefSignal <em>XRef Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Signal</em>'.
	 * @see model.InstanceShellPortMap#getXRefSignal()
	 * @see #getInstanceShellPortMap()
	 * @generated
	 */
	EReference getInstanceShellPortMap_XRefSignal();

	/**
	 * Returns the meta object for class '{@link model.IntegerDecl <em>Integer Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Decl</em>'.
	 * @see model.IntegerDecl
	 * @generated
	 */
	EClass getIntegerDecl();

	/**
	 * Returns the meta object for the attribute '{@link model.IntegerDecl#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see model.IntegerDecl#getDefaultValue()
	 * @see #getIntegerDecl()
	 * @generated
	 */
	EAttribute getIntegerDecl_DefaultValue();

	/**
	 * Returns the meta object for the containment reference list '{@link model.IntegerDecl#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration</em>'.
	 * @see model.IntegerDecl#getEnumeration()
	 * @see #getIntegerDecl()
	 * @generated
	 */
	EReference getIntegerDecl_Enumeration();

	/**
	 * Returns the meta object for class '{@link model.IntegerDef <em>Integer Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Def</em>'.
	 * @see model.IntegerDef
	 * @generated
	 */
	EClass getIntegerDef();

	/**
	 * Returns the meta object for the attribute '{@link model.IntegerDef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see model.IntegerDef#getValue()
	 * @see #getIntegerDef()
	 * @generated
	 */
	EAttribute getIntegerDef_Value();

	/**
	 * Returns the meta object for class '{@link model.IntegerGenDecl <em>Integer Gen Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Gen Decl</em>'.
	 * @see model.IntegerGenDecl
	 * @generated
	 */
	EClass getIntegerGenDecl();

	/**
	 * Returns the meta object for the attribute '{@link model.IntegerGenDecl#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see model.IntegerGenDecl#getDefaultValue()
	 * @see #getIntegerGenDecl()
	 * @generated
	 */
	EAttribute getIntegerGenDecl_DefaultValue();

	/**
	 * Returns the meta object for the containment reference list '{@link model.IntegerGenDecl#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration</em>'.
	 * @see model.IntegerGenDecl#getEnumeration()
	 * @see #getIntegerGenDecl()
	 * @generated
	 */
	EReference getIntegerGenDecl_Enumeration();

	/**
	 * Returns the meta object for class '{@link model.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see model.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link model.Interface#getAddressUnit <em>Address Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Unit</em>'.
	 * @see model.Interface#getAddressUnit()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_AddressUnit();

	/**
	 * Returns the meta object for the attribute '{@link model.Interface#getDataUnit <em>Data Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Unit</em>'.
	 * @see model.Interface#getDataUnit()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_DataUnit();

	/**
	 * Returns the meta object for the attribute '{@link model.Interface#getBaseAddress <em>Base Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Address</em>'.
	 * @see model.Interface#getBaseAddress()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_BaseAddress();

	/**
	 * Returns the meta object for the containment reference '{@link model.Interface#getExtVLNV <em>Ext VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ext VLNV</em>'.
	 * @see model.Interface#getExtVLNV()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_ExtVLNV();

	/**
	 * Returns the meta object for the attribute '{@link model.Interface#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see model.Interface#getRange()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Range();

	/**
	 * Returns the meta object for the attribute '{@link model.Interface#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see model.Interface#getRole()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Role();

	/**
	 * Returns the meta object for the attribute '{@link model.Interface#getSystemGroup <em>System Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Group</em>'.
	 * @see model.Interface#getSystemGroup()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_SystemGroup();

	/**
	 * Returns the meta object for the containment reference '{@link model.Interface#getAddressBlock <em>Address Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Block</em>'.
	 * @see model.Interface#getAddressBlock()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_AddressBlock();

	/**
	 * Returns the meta object for the attribute '{@link model.Interface#getExtVLNVName <em>Ext VLNV Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext VLNV Name</em>'.
	 * @see model.Interface#getExtVLNVName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_ExtVLNVName();

	/**
	 * Returns the meta object for class '{@link model.InterfaceDefCablePort <em>Interface Def Cable Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Def Cable Port</em>'.
	 * @see model.InterfaceDefCablePort
	 * @generated
	 */
	EClass getInterfaceDefCablePort();

	/**
	 * Returns the meta object for class '{@link model.InterfaceDefinition <em>Interface Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Definition</em>'.
	 * @see model.InterfaceDefinition
	 * @generated
	 */
	EClass getInterfaceDefinition();

	/**
	 * Returns the meta object for the attribute '{@link model.InterfaceDefinition#getAddressUnit <em>Address Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Unit</em>'.
	 * @see model.InterfaceDefinition#getAddressUnit()
	 * @see #getInterfaceDefinition()
	 * @generated
	 */
	EAttribute getInterfaceDefinition_AddressUnit();

	/**
	 * Returns the meta object for the attribute '{@link model.InterfaceDefinition#getDataUnit <em>Data Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Unit</em>'.
	 * @see model.InterfaceDefinition#getDataUnit()
	 * @see #getInterfaceDefinition()
	 * @generated
	 */
	EAttribute getInterfaceDefinition_DataUnit();

	/**
	 * Returns the meta object for the containment reference '{@link model.InterfaceDefinition#getExtVLNV <em>Ext VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ext VLNV</em>'.
	 * @see model.InterfaceDefinition#getExtVLNV()
	 * @see #getInterfaceDefinition()
	 * @generated
	 */
	EReference getInterfaceDefinition_ExtVLNV();

	/**
	 * Returns the meta object for the containment reference list '{@link model.InterfaceDefinition#getInterfaceDefView <em>Interface Def View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Def View</em>'.
	 * @see model.InterfaceDefinition#getInterfaceDefView()
	 * @see #getInterfaceDefinition()
	 * @generated
	 */
	EReference getInterfaceDefinition_InterfaceDefView();

	/**
	 * Returns the meta object for class '{@link model.InterfaceDefPort <em>Interface Def Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Def Port</em>'.
	 * @see model.InterfaceDefPort
	 * @generated
	 */
	EClass getInterfaceDefPort();

	/**
	 * Returns the meta object for the containment reference '{@link model.InterfaceDefPort#getXRefSignal <em>XRef Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Signal</em>'.
	 * @see model.InterfaceDefPort#getXRefSignal()
	 * @see #getInterfaceDefPort()
	 * @generated
	 */
	EReference getInterfaceDefPort_XRefSignal();

	/**
	 * Returns the meta object for the attribute '{@link model.InterfaceDefPort#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see model.InterfaceDefPort#getDirection()
	 * @see #getInterfaceDefPort()
	 * @generated
	 */
	EAttribute getInterfaceDefPort_Direction();

	/**
	 * Returns the meta object for class '{@link model.InterfaceDefRole <em>Interface Def Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Def Role</em>'.
	 * @see model.InterfaceDefRole
	 * @generated
	 */
	EClass getInterfaceDefRole();

	/**
	 * Returns the meta object for the attribute '{@link model.InterfaceDefRole#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see model.InterfaceDefRole#getRole()
	 * @see #getInterfaceDefRole()
	 * @generated
	 */
	EAttribute getInterfaceDefRole_Role();

	/**
	 * Returns the meta object for the attribute '{@link model.InterfaceDefRole#getSystemGroup <em>System Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Group</em>'.
	 * @see model.InterfaceDefRole#getSystemGroup()
	 * @see #getInterfaceDefRole()
	 * @generated
	 */
	EAttribute getInterfaceDefRole_SystemGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link model.InterfaceDefRole#getInterfaceDefPort <em>Interface Def Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Def Port</em>'.
	 * @see model.InterfaceDefRole#getInterfaceDefPort()
	 * @see #getInterfaceDefRole()
	 * @generated
	 */
	EReference getInterfaceDefRole_InterfaceDefPort();

	/**
	 * Returns the meta object for class '{@link model.InterfaceDefTransactionalPort <em>Interface Def Transactional Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Def Transactional Port</em>'.
	 * @see model.InterfaceDefTransactionalPort
	 * @generated
	 */
	EClass getInterfaceDefTransactionalPort();

	/**
	 * Returns the meta object for the attribute '{@link model.InterfaceDefTransactionalPort#getInitiative <em>Initiative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiative</em>'.
	 * @see model.InterfaceDefTransactionalPort#getInitiative()
	 * @see #getInterfaceDefTransactionalPort()
	 * @generated
	 */
	EAttribute getInterfaceDefTransactionalPort_Initiative();

	/**
	 * Returns the meta object for class '{@link model.InterfaceDefView <em>Interface Def View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Def View</em>'.
	 * @see model.InterfaceDefView
	 * @generated
	 */
	EClass getInterfaceDefView();

	/**
	 * Returns the meta object for the containment reference list '{@link model.InterfaceDefView#getInterfaceDefRole <em>Interface Def Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Def Role</em>'.
	 * @see model.InterfaceDefView#getInterfaceDefRole()
	 * @see #getInterfaceDefView()
	 * @generated
	 */
	EReference getInterfaceDefView_InterfaceDefRole();

	/**
	 * Returns the meta object for class '{@link model.InterfaceDefWirePort <em>Interface Def Wire Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Def Wire Port</em>'.
	 * @see model.InterfaceDefWirePort
	 * @generated
	 */
	EClass getInterfaceDefWirePort();

	/**
	 * Returns the meta object for class '{@link model.InterfaceInstance <em>Interface Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Instance</em>'.
	 * @see model.InterfaceInstance
	 * @generated
	 */
	EClass getInterfaceInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link model.InterfaceInstance#getInstanceInterfaceMap <em>Instance Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Interface Map</em>'.
	 * @see model.InterfaceInstance#getInstanceInterfaceMap()
	 * @see #getInterfaceInstance()
	 * @generated
	 */
	EReference getInterfaceInstance_InstanceInterfaceMap();

	/**
	 * Returns the meta object for class '{@link model.InterfacePortMap <em>Interface Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Port Map</em>'.
	 * @see model.InterfacePortMap
	 * @generated
	 */
	EClass getInterfacePortMap();

	/**
	 * Returns the meta object for the containment reference '{@link model.InterfacePortMap#getXRefLocalPort <em>XRef Local Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Local Port</em>'.
	 * @see model.InterfacePortMap#getXRefLocalPort()
	 * @see #getInterfacePortMap()
	 * @generated
	 */
	EReference getInterfacePortMap_XRefLocalPort();

	/**
	 * Returns the meta object for the containment reference '{@link model.InterfacePortMap#getXRefInterfacePort <em>XRef Interface Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Interface Port</em>'.
	 * @see model.InterfacePortMap#getXRefInterfacePort()
	 * @see #getInterfacePortMap()
	 * @generated
	 */
	EReference getInterfacePortMap_XRefInterfacePort();

	/**
	 * Returns the meta object for class '{@link model.InterfaceView <em>Interface View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface View</em>'.
	 * @see model.InterfaceView
	 * @generated
	 */
	EClass getInterfaceView();

	/**
	 * Returns the meta object for the containment reference list '{@link model.InterfaceView#getInterfacePortMap <em>Interface Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Port Map</em>'.
	 * @see model.InterfaceView#getInterfacePortMap()
	 * @see #getInterfaceView()
	 * @generated
	 */
	EReference getInterfaceView_InterfacePortMap();

	/**
	 * Returns the meta object for the containment reference list '{@link model.InterfaceView#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see model.InterfaceView#getPort()
	 * @see #getInterfaceView()
	 * @generated
	 */
	EReference getInterfaceView_Port();

	/**
	 * Returns the meta object for the reference list '{@link model.InterfaceView#getUnassignedPort <em>Unassigned Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unassigned Port</em>'.
	 * @see model.InterfaceView#getUnassignedPort()
	 * @see #getInterfaceView()
	 * @generated
	 */
	EReference getInterfaceView_UnassignedPort();

	/**
	 * Returns the meta object for class '{@link model.LocalInterfaceMap <em>Local Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Interface Map</em>'.
	 * @see model.LocalInterfaceMap
	 * @generated
	 */
	EClass getLocalInterfaceMap();

	/**
	 * Returns the meta object for the containment reference '{@link model.LocalInterfaceMap#getXRefLocalInterface <em>XRef Local Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Local Interface</em>'.
	 * @see model.LocalInterfaceMap#getXRefLocalInterface()
	 * @see #getLocalInterfaceMap()
	 * @generated
	 */
	EReference getLocalInterfaceMap_XRefLocalInterface();

	/**
	 * Returns the meta object for the containment reference '{@link model.LocalInterfaceMap#getXRefConnection <em>XRef Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Connection</em>'.
	 * @see model.LocalInterfaceMap#getXRefConnection()
	 * @see #getLocalInterfaceMap()
	 * @generated
	 */
	EReference getLocalInterfaceMap_XRefConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link model.LocalInterfaceMap#getLocalPortMap <em>Local Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Port Map</em>'.
	 * @see model.LocalInterfaceMap#getLocalPortMap()
	 * @see #getLocalInterfaceMap()
	 * @generated
	 */
	EReference getLocalInterfaceMap_LocalPortMap();

	/**
	 * Returns the meta object for class '{@link model.LocalPortMap <em>Local Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Port Map</em>'.
	 * @see model.LocalPortMap
	 * @generated
	 */
	EClass getLocalPortMap();

	/**
	 * Returns the meta object for the containment reference '{@link model.LocalPortMap#getXRefLocalPort <em>XRef Local Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Local Port</em>'.
	 * @see model.LocalPortMap#getXRefLocalPort()
	 * @see #getLocalPortMap()
	 * @generated
	 */
	EReference getLocalPortMap_XRefLocalPort();

	/**
	 * Returns the meta object for the containment reference '{@link model.LocalPortMap#getXRefSignal <em>XRef Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Signal</em>'.
	 * @see model.LocalPortMap#getXRefSignal()
	 * @see #getLocalPortMap()
	 * @generated
	 */
	EReference getLocalPortMap_XRefSignal();

	/**
	 * Returns the meta object for class '{@link model.Memory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory</em>'.
	 * @see model.Memory
	 * @generated
	 */
	EClass getMemory();

	/**
	 * Returns the meta object for the attribute '{@link model.Memory#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Type</em>'.
	 * @see model.Memory#getAccessType()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_AccessType();

	/**
	 * Returns the meta object for the attribute '{@link model.Memory#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see model.Memory#getSize()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_Size();

	/**
	 * Returns the meta object for the attribute '{@link model.Memory#getEndianness <em>Endianness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endianness</em>'.
	 * @see model.Memory#getEndianness()
	 * @see #getMemory()
	 * @generated
	 */
	EAttribute getMemory_Endianness();

	/**
	 * Returns the meta object for class '{@link model.MethodDataType <em>Method Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Data Type</em>'.
	 * @see model.MethodDataType
	 * @generated
	 */
	EClass getMethodDataType();

	/**
	 * Returns the meta object for the containment reference '{@link model.MethodDataType#getReturnDataType <em>Return Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Data Type</em>'.
	 * @see model.MethodDataType#getReturnDataType()
	 * @see #getMethodDataType()
	 * @generated
	 */
	EReference getMethodDataType_ReturnDataType();

	/**
	 * Returns the meta object for the attribute '{@link model.MethodDataType#isReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see model.MethodDataType#isReference()
	 * @see #getMethodDataType()
	 * @generated
	 */
	EAttribute getMethodDataType_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link model.MethodDataType#getMethodDataTypeElement <em>Method Data Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method Data Type Element</em>'.
	 * @see model.MethodDataType#getMethodDataTypeElement()
	 * @see #getMethodDataType()
	 * @generated
	 */
	EReference getMethodDataType_MethodDataTypeElement();

	/**
	 * Returns the meta object for the attribute '{@link model.MethodDataType#isCheckVoid <em>Check Void</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Void</em>'.
	 * @see model.MethodDataType#isCheckVoid()
	 * @see #getMethodDataType()
	 * @generated
	 */
	EAttribute getMethodDataType_CheckVoid();

	/**
	 * Returns the meta object for class '{@link model.MethodDataTypeElement <em>Method Data Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Data Type Element</em>'.
	 * @see model.MethodDataTypeElement
	 * @generated
	 */
	EClass getMethodDataTypeElement();

	/**
	 * Returns the meta object for the containment reference '{@link model.MethodDataTypeElement#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see model.MethodDataTypeElement#getDataType()
	 * @see #getMethodDataTypeElement()
	 * @generated
	 */
	EReference getMethodDataTypeElement_DataType();

	/**
	 * Returns the meta object for the attribute '{@link model.MethodDataTypeElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.MethodDataTypeElement#getName()
	 * @see #getMethodDataTypeElement()
	 * @generated
	 */
	EAttribute getMethodDataTypeElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link model.MethodDataTypeElement#isReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see model.MethodDataTypeElement#isReference()
	 * @see #getMethodDataTypeElement()
	 * @generated
	 */
	EAttribute getMethodDataTypeElement_Reference();

	/**
	 * Returns the meta object for class '{@link model.ModelRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see model.ModelRoot
	 * @generated
	 */
	EClass getModelRoot();

	/**
	 * Returns the meta object for the containment reference '{@link model.ModelRoot#getConstDefBlock <em>Const Def Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Const Def Block</em>'.
	 * @see model.ModelRoot#getConstDefBlock()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_ConstDefBlock();

	/**
	 * Returns the meta object for the attribute '{@link model.ModelRoot#getEssenceVersion <em>Essence Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Essence Version</em>'.
	 * @see model.ModelRoot#getEssenceVersion()
	 * @see #getModelRoot()
	 * @generated
	 */
	EAttribute getModelRoot_EssenceVersion();

	/**
	 * Returns the meta object for the containment reference '{@link model.ModelRoot#getGenericDeclBlock <em>Generic Decl Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Decl Block</em>'.
	 * @see model.ModelRoot#getGenericDeclBlock()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_GenericDeclBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link model.ModelRoot#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module</em>'.
	 * @see model.ModelRoot#getModule()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_Module();

	/**
	 * Returns the meta object for the containment reference '{@link model.ModelRoot#getParamDeclBlock <em>Param Decl Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param Decl Block</em>'.
	 * @see model.ModelRoot#getParamDeclBlock()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_ParamDeclBlock();

	/**
	 * Returns the meta object for the containment reference '{@link model.ModelRoot#getVLNV <em>VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VLNV</em>'.
	 * @see model.ModelRoot#getVLNV()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_VLNV();

	/**
	 * Returns the meta object for the attribute '{@link model.ModelRoot#getParamMap <em>Param Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param Map</em>'.
	 * @see model.ModelRoot#getParamMap()
	 * @see #getModelRoot()
	 * @generated
	 */
	EAttribute getModelRoot_ParamMap();

	/**
	 * Returns the meta object for the attribute '{@link model.ModelRoot#getGenericMap <em>Generic Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generic Map</em>'.
	 * @see model.ModelRoot#getGenericMap()
	 * @see #getModelRoot()
	 * @generated
	 */
	EAttribute getModelRoot_GenericMap();

	/**
	 * Returns the meta object for class '{@link model.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see model.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Module#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module</em>'.
	 * @see model.Module#getModule()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Module();

	/**
	 * Returns the meta object for class '{@link model.MultiPad <em>Multi Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Pad</em>'.
	 * @see model.MultiPad
	 * @generated
	 */
	EClass getMultiPad();

	/**
	 * Returns the meta object for the containment reference list '{@link model.MultiPad#getSinglePad <em>Single Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Single Pad</em>'.
	 * @see model.MultiPad#getSinglePad()
	 * @see #getMultiPad()
	 * @generated
	 */
	EReference getMultiPad_SinglePad();

	/**
	 * Returns the meta object for class '{@link model.MultiViewRegister <em>Multi View Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi View Register</em>'.
	 * @see model.MultiViewRegister
	 * @generated
	 */
	EClass getMultiViewRegister();

	/**
	 * Returns the meta object for the containment reference list '{@link model.MultiViewRegister#getXRefRegisterView <em>XRef Register View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>XRef Register View</em>'.
	 * @see model.MultiViewRegister#getXRefRegisterView()
	 * @see #getMultiViewRegister()
	 * @generated
	 */
	EReference getMultiViewRegister_XRefRegisterView();

	/**
	 * Returns the meta object for the containment reference list '{@link model.MultiViewRegister#getRegisterView <em>Register View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Register View</em>'.
	 * @see model.MultiViewRegister#getRegisterView()
	 * @see #getMultiViewRegister()
	 * @generated
	 */
	EReference getMultiViewRegister_RegisterView();

	/**
	 * Returns the meta object for class '{@link model.Net <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Net</em>'.
	 * @see model.Net
	 * @generated
	 */
	EClass getNet();

	/**
	 * Returns the meta object for class '{@link model.NoneInterface <em>None Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>None Interface</em>'.
	 * @see model.NoneInterface
	 * @generated
	 */
	EClass getNoneInterface();

	/**
	 * Returns the meta object for class '{@link model.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see model.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link model.Package#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see model.Package#getType()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Package#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pin</em>'.
	 * @see model.Package#getPin()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Pin();

	/**
	 * Returns the meta object for class '{@link model.PackageInstance <em>Package Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Instance</em>'.
	 * @see model.PackageInstance
	 * @generated
	 */
	EClass getPackageInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link model.PackageInstance#getPinNetMap <em>Pin Net Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pin Net Map</em>'.
	 * @see model.PackageInstance#getPinNetMap()
	 * @see #getPackageInstance()
	 * @generated
	 */
	EReference getPackageInstance_PinNetMap();

	/**
	 * Returns the meta object for class '{@link model.Pad <em>Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pad</em>'.
	 * @see model.Pad
	 * @generated
	 */
	EClass getPad();

	/**
	 * Returns the meta object for class '{@link model.PadMultiplexed <em>Pad Multiplexed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pad Multiplexed</em>'.
	 * @see model.PadMultiplexed
	 * @generated
	 */
	EClass getPadMultiplexed();

	/**
	 * Returns the meta object for the containment reference list '{@link model.PadMultiplexed#getExtVLNV <em>Ext VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ext VLNV</em>'.
	 * @see model.PadMultiplexed#getExtVLNV()
	 * @see #getPadMultiplexed()
	 * @generated
	 */
	EReference getPadMultiplexed_ExtVLNV();

	/**
	 * Returns the meta object for the containment reference '{@link model.PadMultiplexed#getXRefPort <em>XRef Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Port</em>'.
	 * @see model.PadMultiplexed#getXRefPort()
	 * @see #getPadMultiplexed()
	 * @generated
	 */
	EReference getPadMultiplexed_XRefPort();

	/**
	 * Returns the meta object for the attribute '{@link model.PadMultiplexed#getPortGroup <em>Port Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Group</em>'.
	 * @see model.PadMultiplexed#getPortGroup()
	 * @see #getPadMultiplexed()
	 * @generated
	 */
	EAttribute getPadMultiplexed_PortGroup();

	/**
	 * Returns the meta object for class '{@link model.PadNetMap <em>Pad Net Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pad Net Map</em>'.
	 * @see model.PadNetMap
	 * @generated
	 */
	EClass getPadNetMap();

	/**
	 * Returns the meta object for the containment reference '{@link model.PadNetMap#getXRefPad <em>XRef Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Pad</em>'.
	 * @see model.PadNetMap#getXRefPad()
	 * @see #getPadNetMap()
	 * @generated
	 */
	EReference getPadNetMap_XRefPad();

	/**
	 * Returns the meta object for the containment reference '{@link model.PadNetMap#getXRefNet <em>XRef Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Net</em>'.
	 * @see model.PadNetMap#getXRefNet()
	 * @see #getPadNetMap()
	 * @generated
	 */
	EReference getPadNetMap_XRefNet();

	/**
	 * Returns the meta object for class '{@link model.PadNonMultiplexed <em>Pad Non Multiplexed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pad Non Multiplexed</em>'.
	 * @see model.PadNonMultiplexed
	 * @generated
	 */
	EClass getPadNonMultiplexed();

	/**
	 * Returns the meta object for the containment reference list '{@link model.PadNonMultiplexed#getExtVLNV <em>Ext VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ext VLNV</em>'.
	 * @see model.PadNonMultiplexed#getExtVLNV()
	 * @see #getPadNonMultiplexed()
	 * @generated
	 */
	EReference getPadNonMultiplexed_ExtVLNV();

	/**
	 * Returns the meta object for the containment reference '{@link model.PadNonMultiplexed#getSiPortReq <em>Si Port Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Si Port Req</em>'.
	 * @see model.PadNonMultiplexed#getSiPortReq()
	 * @see #getPadNonMultiplexed()
	 * @generated
	 */
	EReference getPadNonMultiplexed_SiPortReq();

	/**
	 * Returns the meta object for the containment reference '{@link model.PadNonMultiplexed#getXRefPadType <em>XRef Pad Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Pad Type</em>'.
	 * @see model.PadNonMultiplexed#getXRefPadType()
	 * @see #getPadNonMultiplexed()
	 * @generated
	 */
	EReference getPadNonMultiplexed_XRefPadType();

	/**
	 * Returns the meta object for the containment reference list '{@link model.PadNonMultiplexed#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see model.PadNonMultiplexed#getFunction()
	 * @see #getPadNonMultiplexed()
	 * @generated
	 */
	EReference getPadNonMultiplexed_Function();

	/**
	 * Returns the meta object for class '{@link model.PadSpecial <em>Pad Special</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pad Special</em>'.
	 * @see model.PadSpecial
	 * @generated
	 */
	EClass getPadSpecial();

	/**
	 * Returns the meta object for class '{@link model.PadSupply <em>Pad Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pad Supply</em>'.
	 * @see model.PadSupply
	 * @generated
	 */
	EClass getPadSupply();

	/**
	 * Returns the meta object for the attribute '{@link model.PadSupply#getSpec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spec</em>'.
	 * @see model.PadSupply#getSpec()
	 * @see #getPadSupply()
	 * @generated
	 */
	EAttribute getPadSupply_Spec();

	/**
	 * Returns the meta object for the containment reference '{@link model.PadSupply#getXRefPowerDomain <em>XRef Power Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Power Domain</em>'.
	 * @see model.PadSupply#getXRefPowerDomain()
	 * @see #getPadSupply()
	 * @generated
	 */
	EReference getPadSupply_XRefPowerDomain();

	/**
	 * Returns the meta object for class '{@link model.PadType <em>Pad Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pad Type</em>'.
	 * @see model.PadType
	 * @generated
	 */
	EClass getPadType();

	/**
	 * Returns the meta object for the attribute '{@link model.PadType#getLib <em>Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lib</em>'.
	 * @see model.PadType#getLib()
	 * @see #getPadType()
	 * @generated
	 */
	EAttribute getPadType_Lib();

	/**
	 * Returns the meta object for the attribute '{@link model.PadType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see model.PadType#getType()
	 * @see #getPadType()
	 * @generated
	 */
	EAttribute getPadType_Type();

	/**
	 * Returns the meta object for the attribute '{@link model.PadType#getDriverStrength <em>Driver Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Strength</em>'.
	 * @see model.PadType#getDriverStrength()
	 * @see #getPadType()
	 * @generated
	 */
	EAttribute getPadType_DriverStrength();

	/**
	 * Returns the meta object for the attribute '{@link model.PadType#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set</em>'.
	 * @see model.PadType#getSet()
	 * @see #getPadType()
	 * @generated
	 */
	EAttribute getPadType_Set();

	/**
	 * Returns the meta object for the attribute '{@link model.PadType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see model.PadType#getWidth()
	 * @see #getPadType()
	 * @generated
	 */
	EAttribute getPadType_Width();

	/**
	 * Returns the meta object for the attribute '{@link model.PadType#getSpec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spec</em>'.
	 * @see model.PadType#getSpec()
	 * @see #getPadType()
	 * @generated
	 */
	EAttribute getPadType_Spec();

	/**
	 * Returns the meta object for class '{@link model.PadTypeDB <em>Pad Type DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pad Type DB</em>'.
	 * @see model.PadTypeDB
	 * @generated
	 */
	EClass getPadTypeDB();

	/**
	 * Returns the meta object for the containment reference list '{@link model.PadTypeDB#getPadType <em>Pad Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pad Type</em>'.
	 * @see model.PadTypeDB#getPadType()
	 * @see #getPadTypeDB()
	 * @generated
	 */
	EReference getPadTypeDB_PadType();

	/**
	 * Returns the meta object for class '{@link model.ParamDecl <em>Param Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Decl</em>'.
	 * @see model.ParamDecl
	 * @generated
	 */
	EClass getParamDecl();

	/**
	 * Returns the meta object for class '{@link model.ParamDeclBlock <em>Param Decl Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Decl Block</em>'.
	 * @see model.ParamDeclBlock
	 * @generated
	 */
	EClass getParamDeclBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link model.ParamDeclBlock#getParamDecl <em>Param Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param Decl</em>'.
	 * @see model.ParamDeclBlock#getParamDecl()
	 * @see #getParamDeclBlock()
	 * @generated
	 */
	EReference getParamDeclBlock_ParamDecl();

	/**
	 * Returns the meta object for class '{@link model.ParamMap <em>Param Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Map</em>'.
	 * @see model.ParamMap
	 * @generated
	 */
	EClass getParamMap();

	/**
	 * Returns the meta object for the containment reference '{@link model.ParamMap#getXRefParamDecl <em>XRef Param Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Param Decl</em>'.
	 * @see model.ParamMap#getXRefParamDecl()
	 * @see #getParamMap()
	 * @generated
	 */
	EReference getParamMap_XRefParamDecl();

	/**
	 * Returns the meta object for the attribute '{@link model.ParamMap#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see model.ParamMap#getValue()
	 * @see #getParamMap()
	 * @generated
	 */
	EAttribute getParamMap_Value();

	/**
	 * Returns the meta object for class '{@link model.PathRef <em>Path Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Ref</em>'.
	 * @see model.PathRef
	 * @generated
	 */
	EClass getPathRef();

	/**
	 * Returns the meta object for the attribute '{@link model.PathRef#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see model.PathRef#getLocation()
	 * @see #getPathRef()
	 * @generated
	 */
	EAttribute getPathRef_Location();

	/**
	 * Returns the meta object for the attribute '{@link model.PathRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.PathRef#getName()
	 * @see #getPathRef()
	 * @generated
	 */
	EAttribute getPathRef_Name();

	/**
	 * Returns the meta object for class '{@link model.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see model.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for class '{@link model.PinNetMap <em>Pin Net Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin Net Map</em>'.
	 * @see model.PinNetMap
	 * @generated
	 */
	EClass getPinNetMap();

	/**
	 * Returns the meta object for the containment reference '{@link model.PinNetMap#getXRefPin <em>XRef Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Pin</em>'.
	 * @see model.PinNetMap#getXRefPin()
	 * @see #getPinNetMap()
	 * @generated
	 */
	EReference getPinNetMap_XRefPin();

	/**
	 * Returns the meta object for the containment reference '{@link model.PinNetMap#getXRefNet <em>XRef Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Net</em>'.
	 * @see model.PinNetMap#getXRefNet()
	 * @see #getPinNetMap()
	 * @generated
	 */
	EReference getPinNetMap_XRefNet();

	/**
	 * Returns the meta object for class '{@link model.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see model.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for class '{@link model.PortRef <em>Port Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Ref</em>'.
	 * @see model.PortRef
	 * @generated
	 */
	EClass getPortRef();

	/**
	 * Returns the meta object for the containment reference '{@link model.PortRef#getXRefLocalPort <em>XRef Local Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Local Port</em>'.
	 * @see model.PortRef#getXRefLocalPort()
	 * @see #getPortRef()
	 * @generated
	 */
	EReference getPortRef_XRefLocalPort();

	/**
	 * Returns the meta object for class '{@link model.PowerDomain <em>Power Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Domain</em>'.
	 * @see model.PowerDomain
	 * @generated
	 */
	EClass getPowerDomain();

	/**
	 * Returns the meta object for the attribute '{@link model.PowerDomain#getPowerConsumption <em>Power Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Consumption</em>'.
	 * @see model.PowerDomain#getPowerConsumption()
	 * @see #getPowerDomain()
	 * @generated
	 */
	EAttribute getPowerDomain_PowerConsumption();

	/**
	 * Returns the meta object for the attribute '{@link model.PowerDomain#getMaxCurrent <em>Max Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Current</em>'.
	 * @see model.PowerDomain#getMaxCurrent()
	 * @see #getPowerDomain()
	 * @generated
	 */
	EAttribute getPowerDomain_MaxCurrent();

	/**
	 * Returns the meta object for the attribute '{@link model.PowerDomain#getAverageCurrent <em>Average Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Current</em>'.
	 * @see model.PowerDomain#getAverageCurrent()
	 * @see #getPowerDomain()
	 * @generated
	 */
	EAttribute getPowerDomain_AverageCurrent();

	/**
	 * Returns the meta object for class '{@link model.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see model.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link model.Product#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see model.Product#getStep()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Step();

	/**
	 * Returns the meta object for the containment reference '{@link model.Product#getPackageInstance <em>Package Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package Instance</em>'.
	 * @see model.Product#getPackageInstance()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_PackageInstance();

	/**
	 * Returns the meta object for the containment reference '{@link model.Product#getSiliconInstance <em>Silicon Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Silicon Instance</em>'.
	 * @see model.Product#getSiliconInstance()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_SiliconInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Product#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Net</em>'.
	 * @see model.Product#getNet()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Net();

	/**
	 * Returns the meta object for class '{@link model.ProductInstance <em>Product Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Instance</em>'.
	 * @see model.ProductInstance
	 * @generated
	 */
	EClass getProductInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link model.ProductInstance#getProductInterfaceMap <em>Product Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product Interface Map</em>'.
	 * @see model.ProductInstance#getProductInterfaceMap()
	 * @see #getProductInstance()
	 * @generated
	 */
	EReference getProductInstance_ProductInterfaceMap();

	/**
	 * Returns the meta object for class '{@link model.ProductInterfaceMap <em>Product Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Interface Map</em>'.
	 * @see model.ProductInterfaceMap
	 * @generated
	 */
	EClass getProductInterfaceMap();

	/**
	 * Returns the meta object for the containment reference '{@link model.ProductInterfaceMap#getXRefConnection <em>XRef Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Connection</em>'.
	 * @see model.ProductInterfaceMap#getXRefConnection()
	 * @see #getProductInterfaceMap()
	 * @generated
	 */
	EReference getProductInterfaceMap_XRefConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link model.ProductInterfaceMap#getProductPinMap <em>Product Pin Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product Pin Map</em>'.
	 * @see model.ProductInterfaceMap#getProductPinMap()
	 * @see #getProductInterfaceMap()
	 * @generated
	 */
	EReference getProductInterfaceMap_ProductPinMap();

	/**
	 * Returns the meta object for the containment reference list '{@link model.ProductInterfaceMap#getProductPadMap <em>Product Pad Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product Pad Map</em>'.
	 * @see model.ProductInterfaceMap#getProductPadMap()
	 * @see #getProductInterfaceMap()
	 * @generated
	 */
	EReference getProductInterfaceMap_ProductPadMap();

	/**
	 * Returns the meta object for class '{@link model.ProductPadMap <em>Product Pad Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Pad Map</em>'.
	 * @see model.ProductPadMap
	 * @generated
	 */
	EClass getProductPadMap();

	/**
	 * Returns the meta object for the containment reference '{@link model.ProductPadMap#getXRefPad <em>XRef Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Pad</em>'.
	 * @see model.ProductPadMap#getXRefPad()
	 * @see #getProductPadMap()
	 * @generated
	 */
	EReference getProductPadMap_XRefPad();

	/**
	 * Returns the meta object for the containment reference '{@link model.ProductPadMap#getXRefSignal <em>XRef Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Signal</em>'.
	 * @see model.ProductPadMap#getXRefSignal()
	 * @see #getProductPadMap()
	 * @generated
	 */
	EReference getProductPadMap_XRefSignal();

	/**
	 * Returns the meta object for class '{@link model.ProductPinMap <em>Product Pin Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Pin Map</em>'.
	 * @see model.ProductPinMap
	 * @generated
	 */
	EClass getProductPinMap();

	/**
	 * Returns the meta object for the containment reference '{@link model.ProductPinMap#getXRefPin <em>XRef Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Pin</em>'.
	 * @see model.ProductPinMap#getXRefPin()
	 * @see #getProductPinMap()
	 * @generated
	 */
	EReference getProductPinMap_XRefPin();

	/**
	 * Returns the meta object for the containment reference '{@link model.ProductPinMap#getXRefSignal <em>XRef Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Signal</em>'.
	 * @see model.ProductPinMap#getXRefSignal()
	 * @see #getProductPinMap()
	 * @generated
	 */
	EReference getProductPinMap_XRefSignal();

	/**
	 * Returns the meta object for class '{@link model.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see model.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link model.Property#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see model.Property#getKey()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Property#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see model.Property#getProperty()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Property();

	/**
	 * Returns the meta object for the attribute list '{@link model.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see model.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link model.RealPort <em>Real Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Port</em>'.
	 * @see model.RealPort
	 * @generated
	 */
	EClass getRealPort();

	/**
	 * Returns the meta object for the attribute '{@link model.RealPort#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see model.RealPort#getDirection()
	 * @see #getRealPort()
	 * @generated
	 */
	EAttribute getRealPort_Direction();

	/**
	 * Returns the meta object for the containment reference '{@link model.RealPort#getXRefDefaultValue <em>XRef Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Default Value</em>'.
	 * @see model.RealPort#getXRefDefaultValue()
	 * @see #getRealPort()
	 * @generated
	 */
	EReference getRealPort_XRefDefaultValue();

	/**
	 * Returns the meta object for class '{@link model.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record</em>'.
	 * @see model.Record
	 * @generated
	 */
	EClass getRecord();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Record#getDataTypeElement <em>Data Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Type Element</em>'.
	 * @see model.Record#getDataTypeElement()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_DataTypeElement();

	/**
	 * Returns the meta object for class '{@link model.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see model.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for class '{@link model.Register <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register</em>'.
	 * @see model.Register
	 * @generated
	 */
	EClass getRegister();

	/**
	 * Returns the meta object for the attribute '{@link model.Register#getMirrorSize <em>Mirror Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mirror Size</em>'.
	 * @see model.Register#getMirrorSize()
	 * @see #getRegister()
	 * @generated
	 */
	EAttribute getRegister_MirrorSize();

	/**
	 * Returns the meta object for the attribute '{@link model.Register#getTopSpinType <em>Top Spin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Spin Type</em>'.
	 * @see model.Register#getTopSpinType()
	 * @see #getRegister()
	 * @generated
	 */
	EAttribute getRegister_TopSpinType();

	/**
	 * Returns the meta object for the containment reference '{@link model.Register#getXRefRegisterView <em>XRef Register View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Register View</em>'.
	 * @see model.Register#getXRefRegisterView()
	 * @see #getRegister()
	 * @generated
	 */
	EReference getRegister_XRefRegisterView();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Register#getBitFieldElement <em>Bit Field Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bit Field Element</em>'.
	 * @see model.Register#getBitFieldElement()
	 * @see #getRegister()
	 * @generated
	 */
	EReference getRegister_BitFieldElement();

	/**
	 * Returns the meta object for the reference list '{@link model.Register#getBitField <em>Bit Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bit Field</em>'.
	 * @see model.Register#getBitField()
	 * @see #getRegister()
	 * @generated
	 */
	EReference getRegister_BitField();

	/**
	 * Returns the meta object for the reference list '{@link model.Register#getBitFieldSequence <em>Bit Field Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bit Field Sequence</em>'.
	 * @see model.Register#getBitFieldSequence()
	 * @see #getRegister()
	 * @generated
	 */
	EReference getRegister_BitFieldSequence();

	/**
	 * Returns the meta object for class '{@link model.RegisterView <em>Register View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register View</em>'.
	 * @see model.RegisterView
	 * @generated
	 */
	EClass getRegisterView();

	/**
	 * Returns the meta object for the attribute '{@link model.RegisterView#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see model.RegisterView#getDepth()
	 * @see #getRegisterView()
	 * @generated
	 */
	EAttribute getRegisterView_Depth();

	/**
	 * Returns the meta object for the attribute '{@link model.RegisterView#getDepthVar <em>Depth Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth Var</em>'.
	 * @see model.RegisterView#getDepthVar()
	 * @see #getRegisterView()
	 * @generated
	 */
	EAttribute getRegisterView_DepthVar();

	/**
	 * Returns the meta object for the containment reference list '{@link model.RegisterView#getBitFieldElement <em>Bit Field Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bit Field Element</em>'.
	 * @see model.RegisterView#getBitFieldElement()
	 * @see #getRegisterView()
	 * @generated
	 */
	EReference getRegisterView_BitFieldElement();

	/**
	 * Returns the meta object for class '{@link model.RegMemElement <em>Reg Mem Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reg Mem Element</em>'.
	 * @see model.RegMemElement
	 * @generated
	 */
	EClass getRegMemElement();

	/**
	 * Returns the meta object for the attribute '{@link model.RegMemElement#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see model.RegMemElement#getOffset()
	 * @see #getRegMemElement()
	 * @generated
	 */
	EAttribute getRegMemElement_Offset();

	/**
	 * Returns the meta object for the attribute '{@link model.RegMemElement#getRelOffset <em>Rel Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel Offset</em>'.
	 * @see model.RegMemElement#getRelOffset()
	 * @see #getRegMemElement()
	 * @generated
	 */
	EAttribute getRegMemElement_RelOffset();

	/**
	 * Returns the meta object for class '{@link model.RegMemSequence <em>Reg Mem Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reg Mem Sequence</em>'.
	 * @see model.RegMemSequence
	 * @generated
	 */
	EClass getRegMemSequence();

	/**
	 * Returns the meta object for the attribute '{@link model.RegMemSequence#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see model.RegMemSequence#getCount()
	 * @see #getRegMemSequence()
	 * @generated
	 */
	EAttribute getRegMemSequence_Count();

	/**
	 * Returns the meta object for the attribute '{@link model.RegMemSequence#getMinIndex <em>Min Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Index</em>'.
	 * @see model.RegMemSequence#getMinIndex()
	 * @see #getRegMemSequence()
	 * @generated
	 */
	EAttribute getRegMemSequence_MinIndex();

	/**
	 * Returns the meta object for the attribute '{@link model.RegMemSequence#getIndexStep <em>Index Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Step</em>'.
	 * @see model.RegMemSequence#getIndexStep()
	 * @see #getRegMemSequence()
	 * @generated
	 */
	EAttribute getRegMemSequence_IndexStep();

	/**
	 * Returns the meta object for the attribute '{@link model.RegMemSequence#getIndexVar <em>Index Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Var</em>'.
	 * @see model.RegMemSequence#getIndexVar()
	 * @see #getRegMemSequence()
	 * @generated
	 */
	EAttribute getRegMemSequence_IndexVar();

	/**
	 * Returns the meta object for the attribute '{@link model.RegMemSequence#getAltFormat <em>Alt Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Format</em>'.
	 * @see model.RegMemSequence#getAltFormat()
	 * @see #getRegMemSequence()
	 * @generated
	 */
	EAttribute getRegMemSequence_AltFormat();

	/**
	 * Returns the meta object for the attribute '{@link model.RegMemSequence#isPilot <em>Pilot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pilot</em>'.
	 * @see model.RegMemSequence#isPilot()
	 * @see #getRegMemSequence()
	 * @generated
	 */
	EAttribute getRegMemSequence_Pilot();

	/**
	 * Returns the meta object for the containment reference list '{@link model.RegMemSequence#getSequenceElement <em>Sequence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Element</em>'.
	 * @see model.RegMemSequence#getSequenceElement()
	 * @see #getRegMemSequence()
	 * @generated
	 */
	EReference getRegMemSequence_SequenceElement();

	/**
	 * Returns the meta object for the '{@link model.RegMemSequence#getElement() <em>Get Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Element</em>' operation.
	 * @see model.RegMemSequence#getElement()
	 * @generated
	 */
	EOperation getRegMemSequence__GetElement();

	/**
	 * Returns the meta object for class '{@link model.RegMemSet <em>Reg Mem Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reg Mem Set</em>'.
	 * @see model.RegMemSet
	 * @generated
	 */
	EClass getRegMemSet();

	/**
	 * Returns the meta object for the attribute '{@link model.RegMemSet#getAddressUnit <em>Address Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Unit</em>'.
	 * @see model.RegMemSet#getAddressUnit()
	 * @see #getRegMemSet()
	 * @generated
	 */
	EAttribute getRegMemSet_AddressUnit();

	/**
	 * Returns the meta object for the attribute '{@link model.RegMemSet#getDataUnit <em>Data Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Unit</em>'.
	 * @see model.RegMemSet#getDataUnit()
	 * @see #getRegMemSet()
	 * @generated
	 */
	EAttribute getRegMemSet_DataUnit();

	/**
	 * Returns the meta object for the attribute '{@link model.RegMemSet#getSpecial <em>Special</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special</em>'.
	 * @see model.RegMemSet#getSpecial()
	 * @see #getRegMemSet()
	 * @generated
	 */
	EAttribute getRegMemSet_Special();

	/**
	 * Returns the meta object for the attribute '{@link model.RegMemSet#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type</em>'.
	 * @see model.RegMemSet#getMessageType()
	 * @see #getRegMemSet()
	 * @generated
	 */
	EAttribute getRegMemSet_MessageType();

	/**
	 * Returns the meta object for the attribute '{@link model.RegMemSet#getOpCode <em>Op Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op Code</em>'.
	 * @see model.RegMemSet#getOpCode()
	 * @see #getRegMemSet()
	 * @generated
	 */
	EAttribute getRegMemSet_OpCode();

	/**
	 * Returns the meta object for the containment reference list '{@link model.RegMemSet#getRegMemElement <em>Reg Mem Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reg Mem Element</em>'.
	 * @see model.RegMemSet#getRegMemElement()
	 * @see #getRegMemSet()
	 * @generated
	 */
	EReference getRegMemSet_RegMemElement();

	/**
	 * Returns the meta object for class '{@link model.RegViewBlock <em>Reg View Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reg View Block</em>'.
	 * @see model.RegViewBlock
	 * @generated
	 */
	EClass getRegViewBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link model.RegViewBlock#getRegisterView <em>Register View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Register View</em>'.
	 * @see model.RegViewBlock#getRegisterView()
	 * @see #getRegViewBlock()
	 * @generated
	 */
	EReference getRegViewBlock_RegisterView();

	/**
	 * Returns the meta object for class '{@link model.ResetType <em>Reset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Type</em>'.
	 * @see model.ResetType
	 * @generated
	 */
	EClass getResetType();

	/**
	 * Returns the meta object for the attribute '{@link model.ResetType#getResetLevel <em>Reset Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset Level</em>'.
	 * @see model.ResetType#getResetLevel()
	 * @see #getResetType()
	 * @generated
	 */
	EAttribute getResetType_ResetLevel();

	/**
	 * Returns the meta object for the attribute '{@link model.ResetType#getResetMask <em>Reset Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset Mask</em>'.
	 * @see model.ResetType#getResetMask()
	 * @see #getResetType()
	 * @generated
	 */
	EAttribute getResetType_ResetMask();

	/**
	 * Returns the meta object for the attribute '{@link model.ResetType#getResetMode <em>Reset Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset Mode</em>'.
	 * @see model.ResetType#getResetMode()
	 * @see #getResetType()
	 * @generated
	 */
	EAttribute getResetType_ResetMode();

	/**
	 * Returns the meta object for the attribute '{@link model.ResetType#getResetType <em>Reset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset Type</em>'.
	 * @see model.ResetType#getResetType()
	 * @see #getResetType()
	 * @generated
	 */
	EAttribute getResetType_ResetType();

	/**
	 * Returns the meta object for the attribute '{@link model.ResetType#getResetValue <em>Reset Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset Value</em>'.
	 * @see model.ResetType#getResetValue()
	 * @see #getResetType()
	 * @generated
	 */
	EAttribute getResetType_ResetValue();

	/**
	 * Returns the meta object for class '{@link model.ReturnDataType <em>Return Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Data Type</em>'.
	 * @see model.ReturnDataType
	 * @generated
	 */
	EClass getReturnDataType();

	/**
	 * Returns the meta object for class '{@link model.ReturnElementAccess <em>Return Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Element Access</em>'.
	 * @see model.ReturnElementAccess
	 * @generated
	 */
	EClass getReturnElementAccess();

	/**
	 * Returns the meta object for the containment reference '{@link model.ReturnElementAccess#getSimpleSubElementAccess <em>Simple Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Sub Element Access</em>'.
	 * @see model.ReturnElementAccess#getSimpleSubElementAccess()
	 * @see #getReturnElementAccess()
	 * @generated
	 */
	EReference getReturnElementAccess_SimpleSubElementAccess();

	/**
	 * Returns the meta object for class '{@link model.SequenceElement <em>Sequence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Element</em>'.
	 * @see model.SequenceElement
	 * @generated
	 */
	EClass getSequenceElement();

	/**
	 * Returns the meta object for the attribute '{@link model.SequenceElement#getDataWidth <em>Data Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Width</em>'.
	 * @see model.SequenceElement#getDataWidth()
	 * @see #getSequenceElement()
	 * @generated
	 */
	EAttribute getSequenceElement_DataWidth();

	/**
	 * Returns the meta object for the containment reference list '{@link model.SequenceElement#getAccessCondition <em>Access Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Condition</em>'.
	 * @see model.SequenceElement#getAccessCondition()
	 * @see #getSequenceElement()
	 * @generated
	 */
	EReference getSequenceElement_AccessCondition();

	/**
	 * Returns the meta object for class '{@link model.ShellInterfaceMap <em>Shell Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shell Interface Map</em>'.
	 * @see model.ShellInterfaceMap
	 * @generated
	 */
	EClass getShellInterfaceMap();

	/**
	 * Returns the meta object for the containment reference '{@link model.ShellInterfaceMap#getXRefShellInterface <em>XRef Shell Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Shell Interface</em>'.
	 * @see model.ShellInterfaceMap#getXRefShellInterface()
	 * @see #getShellInterfaceMap()
	 * @generated
	 */
	EReference getShellInterfaceMap_XRefShellInterface();

	/**
	 * Returns the meta object for the containment reference '{@link model.ShellInterfaceMap#getXRefConnection <em>XRef Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Connection</em>'.
	 * @see model.ShellInterfaceMap#getXRefConnection()
	 * @see #getShellInterfaceMap()
	 * @generated
	 */
	EReference getShellInterfaceMap_XRefConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link model.ShellInterfaceMap#getShellPortMap <em>Shell Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shell Port Map</em>'.
	 * @see model.ShellInterfaceMap#getShellPortMap()
	 * @see #getShellInterfaceMap()
	 * @generated
	 */
	EReference getShellInterfaceMap_ShellPortMap();

	/**
	 * Returns the meta object for class '{@link model.ShellPortMap <em>Shell Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shell Port Map</em>'.
	 * @see model.ShellPortMap
	 * @generated
	 */
	EClass getShellPortMap();

	/**
	 * Returns the meta object for the containment reference '{@link model.ShellPortMap#getXRefShellPort <em>XRef Shell Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Shell Port</em>'.
	 * @see model.ShellPortMap#getXRefShellPort()
	 * @see #getShellPortMap()
	 * @generated
	 */
	EReference getShellPortMap_XRefShellPort();

	/**
	 * Returns the meta object for the containment reference '{@link model.ShellPortMap#getXRefSignal <em>XRef Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Signal</em>'.
	 * @see model.ShellPortMap#getXRefSignal()
	 * @see #getShellPortMap()
	 * @generated
	 */
	EReference getShellPortMap_XRefSignal();

	/**
	 * Returns the meta object for class '{@link model.SiComponentInstance <em>Si Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si Component Instance</em>'.
	 * @see model.SiComponentInstance
	 * @generated
	 */
	EClass getSiComponentInstance();

	/**
	 * Returns the meta object for class '{@link model.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see model.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the containment reference '{@link model.Signal#getXRefDefaultValue <em>XRef Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Default Value</em>'.
	 * @see model.Signal#getXRefDefaultValue()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_XRefDefaultValue();

	/**
	 * Returns the meta object for class '{@link model.SignalMap <em>Signal Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Map</em>'.
	 * @see model.SignalMap
	 * @generated
	 */
	EClass getSignalMap();

	/**
	 * Returns the meta object for the containment reference '{@link model.SignalMap#getXRefLocalSignal <em>XRef Local Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Local Signal</em>'.
	 * @see model.SignalMap#getXRefLocalSignal()
	 * @see #getSignalMap()
	 * @generated
	 */
	EReference getSignalMap_XRefLocalSignal();

	/**
	 * Returns the meta object for the containment reference '{@link model.SignalMap#getXRefInterfaceDefSignal <em>XRef Interface Def Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Interface Def Signal</em>'.
	 * @see model.SignalMap#getXRefInterfaceDefSignal()
	 * @see #getSignalMap()
	 * @generated
	 */
	EReference getSignalMap_XRefInterfaceDefSignal();

	/**
	 * Returns the meta object for class '{@link model.SignalOwner <em>Signal Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Owner</em>'.
	 * @see model.SignalOwner
	 * @generated
	 */
	EClass getSignalOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link model.SignalOwner#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signal</em>'.
	 * @see model.SignalOwner#getSignal()
	 * @see #getSignalOwner()
	 * @generated
	 */
	EReference getSignalOwner_Signal();

	/**
	 * Returns the meta object for the containment reference list '{@link model.SignalOwner#getSignalMap <em>Signal Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signal Map</em>'.
	 * @see model.SignalOwner#getSignalMap()
	 * @see #getSignalOwner()
	 * @generated
	 */
	EReference getSignalOwner_SignalMap();

	/**
	 * Returns the meta object for class '{@link model.SiInstance <em>Si Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si Instance</em>'.
	 * @see model.SiInstance
	 * @generated
	 */
	EClass getSiInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link model.SiInstance#getSiInstanceInterfaceMap <em>Si Instance Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Si Instance Interface Map</em>'.
	 * @see model.SiInstance#getSiInstanceInterfaceMap()
	 * @see #getSiInstance()
	 * @generated
	 */
	EReference getSiInstance_SiInstanceInterfaceMap();

	/**
	 * Returns the meta object for class '{@link model.SiInstanceInterfaceMap <em>Si Instance Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si Instance Interface Map</em>'.
	 * @see model.SiInstanceInterfaceMap
	 * @generated
	 */
	EClass getSiInstanceInterfaceMap();

	/**
	 * Returns the meta object for the containment reference '{@link model.SiInstanceInterfaceMap#getXRefInstanceInterface <em>XRef Instance Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Instance Interface</em>'.
	 * @see model.SiInstanceInterfaceMap#getXRefInstanceInterface()
	 * @see #getSiInstanceInterfaceMap()
	 * @generated
	 */
	EReference getSiInstanceInterfaceMap_XRefInstanceInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link model.SiInstanceInterfaceMap#getSiInstancePortMap <em>Si Instance Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Si Instance Port Map</em>'.
	 * @see model.SiInstanceInterfaceMap#getSiInstancePortMap()
	 * @see #getSiInstanceInterfaceMap()
	 * @generated
	 */
	EReference getSiInstanceInterfaceMap_SiInstancePortMap();

	/**
	 * Returns the meta object for class '{@link model.SiInstancePortMap <em>Si Instance Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si Instance Port Map</em>'.
	 * @see model.SiInstancePortMap
	 * @generated
	 */
	EClass getSiInstancePortMap();

	/**
	 * Returns the meta object for the containment reference '{@link model.SiInstancePortMap#getXRefInstancePort <em>XRef Instance Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Instance Port</em>'.
	 * @see model.SiInstancePortMap#getXRefInstancePort()
	 * @see #getSiInstancePortMap()
	 * @generated
	 */
	EReference getSiInstancePortMap_XRefInstancePort();

	/**
	 * Returns the meta object for the containment reference '{@link model.SiInstancePortMap#getXRefSignal <em>XRef Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Signal</em>'.
	 * @see model.SiInstancePortMap#getXRefSignal()
	 * @see #getSiInstancePortMap()
	 * @generated
	 */
	EReference getSiInstancePortMap_XRefSignal();

	/**
	 * Returns the meta object for class '{@link model.SiInstanceShellInterfaceMap <em>Si Instance Shell Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si Instance Shell Interface Map</em>'.
	 * @see model.SiInstanceShellInterfaceMap
	 * @generated
	 */
	EClass getSiInstanceShellInterfaceMap();

	/**
	 * Returns the meta object for the containment reference '{@link model.SiInstanceShellInterfaceMap#getXRefInstanceShellInterface <em>XRef Instance Shell Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Instance Shell Interface</em>'.
	 * @see model.SiInstanceShellInterfaceMap#getXRefInstanceShellInterface()
	 * @see #getSiInstanceShellInterfaceMap()
	 * @generated
	 */
	EReference getSiInstanceShellInterfaceMap_XRefInstanceShellInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link model.SiInstanceShellInterfaceMap#getSiInstanceShellPortMap <em>Si Instance Shell Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Si Instance Shell Port Map</em>'.
	 * @see model.SiInstanceShellInterfaceMap#getSiInstanceShellPortMap()
	 * @see #getSiInstanceShellInterfaceMap()
	 * @generated
	 */
	EReference getSiInstanceShellInterfaceMap_SiInstanceShellPortMap();

	/**
	 * Returns the meta object for class '{@link model.SiInstanceShellPortMap <em>Si Instance Shell Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si Instance Shell Port Map</em>'.
	 * @see model.SiInstanceShellPortMap
	 * @generated
	 */
	EClass getSiInstanceShellPortMap();

	/**
	 * Returns the meta object for the containment reference '{@link model.SiInstanceShellPortMap#getXRefInstanceShellPort <em>XRef Instance Shell Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Instance Shell Port</em>'.
	 * @see model.SiInstanceShellPortMap#getXRefInstanceShellPort()
	 * @see #getSiInstanceShellPortMap()
	 * @generated
	 */
	EReference getSiInstanceShellPortMap_XRefInstanceShellPort();

	/**
	 * Returns the meta object for the containment reference '{@link model.SiInstanceShellPortMap#getXRefSignal <em>XRef Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Signal</em>'.
	 * @see model.SiInstanceShellPortMap#getXRefSignal()
	 * @see #getSiInstanceShellPortMap()
	 * @generated
	 */
	EReference getSiInstanceShellPortMap_XRefSignal();

	/**
	 * Returns the meta object for class '{@link model.Silicon <em>Silicon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Silicon</em>'.
	 * @see model.Silicon
	 * @generated
	 */
	EClass getSilicon();

	/**
	 * Returns the meta object for the attribute '{@link model.Silicon#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see model.Silicon#getStep()
	 * @see #getSilicon()
	 * @generated
	 */
	EAttribute getSilicon_Step();

	/**
	 * Returns the meta object for the attribute '{@link model.Silicon#getPadHeight <em>Pad Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pad Height</em>'.
	 * @see model.Silicon#getPadHeight()
	 * @see #getSilicon()
	 * @generated
	 */
	EAttribute getSilicon_PadHeight();

	/**
	 * Returns the meta object for the attribute '{@link model.Silicon#getKerfWidth <em>Kerf Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kerf Width</em>'.
	 * @see model.Silicon#getKerfWidth()
	 * @see #getSilicon()
	 * @generated
	 */
	EAttribute getSilicon_KerfWidth();

	/**
	 * Returns the meta object for the attribute '{@link model.Silicon#getKerfHeight <em>Kerf Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kerf Height</em>'.
	 * @see model.Silicon#getKerfHeight()
	 * @see #getSilicon()
	 * @generated
	 */
	EAttribute getSilicon_KerfHeight();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Silicon#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance</em>'.
	 * @see model.Silicon#getInstance()
	 * @see #getSilicon()
	 * @generated
	 */
	EReference getSilicon_Instance();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Silicon#getPad <em>Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pad</em>'.
	 * @see model.Silicon#getPad()
	 * @see #getSilicon()
	 * @generated
	 */
	EReference getSilicon_Pad();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Silicon#getPowerDomain <em>Power Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Power Domain</em>'.
	 * @see model.Silicon#getPowerDomain()
	 * @see #getSilicon()
	 * @generated
	 */
	EReference getSilicon_PowerDomain();

	/**
	 * Returns the meta object for class '{@link model.SiliconInstance <em>Silicon Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Silicon Instance</em>'.
	 * @see model.SiliconInstance
	 * @generated
	 */
	EClass getSiliconInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link model.SiliconInstance#getPadNetMap <em>Pad Net Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pad Net Map</em>'.
	 * @see model.SiliconInstance#getPadNetMap()
	 * @see #getSiliconInstance()
	 * @generated
	 */
	EReference getSiliconInstance_PadNetMap();

	/**
	 * Returns the meta object for class '{@link model.SimpleDataType <em>Simple Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Data Type</em>'.
	 * @see model.SimpleDataType
	 * @generated
	 */
	EClass getSimpleDataType();

	/**
	 * Returns the meta object for class '{@link model.SimpleSubElementAccess <em>Simple Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Sub Element Access</em>'.
	 * @see model.SimpleSubElementAccess
	 * @generated
	 */
	EClass getSimpleSubElementAccess();

	/**
	 * Returns the meta object for class '{@link model.SinglePad <em>Single Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Pad</em>'.
	 * @see model.SinglePad
	 * @generated
	 */
	EClass getSinglePad();

	/**
	 * Returns the meta object for the attribute '{@link model.SinglePad#getXCoordinate <em>XCoordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XCoordinate</em>'.
	 * @see model.SinglePad#getXCoordinate()
	 * @see #getSinglePad()
	 * @generated
	 */
	EAttribute getSinglePad_XCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link model.SinglePad#getYCoordinate <em>YCoordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YCoordinate</em>'.
	 * @see model.SinglePad#getYCoordinate()
	 * @see #getSinglePad()
	 * @generated
	 */
	EAttribute getSinglePad_YCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link model.SinglePad#getSpacer <em>Spacer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spacer</em>'.
	 * @see model.SinglePad#getSpacer()
	 * @see #getSinglePad()
	 * @generated
	 */
	EAttribute getSinglePad_Spacer();

	/**
	 * Returns the meta object for the attribute '{@link model.SinglePad#getOpening <em>Opening</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opening</em>'.
	 * @see model.SinglePad#getOpening()
	 * @see #getSinglePad()
	 * @generated
	 */
	EAttribute getSinglePad_Opening();

	/**
	 * Returns the meta object for the attribute '{@link model.SinglePad#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see model.SinglePad#getLocation()
	 * @see #getSinglePad()
	 * @generated
	 */
	EAttribute getSinglePad_Location();

	/**
	 * Returns the meta object for the attribute '{@link model.SinglePad#getPadCount <em>Pad Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pad Count</em>'.
	 * @see model.SinglePad#getPadCount()
	 * @see #getSinglePad()
	 * @generated
	 */
	EAttribute getSinglePad_PadCount();

	/**
	 * Returns the meta object for the attribute '{@link model.SinglePad#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Place</em>'.
	 * @see model.SinglePad#getPlace()
	 * @see #getSinglePad()
	 * @generated
	 */
	EAttribute getSinglePad_Place();

	/**
	 * Returns the meta object for the attribute '{@link model.SinglePad#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see model.SinglePad#getOrientation()
	 * @see #getSinglePad()
	 * @generated
	 */
	EAttribute getSinglePad_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link model.SinglePad#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see model.SinglePad#getPower()
	 * @see #getSinglePad()
	 * @generated
	 */
	EAttribute getSinglePad_Power();

	/**
	 * Returns the meta object for the attribute '{@link model.SinglePad#getGround <em>Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ground</em>'.
	 * @see model.SinglePad#getGround()
	 * @see #getSinglePad()
	 * @generated
	 */
	EAttribute getSinglePad_Ground();

	/**
	 * Returns the meta object for class '{@link model.SingleSourceNode <em>Single Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Source Node</em>'.
	 * @see model.SingleSourceNode
	 * @generated
	 */
	EClass getSingleSourceNode();

	/**
	 * Returns the meta object for the attribute '{@link model.SingleSourceNode#getCustom <em>Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom</em>'.
	 * @see model.SingleSourceNode#getCustom()
	 * @see #getSingleSourceNode()
	 * @generated
	 */
	EAttribute getSingleSourceNode_Custom();

	/**
	 * Returns the meta object for the attribute '{@link model.SingleSourceNode#getHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see model.SingleSourceNode#getHidden()
	 * @see #getSingleSourceNode()
	 * @generated
	 */
	EAttribute getSingleSourceNode_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link model.SingleSourceNode#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see model.SingleSourceNode#getID()
	 * @see #getSingleSourceNode()
	 * @generated
	 */
	EAttribute getSingleSourceNode_ID();

	/**
	 * Returns the meta object for the containment reference '{@link model.SingleSourceNode#getLongDescription <em>Long Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Long Description</em>'.
	 * @see model.SingleSourceNode#getLongDescription()
	 * @see #getSingleSourceNode()
	 * @generated
	 */
	EReference getSingleSourceNode_LongDescription();

	/**
	 * Returns the meta object for the attribute '{@link model.SingleSourceNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.SingleSourceNode#getName()
	 * @see #getSingleSourceNode()
	 * @generated
	 */
	EAttribute getSingleSourceNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link model.SingleSourceNode#getShortDescription <em>Short Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Description</em>'.
	 * @see model.SingleSourceNode#getShortDescription()
	 * @see #getSingleSourceNode()
	 * @generated
	 */
	EAttribute getSingleSourceNode_ShortDescription();

	/**
	 * Returns the meta object for the attribute '{@link model.SingleSourceNode#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see model.SingleSourceNode#getShortName()
	 * @see #getSingleSourceNode()
	 * @generated
	 */
	EAttribute getSingleSourceNode_ShortName();

	/**
	 * Returns the meta object for the containment reference list '{@link model.SingleSourceNode#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see model.SingleSourceNode#getProperty()
	 * @see #getSingleSourceNode()
	 * @generated
	 */
	EReference getSingleSourceNode_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link model.SingleSourceNode#getXRefExtension <em>XRef Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>XRef Extension</em>'.
	 * @see model.SingleSourceNode#getXRefExtension()
	 * @see #getSingleSourceNode()
	 * @generated
	 */
	EReference getSingleSourceNode_XRefExtension();

	/**
	 * Returns the meta object for class '{@link model.SiPort <em>Si Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si Port</em>'.
	 * @see model.SiPort
	 * @generated
	 */
	EClass getSiPort();

	/**
	 * Returns the meta object for the attribute '{@link model.SiPort#getPdr <em>Pdr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pdr</em>'.
	 * @see model.SiPort#getPdr()
	 * @see #getSiPort()
	 * @generated
	 */
	EAttribute getSiPort_Pdr();

	/**
	 * Returns the meta object for the containment reference '{@link model.SiPort#getXRefTest <em>XRef Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Test</em>'.
	 * @see model.SiPort#getXRefTest()
	 * @see #getSiPort()
	 * @generated
	 */
	EReference getSiPort_XRefTest();

	/**
	 * Returns the meta object for the containment reference '{@link model.SiPort#getSiPortReq <em>Si Port Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Si Port Req</em>'.
	 * @see model.SiPort#getSiPortReq()
	 * @see #getSiPort()
	 * @generated
	 */
	EReference getSiPort_SiPortReq();

	/**
	 * Returns the meta object for the containment reference list '{@link model.SiPort#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see model.SiPort#getFunction()
	 * @see #getSiPort()
	 * @generated
	 */
	EReference getSiPort_Function();

	/**
	 * Returns the meta object for class '{@link model.SiPortDB <em>Si Port DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si Port DB</em>'.
	 * @see model.SiPortDB
	 * @generated
	 */
	EClass getSiPortDB();

	/**
	 * Returns the meta object for the containment reference list '{@link model.SiPortDB#getSiPort <em>Si Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Si Port</em>'.
	 * @see model.SiPortDB#getSiPort()
	 * @see #getSiPortDB()
	 * @generated
	 */
	EReference getSiPortDB_SiPort();

	/**
	 * Returns the meta object for class '{@link model.SiPortReq <em>Si Port Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si Port Req</em>'.
	 * @see model.SiPortReq
	 * @generated
	 */
	EClass getSiPortReq();

	/**
	 * Returns the meta object for the attribute '{@link model.SiPortReq#getDriverStrength <em>Driver Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Strength</em>'.
	 * @see model.SiPortReq#getDriverStrength()
	 * @see #getSiPortReq()
	 * @generated
	 */
	EAttribute getSiPortReq_DriverStrength();

	/**
	 * Returns the meta object for the attribute '{@link model.SiPortReq#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set</em>'.
	 * @see model.SiPortReq#getSet()
	 * @see #getSiPortReq()
	 * @generated
	 */
	EAttribute getSiPortReq_Set();

	/**
	 * Returns the meta object for the attribute '{@link model.SiPortReq#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see model.SiPortReq#getType()
	 * @see #getSiPortReq()
	 * @generated
	 */
	EAttribute getSiPortReq_Type();

	/**
	 * Returns the meta object for class '{@link model.SiSignal <em>Si Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si Signal</em>'.
	 * @see model.SiSignal
	 * @generated
	 */
	EClass getSiSignal();

	/**
	 * Returns the meta object for class '{@link model.SiSignalDB <em>Si Signal DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si Signal DB</em>'.
	 * @see model.SiSignalDB
	 * @generated
	 */
	EClass getSiSignalDB();

	/**
	 * Returns the meta object for the containment reference list '{@link model.SiSignalDB#getSiSignal <em>Si Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Si Signal</em>'.
	 * @see model.SiSignalDB#getSiSignal()
	 * @see #getSiSignalDB()
	 * @generated
	 */
	EReference getSiSignalDB_SiSignal();

	/**
	 * Returns the meta object for class '{@link model.SiSystemInstance <em>Si System Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Si System Instance</em>'.
	 * @see model.SiSystemInstance
	 * @generated
	 */
	EClass getSiSystemInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link model.SiSystemInstance#getSiInstanceShellInterfaceMap <em>Si Instance Shell Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Si Instance Shell Interface Map</em>'.
	 * @see model.SiSystemInstance#getSiInstanceShellInterfaceMap()
	 * @see #getSiSystemInstance()
	 * @generated
	 */
	EReference getSiSystemInstance_SiInstanceShellInterfaceMap();

	/**
	 * Returns the meta object for class '{@link model.StringDecl <em>String Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Decl</em>'.
	 * @see model.StringDecl
	 * @generated
	 */
	EClass getStringDecl();

	/**
	 * Returns the meta object for the attribute '{@link model.StringDecl#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see model.StringDecl#getDefaultValue()
	 * @see #getStringDecl()
	 * @generated
	 */
	EAttribute getStringDecl_DefaultValue();

	/**
	 * Returns the meta object for the containment reference list '{@link model.StringDecl#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration</em>'.
	 * @see model.StringDecl#getEnumeration()
	 * @see #getStringDecl()
	 * @generated
	 */
	EReference getStringDecl_Enumeration();

	/**
	 * Returns the meta object for class '{@link model.StringDef <em>String Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Def</em>'.
	 * @see model.StringDef
	 * @generated
	 */
	EClass getStringDef();

	/**
	 * Returns the meta object for the attribute '{@link model.StringDef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see model.StringDef#getValue()
	 * @see #getStringDef()
	 * @generated
	 */
	EAttribute getStringDef_Value();

	/**
	 * Returns the meta object for class '{@link model.StringGenDecl <em>String Gen Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Gen Decl</em>'.
	 * @see model.StringGenDecl
	 * @generated
	 */
	EClass getStringGenDecl();

	/**
	 * Returns the meta object for the attribute '{@link model.StringGenDecl#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see model.StringGenDecl#getDefaultValue()
	 * @see #getStringGenDecl()
	 * @generated
	 */
	EAttribute getStringGenDecl_DefaultValue();

	/**
	 * Returns the meta object for the containment reference list '{@link model.StringGenDecl#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration</em>'.
	 * @see model.StringGenDecl#getEnumeration()
	 * @see #getStringGenDecl()
	 * @generated
	 */
	EReference getStringGenDecl_Enumeration();

	/**
	 * Returns the meta object for class '{@link model.SubElementAccess <em>Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Element Access</em>'.
	 * @see model.SubElementAccess
	 * @generated
	 */
	EClass getSubElementAccess();

	/**
	 * Returns the meta object for class '{@link model.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see model.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference '{@link model.System#getExtVLNV <em>Ext VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ext VLNV</em>'.
	 * @see model.System#getExtVLNV()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_ExtVLNV();

	/**
	 * Returns the meta object for the containment reference list '{@link model.System#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see model.System#getInterface()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Interface();

	/**
	 * Returns the meta object for the containment reference list '{@link model.System#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see model.System#getConnection()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Connection();

	/**
	 * Returns the meta object for the containment reference list '{@link model.System#getLocalInterfaceMap <em>Local Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Interface Map</em>'.
	 * @see model.System#getLocalInterfaceMap()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_LocalInterfaceMap();

	/**
	 * Returns the meta object for the containment reference list '{@link model.System#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance</em>'.
	 * @see model.System#getInstance()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Instance();

	/**
	 * Returns the meta object for the containment reference list '{@link model.System#getShellInterfaceMap <em>Shell Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shell Interface Map</em>'.
	 * @see model.System#getShellInterfaceMap()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_ShellInterfaceMap();

	/**
	 * Returns the meta object for class '{@link model.SystemInstance <em>System Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Instance</em>'.
	 * @see model.SystemInstance
	 * @generated
	 */
	EClass getSystemInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link model.SystemInstance#getInstanceShellInterfaceMap <em>Instance Shell Interface Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Shell Interface Map</em>'.
	 * @see model.SystemInstance#getInstanceShellInterfaceMap()
	 * @see #getSystemInstance()
	 * @generated
	 */
	EReference getSystemInstance_InstanceShellInterfaceMap();

	/**
	 * Returns the meta object for class '{@link model.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see model.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the attribute '{@link model.Test#getParallelFactor <em>Parallel Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallel Factor</em>'.
	 * @see model.Test#getParallelFactor()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_ParallelFactor();

	/**
	 * Returns the meta object for the containment reference '{@link model.Test#getTestReq <em>Test Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Req</em>'.
	 * @see model.Test#getTestReq()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_TestReq();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Test#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see model.Test#getFunction()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Function();

	/**
	 * Returns the meta object for class '{@link model.TestDB <em>Test DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test DB</em>'.
	 * @see model.TestDB
	 * @generated
	 */
	EClass getTestDB();

	/**
	 * Returns the meta object for the containment reference list '{@link model.TestDB#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test</em>'.
	 * @see model.TestDB#getTest()
	 * @see #getTestDB()
	 * @generated
	 */
	EReference getTestDB_Test();

	/**
	 * Returns the meta object for class '{@link model.TestReq <em>Test Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Req</em>'.
	 * @see model.TestReq
	 * @generated
	 */
	EClass getTestReq();

	/**
	 * Returns the meta object for the attribute '{@link model.TestReq#getDriverStrength <em>Driver Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Strength</em>'.
	 * @see model.TestReq#getDriverStrength()
	 * @see #getTestReq()
	 * @generated
	 */
	EAttribute getTestReq_DriverStrength();

	/**
	 * Returns the meta object for class '{@link model.TransactionalPort <em>Transactional Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transactional Port</em>'.
	 * @see model.TransactionalPort
	 * @generated
	 */
	EClass getTransactionalPort();

	/**
	 * Returns the meta object for the containment reference '{@link model.TransactionalPort#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see model.TransactionalPort#getDataType()
	 * @see #getTransactionalPort()
	 * @generated
	 */
	EReference getTransactionalPort_DataType();

	/**
	 * Returns the meta object for the attribute '{@link model.TransactionalPort#getInitiative <em>Initiative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiative</em>'.
	 * @see model.TransactionalPort#getInitiative()
	 * @see #getTransactionalPort()
	 * @generated
	 */
	EAttribute getTransactionalPort_Initiative();

	/**
	 * Returns the meta object for class '{@link model.TransactionalSignal <em>Transactional Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transactional Signal</em>'.
	 * @see model.TransactionalSignal
	 * @generated
	 */
	EClass getTransactionalSignal();

	/**
	 * Returns the meta object for the containment reference '{@link model.TransactionalSignal#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see model.TransactionalSignal#getDataType()
	 * @see #getTransactionalSignal()
	 * @generated
	 */
	EReference getTransactionalSignal_DataType();

	/**
	 * Returns the meta object for class '{@link model.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union</em>'.
	 * @see model.Union
	 * @generated
	 */
	EClass getUnion();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Union#getDataTypeElement <em>Data Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Type Element</em>'.
	 * @see model.Union#getDataTypeElement()
	 * @see #getUnion()
	 * @generated
	 */
	EReference getUnion_DataTypeElement();

	/**
	 * Returns the meta object for class '{@link model.ValueDataType <em>Value Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Data Type</em>'.
	 * @see model.ValueDataType
	 * @generated
	 */
	EClass getValueDataType();

	/**
	 * Returns the meta object for the attribute '{@link model.ValueDataType#getSignInterpretation <em>Sign Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sign Interpretation</em>'.
	 * @see model.ValueDataType#getSignInterpretation()
	 * @see #getValueDataType()
	 * @generated
	 */
	EAttribute getValueDataType_SignInterpretation();

	/**
	 * Returns the meta object for the attribute '{@link model.ValueDataType#getObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Type</em>'.
	 * @see model.ValueDataType#getObjectType()
	 * @see #getValueDataType()
	 * @generated
	 */
	EAttribute getValueDataType_ObjectType();

	/**
	 * Returns the meta object for the containment reference '{@link model.ValueDataType#getVector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vector</em>'.
	 * @see model.ValueDataType#getVector()
	 * @see #getValueDataType()
	 * @generated
	 */
	EReference getValueDataType_Vector();

	/**
	 * Returns the meta object for class '{@link model.VarDef <em>Var Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Def</em>'.
	 * @see model.VarDef
	 * @generated
	 */
	EClass getVarDef();

	/**
	 * Returns the meta object for the attribute '{@link model.VarDef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see model.VarDef#getType()
	 * @see #getVarDef()
	 * @generated
	 */
	EAttribute getVarDef_Type();

	/**
	 * Returns the meta object for the attribute '{@link model.VarDef#getVarDefValue <em>Var Def Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Def Value</em>'.
	 * @see model.VarDef#getVarDefValue()
	 * @see #getVarDef()
	 * @generated
	 */
	EAttribute getVarDef_VarDefValue();

	/**
	 * Returns the meta object for the attribute '{@link model.VarDef#getVarDefOverride <em>Var Def Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Def Override</em>'.
	 * @see model.VarDef#getVarDefOverride()
	 * @see #getVarDef()
	 * @generated
	 */
	EAttribute getVarDef_VarDefOverride();

	/**
	 * Returns the meta object for class '{@link model.VarDefBlock <em>Var Def Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Def Block</em>'.
	 * @see model.VarDefBlock
	 * @generated
	 */
	EClass getVarDefBlock();

	/**
	 * Returns the meta object for class '{@link model.VLNV <em>VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VLNV</em>'.
	 * @see model.VLNV
	 * @generated
	 */
	EClass getVLNV();

	/**
	 * Returns the meta object for the attribute '{@link model.VLNV#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see model.VLNV#getVendor()
	 * @see #getVLNV()
	 * @generated
	 */
	EAttribute getVLNV_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link model.VLNV#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see model.VLNV#getLibrary()
	 * @see #getVLNV()
	 * @generated
	 */
	EAttribute getVLNV_Library();

	/**
	 * Returns the meta object for the attribute '{@link model.VLNV#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.VLNV#getName()
	 * @see #getVLNV()
	 * @generated
	 */
	EAttribute getVLNV_Name();

	/**
	 * Returns the meta object for the attribute '{@link model.VLNV#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see model.VLNV#getVersion()
	 * @see #getVLNV()
	 * @generated
	 */
	EAttribute getVLNV_Version();

	/**
	 * Returns the meta object for class '{@link model.Void <em>Void</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void</em>'.
	 * @see model.Void
	 * @generated
	 */
	EClass getVoid();

	/**
	 * Returns the meta object for class '{@link model.WirePort <em>Wire Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire Port</em>'.
	 * @see model.WirePort
	 * @generated
	 */
	EClass getWirePort();

	/**
	 * Returns the meta object for the containment reference '{@link model.WirePort#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see model.WirePort#getDataType()
	 * @see #getWirePort()
	 * @generated
	 */
	EReference getWirePort_DataType();

	/**
	 * Returns the meta object for class '{@link model.WireSignal <em>Wire Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire Signal</em>'.
	 * @see model.WireSignal
	 * @generated
	 */
	EClass getWireSignal();

	/**
	 * Returns the meta object for the containment reference '{@link model.WireSignal#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see model.WireSignal#getDataType()
	 * @see #getWireSignal()
	 * @generated
	 */
	EReference getWireSignal_DataType();

	/**
	 * Returns the meta object for class '{@link model.XRef <em>XRef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef</em>'.
	 * @see model.XRef
	 * @generated
	 */
	EClass getXRef();

	/**
	 * Returns the meta object for the attribute '{@link model.XRef#getXRefTargetID <em>XRef Target ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XRef Target ID</em>'.
	 * @see model.XRef#getXRefTargetID()
	 * @see #getXRef()
	 * @generated
	 */
	EAttribute getXRef_XRefTargetID();

	/**
	 * Returns the meta object for the reference '{@link model.XRef#getXRefTarget <em>XRef Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>XRef Target</em>'.
	 * @see model.XRef#getXRefTarget()
	 * @see #getXRef()
	 * @generated
	 */
	EReference getXRef_XRefTarget();

	/**
	 * Returns the meta object for class '{@link model.XRefConnection <em>XRef Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Connection</em>'.
	 * @see model.XRefConnection
	 * @generated
	 */
	EClass getXRefConnection();

	/**
	 * Returns the meta object for class '{@link model.XRefDataVar <em>XRef Data Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Data Var</em>'.
	 * @see model.XRefDataVar
	 * @generated
	 */
	EClass getXRefDataVar();

	/**
	 * Returns the meta object for class '{@link model.XRefDirect <em>XRef Direct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Direct</em>'.
	 * @see model.XRefDirect
	 * @generated
	 */
	EClass getXRefDirect();

	/**
	 * Returns the meta object for class '{@link model.XRefExternal <em>XRef External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef External</em>'.
	 * @see model.XRefExternal
	 * @generated
	 */
	EClass getXRefExternal();

	/**
	 * Returns the meta object for class '{@link model.XRefExternalInterface <em>XRef External Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef External Interface</em>'.
	 * @see model.XRefExternalInterface
	 * @generated
	 */
	EClass getXRefExternalInterface();

	/**
	 * Returns the meta object for class '{@link model.XRefExternalPort <em>XRef External Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef External Port</em>'.
	 * @see model.XRefExternalPort
	 * @generated
	 */
	EClass getXRefExternalPort();

	/**
	 * Returns the meta object for the containment reference '{@link model.XRefExternalPort#getSubElementAccess <em>Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Element Access</em>'.
	 * @see model.XRefExternalPort#getSubElementAccess()
	 * @see #getXRefExternalPort()
	 * @generated
	 */
	EReference getXRefExternalPort_SubElementAccess();

	/**
	 * Returns the meta object for class '{@link model.XRefExternalSignal <em>XRef External Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef External Signal</em>'.
	 * @see model.XRefExternalSignal
	 * @generated
	 */
	EClass getXRefExternalSignal();

	/**
	 * Returns the meta object for the containment reference '{@link model.XRefExternalSignal#getSubElementAccess <em>Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Element Access</em>'.
	 * @see model.XRefExternalSignal#getSubElementAccess()
	 * @see #getXRefExternalSignal()
	 * @generated
	 */
	EReference getXRefExternalSignal_SubElementAccess();

	/**
	 * Returns the meta object for class '{@link model.XRefGenericDecl <em>XRef Generic Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Generic Decl</em>'.
	 * @see model.XRefGenericDecl
	 * @generated
	 */
	EClass getXRefGenericDecl();

	/**
	 * Returns the meta object for class '{@link model.XRefIFDPort <em>XRef IFD Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef IFD Port</em>'.
	 * @see model.XRefIFDPort
	 * @generated
	 */
	EClass getXRefIFDPort();

	/**
	 * Returns the meta object for the containment reference '{@link model.XRefIFDPort#getSubElementAccess <em>Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Element Access</em>'.
	 * @see model.XRefIFDPort#getSubElementAccess()
	 * @see #getXRefIFDPort()
	 * @generated
	 */
	EReference getXRefIFDPort_SubElementAccess();

	/**
	 * Returns the meta object for class '{@link model.XRefIndInterface <em>XRef Ind Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Ind Interface</em>'.
	 * @see model.XRefIndInterface
	 * @generated
	 */
	EClass getXRefIndInterface();

	/**
	 * Returns the meta object for class '{@link model.XRefIndirect <em>XRef Indirect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Indirect</em>'.
	 * @see model.XRefIndirect
	 * @generated
	 */
	EClass getXRefIndirect();

	/**
	 * Returns the meta object for class '{@link model.XRefIndPin <em>XRef Ind Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Ind Pin</em>'.
	 * @see model.XRefIndPin
	 * @generated
	 */
	EClass getXRefIndPin();

	/**
	 * Returns the meta object for class '{@link model.XRefIndPort <em>XRef Ind Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Ind Port</em>'.
	 * @see model.XRefIndPort
	 * @generated
	 */
	EClass getXRefIndPort();

	/**
	 * Returns the meta object for the containment reference '{@link model.XRefIndPort#getSubElementAccess <em>Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Element Access</em>'.
	 * @see model.XRefIndPort#getSubElementAccess()
	 * @see #getXRefIndPort()
	 * @generated
	 */
	EReference getXRefIndPort_SubElementAccess();

	/**
	 * Returns the meta object for class '{@link model.XRefIndSinglePad <em>XRef Ind Single Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Ind Single Pad</em>'.
	 * @see model.XRefIndSinglePad
	 * @generated
	 */
	EClass getXRefIndSinglePad();

	/**
	 * Returns the meta object for class '{@link model.XRefInstance <em>XRef Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Instance</em>'.
	 * @see model.XRefInstance
	 * @generated
	 */
	EClass getXRefInstance();

	/**
	 * Returns the meta object for class '{@link model.XRefInternal <em>XRef Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Internal</em>'.
	 * @see model.XRefInternal
	 * @generated
	 */
	EClass getXRefInternal();

	/**
	 * Returns the meta object for class '{@link model.XRefInternalInterface <em>XRef Internal Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Internal Interface</em>'.
	 * @see model.XRefInternalInterface
	 * @generated
	 */
	EClass getXRefInternalInterface();

	/**
	 * Returns the meta object for class '{@link model.XRefInternalPort <em>XRef Internal Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Internal Port</em>'.
	 * @see model.XRefInternalPort
	 * @generated
	 */
	EClass getXRefInternalPort();

	/**
	 * Returns the meta object for the containment reference '{@link model.XRefInternalPort#getSubElementAccess <em>Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Element Access</em>'.
	 * @see model.XRefInternalPort#getSubElementAccess()
	 * @see #getXRefInternalPort()
	 * @generated
	 */
	EReference getXRefInternalPort_SubElementAccess();

	/**
	 * Returns the meta object for class '{@link model.XRefInternalSignal <em>XRef Internal Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Internal Signal</em>'.
	 * @see model.XRefInternalSignal
	 * @generated
	 */
	EClass getXRefInternalSignal();

	/**
	 * Returns the meta object for the containment reference '{@link model.XRefInternalSignal#getSubElementAccess <em>Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Element Access</em>'.
	 * @see model.XRefInternalSignal#getSubElementAccess()
	 * @see #getXRefInternalSignal()
	 * @generated
	 */
	EReference getXRefInternalSignal_SubElementAccess();

	/**
	 * Returns the meta object for class '{@link model.XRefMasterInterface <em>XRef Master Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Master Interface</em>'.
	 * @see model.XRefMasterInterface
	 * @generated
	 */
	EClass getXRefMasterInterface();

	/**
	 * Returns the meta object for the attribute '{@link model.XRefMasterInterface#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see model.XRefMasterInterface#getRange()
	 * @see #getXRefMasterInterface()
	 * @generated
	 */
	EAttribute getXRefMasterInterface_Range();

	/**
	 * Returns the meta object for the attribute '{@link model.XRefMasterInterface#getSrcOffset <em>Src Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src Offset</em>'.
	 * @see model.XRefMasterInterface#getSrcOffset()
	 * @see #getXRefMasterInterface()
	 * @generated
	 */
	EAttribute getXRefMasterInterface_SrcOffset();

	/**
	 * Returns the meta object for the attribute '{@link model.XRefMasterInterface#getTgtOffset <em>Tgt Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tgt Offset</em>'.
	 * @see model.XRefMasterInterface#getTgtOffset()
	 * @see #getXRefMasterInterface()
	 * @generated
	 */
	EAttribute getXRefMasterInterface_TgtOffset();

	/**
	 * Returns the meta object for class '{@link model.XRefNet <em>XRef Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Net</em>'.
	 * @see model.XRefNet
	 * @generated
	 */
	EClass getXRefNet();

	/**
	 * Returns the meta object for class '{@link model.XRefNoneInterface <em>XRef None Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef None Interface</em>'.
	 * @see model.XRefNoneInterface
	 * @generated
	 */
	EClass getXRefNoneInterface();

	/**
	 * Returns the meta object for class '{@link model.XRefPadType <em>XRef Pad Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Pad Type</em>'.
	 * @see model.XRefPadType
	 * @generated
	 */
	EClass getXRefPadType();

	/**
	 * Returns the meta object for class '{@link model.XRefParamDecl <em>XRef Param Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Param Decl</em>'.
	 * @see model.XRefParamDecl
	 * @generated
	 */
	EClass getXRefParamDecl();

	/**
	 * Returns the meta object for class '{@link model.XRefPin <em>XRef Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Pin</em>'.
	 * @see model.XRefPin
	 * @generated
	 */
	EClass getXRefPin();

	/**
	 * Returns the meta object for class '{@link model.XRefPowerDomain <em>XRef Power Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Power Domain</em>'.
	 * @see model.XRefPowerDomain
	 * @generated
	 */
	EClass getXRefPowerDomain();

	/**
	 * Returns the meta object for class '{@link model.XRefRealPort <em>XRef Real Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Real Port</em>'.
	 * @see model.XRefRealPort
	 * @generated
	 */
	EClass getXRefRealPort();

	/**
	 * Returns the meta object for the containment reference '{@link model.XRefRealPort#getSubElementAccess <em>Sub Element Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Element Access</em>'.
	 * @see model.XRefRealPort#getSubElementAccess()
	 * @see #getXRefRealPort()
	 * @generated
	 */
	EReference getXRefRealPort_SubElementAccess();

	/**
	 * Returns the meta object for class '{@link model.XRefRegisterView <em>XRef Register View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Register View</em>'.
	 * @see model.XRefRegisterView
	 * @generated
	 */
	EClass getXRefRegisterView();

	/**
	 * Returns the meta object for class '{@link model.XRefRegMemSet <em>XRef Reg Mem Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Reg Mem Set</em>'.
	 * @see model.XRefRegMemSet
	 * @generated
	 */
	EClass getXRefRegMemSet();

	/**
	 * Returns the meta object for the attribute '{@link model.XRefRegMemSet#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see model.XRefRegMemSet#getOffset()
	 * @see #getXRefRegMemSet()
	 * @generated
	 */
	EAttribute getXRefRegMemSet_Offset();

	/**
	 * Returns the meta object for the containment reference list '{@link model.XRefRegMemSet#getAccessCondition <em>Access Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Condition</em>'.
	 * @see model.XRefRegMemSet#getAccessCondition()
	 * @see #getXRefRegMemSet()
	 * @generated
	 */
	EReference getXRefRegMemSet_AccessCondition();

	/**
	 * Returns the meta object for class '{@link model.XRefSinglePad <em>XRef Single Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Single Pad</em>'.
	 * @see model.XRefSinglePad
	 * @generated
	 */
	EClass getXRefSinglePad();

	/**
	 * Returns the meta object for class '{@link model.XRefSiPort <em>XRef Si Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Si Port</em>'.
	 * @see model.XRefSiPort
	 * @generated
	 */
	EClass getXRefSiPort();

	/**
	 * Returns the meta object for class '{@link model.XRefSiSignal <em>XRef Si Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Si Signal</em>'.
	 * @see model.XRefSiSignal
	 * @generated
	 */
	EClass getXRefSiSignal();

	/**
	 * Returns the meta object for class '{@link model.XRefSlaveInterface <em>XRef Slave Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Slave Interface</em>'.
	 * @see model.XRefSlaveInterface
	 * @generated
	 */
	EClass getXRefSlaveInterface();

	/**
	 * Returns the meta object for the attribute '{@link model.XRefSlaveInterface#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see model.XRefSlaveInterface#getRange()
	 * @see #getXRefSlaveInterface()
	 * @generated
	 */
	EAttribute getXRefSlaveInterface_Range();

	/**
	 * Returns the meta object for the attribute '{@link model.XRefSlaveInterface#getSrcOffset <em>Src Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src Offset</em>'.
	 * @see model.XRefSlaveInterface#getSrcOffset()
	 * @see #getXRefSlaveInterface()
	 * @generated
	 */
	EAttribute getXRefSlaveInterface_SrcOffset();

	/**
	 * Returns the meta object for the attribute '{@link model.XRefSlaveInterface#getTgtOffset <em>Tgt Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tgt Offset</em>'.
	 * @see model.XRefSlaveInterface#getTgtOffset()
	 * @see #getXRefSlaveInterface()
	 * @generated
	 */
	EAttribute getXRefSlaveInterface_TgtOffset();

	/**
	 * Returns the meta object for the containment reference '{@link model.XRefSlaveInterface#getXRefInstance <em>XRef Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XRef Instance</em>'.
	 * @see model.XRefSlaveInterface#getXRefInstance()
	 * @see #getXRefSlaveInterface()
	 * @generated
	 */
	EReference getXRefSlaveInterface_XRefInstance();

	/**
	 * Returns the meta object for class '{@link model.XRefTest <em>XRef Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef Test</em>'.
	 * @see model.XRefTest
	 * @generated
	 */
	EClass getXRefTest();

	/**
	 * Returns the meta object for class '{@link model.XRefVLNV <em>XRef VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRef VLNV</em>'.
	 * @see model.XRefVLNV
	 * @generated
	 */
	EClass getXRefVLNV();

	/**
	 * Returns the meta object for the containment reference '{@link model.XRefVLNV#getExtVLNV <em>Ext VLNV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ext VLNV</em>'.
	 * @see model.XRefVLNV#getExtVLNV()
	 * @see #getXRefVLNV()
	 * @generated
	 */
	EReference getXRefVLNV_ExtVLNV();

	/**
	 * Returns the meta object for enum '{@link model.AccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Type</em>'.
	 * @see model.AccessType
	 * @generated
	 */
	EEnum getAccessType();

	/**
	 * Returns the meta object for enum '{@link model.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see model.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for enum '{@link model.BehaviorType <em>Behavior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Behavior Type</em>'.
	 * @see model.BehaviorType
	 * @generated
	 */
	EEnum getBehaviorType();

	/**
	 * Returns the meta object for enum '{@link model.BusErrorType <em>Bus Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bus Error Type</em>'.
	 * @see model.BusErrorType
	 * @generated
	 */
	EEnum getBusErrorType();

	/**
	 * Returns the meta object for enum '{@link model.EndianType <em>Endian Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Endian Type</em>'.
	 * @see model.EndianType
	 * @generated
	 */
	EEnum getEndianType();

	/**
	 * Returns the meta object for enum '{@link model.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Type</em>'.
	 * @see model.FunctionType
	 * @generated
	 */
	EEnum getFunctionType();

	/**
	 * Returns the meta object for enum '{@link model.InterfaceDefRoleType <em>Interface Def Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interface Def Role Type</em>'.
	 * @see model.InterfaceDefRoleType
	 * @generated
	 */
	EEnum getInterfaceDefRoleType();

	/**
	 * Returns the meta object for enum '{@link model.InterfaceRoleType <em>Interface Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interface Role Type</em>'.
	 * @see model.InterfaceRoleType
	 * @generated
	 */
	EEnum getInterfaceRoleType();

	/**
	 * Returns the meta object for enum '{@link model.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Type</em>'.
	 * @see model.MessageType
	 * @generated
	 */
	EEnum getMessageType();

	/**
	 * Returns the meta object for enum '{@link model.PortDirection <em>Port Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Direction</em>'.
	 * @see model.PortDirection
	 * @generated
	 */
	EEnum getPortDirection();

	/**
	 * Returns the meta object for enum '{@link model.PortInitiative <em>Port Initiative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Initiative</em>'.
	 * @see model.PortInitiative
	 * @generated
	 */
	EEnum getPortInitiative();

	/**
	 * Returns the meta object for enum '{@link model.ReservedType <em>Reserved Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reserved Type</em>'.
	 * @see model.ReservedType
	 * @generated
	 */
	EEnum getReservedType();

	/**
	 * Returns the meta object for enum '{@link model.SignType <em>Sign Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sign Type</em>'.
	 * @see model.SignType
	 * @generated
	 */
	EEnum getSignType();

	/**
	 * Returns the meta object for enum '{@link model.SpecialType <em>Special Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Special Type</em>'.
	 * @see model.SpecialType
	 * @generated
	 */
	EEnum getSpecialType();

	/**
	 * Returns the meta object for enum '{@link model.StrobeType <em>Strobe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Strobe Type</em>'.
	 * @see model.StrobeType
	 * @generated
	 */
	EEnum getStrobeType();

	/**
	 * Returns the meta object for enum '{@link model.SyncMode <em>Sync Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sync Mode</em>'.
	 * @see model.SyncMode
	 * @generated
	 */
	EEnum getSyncMode();

	/**
	 * Returns the meta object for enum '{@link model.TopSpinType <em>Top Spin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Top Spin Type</em>'.
	 * @see model.TopSpinType
	 * @generated
	 */
	EEnum getTopSpinType();

	/**
	 * Returns the meta object for enum '{@link model.VirtualType <em>Virtual Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Virtual Type</em>'.
	 * @see model.VirtualType
	 * @generated
	 */
	EEnum getVirtualType();

	/**
	 * Returns the meta object for data type '{@link model.AccessType <em>Access Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Access Type Object</em>'.
	 * @see model.AccessType
	 * @model instanceClass="model.AccessType"
	 *        extendedMetaData="name='AccessType:Object' baseType='AccessType'"
	 * @generated
	 */
	EDataType getAccessTypeObject();

	/**
	 * Returns the meta object for data type '{@link model.ActionType <em>Action Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Action Type Object</em>'.
	 * @see model.ActionType
	 * @model instanceClass="model.ActionType"
	 *        extendedMetaData="name='ActionType:Object' baseType='ActionType'"
	 * @generated
	 */
	EDataType getActionTypeObject();

	/**
	 * Returns the meta object for data type '{@link model.BehaviorType <em>Behavior Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Behavior Type Object</em>'.
	 * @see model.BehaviorType
	 * @model instanceClass="model.BehaviorType"
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
	 * Returns the meta object for data type '{@link model.BusErrorType <em>Bus Error Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bus Error Type Object</em>'.
	 * @see model.BusErrorType
	 * @model instanceClass="model.BusErrorType"
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
	 * Returns the meta object for data type '{@link model.EndianType <em>Endian Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Endian Type Object</em>'.
	 * @see model.EndianType
	 * @model instanceClass="model.EndianType"
	 *        extendedMetaData="name='EndianType:Object' baseType='EndianType'"
	 * @generated
	 */
	EDataType getEndianTypeObject();

	/**
	 * Returns the meta object for data type '{@link model.FunctionType <em>Function Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Function Type Object</em>'.
	 * @see model.FunctionType
	 * @model instanceClass="model.FunctionType"
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
	 * Returns the meta object for data type '{@link model.InterfaceDefRoleType <em>Interface Def Role Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Interface Def Role Type Object</em>'.
	 * @see model.InterfaceDefRoleType
	 * @model instanceClass="model.InterfaceDefRoleType"
	 *        extendedMetaData="name='InterfaceDefRoleType:Object' baseType='InterfaceDefRoleType'"
	 * @generated
	 */
	EDataType getInterfaceDefRoleTypeObject();

	/**
	 * Returns the meta object for data type '{@link model.InterfaceRoleType <em>Interface Role Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Interface Role Type Object</em>'.
	 * @see model.InterfaceRoleType
	 * @model instanceClass="model.InterfaceRoleType"
	 *        extendedMetaData="name='InterfaceRoleType:Object' baseType='InterfaceRoleType'"
	 * @generated
	 */
	EDataType getInterfaceRoleTypeObject();

	/**
	 * Returns the meta object for data type '{@link model.MessageType <em>Message Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Message Type Object</em>'.
	 * @see model.MessageType
	 * @model instanceClass="model.MessageType"
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
	 * Returns the meta object for data type '{@link model.PortDirection <em>Port Direction Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Port Direction Object</em>'.
	 * @see model.PortDirection
	 * @model instanceClass="model.PortDirection"
	 *        extendedMetaData="name='PortDirection:Object' baseType='PortDirection'"
	 * @generated
	 */
	EDataType getPortDirectionObject();

	/**
	 * Returns the meta object for data type '{@link model.PortInitiative <em>Port Initiative Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Port Initiative Object</em>'.
	 * @see model.PortInitiative
	 * @model instanceClass="model.PortInitiative"
	 *        extendedMetaData="name='PortInitiative:Object' baseType='PortInitiative'"
	 * @generated
	 */
	EDataType getPortInitiativeObject();

	/**
	 * Returns the meta object for data type '{@link model.ReservedType <em>Reserved Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reserved Type Object</em>'.
	 * @see model.ReservedType
	 * @model instanceClass="model.ReservedType"
	 *        extendedMetaData="name='ReservedType:Object' baseType='ReservedType'"
	 * @generated
	 */
	EDataType getReservedTypeObject();

	/**
	 * Returns the meta object for data type '{@link model.SignType <em>Sign Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sign Type Object</em>'.
	 * @see model.SignType
	 * @model instanceClass="model.SignType"
	 *        extendedMetaData="name='SignType:Object' baseType='SignType'"
	 * @generated
	 */
	EDataType getSignTypeObject();

	/**
	 * Returns the meta object for data type '{@link model.SpecialType <em>Special Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Special Type Object</em>'.
	 * @see model.SpecialType
	 * @model instanceClass="model.SpecialType"
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
	 * Returns the meta object for data type '{@link model.StrobeType <em>Strobe Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Strobe Type Object</em>'.
	 * @see model.StrobeType
	 * @model instanceClass="model.StrobeType"
	 *        extendedMetaData="name='StrobeType:Object' baseType='StrobeType'"
	 * @generated
	 */
	EDataType getStrobeTypeObject();

	/**
	 * Returns the meta object for data type '{@link model.SyncMode <em>Sync Mode Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sync Mode Object</em>'.
	 * @see model.SyncMode
	 * @model instanceClass="model.SyncMode"
	 *        extendedMetaData="name='SyncMode:Object' baseType='SyncMode'"
	 * @generated
	 */
	EDataType getSyncModeObject();

	/**
	 * Returns the meta object for data type '{@link model.TopSpinType <em>Top Spin Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Top Spin Type Object</em>'.
	 * @see model.TopSpinType
	 * @model instanceClass="model.TopSpinType"
	 *        extendedMetaData="name='TopSpinType:Object' baseType='TopSpinType'"
	 * @generated
	 */
	EDataType getTopSpinTypeObject();

	/**
	 * Returns the meta object for data type '{@link model.VirtualType <em>Virtual Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Virtual Type Object</em>'.
	 * @see model.VirtualType
	 * @model instanceClass="model.VirtualType"
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
	ModelFactory getModelFactory();

} //ModelPackage
