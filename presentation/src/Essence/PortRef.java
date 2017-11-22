/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.PortRef#getXRefLocalPort <em>XRef Local Port</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getPortRef()
 * @model extendedMetaData="name='PortRef' kind='elementOnly'"
 * @generated
 */
public interface PortRef extends Port {
	/**
	 * Returns the value of the '<em><b>XRef Local Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Local Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Local Port</em>' containment reference.
	 * @see #setXRefLocalPort(XRefRealPort)
	 * @see Essence.EssencePackage#getPortRef_XRefLocalPort()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefLocalPort' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefRealPort getXRefLocalPort();

	/**
	 * Sets the value of the '{@link Essence.PortRef#getXRefLocalPort <em>XRef Local Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Local Port</em>' containment reference.
	 * @see #getXRefLocalPort()
	 * @generated
	 */
	void setXRefLocalPort(XRefRealPort value);

} // PortRef
