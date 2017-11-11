/**
 */
package model.impl;

import java.util.Collection;

import model.ModelPackage;
import model.SiInstanceInterfaceMap;
import model.SiInstancePortMap;
import model.XRefExternalInterface;

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
 * An implementation of the model object '<em><b>Si Instance Interface Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.SiInstanceInterfaceMapImpl#getXRefInstanceInterface <em>XRef Instance Interface</em>}</li>
 *   <li>{@link model.impl.SiInstanceInterfaceMapImpl#getSiInstancePortMap <em>Si Instance Port Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiInstanceInterfaceMapImpl extends SingleSourceNodeImpl implements SiInstanceInterfaceMap {
	/**
	 * The cached value of the '{@link #getXRefInstanceInterface() <em>XRef Instance Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefInstanceInterface()
	 * @generated
	 * @ordered
	 */
	protected XRefExternalInterface xRefInstanceInterface;

	/**
	 * The cached value of the '{@link #getSiInstancePortMap() <em>Si Instance Port Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiInstancePortMap()
	 * @generated
	 * @ordered
	 */
	protected EList<SiInstancePortMap> siInstancePortMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiInstanceInterfaceMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getSiInstanceInterfaceMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefExternalInterface getXRefInstanceInterface() {
		return xRefInstanceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefInstanceInterface(XRefExternalInterface newXRefInstanceInterface, NotificationChain msgs) {
		XRefExternalInterface oldXRefInstanceInterface = xRefInstanceInterface;
		xRefInstanceInterface = newXRefInstanceInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SI_INSTANCE_INTERFACE_MAP__XREF_INSTANCE_INTERFACE, oldXRefInstanceInterface, newXRefInstanceInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefInstanceInterface(XRefExternalInterface newXRefInstanceInterface) {
		if (newXRefInstanceInterface != xRefInstanceInterface) {
			NotificationChain msgs = null;
			if (xRefInstanceInterface != null)
				msgs = ((InternalEObject)xRefInstanceInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SI_INSTANCE_INTERFACE_MAP__XREF_INSTANCE_INTERFACE, null, msgs);
			if (newXRefInstanceInterface != null)
				msgs = ((InternalEObject)newXRefInstanceInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SI_INSTANCE_INTERFACE_MAP__XREF_INSTANCE_INTERFACE, null, msgs);
			msgs = basicSetXRefInstanceInterface(newXRefInstanceInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SI_INSTANCE_INTERFACE_MAP__XREF_INSTANCE_INTERFACE, newXRefInstanceInterface, newXRefInstanceInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SiInstancePortMap> getSiInstancePortMap() {
		if (siInstancePortMap == null) {
			siInstancePortMap = new EObjectContainmentEList<SiInstancePortMap>(SiInstancePortMap.class, this, ModelPackage.SI_INSTANCE_INTERFACE_MAP__SI_INSTANCE_PORT_MAP);
		}
		return siInstancePortMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SI_INSTANCE_INTERFACE_MAP__XREF_INSTANCE_INTERFACE:
				return basicSetXRefInstanceInterface(null, msgs);
			case ModelPackage.SI_INSTANCE_INTERFACE_MAP__SI_INSTANCE_PORT_MAP:
				return ((InternalEList<?>)getSiInstancePortMap()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.SI_INSTANCE_INTERFACE_MAP__XREF_INSTANCE_INTERFACE:
				return getXRefInstanceInterface();
			case ModelPackage.SI_INSTANCE_INTERFACE_MAP__SI_INSTANCE_PORT_MAP:
				return getSiInstancePortMap();
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
			case ModelPackage.SI_INSTANCE_INTERFACE_MAP__XREF_INSTANCE_INTERFACE:
				setXRefInstanceInterface((XRefExternalInterface)newValue);
				return;
			case ModelPackage.SI_INSTANCE_INTERFACE_MAP__SI_INSTANCE_PORT_MAP:
				getSiInstancePortMap().clear();
				getSiInstancePortMap().addAll((Collection<? extends SiInstancePortMap>)newValue);
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
			case ModelPackage.SI_INSTANCE_INTERFACE_MAP__XREF_INSTANCE_INTERFACE:
				setXRefInstanceInterface((XRefExternalInterface)null);
				return;
			case ModelPackage.SI_INSTANCE_INTERFACE_MAP__SI_INSTANCE_PORT_MAP:
				getSiInstancePortMap().clear();
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
			case ModelPackage.SI_INSTANCE_INTERFACE_MAP__XREF_INSTANCE_INTERFACE:
				return xRefInstanceInterface != null;
			case ModelPackage.SI_INSTANCE_INTERFACE_MAP__SI_INSTANCE_PORT_MAP:
				return siInstancePortMap != null && !siInstancePortMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SiInstanceInterfaceMapImpl
