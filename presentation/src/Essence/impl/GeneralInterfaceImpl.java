/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.GeneralInterface;
import Essence.InterfaceView;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.GeneralInterfaceImpl#getInterfaceView <em>Interface View</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeneralInterfaceImpl extends SingleSourceNodeImpl implements GeneralInterface {
	/**
	 * The cached value of the '{@link #getInterfaceView() <em>Interface View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceView()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceView> interfaceView;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getGeneralInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceView> getInterfaceView() {
		if (interfaceView == null) {
			interfaceView = new EObjectContainmentEList<InterfaceView>(InterfaceView.class, this, EssencePackage.GENERAL_INTERFACE__INTERFACE_VIEW);
		}
		return interfaceView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.GENERAL_INTERFACE__INTERFACE_VIEW:
				return ((InternalEList<?>)getInterfaceView()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.GENERAL_INTERFACE__INTERFACE_VIEW:
				return getInterfaceView();
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
			case EssencePackage.GENERAL_INTERFACE__INTERFACE_VIEW:
				getInterfaceView().clear();
				getInterfaceView().addAll((Collection<? extends InterfaceView>)newValue);
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
			case EssencePackage.GENERAL_INTERFACE__INTERFACE_VIEW:
				getInterfaceView().clear();
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
			case EssencePackage.GENERAL_INTERFACE__INTERFACE_VIEW:
				return interfaceView != null && !interfaceView.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GeneralInterfaceImpl
