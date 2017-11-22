/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.SinglePad;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Pad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.SinglePadImpl#getXCoordinate <em>XCoordinate</em>}</li>
 *   <li>{@link Essence.impl.SinglePadImpl#getYCoordinate <em>YCoordinate</em>}</li>
 *   <li>{@link Essence.impl.SinglePadImpl#getSpacer <em>Spacer</em>}</li>
 *   <li>{@link Essence.impl.SinglePadImpl#getOpening <em>Opening</em>}</li>
 *   <li>{@link Essence.impl.SinglePadImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link Essence.impl.SinglePadImpl#getPadCount <em>Pad Count</em>}</li>
 *   <li>{@link Essence.impl.SinglePadImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link Essence.impl.SinglePadImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link Essence.impl.SinglePadImpl#getPower <em>Power</em>}</li>
 *   <li>{@link Essence.impl.SinglePadImpl#getGround <em>Ground</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SinglePadImpl extends PadImpl implements SinglePad {
	/**
	 * The default value of the '{@link #getXCoordinate() <em>XCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCoordinate()
	 * @generated
	 * @ordered
	 */
	protected static final String XCOORDINATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXCoordinate() <em>XCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCoordinate()
	 * @generated
	 * @ordered
	 */
	protected String xCoordinate = XCOORDINATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYCoordinate() <em>YCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCoordinate()
	 * @generated
	 * @ordered
	 */
	protected static final String YCOORDINATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYCoordinate() <em>YCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCoordinate()
	 * @generated
	 * @ordered
	 */
	protected String yCoordinate = YCOORDINATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpacer() <em>Spacer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacer()
	 * @generated
	 * @ordered
	 */
	protected static final String SPACER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpacer() <em>Spacer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacer()
	 * @generated
	 * @ordered
	 */
	protected String spacer = SPACER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpening() <em>Opening</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpening()
	 * @generated
	 * @ordered
	 */
	protected static final String OPENING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpening() <em>Opening</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpening()
	 * @generated
	 * @ordered
	 */
	protected String opening = OPENING_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPadCount() <em>Pad Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadCount()
	 * @generated
	 * @ordered
	 */
	protected static final String PAD_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPadCount() <em>Pad Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadCount()
	 * @generated
	 * @ordered
	 */
	protected String padCount = PAD_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlace() <em>Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected String place = PLACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected String orientation = ORIENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected String power = POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getGround() <em>Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGround()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGround() <em>Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGround()
	 * @generated
	 * @ordered
	 */
	protected String ground = GROUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SinglePadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getSinglePad();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXCoordinate() {
		return xCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXCoordinate(String newXCoordinate) {
		String oldXCoordinate = xCoordinate;
		xCoordinate = newXCoordinate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SINGLE_PAD__XCOORDINATE, oldXCoordinate, xCoordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYCoordinate() {
		return yCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYCoordinate(String newYCoordinate) {
		String oldYCoordinate = yCoordinate;
		yCoordinate = newYCoordinate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SINGLE_PAD__YCOORDINATE, oldYCoordinate, yCoordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpacer() {
		return spacer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpacer(String newSpacer) {
		String oldSpacer = spacer;
		spacer = newSpacer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SINGLE_PAD__SPACER, oldSpacer, spacer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpening() {
		return opening;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpening(String newOpening) {
		String oldOpening = opening;
		opening = newOpening;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SINGLE_PAD__OPENING, oldOpening, opening));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SINGLE_PAD__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPadCount() {
		return padCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPadCount(String newPadCount) {
		String oldPadCount = padCount;
		padCount = newPadCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SINGLE_PAD__PAD_COUNT, oldPadCount, padCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlace(String newPlace) {
		String oldPlace = place;
		place = newPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SINGLE_PAD__PLACE, oldPlace, place));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(String newOrientation) {
		String oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SINGLE_PAD__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower(String newPower) {
		String oldPower = power;
		power = newPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SINGLE_PAD__POWER, oldPower, power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGround() {
		return ground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGround(String newGround) {
		String oldGround = ground;
		ground = newGround;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SINGLE_PAD__GROUND, oldGround, ground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EssencePackage.SINGLE_PAD__XCOORDINATE:
				return getXCoordinate();
			case EssencePackage.SINGLE_PAD__YCOORDINATE:
				return getYCoordinate();
			case EssencePackage.SINGLE_PAD__SPACER:
				return getSpacer();
			case EssencePackage.SINGLE_PAD__OPENING:
				return getOpening();
			case EssencePackage.SINGLE_PAD__LOCATION:
				return getLocation();
			case EssencePackage.SINGLE_PAD__PAD_COUNT:
				return getPadCount();
			case EssencePackage.SINGLE_PAD__PLACE:
				return getPlace();
			case EssencePackage.SINGLE_PAD__ORIENTATION:
				return getOrientation();
			case EssencePackage.SINGLE_PAD__POWER:
				return getPower();
			case EssencePackage.SINGLE_PAD__GROUND:
				return getGround();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EssencePackage.SINGLE_PAD__XCOORDINATE:
				setXCoordinate((String)newValue);
				return;
			case EssencePackage.SINGLE_PAD__YCOORDINATE:
				setYCoordinate((String)newValue);
				return;
			case EssencePackage.SINGLE_PAD__SPACER:
				setSpacer((String)newValue);
				return;
			case EssencePackage.SINGLE_PAD__OPENING:
				setOpening((String)newValue);
				return;
			case EssencePackage.SINGLE_PAD__LOCATION:
				setLocation((String)newValue);
				return;
			case EssencePackage.SINGLE_PAD__PAD_COUNT:
				setPadCount((String)newValue);
				return;
			case EssencePackage.SINGLE_PAD__PLACE:
				setPlace((String)newValue);
				return;
			case EssencePackage.SINGLE_PAD__ORIENTATION:
				setOrientation((String)newValue);
				return;
			case EssencePackage.SINGLE_PAD__POWER:
				setPower((String)newValue);
				return;
			case EssencePackage.SINGLE_PAD__GROUND:
				setGround((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EssencePackage.SINGLE_PAD__XCOORDINATE:
				setXCoordinate(XCOORDINATE_EDEFAULT);
				return;
			case EssencePackage.SINGLE_PAD__YCOORDINATE:
				setYCoordinate(YCOORDINATE_EDEFAULT);
				return;
			case EssencePackage.SINGLE_PAD__SPACER:
				setSpacer(SPACER_EDEFAULT);
				return;
			case EssencePackage.SINGLE_PAD__OPENING:
				setOpening(OPENING_EDEFAULT);
				return;
			case EssencePackage.SINGLE_PAD__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case EssencePackage.SINGLE_PAD__PAD_COUNT:
				setPadCount(PAD_COUNT_EDEFAULT);
				return;
			case EssencePackage.SINGLE_PAD__PLACE:
				setPlace(PLACE_EDEFAULT);
				return;
			case EssencePackage.SINGLE_PAD__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
				return;
			case EssencePackage.SINGLE_PAD__POWER:
				setPower(POWER_EDEFAULT);
				return;
			case EssencePackage.SINGLE_PAD__GROUND:
				setGround(GROUND_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EssencePackage.SINGLE_PAD__XCOORDINATE:
				return XCOORDINATE_EDEFAULT == null ? xCoordinate != null : !XCOORDINATE_EDEFAULT.equals(xCoordinate);
			case EssencePackage.SINGLE_PAD__YCOORDINATE:
				return YCOORDINATE_EDEFAULT == null ? yCoordinate != null : !YCOORDINATE_EDEFAULT.equals(yCoordinate);
			case EssencePackage.SINGLE_PAD__SPACER:
				return SPACER_EDEFAULT == null ? spacer != null : !SPACER_EDEFAULT.equals(spacer);
			case EssencePackage.SINGLE_PAD__OPENING:
				return OPENING_EDEFAULT == null ? opening != null : !OPENING_EDEFAULT.equals(opening);
			case EssencePackage.SINGLE_PAD__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case EssencePackage.SINGLE_PAD__PAD_COUNT:
				return PAD_COUNT_EDEFAULT == null ? padCount != null : !PAD_COUNT_EDEFAULT.equals(padCount);
			case EssencePackage.SINGLE_PAD__PLACE:
				return PLACE_EDEFAULT == null ? place != null : !PLACE_EDEFAULT.equals(place);
			case EssencePackage.SINGLE_PAD__ORIENTATION:
				return ORIENTATION_EDEFAULT == null ? orientation != null : !ORIENTATION_EDEFAULT.equals(orientation);
			case EssencePackage.SINGLE_PAD__POWER:
				return POWER_EDEFAULT == null ? power != null : !POWER_EDEFAULT.equals(power);
			case EssencePackage.SINGLE_PAD__GROUND:
				return GROUND_EDEFAULT == null ? ground != null : !GROUND_EDEFAULT.equals(ground);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (xCoordinate: ");
		result.append(xCoordinate);
		result.append(", yCoordinate: ");
		result.append(yCoordinate);
		result.append(", spacer: ");
		result.append(spacer);
		result.append(", opening: ");
		result.append(opening);
		result.append(", location: ");
		result.append(location);
		result.append(", padCount: ");
		result.append(padCount);
		result.append(", place: ");
		result.append(place);
		result.append(", orientation: ");
		result.append(orientation);
		result.append(", power: ");
		result.append(power);
		result.append(", ground: ");
		result.append(ground);
		result.append(')');
		return result.toString();
	}

} //SinglePadImpl
