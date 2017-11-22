/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.XRefInstance;
import Essence.XRefSlaveInterface;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XRef Slave Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.XRefSlaveInterfaceImpl#getRange <em>Range</em>}</li>
 *   <li>{@link Essence.impl.XRefSlaveInterfaceImpl#getSrcOffset <em>Src Offset</em>}</li>
 *   <li>{@link Essence.impl.XRefSlaveInterfaceImpl#getTgtOffset <em>Tgt Offset</em>}</li>
 *   <li>{@link Essence.impl.XRefSlaveInterfaceImpl#getXRefInstance <em>XRef Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XRefSlaveInterfaceImpl extends XRefExternalImpl implements XRefSlaveInterface {
	/**
	 * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected static final String RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected String range = RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrcOffset() <em>Src Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrcOffset() <em>Src Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcOffset()
	 * @generated
	 * @ordered
	 */
	protected String srcOffset = SRC_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getTgtOffset() <em>Tgt Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTgtOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String TGT_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTgtOffset() <em>Tgt Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTgtOffset()
	 * @generated
	 * @ordered
	 */
	protected String tgtOffset = TGT_OFFSET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXRefInstance() <em>XRef Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefInstance()
	 * @generated
	 * @ordered
	 */
	protected XRefInstance xRefInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XRefSlaveInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getXRefSlaveInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(String newRange) {
		String oldRange = range;
		range = newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.XREF_SLAVE_INTERFACE__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrcOffset() {
		return srcOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcOffset(String newSrcOffset) {
		String oldSrcOffset = srcOffset;
		srcOffset = newSrcOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.XREF_SLAVE_INTERFACE__SRC_OFFSET, oldSrcOffset, srcOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTgtOffset() {
		return tgtOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTgtOffset(String newTgtOffset) {
		String oldTgtOffset = tgtOffset;
		tgtOffset = newTgtOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.XREF_SLAVE_INTERFACE__TGT_OFFSET, oldTgtOffset, tgtOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefInstance getXRefInstance() {
		return xRefInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefInstance(XRefInstance newXRefInstance, NotificationChain msgs) {
		XRefInstance oldXRefInstance = xRefInstance;
		xRefInstance = newXRefInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.XREF_SLAVE_INTERFACE__XREF_INSTANCE, oldXRefInstance, newXRefInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefInstance(XRefInstance newXRefInstance) {
		if (newXRefInstance != xRefInstance) {
			NotificationChain msgs = null;
			if (xRefInstance != null)
				msgs = ((InternalEObject)xRefInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.XREF_SLAVE_INTERFACE__XREF_INSTANCE, null, msgs);
			if (newXRefInstance != null)
				msgs = ((InternalEObject)newXRefInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.XREF_SLAVE_INTERFACE__XREF_INSTANCE, null, msgs);
			msgs = basicSetXRefInstance(newXRefInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.XREF_SLAVE_INTERFACE__XREF_INSTANCE, newXRefInstance, newXRefInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.XREF_SLAVE_INTERFACE__XREF_INSTANCE:
				return basicSetXRefInstance(null, msgs);
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
			case EssencePackage.XREF_SLAVE_INTERFACE__RANGE:
				return getRange();
			case EssencePackage.XREF_SLAVE_INTERFACE__SRC_OFFSET:
				return getSrcOffset();
			case EssencePackage.XREF_SLAVE_INTERFACE__TGT_OFFSET:
				return getTgtOffset();
			case EssencePackage.XREF_SLAVE_INTERFACE__XREF_INSTANCE:
				return getXRefInstance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EssencePackage.XREF_SLAVE_INTERFACE__RANGE:
				setRange((String)newValue);
				return;
			case EssencePackage.XREF_SLAVE_INTERFACE__SRC_OFFSET:
				setSrcOffset((String)newValue);
				return;
			case EssencePackage.XREF_SLAVE_INTERFACE__TGT_OFFSET:
				setTgtOffset((String)newValue);
				return;
			case EssencePackage.XREF_SLAVE_INTERFACE__XREF_INSTANCE:
				setXRefInstance((XRefInstance)newValue);
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
			case EssencePackage.XREF_SLAVE_INTERFACE__RANGE:
				setRange(RANGE_EDEFAULT);
				return;
			case EssencePackage.XREF_SLAVE_INTERFACE__SRC_OFFSET:
				setSrcOffset(SRC_OFFSET_EDEFAULT);
				return;
			case EssencePackage.XREF_SLAVE_INTERFACE__TGT_OFFSET:
				setTgtOffset(TGT_OFFSET_EDEFAULT);
				return;
			case EssencePackage.XREF_SLAVE_INTERFACE__XREF_INSTANCE:
				setXRefInstance((XRefInstance)null);
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
			case EssencePackage.XREF_SLAVE_INTERFACE__RANGE:
				return RANGE_EDEFAULT == null ? range != null : !RANGE_EDEFAULT.equals(range);
			case EssencePackage.XREF_SLAVE_INTERFACE__SRC_OFFSET:
				return SRC_OFFSET_EDEFAULT == null ? srcOffset != null : !SRC_OFFSET_EDEFAULT.equals(srcOffset);
			case EssencePackage.XREF_SLAVE_INTERFACE__TGT_OFFSET:
				return TGT_OFFSET_EDEFAULT == null ? tgtOffset != null : !TGT_OFFSET_EDEFAULT.equals(tgtOffset);
			case EssencePackage.XREF_SLAVE_INTERFACE__XREF_INSTANCE:
				return xRefInstance != null;
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
		result.append(" (range: ");
		result.append(range);
		result.append(", srcOffset: ");
		result.append(srcOffset);
		result.append(", tgtOffset: ");
		result.append(tgtOffset);
		result.append(')');
		return result.toString();
	}

} //XRefSlaveInterfaceImpl
