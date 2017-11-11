/**
 */
package model.impl;

import java.util.Collection;

import model.BusInstance;
import model.BusInterfaceMap;
import model.BusNoneInterfaceMap;
import model.ModelPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.BusInstanceImpl#getBusInterfaceMap <em>Bus Interface Map</em>}</li>
 *   <li>{@link model.impl.BusInstanceImpl#getBusNoneInterfaceMap <em>Bus None Interface Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusInstanceImpl extends InstanceImpl implements BusInstance {
	/**
	 * The cached value of the '{@link #getBusInterfaceMap() <em>Bus Interface Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusInterfaceMap()
	 * @generated
	 * @ordered
	 */
	protected EList<BusInterfaceMap> busInterfaceMap;

	/**
	 * The cached value of the '{@link #getBusNoneInterfaceMap() <em>Bus None Interface Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusNoneInterfaceMap()
	 * @generated
	 * @ordered
	 */
	protected EList<BusNoneInterfaceMap> busNoneInterfaceMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getBusInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusInterfaceMap> getBusInterfaceMap() {
		if (busInterfaceMap == null) {
			busInterfaceMap = new EObjectContainmentEList<BusInterfaceMap>(BusInterfaceMap.class, this, ModelPackage.BUS_INSTANCE__BUS_INTERFACE_MAP);
		}
		return busInterfaceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusNoneInterfaceMap> getBusNoneInterfaceMap() {
		if (busNoneInterfaceMap == null) {
			busNoneInterfaceMap = new EObjectContainmentEList<BusNoneInterfaceMap>(BusNoneInterfaceMap.class, this, ModelPackage.BUS_INSTANCE__BUS_NONE_INTERFACE_MAP);
		}
		return busNoneInterfaceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.BUS_INSTANCE__BUS_INTERFACE_MAP:
				return ((InternalEList<?>)getBusInterfaceMap()).basicRemove(otherEnd, msgs);
			case ModelPackage.BUS_INSTANCE__BUS_NONE_INTERFACE_MAP:
				return ((InternalEList<?>)getBusNoneInterfaceMap()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.BUS_INSTANCE__BUS_INTERFACE_MAP:
				return getBusInterfaceMap();
			case ModelPackage.BUS_INSTANCE__BUS_NONE_INTERFACE_MAP:
				return getBusNoneInterfaceMap();
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
			case ModelPackage.BUS_INSTANCE__BUS_INTERFACE_MAP:
				getBusInterfaceMap().clear();
				getBusInterfaceMap().addAll((Collection<? extends BusInterfaceMap>)newValue);
				return;
			case ModelPackage.BUS_INSTANCE__BUS_NONE_INTERFACE_MAP:
				getBusNoneInterfaceMap().clear();
				getBusNoneInterfaceMap().addAll((Collection<? extends BusNoneInterfaceMap>)newValue);
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
			case ModelPackage.BUS_INSTANCE__BUS_INTERFACE_MAP:
				getBusInterfaceMap().clear();
				return;
			case ModelPackage.BUS_INSTANCE__BUS_NONE_INTERFACE_MAP:
				getBusNoneInterfaceMap().clear();
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
			case ModelPackage.BUS_INSTANCE__BUS_INTERFACE_MAP:
				return busInterfaceMap != null && !busInterfaceMap.isEmpty();
			case ModelPackage.BUS_INSTANCE__BUS_NONE_INTERFACE_MAP:
				return busNoneInterfaceMap != null && !busNoneInterfaceMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusInstanceImpl
