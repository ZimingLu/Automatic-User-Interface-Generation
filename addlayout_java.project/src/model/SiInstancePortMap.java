/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Si Instance Port Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.SiInstancePortMap#getXRefInstancePort <em>XRef Instance Port</em>}</li>
 *   <li>{@link model.SiInstancePortMap#getXRefSignal <em>XRef Signal</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getSiInstancePortMap()
 * @model extendedMetaData="name='SiInstancePortMap' kind='elementOnly'"
 * @generated
 */
public interface SiInstancePortMap extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>XRef Instance Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Instance Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Instance Port</em>' containment reference.
	 * @see #setXRefInstancePort(XRefExternalPort)
	 * @see model.ModelPackage#getSiInstancePortMap_XRefInstancePort()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefInstancePort' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefExternalPort getXRefInstancePort();

	/**
	 * Sets the value of the '{@link model.SiInstancePortMap#getXRefInstancePort <em>XRef Instance Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Instance Port</em>' containment reference.
	 * @see #getXRefInstancePort()
	 * @generated
	 */
	void setXRefInstancePort(XRefExternalPort value);

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
	 * @see model.ModelPackage#getSiInstancePortMap_XRefSignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefSignal' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefSiSignal getXRefSignal();

	/**
	 * Sets the value of the '{@link model.SiInstancePortMap#getXRefSignal <em>XRef Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Signal</em>' containment reference.
	 * @see #getXRefSignal()
	 * @generated
	 */
	void setXRefSignal(XRefSiSignal value);

} // SiInstancePortMap
