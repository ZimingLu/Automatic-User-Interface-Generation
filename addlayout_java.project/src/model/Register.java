/**
 */
package model;

import modelextension.CommonAccessLevel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Register</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Register#getMirrorSize <em>Mirror Size</em>}</li>
 *   <li>{@link model.Register#getTopSpinType <em>Top Spin Type</em>}</li>
 *   <li>{@link model.Register#getXRefRegisterView <em>XRef Register View</em>}</li>
 *   <li>{@link model.Register#getBitFieldElement <em>Bit Field Element</em>}</li>
 *   <li>{@link model.Register#getBitField <em>Bit Field</em>}</li>
 *   <li>{@link model.Register#getBitFieldSequence <em>Bit Field Sequence</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getRegister()
 * @model extendedMetaData="name='Register' kind='elementOnly'"
 * @generated
 */
public interface Register extends GeneralRegister, CommonAccessLevel {
	/**
	 * Returns the value of the '<em><b>Mirror Size</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mirror Size</em>' attribute.
	 * @see #setMirrorSize(String)
	 * @see model.ModelPackage#getRegister_MirrorSize()
	 * @model default="1" dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='MirrorSize' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMirrorSize();

	/**
	 * Sets the value of the '{@link model.Register#getMirrorSize <em>Mirror Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mirror Size</em>' attribute.
	 * @see #getMirrorSize()
	 * @generated
	 */
	void setMirrorSize(String value);

	/**
	 * Returns the value of the '<em><b>Top Spin Type</b></em>' attribute.
	 * The default value is <code>"noTopSpin"</code>.
	 * The literals are from the enumeration {@link model.TopSpinType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Spin Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Spin Type</em>' attribute.
	 * @see model.TopSpinType
	 * @see #isSetTopSpinType()
	 * @see #unsetTopSpinType()
	 * @see #setTopSpinType(TopSpinType)
	 * @see model.ModelPackage#getRegister_TopSpinType()
	 * @model default="noTopSpin" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TopSpinType' namespace='##targetNamespace'"
	 * @generated
	 */
	TopSpinType getTopSpinType();

	/**
	 * Sets the value of the '{@link model.Register#getTopSpinType <em>Top Spin Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Spin Type</em>' attribute.
	 * @see model.TopSpinType
	 * @see #isSetTopSpinType()
	 * @see #unsetTopSpinType()
	 * @see #getTopSpinType()
	 * @generated
	 */
	void setTopSpinType(TopSpinType value);

	/**
	 * Unsets the value of the '{@link model.Register#getTopSpinType <em>Top Spin Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTopSpinType()
	 * @see #getTopSpinType()
	 * @see #setTopSpinType(TopSpinType)
	 * @generated
	 */
	void unsetTopSpinType();

	/**
	 * Returns whether the value of the '{@link model.Register#getTopSpinType <em>Top Spin Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Top Spin Type</em>' attribute is set.
	 * @see #unsetTopSpinType()
	 * @see #getTopSpinType()
	 * @see #setTopSpinType(TopSpinType)
	 * @generated
	 */
	boolean isSetTopSpinType();

	/**
	 * Returns the value of the '<em><b>XRef Register View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Register View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Register View</em>' containment reference.
	 * @see #setXRefRegisterView(XRefRegisterView)
	 * @see model.ModelPackage#getRegister_XRefRegisterView()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='XRefRegisterView' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefRegisterView getXRefRegisterView();

	/**
	 * Sets the value of the '{@link model.Register#getXRefRegisterView <em>XRef Register View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Register View</em>' containment reference.
	 * @see #getXRefRegisterView()
	 * @generated
	 */
	void setXRefRegisterView(XRefRegisterView value);

	/**
	 * Returns the value of the '<em><b>Bit Field Element</b></em>' containment reference list.
	 * The list contents are of type {@link model.BitFieldElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Field Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Field Element</em>' containment reference list.
	 * @see model.ModelPackage#getRegister_BitFieldElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BitFieldElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BitFieldElement> getBitFieldElement();

	/**
	 * Returns the value of the '<em><b>Bit Field</b></em>' reference list.
	 * The list contents are of type {@link model.BitField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Field</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Field</em>' reference list.
	 * @see model.ModelPackage#getRegister_BitField()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='\t\tEList<BitField> result = new org.eclipse.emf.common.util.BasicEList<BitField>();\n\t\tfor (BitFieldElement element : getBitFieldElement()) {\n\t\t\tif (element instanceof BitField) {\n\t\t\t\tresult.add((BitField) element);\n\t\t\t}\n\t\t}\n\t\treturn new org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList<BitField>(this, EssencePackage.eINSTANCE.getRegister_BitField(), result.size(), result.toArray());\n'"
	 * @generated
	 */
	EList<BitField> getBitField();

	/**
	 * Returns the value of the '<em><b>Bit Field Sequence</b></em>' reference list.
	 * The list contents are of type {@link model.BitFieldSequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Field Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Field Sequence</em>' reference list.
	 * @see model.ModelPackage#getRegister_BitFieldSequence()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='\t\tEList<BitFieldSequence> result = new org.eclipse.emf.common.util.BasicEList<BitFieldSequence>();\n\t\tfor (BitFieldElement element : getBitFieldElement()) {\n\t\t\tif (element instanceof BitFieldSequence) {\n\t\t\t\tresult.add((BitFieldSequence) element);\n\t\t\t}\n\t\t}\n\t\treturn new org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList<BitFieldSequence>(this, EssencePackage.eINSTANCE.getRegister_BitFieldSequence(), result.size(), result.toArray());\n'"
	 * @generated
	 */
	EList<BitFieldSequence> getBitFieldSequence();

} // Register
