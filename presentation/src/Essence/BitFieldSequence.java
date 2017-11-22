/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit Field Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.BitFieldSequence#getCount <em>Count</em>}</li>
 *   <li>{@link Essence.BitFieldSequence#getMinIndex <em>Min Index</em>}</li>
 *   <li>{@link Essence.BitFieldSequence#getIndexStep <em>Index Step</em>}</li>
 *   <li>{@link Essence.BitFieldSequence#getIndexVar <em>Index Var</em>}</li>
 *   <li>{@link Essence.BitFieldSequence#getAltFormat <em>Alt Format</em>}</li>
 *   <li>{@link Essence.BitFieldSequence#getBitFieldSequenceElement <em>Bit Field Sequence Element</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getBitFieldSequence()
 * @model extendedMetaData="name='BitFieldSequence' kind='elementOnly'"
 * @generated
 */
public interface BitFieldSequence extends BitFieldElement {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(String)
	 * @see Essence.EssencePackage#getBitFieldSequence_Count()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Count' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCount();

	/**
	 * Sets the value of the '{@link Essence.BitFieldSequence#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(String value);

	/**
	 * Returns the value of the '<em><b>Min Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Index</em>' attribute.
	 * @see #setMinIndex(String)
	 * @see Essence.EssencePackage#getBitFieldSequence_MinIndex()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='MinIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMinIndex();

	/**
	 * Sets the value of the '{@link Essence.BitFieldSequence#getMinIndex <em>Min Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Index</em>' attribute.
	 * @see #getMinIndex()
	 * @generated
	 */
	void setMinIndex(String value);

	/**
	 * Returns the value of the '<em><b>Index Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Index Step</em>' attribute.
	 * @see #setIndexStep(String)
	 * @see Essence.EssencePackage#getBitFieldSequence_IndexStep()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='IndexStep' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIndexStep();

	/**
	 * Sets the value of the '{@link Essence.BitFieldSequence#getIndexStep <em>Index Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Step</em>' attribute.
	 * @see #getIndexStep()
	 * @generated
	 */
	void setIndexStep(String value);

	/**
	 * Returns the value of the '<em><b>Index Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Var</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Var</em>' attribute.
	 * @see #setIndexVar(String)
	 * @see Essence.EssencePackage#getBitFieldSequence_IndexVar()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='IndexVar' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIndexVar();

	/**
	 * Sets the value of the '{@link Essence.BitFieldSequence#getIndexVar <em>Index Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Var</em>' attribute.
	 * @see #getIndexVar()
	 * @generated
	 */
	void setIndexVar(String value);

	/**
	 * Returns the value of the '<em><b>Alt Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Format</em>' attribute.
	 * @see #setAltFormat(String)
	 * @see Essence.EssencePackage#getBitFieldSequence_AltFormat()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AltFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAltFormat();

	/**
	 * Sets the value of the '{@link Essence.BitFieldSequence#getAltFormat <em>Alt Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Format</em>' attribute.
	 * @see #getAltFormat()
	 * @generated
	 */
	void setAltFormat(String value);

	/**
	 * Returns the value of the '<em><b>Bit Field Sequence Element</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.BitFieldSequenceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Field Sequence Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Field Sequence Element</em>' containment reference list.
	 * @see Essence.EssencePackage#getBitFieldSequence_BitFieldSequenceElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BitFieldSequenceElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BitFieldSequenceElement> getBitFieldSequenceElement();

} // BitFieldSequence
