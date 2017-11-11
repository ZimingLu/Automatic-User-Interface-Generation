/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pad Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.PadType#getLib <em>Lib</em>}</li>
 *   <li>{@link model.PadType#getType <em>Type</em>}</li>
 *   <li>{@link model.PadType#getDriverStrength <em>Driver Strength</em>}</li>
 *   <li>{@link model.PadType#getSet <em>Set</em>}</li>
 *   <li>{@link model.PadType#getWidth <em>Width</em>}</li>
 *   <li>{@link model.PadType#getSpec <em>Spec</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getPadType()
 * @model extendedMetaData="name='PadType' kind='elementOnly'"
 * @generated
 */
public interface PadType extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>Lib</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lib</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lib</em>' attribute.
	 * @see #setLib(String)
	 * @see model.ModelPackage#getPadType_Lib()
	 * @model dataType="model.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Lib' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLib();

	/**
	 * Sets the value of the '{@link model.PadType#getLib <em>Lib</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lib</em>' attribute.
	 * @see #getLib()
	 * @generated
	 */
	void setLib(String value);

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
	 * @see model.ModelPackage#getPadType_Type()
	 * @model dataType="model.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link model.PadType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see model.ModelPackage#getPadType_DriverStrength()
	 * @model dataType="model.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='DriverStrength' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDriverStrength();

	/**
	 * Sets the value of the '{@link model.PadType#getDriverStrength <em>Driver Strength</em>}' attribute.
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
	 * @see model.ModelPackage#getPadType_Set()
	 * @model dataType="model.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Set' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSet();

	/**
	 * Sets the value of the '{@link model.PadType#getSet <em>Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' attribute.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see model.ModelPackage#getPadType_Width()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Width' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link model.PadType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

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
	 * @see model.ModelPackage#getPadType_Spec()
	 * @model dataType="model.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Spec' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSpec();

	/**
	 * Sets the value of the '{@link model.PadType#getSpec <em>Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec</em>' attribute.
	 * @see #getSpec()
	 * @generated
	 */
	void setSpec(String value);

} // PadType
