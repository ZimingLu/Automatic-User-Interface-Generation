/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.InterfaceDefView;
import Essence.InterfaceDefinition;
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
 * An implementation of the model object '<em><b>Interface Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.InterfaceDefinitionImpl#getAddressUnit <em>Address Unit</em>}</li>
 *   <li>{@link Essence.impl.InterfaceDefinitionImpl#getDataUnit <em>Data Unit</em>}</li>
 *   <li>{@link Essence.impl.InterfaceDefinitionImpl#getExtVLNV <em>Ext VLNV</em>}</li>
 *   <li>{@link Essence.impl.InterfaceDefinitionImpl#getInterfaceDefView <em>Interface Def View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceDefinitionImpl extends ModelRootImpl implements InterfaceDefinition {
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
	 * The cached value of the '{@link #getExtVLNV() <em>Ext VLNV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtVLNV()
	 * @generated
	 * @ordered
	 */
	protected VLNV extVLNV;

	/**
	 * The cached value of the '{@link #getInterfaceDefView() <em>Interface Def View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceDefView()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceDefView> interfaceDefView;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getInterfaceDefinition();
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
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.INTERFACE_DEFINITION__ADDRESS_UNIT, oldAddressUnit, addressUnit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.INTERFACE_DEFINITION__DATA_UNIT, oldDataUnit, dataUnit));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.INTERFACE_DEFINITION__EXT_VLNV, oldExtVLNV, newExtVLNV);
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
				msgs = ((InternalEObject)extVLNV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.INTERFACE_DEFINITION__EXT_VLNV, null, msgs);
			if (newExtVLNV != null)
				msgs = ((InternalEObject)newExtVLNV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.INTERFACE_DEFINITION__EXT_VLNV, null, msgs);
			msgs = basicSetExtVLNV(newExtVLNV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.INTERFACE_DEFINITION__EXT_VLNV, newExtVLNV, newExtVLNV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceDefView> getInterfaceDefView() {
		if (interfaceDefView == null) {
			interfaceDefView = new EObjectContainmentEList<InterfaceDefView>(InterfaceDefView.class, this, EssencePackage.INTERFACE_DEFINITION__INTERFACE_DEF_VIEW);
		}
		return interfaceDefView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.INTERFACE_DEFINITION__EXT_VLNV:
				return basicSetExtVLNV(null, msgs);
			case EssencePackage.INTERFACE_DEFINITION__INTERFACE_DEF_VIEW:
				return ((InternalEList<?>)getInterfaceDefView()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.INTERFACE_DEFINITION__ADDRESS_UNIT:
				return getAddressUnit();
			case EssencePackage.INTERFACE_DEFINITION__DATA_UNIT:
				return getDataUnit();
			case EssencePackage.INTERFACE_DEFINITION__EXT_VLNV:
				return getExtVLNV();
			case EssencePackage.INTERFACE_DEFINITION__INTERFACE_DEF_VIEW:
				return getInterfaceDefView();
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
			case EssencePackage.INTERFACE_DEFINITION__ADDRESS_UNIT:
				setAddressUnit((String)newValue);
				return;
			case EssencePackage.INTERFACE_DEFINITION__DATA_UNIT:
				setDataUnit((String)newValue);
				return;
			case EssencePackage.INTERFACE_DEFINITION__EXT_VLNV:
				setExtVLNV((VLNV)newValue);
				return;
			case EssencePackage.INTERFACE_DEFINITION__INTERFACE_DEF_VIEW:
				getInterfaceDefView().clear();
				getInterfaceDefView().addAll((Collection<? extends InterfaceDefView>)newValue);
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
			case EssencePackage.INTERFACE_DEFINITION__ADDRESS_UNIT:
				setAddressUnit(ADDRESS_UNIT_EDEFAULT);
				return;
			case EssencePackage.INTERFACE_DEFINITION__DATA_UNIT:
				setDataUnit(DATA_UNIT_EDEFAULT);
				return;
			case EssencePackage.INTERFACE_DEFINITION__EXT_VLNV:
				setExtVLNV((VLNV)null);
				return;
			case EssencePackage.INTERFACE_DEFINITION__INTERFACE_DEF_VIEW:
				getInterfaceDefView().clear();
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
			case EssencePackage.INTERFACE_DEFINITION__ADDRESS_UNIT:
				return ADDRESS_UNIT_EDEFAULT == null ? addressUnit != null : !ADDRESS_UNIT_EDEFAULT.equals(addressUnit);
			case EssencePackage.INTERFACE_DEFINITION__DATA_UNIT:
				return DATA_UNIT_EDEFAULT == null ? dataUnit != null : !DATA_UNIT_EDEFAULT.equals(dataUnit);
			case EssencePackage.INTERFACE_DEFINITION__EXT_VLNV:
				return extVLNV != null;
			case EssencePackage.INTERFACE_DEFINITION__INTERFACE_DEF_VIEW:
				return interfaceDefView != null && !interfaceDefView.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //InterfaceDefinitionImpl
