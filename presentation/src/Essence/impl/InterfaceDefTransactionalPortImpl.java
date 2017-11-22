/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.InterfaceDefTransactionalPort;
import Essence.PortInitiative;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Def Transactional Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.InterfaceDefTransactionalPortImpl#getInitiative <em>Initiative</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceDefTransactionalPortImpl extends InterfaceDefPortImpl implements InterfaceDefTransactionalPort {
	/**
	 * The default value of the '{@link #getInitiative() <em>Initiative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiative()
	 * @generated
	 * @ordered
	 */
	protected static final PortInitiative INITIATIVE_EDEFAULT = PortInitiative.PROVIDES;

	/**
	 * The cached value of the '{@link #getInitiative() <em>Initiative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiative()
	 * @generated
	 * @ordered
	 */
	protected PortInitiative initiative = INITIATIVE_EDEFAULT;

	/**
	 * This is true if the Initiative attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean initiativeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceDefTransactionalPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getInterfaceDefTransactionalPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInitiative getInitiative() {
		return initiative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiative(PortInitiative newInitiative) {
		PortInitiative oldInitiative = initiative;
		initiative = newInitiative == null ? INITIATIVE_EDEFAULT : newInitiative;
		boolean oldInitiativeESet = initiativeESet;
		initiativeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.INTERFACE_DEF_TRANSACTIONAL_PORT__INITIATIVE, oldInitiative, initiative, !oldInitiativeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInitiative() {
		PortInitiative oldInitiative = initiative;
		boolean oldInitiativeESet = initiativeESet;
		initiative = INITIATIVE_EDEFAULT;
		initiativeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EssencePackage.INTERFACE_DEF_TRANSACTIONAL_PORT__INITIATIVE, oldInitiative, INITIATIVE_EDEFAULT, oldInitiativeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInitiative() {
		return initiativeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EssencePackage.INTERFACE_DEF_TRANSACTIONAL_PORT__INITIATIVE:
				return getInitiative();
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
			case EssencePackage.INTERFACE_DEF_TRANSACTIONAL_PORT__INITIATIVE:
				setInitiative((PortInitiative)newValue);
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
			case EssencePackage.INTERFACE_DEF_TRANSACTIONAL_PORT__INITIATIVE:
				unsetInitiative();
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
			case EssencePackage.INTERFACE_DEF_TRANSACTIONAL_PORT__INITIATIVE:
				return isSetInitiative();
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
		result.append(" (initiative: ");
		if (initiativeESet) result.append(initiative); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //InterfaceDefTransactionalPortImpl
