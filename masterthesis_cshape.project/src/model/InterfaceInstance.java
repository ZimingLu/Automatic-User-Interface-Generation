/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.InterfaceInstance#getInstanceInterfaceMap <em>Instance Interface Map</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getInterfaceInstance()
 * @model abstract="true"
 *        extendedMetaData="name='InterfaceInstance' kind='elementOnly'"
 * @generated
 */
public interface InterfaceInstance extends Instance {
	/**
	 * Returns the value of the '<em><b>Instance Interface Map</b></em>' containment reference list.
	 * The list contents are of type {@link model.InstanceInterfaceMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Interface Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Interface Map</em>' containment reference list.
	 * @see model.ModelPackage#getInterfaceInstance_InstanceInterfaceMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InstanceInterfaceMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InstanceInterfaceMap> getInstanceInterfaceMap();

} // InterfaceInstance
