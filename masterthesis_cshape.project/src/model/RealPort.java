/**
 */
package model;

import modelextension.DataTypeOwner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.RealPort#getDirection <em>Direction</em>}</li>
 *   <li>{@link model.RealPort#getXRefDefaultValue <em>XRef Default Value</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getRealPort()
 * @model abstract="true"
 *        extendedMetaData="name='RealPort' kind='elementOnly'"
 * @generated
 */
public interface RealPort extends Port, DataTypeOwner {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"in"</code>.
	 * The literals are from the enumeration {@link model.PortDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see model.PortDirection
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(PortDirection)
	 * @see model.ModelPackage#getRealPort_Direction()
	 * @model default="in" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Direction' namespace='##targetNamespace'"
	 * @generated
	 */
	PortDirection getDirection();

	/**
	 * Sets the value of the '{@link model.RealPort#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see model.PortDirection
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(PortDirection value);

	/**
	 * Unsets the value of the '{@link model.RealPort#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(PortDirection)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link model.RealPort#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(PortDirection)
	 * @generated
	 */
	boolean isSetDirection();

	/**
	 * Returns the value of the '<em><b>XRef Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Default Value</em>' containment reference.
	 * @see #setXRefDefaultValue(XRefDataVar)
	 * @see model.ModelPackage#getRealPort_XRefDefaultValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='XRefDefaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefDataVar getXRefDefaultValue();

	/**
	 * Sets the value of the '{@link model.RealPort#getXRefDefaultValue <em>XRef Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Default Value</em>' containment reference.
	 * @see #getXRefDefaultValue()
	 * @generated
	 */
	void setXRefDefaultValue(XRefDataVar value);

} // RealPort
