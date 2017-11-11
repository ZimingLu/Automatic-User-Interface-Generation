/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Si Instance Shell Interface Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.SiInstanceShellInterfaceMap#getXRefInstanceShellInterface <em>XRef Instance Shell Interface</em>}</li>
 *   <li>{@link model.SiInstanceShellInterfaceMap#getSiInstanceShellPortMap <em>Si Instance Shell Port Map</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getSiInstanceShellInterfaceMap()
 * @model extendedMetaData="name='SiInstanceShellInterfaceMap' kind='elementOnly'"
 * @generated
 */
public interface SiInstanceShellInterfaceMap extends SingleSourceNode {
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
	 * @see model.ModelPackage#getSiInstanceShellInterfaceMap_XRefInstanceShellInterface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefInstanceShellInterface' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefIndInterface getXRefInstanceShellInterface();

	/**
	 * Sets the value of the '{@link model.SiInstanceShellInterfaceMap#getXRefInstanceShellInterface <em>XRef Instance Shell Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Instance Shell Interface</em>' containment reference.
	 * @see #getXRefInstanceShellInterface()
	 * @generated
	 */
	void setXRefInstanceShellInterface(XRefIndInterface value);

	/**
	 * Returns the value of the '<em><b>Si Instance Shell Port Map</b></em>' containment reference list.
	 * The list contents are of type {@link model.SiInstanceShellPortMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Si Instance Shell Port Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Si Instance Shell Port Map</em>' containment reference list.
	 * @see model.ModelPackage#getSiInstanceShellInterfaceMap_SiInstanceShellPortMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SiInstanceShellPortMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SiInstanceShellPortMap> getSiInstanceShellPortMap();

} // SiInstanceShellInterfaceMap
