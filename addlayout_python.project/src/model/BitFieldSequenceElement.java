/**
 */
package model;

import modelextension.OffsetSequenceElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit Field Sequence Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.BitFieldSequenceElement#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getBitFieldSequenceElement()
 * @model abstract="true"
 *        extendedMetaData="name='BitFieldSequenceElement' kind='elementOnly'"
 * @generated
 */
public interface BitFieldSequenceElement extends BitFieldElement, OffsetSequenceElement {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see model.ModelPackage#getBitFieldSequenceElement_Width()
	 * @model default="1" dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Width' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link model.BitFieldSequenceElement#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

} // BitFieldSequenceElement
