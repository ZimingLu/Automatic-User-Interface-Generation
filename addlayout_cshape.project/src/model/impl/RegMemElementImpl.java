/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import java.math.BigInteger;

import java.util.Map;

import model.ModelPackage;
import model.RegMemElement;

import modelextension.ModelextensionPackage;
import modelextension.Offset;
import modelextension.OffsetSequenceElement;
import modelextension.SequenceElementBase;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reg Mem Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.RegMemElementImpl#getSequenceIndex <em>Sequence Index</em>}</li>
 *   <li>{@link model.impl.RegMemElementImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link model.impl.RegMemElementImpl#getRelOffset <em>Rel Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RegMemElementImpl extends IndexVarUserImpl implements RegMemElement {
	/**
	 * The default value of the '{@link #getSequenceIndex() <em>Sequence Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequenceIndex() <em>Sequence Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceIndex()
	 * @generated
	 * @ordered
	 */
	protected int sequenceIndex = SEQUENCE_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected String offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelOffset() <em>Rel Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String REL_OFFSET_EDEFAULT = "0x0";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegMemElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getRegMemElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSequenceIndex() {
		return sequenceIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceIndex(int newSequenceIndex) {
		int oldSequenceIndex = sequenceIndex;
		sequenceIndex = newSequenceIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REG_MEM_ELEMENT__SEQUENCE_INDEX, oldSequenceIndex, sequenceIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(String newOffset) {
		String oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REG_MEM_ELEMENT__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelOffset() {
		return InternalModelServiceImpl.REGMEMSERVICE.getRegMemElementRelOffSet(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelOffset(String newRelOffset) {
		// TODO: implement this method to set the 'Rel Offset' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLength(final Map<String, Integer> ixVars) {
		return InternalModelServiceImpl.SEQUENCESERVICE.getLength(this, ixVars);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFullLength(final Map<String, Integer> ixVars) {
		return InternalModelServiceImpl.SEQUENCESERVICE.getFullLength(this, ixVars);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.REG_MEM_ELEMENT__SEQUENCE_INDEX:
				return getSequenceIndex();
			case ModelPackage.REG_MEM_ELEMENT__OFFSET:
				return getOffset();
			case ModelPackage.REG_MEM_ELEMENT__REL_OFFSET:
				return getRelOffset();
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
			case ModelPackage.REG_MEM_ELEMENT__SEQUENCE_INDEX:
				setSequenceIndex((Integer)newValue);
				return;
			case ModelPackage.REG_MEM_ELEMENT__OFFSET:
				setOffset((String)newValue);
				return;
			case ModelPackage.REG_MEM_ELEMENT__REL_OFFSET:
				setRelOffset((String)newValue);
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
			case ModelPackage.REG_MEM_ELEMENT__SEQUENCE_INDEX:
				setSequenceIndex(SEQUENCE_INDEX_EDEFAULT);
				return;
			case ModelPackage.REG_MEM_ELEMENT__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case ModelPackage.REG_MEM_ELEMENT__REL_OFFSET:
				setRelOffset(REL_OFFSET_EDEFAULT);
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
			case ModelPackage.REG_MEM_ELEMENT__SEQUENCE_INDEX:
				return sequenceIndex != SEQUENCE_INDEX_EDEFAULT;
			case ModelPackage.REG_MEM_ELEMENT__OFFSET:
				return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
			case ModelPackage.REG_MEM_ELEMENT__REL_OFFSET:
				return REL_OFFSET_EDEFAULT == null ? getRelOffset() != null : !REL_OFFSET_EDEFAULT.equals(getRelOffset());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SequenceElementBase.class) {
			switch (derivedFeatureID) {
				case ModelPackage.REG_MEM_ELEMENT__SEQUENCE_INDEX: return ModelextensionPackage.SEQUENCE_ELEMENT_BASE__SEQUENCE_INDEX;
				default: return -1;
			}
		}
		if (baseClass == Offset.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == OffsetSequenceElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SequenceElementBase.class) {
			switch (baseFeatureID) {
				case ModelextensionPackage.SEQUENCE_ELEMENT_BASE__SEQUENCE_INDEX: return ModelPackage.REG_MEM_ELEMENT__SEQUENCE_INDEX;
				default: return -1;
			}
		}
		if (baseClass == Offset.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == OffsetSequenceElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == SequenceElementBase.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Offset.class) {
			switch (baseOperationID) {
				case ModelextensionPackage.OFFSET___GET_OFFSET_VALUE__MAP: return ModelPackage.REG_MEM_ELEMENT___GET_OFFSET_VALUE__MAP;
				case ModelextensionPackage.OFFSET___SET_OFFSET__STRING: return ModelPackage.REG_MEM_ELEMENT___SET_OFFSET__STRING;
				default: return -1;
			}
		}
		if (baseClass == OffsetSequenceElement.class) {
			switch (baseOperationID) {
				case ModelextensionPackage.OFFSET_SEQUENCE_ELEMENT___GET_LENGTH__MAP: return ModelPackage.REG_MEM_ELEMENT___GET_LENGTH__MAP;
				case ModelextensionPackage.OFFSET_SEQUENCE_ELEMENT___GET_FULL_LENGTH__MAP: return ModelPackage.REG_MEM_ELEMENT___GET_FULL_LENGTH__MAP;
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
			case ModelPackage.REG_MEM_ELEMENT___GET_LENGTH__MAP:
				return getLength((Map<String, Integer>)arguments.get(0));
			case ModelPackage.REG_MEM_ELEMENT___GET_FULL_LENGTH__MAP:
				return getFullLength((Map<String, Integer>)arguments.get(0));
			case ModelPackage.REG_MEM_ELEMENT___GET_OFFSET_VALUE__MAP:
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
		result.append(" (SequenceIndex: ");
		result.append(sequenceIndex);
		result.append(", offset: ");
		result.append(offset);
		result.append(')');
		return result.toString();
	}

} //RegMemElementImpl
