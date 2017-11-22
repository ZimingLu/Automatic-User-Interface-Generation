/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XRef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.XRef#getXRefTargetID <em>XRef Target ID</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getXRef()
 * @model abstract="true"
 *        extendedMetaData="name='XRef' kind='elementOnly'"
 * @generated
 */
public interface XRef extends Reference {
	/**
	 * Returns the value of the '<em><b>XRef Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Target ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Target ID</em>' attribute.
	 * @see #isSetXRefTargetID()
	 * @see #unsetXRefTargetID()
	 * @see #setXRefTargetID(int)
	 * @see Essence.EssencePackage#getXRef_XRefTargetID()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='XRefTargetID' namespace='##targetNamespace'"
	 * @generated
	 */
	int getXRefTargetID();

	/**
	 * Sets the value of the '{@link Essence.XRef#getXRefTargetID <em>XRef Target ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Target ID</em>' attribute.
	 * @see #isSetXRefTargetID()
	 * @see #unsetXRefTargetID()
	 * @see #getXRefTargetID()
	 * @generated
	 */
	void setXRefTargetID(int value);

	/**
	 * Unsets the value of the '{@link Essence.XRef#getXRefTargetID <em>XRef Target ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXRefTargetID()
	 * @see #getXRefTargetID()
	 * @see #setXRefTargetID(int)
	 * @generated
	 */
	void unsetXRefTargetID();

	/**
	 * Returns whether the value of the '{@link Essence.XRef#getXRefTargetID <em>XRef Target ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>XRef Target ID</em>' attribute is set.
	 * @see #unsetXRefTargetID()
	 * @see #getXRefTargetID()
	 * @see #setXRefTargetID(int)
	 * @generated
	 */
	boolean isSetXRefTargetID();

} // XRef
