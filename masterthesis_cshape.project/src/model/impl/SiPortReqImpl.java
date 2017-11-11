/**
 */
package model.impl;

import model.ModelPackage;
import model.SiPortReq;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Si Port Req</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.SiPortReqImpl#getDriverStrength <em>Driver Strength</em>}</li>
 *   <li>{@link model.impl.SiPortReqImpl#getSet <em>Set</em>}</li>
 *   <li>{@link model.impl.SiPortReqImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiPortReqImpl extends EssenceBaseImpl implements SiPortReq {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiPortReqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getSiPortReq();
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SI_PORT_REQ__DRIVER_STRENGTH, oldDriverStrength, driverStrength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SI_PORT_REQ__SET, oldSet, set));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SI_PORT_REQ__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.SI_PORT_REQ__DRIVER_STRENGTH:
				return getDriverStrength();
			case ModelPackage.SI_PORT_REQ__SET:
				return getSet();
			case ModelPackage.SI_PORT_REQ__TYPE:
				return getType();
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
			case ModelPackage.SI_PORT_REQ__DRIVER_STRENGTH:
				setDriverStrength((String)newValue);
				return;
			case ModelPackage.SI_PORT_REQ__SET:
				setSet((String)newValue);
				return;
			case ModelPackage.SI_PORT_REQ__TYPE:
				setType((String)newValue);
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
			case ModelPackage.SI_PORT_REQ__DRIVER_STRENGTH:
				setDriverStrength(DRIVER_STRENGTH_EDEFAULT);
				return;
			case ModelPackage.SI_PORT_REQ__SET:
				setSet(SET_EDEFAULT);
				return;
			case ModelPackage.SI_PORT_REQ__TYPE:
				setType(TYPE_EDEFAULT);
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
			case ModelPackage.SI_PORT_REQ__DRIVER_STRENGTH:
				return DRIVER_STRENGTH_EDEFAULT == null ? driverStrength != null : !DRIVER_STRENGTH_EDEFAULT.equals(driverStrength);
			case ModelPackage.SI_PORT_REQ__SET:
				return SET_EDEFAULT == null ? set != null : !SET_EDEFAULT.equals(set);
			case ModelPackage.SI_PORT_REQ__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (driverStrength: ");
		result.append(driverStrength);
		result.append(", set: ");
		result.append(set);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //SiPortReqImpl
