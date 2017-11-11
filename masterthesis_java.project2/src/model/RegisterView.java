/**
 */
package model;

import modelextension.CommonAccessLevel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Register View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.RegisterView#getDepth <em>Depth</em>}</li>
 *   <li>{@link model.RegisterView#getDepthVar <em>Depth Var</em>}</li>
 *   <li>{@link model.RegisterView#getBitFieldElement <em>Bit Field Element</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getRegisterView()
 * @model extendedMetaData="name='RegisterView' kind='elementOnly'"
 * @generated
 */
public interface RegisterView extends IndexVarUser, CommonAccessLevel {
	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(String)
	 * @see model.ModelPackage#getRegisterView_Depth()
	 * @model dataType="model.IntegerExpr"
	 *        extendedMetaData="kind='element' name='Depth' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDepth();

	/**
	 * Sets the value of the '{@link model.RegisterView#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(String value);

	/**
	 * Returns the value of the '<em><b>Depth Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth Var</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth Var</em>' attribute.
	 * @see #setDepthVar(String)
	 * @see model.ModelPackage#getRegisterView_DepthVar()
	 * @model dataType="model.StringLiteral"
	 *        extendedMetaData="kind='element' name='DepthVar' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDepthVar();

	/**
	 * Sets the value of the '{@link model.RegisterView#getDepthVar <em>Depth Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth Var</em>' attribute.
	 * @see #getDepthVar()
	 * @generated
	 */
	void setDepthVar(String value);

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
	 * @see model.ModelPackage#getRegisterView_BitFieldElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BitFieldElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BitFieldElement> getBitFieldElement();

} // RegisterView
