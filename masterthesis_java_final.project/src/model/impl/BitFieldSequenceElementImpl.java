/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import java.math.BigInteger;

import java.util.Map;

import model.BitFieldSequenceElement;
import model.ModelPackage;

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
 * An implementation of the model object '<em><b>Bit Field Sequence Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.BitFieldSequenceElementImpl#getSequenceIndex <em>Sequence Index</em>}</li>
 *   <li>{@link model.impl.BitFieldSequenceElementImpl#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BitFieldSequenceElementImpl extends BitFieldElementImpl implements BitFieldSequenceElement {
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
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitFieldSequenceElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getBitFieldSequenceElement();
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BIT_FIELD_SEQUENCE_ELEMENT__SEQUENCE_INDEX, oldSequenceIndex, sequenceIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BIT_FIELD_SEQUENCE_ELEMENT__WIDTH, oldWidth, width));
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
			case ModelPackage.BIT_FIELD_SEQUENCE_ELEMENT__SEQUENCE_INDEX:
				return getSequenceIndex();
			case ModelPackage.BIT_FIELD_SEQUENCE_ELEMENT__WIDTH:
				return getWidth();
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
			case ModelPackage.BIT_FIELD_SEQUENCE_ELEMENT__SEQUENCE_INDEX:
				setSequenceIndex((Integer)newValue);
				return;
			case ModelPackage.BIT_FIELD_SEQUENCE_ELEMENT__WIDTH:
				setWidth((String)newValue);
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
			case ModelPackage.BIT_FIELD_SEQUENCE_ELEMENT__SEQUENCE_INDEX:
				setSequenceIndex(SEQUENCE_INDEX_EDEFAULT);
				return;
			case ModelPackage.BIT_FIELD_SEQUENCE_ELEMENT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
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
			case ModelPackage.BIT_FIELD_SEQUENCE_ELEMENT__SEQUENCE_INDEX:
				return sequenceIndex != SEQUENCE_INDEX_EDEFAULT;
			case ModelPackage.BIT_FIELD_SEQUENCE_ELEMENT__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
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
				case ModelPackage.BIT_FIELD_SEQUENCE_ELEMENT__SEQUENCE_INDEX: return ModelextensionPackage.SEQUENCE_ELEMENT_BASE__SEQUENCE_INDEX;
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
				case ModelextensionPackage.SEQUENCE_ELEMENT_BASE__SEQUENCE_INDEX: return ModelPackage.BIT_FIELD_SEQUENCE_ELEMENT__SEQUENCE_INDEX;
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
				case ModelextensionPackage.OFFSET___GET_OFFSET_VALUE__MAP: return ModelPackage.BIT_FIELD_SEQUENCE_ELEMENT___GET_OFFSET_VALUE__MAP;
				case ModelextensionPackage.OFFSET___SET_OFFSET__STRING: return ModelPackage.BIT_FIELD_SEQUENCE_ELEMENT___SET_OFFSET__STRING;
				default: return -1;
			}
		}
		if (baseClass == OffsetSequenceElement.class) {
			switch (baseOperationID) {
				case ModelextensionPackage.OFFSET_SEQUENCE_ELEMENT___GET_LENGTH__MAP: return ModelPackage.BIT_FIELD_SEQUENCE_ELEMENT___GET_LENGTH__MAP;
				case ModelextensionPackage.OFFSET_SEQUENCE_ELEMENT___GET_FULL_LENGTH__MAP: return ModelPackage.BIT_FIELD_SEQUENCE_ELEMENT___GET_FULL_LENGTH__MAP;
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
			case ModelPackage.BIT_FIELD_SEQUENCE_ELEMENT___GET_LENGTH__MAP:
				return getLength((Map<String, Integer>)arguments.get(0));
			case ModelPackage.BIT_FIELD_SEQUENCE_ELEMENT___GET_FULL_LENGTH__MAP:
				return getFullLength((Map<String, Integer>)arguments.get(0));
			case ModelPackage.BIT_FIELD_SEQUENCE_ELEMENT___GET_OFFSET_VALUE__MAP:
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
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //BitFieldSequenceElementImpl
