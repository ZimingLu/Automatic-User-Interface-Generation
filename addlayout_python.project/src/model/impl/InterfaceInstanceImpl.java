/**
 */
package model.impl;

import java.util.Collection;

import model.InstanceInterfaceMap;
import model.InterfaceInstance;
import model.ModelPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.InterfaceInstanceImpl#getInstanceInterfaceMap <em>Instance Interface Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InterfaceInstanceImpl extends InstanceImpl implements InterfaceInstance {
	/**
	 * The cached value of the '{@link #getInstanceInterfaceMap() <em>Instance Interface Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceInterfaceMap()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanceInterfaceMap> instanceInterfaceMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getInterfaceInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstanceInterfaceMap> getInstanceInterfaceMap() {
		if (instanceInterfaceMap == null) {
			instanceInterfaceMap = new EObjectContainmentEList<InstanceInterfaceMap>(InstanceInterfaceMap.class, this, ModelPackage.INTERFACE_INSTANCE__INSTANCE_INTERFACE_MAP);
		}
		return instanceInterfaceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.INTERFACE_INSTANCE__INSTANCE_INTERFACE_MAP:
				return ((InternalEList<?>)getInstanceInterfaceMap()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.INTERFACE_INSTANCE__INSTANCE_INTERFACE_MAP:
				return getInstanceInterfaceMap();
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
			case ModelPackage.INTERFACE_INSTANCE__INSTANCE_INTERFACE_MAP:
				getInstanceInterfaceMap().clear();
				getInstanceInterfaceMap().addAll((Collection<? extends InstanceInterfaceMap>)newValue);
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
			case ModelPackage.INTERFACE_INSTANCE__INSTANCE_INTERFACE_MAP:
				getInstanceInterfaceMap().clear();
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
			case ModelPackage.INTERFACE_INSTANCE__INSTANCE_INTERFACE_MAP:
				return instanceInterfaceMap != null && !instanceInterfaceMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceInstanceImpl
