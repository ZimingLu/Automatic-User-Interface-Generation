/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pad Non Multiplexed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.PadNonMultiplexed#getExtVLNV <em>Ext VLNV</em>}</li>
 *   <li>{@link model.PadNonMultiplexed#getSiPortReq <em>Si Port Req</em>}</li>
 *   <li>{@link model.PadNonMultiplexed#getXRefPadType <em>XRef Pad Type</em>}</li>
 *   <li>{@link model.PadNonMultiplexed#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getPadNonMultiplexed()
 * @model extendedMetaData="name='PadNonMultiplexed' kind='elementOnly'"
 * @generated
 */
public interface PadNonMultiplexed extends SinglePad {
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
	 * @see model.ModelPackage#getPadNonMultiplexed_ExtVLNV()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExtVLNV' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VLNV> getExtVLNV();

	/**
	 * Returns the value of the '<em><b>Si Port Req</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Si Port Req</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Si Port Req</em>' containment reference.
	 * @see #setSiPortReq(SiPortReq)
	 * @see model.ModelPackage#getPadNonMultiplexed_SiPortReq()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SiPortReq' namespace='##targetNamespace'"
	 * @generated
	 */
	SiPortReq getSiPortReq();

	/**
	 * Sets the value of the '{@link model.PadNonMultiplexed#getSiPortReq <em>Si Port Req</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Si Port Req</em>' containment reference.
	 * @see #getSiPortReq()
	 * @generated
	 */
	void setSiPortReq(SiPortReq value);

	/**
	 * Returns the value of the '<em><b>XRef Pad Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Pad Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Pad Type</em>' containment reference.
	 * @see #setXRefPadType(XRefPadType)
	 * @see model.ModelPackage#getPadNonMultiplexed_XRefPadType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='XRefPadType' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefPadType getXRefPadType();

	/**
	 * Sets the value of the '{@link model.PadNonMultiplexed#getXRefPadType <em>XRef Pad Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Pad Type</em>' containment reference.
	 * @see #getXRefPadType()
	 * @generated
	 */
	void setXRefPadType(XRefPadType value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link model.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see model.ModelPackage#getPadNonMultiplexed_Function()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Function' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Function> getFunction();

} // PadNonMultiplexed
