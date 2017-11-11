/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.ValueDataType#getSignInterpretation <em>Sign Interpretation</em>}</li>
 *   <li>{@link model.ValueDataType#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link model.ValueDataType#getVector <em>Vector</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getValueDataType()
 * @model abstract="true"
 *        extendedMetaData="name='ValueDataType' kind='elementOnly'"
 * @generated
 */
public interface ValueDataType extends ReturnDataType {
	/**
	 * Returns the value of the '<em><b>Sign Interpretation</b></em>' attribute.
	 * The default value is <code>"unsigned"</code>.
	 * The literals are from the enumeration {@link model.SignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sign Interpretation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign Interpretation</em>' attribute.
	 * @see model.SignType
	 * @see #setSignInterpretation(SignType)
	 * @see model.ModelPackage#getValueDataType_SignInterpretation()
	 * @model default="unsigned" required="true"
	 *        extendedMetaData="kind='element' name='SignInterpretation' namespace='##targetNamespace'"
	 * @generated
	 */
	SignType getSignInterpretation();

	/**
	 * Sets the value of the '{@link model.ValueDataType#getSignInterpretation <em>Sign Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign Interpretation</em>' attribute.
	 * @see model.SignType
	 * @see #getSignInterpretation()
	 * @generated
	 */
	void setSignInterpretation(SignType value);

	/**
	 * Returns the value of the '<em><b>Object Type</b></em>' attribute.
	 * The default value is <code>"dig"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * dig
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Type</em>' attribute.
	 * @see #setObjectType(String)
	 * @see model.ModelPackage#getValueDataType_ObjectType()
	 * @model default="dig" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ObjectType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getObjectType();

	/**
	 * Sets the value of the '{@link model.ValueDataType#getObjectType <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type</em>' attribute.
	 * @see #getObjectType()
	 * @generated
	 */
	void setObjectType(String value);

	/**
	 * Returns the value of the '<em><b>Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector</em>' containment reference.
	 * @see #setVector(ArrayDimension)
	 * @see model.ModelPackage#getValueDataType_Vector()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vector' namespace='##targetNamespace'"
	 * @generated
	 */
	ArrayDimension getVector();

	/**
	 * Sets the value of the '{@link model.ValueDataType#getVector <em>Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector</em>' containment reference.
	 * @see #getVector()
	 * @generated
	 */
	void setVector(ArrayDimension value);

} // ValueDataType
