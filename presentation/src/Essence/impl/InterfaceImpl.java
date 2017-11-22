/**
 */
package Essence.impl;

import Essence.AddressBlock;
import Essence.EssencePackage;
import Essence.Interface;
import Essence.InterfaceRoleType;
import Essence.VLNV;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.InterfaceImpl#getAddressUnit <em>Address Unit</em>}</li>
 *   <li>{@link Essence.impl.InterfaceImpl#getDataUnit <em>Data Unit</em>}</li>
 *   <li>{@link Essence.impl.InterfaceImpl#getBaseAddress <em>Base Address</em>}</li>
 *   <li>{@link Essence.impl.InterfaceImpl#getExtVLNV <em>Ext VLNV</em>}</li>
 *   <li>{@link Essence.impl.InterfaceImpl#getRange <em>Range</em>}</li>
 *   <li>{@link Essence.impl.InterfaceImpl#getRole <em>Role</em>}</li>
 *   <li>{@link Essence.impl.InterfaceImpl#getSystemGroup <em>System Group</em>}</li>
 *   <li>{@link Essence.impl.InterfaceImpl#getAddressBlock <em>Address Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends GeneralInterfaceImpl implements Interface {
	/**
	 * The default value of the '{@link #getAddressUnit() <em>Address Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressUnit() <em>Address Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressUnit()
	 * @generated
	 * @ordered
	 */
	protected String addressUnit = ADDRESS_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataUnit() <em>Data Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataUnit() <em>Data Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataUnit()
	 * @generated
	 * @ordered
	 */
	protected String dataUnit = DATA_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseAddress() <em>Base Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseAddress() <em>Base Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseAddress()
	 * @generated
	 * @ordered
	 */
	protected String baseAddress = BASE_ADDRESS_EDEFAULT;

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
	 * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected static final String RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected String range = RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final InterfaceRoleType ROLE_EDEFAULT = InterfaceRoleType.MASTER;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected InterfaceRoleType role = ROLE_EDEFAULT;

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
	 * The cached value of the '{@link #getAddressBlock() <em>Address Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressBlock()
	 * @generated
	 * @ordered
	 */
	protected AddressBlock addressBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddressUnit() {
		return addressUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressUnit(String newAddressUnit) {
		String oldAddressUnit = addressUnit;
		addressUnit = newAddressUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.INTERFACE__ADDRESS_UNIT, oldAddressUnit, addressUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataUnit() {
		return dataUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataUnit(String newDataUnit) {
		String oldDataUnit = dataUnit;
		dataUnit = newDataUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.INTERFACE__DATA_UNIT, oldDataUnit, dataUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseAddress() {
		return baseAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseAddress(String newBaseAddress) {
		String oldBaseAddress = baseAddress;
		baseAddress = newBaseAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.INTERFACE__BASE_ADDRESS, oldBaseAddress, baseAddress));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.INTERFACE__EXT_VLNV, oldExtVLNV, newExtVLNV);
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
				msgs = ((InternalEObject)extVLNV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.INTERFACE__EXT_VLNV, null, msgs);
			if (newExtVLNV != null)
				msgs = ((InternalEObject)newExtVLNV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.INTERFACE__EXT_VLNV, null, msgs);
			msgs = basicSetExtVLNV(newExtVLNV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.INTERFACE__EXT_VLNV, newExtVLNV, newExtVLNV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(String newRange) {
		String oldRange = range;
		range = newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.INTERFACE__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRoleType getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(InterfaceRoleType newRole) {
		InterfaceRoleType oldRole = role;
		role = newRole == null ? ROLE_EDEFAULT : newRole;
		boolean oldRoleESet = roleESet;
		roleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.INTERFACE__ROLE, oldRole, role, !oldRoleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRole() {
		InterfaceRoleType oldRole = role;
		boolean oldRoleESet = roleESet;
		role = ROLE_EDEFAULT;
		roleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EssencePackage.INTERFACE__ROLE, oldRole, ROLE_EDEFAULT, oldRoleESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.INTERFACE__SYSTEM_GROUP, oldSystemGroup, systemGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressBlock getAddressBlock() {
		return addressBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressBlock(AddressBlock newAddressBlock, NotificationChain msgs) {
		AddressBlock oldAddressBlock = addressBlock;
		addressBlock = newAddressBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.INTERFACE__ADDRESS_BLOCK, oldAddressBlock, newAddressBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressBlock(AddressBlock newAddressBlock) {
		if (newAddressBlock != addressBlock) {
			NotificationChain msgs = null;
			if (addressBlock != null)
				msgs = ((InternalEObject)addressBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.INTERFACE__ADDRESS_BLOCK, null, msgs);
			if (newAddressBlock != null)
				msgs = ((InternalEObject)newAddressBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.INTERFACE__ADDRESS_BLOCK, null, msgs);
			msgs = basicSetAddressBlock(newAddressBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.INTERFACE__ADDRESS_BLOCK, newAddressBlock, newAddressBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.INTERFACE__EXT_VLNV:
				return basicSetExtVLNV(null, msgs);
			case EssencePackage.INTERFACE__ADDRESS_BLOCK:
				return basicSetAddressBlock(null, msgs);
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
			case EssencePackage.INTERFACE__ADDRESS_UNIT:
				return getAddressUnit();
			case EssencePackage.INTERFACE__DATA_UNIT:
				return getDataUnit();
			case EssencePackage.INTERFACE__BASE_ADDRESS:
				return getBaseAddress();
			case EssencePackage.INTERFACE__EXT_VLNV:
				return getExtVLNV();
			case EssencePackage.INTERFACE__RANGE:
				return getRange();
			case EssencePackage.INTERFACE__ROLE:
				return getRole();
			case EssencePackage.INTERFACE__SYSTEM_GROUP:
				return getSystemGroup();
			case EssencePackage.INTERFACE__ADDRESS_BLOCK:
				return getAddressBlock();
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
			case EssencePackage.INTERFACE__ADDRESS_UNIT:
				setAddressUnit((String)newValue);
				return;
			case EssencePackage.INTERFACE__DATA_UNIT:
				setDataUnit((String)newValue);
				return;
			case EssencePackage.INTERFACE__BASE_ADDRESS:
				setBaseAddress((String)newValue);
				return;
			case EssencePackage.INTERFACE__EXT_VLNV:
				setExtVLNV((VLNV)newValue);
				return;
			case EssencePackage.INTERFACE__RANGE:
				setRange((String)newValue);
				return;
			case EssencePackage.INTERFACE__ROLE:
				setRole((InterfaceRoleType)newValue);
				return;
			case EssencePackage.INTERFACE__SYSTEM_GROUP:
				setSystemGroup((String)newValue);
				return;
			case EssencePackage.INTERFACE__ADDRESS_BLOCK:
				setAddressBlock((AddressBlock)newValue);
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
			case EssencePackage.INTERFACE__ADDRESS_UNIT:
				setAddressUnit(ADDRESS_UNIT_EDEFAULT);
				return;
			case EssencePackage.INTERFACE__DATA_UNIT:
				setDataUnit(DATA_UNIT_EDEFAULT);
				return;
			case EssencePackage.INTERFACE__BASE_ADDRESS:
				setBaseAddress(BASE_ADDRESS_EDEFAULT);
				return;
			case EssencePackage.INTERFACE__EXT_VLNV:
				setExtVLNV((VLNV)null);
				return;
			case EssencePackage.INTERFACE__RANGE:
				setRange(RANGE_EDEFAULT);
				return;
			case EssencePackage.INTERFACE__ROLE:
				unsetRole();
				return;
			case EssencePackage.INTERFACE__SYSTEM_GROUP:
				setSystemGroup(SYSTEM_GROUP_EDEFAULT);
				return;
			case EssencePackage.INTERFACE__ADDRESS_BLOCK:
				setAddressBlock((AddressBlock)null);
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
			case EssencePackage.INTERFACE__ADDRESS_UNIT:
				return ADDRESS_UNIT_EDEFAULT == null ? addressUnit != null : !ADDRESS_UNIT_EDEFAULT.equals(addressUnit);
			case EssencePackage.INTERFACE__DATA_UNIT:
				return DATA_UNIT_EDEFAULT == null ? dataUnit != null : !DATA_UNIT_EDEFAULT.equals(dataUnit);
			case EssencePackage.INTERFACE__BASE_ADDRESS:
				return BASE_ADDRESS_EDEFAULT == null ? baseAddress != null : !BASE_ADDRESS_EDEFAULT.equals(baseAddress);
			case EssencePackage.INTERFACE__EXT_VLNV:
				return extVLNV != null;
			case EssencePackage.INTERFACE__RANGE:
				return RANGE_EDEFAULT == null ? range != null : !RANGE_EDEFAULT.equals(range);
			case EssencePackage.INTERFACE__ROLE:
				return isSetRole();
			case EssencePackage.INTERFACE__SYSTEM_GROUP:
				return SYSTEM_GROUP_EDEFAULT == null ? systemGroup != null : !SYSTEM_GROUP_EDEFAULT.equals(systemGroup);
			case EssencePackage.INTERFACE__ADDRESS_BLOCK:
				return addressBlock != null;
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
		result.append(" (addressUnit: ");
		result.append(addressUnit);
		result.append(", dataUnit: ");
		result.append(dataUnit);
		result.append(", baseAddress: ");
		result.append(baseAddress);
		result.append(", range: ");
		result.append(range);
		result.append(", role: ");
		if (roleESet) result.append(role); else result.append("<unset>");
		result.append(", systemGroup: ");
		result.append(systemGroup);
		result.append(')');
		return result.toString();
	}

} //InterfaceImpl
