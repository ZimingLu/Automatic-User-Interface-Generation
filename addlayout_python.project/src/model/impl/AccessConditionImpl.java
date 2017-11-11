/**
 */
package model.impl;

import model.AccessCondition;
import model.BusErrorType;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.AccessConditionImpl#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link model.impl.AccessConditionImpl#getBusErrorType <em>Bus Error Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessConditionImpl extends IndexVarUserImpl implements AccessCondition {
	/**
	 * The default value of the '{@link #getAccessLevel() <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessLevel() <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLevel()
	 * @generated
	 * @ordered
	 */
	protected String accessLevel = ACCESS_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBusErrorType() <em>Bus Error Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusErrorType()
	 * @generated
	 * @ordered
	 */
	protected static final BusErrorType BUS_ERROR_TYPE_EDEFAULT = BusErrorType.READ_ERROR;

	/**
	 * The cached value of the '{@link #getBusErrorType() <em>Bus Error Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusErrorType()
	 * @generated
	 * @ordered
	 */
	protected BusErrorType busErrorType = BUS_ERROR_TYPE_EDEFAULT;

	/**
	 * This is true if the Bus Error Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean busErrorTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getAccessCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessLevel() {
		return accessLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessLevel(String newAccessLevel) {
		String oldAccessLevel = accessLevel;
		accessLevel = newAccessLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACCESS_CONDITION__ACCESS_LEVEL, oldAccessLevel, accessLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusErrorType getBusErrorType() {
		return busErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusErrorType(BusErrorType newBusErrorType) {
		BusErrorType oldBusErrorType = busErrorType;
		busErrorType = newBusErrorType == null ? BUS_ERROR_TYPE_EDEFAULT : newBusErrorType;
		boolean oldBusErrorTypeESet = busErrorTypeESet;
		busErrorTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACCESS_CONDITION__BUS_ERROR_TYPE, oldBusErrorType, busErrorType, !oldBusErrorTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBusErrorType() {
		BusErrorType oldBusErrorType = busErrorType;
		boolean oldBusErrorTypeESet = busErrorTypeESet;
		busErrorType = BUS_ERROR_TYPE_EDEFAULT;
		busErrorTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.ACCESS_CONDITION__BUS_ERROR_TYPE, oldBusErrorType, BUS_ERROR_TYPE_EDEFAULT, oldBusErrorTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBusErrorType() {
		return busErrorTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ACCESS_CONDITION__ACCESS_LEVEL:
				return getAccessLevel();
			case ModelPackage.ACCESS_CONDITION__BUS_ERROR_TYPE:
				return getBusErrorType();
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
			case ModelPackage.ACCESS_CONDITION__ACCESS_LEVEL:
				setAccessLevel((String)newValue);
				return;
			case ModelPackage.ACCESS_CONDITION__BUS_ERROR_TYPE:
				setBusErrorType((BusErrorType)newValue);
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
			case ModelPackage.ACCESS_CONDITION__ACCESS_LEVEL:
				setAccessLevel(ACCESS_LEVEL_EDEFAULT);
				return;
			case ModelPackage.ACCESS_CONDITION__BUS_ERROR_TYPE:
				unsetBusErrorType();
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
			case ModelPackage.ACCESS_CONDITION__ACCESS_LEVEL:
				return ACCESS_LEVEL_EDEFAULT == null ? accessLevel != null : !ACCESS_LEVEL_EDEFAULT.equals(accessLevel);
			case ModelPackage.ACCESS_CONDITION__BUS_ERROR_TYPE:
				return isSetBusErrorType();
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
		result.append(" (accessLevel: ");
		result.append(accessLevel);
		result.append(", busErrorType: ");
		if (busErrorTypeESet) result.append(busErrorType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AccessConditionImpl
