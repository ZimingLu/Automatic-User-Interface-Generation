/**
 */
package model;

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
 *   <li>{@link model.MethodDataType#getReturnDataType <em>Return Data Type</em>}</li>
 *   <li>{@link model.MethodDataType#isReference <em>Reference</em>}</li>
 *   <li>{@link model.MethodDataType#getMethodDataTypeElement <em>Method Data Type Element</em>}</li>
 *   <li>{@link model.MethodDataType#isCheckVoid <em>Check Void</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getMethodDataType()
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
	 * @see model.ModelPackage#getMethodDataType_ReturnDataType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ReturnDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ReturnDataType getReturnDataType();

	/**
	 * Sets the value of the '{@link model.MethodDataType#getReturnDataType <em>Return Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Data Type</em>' containment reference.
	 * @see #getReturnDataType()
	 * @generated
	 */
	void setReturnDataType(ReturnDataType value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(boolean)
	 * @see model.ModelPackage#getMethodDataType_Reference()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='Reference' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isReference();

	/**
	 * Sets the value of the '{@link model.MethodDataType#isReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #isReference()
	 * @generated
	 */
	void setReference(boolean value);

	/**
	 * Returns the value of the '<em><b>Method Data Type Element</b></em>' containment reference list.
	 * The list contents are of type {@link model.MethodDataTypeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Data Type Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Data Type Element</em>' containment reference list.
	 * @see model.ModelPackage#getMethodDataType_MethodDataTypeElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MethodDataTypeElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MethodDataTypeElement> getMethodDataTypeElement();

	/**
	 * Returns the value of the '<em><b>Check Void</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Void</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Void</em>' attribute.
	 * @see model.ModelPackage#getMethodDataType_CheckVoid()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='if (this.getReturnDataType() instanceof com.infineon.essence.model.SimpleDataType)\n\t\t    return true;\n\t\treturn false;'"
	 * @generated
	 */
	boolean isCheckVoid();

} // MethodDataType
