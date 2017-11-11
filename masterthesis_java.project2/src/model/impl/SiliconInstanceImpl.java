/**
 */
package model.impl;

import java.util.Collection;

import model.ModelPackage;
import model.PadNetMap;
import model.SiliconInstance;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Silicon Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.SiliconInstanceImpl#getPadNetMap <em>Pad Net Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiliconInstanceImpl extends GeneralInstanceImpl implements SiliconInstance {
	/**
	 * The cached value of the '{@link #getPadNetMap() <em>Pad Net Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadNetMap()
	 * @generated
	 * @ordered
	 */
	protected EList<PadNetMap> padNetMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiliconInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getSiliconInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PadNetMap> getPadNetMap() {
		if (padNetMap == null) {
			padNetMap = new EObjectContainmentEList<PadNetMap>(PadNetMap.class, this, ModelPackage.SILICON_INSTANCE__PAD_NET_MAP);
		}
		return padNetMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SILICON_INSTANCE__PAD_NET_MAP:
				return ((InternalEList<?>)getPadNetMap()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.SILICON_INSTANCE__PAD_NET_MAP:
				return getPadNetMap();
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
			case ModelPackage.SILICON_INSTANCE__PAD_NET_MAP:
				getPadNetMap().clear();
				getPadNetMap().addAll((Collection<? extends PadNetMap>)newValue);
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
			case ModelPackage.SILICON_INSTANCE__PAD_NET_MAP:
				getPadNetMap().clear();
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
			case ModelPackage.SILICON_INSTANCE__PAD_NET_MAP:
				return padNetMap != null && !padNetMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SiliconInstanceImpl
