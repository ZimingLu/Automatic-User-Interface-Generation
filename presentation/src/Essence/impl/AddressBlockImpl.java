/**
 */
package Essence.impl;

import Essence.AddressBlock;
import Essence.EssencePackage;
import Essence.XRefMasterInterface;
import Essence.XRefRegMemSet;
import Essence.XRefSlaveInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.AddressBlockImpl#getXRefRegMemSet <em>XRef Reg Mem Set</em>}</li>
 *   <li>{@link Essence.impl.AddressBlockImpl#getXRefMasterInterface <em>XRef Master Interface</em>}</li>
 *   <li>{@link Essence.impl.AddressBlockImpl#getXRefSlaveInterface <em>XRef Slave Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressBlockImpl extends EssenceBaseImpl implements AddressBlock {
	/**
	 * The cached value of the '{@link #getXRefRegMemSet() <em>XRef Reg Mem Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefRegMemSet()
	 * @generated
	 * @ordered
	 */
	protected EList<XRefRegMemSet> xRefRegMemSet;

	/**
	 * The cached value of the '{@link #getXRefMasterInterface() <em>XRef Master Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefMasterInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<XRefMasterInterface> xRefMasterInterface;

	/**
	 * The cached value of the '{@link #getXRefSlaveInterface() <em>XRef Slave Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefSlaveInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<XRefSlaveInterface> xRefSlaveInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getAddressBlock();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XRefRegMemSet> getXRefRegMemSet() {
		if (xRefRegMemSet == null) {
			xRefRegMemSet = new EObjectContainmentEList<XRefRegMemSet>(XRefRegMemSet.class, this, EssencePackage.ADDRESS_BLOCK__XREF_REG_MEM_SET);
		}
		return xRefRegMemSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XRefMasterInterface> getXRefMasterInterface() {
		if (xRefMasterInterface == null) {
			xRefMasterInterface = new EObjectContainmentEList<XRefMasterInterface>(XRefMasterInterface.class, this, EssencePackage.ADDRESS_BLOCK__XREF_MASTER_INTERFACE);
		}
		return xRefMasterInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XRefSlaveInterface> getXRefSlaveInterface() {
		if (xRefSlaveInterface == null) {
			xRefSlaveInterface = new EObjectContainmentEList<XRefSlaveInterface>(XRefSlaveInterface.class, this, EssencePackage.ADDRESS_BLOCK__XREF_SLAVE_INTERFACE);
		}
		return xRefSlaveInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.ADDRESS_BLOCK__XREF_REG_MEM_SET:
				return ((InternalEList<?>)getXRefRegMemSet()).basicRemove(otherEnd, msgs);
			case EssencePackage.ADDRESS_BLOCK__XREF_MASTER_INTERFACE:
				return ((InternalEList<?>)getXRefMasterInterface()).basicRemove(otherEnd, msgs);
			case EssencePackage.ADDRESS_BLOCK__XREF_SLAVE_INTERFACE:
				return ((InternalEList<?>)getXRefSlaveInterface()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.ADDRESS_BLOCK__XREF_REG_MEM_SET:
				return getXRefRegMemSet();
			case EssencePackage.ADDRESS_BLOCK__XREF_MASTER_INTERFACE:
				return getXRefMasterInterface();
			case EssencePackage.ADDRESS_BLOCK__XREF_SLAVE_INTERFACE:
				return getXRefSlaveInterface();
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
			case EssencePackage.ADDRESS_BLOCK__XREF_REG_MEM_SET:
				getXRefRegMemSet().clear();
				getXRefRegMemSet().addAll((Collection<? extends XRefRegMemSet>)newValue);
				return;
			case EssencePackage.ADDRESS_BLOCK__XREF_MASTER_INTERFACE:
				getXRefMasterInterface().clear();
				getXRefMasterInterface().addAll((Collection<? extends XRefMasterInterface>)newValue);
				return;
			case EssencePackage.ADDRESS_BLOCK__XREF_SLAVE_INTERFACE:
				getXRefSlaveInterface().clear();
				getXRefSlaveInterface().addAll((Collection<? extends XRefSlaveInterface>)newValue);
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
			case EssencePackage.ADDRESS_BLOCK__XREF_REG_MEM_SET:
				getXRefRegMemSet().clear();
				return;
			case EssencePackage.ADDRESS_BLOCK__XREF_MASTER_INTERFACE:
				getXRefMasterInterface().clear();
				return;
			case EssencePackage.ADDRESS_BLOCK__XREF_SLAVE_INTERFACE:
				getXRefSlaveInterface().clear();
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
			case EssencePackage.ADDRESS_BLOCK__XREF_REG_MEM_SET:
				return xRefRegMemSet != null && !xRefRegMemSet.isEmpty();
			case EssencePackage.ADDRESS_BLOCK__XREF_MASTER_INTERFACE:
				return xRefMasterInterface != null && !xRefMasterInterface.isEmpty();
			case EssencePackage.ADDRESS_BLOCK__XREF_SLAVE_INTERFACE:
				return xRefSlaveInterface != null && !xRefSlaveInterface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AddressBlockImpl
