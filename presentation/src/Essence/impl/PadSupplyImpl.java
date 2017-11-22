/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.PadSupply;
import Essence.XRefPowerDomain;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pad Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.PadSupplyImpl#getSpec <em>Spec</em>}</li>
 *   <li>{@link Essence.impl.PadSupplyImpl#getXRefPowerDomain <em>XRef Power Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PadSupplyImpl extends GeneralPadImpl implements PadSupply {
	/**
	 * The default value of the '{@link #getSpec() <em>Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpec()
	 * @generated
	 * @ordered
	 */
	protected static final String SPEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpec() <em>Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpec()
	 * @generated
	 * @ordered
	 */
	protected String spec = SPEC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXRefPowerDomain() <em>XRef Power Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefPowerDomain()
	 * @generated
	 * @ordered
	 */
	protected XRefPowerDomain xRefPowerDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PadSupplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getPadSupply();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpec() {
		return spec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpec(String newSpec) {
		String oldSpec = spec;
		spec = newSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.PAD_SUPPLY__SPEC, oldSpec, spec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefPowerDomain getXRefPowerDomain() {
		return xRefPowerDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefPowerDomain(XRefPowerDomain newXRefPowerDomain, NotificationChain msgs) {
		XRefPowerDomain oldXRefPowerDomain = xRefPowerDomain;
		xRefPowerDomain = newXRefPowerDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.PAD_SUPPLY__XREF_POWER_DOMAIN, oldXRefPowerDomain, newXRefPowerDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefPowerDomain(XRefPowerDomain newXRefPowerDomain) {
		if (newXRefPowerDomain != xRefPowerDomain) {
			NotificationChain msgs = null;
			if (xRefPowerDomain != null)
				msgs = ((InternalEObject)xRefPowerDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.PAD_SUPPLY__XREF_POWER_DOMAIN, null, msgs);
			if (newXRefPowerDomain != null)
				msgs = ((InternalEObject)newXRefPowerDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.PAD_SUPPLY__XREF_POWER_DOMAIN, null, msgs);
			msgs = basicSetXRefPowerDomain(newXRefPowerDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.PAD_SUPPLY__XREF_POWER_DOMAIN, newXRefPowerDomain, newXRefPowerDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.PAD_SUPPLY__XREF_POWER_DOMAIN:
				return basicSetXRefPowerDomain(null, msgs);
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
			case EssencePackage.PAD_SUPPLY__SPEC:
				return getSpec();
			case EssencePackage.PAD_SUPPLY__XREF_POWER_DOMAIN:
				return getXRefPowerDomain();
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
			case EssencePackage.PAD_SUPPLY__SPEC:
				setSpec((String)newValue);
				return;
			case EssencePackage.PAD_SUPPLY__XREF_POWER_DOMAIN:
				setXRefPowerDomain((XRefPowerDomain)newValue);
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
			case EssencePackage.PAD_SUPPLY__SPEC:
				setSpec(SPEC_EDEFAULT);
				return;
			case EssencePackage.PAD_SUPPLY__XREF_POWER_DOMAIN:
				setXRefPowerDomain((XRefPowerDomain)null);
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
			case EssencePackage.PAD_SUPPLY__SPEC:
				return SPEC_EDEFAULT == null ? spec != null : !SPEC_EDEFAULT.equals(spec);
			case EssencePackage.PAD_SUPPLY__XREF_POWER_DOMAIN:
				return xRefPowerDomain != null;
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
		result.append(" (spec: ");
		result.append(spec);
		result.append(')');
		return result.toString();
	}

} //PadSupplyImpl
