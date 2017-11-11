/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Interface Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.LocalInterfaceMap#getXRefLocalInterface <em>XRef Local Interface</em>}</li>
 *   <li>{@link model.LocalInterfaceMap#getXRefConnection <em>XRef Connection</em>}</li>
 *   <li>{@link model.LocalInterfaceMap#getLocalPortMap <em>Local Port Map</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getLocalInterfaceMap()
 * @model extendedMetaData="name='LocalInterfaceMap' kind='elementOnly'"
 * @generated
 */
public interface LocalInterfaceMap extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>XRef Local Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Local Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Local Interface</em>' containment reference.
	 * @see #setXRefLocalInterface(XRefInternalInterface)
	 * @see model.ModelPackage#getLocalInterfaceMap_XRefLocalInterface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefLocalInterface' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefInternalInterface getXRefLocalInterface();

	/**
	 * Sets the value of the '{@link model.LocalInterfaceMap#getXRefLocalInterface <em>XRef Local Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Local Interface</em>' containment reference.
	 * @see #getXRefLocalInterface()
	 * @generated
	 */
	void setXRefLocalInterface(XRefInternalInterface value);

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
	 * @see model.ModelPackage#getLocalInterfaceMap_XRefConnection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefConnection' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefConnection getXRefConnection();

	/**
	 * Sets the value of the '{@link model.LocalInterfaceMap#getXRefConnection <em>XRef Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Connection</em>' containment reference.
	 * @see #getXRefConnection()
	 * @generated
	 */
	void setXRefConnection(XRefConnection value);

	/**
	 * Returns the value of the '<em><b>Local Port Map</b></em>' containment reference list.
	 * The list contents are of type {@link model.LocalPortMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Port Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Port Map</em>' containment reference list.
	 * @see model.ModelPackage#getLocalInterfaceMap_LocalPortMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocalPortMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocalPortMap> getLocalPortMap();

} // LocalInterfaceMap
