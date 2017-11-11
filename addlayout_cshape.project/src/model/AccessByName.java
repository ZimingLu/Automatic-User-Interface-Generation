/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access By Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.AccessByName#getName <em>Name</em>}</li>
 *   <li>{@link model.AccessByName#getSimpleSubElementAccess <em>Simple Sub Element Access</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getAccessByName()
 * @model extendedMetaData="name='AccessByName' kind='elementOnly'"
 * @generated
 */
public interface AccessByName extends SimpleSubElementAccess {
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
	 * @see model.ModelPackage#getAccessByName_Name()
	 * @model dataType="model.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.AccessByName#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Simple Sub Element Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Sub Element Access</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Sub Element Access</em>' containment reference.
	 * @see #setSimpleSubElementAccess(SimpleSubElementAccess)
	 * @see model.ModelPackage#getAccessByName_SimpleSubElementAccess()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SimpleSubElementAccess' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleSubElementAccess getSimpleSubElementAccess();

	/**
	 * Sets the value of the '{@link model.AccessByName#getSimpleSubElementAccess <em>Simple Sub Element Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Sub Element Access</em>' containment reference.
	 * @see #getSimpleSubElementAccess()
	 * @generated
	 */
	void setSimpleSubElementAccess(SimpleSubElementAccess value);

} // AccessByName
