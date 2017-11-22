/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Def View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.InterfaceDefView#getInterfaceDefRole <em>Interface Def Role</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getInterfaceDefView()
 * @model extendedMetaData="name='InterfaceDefView' kind='elementOnly'"
 * @generated
 */
public interface InterfaceDefView extends SignalOwner {
	/**
	 * Returns the value of the '<em><b>Interface Def Role</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.InterfaceDefRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Def Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Def Role</em>' containment reference list.
	 * @see Essence.EssencePackage#getInterfaceDefView_InterfaceDefRole()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='InterfaceDefRole' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterfaceDefRole> getInterfaceDefRole();

} // InterfaceDefView
