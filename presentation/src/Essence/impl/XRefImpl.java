/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.XRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XRef</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.XRefImpl#getXRefTargetID <em>XRef Target ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class XRefImpl extends ReferenceImpl implements XRef {
	/**
	 * The default value of the '{@link #getXRefTargetID() <em>XRef Target ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefTargetID()
	 * @generated
	 * @ordered
	 */
	protected static final int XREF_TARGET_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXRefTargetID() <em>XRef Target ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefTargetID()
	 * @generated
	 * @ordered
	 */
	protected int xRefTargetID = XREF_TARGET_ID_EDEFAULT;

	/**
	 * This is true if the XRef Target ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xRefTargetIDESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getXRef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getXRefTargetID() {
		return xRefTargetID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefTargetID(int newXRefTargetID) {
		int oldXRefTargetID = xRefTargetID;
		xRefTargetID = newXRefTargetID;
		boolean oldXRefTargetIDESet = xRefTargetIDESet;
		xRefTargetIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.XREF__XREF_TARGET_ID, oldXRefTargetID, xRefTargetID, !oldXRefTargetIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetXRefTargetID() {
		int oldXRefTargetID = xRefTargetID;
		boolean oldXRefTargetIDESet = xRefTargetIDESet;
		xRefTargetID = XREF_TARGET_ID_EDEFAULT;
		xRefTargetIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EssencePackage.XREF__XREF_TARGET_ID, oldXRefTargetID, XREF_TARGET_ID_EDEFAULT, oldXRefTargetIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetXRefTargetID() {
		return xRefTargetIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EssencePackage.XREF__XREF_TARGET_ID:
				return getXRefTargetID();
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
			case EssencePackage.XREF__XREF_TARGET_ID:
				setXRefTargetID((Integer)newValue);
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
			case EssencePackage.XREF__XREF_TARGET_ID:
				unsetXRefTargetID();
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
			case EssencePackage.XREF__XREF_TARGET_ID:
				return isSetXRefTargetID();
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
		result.append(" (xRefTargetID: ");
		if (xRefTargetIDESet) result.append(xRefTargetID); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //XRefImpl
