/**
 */
package model.impl;

import java.util.Collection;

import model.InstanceInterfaceMap;
import model.InstancePortMap;
import model.ModelPackage;
import model.XRefConnection;
import model.XRefExternalInterface;

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
 * An implementation of the model object '<em><b>Instance Interface Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.InstanceInterfaceMapImpl#getXRefInstanceInterface <em>XRef Instance Interface</em>}</li>
 *   <li>{@link model.impl.InstanceInterfaceMapImpl#getXRefConnection <em>XRef Connection</em>}</li>
 *   <li>{@link model.impl.InstanceInterfaceMapImpl#getInstancePortMap <em>Instance Port Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceInterfaceMapImpl extends SingleSourceNodeImpl implements InstanceInterfaceMap {
	/**
	 * The cached value of the '{@link #getXRefInstanceInterface() <em>XRef Instance Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefInstanceInterface()
	 * @generated
	 * @ordered
	 */
	protected XRefExternalInterface xRefInstanceInterface;

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
	 * The cached value of the '{@link #getInstancePortMap() <em>Instance Port Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstancePortMap()
	 * @generated
	 * @ordered
	 */
	protected EList<InstancePortMap> instancePortMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceInterfaceMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getInstanceInterfaceMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefExternalInterface getXRefInstanceInterface() {
		return xRefInstanceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefInstanceInterface(XRefExternalInterface newXRefInstanceInterface, NotificationChain msgs) {
		XRefExternalInterface oldXRefInstanceInterface = xRefInstanceInterface;
		xRefInstanceInterface = newXRefInstanceInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.INSTANCE_INTERFACE_MAP__XREF_INSTANCE_INTERFACE, oldXRefInstanceInterface, newXRefInstanceInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefInstanceInterface(XRefExternalInterface newXRefInstanceInterface) {
		if (newXRefInstanceInterface != xRefInstanceInterface) {
			NotificationChain msgs = null;
			if (xRefInstanceInterface != null)
				msgs = ((InternalEObject)xRefInstanceInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.INSTANCE_INTERFACE_MAP__XREF_INSTANCE_INTERFACE, null, msgs);
			if (newXRefInstanceInterface != null)
				msgs = ((InternalEObject)newXRefInstanceInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.INSTANCE_INTERFACE_MAP__XREF_INSTANCE_INTERFACE, null, msgs);
			msgs = basicSetXRefInstanceInterface(newXRefInstanceInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INSTANCE_INTERFACE_MAP__XREF_INSTANCE_INTERFACE, newXRefInstanceInterface, newXRefInstanceInterface));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.INSTANCE_INTERFACE_MAP__XREF_CONNECTION, oldXRefConnection, newXRefConnection);
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
				msgs = ((InternalEObject)xRefConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.INSTANCE_INTERFACE_MAP__XREF_CONNECTION, null, msgs);
			if (newXRefConnection != null)
				msgs = ((InternalEObject)newXRefConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.INSTANCE_INTERFACE_MAP__XREF_CONNECTION, null, msgs);
			msgs = basicSetXRefConnection(newXRefConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INSTANCE_INTERFACE_MAP__XREF_CONNECTION, newXRefConnection, newXRefConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstancePortMap> getInstancePortMap() {
		if (instancePortMap == null) {
			instancePortMap = new EObjectContainmentEList<InstancePortMap>(InstancePortMap.class, this, ModelPackage.INSTANCE_INTERFACE_MAP__INSTANCE_PORT_MAP);
		}
		return instancePortMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.INSTANCE_INTERFACE_MAP__XREF_INSTANCE_INTERFACE:
				return basicSetXRefInstanceInterface(null, msgs);
			case ModelPackage.INSTANCE_INTERFACE_MAP__XREF_CONNECTION:
				return basicSetXRefConnection(null, msgs);
			case ModelPackage.INSTANCE_INTERFACE_MAP__INSTANCE_PORT_MAP:
				return ((InternalEList<?>)getInstancePortMap()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.INSTANCE_INTERFACE_MAP__XREF_INSTANCE_INTERFACE:
				return getXRefInstanceInterface();
			case ModelPackage.INSTANCE_INTERFACE_MAP__XREF_CONNECTION:
				return getXRefConnection();
			case ModelPackage.INSTANCE_INTERFACE_MAP__INSTANCE_PORT_MAP:
				return getInstancePortMap();
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
			case ModelPackage.INSTANCE_INTERFACE_MAP__XREF_INSTANCE_INTERFACE:
				setXRefInstanceInterface((XRefExternalInterface)newValue);
				return;
			case ModelPackage.INSTANCE_INTERFACE_MAP__XREF_CONNECTION:
				setXRefConnection((XRefConnection)newValue);
				return;
			case ModelPackage.INSTANCE_INTERFACE_MAP__INSTANCE_PORT_MAP:
				getInstancePortMap().clear();
				getInstancePortMap().addAll((Collection<? extends InstancePortMap>)newValue);
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
			case ModelPackage.INSTANCE_INTERFACE_MAP__XREF_INSTANCE_INTERFACE:
				setXRefInstanceInterface((XRefExternalInterface)null);
				return;
			case ModelPackage.INSTANCE_INTERFACE_MAP__XREF_CONNECTION:
				setXRefConnection((XRefConnection)null);
				return;
			case ModelPackage.INSTANCE_INTERFACE_MAP__INSTANCE_PORT_MAP:
				getInstancePortMap().clear();
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
			case ModelPackage.INSTANCE_INTERFACE_MAP__XREF_INSTANCE_INTERFACE:
				return xRefInstanceInterface != null;
			case ModelPackage.INSTANCE_INTERFACE_MAP__XREF_CONNECTION:
				return xRefConnection != null;
			case ModelPackage.INSTANCE_INTERFACE_MAP__INSTANCE_PORT_MAP:
				return instancePortMap != null && !instancePortMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstanceInterfaceMapImpl
