/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transactional Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.TransactionalSignal#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getTransactionalSignal()
 * @model extendedMetaData="name='TransactionalSignal' kind='elementOnly'"
 * @generated
 */
public interface TransactionalSignal extends Signal {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference.
	 * @see #setDataType(MethodDataType)
	 * @see model.ModelPackage#getTransactionalSignal_DataType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DataType' namespace='##targetNamespace'"
	 * @generated
	 */
	MethodDataType getDataType();

	/**
	 * Sets the value of the '{@link model.TransactionalSignal#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' containment reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(MethodDataType value);

} // TransactionalSignal
