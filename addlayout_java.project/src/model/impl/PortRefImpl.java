/**
 */
package model.impl;

import model.ModelPackage;
import model.PortRef;
import model.XRefRealPort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.PortRefImpl#getXRefLocalPort <em>XRef Local Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortRefImpl extends PortImpl implements PortRef {
	/**
	 * The cached value of the '{@link #getXRefLocalPort() <em>XRef Local Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefLocalPort()
	 * @generated
	 * @ordered
	 */
	protected XRefRealPort xRefLocalPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getPortRef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefRealPort getXRefLocalPort() {
		return xRefLocalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefLocalPort(XRefRealPort newXRefLocalPort, NotificationChain msgs) {
		XRefRealPort oldXRefLocalPort = xRefLocalPort;
		xRefLocalPort = newXRefLocalPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PORT_REF__XREF_LOCAL_PORT, oldXRefLocalPort, newXRefLocalPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefLocalPort(XRefRealPort newXRefLocalPort) {
		if (newXRefLocalPort != xRefLocalPort) {
			NotificationChain msgs = null;
			if (xRefLocalPort != null)
				msgs = ((InternalEObject)xRefLocalPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PORT_REF__XREF_LOCAL_PORT, null, msgs);
			if (newXRefLocalPort != null)
				msgs = ((InternalEObject)newXRefLocalPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PORT_REF__XREF_LOCAL_PORT, null, msgs);
			msgs = basicSetXRefLocalPort(newXRefLocalPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PORT_REF__XREF_LOCAL_PORT, newXRefLocalPort, newXRefLocalPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PORT_REF__XREF_LOCAL_PORT:
				return basicSetXRefLocalPort(null, msgs);
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
			case ModelPackage.PORT_REF__XREF_LOCAL_PORT:
				return getXRefLocalPort();
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
			case ModelPackage.PORT_REF__XREF_LOCAL_PORT:
				setXRefLocalPort((XRefRealPort)newValue);
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
			case ModelPackage.PORT_REF__XREF_LOCAL_PORT:
				setXRefLocalPort((XRefRealPort)null);
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
			case ModelPackage.PORT_REF__XREF_LOCAL_PORT:
				return xRefLocalPort != null;
		}
		return super.eIsSet(featureID);
	}

} //PortRefImpl
