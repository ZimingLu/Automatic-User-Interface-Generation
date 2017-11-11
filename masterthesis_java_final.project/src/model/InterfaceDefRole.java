/**
 */
package model;

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
 *   <li>{@link model.InterfaceDefRole#getRole <em>Role</em>}</li>
 *   <li>{@link model.InterfaceDefRole#getSystemGroup <em>System Group</em>}</li>
 *   <li>{@link model.InterfaceDefRole#getInterfaceDefPort <em>Interface Def Port</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getInterfaceDefRole()
 * @model extendedMetaData="name='InterfaceDefRole' kind='elementOnly'"
 * @generated
 */
public interface InterfaceDefRole extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The default value is <code>"Master"</code>.
	 * The literals are from the enumeration {@link model.InterfaceDefRoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see model.InterfaceDefRoleType
	 * @see #setRole(InterfaceDefRoleType)
	 * @see model.ModelPackage#getInterfaceDefRole_Role()
	 * @model default="Master" required="true"
	 *        extendedMetaData="kind='element' name='Role' namespace='##targetNamespace'"
	 * @generated
	 */
	InterfaceDefRoleType getRole();

	/**
	 * Sets the value of the '{@link model.InterfaceDefRole#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see model.InterfaceDefRoleType
	 * @see #getRole()
	 * @generated
	 */
	void setRole(InterfaceDefRoleType value);

	/**
	 * Returns the value of the '<em><b>System Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Group</em>' attribute.
	 * @see #isSetSystemGroup()
	 * @see #unsetSystemGroup()
	 * @see #setSystemGroup(String)
	 * @see model.ModelPackage#getInterfaceDefRole_SystemGroup()
	 * @model unsettable="true" dataType="model.StringLiteral"
	 *        extendedMetaData="kind='element' name='SystemGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSystemGroup();

	/**
	 * Sets the value of the '{@link model.InterfaceDefRole#getSystemGroup <em>System Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Group</em>' attribute.
	 * @see #isSetSystemGroup()
	 * @see #unsetSystemGroup()
	 * @see #getSystemGroup()
	 * @generated
	 */
	void setSystemGroup(String value);

	/**
	 * Unsets the value of the '{@link model.InterfaceDefRole#getSystemGroup <em>System Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSystemGroup()
	 * @see #getSystemGroup()
	 * @see #setSystemGroup(String)
	 * @generated
	 */
	void unsetSystemGroup();

	/**
	 * Returns whether the value of the '{@link model.InterfaceDefRole#getSystemGroup <em>System Group</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>System Group</em>' attribute is set.
	 * @see #unsetSystemGroup()
	 * @see #getSystemGroup()
	 * @see #setSystemGroup(String)
	 * @generated
	 */
	boolean isSetSystemGroup();

	/**
	 * Returns the value of the '<em><b>Interface Def Port</b></em>' containment reference list.
	 * The list contents are of type {@link model.InterfaceDefPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Def Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Def Port</em>' containment reference list.
	 * @see model.ModelPackage#getInterfaceDefRole_InterfaceDefPort()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InterfaceDefPort' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterfaceDefPort> getInterfaceDefPort();

} // InterfaceDefRole
