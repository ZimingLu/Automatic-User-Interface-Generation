/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Def Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.InterfaceDefRole#getRole <em>Role</em>}</li>
 *   <li>{@link Essence.InterfaceDefRole#getSystemGroup <em>System Group</em>}</li>
 *   <li>{@link Essence.InterfaceDefRole#getInterfaceDefPort <em>Interface Def Port</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getInterfaceDefRole()
 * @model extendedMetaData="name='InterfaceDefRole' kind='elementOnly'"
 * @generated
 */
public interface InterfaceDefRole extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link Essence.InterfaceDefRoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see Essence.InterfaceDefRoleType
	 * @see #isSetRole()
	 * @see #unsetRole()
	 * @see #setRole(InterfaceDefRoleType)
	 * @see Essence.EssencePackage#getInterfaceDefRole_Role()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Role' namespace='##targetNamespace'"
	 * @generated
	 */
	InterfaceDefRoleType getRole();

	/**
	 * Sets the value of the '{@link Essence.InterfaceDefRole#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see Essence.InterfaceDefRoleType
	 * @see #isSetRole()
	 * @see #unsetRole()
	 * @see #getRole()
	 * @generated
	 */
	void setRole(InterfaceDefRoleType value);

	/**
	 * Unsets the value of the '{@link Essence.InterfaceDefRole#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRole()
	 * @see #getRole()
	 * @see #setRole(InterfaceDefRoleType)
	 * @generated
	 */
	void unsetRole();

	/**
	 * Returns whether the value of the '{@link Essence.InterfaceDefRole#getRole <em>Role</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Role</em>' attribute is set.
	 * @see #unsetRole()
	 * @see #getRole()
	 * @see #setRole(InterfaceDefRoleType)
	 * @generated
	 */
	boolean isSetRole();

	/**
	 * Returns the value of the '<em><b>System Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Group</em>' attribute.
	 * @see #setSystemGroup(String)
	 * @see Essence.EssencePackage#getInterfaceDefRole_SystemGroup()
	 * @model dataType="Essence.StringLiteral"
	 *        extendedMetaData="kind='element' name='SystemGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSystemGroup();

	/**
	 * Sets the value of the '{@link Essence.InterfaceDefRole#getSystemGroup <em>System Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Group</em>' attribute.
	 * @see #getSystemGroup()
	 * @generated
	 */
	void setSystemGroup(String value);

	/**
	 * Returns the value of the '<em><b>Interface Def Port</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.InterfaceDefPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Def Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Def Port</em>' containment reference list.
	 * @see Essence.EssencePackage#getInterfaceDefRole_InterfaceDefPort()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InterfaceDefPort' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterfaceDefPort> getInterfaceDefPort();

} // InterfaceDefRole
