/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Def Transactional Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.InterfaceDefTransactionalPort#getInitiative <em>Initiative</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getInterfaceDefTransactionalPort()
 * @model extendedMetaData="name='InterfaceDefTransactionalPort' kind='elementOnly'"
 * @generated
 */
public interface InterfaceDefTransactionalPort extends InterfaceDefPort {
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
	 * @see Essence.EssencePackage#getInterfaceDefTransactionalPort_Initiative()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Initiative' namespace='##targetNamespace'"
	 * @generated
	 */
	PortInitiative getInitiative();

	/**
	 * Sets the value of the '{@link Essence.InterfaceDefTransactionalPort#getInitiative <em>Initiative</em>}' attribute.
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
	 * Unsets the value of the '{@link Essence.InterfaceDefTransactionalPort#getInitiative <em>Initiative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitiative()
	 * @see #getInitiative()
	 * @see #setInitiative(PortInitiative)
	 * @generated
	 */
	void unsetInitiative();

	/**
	 * Returns whether the value of the '{@link Essence.InterfaceDefTransactionalPort#getInitiative <em>Initiative</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initiative</em>' attribute is set.
	 * @see #unsetInitiative()
	 * @see #getInitiative()
	 * @see #setInitiative(PortInitiative)
	 * @generated
	 */
	boolean isSetInitiative();

} // InterfaceDefTransactionalPort
