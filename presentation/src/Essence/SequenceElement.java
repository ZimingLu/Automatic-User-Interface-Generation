/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.SequenceElement#getDataWidth <em>Data Width</em>}</li>
 *   <li>{@link Essence.SequenceElement#getAccessCondition <em>Access Condition</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getSequenceElement()
 * @model abstract="true"
 *        extendedMetaData="name='SequenceElement' kind='elementOnly'"
 * @generated
 */
public interface SequenceElement extends RegMemElement {
	/**
	 * Returns the value of the '<em><b>Data Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 32
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Width</em>' attribute.
	 * @see #setDataWidth(String)
	 * @see Essence.EssencePackage#getSequenceElement_DataWidth()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='DataWidth' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDataWidth();

	/**
	 * Sets the value of the '{@link Essence.SequenceElement#getDataWidth <em>Data Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Width</em>' attribute.
	 * @see #getDataWidth()
	 * @generated
	 */
	void setDataWidth(String value);

	/**
	 * Returns the value of the '<em><b>Access Condition</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.AccessCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Condition</em>' containment reference list.
	 * @see Essence.EssencePackage#getSequenceElement_AccessCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AccessCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AccessCondition> getAccessCondition();

} // SequenceElement
