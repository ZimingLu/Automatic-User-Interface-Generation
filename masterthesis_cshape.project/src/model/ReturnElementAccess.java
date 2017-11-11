/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Element Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.ReturnElementAccess#getSimpleSubElementAccess <em>Simple Sub Element Access</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getReturnElementAccess()
 * @model extendedMetaData="name='ReturnElementAccess' kind='elementOnly'"
 * @generated
 */
public interface ReturnElementAccess extends SubElementAccess {
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
	 * @see model.ModelPackage#getReturnElementAccess_SimpleSubElementAccess()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SimpleSubElementAccess' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleSubElementAccess getSimpleSubElementAccess();

	/**
	 * Sets the value of the '{@link model.ReturnElementAccess#getSimpleSubElementAccess <em>Simple Sub Element Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Sub Element Access</em>' containment reference.
	 * @see #getSimpleSubElementAccess()
	 * @generated
	 */
	void setSimpleSubElementAccess(SimpleSubElementAccess value);

} // ReturnElementAccess
