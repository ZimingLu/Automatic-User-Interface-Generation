/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Si System Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.SiSystemInstance#getSiInstanceShellInterfaceMap <em>Si Instance Shell Interface Map</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getSiSystemInstance()
 * @model extendedMetaData="name='SiSystemInstance' kind='elementOnly'"
 * @generated
 */
public interface SiSystemInstance extends SiInstance {
	/**
	 * Returns the value of the '<em><b>Si Instance Shell Interface Map</b></em>' containment reference list.
	 * The list contents are of type {@link model.SiInstanceShellInterfaceMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Si Instance Shell Interface Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Si Instance Shell Interface Map</em>' containment reference list.
	 * @see model.ModelPackage#getSiSystemInstance_SiInstanceShellInterfaceMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SiInstanceShellInterfaceMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SiInstanceShellInterfaceMap> getSiInstanceShellInterfaceMap();

} // SiSystemInstance
