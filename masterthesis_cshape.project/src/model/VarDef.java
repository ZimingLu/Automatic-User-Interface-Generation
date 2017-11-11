/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.VarDef#getType <em>Type</em>}</li>
 *   <li>{@link model.VarDef#getVarDefValue <em>Var Def Value</em>}</li>
 *   <li>{@link model.VarDef#getVarDefOverride <em>Var Def Override</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getVarDef()
 * @model abstract="true"
 *        extendedMetaData="name='VarDef' kind='elementOnly'"
 * @generated
 */
public interface VarDef extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see model.ModelPackage#getVarDef_Type()
	 * @model required="true" transient="true" changeable="false" volatile="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='return this.eClass().getName();'"
	 * @generated
	 */
	String getType();

	/**
	 * Returns the value of the '<em><b>Var Def Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Def Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Def Value</em>' attribute.
	 * @see #setVarDefValue(String)
	 * @see model.ModelPackage#getVarDef_VarDefValue()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='if (this instanceof com.infineon.essence.model.ConstDef) {\n\treturn (String)this.eGet(this.eClass().getEStructuralFeature(\"value\"));\n} else {\n\treturn (String)this.eGet(this.eClass().getEStructuralFeature(\"defaultValue\"));\n}'"
	 * @generated
	 */
	String getVarDefValue();

	/**
	 * Sets the value of the '{@link model.VarDef#getVarDefValue <em>Var Def Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Def Value</em>' attribute.
	 * @see #getVarDefValue()
	 * @generated
	 */
	void setVarDefValue(String value);

	/**
	 * Returns the value of the '<em><b>Var Def Override</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Def Override</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Def Override</em>' attribute.
	 * @see #setVarDefOverride(String)
	 * @see model.ModelPackage#getVarDef_VarDefOverride()
	 * @model default="" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	String getVarDefOverride();

	/**
	 * Sets the value of the '{@link model.VarDef#getVarDefOverride <em>Var Def Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Def Override</em>' attribute.
	 * @see #getVarDefOverride()
	 * @generated
	 */
	void setVarDefOverride(String value);

} // VarDef
