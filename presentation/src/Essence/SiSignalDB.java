/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Si Signal DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.SiSignalDB#getSiSignal <em>Si Signal</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getSiSignalDB()
 * @model extendedMetaData="name='SiSignalDB' kind='elementOnly'"
 * @generated
 */
public interface SiSignalDB extends ModelRoot {
	/**
	 * Returns the value of the '<em><b>Si Signal</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.SiSignal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Si Signal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Si Signal</em>' containment reference list.
	 * @see Essence.EssencePackage#getSiSignalDB_SiSignal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SiSignal' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SiSignal> getSiSignal();

} // SiSignalDB
