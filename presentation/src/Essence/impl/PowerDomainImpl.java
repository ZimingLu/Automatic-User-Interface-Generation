/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.PowerDomain;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.PowerDomainImpl#getPowerConsumption <em>Power Consumption</em>}</li>
 *   <li>{@link Essence.impl.PowerDomainImpl#getMaxCurrent <em>Max Current</em>}</li>
 *   <li>{@link Essence.impl.PowerDomainImpl#getAverageCurrent <em>Average Current</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerDomainImpl extends SingleSourceNodeImpl implements PowerDomain {
	/**
	 * The default value of the '{@link #getPowerConsumption() <em>Power Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerConsumption()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_CONSUMPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowerConsumption() <em>Power Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerConsumption()
	 * @generated
	 * @ordered
	 */
	protected String powerConsumption = POWER_CONSUMPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCurrent() <em>Max Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_CURRENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxCurrent() <em>Max Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCurrent()
	 * @generated
	 * @ordered
	 */
	protected String maxCurrent = MAX_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverageCurrent() <em>Average Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final String AVERAGE_CURRENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAverageCurrent() <em>Average Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageCurrent()
	 * @generated
	 * @ordered
	 */
	protected String averageCurrent = AVERAGE_CURRENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getPowerDomain();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPowerConsumption() {
		return powerConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerConsumption(String newPowerConsumption) {
		String oldPowerConsumption = powerConsumption;
		powerConsumption = newPowerConsumption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.POWER_DOMAIN__POWER_CONSUMPTION, oldPowerConsumption, powerConsumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxCurrent() {
		return maxCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxCurrent(String newMaxCurrent) {
		String oldMaxCurrent = maxCurrent;
		maxCurrent = newMaxCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.POWER_DOMAIN__MAX_CURRENT, oldMaxCurrent, maxCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAverageCurrent() {
		return averageCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverageCurrent(String newAverageCurrent) {
		String oldAverageCurrent = averageCurrent;
		averageCurrent = newAverageCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.POWER_DOMAIN__AVERAGE_CURRENT, oldAverageCurrent, averageCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EssencePackage.POWER_DOMAIN__POWER_CONSUMPTION:
				return getPowerConsumption();
			case EssencePackage.POWER_DOMAIN__MAX_CURRENT:
				return getMaxCurrent();
			case EssencePackage.POWER_DOMAIN__AVERAGE_CURRENT:
				return getAverageCurrent();
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
			case EssencePackage.POWER_DOMAIN__POWER_CONSUMPTION:
				setPowerConsumption((String)newValue);
				return;
			case EssencePackage.POWER_DOMAIN__MAX_CURRENT:
				setMaxCurrent((String)newValue);
				return;
			case EssencePackage.POWER_DOMAIN__AVERAGE_CURRENT:
				setAverageCurrent((String)newValue);
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
			case EssencePackage.POWER_DOMAIN__POWER_CONSUMPTION:
				setPowerConsumption(POWER_CONSUMPTION_EDEFAULT);
				return;
			case EssencePackage.POWER_DOMAIN__MAX_CURRENT:
				setMaxCurrent(MAX_CURRENT_EDEFAULT);
				return;
			case EssencePackage.POWER_DOMAIN__AVERAGE_CURRENT:
				setAverageCurrent(AVERAGE_CURRENT_EDEFAULT);
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
			case EssencePackage.POWER_DOMAIN__POWER_CONSUMPTION:
				return POWER_CONSUMPTION_EDEFAULT == null ? powerConsumption != null : !POWER_CONSUMPTION_EDEFAULT.equals(powerConsumption);
			case EssencePackage.POWER_DOMAIN__MAX_CURRENT:
				return MAX_CURRENT_EDEFAULT == null ? maxCurrent != null : !MAX_CURRENT_EDEFAULT.equals(maxCurrent);
			case EssencePackage.POWER_DOMAIN__AVERAGE_CURRENT:
				return AVERAGE_CURRENT_EDEFAULT == null ? averageCurrent != null : !AVERAGE_CURRENT_EDEFAULT.equals(averageCurrent);
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
		result.append(" (powerConsumption: ");
		result.append(powerConsumption);
		result.append(", maxCurrent: ");
		result.append(maxCurrent);
		result.append(", averageCurrent: ");
		result.append(averageCurrent);
		result.append(')');
		return result.toString();
	}

} //PowerDomainImpl
