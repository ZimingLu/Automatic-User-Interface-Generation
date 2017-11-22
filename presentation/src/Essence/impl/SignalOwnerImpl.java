/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.Signal;
import Essence.SignalMap;
import Essence.SignalOwner;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Owner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.SignalOwnerImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link Essence.impl.SignalOwnerImpl#getSignalMap <em>Signal Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SignalOwnerImpl extends SingleSourceNodeImpl implements SignalOwner {
	/**
	 * The cached value of the '{@link #getSignal() <em>Signal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> signal;

	/**
	 * The cached value of the '{@link #getSignalMap() <em>Signal Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalMap()
	 * @generated
	 * @ordered
	 */
	protected EList<SignalMap> signalMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalOwnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getSignalOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getSignal() {
		if (signal == null) {
			signal = new EObjectContainmentEList<Signal>(Signal.class, this, EssencePackage.SIGNAL_OWNER__SIGNAL);
		}
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignalMap> getSignalMap() {
		if (signalMap == null) {
			signalMap = new EObjectContainmentEList<SignalMap>(SignalMap.class, this, EssencePackage.SIGNAL_OWNER__SIGNAL_MAP);
		}
		return signalMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.SIGNAL_OWNER__SIGNAL:
				return ((InternalEList<?>)getSignal()).basicRemove(otherEnd, msgs);
			case EssencePackage.SIGNAL_OWNER__SIGNAL_MAP:
				return ((InternalEList<?>)getSignalMap()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.SIGNAL_OWNER__SIGNAL:
				return getSignal();
			case EssencePackage.SIGNAL_OWNER__SIGNAL_MAP:
				return getSignalMap();
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
			case EssencePackage.SIGNAL_OWNER__SIGNAL:
				getSignal().clear();
				getSignal().addAll((Collection<? extends Signal>)newValue);
				return;
			case EssencePackage.SIGNAL_OWNER__SIGNAL_MAP:
				getSignalMap().clear();
				getSignalMap().addAll((Collection<? extends SignalMap>)newValue);
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
			case EssencePackage.SIGNAL_OWNER__SIGNAL:
				getSignal().clear();
				return;
			case EssencePackage.SIGNAL_OWNER__SIGNAL_MAP:
				getSignalMap().clear();
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
			case EssencePackage.SIGNAL_OWNER__SIGNAL:
				return signal != null && !signal.isEmpty();
			case EssencePackage.SIGNAL_OWNER__SIGNAL_MAP:
				return signalMap != null && !signalMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SignalOwnerImpl
