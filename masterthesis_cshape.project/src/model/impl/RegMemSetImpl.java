/**
 */
package model.impl;

import java.util.Collection;

import model.MessageType;
import model.ModelPackage;
import model.RegMemElement;
import model.RegMemSet;
import model.SpecialType;

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
 * An implementation of the model object '<em><b>Reg Mem Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.RegMemSetImpl#getAddressUnit <em>Address Unit</em>}</li>
 *   <li>{@link model.impl.RegMemSetImpl#getDataUnit <em>Data Unit</em>}</li>
 *   <li>{@link model.impl.RegMemSetImpl#getSpecial <em>Special</em>}</li>
 *   <li>{@link model.impl.RegMemSetImpl#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link model.impl.RegMemSetImpl#getOpCode <em>Op Code</em>}</li>
 *   <li>{@link model.impl.RegMemSetImpl#getRegMemElement <em>Reg Mem Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegMemSetImpl extends SingleSourceNodeImpl implements RegMemSet {
	/**
	 * The default value of the '{@link #getAddressUnit() <em>Address Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_UNIT_EDEFAULT = "8";

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
	protected static final String DATA_UNIT_EDEFAULT = "8";

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
	 * The default value of the '{@link #getSpecial() <em>Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecial()
	 * @generated
	 * @ordered
	 */
	protected static final SpecialType SPECIAL_EDEFAULT = SpecialType.TABLE;

	/**
	 * The cached value of the '{@link #getSpecial() <em>Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecial()
	 * @generated
	 * @ordered
	 */
	protected SpecialType special = SPECIAL_EDEFAULT;

	/**
	 * This is true if the Special attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specialESet;

	/**
	 * The default value of the '{@link #getMessageType() <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageType()
	 * @generated
	 * @ordered
	 */
	protected static final MessageType MESSAGE_TYPE_EDEFAULT = MessageType.CONFIG;

	/**
	 * The cached value of the '{@link #getMessageType() <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageType()
	 * @generated
	 * @ordered
	 */
	protected MessageType messageType = MESSAGE_TYPE_EDEFAULT;

	/**
	 * This is true if the Message Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean messageTypeESet;

	/**
	 * The default value of the '{@link #getOpCode() <em>Op Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpCode()
	 * @generated
	 * @ordered
	 */
	protected static final String OP_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpCode() <em>Op Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpCode()
	 * @generated
	 * @ordered
	 */
	protected String opCode = OP_CODE_EDEFAULT;

	/**
	 * This is true if the Op Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean opCodeESet;

	/**
	 * The cached value of the '{@link #getRegMemElement() <em>Reg Mem Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegMemElement()
	 * @generated
	 * @ordered
	 */
	protected EList<RegMemElement> regMemElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegMemSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getRegMemSet();
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REG_MEM_SET__ADDRESS_UNIT, oldAddressUnit, addressUnit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REG_MEM_SET__DATA_UNIT, oldDataUnit, dataUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialType getSpecial() {
		return special;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecial(SpecialType newSpecial) {
		SpecialType oldSpecial = special;
		special = newSpecial == null ? SPECIAL_EDEFAULT : newSpecial;
		boolean oldSpecialESet = specialESet;
		specialESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REG_MEM_SET__SPECIAL, oldSpecial, special, !oldSpecialESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecial() {
		SpecialType oldSpecial = special;
		boolean oldSpecialESet = specialESet;
		special = SPECIAL_EDEFAULT;
		specialESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.REG_MEM_SET__SPECIAL, oldSpecial, SPECIAL_EDEFAULT, oldSpecialESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecial() {
		return specialESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType getMessageType() {
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageType(MessageType newMessageType) {
		MessageType oldMessageType = messageType;
		messageType = newMessageType == null ? MESSAGE_TYPE_EDEFAULT : newMessageType;
		boolean oldMessageTypeESet = messageTypeESet;
		messageTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REG_MEM_SET__MESSAGE_TYPE, oldMessageType, messageType, !oldMessageTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMessageType() {
		MessageType oldMessageType = messageType;
		boolean oldMessageTypeESet = messageTypeESet;
		messageType = MESSAGE_TYPE_EDEFAULT;
		messageTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.REG_MEM_SET__MESSAGE_TYPE, oldMessageType, MESSAGE_TYPE_EDEFAULT, oldMessageTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMessageType() {
		return messageTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpCode() {
		return opCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpCode(String newOpCode) {
		String oldOpCode = opCode;
		opCode = newOpCode;
		boolean oldOpCodeESet = opCodeESet;
		opCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REG_MEM_SET__OP_CODE, oldOpCode, opCode, !oldOpCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOpCode() {
		String oldOpCode = opCode;
		boolean oldOpCodeESet = opCodeESet;
		opCode = OP_CODE_EDEFAULT;
		opCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.REG_MEM_SET__OP_CODE, oldOpCode, OP_CODE_EDEFAULT, oldOpCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOpCode() {
		return opCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegMemElement> getRegMemElement() {
		if (regMemElement == null) {
			regMemElement = new EObjectContainmentEList<RegMemElement>(RegMemElement.class, this, ModelPackage.REG_MEM_SET__REG_MEM_ELEMENT);
		}
		return regMemElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.REG_MEM_SET__REG_MEM_ELEMENT:
				return ((InternalEList<?>)getRegMemElement()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.REG_MEM_SET__ADDRESS_UNIT:
				return getAddressUnit();
			case ModelPackage.REG_MEM_SET__DATA_UNIT:
				return getDataUnit();
			case ModelPackage.REG_MEM_SET__SPECIAL:
				return getSpecial();
			case ModelPackage.REG_MEM_SET__MESSAGE_TYPE:
				return getMessageType();
			case ModelPackage.REG_MEM_SET__OP_CODE:
				return getOpCode();
			case ModelPackage.REG_MEM_SET__REG_MEM_ELEMENT:
				return getRegMemElement();
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
			case ModelPackage.REG_MEM_SET__ADDRESS_UNIT:
				setAddressUnit((String)newValue);
				return;
			case ModelPackage.REG_MEM_SET__DATA_UNIT:
				setDataUnit((String)newValue);
				return;
			case ModelPackage.REG_MEM_SET__SPECIAL:
				setSpecial((SpecialType)newValue);
				return;
			case ModelPackage.REG_MEM_SET__MESSAGE_TYPE:
				setMessageType((MessageType)newValue);
				return;
			case ModelPackage.REG_MEM_SET__OP_CODE:
				setOpCode((String)newValue);
				return;
			case ModelPackage.REG_MEM_SET__REG_MEM_ELEMENT:
				getRegMemElement().clear();
				getRegMemElement().addAll((Collection<? extends RegMemElement>)newValue);
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
			case ModelPackage.REG_MEM_SET__ADDRESS_UNIT:
				setAddressUnit(ADDRESS_UNIT_EDEFAULT);
				return;
			case ModelPackage.REG_MEM_SET__DATA_UNIT:
				setDataUnit(DATA_UNIT_EDEFAULT);
				return;
			case ModelPackage.REG_MEM_SET__SPECIAL:
				unsetSpecial();
				return;
			case ModelPackage.REG_MEM_SET__MESSAGE_TYPE:
				unsetMessageType();
				return;
			case ModelPackage.REG_MEM_SET__OP_CODE:
				unsetOpCode();
				return;
			case ModelPackage.REG_MEM_SET__REG_MEM_ELEMENT:
				getRegMemElement().clear();
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
			case ModelPackage.REG_MEM_SET__ADDRESS_UNIT:
				return ADDRESS_UNIT_EDEFAULT == null ? addressUnit != null : !ADDRESS_UNIT_EDEFAULT.equals(addressUnit);
			case ModelPackage.REG_MEM_SET__DATA_UNIT:
				return DATA_UNIT_EDEFAULT == null ? dataUnit != null : !DATA_UNIT_EDEFAULT.equals(dataUnit);
			case ModelPackage.REG_MEM_SET__SPECIAL:
				return isSetSpecial();
			case ModelPackage.REG_MEM_SET__MESSAGE_TYPE:
				return isSetMessageType();
			case ModelPackage.REG_MEM_SET__OP_CODE:
				return isSetOpCode();
			case ModelPackage.REG_MEM_SET__REG_MEM_ELEMENT:
				return regMemElement != null && !regMemElement.isEmpty();
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
		result.append(", special: ");
		if (specialESet) result.append(special); else result.append("<unset>");
		result.append(", messageType: ");
		if (messageTypeESet) result.append(messageType); else result.append("<unset>");
		result.append(", opCode: ");
		if (opCodeESet) result.append(opCode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RegMemSetImpl
