/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shell Port Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.ShellPortMap#getXRefShellPort <em>XRef Shell Port</em>}</li>
 *   <li>{@link Essence.ShellPortMap#getXRefSignal <em>XRef Signal</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getShellPortMap()
 * @model extendedMetaData="name='ShellPortMap' kind='elementOnly'"
 * @generated
 */
public interface ShellPortMap extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>XRef Shell Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Shell Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Shell Port</em>' containment reference.
	 * @see #setXRefShellPort(XRefExternalPort)
	 * @see Essence.EssencePackage#getShellPortMap_XRefShellPort()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefShellPort' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefExternalPort getXRefShellPort();

	/**
	 * Sets the value of the '{@link Essence.ShellPortMap#getXRefShellPort <em>XRef Shell Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Shell Port</em>' containment reference.
	 * @see #getXRefShellPort()
	 * @generated
	 */
	void setXRefShellPort(XRefExternalPort value);

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
	 * @see Essence.EssencePackage#getShellPortMap_XRefSignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefSignal' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefInternalSignal getXRefSignal();

	/**
	 * Sets the value of the '{@link Essence.ShellPortMap#getXRefSignal <em>XRef Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Signal</em>' containment reference.
	 * @see #getXRefSignal()
	 * @generated
	 */
	void setXRefSignal(XRefInternalSignal value);

} // ShellPortMap
