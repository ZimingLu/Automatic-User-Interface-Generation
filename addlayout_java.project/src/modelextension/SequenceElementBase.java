/**
 */
package modelextension;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Element Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelextension.SequenceElementBase#getSequenceIndex <em>Sequence Index</em>}</li>
 * </ul>
 *
 * @see modelextension.ModelextensionPackage#getSequenceElementBase()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SequenceElementBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Sequence Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Index</em>' attribute.
	 * @see #setSequenceIndex(int)
	 * @see modelextension.ModelextensionPackage#getSequenceElementBase_SequenceIndex()
	 * @model transient="true"
	 * @generated
	 */
	int getSequenceIndex();

	/**
	 * Sets the value of the '{@link modelextension.SequenceElementBase#getSequenceIndex <em>Sequence Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Index</em>' attribute.
	 * @see #getSequenceIndex()
	 * @generated
	 */
	void setSequenceIndex(int value);

} // SequenceElementBase
