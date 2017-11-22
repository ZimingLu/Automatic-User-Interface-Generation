/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reg Mem Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.RegMemSequence#getCount <em>Count</em>}</li>
 *   <li>{@link Essence.RegMemSequence#getMinIndex <em>Min Index</em>}</li>
 *   <li>{@link Essence.RegMemSequence#getIndexStep <em>Index Step</em>}</li>
 *   <li>{@link Essence.RegMemSequence#getIndexVar <em>Index Var</em>}</li>
 *   <li>{@link Essence.RegMemSequence#getAltFormat <em>Alt Format</em>}</li>
 *   <li>{@link Essence.RegMemSequence#isPilot <em>Pilot</em>}</li>
 *   <li>{@link Essence.RegMemSequence#getSequenceElement <em>Sequence Element</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getRegMemSequence()
 * @model extendedMetaData="name='RegMemSequence' kind='elementOnly'"
 * @generated
 */
public interface RegMemSequence extends RegMemElement {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(String)
	 * @see Essence.EssencePackage#getRegMemSequence_Count()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Count' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCount();

	/**
	 * Sets the value of the '{@link Essence.RegMemSequence#getCount <em>Count</em>}' attribute.
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
	 * @see Essence.EssencePackage#getRegMemSequence_MinIndex()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='MinIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMinIndex();

	/**
	 * Sets the value of the '{@link Essence.RegMemSequence#getMinIndex <em>Min Index</em>}' attribute.
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
	 * @see Essence.EssencePackage#getRegMemSequence_IndexStep()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='IndexStep' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIndexStep();

	/**
	 * Sets the value of the '{@link Essence.RegMemSequence#getIndexStep <em>Index Step</em>}' attribute.
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
	 * @see Essence.EssencePackage#getRegMemSequence_IndexVar()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='IndexVar' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIndexVar();

	/**
	 * Sets the value of the '{@link Essence.RegMemSequence#getIndexVar <em>Index Var</em>}' attribute.
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
	 * @see Essence.EssencePackage#getRegMemSequence_AltFormat()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AltFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAltFormat();

	/**
	 * Sets the value of the '{@link Essence.RegMemSequence#getAltFormat <em>Alt Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Format</em>' attribute.
	 * @see #getAltFormat()
	 * @generated
	 */
	void setAltFormat(String value);

	/**
	 * Returns the value of the '<em><b>Pilot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pilot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pilot</em>' attribute.
	 * @see #isSetPilot()
	 * @see #unsetPilot()
	 * @see #setPilot(boolean)
	 * @see Essence.EssencePackage#getRegMemSequence_Pilot()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='Pilot' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPilot();

	/**
	 * Sets the value of the '{@link Essence.RegMemSequence#isPilot <em>Pilot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pilot</em>' attribute.
	 * @see #isSetPilot()
	 * @see #unsetPilot()
	 * @see #isPilot()
	 * @generated
	 */
	void setPilot(boolean value);

	/**
	 * Unsets the value of the '{@link Essence.RegMemSequence#isPilot <em>Pilot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPilot()
	 * @see #isPilot()
	 * @see #setPilot(boolean)
	 * @generated
	 */
	void unsetPilot();

	/**
	 * Returns whether the value of the '{@link Essence.RegMemSequence#isPilot <em>Pilot</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pilot</em>' attribute is set.
	 * @see #unsetPilot()
	 * @see #isPilot()
	 * @see #setPilot(boolean)
	 * @generated
	 */
	boolean isSetPilot();

	/**
	 * Returns the value of the '<em><b>Sequence Element</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.RegMemElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Element</em>' containment reference list.
	 * @see Essence.EssencePackage#getRegMemSequence_SequenceElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SequenceElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RegMemElement> getSequenceElement();

} // RegMemSequence
