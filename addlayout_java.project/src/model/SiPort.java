/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Si Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.SiPort#getPdr <em>Pdr</em>}</li>
 *   <li>{@link model.SiPort#getXRefTest <em>XRef Test</em>}</li>
 *   <li>{@link model.SiPort#getSiPortReq <em>Si Port Req</em>}</li>
 *   <li>{@link model.SiPort#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getSiPort()
 * @model extendedMetaData="name='SiPort' kind='elementOnly'"
 * @generated
 */
public interface SiPort extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>Pdr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pdr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pdr</em>' attribute.
	 * @see #setPdr(String)
	 * @see model.ModelPackage#getSiPort_Pdr()
	 * @model dataType="model.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Pdr' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPdr();

	/**
	 * Sets the value of the '{@link model.SiPort#getPdr <em>Pdr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pdr</em>' attribute.
	 * @see #getPdr()
	 * @generated
	 */
	void setPdr(String value);

	/**
	 * Returns the value of the '<em><b>XRef Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Test</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Test</em>' containment reference.
	 * @see #setXRefTest(XRefTest)
	 * @see model.ModelPackage#getSiPort_XRefTest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='XRefTest' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefTest getXRefTest();

	/**
	 * Sets the value of the '{@link model.SiPort#getXRefTest <em>XRef Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Test</em>' containment reference.
	 * @see #getXRefTest()
	 * @generated
	 */
	void setXRefTest(XRefTest value);

	/**
	 * Returns the value of the '<em><b>Si Port Req</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Si Port Req</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Si Port Req</em>' containment reference.
	 * @see #setSiPortReq(SiPortReq)
	 * @see model.ModelPackage#getSiPort_SiPortReq()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SiPortReq' namespace='##targetNamespace'"
	 * @generated
	 */
	SiPortReq getSiPortReq();

	/**
	 * Sets the value of the '{@link model.SiPort#getSiPortReq <em>Si Port Req</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Si Port Req</em>' containment reference.
	 * @see #getSiPortReq()
	 * @generated
	 */
	void setSiPortReq(SiPortReq value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link model.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see model.ModelPackage#getSiPort_Function()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Function' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Function> getFunction();

} // SiPort
