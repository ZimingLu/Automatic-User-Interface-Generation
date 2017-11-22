/**
 */
package Essence;

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
 *   <li>{@link Essence.BitField#getAccessExternal <em>Access External</em>}</li>
 *   <li>{@link Essence.BitField#getAccessInternal <em>Access Internal</em>}</li>
 *   <li>{@link Essence.BitField#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link Essence.BitField#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link Essence.BitField#getReserved <em>Reserved</em>}</li>
 *   <li>{@link Essence.BitField#getSignInterpretation <em>Sign Interpretation</em>}</li>
 *   <li>{@link Essence.BitField#getVirtual <em>Virtual</em>}</li>
 *   <li>{@link Essence.BitField#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link Essence.BitField#getDefaultMask <em>Default Mask</em>}</li>
 *   <li>{@link Essence.BitField#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link Essence.BitField#getEnumerationElement <em>Enumeration Element</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getBitField()
 * @model extendedMetaData="name='BitField' kind='elementOnly'"
 * @generated
 */
public interface BitField extends BitFieldSequenceElement {
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
	 * @see Essence.EssencePackage#getBitField_AccessExternal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AccessExternal' namespace='##targetNamespace'"
	 * @generated
	 */
	Access getAccessExternal();

	/**
	 * Sets the value of the '{@link Essence.BitField#getAccessExternal <em>Access External</em>}' containment reference.
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
	 * @see Essence.EssencePackage#getBitField_AccessInternal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AccessInternal' namespace='##targetNamespace'"
	 * @generated
	 */
	Access getAccessInternal();

	/**
	 * Sets the value of the '{@link Essence.BitField#getAccessInternal <em>Access Internal</em>}' containment reference.
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
	 * @see Essence.EssencePackage#getBitField_MaxVal()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='MaxVal' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMaxVal();

	/**
	 * Sets the value of the '{@link Essence.BitField#getMaxVal <em>Max Val</em>}' attribute.
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
	 * @see Essence.EssencePackage#getBitField_MinVal()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='MinVal' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMinVal();

	/**
	 * Sets the value of the '{@link Essence.BitField#getMinVal <em>Min Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Val</em>' attribute.
	 * @see #getMinVal()
	 * @generated
	 */
	void setMinVal(String value);

	/**
	 * Returns the value of the '<em><b>Reserved</b></em>' attribute.
	 * The literals are from the enumeration {@link Essence.ReservedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved</em>' attribute.
	 * @see Essence.ReservedType
	 * @see #isSetReserved()
	 * @see #unsetReserved()
	 * @see #setReserved(ReservedType)
	 * @see Essence.EssencePackage#getBitField_Reserved()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Reserved' namespace='##targetNamespace'"
	 * @generated
	 */
	ReservedType getReserved();

	/**
	 * Sets the value of the '{@link Essence.BitField#getReserved <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' attribute.
	 * @see Essence.ReservedType
	 * @see #isSetReserved()
	 * @see #unsetReserved()
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(ReservedType value);

	/**
	 * Unsets the value of the '{@link Essence.BitField#getReserved <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReserved()
	 * @see #getReserved()
	 * @see #setReserved(ReservedType)
	 * @generated
	 */
	void unsetReserved();

	/**
	 * Returns whether the value of the '{@link Essence.BitField#getReserved <em>Reserved</em>}' attribute is set.
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
	 * The literals are from the enumeration {@link Essence.SignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sign Interpretation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign Interpretation</em>' attribute.
	 * @see Essence.SignType
	 * @see #isSetSignInterpretation()
	 * @see #unsetSignInterpretation()
	 * @see #setSignInterpretation(SignType)
	 * @see Essence.EssencePackage#getBitField_SignInterpretation()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='SignInterpretation' namespace='##targetNamespace'"
	 * @generated
	 */
	SignType getSignInterpretation();

	/**
	 * Sets the value of the '{@link Essence.BitField#getSignInterpretation <em>Sign Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign Interpretation</em>' attribute.
	 * @see Essence.SignType
	 * @see #isSetSignInterpretation()
	 * @see #unsetSignInterpretation()
	 * @see #getSignInterpretation()
	 * @generated
	 */
	void setSignInterpretation(SignType value);

	/**
	 * Unsets the value of the '{@link Essence.BitField#getSignInterpretation <em>Sign Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignInterpretation()
	 * @see #getSignInterpretation()
	 * @see #setSignInterpretation(SignType)
	 * @generated
	 */
	void unsetSignInterpretation();

	/**
	 * Returns whether the value of the '{@link Essence.BitField#getSignInterpretation <em>Sign Interpretation</em>}' attribute is set.
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
	 * The literals are from the enumeration {@link Essence.VirtualType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual</em>' attribute.
	 * @see Essence.VirtualType
	 * @see #isSetVirtual()
	 * @see #unsetVirtual()
	 * @see #setVirtual(VirtualType)
	 * @see Essence.EssencePackage#getBitField_Virtual()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Virtual' namespace='##targetNamespace'"
	 * @generated
	 */
	VirtualType getVirtual();

	/**
	 * Sets the value of the '{@link Essence.BitField#getVirtual <em>Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual</em>' attribute.
	 * @see Essence.VirtualType
	 * @see #isSetVirtual()
	 * @see #unsetVirtual()
	 * @see #getVirtual()
	 * @generated
	 */
	void setVirtual(VirtualType value);

	/**
	 * Unsets the value of the '{@link Essence.BitField#getVirtual <em>Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVirtual()
	 * @see #getVirtual()
	 * @see #setVirtual(VirtualType)
	 * @generated
	 */
	void unsetVirtual();

	/**
	 * Returns whether the value of the '{@link Essence.BitField#getVirtual <em>Virtual</em>}' attribute is set.
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see Essence.EssencePackage#getBitField_DefaultValue()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='DefaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link Essence.BitField#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Default Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Mask</em>' attribute.
	 * @see #setDefaultMask(String)
	 * @see Essence.EssencePackage#getBitField_DefaultMask()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='DefaultMask' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefaultMask();

	/**
	 * Sets the value of the '{@link Essence.BitField#getDefaultMask <em>Default Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Mask</em>' attribute.
	 * @see #getDefaultMask()
	 * @generated
	 */
	void setDefaultMask(String value);

	/**
	 * Returns the value of the '<em><b>Access Level</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.AccessLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Level</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Level</em>' containment reference list.
	 * @see Essence.EssencePackage#getBitField_AccessLevel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AccessLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AccessLevel> getAccessLevel();

	/**
	 * Returns the value of the '<em><b>Enumeration Element</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.EnumerationElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Element</em>' containment reference list.
	 * @see Essence.EssencePackage#getBitField_EnumerationElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EnumerationElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnumerationElement> getEnumerationElement();

} // BitField
