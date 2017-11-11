/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reset Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.ResetType#getResetLevel <em>Reset Level</em>}</li>
 *   <li>{@link model.ResetType#getResetMask <em>Reset Mask</em>}</li>
 *   <li>{@link model.ResetType#getResetMode <em>Reset Mode</em>}</li>
 *   <li>{@link model.ResetType#getResetType <em>Reset Type</em>}</li>
 *   <li>{@link model.ResetType#getResetValue <em>Reset Value</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getResetType()
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
	 * @see model.ModelPackage#getResetType_ResetLevel()
	 * @model dataType="model.IntegerLiteral" required="true"
	 *        extendedMetaData="kind='element' name='ResetLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResetLevel();

	/**
	 * Sets the value of the '{@link model.ResetType#getResetLevel <em>Reset Level</em>}' attribute.
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
	 * @see model.ModelPackage#getResetType_ResetMask()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='ResetMask' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResetMask();

	/**
	 * Sets the value of the '{@link model.ResetType#getResetMask <em>Reset Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Mask</em>' attribute.
	 * @see #getResetMask()
	 * @generated
	 */
	void setResetMask(String value);

	/**
	 * Returns the value of the '<em><b>Reset Mode</b></em>' attribute.
	 * The default value is <code>"asynchronous"</code>.
	 * The literals are from the enumeration {@link model.SyncMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Mode</em>' attribute.
	 * @see model.SyncMode
	 * @see #isSetResetMode()
	 * @see #unsetResetMode()
	 * @see #setResetMode(SyncMode)
	 * @see model.ModelPackage#getResetType_ResetMode()
	 * @model default="asynchronous" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ResetMode' namespace='##targetNamespace'"
	 * @generated
	 */
	SyncMode getResetMode();

	/**
	 * Sets the value of the '{@link model.ResetType#getResetMode <em>Reset Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Mode</em>' attribute.
	 * @see model.SyncMode
	 * @see #isSetResetMode()
	 * @see #unsetResetMode()
	 * @see #getResetMode()
	 * @generated
	 */
	void setResetMode(SyncMode value);

	/**
	 * Unsets the value of the '{@link model.ResetType#getResetMode <em>Reset Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResetMode()
	 * @see #getResetMode()
	 * @see #setResetMode(SyncMode)
	 * @generated
	 */
	void unsetResetMode();

	/**
	 * Returns whether the value of the '{@link model.ResetType#getResetMode <em>Reset Mode</em>}' attribute is set.
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
	 * @see model.ModelPackage#getResetType_ResetType()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='ResetType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResetType();

	/**
	 * Sets the value of the '{@link model.ResetType#getResetType <em>Reset Type</em>}' attribute.
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
	 * @see model.ModelPackage#getResetType_ResetValue()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='ResetValue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getResetValue();

	/**
	 * Sets the value of the '{@link model.ResetType#getResetValue <em>Reset Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Value</em>' attribute.
	 * @see #getResetValue()
	 * @generated
	 */
	void setResetValue(String value);

} // ResetType
