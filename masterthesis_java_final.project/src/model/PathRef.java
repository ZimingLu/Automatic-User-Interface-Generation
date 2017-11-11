/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.PathRef#getLocation <em>Location</em>}</li>
 *   <li>{@link model.PathRef#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getPathRef()
 * @model extendedMetaData="name='PathRef' kind='elementOnly'"
 * @generated
 */
public interface PathRef extends Reference {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see model.ModelPackage#getPathRef_Location()
	 * @model dataType="model.PathExpr" required="true"
	 *        extendedMetaData="kind='element' name='Location' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link model.PathRef#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see model.ModelPackage#getPathRef_Name()
	 * @model dataType="model.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.PathRef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PathRef
