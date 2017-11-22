/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access By Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.AccessByIndex#isAscending <em>Ascending</em>}</li>
 *   <li>{@link Essence.AccessByIndex#getLeft <em>Left</em>}</li>
 *   <li>{@link Essence.AccessByIndex#getRight <em>Right</em>}</li>
 *   <li>{@link Essence.AccessByIndex#getSimpleSubElementAccess <em>Simple Sub Element Access</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getAccessByIndex()
 * @model extendedMetaData="name='AccessByIndex' kind='elementOnly'"
 * @generated
 */
public interface AccessByIndex extends SimpleSubElementAccess {
	/**
	 * Returns the value of the '<em><b>Ascending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ascending</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ascending</em>' attribute.
	 * @see #isSetAscending()
	 * @see #unsetAscending()
	 * @see #setAscending(boolean)
	 * @see Essence.EssencePackage#getAccessByIndex_Ascending()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='Ascending' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAscending();

	/**
	 * Sets the value of the '{@link Essence.AccessByIndex#isAscending <em>Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ascending</em>' attribute.
	 * @see #isSetAscending()
	 * @see #unsetAscending()
	 * @see #isAscending()
	 * @generated
	 */
	void setAscending(boolean value);

	/**
	 * Unsets the value of the '{@link Essence.AccessByIndex#isAscending <em>Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAscending()
	 * @see #isAscending()
	 * @see #setAscending(boolean)
	 * @generated
	 */
	void unsetAscending();

	/**
	 * Returns whether the value of the '{@link Essence.AccessByIndex#isAscending <em>Ascending</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ascending</em>' attribute is set.
	 * @see #unsetAscending()
	 * @see #isAscending()
	 * @see #setAscending(boolean)
	 * @generated
	 */
	boolean isSetAscending();

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
	 * @see Essence.EssencePackage#getAccessByIndex_Left()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Left' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLeft();

	/**
	 * Sets the value of the '{@link Essence.AccessByIndex#getLeft <em>Left</em>}' attribute.
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
	 * @see Essence.EssencePackage#getAccessByIndex_Right()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Right' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRight();

	/**
	 * Sets the value of the '{@link Essence.AccessByIndex#getRight <em>Right</em>}' attribute.
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
	 * @see Essence.EssencePackage#getAccessByIndex_SimpleSubElementAccess()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SimpleSubElementAccess' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleSubElementAccess getSimpleSubElementAccess();

	/**
	 * Sets the value of the '{@link Essence.AccessByIndex#getSimpleSubElementAccess <em>Simple Sub Element Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Sub Element Access</em>' containment reference.
	 * @see #getSimpleSubElementAccess()
	 * @generated
	 */
	void setSimpleSubElementAccess(SimpleSubElementAccess value);

} // AccessByIndex
