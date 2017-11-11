/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Pad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.SinglePad#getXCoordinate <em>XCoordinate</em>}</li>
 *   <li>{@link model.SinglePad#getYCoordinate <em>YCoordinate</em>}</li>
 *   <li>{@link model.SinglePad#getSpacer <em>Spacer</em>}</li>
 *   <li>{@link model.SinglePad#getOpening <em>Opening</em>}</li>
 *   <li>{@link model.SinglePad#getLocation <em>Location</em>}</li>
 *   <li>{@link model.SinglePad#getPadCount <em>Pad Count</em>}</li>
 *   <li>{@link model.SinglePad#getPlace <em>Place</em>}</li>
 *   <li>{@link model.SinglePad#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link model.SinglePad#getPower <em>Power</em>}</li>
 *   <li>{@link model.SinglePad#getGround <em>Ground</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getSinglePad()
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
	 * @see model.ModelPackage#getSinglePad_XCoordinate()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='XCoordinate' namespace='##targetNamespace'"
	 * @generated
	 */
	String getXCoordinate();

	/**
	 * Sets the value of the '{@link model.SinglePad#getXCoordinate <em>XCoordinate</em>}' attribute.
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
	 * @see model.ModelPackage#getSinglePad_YCoordinate()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='YCoordinate' namespace='##targetNamespace'"
	 * @generated
	 */
	String getYCoordinate();

	/**
	 * Sets the value of the '{@link model.SinglePad#getYCoordinate <em>YCoordinate</em>}' attribute.
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
	 * @see model.ModelPackage#getSinglePad_Spacer()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Spacer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSpacer();

	/**
	 * Sets the value of the '{@link model.SinglePad#getSpacer <em>Spacer</em>}' attribute.
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
	 * @see model.ModelPackage#getSinglePad_Opening()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='Opening' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOpening();

	/**
	 * Sets the value of the '{@link model.SinglePad#getOpening <em>Opening</em>}' attribute.
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
	 * @see model.ModelPackage#getSinglePad_Location()
	 * @model dataType="model.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Location' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link model.SinglePad#getLocation <em>Location</em>}' attribute.
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
	 * @see model.ModelPackage#getSinglePad_PadCount()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='PadCount' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPadCount();

	/**
	 * Sets the value of the '{@link model.SinglePad#getPadCount <em>Pad Count</em>}' attribute.
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
	 * @see model.ModelPackage#getSinglePad_Place()
	 * @model dataType="model.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Place' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPlace();

	/**
	 * Sets the value of the '{@link model.SinglePad#getPlace <em>Place</em>}' attribute.
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
	 * @see model.ModelPackage#getSinglePad_Orientation()
	 * @model dataType="model.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrientation();

	/**
	 * Sets the value of the '{@link model.SinglePad#getOrientation <em>Orientation</em>}' attribute.
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
	 * @see model.ModelPackage#getSinglePad_Power()
	 * @model dataType="model.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Power' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPower();

	/**
	 * Sets the value of the '{@link model.SinglePad#getPower <em>Power</em>}' attribute.
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
	 * @see model.ModelPackage#getSinglePad_Ground()
	 * @model dataType="model.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Ground' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGround();

	/**
	 * Sets the value of the '{@link model.SinglePad#getGround <em>Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground</em>' attribute.
	 * @see #getGround()
	 * @generated
	 */
	void setGround(String value);

} // SinglePad
