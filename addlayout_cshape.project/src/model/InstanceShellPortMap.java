/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Shell Port Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.InstanceShellPortMap#getXRefInstanceShellPort <em>XRef Instance Shell Port</em>}</li>
 *   <li>{@link model.InstanceShellPortMap#getXRefSignal <em>XRef Signal</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getInstanceShellPortMap()
 * @model extendedMetaData="name='InstanceShellPortMap' kind='elementOnly'"
 * @generated
 */
public interface InstanceShellPortMap extends SingleSourceNode {
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
	 * @see model.ModelPackage#getInstanceShellPortMap_XRefInstanceShellPort()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefInstanceShellPort' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefIndPort getXRefInstanceShellPort();

	/**
	 * Sets the value of the '{@link model.InstanceShellPortMap#getXRefInstanceShellPort <em>XRef Instance Shell Port</em>}' containment reference.
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
	 * @see #setXRefSignal(XRefInternalSignal)
	 * @see model.ModelPackage#getInstanceShellPortMap_XRefSignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefSignal' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefInternalSignal getXRefSignal();

	/**
	 * Sets the value of the '{@link model.InstanceShellPortMap#getXRefSignal <em>XRef Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Signal</em>' containment reference.
	 * @see #getXRefSignal()
	 * @generated
	 */
	void setXRefSignal(XRefInternalSignal value);

} // InstanceShellPortMap
