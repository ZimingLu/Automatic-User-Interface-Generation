/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pad Multiplexed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.PadMultiplexed#getExtVLNV <em>Ext VLNV</em>}</li>
 *   <li>{@link Essence.PadMultiplexed#getXRefPort <em>XRef Port</em>}</li>
 *   <li>{@link Essence.PadMultiplexed#getPortGroup <em>Port Group</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getPadMultiplexed()
 * @model extendedMetaData="name='PadMultiplexed' kind='elementOnly'"
 * @generated
 */
public interface PadMultiplexed extends SinglePad {
	/**
	 * Returns the value of the '<em><b>Ext VLNV</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.VLNV}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext VLNV</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext VLNV</em>' containment reference list.
	 * @see Essence.EssencePackage#getPadMultiplexed_ExtVLNV()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ExtVLNV' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VLNV> getExtVLNV();

	/**
	 * Returns the value of the '<em><b>XRef Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Port</em>' containment reference.
	 * @see #setXRefPort(XRefSiPort)
	 * @see Essence.EssencePackage#getPadMultiplexed_XRefPort()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefPort' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefSiPort getXRefPort();

	/**
	 * Sets the value of the '{@link Essence.PadMultiplexed#getXRefPort <em>XRef Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Port</em>' containment reference.
	 * @see #getXRefPort()
	 * @generated
	 */
	void setXRefPort(XRefSiPort value);

	/**
	 * Returns the value of the '<em><b>Port Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Group</em>' attribute.
	 * @see #setPortGroup(String)
	 * @see Essence.EssencePackage#getPadMultiplexed_PortGroup()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='PortGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPortGroup();

	/**
	 * Sets the value of the '{@link Essence.PadMultiplexed#getPortGroup <em>Port Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Group</em>' attribute.
	 * @see #getPortGroup()
	 * @generated
	 */
	void setPortGroup(String value);

} // PadMultiplexed
