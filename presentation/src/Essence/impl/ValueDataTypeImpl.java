/**
 */
package Essence.impl;

import Essence.ArrayDimension;
import Essence.EssencePackage;
import Essence.SignType;
import Essence.ValueDataType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.ValueDataTypeImpl#getSignInterpretation <em>Sign Interpretation</em>}</li>
 *   <li>{@link Essence.impl.ValueDataTypeImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link Essence.impl.ValueDataTypeImpl#getVector <em>Vector</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ValueDataTypeImpl extends ReturnDataTypeImpl implements ValueDataType {
	/**
	 * The default value of the '{@link #getSignInterpretation() <em>Sign Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignInterpretation()
	 * @generated
	 * @ordered
	 */
	protected static final SignType SIGN_INTERPRETATION_EDEFAULT = SignType.UNSIGNED;

	/**
	 * The cached value of the '{@link #getSignInterpretation() <em>Sign Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignInterpretation()
	 * @generated
	 * @ordered
	 */
	protected SignType signInterpretation = SIGN_INTERPRETATION_EDEFAULT;

	/**
	 * This is true if the Sign Interpretation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean signInterpretationESet;

	/**
	 * The default value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectType()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectType()
	 * @generated
	 * @ordered
	 */
	protected String objectType = OBJECT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVector() <em>Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVector()
	 * @generated
	 * @ordered
	 */
	protected ArrayDimension vector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getValueDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignType getSignInterpretation() {
		return signInterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignInterpretation(SignType newSignInterpretation) {
		SignType oldSignInterpretation = signInterpretation;
		signInterpretation = newSignInterpretation == null ? SIGN_INTERPRETATION_EDEFAULT : newSignInterpretation;
		boolean oldSignInterpretationESet = signInterpretationESet;
		signInterpretationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.VALUE_DATA_TYPE__SIGN_INTERPRETATION, oldSignInterpretation, signInterpretation, !oldSignInterpretationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSignInterpretation() {
		SignType oldSignInterpretation = signInterpretation;
		boolean oldSignInterpretationESet = signInterpretationESet;
		signInterpretation = SIGN_INTERPRETATION_EDEFAULT;
		signInterpretationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EssencePackage.VALUE_DATA_TYPE__SIGN_INTERPRETATION, oldSignInterpretation, SIGN_INTERPRETATION_EDEFAULT, oldSignInterpretationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSignInterpretation() {
		return signInterpretationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectType() {
		return objectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectType(String newObjectType) {
		String oldObjectType = objectType;
		objectType = newObjectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.VALUE_DATA_TYPE__OBJECT_TYPE, oldObjectType, objectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayDimension getVector() {
		return vector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVector(ArrayDimension newVector, NotificationChain msgs) {
		ArrayDimension oldVector = vector;
		vector = newVector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.VALUE_DATA_TYPE__VECTOR, oldVector, newVector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVector(ArrayDimension newVector) {
		if (newVector != vector) {
			NotificationChain msgs = null;
			if (vector != null)
				msgs = ((InternalEObject)vector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.VALUE_DATA_TYPE__VECTOR, null, msgs);
			if (newVector != null)
				msgs = ((InternalEObject)newVector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.VALUE_DATA_TYPE__VECTOR, null, msgs);
			msgs = basicSetVector(newVector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.VALUE_DATA_TYPE__VECTOR, newVector, newVector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.VALUE_DATA_TYPE__VECTOR:
				return basicSetVector(null, msgs);
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
			case EssencePackage.VALUE_DATA_TYPE__SIGN_INTERPRETATION:
				return getSignInterpretation();
			case EssencePackage.VALUE_DATA_TYPE__OBJECT_TYPE:
				return getObjectType();
			case EssencePackage.VALUE_DATA_TYPE__VECTOR:
				return getVector();
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
			case EssencePackage.VALUE_DATA_TYPE__SIGN_INTERPRETATION:
				setSignInterpretation((SignType)newValue);
				return;
			case EssencePackage.VALUE_DATA_TYPE__OBJECT_TYPE:
				setObjectType((String)newValue);
				return;
			case EssencePackage.VALUE_DATA_TYPE__VECTOR:
				setVector((ArrayDimension)newValue);
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
			case EssencePackage.VALUE_DATA_TYPE__SIGN_INTERPRETATION:
				unsetSignInterpretation();
				return;
			case EssencePackage.VALUE_DATA_TYPE__OBJECT_TYPE:
				setObjectType(OBJECT_TYPE_EDEFAULT);
				return;
			case EssencePackage.VALUE_DATA_TYPE__VECTOR:
				setVector((ArrayDimension)null);
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
			case EssencePackage.VALUE_DATA_TYPE__SIGN_INTERPRETATION:
				return isSetSignInterpretation();
			case EssencePackage.VALUE_DATA_TYPE__OBJECT_TYPE:
				return OBJECT_TYPE_EDEFAULT == null ? objectType != null : !OBJECT_TYPE_EDEFAULT.equals(objectType);
			case EssencePackage.VALUE_DATA_TYPE__VECTOR:
				return vector != null;
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
		result.append(" (signInterpretation: ");
		if (signInterpretationESet) result.append(signInterpretation); else result.append("<unset>");
		result.append(", objectType: ");
		result.append(objectType);
		result.append(')');
		return result.toString();
	}

} //ValueDataTypeImpl
