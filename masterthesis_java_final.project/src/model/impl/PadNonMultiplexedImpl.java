/**
 */
package model.impl;

import java.util.Collection;

import model.Function;
import model.ModelPackage;
import model.PadNonMultiplexed;
import model.SiPortReq;
import model.VLNV;
import model.XRefPadType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pad Non Multiplexed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.PadNonMultiplexedImpl#getExtVLNV <em>Ext VLNV</em>}</li>
 *   <li>{@link model.impl.PadNonMultiplexedImpl#getSiPortReq <em>Si Port Req</em>}</li>
 *   <li>{@link model.impl.PadNonMultiplexedImpl#getXRefPadType <em>XRef Pad Type</em>}</li>
 *   <li>{@link model.impl.PadNonMultiplexedImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PadNonMultiplexedImpl extends SinglePadImpl implements PadNonMultiplexed {
	/**
	 * The cached value of the '{@link #getExtVLNV() <em>Ext VLNV</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtVLNV()
	 * @generated
	 * @ordered
	 */
	protected EList<VLNV> extVLNV;

	/**
	 * The cached value of the '{@link #getSiPortReq() <em>Si Port Req</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiPortReq()
	 * @generated
	 * @ordered
	 */
	protected SiPortReq siPortReq;

	/**
	 * The cached value of the '{@link #getXRefPadType() <em>XRef Pad Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefPadType()
	 * @generated
	 * @ordered
	 */
	protected XRefPadType xRefPadType;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> function;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PadNonMultiplexedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getPadNonMultiplexed();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VLNV> getExtVLNV() {
		if (extVLNV == null) {
			extVLNV = new EObjectContainmentEList<VLNV>(VLNV.class, this, ModelPackage.PAD_NON_MULTIPLEXED__EXT_VLNV);
		}
		return extVLNV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiPortReq getSiPortReq() {
		return siPortReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSiPortReq(SiPortReq newSiPortReq, NotificationChain msgs) {
		SiPortReq oldSiPortReq = siPortReq;
		siPortReq = newSiPortReq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PAD_NON_MULTIPLEXED__SI_PORT_REQ, oldSiPortReq, newSiPortReq);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiPortReq(SiPortReq newSiPortReq) {
		if (newSiPortReq != siPortReq) {
			NotificationChain msgs = null;
			if (siPortReq != null)
				msgs = ((InternalEObject)siPortReq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PAD_NON_MULTIPLEXED__SI_PORT_REQ, null, msgs);
			if (newSiPortReq != null)
				msgs = ((InternalEObject)newSiPortReq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PAD_NON_MULTIPLEXED__SI_PORT_REQ, null, msgs);
			msgs = basicSetSiPortReq(newSiPortReq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PAD_NON_MULTIPLEXED__SI_PORT_REQ, newSiPortReq, newSiPortReq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefPadType getXRefPadType() {
		return xRefPadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefPadType(XRefPadType newXRefPadType, NotificationChain msgs) {
		XRefPadType oldXRefPadType = xRefPadType;
		xRefPadType = newXRefPadType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PAD_NON_MULTIPLEXED__XREF_PAD_TYPE, oldXRefPadType, newXRefPadType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefPadType(XRefPadType newXRefPadType) {
		if (newXRefPadType != xRefPadType) {
			NotificationChain msgs = null;
			if (xRefPadType != null)
				msgs = ((InternalEObject)xRefPadType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PAD_NON_MULTIPLEXED__XREF_PAD_TYPE, null, msgs);
			if (newXRefPadType != null)
				msgs = ((InternalEObject)newXRefPadType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PAD_NON_MULTIPLEXED__XREF_PAD_TYPE, null, msgs);
			msgs = basicSetXRefPadType(newXRefPadType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PAD_NON_MULTIPLEXED__XREF_PAD_TYPE, newXRefPadType, newXRefPadType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getFunction() {
		if (function == null) {
			function = new EObjectContainmentEList<Function>(Function.class, this, ModelPackage.PAD_NON_MULTIPLEXED__FUNCTION);
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PAD_NON_MULTIPLEXED__EXT_VLNV:
				return ((InternalEList<?>)getExtVLNV()).basicRemove(otherEnd, msgs);
			case ModelPackage.PAD_NON_MULTIPLEXED__SI_PORT_REQ:
				return basicSetSiPortReq(null, msgs);
			case ModelPackage.PAD_NON_MULTIPLEXED__XREF_PAD_TYPE:
				return basicSetXRefPadType(null, msgs);
			case ModelPackage.PAD_NON_MULTIPLEXED__FUNCTION:
				return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.PAD_NON_MULTIPLEXED__EXT_VLNV:
				return getExtVLNV();
			case ModelPackage.PAD_NON_MULTIPLEXED__SI_PORT_REQ:
				return getSiPortReq();
			case ModelPackage.PAD_NON_MULTIPLEXED__XREF_PAD_TYPE:
				return getXRefPadType();
			case ModelPackage.PAD_NON_MULTIPLEXED__FUNCTION:
				return getFunction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.PAD_NON_MULTIPLEXED__EXT_VLNV:
				getExtVLNV().clear();
				getExtVLNV().addAll((Collection<? extends VLNV>)newValue);
				return;
			case ModelPackage.PAD_NON_MULTIPLEXED__SI_PORT_REQ:
				setSiPortReq((SiPortReq)newValue);
				return;
			case ModelPackage.PAD_NON_MULTIPLEXED__XREF_PAD_TYPE:
				setXRefPadType((XRefPadType)newValue);
				return;
			case ModelPackage.PAD_NON_MULTIPLEXED__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends Function>)newValue);
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
			case ModelPackage.PAD_NON_MULTIPLEXED__EXT_VLNV:
				getExtVLNV().clear();
				return;
			case ModelPackage.PAD_NON_MULTIPLEXED__SI_PORT_REQ:
				setSiPortReq((SiPortReq)null);
				return;
			case ModelPackage.PAD_NON_MULTIPLEXED__XREF_PAD_TYPE:
				setXRefPadType((XRefPadType)null);
				return;
			case ModelPackage.PAD_NON_MULTIPLEXED__FUNCTION:
				getFunction().clear();
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
			case ModelPackage.PAD_NON_MULTIPLEXED__EXT_VLNV:
				return extVLNV != null && !extVLNV.isEmpty();
			case ModelPackage.PAD_NON_MULTIPLEXED__SI_PORT_REQ:
				return siPortReq != null;
			case ModelPackage.PAD_NON_MULTIPLEXED__XREF_PAD_TYPE:
				return xRefPadType != null;
			case ModelPackage.PAD_NON_MULTIPLEXED__FUNCTION:
				return function != null && !function.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PadNonMultiplexedImpl
