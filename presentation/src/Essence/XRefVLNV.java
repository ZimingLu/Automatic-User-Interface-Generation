/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XRef VLNV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.XRefVLNV#getExtVLNV <em>Ext VLNV</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getXRefVLNV()
 * @model abstract="true"
 *        extendedMetaData="name='XRefVLNV' kind='elementOnly'"
 * @generated
 */
public interface XRefVLNV extends XRefDirect {
	/**
	 * Returns the value of the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext VLNV</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext VLNV</em>' containment reference.
	 * @see #setExtVLNV(VLNV)
	 * @see Essence.EssencePackage#getXRefVLNV_ExtVLNV()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ExtVLNV' namespace='##targetNamespace'"
	 * @generated
	 */
	VLNV getExtVLNV();

	/**
	 * Sets the value of the '{@link Essence.XRefVLNV#getExtVLNV <em>Ext VLNV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext VLNV</em>' containment reference.
	 * @see #getExtVLNV()
	 * @generated
	 */
	void setExtVLNV(VLNV value);

} // XRefVLNV
