/**
 */
package model.impl;

import model.LocalPortMap;
import model.ModelPackage;
import model.XRefInternalPort;
import model.XRefInternalSignal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Port Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.LocalPortMapImpl#getXRefLocalPort <em>XRef Local Port</em>}</li>
 *   <li>{@link model.impl.LocalPortMapImpl#getXRefSignal <em>XRef Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalPortMapImpl extends SingleSourceNodeImpl implements LocalPortMap {
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
	protected LocalPortMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getLocalPortMap();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.LOCAL_PORT_MAP__XREF_LOCAL_PORT, oldXRefLocalPort, newXRefLocalPort);
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
				msgs = ((InternalEObject)xRefLocalPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.LOCAL_PORT_MAP__XREF_LOCAL_PORT, null, msgs);
			if (newXRefLocalPort != null)
				msgs = ((InternalEObject)newXRefLocalPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.LOCAL_PORT_MAP__XREF_LOCAL_PORT, null, msgs);
			msgs = basicSetXRefLocalPort(newXRefLocalPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LOCAL_PORT_MAP__XREF_LOCAL_PORT, newXRefLocalPort, newXRefLocalPort));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.LOCAL_PORT_MAP__XREF_SIGNAL, oldXRefSignal, newXRefSignal);
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
				msgs = ((InternalEObject)xRefSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.LOCAL_PORT_MAP__XREF_SIGNAL, null, msgs);
			if (newXRefSignal != null)
				msgs = ((InternalEObject)newXRefSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.LOCAL_PORT_MAP__XREF_SIGNAL, null, msgs);
			msgs = basicSetXRefSignal(newXRefSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LOCAL_PORT_MAP__XREF_SIGNAL, newXRefSignal, newXRefSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.LOCAL_PORT_MAP__XREF_LOCAL_PORT:
				return basicSetXRefLocalPort(null, msgs);
			case ModelPackage.LOCAL_PORT_MAP__XREF_SIGNAL:
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
			case ModelPackage.LOCAL_PORT_MAP__XREF_LOCAL_PORT:
				return getXRefLocalPort();
			case ModelPackage.LOCAL_PORT_MAP__XREF_SIGNAL:
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
			case ModelPackage.LOCAL_PORT_MAP__XREF_LOCAL_PORT:
				setXRefLocalPort((XRefInternalPort)newValue);
				return;
			case ModelPackage.LOCAL_PORT_MAP__XREF_SIGNAL:
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
			case ModelPackage.LOCAL_PORT_MAP__XREF_LOCAL_PORT:
				setXRefLocalPort((XRefInternalPort)null);
				return;
			case ModelPackage.LOCAL_PORT_MAP__XREF_SIGNAL:
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
			case ModelPackage.LOCAL_PORT_MAP__XREF_LOCAL_PORT:
				return xRefLocalPort != null;
			case ModelPackage.LOCAL_PORT_MAP__XREF_SIGNAL:
				return xRefSignal != null;
		}
		return super.eIsSet(featureID);
	}

} //LocalPortMapImpl
