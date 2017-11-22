/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.Memory#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link Essence.Memory#getSize <em>Size</em>}</li>
 *   <li>{@link Essence.Memory#getEndianness <em>Endianness</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getMemory()
 * @model extendedMetaData="name='Memory' kind='elementOnly'"
 * @generated
 */
public interface Memory extends SequenceElement {
	/**
	 * Returns the value of the '<em><b>Access Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Essence.AccessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Type</em>' attribute.
	 * @see Essence.AccessType
	 * @see #isSetAccessType()
	 * @see #unsetAccessType()
	 * @see #setAccessType(AccessType)
	 * @see Essence.EssencePackage#getMemory_AccessType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='AccessType' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessType getAccessType();

	/**
	 * Sets the value of the '{@link Essence.Memory#getAccessType <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type</em>' attribute.
	 * @see Essence.AccessType
	 * @see #isSetAccessType()
	 * @see #unsetAccessType()
	 * @see #getAccessType()
	 * @generated
	 */
	void setAccessType(AccessType value);

	/**
	 * Unsets the value of the '{@link Essence.Memory#getAccessType <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccessType()
	 * @see #getAccessType()
	 * @see #setAccessType(AccessType)
	 * @generated
	 */
	void unsetAccessType();

	/**
	 * Returns whether the value of the '{@link Essence.Memory#getAccessType <em>Access Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Access Type</em>' attribute is set.
	 * @see #unsetAccessType()
	 * @see #getAccessType()
	 * @see #setAccessType(AccessType)
	 * @generated
	 */
	boolean isSetAccessType();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see Essence.EssencePackage#getMemory_Size()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Size' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link Essence.Memory#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Endianness</b></em>' attribute.
	 * The literals are from the enumeration {@link Essence.EndianType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endianness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endianness</em>' attribute.
	 * @see Essence.EndianType
	 * @see #isSetEndianness()
	 * @see #unsetEndianness()
	 * @see #setEndianness(EndianType)
	 * @see Essence.EssencePackage#getMemory_Endianness()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Endianness' namespace='##targetNamespace'"
	 * @generated
	 */
	EndianType getEndianness();

	/**
	 * Sets the value of the '{@link Essence.Memory#getEndianness <em>Endianness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endianness</em>' attribute.
	 * @see Essence.EndianType
	 * @see #isSetEndianness()
	 * @see #unsetEndianness()
	 * @see #getEndianness()
	 * @generated
	 */
	void setEndianness(EndianType value);

	/**
	 * Unsets the value of the '{@link Essence.Memory#getEndianness <em>Endianness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndianness()
	 * @see #getEndianness()
	 * @see #setEndianness(EndianType)
	 * @generated
	 */
	void unsetEndianness();

	/**
	 * Returns whether the value of the '{@link Essence.Memory#getEndianness <em>Endianness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Endianness</em>' attribute is set.
	 * @see #unsetEndianness()
	 * @see #getEndianness()
	 * @see #setEndianness(EndianType)
	 * @generated
	 */
	boolean isSetEndianness();

} // Memory
