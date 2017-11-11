/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import model.DataType;
import model.ModelPackage;
import model.Signal;
import model.XRefDataVar;

import modelextension.DataTypeOwner;
import modelextension.ModelextensionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.SignalImpl#getXRefDefaultValue <em>XRef Default Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SignalImpl extends SingleSourceNodeImpl implements Signal {
	/**
	 * The cached value of the '{@link #getXRefDefaultValue() <em>XRef Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected XRefDataVar xRefDefaultValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getSignal();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefDataVar getXRefDefaultValue() {
		return xRefDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefDefaultValue(XRefDataVar newXRefDefaultValue, NotificationChain msgs) {
		XRefDataVar oldXRefDefaultValue = xRefDefaultValue;
		xRefDefaultValue = newXRefDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SIGNAL__XREF_DEFAULT_VALUE, oldXRefDefaultValue, newXRefDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefDefaultValue(XRefDataVar newXRefDefaultValue) {
		if (newXRefDefaultValue != xRefDefaultValue) {
			NotificationChain msgs = null;
			if (xRefDefaultValue != null)
				msgs = ((InternalEObject)xRefDefaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SIGNAL__XREF_DEFAULT_VALUE, null, msgs);
			if (newXRefDefaultValue != null)
				msgs = ((InternalEObject)newXRefDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SIGNAL__XREF_DEFAULT_VALUE, null, msgs);
			msgs = basicSetXRefDefaultValue(newXRefDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIGNAL__XREF_DEFAULT_VALUE, newXRefDefaultValue, newXRefDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDataType() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SIGNAL__XREF_DEFAULT_VALUE:
				return basicSetXRefDefaultValue(null, msgs);
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
			case ModelPackage.SIGNAL__XREF_DEFAULT_VALUE:
				return getXRefDefaultValue();
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
			case ModelPackage.SIGNAL__XREF_DEFAULT_VALUE:
				setXRefDefaultValue((XRefDataVar)newValue);
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
			case ModelPackage.SIGNAL__XREF_DEFAULT_VALUE:
				setXRefDefaultValue((XRefDataVar)null);
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
			case ModelPackage.SIGNAL__XREF_DEFAULT_VALUE:
				return xRefDefaultValue != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == DataTypeOwner.class) {
			switch (baseOperationID) {
				case ModelextensionPackage.DATA_TYPE_OWNER___GET_DATA_TYPE: return ModelPackage.SIGNAL___GET_DATA_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.SIGNAL___GET_DATA_TYPE:
				return getDataType();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SignalImpl
