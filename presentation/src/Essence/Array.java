/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.Array#getDataType <em>Data Type</em>}</li>
 *   <li>{@link Essence.Array#getArrayDimension <em>Array Dimension</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getArray()
 * @model extendedMetaData="name='Array' kind='elementOnly'"
 * @generated
 */
public interface Array extends ComplexDataType {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference.
	 * @see #setDataType(ValueDataType)
	 * @see Essence.EssencePackage#getArray_DataType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueDataType getDataType();

	/**
	 * Sets the value of the '{@link Essence.Array#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' containment reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(ValueDataType value);

	/**
	 * Returns the value of the '<em><b>Array Dimension</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.ArrayDimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Dimension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Dimension</em>' containment reference list.
	 * @see Essence.EssencePackage#getArray_ArrayDimension()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ArrayDimension' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ArrayDimension> getArrayDimension();

} // Array
