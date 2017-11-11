/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pad Type DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.PadTypeDB#getPadType <em>Pad Type</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getPadTypeDB()
 * @model extendedMetaData="name='PadTypeDB' kind='elementOnly'"
 * @generated
 */
public interface PadTypeDB extends ModelRoot {
	/**
	 * Returns the value of the '<em><b>Pad Type</b></em>' containment reference list.
	 * The list contents are of type {@link model.PadType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pad Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pad Type</em>' containment reference list.
	 * @see model.ModelPackage#getPadTypeDB_PadType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PadType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PadType> getPadType();

} // PadTypeDB
