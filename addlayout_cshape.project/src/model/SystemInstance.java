/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.SystemInstance#getInstanceShellInterfaceMap <em>Instance Shell Interface Map</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getSystemInstance()
 * @model extendedMetaData="name='SystemInstance' kind='elementOnly'"
 * @generated
 */
public interface SystemInstance extends InterfaceInstance {
	/**
	 * Returns the value of the '<em><b>Instance Shell Interface Map</b></em>' containment reference list.
	 * The list contents are of type {@link model.InstanceShellInterfaceMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Shell Interface Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Shell Interface Map</em>' containment reference list.
	 * @see model.ModelPackage#getSystemInstance_InstanceShellInterfaceMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InstanceShellInterfaceMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InstanceShellInterfaceMap> getInstanceShellInterfaceMap();

} // SystemInstance
