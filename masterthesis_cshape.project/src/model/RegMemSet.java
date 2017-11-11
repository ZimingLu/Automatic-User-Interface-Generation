/**
 */
package model;

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
 *   <li>{@link model.RegMemSet#getAddressUnit <em>Address Unit</em>}</li>
 *   <li>{@link model.RegMemSet#getDataUnit <em>Data Unit</em>}</li>
 *   <li>{@link model.RegMemSet#getSpecial <em>Special</em>}</li>
 *   <li>{@link model.RegMemSet#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link model.RegMemSet#getOpCode <em>Op Code</em>}</li>
 *   <li>{@link model.RegMemSet#getRegMemElement <em>Reg Mem Element</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getRegMemSet()
 * @model extendedMetaData="name='RegMemSet' kind='elementOnly'"
 * @generated
 */
public interface RegMemSet extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>Address Unit</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 8
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Unit</em>' attribute.
	 * @see #setAddressUnit(String)
	 * @see model.ModelPackage#getRegMemSet_AddressUnit()
	 * @model default="8" dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='AddressUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddressUnit();

	/**
	 * Sets the value of the '{@link model.RegMemSet#getAddressUnit <em>Address Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Unit</em>' attribute.
	 * @see #getAddressUnit()
	 * @generated
	 */
	void setAddressUnit(String value);

	/**
	 * Returns the value of the '<em><b>Data Unit</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 8
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Unit</em>' attribute.
	 * @see #setDataUnit(String)
	 * @see model.ModelPackage#getRegMemSet_DataUnit()
	 * @model default="8" dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='DataUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDataUnit();

	/**
	 * Sets the value of the '{@link model.RegMemSet#getDataUnit <em>Data Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Unit</em>' attribute.
	 * @see #getDataUnit()
	 * @generated
	 */
	void setDataUnit(String value);

	/**
	 * Returns the value of the '<em><b>Special</b></em>' attribute.
	 * The literals are from the enumeration {@link model.SpecialType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special</em>' attribute.
	 * @see model.SpecialType
	 * @see #isSetSpecial()
	 * @see #unsetSpecial()
	 * @see #setSpecial(SpecialType)
	 * @see model.ModelPackage#getRegMemSet_Special()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Special' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecialType getSpecial();

	/**
	 * Sets the value of the '{@link model.RegMemSet#getSpecial <em>Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special</em>' attribute.
	 * @see model.SpecialType
	 * @see #isSetSpecial()
	 * @see #unsetSpecial()
	 * @see #getSpecial()
	 * @generated
	 */
	void setSpecial(SpecialType value);

	/**
	 * Unsets the value of the '{@link model.RegMemSet#getSpecial <em>Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecial()
	 * @see #getSpecial()
	 * @see #setSpecial(SpecialType)
	 * @generated
	 */
	void unsetSpecial();

	/**
	 * Returns whether the value of the '{@link model.RegMemSet#getSpecial <em>Special</em>}' attribute is set.
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
	 * The literals are from the enumeration {@link model.MessageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type</em>' attribute.
	 * @see model.MessageType
	 * @see #isSetMessageType()
	 * @see #unsetMessageType()
	 * @see #setMessageType(MessageType)
	 * @see model.ModelPackage#getRegMemSet_MessageType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MessageType' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageType getMessageType();

	/**
	 * Sets the value of the '{@link model.RegMemSet#getMessageType <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' attribute.
	 * @see model.MessageType
	 * @see #isSetMessageType()
	 * @see #unsetMessageType()
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(MessageType value);

	/**
	 * Unsets the value of the '{@link model.RegMemSet#getMessageType <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMessageType()
	 * @see #getMessageType()
	 * @see #setMessageType(MessageType)
	 * @generated
	 */
	void unsetMessageType();

	/**
	 * Returns whether the value of the '{@link model.RegMemSet#getMessageType <em>Message Type</em>}' attribute is set.
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
	 * @see #isSetOpCode()
	 * @see #unsetOpCode()
	 * @see #setOpCode(String)
	 * @see model.ModelPackage#getRegMemSet_OpCode()
	 * @model unsettable="true" dataType="model.IntegerExpr"
	 *        extendedMetaData="kind='element' name='OpCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOpCode();

	/**
	 * Sets the value of the '{@link model.RegMemSet#getOpCode <em>Op Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Code</em>' attribute.
	 * @see #isSetOpCode()
	 * @see #unsetOpCode()
	 * @see #getOpCode()
	 * @generated
	 */
	void setOpCode(String value);

	/**
	 * Unsets the value of the '{@link model.RegMemSet#getOpCode <em>Op Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOpCode()
	 * @see #getOpCode()
	 * @see #setOpCode(String)
	 * @generated
	 */
	void unsetOpCode();

	/**
	 * Returns whether the value of the '{@link model.RegMemSet#getOpCode <em>Op Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Op Code</em>' attribute is set.
	 * @see #unsetOpCode()
	 * @see #getOpCode()
	 * @see #setOpCode(String)
	 * @generated
	 */
	boolean isSetOpCode();

	/**
	 * Returns the value of the '<em><b>Reg Mem Element</b></em>' containment reference list.
	 * The list contents are of type {@link model.RegMemElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Mem Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Mem Element</em>' containment reference list.
	 * @see model.ModelPackage#getRegMemSet_RegMemElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RegMemElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RegMemElement> getRegMemElement();

} // RegMemSet
