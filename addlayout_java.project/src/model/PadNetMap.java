/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pad Net Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.PadNetMap#getXRefPad <em>XRef Pad</em>}</li>
 *   <li>{@link model.PadNetMap#getXRefNet <em>XRef Net</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getPadNetMap()
 * @model extendedMetaData="name='PadNetMap' kind='elementOnly'"
 * @generated
 */
public interface PadNetMap extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>XRef Pad</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Pad</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Pad</em>' containment reference.
	 * @see #setXRefPad(XRefSinglePad)
	 * @see model.ModelPackage#getPadNetMap_XRefPad()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefPad' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefSinglePad getXRefPad();

	/**
	 * Sets the value of the '{@link model.PadNetMap#getXRefPad <em>XRef Pad</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Pad</em>' containment reference.
	 * @see #getXRefPad()
	 * @generated
	 */
	void setXRefPad(XRefSinglePad value);

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
	 * @see model.ModelPackage#getPadNetMap_XRefNet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefNet' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefNet getXRefNet();

	/**
	 * Sets the value of the '{@link model.PadNetMap#getXRefNet <em>XRef Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Net</em>' containment reference.
	 * @see #getXRefNet()
	 * @generated
	 */
	void setXRefNet(XRefNet value);

} // PadNetMap
