/**
 */
package model.impl;

import java.util.Collection;

import model.ModelPackage;
import model.SiInstance;
import model.SiInstanceInterfaceMap;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Si Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.SiInstanceImpl#getSiInstanceInterfaceMap <em>Si Instance Interface Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SiInstanceImpl extends GeneralInstanceImpl implements SiInstance {
	/**
	 * The cached value of the '{@link #getSiInstanceInterfaceMap() <em>Si Instance Interface Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiInstanceInterfaceMap()
	 * @generated
	 * @ordered
	 */
	protected EList<SiInstanceInterfaceMap> siInstanceInterfaceMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getSiInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SiInstanceInterfaceMap> getSiInstanceInterfaceMap() {
		if (siInstanceInterfaceMap == null) {
			siInstanceInterfaceMap = new EObjectContainmentEList<SiInstanceInterfaceMap>(SiInstanceInterfaceMap.class, this, ModelPackage.SI_INSTANCE__SI_INSTANCE_INTERFACE_MAP);
		}
		return siInstanceInterfaceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SI_INSTANCE__SI_INSTANCE_INTERFACE_MAP:
				return ((InternalEList<?>)getSiInstanceInterfaceMap()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.SI_INSTANCE__SI_INSTANCE_INTERFACE_MAP:
				return getSiInstanceInterfaceMap();
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
			case ModelPackage.SI_INSTANCE__SI_INSTANCE_INTERFACE_MAP:
				getSiInstanceInterfaceMap().clear();
				getSiInstanceInterfaceMap().addAll((Collection<? extends SiInstanceInterfaceMap>)newValue);
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
			case ModelPackage.SI_INSTANCE__SI_INSTANCE_INTERFACE_MAP:
				getSiInstanceInterfaceMap().clear();
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
			case ModelPackage.SI_INSTANCE__SI_INSTANCE_INTERFACE_MAP:
				return siInstanceInterfaceMap != null && !siInstanceInterfaceMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SiInstanceImpl
