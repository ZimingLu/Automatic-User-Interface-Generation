/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.RegViewBlock;
import Essence.RegisterView;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reg View Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.RegViewBlockImpl#getRegisterView <em>Register View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegViewBlockImpl extends SingleSourceNodeImpl implements RegViewBlock {
	/**
	 * The cached value of the '{@link #getRegisterView() <em>Register View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterView()
	 * @generated
	 * @ordered
	 */
	protected EList<RegisterView> registerView;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegViewBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getRegViewBlock();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegisterView> getRegisterView() {
		if (registerView == null) {
			registerView = new EObjectContainmentEList<RegisterView>(RegisterView.class, this, EssencePackage.REG_VIEW_BLOCK__REGISTER_VIEW);
		}
		return registerView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.REG_VIEW_BLOCK__REGISTER_VIEW:
				return ((InternalEList<?>)getRegisterView()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.REG_VIEW_BLOCK__REGISTER_VIEW:
				return getRegisterView();
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
			case EssencePackage.REG_VIEW_BLOCK__REGISTER_VIEW:
				getRegisterView().clear();
				getRegisterView().addAll((Collection<? extends RegisterView>)newValue);
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
			case EssencePackage.REG_VIEW_BLOCK__REGISTER_VIEW:
				getRegisterView().clear();
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
			case EssencePackage.REG_VIEW_BLOCK__REGISTER_VIEW:
				return registerView != null && !registerView.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RegViewBlockImpl
