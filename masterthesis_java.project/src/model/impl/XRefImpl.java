/**
 */
package model.impl;

import model.ModelPackage;
import model.SingleSourceNode;
import model.XRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XRef</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.XRefImpl#getXRefTargetID <em>XRef Target ID</em>}</li>
 *   <li>{@link model.impl.XRefImpl#getXRefTarget <em>XRef Target</em>}</li>
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
	 * The cached value of the '{@link #getXRefTarget() <em>XRef Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefTarget()
	 * @generated
	 * @ordered
	 */
	protected SingleSourceNode xRefTarget;

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
		return ModelPackage.eINSTANCE.getXRef();
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XREF__XREF_TARGET_ID, oldXRefTargetID, xRefTargetID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleSourceNode getXRefTarget() {
		if (xRefTarget != null && xRefTarget.eIsProxy()) {
			InternalEObject oldXRefTarget = (InternalEObject)xRefTarget;
			xRefTarget = (SingleSourceNode)eResolveProxy(oldXRefTarget);
			if (xRefTarget != oldXRefTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.XREF__XREF_TARGET, oldXRefTarget, xRefTarget));
			}
		}
		return xRefTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleSourceNode basicGetXRefTarget() {
		return xRefTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefTarget(SingleSourceNode newXRefTarget) {
		SingleSourceNode oldXRefTarget = xRefTarget;
		xRefTarget = newXRefTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XREF__XREF_TARGET, oldXRefTarget, xRefTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.XREF__XREF_TARGET_ID:
				return getXRefTargetID();
			case ModelPackage.XREF__XREF_TARGET:
				if (resolve) return getXRefTarget();
				return basicGetXRefTarget();
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
			case ModelPackage.XREF__XREF_TARGET_ID:
				setXRefTargetID((Integer)newValue);
				return;
			case ModelPackage.XREF__XREF_TARGET:
				setXRefTarget((SingleSourceNode)newValue);
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
			case ModelPackage.XREF__XREF_TARGET_ID:
				setXRefTargetID(XREF_TARGET_ID_EDEFAULT);
				return;
			case ModelPackage.XREF__XREF_TARGET:
				setXRefTarget((SingleSourceNode)null);
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
			case ModelPackage.XREF__XREF_TARGET_ID:
				return xRefTargetID != XREF_TARGET_ID_EDEFAULT;
			case ModelPackage.XREF__XREF_TARGET:
				return xRefTarget != null;
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
		result.append(xRefTargetID);
		result.append(')');
		return result.toString();
	}

} //XRefImpl
