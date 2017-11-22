/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Shell Interface Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.InstanceShellInterfaceMap#getXRefInstanceShellInterface <em>XRef Instance Shell Interface</em>}</li>
 *   <li>{@link Essence.InstanceShellInterfaceMap#getXRefConnection <em>XRef Connection</em>}</li>
 *   <li>{@link Essence.InstanceShellInterfaceMap#getInstanceShellPortMap <em>Instance Shell Port Map</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getInstanceShellInterfaceMap()
 * @model extendedMetaData="name='InstanceShellInterfaceMap' kind='elementOnly'"
 * @generated
 */
public interface InstanceShellInterfaceMap extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>XRef Instance Shell Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Instance Shell Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Instance Shell Interface</em>' containment reference.
	 * @see #setXRefInstanceShellInterface(XRefIndInterface)
	 * @see Essence.EssencePackage#getInstanceShellInterfaceMap_XRefInstanceShellInterface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefInstanceShellInterface' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefIndInterface getXRefInstanceShellInterface();

	/**
	 * Sets the value of the '{@link Essence.InstanceShellInterfaceMap#getXRefInstanceShellInterface <em>XRef Instance Shell Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Instance Shell Interface</em>' containment reference.
	 * @see #getXRefInstanceShellInterface()
	 * @generated
	 */
	void setXRefInstanceShellInterface(XRefIndInterface value);

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
	 * @see Essence.EssencePackage#getInstanceShellInterfaceMap_XRefConnection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefConnection' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefConnection getXRefConnection();

	/**
	 * Sets the value of the '{@link Essence.InstanceShellInterfaceMap#getXRefConnection <em>XRef Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Connection</em>' containment reference.
	 * @see #getXRefConnection()
	 * @generated
	 */
	void setXRefConnection(XRefConnection value);

	/**
	 * Returns the value of the '<em><b>Instance Shell Port Map</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.InstanceShellPortMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Shell Port Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Shell Port Map</em>' containment reference list.
	 * @see Essence.EssencePackage#getInstanceShellInterfaceMap_InstanceShellPortMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InstanceShellPortMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InstanceShellPortMap> getInstanceShellPortMap();

} // InstanceShellInterfaceMap
