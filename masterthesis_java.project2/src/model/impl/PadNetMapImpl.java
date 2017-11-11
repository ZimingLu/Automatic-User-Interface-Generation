/**
 */
package model.impl;

import model.ModelPackage;
import model.PadNetMap;
import model.XRefNet;
import model.XRefSinglePad;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pad Net Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.PadNetMapImpl#getXRefPad <em>XRef Pad</em>}</li>
 *   <li>{@link model.impl.PadNetMapImpl#getXRefNet <em>XRef Net</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PadNetMapImpl extends SingleSourceNodeImpl implements PadNetMap {
	/**
	 * The cached value of the '{@link #getXRefPad() <em>XRef Pad</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefPad()
	 * @generated
	 * @ordered
	 */
	protected XRefSinglePad xRefPad;

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
	protected PadNetMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getPadNetMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefSinglePad getXRefPad() {
		return xRefPad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefPad(XRefSinglePad newXRefPad, NotificationChain msgs) {
		XRefSinglePad oldXRefPad = xRefPad;
		xRefPad = newXRefPad;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PAD_NET_MAP__XREF_PAD, oldXRefPad, newXRefPad);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefPad(XRefSinglePad newXRefPad) {
		if (newXRefPad != xRefPad) {
			NotificationChain msgs = null;
			if (xRefPad != null)
				msgs = ((InternalEObject)xRefPad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PAD_NET_MAP__XREF_PAD, null, msgs);
			if (newXRefPad != null)
				msgs = ((InternalEObject)newXRefPad).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PAD_NET_MAP__XREF_PAD, null, msgs);
			msgs = basicSetXRefPad(newXRefPad, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PAD_NET_MAP__XREF_PAD, newXRefPad, newXRefPad));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PAD_NET_MAP__XREF_NET, oldXRefNet, newXRefNet);
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
				msgs = ((InternalEObject)xRefNet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PAD_NET_MAP__XREF_NET, null, msgs);
			if (newXRefNet != null)
				msgs = ((InternalEObject)newXRefNet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PAD_NET_MAP__XREF_NET, null, msgs);
			msgs = basicSetXRefNet(newXRefNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PAD_NET_MAP__XREF_NET, newXRefNet, newXRefNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PAD_NET_MAP__XREF_PAD:
				return basicSetXRefPad(null, msgs);
			case ModelPackage.PAD_NET_MAP__XREF_NET:
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
			case ModelPackage.PAD_NET_MAP__XREF_PAD:
				return getXRefPad();
			case ModelPackage.PAD_NET_MAP__XREF_NET:
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
			case ModelPackage.PAD_NET_MAP__XREF_PAD:
				setXRefPad((XRefSinglePad)newValue);
				return;
			case ModelPackage.PAD_NET_MAP__XREF_NET:
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
			case ModelPackage.PAD_NET_MAP__XREF_PAD:
				setXRefPad((XRefSinglePad)null);
				return;
			case ModelPackage.PAD_NET_MAP__XREF_NET:
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
			case ModelPackage.PAD_NET_MAP__XREF_PAD:
				return xRefPad != null;
			case ModelPackage.PAD_NET_MAP__XREF_NET:
				return xRefNet != null;
		}
		return super.eIsSet(featureID);
	}

} //PadNetMapImpl
