/**
 */
package model.impl;

import java.util.Collection;

import model.InterfaceDefPort;
import model.InterfacePortMap;
import model.InterfaceView;
import model.ModelPackage;
import model.Port;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.InterfaceViewImpl#getInterfacePortMap <em>Interface Port Map</em>}</li>
 *   <li>{@link model.impl.InterfaceViewImpl#getPort <em>Port</em>}</li>
 *   <li>{@link model.impl.InterfaceViewImpl#getUnassignedPort <em>Unassigned Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceViewImpl extends SingleSourceNodeImpl implements InterfaceView {
	/**
	 * The cached value of the '{@link #getInterfacePortMap() <em>Interface Port Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacePortMap()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfacePortMap> interfacePortMap;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getInterfaceView();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfacePortMap> getInterfacePortMap() {
		if (interfacePortMap == null) {
			interfacePortMap = new EObjectContainmentEList<InterfacePortMap>(InterfacePortMap.class, this, ModelPackage.INTERFACE_VIEW__INTERFACE_PORT_MAP);
		}
		return interfacePortMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<Port>(Port.class, this, ModelPackage.INTERFACE_VIEW__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceDefPort> getUnassignedPort() {
		// TODO: implement this method to return the 'Unassigned Port' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.INTERFACE_VIEW__INTERFACE_PORT_MAP:
				return ((InternalEList<?>)getInterfacePortMap()).basicRemove(otherEnd, msgs);
			case ModelPackage.INTERFACE_VIEW__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.INTERFACE_VIEW__INTERFACE_PORT_MAP:
				return getInterfacePortMap();
			case ModelPackage.INTERFACE_VIEW__PORT:
				return getPort();
			case ModelPackage.INTERFACE_VIEW__UNASSIGNED_PORT:
				return getUnassignedPort();
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
			case ModelPackage.INTERFACE_VIEW__INTERFACE_PORT_MAP:
				getInterfacePortMap().clear();
				getInterfacePortMap().addAll((Collection<? extends InterfacePortMap>)newValue);
				return;
			case ModelPackage.INTERFACE_VIEW__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends Port>)newValue);
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
			case ModelPackage.INTERFACE_VIEW__INTERFACE_PORT_MAP:
				getInterfacePortMap().clear();
				return;
			case ModelPackage.INTERFACE_VIEW__PORT:
				getPort().clear();
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
			case ModelPackage.INTERFACE_VIEW__INTERFACE_PORT_MAP:
				return interfacePortMap != null && !interfacePortMap.isEmpty();
			case ModelPackage.INTERFACE_VIEW__PORT:
				return port != null && !port.isEmpty();
			case ModelPackage.INTERFACE_VIEW__UNASSIGNED_PORT:
				return !getUnassignedPort().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceViewImpl
