/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Interface#getAddressUnit <em>Address Unit</em>}</li>
 *   <li>{@link model.Interface#getDataUnit <em>Data Unit</em>}</li>
 *   <li>{@link model.Interface#getBaseAddress <em>Base Address</em>}</li>
 *   <li>{@link model.Interface#getExtVLNV <em>Ext VLNV</em>}</li>
 *   <li>{@link model.Interface#getRange <em>Range</em>}</li>
 *   <li>{@link model.Interface#getRole <em>Role</em>}</li>
 *   <li>{@link model.Interface#getSystemGroup <em>System Group</em>}</li>
 *   <li>{@link model.Interface#getAddressBlock <em>Address Block</em>}</li>
 *   <li>{@link model.Interface#getExtVLNVName <em>Ext VLNV Name</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getInterface()
 * @model extendedMetaData="name='Interface' kind='elementOnly'"
 * @generated
 */
public interface Interface extends GeneralInterface {
	/**
	 * Returns the value of the '<em><b>Address Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 8
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Unit</em>' attribute.
	 * @see #isSetAddressUnit()
	 * @see #unsetAddressUnit()
	 * @see #setAddressUnit(String)
	 * @see model.ModelPackage#getInterface_AddressUnit()
	 * @model unsettable="true" dataType="model.IntegerExpr"
	 *        extendedMetaData="kind='element' name='AddressUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddressUnit();

	/**
	 * Sets the value of the '{@link model.Interface#getAddressUnit <em>Address Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Unit</em>' attribute.
	 * @see #isSetAddressUnit()
	 * @see #unsetAddressUnit()
	 * @see #getAddressUnit()
	 * @generated
	 */
	void setAddressUnit(String value);

	/**
	 * Unsets the value of the '{@link model.Interface#getAddressUnit <em>Address Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAddressUnit()
	 * @see #getAddressUnit()
	 * @see #setAddressUnit(String)
	 * @generated
	 */
	void unsetAddressUnit();

	/**
	 * Returns whether the value of the '{@link model.Interface#getAddressUnit <em>Address Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Address Unit</em>' attribute is set.
	 * @see #unsetAddressUnit()
	 * @see #getAddressUnit()
	 * @see #setAddressUnit(String)
	 * @generated
	 */
	boolean isSetAddressUnit();

	/**
	 * Returns the value of the '<em><b>Data Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 8
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Unit</em>' attribute.
	 * @see #isSetDataUnit()
	 * @see #unsetDataUnit()
	 * @see #setDataUnit(String)
	 * @see model.ModelPackage#getInterface_DataUnit()
	 * @model unsettable="true" dataType="model.IntegerExpr"
	 *        extendedMetaData="kind='element' name='DataUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDataUnit();

	/**
	 * Sets the value of the '{@link model.Interface#getDataUnit <em>Data Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Unit</em>' attribute.
	 * @see #isSetDataUnit()
	 * @see #unsetDataUnit()
	 * @see #getDataUnit()
	 * @generated
	 */
	void setDataUnit(String value);

	/**
	 * Unsets the value of the '{@link model.Interface#getDataUnit <em>Data Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataUnit()
	 * @see #getDataUnit()
	 * @see #setDataUnit(String)
	 * @generated
	 */
	void unsetDataUnit();

	/**
	 * Returns whether the value of the '{@link model.Interface#getDataUnit <em>Data Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Unit</em>' attribute is set.
	 * @see #unsetDataUnit()
	 * @see #getDataUnit()
	 * @see #setDataUnit(String)
	 * @generated
	 */
	boolean isSetDataUnit();

	/**
	 * Returns the value of the '<em><b>Base Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Address</em>' attribute.
	 * @see #isSetBaseAddress()
	 * @see #unsetBaseAddress()
	 * @see #setBaseAddress(String)
	 * @see model.ModelPackage#getInterface_BaseAddress()
	 * @model unsettable="true" dataType="model.IntegerExpr"
	 *        extendedMetaData="kind='element' name='BaseAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBaseAddress();

	/**
	 * Sets the value of the '{@link model.Interface#getBaseAddress <em>Base Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Address</em>' attribute.
	 * @see #isSetBaseAddress()
	 * @see #unsetBaseAddress()
	 * @see #getBaseAddress()
	 * @generated
	 */
	void setBaseAddress(String value);

	/**
	 * Unsets the value of the '{@link model.Interface#getBaseAddress <em>Base Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBaseAddress()
	 * @see #getBaseAddress()
	 * @see #setBaseAddress(String)
	 * @generated
	 */
	void unsetBaseAddress();

	/**
	 * Returns whether the value of the '{@link model.Interface#getBaseAddress <em>Base Address</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Base Address</em>' attribute is set.
	 * @see #unsetBaseAddress()
	 * @see #getBaseAddress()
	 * @see #setBaseAddress(String)
	 * @generated
	 */
	boolean isSetBaseAddress();

	/**
	 * Returns the value of the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext VLNV</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext VLNV</em>' containment reference.
	 * @see #setExtVLNV(VLNV)
	 * @see model.ModelPackage#getInterface_ExtVLNV()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExtVLNV' namespace='##targetNamespace'"
	 * @generated
	 */
	VLNV getExtVLNV();

	/**
	 * Sets the value of the '{@link model.Interface#getExtVLNV <em>Ext VLNV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext VLNV</em>' containment reference.
	 * @see #getExtVLNV()
	 * @generated
	 */
	void setExtVLNV(VLNV value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #isSetRange()
	 * @see #unsetRange()
	 * @see #setRange(String)
	 * @see model.ModelPackage#getInterface_Range()
	 * @model unsettable="true" dataType="model.IntegerExpr"
	 *        extendedMetaData="kind='element' name='Range' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRange();

	/**
	 * Sets the value of the '{@link model.Interface#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #isSetRange()
	 * @see #unsetRange()
	 * @see #getRange()
	 * @generated
	 */
	void setRange(String value);

	/**
	 * Unsets the value of the '{@link model.Interface#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRange()
	 * @see #getRange()
	 * @see #setRange(String)
	 * @generated
	 */
	void unsetRange();

	/**
	 * Returns whether the value of the '{@link model.Interface#getRange <em>Range</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Range</em>' attribute is set.
	 * @see #unsetRange()
	 * @see #getRange()
	 * @see #setRange(String)
	 * @generated
	 */
	boolean isSetRange();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The default value is <code>"Master"</code>.
	 * The literals are from the enumeration {@link model.InterfaceRoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see model.InterfaceRoleType
	 * @see #setRole(InterfaceRoleType)
	 * @see model.ModelPackage#getInterface_Role()
	 * @model default="Master" required="true"
	 *        extendedMetaData="kind='element' name='Role' namespace='##targetNamespace'"
	 * @generated
	 */
	InterfaceRoleType getRole();

	/**
	 * Sets the value of the '{@link model.Interface#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see model.InterfaceRoleType
	 * @see #getRole()
	 * @generated
	 */
	void setRole(InterfaceRoleType value);

	/**
	 * Returns the value of the '<em><b>System Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Group</em>' attribute.
	 * @see #isSetSystemGroup()
	 * @see #unsetSystemGroup()
	 * @see #setSystemGroup(String)
	 * @see model.ModelPackage#getInterface_SystemGroup()
	 * @model unsettable="true" dataType="model.StringLiteral"
	 *        extendedMetaData="kind='element' name='SystemGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSystemGroup();

	/**
	 * Sets the value of the '{@link model.Interface#getSystemGroup <em>System Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Group</em>' attribute.
	 * @see #isSetSystemGroup()
	 * @see #unsetSystemGroup()
	 * @see #getSystemGroup()
	 * @generated
	 */
	void setSystemGroup(String value);

	/**
	 * Unsets the value of the '{@link model.Interface#getSystemGroup <em>System Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSystemGroup()
	 * @see #getSystemGroup()
	 * @see #setSystemGroup(String)
	 * @generated
	 */
	void unsetSystemGroup();

	/**
	 * Returns whether the value of the '{@link model.Interface#getSystemGroup <em>System Group</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>System Group</em>' attribute is set.
	 * @see #unsetSystemGroup()
	 * @see #getSystemGroup()
	 * @see #setSystemGroup(String)
	 * @generated
	 */
	boolean isSetSystemGroup();

	/**
	 * Returns the value of the '<em><b>Address Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Block</em>' containment reference.
	 * @see #setAddressBlock(AddressBlock)
	 * @see model.ModelPackage#getInterface_AddressBlock()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressBlock' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressBlock getAddressBlock();

	/**
	 * Sets the value of the '{@link model.Interface#getAddressBlock <em>Address Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Block</em>' containment reference.
	 * @see #getAddressBlock()
	 * @generated
	 */
	void setAddressBlock(AddressBlock value);

	/**
	 * Returns the value of the '<em><b>Ext VLNV Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext VLNV Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext VLNV Name</em>' attribute.
	 * @see model.ModelPackage#getInterface_ExtVLNVName()
	 * @model unique="false" dataType="model.StringLiteral" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='if (this.getExtVLNV() != null &&\n     this.getExtVLNV().getName() != null &&\n    !(this.getExtVLNV().getName().equals(\"\"))) {\n\treturn this.getExtVLNV().getName();\n}\nreturn \"<UNSET>\";'"
	 * @generated
	 */
	String getExtVLNVName();

} // Interface
