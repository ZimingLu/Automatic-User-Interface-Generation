/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Def Transactional Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.InterfaceDefTransactionalPort#getInitiative <em>Initiative</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getInterfaceDefTransactionalPort()
 * @model extendedMetaData="name='InterfaceDefTransactionalPort' kind='elementOnly'"
 * @generated
 */
public interface InterfaceDefTransactionalPort extends InterfaceDefPort {
	/**
	 * Returns the value of the '<em><b>Initiative</b></em>' attribute.
	 * The default value is <code>"provides"</code>.
	 * The literals are from the enumeration {@link model.PortInitiative}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiative</em>' attribute.
	 * @see model.PortInitiative
	 * @see #setInitiative(PortInitiative)
	 * @see model.ModelPackage#getInterfaceDefTransactionalPort_Initiative()
	 * @model default="provides" required="true"
	 *        extendedMetaData="kind='element' name='Initiative' namespace='##targetNamespace'"
	 * @generated
	 */
	PortInitiative getInitiative();

	/**
	 * Sets the value of the '{@link model.InterfaceDefTransactionalPort#getInitiative <em>Initiative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiative</em>' attribute.
	 * @see model.PortInitiative
	 * @see #getInitiative()
	 * @generated
	 */
	void setInitiative(PortInitiative value);

} // InterfaceDefTransactionalPort
