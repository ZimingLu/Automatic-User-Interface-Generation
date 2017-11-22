/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.MultiViewRegister;
import Essence.RegisterView;
import Essence.XRefRegisterView;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi View Register</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.MultiViewRegisterImpl#getXRefRegisterView <em>XRef Register View</em>}</li>
 *   <li>{@link Essence.impl.MultiViewRegisterImpl#getRegisterView <em>Register View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiViewRegisterImpl extends GeneralRegisterImpl implements MultiViewRegister {
	/**
	 * The cached value of the '{@link #getXRefRegisterView() <em>XRef Register View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefRegisterView()
	 * @generated
	 * @ordered
	 */
	protected EList<XRefRegisterView> xRefRegisterView;

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
	protected MultiViewRegisterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getMultiViewRegister();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XRefRegisterView> getXRefRegisterView() {
		if (xRefRegisterView == null) {
			xRefRegisterView = new EObjectContainmentEList<XRefRegisterView>(XRefRegisterView.class, this, EssencePackage.MULTI_VIEW_REGISTER__XREF_REGISTER_VIEW);
		}
		return xRefRegisterView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegisterView> getRegisterView() {
		if (registerView == null) {
			registerView = new EObjectContainmentEList<RegisterView>(RegisterView.class, this, EssencePackage.MULTI_VIEW_REGISTER__REGISTER_VIEW);
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
			case EssencePackage.MULTI_VIEW_REGISTER__XREF_REGISTER_VIEW:
				return ((InternalEList<?>)getXRefRegisterView()).basicRemove(otherEnd, msgs);
			case EssencePackage.MULTI_VIEW_REGISTER__REGISTER_VIEW:
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
			case EssencePackage.MULTI_VIEW_REGISTER__XREF_REGISTER_VIEW:
				return getXRefRegisterView();
			case EssencePackage.MULTI_VIEW_REGISTER__REGISTER_VIEW:
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
			case EssencePackage.MULTI_VIEW_REGISTER__XREF_REGISTER_VIEW:
				getXRefRegisterView().clear();
				getXRefRegisterView().addAll((Collection<? extends XRefRegisterView>)newValue);
				return;
			case EssencePackage.MULTI_VIEW_REGISTER__REGISTER_VIEW:
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
			case EssencePackage.MULTI_VIEW_REGISTER__XREF_REGISTER_VIEW:
				getXRefRegisterView().clear();
				return;
			case EssencePackage.MULTI_VIEW_REGISTER__REGISTER_VIEW:
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
			case EssencePackage.MULTI_VIEW_REGISTER__XREF_REGISTER_VIEW:
				return xRefRegisterView != null && !xRefRegisterView.isEmpty();
			case EssencePackage.MULTI_VIEW_REGISTER__REGISTER_VIEW:
				return registerView != null && !registerView.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MultiViewRegisterImpl
