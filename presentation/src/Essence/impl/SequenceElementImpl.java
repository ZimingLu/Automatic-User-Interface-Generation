/**
 */
package Essence.impl;

import Essence.AccessCondition;
import Essence.EssencePackage;
import Essence.SequenceElement;

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
 * An implementation of the model object '<em><b>Sequence Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.SequenceElementImpl#getDataWidth <em>Data Width</em>}</li>
 *   <li>{@link Essence.impl.SequenceElementImpl#getAccessCondition <em>Access Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SequenceElementImpl extends RegMemElementImpl implements SequenceElement {
	/**
	 * The default value of the '{@link #getDataWidth() <em>Data Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataWidth() <em>Data Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataWidth()
	 * @generated
	 * @ordered
	 */
	protected String dataWidth = DATA_WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccessCondition() <em>Access Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<AccessCondition> accessCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getSequenceElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataWidth() {
		return dataWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataWidth(String newDataWidth) {
		String oldDataWidth = dataWidth;
		dataWidth = newDataWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SEQUENCE_ELEMENT__DATA_WIDTH, oldDataWidth, dataWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccessCondition> getAccessCondition() {
		if (accessCondition == null) {
			accessCondition = new EObjectContainmentEList<AccessCondition>(AccessCondition.class, this, EssencePackage.SEQUENCE_ELEMENT__ACCESS_CONDITION);
		}
		return accessCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.SEQUENCE_ELEMENT__ACCESS_CONDITION:
				return ((InternalEList<?>)getAccessCondition()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.SEQUENCE_ELEMENT__DATA_WIDTH:
				return getDataWidth();
			case EssencePackage.SEQUENCE_ELEMENT__ACCESS_CONDITION:
				return getAccessCondition();
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
			case EssencePackage.SEQUENCE_ELEMENT__DATA_WIDTH:
				setDataWidth((String)newValue);
				return;
			case EssencePackage.SEQUENCE_ELEMENT__ACCESS_CONDITION:
				getAccessCondition().clear();
				getAccessCondition().addAll((Collection<? extends AccessCondition>)newValue);
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
			case EssencePackage.SEQUENCE_ELEMENT__DATA_WIDTH:
				setDataWidth(DATA_WIDTH_EDEFAULT);
				return;
			case EssencePackage.SEQUENCE_ELEMENT__ACCESS_CONDITION:
				getAccessCondition().clear();
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
			case EssencePackage.SEQUENCE_ELEMENT__DATA_WIDTH:
				return DATA_WIDTH_EDEFAULT == null ? dataWidth != null : !DATA_WIDTH_EDEFAULT.equals(dataWidth);
			case EssencePackage.SEQUENCE_ELEMENT__ACCESS_CONDITION:
				return accessCondition != null && !accessCondition.isEmpty();
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
		result.append(" (dataWidth: ");
		result.append(dataWidth);
		result.append(')');
		return result.toString();
	}

} //SequenceElementImpl
