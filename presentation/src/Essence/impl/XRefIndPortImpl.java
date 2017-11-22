/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.SubElementAccess;
import Essence.XRefIndPort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XRef Ind Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.XRefIndPortImpl#getSubElementAccess <em>Sub Element Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XRefIndPortImpl extends XRefIndirectImpl implements XRefIndPort {
	/**
	 * The cached value of the '{@link #getSubElementAccess() <em>Sub Element Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubElementAccess()
	 * @generated
	 * @ordered
	 */
	protected SubElementAccess subElementAccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XRefIndPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getXRefIndPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubElementAccess getSubElementAccess() {
		return subElementAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubElementAccess(SubElementAccess newSubElementAccess, NotificationChain msgs) {
		SubElementAccess oldSubElementAccess = subElementAccess;
		subElementAccess = newSubElementAccess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.XREF_IND_PORT__SUB_ELEMENT_ACCESS, oldSubElementAccess, newSubElementAccess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubElementAccess(SubElementAccess newSubElementAccess) {
		if (newSubElementAccess != subElementAccess) {
			NotificationChain msgs = null;
			if (subElementAccess != null)
				msgs = ((InternalEObject)subElementAccess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.XREF_IND_PORT__SUB_ELEMENT_ACCESS, null, msgs);
			if (newSubElementAccess != null)
				msgs = ((InternalEObject)newSubElementAccess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.XREF_IND_PORT__SUB_ELEMENT_ACCESS, null, msgs);
			msgs = basicSetSubElementAccess(newSubElementAccess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.XREF_IND_PORT__SUB_ELEMENT_ACCESS, newSubElementAccess, newSubElementAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.XREF_IND_PORT__SUB_ELEMENT_ACCESS:
				return basicSetSubElementAccess(null, msgs);
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
			case EssencePackage.XREF_IND_PORT__SUB_ELEMENT_ACCESS:
				return getSubElementAccess();
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
			case EssencePackage.XREF_IND_PORT__SUB_ELEMENT_ACCESS:
				setSubElementAccess((SubElementAccess)newValue);
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
			case EssencePackage.XREF_IND_PORT__SUB_ELEMENT_ACCESS:
				setSubElementAccess((SubElementAccess)null);
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
			case EssencePackage.XREF_IND_PORT__SUB_ELEMENT_ACCESS:
				return subElementAccess != null;
		}
		return super.eIsSet(featureID);
	}

} //XRefIndPortImpl
