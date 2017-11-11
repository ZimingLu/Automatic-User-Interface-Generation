/**
 */
package model;

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
 *   <li>{@link model.GeneralRegister#isNoShadow <em>No Shadow</em>}</li>
 *   <li>{@link model.GeneralRegister#getResetType <em>Reset Type</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getGeneralRegister()
 * @model abstract="true"
 *        extendedMetaData="name='GeneralRegister' kind='elementOnly'"
 * @generated
 */
public interface GeneralRegister extends SequenceElement {
	/**
	 * Returns the value of the '<em><b>No Shadow</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * true
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Shadow</em>' attribute.
	 * @see #setNoShadow(boolean)
	 * @see model.ModelPackage#getGeneralRegister_NoShadow()
	 * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='NoShadow' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isNoShadow();

	/**
	 * Sets the value of the '{@link model.GeneralRegister#isNoShadow <em>No Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Shadow</em>' attribute.
	 * @see #isNoShadow()
	 * @generated
	 */
	void setNoShadow(boolean value);

	/**
	 * Returns the value of the '<em><b>Reset Type</b></em>' containment reference list.
	 * The list contents are of type {@link model.ResetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Type</em>' containment reference list.
	 * @see model.ModelPackage#getGeneralRegister_ResetType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ResetType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ResetType> getResetType();

} // GeneralRegister
