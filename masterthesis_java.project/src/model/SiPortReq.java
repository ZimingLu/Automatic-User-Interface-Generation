/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Si Port Req</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.SiPortReq#getDriverStrength <em>Driver Strength</em>}</li>
 *   <li>{@link model.SiPortReq#getSet <em>Set</em>}</li>
 *   <li>{@link model.SiPortReq#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getSiPortReq()
 * @model extendedMetaData="name='SiPortReq' kind='elementOnly'"
 * @generated
 */
public interface SiPortReq extends EssenceBase {
	/**
	 * Returns the value of the '<em><b>Driver Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driver Strength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver Strength</em>' attribute.
	 * @see #setDriverStrength(String)
	 * @see model.ModelPackage#getSiPortReq_DriverStrength()
	 * @model dataType="model.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='DriverStrength' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDriverStrength();

	/**
	 * Sets the value of the '{@link model.SiPortReq#getDriverStrength <em>Driver Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver Strength</em>' attribute.
	 * @see #getDriverStrength()
	 * @generated
	 */
	void setDriverStrength(String value);

	/**
	 * Returns the value of the '<em><b>Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set</em>' attribute.
	 * @see #setSet(String)
	 * @see model.ModelPackage#getSiPortReq_Set()
	 * @model dataType="model.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Set' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSet();

	/**
	 * Sets the value of the '{@link model.SiPortReq#getSet <em>Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' attribute.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see model.ModelPackage#getSiPortReq_Type()
	 * @model dataType="model.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link model.SiPortReq#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // SiPortReq
