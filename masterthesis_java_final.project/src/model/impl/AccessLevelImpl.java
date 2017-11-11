/**
 */
package model.impl;

import model.AccessLevel;
import model.AccessType;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.AccessLevelImpl#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link model.impl.AccessLevelImpl#getAccessType <em>Access Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessLevelImpl extends IndexVarUserImpl implements AccessLevel {
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
	 * This is true if the Access Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accessTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getAccessLevel();
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACCESS_LEVEL__ACCESS_LEVEL, oldAccessLevel, accessLevel));
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
		boolean oldAccessTypeESet = accessTypeESet;
		accessTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACCESS_LEVEL__ACCESS_TYPE, oldAccessType, accessType, !oldAccessTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAccessType() {
		AccessType oldAccessType = accessType;
		boolean oldAccessTypeESet = accessTypeESet;
		accessType = ACCESS_TYPE_EDEFAULT;
		accessTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.ACCESS_LEVEL__ACCESS_TYPE, oldAccessType, ACCESS_TYPE_EDEFAULT, oldAccessTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAccessType() {
		return accessTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ACCESS_LEVEL__ACCESS_LEVEL:
				return getAccessLevel();
			case ModelPackage.ACCESS_LEVEL__ACCESS_TYPE:
				return getAccessType();
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
			case ModelPackage.ACCESS_LEVEL__ACCESS_LEVEL:
				setAccessLevel((String)newValue);
				return;
			case ModelPackage.ACCESS_LEVEL__ACCESS_TYPE:
				setAccessType((AccessType)newValue);
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
			case ModelPackage.ACCESS_LEVEL__ACCESS_LEVEL:
				setAccessLevel(ACCESS_LEVEL_EDEFAULT);
				return;
			case ModelPackage.ACCESS_LEVEL__ACCESS_TYPE:
				unsetAccessType();
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
			case ModelPackage.ACCESS_LEVEL__ACCESS_LEVEL:
				return ACCESS_LEVEL_EDEFAULT == null ? accessLevel != null : !ACCESS_LEVEL_EDEFAULT.equals(accessLevel);
			case ModelPackage.ACCESS_LEVEL__ACCESS_TYPE:
				return isSetAccessType();
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
		result.append(", accessType: ");
		if (accessTypeESet) result.append(accessType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AccessLevelImpl
