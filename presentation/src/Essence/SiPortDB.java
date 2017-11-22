/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Si Port DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.SiPortDB#getSiPort <em>Si Port</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getSiPortDB()
 * @model extendedMetaData="name='SiPortDB' kind='elementOnly'"
 * @generated
 */
public interface SiPortDB extends ModelRoot {
	/**
	 * Returns the value of the '<em><b>Si Port</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.SiPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Si Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Si Port</em>' containment reference list.
	 * @see Essence.EssencePackage#getSiPortDB_SiPort()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SiPort' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SiPort> getSiPort();

} // SiPortDB
