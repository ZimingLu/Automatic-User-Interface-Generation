/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.MethodDataType;
import Essence.MethodDataTypeElement;
import Essence.ReturnDataType;

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
 * An implementation of the model object '<em><b>Method Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.MethodDataTypeImpl#getReturnDataType <em>Return Data Type</em>}</li>
 *   <li>{@link Essence.impl.MethodDataTypeImpl#isReference <em>Reference</em>}</li>
 *   <li>{@link Essence.impl.MethodDataTypeImpl#getMethodDataTypeElement <em>Method Data Type Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodDataTypeImpl extends DataTypeImpl implements MethodDataType {
	/**
	 * The cached value of the '{@link #getReturnDataType() <em>Return Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnDataType()
	 * @generated
	 * @ordered
	 */
	protected ReturnDataType returnDataType;

	/**
	 * The default value of the '{@link #isReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReference()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REFERENCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReference()
	 * @generated
	 * @ordered
	 */
	protected boolean reference = REFERENCE_EDEFAULT;

	/**
	 * This is true if the Reference attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean referenceESet;

	/**
	 * The cached value of the '{@link #getMethodDataTypeElement() <em>Method Data Type Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodDataTypeElement()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodDataTypeElement> methodDataTypeElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getMethodDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnDataType getReturnDataType() {
		return returnDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnDataType(ReturnDataType newReturnDataType, NotificationChain msgs) {
		ReturnDataType oldReturnDataType = returnDataType;
		returnDataType = newReturnDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.METHOD_DATA_TYPE__RETURN_DATA_TYPE, oldReturnDataType, newReturnDataType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnDataType(ReturnDataType newReturnDataType) {
		if (newReturnDataType != returnDataType) {
			NotificationChain msgs = null;
			if (returnDataType != null)
				msgs = ((InternalEObject)returnDataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.METHOD_DATA_TYPE__RETURN_DATA_TYPE, null, msgs);
			if (newReturnDataType != null)
				msgs = ((InternalEObject)newReturnDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.METHOD_DATA_TYPE__RETURN_DATA_TYPE, null, msgs);
			msgs = basicSetReturnDataType(newReturnDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.METHOD_DATA_TYPE__RETURN_DATA_TYPE, newReturnDataType, newReturnDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(boolean newReference) {
		boolean oldReference = reference;
		reference = newReference;
		boolean oldReferenceESet = referenceESet;
		referenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.METHOD_DATA_TYPE__REFERENCE, oldReference, reference, !oldReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReference() {
		boolean oldReference = reference;
		boolean oldReferenceESet = referenceESet;
		reference = REFERENCE_EDEFAULT;
		referenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EssencePackage.METHOD_DATA_TYPE__REFERENCE, oldReference, REFERENCE_EDEFAULT, oldReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReference() {
		return referenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodDataTypeElement> getMethodDataTypeElement() {
		if (methodDataTypeElement == null) {
			methodDataTypeElement = new EObjectContainmentEList<MethodDataTypeElement>(MethodDataTypeElement.class, this, EssencePackage.METHOD_DATA_TYPE__METHOD_DATA_TYPE_ELEMENT);
		}
		return methodDataTypeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.METHOD_DATA_TYPE__RETURN_DATA_TYPE:
				return basicSetReturnDataType(null, msgs);
			case EssencePackage.METHOD_DATA_TYPE__METHOD_DATA_TYPE_ELEMENT:
				return ((InternalEList<?>)getMethodDataTypeElement()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.METHOD_DATA_TYPE__RETURN_DATA_TYPE:
				return getReturnDataType();
			case EssencePackage.METHOD_DATA_TYPE__REFERENCE:
				return isReference();
			case EssencePackage.METHOD_DATA_TYPE__METHOD_DATA_TYPE_ELEMENT:
				return getMethodDataTypeElement();
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
			case EssencePackage.METHOD_DATA_TYPE__RETURN_DATA_TYPE:
				setReturnDataType((ReturnDataType)newValue);
				return;
			case EssencePackage.METHOD_DATA_TYPE__REFERENCE:
				setReference((Boolean)newValue);
				return;
			case EssencePackage.METHOD_DATA_TYPE__METHOD_DATA_TYPE_ELEMENT:
				getMethodDataTypeElement().clear();
				getMethodDataTypeElement().addAll((Collection<? extends MethodDataTypeElement>)newValue);
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
			case EssencePackage.METHOD_DATA_TYPE__RETURN_DATA_TYPE:
				setReturnDataType((ReturnDataType)null);
				return;
			case EssencePackage.METHOD_DATA_TYPE__REFERENCE:
				unsetReference();
				return;
			case EssencePackage.METHOD_DATA_TYPE__METHOD_DATA_TYPE_ELEMENT:
				getMethodDataTypeElement().clear();
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
			case EssencePackage.METHOD_DATA_TYPE__RETURN_DATA_TYPE:
				return returnDataType != null;
			case EssencePackage.METHOD_DATA_TYPE__REFERENCE:
				return isSetReference();
			case EssencePackage.METHOD_DATA_TYPE__METHOD_DATA_TYPE_ELEMENT:
				return methodDataTypeElement != null && !methodDataTypeElement.isEmpty();
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
		result.append(" (reference: ");
		if (referenceESet) result.append(reference); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MethodDataTypeImpl
