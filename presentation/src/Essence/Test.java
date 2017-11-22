/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.Test#getParallelFactor <em>Parallel Factor</em>}</li>
 *   <li>{@link Essence.Test#getTestReq <em>Test Req</em>}</li>
 *   <li>{@link Essence.Test#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getTest()
 * @model extendedMetaData="name='Test' kind='elementOnly'"
 * @generated
 */
public interface Test extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>Parallel Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallel Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel Factor</em>' attribute.
	 * @see #setParallelFactor(String)
	 * @see Essence.EssencePackage#getTest_ParallelFactor()
	 * @model dataType="Essence.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='ParallelFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	String getParallelFactor();

	/**
	 * Sets the value of the '{@link Essence.Test#getParallelFactor <em>Parallel Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel Factor</em>' attribute.
	 * @see #getParallelFactor()
	 * @generated
	 */
	void setParallelFactor(String value);

	/**
	 * Returns the value of the '<em><b>Test Req</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Req</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Req</em>' containment reference.
	 * @see #setTestReq(TestReq)
	 * @see Essence.EssencePackage#getTest_TestReq()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TestReq' namespace='##targetNamespace'"
	 * @generated
	 */
	TestReq getTestReq();

	/**
	 * Sets the value of the '{@link Essence.Test#getTestReq <em>Test Req</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Req</em>' containment reference.
	 * @see #getTestReq()
	 * @generated
	 */
	void setTestReq(TestReq value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see Essence.EssencePackage#getTest_Function()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Function' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Function> getFunction();

} // Test
