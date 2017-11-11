/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pad Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.PadSupply#getSpec <em>Spec</em>}</li>
 *   <li>{@link model.PadSupply#getXRefPowerDomain <em>XRef Power Domain</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getPadSupply()
 * @model extendedMetaData="name='PadSupply' kind='elementOnly'"
 * @generated
 */
public interface PadSupply extends GeneralPad {
	/**
	 * Returns the value of the '<em><b>Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec</em>' attribute.
	 * @see #setSpec(String)
	 * @see model.ModelPackage#getPadSupply_Spec()
	 * @model dataType="model.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Spec' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSpec();

	/**
	 * Sets the value of the '{@link model.PadSupply#getSpec <em>Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec</em>' attribute.
	 * @see #getSpec()
	 * @generated
	 */
	void setSpec(String value);

	/**
	 * Returns the value of the '<em><b>XRef Power Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Power Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Power Domain</em>' containment reference.
	 * @see #setXRefPowerDomain(XRefPowerDomain)
	 * @see model.ModelPackage#getPadSupply_XRefPowerDomain()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefPowerDomain' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefPowerDomain getXRefPowerDomain();

	/**
	 * Sets the value of the '{@link model.PadSupply#getXRefPowerDomain <em>XRef Power Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Power Domain</em>' containment reference.
	 * @see #getXRefPowerDomain()
	 * @generated
	 */
	void setXRefPowerDomain(XRefPowerDomain value);

} // PadSupply
