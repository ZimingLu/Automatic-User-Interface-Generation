/**
 */
package model.impl;

import java.util.Collection;

import model.MethodDataType;
import model.MethodDataTypeElement;
import model.ModelPackage;
import model.ReturnDataType;

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
 *   <li>{@link model.impl.MethodDataTypeImpl#getReturnDataType <em>Return Data Type</em>}</li>
 *   <li>{@link model.impl.MethodDataTypeImpl#isReference <em>Reference</em>}</li>
 *   <li>{@link model.impl.MethodDataTypeImpl#getMethodDataTypeElement <em>Method Data Type Element</em>}</li>
 *   <li>{@link model.impl.MethodDataTypeImpl#isCheckVoid <em>Check Void</em>}</li>
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
	 * The cached value of the '{@link #getMethodDataTypeElement() <em>Method Data Type Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodDataTypeElement()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodDataTypeElement> methodDataTypeElement;

	/**
	 * The default value of the '{@link #isCheckVoid() <em>Check Void</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckVoid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_VOID_EDEFAULT = false;

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
		return ModelPackage.eINSTANCE.getMethodDataType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.METHOD_DATA_TYPE__RETURN_DATA_TYPE, oldReturnDataType, newReturnDataType);
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
				msgs = ((InternalEObject)returnDataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.METHOD_DATA_TYPE__RETURN_DATA_TYPE, null, msgs);
			if (newReturnDataType != null)
				msgs = ((InternalEObject)newReturnDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.METHOD_DATA_TYPE__RETURN_DATA_TYPE, null, msgs);
			msgs = basicSetReturnDataType(newReturnDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.METHOD_DATA_TYPE__RETURN_DATA_TYPE, newReturnDataType, newReturnDataType));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.METHOD_DATA_TYPE__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodDataTypeElement> getMethodDataTypeElement() {
		if (methodDataTypeElement == null) {
			methodDataTypeElement = new EObjectContainmentEList<MethodDataTypeElement>(MethodDataTypeElement.class, this, ModelPackage.METHOD_DATA_TYPE__METHOD_DATA_TYPE_ELEMENT);
		}
		return methodDataTypeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckVoid() {
		if (this.getReturnDataType() instanceof com.infineon.essence.model.SimpleDataType)
				    return true;
				return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.METHOD_DATA_TYPE__RETURN_DATA_TYPE:
				return basicSetReturnDataType(null, msgs);
			case ModelPackage.METHOD_DATA_TYPE__METHOD_DATA_TYPE_ELEMENT:
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
			case ModelPackage.METHOD_DATA_TYPE__RETURN_DATA_TYPE:
				return getReturnDataType();
			case ModelPackage.METHOD_DATA_TYPE__REFERENCE:
				return isReference();
			case ModelPackage.METHOD_DATA_TYPE__METHOD_DATA_TYPE_ELEMENT:
				return getMethodDataTypeElement();
			case ModelPackage.METHOD_DATA_TYPE__CHECK_VOID:
				return isCheckVoid();
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
			case ModelPackage.METHOD_DATA_TYPE__RETURN_DATA_TYPE:
				setReturnDataType((ReturnDataType)newValue);
				return;
			case ModelPackage.METHOD_DATA_TYPE__REFERENCE:
				setReference((Boolean)newValue);
				return;
			case ModelPackage.METHOD_DATA_TYPE__METHOD_DATA_TYPE_ELEMENT:
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
			case ModelPackage.METHOD_DATA_TYPE__RETURN_DATA_TYPE:
				setReturnDataType((ReturnDataType)null);
				return;
			case ModelPackage.METHOD_DATA_TYPE__REFERENCE:
				setReference(REFERENCE_EDEFAULT);
				return;
			case ModelPackage.METHOD_DATA_TYPE__METHOD_DATA_TYPE_ELEMENT:
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
			case ModelPackage.METHOD_DATA_TYPE__RETURN_DATA_TYPE:
				return returnDataType != null;
			case ModelPackage.METHOD_DATA_TYPE__REFERENCE:
				return reference != REFERENCE_EDEFAULT;
			case ModelPackage.METHOD_DATA_TYPE__METHOD_DATA_TYPE_ELEMENT:
				return methodDataTypeElement != null && !methodDataTypeElement.isEmpty();
			case ModelPackage.METHOD_DATA_TYPE__CHECK_VOID:
				return isCheckVoid() != CHECK_VOID_EDEFAULT;
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
		result.append(reference);
		result.append(')');
		return result.toString();
	}

} //MethodDataTypeImpl
