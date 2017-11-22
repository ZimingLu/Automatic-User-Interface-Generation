/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XRef External Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.XRefExternalPort#getSubElementAccess <em>Sub Element Access</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getXRefExternalPort()
 * @model extendedMetaData="name='XRefExternalPort' kind='elementOnly'"
 * @generated
 */
public interface XRefExternalPort extends XRefDirect {
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
	 * @see Essence.EssencePackage#getXRefExternalPort_SubElementAccess()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubElementAccess' namespace='##targetNamespace'"
	 * @generated
	 */
	SubElementAccess getSubElementAccess();

	/**
	 * Sets the value of the '{@link Essence.XRefExternalPort#getSubElementAccess <em>Sub Element Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Element Access</em>' containment reference.
	 * @see #getSubElementAccess()
	 * @generated
	 */
	void setSubElementAccess(SubElementAccess value);

} // XRefExternalPort
