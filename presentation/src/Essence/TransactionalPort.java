/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transactional Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.TransactionalPort#getDataType <em>Data Type</em>}</li>
 *   <li>{@link Essence.TransactionalPort#getInitiative <em>Initiative</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getTransactionalPort()
 * @model extendedMetaData="name='TransactionalPort' kind='elementOnly'"
 * @generated
 */
public interface TransactionalPort extends RealPort {
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
	 * @see Essence.EssencePackage#getTransactionalPort_DataType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DataType' namespace='##targetNamespace'"
	 * @generated
	 */
	MethodDataType getDataType();

	/**
	 * Sets the value of the '{@link Essence.TransactionalPort#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' containment reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(MethodDataType value);

	/**
	 * Returns the value of the '<em><b>Initiative</b></em>' attribute.
	 * The literals are from the enumeration {@link Essence.PortInitiative}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiative</em>' attribute.
	 * @see Essence.PortInitiative
	 * @see #isSetInitiative()
	 * @see #unsetInitiative()
	 * @see #setInitiative(PortInitiative)
	 * @see Essence.EssencePackage#getTransactionalPort_Initiative()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Initiative' namespace='##targetNamespace'"
	 * @generated
	 */
	PortInitiative getInitiative();

	/**
	 * Sets the value of the '{@link Essence.TransactionalPort#getInitiative <em>Initiative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiative</em>' attribute.
	 * @see Essence.PortInitiative
	 * @see #isSetInitiative()
	 * @see #unsetInitiative()
	 * @see #getInitiative()
	 * @generated
	 */
	void setInitiative(PortInitiative value);

	/**
	 * Unsets the value of the '{@link Essence.TransactionalPort#getInitiative <em>Initiative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitiative()
	 * @see #getInitiative()
	 * @see #setInitiative(PortInitiative)
	 * @generated
	 */
	void unsetInitiative();

	/**
	 * Returns whether the value of the '{@link Essence.TransactionalPort#getInitiative <em>Initiative</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initiative</em>' attribute is set.
	 * @see #unsetInitiative()
	 * @see #getInitiative()
	 * @see #setInitiative(PortInitiative)
	 * @generated
	 */
	boolean isSetInitiative();

} // TransactionalPort
