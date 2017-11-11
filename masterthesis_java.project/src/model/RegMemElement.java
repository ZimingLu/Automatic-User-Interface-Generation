/**
 */
package model;

import modelextension.OffsetSequenceElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reg Mem Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.RegMemElement#getOffset <em>Offset</em>}</li>
 *   <li>{@link model.RegMemElement#getRelOffset <em>Rel Offset</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getRegMemElement()
 * @model abstract="true"
 *        extendedMetaData="name='RegMemElement' kind='elementOnly'"
 * @generated
 */
public interface RegMemElement extends IndexVarUser, OffsetSequenceElement {
	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(String)
	 * @see model.ModelPackage#getRegMemElement_Offset()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Offset' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOffset();

	/**
	 * Sets the value of the '{@link model.RegMemElement#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(String value);

	/**
	 * Returns the value of the '<em><b>Rel Offset</b></em>' attribute.
	 * The default value is <code>"0x0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rel Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel Offset</em>' attribute.
	 * @see #setRelOffset(String)
	 * @see model.ModelPackage#getRegMemElement_RelOffset()
	 * @model default="0x0" dataType="model.IntegerExpr" required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='return InternalModelServiceImpl.REGMEMSERVICE.getRegMemElementRelOffSet(this);'"
	 * @generated
	 */
	String getRelOffset();

	/**
	 * Sets the value of the '{@link model.RegMemElement#getRelOffset <em>Rel Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Offset</em>' attribute.
	 * @see #getRelOffset()
	 * @generated
	 */
	void setRelOffset(String value);

} // RegMemElement
