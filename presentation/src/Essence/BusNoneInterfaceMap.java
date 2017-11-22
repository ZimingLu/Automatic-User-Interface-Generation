/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus None Interface Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.BusNoneInterfaceMap#getXRefBusNoneInterface <em>XRef Bus None Interface</em>}</li>
 *   <li>{@link Essence.BusNoneInterfaceMap#getXRefConnection <em>XRef Connection</em>}</li>
 *   <li>{@link Essence.BusNoneInterfaceMap#getInstancePortMap <em>Instance Port Map</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getBusNoneInterfaceMap()
 * @model extendedMetaData="name='BusNoneInterfaceMap' kind='elementOnly'"
 * @generated
 */
public interface BusNoneInterfaceMap extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>XRef Bus None Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Bus None Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Bus None Interface</em>' containment reference.
	 * @see #setXRefBusNoneInterface(XRefNoneInterface)
	 * @see Essence.EssencePackage#getBusNoneInterfaceMap_XRefBusNoneInterface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefBusNoneInterface' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefNoneInterface getXRefBusNoneInterface();

	/**
	 * Sets the value of the '{@link Essence.BusNoneInterfaceMap#getXRefBusNoneInterface <em>XRef Bus None Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Bus None Interface</em>' containment reference.
	 * @see #getXRefBusNoneInterface()
	 * @generated
	 */
	void setXRefBusNoneInterface(XRefNoneInterface value);

	/**
	 * Returns the value of the '<em><b>XRef Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Connection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Connection</em>' containment reference.
	 * @see #setXRefConnection(XRefConnection)
	 * @see Essence.EssencePackage#getBusNoneInterfaceMap_XRefConnection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefConnection' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefConnection getXRefConnection();

	/**
	 * Sets the value of the '{@link Essence.BusNoneInterfaceMap#getXRefConnection <em>XRef Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Connection</em>' containment reference.
	 * @see #getXRefConnection()
	 * @generated
	 */
	void setXRefConnection(XRefConnection value);

	/**
	 * Returns the value of the '<em><b>Instance Port Map</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.InstancePortMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Port Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Port Map</em>' containment reference list.
	 * @see Essence.EssencePackage#getBusNoneInterfaceMap_InstancePortMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InstancePortMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InstancePortMap> getInstancePortMap();

} // BusNoneInterfaceMap
