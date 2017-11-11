/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Silicon Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.SiliconInstance#getPadNetMap <em>Pad Net Map</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getSiliconInstance()
 * @model extendedMetaData="name='SiliconInstance' kind='elementOnly'"
 * @generated
 */
public interface SiliconInstance extends GeneralInstance {
	/**
	 * Returns the value of the '<em><b>Pad Net Map</b></em>' containment reference list.
	 * The list contents are of type {@link model.PadNetMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pad Net Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pad Net Map</em>' containment reference list.
	 * @see model.ModelPackage#getSiliconInstance_PadNetMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PadNetMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PadNetMap> getPadNetMap();

} // SiliconInstance
