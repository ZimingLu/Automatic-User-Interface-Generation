/**
 */
package model.impl;

import model.ModelPackage;
import model.PinNetMap;
import model.XRefNet;
import model.XRefPin;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pin Net Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.PinNetMapImpl#getXRefPin <em>XRef Pin</em>}</li>
 *   <li>{@link model.impl.PinNetMapImpl#getXRefNet <em>XRef Net</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PinNetMapImpl extends SingleSourceNodeImpl implements PinNetMap {
	/**
	 * The cached value of the '{@link #getXRefPin() <em>XRef Pin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefPin()
	 * @generated
	 * @ordered
	 */
	protected XRefPin xRefPin;

	/**
	 * The cached value of the '{@link #getXRefNet() <em>XRef Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefNet()
	 * @generated
	 * @ordered
	 */
	protected XRefNet xRefNet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PinNetMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getPinNetMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefPin getXRefPin() {
		return xRefPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefPin(XRefPin newXRefPin, NotificationChain msgs) {
		XRefPin oldXRefPin = xRefPin;
		xRefPin = newXRefPin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PIN_NET_MAP__XREF_PIN, oldXRefPin, newXRefPin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefPin(XRefPin newXRefPin) {
		if (newXRefPin != xRefPin) {
			NotificationChain msgs = null;
			if (xRefPin != null)
				msgs = ((InternalEObject)xRefPin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PIN_NET_MAP__XREF_PIN, null, msgs);
			if (newXRefPin != null)
				msgs = ((InternalEObject)newXRefPin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PIN_NET_MAP__XREF_PIN, null, msgs);
			msgs = basicSetXRefPin(newXRefPin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PIN_NET_MAP__XREF_PIN, newXRefPin, newXRefPin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefNet getXRefNet() {
		return xRefNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefNet(XRefNet newXRefNet, NotificationChain msgs) {
		XRefNet oldXRefNet = xRefNet;
		xRefNet = newXRefNet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PIN_NET_MAP__XREF_NET, oldXRefNet, newXRefNet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefNet(XRefNet newXRefNet) {
		if (newXRefNet != xRefNet) {
			NotificationChain msgs = null;
			if (xRefNet != null)
				msgs = ((InternalEObject)xRefNet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PIN_NET_MAP__XREF_NET, null, msgs);
			if (newXRefNet != null)
				msgs = ((InternalEObject)newXRefNet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PIN_NET_MAP__XREF_NET, null, msgs);
			msgs = basicSetXRefNet(newXRefNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PIN_NET_MAP__XREF_NET, newXRefNet, newXRefNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PIN_NET_MAP__XREF_PIN:
				return basicSetXRefPin(null, msgs);
			case ModelPackage.PIN_NET_MAP__XREF_NET:
				return basicSetXRefNet(null, msgs);
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
			case ModelPackage.PIN_NET_MAP__XREF_PIN:
				return getXRefPin();
			case ModelPackage.PIN_NET_MAP__XREF_NET:
				return getXRefNet();
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
			case ModelPackage.PIN_NET_MAP__XREF_PIN:
				setXRefPin((XRefPin)newValue);
				return;
			case ModelPackage.PIN_NET_MAP__XREF_NET:
				setXRefNet((XRefNet)newValue);
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
			case ModelPackage.PIN_NET_MAP__XREF_PIN:
				setXRefPin((XRefPin)null);
				return;
			case ModelPackage.PIN_NET_MAP__XREF_NET:
				setXRefNet((XRefNet)null);
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
			case ModelPackage.PIN_NET_MAP__XREF_PIN:
				return xRefPin != null;
			case ModelPackage.PIN_NET_MAP__XREF_NET:
				return xRefNet != null;
		}
		return super.eIsSet(featureID);
	}

} //PinNetMapImpl
