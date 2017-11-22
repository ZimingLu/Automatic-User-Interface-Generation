/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.SiSignal;
import Essence.SiSignalDB;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Si Signal DB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.SiSignalDBImpl#getSiSignal <em>Si Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiSignalDBImpl extends ModelRootImpl implements SiSignalDB {
	/**
	 * The cached value of the '{@link #getSiSignal() <em>Si Signal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiSignal()
	 * @generated
	 * @ordered
	 */
	protected EList<SiSignal> siSignal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiSignalDBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getSiSignalDB();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SiSignal> getSiSignal() {
		if (siSignal == null) {
			siSignal = new EObjectContainmentEList<SiSignal>(SiSignal.class, this, EssencePackage.SI_SIGNAL_DB__SI_SIGNAL);
		}
		return siSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.SI_SIGNAL_DB__SI_SIGNAL:
				return ((InternalEList<?>)getSiSignal()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.SI_SIGNAL_DB__SI_SIGNAL:
				return getSiSignal();
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
			case EssencePackage.SI_SIGNAL_DB__SI_SIGNAL:
				getSiSignal().clear();
				getSiSignal().addAll((Collection<? extends SiSignal>)newValue);
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
			case EssencePackage.SI_SIGNAL_DB__SI_SIGNAL:
				getSiSignal().clear();
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
			case EssencePackage.SI_SIGNAL_DB__SI_SIGNAL:
				return siSignal != null && !siSignal.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SiSignalDBImpl
