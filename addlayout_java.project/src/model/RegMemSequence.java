/**
 */
package model;

import modelextension.OffsetSequence;

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
 *   <li>{@link model.RegMemSequence#getCount <em>Count</em>}</li>
 *   <li>{@link model.RegMemSequence#getMinIndex <em>Min Index</em>}</li>
 *   <li>{@link model.RegMemSequence#getIndexStep <em>Index Step</em>}</li>
 *   <li>{@link model.RegMemSequence#getIndexVar <em>Index Var</em>}</li>
 *   <li>{@link model.RegMemSequence#getAltFormat <em>Alt Format</em>}</li>
 *   <li>{@link model.RegMemSequence#isPilot <em>Pilot</em>}</li>
 *   <li>{@link model.RegMemSequence#getSequenceElement <em>Sequence Element</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getRegMemSequence()
 * @model extendedMetaData="name='RegMemSequence' kind='elementOnly'"
 * @generated
 */
public interface RegMemSequence extends RegMemElement, OffsetSequence<RegMemElement> {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(String)
	 * @see model.ModelPackage#getRegMemSequence_Count()
	 * @model default="1" dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Count' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCount();

	/**
	 * Sets the value of the '{@link model.RegMemSequence#getCount <em>Count</em>}' attribute.
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
	 * @see model.ModelPackage#getRegMemSequence_MinIndex()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='MinIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMinIndex();

	/**
	 * Sets the value of the '{@link model.RegMemSequence#getMinIndex <em>Min Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Index</em>' attribute.
	 * @see #getMinIndex()
	 * @generated
	 */
	void setMinIndex(String value);

	/**
	 * Returns the value of the '<em><b>Index Step</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Index Step</em>' attribute.
	 * @see #setIndexStep(String)
	 * @see model.ModelPackage#getRegMemSequence_IndexStep()
	 * @model default="1" dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='IndexStep' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIndexStep();

	/**
	 * Sets the value of the '{@link model.RegMemSequence#getIndexStep <em>Index Step</em>}' attribute.
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
	 * @see #isSetIndexVar()
	 * @see #unsetIndexVar()
	 * @see #setIndexVar(String)
	 * @see model.ModelPackage#getRegMemSequence_IndexVar()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='IndexVar' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIndexVar();

	/**
	 * Sets the value of the '{@link model.RegMemSequence#getIndexVar <em>Index Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Var</em>' attribute.
	 * @see #isSetIndexVar()
	 * @see #unsetIndexVar()
	 * @see #getIndexVar()
	 * @generated
	 */
	void setIndexVar(String value);

	/**
	 * Unsets the value of the '{@link model.RegMemSequence#getIndexVar <em>Index Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndexVar()
	 * @see #getIndexVar()
	 * @see #setIndexVar(String)
	 * @generated
	 */
	void unsetIndexVar();

	/**
	 * Returns whether the value of the '{@link model.RegMemSequence#getIndexVar <em>Index Var</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Index Var</em>' attribute is set.
	 * @see #unsetIndexVar()
	 * @see #getIndexVar()
	 * @see #setIndexVar(String)
	 * @generated
	 */
	boolean isSetIndexVar();

	/**
	 * Returns the value of the '<em><b>Alt Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Format</em>' attribute.
	 * @see #isSetAltFormat()
	 * @see #unsetAltFormat()
	 * @see #setAltFormat(String)
	 * @see model.ModelPackage#getRegMemSequence_AltFormat()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AltFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAltFormat();

	/**
	 * Sets the value of the '{@link model.RegMemSequence#getAltFormat <em>Alt Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Format</em>' attribute.
	 * @see #isSetAltFormat()
	 * @see #unsetAltFormat()
	 * @see #getAltFormat()
	 * @generated
	 */
	void setAltFormat(String value);

	/**
	 * Unsets the value of the '{@link model.RegMemSequence#getAltFormat <em>Alt Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAltFormat()
	 * @see #getAltFormat()
	 * @see #setAltFormat(String)
	 * @generated
	 */
	void unsetAltFormat();

	/**
	 * Returns whether the value of the '{@link model.RegMemSequence#getAltFormat <em>Alt Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alt Format</em>' attribute is set.
	 * @see #unsetAltFormat()
	 * @see #getAltFormat()
	 * @see #setAltFormat(String)
	 * @generated
	 */
	boolean isSetAltFormat();

	/**
	 * Returns the value of the '<em><b>Pilot</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pilot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pilot</em>' attribute.
	 * @see #setPilot(boolean)
	 * @see model.ModelPackage#getRegMemSequence_Pilot()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='Pilot' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPilot();

	/**
	 * Sets the value of the '{@link model.RegMemSequence#isPilot <em>Pilot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pilot</em>' attribute.
	 * @see #isPilot()
	 * @generated
	 */
	void setPilot(boolean value);

	/**
	 * Returns the value of the '<em><b>Sequence Element</b></em>' containment reference list.
	 * The list contents are of type {@link model.RegMemElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Element</em>' containment reference list.
	 * @see model.ModelPackage#getRegMemSequence_SequenceElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SequenceElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RegMemElement> getSequenceElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getSequenceElement();'"
	 * @generated
	 */
	EList<RegMemElement> getElement();

} // RegMemSequence
