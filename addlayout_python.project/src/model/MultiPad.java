/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Pad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.MultiPad#getSinglePad <em>Single Pad</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getMultiPad()
 * @model extendedMetaData="name='MultiPad' kind='elementOnly'"
 * @generated
 */
public interface MultiPad extends Pad {
	/**
	 * Returns the value of the '<em><b>Single Pad</b></em>' containment reference list.
	 * The list contents are of type {@link model.SinglePad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Pad</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Pad</em>' containment reference list.
	 * @see model.ModelPackage#getMultiPad_SinglePad()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SinglePad' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SinglePad> getSinglePad();

} // MultiPad
