/**
 */
package model;

import modelextension.DataTypeOwner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Signal#getXRefDefaultValue <em>XRef Default Value</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getSignal()
 * @model abstract="true"
 *        extendedMetaData="name='Signal' kind='elementOnly'"
 * @generated
 */
public interface Signal extends SingleSourceNode, DataTypeOwner {
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
	 * @see model.ModelPackage#getSignal_XRefDefaultValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='XRefDefaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefDataVar getXRefDefaultValue();

	/**
	 * Sets the value of the '{@link model.Signal#getXRefDefaultValue <em>XRef Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Default Value</em>' containment reference.
	 * @see #getXRefDefaultValue()
	 * @generated
	 */
	void setXRefDefaultValue(XRefDataVar value);

} // Signal
