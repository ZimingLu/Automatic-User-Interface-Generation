/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import model.AccessLevel;
import model.BitField;
import model.BitFieldElement;
import model.BitFieldSequence;
import model.ModelPackage;
import model.Register;
import model.TopSpinType;
import model.XRefRegisterView;

import modelextension.CommonAccessLevel;
import modelextension.ModelextensionPackage;

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
 * An implementation of the model object '<em><b>Register</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.RegisterImpl#getCommonAccessLevel <em>Common Access Level</em>}</li>
 *   <li>{@link model.impl.RegisterImpl#getMirrorSize <em>Mirror Size</em>}</li>
 *   <li>{@link model.impl.RegisterImpl#getTopSpinType <em>Top Spin Type</em>}</li>
 *   <li>{@link model.impl.RegisterImpl#getXRefRegisterView <em>XRef Register View</em>}</li>
 *   <li>{@link model.impl.RegisterImpl#getBitFieldElement <em>Bit Field Element</em>}</li>
 *   <li>{@link model.impl.RegisterImpl#getBitField <em>Bit Field</em>}</li>
 *   <li>{@link model.impl.RegisterImpl#getBitFieldSequence <em>Bit Field Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegisterImpl extends GeneralRegisterImpl implements Register {
	/**
	 * The cached value of the '{@link #getCommonAccessLevel() <em>Common Access Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonAccessLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<AccessLevel> commonAccessLevel;

	/**
	 * The default value of the '{@link #getMirrorSize() <em>Mirror Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMirrorSize()
	 * @generated
	 * @ordered
	 */
	protected static final String MIRROR_SIZE_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getMirrorSize() <em>Mirror Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMirrorSize()
	 * @generated
	 * @ordered
	 */
	protected String mirrorSize = MIRROR_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopSpinType() <em>Top Spin Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopSpinType()
	 * @generated
	 * @ordered
	 */
	protected static final TopSpinType TOP_SPIN_TYPE_EDEFAULT = TopSpinType.NO_TOP_SPIN;

	/**
	 * The cached value of the '{@link #getTopSpinType() <em>Top Spin Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopSpinType()
	 * @generated
	 * @ordered
	 */
	protected TopSpinType topSpinType = TOP_SPIN_TYPE_EDEFAULT;

	/**
	 * This is true if the Top Spin Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean topSpinTypeESet;

	/**
	 * The cached value of the '{@link #getXRefRegisterView() <em>XRef Register View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefRegisterView()
	 * @generated
	 * @ordered
	 */
	protected XRefRegisterView xRefRegisterView;

	/**
	 * The cached value of the '{@link #getBitFieldElement() <em>Bit Field Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitFieldElement()
	 * @generated
	 * @ordered
	 */
	protected EList<BitFieldElement> bitFieldElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getRegister();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccessLevel> getCommonAccessLevel() {
		if (commonAccessLevel == null) {
			commonAccessLevel = new EObjectContainmentEList<AccessLevel>(AccessLevel.class, this, ModelPackage.REGISTER__COMMON_ACCESS_LEVEL);
		}
		return commonAccessLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMirrorSize() {
		return mirrorSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMirrorSize(String newMirrorSize) {
		String oldMirrorSize = mirrorSize;
		mirrorSize = newMirrorSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGISTER__MIRROR_SIZE, oldMirrorSize, mirrorSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopSpinType getTopSpinType() {
		return topSpinType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopSpinType(TopSpinType newTopSpinType) {
		TopSpinType oldTopSpinType = topSpinType;
		topSpinType = newTopSpinType == null ? TOP_SPIN_TYPE_EDEFAULT : newTopSpinType;
		boolean oldTopSpinTypeESet = topSpinTypeESet;
		topSpinTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGISTER__TOP_SPIN_TYPE, oldTopSpinType, topSpinType, !oldTopSpinTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTopSpinType() {
		TopSpinType oldTopSpinType = topSpinType;
		boolean oldTopSpinTypeESet = topSpinTypeESet;
		topSpinType = TOP_SPIN_TYPE_EDEFAULT;
		topSpinTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.REGISTER__TOP_SPIN_TYPE, oldTopSpinType, TOP_SPIN_TYPE_EDEFAULT, oldTopSpinTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTopSpinType() {
		return topSpinTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefRegisterView getXRefRegisterView() {
		return xRefRegisterView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefRegisterView(XRefRegisterView newXRefRegisterView, NotificationChain msgs) {
		XRefRegisterView oldXRefRegisterView = xRefRegisterView;
		xRefRegisterView = newXRefRegisterView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.REGISTER__XREF_REGISTER_VIEW, oldXRefRegisterView, newXRefRegisterView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefRegisterView(XRefRegisterView newXRefRegisterView) {
		if (newXRefRegisterView != xRefRegisterView) {
			NotificationChain msgs = null;
			if (xRefRegisterView != null)
				msgs = ((InternalEObject)xRefRegisterView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.REGISTER__XREF_REGISTER_VIEW, null, msgs);
			if (newXRefRegisterView != null)
				msgs = ((InternalEObject)newXRefRegisterView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.REGISTER__XREF_REGISTER_VIEW, null, msgs);
			msgs = basicSetXRefRegisterView(newXRefRegisterView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGISTER__XREF_REGISTER_VIEW, newXRefRegisterView, newXRefRegisterView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BitFieldElement> getBitFieldElement() {
		if (bitFieldElement == null) {
			bitFieldElement = new EObjectContainmentEList<BitFieldElement>(BitFieldElement.class, this, ModelPackage.REGISTER__BIT_FIELD_ELEMENT);
		}
		return bitFieldElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BitField> getBitField() {
				EList<BitField> result = new org.eclipse.emf.common.util.BasicEList<BitField>();
				for (BitFieldElement element : getBitFieldElement()) {
					if (element instanceof BitField) {
						result.add((BitField) element);
					}
				}
				return new org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList<BitField>(this, EssencePackage.eINSTANCE.getRegister_BitField(), result.size(), result.toArray());
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BitFieldSequence> getBitFieldSequence() {
				EList<BitFieldSequence> result = new org.eclipse.emf.common.util.BasicEList<BitFieldSequence>();
				for (BitFieldElement element : getBitFieldElement()) {
					if (element instanceof BitFieldSequence) {
						result.add((BitFieldSequence) element);
					}
				}
				return new org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList<BitFieldSequence>(this, EssencePackage.eINSTANCE.getRegister_BitFieldSequence(), result.size(), result.toArray());
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refreshCommonAccessLevel() {
		if (commonAccessLevel != null) {
			commonAccessLevel.clear();
			commonAccessLevel.addAll(InternalModelServiceImpl.BUSINESSLOGICSERVICE.getCommonAccessLevel(this));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.REGISTER__COMMON_ACCESS_LEVEL:
				return ((InternalEList<?>)getCommonAccessLevel()).basicRemove(otherEnd, msgs);
			case ModelPackage.REGISTER__XREF_REGISTER_VIEW:
				return basicSetXRefRegisterView(null, msgs);
			case ModelPackage.REGISTER__BIT_FIELD_ELEMENT:
				return ((InternalEList<?>)getBitFieldElement()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.REGISTER__COMMON_ACCESS_LEVEL:
				return getCommonAccessLevel();
			case ModelPackage.REGISTER__MIRROR_SIZE:
				return getMirrorSize();
			case ModelPackage.REGISTER__TOP_SPIN_TYPE:
				return getTopSpinType();
			case ModelPackage.REGISTER__XREF_REGISTER_VIEW:
				return getXRefRegisterView();
			case ModelPackage.REGISTER__BIT_FIELD_ELEMENT:
				return getBitFieldElement();
			case ModelPackage.REGISTER__BIT_FIELD:
				return getBitField();
			case ModelPackage.REGISTER__BIT_FIELD_SEQUENCE:
				return getBitFieldSequence();
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
			case ModelPackage.REGISTER__COMMON_ACCESS_LEVEL:
				getCommonAccessLevel().clear();
				getCommonAccessLevel().addAll((Collection<? extends AccessLevel>)newValue);
				return;
			case ModelPackage.REGISTER__MIRROR_SIZE:
				setMirrorSize((String)newValue);
				return;
			case ModelPackage.REGISTER__TOP_SPIN_TYPE:
				setTopSpinType((TopSpinType)newValue);
				return;
			case ModelPackage.REGISTER__XREF_REGISTER_VIEW:
				setXRefRegisterView((XRefRegisterView)newValue);
				return;
			case ModelPackage.REGISTER__BIT_FIELD_ELEMENT:
				getBitFieldElement().clear();
				getBitFieldElement().addAll((Collection<? extends BitFieldElement>)newValue);
				return;
			case ModelPackage.REGISTER__BIT_FIELD:
				getBitField().clear();
				getBitField().addAll((Collection<? extends BitField>)newValue);
				return;
			case ModelPackage.REGISTER__BIT_FIELD_SEQUENCE:
				getBitFieldSequence().clear();
				getBitFieldSequence().addAll((Collection<? extends BitFieldSequence>)newValue);
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
			case ModelPackage.REGISTER__COMMON_ACCESS_LEVEL:
				getCommonAccessLevel().clear();
				return;
			case ModelPackage.REGISTER__MIRROR_SIZE:
				setMirrorSize(MIRROR_SIZE_EDEFAULT);
				return;
			case ModelPackage.REGISTER__TOP_SPIN_TYPE:
				unsetTopSpinType();
				return;
			case ModelPackage.REGISTER__XREF_REGISTER_VIEW:
				setXRefRegisterView((XRefRegisterView)null);
				return;
			case ModelPackage.REGISTER__BIT_FIELD_ELEMENT:
				getBitFieldElement().clear();
				return;
			case ModelPackage.REGISTER__BIT_FIELD:
				getBitField().clear();
				return;
			case ModelPackage.REGISTER__BIT_FIELD_SEQUENCE:
				getBitFieldSequence().clear();
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
			case ModelPackage.REGISTER__COMMON_ACCESS_LEVEL:
				return commonAccessLevel != null && !commonAccessLevel.isEmpty();
			case ModelPackage.REGISTER__MIRROR_SIZE:
				return MIRROR_SIZE_EDEFAULT == null ? mirrorSize != null : !MIRROR_SIZE_EDEFAULT.equals(mirrorSize);
			case ModelPackage.REGISTER__TOP_SPIN_TYPE:
				return isSetTopSpinType();
			case ModelPackage.REGISTER__XREF_REGISTER_VIEW:
				return xRefRegisterView != null;
			case ModelPackage.REGISTER__BIT_FIELD_ELEMENT:
				return bitFieldElement != null && !bitFieldElement.isEmpty();
			case ModelPackage.REGISTER__BIT_FIELD:
				return !getBitField().isEmpty();
			case ModelPackage.REGISTER__BIT_FIELD_SEQUENCE:
				return !getBitFieldSequence().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CommonAccessLevel.class) {
			switch (derivedFeatureID) {
				case ModelPackage.REGISTER__COMMON_ACCESS_LEVEL: return ModelextensionPackage.COMMON_ACCESS_LEVEL__COMMON_ACCESS_LEVEL;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CommonAccessLevel.class) {
			switch (baseFeatureID) {
				case ModelextensionPackage.COMMON_ACCESS_LEVEL__COMMON_ACCESS_LEVEL: return ModelPackage.REGISTER__COMMON_ACCESS_LEVEL;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == CommonAccessLevel.class) {
			switch (baseOperationID) {
				case ModelextensionPackage.COMMON_ACCESS_LEVEL___REFRESH_COMMON_ACCESS_LEVEL: return ModelPackage.REGISTER___REFRESH_COMMON_ACCESS_LEVEL;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.REGISTER___REFRESH_COMMON_ACCESS_LEVEL:
				refreshCommonAccessLevel();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (mirrorSize: ");
		result.append(mirrorSize);
		result.append(", topSpinType: ");
		if (topSpinTypeESet) result.append(topSpinType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RegisterImpl
