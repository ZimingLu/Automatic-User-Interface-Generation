/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.ProductInstance;
import Essence.ProductInterfaceMap;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.ProductInstanceImpl#getProductInterfaceMap <em>Product Interface Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductInstanceImpl extends InstanceImpl implements ProductInstance {
	/**
	 * The cached value of the '{@link #getProductInterfaceMap() <em>Product Interface Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInterfaceMap()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductInterfaceMap> productInterfaceMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getProductInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductInterfaceMap> getProductInterfaceMap() {
		if (productInterfaceMap == null) {
			productInterfaceMap = new EObjectContainmentEList<ProductInterfaceMap>(ProductInterfaceMap.class, this, EssencePackage.PRODUCT_INSTANCE__PRODUCT_INTERFACE_MAP);
		}
		return productInterfaceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.PRODUCT_INSTANCE__PRODUCT_INTERFACE_MAP:
				return ((InternalEList<?>)getProductInterfaceMap()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.PRODUCT_INSTANCE__PRODUCT_INTERFACE_MAP:
				return getProductInterfaceMap();
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
			case EssencePackage.PRODUCT_INSTANCE__PRODUCT_INTERFACE_MAP:
				getProductInterfaceMap().clear();
				getProductInterfaceMap().addAll((Collection<? extends ProductInterfaceMap>)newValue);
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
			case EssencePackage.PRODUCT_INSTANCE__PRODUCT_INTERFACE_MAP:
				getProductInterfaceMap().clear();
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
			case EssencePackage.PRODUCT_INSTANCE__PRODUCT_INTERFACE_MAP:
				return productInterfaceMap != null && !productInterfaceMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductInstanceImpl
