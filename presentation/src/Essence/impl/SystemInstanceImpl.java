/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.InstanceShellInterfaceMap;
import Essence.SystemInstance;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.SystemInstanceImpl#getInstanceShellInterfaceMap <em>Instance Shell Interface Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemInstanceImpl extends InterfaceInstanceImpl implements SystemInstance {
	/**
	 * The cached value of the '{@link #getInstanceShellInterfaceMap() <em>Instance Shell Interface Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceShellInterfaceMap()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanceShellInterfaceMap> instanceShellInterfaceMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getSystemInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstanceShellInterfaceMap> getInstanceShellInterfaceMap() {
		if (instanceShellInterfaceMap == null) {
			instanceShellInterfaceMap = new EObjectContainmentEList<InstanceShellInterfaceMap>(InstanceShellInterfaceMap.class, this, EssencePackage.SYSTEM_INSTANCE__INSTANCE_SHELL_INTERFACE_MAP);
		}
		return instanceShellInterfaceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.SYSTEM_INSTANCE__INSTANCE_SHELL_INTERFACE_MAP:
				return ((InternalEList<?>)getInstanceShellInterfaceMap()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.SYSTEM_INSTANCE__INSTANCE_SHELL_INTERFACE_MAP:
				return getInstanceShellInterfaceMap();
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
			case EssencePackage.SYSTEM_INSTANCE__INSTANCE_SHELL_INTERFACE_MAP:
				getInstanceShellInterfaceMap().clear();
				getInstanceShellInterfaceMap().addAll((Collection<? extends InstanceShellInterfaceMap>)newValue);
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
			case EssencePackage.SYSTEM_INSTANCE__INSTANCE_SHELL_INTERFACE_MAP:
				getInstanceShellInterfaceMap().clear();
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
			case EssencePackage.SYSTEM_INSTANCE__INSTANCE_SHELL_INTERFACE_MAP:
				return instanceShellInterfaceMap != null && !instanceShellInterfaceMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemInstanceImpl
