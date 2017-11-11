/**
 */
package model.impl;

import model.InstanceShellPortMap;
import model.ModelPackage;
import model.XRefIndPort;
import model.XRefInternalSignal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Shell Port Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.InstanceShellPortMapImpl#getXRefInstanceShellPort <em>XRef Instance Shell Port</em>}</li>
 *   <li>{@link model.impl.InstanceShellPortMapImpl#getXRefSignal <em>XRef Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceShellPortMapImpl extends SingleSourceNodeImpl implements InstanceShellPortMap {
	/**
	 * The cached value of the '{@link #getXRefInstanceShellPort() <em>XRef Instance Shell Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefInstanceShellPort()
	 * @generated
	 * @ordered
	 */
	protected XRefIndPort xRefInstanceShellPort;

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
	protected InstanceShellPortMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getInstanceShellPortMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefIndPort getXRefInstanceShellPort() {
		return xRefInstanceShellPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefInstanceShellPort(XRefIndPort newXRefInstanceShellPort, NotificationChain msgs) {
		XRefIndPort oldXRefInstanceShellPort = xRefInstanceShellPort;
		xRefInstanceShellPort = newXRefInstanceShellPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.INSTANCE_SHELL_PORT_MAP__XREF_INSTANCE_SHELL_PORT, oldXRefInstanceShellPort, newXRefInstanceShellPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefInstanceShellPort(XRefIndPort newXRefInstanceShellPort) {
		if (newXRefInstanceShellPort != xRefInstanceShellPort) {
			NotificationChain msgs = null;
			if (xRefInstanceShellPort != null)
				msgs = ((InternalEObject)xRefInstanceShellPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.INSTANCE_SHELL_PORT_MAP__XREF_INSTANCE_SHELL_PORT, null, msgs);
			if (newXRefInstanceShellPort != null)
				msgs = ((InternalEObject)newXRefInstanceShellPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.INSTANCE_SHELL_PORT_MAP__XREF_INSTANCE_SHELL_PORT, null, msgs);
			msgs = basicSetXRefInstanceShellPort(newXRefInstanceShellPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INSTANCE_SHELL_PORT_MAP__XREF_INSTANCE_SHELL_PORT, newXRefInstanceShellPort, newXRefInstanceShellPort));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.INSTANCE_SHELL_PORT_MAP__XREF_SIGNAL, oldXRefSignal, newXRefSignal);
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
				msgs = ((InternalEObject)xRefSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.INSTANCE_SHELL_PORT_MAP__XREF_SIGNAL, null, msgs);
			if (newXRefSignal != null)
				msgs = ((InternalEObject)newXRefSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.INSTANCE_SHELL_PORT_MAP__XREF_SIGNAL, null, msgs);
			msgs = basicSetXRefSignal(newXRefSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INSTANCE_SHELL_PORT_MAP__XREF_SIGNAL, newXRefSignal, newXRefSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.INSTANCE_SHELL_PORT_MAP__XREF_INSTANCE_SHELL_PORT:
				return basicSetXRefInstanceShellPort(null, msgs);
			case ModelPackage.INSTANCE_SHELL_PORT_MAP__XREF_SIGNAL:
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
			case ModelPackage.INSTANCE_SHELL_PORT_MAP__XREF_INSTANCE_SHELL_PORT:
				return getXRefInstanceShellPort();
			case ModelPackage.INSTANCE_SHELL_PORT_MAP__XREF_SIGNAL:
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
			case ModelPackage.INSTANCE_SHELL_PORT_MAP__XREF_INSTANCE_SHELL_PORT:
				setXRefInstanceShellPort((XRefIndPort)newValue);
				return;
			case ModelPackage.INSTANCE_SHELL_PORT_MAP__XREF_SIGNAL:
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
			case ModelPackage.INSTANCE_SHELL_PORT_MAP__XREF_INSTANCE_SHELL_PORT:
				setXRefInstanceShellPort((XRefIndPort)null);
				return;
			case ModelPackage.INSTANCE_SHELL_PORT_MAP__XREF_SIGNAL:
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
			case ModelPackage.INSTANCE_SHELL_PORT_MAP__XREF_INSTANCE_SHELL_PORT:
				return xRefInstanceShellPort != null;
			case ModelPackage.INSTANCE_SHELL_PORT_MAP__XREF_SIGNAL:
				return xRefSignal != null;
		}
		return super.eIsSet(featureID);
	}

} //InstanceShellPortMapImpl
