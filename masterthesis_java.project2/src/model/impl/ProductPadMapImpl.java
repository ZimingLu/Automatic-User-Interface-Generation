/**
 */
package model.impl;

import model.ModelPackage;
import model.ProductPadMap;
import model.XRefIndSinglePad;
import model.XRefInternalSignal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Pad Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.ProductPadMapImpl#getXRefPad <em>XRef Pad</em>}</li>
 *   <li>{@link model.impl.ProductPadMapImpl#getXRefSignal <em>XRef Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductPadMapImpl extends SingleSourceNodeImpl implements ProductPadMap {
	/**
	 * The cached value of the '{@link #getXRefPad() <em>XRef Pad</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefPad()
	 * @generated
	 * @ordered
	 */
	protected XRefIndSinglePad xRefPad;

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
	protected ProductPadMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getProductPadMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefIndSinglePad getXRefPad() {
		return xRefPad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefPad(XRefIndSinglePad newXRefPad, NotificationChain msgs) {
		XRefIndSinglePad oldXRefPad = xRefPad;
		xRefPad = newXRefPad;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCT_PAD_MAP__XREF_PAD, oldXRefPad, newXRefPad);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefPad(XRefIndSinglePad newXRefPad) {
		if (newXRefPad != xRefPad) {
			NotificationChain msgs = null;
			if (xRefPad != null)
				msgs = ((InternalEObject)xRefPad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PRODUCT_PAD_MAP__XREF_PAD, null, msgs);
			if (newXRefPad != null)
				msgs = ((InternalEObject)newXRefPad).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PRODUCT_PAD_MAP__XREF_PAD, null, msgs);
			msgs = basicSetXRefPad(newXRefPad, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCT_PAD_MAP__XREF_PAD, newXRefPad, newXRefPad));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCT_PAD_MAP__XREF_SIGNAL, oldXRefSignal, newXRefSignal);
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
				msgs = ((InternalEObject)xRefSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PRODUCT_PAD_MAP__XREF_SIGNAL, null, msgs);
			if (newXRefSignal != null)
				msgs = ((InternalEObject)newXRefSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PRODUCT_PAD_MAP__XREF_SIGNAL, null, msgs);
			msgs = basicSetXRefSignal(newXRefSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCT_PAD_MAP__XREF_SIGNAL, newXRefSignal, newXRefSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PRODUCT_PAD_MAP__XREF_PAD:
				return basicSetXRefPad(null, msgs);
			case ModelPackage.PRODUCT_PAD_MAP__XREF_SIGNAL:
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
			case ModelPackage.PRODUCT_PAD_MAP__XREF_PAD:
				return getXRefPad();
			case ModelPackage.PRODUCT_PAD_MAP__XREF_SIGNAL:
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
			case ModelPackage.PRODUCT_PAD_MAP__XREF_PAD:
				setXRefPad((XRefIndSinglePad)newValue);
				return;
			case ModelPackage.PRODUCT_PAD_MAP__XREF_SIGNAL:
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
			case ModelPackage.PRODUCT_PAD_MAP__XREF_PAD:
				setXRefPad((XRefIndSinglePad)null);
				return;
			case ModelPackage.PRODUCT_PAD_MAP__XREF_SIGNAL:
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
			case ModelPackage.PRODUCT_PAD_MAP__XREF_PAD:
				return xRefPad != null;
			case ModelPackage.PRODUCT_PAD_MAP__XREF_SIGNAL:
				return xRefSignal != null;
		}
		return super.eIsSet(featureID);
	}

} //ProductPadMapImpl
