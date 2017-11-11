/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Req</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.TestReq#getDriverStrength <em>Driver Strength</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getTestReq()
 * @model extendedMetaData="name='TestReq' kind='elementOnly'"
 * @generated
 */
public interface TestReq extends EssenceBase {
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
	 * @see model.ModelPackage#getTestReq_DriverStrength()
	 * @model dataType="model.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='DriverStrength' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDriverStrength();

	/**
	 * Sets the value of the '{@link model.TestReq#getDriverStrength <em>Driver Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver Strength</em>' attribute.
	 * @see #getDriverStrength()
	 * @generated
	 */
	void setDriverStrength(String value);

} // TestReq
