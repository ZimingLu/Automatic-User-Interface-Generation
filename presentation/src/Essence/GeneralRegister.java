/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Register</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.GeneralRegister#isNoShadow <em>No Shadow</em>}</li>
 *   <li>{@link Essence.GeneralRegister#getResetType <em>Reset Type</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getGeneralRegister()
 * @model abstract="true"
 *        extendedMetaData="name='GeneralRegister' kind='elementOnly'"
 * @generated
 */
public interface GeneralRegister extends SequenceElement {
	/**
	 * Returns the value of the '<em><b>No Shadow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * true
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Shadow</em>' attribute.
	 * @see #isSetNoShadow()
	 * @see #unsetNoShadow()
	 * @see #setNoShadow(boolean)
	 * @see Essence.EssencePackage#getGeneralRegister_NoShadow()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='NoShadow' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isNoShadow();

	/**
	 * Sets the value of the '{@link Essence.GeneralRegister#isNoShadow <em>No Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Shadow</em>' attribute.
	 * @see #isSetNoShadow()
	 * @see #unsetNoShadow()
	 * @see #isNoShadow()
	 * @generated
	 */
	void setNoShadow(boolean value);

	/**
	 * Unsets the value of the '{@link Essence.GeneralRegister#isNoShadow <em>No Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNoShadow()
	 * @see #isNoShadow()
	 * @see #setNoShadow(boolean)
	 * @generated
	 */
	void unsetNoShadow();

	/**
	 * Returns whether the value of the '{@link Essence.GeneralRegister#isNoShadow <em>No Shadow</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>No Shadow</em>' attribute is set.
	 * @see #unsetNoShadow()
	 * @see #isNoShadow()
	 * @see #setNoShadow(boolean)
	 * @generated
	 */
	boolean isSetNoShadow();

	/**
	 * Returns the value of the '<em><b>Reset Type</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.ResetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Type</em>' containment reference list.
	 * @see Essence.EssencePackage#getGeneralRegister_ResetType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ResetType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResetType> getResetType();

} // GeneralRegister
