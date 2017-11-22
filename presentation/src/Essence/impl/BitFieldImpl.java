/**
 */
package Essence.impl;

import Essence.Access;
import Essence.AccessLevel;
import Essence.BitField;
import Essence.EnumerationElement;
import Essence.EssencePackage;
import Essence.ReservedType;
import Essence.SignType;
import Essence.VirtualType;

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
 * An implementation of the model object '<em><b>Bit Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.BitFieldImpl#getAccessExternal <em>Access External</em>}</li>
 *   <li>{@link Essence.impl.BitFieldImpl#getAccessInternal <em>Access Internal</em>}</li>
 *   <li>{@link Essence.impl.BitFieldImpl#getMaxVal <em>Max Val</em>}</li>
 *   <li>{@link Essence.impl.BitFieldImpl#getMinVal <em>Min Val</em>}</li>
 *   <li>{@link Essence.impl.BitFieldImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link Essence.impl.BitFieldImpl#getSignInterpretation <em>Sign Interpretation</em>}</li>
 *   <li>{@link Essence.impl.BitFieldImpl#getVirtual <em>Virtual</em>}</li>
 *   <li>{@link Essence.impl.BitFieldImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link Essence.impl.BitFieldImpl#getDefaultMask <em>Default Mask</em>}</li>
 *   <li>{@link Essence.impl.BitFieldImpl#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link Essence.impl.BitFieldImpl#getEnumerationElement <em>Enumeration Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BitFieldImpl extends BitFieldSequenceElementImpl implements BitField {
	/**
	 * The cached value of the '{@link #getAccessExternal() <em>Access External</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessExternal()
	 * @generated
	 * @ordered
	 */
	protected Access accessExternal;

	/**
	 * The cached value of the '{@link #getAccessInternal() <em>Access Internal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessInternal()
	 * @generated
	 * @ordered
	 */
	protected Access accessInternal;

	/**
	 * The default value of the '{@link #getMaxVal() <em>Max Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVal()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_VAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxVal() <em>Max Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxVal()
	 * @generated
	 * @ordered
	 */
	protected String maxVal = MAX_VAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinVal() <em>Min Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVal()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_VAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinVal() <em>Min Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinVal()
	 * @generated
	 * @ordered
	 */
	protected String minVal = MIN_VAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected static final ReservedType RESERVED_EDEFAULT = ReservedType.UNRESERVED;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected ReservedType reserved = RESERVED_EDEFAULT;

	/**
	 * This is true if the Reserved attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reservedESet;

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
	 * The default value of the '{@link #getVirtual() <em>Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtual()
	 * @generated
	 * @ordered
	 */
	protected static final VirtualType VIRTUAL_EDEFAULT = VirtualType.FALSE;

	/**
	 * The cached value of the '{@link #getVirtual() <em>Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtual()
	 * @generated
	 * @ordered
	 */
	protected VirtualType virtual = VIRTUAL_EDEFAULT;

	/**
	 * This is true if the Virtual attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean virtualESet;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultMask() <em>Default Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMask()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultMask() <em>Default Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMask()
	 * @generated
	 * @ordered
	 */
	protected String defaultMask = DEFAULT_MASK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccessLevel() <em>Access Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<AccessLevel> accessLevel;

	/**
	 * The cached value of the '{@link #getEnumerationElement() <em>Enumeration Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationElement()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationElement> enumerationElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getBitField();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Access getAccessExternal() {
		return accessExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessExternal(Access newAccessExternal, NotificationChain msgs) {
		Access oldAccessExternal = accessExternal;
		accessExternal = newAccessExternal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.BIT_FIELD__ACCESS_EXTERNAL, oldAccessExternal, newAccessExternal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessExternal(Access newAccessExternal) {
		if (newAccessExternal != accessExternal) {
			NotificationChain msgs = null;
			if (accessExternal != null)
				msgs = ((InternalEObject)accessExternal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.BIT_FIELD__ACCESS_EXTERNAL, null, msgs);
			if (newAccessExternal != null)
				msgs = ((InternalEObject)newAccessExternal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.BIT_FIELD__ACCESS_EXTERNAL, null, msgs);
			msgs = basicSetAccessExternal(newAccessExternal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.BIT_FIELD__ACCESS_EXTERNAL, newAccessExternal, newAccessExternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Access getAccessInternal() {
		return accessInternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessInternal(Access newAccessInternal, NotificationChain msgs) {
		Access oldAccessInternal = accessInternal;
		accessInternal = newAccessInternal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.BIT_FIELD__ACCESS_INTERNAL, oldAccessInternal, newAccessInternal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessInternal(Access newAccessInternal) {
		if (newAccessInternal != accessInternal) {
			NotificationChain msgs = null;
			if (accessInternal != null)
				msgs = ((InternalEObject)accessInternal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.BIT_FIELD__ACCESS_INTERNAL, null, msgs);
			if (newAccessInternal != null)
				msgs = ((InternalEObject)newAccessInternal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.BIT_FIELD__ACCESS_INTERNAL, null, msgs);
			msgs = basicSetAccessInternal(newAccessInternal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.BIT_FIELD__ACCESS_INTERNAL, newAccessInternal, newAccessInternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxVal() {
		return maxVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxVal(String newMaxVal) {
		String oldMaxVal = maxVal;
		maxVal = newMaxVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.BIT_FIELD__MAX_VAL, oldMaxVal, maxVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinVal() {
		return minVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinVal(String newMinVal) {
		String oldMinVal = minVal;
		minVal = newMinVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.BIT_FIELD__MIN_VAL, oldMinVal, minVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservedType getReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved(ReservedType newReserved) {
		ReservedType oldReserved = reserved;
		reserved = newReserved == null ? RESERVED_EDEFAULT : newReserved;
		boolean oldReservedESet = reservedESet;
		reservedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.BIT_FIELD__RESERVED, oldReserved, reserved, !oldReservedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReserved() {
		ReservedType oldReserved = reserved;
		boolean oldReservedESet = reservedESet;
		reserved = RESERVED_EDEFAULT;
		reservedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EssencePackage.BIT_FIELD__RESERVED, oldReserved, RESERVED_EDEFAULT, oldReservedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReserved() {
		return reservedESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.BIT_FIELD__SIGN_INTERPRETATION, oldSignInterpretation, signInterpretation, !oldSignInterpretationESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, EssencePackage.BIT_FIELD__SIGN_INTERPRETATION, oldSignInterpretation, SIGN_INTERPRETATION_EDEFAULT, oldSignInterpretationESet));
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
	public VirtualType getVirtual() {
		return virtual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtual(VirtualType newVirtual) {
		VirtualType oldVirtual = virtual;
		virtual = newVirtual == null ? VIRTUAL_EDEFAULT : newVirtual;
		boolean oldVirtualESet = virtualESet;
		virtualESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.BIT_FIELD__VIRTUAL, oldVirtual, virtual, !oldVirtualESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVirtual() {
		VirtualType oldVirtual = virtual;
		boolean oldVirtualESet = virtualESet;
		virtual = VIRTUAL_EDEFAULT;
		virtualESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EssencePackage.BIT_FIELD__VIRTUAL, oldVirtual, VIRTUAL_EDEFAULT, oldVirtualESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVirtual() {
		return virtualESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.BIT_FIELD__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultMask() {
		return defaultMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultMask(String newDefaultMask) {
		String oldDefaultMask = defaultMask;
		defaultMask = newDefaultMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.BIT_FIELD__DEFAULT_MASK, oldDefaultMask, defaultMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccessLevel> getAccessLevel() {
		if (accessLevel == null) {
			accessLevel = new EObjectContainmentEList<AccessLevel>(AccessLevel.class, this, EssencePackage.BIT_FIELD__ACCESS_LEVEL);
		}
		return accessLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationElement> getEnumerationElement() {
		if (enumerationElement == null) {
			enumerationElement = new EObjectContainmentEList<EnumerationElement>(EnumerationElement.class, this, EssencePackage.BIT_FIELD__ENUMERATION_ELEMENT);
		}
		return enumerationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.BIT_FIELD__ACCESS_EXTERNAL:
				return basicSetAccessExternal(null, msgs);
			case EssencePackage.BIT_FIELD__ACCESS_INTERNAL:
				return basicSetAccessInternal(null, msgs);
			case EssencePackage.BIT_FIELD__ACCESS_LEVEL:
				return ((InternalEList<?>)getAccessLevel()).basicRemove(otherEnd, msgs);
			case EssencePackage.BIT_FIELD__ENUMERATION_ELEMENT:
				return ((InternalEList<?>)getEnumerationElement()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.BIT_FIELD__ACCESS_EXTERNAL:
				return getAccessExternal();
			case EssencePackage.BIT_FIELD__ACCESS_INTERNAL:
				return getAccessInternal();
			case EssencePackage.BIT_FIELD__MAX_VAL:
				return getMaxVal();
			case EssencePackage.BIT_FIELD__MIN_VAL:
				return getMinVal();
			case EssencePackage.BIT_FIELD__RESERVED:
				return getReserved();
			case EssencePackage.BIT_FIELD__SIGN_INTERPRETATION:
				return getSignInterpretation();
			case EssencePackage.BIT_FIELD__VIRTUAL:
				return getVirtual();
			case EssencePackage.BIT_FIELD__DEFAULT_VALUE:
				return getDefaultValue();
			case EssencePackage.BIT_FIELD__DEFAULT_MASK:
				return getDefaultMask();
			case EssencePackage.BIT_FIELD__ACCESS_LEVEL:
				return getAccessLevel();
			case EssencePackage.BIT_FIELD__ENUMERATION_ELEMENT:
				return getEnumerationElement();
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
			case EssencePackage.BIT_FIELD__ACCESS_EXTERNAL:
				setAccessExternal((Access)newValue);
				return;
			case EssencePackage.BIT_FIELD__ACCESS_INTERNAL:
				setAccessInternal((Access)newValue);
				return;
			case EssencePackage.BIT_FIELD__MAX_VAL:
				setMaxVal((String)newValue);
				return;
			case EssencePackage.BIT_FIELD__MIN_VAL:
				setMinVal((String)newValue);
				return;
			case EssencePackage.BIT_FIELD__RESERVED:
				setReserved((ReservedType)newValue);
				return;
			case EssencePackage.BIT_FIELD__SIGN_INTERPRETATION:
				setSignInterpretation((SignType)newValue);
				return;
			case EssencePackage.BIT_FIELD__VIRTUAL:
				setVirtual((VirtualType)newValue);
				return;
			case EssencePackage.BIT_FIELD__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case EssencePackage.BIT_FIELD__DEFAULT_MASK:
				setDefaultMask((String)newValue);
				return;
			case EssencePackage.BIT_FIELD__ACCESS_LEVEL:
				getAccessLevel().clear();
				getAccessLevel().addAll((Collection<? extends AccessLevel>)newValue);
				return;
			case EssencePackage.BIT_FIELD__ENUMERATION_ELEMENT:
				getEnumerationElement().clear();
				getEnumerationElement().addAll((Collection<? extends EnumerationElement>)newValue);
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
			case EssencePackage.BIT_FIELD__ACCESS_EXTERNAL:
				setAccessExternal((Access)null);
				return;
			case EssencePackage.BIT_FIELD__ACCESS_INTERNAL:
				setAccessInternal((Access)null);
				return;
			case EssencePackage.BIT_FIELD__MAX_VAL:
				setMaxVal(MAX_VAL_EDEFAULT);
				return;
			case EssencePackage.BIT_FIELD__MIN_VAL:
				setMinVal(MIN_VAL_EDEFAULT);
				return;
			case EssencePackage.BIT_FIELD__RESERVED:
				unsetReserved();
				return;
			case EssencePackage.BIT_FIELD__SIGN_INTERPRETATION:
				unsetSignInterpretation();
				return;
			case EssencePackage.BIT_FIELD__VIRTUAL:
				unsetVirtual();
				return;
			case EssencePackage.BIT_FIELD__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case EssencePackage.BIT_FIELD__DEFAULT_MASK:
				setDefaultMask(DEFAULT_MASK_EDEFAULT);
				return;
			case EssencePackage.BIT_FIELD__ACCESS_LEVEL:
				getAccessLevel().clear();
				return;
			case EssencePackage.BIT_FIELD__ENUMERATION_ELEMENT:
				getEnumerationElement().clear();
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
			case EssencePackage.BIT_FIELD__ACCESS_EXTERNAL:
				return accessExternal != null;
			case EssencePackage.BIT_FIELD__ACCESS_INTERNAL:
				return accessInternal != null;
			case EssencePackage.BIT_FIELD__MAX_VAL:
				return MAX_VAL_EDEFAULT == null ? maxVal != null : !MAX_VAL_EDEFAULT.equals(maxVal);
			case EssencePackage.BIT_FIELD__MIN_VAL:
				return MIN_VAL_EDEFAULT == null ? minVal != null : !MIN_VAL_EDEFAULT.equals(minVal);
			case EssencePackage.BIT_FIELD__RESERVED:
				return isSetReserved();
			case EssencePackage.BIT_FIELD__SIGN_INTERPRETATION:
				return isSetSignInterpretation();
			case EssencePackage.BIT_FIELD__VIRTUAL:
				return isSetVirtual();
			case EssencePackage.BIT_FIELD__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case EssencePackage.BIT_FIELD__DEFAULT_MASK:
				return DEFAULT_MASK_EDEFAULT == null ? defaultMask != null : !DEFAULT_MASK_EDEFAULT.equals(defaultMask);
			case EssencePackage.BIT_FIELD__ACCESS_LEVEL:
				return accessLevel != null && !accessLevel.isEmpty();
			case EssencePackage.BIT_FIELD__ENUMERATION_ELEMENT:
				return enumerationElement != null && !enumerationElement.isEmpty();
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
		result.append(" (maxVal: ");
		result.append(maxVal);
		result.append(", minVal: ");
		result.append(minVal);
		result.append(", reserved: ");
		if (reservedESet) result.append(reserved); else result.append("<unset>");
		result.append(", signInterpretation: ");
		if (signInterpretationESet) result.append(signInterpretation); else result.append("<unset>");
		result.append(", virtual: ");
		if (virtualESet) result.append(virtual); else result.append("<unset>");
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", defaultMask: ");
		result.append(defaultMask);
		result.append(')');
		return result.toString();
	}

} //BitFieldImpl
