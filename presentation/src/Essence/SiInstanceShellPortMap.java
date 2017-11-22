/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Si Instance Shell Port Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.SiInstanceShellPortMap#getXRefInstanceShellPort <em>XRef Instance Shell Port</em>}</li>
 *   <li>{@link Essence.SiInstanceShellPortMap#getXRefSignal <em>XRef Signal</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getSiInstanceShellPortMap()
 * @model extendedMetaData="name='SiInstanceShellPortMap' kind='elementOnly'"
 * @generated
 */
public interface SiInstanceShellPortMap extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>XRef Instance Shell Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Instance Shell Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Instance Shell Port</em>' containment reference.
	 * @see #setXRefInstanceShellPort(XRefIndPort)
	 * @see Essence.EssencePackage#getSiInstanceShellPortMap_XRefInstanceShellPort()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefInstanceShellPort' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefIndPort getXRefInstanceShellPort();

	/**
	 * Sets the value of the '{@link Essence.SiInstanceShellPortMap#getXRefInstanceShellPort <em>XRef Instance Shell Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Instance Shell Port</em>' containment reference.
	 * @see #getXRefInstanceShellPort()
	 * @generated
	 */
	void setXRefInstanceShellPort(XRefIndPort value);

	/**
	 * Returns the value of the '<em><b>XRef Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Signal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Signal</em>' containment reference.
	 * @see #setXRefSignal(XRefSiSignal)
	 * @see Essence.EssencePackage#getSiInstanceShellPortMap_XRefSignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefSignal' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefSiSignal getXRefSignal();

	/**
	 * Sets the value of the '{@link Essence.SiInstanceShellPortMap#getXRefSignal <em>XRef Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Signal</em>' containment reference.
	 * @see #getXRefSignal()
	 * @generated
	 */
	void setXRefSignal(XRefSiSignal value);

} // SiInstanceShellPortMap
