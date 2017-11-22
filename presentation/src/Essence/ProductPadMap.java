/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Pad Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.ProductPadMap#getXRefPad <em>XRef Pad</em>}</li>
 *   <li>{@link Essence.ProductPadMap#getXRefSignal <em>XRef Signal</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getProductPadMap()
 * @model extendedMetaData="name='ProductPadMap' kind='elementOnly'"
 * @generated
 */
public interface ProductPadMap extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>XRef Pad</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Pad</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Pad</em>' containment reference.
	 * @see #setXRefPad(XRefIndSinglePad)
	 * @see Essence.EssencePackage#getProductPadMap_XRefPad()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefPad' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefIndSinglePad getXRefPad();

	/**
	 * Sets the value of the '{@link Essence.ProductPadMap#getXRefPad <em>XRef Pad</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Pad</em>' containment reference.
	 * @see #getXRefPad()
	 * @generated
	 */
	void setXRefPad(XRefIndSinglePad value);

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
	 * @see Essence.EssencePackage#getProductPadMap_XRefSignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefSignal' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefInternalSignal getXRefSignal();

	/**
	 * Sets the value of the '{@link Essence.ProductPadMap#getXRefSignal <em>XRef Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Signal</em>' containment reference.
	 * @see #getXRefSignal()
	 * @generated
	 */
	void setXRefSignal(XRefInternalSignal value);

} // ProductPadMap
