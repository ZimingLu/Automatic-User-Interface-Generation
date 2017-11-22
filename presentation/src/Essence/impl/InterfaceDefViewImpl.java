/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.InterfaceDefRole;
import Essence.InterfaceDefView;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Def View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.InterfaceDefViewImpl#getInterfaceDefRole <em>Interface Def Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceDefViewImpl extends SignalOwnerImpl implements InterfaceDefView {
	/**
	 * The cached value of the '{@link #getInterfaceDefRole() <em>Interface Def Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceDefRole()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceDefRole> interfaceDefRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceDefViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getInterfaceDefView();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceDefRole> getInterfaceDefRole() {
		if (interfaceDefRole == null) {
			interfaceDefRole = new EObjectContainmentEList<InterfaceDefRole>(InterfaceDefRole.class, this, EssencePackage.INTERFACE_DEF_VIEW__INTERFACE_DEF_ROLE);
		}
		return interfaceDefRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.INTERFACE_DEF_VIEW__INTERFACE_DEF_ROLE:
				return ((InternalEList<?>)getInterfaceDefRole()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.INTERFACE_DEF_VIEW__INTERFACE_DEF_ROLE:
				return getInterfaceDefRole();
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
			case EssencePackage.INTERFACE_DEF_VIEW__INTERFACE_DEF_ROLE:
				getInterfaceDefRole().clear();
				getInterfaceDefRole().addAll((Collection<? extends InterfaceDefRole>)newValue);
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
			case EssencePackage.INTERFACE_DEF_VIEW__INTERFACE_DEF_ROLE:
				getInterfaceDefRole().clear();
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
			case EssencePackage.INTERFACE_DEF_VIEW__INTERFACE_DEF_ROLE:
				return interfaceDefRole != null && !interfaceDefRole.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceDefViewImpl
