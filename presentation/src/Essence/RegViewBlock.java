/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reg View Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.RegViewBlock#getRegisterView <em>Register View</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getRegViewBlock()
 * @model extendedMetaData="name='RegViewBlock' kind='elementOnly'"
 * @generated
 */
public interface RegViewBlock extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>Register View</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.RegisterView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register View</em>' containment reference list.
	 * @see Essence.EssencePackage#getRegViewBlock_RegisterView()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RegisterView' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RegisterView> getRegisterView();

} // RegViewBlock
