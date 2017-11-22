/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.ProductInterfaceMap;
import Essence.ProductPadMap;
import Essence.ProductPinMap;
import Essence.XRefConnection;

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
 * An implementation of the model object '<em><b>Product Interface Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.ProductInterfaceMapImpl#getXRefConnection <em>XRef Connection</em>}</li>
 *   <li>{@link Essence.impl.ProductInterfaceMapImpl#getProductPinMap <em>Product Pin Map</em>}</li>
 *   <li>{@link Essence.impl.ProductInterfaceMapImpl#getProductPadMap <em>Product Pad Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductInterfaceMapImpl extends SingleSourceNodeImpl implements ProductInterfaceMap {
	/**
	 * The cached value of the '{@link #getXRefConnection() <em>XRef Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefConnection()
	 * @generated
	 * @ordered
	 */
	protected XRefConnection xRefConnection;

	/**
	 * The cached value of the '{@link #getProductPinMap() <em>Product Pin Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPinMap()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductPinMap> productPinMap;

	/**
	 * The cached value of the '{@link #getProductPadMap() <em>Product Pad Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPadMap()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductPadMap> productPadMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductInterfaceMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getProductInterfaceMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefConnection getXRefConnection() {
		return xRefConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefConnection(XRefConnection newXRefConnection, NotificationChain msgs) {
		XRefConnection oldXRefConnection = xRefConnection;
		xRefConnection = newXRefConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.PRODUCT_INTERFACE_MAP__XREF_CONNECTION, oldXRefConnection, newXRefConnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefConnection(XRefConnection newXRefConnection) {
		if (newXRefConnection != xRefConnection) {
			NotificationChain msgs = null;
			if (xRefConnection != null)
				msgs = ((InternalEObject)xRefConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.PRODUCT_INTERFACE_MAP__XREF_CONNECTION, null, msgs);
			if (newXRefConnection != null)
				msgs = ((InternalEObject)newXRefConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.PRODUCT_INTERFACE_MAP__XREF_CONNECTION, null, msgs);
			msgs = basicSetXRefConnection(newXRefConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.PRODUCT_INTERFACE_MAP__XREF_CONNECTION, newXRefConnection, newXRefConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductPinMap> getProductPinMap() {
		if (productPinMap == null) {
			productPinMap = new EObjectContainmentEList<ProductPinMap>(ProductPinMap.class, this, EssencePackage.PRODUCT_INTERFACE_MAP__PRODUCT_PIN_MAP);
		}
		return productPinMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductPadMap> getProductPadMap() {
		if (productPadMap == null) {
			productPadMap = new EObjectContainmentEList<ProductPadMap>(ProductPadMap.class, this, EssencePackage.PRODUCT_INTERFACE_MAP__PRODUCT_PAD_MAP);
		}
		return productPadMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.PRODUCT_INTERFACE_MAP__XREF_CONNECTION:
				return basicSetXRefConnection(null, msgs);
			case EssencePackage.PRODUCT_INTERFACE_MAP__PRODUCT_PIN_MAP:
				return ((InternalEList<?>)getProductPinMap()).basicRemove(otherEnd, msgs);
			case EssencePackage.PRODUCT_INTERFACE_MAP__PRODUCT_PAD_MAP:
				return ((InternalEList<?>)getProductPadMap()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.PRODUCT_INTERFACE_MAP__XREF_CONNECTION:
				return getXRefConnection();
			case EssencePackage.PRODUCT_INTERFACE_MAP__PRODUCT_PIN_MAP:
				return getProductPinMap();
			case EssencePackage.PRODUCT_INTERFACE_MAP__PRODUCT_PAD_MAP:
				return getProductPadMap();
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
			case EssencePackage.PRODUCT_INTERFACE_MAP__XREF_CONNECTION:
				setXRefConnection((XRefConnection)newValue);
				return;
			case EssencePackage.PRODUCT_INTERFACE_MAP__PRODUCT_PIN_MAP:
				getProductPinMap().clear();
				getProductPinMap().addAll((Collection<? extends ProductPinMap>)newValue);
				return;
			case EssencePackage.PRODUCT_INTERFACE_MAP__PRODUCT_PAD_MAP:
				getProductPadMap().clear();
				getProductPadMap().addAll((Collection<? extends ProductPadMap>)newValue);
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
			case EssencePackage.PRODUCT_INTERFACE_MAP__XREF_CONNECTION:
				setXRefConnection((XRefConnection)null);
				return;
			case EssencePackage.PRODUCT_INTERFACE_MAP__PRODUCT_PIN_MAP:
				getProductPinMap().clear();
				return;
			case EssencePackage.PRODUCT_INTERFACE_MAP__PRODUCT_PAD_MAP:
				getProductPadMap().clear();
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
			case EssencePackage.PRODUCT_INTERFACE_MAP__XREF_CONNECTION:
				return xRefConnection != null;
			case EssencePackage.PRODUCT_INTERFACE_MAP__PRODUCT_PIN_MAP:
				return productPinMap != null && !productPinMap.isEmpty();
			case EssencePackage.PRODUCT_INTERFACE_MAP__PRODUCT_PAD_MAP:
				return productPadMap != null && !productPadMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductInterfaceMapImpl
