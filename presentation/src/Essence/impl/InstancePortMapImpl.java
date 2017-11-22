/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.InstancePortMap;
import Essence.XRefExternalPort;
import Essence.XRefInternalSignal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Port Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.InstancePortMapImpl#getXRefInstancePort <em>XRef Instance Port</em>}</li>
 *   <li>{@link Essence.impl.InstancePortMapImpl#getXRefSignal <em>XRef Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstancePortMapImpl extends SingleSourceNodeImpl implements InstancePortMap {
	/**
	 * The cached value of the '{@link #getXRefInstancePort() <em>XRef Instance Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefInstancePort()
	 * @generated
	 * @ordered
	 */
	protected XRefExternalPort xRefInstancePort;

	/**
	 * The cached value of the '{@link #getXRefSignal() <em>XRef Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefSignal()
	 * @generated
	 * @ordered
	 */
	protected XRefInternalSignal xRefSignal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstancePortMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getInstancePortMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefExternalPort getXRefInstancePort() {
		return xRefInstancePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefInstancePort(XRefExternalPort newXRefInstancePort, NotificationChain msgs) {
		XRefExternalPort oldXRefInstancePort = xRefInstancePort;
		xRefInstancePort = newXRefInstancePort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.INSTANCE_PORT_MAP__XREF_INSTANCE_PORT, oldXRefInstancePort, newXRefInstancePort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefInstancePort(XRefExternalPort newXRefInstancePort) {
		if (newXRefInstancePort != xRefInstancePort) {
			NotificationChain msgs = null;
			if (xRefInstancePort != null)
				msgs = ((InternalEObject)xRefInstancePort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.INSTANCE_PORT_MAP__XREF_INSTANCE_PORT, null, msgs);
			if (newXRefInstancePort != null)
				msgs = ((InternalEObject)newXRefInstancePort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.INSTANCE_PORT_MAP__XREF_INSTANCE_PORT, null, msgs);
			msgs = basicSetXRefInstancePort(newXRefInstancePort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.INSTANCE_PORT_MAP__XREF_INSTANCE_PORT, newXRefInstancePort, newXRefInstancePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefInternalSignal getXRefSignal() {
		return xRefSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefSignal(XRefInternalSignal newXRefSignal, NotificationChain msgs) {
		XRefInternalSignal oldXRefSignal = xRefSignal;
		xRefSignal = newXRefSignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.INSTANCE_PORT_MAP__XREF_SIGNAL, oldXRefSignal, newXRefSignal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefSignal(XRefInternalSignal newXRefSignal) {
		if (newXRefSignal != xRefSignal) {
			NotificationChain msgs = null;
			if (xRefSignal != null)
				msgs = ((InternalEObject)xRefSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.INSTANCE_PORT_MAP__XREF_SIGNAL, null, msgs);
			if (newXRefSignal != null)
				msgs = ((InternalEObject)newXRefSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.INSTANCE_PORT_MAP__XREF_SIGNAL, null, msgs);
			msgs = basicSetXRefSignal(newXRefSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.INSTANCE_PORT_MAP__XREF_SIGNAL, newXRefSignal, newXRefSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.INSTANCE_PORT_MAP__XREF_INSTANCE_PORT:
				return basicSetXRefInstancePort(null, msgs);
			case EssencePackage.INSTANCE_PORT_MAP__XREF_SIGNAL:
				return basicSetXRefSignal(null, msgs);
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
			case EssencePackage.INSTANCE_PORT_MAP__XREF_INSTANCE_PORT:
				return getXRefInstancePort();
			case EssencePackage.INSTANCE_PORT_MAP__XREF_SIGNAL:
				return getXRefSignal();
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
			case EssencePackage.INSTANCE_PORT_MAP__XREF_INSTANCE_PORT:
				setXRefInstancePort((XRefExternalPort)newValue);
				return;
			case EssencePackage.INSTANCE_PORT_MAP__XREF_SIGNAL:
				setXRefSignal((XRefInternalSignal)newValue);
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
			case EssencePackage.INSTANCE_PORT_MAP__XREF_INSTANCE_PORT:
				setXRefInstancePort((XRefExternalPort)null);
				return;
			case EssencePackage.INSTANCE_PORT_MAP__XREF_SIGNAL:
				setXRefSignal((XRefInternalSignal)null);
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
			case EssencePackage.INSTANCE_PORT_MAP__XREF_INSTANCE_PORT:
				return xRefInstancePort != null;
			case EssencePackage.INSTANCE_PORT_MAP__XREF_SIGNAL:
				return xRefSignal != null;
		}
		return super.eIsSet(featureID);
	}

} //InstancePortMapImpl
