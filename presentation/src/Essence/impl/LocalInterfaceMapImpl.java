/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.LocalInterfaceMap;
import Essence.LocalPortMap;
import Essence.XRefConnection;
import Essence.XRefInternalInterface;

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
 * An implementation of the model object '<em><b>Local Interface Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.LocalInterfaceMapImpl#getXRefLocalInterface <em>XRef Local Interface</em>}</li>
 *   <li>{@link Essence.impl.LocalInterfaceMapImpl#getXRefConnection <em>XRef Connection</em>}</li>
 *   <li>{@link Essence.impl.LocalInterfaceMapImpl#getLocalPortMap <em>Local Port Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalInterfaceMapImpl extends SingleSourceNodeImpl implements LocalInterfaceMap {
	/**
	 * The cached value of the '{@link #getXRefLocalInterface() <em>XRef Local Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefLocalInterface()
	 * @generated
	 * @ordered
	 */
	protected XRefInternalInterface xRefLocalInterface;

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
	 * The cached value of the '{@link #getLocalPortMap() <em>Local Port Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPortMap()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalPortMap> localPortMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalInterfaceMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getLocalInterfaceMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefInternalInterface getXRefLocalInterface() {
		return xRefLocalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefLocalInterface(XRefInternalInterface newXRefLocalInterface, NotificationChain msgs) {
		XRefInternalInterface oldXRefLocalInterface = xRefLocalInterface;
		xRefLocalInterface = newXRefLocalInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.LOCAL_INTERFACE_MAP__XREF_LOCAL_INTERFACE, oldXRefLocalInterface, newXRefLocalInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefLocalInterface(XRefInternalInterface newXRefLocalInterface) {
		if (newXRefLocalInterface != xRefLocalInterface) {
			NotificationChain msgs = null;
			if (xRefLocalInterface != null)
				msgs = ((InternalEObject)xRefLocalInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.LOCAL_INTERFACE_MAP__XREF_LOCAL_INTERFACE, null, msgs);
			if (newXRefLocalInterface != null)
				msgs = ((InternalEObject)newXRefLocalInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.LOCAL_INTERFACE_MAP__XREF_LOCAL_INTERFACE, null, msgs);
			msgs = basicSetXRefLocalInterface(newXRefLocalInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.LOCAL_INTERFACE_MAP__XREF_LOCAL_INTERFACE, newXRefLocalInterface, newXRefLocalInterface));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.LOCAL_INTERFACE_MAP__XREF_CONNECTION, oldXRefConnection, newXRefConnection);
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
				msgs = ((InternalEObject)xRefConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.LOCAL_INTERFACE_MAP__XREF_CONNECTION, null, msgs);
			if (newXRefConnection != null)
				msgs = ((InternalEObject)newXRefConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.LOCAL_INTERFACE_MAP__XREF_CONNECTION, null, msgs);
			msgs = basicSetXRefConnection(newXRefConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.LOCAL_INTERFACE_MAP__XREF_CONNECTION, newXRefConnection, newXRefConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalPortMap> getLocalPortMap() {
		if (localPortMap == null) {
			localPortMap = new EObjectContainmentEList<LocalPortMap>(LocalPortMap.class, this, EssencePackage.LOCAL_INTERFACE_MAP__LOCAL_PORT_MAP);
		}
		return localPortMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.LOCAL_INTERFACE_MAP__XREF_LOCAL_INTERFACE:
				return basicSetXRefLocalInterface(null, msgs);
			case EssencePackage.LOCAL_INTERFACE_MAP__XREF_CONNECTION:
				return basicSetXRefConnection(null, msgs);
			case EssencePackage.LOCAL_INTERFACE_MAP__LOCAL_PORT_MAP:
				return ((InternalEList<?>)getLocalPortMap()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.LOCAL_INTERFACE_MAP__XREF_LOCAL_INTERFACE:
				return getXRefLocalInterface();
			case EssencePackage.LOCAL_INTERFACE_MAP__XREF_CONNECTION:
				return getXRefConnection();
			case EssencePackage.LOCAL_INTERFACE_MAP__LOCAL_PORT_MAP:
				return getLocalPortMap();
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
			case EssencePackage.LOCAL_INTERFACE_MAP__XREF_LOCAL_INTERFACE:
				setXRefLocalInterface((XRefInternalInterface)newValue);
				return;
			case EssencePackage.LOCAL_INTERFACE_MAP__XREF_CONNECTION:
				setXRefConnection((XRefConnection)newValue);
				return;
			case EssencePackage.LOCAL_INTERFACE_MAP__LOCAL_PORT_MAP:
				getLocalPortMap().clear();
				getLocalPortMap().addAll((Collection<? extends LocalPortMap>)newValue);
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
			case EssencePackage.LOCAL_INTERFACE_MAP__XREF_LOCAL_INTERFACE:
				setXRefLocalInterface((XRefInternalInterface)null);
				return;
			case EssencePackage.LOCAL_INTERFACE_MAP__XREF_CONNECTION:
				setXRefConnection((XRefConnection)null);
				return;
			case EssencePackage.LOCAL_INTERFACE_MAP__LOCAL_PORT_MAP:
				getLocalPortMap().clear();
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
			case EssencePackage.LOCAL_INTERFACE_MAP__XREF_LOCAL_INTERFACE:
				return xRefLocalInterface != null;
			case EssencePackage.LOCAL_INTERFACE_MAP__XREF_CONNECTION:
				return xRefConnection != null;
			case EssencePackage.LOCAL_INTERFACE_MAP__LOCAL_PORT_MAP:
				return localPortMap != null && !localPortMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LocalInterfaceMapImpl
