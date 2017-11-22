/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.ResetType;
import Essence.SyncMode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reset Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.ResetTypeImpl#getResetLevel <em>Reset Level</em>}</li>
 *   <li>{@link Essence.impl.ResetTypeImpl#getResetMask <em>Reset Mask</em>}</li>
 *   <li>{@link Essence.impl.ResetTypeImpl#getResetMode <em>Reset Mode</em>}</li>
 *   <li>{@link Essence.impl.ResetTypeImpl#getResetType <em>Reset Type</em>}</li>
 *   <li>{@link Essence.impl.ResetTypeImpl#getResetValue <em>Reset Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResetTypeImpl extends IndexVarUserImpl implements ResetType {
	/**
	 * The default value of the '{@link #getResetLevel() <em>Reset Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String RESET_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResetLevel() <em>Reset Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetLevel()
	 * @generated
	 * @ordered
	 */
	protected String resetLevel = RESET_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getResetMask() <em>Reset Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetMask()
	 * @generated
	 * @ordered
	 */
	protected static final String RESET_MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResetMask() <em>Reset Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetMask()
	 * @generated
	 * @ordered
	 */
	protected String resetMask = RESET_MASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getResetMode() <em>Reset Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetMode()
	 * @generated
	 * @ordered
	 */
	protected static final SyncMode RESET_MODE_EDEFAULT = SyncMode.ASYNCHRONOUS;

	/**
	 * The cached value of the '{@link #getResetMode() <em>Reset Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetMode()
	 * @generated
	 * @ordered
	 */
	protected SyncMode resetMode = RESET_MODE_EDEFAULT;

	/**
	 * This is true if the Reset Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resetModeESet;

	/**
	 * The default value of the '{@link #getResetType() <em>Reset Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetType()
	 * @generated
	 * @ordered
	 */
	protected static final String RESET_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResetType() <em>Reset Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetType()
	 * @generated
	 * @ordered
	 */
	protected String resetType = RESET_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResetValue() <em>Reset Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetValue()
	 * @generated
	 * @ordered
	 */
	protected static final String RESET_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResetValue() <em>Reset Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetValue()
	 * @generated
	 * @ordered
	 */
	protected String resetValue = RESET_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getResetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResetLevel() {
		return resetLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResetLevel(String newResetLevel) {
		String oldResetLevel = resetLevel;
		resetLevel = newResetLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.RESET_TYPE__RESET_LEVEL, oldResetLevel, resetLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResetMask() {
		return resetMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResetMask(String newResetMask) {
		String oldResetMask = resetMask;
		resetMask = newResetMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.RESET_TYPE__RESET_MASK, oldResetMask, resetMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncMode getResetMode() {
		return resetMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResetMode(SyncMode newResetMode) {
		SyncMode oldResetMode = resetMode;
		resetMode = newResetMode == null ? RESET_MODE_EDEFAULT : newResetMode;
		boolean oldResetModeESet = resetModeESet;
		resetModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.RESET_TYPE__RESET_MODE, oldResetMode, resetMode, !oldResetModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResetMode() {
		SyncMode oldResetMode = resetMode;
		boolean oldResetModeESet = resetModeESet;
		resetMode = RESET_MODE_EDEFAULT;
		resetModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EssencePackage.RESET_TYPE__RESET_MODE, oldResetMode, RESET_MODE_EDEFAULT, oldResetModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResetMode() {
		return resetModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResetType() {
		return resetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResetType(String newResetType) {
		String oldResetType = resetType;
		resetType = newResetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.RESET_TYPE__RESET_TYPE, oldResetType, resetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResetValue() {
		return resetValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResetValue(String newResetValue) {
		String oldResetValue = resetValue;
		resetValue = newResetValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.RESET_TYPE__RESET_VALUE, oldResetValue, resetValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EssencePackage.RESET_TYPE__RESET_LEVEL:
				return getResetLevel();
			case EssencePackage.RESET_TYPE__RESET_MASK:
				return getResetMask();
			case EssencePackage.RESET_TYPE__RESET_MODE:
				return getResetMode();
			case EssencePackage.RESET_TYPE__RESET_TYPE:
				return getResetType();
			case EssencePackage.RESET_TYPE__RESET_VALUE:
				return getResetValue();
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
			case EssencePackage.RESET_TYPE__RESET_LEVEL:
				setResetLevel((String)newValue);
				return;
			case EssencePackage.RESET_TYPE__RESET_MASK:
				setResetMask((String)newValue);
				return;
			case EssencePackage.RESET_TYPE__RESET_MODE:
				setResetMode((SyncMode)newValue);
				return;
			case EssencePackage.RESET_TYPE__RESET_TYPE:
				setResetType((String)newValue);
				return;
			case EssencePackage.RESET_TYPE__RESET_VALUE:
				setResetValue((String)newValue);
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
			case EssencePackage.RESET_TYPE__RESET_LEVEL:
				setResetLevel(RESET_LEVEL_EDEFAULT);
				return;
			case EssencePackage.RESET_TYPE__RESET_MASK:
				setResetMask(RESET_MASK_EDEFAULT);
				return;
			case EssencePackage.RESET_TYPE__RESET_MODE:
				unsetResetMode();
				return;
			case EssencePackage.RESET_TYPE__RESET_TYPE:
				setResetType(RESET_TYPE_EDEFAULT);
				return;
			case EssencePackage.RESET_TYPE__RESET_VALUE:
				setResetValue(RESET_VALUE_EDEFAULT);
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
			case EssencePackage.RESET_TYPE__RESET_LEVEL:
				return RESET_LEVEL_EDEFAULT == null ? resetLevel != null : !RESET_LEVEL_EDEFAULT.equals(resetLevel);
			case EssencePackage.RESET_TYPE__RESET_MASK:
				return RESET_MASK_EDEFAULT == null ? resetMask != null : !RESET_MASK_EDEFAULT.equals(resetMask);
			case EssencePackage.RESET_TYPE__RESET_MODE:
				return isSetResetMode();
			case EssencePackage.RESET_TYPE__RESET_TYPE:
				return RESET_TYPE_EDEFAULT == null ? resetType != null : !RESET_TYPE_EDEFAULT.equals(resetType);
			case EssencePackage.RESET_TYPE__RESET_VALUE:
				return RESET_VALUE_EDEFAULT == null ? resetValue != null : !RESET_VALUE_EDEFAULT.equals(resetValue);
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
		result.append(" (resetLevel: ");
		result.append(resetLevel);
		result.append(", resetMask: ");
		result.append(resetMask);
		result.append(", resetMode: ");
		if (resetModeESet) result.append(resetMode); else result.append("<unset>");
		result.append(", resetType: ");
		result.append(resetType);
		result.append(", resetValue: ");
		result.append(resetValue);
		result.append(')');
		return result.toString();
	}

} //ResetTypeImpl
