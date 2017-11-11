/**
 */
package model.impl;

import java.util.Collection;

import model.DataTypeElement;
import model.ModelPackage;
import model.Record;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.RecordImpl#getDataTypeElement <em>Data Type Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordImpl extends ComplexDataTypeImpl implements Record {
	/**
	 * The cached value of the '{@link #getDataTypeElement() <em>Data Type Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeElement()
	 * @generated
	 * @ordered
	 */
	protected EList<DataTypeElement> dataTypeElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getRecord();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataTypeElement> getDataTypeElement() {
		if (dataTypeElement == null) {
			dataTypeElement = new EObjectContainmentEList<DataTypeElement>(DataTypeElement.class, this, ModelPackage.RECORD__DATA_TYPE_ELEMENT);
		}
		return dataTypeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.RECORD__DATA_TYPE_ELEMENT:
				return ((InternalEList<?>)getDataTypeElement()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.RECORD__DATA_TYPE_ELEMENT:
				return getDataTypeElement();
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
			case ModelPackage.RECORD__DATA_TYPE_ELEMENT:
				getDataTypeElement().clear();
				getDataTypeElement().addAll((Collection<? extends DataTypeElement>)newValue);
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
			case ModelPackage.RECORD__DATA_TYPE_ELEMENT:
				getDataTypeElement().clear();
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
			case ModelPackage.RECORD__DATA_TYPE_ELEMENT:
				return dataTypeElement != null && !dataTypeElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RecordImpl
