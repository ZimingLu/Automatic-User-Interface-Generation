/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reset Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.ResetType#getResetLevel <em>Reset Level</em>}</li>
 *   <li>{@link Essence.ResetType#getResetMask <em>Reset Mask</em>}</li>
 *   <li>{@link Essence.ResetType#getResetMode <em>Reset Mode</em>}</li>
 *   <li>{@link Essence.ResetType#getResetType <em>Reset Type</em>}</li>
 *   <li>{@link Essence.ResetType#getResetValue <em>Reset Value</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getResetType()
 * @model extendedMetaData="name='ResetType' kind='elementOnly'"
 * @generated
 */
public interface ResetType extends IndexVarUser {
	/**
	 * Returns the value of the '<em><b>Reset Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Level</em>' attribute.
	 * @see #setResetLevel(String)
	 * @see Essence.EssencePackage#getResetType_ResetLevel()
	 * @model dataType="Essence.IntegerLiteral" required="true"
	 *        extendedMetaData="kind='element' name='ResetLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResetLevel();

	/**
	 * Sets the value of the '{@link Essence.ResetType#getResetLevel <em>Reset Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Level</em>' attribute.
	 * @see #getResetLevel()
	 * @generated
	 */
	void setResetLevel(String value);

	/**
	 * Returns the value of the '<em><b>Reset Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Mask</em>' attribute.
	 * @see #setResetMask(String)
	 * @see Essence.EssencePackage#getResetType_ResetMask()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='ResetMask' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResetMask();

	/**
	 * Sets the value of the '{@link Essence.ResetType#getResetMask <em>Reset Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Mask</em>' attribute.
	 * @see #getResetMask()
	 * @generated
	 */
	void setResetMask(String value);

	/**
	 * Returns the value of the '<em><b>Reset Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link Essence.SyncMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Mode</em>' attribute.
	 * @see Essence.SyncMode
	 * @see #isSetResetMode()
	 * @see #unsetResetMode()
	 * @see #setResetMode(SyncMode)
	 * @see Essence.EssencePackage#getResetType_ResetMode()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ResetMode' namespace='##targetNamespace'"
	 * @generated
	 */
	SyncMode getResetMode();

	/**
	 * Sets the value of the '{@link Essence.ResetType#getResetMode <em>Reset Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Mode</em>' attribute.
	 * @see Essence.SyncMode
	 * @see #isSetResetMode()
	 * @see #unsetResetMode()
	 * @see #getResetMode()
	 * @generated
	 */
	void setResetMode(SyncMode value);

	/**
	 * Unsets the value of the '{@link Essence.ResetType#getResetMode <em>Reset Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResetMode()
	 * @see #getResetMode()
	 * @see #setResetMode(SyncMode)
	 * @generated
	 */
	void unsetResetMode();

	/**
	 * Returns whether the value of the '{@link Essence.ResetType#getResetMode <em>Reset Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reset Mode</em>' attribute is set.
	 * @see #unsetResetMode()
	 * @see #getResetMode()
	 * @see #setResetMode(SyncMode)
	 * @generated
	 */
	boolean isSetResetMode();

	/**
	 * Returns the value of the '<em><b>Reset Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Type</em>' attribute.
	 * @see #setResetType(String)
	 * @see Essence.EssencePackage#getResetType_ResetType()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='ResetType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResetType();

	/**
	 * Sets the value of the '{@link Essence.ResetType#getResetType <em>Reset Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Type</em>' attribute.
	 * @see #getResetType()
	 * @generated
	 */
	void setResetType(String value);

	/**
	 * Returns the value of the '<em><b>Reset Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Value</em>' attribute.
	 * @see #setResetValue(String)
	 * @see Essence.EssencePackage#getResetType_ResetValue()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='ResetValue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResetValue();

	/**
	 * Sets the value of the '{@link Essence.ResetType#getResetValue <em>Reset Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Value</em>' attribute.
	 * @see #getResetValue()
	 * @generated
	 */
	void setResetValue(String value);

} // ResetType
