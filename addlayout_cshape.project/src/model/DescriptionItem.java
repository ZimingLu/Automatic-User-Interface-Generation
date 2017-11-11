/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.DescriptionItem#getHtml <em>Html</em>}</li>
 *   <li>{@link model.DescriptionItem#getDita <em>Dita</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getDescriptionItem()
 * @model extendedMetaData="name='DescriptionItem' kind='elementOnly'"
 * @generated
 */
public interface DescriptionItem extends EssenceBase {
	/**
	 * Returns the value of the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Html</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html</em>' attribute.
	 * @see #setHtml(String)
	 * @see model.ModelPackage#getDescriptionItem_Html()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='html' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHtml();

	/**
	 * Sets the value of the '{@link model.DescriptionItem#getHtml <em>Html</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html</em>' attribute.
	 * @see #getHtml()
	 * @generated
	 */
	void setHtml(String value);

	/**
	 * Returns the value of the '<em><b>Dita</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dita</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dita</em>' attribute.
	 * @see #setDita(String)
	 * @see model.ModelPackage#getDescriptionItem_Dita()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='dita' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDita();

	/**
	 * Sets the value of the '{@link model.DescriptionItem#getDita <em>Dita</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dita</em>' attribute.
	 * @see #getDita()
	 * @generated
	 */
	void setDita(String value);

} // DescriptionItem
