/**
 */
package model.impl;

import java.util.Collection;

import model.ModelPackage;
import model.PackageInstance;
import model.PinNetMap;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.PackageInstanceImpl#getPinNetMap <em>Pin Net Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageInstanceImpl extends GeneralInstanceImpl implements PackageInstance {
	/**
	 * The cached value of the '{@link #getPinNetMap() <em>Pin Net Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinNetMap()
	 * @generated
	 * @ordered
	 */
	protected EList<PinNetMap> pinNetMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getPackageInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PinNetMap> getPinNetMap() {
		if (pinNetMap == null) {
			pinNetMap = new EObjectContainmentEList<PinNetMap>(PinNetMap.class, this, ModelPackage.PACKAGE_INSTANCE__PIN_NET_MAP);
		}
		return pinNetMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PACKAGE_INSTANCE__PIN_NET_MAP:
				return ((InternalEList<?>)getPinNetMap()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.PACKAGE_INSTANCE__PIN_NET_MAP:
				return getPinNetMap();
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
			case ModelPackage.PACKAGE_INSTANCE__PIN_NET_MAP:
				getPinNetMap().clear();
				getPinNetMap().addAll((Collection<? extends PinNetMap>)newValue);
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
			case ModelPackage.PACKAGE_INSTANCE__PIN_NET_MAP:
				getPinNetMap().clear();
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
			case ModelPackage.PACKAGE_INSTANCE__PIN_NET_MAP:
				return pinNetMap != null && !pinNetMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageInstanceImpl
