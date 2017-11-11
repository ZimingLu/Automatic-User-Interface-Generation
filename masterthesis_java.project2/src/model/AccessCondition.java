/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.AccessCondition#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link model.AccessCondition#getBusErrorType <em>Bus Error Type</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getAccessCondition()
 * @model extendedMetaData="name='AccessCondition' kind='elementOnly'"
 * @generated
 */
public interface AccessCondition extends IndexVarUser {
	/**
	 * Returns the value of the '<em><b>Access Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Level</em>' attribute.
	 * @see #setAccessLevel(String)
	 * @see model.ModelPackage#getAccessCondition_AccessLevel()
	 * @model dataType="model.IntegerLiteral" required="true"
	 *        extendedMetaData="kind='element' name='AccessLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccessLevel();

	/**
	 * Sets the value of the '{@link model.AccessCondition#getAccessLevel <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Level</em>' attribute.
	 * @see #getAccessLevel()
	 * @generated
	 */
	void setAccessLevel(String value);

	/**
	 * Returns the value of the '<em><b>Bus Error Type</b></em>' attribute.
	 * The default value is <code>"ReadError"</code>.
	 * The literals are from the enumeration {@link model.BusErrorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Error Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Error Type</em>' attribute.
	 * @see model.BusErrorType
	 * @see #isSetBusErrorType()
	 * @see #unsetBusErrorType()
	 * @see #setBusErrorType(BusErrorType)
	 * @see model.ModelPackage#getAccessCondition_BusErrorType()
	 * @model default="ReadError" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='BusErrorType' namespace='##targetNamespace'"
	 * @generated
	 */
	BusErrorType getBusErrorType();

	/**
	 * Sets the value of the '{@link model.AccessCondition#getBusErrorType <em>Bus Error Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Error Type</em>' attribute.
	 * @see model.BusErrorType
	 * @see #isSetBusErrorType()
	 * @see #unsetBusErrorType()
	 * @see #getBusErrorType()
	 * @generated
	 */
	void setBusErrorType(BusErrorType value);

	/**
	 * Unsets the value of the '{@link model.AccessCondition#getBusErrorType <em>Bus Error Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBusErrorType()
	 * @see #getBusErrorType()
	 * @see #setBusErrorType(BusErrorType)
	 * @generated
	 */
	void unsetBusErrorType();

	/**
	 * Returns whether the value of the '{@link model.AccessCondition#getBusErrorType <em>Bus Error Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bus Error Type</em>' attribute is set.
	 * @see #unsetBusErrorType()
	 * @see #getBusErrorType()
	 * @see #setBusErrorType(BusErrorType)
	 * @generated
	 */
	boolean isSetBusErrorType();

} // AccessCondition
