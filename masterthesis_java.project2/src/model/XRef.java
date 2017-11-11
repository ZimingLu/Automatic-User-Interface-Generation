/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XRef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.XRef#getXRefTargetID <em>XRef Target ID</em>}</li>
 *   <li>{@link model.XRef#getXRefTarget <em>XRef Target</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getXRef()
 * @model abstract="true"
 *        extendedMetaData="name='XRef' kind='elementOnly'"
 * @generated
 */
public interface XRef extends Reference {
	/**
	 * Returns the value of the '<em><b>XRef Target ID</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Target ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Target ID</em>' attribute.
	 * @see #setXRefTargetID(int)
	 * @see model.ModelPackage#getXRef_XRefTargetID()
	 * @model default="0" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true" derived="true"
	 *        extendedMetaData="kind='element' name='XRefTargetID' namespace='##targetNamespace'"
	 * @generated
	 */
	int getXRefTargetID();

	/**
	 * Sets the value of the '{@link model.XRef#getXRefTargetID <em>XRef Target ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Target ID</em>' attribute.
	 * @see #getXRefTargetID()
	 * @generated
	 */
	void setXRefTargetID(int value);

	/**
	 * Returns the value of the '<em><b>XRef Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Target</em>' reference.
	 * @see #setXRefTarget(SingleSourceNode)
	 * @see model.ModelPackage#getXRef_XRefTarget()
	 * @model keys="iD" transient="true"
	 * @generated
	 */
	SingleSourceNode getXRefTarget();

	/**
	 * Sets the value of the '{@link model.XRef#getXRefTarget <em>XRef Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Target</em>' reference.
	 * @see #getXRefTarget()
	 * @generated
	 */
	void setXRefTarget(SingleSourceNode value);

} // XRef
