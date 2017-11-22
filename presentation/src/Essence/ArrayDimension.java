/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.ArrayDimension#isAscending <em>Ascending</em>}</li>
 *   <li>{@link Essence.ArrayDimension#getLeft <em>Left</em>}</li>
 *   <li>{@link Essence.ArrayDimension#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getArrayDimension()
 * @model extendedMetaData="name='ArrayDimension' kind='elementOnly'"
 * @generated
 */
public interface ArrayDimension extends EssenceBase {
	/**
	 * Returns the value of the '<em><b>Ascending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ascending</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ascending</em>' attribute.
	 * @see #isSetAscending()
	 * @see #unsetAscending()
	 * @see #setAscending(boolean)
	 * @see Essence.EssencePackage#getArrayDimension_Ascending()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='Ascending' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAscending();

	/**
	 * Sets the value of the '{@link Essence.ArrayDimension#isAscending <em>Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ascending</em>' attribute.
	 * @see #isSetAscending()
	 * @see #unsetAscending()
	 * @see #isAscending()
	 * @generated
	 */
	void setAscending(boolean value);

	/**
	 * Unsets the value of the '{@link Essence.ArrayDimension#isAscending <em>Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAscending()
	 * @see #isAscending()
	 * @see #setAscending(boolean)
	 * @generated
	 */
	void unsetAscending();

	/**
	 * Returns whether the value of the '{@link Essence.ArrayDimension#isAscending <em>Ascending</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ascending</em>' attribute is set.
	 * @see #unsetAscending()
	 * @see #isAscending()
	 * @see #setAscending(boolean)
	 * @generated
	 */
	boolean isSetAscending();

	/**
	 * Returns the value of the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' attribute.
	 * @see #setLeft(String)
	 * @see Essence.EssencePackage#getArrayDimension_Left()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Left' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLeft();

	/**
	 * Sets the value of the '{@link Essence.ArrayDimension#getLeft <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' attribute.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(String value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' attribute.
	 * @see #setRight(String)
	 * @see Essence.EssencePackage#getArrayDimension_Right()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Right' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRight();

	/**
	 * Sets the value of the '{@link Essence.ArrayDimension#getRight <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' attribute.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(String value);

} // ArrayDimension
