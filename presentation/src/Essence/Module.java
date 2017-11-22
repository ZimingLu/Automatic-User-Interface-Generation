/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.Module#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getModule()
 * @model extendedMetaData="name='Module' kind='elementOnly'"
 * @generated
 */
public interface Module extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' containment reference list.
	 * @see Essence.EssencePackage#getModule_Module()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Module' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Module> getModule();

} // Module
