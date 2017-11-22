/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.Function;
import Essence.SiPort;
import Essence.SiPortReq;
import Essence.XRefTest;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Si Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.SiPortImpl#getPdr <em>Pdr</em>}</li>
 *   <li>{@link Essence.impl.SiPortImpl#getXRefTest <em>XRef Test</em>}</li>
 *   <li>{@link Essence.impl.SiPortImpl#getSiPortReq <em>Si Port Req</em>}</li>
 *   <li>{@link Essence.impl.SiPortImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiPortImpl extends SingleSourceNodeImpl implements SiPort {
	/**
	 * The default value of the '{@link #getPdr() <em>Pdr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPdr()
	 * @generated
	 * @ordered
	 */
	protected static final String PDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPdr() <em>Pdr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPdr()
	 * @generated
	 * @ordered
	 */
	protected String pdr = PDR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXRefTest() <em>XRef Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefTest()
	 * @generated
	 * @ordered
	 */
	protected XRefTest xRefTest;

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
	protected SiPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getSiPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPdr() {
		return pdr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPdr(String newPdr) {
		String oldPdr = pdr;
		pdr = newPdr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SI_PORT__PDR, oldPdr, pdr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefTest getXRefTest() {
		return xRefTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefTest(XRefTest newXRefTest, NotificationChain msgs) {
		XRefTest oldXRefTest = xRefTest;
		xRefTest = newXRefTest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.SI_PORT__XREF_TEST, oldXRefTest, newXRefTest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefTest(XRefTest newXRefTest) {
		if (newXRefTest != xRefTest) {
			NotificationChain msgs = null;
			if (xRefTest != null)
				msgs = ((InternalEObject)xRefTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.SI_PORT__XREF_TEST, null, msgs);
			if (newXRefTest != null)
				msgs = ((InternalEObject)newXRefTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.SI_PORT__XREF_TEST, null, msgs);
			msgs = basicSetXRefTest(newXRefTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SI_PORT__XREF_TEST, newXRefTest, newXRefTest));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.SI_PORT__SI_PORT_REQ, oldSiPortReq, newSiPortReq);
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
				msgs = ((InternalEObject)siPortReq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.SI_PORT__SI_PORT_REQ, null, msgs);
			if (newSiPortReq != null)
				msgs = ((InternalEObject)newSiPortReq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.SI_PORT__SI_PORT_REQ, null, msgs);
			msgs = basicSetSiPortReq(newSiPortReq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SI_PORT__SI_PORT_REQ, newSiPortReq, newSiPortReq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getFunction() {
		if (function == null) {
			function = new EObjectContainmentEList<Function>(Function.class, this, EssencePackage.SI_PORT__FUNCTION);
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
			case EssencePackage.SI_PORT__XREF_TEST:
				return basicSetXRefTest(null, msgs);
			case EssencePackage.SI_PORT__SI_PORT_REQ:
				return basicSetSiPortReq(null, msgs);
			case EssencePackage.SI_PORT__FUNCTION:
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
			case EssencePackage.SI_PORT__PDR:
				return getPdr();
			case EssencePackage.SI_PORT__XREF_TEST:
				return getXRefTest();
			case EssencePackage.SI_PORT__SI_PORT_REQ:
				return getSiPortReq();
			case EssencePackage.SI_PORT__FUNCTION:
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
			case EssencePackage.SI_PORT__PDR:
				setPdr((String)newValue);
				return;
			case EssencePackage.SI_PORT__XREF_TEST:
				setXRefTest((XRefTest)newValue);
				return;
			case EssencePackage.SI_PORT__SI_PORT_REQ:
				setSiPortReq((SiPortReq)newValue);
				return;
			case EssencePackage.SI_PORT__FUNCTION:
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
			case EssencePackage.SI_PORT__PDR:
				setPdr(PDR_EDEFAULT);
				return;
			case EssencePackage.SI_PORT__XREF_TEST:
				setXRefTest((XRefTest)null);
				return;
			case EssencePackage.SI_PORT__SI_PORT_REQ:
				setSiPortReq((SiPortReq)null);
				return;
			case EssencePackage.SI_PORT__FUNCTION:
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
			case EssencePackage.SI_PORT__PDR:
				return PDR_EDEFAULT == null ? pdr != null : !PDR_EDEFAULT.equals(pdr);
			case EssencePackage.SI_PORT__XREF_TEST:
				return xRefTest != null;
			case EssencePackage.SI_PORT__SI_PORT_REQ:
				return siPortReq != null;
			case EssencePackage.SI_PORT__FUNCTION:
				return function != null && !function.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pdr: ");
		result.append(pdr);
		result.append(')');
		return result.toString();
	}

} //SiPortImpl
