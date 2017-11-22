/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.InstanceShellInterfaceMap;
import Essence.InstanceShellPortMap;
import Essence.XRefConnection;
import Essence.XRefIndInterface;

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
 * An implementation of the model object '<em><b>Instance Shell Interface Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.InstanceShellInterfaceMapImpl#getXRefInstanceShellInterface <em>XRef Instance Shell Interface</em>}</li>
 *   <li>{@link Essence.impl.InstanceShellInterfaceMapImpl#getXRefConnection <em>XRef Connection</em>}</li>
 *   <li>{@link Essence.impl.InstanceShellInterfaceMapImpl#getInstanceShellPortMap <em>Instance Shell Port Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceShellInterfaceMapImpl extends SingleSourceNodeImpl implements InstanceShellInterfaceMap {
	/**
	 * The cached value of the '{@link #getXRefInstanceShellInterface() <em>XRef Instance Shell Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefInstanceShellInterface()
	 * @generated
	 * @ordered
	 */
	protected XRefIndInterface xRefInstanceShellInterface;

	/**
	 * The cached value of the '{@link #getXRefConnection() <em>XRef Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefConnection()
	 * @generated
	 * @ordered
	 */
	protected XRefConnection xRefConnection;

	/**
	 * The cached value of the '{@link #getInstanceShellPortMap() <em>Instance Shell Port Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceShellPortMap()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanceShellPortMap> instanceShellPortMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceShellInterfaceMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getInstanceShellInterfaceMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefIndInterface getXRefInstanceShellInterface() {
		return xRefInstanceShellInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefInstanceShellInterface(XRefIndInterface newXRefInstanceShellInterface, NotificationChain msgs) {
		XRefIndInterface oldXRefInstanceShellInterface = xRefInstanceShellInterface;
		xRefInstanceShellInterface = newXRefInstanceShellInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__XREF_INSTANCE_SHELL_INTERFACE, oldXRefInstanceShellInterface, newXRefInstanceShellInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefInstanceShellInterface(XRefIndInterface newXRefInstanceShellInterface) {
		if (newXRefInstanceShellInterface != xRefInstanceShellInterface) {
			NotificationChain msgs = null;
			if (xRefInstanceShellInterface != null)
				msgs = ((InternalEObject)xRefInstanceShellInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__XREF_INSTANCE_SHELL_INTERFACE, null, msgs);
			if (newXRefInstanceShellInterface != null)
				msgs = ((InternalEObject)newXRefInstanceShellInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__XREF_INSTANCE_SHELL_INTERFACE, null, msgs);
			msgs = basicSetXRefInstanceShellInterface(newXRefInstanceShellInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__XREF_INSTANCE_SHELL_INTERFACE, newXRefInstanceShellInterface, newXRefInstanceShellInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefConnection getXRefConnection() {
		return xRefConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefConnection(XRefConnection newXRefConnection, NotificationChain msgs) {
		XRefConnection oldXRefConnection = xRefConnection;
		xRefConnection = newXRefConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__XREF_CONNECTION, oldXRefConnection, newXRefConnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefConnection(XRefConnection newXRefConnection) {
		if (newXRefConnection != xRefConnection) {
			NotificationChain msgs = null;
			if (xRefConnection != null)
				msgs = ((InternalEObject)xRefConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__XREF_CONNECTION, null, msgs);
			if (newXRefConnection != null)
				msgs = ((InternalEObject)newXRefConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__XREF_CONNECTION, null, msgs);
			msgs = basicSetXRefConnection(newXRefConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__XREF_CONNECTION, newXRefConnection, newXRefConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstanceShellPortMap> getInstanceShellPortMap() {
		if (instanceShellPortMap == null) {
			instanceShellPortMap = new EObjectContainmentEList<InstanceShellPortMap>(InstanceShellPortMap.class, this, EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__INSTANCE_SHELL_PORT_MAP);
		}
		return instanceShellPortMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__XREF_INSTANCE_SHELL_INTERFACE:
				return basicSetXRefInstanceShellInterface(null, msgs);
			case EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__XREF_CONNECTION:
				return basicSetXRefConnection(null, msgs);
			case EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__INSTANCE_SHELL_PORT_MAP:
				return ((InternalEList<?>)getInstanceShellPortMap()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__XREF_INSTANCE_SHELL_INTERFACE:
				return getXRefInstanceShellInterface();
			case EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__XREF_CONNECTION:
				return getXRefConnection();
			case EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__INSTANCE_SHELL_PORT_MAP:
				return getInstanceShellPortMap();
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
			case EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__XREF_INSTANCE_SHELL_INTERFACE:
				setXRefInstanceShellInterface((XRefIndInterface)newValue);
				return;
			case EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__XREF_CONNECTION:
				setXRefConnection((XRefConnection)newValue);
				return;
			case EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__INSTANCE_SHELL_PORT_MAP:
				getInstanceShellPortMap().clear();
				getInstanceShellPortMap().addAll((Collection<? extends InstanceShellPortMap>)newValue);
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
			case EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__XREF_INSTANCE_SHELL_INTERFACE:
				setXRefInstanceShellInterface((XRefIndInterface)null);
				return;
			case EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__XREF_CONNECTION:
				setXRefConnection((XRefConnection)null);
				return;
			case EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__INSTANCE_SHELL_PORT_MAP:
				getInstanceShellPortMap().clear();
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
			case EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__XREF_INSTANCE_SHELL_INTERFACE:
				return xRefInstanceShellInterface != null;
			case EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__XREF_CONNECTION:
				return xRefConnection != null;
			case EssencePackage.INSTANCE_SHELL_INTERFACE_MAP__INSTANCE_SHELL_PORT_MAP:
				return instanceShellPortMap != null && !instanceShellPortMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstanceShellInterfaceMapImpl
