/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Def Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.InterfaceDefPort#getXRefSignal <em>XRef Signal</em>}</li>
 *   <li>{@link model.InterfaceDefPort#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getInterfaceDefPort()
 * @model abstract="true"
 *        extendedMetaData="name='InterfaceDefPort' kind='elementOnly'"
 * @generated
 */
public interface InterfaceDefPort extends GeneralPort {
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
	 * @see model.ModelPackage#getInterfaceDefPort_XRefSignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefSignal' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefInternalSignal getXRefSignal();

	/**
	 * Sets the value of the '{@link model.InterfaceDefPort#getXRefSignal <em>XRef Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Signal</em>' containment reference.
	 * @see #getXRefSignal()
	 * @generated
	 */
	void setXRefSignal(XRefInternalSignal value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"in"</code>.
	 * The literals are from the enumeration {@link model.PortDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see model.PortDirection
	 * @see #setDirection(PortDirection)
	 * @see model.ModelPackage#getInterfaceDefPort_Direction()
	 * @model default="in" required="true"
	 *        extendedMetaData="kind='element' name='Direction' namespace='##targetNamespace'"
	 * @generated
	 */
	PortDirection getDirection();

	/**
	 * Sets the value of the '{@link model.InterfaceDefPort#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see model.PortDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(PortDirection value);

} // InterfaceDefPort
