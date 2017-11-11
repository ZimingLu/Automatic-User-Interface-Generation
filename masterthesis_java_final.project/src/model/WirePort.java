/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wire Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.WirePort#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getWirePort()
 * @model extendedMetaData="name='WirePort' kind='elementOnly'"
 * @generated
 */
public interface WirePort extends RealPort {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference.
	 * @see #setDataType(SimpleDataType)
	 * @see model.ModelPackage#getWirePort_DataType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DataType' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleDataType getDataType();

	/**
	 * Sets the value of the '{@link model.WirePort#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' containment reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(SimpleDataType value);

} // WirePort
