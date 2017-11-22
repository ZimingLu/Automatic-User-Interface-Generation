/**
 */
package Essence.impl;

import Essence.BitFieldElement;
import Essence.EssencePackage;
import Essence.RegisterView;

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
 * An implementation of the model object '<em><b>Register View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.RegisterViewImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link Essence.impl.RegisterViewImpl#getDepthVar <em>Depth Var</em>}</li>
 *   <li>{@link Essence.impl.RegisterViewImpl#getBitFieldElement <em>Bit Field Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegisterViewImpl extends IndexVarUserImpl implements RegisterView {
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
		return EssencePackage.eINSTANCE.getRegisterView();
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
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.REGISTER_VIEW__DEPTH, oldDepth, depth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.REGISTER_VIEW__DEPTH_VAR, oldDepthVar, depthVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BitFieldElement> getBitFieldElement() {
		if (bitFieldElement == null) {
			bitFieldElement = new EObjectContainmentEList<BitFieldElement>(BitFieldElement.class, this, EssencePackage.REGISTER_VIEW__BIT_FIELD_ELEMENT);
		}
		return bitFieldElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.REGISTER_VIEW__BIT_FIELD_ELEMENT:
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
			case EssencePackage.REGISTER_VIEW__DEPTH:
				return getDepth();
			case EssencePackage.REGISTER_VIEW__DEPTH_VAR:
				return getDepthVar();
			case EssencePackage.REGISTER_VIEW__BIT_FIELD_ELEMENT:
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
			case EssencePackage.REGISTER_VIEW__DEPTH:
				setDepth((String)newValue);
				return;
			case EssencePackage.REGISTER_VIEW__DEPTH_VAR:
				setDepthVar((String)newValue);
				return;
			case EssencePackage.REGISTER_VIEW__BIT_FIELD_ELEMENT:
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
			case EssencePackage.REGISTER_VIEW__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case EssencePackage.REGISTER_VIEW__DEPTH_VAR:
				setDepthVar(DEPTH_VAR_EDEFAULT);
				return;
			case EssencePackage.REGISTER_VIEW__BIT_FIELD_ELEMENT:
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
			case EssencePackage.REGISTER_VIEW__DEPTH:
				return DEPTH_EDEFAULT == null ? depth != null : !DEPTH_EDEFAULT.equals(depth);
			case EssencePackage.REGISTER_VIEW__DEPTH_VAR:
				return DEPTH_VAR_EDEFAULT == null ? depthVar != null : !DEPTH_VAR_EDEFAULT.equals(depthVar);
			case EssencePackage.REGISTER_VIEW__BIT_FIELD_ELEMENT:
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
