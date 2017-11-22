/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.InterfaceDefinition#getAddressUnit <em>Address Unit</em>}</li>
 *   <li>{@link Essence.InterfaceDefinition#getDataUnit <em>Data Unit</em>}</li>
 *   <li>{@link Essence.InterfaceDefinition#getExtVLNV <em>Ext VLNV</em>}</li>
 *   <li>{@link Essence.InterfaceDefinition#getInterfaceDefView <em>Interface Def View</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getInterfaceDefinition()
 * @model extendedMetaData="name='InterfaceDefinition' kind='elementOnly'"
 * @generated
 */
public interface InterfaceDefinition extends ModelRoot {
	/**
	 * Returns the value of the '<em><b>Address Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 8
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Unit</em>' attribute.
	 * @see #setAddressUnit(String)
	 * @see Essence.EssencePackage#getInterfaceDefinition_AddressUnit()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='AddressUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddressUnit();

	/**
	 * Sets the value of the '{@link Essence.InterfaceDefinition#getAddressUnit <em>Address Unit</em>}' attribute.
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
	 * @see Essence.EssencePackage#getInterfaceDefinition_DataUnit()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='DataUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDataUnit();

	/**
	 * Sets the value of the '{@link Essence.InterfaceDefinition#getDataUnit <em>Data Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Unit</em>' attribute.
	 * @see #getDataUnit()
	 * @generated
	 */
	void setDataUnit(String value);

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
	 * @see Essence.EssencePackage#getInterfaceDefinition_ExtVLNV()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExtVLNV' namespace='##targetNamespace'"
	 * @generated
	 */
	VLNV getExtVLNV();

	/**
	 * Sets the value of the '{@link Essence.InterfaceDefinition#getExtVLNV <em>Ext VLNV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext VLNV</em>' containment reference.
	 * @see #getExtVLNV()
	 * @generated
	 */
	void setExtVLNV(VLNV value);

	/**
	 * Returns the value of the '<em><b>Interface Def View</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.InterfaceDefView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Def View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Def View</em>' containment reference list.
	 * @see Essence.EssencePackage#getInterfaceDefinition_InterfaceDefView()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='InterfaceDefView' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterfaceDefView> getInterfaceDefView();

} // InterfaceDefinition
