/**
 */
package model;

import java.math.BigInteger;

import java.util.Map;

import modelextension.BitResetType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.BitField#getAccessExternal <em>Access External</em>}</li>
 *   <li>{@link model.BitField#getAccessInternal <em>Access Internal</em>}</li>
 *   <li>{@link model.BitField#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link model.BitField#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link model.BitField#getReserved <em>Reserved</em>}</li>
 *   <li>{@link model.BitField#getSignInterpretation <em>Sign Interpretation</em>}</li>
 *   <li>{@link model.BitField#getVirtual <em>Virtual</em>}</li>
 *   <li>{@link model.BitField#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link model.BitField#getDefaultMask <em>Default Mask</em>}</li>
 *   <li>{@link model.BitField#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link model.BitField#getEnumerationElement <em>Enumeration Element</em>}</li>
 *   <li>{@link model.BitField#isCheckParent <em>Check Parent</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getBitField()
 * @model extendedMetaData="name='BitField' kind='elementOnly'"
 * @generated
 */
public interface BitField extends BitFieldSequenceElement, BitResetType {
	/**
	 * Returns the value of the '<em><b>Access External</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access External</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access External</em>' containment reference.
	 * @see #setAccessExternal(Access)
	 * @see model.ModelPackage#getBitField_AccessExternal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AccessExternal' namespace='##targetNamespace'"
	 * @generated
	 */
	Access getAccessExternal();

	/**
	 * Sets the value of the '{@link model.BitField#getAccessExternal <em>Access External</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access External</em>' containment reference.
	 * @see #getAccessExternal()
	 * @generated
	 */
	void setAccessExternal(Access value);

	/**
	 * Returns the value of the '<em><b>Access Internal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Internal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Internal</em>' containment reference.
	 * @see #setAccessInternal(Access)
	 * @see model.ModelPackage#getBitField_AccessInternal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AccessInternal' namespace='##targetNamespace'"
	 * @generated
	 */
	Access getAccessInternal();

	/**
	 * Sets the value of the '{@link model.BitField#getAccessInternal <em>Access Internal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Internal</em>' containment reference.
	 * @see #getAccessInternal()
	 * @generated
	 */
	void setAccessInternal(Access value);

	/**
	 * Returns the value of the '<em><b>Max Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Val</em>' attribute.
	 * @see #setMaxVal(String)
	 * @see model.ModelPackage#getBitField_MaxVal()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='MaxVal' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMaxVal();

	/**
	 * Sets the value of the '{@link model.BitField#getMaxVal <em>Max Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Val</em>' attribute.
	 * @see #getMaxVal()
	 * @generated
	 */
	void setMaxVal(String value);

	/**
	 * Returns the value of the '<em><b>Min Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Val</em>' attribute.
	 * @see #setMinVal(String)
	 * @see model.ModelPackage#getBitField_MinVal()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='MinVal' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMinVal();

	/**
	 * Sets the value of the '{@link model.BitField#getMinVal <em>Min Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Val</em>' attribute.
	 * @see #getMinVal()
	 * @generated
	 */
	void setMinVal(String value);

	/**
	 * Returns the value of the '<em><b>Reserved</b></em>' attribute.
	 * The default value is <code>"unreserved"</code>.
	 * The literals are from the enumeration {@link model.ReservedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved</em>' attribute.
	 * @see model.ReservedType
	 * @see #isSetReserved()
	 * @see #unsetReserved()
	 * @see #setReserved(ReservedType)
	 * @see model.ModelPackage#getBitField_Reserved()
	 * @model default="unreserved" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Reserved' namespace='##targetNamespace'"
	 * @generated
	 */
	ReservedType getReserved();

	/**
	 * Sets the value of the '{@link model.BitField#getReserved <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' attribute.
	 * @see model.ReservedType
	 * @see #isSetReserved()
	 * @see #unsetReserved()
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(ReservedType value);

	/**
	 * Unsets the value of the '{@link model.BitField#getReserved <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReserved()
	 * @see #getReserved()
	 * @see #setReserved(ReservedType)
	 * @generated
	 */
	void unsetReserved();

	/**
	 * Returns whether the value of the '{@link model.BitField#getReserved <em>Reserved</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reserved</em>' attribute is set.
	 * @see #unsetReserved()
	 * @see #getReserved()
	 * @see #setReserved(ReservedType)
	 * @generated
	 */
	boolean isSetReserved();

	/**
	 * Returns the value of the '<em><b>Sign Interpretation</b></em>' attribute.
	 * The default value is <code>"unsigned"</code>.
	 * The literals are from the enumeration {@link model.SignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sign Interpretation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign Interpretation</em>' attribute.
	 * @see model.SignType
	 * @see #isSetSignInterpretation()
	 * @see #unsetSignInterpretation()
	 * @see #setSignInterpretation(SignType)
	 * @see model.ModelPackage#getBitField_SignInterpretation()
	 * @model default="unsigned" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='SignInterpretation' namespace='##targetNamespace'"
	 * @generated
	 */
	SignType getSignInterpretation();

	/**
	 * Sets the value of the '{@link model.BitField#getSignInterpretation <em>Sign Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign Interpretation</em>' attribute.
	 * @see model.SignType
	 * @see #isSetSignInterpretation()
	 * @see #unsetSignInterpretation()
	 * @see #getSignInterpretation()
	 * @generated
	 */
	void setSignInterpretation(SignType value);

	/**
	 * Unsets the value of the '{@link model.BitField#getSignInterpretation <em>Sign Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignInterpretation()
	 * @see #getSignInterpretation()
	 * @see #setSignInterpretation(SignType)
	 * @generated
	 */
	void unsetSignInterpretation();

	/**
	 * Returns whether the value of the '{@link model.BitField#getSignInterpretation <em>Sign Interpretation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sign Interpretation</em>' attribute is set.
	 * @see #unsetSignInterpretation()
	 * @see #getSignInterpretation()
	 * @see #setSignInterpretation(SignType)
	 * @generated
	 */
	boolean isSetSignInterpretation();

	/**
	 * Returns the value of the '<em><b>Virtual</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link model.VirtualType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual</em>' attribute.
	 * @see model.VirtualType
	 * @see #isSetVirtual()
	 * @see #unsetVirtual()
	 * @see #setVirtual(VirtualType)
	 * @see model.ModelPackage#getBitField_Virtual()
	 * @model default="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Virtual' namespace='##targetNamespace'"
	 * @generated
	 */
	VirtualType getVirtual();

	/**
	 * Sets the value of the '{@link model.BitField#getVirtual <em>Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual</em>' attribute.
	 * @see model.VirtualType
	 * @see #isSetVirtual()
	 * @see #unsetVirtual()
	 * @see #getVirtual()
	 * @generated
	 */
	void setVirtual(VirtualType value);

	/**
	 * Unsets the value of the '{@link model.BitField#getVirtual <em>Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVirtual()
	 * @see #getVirtual()
	 * @see #setVirtual(VirtualType)
	 * @generated
	 */
	void unsetVirtual();

	/**
	 * Returns whether the value of the '{@link model.BitField#getVirtual <em>Virtual</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Virtual</em>' attribute is set.
	 * @see #unsetVirtual()
	 * @see #getVirtual()
	 * @see #setVirtual(VirtualType)
	 * @generated
	 */
	boolean isSetVirtual();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see model.ModelPackage#getBitField_DefaultValue()
	 * @model default="0" dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='DefaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link model.BitField#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Default Mask</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Mask</em>' attribute.
	 * @see #setDefaultMask(String)
	 * @see model.ModelPackage#getBitField_DefaultMask()
	 * @model default="0" dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='DefaultMask' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefaultMask();

	/**
	 * Sets the value of the '{@link model.BitField#getDefaultMask <em>Default Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Mask</em>' attribute.
	 * @see #getDefaultMask()
	 * @generated
	 */
	void setDefaultMask(String value);

	/**
	 * Returns the value of the '<em><b>Access Level</b></em>' containment reference list.
	 * The list contents are of type {@link model.AccessLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Level</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Level</em>' containment reference list.
	 * @see model.ModelPackage#getBitField_AccessLevel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AccessLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AccessLevel> getAccessLevel();

	/**
	 * Returns the value of the '<em><b>Enumeration Element</b></em>' containment reference list.
	 * The list contents are of type {@link model.EnumerationElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Element</em>' containment reference list.
	 * @see model.ModelPackage#getBitField_EnumerationElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EnumerationElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnumerationElement> getEnumerationElement();

	/**
	 * Returns the value of the '<em><b>Check Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Parent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Parent</em>' attribute.
	 * @see model.ModelPackage#getBitField_CheckParent()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='if ((this.eContainer != null) && (this.eContainer() instanceof Register)) {\n\treturn true;\n}\nreturn false;'"
	 * @generated
	 */
	boolean isCheckParent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return InternalModelServiceImpl.EXPRESSIONSERVICE.getIntegerExpression(this, this.getMinVal(), ixVars);'"
	 * @generated
	 */
	BigInteger getMinValValue(Map<String, Integer> ixVars);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return InternalModelServiceImpl.EXPRESSIONSERVICE.getIntegerExpression(this, this.getMaxVal(), ixVars);'"
	 * @generated
	 */
	BigInteger getMaxValValue(Map<String, Integer> ixVars);

} // BitField
