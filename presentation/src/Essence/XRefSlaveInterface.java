/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XRef Slave Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.XRefSlaveInterface#getRange <em>Range</em>}</li>
 *   <li>{@link Essence.XRefSlaveInterface#getSrcOffset <em>Src Offset</em>}</li>
 *   <li>{@link Essence.XRefSlaveInterface#getTgtOffset <em>Tgt Offset</em>}</li>
 *   <li>{@link Essence.XRefSlaveInterface#getXRefInstance <em>XRef Instance</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getXRefSlaveInterface()
 * @model extendedMetaData="name='XRefSlaveInterface' kind='elementOnly'"
 * @generated
 */
public interface XRefSlaveInterface extends XRefExternal {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #setRange(String)
	 * @see Essence.EssencePackage#getXRefSlaveInterface_Range()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Range' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRange();

	/**
	 * Sets the value of the '{@link Essence.XRefSlaveInterface#getRange <em>Range</em>}' attribute.
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
	 * @see Essence.EssencePackage#getXRefSlaveInterface_SrcOffset()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='SrcOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSrcOffset();

	/**
	 * Sets the value of the '{@link Essence.XRefSlaveInterface#getSrcOffset <em>Src Offset</em>}' attribute.
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
	 * @see Essence.EssencePackage#getXRefSlaveInterface_TgtOffset()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='TgtOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTgtOffset();

	/**
	 * Sets the value of the '{@link Essence.XRefSlaveInterface#getTgtOffset <em>Tgt Offset</em>}' attribute.
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
	 * @see Essence.EssencePackage#getXRefSlaveInterface_XRefInstance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefInstance getXRefInstance();

	/**
	 * Sets the value of the '{@link Essence.XRefSlaveInterface#getXRefInstance <em>XRef Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Instance</em>' containment reference.
	 * @see #getXRefInstance()
	 * @generated
	 */
	void setXRefInstance(XRefInstance value);

} // XRefSlaveInterface
