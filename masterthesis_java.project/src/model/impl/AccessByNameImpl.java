/**
 */
package model.impl;

import model.AccessByName;
import model.ModelPackage;
import model.SimpleSubElementAccess;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access By Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.AccessByNameImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.impl.AccessByNameImpl#getSimpleSubElementAccess <em>Simple Sub Element Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessByNameImpl extends SimpleSubElementAccessImpl implements AccessByName {
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
	 * The cached value of the '{@link #getSimpleSubElementAccess() <em>Simple Sub Element Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleSubElementAccess()
	 * @generated
	 * @ordered
	 */
	protected SimpleSubElementAccess simpleSubElementAccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessByNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getAccessByName();
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACCESS_BY_NAME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSubElementAccess getSimpleSubElementAccess() {
		return simpleSubElementAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleSubElementAccess(SimpleSubElementAccess newSimpleSubElementAccess, NotificationChain msgs) {
		SimpleSubElementAccess oldSimpleSubElementAccess = simpleSubElementAccess;
		simpleSubElementAccess = newSimpleSubElementAccess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ACCESS_BY_NAME__SIMPLE_SUB_ELEMENT_ACCESS, oldSimpleSubElementAccess, newSimpleSubElementAccess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleSubElementAccess(SimpleSubElementAccess newSimpleSubElementAccess) {
		if (newSimpleSubElementAccess != simpleSubElementAccess) {
			NotificationChain msgs = null;
			if (simpleSubElementAccess != null)
				msgs = ((InternalEObject)simpleSubElementAccess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ACCESS_BY_NAME__SIMPLE_SUB_ELEMENT_ACCESS, null, msgs);
			if (newSimpleSubElementAccess != null)
				msgs = ((InternalEObject)newSimpleSubElementAccess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ACCESS_BY_NAME__SIMPLE_SUB_ELEMENT_ACCESS, null, msgs);
			msgs = basicSetSimpleSubElementAccess(newSimpleSubElementAccess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACCESS_BY_NAME__SIMPLE_SUB_ELEMENT_ACCESS, newSimpleSubElementAccess, newSimpleSubElementAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ACCESS_BY_NAME__SIMPLE_SUB_ELEMENT_ACCESS:
				return basicSetSimpleSubElementAccess(null, msgs);
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
			case ModelPackage.ACCESS_BY_NAME__NAME:
				return getName();
			case ModelPackage.ACCESS_BY_NAME__SIMPLE_SUB_ELEMENT_ACCESS:
				return getSimpleSubElementAccess();
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
			case ModelPackage.ACCESS_BY_NAME__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.ACCESS_BY_NAME__SIMPLE_SUB_ELEMENT_ACCESS:
				setSimpleSubElementAccess((SimpleSubElementAccess)newValue);
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
			case ModelPackage.ACCESS_BY_NAME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.ACCESS_BY_NAME__SIMPLE_SUB_ELEMENT_ACCESS:
				setSimpleSubElementAccess((SimpleSubElementAccess)null);
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
			case ModelPackage.ACCESS_BY_NAME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.ACCESS_BY_NAME__SIMPLE_SUB_ELEMENT_ACCESS:
				return simpleSubElementAccess != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AccessByNameImpl
