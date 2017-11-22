/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.ParamMap#getXRefParamDecl <em>XRef Param Decl</em>}</li>
 *   <li>{@link Essence.ParamMap#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getParamMap()
 * @model extendedMetaData="name='ParamMap' kind='elementOnly'"
 * @generated
 */
public interface ParamMap extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>XRef Param Decl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Param Decl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Param Decl</em>' containment reference.
	 * @see #setXRefParamDecl(XRefParamDecl)
	 * @see Essence.EssencePackage#getParamMap_XRefParamDecl()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefParamDecl' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefParamDecl getXRefParamDecl();

	/**
	 * Sets the value of the '{@link Essence.ParamMap#getXRefParamDecl <em>XRef Param Decl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Param Decl</em>' containment reference.
	 * @see #getXRefParamDecl()
	 * @generated
	 */
	void setXRefParamDecl(XRefParamDecl value);

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
	 * @see Essence.EssencePackage#getParamMap_Value()
	 * @model dataType="Essence.CommonExpr" required="true"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link Essence.ParamMap#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ParamMap
