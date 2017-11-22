/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.BooleanDef#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getBooleanDef()
 * @model extendedMetaData="name='BooleanDef' kind='elementOnly'"
 * @generated
 */
public interface BooleanDef extends ConstDef {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see Essence.EssencePackage#getBooleanDef_Value()
	 * @model dataType="Essence.BooleanLiteral" required="true"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link Essence.BooleanDef#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // BooleanDef