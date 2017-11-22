/**
 */
package Essence.impl;

import Essence.Access;
import Essence.AccessType;
import Essence.ActionType;
import Essence.EssencePackage;
import Essence.StrobeType;

import java.util.Collection;

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
 *   <li>{@link Essence.impl.AccessImpl#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link Essence.impl.AccessImpl#getStrobeType <em>Strobe Type</em>}</li>
 *   <li>{@link Essence.impl.AccessImpl#getActionType <em>Action Type</em>}</li>
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
	 * This is true if the Access Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accessTypeESet;

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
	 * This is true if the Strobe Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strobeTypeESet;

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
		return EssencePackage.eINSTANCE.getAccess();
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
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.ACCESS__ACCESS_TYPE, oldAccessType, accessType, !oldAccessTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, EssencePackage.ACCESS__ACCESS_TYPE, oldAccessType, ACCESS_TYPE_EDEFAULT, oldAccessTypeESet));
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
		boolean oldStrobeTypeESet = strobeTypeESet;
		strobeTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.ACCESS__STROBE_TYPE, oldStrobeType, strobeType, !oldStrobeTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrobeType() {
		StrobeType oldStrobeType = strobeType;
		boolean oldStrobeTypeESet = strobeTypeESet;
		strobeType = STROBE_TYPE_EDEFAULT;
		strobeTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EssencePackage.ACCESS__STROBE_TYPE, oldStrobeType, STROBE_TYPE_EDEFAULT, oldStrobeTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrobeType() {
		return strobeTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionType> getActionType() {
		if (actionType == null) {
			actionType = new EDataTypeEList<ActionType>(ActionType.class, this, EssencePackage.ACCESS__ACTION_TYPE);
		}
		return actionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EssencePackage.ACCESS__ACCESS_TYPE:
				return getAccessType();
			case EssencePackage.ACCESS__STROBE_TYPE:
				return getStrobeType();
			case EssencePackage.ACCESS__ACTION_TYPE:
				return getActionType();
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
			case EssencePackage.ACCESS__ACCESS_TYPE:
				setAccessType((AccessType)newValue);
				return;
			case EssencePackage.ACCESS__STROBE_TYPE:
				setStrobeType((StrobeType)newValue);
				return;
			case EssencePackage.ACCESS__ACTION_TYPE:
				getActionType().clear();
				getActionType().addAll((Collection<? extends ActionType>)newValue);
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
			case EssencePackage.ACCESS__ACCESS_TYPE:
				unsetAccessType();
				return;
			case EssencePackage.ACCESS__STROBE_TYPE:
				unsetStrobeType();
				return;
			case EssencePackage.ACCESS__ACTION_TYPE:
				getActionType().clear();
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
			case EssencePackage.ACCESS__ACCESS_TYPE:
				return isSetAccessType();
			case EssencePackage.ACCESS__STROBE_TYPE:
				return isSetStrobeType();
			case EssencePackage.ACCESS__ACTION_TYPE:
				return actionType != null && !actionType.isEmpty();
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
		if (accessTypeESet) result.append(accessType); else result.append("<unset>");
		result.append(", strobeType: ");
		if (strobeTypeESet) result.append(strobeType); else result.append("<unset>");
		result.append(", actionType: ");
		result.append(actionType);
		result.append(')');
		return result.toString();
	}

} //AccessImpl
