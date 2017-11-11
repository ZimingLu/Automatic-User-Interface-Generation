/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.GenericMap#getXRefGenericDecl <em>XRef Generic Decl</em>}</li>
 *   <li>{@link model.GenericMap#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getGenericMap()
 * @model extendedMetaData="name='GenericMap' kind='elementOnly'"
 * @generated
 */
public interface GenericMap extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>XRef Generic Decl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Generic Decl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Generic Decl</em>' containment reference.
	 * @see #setXRefGenericDecl(XRefGenericDecl)
	 * @see model.ModelPackage#getGenericMap_XRefGenericDecl()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefGenericDecl' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefGenericDecl getXRefGenericDecl();

	/**
	 * Sets the value of the '{@link model.GenericMap#getXRefGenericDecl <em>XRef Generic Decl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Generic Decl</em>' containment reference.
	 * @see #getXRefGenericDecl()
	 * @generated
	 */
	void setXRefGenericDecl(XRefGenericDecl value);

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
	 * @see model.ModelPackage#getGenericMap_Value()
	 * @model dataType="model.CommonExpr" required="true"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link model.GenericMap#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // GenericMap
