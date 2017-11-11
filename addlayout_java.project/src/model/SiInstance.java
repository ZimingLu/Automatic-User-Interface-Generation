/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Si Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.SiInstance#getSiInstanceInterfaceMap <em>Si Instance Interface Map</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getSiInstance()
 * @model abstract="true"
 *        extendedMetaData="name='SiInstance' kind='elementOnly'"
 * @generated
 */
public interface SiInstance extends GeneralInstance {
	/**
	 * Returns the value of the '<em><b>Si Instance Interface Map</b></em>' containment reference list.
	 * The list contents are of type {@link model.SiInstanceInterfaceMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Si Instance Interface Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Si Instance Interface Map</em>' containment reference list.
	 * @see model.ModelPackage#getSiInstance_SiInstanceInterfaceMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SiInstanceInterfaceMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SiInstanceInterfaceMap> getSiInstanceInterfaceMap();

} // SiInstance
