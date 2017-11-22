/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Port Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.LocalPortMap#getXRefLocalPort <em>XRef Local Port</em>}</li>
 *   <li>{@link Essence.LocalPortMap#getXRefSignal <em>XRef Signal</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getLocalPortMap()
 * @model extendedMetaData="name='LocalPortMap' kind='elementOnly'"
 * @generated
 */
public interface LocalPortMap extends SingleSourceNode {
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
	 * @see Essence.EssencePackage#getLocalPortMap_XRefLocalPort()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefLocalPort' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefInternalPort getXRefLocalPort();

	/**
	 * Sets the value of the '{@link Essence.LocalPortMap#getXRefLocalPort <em>XRef Local Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Local Port</em>' containment reference.
	 * @see #getXRefLocalPort()
	 * @generated
	 */
	void setXRefLocalPort(XRefInternalPort value);

	/**
	 * Returns the value of the '<em><b>XRef Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Signal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Signal</em>' containment reference.
	 * @see #setXRefSignal(XRefInternalSignal)
	 * @see Essence.EssencePackage#getLocalPortMap_XRefSignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefSignal' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefInternalSignal getXRefSignal();

	/**
	 * Sets the value of the '{@link Essence.LocalPortMap#getXRefSignal <em>XRef Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Signal</em>' containment reference.
	 * @see #getXRefSignal()
	 * @generated
	 */
	void setXRefSignal(XRefInternalSignal value);

} // LocalPortMap
