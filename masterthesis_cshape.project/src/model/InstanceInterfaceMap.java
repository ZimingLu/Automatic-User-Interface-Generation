/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Interface Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.InstanceInterfaceMap#getXRefInstanceInterface <em>XRef Instance Interface</em>}</li>
 *   <li>{@link model.InstanceInterfaceMap#getXRefConnection <em>XRef Connection</em>}</li>
 *   <li>{@link model.InstanceInterfaceMap#getInstancePortMap <em>Instance Port Map</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getInstanceInterfaceMap()
 * @model extendedMetaData="name='InstanceInterfaceMap' kind='elementOnly'"
 * @generated
 */
public interface InstanceInterfaceMap extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>XRef Instance Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Instance Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Instance Interface</em>' containment reference.
	 * @see #setXRefInstanceInterface(XRefExternalInterface)
	 * @see model.ModelPackage#getInstanceInterfaceMap_XRefInstanceInterface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefInstanceInterface' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefExternalInterface getXRefInstanceInterface();

	/**
	 * Sets the value of the '{@link model.InstanceInterfaceMap#getXRefInstanceInterface <em>XRef Instance Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Instance Interface</em>' containment reference.
	 * @see #getXRefInstanceInterface()
	 * @generated
	 */
	void setXRefInstanceInterface(XRefExternalInterface value);

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
	 * @see model.ModelPackage#getInstanceInterfaceMap_XRefConnection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefConnection' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefConnection getXRefConnection();

	/**
	 * Sets the value of the '{@link model.InstanceInterfaceMap#getXRefConnection <em>XRef Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Connection</em>' containment reference.
	 * @see #getXRefConnection()
	 * @generated
	 */
	void setXRefConnection(XRefConnection value);

	/**
	 * Returns the value of the '<em><b>Instance Port Map</b></em>' containment reference list.
	 * The list contents are of type {@link model.InstancePortMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Port Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Port Map</em>' containment reference list.
	 * @see model.ModelPackage#getInstanceInterfaceMap_InstancePortMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InstancePortMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InstancePortMap> getInstancePortMap();

} // InstanceInterfaceMap
