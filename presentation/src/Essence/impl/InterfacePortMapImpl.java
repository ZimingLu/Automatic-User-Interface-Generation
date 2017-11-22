/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.InterfacePortMap;
import Essence.XRefIFDPort;
import Essence.XRefInternalPort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Port Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.InterfacePortMapImpl#getXRefLocalPort <em>XRef Local Port</em>}</li>
 *   <li>{@link Essence.impl.InterfacePortMapImpl#getXRefInterfacePort <em>XRef Interface Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfacePortMapImpl extends EssenceBaseImpl implements InterfacePortMap {
	/**
	 * The cached value of the '{@link #getXRefLocalPort() <em>XRef Local Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefLocalPort()
	 * @generated
	 * @ordered
	 */
	protected XRefInternalPort xRefLocalPort;

	/**
	 * The cached value of the '{@link #getXRefInterfacePort() <em>XRef Interface Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefInterfacePort()
	 * @generated
	 * @ordered
	 */
	protected XRefIFDPort xRefInterfacePort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfacePortMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getInterfacePortMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefInternalPort getXRefLocalPort() {
		return xRefLocalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefLocalPort(XRefInternalPort newXRefLocalPort, NotificationChain msgs) {
		XRefInternalPort oldXRefLocalPort = xRefLocalPort;
		xRefLocalPort = newXRefLocalPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.INTERFACE_PORT_MAP__XREF_LOCAL_PORT, oldXRefLocalPort, newXRefLocalPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefLocalPort(XRefInternalPort newXRefLocalPort) {
		if (newXRefLocalPort != xRefLocalPort) {
			NotificationChain msgs = null;
			if (xRefLocalPort != null)
				msgs = ((InternalEObject)xRefLocalPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.INTERFACE_PORT_MAP__XREF_LOCAL_PORT, null, msgs);
			if (newXRefLocalPort != null)
				msgs = ((InternalEObject)newXRefLocalPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.INTERFACE_PORT_MAP__XREF_LOCAL_PORT, null, msgs);
			msgs = basicSetXRefLocalPort(newXRefLocalPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.INTERFACE_PORT_MAP__XREF_LOCAL_PORT, newXRefLocalPort, newXRefLocalPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefIFDPort getXRefInterfacePort() {
		return xRefInterfacePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefInterfacePort(XRefIFDPort newXRefInterfacePort, NotificationChain msgs) {
		XRefIFDPort oldXRefInterfacePort = xRefInterfacePort;
		xRefInterfacePort = newXRefInterfacePort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.INTERFACE_PORT_MAP__XREF_INTERFACE_PORT, oldXRefInterfacePort, newXRefInterfacePort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefInterfacePort(XRefIFDPort newXRefInterfacePort) {
		if (newXRefInterfacePort != xRefInterfacePort) {
			NotificationChain msgs = null;
			if (xRefInterfacePort != null)
				msgs = ((InternalEObject)xRefInterfacePort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.INTERFACE_PORT_MAP__XREF_INTERFACE_PORT, null, msgs);
			if (newXRefInterfacePort != null)
				msgs = ((InternalEObject)newXRefInterfacePort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.INTERFACE_PORT_MAP__XREF_INTERFACE_PORT, null, msgs);
			msgs = basicSetXRefInterfacePort(newXRefInterfacePort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.INTERFACE_PORT_MAP__XREF_INTERFACE_PORT, newXRefInterfacePort, newXRefInterfacePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.INTERFACE_PORT_MAP__XREF_LOCAL_PORT:
				return basicSetXRefLocalPort(null, msgs);
			case EssencePackage.INTERFACE_PORT_MAP__XREF_INTERFACE_PORT:
				return basicSetXRefInterfacePort(null, msgs);
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
			case EssencePackage.INTERFACE_PORT_MAP__XREF_LOCAL_PORT:
				return getXRefLocalPort();
			case EssencePackage.INTERFACE_PORT_MAP__XREF_INTERFACE_PORT:
				return getXRefInterfacePort();
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
			case EssencePackage.INTERFACE_PORT_MAP__XREF_LOCAL_PORT:
				setXRefLocalPort((XRefInternalPort)newValue);
				return;
			case EssencePackage.INTERFACE_PORT_MAP__XREF_INTERFACE_PORT:
				setXRefInterfacePort((XRefIFDPort)newValue);
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
			case EssencePackage.INTERFACE_PORT_MAP__XREF_LOCAL_PORT:
				setXRefLocalPort((XRefInternalPort)null);
				return;
			case EssencePackage.INTERFACE_PORT_MAP__XREF_INTERFACE_PORT:
				setXRefInterfacePort((XRefIFDPort)null);
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
			case EssencePackage.INTERFACE_PORT_MAP__XREF_LOCAL_PORT:
				return xRefLocalPort != null;
			case EssencePackage.INTERFACE_PORT_MAP__XREF_INTERFACE_PORT:
				return xRefInterfacePort != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfacePortMapImpl
