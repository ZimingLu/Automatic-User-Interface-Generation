/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.PackageInstance#getPinNetMap <em>Pin Net Map</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getPackageInstance()
 * @model extendedMetaData="name='PackageInstance' kind='elementOnly'"
 * @generated
 */
public interface PackageInstance extends GeneralInstance {
	/**
	 * Returns the value of the '<em><b>Pin Net Map</b></em>' containment reference list.
	 * The list contents are of type {@link model.PinNetMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin Net Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Net Map</em>' containment reference list.
	 * @see model.ModelPackage#getPackageInstance_PinNetMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PinNetMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PinNetMap> getPinNetMap();

} // PackageInstance
