/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.GeneralInstance#getExtVLNV <em>Ext VLNV</em>}</li>
 *   <li>{@link Essence.GeneralInstance#getParamMap <em>Param Map</em>}</li>
 *   <li>{@link Essence.GeneralInstance#getGenericMap <em>Generic Map</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getGeneralInstance()
 * @model abstract="true"
 *        extendedMetaData="name='GeneralInstance' kind='elementOnly'"
 * @generated
 */
public interface GeneralInstance extends SingleSourceNode {
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
	 * @see Essence.EssencePackage#getGeneralInstance_ExtVLNV()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ExtVLNV' namespace='##targetNamespace'"
	 * @generated
	 */
	VLNV getExtVLNV();

	/**
	 * Sets the value of the '{@link Essence.GeneralInstance#getExtVLNV <em>Ext VLNV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext VLNV</em>' containment reference.
	 * @see #getExtVLNV()
	 * @generated
	 */
	void setExtVLNV(VLNV value);

	/**
	 * Returns the value of the '<em><b>Param Map</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.ParamMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Map</em>' containment reference list.
	 * @see Essence.EssencePackage#getGeneralInstance_ParamMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ParamMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParamMap> getParamMap();

	/**
	 * Returns the value of the '<em><b>Generic Map</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.GenericMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Map</em>' containment reference list.
	 * @see Essence.EssencePackage#getGeneralInstance_GenericMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GenericMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenericMap> getGenericMap();

} // GeneralInstance
