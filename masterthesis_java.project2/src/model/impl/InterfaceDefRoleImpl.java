/**
 */
package model.impl;

import java.util.Collection;

import model.InterfaceDefPort;
import model.InterfaceDefRole;
import model.InterfaceDefRoleType;
import model.ModelPackage;

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
 *   <li>{@link model.impl.InterfaceDefRoleImpl#getRole <em>Role</em>}</li>
 *   <li>{@link model.impl.InterfaceDefRoleImpl#getSystemGroup <em>System Group</em>}</li>
 *   <li>{@link model.impl.InterfaceDefRoleImpl#getInterfaceDefPort <em>Interface Def Port</em>}</li>
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
	 * This is true if the System Group attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean systemGroupESet;

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
		return ModelPackage.eINSTANCE.getInterfaceDefRole();
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTERFACE_DEF_ROLE__ROLE, oldRole, role));
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
		boolean oldSystemGroupESet = systemGroupESet;
		systemGroupESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTERFACE_DEF_ROLE__SYSTEM_GROUP, oldSystemGroup, systemGroup, !oldSystemGroupESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSystemGroup() {
		String oldSystemGroup = systemGroup;
		boolean oldSystemGroupESet = systemGroupESet;
		systemGroup = SYSTEM_GROUP_EDEFAULT;
		systemGroupESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.INTERFACE_DEF_ROLE__SYSTEM_GROUP, oldSystemGroup, SYSTEM_GROUP_EDEFAULT, oldSystemGroupESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSystemGroup() {
		return systemGroupESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceDefPort> getInterfaceDefPort() {
		if (interfaceDefPort == null) {
			interfaceDefPort = new EObjectContainmentEList<InterfaceDefPort>(InterfaceDefPort.class, this, ModelPackage.INTERFACE_DEF_ROLE__INTERFACE_DEF_PORT);
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
			case ModelPackage.INTERFACE_DEF_ROLE__INTERFACE_DEF_PORT:
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
			case ModelPackage.INTERFACE_DEF_ROLE__ROLE:
				return getRole();
			case ModelPackage.INTERFACE_DEF_ROLE__SYSTEM_GROUP:
				return getSystemGroup();
			case ModelPackage.INTERFACE_DEF_ROLE__INTERFACE_DEF_PORT:
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
			case ModelPackage.INTERFACE_DEF_ROLE__ROLE:
				setRole((InterfaceDefRoleType)newValue);
				return;
			case ModelPackage.INTERFACE_DEF_ROLE__SYSTEM_GROUP:
				setSystemGroup((String)newValue);
				return;
			case ModelPackage.INTERFACE_DEF_ROLE__INTERFACE_DEF_PORT:
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
			case ModelPackage.INTERFACE_DEF_ROLE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case ModelPackage.INTERFACE_DEF_ROLE__SYSTEM_GROUP:
				unsetSystemGroup();
				return;
			case ModelPackage.INTERFACE_DEF_ROLE__INTERFACE_DEF_PORT:
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
			case ModelPackage.INTERFACE_DEF_ROLE__ROLE:
				return role != ROLE_EDEFAULT;
			case ModelPackage.INTERFACE_DEF_ROLE__SYSTEM_GROUP:
				return isSetSystemGroup();
			case ModelPackage.INTERFACE_DEF_ROLE__INTERFACE_DEF_PORT:
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
		result.append(role);
		result.append(", systemGroup: ");
		if (systemGroupESet) result.append(systemGroup); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //InterfaceDefRoleImpl
