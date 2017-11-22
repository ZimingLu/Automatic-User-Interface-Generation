/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit Field Sequence Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.BitFieldSequenceElement#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getBitFieldSequenceElement()
 * @model abstract="true"
 *        extendedMetaData="name='BitFieldSequenceElement' kind='elementOnly'"
 * @generated
 */
public interface BitFieldSequenceElement extends BitFieldElement {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see Essence.EssencePackage#getBitFieldSequenceElement_Width()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Width' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link Essence.BitFieldSequenceElement#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

} // BitFieldSequenceElement
