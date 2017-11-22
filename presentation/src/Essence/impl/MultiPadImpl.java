/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.MultiPad;
import Essence.SinglePad;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Pad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.MultiPadImpl#getSinglePad <em>Single Pad</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiPadImpl extends PadImpl implements MultiPad {
	/**
	 * The cached value of the '{@link #getSinglePad() <em>Single Pad</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinglePad()
	 * @generated
	 * @ordered
	 */
	protected EList<SinglePad> singlePad;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiPadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getMultiPad();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SinglePad> getSinglePad() {
		if (singlePad == null) {
			singlePad = new EObjectContainmentEList<SinglePad>(SinglePad.class, this, EssencePackage.MULTI_PAD__SINGLE_PAD);
		}
		return singlePad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.MULTI_PAD__SINGLE_PAD:
				return ((InternalEList<?>)getSinglePad()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.MULTI_PAD__SINGLE_PAD:
				return getSinglePad();
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
			case EssencePackage.MULTI_PAD__SINGLE_PAD:
				getSinglePad().clear();
				getSinglePad().addAll((Collection<? extends SinglePad>)newValue);
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
			case EssencePackage.MULTI_PAD__SINGLE_PAD:
				getSinglePad().clear();
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
			case EssencePackage.MULTI_PAD__SINGLE_PAD:
				return singlePad != null && !singlePad.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MultiPadImpl
