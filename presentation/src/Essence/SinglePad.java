/**
 */
package Essence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Pad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.SinglePad#getXCoordinate <em>XCoordinate</em>}</li>
 *   <li>{@link Essence.SinglePad#getYCoordinate <em>YCoordinate</em>}</li>
 *   <li>{@link Essence.SinglePad#getSpacer <em>Spacer</em>}</li>
 *   <li>{@link Essence.SinglePad#getOpening <em>Opening</em>}</li>
 *   <li>{@link Essence.SinglePad#getLocation <em>Location</em>}</li>
 *   <li>{@link Essence.SinglePad#getPadCount <em>Pad Count</em>}</li>
 *   <li>{@link Essence.SinglePad#getPlace <em>Place</em>}</li>
 *   <li>{@link Essence.SinglePad#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link Essence.SinglePad#getPower <em>Power</em>}</li>
 *   <li>{@link Essence.SinglePad#getGround <em>Ground</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getSinglePad()
 * @model abstract="true"
 *        extendedMetaData="name='SinglePad' kind='elementOnly'"
 * @generated
 */
public interface SinglePad extends Pad {
	/**
	 * Returns the value of the '<em><b>XCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XCoordinate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XCoordinate</em>' attribute.
	 * @see #setXCoordinate(String)
	 * @see Essence.EssencePackage#getSinglePad_XCoordinate()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='XCoordinate' namespace='##targetNamespace'"
	 * @generated
	 */
	String getXCoordinate();

	/**
	 * Sets the value of the '{@link Essence.SinglePad#getXCoordinate <em>XCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XCoordinate</em>' attribute.
	 * @see #getXCoordinate()
	 * @generated
	 */
	void setXCoordinate(String value);

	/**
	 * Returns the value of the '<em><b>YCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YCoordinate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YCoordinate</em>' attribute.
	 * @see #setYCoordinate(String)
	 * @see Essence.EssencePackage#getSinglePad_YCoordinate()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='YCoordinate' namespace='##targetNamespace'"
	 * @generated
	 */
	String getYCoordinate();

	/**
	 * Sets the value of the '{@link Essence.SinglePad#getYCoordinate <em>YCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YCoordinate</em>' attribute.
	 * @see #getYCoordinate()
	 * @generated
	 */
	void setYCoordinate(String value);

	/**
	 * Returns the value of the '<em><b>Spacer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spacer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spacer</em>' attribute.
	 * @see #setSpacer(String)
	 * @see Essence.EssencePackage#getSinglePad_Spacer()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Spacer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSpacer();

	/**
	 * Sets the value of the '{@link Essence.SinglePad#getSpacer <em>Spacer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spacer</em>' attribute.
	 * @see #getSpacer()
	 * @generated
	 */
	void setSpacer(String value);

	/**
	 * Returns the value of the '<em><b>Opening</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opening</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening</em>' attribute.
	 * @see #setOpening(String)
	 * @see Essence.EssencePackage#getSinglePad_Opening()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Opening' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOpening();

	/**
	 * Sets the value of the '{@link Essence.SinglePad#getOpening <em>Opening</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening</em>' attribute.
	 * @see #getOpening()
	 * @generated
	 */
	void setOpening(String value);

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
	 * @see Essence.EssencePackage#getSinglePad_Location()
	 * @model dataType="Essence.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Location' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link Essence.SinglePad#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Pad Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pad Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pad Count</em>' attribute.
	 * @see #setPadCount(String)
	 * @see Essence.EssencePackage#getSinglePad_PadCount()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='PadCount' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPadCount();

	/**
	 * Sets the value of the '{@link Essence.SinglePad#getPadCount <em>Pad Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pad Count</em>' attribute.
	 * @see #getPadCount()
	 * @generated
	 */
	void setPadCount(String value);

	/**
	 * Returns the value of the '<em><b>Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' attribute.
	 * @see #setPlace(String)
	 * @see Essence.EssencePackage#getSinglePad_Place()
	 * @model dataType="Essence.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Place' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPlace();

	/**
	 * Sets the value of the '{@link Essence.SinglePad#getPlace <em>Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' attribute.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(String value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see #setOrientation(String)
	 * @see Essence.EssencePackage#getSinglePad_Orientation()
	 * @model dataType="Essence.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrientation();

	/**
	 * Sets the value of the '{@link Essence.SinglePad#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(String value);

	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see #setPower(String)
	 * @see Essence.EssencePackage#getSinglePad_Power()
	 * @model dataType="Essence.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Power' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPower();

	/**
	 * Sets the value of the '{@link Essence.SinglePad#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(String value);

	/**
	 * Returns the value of the '<em><b>Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground</em>' attribute.
	 * @see #setGround(String)
	 * @see Essence.EssencePackage#getSinglePad_Ground()
	 * @model dataType="Essence.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Ground' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGround();

	/**
	 * Sets the value of the '{@link Essence.SinglePad#getGround <em>Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground</em>' attribute.
	 * @see #getGround()
	 * @generated
	 */
	void setGround(String value);

} // SinglePad
