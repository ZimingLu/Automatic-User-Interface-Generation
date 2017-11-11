/**
 */
package model.impl;

import java.util.Collection;

import model.Access;
import model.AccessType;
import model.ActionType;
import model.ModelPackage;
import model.StrobeType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.AccessImpl#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link model.impl.AccessImpl#getStrobeType <em>Strobe Type</em>}</li>
 *   <li>{@link model.impl.AccessImpl#getActionType <em>Action Type</em>}</li>
 *   <li>{@link model.impl.AccessImpl#isClear <em>Clear</em>}</li>
 *   <li>{@link model.impl.AccessImpl#isEnable <em>Enable</em>}</li>
 *   <li>{@link model.impl.AccessImpl#isInterrupt <em>Interrupt</em>}</li>
 *   <li>{@link model.impl.AccessImpl#isPulse <em>Pulse</em>}</li>
 *   <li>{@link model.impl.AccessImpl#isReset <em>Reset</em>}</li>
 *   <li>{@link model.impl.AccessImpl#isSet <em>Set</em>}</li>
 *   <li>{@link model.impl.AccessImpl#isStatus <em>Status</em>}</li>
 *   <li>{@link model.impl.AccessImpl#isToggle <em>Toggle</em>}</li>
 *   <li>{@link model.impl.AccessImpl#isRegister <em>Register</em>}</li>
 *   <li>{@link model.impl.AccessImpl#isTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessImpl extends EssenceBaseImpl implements Access {
	/**
	 * The default value of the '{@link #getAccessType() <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessType()
	 * @generated
	 * @ordered
	 */
	protected static final AccessType ACCESS_TYPE_EDEFAULT = AccessType.NONE;

	/**
	 * The cached value of the '{@link #getAccessType() <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessType()
	 * @generated
	 * @ordered
	 */
	protected AccessType accessType = ACCESS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrobeType() <em>Strobe Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrobeType()
	 * @generated
	 * @ordered
	 */
	protected static final StrobeType STROBE_TYPE_EDEFAULT = StrobeType.NO_STROBE;

	/**
	 * The cached value of the '{@link #getStrobeType() <em>Strobe Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrobeType()
	 * @generated
	 * @ordered
	 */
	protected StrobeType strobeType = STROBE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActionType() <em>Action Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionType()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionType> actionType;

	/**
	 * The default value of the '{@link #isClear() <em>Clear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClear()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLEAR_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isEnable() <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isInterrupt() <em>Interrupt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterrupt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERRUPT_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isPulse() <em>Pulse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPulse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PULSE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isReset() <em>Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReset()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESET_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isSet() <em>Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SET_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATUS_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isToggle() <em>Toggle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToggle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TOGGLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isRegister() <em>Register</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegister()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REGISTER_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRIGGER_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getAccess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType getAccessType() {
		return accessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessType(AccessType newAccessType) {
		AccessType oldAccessType = accessType;
		accessType = newAccessType == null ? ACCESS_TYPE_EDEFAULT : newAccessType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACCESS__ACCESS_TYPE, oldAccessType, accessType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrobeType getStrobeType() {
		return strobeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrobeType(StrobeType newStrobeType) {
		StrobeType oldStrobeType = strobeType;
		strobeType = newStrobeType == null ? STROBE_TYPE_EDEFAULT : newStrobeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACCESS__STROBE_TYPE, oldStrobeType, strobeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionType> getActionType() {
		if (actionType == null) {
			actionType = new EDataTypeEList<ActionType>(ActionType.class, this, ModelPackage.ACCESS__ACTION_TYPE);
		}
		return actionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClear() {
		// TODO: implement this method to return the 'Clear' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClear(boolean newClear) {
		// TODO: implement this method to set the 'Clear' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnable() {
		// TODO: implement this method to return the 'Enable' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnable(boolean newEnable) {
		// TODO: implement this method to set the 'Enable' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInterrupt() {
		// TODO: implement this method to return the 'Interrupt' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterrupt(boolean newInterrupt) {
		// TODO: implement this method to set the 'Interrupt' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPulse() {
		// TODO: implement this method to return the 'Pulse' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPulse(boolean newPulse) {
		// TODO: implement this method to set the 'Pulse' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReset() {
		// TODO: implement this method to return the 'Reset' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReset(boolean newReset) {
		// TODO: implement this method to set the 'Reset' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSet() {
		// TODO: implement this method to return the 'Set' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSet(boolean newSet) {
		// TODO: implement this method to set the 'Set' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatus() {
		// TODO: implement this method to return the 'Status' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(boolean newStatus) {
		// TODO: implement this method to set the 'Status' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isToggle() {
		// TODO: implement this method to return the 'Toggle' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToggle(boolean newToggle) {
		// TODO: implement this method to set the 'Toggle' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRegister() {
		// TODO: implement this method to return the 'Register' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegister(boolean newRegister) {
		// TODO: implement this method to set the 'Register' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTrigger() {
		// TODO: implement this method to return the 'Trigger' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(boolean newTrigger) {
		// TODO: implement this method to set the 'Trigger' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ACCESS__ACCESS_TYPE:
				return getAccessType();
			case ModelPackage.ACCESS__STROBE_TYPE:
				return getStrobeType();
			case ModelPackage.ACCESS__ACTION_TYPE:
				return getActionType();
			case ModelPackage.ACCESS__CLEAR:
				return isClear();
			case ModelPackage.ACCESS__ENABLE:
				return isEnable();
			case ModelPackage.ACCESS__INTERRUPT:
				return isInterrupt();
			case ModelPackage.ACCESS__PULSE:
				return isPulse();
			case ModelPackage.ACCESS__RESET:
				return isReset();
			case ModelPackage.ACCESS__SET:
				return isSet();
			case ModelPackage.ACCESS__STATUS:
				return isStatus();
			case ModelPackage.ACCESS__TOGGLE:
				return isToggle();
			case ModelPackage.ACCESS__REGISTER:
				return isRegister();
			case ModelPackage.ACCESS__TRIGGER:
				return isTrigger();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.ACCESS__ACCESS_TYPE:
				setAccessType((AccessType)newValue);
				return;
			case ModelPackage.ACCESS__STROBE_TYPE:
				setStrobeType((StrobeType)newValue);
				return;
			case ModelPackage.ACCESS__ACTION_TYPE:
				getActionType().clear();
				getActionType().addAll((Collection<? extends ActionType>)newValue);
				return;
			case ModelPackage.ACCESS__CLEAR:
				setClear((Boolean)newValue);
				return;
			case ModelPackage.ACCESS__ENABLE:
				setEnable((Boolean)newValue);
				return;
			case ModelPackage.ACCESS__INTERRUPT:
				setInterrupt((Boolean)newValue);
				return;
			case ModelPackage.ACCESS__PULSE:
				setPulse((Boolean)newValue);
				return;
			case ModelPackage.ACCESS__RESET:
				setReset((Boolean)newValue);
				return;
			case ModelPackage.ACCESS__SET:
				setSet((Boolean)newValue);
				return;
			case ModelPackage.ACCESS__STATUS:
				setStatus((Boolean)newValue);
				return;
			case ModelPackage.ACCESS__TOGGLE:
				setToggle((Boolean)newValue);
				return;
			case ModelPackage.ACCESS__REGISTER:
				setRegister((Boolean)newValue);
				return;
			case ModelPackage.ACCESS__TRIGGER:
				setTrigger((Boolean)newValue);
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
			case ModelPackage.ACCESS__ACCESS_TYPE:
				setAccessType(ACCESS_TYPE_EDEFAULT);
				return;
			case ModelPackage.ACCESS__STROBE_TYPE:
				setStrobeType(STROBE_TYPE_EDEFAULT);
				return;
			case ModelPackage.ACCESS__ACTION_TYPE:
				getActionType().clear();
				return;
			case ModelPackage.ACCESS__CLEAR:
				setClear(CLEAR_EDEFAULT);
				return;
			case ModelPackage.ACCESS__ENABLE:
				setEnable(ENABLE_EDEFAULT);
				return;
			case ModelPackage.ACCESS__INTERRUPT:
				setInterrupt(INTERRUPT_EDEFAULT);
				return;
			case ModelPackage.ACCESS__PULSE:
				setPulse(PULSE_EDEFAULT);
				return;
			case ModelPackage.ACCESS__RESET:
				setReset(RESET_EDEFAULT);
				return;
			case ModelPackage.ACCESS__SET:
				setSet(SET_EDEFAULT);
				return;
			case ModelPackage.ACCESS__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ModelPackage.ACCESS__TOGGLE:
				setToggle(TOGGLE_EDEFAULT);
				return;
			case ModelPackage.ACCESS__REGISTER:
				setRegister(REGISTER_EDEFAULT);
				return;
			case ModelPackage.ACCESS__TRIGGER:
				setTrigger(TRIGGER_EDEFAULT);
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
			case ModelPackage.ACCESS__ACCESS_TYPE:
				return accessType != ACCESS_TYPE_EDEFAULT;
			case ModelPackage.ACCESS__STROBE_TYPE:
				return strobeType != STROBE_TYPE_EDEFAULT;
			case ModelPackage.ACCESS__ACTION_TYPE:
				return actionType != null && !actionType.isEmpty();
			case ModelPackage.ACCESS__CLEAR:
				return isClear() != CLEAR_EDEFAULT;
			case ModelPackage.ACCESS__ENABLE:
				return isEnable() != ENABLE_EDEFAULT;
			case ModelPackage.ACCESS__INTERRUPT:
				return isInterrupt() != INTERRUPT_EDEFAULT;
			case ModelPackage.ACCESS__PULSE:
				return isPulse() != PULSE_EDEFAULT;
			case ModelPackage.ACCESS__RESET:
				return isReset() != RESET_EDEFAULT;
			case ModelPackage.ACCESS__SET:
				return isSet() != SET_EDEFAULT;
			case ModelPackage.ACCESS__STATUS:
				return isStatus() != STATUS_EDEFAULT;
			case ModelPackage.ACCESS__TOGGLE:
				return isToggle() != TOGGLE_EDEFAULT;
			case ModelPackage.ACCESS__REGISTER:
				return isRegister() != REGISTER_EDEFAULT;
			case ModelPackage.ACCESS__TRIGGER:
				return isTrigger() != TRIGGER_EDEFAULT;
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
		result.append(" (accessType: ");
		result.append(accessType);
		result.append(", strobeType: ");
		result.append(strobeType);
		result.append(", actionType: ");
		result.append(actionType);
		result.append(')');
		return result.toString();
	}

} //AccessImpl
