/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reg Mem Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.RegMemSet#getAddressUnit <em>Address Unit</em>}</li>
 *   <li>{@link Essence.RegMemSet#getDataUnit <em>Data Unit</em>}</li>
 *   <li>{@link Essence.RegMemSet#getSpecial <em>Special</em>}</li>
 *   <li>{@link Essence.RegMemSet#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link Essence.RegMemSet#getOpCode <em>Op Code</em>}</li>
 *   <li>{@link Essence.RegMemSet#getRegMemElement <em>Reg Mem Element</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getRegMemSet()
 * @model extendedMetaData="name='RegMemSet' kind='elementOnly'"
 * @generated
 */
public interface RegMemSet extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>Address Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 8
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Unit</em>' attribute.
	 * @see #setAddressUnit(String)
	 * @see Essence.EssencePackage#getRegMemSet_AddressUnit()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='AddressUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddressUnit();

	/**
	 * Sets the value of the '{@link Essence.RegMemSet#getAddressUnit <em>Address Unit</em>}' attribute.
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
	 * @see Essence.EssencePackage#getRegMemSet_DataUnit()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='DataUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDataUnit();

	/**
	 * Sets the value of the '{@link Essence.RegMemSet#getDataUnit <em>Data Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Unit</em>' attribute.
	 * @see #getDataUnit()
	 * @generated
	 */
	void setDataUnit(String value);

	/**
	 * Returns the value of the '<em><b>Special</b></em>' attribute.
	 * The literals are from the enumeration {@link Essence.SpecialType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special</em>' attribute.
	 * @see Essence.SpecialType
	 * @see #isSetSpecial()
	 * @see #unsetSpecial()
	 * @see #setSpecial(SpecialType)
	 * @see Essence.EssencePackage#getRegMemSet_Special()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Special' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecialType getSpecial();

	/**
	 * Sets the value of the '{@link Essence.RegMemSet#getSpecial <em>Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special</em>' attribute.
	 * @see Essence.SpecialType
	 * @see #isSetSpecial()
	 * @see #unsetSpecial()
	 * @see #getSpecial()
	 * @generated
	 */
	void setSpecial(SpecialType value);

	/**
	 * Unsets the value of the '{@link Essence.RegMemSet#getSpecial <em>Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecial()
	 * @see #getSpecial()
	 * @see #setSpecial(SpecialType)
	 * @generated
	 */
	void unsetSpecial();

	/**
	 * Returns whether the value of the '{@link Essence.RegMemSet#getSpecial <em>Special</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Special</em>' attribute is set.
	 * @see #unsetSpecial()
	 * @see #getSpecial()
	 * @see #setSpecial(SpecialType)
	 * @generated
	 */
	boolean isSetSpecial();

	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Essence.MessageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type</em>' attribute.
	 * @see Essence.MessageType
	 * @see #isSetMessageType()
	 * @see #unsetMessageType()
	 * @see #setMessageType(MessageType)
	 * @see Essence.EssencePackage#getRegMemSet_MessageType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MessageType' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageType getMessageType();

	/**
	 * Sets the value of the '{@link Essence.RegMemSet#getMessageType <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' attribute.
	 * @see Essence.MessageType
	 * @see #isSetMessageType()
	 * @see #unsetMessageType()
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(MessageType value);

	/**
	 * Unsets the value of the '{@link Essence.RegMemSet#getMessageType <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMessageType()
	 * @see #getMessageType()
	 * @see #setMessageType(MessageType)
	 * @generated
	 */
	void unsetMessageType();

	/**
	 * Returns whether the value of the '{@link Essence.RegMemSet#getMessageType <em>Message Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Message Type</em>' attribute is set.
	 * @see #unsetMessageType()
	 * @see #getMessageType()
	 * @see #setMessageType(MessageType)
	 * @generated
	 */
	boolean isSetMessageType();

	/**
	 * Returns the value of the '<em><b>Op Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Code</em>' attribute.
	 * @see #setOpCode(String)
	 * @see Essence.EssencePackage#getRegMemSet_OpCode()
	 * @model dataType="Essence.IntegerExpr"
	 *        extendedMetaData="kind='element' name='OpCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOpCode();

	/**
	 * Sets the value of the '{@link Essence.RegMemSet#getOpCode <em>Op Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Code</em>' attribute.
	 * @see #getOpCode()
	 * @generated
	 */
	void setOpCode(String value);

	/**
	 * Returns the value of the '<em><b>Reg Mem Element</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.RegMemElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Mem Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Mem Element</em>' containment reference list.
	 * @see Essence.EssencePackage#getRegMemSet_RegMemElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RegMemElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RegMemElement> getRegMemElement();

} // RegMemSet
