/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.GeneralInstance;
import Essence.GenericMap;
import Essence.ParamMap;
import Essence.VLNV;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.GeneralInstanceImpl#getExtVLNV <em>Ext VLNV</em>}</li>
 *   <li>{@link Essence.impl.GeneralInstanceImpl#getParamMap <em>Param Map</em>}</li>
 *   <li>{@link Essence.impl.GeneralInstanceImpl#getGenericMap <em>Generic Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeneralInstanceImpl extends SingleSourceNodeImpl implements GeneralInstance {
	/**
	 * The cached value of the '{@link #getExtVLNV() <em>Ext VLNV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtVLNV()
	 * @generated
	 * @ordered
	 */
	protected VLNV extVLNV;

	/**
	 * The cached value of the '{@link #getParamMap() <em>Param Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamMap()
	 * @generated
	 * @ordered
	 */
	protected EList<ParamMap> paramMap;

	/**
	 * The cached value of the '{@link #getGenericMap() <em>Generic Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericMap()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericMap> genericMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getGeneralInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VLNV getExtVLNV() {
		return extVLNV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtVLNV(VLNV newExtVLNV, NotificationChain msgs) {
		VLNV oldExtVLNV = extVLNV;
		extVLNV = newExtVLNV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.GENERAL_INSTANCE__EXT_VLNV, oldExtVLNV, newExtVLNV);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtVLNV(VLNV newExtVLNV) {
		if (newExtVLNV != extVLNV) {
			NotificationChain msgs = null;
			if (extVLNV != null)
				msgs = ((InternalEObject)extVLNV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.GENERAL_INSTANCE__EXT_VLNV, null, msgs);
			if (newExtVLNV != null)
				msgs = ((InternalEObject)newExtVLNV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.GENERAL_INSTANCE__EXT_VLNV, null, msgs);
			msgs = basicSetExtVLNV(newExtVLNV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.GENERAL_INSTANCE__EXT_VLNV, newExtVLNV, newExtVLNV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParamMap> getParamMap() {
		if (paramMap == null) {
			paramMap = new EObjectContainmentEList<ParamMap>(ParamMap.class, this, EssencePackage.GENERAL_INSTANCE__PARAM_MAP);
		}
		return paramMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericMap> getGenericMap() {
		if (genericMap == null) {
			genericMap = new EObjectContainmentEList<GenericMap>(GenericMap.class, this, EssencePackage.GENERAL_INSTANCE__GENERIC_MAP);
		}
		return genericMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.GENERAL_INSTANCE__EXT_VLNV:
				return basicSetExtVLNV(null, msgs);
			case EssencePackage.GENERAL_INSTANCE__PARAM_MAP:
				return ((InternalEList<?>)getParamMap()).basicRemove(otherEnd, msgs);
			case EssencePackage.GENERAL_INSTANCE__GENERIC_MAP:
				return ((InternalEList<?>)getGenericMap()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.GENERAL_INSTANCE__EXT_VLNV:
				return getExtVLNV();
			case EssencePackage.GENERAL_INSTANCE__PARAM_MAP:
				return getParamMap();
			case EssencePackage.GENERAL_INSTANCE__GENERIC_MAP:
				return getGenericMap();
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
			case EssencePackage.GENERAL_INSTANCE__EXT_VLNV:
				setExtVLNV((VLNV)newValue);
				return;
			case EssencePackage.GENERAL_INSTANCE__PARAM_MAP:
				getParamMap().clear();
				getParamMap().addAll((Collection<? extends ParamMap>)newValue);
				return;
			case EssencePackage.GENERAL_INSTANCE__GENERIC_MAP:
				getGenericMap().clear();
				getGenericMap().addAll((Collection<? extends GenericMap>)newValue);
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
			case EssencePackage.GENERAL_INSTANCE__EXT_VLNV:
				setExtVLNV((VLNV)null);
				return;
			case EssencePackage.GENERAL_INSTANCE__PARAM_MAP:
				getParamMap().clear();
				return;
			case EssencePackage.GENERAL_INSTANCE__GENERIC_MAP:
				getGenericMap().clear();
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
			case EssencePackage.GENERAL_INSTANCE__EXT_VLNV:
				return extVLNV != null;
			case EssencePackage.GENERAL_INSTANCE__PARAM_MAP:
				return paramMap != null && !paramMap.isEmpty();
			case EssencePackage.GENERAL_INSTANCE__GENERIC_MAP:
				return genericMap != null && !genericMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GeneralInstanceImpl
