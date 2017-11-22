/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.Signal#getXRefDefaultValue <em>XRef Default Value</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getSignal()
 * @model abstract="true"
 *        extendedMetaData="name='Signal' kind='elementOnly'"
 * @generated
 */
public interface Signal extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>XRef Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Default Value</em>' containment reference.
	 * @see #setXRefDefaultValue(XRefDataVar)
	 * @see Essence.EssencePackage#getSignal_XRefDefaultValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='XRefDefaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefDataVar getXRefDefaultValue();

	/**
	 * Sets the value of the '{@link Essence.Signal#getXRefDefaultValue <em>XRef Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Default Value</em>' containment reference.
	 * @see #getXRefDefaultValue()
	 * @generated
	 */
	void setXRefDefaultValue(XRefDataVar value);

} // Signal
