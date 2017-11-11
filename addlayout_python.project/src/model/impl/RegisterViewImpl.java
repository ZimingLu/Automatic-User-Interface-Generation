/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import model.AccessLevel;
import model.BitFieldElement;
import model.ModelPackage;
import model.RegisterView;

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
 * An implementation of the model object '<em><b>Register View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.RegisterViewImpl#getCommonAccessLevel <em>Common Access Level</em>}</li>
 *   <li>{@link model.impl.RegisterViewImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link model.impl.RegisterViewImpl#getDepthVar <em>Depth Var</em>}</li>
 *   <li>{@link model.impl.RegisterViewImpl#getBitFieldElement <em>Bit Field Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegisterViewImpl extends IndexVarUserImpl implements RegisterView {
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
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected String depth = DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepthVar() <em>Depth Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepthVar()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPTH_VAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepthVar() <em>Depth Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepthVar()
	 * @generated
	 * @ordered
	 */
	protected String depthVar = DEPTH_VAR_EDEFAULT;

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
	protected RegisterViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getRegisterView();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccessLevel> getCommonAccessLevel() {
		if (commonAccessLevel == null) {
			commonAccessLevel = new EObjectContainmentEList<AccessLevel>(AccessLevel.class, this, ModelPackage.REGISTER_VIEW__COMMON_ACCESS_LEVEL);
		}
		return commonAccessLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDepth() {
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(String newDepth) {
		String oldDepth = depth;
		depth = newDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGISTER_VIEW__DEPTH, oldDepth, depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDepthVar() {
		return depthVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepthVar(String newDepthVar) {
		String oldDepthVar = depthVar;
		depthVar = newDepthVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REGISTER_VIEW__DEPTH_VAR, oldDepthVar, depthVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BitFieldElement> getBitFieldElement() {
		if (bitFieldElement == null) {
			bitFieldElement = new EObjectContainmentEList<BitFieldElement>(BitFieldElement.class, this, ModelPackage.REGISTER_VIEW__BIT_FIELD_ELEMENT);
		}
		return bitFieldElement;
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
			case ModelPackage.REGISTER_VIEW__COMMON_ACCESS_LEVEL:
				return ((InternalEList<?>)getCommonAccessLevel()).basicRemove(otherEnd, msgs);
			case ModelPackage.REGISTER_VIEW__BIT_FIELD_ELEMENT:
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
			case ModelPackage.REGISTER_VIEW__COMMON_ACCESS_LEVEL:
				return getCommonAccessLevel();
			case ModelPackage.REGISTER_VIEW__DEPTH:
				return getDepth();
			case ModelPackage.REGISTER_VIEW__DEPTH_VAR:
				return getDepthVar();
			case ModelPackage.REGISTER_VIEW__BIT_FIELD_ELEMENT:
				return getBitFieldElement();
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
			case ModelPackage.REGISTER_VIEW__COMMON_ACCESS_LEVEL:
				getCommonAccessLevel().clear();
				getCommonAccessLevel().addAll((Collection<? extends AccessLevel>)newValue);
				return;
			case ModelPackage.REGISTER_VIEW__DEPTH:
				setDepth((String)newValue);
				return;
			case ModelPackage.REGISTER_VIEW__DEPTH_VAR:
				setDepthVar((String)newValue);
				return;
			case ModelPackage.REGISTER_VIEW__BIT_FIELD_ELEMENT:
				getBitFieldElement().clear();
				getBitFieldElement().addAll((Collection<? extends BitFieldElement>)newValue);
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
			case ModelPackage.REGISTER_VIEW__COMMON_ACCESS_LEVEL:
				getCommonAccessLevel().clear();
				return;
			case ModelPackage.REGISTER_VIEW__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case ModelPackage.REGISTER_VIEW__DEPTH_VAR:
				setDepthVar(DEPTH_VAR_EDEFAULT);
				return;
			case ModelPackage.REGISTER_VIEW__BIT_FIELD_ELEMENT:
				getBitFieldElement().clear();
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
			case ModelPackage.REGISTER_VIEW__COMMON_ACCESS_LEVEL:
				return commonAccessLevel != null && !commonAccessLevel.isEmpty();
			case ModelPackage.REGISTER_VIEW__DEPTH:
				return DEPTH_EDEFAULT == null ? depth != null : !DEPTH_EDEFAULT.equals(depth);
			case ModelPackage.REGISTER_VIEW__DEPTH_VAR:
				return DEPTH_VAR_EDEFAULT == null ? depthVar != null : !DEPTH_VAR_EDEFAULT.equals(depthVar);
			case ModelPackage.REGISTER_VIEW__BIT_FIELD_ELEMENT:
				return bitFieldElement != null && !bitFieldElement.isEmpty();
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
				case ModelPackage.REGISTER_VIEW__COMMON_ACCESS_LEVEL: return ModelextensionPackage.COMMON_ACCESS_LEVEL__COMMON_ACCESS_LEVEL;
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
				case ModelextensionPackage.COMMON_ACCESS_LEVEL__COMMON_ACCESS_LEVEL: return ModelPackage.REGISTER_VIEW__COMMON_ACCESS_LEVEL;
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
				case ModelextensionPackage.COMMON_ACCESS_LEVEL___REFRESH_COMMON_ACCESS_LEVEL: return ModelPackage.REGISTER_VIEW___REFRESH_COMMON_ACCESS_LEVEL;
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
			case ModelPackage.REGISTER_VIEW___REFRESH_COMMON_ACCESS_LEVEL:
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
		result.append(" (depth: ");
		result.append(depth);
		result.append(", depthVar: ");
		result.append(depthVar);
		result.append(')');
		return result.toString();
	}

} //RegisterViewImpl
