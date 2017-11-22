/**
 */
package Essence.impl;

import Essence.Bus;
import Essence.EssencePackage;
import Essence.NoneInterface;
import Essence.VLNV;

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
 * An implementation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.BusImpl#getExtVLNV <em>Ext VLNV</em>}</li>
 *   <li>{@link Essence.impl.BusImpl#getMaxMasters <em>Max Masters</em>}</li>
 *   <li>{@link Essence.impl.BusImpl#getMaxSlaves <em>Max Slaves</em>}</li>
 *   <li>{@link Essence.impl.BusImpl#getNoneInterface <em>None Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusImpl extends ModelRootImpl implements Bus {
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
	 * The default value of the '{@link #getMaxMasters() <em>Max Masters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMasters()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_MASTERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxMasters() <em>Max Masters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMasters()
	 * @generated
	 * @ordered
	 */
	protected String maxMasters = MAX_MASTERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSlaves() <em>Max Slaves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSlaves()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_SLAVES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxSlaves() <em>Max Slaves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSlaves()
	 * @generated
	 * @ordered
	 */
	protected String maxSlaves = MAX_SLAVES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNoneInterface() <em>None Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoneInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<NoneInterface> noneInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getBus();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.BUS__EXT_VLNV, oldExtVLNV, newExtVLNV);
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
				msgs = ((InternalEObject)extVLNV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.BUS__EXT_VLNV, null, msgs);
			if (newExtVLNV != null)
				msgs = ((InternalEObject)newExtVLNV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.BUS__EXT_VLNV, null, msgs);
			msgs = basicSetExtVLNV(newExtVLNV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.BUS__EXT_VLNV, newExtVLNV, newExtVLNV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxMasters() {
		return maxMasters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxMasters(String newMaxMasters) {
		String oldMaxMasters = maxMasters;
		maxMasters = newMaxMasters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.BUS__MAX_MASTERS, oldMaxMasters, maxMasters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxSlaves() {
		return maxSlaves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSlaves(String newMaxSlaves) {
		String oldMaxSlaves = maxSlaves;
		maxSlaves = newMaxSlaves;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.BUS__MAX_SLAVES, oldMaxSlaves, maxSlaves));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoneInterface> getNoneInterface() {
		if (noneInterface == null) {
			noneInterface = new EObjectContainmentEList<NoneInterface>(NoneInterface.class, this, EssencePackage.BUS__NONE_INTERFACE);
		}
		return noneInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.BUS__EXT_VLNV:
				return basicSetExtVLNV(null, msgs);
			case EssencePackage.BUS__NONE_INTERFACE:
				return ((InternalEList<?>)getNoneInterface()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.BUS__EXT_VLNV:
				return getExtVLNV();
			case EssencePackage.BUS__MAX_MASTERS:
				return getMaxMasters();
			case EssencePackage.BUS__MAX_SLAVES:
				return getMaxSlaves();
			case EssencePackage.BUS__NONE_INTERFACE:
				return getNoneInterface();
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
			case EssencePackage.BUS__EXT_VLNV:
				setExtVLNV((VLNV)newValue);
				return;
			case EssencePackage.BUS__MAX_MASTERS:
				setMaxMasters((String)newValue);
				return;
			case EssencePackage.BUS__MAX_SLAVES:
				setMaxSlaves((String)newValue);
				return;
			case EssencePackage.BUS__NONE_INTERFACE:
				getNoneInterface().clear();
				getNoneInterface().addAll((Collection<? extends NoneInterface>)newValue);
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
			case EssencePackage.BUS__EXT_VLNV:
				setExtVLNV((VLNV)null);
				return;
			case EssencePackage.BUS__MAX_MASTERS:
				setMaxMasters(MAX_MASTERS_EDEFAULT);
				return;
			case EssencePackage.BUS__MAX_SLAVES:
				setMaxSlaves(MAX_SLAVES_EDEFAULT);
				return;
			case EssencePackage.BUS__NONE_INTERFACE:
				getNoneInterface().clear();
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
			case EssencePackage.BUS__EXT_VLNV:
				return extVLNV != null;
			case EssencePackage.BUS__MAX_MASTERS:
				return MAX_MASTERS_EDEFAULT == null ? maxMasters != null : !MAX_MASTERS_EDEFAULT.equals(maxMasters);
			case EssencePackage.BUS__MAX_SLAVES:
				return MAX_SLAVES_EDEFAULT == null ? maxSlaves != null : !MAX_SLAVES_EDEFAULT.equals(maxSlaves);
			case EssencePackage.BUS__NONE_INTERFACE:
				return noneInterface != null && !noneInterface.isEmpty();
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
		result.append(" (maxMasters: ");
		result.append(maxMasters);
		result.append(", maxSlaves: ");
		result.append(maxSlaves);
		result.append(')');
		return result.toString();
	}

} //BusImpl
