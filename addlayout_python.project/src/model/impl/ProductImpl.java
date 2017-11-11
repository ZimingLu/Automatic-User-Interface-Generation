/**
 */
package model.impl;

import java.util.Collection;

import model.ModelPackage;
import model.Net;
import model.PackageInstance;
import model.Product;
import model.SiliconInstance;

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
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.ProductImpl#getStep <em>Step</em>}</li>
 *   <li>{@link model.impl.ProductImpl#getPackageInstance <em>Package Instance</em>}</li>
 *   <li>{@link model.impl.ProductImpl#getSiliconInstance <em>Silicon Instance</em>}</li>
 *   <li>{@link model.impl.ProductImpl#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends ModelRootImpl implements Product {
	/**
	 * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected static final String STEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected String step = STEP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPackageInstance() <em>Package Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageInstance()
	 * @generated
	 * @ordered
	 */
	protected PackageInstance packageInstance;

	/**
	 * The cached value of the '{@link #getSiliconInstance() <em>Silicon Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiliconInstance()
	 * @generated
	 * @ordered
	 */
	protected SiliconInstance siliconInstance;

	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected EList<Net> net;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getProduct();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(String newStep) {
		String oldStep = step;
		step = newStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCT__STEP, oldStep, step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageInstance getPackageInstance() {
		return packageInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackageInstance(PackageInstance newPackageInstance, NotificationChain msgs) {
		PackageInstance oldPackageInstance = packageInstance;
		packageInstance = newPackageInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCT__PACKAGE_INSTANCE, oldPackageInstance, newPackageInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageInstance(PackageInstance newPackageInstance) {
		if (newPackageInstance != packageInstance) {
			NotificationChain msgs = null;
			if (packageInstance != null)
				msgs = ((InternalEObject)packageInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PRODUCT__PACKAGE_INSTANCE, null, msgs);
			if (newPackageInstance != null)
				msgs = ((InternalEObject)newPackageInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PRODUCT__PACKAGE_INSTANCE, null, msgs);
			msgs = basicSetPackageInstance(newPackageInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCT__PACKAGE_INSTANCE, newPackageInstance, newPackageInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiliconInstance getSiliconInstance() {
		return siliconInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSiliconInstance(SiliconInstance newSiliconInstance, NotificationChain msgs) {
		SiliconInstance oldSiliconInstance = siliconInstance;
		siliconInstance = newSiliconInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCT__SILICON_INSTANCE, oldSiliconInstance, newSiliconInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiliconInstance(SiliconInstance newSiliconInstance) {
		if (newSiliconInstance != siliconInstance) {
			NotificationChain msgs = null;
			if (siliconInstance != null)
				msgs = ((InternalEObject)siliconInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PRODUCT__SILICON_INSTANCE, null, msgs);
			if (newSiliconInstance != null)
				msgs = ((InternalEObject)newSiliconInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PRODUCT__SILICON_INSTANCE, null, msgs);
			msgs = basicSetSiliconInstance(newSiliconInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCT__SILICON_INSTANCE, newSiliconInstance, newSiliconInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Net> getNet() {
		if (net == null) {
			net = new EObjectContainmentEList<Net>(Net.class, this, ModelPackage.PRODUCT__NET);
		}
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PRODUCT__PACKAGE_INSTANCE:
				return basicSetPackageInstance(null, msgs);
			case ModelPackage.PRODUCT__SILICON_INSTANCE:
				return basicSetSiliconInstance(null, msgs);
			case ModelPackage.PRODUCT__NET:
				return ((InternalEList<?>)getNet()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.PRODUCT__STEP:
				return getStep();
			case ModelPackage.PRODUCT__PACKAGE_INSTANCE:
				return getPackageInstance();
			case ModelPackage.PRODUCT__SILICON_INSTANCE:
				return getSiliconInstance();
			case ModelPackage.PRODUCT__NET:
				return getNet();
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
			case ModelPackage.PRODUCT__STEP:
				setStep((String)newValue);
				return;
			case ModelPackage.PRODUCT__PACKAGE_INSTANCE:
				setPackageInstance((PackageInstance)newValue);
				return;
			case ModelPackage.PRODUCT__SILICON_INSTANCE:
				setSiliconInstance((SiliconInstance)newValue);
				return;
			case ModelPackage.PRODUCT__NET:
				getNet().clear();
				getNet().addAll((Collection<? extends Net>)newValue);
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
			case ModelPackage.PRODUCT__STEP:
				setStep(STEP_EDEFAULT);
				return;
			case ModelPackage.PRODUCT__PACKAGE_INSTANCE:
				setPackageInstance((PackageInstance)null);
				return;
			case ModelPackage.PRODUCT__SILICON_INSTANCE:
				setSiliconInstance((SiliconInstance)null);
				return;
			case ModelPackage.PRODUCT__NET:
				getNet().clear();
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
			case ModelPackage.PRODUCT__STEP:
				return STEP_EDEFAULT == null ? step != null : !STEP_EDEFAULT.equals(step);
			case ModelPackage.PRODUCT__PACKAGE_INSTANCE:
				return packageInstance != null;
			case ModelPackage.PRODUCT__SILICON_INSTANCE:
				return siliconInstance != null;
			case ModelPackage.PRODUCT__NET:
				return net != null && !net.isEmpty();
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
		result.append(" (step: ");
		result.append(step);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
