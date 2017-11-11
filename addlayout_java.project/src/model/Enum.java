/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Enum#getEnumElement <em>Enum Element</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getEnum()
 * @model extendedMetaData="name='Enum' kind='elementOnly'"
 * @generated
 */
public interface Enum extends ComplexDataType {
	/**
	 * Returns the value of the '<em><b>Enum Element</b></em>' containment reference list.
	 * The list contents are of type {@link model.EnumElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Element</em>' containment reference list.
	 * @see model.ModelPackage#getEnum_EnumElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EnumElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnumElement> getEnumElement();

} // Enum
