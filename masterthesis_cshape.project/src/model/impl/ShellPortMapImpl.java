/**
 */
package model.impl;

import model.ModelPackage;
import model.ShellPortMap;
import model.XRefExternalPort;
import model.XRefInternalSignal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shell Port Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.ShellPortMapImpl#getXRefShellPort <em>XRef Shell Port</em>}</li>
 *   <li>{@link model.impl.ShellPortMapImpl#getXRefSignal <em>XRef Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShellPortMapImpl extends SingleSourceNodeImpl implements ShellPortMap {
	/**
	 * The cached value of the '{@link #getXRefShellPort() <em>XRef Shell Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefShellPort()
	 * @generated
	 * @ordered
	 */
	protected XRefExternalPort xRefShellPort;

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
	protected ShellPortMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getShellPortMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefExternalPort getXRefShellPort() {
		return xRefShellPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefShellPort(XRefExternalPort newXRefShellPort, NotificationChain msgs) {
		XRefExternalPort oldXRefShellPort = xRefShellPort;
		xRefShellPort = newXRefShellPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SHELL_PORT_MAP__XREF_SHELL_PORT, oldXRefShellPort, newXRefShellPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefShellPort(XRefExternalPort newXRefShellPort) {
		if (newXRefShellPort != xRefShellPort) {
			NotificationChain msgs = null;
			if (xRefShellPort != null)
				msgs = ((InternalEObject)xRefShellPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SHELL_PORT_MAP__XREF_SHELL_PORT, null, msgs);
			if (newXRefShellPort != null)
				msgs = ((InternalEObject)newXRefShellPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SHELL_PORT_MAP__XREF_SHELL_PORT, null, msgs);
			msgs = basicSetXRefShellPort(newXRefShellPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SHELL_PORT_MAP__XREF_SHELL_PORT, newXRefShellPort, newXRefShellPort));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SHELL_PORT_MAP__XREF_SIGNAL, oldXRefSignal, newXRefSignal);
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
				msgs = ((InternalEObject)xRefSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SHELL_PORT_MAP__XREF_SIGNAL, null, msgs);
			if (newXRefSignal != null)
				msgs = ((InternalEObject)newXRefSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SHELL_PORT_MAP__XREF_SIGNAL, null, msgs);
			msgs = basicSetXRefSignal(newXRefSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SHELL_PORT_MAP__XREF_SIGNAL, newXRefSignal, newXRefSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SHELL_PORT_MAP__XREF_SHELL_PORT:
				return basicSetXRefShellPort(null, msgs);
			case ModelPackage.SHELL_PORT_MAP__XREF_SIGNAL:
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
			case ModelPackage.SHELL_PORT_MAP__XREF_SHELL_PORT:
				return getXRefShellPort();
			case ModelPackage.SHELL_PORT_MAP__XREF_SIGNAL:
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
			case ModelPackage.SHELL_PORT_MAP__XREF_SHELL_PORT:
				setXRefShellPort((XRefExternalPort)newValue);
				return;
			case ModelPackage.SHELL_PORT_MAP__XREF_SIGNAL:
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
			case ModelPackage.SHELL_PORT_MAP__XREF_SHELL_PORT:
				setXRefShellPort((XRefExternalPort)null);
				return;
			case ModelPackage.SHELL_PORT_MAP__XREF_SIGNAL:
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
			case ModelPackage.SHELL_PORT_MAP__XREF_SHELL_PORT:
				return xRefShellPort != null;
			case ModelPackage.SHELL_PORT_MAP__XREF_SIGNAL:
				return xRefSignal != null;
		}
		return super.eIsSet(featureID);
	}

} //ShellPortMapImpl
