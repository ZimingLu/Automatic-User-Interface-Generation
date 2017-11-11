/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin Net Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.PinNetMap#getXRefPin <em>XRef Pin</em>}</li>
 *   <li>{@link model.PinNetMap#getXRefNet <em>XRef Net</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getPinNetMap()
 * @model extendedMetaData="name='PinNetMap' kind='elementOnly'"
 * @generated
 */
public interface PinNetMap extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>XRef Pin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Pin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Pin</em>' containment reference.
	 * @see #setXRefPin(XRefPin)
	 * @see model.ModelPackage#getPinNetMap_XRefPin()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefPin' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefPin getXRefPin();

	/**
	 * Sets the value of the '{@link model.PinNetMap#getXRefPin <em>XRef Pin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Pin</em>' containment reference.
	 * @see #getXRefPin()
	 * @generated
	 */
	void setXRefPin(XRefPin value);

	/**
	 * Returns the value of the '<em><b>XRef Net</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Net</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Net</em>' containment reference.
	 * @see #setXRefNet(XRefNet)
	 * @see model.ModelPackage#getPinNetMap_XRefNet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefNet' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefNet getXRefNet();

	/**
	 * Sets the value of the '{@link model.PinNetMap#getXRefNet <em>XRef Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Net</em>' containment reference.
	 * @see #getXRefNet()
	 * @generated
	 */
	void setXRefNet(XRefNet value);

} // PinNetMap
