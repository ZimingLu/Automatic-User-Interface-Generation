/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Pad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.GeneralPad#getXRefPadType <em>XRef Pad Type</em>}</li>
 *   <li>{@link model.GeneralPad#getLib <em>Lib</em>}</li>
 *   <li>{@link model.GeneralPad#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getGeneralPad()
 * @model abstract="true"
 *        extendedMetaData="name='GeneralPad' kind='elementOnly'"
 * @generated
 */
public interface GeneralPad extends SinglePad {
	/**
	 * Returns the value of the '<em><b>XRef Pad Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Pad Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Pad Type</em>' containment reference.
	 * @see #setXRefPadType(XRefPadType)
	 * @see model.ModelPackage#getGeneralPad_XRefPadType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefPadType' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefPadType getXRefPadType();

	/**
	 * Sets the value of the '{@link model.GeneralPad#getXRefPadType <em>XRef Pad Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Pad Type</em>' containment reference.
	 * @see #getXRefPadType()
	 * @generated
	 */
	void setXRefPadType(XRefPadType value);

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
	 * @see model.ModelPackage#getGeneralPad_Lib()
	 * @model dataType="model.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Lib' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLib();

	/**
	 * Sets the value of the '{@link model.GeneralPad#getLib <em>Lib</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lib</em>' attribute.
	 * @see #getLib()
	 * @generated
	 */
	void setLib(String value);

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
	 * @see model.ModelPackage#getGeneralPad_Width()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Width' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link model.GeneralPad#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

} // GeneralPad
