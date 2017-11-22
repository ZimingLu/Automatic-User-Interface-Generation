/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Port Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.InterfacePortMap#getXRefLocalPort <em>XRef Local Port</em>}</li>
 *   <li>{@link Essence.InterfacePortMap#getXRefInterfacePort <em>XRef Interface Port</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getInterfacePortMap()
 * @model extendedMetaData="name='InterfacePortMap' kind='elementOnly'"
 * @generated
 */
public interface InterfacePortMap extends EssenceBase {
	/**
	 * Returns the value of the '<em><b>XRef Local Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Local Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Local Port</em>' containment reference.
	 * @see #setXRefLocalPort(XRefInternalPort)
	 * @see Essence.EssencePackage#getInterfacePortMap_XRefLocalPort()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefLocalPort' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefInternalPort getXRefLocalPort();

	/**
	 * Sets the value of the '{@link Essence.InterfacePortMap#getXRefLocalPort <em>XRef Local Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Local Port</em>' containment reference.
	 * @see #getXRefLocalPort()
	 * @generated
	 */
	void setXRefLocalPort(XRefInternalPort value);

	/**
	 * Returns the value of the '<em><b>XRef Interface Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Interface Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Interface Port</em>' containment reference.
	 * @see #setXRefInterfacePort(XRefIFDPort)
	 * @see Essence.EssencePackage#getInterfacePortMap_XRefInterfacePort()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefInterfacePort' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefIFDPort getXRefInterfacePort();

	/**
	 * Sets the value of the '{@link Essence.InterfacePortMap#getXRefInterfacePort <em>XRef Interface Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Interface Port</em>' containment reference.
	 * @see #getXRefInterfacePort()
	 * @generated
	 */
	void setXRefInterfacePort(XRefIFDPort value);

} // InterfacePortMap
