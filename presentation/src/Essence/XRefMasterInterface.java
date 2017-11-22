/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XRef Master Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.XRefMasterInterface#getRange <em>Range</em>}</li>
 *   <li>{@link Essence.XRefMasterInterface#getSrcOffset <em>Src Offset</em>}</li>
 *   <li>{@link Essence.XRefMasterInterface#getTgtOffset <em>Tgt Offset</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getXRefMasterInterface()
 * @model extendedMetaData="name='XRefMasterInterface' kind='elementOnly'"
 * @generated
 */
public interface XRefMasterInterface extends XRefInternal {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #setRange(String)
	 * @see Essence.EssencePackage#getXRefMasterInterface_Range()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Range' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRange();

	/**
	 * Sets the value of the '{@link Essence.XRefMasterInterface#getRange <em>Range</em>}' attribute.
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
	 * @see Essence.EssencePackage#getXRefMasterInterface_SrcOffset()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='SrcOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSrcOffset();

	/**
	 * Sets the value of the '{@link Essence.XRefMasterInterface#getSrcOffset <em>Src Offset</em>}' attribute.
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
	 * @see Essence.EssencePackage#getXRefMasterInterface_TgtOffset()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='TgtOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTgtOffset();

	/**
	 * Sets the value of the '{@link Essence.XRefMasterInterface#getTgtOffset <em>Tgt Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt Offset</em>' attribute.
	 * @see #getTgtOffset()
	 * @generated
	 */
	void setTgtOffset(String value);

} // XRefMasterInterface
