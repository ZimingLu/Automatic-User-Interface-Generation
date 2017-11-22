/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Data Type Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.MethodDataTypeElement#getDataType <em>Data Type</em>}</li>
 *   <li>{@link Essence.MethodDataTypeElement#getName <em>Name</em>}</li>
 *   <li>{@link Essence.MethodDataTypeElement#isReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getMethodDataTypeElement()
 * @model extendedMetaData="name='MethodDataTypeElement' kind='elementOnly'"
 * @generated
 */
public interface MethodDataTypeElement extends EssenceBase {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference.
	 * @see #setDataType(ValueDataType)
	 * @see Essence.EssencePackage#getMethodDataTypeElement_DataType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueDataType getDataType();

	/**
	 * Sets the value of the '{@link Essence.MethodDataTypeElement#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' containment reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(ValueDataType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Essence.EssencePackage#getMethodDataTypeElement_Name()
	 * @model dataType="Essence.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Essence.MethodDataTypeElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #isSetReference()
	 * @see #unsetReference()
	 * @see #setReference(boolean)
	 * @see Essence.EssencePackage#getMethodDataTypeElement_Reference()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='Reference' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isReference();

	/**
	 * Sets the value of the '{@link Essence.MethodDataTypeElement#isReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #isSetReference()
	 * @see #unsetReference()
	 * @see #isReference()
	 * @generated
	 */
	void setReference(boolean value);

	/**
	 * Unsets the value of the '{@link Essence.MethodDataTypeElement#isReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReference()
	 * @see #isReference()
	 * @see #setReference(boolean)
	 * @generated
	 */
	void unsetReference();

	/**
	 * Returns whether the value of the '{@link Essence.MethodDataTypeElement#isReference <em>Reference</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference</em>' attribute is set.
	 * @see #unsetReference()
	 * @see #isReference()
	 * @see #setReference(boolean)
	 * @generated
	 */
	boolean isSetReference();

} // MethodDataTypeElement
