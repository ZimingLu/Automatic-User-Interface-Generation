/**
 */
package model.impl;

import model.AddressBlock;
import model.Interface;
import model.InterfaceRoleType;
import model.ModelPackage;
import model.VLNV;

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
 *   <li>{@link model.impl.InterfaceImpl#getAddressUnit <em>Address Unit</em>}</li>
 *   <li>{@link model.impl.InterfaceImpl#getDataUnit <em>Data Unit</em>}</li>
 *   <li>{@link model.impl.InterfaceImpl#getBaseAddress <em>Base Address</em>}</li>
 *   <li>{@link model.impl.InterfaceImpl#getExtVLNV <em>Ext VLNV</em>}</li>
 *   <li>{@link model.impl.InterfaceImpl#getRange <em>Range</em>}</li>
 *   <li>{@link model.impl.InterfaceImpl#getRole <em>Role</em>}</li>
 *   <li>{@link model.impl.InterfaceImpl#getSystemGroup <em>System Group</em>}</li>
 *   <li>{@link model.impl.InterfaceImpl#getAddressBlock <em>Address Block</em>}</li>
 *   <li>{@link model.impl.InterfaceImpl#getExtVLNVName <em>Ext VLNV Name</em>}</li>
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
	 * This is true if the Address Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean addressUnitESet;

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
	 * This is true if the Data Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataUnitESet;

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
	 * This is true if the Base Address attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean baseAddressESet;

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
	 * This is true if the Range attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rangeESet;

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
	 * The cached value of the '{@link #getAddressBlock() <em>Address Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressBlock()
	 * @generated
	 * @ordered
	 */
	protected AddressBlock addressBlock;

	/**
	 * The default value of the '{@link #getExtVLNVName() <em>Ext VLNV Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtVLNVName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXT_VLNV_NAME_EDEFAULT = null;

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
		return ModelPackage.eINSTANCE.getInterface();
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
		boolean oldAddressUnitESet = addressUnitESet;
		addressUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTERFACE__ADDRESS_UNIT, oldAddressUnit, addressUnit, !oldAddressUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAddressUnit() {
		String oldAddressUnit = addressUnit;
		boolean oldAddressUnitESet = addressUnitESet;
		addressUnit = ADDRESS_UNIT_EDEFAULT;
		addressUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.INTERFACE__ADDRESS_UNIT, oldAddressUnit, ADDRESS_UNIT_EDEFAULT, oldAddressUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAddressUnit() {
		return addressUnitESet;
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
		boolean oldDataUnitESet = dataUnitESet;
		dataUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTERFACE__DATA_UNIT, oldDataUnit, dataUnit, !oldDataUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataUnit() {
		String oldDataUnit = dataUnit;
		boolean oldDataUnitESet = dataUnitESet;
		dataUnit = DATA_UNIT_EDEFAULT;
		dataUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.INTERFACE__DATA_UNIT, oldDataUnit, DATA_UNIT_EDEFAULT, oldDataUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataUnit() {
		return dataUnitESet;
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
		boolean oldBaseAddressESet = baseAddressESet;
		baseAddressESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTERFACE__BASE_ADDRESS, oldBaseAddress, baseAddress, !oldBaseAddressESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBaseAddress() {
		String oldBaseAddress = baseAddress;
		boolean oldBaseAddressESet = baseAddressESet;
		baseAddress = BASE_ADDRESS_EDEFAULT;
		baseAddressESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.INTERFACE__BASE_ADDRESS, oldBaseAddress, BASE_ADDRESS_EDEFAULT, oldBaseAddressESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBaseAddress() {
		return baseAddressESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.INTERFACE__EXT_VLNV, oldExtVLNV, newExtVLNV);
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
				msgs = ((InternalEObject)extVLNV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.INTERFACE__EXT_VLNV, null, msgs);
			if (newExtVLNV != null)
				msgs = ((InternalEObject)newExtVLNV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.INTERFACE__EXT_VLNV, null, msgs);
			msgs = basicSetExtVLNV(newExtVLNV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTERFACE__EXT_VLNV, newExtVLNV, newExtVLNV));
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
		boolean oldRangeESet = rangeESet;
		rangeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTERFACE__RANGE, oldRange, range, !oldRangeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRange() {
		String oldRange = range;
		boolean oldRangeESet = rangeESet;
		range = RANGE_EDEFAULT;
		rangeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.INTERFACE__RANGE, oldRange, RANGE_EDEFAULT, oldRangeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRange() {
		return rangeESet;
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTERFACE__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTERFACE__SYSTEM_GROUP, oldSystemGroup, systemGroup, !oldSystemGroupESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.INTERFACE__SYSTEM_GROUP, oldSystemGroup, SYSTEM_GROUP_EDEFAULT, oldSystemGroupESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.INTERFACE__ADDRESS_BLOCK, oldAddressBlock, newAddressBlock);
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
				msgs = ((InternalEObject)addressBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.INTERFACE__ADDRESS_BLOCK, null, msgs);
			if (newAddressBlock != null)
				msgs = ((InternalEObject)newAddressBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.INTERFACE__ADDRESS_BLOCK, null, msgs);
			msgs = basicSetAddressBlock(newAddressBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INTERFACE__ADDRESS_BLOCK, newAddressBlock, newAddressBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtVLNVName() {
		if (this.getExtVLNV() != null &&
		     this.getExtVLNV().getName() != null &&
		    !(this.getExtVLNV().getName().equals(""))) {
			return this.getExtVLNV().getName();
		}
		return "<UNSET>";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.INTERFACE__EXT_VLNV:
				return basicSetExtVLNV(null, msgs);
			case ModelPackage.INTERFACE__ADDRESS_BLOCK:
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
			case ModelPackage.INTERFACE__ADDRESS_UNIT:
				return getAddressUnit();
			case ModelPackage.INTERFACE__DATA_UNIT:
				return getDataUnit();
			case ModelPackage.INTERFACE__BASE_ADDRESS:
				return getBaseAddress();
			case ModelPackage.INTERFACE__EXT_VLNV:
				return getExtVLNV();
			case ModelPackage.INTERFACE__RANGE:
				return getRange();
			case ModelPackage.INTERFACE__ROLE:
				return getRole();
			case ModelPackage.INTERFACE__SYSTEM_GROUP:
				return getSystemGroup();
			case ModelPackage.INTERFACE__ADDRESS_BLOCK:
				return getAddressBlock();
			case ModelPackage.INTERFACE__EXT_VLNV_NAME:
				return getExtVLNVName();
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
			case ModelPackage.INTERFACE__ADDRESS_UNIT:
				setAddressUnit((String)newValue);
				return;
			case ModelPackage.INTERFACE__DATA_UNIT:
				setDataUnit((String)newValue);
				return;
			case ModelPackage.INTERFACE__BASE_ADDRESS:
				setBaseAddress((String)newValue);
				return;
			case ModelPackage.INTERFACE__EXT_VLNV:
				setExtVLNV((VLNV)newValue);
				return;
			case ModelPackage.INTERFACE__RANGE:
				setRange((String)newValue);
				return;
			case ModelPackage.INTERFACE__ROLE:
				setRole((InterfaceRoleType)newValue);
				return;
			case ModelPackage.INTERFACE__SYSTEM_GROUP:
				setSystemGroup((String)newValue);
				return;
			case ModelPackage.INTERFACE__ADDRESS_BLOCK:
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
			case ModelPackage.INTERFACE__ADDRESS_UNIT:
				unsetAddressUnit();
				return;
			case ModelPackage.INTERFACE__DATA_UNIT:
				unsetDataUnit();
				return;
			case ModelPackage.INTERFACE__BASE_ADDRESS:
				unsetBaseAddress();
				return;
			case ModelPackage.INTERFACE__EXT_VLNV:
				setExtVLNV((VLNV)null);
				return;
			case ModelPackage.INTERFACE__RANGE:
				unsetRange();
				return;
			case ModelPackage.INTERFACE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case ModelPackage.INTERFACE__SYSTEM_GROUP:
				unsetSystemGroup();
				return;
			case ModelPackage.INTERFACE__ADDRESS_BLOCK:
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
			case ModelPackage.INTERFACE__ADDRESS_UNIT:
				return isSetAddressUnit();
			case ModelPackage.INTERFACE__DATA_UNIT:
				return isSetDataUnit();
			case ModelPackage.INTERFACE__BASE_ADDRESS:
				return isSetBaseAddress();
			case ModelPackage.INTERFACE__EXT_VLNV:
				return extVLNV != null;
			case ModelPackage.INTERFACE__RANGE:
				return isSetRange();
			case ModelPackage.INTERFACE__ROLE:
				return role != ROLE_EDEFAULT;
			case ModelPackage.INTERFACE__SYSTEM_GROUP:
				return isSetSystemGroup();
			case ModelPackage.INTERFACE__ADDRESS_BLOCK:
				return addressBlock != null;
			case ModelPackage.INTERFACE__EXT_VLNV_NAME:
				return EXT_VLNV_NAME_EDEFAULT == null ? getExtVLNVName() != null : !EXT_VLNV_NAME_EDEFAULT.equals(getExtVLNVName());
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
		if (addressUnitESet) result.append(addressUnit); else result.append("<unset>");
		result.append(", dataUnit: ");
		if (dataUnitESet) result.append(dataUnit); else result.append("<unset>");
		result.append(", baseAddress: ");
		if (baseAddressESet) result.append(baseAddress); else result.append("<unset>");
		result.append(", range: ");
		if (rangeESet) result.append(range); else result.append("<unset>");
		result.append(", role: ");
		result.append(role);
		result.append(", systemGroup: ");
		if (systemGroupESet) result.append(systemGroup); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //InterfaceImpl
