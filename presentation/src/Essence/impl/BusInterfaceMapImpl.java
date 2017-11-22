/**
 */
package Essence.impl;

import Essence.BusInterfaceMap;
import Essence.EssencePackage;
import Essence.XRefConnection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Interface Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.BusInterfaceMapImpl#getXRefConnection <em>XRef Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusInterfaceMapImpl extends SingleSourceNodeImpl implements BusInterfaceMap {
	/**
	 * The cached value of the '{@link #getXRefConnection() <em>XRef Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefConnection()
	 * @generated
	 * @ordered
	 */
	protected XRefConnection xRefConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusInterfaceMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getBusInterfaceMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefConnection getXRefConnection() {
		return xRefConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefConnection(XRefConnection newXRefConnection, NotificationChain msgs) {
		XRefConnection oldXRefConnection = xRefConnection;
		xRefConnection = newXRefConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.BUS_INTERFACE_MAP__XREF_CONNECTION, oldXRefConnection, newXRefConnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefConnection(XRefConnection newXRefConnection) {
		if (newXRefConnection != xRefConnection) {
			NotificationChain msgs = null;
			if (xRefConnection != null)
				msgs = ((InternalEObject)xRefConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.BUS_INTERFACE_MAP__XREF_CONNECTION, null, msgs);
			if (newXRefConnection != null)
				msgs = ((InternalEObject)newXRefConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.BUS_INTERFACE_MAP__XREF_CONNECTION, null, msgs);
			msgs = basicSetXRefConnection(newXRefConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.BUS_INTERFACE_MAP__XREF_CONNECTION, newXRefConnection, newXRefConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.BUS_INTERFACE_MAP__XREF_CONNECTION:
				return basicSetXRefConnection(null, msgs);
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
			case EssencePackage.BUS_INTERFACE_MAP__XREF_CONNECTION:
				return getXRefConnection();
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
			case EssencePackage.BUS_INTERFACE_MAP__XREF_CONNECTION:
				setXRefConnection((XRefConnection)newValue);
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
			case EssencePackage.BUS_INTERFACE_MAP__XREF_CONNECTION:
				setXRefConnection((XRefConnection)null);
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
			case EssencePackage.BUS_INTERFACE_MAP__XREF_CONNECTION:
				return xRefConnection != null;
		}
		return super.eIsSet(featureID);
	}

} //BusInterfaceMapImpl
