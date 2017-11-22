/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.MethodDataType#getReturnDataType <em>Return Data Type</em>}</li>
 *   <li>{@link Essence.MethodDataType#isReference <em>Reference</em>}</li>
 *   <li>{@link Essence.MethodDataType#getMethodDataTypeElement <em>Method Data Type Element</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getMethodDataType()
 * @model extendedMetaData="name='MethodDataType' kind='elementOnly'"
 * @generated
 */
public interface MethodDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Return Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Data Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Data Type</em>' containment reference.
	 * @see #setReturnDataType(ReturnDataType)
	 * @see Essence.EssencePackage#getMethodDataType_ReturnDataType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ReturnDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ReturnDataType getReturnDataType();

	/**
	 * Sets the value of the '{@link Essence.MethodDataType#getReturnDataType <em>Return Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Data Type</em>' containment reference.
	 * @see #getReturnDataType()
	 * @generated
	 */
	void setReturnDataType(ReturnDataType value);

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
	 * @see Essence.EssencePackage#getMethodDataType_Reference()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='Reference' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isReference();

	/**
	 * Sets the value of the '{@link Essence.MethodDataType#isReference <em>Reference</em>}' attribute.
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
	 * Unsets the value of the '{@link Essence.MethodDataType#isReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReference()
	 * @see #isReference()
	 * @see #setReference(boolean)
	 * @generated
	 */
	void unsetReference();

	/**
	 * Returns whether the value of the '{@link Essence.MethodDataType#isReference <em>Reference</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference</em>' attribute is set.
	 * @see #unsetReference()
	 * @see #isReference()
	 * @see #setReference(boolean)
	 * @generated
	 */
	boolean isSetReference();

	/**
	 * Returns the value of the '<em><b>Method Data Type Element</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.MethodDataTypeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Data Type Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Data Type Element</em>' containment reference list.
	 * @see Essence.EssencePackage#getMethodDataType_MethodDataTypeElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MethodDataTypeElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MethodDataTypeElement> getMethodDataTypeElement();

} // MethodDataType
