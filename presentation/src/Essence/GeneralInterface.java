/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.GeneralInterface#getInterfaceView <em>Interface View</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getGeneralInterface()
 * @model abstract="true"
 *        extendedMetaData="name='GeneralInterface' kind='elementOnly'"
 * @generated
 */
public interface GeneralInterface extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>Interface View</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.InterfaceView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface View</em>' containment reference list.
	 * @see Essence.EssencePackage#getGeneralInterface_InterfaceView()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InterfaceView' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterfaceView> getInterfaceView();

} // GeneralInterface
