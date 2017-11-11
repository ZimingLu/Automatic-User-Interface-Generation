/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Interface Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.BusInterfaceMap#getXRefConnection <em>XRef Connection</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getBusInterfaceMap()
 * @model extendedMetaData="name='BusInterfaceMap' kind='elementOnly'"
 * @generated
 */
public interface BusInterfaceMap extends SingleSourceNode {
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
	 * @see model.ModelPackage#getBusInterfaceMap_XRefConnection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefConnection' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefConnection getXRefConnection();

	/**
	 * Sets the value of the '{@link model.BusInterfaceMap#getXRefConnection <em>XRef Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Connection</em>' containment reference.
	 * @see #getXRefConnection()
	 * @generated
	 */
	void setXRefConnection(XRefConnection value);

} // BusInterfaceMap
