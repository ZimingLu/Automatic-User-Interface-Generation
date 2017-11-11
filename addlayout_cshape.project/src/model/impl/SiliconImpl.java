/**
 */
package model.impl;

import java.util.Collection;

import model.ModelPackage;
import model.Pad;
import model.PowerDomain;
import model.SiInstance;
import model.Silicon;

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
 * An implementation of the model object '<em><b>Silicon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.SiliconImpl#getStep <em>Step</em>}</li>
 *   <li>{@link model.impl.SiliconImpl#getPadHeight <em>Pad Height</em>}</li>
 *   <li>{@link model.impl.SiliconImpl#getKerfWidth <em>Kerf Width</em>}</li>
 *   <li>{@link model.impl.SiliconImpl#getKerfHeight <em>Kerf Height</em>}</li>
 *   <li>{@link model.impl.SiliconImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link model.impl.SiliconImpl#getPad <em>Pad</em>}</li>
 *   <li>{@link model.impl.SiliconImpl#getPowerDomain <em>Power Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiliconImpl extends ModelRootImpl implements Silicon {
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
	 * The default value of the '{@link #getPadHeight() <em>Pad Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String PAD_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPadHeight() <em>Pad Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadHeight()
	 * @generated
	 * @ordered
	 */
	protected String padHeight = PAD_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getKerfWidth() <em>Kerf Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKerfWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String KERF_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKerfWidth() <em>Kerf Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKerfWidth()
	 * @generated
	 * @ordered
	 */
	protected String kerfWidth = KERF_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getKerfHeight() <em>Kerf Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKerfHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String KERF_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKerfHeight() <em>Kerf Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKerfHeight()
	 * @generated
	 * @ordered
	 */
	protected String kerfHeight = KERF_HEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<SiInstance> instance;

	/**
	 * The cached value of the '{@link #getPad() <em>Pad</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPad()
	 * @generated
	 * @ordered
	 */
	protected EList<Pad> pad;

	/**
	 * The cached value of the '{@link #getPowerDomain() <em>Power Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerDomain> powerDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiliconImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getSilicon();
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SILICON__STEP, oldStep, step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPadHeight() {
		return padHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPadHeight(String newPadHeight) {
		String oldPadHeight = padHeight;
		padHeight = newPadHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SILICON__PAD_HEIGHT, oldPadHeight, padHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKerfWidth() {
		return kerfWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKerfWidth(String newKerfWidth) {
		String oldKerfWidth = kerfWidth;
		kerfWidth = newKerfWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SILICON__KERF_WIDTH, oldKerfWidth, kerfWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKerfHeight() {
		return kerfHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKerfHeight(String newKerfHeight) {
		String oldKerfHeight = kerfHeight;
		kerfHeight = newKerfHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SILICON__KERF_HEIGHT, oldKerfHeight, kerfHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SiInstance> getInstance() {
		if (instance == null) {
			instance = new EObjectContainmentEList<SiInstance>(SiInstance.class, this, ModelPackage.SILICON__INSTANCE);
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pad> getPad() {
		if (pad == null) {
			pad = new EObjectContainmentEList<Pad>(Pad.class, this, ModelPackage.SILICON__PAD);
		}
		return pad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerDomain> getPowerDomain() {
		if (powerDomain == null) {
			powerDomain = new EObjectContainmentEList<PowerDomain>(PowerDomain.class, this, ModelPackage.SILICON__POWER_DOMAIN);
		}
		return powerDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SILICON__INSTANCE:
				return ((InternalEList<?>)getInstance()).basicRemove(otherEnd, msgs);
			case ModelPackage.SILICON__PAD:
				return ((InternalEList<?>)getPad()).basicRemove(otherEnd, msgs);
			case ModelPackage.SILICON__POWER_DOMAIN:
				return ((InternalEList<?>)getPowerDomain()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.SILICON__STEP:
				return getStep();
			case ModelPackage.SILICON__PAD_HEIGHT:
				return getPadHeight();
			case ModelPackage.SILICON__KERF_WIDTH:
				return getKerfWidth();
			case ModelPackage.SILICON__KERF_HEIGHT:
				return getKerfHeight();
			case ModelPackage.SILICON__INSTANCE:
				return getInstance();
			case ModelPackage.SILICON__PAD:
				return getPad();
			case ModelPackage.SILICON__POWER_DOMAIN:
				return getPowerDomain();
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
			case ModelPackage.SILICON__STEP:
				setStep((String)newValue);
				return;
			case ModelPackage.SILICON__PAD_HEIGHT:
				setPadHeight((String)newValue);
				return;
			case ModelPackage.SILICON__KERF_WIDTH:
				setKerfWidth((String)newValue);
				return;
			case ModelPackage.SILICON__KERF_HEIGHT:
				setKerfHeight((String)newValue);
				return;
			case ModelPackage.SILICON__INSTANCE:
				getInstance().clear();
				getInstance().addAll((Collection<? extends SiInstance>)newValue);
				return;
			case ModelPackage.SILICON__PAD:
				getPad().clear();
				getPad().addAll((Collection<? extends Pad>)newValue);
				return;
			case ModelPackage.SILICON__POWER_DOMAIN:
				getPowerDomain().clear();
				getPowerDomain().addAll((Collection<? extends PowerDomain>)newValue);
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
			case ModelPackage.SILICON__STEP:
				setStep(STEP_EDEFAULT);
				return;
			case ModelPackage.SILICON__PAD_HEIGHT:
				setPadHeight(PAD_HEIGHT_EDEFAULT);
				return;
			case ModelPackage.SILICON__KERF_WIDTH:
				setKerfWidth(KERF_WIDTH_EDEFAULT);
				return;
			case ModelPackage.SILICON__KERF_HEIGHT:
				setKerfHeight(KERF_HEIGHT_EDEFAULT);
				return;
			case ModelPackage.SILICON__INSTANCE:
				getInstance().clear();
				return;
			case ModelPackage.SILICON__PAD:
				getPad().clear();
				return;
			case ModelPackage.SILICON__POWER_DOMAIN:
				getPowerDomain().clear();
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
			case ModelPackage.SILICON__STEP:
				return STEP_EDEFAULT == null ? step != null : !STEP_EDEFAULT.equals(step);
			case ModelPackage.SILICON__PAD_HEIGHT:
				return PAD_HEIGHT_EDEFAULT == null ? padHeight != null : !PAD_HEIGHT_EDEFAULT.equals(padHeight);
			case ModelPackage.SILICON__KERF_WIDTH:
				return KERF_WIDTH_EDEFAULT == null ? kerfWidth != null : !KERF_WIDTH_EDEFAULT.equals(kerfWidth);
			case ModelPackage.SILICON__KERF_HEIGHT:
				return KERF_HEIGHT_EDEFAULT == null ? kerfHeight != null : !KERF_HEIGHT_EDEFAULT.equals(kerfHeight);
			case ModelPackage.SILICON__INSTANCE:
				return instance != null && !instance.isEmpty();
			case ModelPackage.SILICON__PAD:
				return pad != null && !pad.isEmpty();
			case ModelPackage.SILICON__POWER_DOMAIN:
				return powerDomain != null && !powerDomain.isEmpty();
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
		result.append(", padHeight: ");
		result.append(padHeight);
		result.append(", kerfWidth: ");
		result.append(kerfWidth);
		result.append(", kerfHeight: ");
		result.append(kerfHeight);
		result.append(')');
		return result.toString();
	}

} //SiliconImpl
