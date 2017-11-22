/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.AccessLevel#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link Essence.AccessLevel#getAccessType <em>Access Type</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getAccessLevel()
 * @model extendedMetaData="name='AccessLevel' kind='elementOnly'"
 * @generated
 */
public interface AccessLevel extends IndexVarUser {
	/**
	 * Returns the value of the '<em><b>Access Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Level</em>' attribute.
	 * @see #setAccessLevel(String)
	 * @see Essence.EssencePackage#getAccessLevel_AccessLevel()
	 * @model dataType="Essence.IntegerLiteral" required="true"
	 *        extendedMetaData="kind='element' name='AccessLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccessLevel();

	/**
	 * Sets the value of the '{@link Essence.AccessLevel#getAccessLevel <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Level</em>' attribute.
	 * @see #getAccessLevel()
	 * @generated
	 */
	void setAccessLevel(String value);

	/**
	 * Returns the value of the '<em><b>Access Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Essence.AccessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Type</em>' attribute.
	 * @see Essence.AccessType
	 * @see #isSetAccessType()
	 * @see #unsetAccessType()
	 * @see #setAccessType(AccessType)
	 * @see Essence.EssencePackage#getAccessLevel_AccessType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='AccessType' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessType getAccessType();

	/**
	 * Sets the value of the '{@link Essence.AccessLevel#getAccessType <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type</em>' attribute.
	 * @see Essence.AccessType
	 * @see #isSetAccessType()
	 * @see #unsetAccessType()
	 * @see #getAccessType()
	 * @generated
	 */
	void setAccessType(AccessType value);

	/**
	 * Unsets the value of the '{@link Essence.AccessLevel#getAccessType <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccessType()
	 * @see #getAccessType()
	 * @see #setAccessType(AccessType)
	 * @generated
	 */
	void unsetAccessType();

	/**
	 * Returns whether the value of the '{@link Essence.AccessLevel#getAccessType <em>Access Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Access Type</em>' attribute is set.
	 * @see #unsetAccessType()
	 * @see #getAccessType()
	 * @see #setAccessType(AccessType)
	 * @generated
	 */
	boolean isSetAccessType();

} // AccessLevel
