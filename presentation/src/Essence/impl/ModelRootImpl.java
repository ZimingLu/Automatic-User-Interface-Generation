/**
 */
package Essence.impl;

import Essence.ConstDefBlock;
import Essence.EssencePackage;
import Essence.GenericDeclBlock;
import Essence.ModelRoot;
import Essence.Module;
import Essence.ParamDeclBlock;
import Essence.VLNV;

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
 * An implementation of the model object '<em><b>Model Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.ModelRootImpl#getConstDefBlock <em>Const Def Block</em>}</li>
 *   <li>{@link Essence.impl.ModelRootImpl#getEssenceVersion <em>Essence Version</em>}</li>
 *   <li>{@link Essence.impl.ModelRootImpl#getGenericDeclBlock <em>Generic Decl Block</em>}</li>
 *   <li>{@link Essence.impl.ModelRootImpl#getModule <em>Module</em>}</li>
 *   <li>{@link Essence.impl.ModelRootImpl#getParamDeclBlock <em>Param Decl Block</em>}</li>
 *   <li>{@link Essence.impl.ModelRootImpl#getVLNV <em>VLNV</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelRootImpl extends SingleSourceNodeImpl implements ModelRoot {
	/**
	 * The cached value of the '{@link #getConstDefBlock() <em>Const Def Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstDefBlock()
	 * @generated
	 * @ordered
	 */
	protected ConstDefBlock constDefBlock;

	/**
	 * The default value of the '{@link #getEssenceVersion() <em>Essence Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEssenceVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int ESSENCE_VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEssenceVersion() <em>Essence Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEssenceVersion()
	 * @generated
	 * @ordered
	 */
	protected int essenceVersion = ESSENCE_VERSION_EDEFAULT;

	/**
	 * This is true if the Essence Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean essenceVersionESet;

	/**
	 * The cached value of the '{@link #getGenericDeclBlock() <em>Generic Decl Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericDeclBlock()
	 * @generated
	 * @ordered
	 */
	protected GenericDeclBlock genericDeclBlock;

	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected EList<Module> module;

	/**
	 * The cached value of the '{@link #getParamDeclBlock() <em>Param Decl Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamDeclBlock()
	 * @generated
	 * @ordered
	 */
	protected ParamDeclBlock paramDeclBlock;

	/**
	 * The cached value of the '{@link #getVLNV() <em>VLNV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVLNV()
	 * @generated
	 * @ordered
	 */
	protected VLNV vLNV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getModelRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstDefBlock getConstDefBlock() {
		return constDefBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstDefBlock(ConstDefBlock newConstDefBlock, NotificationChain msgs) {
		ConstDefBlock oldConstDefBlock = constDefBlock;
		constDefBlock = newConstDefBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.MODEL_ROOT__CONST_DEF_BLOCK, oldConstDefBlock, newConstDefBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstDefBlock(ConstDefBlock newConstDefBlock) {
		if (newConstDefBlock != constDefBlock) {
			NotificationChain msgs = null;
			if (constDefBlock != null)
				msgs = ((InternalEObject)constDefBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.MODEL_ROOT__CONST_DEF_BLOCK, null, msgs);
			if (newConstDefBlock != null)
				msgs = ((InternalEObject)newConstDefBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.MODEL_ROOT__CONST_DEF_BLOCK, null, msgs);
			msgs = basicSetConstDefBlock(newConstDefBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.MODEL_ROOT__CONST_DEF_BLOCK, newConstDefBlock, newConstDefBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEssenceVersion() {
		return essenceVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEssenceVersion(int newEssenceVersion) {
		int oldEssenceVersion = essenceVersion;
		essenceVersion = newEssenceVersion;
		boolean oldEssenceVersionESet = essenceVersionESet;
		essenceVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.MODEL_ROOT__ESSENCE_VERSION, oldEssenceVersion, essenceVersion, !oldEssenceVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEssenceVersion() {
		int oldEssenceVersion = essenceVersion;
		boolean oldEssenceVersionESet = essenceVersionESet;
		essenceVersion = ESSENCE_VERSION_EDEFAULT;
		essenceVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EssencePackage.MODEL_ROOT__ESSENCE_VERSION, oldEssenceVersion, ESSENCE_VERSION_EDEFAULT, oldEssenceVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEssenceVersion() {
		return essenceVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericDeclBlock getGenericDeclBlock() {
		return genericDeclBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericDeclBlock(GenericDeclBlock newGenericDeclBlock, NotificationChain msgs) {
		GenericDeclBlock oldGenericDeclBlock = genericDeclBlock;
		genericDeclBlock = newGenericDeclBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.MODEL_ROOT__GENERIC_DECL_BLOCK, oldGenericDeclBlock, newGenericDeclBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericDeclBlock(GenericDeclBlock newGenericDeclBlock) {
		if (newGenericDeclBlock != genericDeclBlock) {
			NotificationChain msgs = null;
			if (genericDeclBlock != null)
				msgs = ((InternalEObject)genericDeclBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.MODEL_ROOT__GENERIC_DECL_BLOCK, null, msgs);
			if (newGenericDeclBlock != null)
				msgs = ((InternalEObject)newGenericDeclBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.MODEL_ROOT__GENERIC_DECL_BLOCK, null, msgs);
			msgs = basicSetGenericDeclBlock(newGenericDeclBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.MODEL_ROOT__GENERIC_DECL_BLOCK, newGenericDeclBlock, newGenericDeclBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Module> getModule() {
		if (module == null) {
			module = new EObjectContainmentEList<Module>(Module.class, this, EssencePackage.MODEL_ROOT__MODULE);
		}
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamDeclBlock getParamDeclBlock() {
		return paramDeclBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParamDeclBlock(ParamDeclBlock newParamDeclBlock, NotificationChain msgs) {
		ParamDeclBlock oldParamDeclBlock = paramDeclBlock;
		paramDeclBlock = newParamDeclBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.MODEL_ROOT__PARAM_DECL_BLOCK, oldParamDeclBlock, newParamDeclBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamDeclBlock(ParamDeclBlock newParamDeclBlock) {
		if (newParamDeclBlock != paramDeclBlock) {
			NotificationChain msgs = null;
			if (paramDeclBlock != null)
				msgs = ((InternalEObject)paramDeclBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.MODEL_ROOT__PARAM_DECL_BLOCK, null, msgs);
			if (newParamDeclBlock != null)
				msgs = ((InternalEObject)newParamDeclBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.MODEL_ROOT__PARAM_DECL_BLOCK, null, msgs);
			msgs = basicSetParamDeclBlock(newParamDeclBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.MODEL_ROOT__PARAM_DECL_BLOCK, newParamDeclBlock, newParamDeclBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VLNV getVLNV() {
		return vLNV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVLNV(VLNV newVLNV, NotificationChain msgs) {
		VLNV oldVLNV = vLNV;
		vLNV = newVLNV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.MODEL_ROOT__VLNV, oldVLNV, newVLNV);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVLNV(VLNV newVLNV) {
		if (newVLNV != vLNV) {
			NotificationChain msgs = null;
			if (vLNV != null)
				msgs = ((InternalEObject)vLNV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.MODEL_ROOT__VLNV, null, msgs);
			if (newVLNV != null)
				msgs = ((InternalEObject)newVLNV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.MODEL_ROOT__VLNV, null, msgs);
			msgs = basicSetVLNV(newVLNV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.MODEL_ROOT__VLNV, newVLNV, newVLNV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.MODEL_ROOT__CONST_DEF_BLOCK:
				return basicSetConstDefBlock(null, msgs);
			case EssencePackage.MODEL_ROOT__GENERIC_DECL_BLOCK:
				return basicSetGenericDeclBlock(null, msgs);
			case EssencePackage.MODEL_ROOT__MODULE:
				return ((InternalEList<?>)getModule()).basicRemove(otherEnd, msgs);
			case EssencePackage.MODEL_ROOT__PARAM_DECL_BLOCK:
				return basicSetParamDeclBlock(null, msgs);
			case EssencePackage.MODEL_ROOT__VLNV:
				return basicSetVLNV(null, msgs);
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
			case EssencePackage.MODEL_ROOT__CONST_DEF_BLOCK:
				return getConstDefBlock();
			case EssencePackage.MODEL_ROOT__ESSENCE_VERSION:
				return getEssenceVersion();
			case EssencePackage.MODEL_ROOT__GENERIC_DECL_BLOCK:
				return getGenericDeclBlock();
			case EssencePackage.MODEL_ROOT__MODULE:
				return getModule();
			case EssencePackage.MODEL_ROOT__PARAM_DECL_BLOCK:
				return getParamDeclBlock();
			case EssencePackage.MODEL_ROOT__VLNV:
				return getVLNV();
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
			case EssencePackage.MODEL_ROOT__CONST_DEF_BLOCK:
				setConstDefBlock((ConstDefBlock)newValue);
				return;
			case EssencePackage.MODEL_ROOT__ESSENCE_VERSION:
				setEssenceVersion((Integer)newValue);
				return;
			case EssencePackage.MODEL_ROOT__GENERIC_DECL_BLOCK:
				setGenericDeclBlock((GenericDeclBlock)newValue);
				return;
			case EssencePackage.MODEL_ROOT__MODULE:
				getModule().clear();
				getModule().addAll((Collection<? extends Module>)newValue);
				return;
			case EssencePackage.MODEL_ROOT__PARAM_DECL_BLOCK:
				setParamDeclBlock((ParamDeclBlock)newValue);
				return;
			case EssencePackage.MODEL_ROOT__VLNV:
				setVLNV((VLNV)newValue);
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
			case EssencePackage.MODEL_ROOT__CONST_DEF_BLOCK:
				setConstDefBlock((ConstDefBlock)null);
				return;
			case EssencePackage.MODEL_ROOT__ESSENCE_VERSION:
				unsetEssenceVersion();
				return;
			case EssencePackage.MODEL_ROOT__GENERIC_DECL_BLOCK:
				setGenericDeclBlock((GenericDeclBlock)null);
				return;
			case EssencePackage.MODEL_ROOT__MODULE:
				getModule().clear();
				return;
			case EssencePackage.MODEL_ROOT__PARAM_DECL_BLOCK:
				setParamDeclBlock((ParamDeclBlock)null);
				return;
			case EssencePackage.MODEL_ROOT__VLNV:
				setVLNV((VLNV)null);
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
			case EssencePackage.MODEL_ROOT__CONST_DEF_BLOCK:
				return constDefBlock != null;
			case EssencePackage.MODEL_ROOT__ESSENCE_VERSION:
				return isSetEssenceVersion();
			case EssencePackage.MODEL_ROOT__GENERIC_DECL_BLOCK:
				return genericDeclBlock != null;
			case EssencePackage.MODEL_ROOT__MODULE:
				return module != null && !module.isEmpty();
			case EssencePackage.MODEL_ROOT__PARAM_DECL_BLOCK:
				return paramDeclBlock != null;
			case EssencePackage.MODEL_ROOT__VLNV:
				return vLNV != null;
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
		result.append(" (essenceVersion: ");
		if (essenceVersionESet) result.append(essenceVersion); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ModelRootImpl
