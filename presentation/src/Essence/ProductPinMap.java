/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Pin Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.ProductPinMap#getXRefPin <em>XRef Pin</em>}</li>
 *   <li>{@link Essence.ProductPinMap#getXRefSignal <em>XRef Signal</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getProductPinMap()
 * @model extendedMetaData="name='ProductPinMap' kind='elementOnly'"
 * @generated
 */
public interface ProductPinMap extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>XRef Pin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Pin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Pin</em>' containment reference.
	 * @see #setXRefPin(XRefIndPin)
	 * @see Essence.EssencePackage#getProductPinMap_XRefPin()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefPin' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefIndPin getXRefPin();

	/**
	 * Sets the value of the '{@link Essence.ProductPinMap#getXRefPin <em>XRef Pin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Pin</em>' containment reference.
	 * @see #getXRefPin()
	 * @generated
	 */
	void setXRefPin(XRefIndPin value);

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
	 * @see Essence.EssencePackage#getProductPinMap_XRefSignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefSignal' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefInternalSignal getXRefSignal();

	/**
	 * Sets the value of the '{@link Essence.ProductPinMap#getXRefSignal <em>XRef Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Signal</em>' containment reference.
	 * @see #getXRefSignal()
	 * @generated
	 */
	void setXRefSignal(XRefInternalSignal value);

} // ProductPinMap
