/**
 */
package modelextension;

import model.ResetType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit Reset Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelextension.BitResetType#getBitResetType <em>Bit Reset Type</em>}</li>
 * </ul>
 *
 * @see modelextension.ModelextensionPackage#getBitResetType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BitResetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bit Reset Type</b></em>' containment reference list.
	 * The list contents are of type {@link model.ResetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Reset Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Reset Type</em>' containment reference list.
	 * @see modelextension.ModelextensionPackage#getBitResetType_BitResetType()
	 * @model containment="true" transient="true" derived="true"
	 * @generated
	 */
	EList<ResetType> getBitResetType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (bitResetType != null) {\n\tbitResetType.clear();\n\tbitResetType.addAll(InternalModelServiceImpl.BUSINESSLOGICSERVICE.getBitResetType(this));\n}'"
	 * @generated
	 */
	void refreshBitResetType();

} // BitResetType
