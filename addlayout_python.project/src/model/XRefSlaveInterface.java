/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XRef Slave Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.XRefSlaveInterface#getRange <em>Range</em>}</li>
 *   <li>{@link model.XRefSlaveInterface#getSrcOffset <em>Src Offset</em>}</li>
 *   <li>{@link model.XRefSlaveInterface#getTgtOffset <em>Tgt Offset</em>}</li>
 *   <li>{@link model.XRefSlaveInterface#getXRefInstance <em>XRef Instance</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getXRefSlaveInterface()
 * @model extendedMetaData="name='XRefSlaveInterface' kind='elementOnly'"
 * @generated
 */
public interface XRefSlaveInterface extends XRefExternal {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #setRange(String)
	 * @see model.ModelPackage#getXRefSlaveInterface_Range()
	 * @model default="1" dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Range' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRange();

	/**
	 * Sets the value of the '{@link model.XRefSlaveInterface#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(String value);

	/**
	 * Returns the value of the '<em><b>Src Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Offset</em>' attribute.
	 * @see #setSrcOffset(String)
	 * @see model.ModelPackage#getXRefSlaveInterface_SrcOffset()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='SrcOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSrcOffset();

	/**
	 * Sets the value of the '{@link model.XRefSlaveInterface#getSrcOffset <em>Src Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src Offset</em>' attribute.
	 * @see #getSrcOffset()
	 * @generated
	 */
	void setSrcOffset(String value);

	/**
	 * Returns the value of the '<em><b>Tgt Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tgt Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt Offset</em>' attribute.
	 * @see #setTgtOffset(String)
	 * @see model.ModelPackage#getXRefSlaveInterface_TgtOffset()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='TgtOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTgtOffset();

	/**
	 * Sets the value of the '{@link model.XRefSlaveInterface#getTgtOffset <em>Tgt Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt Offset</em>' attribute.
	 * @see #getTgtOffset()
	 * @generated
	 */
	void setTgtOffset(String value);

	/**
	 * Returns the value of the '<em><b>XRef Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Instance</em>' containment reference.
	 * @see #setXRefInstance(XRefInstance)
	 * @see model.ModelPackage#getXRefSlaveInterface_XRefInstance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefInstance getXRefInstance();

	/**
	 * Sets the value of the '{@link model.XRefSlaveInterface#getXRefInstance <em>XRef Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Instance</em>' containment reference.
	 * @see #getXRefInstance()
	 * @generated
	 */
	void setXRefInstance(XRefInstance value);

} // XRefSlaveInterface
