/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.GeneralRegister;
import Essence.ResetType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Register</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.GeneralRegisterImpl#isNoShadow <em>No Shadow</em>}</li>
 *   <li>{@link Essence.impl.GeneralRegisterImpl#getResetType <em>Reset Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeneralRegisterImpl extends SequenceElementImpl implements GeneralRegister {
	/**
	 * The default value of the '{@link #isNoShadow() <em>No Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoShadow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_SHADOW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoShadow() <em>No Shadow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoShadow()
	 * @generated
	 * @ordered
	 */
	protected boolean noShadow = NO_SHADOW_EDEFAULT;

	/**
	 * This is true if the No Shadow attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean noShadowESet;

	/**
	 * The cached value of the '{@link #getResetType() <em>Reset Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetType()
	 * @generated
	 * @ordered
	 */
	protected EList<ResetType> resetType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralRegisterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getGeneralRegister();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoShadow() {
		return noShadow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoShadow(boolean newNoShadow) {
		boolean oldNoShadow = noShadow;
		noShadow = newNoShadow;
		boolean oldNoShadowESet = noShadowESet;
		noShadowESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.GENERAL_REGISTER__NO_SHADOW, oldNoShadow, noShadow, !oldNoShadowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNoShadow() {
		boolean oldNoShadow = noShadow;
		boolean oldNoShadowESet = noShadowESet;
		noShadow = NO_SHADOW_EDEFAULT;
		noShadowESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EssencePackage.GENERAL_REGISTER__NO_SHADOW, oldNoShadow, NO_SHADOW_EDEFAULT, oldNoShadowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNoShadow() {
		return noShadowESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResetType> getResetType() {
		if (resetType == null) {
			resetType = new EObjectContainmentEList<ResetType>(ResetType.class, this, EssencePackage.GENERAL_REGISTER__RESET_TYPE);
		}
		return resetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.GENERAL_REGISTER__RESET_TYPE:
				return ((InternalEList<?>)getResetType()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EssencePackage.GENERAL_REGISTER__NO_SHADOW:
				return isNoShadow();
			case EssencePackage.GENERAL_REGISTER__RESET_TYPE:
				return getResetType();
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
			case EssencePackage.GENERAL_REGISTER__NO_SHADOW:
				setNoShadow((Boolean)newValue);
				return;
			case EssencePackage.GENERAL_REGISTER__RESET_TYPE:
				getResetType().clear();
				getResetType().addAll((Collection<? extends ResetType>)newValue);
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
			case EssencePackage.GENERAL_REGISTER__NO_SHADOW:
				unsetNoShadow();
				return;
			case EssencePackage.GENERAL_REGISTER__RESET_TYPE:
				getResetType().clear();
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
			case EssencePackage.GENERAL_REGISTER__NO_SHADOW:
				return isSetNoShadow();
			case EssencePackage.GENERAL_REGISTER__RESET_TYPE:
				return resetType != null && !resetType.isEmpty();
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
		result.append(" (noShadow: ");
		if (noShadowESet) result.append(noShadow); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GeneralRegisterImpl
