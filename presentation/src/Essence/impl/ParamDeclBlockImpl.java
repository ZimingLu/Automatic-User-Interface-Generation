/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.ParamDecl;
import Essence.ParamDeclBlock;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Decl Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.ParamDeclBlockImpl#getParamDecl <em>Param Decl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParamDeclBlockImpl extends VarDefBlockImpl implements ParamDeclBlock {
	/**
	 * The cached value of the '{@link #getParamDecl() <em>Param Decl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamDecl()
	 * @generated
	 * @ordered
	 */
	protected EList<ParamDecl> paramDecl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParamDeclBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getParamDeclBlock();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParamDecl> getParamDecl() {
		if (paramDecl == null) {
			paramDecl = new EObjectContainmentEList<ParamDecl>(ParamDecl.class, this, EssencePackage.PARAM_DECL_BLOCK__PARAM_DECL);
		}
		return paramDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.PARAM_DECL_BLOCK__PARAM_DECL:
				return ((InternalEList<?>)getParamDecl()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.PARAM_DECL_BLOCK__PARAM_DECL:
				return getParamDecl();
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
			case EssencePackage.PARAM_DECL_BLOCK__PARAM_DECL:
				getParamDecl().clear();
				getParamDecl().addAll((Collection<? extends ParamDecl>)newValue);
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
			case EssencePackage.PARAM_DECL_BLOCK__PARAM_DECL:
				getParamDecl().clear();
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
			case EssencePackage.PARAM_DECL_BLOCK__PARAM_DECL:
				return paramDecl != null && !paramDecl.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParamDeclBlockImpl
