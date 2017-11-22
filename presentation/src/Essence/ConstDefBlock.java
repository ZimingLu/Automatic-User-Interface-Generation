/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Const Def Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.ConstDefBlock#getConstDef <em>Const Def</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getConstDefBlock()
 * @model extendedMetaData="name='ConstDefBlock' kind='elementOnly'"
 * @generated
 */
public interface ConstDefBlock extends VarDefBlock {
	/**
	 * Returns the value of the '<em><b>Const Def</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.ConstDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Const Def</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const Def</em>' containment reference list.
	 * @see Essence.EssencePackage#getConstDefBlock_ConstDef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConstDef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConstDef> getConstDef();

} // ConstDefBlock
