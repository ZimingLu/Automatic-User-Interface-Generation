/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.ShellInterfaceMap;
import Essence.ShellPortMap;
import Essence.XRefConnection;
import Essence.XRefExternalInterface;

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
 * An implementation of the model object '<em><b>Shell Interface Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.ShellInterfaceMapImpl#getXRefShellInterface <em>XRef Shell Interface</em>}</li>
 *   <li>{@link Essence.impl.ShellInterfaceMapImpl#getXRefConnection <em>XRef Connection</em>}</li>
 *   <li>{@link Essence.impl.ShellInterfaceMapImpl#getShellPortMap <em>Shell Port Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShellInterfaceMapImpl extends SingleSourceNodeImpl implements ShellInterfaceMap {
	/**
	 * The cached value of the '{@link #getXRefShellInterface() <em>XRef Shell Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefShellInterface()
	 * @generated
	 * @ordered
	 */
	protected XRefExternalInterface xRefShellInterface;

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
	 * The cached value of the '{@link #getShellPortMap() <em>Shell Port Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShellPortMap()
	 * @generated
	 * @ordered
	 */
	protected EList<ShellPortMap> shellPortMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShellInterfaceMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getShellInterfaceMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefExternalInterface getXRefShellInterface() {
		return xRefShellInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefShellInterface(XRefExternalInterface newXRefShellInterface, NotificationChain msgs) {
		XRefExternalInterface oldXRefShellInterface = xRefShellInterface;
		xRefShellInterface = newXRefShellInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.SHELL_INTERFACE_MAP__XREF_SHELL_INTERFACE, oldXRefShellInterface, newXRefShellInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefShellInterface(XRefExternalInterface newXRefShellInterface) {
		if (newXRefShellInterface != xRefShellInterface) {
			NotificationChain msgs = null;
			if (xRefShellInterface != null)
				msgs = ((InternalEObject)xRefShellInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.SHELL_INTERFACE_MAP__XREF_SHELL_INTERFACE, null, msgs);
			if (newXRefShellInterface != null)
				msgs = ((InternalEObject)newXRefShellInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.SHELL_INTERFACE_MAP__XREF_SHELL_INTERFACE, null, msgs);
			msgs = basicSetXRefShellInterface(newXRefShellInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SHELL_INTERFACE_MAP__XREF_SHELL_INTERFACE, newXRefShellInterface, newXRefShellInterface));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.SHELL_INTERFACE_MAP__XREF_CONNECTION, oldXRefConnection, newXRefConnection);
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
				msgs = ((InternalEObject)xRefConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.SHELL_INTERFACE_MAP__XREF_CONNECTION, null, msgs);
			if (newXRefConnection != null)
				msgs = ((InternalEObject)newXRefConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.SHELL_INTERFACE_MAP__XREF_CONNECTION, null, msgs);
			msgs = basicSetXRefConnection(newXRefConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SHELL_INTERFACE_MAP__XREF_CONNECTION, newXRefConnection, newXRefConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ShellPortMap> getShellPortMap() {
		if (shellPortMap == null) {
			shellPortMap = new EObjectContainmentEList<ShellPortMap>(ShellPortMap.class, this, EssencePackage.SHELL_INTERFACE_MAP__SHELL_PORT_MAP);
		}
		return shellPortMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.SHELL_INTERFACE_MAP__XREF_SHELL_INTERFACE:
				return basicSetXRefShellInterface(null, msgs);
			case EssencePackage.SHELL_INTERFACE_MAP__XREF_CONNECTION:
				return basicSetXRefConnection(null, msgs);
			case EssencePackage.SHELL_INTERFACE_MAP__SHELL_PORT_MAP:
				return ((InternalEList<?>)getShellPortMap()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.SHELL_INTERFACE_MAP__XREF_SHELL_INTERFACE:
				return getXRefShellInterface();
			case EssencePackage.SHELL_INTERFACE_MAP__XREF_CONNECTION:
				return getXRefConnection();
			case EssencePackage.SHELL_INTERFACE_MAP__SHELL_PORT_MAP:
				return getShellPortMap();
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
			case EssencePackage.SHELL_INTERFACE_MAP__XREF_SHELL_INTERFACE:
				setXRefShellInterface((XRefExternalInterface)newValue);
				return;
			case EssencePackage.SHELL_INTERFACE_MAP__XREF_CONNECTION:
				setXRefConnection((XRefConnection)newValue);
				return;
			case EssencePackage.SHELL_INTERFACE_MAP__SHELL_PORT_MAP:
				getShellPortMap().clear();
				getShellPortMap().addAll((Collection<? extends ShellPortMap>)newValue);
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
			case EssencePackage.SHELL_INTERFACE_MAP__XREF_SHELL_INTERFACE:
				setXRefShellInterface((XRefExternalInterface)null);
				return;
			case EssencePackage.SHELL_INTERFACE_MAP__XREF_CONNECTION:
				setXRefConnection((XRefConnection)null);
				return;
			case EssencePackage.SHELL_INTERFACE_MAP__SHELL_PORT_MAP:
				getShellPortMap().clear();
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
			case EssencePackage.SHELL_INTERFACE_MAP__XREF_SHELL_INTERFACE:
				return xRefShellInterface != null;
			case EssencePackage.SHELL_INTERFACE_MAP__XREF_CONNECTION:
				return xRefConnection != null;
			case EssencePackage.SHELL_INTERFACE_MAP__SHELL_PORT_MAP:
				return shellPortMap != null && !shellPortMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ShellInterfaceMapImpl
