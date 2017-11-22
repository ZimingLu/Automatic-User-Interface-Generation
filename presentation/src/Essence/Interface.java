/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.Interface#getAddressUnit <em>Address Unit</em>}</li>
 *   <li>{@link Essence.Interface#getDataUnit <em>Data Unit</em>}</li>
 *   <li>{@link Essence.Interface#getBaseAddress <em>Base Address</em>}</li>
 *   <li>{@link Essence.Interface#getExtVLNV <em>Ext VLNV</em>}</li>
 *   <li>{@link Essence.Interface#getRange <em>Range</em>}</li>
 *   <li>{@link Essence.Interface#getRole <em>Role</em>}</li>
 *   <li>{@link Essence.Interface#getSystemGroup <em>System Group</em>}</li>
 *   <li>{@link Essence.Interface#getAddressBlock <em>Address Block</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getInterface()
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
	 * @see #setAddressUnit(String)
	 * @see Essence.EssencePackage#getInterface_AddressUnit()
	 * @model dataType="Essence.IntegerExpr"
	 *        extendedMetaData="kind='element' name='AddressUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddressUnit();

	/**
	 * Sets the value of the '{@link Essence.Interface#getAddressUnit <em>Address Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Unit</em>' attribute.
	 * @see #getAddressUnit()
	 * @generated
	 */
	void setAddressUnit(String value);

	/**
	 * Returns the value of the '<em><b>Data Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 8
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Unit</em>' attribute.
	 * @see #setDataUnit(String)
	 * @see Essence.EssencePackage#getInterface_DataUnit()
	 * @model dataType="Essence.IntegerExpr"
	 *        extendedMetaData="kind='element' name='DataUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDataUnit();

	/**
	 * Sets the value of the '{@link Essence.Interface#getDataUnit <em>Data Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Unit</em>' attribute.
	 * @see #getDataUnit()
	 * @generated
	 */
	void setDataUnit(String value);

	/**
	 * Returns the value of the '<em><b>Base Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Address</em>' attribute.
	 * @see #setBaseAddress(String)
	 * @see Essence.EssencePackage#getInterface_BaseAddress()
	 * @model dataType="Essence.IntegerExpr"
	 *        extendedMetaData="kind='element' name='BaseAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBaseAddress();

	/**
	 * Sets the value of the '{@link Essence.Interface#getBaseAddress <em>Base Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Address</em>' attribute.
	 * @see #getBaseAddress()
	 * @generated
	 */
	void setBaseAddress(String value);

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
	 * @see Essence.EssencePackage#getInterface_ExtVLNV()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExtVLNV' namespace='##targetNamespace'"
	 * @generated
	 */
	VLNV getExtVLNV();

	/**
	 * Sets the value of the '{@link Essence.Interface#getExtVLNV <em>Ext VLNV</em>}' containment reference.
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
	 * @see #setRange(String)
	 * @see Essence.EssencePackage#getInterface_Range()
	 * @model dataType="Essence.IntegerExpr"
	 *        extendedMetaData="kind='element' name='Range' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRange();

	/**
	 * Sets the value of the '{@link Essence.Interface#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link Essence.InterfaceRoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see Essence.InterfaceRoleType
	 * @see #isSetRole()
	 * @see #unsetRole()
	 * @see #setRole(InterfaceRoleType)
	 * @see Essence.EssencePackage#getInterface_Role()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Role' namespace='##targetNamespace'"
	 * @generated
	 */
	InterfaceRoleType getRole();

	/**
	 * Sets the value of the '{@link Essence.Interface#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see Essence.InterfaceRoleType
	 * @see #isSetRole()
	 * @see #unsetRole()
	 * @see #getRole()
	 * @generated
	 */
	void setRole(InterfaceRoleType value);

	/**
	 * Unsets the value of the '{@link Essence.Interface#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRole()
	 * @see #getRole()
	 * @see #setRole(InterfaceRoleType)
	 * @generated
	 */
	void unsetRole();

	/**
	 * Returns whether the value of the '{@link Essence.Interface#getRole <em>Role</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Role</em>' attribute is set.
	 * @see #unsetRole()
	 * @see #getRole()
	 * @see #setRole(InterfaceRoleType)
	 * @generated
	 */
	boolean isSetRole();

	/**
	 * Returns the value of the '<em><b>System Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Group</em>' attribute.
	 * @see #setSystemGroup(String)
	 * @see Essence.EssencePackage#getInterface_SystemGroup()
	 * @model dataType="Essence.StringLiteral"
	 *        extendedMetaData="kind='element' name='SystemGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSystemGroup();

	/**
	 * Sets the value of the '{@link Essence.Interface#getSystemGroup <em>System Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Group</em>' attribute.
	 * @see #getSystemGroup()
	 * @generated
	 */
	void setSystemGroup(String value);

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
	 * @see Essence.EssencePackage#getInterface_AddressBlock()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressBlock' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressBlock getAddressBlock();

	/**
	 * Sets the value of the '{@link Essence.Interface#getAddressBlock <em>Address Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Block</em>' containment reference.
	 * @see #getAddressBlock()
	 * @generated
	 */
	void setAddressBlock(AddressBlock value);

} // Interface
