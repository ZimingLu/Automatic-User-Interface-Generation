/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.PadType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pad Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.PadTypeImpl#getLib <em>Lib</em>}</li>
 *   <li>{@link Essence.impl.PadTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link Essence.impl.PadTypeImpl#getDriverStrength <em>Driver Strength</em>}</li>
 *   <li>{@link Essence.impl.PadTypeImpl#getSet <em>Set</em>}</li>
 *   <li>{@link Essence.impl.PadTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link Essence.impl.PadTypeImpl#getSpec <em>Spec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PadTypeImpl extends SingleSourceNodeImpl implements PadType {
	/**
	 * The default value of the '{@link #getLib() <em>Lib</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLib()
	 * @generated
	 * @ordered
	 */
	protected static final String LIB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLib() <em>Lib</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLib()
	 * @generated
	 * @ordered
	 */
	protected String lib = LIB_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDriverStrength() <em>Driver Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverStrength()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVER_STRENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDriverStrength() <em>Driver Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverStrength()
	 * @generated
	 * @ordered
	 */
	protected String driverStrength = DRIVER_STRENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSet() <em>Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet()
	 * @generated
	 * @ordered
	 */
	protected static final String SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSet() <em>Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSet()
	 * @generated
	 * @ordered
	 */
	protected String set = SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpec() <em>Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpec()
	 * @generated
	 * @ordered
	 */
	protected static final String SPEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpec() <em>Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpec()
	 * @generated
	 * @ordered
	 */
	protected String spec = SPEC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PadTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getPadType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLib() {
		return lib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLib(String newLib) {
		String oldLib = lib;
		lib = newLib;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.PAD_TYPE__LIB, oldLib, lib));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.PAD_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDriverStrength() {
		return driverStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriverStrength(String newDriverStrength) {
		String oldDriverStrength = driverStrength;
		driverStrength = newDriverStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.PAD_TYPE__DRIVER_STRENGTH, oldDriverStrength, driverStrength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSet() {
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSet(String newSet) {
		String oldSet = set;
		set = newSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.PAD_TYPE__SET, oldSet, set));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.PAD_TYPE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpec() {
		return spec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpec(String newSpec) {
		String oldSpec = spec;
		spec = newSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.PAD_TYPE__SPEC, oldSpec, spec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EssencePackage.PAD_TYPE__LIB:
				return getLib();
			case EssencePackage.PAD_TYPE__TYPE:
				return getType();
			case EssencePackage.PAD_TYPE__DRIVER_STRENGTH:
				return getDriverStrength();
			case EssencePackage.PAD_TYPE__SET:
				return getSet();
			case EssencePackage.PAD_TYPE__WIDTH:
				return getWidth();
			case EssencePackage.PAD_TYPE__SPEC:
				return getSpec();
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
			case EssencePackage.PAD_TYPE__LIB:
				setLib((String)newValue);
				return;
			case EssencePackage.PAD_TYPE__TYPE:
				setType((String)newValue);
				return;
			case EssencePackage.PAD_TYPE__DRIVER_STRENGTH:
				setDriverStrength((String)newValue);
				return;
			case EssencePackage.PAD_TYPE__SET:
				setSet((String)newValue);
				return;
			case EssencePackage.PAD_TYPE__WIDTH:
				setWidth((String)newValue);
				return;
			case EssencePackage.PAD_TYPE__SPEC:
				setSpec((String)newValue);
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
			case EssencePackage.PAD_TYPE__LIB:
				setLib(LIB_EDEFAULT);
				return;
			case EssencePackage.PAD_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EssencePackage.PAD_TYPE__DRIVER_STRENGTH:
				setDriverStrength(DRIVER_STRENGTH_EDEFAULT);
				return;
			case EssencePackage.PAD_TYPE__SET:
				setSet(SET_EDEFAULT);
				return;
			case EssencePackage.PAD_TYPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case EssencePackage.PAD_TYPE__SPEC:
				setSpec(SPEC_EDEFAULT);
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
			case EssencePackage.PAD_TYPE__LIB:
				return LIB_EDEFAULT == null ? lib != null : !LIB_EDEFAULT.equals(lib);
			case EssencePackage.PAD_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case EssencePackage.PAD_TYPE__DRIVER_STRENGTH:
				return DRIVER_STRENGTH_EDEFAULT == null ? driverStrength != null : !DRIVER_STRENGTH_EDEFAULT.equals(driverStrength);
			case EssencePackage.PAD_TYPE__SET:
				return SET_EDEFAULT == null ? set != null : !SET_EDEFAULT.equals(set);
			case EssencePackage.PAD_TYPE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case EssencePackage.PAD_TYPE__SPEC:
				return SPEC_EDEFAULT == null ? spec != null : !SPEC_EDEFAULT.equals(spec);
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
		result.append(" (lib: ");
		result.append(lib);
		result.append(", type: ");
		result.append(type);
		result.append(", driverStrength: ");
		result.append(driverStrength);
		result.append(", set: ");
		result.append(set);
		result.append(", width: ");
		result.append(width);
		result.append(", spec: ");
		result.append(spec);
		result.append(')');
		return result.toString();
	}

} //PadTypeImpl
