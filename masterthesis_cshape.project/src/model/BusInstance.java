/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.BusInstance#getBusInterfaceMap <em>Bus Interface Map</em>}</li>
 *   <li>{@link model.BusInstance#getBusNoneInterfaceMap <em>Bus None Interface Map</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getBusInstance()
 * @model extendedMetaData="name='BusInstance' kind='elementOnly'"
 * @generated
 */
public interface BusInstance extends Instance {
	/**
	 * Returns the value of the '<em><b>Bus Interface Map</b></em>' containment reference list.
	 * The list contents are of type {@link model.BusInterfaceMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Interface Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Interface Map</em>' containment reference list.
	 * @see model.ModelPackage#getBusInstance_BusInterfaceMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BusInterfaceMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BusInterfaceMap> getBusInterfaceMap();

	/**
	 * Returns the value of the '<em><b>Bus None Interface Map</b></em>' containment reference list.
	 * The list contents are of type {@link model.BusNoneInterfaceMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus None Interface Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus None Interface Map</em>' containment reference list.
	 * @see model.ModelPackage#getBusInstance_BusNoneInterfaceMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BusNoneInterfaceMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BusNoneInterfaceMap> getBusNoneInterfaceMap();

} // BusInstance
