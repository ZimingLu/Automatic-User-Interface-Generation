/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.ValueDataType#getSignInterpretation <em>Sign Interpretation</em>}</li>
 *   <li>{@link Essence.ValueDataType#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link Essence.ValueDataType#getVector <em>Vector</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getValueDataType()
 * @model abstract="true"
 *        extendedMetaData="name='ValueDataType' kind='elementOnly'"
 * @generated
 */
public interface ValueDataType extends ReturnDataType {
	/**
	 * Returns the value of the '<em><b>Sign Interpretation</b></em>' attribute.
	 * The literals are from the enumeration {@link Essence.SignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sign Interpretation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign Interpretation</em>' attribute.
	 * @see Essence.SignType
	 * @see #isSetSignInterpretation()
	 * @see #unsetSignInterpretation()
	 * @see #setSignInterpretation(SignType)
	 * @see Essence.EssencePackage#getValueDataType_SignInterpretation()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='SignInterpretation' namespace='##targetNamespace'"
	 * @generated
	 */
	SignType getSignInterpretation();

	/**
	 * Sets the value of the '{@link Essence.ValueDataType#getSignInterpretation <em>Sign Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign Interpretation</em>' attribute.
	 * @see Essence.SignType
	 * @see #isSetSignInterpretation()
	 * @see #unsetSignInterpretation()
	 * @see #getSignInterpretation()
	 * @generated
	 */
	void setSignInterpretation(SignType value);

	/**
	 * Unsets the value of the '{@link Essence.ValueDataType#getSignInterpretation <em>Sign Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignInterpretation()
	 * @see #getSignInterpretation()
	 * @see #setSignInterpretation(SignType)
	 * @generated
	 */
	void unsetSignInterpretation();

	/**
	 * Returns whether the value of the '{@link Essence.ValueDataType#getSignInterpretation <em>Sign Interpretation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sign Interpretation</em>' attribute is set.
	 * @see #unsetSignInterpretation()
	 * @see #getSignInterpretation()
	 * @see #setSignInterpretation(SignType)
	 * @generated
	 */
	boolean isSetSignInterpretation();

	/**
	 * Returns the value of the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * dig
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Type</em>' attribute.
	 * @see #setObjectType(String)
	 * @see Essence.EssencePackage#getValueDataType_ObjectType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ObjectType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getObjectType();

	/**
	 * Sets the value of the '{@link Essence.ValueDataType#getObjectType <em>Object Type</em>}' attribute.
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
	 * @see Essence.EssencePackage#getValueDataType_Vector()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vector' namespace='##targetNamespace'"
	 * @generated
	 */
	ArrayDimension getVector();

	/**
	 * Sets the value of the '{@link Essence.ValueDataType#getVector <em>Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector</em>' containment reference.
	 * @see #getVector()
	 * @generated
	 */
	void setVector(ArrayDimension value);

} // ValueDataType
