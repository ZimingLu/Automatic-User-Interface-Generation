/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.Access#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link Essence.Access#getStrobeType <em>Strobe Type</em>}</li>
 *   <li>{@link Essence.Access#getActionType <em>Action Type</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getAccess()
 * @model extendedMetaData="name='Access' kind='elementOnly'"
 * @generated
 */
public interface Access extends EssenceBase {
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
	 * @see Essence.EssencePackage#getAccess_AccessType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='AccessType' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessType getAccessType();

	/**
	 * Sets the value of the '{@link Essence.Access#getAccessType <em>Access Type</em>}' attribute.
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
	 * Unsets the value of the '{@link Essence.Access#getAccessType <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccessType()
	 * @see #getAccessType()
	 * @see #setAccessType(AccessType)
	 * @generated
	 */
	void unsetAccessType();

	/**
	 * Returns whether the value of the '{@link Essence.Access#getAccessType <em>Access Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Access Type</em>' attribute is set.
	 * @see #unsetAccessType()
	 * @see #getAccessType()
	 * @see #setAccessType(AccessType)
	 * @generated
	 */
	boolean isSetAccessType();

	/**
	 * Returns the value of the '<em><b>Strobe Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Essence.StrobeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strobe Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strobe Type</em>' attribute.
	 * @see Essence.StrobeType
	 * @see #isSetStrobeType()
	 * @see #unsetStrobeType()
	 * @see #setStrobeType(StrobeType)
	 * @see Essence.EssencePackage#getAccess_StrobeType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='StrobeType' namespace='##targetNamespace'"
	 * @generated
	 */
	StrobeType getStrobeType();

	/**
	 * Sets the value of the '{@link Essence.Access#getStrobeType <em>Strobe Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strobe Type</em>' attribute.
	 * @see Essence.StrobeType
	 * @see #isSetStrobeType()
	 * @see #unsetStrobeType()
	 * @see #getStrobeType()
	 * @generated
	 */
	void setStrobeType(StrobeType value);

	/**
	 * Unsets the value of the '{@link Essence.Access#getStrobeType <em>Strobe Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrobeType()
	 * @see #getStrobeType()
	 * @see #setStrobeType(StrobeType)
	 * @generated
	 */
	void unsetStrobeType();

	/**
	 * Returns whether the value of the '{@link Essence.Access#getStrobeType <em>Strobe Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Strobe Type</em>' attribute is set.
	 * @see #unsetStrobeType()
	 * @see #getStrobeType()
	 * @see #setStrobeType(StrobeType)
	 * @generated
	 */
	boolean isSetStrobeType();

	/**
	 * Returns the value of the '<em><b>Action Type</b></em>' attribute list.
	 * The list contents are of type {@link Essence.ActionType}.
	 * The literals are from the enumeration {@link Essence.ActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Type</em>' attribute list.
	 * @see Essence.ActionType
	 * @see Essence.EssencePackage#getAccess_ActionType()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='ActionType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActionType> getActionType();

} // Access
