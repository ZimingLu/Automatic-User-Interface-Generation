/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Record#getDataTypeElement <em>Data Type Element</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getRecord()
 * @model extendedMetaData="name='Record' kind='elementOnly'"
 * @generated
 */
public interface Record extends ComplexDataType {
	/**
	 * Returns the value of the '<em><b>Data Type Element</b></em>' containment reference list.
	 * The list contents are of type {@link model.DataTypeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Element</em>' containment reference list.
	 * @see model.ModelPackage#getRecord_DataTypeElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DataTypeElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataTypeElement> getDataTypeElement();

} // Record
