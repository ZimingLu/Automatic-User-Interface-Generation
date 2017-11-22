/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.InterfaceView#getInterfacePortMap <em>Interface Port Map</em>}</li>
 *   <li>{@link Essence.InterfaceView#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getInterfaceView()
 * @model extendedMetaData="name='InterfaceView' kind='elementOnly'"
 * @generated
 */
public interface InterfaceView extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>Interface Port Map</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.InterfacePortMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Port Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Port Map</em>' containment reference list.
	 * @see Essence.EssencePackage#getInterfaceView_InterfacePortMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InterfacePortMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterfacePortMap> getInterfacePortMap();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see Essence.EssencePackage#getInterfaceView_Port()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Port' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Port> getPort();

} // InterfaceView
