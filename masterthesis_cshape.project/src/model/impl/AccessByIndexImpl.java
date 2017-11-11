/**
 */
package model.impl;

import model.AccessByIndex;
import model.ModelPackage;
import model.SimpleSubElementAccess;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access By Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.AccessByIndexImpl#isAscending <em>Ascending</em>}</li>
 *   <li>{@link model.impl.AccessByIndexImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link model.impl.AccessByIndexImpl#getRight <em>Right</em>}</li>
 *   <li>{@link model.impl.AccessByIndexImpl#getSimpleSubElementAccess <em>Simple Sub Element Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessByIndexImpl extends SimpleSubElementAccessImpl implements AccessByIndex {
	/**
	 * The default value of the '{@link #isAscending() <em>Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAscending()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASCENDING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAscending() <em>Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAscending()
	 * @generated
	 * @ordered
	 */
	protected boolean ascending = ASCENDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected static final String LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected String left = LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected static final String RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected String right = RIGHT_EDEFAULT;

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
	protected AccessByIndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getAccessByIndex();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAscending() {
		return ascending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAscending(boolean newAscending) {
		boolean oldAscending = ascending;
		ascending = newAscending;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACCESS_BY_INDEX__ASCENDING, oldAscending, ascending));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(String newLeft) {
		String oldLeft = left;
		left = newLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACCESS_BY_INDEX__LEFT, oldLeft, left));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(String newRight) {
		String oldRight = right;
		right = newRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACCESS_BY_INDEX__RIGHT, oldRight, right));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.ACCESS_BY_INDEX__SIMPLE_SUB_ELEMENT_ACCESS, oldSimpleSubElementAccess, newSimpleSubElementAccess);
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
				msgs = ((InternalEObject)simpleSubElementAccess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ACCESS_BY_INDEX__SIMPLE_SUB_ELEMENT_ACCESS, null, msgs);
			if (newSimpleSubElementAccess != null)
				msgs = ((InternalEObject)newSimpleSubElementAccess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.ACCESS_BY_INDEX__SIMPLE_SUB_ELEMENT_ACCESS, null, msgs);
			msgs = basicSetSimpleSubElementAccess(newSimpleSubElementAccess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ACCESS_BY_INDEX__SIMPLE_SUB_ELEMENT_ACCESS, newSimpleSubElementAccess, newSimpleSubElementAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ACCESS_BY_INDEX__SIMPLE_SUB_ELEMENT_ACCESS:
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
			case ModelPackage.ACCESS_BY_INDEX__ASCENDING:
				return isAscending();
			case ModelPackage.ACCESS_BY_INDEX__LEFT:
				return getLeft();
			case ModelPackage.ACCESS_BY_INDEX__RIGHT:
				return getRight();
			case ModelPackage.ACCESS_BY_INDEX__SIMPLE_SUB_ELEMENT_ACCESS:
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
			case ModelPackage.ACCESS_BY_INDEX__ASCENDING:
				setAscending((Boolean)newValue);
				return;
			case ModelPackage.ACCESS_BY_INDEX__LEFT:
				setLeft((String)newValue);
				return;
			case ModelPackage.ACCESS_BY_INDEX__RIGHT:
				setRight((String)newValue);
				return;
			case ModelPackage.ACCESS_BY_INDEX__SIMPLE_SUB_ELEMENT_ACCESS:
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
			case ModelPackage.ACCESS_BY_INDEX__ASCENDING:
				setAscending(ASCENDING_EDEFAULT);
				return;
			case ModelPackage.ACCESS_BY_INDEX__LEFT:
				setLeft(LEFT_EDEFAULT);
				return;
			case ModelPackage.ACCESS_BY_INDEX__RIGHT:
				setRight(RIGHT_EDEFAULT);
				return;
			case ModelPackage.ACCESS_BY_INDEX__SIMPLE_SUB_ELEMENT_ACCESS:
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
			case ModelPackage.ACCESS_BY_INDEX__ASCENDING:
				return ascending != ASCENDING_EDEFAULT;
			case ModelPackage.ACCESS_BY_INDEX__LEFT:
				return LEFT_EDEFAULT == null ? left != null : !LEFT_EDEFAULT.equals(left);
			case ModelPackage.ACCESS_BY_INDEX__RIGHT:
				return RIGHT_EDEFAULT == null ? right != null : !RIGHT_EDEFAULT.equals(right);
			case ModelPackage.ACCESS_BY_INDEX__SIMPLE_SUB_ELEMENT_ACCESS:
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
		result.append(" (ascending: ");
		result.append(ascending);
		result.append(", left: ");
		result.append(left);
		result.append(", right: ");
		result.append(right);
		result.append(')');
		return result.toString();
	}

} //AccessByIndexImpl
