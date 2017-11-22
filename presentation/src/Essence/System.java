/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.System#getExtVLNV <em>Ext VLNV</em>}</li>
 *   <li>{@link Essence.System#getInterface <em>Interface</em>}</li>
 *   <li>{@link Essence.System#getConnection <em>Connection</em>}</li>
 *   <li>{@link Essence.System#getLocalInterfaceMap <em>Local Interface Map</em>}</li>
 *   <li>{@link Essence.System#getInstance <em>Instance</em>}</li>
 *   <li>{@link Essence.System#getShellInterfaceMap <em>Shell Interface Map</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getSystem()
 * @model extendedMetaData="name='System' kind='elementOnly'"
 * @generated
 */
public interface System extends ModelRoot {
	/**
	 * Returns the value of the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext VLNV</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext VLNV</em>' containment reference.
	 * @see #setExtVLNV(VLNV)
	 * @see Essence.EssencePackage#getSystem_ExtVLNV()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExtVLNV' namespace='##targetNamespace'"
	 * @generated
	 */
	VLNV getExtVLNV();

	/**
	 * Sets the value of the '{@link Essence.System#getExtVLNV <em>Ext VLNV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext VLNV</em>' containment reference.
	 * @see #getExtVLNV()
	 * @generated
	 */
	void setExtVLNV(VLNV value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see Essence.EssencePackage#getSystem_Interface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Interface' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Interface> getInterface();

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see Essence.EssencePackage#getSystem_Connection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Connection' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Connection> getConnection();

	/**
	 * Returns the value of the '<em><b>Local Interface Map</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.LocalInterfaceMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Interface Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Interface Map</em>' containment reference list.
	 * @see Essence.EssencePackage#getSystem_LocalInterfaceMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocalInterfaceMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocalInterfaceMap> getLocalInterfaceMap();

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.Instance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference list.
	 * @see Essence.EssencePackage#getSystem_Instance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Instance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Instance> getInstance();

	/**
	 * Returns the value of the '<em><b>Shell Interface Map</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.ShellInterfaceMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shell Interface Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell Interface Map</em>' containment reference list.
	 * @see Essence.EssencePackage#getSystem_ShellInterfaceMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ShellInterfaceMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ShellInterfaceMap> getShellInterfaceMap();

} // System
