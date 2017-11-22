/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.InterfaceDefPort;
import Essence.InterfaceDefRole;
import Essence.InterfaceDefRoleType;

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
 * An implementation of the model object '<em><b>Interface Def Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.InterfaceDefRoleImpl#getRole <em>Role</em>}</li>
 *   <li>{@link Essence.impl.InterfaceDefRoleImpl#getSystemGroup <em>System Group</em>}</li>
 *   <li>{@link Essence.impl.InterfaceDefRoleImpl#getInterfaceDefPort <em>Interface Def Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceDefRoleImpl extends SingleSourceNodeImpl implements InterfaceDefRole {
	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final InterfaceDefRoleType ROLE_EDEFAULT = InterfaceDefRoleType.MASTER;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected InterfaceDefRoleType role = ROLE_EDEFAULT;

	/**
	 * This is true if the Role attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean roleESet;

	/**
	 * The default value of the '{@link #getSystemGroup() <em>System Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemGroup() <em>System Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemGroup()
	 * @generated
	 * @ordered
	 */
	protected String systemGroup = SYSTEM_GROUP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterfaceDefPort() <em>Interface Def Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceDefPort()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceDefPort> interfaceDefPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceDefRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getInterfaceDefRole();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDefRoleType getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(InterfaceDefRoleType newRole) {
		InterfaceDefRoleType oldRole = role;
		role = newRole == null ? ROLE_EDEFAULT : newRole;
		boolean oldRoleESet = roleESet;
		roleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.INTERFACE_DEF_ROLE__ROLE, oldRole, role, !oldRoleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRole() {
		InterfaceDefRoleType oldRole = role;
		boolean oldRoleESet = roleESet;
		role = ROLE_EDEFAULT;
		roleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EssencePackage.INTERFACE_DEF_ROLE__ROLE, oldRole, ROLE_EDEFAULT, oldRoleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRole() {
		return roleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemGroup() {
		return systemGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemGroup(String newSystemGroup) {
		String oldSystemGroup = systemGroup;
		systemGroup = newSystemGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.INTERFACE_DEF_ROLE__SYSTEM_GROUP, oldSystemGroup, systemGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceDefPort> getInterfaceDefPort() {
		if (interfaceDefPort == null) {
			interfaceDefPort = new EObjectContainmentEList<InterfaceDefPort>(InterfaceDefPort.class, this, EssencePackage.INTERFACE_DEF_ROLE__INTERFACE_DEF_PORT);
		}
		return interfaceDefPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.INTERFACE_DEF_ROLE__INTERFACE_DEF_PORT:
				return ((InternalEList<?>)getInterfaceDefPort()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.INTERFACE_DEF_ROLE__ROLE:
				return getRole();
			case EssencePackage.INTERFACE_DEF_ROLE__SYSTEM_GROUP:
				return getSystemGroup();
			case EssencePackage.INTERFACE_DEF_ROLE__INTERFACE_DEF_PORT:
				return getInterfaceDefPort();
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
			case EssencePackage.INTERFACE_DEF_ROLE__ROLE:
				setRole((InterfaceDefRoleType)newValue);
				return;
			case EssencePackage.INTERFACE_DEF_ROLE__SYSTEM_GROUP:
				setSystemGroup((String)newValue);
				return;
			case EssencePackage.INTERFACE_DEF_ROLE__INTERFACE_DEF_PORT:
				getInterfaceDefPort().clear();
				getInterfaceDefPort().addAll((Collection<? extends InterfaceDefPort>)newValue);
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
			case EssencePackage.INTERFACE_DEF_ROLE__ROLE:
				unsetRole();
				return;
			case EssencePackage.INTERFACE_DEF_ROLE__SYSTEM_GROUP:
				setSystemGroup(SYSTEM_GROUP_EDEFAULT);
				return;
			case EssencePackage.INTERFACE_DEF_ROLE__INTERFACE_DEF_PORT:
				getInterfaceDefPort().clear();
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
			case EssencePackage.INTERFACE_DEF_ROLE__ROLE:
				return isSetRole();
			case EssencePackage.INTERFACE_DEF_ROLE__SYSTEM_GROUP:
				return SYSTEM_GROUP_EDEFAULT == null ? systemGroup != null : !SYSTEM_GROUP_EDEFAULT.equals(systemGroup);
			case EssencePackage.INTERFACE_DEF_ROLE__INTERFACE_DEF_PORT:
				return interfaceDefPort != null && !interfaceDefPort.isEmpty();
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
		result.append(" (role: ");
		if (roleESet) result.append(role); else result.append("<unset>");
		result.append(", systemGroup: ");
		result.append(systemGroup);
		result.append(')');
		return result.toString();
	}

} //InterfaceDefRoleImpl
