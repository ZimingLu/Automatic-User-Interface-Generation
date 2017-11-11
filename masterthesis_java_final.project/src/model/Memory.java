/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Memory#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link model.Memory#getSize <em>Size</em>}</li>
 *   <li>{@link model.Memory#getEndianness <em>Endianness</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getMemory()
 * @model extendedMetaData="name='Memory' kind='elementOnly'"
 * @generated
 */
public interface Memory extends SequenceElement {
	/**
	 * Returns the value of the '<em><b>Access Type</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link model.AccessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Type</em>' attribute.
	 * @see model.AccessType
	 * @see #setAccessType(AccessType)
	 * @see model.ModelPackage#getMemory_AccessType()
	 * @model default="none" required="true"
	 *        extendedMetaData="kind='element' name='AccessType' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessType getAccessType();

	/**
	 * Sets the value of the '{@link model.Memory#getAccessType <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type</em>' attribute.
	 * @see model.AccessType
	 * @see #getAccessType()
	 * @generated
	 */
	void setAccessType(AccessType value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see model.ModelPackage#getMemory_Size()
	 * @model default="1" dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Size' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link model.Memory#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Endianness</b></em>' attribute.
	 * The literals are from the enumeration {@link model.EndianType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endianness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endianness</em>' attribute.
	 * @see model.EndianType
	 * @see #isSetEndianness()
	 * @see #unsetEndianness()
	 * @see #setEndianness(EndianType)
	 * @see model.ModelPackage#getMemory_Endianness()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Endianness' namespace='##targetNamespace'"
	 * @generated
	 */
	EndianType getEndianness();

	/**
	 * Sets the value of the '{@link model.Memory#getEndianness <em>Endianness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endianness</em>' attribute.
	 * @see model.EndianType
	 * @see #isSetEndianness()
	 * @see #unsetEndianness()
	 * @see #getEndianness()
	 * @generated
	 */
	void setEndianness(EndianType value);

	/**
	 * Unsets the value of the '{@link model.Memory#getEndianness <em>Endianness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndianness()
	 * @see #getEndianness()
	 * @see #setEndianness(EndianType)
	 * @generated
	 */
	void unsetEndianness();

	/**
	 * Returns whether the value of the '{@link model.Memory#getEndianness <em>Endianness</em>}' attribute is set.
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
