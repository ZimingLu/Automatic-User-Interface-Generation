/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XRef IFD Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.XRefIFDPort#getSubElementAccess <em>Sub Element Access</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getXRefIFDPort()
 * @model extendedMetaData="name='XRefIFDPort' kind='elementOnly'"
 * @generated
 */
public interface XRefIFDPort extends XRefDirect {
	/**
	 * Returns the value of the '<em><b>Sub Element Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Element Access</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Element Access</em>' containment reference.
	 * @see #setSubElementAccess(SubElementAccess)
	 * @see Essence.EssencePackage#getXRefIFDPort_SubElementAccess()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubElementAccess' namespace='##targetNamespace'"
	 * @generated
	 */
	SubElementAccess getSubElementAccess();

	/**
	 * Sets the value of the '{@link Essence.XRefIFDPort#getSubElementAccess <em>Sub Element Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Element Access</em>' containment reference.
	 * @see #getSubElementAccess()
	 * @generated
	 */
	void setSubElementAccess(SubElementAccess value);

} // XRefIFDPort
