/**
 */
package model;

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
 *   <li>{@link model.PadMultiplexed#getExtVLNV <em>Ext VLNV</em>}</li>
 *   <li>{@link model.PadMultiplexed#getXRefPort <em>XRef Port</em>}</li>
 *   <li>{@link model.PadMultiplexed#getPortGroup <em>Port Group</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getPadMultiplexed()
 * @model extendedMetaData="name='PadMultiplexed' kind='elementOnly'"
 * @generated
 */
public interface PadMultiplexed extends SinglePad {
	/**
	 * Returns the value of the '<em><b>Ext VLNV</b></em>' containment reference list.
	 * The list contents are of type {@link model.VLNV}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext VLNV</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext VLNV</em>' containment reference list.
	 * @see model.ModelPackage#getPadMultiplexed_ExtVLNV()
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
	 * @see model.ModelPackage#getPadMultiplexed_XRefPort()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefPort' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefSiPort getXRefPort();

	/**
	 * Sets the value of the '{@link model.PadMultiplexed#getXRefPort <em>XRef Port</em>}' containment reference.
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
	 * @see model.ModelPackage#getPadMultiplexed_PortGroup()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='PortGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPortGroup();

	/**
	 * Sets the value of the '{@link model.PadMultiplexed#getPortGroup <em>Port Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Group</em>' attribute.
	 * @see #getPortGroup()
	 * @generated
	 */
	void setPortGroup(String value);

} // PadMultiplexed
