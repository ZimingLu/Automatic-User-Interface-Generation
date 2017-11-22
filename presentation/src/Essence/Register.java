/**
 */
package Essence;

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
 *   <li>{@link Essence.Register#getMirrorSize <em>Mirror Size</em>}</li>
 *   <li>{@link Essence.Register#getTopSpinType <em>Top Spin Type</em>}</li>
 *   <li>{@link Essence.Register#getXRefRegisterView <em>XRef Register View</em>}</li>
 *   <li>{@link Essence.Register#getBitFieldElement <em>Bit Field Element</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getRegister()
 * @model extendedMetaData="name='Register' kind='elementOnly'"
 * @generated
 */
public interface Register extends GeneralRegister {
	/**
	 * Returns the value of the '<em><b>Mirror Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mirror Size</em>' attribute.
	 * @see #setMirrorSize(String)
	 * @see Essence.EssencePackage#getRegister_MirrorSize()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='MirrorSize' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMirrorSize();

	/**
	 * Sets the value of the '{@link Essence.Register#getMirrorSize <em>Mirror Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mirror Size</em>' attribute.
	 * @see #getMirrorSize()
	 * @generated
	 */
	void setMirrorSize(String value);

	/**
	 * Returns the value of the '<em><b>Top Spin Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Essence.TopSpinType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Spin Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Spin Type</em>' attribute.
	 * @see Essence.TopSpinType
	 * @see #isSetTopSpinType()
	 * @see #unsetTopSpinType()
	 * @see #setTopSpinType(TopSpinType)
	 * @see Essence.EssencePackage#getRegister_TopSpinType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TopSpinType' namespace='##targetNamespace'"
	 * @generated
	 */
	TopSpinType getTopSpinType();

	/**
	 * Sets the value of the '{@link Essence.Register#getTopSpinType <em>Top Spin Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Spin Type</em>' attribute.
	 * @see Essence.TopSpinType
	 * @see #isSetTopSpinType()
	 * @see #unsetTopSpinType()
	 * @see #getTopSpinType()
	 * @generated
	 */
	void setTopSpinType(TopSpinType value);

	/**
	 * Unsets the value of the '{@link Essence.Register#getTopSpinType <em>Top Spin Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTopSpinType()
	 * @see #getTopSpinType()
	 * @see #setTopSpinType(TopSpinType)
	 * @generated
	 */
	void unsetTopSpinType();

	/**
	 * Returns whether the value of the '{@link Essence.Register#getTopSpinType <em>Top Spin Type</em>}' attribute is set.
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
	 * @see Essence.EssencePackage#getRegister_XRefRegisterView()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='XRefRegisterView' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefRegisterView getXRefRegisterView();

	/**
	 * Sets the value of the '{@link Essence.Register#getXRefRegisterView <em>XRef Register View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Register View</em>' containment reference.
	 * @see #getXRefRegisterView()
	 * @generated
	 */
	void setXRefRegisterView(XRefRegisterView value);

	/**
	 * Returns the value of the '<em><b>Bit Field Element</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.BitFieldElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Field Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Field Element</em>' containment reference list.
	 * @see Essence.EssencePackage#getRegister_BitFieldElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BitFieldElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BitFieldElement> getBitFieldElement();

} // Register
