/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.PadMultiplexed;
import Essence.VLNV;
import Essence.XRefSiPort;

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
 * An implementation of the model object '<em><b>Pad Multiplexed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.PadMultiplexedImpl#getExtVLNV <em>Ext VLNV</em>}</li>
 *   <li>{@link Essence.impl.PadMultiplexedImpl#getXRefPort <em>XRef Port</em>}</li>
 *   <li>{@link Essence.impl.PadMultiplexedImpl#getPortGroup <em>Port Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PadMultiplexedImpl extends SinglePadImpl implements PadMultiplexed {
	/**
	 * The cached value of the '{@link #getExtVLNV() <em>Ext VLNV</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtVLNV()
	 * @generated
	 * @ordered
	 */
	protected EList<VLNV> extVLNV;

	/**
	 * The cached value of the '{@link #getXRefPort() <em>XRef Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefPort()
	 * @generated
	 * @ordered
	 */
	protected XRefSiPort xRefPort;

	/**
	 * The default value of the '{@link #getPortGroup() <em>Port Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortGroup() <em>Port Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortGroup()
	 * @generated
	 * @ordered
	 */
	protected String portGroup = PORT_GROUP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PadMultiplexedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getPadMultiplexed();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VLNV> getExtVLNV() {
		if (extVLNV == null) {
			extVLNV = new EObjectContainmentEList<VLNV>(VLNV.class, this, EssencePackage.PAD_MULTIPLEXED__EXT_VLNV);
		}
		return extVLNV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefSiPort getXRefPort() {
		return xRefPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefPort(XRefSiPort newXRefPort, NotificationChain msgs) {
		XRefSiPort oldXRefPort = xRefPort;
		xRefPort = newXRefPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.PAD_MULTIPLEXED__XREF_PORT, oldXRefPort, newXRefPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefPort(XRefSiPort newXRefPort) {
		if (newXRefPort != xRefPort) {
			NotificationChain msgs = null;
			if (xRefPort != null)
				msgs = ((InternalEObject)xRefPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.PAD_MULTIPLEXED__XREF_PORT, null, msgs);
			if (newXRefPort != null)
				msgs = ((InternalEObject)newXRefPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.PAD_MULTIPLEXED__XREF_PORT, null, msgs);
			msgs = basicSetXRefPort(newXRefPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.PAD_MULTIPLEXED__XREF_PORT, newXRefPort, newXRefPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortGroup() {
		return portGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortGroup(String newPortGroup) {
		String oldPortGroup = portGroup;
		portGroup = newPortGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.PAD_MULTIPLEXED__PORT_GROUP, oldPortGroup, portGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.PAD_MULTIPLEXED__EXT_VLNV:
				return ((InternalEList<?>)getExtVLNV()).basicRemove(otherEnd, msgs);
			case EssencePackage.PAD_MULTIPLEXED__XREF_PORT:
				return basicSetXRefPort(null, msgs);
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
			case EssencePackage.PAD_MULTIPLEXED__EXT_VLNV:
				return getExtVLNV();
			case EssencePackage.PAD_MULTIPLEXED__XREF_PORT:
				return getXRefPort();
			case EssencePackage.PAD_MULTIPLEXED__PORT_GROUP:
				return getPortGroup();
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
			case EssencePackage.PAD_MULTIPLEXED__EXT_VLNV:
				getExtVLNV().clear();
				getExtVLNV().addAll((Collection<? extends VLNV>)newValue);
				return;
			case EssencePackage.PAD_MULTIPLEXED__XREF_PORT:
				setXRefPort((XRefSiPort)newValue);
				return;
			case EssencePackage.PAD_MULTIPLEXED__PORT_GROUP:
				setPortGroup((String)newValue);
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
			case EssencePackage.PAD_MULTIPLEXED__EXT_VLNV:
				getExtVLNV().clear();
				return;
			case EssencePackage.PAD_MULTIPLEXED__XREF_PORT:
				setXRefPort((XRefSiPort)null);
				return;
			case EssencePackage.PAD_MULTIPLEXED__PORT_GROUP:
				setPortGroup(PORT_GROUP_EDEFAULT);
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
			case EssencePackage.PAD_MULTIPLEXED__EXT_VLNV:
				return extVLNV != null && !extVLNV.isEmpty();
			case EssencePackage.PAD_MULTIPLEXED__XREF_PORT:
				return xRefPort != null;
			case EssencePackage.PAD_MULTIPLEXED__PORT_GROUP:
				return PORT_GROUP_EDEFAULT == null ? portGroup != null : !PORT_GROUP_EDEFAULT.equals(portGroup);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (portGroup: ");
		result.append(portGroup);
		result.append(')');
		return result.toString();
	}

} //PadMultiplexedImpl
