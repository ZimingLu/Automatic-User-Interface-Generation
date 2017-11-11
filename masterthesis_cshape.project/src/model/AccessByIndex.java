/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access By Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.AccessByIndex#isAscending <em>Ascending</em>}</li>
 *   <li>{@link model.AccessByIndex#getLeft <em>Left</em>}</li>
 *   <li>{@link model.AccessByIndex#getRight <em>Right</em>}</li>
 *   <li>{@link model.AccessByIndex#getSimpleSubElementAccess <em>Simple Sub Element Access</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getAccessByIndex()
 * @model extendedMetaData="name='AccessByIndex' kind='elementOnly'"
 * @generated
 */
public interface AccessByIndex extends SimpleSubElementAccess {
	/**
	 * Returns the value of the '<em><b>Ascending</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ascending</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ascending</em>' attribute.
	 * @see #setAscending(boolean)
	 * @see model.ModelPackage#getAccessByIndex_Ascending()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='Ascending' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAscending();

	/**
	 * Sets the value of the '{@link model.AccessByIndex#isAscending <em>Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ascending</em>' attribute.
	 * @see #isAscending()
	 * @generated
	 */
	void setAscending(boolean value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' attribute.
	 * @see #setLeft(String)
	 * @see model.ModelPackage#getAccessByIndex_Left()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Left' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLeft();

	/**
	 * Sets the value of the '{@link model.AccessByIndex#getLeft <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' attribute.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(String value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' attribute.
	 * @see #setRight(String)
	 * @see model.ModelPackage#getAccessByIndex_Right()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Right' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRight();

	/**
	 * Sets the value of the '{@link model.AccessByIndex#getRight <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' attribute.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(String value);

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
	 * @see model.ModelPackage#getAccessByIndex_SimpleSubElementAccess()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SimpleSubElementAccess' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleSubElementAccess getSimpleSubElementAccess();

	/**
	 * Sets the value of the '{@link model.AccessByIndex#getSimpleSubElementAccess <em>Simple Sub Element Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Sub Element Access</em>' containment reference.
	 * @see #getSimpleSubElementAccess()
	 * @generated
	 */
	void setSimpleSubElementAccess(SimpleSubElementAccess value);

} // AccessByIndex
