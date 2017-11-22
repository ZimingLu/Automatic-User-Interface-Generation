/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.ParamMap;
import Essence.XRefParamDecl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.ParamMapImpl#getXRefParamDecl <em>XRef Param Decl</em>}</li>
 *   <li>{@link Essence.impl.ParamMapImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParamMapImpl extends SingleSourceNodeImpl implements ParamMap {
	/**
	 * The cached value of the '{@link #getXRefParamDecl() <em>XRef Param Decl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefParamDecl()
	 * @generated
	 * @ordered
	 */
	protected XRefParamDecl xRefParamDecl;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParamMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getParamMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefParamDecl getXRefParamDecl() {
		return xRefParamDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefParamDecl(XRefParamDecl newXRefParamDecl, NotificationChain msgs) {
		XRefParamDecl oldXRefParamDecl = xRefParamDecl;
		xRefParamDecl = newXRefParamDecl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.PARAM_MAP__XREF_PARAM_DECL, oldXRefParamDecl, newXRefParamDecl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefParamDecl(XRefParamDecl newXRefParamDecl) {
		if (newXRefParamDecl != xRefParamDecl) {
			NotificationChain msgs = null;
			if (xRefParamDecl != null)
				msgs = ((InternalEObject)xRefParamDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.PARAM_MAP__XREF_PARAM_DECL, null, msgs);
			if (newXRefParamDecl != null)
				msgs = ((InternalEObject)newXRefParamDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.PARAM_MAP__XREF_PARAM_DECL, null, msgs);
			msgs = basicSetXRefParamDecl(newXRefParamDecl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.PARAM_MAP__XREF_PARAM_DECL, newXRefParamDecl, newXRefParamDecl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.PARAM_MAP__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.PARAM_MAP__XREF_PARAM_DECL:
				return basicSetXRefParamDecl(null, msgs);
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
			case EssencePackage.PARAM_MAP__XREF_PARAM_DECL:
				return getXRefParamDecl();
			case EssencePackage.PARAM_MAP__VALUE:
				return getValue();
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
			case EssencePackage.PARAM_MAP__XREF_PARAM_DECL:
				setXRefParamDecl((XRefParamDecl)newValue);
				return;
			case EssencePackage.PARAM_MAP__VALUE:
				setValue((String)newValue);
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
			case EssencePackage.PARAM_MAP__XREF_PARAM_DECL:
				setXRefParamDecl((XRefParamDecl)null);
				return;
			case EssencePackage.PARAM_MAP__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case EssencePackage.PARAM_MAP__XREF_PARAM_DECL:
				return xRefParamDecl != null;
			case EssencePackage.PARAM_MAP__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ParamMapImpl
