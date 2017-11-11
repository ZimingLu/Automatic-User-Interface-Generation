/**
 */
package model.impl;

import model.ModelPackage;
import model.XRefMasterInterface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XRef Master Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.XRefMasterInterfaceImpl#getRange <em>Range</em>}</li>
 *   <li>{@link model.impl.XRefMasterInterfaceImpl#getSrcOffset <em>Src Offset</em>}</li>
 *   <li>{@link model.impl.XRefMasterInterfaceImpl#getTgtOffset <em>Tgt Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XRefMasterInterfaceImpl extends XRefInternalImpl implements XRefMasterInterface {
	/**
	 * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected static final String RANGE_EDEFAULT = "1";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XRefMasterInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getXRefMasterInterface();
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XREF_MASTER_INTERFACE__RANGE, oldRange, range));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XREF_MASTER_INTERFACE__SRC_OFFSET, oldSrcOffset, srcOffset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XREF_MASTER_INTERFACE__TGT_OFFSET, oldTgtOffset, tgtOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.XREF_MASTER_INTERFACE__RANGE:
				return getRange();
			case ModelPackage.XREF_MASTER_INTERFACE__SRC_OFFSET:
				return getSrcOffset();
			case ModelPackage.XREF_MASTER_INTERFACE__TGT_OFFSET:
				return getTgtOffset();
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
			case ModelPackage.XREF_MASTER_INTERFACE__RANGE:
				setRange((String)newValue);
				return;
			case ModelPackage.XREF_MASTER_INTERFACE__SRC_OFFSET:
				setSrcOffset((String)newValue);
				return;
			case ModelPackage.XREF_MASTER_INTERFACE__TGT_OFFSET:
				setTgtOffset((String)newValue);
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
			case ModelPackage.XREF_MASTER_INTERFACE__RANGE:
				setRange(RANGE_EDEFAULT);
				return;
			case ModelPackage.XREF_MASTER_INTERFACE__SRC_OFFSET:
				setSrcOffset(SRC_OFFSET_EDEFAULT);
				return;
			case ModelPackage.XREF_MASTER_INTERFACE__TGT_OFFSET:
				setTgtOffset(TGT_OFFSET_EDEFAULT);
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
			case ModelPackage.XREF_MASTER_INTERFACE__RANGE:
				return RANGE_EDEFAULT == null ? range != null : !RANGE_EDEFAULT.equals(range);
			case ModelPackage.XREF_MASTER_INTERFACE__SRC_OFFSET:
				return SRC_OFFSET_EDEFAULT == null ? srcOffset != null : !SRC_OFFSET_EDEFAULT.equals(srcOffset);
			case ModelPackage.XREF_MASTER_INTERFACE__TGT_OFFSET:
				return TGT_OFFSET_EDEFAULT == null ? tgtOffset != null : !TGT_OFFSET_EDEFAULT.equals(tgtOffset);
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

} //XRefMasterInterfaceImpl
