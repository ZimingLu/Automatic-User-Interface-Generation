/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Source Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.SingleSourceNode#getCustom <em>Custom</em>}</li>
 *   <li>{@link model.SingleSourceNode#getHidden <em>Hidden</em>}</li>
 *   <li>{@link model.SingleSourceNode#getID <em>ID</em>}</li>
 *   <li>{@link model.SingleSourceNode#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link model.SingleSourceNode#getName <em>Name</em>}</li>
 *   <li>{@link model.SingleSourceNode#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link model.SingleSourceNode#getShortName <em>Short Name</em>}</li>
 *   <li>{@link model.SingleSourceNode#getProperty <em>Property</em>}</li>
 *   <li>{@link model.SingleSourceNode#getXRefExtension <em>XRef Extension</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getSingleSourceNode()
 * @model abstract="true"
 *        extendedMetaData="name='SingleSourceNode' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CustomConstraint'"
 * @generated
 */
public interface SingleSourceNode extends EssenceBase {
	/**
	 * Returns the value of the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom</em>' attribute.
	 * @see #setCustom(String)
	 * @see model.ModelPackage#getSingleSourceNode_Custom()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Custom' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCustom();

	/**
	 * Sets the value of the '{@link model.SingleSourceNode#getCustom <em>Custom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom</em>' attribute.
	 * @see #getCustom()
	 * @generated
	 */
	void setCustom(String value);

	/**
	 * Returns the value of the '<em><b>Hidden</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hidden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden</em>' attribute.
	 * @see #setHidden(String)
	 * @see model.ModelPackage#getSingleSourceNode_Hidden()
	 * @model default="false" dataType="model.BooleanExpr" required="true"
	 *        extendedMetaData="kind='element' name='Hidden' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHidden();

	/**
	 * Sets the value of the '{@link model.SingleSourceNode#getHidden <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden</em>' attribute.
	 * @see #getHidden()
	 * @generated
	 */
	void setHidden(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #setID(int)
	 * @see model.ModelPackage#getSingleSourceNode_ID()
	 * @model unsettable="true" id="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='ID' namespace='##targetNamespace'"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link model.SingleSourceNode#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Unsets the value of the '{@link model.SingleSourceNode#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetID()
	 * @see #getID()
	 * @see #setID(int)
	 * @generated
	 */
	void unsetID();

	/**
	 * Returns whether the value of the '{@link model.SingleSourceNode#getID <em>ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID</em>' attribute is set.
	 * @see #unsetID()
	 * @see #getID()
	 * @see #setID(int)
	 * @generated
	 */
	boolean isSetID();

	/**
	 * Returns the value of the '<em><b>Long Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Description</em>' containment reference.
	 * @see #setLongDescription(DescriptionItem)
	 * @see model.ModelPackage#getSingleSourceNode_LongDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LongDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionItem getLongDescription();

	/**
	 * Sets the value of the '{@link model.SingleSourceNode#getLongDescription <em>Long Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Description</em>' containment reference.
	 * @see #getLongDescription()
	 * @generated
	 */
	void setLongDescription(DescriptionItem value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"DefaultName"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see model.ModelPackage#getSingleSourceNode_Name()
	 * @model default="DefaultName" dataType="model.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.SingleSourceNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Description</em>' attribute.
	 * @see #setShortDescription(String)
	 * @see model.ModelPackage#getSingleSourceNode_ShortDescription()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ShortDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getShortDescription();

	/**
	 * Sets the value of the '{@link model.SingleSourceNode#getShortDescription <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Description</em>' attribute.
	 * @see #getShortDescription()
	 * @generated
	 */
	void setShortDescription(String value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see model.ModelPackage#getSingleSourceNode_ShortName()
	 * @model dataType="model.StringExpr"
	 *        extendedMetaData="kind='element' name='ShortName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link model.SingleSourceNode#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link model.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see model.ModelPackage#getSingleSourceNode_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Property> getProperty();

	/**
	 * Returns the value of the '<em><b>XRef Extension</b></em>' containment reference list.
	 * The list contents are of type {@link model.PathRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Extension</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Extension</em>' containment reference list.
	 * @see model.ModelPackage#getSingleSourceNode_XRefExtension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='XRefExtension' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PathRef> getXRefExtension();

} // SingleSourceNode
