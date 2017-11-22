/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.TestReq;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Req</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.TestReqImpl#getDriverStrength <em>Driver Strength</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestReqImpl extends EssenceBaseImpl implements TestReq {
	/**
	 * The default value of the '{@link #getDriverStrength() <em>Driver Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverStrength()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVER_STRENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDriverStrength() <em>Driver Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverStrength()
	 * @generated
	 * @ordered
	 */
	protected String driverStrength = DRIVER_STRENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestReqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getTestReq();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDriverStrength() {
		return driverStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriverStrength(String newDriverStrength) {
		String oldDriverStrength = driverStrength;
		driverStrength = newDriverStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.TEST_REQ__DRIVER_STRENGTH, oldDriverStrength, driverStrength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EssencePackage.TEST_REQ__DRIVER_STRENGTH:
				return getDriverStrength();
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
			case EssencePackage.TEST_REQ__DRIVER_STRENGTH:
				setDriverStrength((String)newValue);
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
			case EssencePackage.TEST_REQ__DRIVER_STRENGTH:
				setDriverStrength(DRIVER_STRENGTH_EDEFAULT);
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
			case EssencePackage.TEST_REQ__DRIVER_STRENGTH:
				return DRIVER_STRENGTH_EDEFAULT == null ? driverStrength != null : !DRIVER_STRENGTH_EDEFAULT.equals(driverStrength);
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
		result.append(" (driverStrength: ");
		result.append(driverStrength);
		result.append(')');
		return result.toString();
	}

} //TestReqImpl
