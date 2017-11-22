/**
 */
package Essence.impl;

import Essence.Component;
import Essence.EssencePackage;
import Essence.Interface;
import Essence.RegMemSet;
import Essence.RegViewBlock;
import Essence.SyncMode;

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
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.ComponentImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link Essence.impl.ComponentImpl#getRegViewBlock <em>Reg View Block</em>}</li>
 *   <li>{@link Essence.impl.ComponentImpl#getTopSpinClkStyle <em>Top Spin Clk Style</em>}</li>
 *   <li>{@link Essence.impl.ComponentImpl#getRegMemSet <em>Reg Mem Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends ModelRootImpl implements Component {
	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interface_;

	/**
	 * The cached value of the '{@link #getRegViewBlock() <em>Reg View Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegViewBlock()
	 * @generated
	 * @ordered
	 */
	protected RegViewBlock regViewBlock;

	/**
	 * The default value of the '{@link #getTopSpinClkStyle() <em>Top Spin Clk Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopSpinClkStyle()
	 * @generated
	 * @ordered
	 */
	protected static final SyncMode TOP_SPIN_CLK_STYLE_EDEFAULT = SyncMode.ASYNCHRONOUS;

	/**
	 * The cached value of the '{@link #getTopSpinClkStyle() <em>Top Spin Clk Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopSpinClkStyle()
	 * @generated
	 * @ordered
	 */
	protected SyncMode topSpinClkStyle = TOP_SPIN_CLK_STYLE_EDEFAULT;

	/**
	 * This is true if the Top Spin Clk Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean topSpinClkStyleESet;

	/**
	 * The cached value of the '{@link #getRegMemSet() <em>Reg Mem Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegMemSet()
	 * @generated
	 * @ordered
	 */
	protected EList<RegMemSet> regMemSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectContainmentEList<Interface>(Interface.class, this, EssencePackage.COMPONENT__INTERFACE);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegViewBlock getRegViewBlock() {
		return regViewBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegViewBlock(RegViewBlock newRegViewBlock, NotificationChain msgs) {
		RegViewBlock oldRegViewBlock = regViewBlock;
		regViewBlock = newRegViewBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.COMPONENT__REG_VIEW_BLOCK, oldRegViewBlock, newRegViewBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegViewBlock(RegViewBlock newRegViewBlock) {
		if (newRegViewBlock != regViewBlock) {
			NotificationChain msgs = null;
			if (regViewBlock != null)
				msgs = ((InternalEObject)regViewBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.COMPONENT__REG_VIEW_BLOCK, null, msgs);
			if (newRegViewBlock != null)
				msgs = ((InternalEObject)newRegViewBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.COMPONENT__REG_VIEW_BLOCK, null, msgs);
			msgs = basicSetRegViewBlock(newRegViewBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.COMPONENT__REG_VIEW_BLOCK, newRegViewBlock, newRegViewBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncMode getTopSpinClkStyle() {
		return topSpinClkStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopSpinClkStyle(SyncMode newTopSpinClkStyle) {
		SyncMode oldTopSpinClkStyle = topSpinClkStyle;
		topSpinClkStyle = newTopSpinClkStyle == null ? TOP_SPIN_CLK_STYLE_EDEFAULT : newTopSpinClkStyle;
		boolean oldTopSpinClkStyleESet = topSpinClkStyleESet;
		topSpinClkStyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.COMPONENT__TOP_SPIN_CLK_STYLE, oldTopSpinClkStyle, topSpinClkStyle, !oldTopSpinClkStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTopSpinClkStyle() {
		SyncMode oldTopSpinClkStyle = topSpinClkStyle;
		boolean oldTopSpinClkStyleESet = topSpinClkStyleESet;
		topSpinClkStyle = TOP_SPIN_CLK_STYLE_EDEFAULT;
		topSpinClkStyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EssencePackage.COMPONENT__TOP_SPIN_CLK_STYLE, oldTopSpinClkStyle, TOP_SPIN_CLK_STYLE_EDEFAULT, oldTopSpinClkStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTopSpinClkStyle() {
		return topSpinClkStyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegMemSet> getRegMemSet() {
		if (regMemSet == null) {
			regMemSet = new EObjectContainmentEList<RegMemSet>(RegMemSet.class, this, EssencePackage.COMPONENT__REG_MEM_SET);
		}
		return regMemSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.COMPONENT__INTERFACE:
				return ((InternalEList<?>)getInterface()).basicRemove(otherEnd, msgs);
			case EssencePackage.COMPONENT__REG_VIEW_BLOCK:
				return basicSetRegViewBlock(null, msgs);
			case EssencePackage.COMPONENT__REG_MEM_SET:
				return ((InternalEList<?>)getRegMemSet()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.COMPONENT__INTERFACE:
				return getInterface();
			case EssencePackage.COMPONENT__REG_VIEW_BLOCK:
				return getRegViewBlock();
			case EssencePackage.COMPONENT__TOP_SPIN_CLK_STYLE:
				return getTopSpinClkStyle();
			case EssencePackage.COMPONENT__REG_MEM_SET:
				return getRegMemSet();
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
			case EssencePackage.COMPONENT__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends Interface>)newValue);
				return;
			case EssencePackage.COMPONENT__REG_VIEW_BLOCK:
				setRegViewBlock((RegViewBlock)newValue);
				return;
			case EssencePackage.COMPONENT__TOP_SPIN_CLK_STYLE:
				setTopSpinClkStyle((SyncMode)newValue);
				return;
			case EssencePackage.COMPONENT__REG_MEM_SET:
				getRegMemSet().clear();
				getRegMemSet().addAll((Collection<? extends RegMemSet>)newValue);
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
			case EssencePackage.COMPONENT__INTERFACE:
				getInterface().clear();
				return;
			case EssencePackage.COMPONENT__REG_VIEW_BLOCK:
				setRegViewBlock((RegViewBlock)null);
				return;
			case EssencePackage.COMPONENT__TOP_SPIN_CLK_STYLE:
				unsetTopSpinClkStyle();
				return;
			case EssencePackage.COMPONENT__REG_MEM_SET:
				getRegMemSet().clear();
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
			case EssencePackage.COMPONENT__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
			case EssencePackage.COMPONENT__REG_VIEW_BLOCK:
				return regViewBlock != null;
			case EssencePackage.COMPONENT__TOP_SPIN_CLK_STYLE:
				return isSetTopSpinClkStyle();
			case EssencePackage.COMPONENT__REG_MEM_SET:
				return regMemSet != null && !regMemSet.isEmpty();
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
		result.append(" (topSpinClkStyle: ");
		if (topSpinClkStyleESet) result.append(topSpinClkStyle); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
