/**
 */
package model.impl;

import model.ModelPackage;
import model.SignalMap;
import model.XRefExternalSignal;
import model.XRefInternalSignal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.SignalMapImpl#getXRefLocalSignal <em>XRef Local Signal</em>}</li>
 *   <li>{@link model.impl.SignalMapImpl#getXRefInterfaceDefSignal <em>XRef Interface Def Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalMapImpl extends EssenceBaseImpl implements SignalMap {
	/**
	 * The cached value of the '{@link #getXRefLocalSignal() <em>XRef Local Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefLocalSignal()
	 * @generated
	 * @ordered
	 */
	protected XRefInternalSignal xRefLocalSignal;

	/**
	 * The cached value of the '{@link #getXRefInterfaceDefSignal() <em>XRef Interface Def Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefInterfaceDefSignal()
	 * @generated
	 * @ordered
	 */
	protected XRefExternalSignal xRefInterfaceDefSignal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getSignalMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefInternalSignal getXRefLocalSignal() {
		return xRefLocalSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefLocalSignal(XRefInternalSignal newXRefLocalSignal, NotificationChain msgs) {
		XRefInternalSignal oldXRefLocalSignal = xRefLocalSignal;
		xRefLocalSignal = newXRefLocalSignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SIGNAL_MAP__XREF_LOCAL_SIGNAL, oldXRefLocalSignal, newXRefLocalSignal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefLocalSignal(XRefInternalSignal newXRefLocalSignal) {
		if (newXRefLocalSignal != xRefLocalSignal) {
			NotificationChain msgs = null;
			if (xRefLocalSignal != null)
				msgs = ((InternalEObject)xRefLocalSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SIGNAL_MAP__XREF_LOCAL_SIGNAL, null, msgs);
			if (newXRefLocalSignal != null)
				msgs = ((InternalEObject)newXRefLocalSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SIGNAL_MAP__XREF_LOCAL_SIGNAL, null, msgs);
			msgs = basicSetXRefLocalSignal(newXRefLocalSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIGNAL_MAP__XREF_LOCAL_SIGNAL, newXRefLocalSignal, newXRefLocalSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefExternalSignal getXRefInterfaceDefSignal() {
		return xRefInterfaceDefSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefInterfaceDefSignal(XRefExternalSignal newXRefInterfaceDefSignal, NotificationChain msgs) {
		XRefExternalSignal oldXRefInterfaceDefSignal = xRefInterfaceDefSignal;
		xRefInterfaceDefSignal = newXRefInterfaceDefSignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SIGNAL_MAP__XREF_INTERFACE_DEF_SIGNAL, oldXRefInterfaceDefSignal, newXRefInterfaceDefSignal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefInterfaceDefSignal(XRefExternalSignal newXRefInterfaceDefSignal) {
		if (newXRefInterfaceDefSignal != xRefInterfaceDefSignal) {
			NotificationChain msgs = null;
			if (xRefInterfaceDefSignal != null)
				msgs = ((InternalEObject)xRefInterfaceDefSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SIGNAL_MAP__XREF_INTERFACE_DEF_SIGNAL, null, msgs);
			if (newXRefInterfaceDefSignal != null)
				msgs = ((InternalEObject)newXRefInterfaceDefSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SIGNAL_MAP__XREF_INTERFACE_DEF_SIGNAL, null, msgs);
			msgs = basicSetXRefInterfaceDefSignal(newXRefInterfaceDefSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIGNAL_MAP__XREF_INTERFACE_DEF_SIGNAL, newXRefInterfaceDefSignal, newXRefInterfaceDefSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SIGNAL_MAP__XREF_LOCAL_SIGNAL:
				return basicSetXRefLocalSignal(null, msgs);
			case ModelPackage.SIGNAL_MAP__XREF_INTERFACE_DEF_SIGNAL:
				return basicSetXRefInterfaceDefSignal(null, msgs);
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
			case ModelPackage.SIGNAL_MAP__XREF_LOCAL_SIGNAL:
				return getXRefLocalSignal();
			case ModelPackage.SIGNAL_MAP__XREF_INTERFACE_DEF_SIGNAL:
				return getXRefInterfaceDefSignal();
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
			case ModelPackage.SIGNAL_MAP__XREF_LOCAL_SIGNAL:
				setXRefLocalSignal((XRefInternalSignal)newValue);
				return;
			case ModelPackage.SIGNAL_MAP__XREF_INTERFACE_DEF_SIGNAL:
				setXRefInterfaceDefSignal((XRefExternalSignal)newValue);
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
			case ModelPackage.SIGNAL_MAP__XREF_LOCAL_SIGNAL:
				setXRefLocalSignal((XRefInternalSignal)null);
				return;
			case ModelPackage.SIGNAL_MAP__XREF_INTERFACE_DEF_SIGNAL:
				setXRefInterfaceDefSignal((XRefExternalSignal)null);
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
			case ModelPackage.SIGNAL_MAP__XREF_LOCAL_SIGNAL:
				return xRefLocalSignal != null;
			case ModelPackage.SIGNAL_MAP__XREF_INTERFACE_DEF_SIGNAL:
				return xRefInterfaceDefSignal != null;
		}
		return super.eIsSet(featureID);
	}

} //SignalMapImpl
