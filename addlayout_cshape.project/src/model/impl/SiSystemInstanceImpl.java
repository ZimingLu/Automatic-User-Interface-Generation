/**
 */
package model.impl;

import java.util.Collection;

import model.ModelPackage;
import model.SiInstanceShellInterfaceMap;
import model.SiSystemInstance;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Si System Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.SiSystemInstanceImpl#getSiInstanceShellInterfaceMap <em>Si Instance Shell Interface Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiSystemInstanceImpl extends SiInstanceImpl implements SiSystemInstance {
	/**
	 * The cached value of the '{@link #getSiInstanceShellInterfaceMap() <em>Si Instance Shell Interface Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiInstanceShellInterfaceMap()
	 * @generated
	 * @ordered
	 */
	protected EList<SiInstanceShellInterfaceMap> siInstanceShellInterfaceMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiSystemInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getSiSystemInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SiInstanceShellInterfaceMap> getSiInstanceShellInterfaceMap() {
		if (siInstanceShellInterfaceMap == null) {
			siInstanceShellInterfaceMap = new EObjectContainmentEList<SiInstanceShellInterfaceMap>(SiInstanceShellInterfaceMap.class, this, ModelPackage.SI_SYSTEM_INSTANCE__SI_INSTANCE_SHELL_INTERFACE_MAP);
		}
		return siInstanceShellInterfaceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SI_SYSTEM_INSTANCE__SI_INSTANCE_SHELL_INTERFACE_MAP:
				return ((InternalEList<?>)getSiInstanceShellInterfaceMap()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.SI_SYSTEM_INSTANCE__SI_INSTANCE_SHELL_INTERFACE_MAP:
				return getSiInstanceShellInterfaceMap();
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
			case ModelPackage.SI_SYSTEM_INSTANCE__SI_INSTANCE_SHELL_INTERFACE_MAP:
				getSiInstanceShellInterfaceMap().clear();
				getSiInstanceShellInterfaceMap().addAll((Collection<? extends SiInstanceShellInterfaceMap>)newValue);
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
			case ModelPackage.SI_SYSTEM_INSTANCE__SI_INSTANCE_SHELL_INTERFACE_MAP:
				getSiInstanceShellInterfaceMap().clear();
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
			case ModelPackage.SI_SYSTEM_INSTANCE__SI_INSTANCE_SHELL_INTERFACE_MAP:
				return siInstanceShellInterfaceMap != null && !siInstanceShellInterfaceMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SiSystemInstanceImpl
