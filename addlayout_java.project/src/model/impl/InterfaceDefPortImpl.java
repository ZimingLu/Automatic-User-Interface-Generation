/**
 */
package model.impl;

import model.InterfaceDefPort;
import model.ModelPackage;
import model.PortDirection;
import model.XRefInternalSignal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Def Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.InterfaceDefPortImpl#getXRefSignal <em>XRef Signal</em>}</li>
 *   <li>{@link model.impl.InterfaceDefPortImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InterfaceDefPortImpl extends GeneralPortImpl implements InterfaceDefPort {
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
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final PortDirection DIRECTION_EDEFAULT = PortDirection.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected PortDirection direction = DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceDefPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getInterfaceDefPort();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.INTERFACE_DEF_PORT__XREF_SIGNAL, oldXRefSignal, newXRefSignal);
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
				msgs = ((InternalEObject)xRefSignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.INTERFACE_DEF_PORT__XREF_SIGNAL, null, msgs);
			if (newXRefSignal != null)
				msgs = ((InternalEObject)newXRefSignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.INTERFACE_DEF_PORT__XREF_SIGNAL, null, msgs);
			msgs = basicSetXRefSignal(newXRefSignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTERFACE_DEF_PORT__XREF_SIGNAL, newXRefSignal, newXRefSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDirection getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(PortDirection newDirection) {
		PortDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTERFACE_DEF_PORT__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.INTERFACE_DEF_PORT__XREF_SIGNAL:
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
			case ModelPackage.INTERFACE_DEF_PORT__XREF_SIGNAL:
				return getXRefSignal();
			case ModelPackage.INTERFACE_DEF_PORT__DIRECTION:
				return getDirection();
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
			case ModelPackage.INTERFACE_DEF_PORT__XREF_SIGNAL:
				setXRefSignal((XRefInternalSignal)newValue);
				return;
			case ModelPackage.INTERFACE_DEF_PORT__DIRECTION:
				setDirection((PortDirection)newValue);
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
			case ModelPackage.INTERFACE_DEF_PORT__XREF_SIGNAL:
				setXRefSignal((XRefInternalSignal)null);
				return;
			case ModelPackage.INTERFACE_DEF_PORT__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
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
			case ModelPackage.INTERFACE_DEF_PORT__XREF_SIGNAL:
				return xRefSignal != null;
			case ModelPackage.INTERFACE_DEF_PORT__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
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
		result.append(" (direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //InterfaceDefPortImpl
