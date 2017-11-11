/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Si Instance Interface Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.SiInstanceInterfaceMap#getXRefInstanceInterface <em>XRef Instance Interface</em>}</li>
 *   <li>{@link model.SiInstanceInterfaceMap#getSiInstancePortMap <em>Si Instance Port Map</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getSiInstanceInterfaceMap()
 * @model extendedMetaData="name='SiInstanceInterfaceMap' kind='elementOnly'"
 * @generated
 */
public interface SiInstanceInterfaceMap extends SingleSourceNode {
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
	 * @see model.ModelPackage#getSiInstanceInterfaceMap_XRefInstanceInterface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefInstanceInterface' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefExternalInterface getXRefInstanceInterface();

	/**
	 * Sets the value of the '{@link model.SiInstanceInterfaceMap#getXRefInstanceInterface <em>XRef Instance Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Instance Interface</em>' containment reference.
	 * @see #getXRefInstanceInterface()
	 * @generated
	 */
	void setXRefInstanceInterface(XRefExternalInterface value);

	/**
	 * Returns the value of the '<em><b>Si Instance Port Map</b></em>' containment reference list.
	 * The list contents are of type {@link model.SiInstancePortMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Si Instance Port Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Si Instance Port Map</em>' containment reference list.
	 * @see model.ModelPackage#getSiInstanceInterfaceMap_SiInstancePortMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SiInstancePortMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SiInstancePortMap> getSiInstancePortMap();

} // SiInstanceInterfaceMap
