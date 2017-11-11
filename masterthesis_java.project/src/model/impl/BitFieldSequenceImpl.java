/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import java.math.BigInteger;

import java.util.Collection;
import java.util.Map;

import model.BitFieldSequence;
import model.BitFieldSequenceElement;
import model.ModelPackage;

import modelextension.ModelextensionPackage;
import modelextension.Offset;
import modelextension.OffsetSequence;
import modelextension.SequenceBase;

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
 * An implementation of the model object '<em><b>Bit Field Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.BitFieldSequenceImpl#getCount <em>Count</em>}</li>
 *   <li>{@link model.impl.BitFieldSequenceImpl#getMinIndex <em>Min Index</em>}</li>
 *   <li>{@link model.impl.BitFieldSequenceImpl#getIndexStep <em>Index Step</em>}</li>
 *   <li>{@link model.impl.BitFieldSequenceImpl#getIndexVar <em>Index Var</em>}</li>
 *   <li>{@link model.impl.BitFieldSequenceImpl#getAltFormat <em>Alt Format</em>}</li>
 *   <li>{@link model.impl.BitFieldSequenceImpl#getBitFieldSequenceElement <em>Bit Field Sequence Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BitFieldSequenceImpl extends BitFieldElementImpl implements BitFieldSequence {
	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNT_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected String count = COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinIndex() <em>Min Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinIndex() <em>Min Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinIndex()
	 * @generated
	 * @ordered
	 */
	protected String minIndex = MIN_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndexStep() <em>Index Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexStep()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_STEP_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getIndexStep() <em>Index Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexStep()
	 * @generated
	 * @ordered
	 */
	protected String indexStep = INDEX_STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndexVar() <em>Index Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexVar()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_VAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndexVar() <em>Index Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexVar()
	 * @generated
	 * @ordered
	 */
	protected String indexVar = INDEX_VAR_EDEFAULT;

	/**
	 * This is true if the Index Var attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean indexVarESet;

	/**
	 * The default value of the '{@link #getAltFormat() <em>Alt Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String ALT_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAltFormat() <em>Alt Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltFormat()
	 * @generated
	 * @ordered
	 */
	protected String altFormat = ALT_FORMAT_EDEFAULT;

	/**
	 * This is true if the Alt Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean altFormatESet;

	/**
	 * The cached value of the '{@link #getBitFieldSequenceElement() <em>Bit Field Sequence Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitFieldSequenceElement()
	 * @generated
	 * @ordered
	 */
	protected EList<BitFieldSequenceElement> bitFieldSequenceElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitFieldSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getBitFieldSequence();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(String newCount) {
		String oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BIT_FIELD_SEQUENCE__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinIndex() {
		return minIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinIndex(String newMinIndex) {
		String oldMinIndex = minIndex;
		minIndex = newMinIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BIT_FIELD_SEQUENCE__MIN_INDEX, oldMinIndex, minIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndexStep() {
		return indexStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexStep(String newIndexStep) {
		String oldIndexStep = indexStep;
		indexStep = newIndexStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BIT_FIELD_SEQUENCE__INDEX_STEP, oldIndexStep, indexStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndexVar() {
		return indexVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexVar(String newIndexVar) {
		String oldIndexVar = indexVar;
		indexVar = newIndexVar;
		boolean oldIndexVarESet = indexVarESet;
		indexVarESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BIT_FIELD_SEQUENCE__INDEX_VAR, oldIndexVar, indexVar, !oldIndexVarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIndexVar() {
		String oldIndexVar = indexVar;
		boolean oldIndexVarESet = indexVarESet;
		indexVar = INDEX_VAR_EDEFAULT;
		indexVarESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.BIT_FIELD_SEQUENCE__INDEX_VAR, oldIndexVar, INDEX_VAR_EDEFAULT, oldIndexVarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIndexVar() {
		return indexVarESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAltFormat() {
		return altFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltFormat(String newAltFormat) {
		String oldAltFormat = altFormat;
		altFormat = newAltFormat;
		boolean oldAltFormatESet = altFormatESet;
		altFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BIT_FIELD_SEQUENCE__ALT_FORMAT, oldAltFormat, altFormat, !oldAltFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAltFormat() {
		String oldAltFormat = altFormat;
		boolean oldAltFormatESet = altFormatESet;
		altFormat = ALT_FORMAT_EDEFAULT;
		altFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.BIT_FIELD_SEQUENCE__ALT_FORMAT, oldAltFormat, ALT_FORMAT_EDEFAULT, oldAltFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAltFormat() {
		return altFormatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BitFieldSequenceElement> getBitFieldSequenceElement() {
		if (bitFieldSequenceElement == null) {
			bitFieldSequenceElement = new EObjectContainmentEList<BitFieldSequenceElement>(BitFieldSequenceElement.class, this, ModelPackage.BIT_FIELD_SEQUENCE__BIT_FIELD_SEQUENCE_ELEMENT);
		}
		return bitFieldSequenceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BitFieldSequenceElement> getElement() {
		return this.getBitFieldSequenceElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLength(final Map<String, Integer> ixVars) {
		return com.infineon.essence.model.impl.InternalModelServiceImpl.SEQUENCESERVICE.getLength((OffsetSequence<?>)this, ixVars);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCountValue(final Map<String, Integer> ixVars) {
		return InternalModelServiceImpl.EXPRESSIONSERVICE.getIntegerExpression(this, this.getCount(), ixVars);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinIndexValue(final Map<String, Integer> ixVars) {
		return InternalModelServiceImpl.EXPRESSIONSERVICE.getIntegerExpression(this, this.getMinIndex(), ixVars);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getIndexStepValue(final Map<String, Integer> ixVars) {
		return InternalModelServiceImpl.EXPRESSIONSERVICE.getIntegerExpression(this, this.getIndexStep(), ixVars);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOffsetValue(final Map<String, Integer> ixVars) {
		return InternalModelServiceImpl.EXPRESSIONSERVICE.getIntegerExpression(this, this.getOffset(), ixVars);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.BIT_FIELD_SEQUENCE__BIT_FIELD_SEQUENCE_ELEMENT:
				return ((InternalEList<?>)getBitFieldSequenceElement()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.BIT_FIELD_SEQUENCE__COUNT:
				return getCount();
			case ModelPackage.BIT_FIELD_SEQUENCE__MIN_INDEX:
				return getMinIndex();
			case ModelPackage.BIT_FIELD_SEQUENCE__INDEX_STEP:
				return getIndexStep();
			case ModelPackage.BIT_FIELD_SEQUENCE__INDEX_VAR:
				return getIndexVar();
			case ModelPackage.BIT_FIELD_SEQUENCE__ALT_FORMAT:
				return getAltFormat();
			case ModelPackage.BIT_FIELD_SEQUENCE__BIT_FIELD_SEQUENCE_ELEMENT:
				return getBitFieldSequenceElement();
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
			case ModelPackage.BIT_FIELD_SEQUENCE__COUNT:
				setCount((String)newValue);
				return;
			case ModelPackage.BIT_FIELD_SEQUENCE__MIN_INDEX:
				setMinIndex((String)newValue);
				return;
			case ModelPackage.BIT_FIELD_SEQUENCE__INDEX_STEP:
				setIndexStep((String)newValue);
				return;
			case ModelPackage.BIT_FIELD_SEQUENCE__INDEX_VAR:
				setIndexVar((String)newValue);
				return;
			case ModelPackage.BIT_FIELD_SEQUENCE__ALT_FORMAT:
				setAltFormat((String)newValue);
				return;
			case ModelPackage.BIT_FIELD_SEQUENCE__BIT_FIELD_SEQUENCE_ELEMENT:
				getBitFieldSequenceElement().clear();
				getBitFieldSequenceElement().addAll((Collection<? extends BitFieldSequenceElement>)newValue);
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
			case ModelPackage.BIT_FIELD_SEQUENCE__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case ModelPackage.BIT_FIELD_SEQUENCE__MIN_INDEX:
				setMinIndex(MIN_INDEX_EDEFAULT);
				return;
			case ModelPackage.BIT_FIELD_SEQUENCE__INDEX_STEP:
				setIndexStep(INDEX_STEP_EDEFAULT);
				return;
			case ModelPackage.BIT_FIELD_SEQUENCE__INDEX_VAR:
				unsetIndexVar();
				return;
			case ModelPackage.BIT_FIELD_SEQUENCE__ALT_FORMAT:
				unsetAltFormat();
				return;
			case ModelPackage.BIT_FIELD_SEQUENCE__BIT_FIELD_SEQUENCE_ELEMENT:
				getBitFieldSequenceElement().clear();
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
			case ModelPackage.BIT_FIELD_SEQUENCE__COUNT:
				return COUNT_EDEFAULT == null ? count != null : !COUNT_EDEFAULT.equals(count);
			case ModelPackage.BIT_FIELD_SEQUENCE__MIN_INDEX:
				return MIN_INDEX_EDEFAULT == null ? minIndex != null : !MIN_INDEX_EDEFAULT.equals(minIndex);
			case ModelPackage.BIT_FIELD_SEQUENCE__INDEX_STEP:
				return INDEX_STEP_EDEFAULT == null ? indexStep != null : !INDEX_STEP_EDEFAULT.equals(indexStep);
			case ModelPackage.BIT_FIELD_SEQUENCE__INDEX_VAR:
				return isSetIndexVar();
			case ModelPackage.BIT_FIELD_SEQUENCE__ALT_FORMAT:
				return isSetAltFormat();
			case ModelPackage.BIT_FIELD_SEQUENCE__BIT_FIELD_SEQUENCE_ELEMENT:
				return bitFieldSequenceElement != null && !bitFieldSequenceElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Offset.class) {
			switch (baseOperationID) {
				case ModelextensionPackage.OFFSET___GET_OFFSET_VALUE__MAP: return ModelPackage.BIT_FIELD_SEQUENCE___GET_OFFSET_VALUE__MAP;
				case ModelextensionPackage.OFFSET___SET_OFFSET__STRING: return ModelPackage.BIT_FIELD_SEQUENCE___SET_OFFSET__STRING;
				default: return -1;
			}
		}
		if (baseClass == SequenceBase.class) {
			switch (baseOperationID) {
				case ModelextensionPackage.SEQUENCE_BASE___GET_COUNT_VALUE__MAP: return ModelPackage.BIT_FIELD_SEQUENCE___GET_COUNT_VALUE__MAP;
				case ModelextensionPackage.SEQUENCE_BASE___GET_MIN_INDEX_VALUE__MAP: return ModelPackage.BIT_FIELD_SEQUENCE___GET_MIN_INDEX_VALUE__MAP;
				case ModelextensionPackage.SEQUENCE_BASE___GET_INDEX_STEP_VALUE__MAP: return ModelPackage.BIT_FIELD_SEQUENCE___GET_INDEX_STEP_VALUE__MAP;
				case ModelextensionPackage.SEQUENCE_BASE___GET_INDEX_VAR: return ModelPackage.BIT_FIELD_SEQUENCE___GET_INDEX_VAR;
				case ModelextensionPackage.SEQUENCE_BASE___GET_ELEMENT: return ModelPackage.BIT_FIELD_SEQUENCE___GET_ELEMENT;
				case ModelextensionPackage.SEQUENCE_BASE___GET_ALT_FORMAT: return ModelPackage.BIT_FIELD_SEQUENCE___GET_ALT_FORMAT;
				default: return -1;
			}
		}
		if (baseClass == OffsetSequence.class) {
			switch (baseOperationID) {
				case ModelextensionPackage.OFFSET_SEQUENCE___GET_LENGTH__MAP: return ModelPackage.BIT_FIELD_SEQUENCE___GET_LENGTH__MAP;
				case ModelextensionPackage.OFFSET_SEQUENCE___GET_ELEMENT: return ModelPackage.BIT_FIELD_SEQUENCE___GET_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.BIT_FIELD_SEQUENCE___GET_ELEMENT:
				return getElement();
			case ModelPackage.BIT_FIELD_SEQUENCE___GET_LENGTH__MAP:
				return getLength((Map<String, Integer>)arguments.get(0));
			case ModelPackage.BIT_FIELD_SEQUENCE___GET_COUNT_VALUE__MAP:
				return getCountValue((Map<String, Integer>)arguments.get(0));
			case ModelPackage.BIT_FIELD_SEQUENCE___GET_MIN_INDEX_VALUE__MAP:
				return getMinIndexValue((Map<String, Integer>)arguments.get(0));
			case ModelPackage.BIT_FIELD_SEQUENCE___GET_INDEX_STEP_VALUE__MAP:
				return getIndexStepValue((Map<String, Integer>)arguments.get(0));
			case ModelPackage.BIT_FIELD_SEQUENCE___GET_OFFSET_VALUE__MAP:
				return getOffsetValue((Map<String, Integer>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (count: ");
		result.append(count);
		result.append(", minIndex: ");
		result.append(minIndex);
		result.append(", indexStep: ");
		result.append(indexStep);
		result.append(", indexVar: ");
		if (indexVarESet) result.append(indexVar); else result.append("<unset>");
		result.append(", altFormat: ");
		if (altFormatESet) result.append(altFormat); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BitFieldSequenceImpl
