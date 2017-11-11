/**
 */
package model;

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
 *   <li>{@link model.InterfaceView#getInterfacePortMap <em>Interface Port Map</em>}</li>
 *   <li>{@link model.InterfaceView#getPort <em>Port</em>}</li>
 *   <li>{@link model.InterfaceView#getUnassignedPort <em>Unassigned Port</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getInterfaceView()
 * @model extendedMetaData="name='InterfaceView' kind='elementOnly'"
 * @generated
 */
public interface InterfaceView extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>Interface Port Map</b></em>' containment reference list.
	 * The list contents are of type {@link model.InterfacePortMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Port Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Port Map</em>' containment reference list.
	 * @see model.ModelPackage#getInterfaceView_InterfacePortMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InterfacePortMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterfacePortMap> getInterfacePortMap();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link model.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see model.ModelPackage#getInterfaceView_Port()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Port' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Port> getPort();

	/**
	 * Returns the value of the '<em><b>Unassigned Port</b></em>' reference list.
	 * The list contents are of type {@link model.InterfaceDefPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unassigned Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unassigned Port</em>' reference list.
	 * @see model.ModelPackage#getInterfaceView_UnassignedPort()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<InterfaceDefPort> getUnassignedPort();

} // InterfaceView
