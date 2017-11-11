/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shell Interface Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.ShellInterfaceMap#getXRefShellInterface <em>XRef Shell Interface</em>}</li>
 *   <li>{@link model.ShellInterfaceMap#getXRefConnection <em>XRef Connection</em>}</li>
 *   <li>{@link model.ShellInterfaceMap#getShellPortMap <em>Shell Port Map</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getShellInterfaceMap()
 * @model extendedMetaData="name='ShellInterfaceMap' kind='elementOnly'"
 * @generated
 */
public interface ShellInterfaceMap extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>XRef Shell Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Shell Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Shell Interface</em>' containment reference.
	 * @see #setXRefShellInterface(XRefExternalInterface)
	 * @see model.ModelPackage#getShellInterfaceMap_XRefShellInterface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefShellInterface' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefExternalInterface getXRefShellInterface();

	/**
	 * Sets the value of the '{@link model.ShellInterfaceMap#getXRefShellInterface <em>XRef Shell Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Shell Interface</em>' containment reference.
	 * @see #getXRefShellInterface()
	 * @generated
	 */
	void setXRefShellInterface(XRefExternalInterface value);

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
	 * @see model.ModelPackage#getShellInterfaceMap_XRefConnection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefConnection' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefConnection getXRefConnection();

	/**
	 * Sets the value of the '{@link model.ShellInterfaceMap#getXRefConnection <em>XRef Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Connection</em>' containment reference.
	 * @see #getXRefConnection()
	 * @generated
	 */
	void setXRefConnection(XRefConnection value);

	/**
	 * Returns the value of the '<em><b>Shell Port Map</b></em>' containment reference list.
	 * The list contents are of type {@link model.ShellPortMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shell Port Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell Port Map</em>' containment reference list.
	 * @see model.ModelPackage#getShellInterfaceMap_ShellPortMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ShellPortMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ShellPortMap> getShellPortMap();

} // ShellInterfaceMap
