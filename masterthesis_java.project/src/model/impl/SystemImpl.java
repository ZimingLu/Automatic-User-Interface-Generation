/**
 */
package model.impl;

import java.util.Collection;

import model.Connection;
import model.Instance;
import model.Interface;
import model.LocalInterfaceMap;
import model.ModelPackage;
import model.ShellInterfaceMap;
import model.VLNV;

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
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.SystemImpl#getExtVLNV <em>Ext VLNV</em>}</li>
 *   <li>{@link model.impl.SystemImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link model.impl.SystemImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link model.impl.SystemImpl#getLocalInterfaceMap <em>Local Interface Map</em>}</li>
 *   <li>{@link model.impl.SystemImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link model.impl.SystemImpl#getShellInterfaceMap <em>Shell Interface Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends ModelRootImpl implements model.System {
	/**
	 * The cached value of the '{@link #getExtVLNV() <em>Ext VLNV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtVLNV()
	 * @generated
	 * @ordered
	 */
	protected VLNV extVLNV;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interface_;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connection;

	/**
	 * The cached value of the '{@link #getLocalInterfaceMap() <em>Local Interface Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalInterfaceMap()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalInterfaceMap> localInterfaceMap;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<Instance> instance;

	/**
	 * The cached value of the '{@link #getShellInterfaceMap() <em>Shell Interface Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShellInterfaceMap()
	 * @generated
	 * @ordered
	 */
	protected EList<ShellInterfaceMap> shellInterfaceMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VLNV getExtVLNV() {
		return extVLNV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtVLNV(VLNV newExtVLNV, NotificationChain msgs) {
		VLNV oldExtVLNV = extVLNV;
		extVLNV = newExtVLNV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SYSTEM__EXT_VLNV, oldExtVLNV, newExtVLNV);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtVLNV(VLNV newExtVLNV) {
		if (newExtVLNV != extVLNV) {
			NotificationChain msgs = null;
			if (extVLNV != null)
				msgs = ((InternalEObject)extVLNV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SYSTEM__EXT_VLNV, null, msgs);
			if (newExtVLNV != null)
				msgs = ((InternalEObject)newExtVLNV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SYSTEM__EXT_VLNV, null, msgs);
			msgs = basicSetExtVLNV(newExtVLNV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SYSTEM__EXT_VLNV, newExtVLNV, newExtVLNV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectContainmentEList<Interface>(Interface.class, this, ModelPackage.SYSTEM__INTERFACE);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentEList<Connection>(Connection.class, this, ModelPackage.SYSTEM__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalInterfaceMap> getLocalInterfaceMap() {
		if (localInterfaceMap == null) {
			localInterfaceMap = new EObjectContainmentEList<LocalInterfaceMap>(LocalInterfaceMap.class, this, ModelPackage.SYSTEM__LOCAL_INTERFACE_MAP);
		}
		return localInterfaceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instance> getInstance() {
		if (instance == null) {
			instance = new EObjectContainmentEList<Instance>(Instance.class, this, ModelPackage.SYSTEM__INSTANCE);
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ShellInterfaceMap> getShellInterfaceMap() {
		if (shellInterfaceMap == null) {
			shellInterfaceMap = new EObjectContainmentEList<ShellInterfaceMap>(ShellInterfaceMap.class, this, ModelPackage.SYSTEM__SHELL_INTERFACE_MAP);
		}
		return shellInterfaceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SYSTEM__EXT_VLNV:
				return basicSetExtVLNV(null, msgs);
			case ModelPackage.SYSTEM__INTERFACE:
				return ((InternalEList<?>)getInterface()).basicRemove(otherEnd, msgs);
			case ModelPackage.SYSTEM__CONNECTION:
				return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
			case ModelPackage.SYSTEM__LOCAL_INTERFACE_MAP:
				return ((InternalEList<?>)getLocalInterfaceMap()).basicRemove(otherEnd, msgs);
			case ModelPackage.SYSTEM__INSTANCE:
				return ((InternalEList<?>)getInstance()).basicRemove(otherEnd, msgs);
			case ModelPackage.SYSTEM__SHELL_INTERFACE_MAP:
				return ((InternalEList<?>)getShellInterfaceMap()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.SYSTEM__EXT_VLNV:
				return getExtVLNV();
			case ModelPackage.SYSTEM__INTERFACE:
				return getInterface();
			case ModelPackage.SYSTEM__CONNECTION:
				return getConnection();
			case ModelPackage.SYSTEM__LOCAL_INTERFACE_MAP:
				return getLocalInterfaceMap();
			case ModelPackage.SYSTEM__INSTANCE:
				return getInstance();
			case ModelPackage.SYSTEM__SHELL_INTERFACE_MAP:
				return getShellInterfaceMap();
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
			case ModelPackage.SYSTEM__EXT_VLNV:
				setExtVLNV((VLNV)newValue);
				return;
			case ModelPackage.SYSTEM__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends Interface>)newValue);
				return;
			case ModelPackage.SYSTEM__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connection>)newValue);
				return;
			case ModelPackage.SYSTEM__LOCAL_INTERFACE_MAP:
				getLocalInterfaceMap().clear();
				getLocalInterfaceMap().addAll((Collection<? extends LocalInterfaceMap>)newValue);
				return;
			case ModelPackage.SYSTEM__INSTANCE:
				getInstance().clear();
				getInstance().addAll((Collection<? extends Instance>)newValue);
				return;
			case ModelPackage.SYSTEM__SHELL_INTERFACE_MAP:
				getShellInterfaceMap().clear();
				getShellInterfaceMap().addAll((Collection<? extends ShellInterfaceMap>)newValue);
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
			case ModelPackage.SYSTEM__EXT_VLNV:
				setExtVLNV((VLNV)null);
				return;
			case ModelPackage.SYSTEM__INTERFACE:
				getInterface().clear();
				return;
			case ModelPackage.SYSTEM__CONNECTION:
				getConnection().clear();
				return;
			case ModelPackage.SYSTEM__LOCAL_INTERFACE_MAP:
				getLocalInterfaceMap().clear();
				return;
			case ModelPackage.SYSTEM__INSTANCE:
				getInstance().clear();
				return;
			case ModelPackage.SYSTEM__SHELL_INTERFACE_MAP:
				getShellInterfaceMap().clear();
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
			case ModelPackage.SYSTEM__EXT_VLNV:
				return extVLNV != null;
			case ModelPackage.SYSTEM__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
			case ModelPackage.SYSTEM__CONNECTION:
				return connection != null && !connection.isEmpty();
			case ModelPackage.SYSTEM__LOCAL_INTERFACE_MAP:
				return localInterfaceMap != null && !localInterfaceMap.isEmpty();
			case ModelPackage.SYSTEM__INSTANCE:
				return instance != null && !instance.isEmpty();
			case ModelPackage.SYSTEM__SHELL_INTERFACE_MAP:
				return shellInterfaceMap != null && !shellInterfaceMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
