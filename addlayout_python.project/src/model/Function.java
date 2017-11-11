/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Function#getType <em>Type</em>}</li>
 *   <li>{@link model.Function#getModule <em>Module</em>}</li>
 *   <li>{@link model.Function#getXRefSignal <em>XRef Signal</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getFunction()
 * @model extendedMetaData="name='Function' kind='elementOnly'"
 * @generated
 */
public interface Function extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link model.FunctionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see model.FunctionType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(FunctionType)
	 * @see model.ModelPackage#getFunction_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	FunctionType getType();

	/**
	 * Sets the value of the '{@link model.Function#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see model.FunctionType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(FunctionType value);

	/**
	 * Unsets the value of the '{@link model.Function#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(FunctionType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link model.Function#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(FunctionType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' attribute.
	 * @see #setModule(String)
	 * @see model.ModelPackage#getFunction_Module()
	 * @model dataType="model.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Module' namespace='##targetNamespace'"
	 * @generated
	 */
	String getModule();

	/**
	 * Sets the value of the '{@link model.Function#getModule <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' attribute.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(String value);

	/**
	 * Returns the value of the '<em><b>XRef Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Signal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Signal</em>' containment reference.
	 * @see #setXRefSignal(XRefSiSignal)
	 * @see model.ModelPackage#getFunction_XRefSignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefSignal' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefSiSignal getXRefSignal();

	/**
	 * Sets the value of the '{@link model.Function#getXRefSignal <em>XRef Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Signal</em>' containment reference.
	 * @see #getXRefSignal()
	 * @generated
	 */
	void setXRefSignal(XRefSiSignal value);

} // Function
