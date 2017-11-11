/**
 */
package modelextension;

import model.EssenceBase;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Essence Base Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelextension.EssenceBaseExtension#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see modelextension.ModelextensionPackage#getEssenceBaseExtension()
 * @model
 * @generated
 */
public interface EssenceBaseExtension extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see modelextension.ModelextensionPackage#getEssenceBaseExtension_Parent()
	 * @model transient="true" derived="true" suppressedSetVisibility="true"
	 * @generated
	 */
	EssenceBase getParent();

} // EssenceBaseExtension
