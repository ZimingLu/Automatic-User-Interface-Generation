/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.SiInstanceShellInterfaceMap;
import Essence.SiInstanceShellPortMap;
import Essence.XRefIndInterface;

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
 * An implementation of the model object '<em><b>Si Instance Shell Interface Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.SiInstanceShellInterfaceMapImpl#getXRefInstanceShellInterface <em>XRef Instance Shell Interface</em>}</li>
 *   <li>{@link Essence.impl.SiInstanceShellInterfaceMapImpl#getSiInstanceShellPortMap <em>Si Instance Shell Port Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiInstanceShellInterfaceMapImpl extends SingleSourceNodeImpl implements SiInstanceShellInterfaceMap {
	/**
	 * The cached value of the '{@link #getXRefInstanceShellInterface() <em>XRef Instance Shell Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefInstanceShellInterface()
	 * @generated
	 * @ordered
	 */
	protected XRefIndInterface xRefInstanceShellInterface;

	/**
	 * The cached value of the '{@link #getSiInstanceShellPortMap() <em>Si Instance Shell Port Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiInstanceShellPortMap()
	 * @generated
	 * @ordered
	 */
	protected EList<SiInstanceShellPortMap> siInstanceShellPortMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiInstanceShellInterfaceMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getSiInstanceShellInterfaceMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefIndInterface getXRefInstanceShellInterface() {
		return xRefInstanceShellInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefInstanceShellInterface(XRefIndInterface newXRefInstanceShellInterface, NotificationChain msgs) {
		XRefIndInterface oldXRefInstanceShellInterface = xRefInstanceShellInterface;
		xRefInstanceShellInterface = newXRefInstanceShellInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.SI_INSTANCE_SHELL_INTERFACE_MAP__XREF_INSTANCE_SHELL_INTERFACE, oldXRefInstanceShellInterface, newXRefInstanceShellInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefInstanceShellInterface(XRefIndInterface newXRefInstanceShellInterface) {
		if (newXRefInstanceShellInterface != xRefInstanceShellInterface) {
			NotificationChain msgs = null;
			if (xRefInstanceShellInterface != null)
				msgs = ((InternalEObject)xRefInstanceShellInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.SI_INSTANCE_SHELL_INTERFACE_MAP__XREF_INSTANCE_SHELL_INTERFACE, null, msgs);
			if (newXRefInstanceShellInterface != null)
				msgs = ((InternalEObject)newXRefInstanceShellInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.SI_INSTANCE_SHELL_INTERFACE_MAP__XREF_INSTANCE_SHELL_INTERFACE, null, msgs);
			msgs = basicSetXRefInstanceShellInterface(newXRefInstanceShellInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SI_INSTANCE_SHELL_INTERFACE_MAP__XREF_INSTANCE_SHELL_INTERFACE, newXRefInstanceShellInterface, newXRefInstanceShellInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SiInstanceShellPortMap> getSiInstanceShellPortMap() {
		if (siInstanceShellPortMap == null) {
			siInstanceShellPortMap = new EObjectContainmentEList<SiInstanceShellPortMap>(SiInstanceShellPortMap.class, this, EssencePackage.SI_INSTANCE_SHELL_INTERFACE_MAP__SI_INSTANCE_SHELL_PORT_MAP);
		}
		return siInstanceShellPortMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.SI_INSTANCE_SHELL_INTERFACE_MAP__XREF_INSTANCE_SHELL_INTERFACE:
				return basicSetXRefInstanceShellInterface(null, msgs);
			case EssencePackage.SI_INSTANCE_SHELL_INTERFACE_MAP__SI_INSTANCE_SHELL_PORT_MAP:
				return ((InternalEList<?>)getSiInstanceShellPortMap()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.SI_INSTANCE_SHELL_INTERFACE_MAP__XREF_INSTANCE_SHELL_INTERFACE:
				return getXRefInstanceShellInterface();
			case EssencePackage.SI_INSTANCE_SHELL_INTERFACE_MAP__SI_INSTANCE_SHELL_PORT_MAP:
				return getSiInstanceShellPortMap();
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
			case EssencePackage.SI_INSTANCE_SHELL_INTERFACE_MAP__XREF_INSTANCE_SHELL_INTERFACE:
				setXRefInstanceShellInterface((XRefIndInterface)newValue);
				return;
			case EssencePackage.SI_INSTANCE_SHELL_INTERFACE_MAP__SI_INSTANCE_SHELL_PORT_MAP:
				getSiInstanceShellPortMap().clear();
				getSiInstanceShellPortMap().addAll((Collection<? extends SiInstanceShellPortMap>)newValue);
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
			case EssencePackage.SI_INSTANCE_SHELL_INTERFACE_MAP__XREF_INSTANCE_SHELL_INTERFACE:
				setXRefInstanceShellInterface((XRefIndInterface)null);
				return;
			case EssencePackage.SI_INSTANCE_SHELL_INTERFACE_MAP__SI_INSTANCE_SHELL_PORT_MAP:
				getSiInstanceShellPortMap().clear();
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
			case EssencePackage.SI_INSTANCE_SHELL_INTERFACE_MAP__XREF_INSTANCE_SHELL_INTERFACE:
				return xRefInstanceShellInterface != null;
			case EssencePackage.SI_INSTANCE_SHELL_INTERFACE_MAP__SI_INSTANCE_SHELL_PORT_MAP:
				return siInstanceShellPortMap != null && !siInstanceShellPortMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SiInstanceShellInterfaceMapImpl
