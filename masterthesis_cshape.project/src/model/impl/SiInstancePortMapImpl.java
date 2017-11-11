/**
 */
package model.impl;

import model.ModelPackage;
import model.SiInstancePortMap;
import model.XRefExternalPort;
import model.XRefSiSignal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Si Instance Port Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.SiInstancePortMapImpl#getXRefInstancePort <em>XRef Instance Port</em>}</li>
 *   <li>{@link model.impl.SiInstancePortMapImpl#getXRefSignal <em>XRef Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiInstancePortMapImpl extends SingleSourceNodeImpl implements SiInstancePortMap {
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
	protected XRefSiSignal xRefSignal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiInstancePortMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getSiInstancePortMap();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SI_INSTANCE_PORT_MAP__XREF_INSTANCE_PORT, oldXRefInstancePort, newXRefInstancePort);
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
				msgs = ((InternalEObject)xRefInstancePort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SI_INSTANCE_PORT_MAP__XREF_INSTANCE_PORT, null, msgs);
			if (newXRefInstancePort != null)
				msgs = ((InternalEObject)newXRefInstancePort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SI_INSTANCE_PORT_MAP__XREF_INSTANCE_PORT, null, msgs);
			msgs = basicSetXRefInstancePort(newXRefInstancePort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SI_INSTANCE_PORT_MAP__XREF_INSTANCE_PORT, newXRefInstancePort, newXRefInstancePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefSiSignal getXRefSignal() {
		return xRefSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefSignal(XRefSiSignal newXRefSignal, NotificationChain msgs) {
		XRefSiSignal oldXRefSignal = xRefSignal;
		xRefSignal = newXRefSignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SI_INSTANCE_PORT_MAP__XREF_SIGNAL, oldXRefSignal, newXRefSignal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefSignal(XRefSiSignal newXRefSignal) {
		if (newXRefSignal != xRefSignal) {
			NotificationChain msgs = null;
			if (xRefSignal != null)
				msgs = ((InternalEObject)xRefSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SI_INSTANCE_PORT_MAP__XREF_SIGNAL, null, msgs);
			if (newXRefSignal != null)
				msgs = ((InternalEObject)newXRefSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SI_INSTANCE_PORT_MAP__XREF_SIGNAL, null, msgs);
			msgs = basicSetXRefSignal(newXRefSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SI_INSTANCE_PORT_MAP__XREF_SIGNAL, newXRefSignal, newXRefSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SI_INSTANCE_PORT_MAP__XREF_INSTANCE_PORT:
				return basicSetXRefInstancePort(null, msgs);
			case ModelPackage.SI_INSTANCE_PORT_MAP__XREF_SIGNAL:
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
			case ModelPackage.SI_INSTANCE_PORT_MAP__XREF_INSTANCE_PORT:
				return getXRefInstancePort();
			case ModelPackage.SI_INSTANCE_PORT_MAP__XREF_SIGNAL:
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
			case ModelPackage.SI_INSTANCE_PORT_MAP__XREF_INSTANCE_PORT:
				setXRefInstancePort((XRefExternalPort)newValue);
				return;
			case ModelPackage.SI_INSTANCE_PORT_MAP__XREF_SIGNAL:
				setXRefSignal((XRefSiSignal)newValue);
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
			case ModelPackage.SI_INSTANCE_PORT_MAP__XREF_INSTANCE_PORT:
				setXRefInstancePort((XRefExternalPort)null);
				return;
			case ModelPackage.SI_INSTANCE_PORT_MAP__XREF_SIGNAL:
				setXRefSignal((XRefSiSignal)null);
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
			case ModelPackage.SI_INSTANCE_PORT_MAP__XREF_INSTANCE_PORT:
				return xRefInstancePort != null;
			case ModelPackage.SI_INSTANCE_PORT_MAP__XREF_SIGNAL:
				return xRefSignal != null;
		}
		return super.eIsSet(featureID);
	}

} //SiInstancePortMapImpl
