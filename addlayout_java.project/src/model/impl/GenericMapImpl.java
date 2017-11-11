/**
 */
package model.impl;

import model.GenericMap;
import model.ModelPackage;
import model.XRefGenericDecl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.GenericMapImpl#getXRefGenericDecl <em>XRef Generic Decl</em>}</li>
 *   <li>{@link model.impl.GenericMapImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericMapImpl extends SingleSourceNodeImpl implements GenericMap {
	/**
	 * The cached value of the '{@link #getXRefGenericDecl() <em>XRef Generic Decl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefGenericDecl()
	 * @generated
	 * @ordered
	 */
	protected XRefGenericDecl xRefGenericDecl;

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
	protected GenericMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getGenericMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefGenericDecl getXRefGenericDecl() {
		return xRefGenericDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefGenericDecl(XRefGenericDecl newXRefGenericDecl, NotificationChain msgs) {
		XRefGenericDecl oldXRefGenericDecl = xRefGenericDecl;
		xRefGenericDecl = newXRefGenericDecl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.GENERIC_MAP__XREF_GENERIC_DECL, oldXRefGenericDecl, newXRefGenericDecl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefGenericDecl(XRefGenericDecl newXRefGenericDecl) {
		if (newXRefGenericDecl != xRefGenericDecl) {
			NotificationChain msgs = null;
			if (xRefGenericDecl != null)
				msgs = ((InternalEObject)xRefGenericDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.GENERIC_MAP__XREF_GENERIC_DECL, null, msgs);
			if (newXRefGenericDecl != null)
				msgs = ((InternalEObject)newXRefGenericDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.GENERIC_MAP__XREF_GENERIC_DECL, null, msgs);
			msgs = basicSetXRefGenericDecl(newXRefGenericDecl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GENERIC_MAP__XREF_GENERIC_DECL, newXRefGenericDecl, newXRefGenericDecl));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GENERIC_MAP__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.GENERIC_MAP__XREF_GENERIC_DECL:
				return basicSetXRefGenericDecl(null, msgs);
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
			case ModelPackage.GENERIC_MAP__XREF_GENERIC_DECL:
				return getXRefGenericDecl();
			case ModelPackage.GENERIC_MAP__VALUE:
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
			case ModelPackage.GENERIC_MAP__XREF_GENERIC_DECL:
				setXRefGenericDecl((XRefGenericDecl)newValue);
				return;
			case ModelPackage.GENERIC_MAP__VALUE:
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
			case ModelPackage.GENERIC_MAP__XREF_GENERIC_DECL:
				setXRefGenericDecl((XRefGenericDecl)null);
				return;
			case ModelPackage.GENERIC_MAP__VALUE:
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
			case ModelPackage.GENERIC_MAP__XREF_GENERIC_DECL:
				return xRefGenericDecl != null;
			case ModelPackage.GENERIC_MAP__VALUE:
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

} //GenericMapImpl
