/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Gen Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.StringGenDecl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link model.StringGenDecl#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getStringGenDecl()
 * @model extendedMetaData="name='StringGenDecl' kind='elementOnly'"
 * @generated
 */
public interface StringGenDecl extends GenericDecl {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see model.ModelPackage#getStringGenDecl_DefaultValue()
	 * @model dataType="model.StringLiteral" required="true"
	 *        extendedMetaData="kind='element' name='DefaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link model.StringGenDecl#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' containment reference list.
	 * The list contents are of type {@link model.EnumerationString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' containment reference list.
	 * @see model.ModelPackage#getStringGenDecl_Enumeration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Enumeration' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnumerationString> getEnumeration();

} // StringGenDecl
