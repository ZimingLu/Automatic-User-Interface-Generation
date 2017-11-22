/**
 */
package Essence.impl;

import Essence.DescriptionItem;
import Essence.EssencePackage;
import Essence.PathRef;
import Essence.Property;
import Essence.SingleSourceNode;

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
 * An implementation of the model object '<em><b>Single Source Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.SingleSourceNodeImpl#getCustom <em>Custom</em>}</li>
 *   <li>{@link Essence.impl.SingleSourceNodeImpl#getHidden <em>Hidden</em>}</li>
 *   <li>{@link Essence.impl.SingleSourceNodeImpl#getID <em>ID</em>}</li>
 *   <li>{@link Essence.impl.SingleSourceNodeImpl#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link Essence.impl.SingleSourceNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Essence.impl.SingleSourceNodeImpl#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link Essence.impl.SingleSourceNodeImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link Essence.impl.SingleSourceNodeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link Essence.impl.SingleSourceNodeImpl#getXRefExtension <em>XRef Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SingleSourceNodeImpl extends EssenceBaseImpl implements SingleSourceNode {
	/**
	 * The default value of the '{@link #getCustom() <em>Custom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustom()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustom() <em>Custom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustom()
	 * @generated
	 * @ordered
	 */
	protected String custom = CUSTOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHidden()
	 * @generated
	 * @ordered
	 */
	protected static final String HIDDEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHidden()
	 * @generated
	 * @ordered
	 */
	protected String hidden = HIDDEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected int iD = ID_EDEFAULT;

	/**
	 * This is true if the ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDESet;

	/**
	 * The cached value of the '{@link #getLongDescription() <em>Long Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongDescription()
	 * @generated
	 * @ordered
	 */
	protected DescriptionItem longDescription;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortDescription() <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortDescription() <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortDescription()
	 * @generated
	 * @ordered
	 */
	protected String shortDescription = SHORT_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected String shortName = SHORT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> property;

	/**
	 * The cached value of the '{@link #getXRefExtension() <em>XRef Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<PathRef> xRefExtension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleSourceNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getSingleSourceNode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustom() {
		return custom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustom(String newCustom) {
		String oldCustom = custom;
		custom = newCustom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SINGLE_SOURCE_NODE__CUSTOM, oldCustom, custom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHidden() {
		return hidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHidden(String newHidden) {
		String oldHidden = hidden;
		hidden = newHidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SINGLE_SOURCE_NODE__HIDDEN, oldHidden, hidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(int newID) {
		int oldID = iD;
		iD = newID;
		boolean oldIDESet = iDESet;
		iDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SINGLE_SOURCE_NODE__ID, oldID, iD, !oldIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetID() {
		int oldID = iD;
		boolean oldIDESet = iDESet;
		iD = ID_EDEFAULT;
		iDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EssencePackage.SINGLE_SOURCE_NODE__ID, oldID, ID_EDEFAULT, oldIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetID() {
		return iDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionItem getLongDescription() {
		return longDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongDescription(DescriptionItem newLongDescription, NotificationChain msgs) {
		DescriptionItem oldLongDescription = longDescription;
		longDescription = newLongDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssencePackage.SINGLE_SOURCE_NODE__LONG_DESCRIPTION, oldLongDescription, newLongDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongDescription(DescriptionItem newLongDescription) {
		if (newLongDescription != longDescription) {
			NotificationChain msgs = null;
			if (longDescription != null)
				msgs = ((InternalEObject)longDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssencePackage.SINGLE_SOURCE_NODE__LONG_DESCRIPTION, null, msgs);
			if (newLongDescription != null)
				msgs = ((InternalEObject)newLongDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssencePackage.SINGLE_SOURCE_NODE__LONG_DESCRIPTION, null, msgs);
			msgs = basicSetLongDescription(newLongDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SINGLE_SOURCE_NODE__LONG_DESCRIPTION, newLongDescription, newLongDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SINGLE_SOURCE_NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortDescription() {
		return shortDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortDescription(String newShortDescription) {
		String oldShortDescription = shortDescription;
		shortDescription = newShortDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SINGLE_SOURCE_NODE__SHORT_DESCRIPTION, oldShortDescription, shortDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortName(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.SINGLE_SOURCE_NODE__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<Property>(Property.class, this, EssencePackage.SINGLE_SOURCE_NODE__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathRef> getXRefExtension() {
		if (xRefExtension == null) {
			xRefExtension = new EObjectContainmentEList<PathRef>(PathRef.class, this, EssencePackage.SINGLE_SOURCE_NODE__XREF_EXTENSION);
		}
		return xRefExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.SINGLE_SOURCE_NODE__LONG_DESCRIPTION:
				return basicSetLongDescription(null, msgs);
			case EssencePackage.SINGLE_SOURCE_NODE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case EssencePackage.SINGLE_SOURCE_NODE__XREF_EXTENSION:
				return ((InternalEList<?>)getXRefExtension()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.SINGLE_SOURCE_NODE__CUSTOM:
				return getCustom();
			case EssencePackage.SINGLE_SOURCE_NODE__HIDDEN:
				return getHidden();
			case EssencePackage.SINGLE_SOURCE_NODE__ID:
				return getID();
			case EssencePackage.SINGLE_SOURCE_NODE__LONG_DESCRIPTION:
				return getLongDescription();
			case EssencePackage.SINGLE_SOURCE_NODE__NAME:
				return getName();
			case EssencePackage.SINGLE_SOURCE_NODE__SHORT_DESCRIPTION:
				return getShortDescription();
			case EssencePackage.SINGLE_SOURCE_NODE__SHORT_NAME:
				return getShortName();
			case EssencePackage.SINGLE_SOURCE_NODE__PROPERTY:
				return getProperty();
			case EssencePackage.SINGLE_SOURCE_NODE__XREF_EXTENSION:
				return getXRefExtension();
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
			case EssencePackage.SINGLE_SOURCE_NODE__CUSTOM:
				setCustom((String)newValue);
				return;
			case EssencePackage.SINGLE_SOURCE_NODE__HIDDEN:
				setHidden((String)newValue);
				return;
			case EssencePackage.SINGLE_SOURCE_NODE__ID:
				setID((Integer)newValue);
				return;
			case EssencePackage.SINGLE_SOURCE_NODE__LONG_DESCRIPTION:
				setLongDescription((DescriptionItem)newValue);
				return;
			case EssencePackage.SINGLE_SOURCE_NODE__NAME:
				setName((String)newValue);
				return;
			case EssencePackage.SINGLE_SOURCE_NODE__SHORT_DESCRIPTION:
				setShortDescription((String)newValue);
				return;
			case EssencePackage.SINGLE_SOURCE_NODE__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case EssencePackage.SINGLE_SOURCE_NODE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case EssencePackage.SINGLE_SOURCE_NODE__XREF_EXTENSION:
				getXRefExtension().clear();
				getXRefExtension().addAll((Collection<? extends PathRef>)newValue);
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
			case EssencePackage.SINGLE_SOURCE_NODE__CUSTOM:
				setCustom(CUSTOM_EDEFAULT);
				return;
			case EssencePackage.SINGLE_SOURCE_NODE__HIDDEN:
				setHidden(HIDDEN_EDEFAULT);
				return;
			case EssencePackage.SINGLE_SOURCE_NODE__ID:
				unsetID();
				return;
			case EssencePackage.SINGLE_SOURCE_NODE__LONG_DESCRIPTION:
				setLongDescription((DescriptionItem)null);
				return;
			case EssencePackage.SINGLE_SOURCE_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EssencePackage.SINGLE_SOURCE_NODE__SHORT_DESCRIPTION:
				setShortDescription(SHORT_DESCRIPTION_EDEFAULT);
				return;
			case EssencePackage.SINGLE_SOURCE_NODE__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case EssencePackage.SINGLE_SOURCE_NODE__PROPERTY:
				getProperty().clear();
				return;
			case EssencePackage.SINGLE_SOURCE_NODE__XREF_EXTENSION:
				getXRefExtension().clear();
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
			case EssencePackage.SINGLE_SOURCE_NODE__CUSTOM:
				return CUSTOM_EDEFAULT == null ? custom != null : !CUSTOM_EDEFAULT.equals(custom);
			case EssencePackage.SINGLE_SOURCE_NODE__HIDDEN:
				return HIDDEN_EDEFAULT == null ? hidden != null : !HIDDEN_EDEFAULT.equals(hidden);
			case EssencePackage.SINGLE_SOURCE_NODE__ID:
				return isSetID();
			case EssencePackage.SINGLE_SOURCE_NODE__LONG_DESCRIPTION:
				return longDescription != null;
			case EssencePackage.SINGLE_SOURCE_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EssencePackage.SINGLE_SOURCE_NODE__SHORT_DESCRIPTION:
				return SHORT_DESCRIPTION_EDEFAULT == null ? shortDescription != null : !SHORT_DESCRIPTION_EDEFAULT.equals(shortDescription);
			case EssencePackage.SINGLE_SOURCE_NODE__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case EssencePackage.SINGLE_SOURCE_NODE__PROPERTY:
				return property != null && !property.isEmpty();
			case EssencePackage.SINGLE_SOURCE_NODE__XREF_EXTENSION:
				return xRefExtension != null && !xRefExtension.isEmpty();
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
		result.append(" (custom: ");
		result.append(custom);
		result.append(", hidden: ");
		result.append(hidden);
		result.append(", iD: ");
		if (iDESet) result.append(iD); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", shortDescription: ");
		result.append(shortDescription);
		result.append(", shortName: ");
		result.append(shortName);
		result.append(')');
		return result.toString();
	}

} //SingleSourceNodeImpl
