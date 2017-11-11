/**
 */
package model;

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
 *   <li>{@link model.InstanceShellInterfaceMap#getXRefInstanceShellInterface <em>XRef Instance Shell Interface</em>}</li>
 *   <li>{@link model.InstanceShellInterfaceMap#getXRefConnection <em>XRef Connection</em>}</li>
 *   <li>{@link model.InstanceShellInterfaceMap#getInstanceShellPortMap <em>Instance Shell Port Map</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getInstanceShellInterfaceMap()
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
	 * @see model.ModelPackage#getInstanceShellInterfaceMap_XRefInstanceShellInterface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefInstanceShellInterface' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefIndInterface getXRefInstanceShellInterface();

	/**
	 * Sets the value of the '{@link model.InstanceShellInterfaceMap#getXRefInstanceShellInterface <em>XRef Instance Shell Interface</em>}' containment reference.
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
	 * @see model.ModelPackage#getInstanceShellInterfaceMap_XRefConnection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefConnection' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefConnection getXRefConnection();

	/**
	 * Sets the value of the '{@link model.InstanceShellInterfaceMap#getXRefConnection <em>XRef Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Connection</em>' containment reference.
	 * @see #getXRefConnection()
	 * @generated
	 */
	void setXRefConnection(XRefConnection value);

	/**
	 * Returns the value of the '<em><b>Instance Shell Port Map</b></em>' containment reference list.
	 * The list contents are of type {@link model.InstanceShellPortMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Shell Port Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Shell Port Map</em>' containment reference list.
	 * @see model.ModelPackage#getInstanceShellInterfaceMap_InstanceShellPortMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InstanceShellPortMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InstanceShellPortMap> getInstanceShellPortMap();

} // InstanceShellInterfaceMap
