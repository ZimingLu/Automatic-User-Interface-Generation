/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Decl Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.GenericDeclBlock#getGenericDecl <em>Generic Decl</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getGenericDeclBlock()
 * @model extendedMetaData="name='GenericDeclBlock' kind='elementOnly'"
 * @generated
 */
public interface GenericDeclBlock extends VarDefBlock {
	/**
	 * Returns the value of the '<em><b>Generic Decl</b></em>' containment reference list.
	 * The list contents are of type {@link model.GenericDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Decl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Decl</em>' containment reference list.
	 * @see model.ModelPackage#getGenericDeclBlock_GenericDecl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GenericDecl' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenericDecl> getGenericDecl();

} // GenericDeclBlock
