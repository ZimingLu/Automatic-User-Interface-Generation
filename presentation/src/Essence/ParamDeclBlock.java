/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Decl Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.ParamDeclBlock#getParamDecl <em>Param Decl</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getParamDeclBlock()
 * @model extendedMetaData="name='ParamDeclBlock' kind='elementOnly'"
 * @generated
 */
public interface ParamDeclBlock extends VarDefBlock {
	/**
	 * Returns the value of the '<em><b>Param Decl</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.ParamDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Decl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Decl</em>' containment reference list.
	 * @see Essence.EssencePackage#getParamDeclBlock_ParamDecl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ParamDecl' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParamDecl> getParamDecl();

} // ParamDeclBlock
