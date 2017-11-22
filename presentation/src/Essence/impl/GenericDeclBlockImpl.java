/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.GenericDecl;
import Essence.GenericDeclBlock;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Decl Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.GenericDeclBlockImpl#getGenericDecl <em>Generic Decl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericDeclBlockImpl extends VarDefBlockImpl implements GenericDeclBlock {
	/**
	 * The cached value of the '{@link #getGenericDecl() <em>Generic Decl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericDecl()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericDecl> genericDecl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericDeclBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getGenericDeclBlock();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericDecl> getGenericDecl() {
		if (genericDecl == null) {
			genericDecl = new EObjectContainmentEList<GenericDecl>(GenericDecl.class, this, EssencePackage.GENERIC_DECL_BLOCK__GENERIC_DECL);
		}
		return genericDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.GENERIC_DECL_BLOCK__GENERIC_DECL:
				return ((InternalEList<?>)getGenericDecl()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.GENERIC_DECL_BLOCK__GENERIC_DECL:
				return getGenericDecl();
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
			case EssencePackage.GENERIC_DECL_BLOCK__GENERIC_DECL:
				getGenericDecl().clear();
				getGenericDecl().addAll((Collection<? extends GenericDecl>)newValue);
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
			case EssencePackage.GENERIC_DECL_BLOCK__GENERIC_DECL:
				getGenericDecl().clear();
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
			case EssencePackage.GENERIC_DECL_BLOCK__GENERIC_DECL:
				return genericDecl != null && !genericDecl.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenericDeclBlockImpl
