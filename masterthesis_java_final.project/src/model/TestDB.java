/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.TestDB#getTest <em>Test</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getTestDB()
 * @model extendedMetaData="name='TestDB' kind='elementOnly'"
 * @generated
 */
public interface TestDB extends ModelRoot {
	/**
	 * Returns the value of the '<em><b>Test</b></em>' containment reference list.
	 * The list contents are of type {@link model.Test}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' containment reference list.
	 * @see model.ModelPackage#getTestDB_Test()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Test' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Test> getTest();

} // TestDB
