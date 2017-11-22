/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XRef Reg Mem Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.XRefRegMemSet#getOffset <em>Offset</em>}</li>
 *   <li>{@link Essence.XRefRegMemSet#getAccessCondition <em>Access Condition</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getXRefRegMemSet()
 * @model extendedMetaData="name='XRefRegMemSet' kind='elementOnly'"
 * @generated
 */
public interface XRefRegMemSet extends XRefInternal {
	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(String)
	 * @see Essence.EssencePackage#getXRefRegMemSet_Offset()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Offset' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOffset();

	/**
	 * Sets the value of the '{@link Essence.XRefRegMemSet#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(String value);

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
	 * @see Essence.EssencePackage#getXRefRegMemSet_AccessCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AccessCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AccessCondition> getAccessCondition();

} // XRefRegMemSet
