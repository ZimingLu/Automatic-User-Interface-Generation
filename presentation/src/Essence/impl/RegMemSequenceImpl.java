/**
 */
package Essence.impl;

import Essence.EssencePackage;
import Essence.RegMemElement;
import Essence.RegMemSequence;

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
 * An implementation of the model object '<em><b>Reg Mem Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.RegMemSequenceImpl#getCount <em>Count</em>}</li>
 *   <li>{@link Essence.impl.RegMemSequenceImpl#getMinIndex <em>Min Index</em>}</li>
 *   <li>{@link Essence.impl.RegMemSequenceImpl#getIndexStep <em>Index Step</em>}</li>
 *   <li>{@link Essence.impl.RegMemSequenceImpl#getIndexVar <em>Index Var</em>}</li>
 *   <li>{@link Essence.impl.RegMemSequenceImpl#getAltFormat <em>Alt Format</em>}</li>
 *   <li>{@link Essence.impl.RegMemSequenceImpl#isPilot <em>Pilot</em>}</li>
 *   <li>{@link Essence.impl.RegMemSequenceImpl#getSequenceElement <em>Sequence Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegMemSequenceImpl extends RegMemElementImpl implements RegMemSequence {
	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNT_EDEFAULT = null;

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
	protected static final String INDEX_STEP_EDEFAULT = null;

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
	 * The default value of the '{@link #isPilot() <em>Pilot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPilot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PILOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPilot() <em>Pilot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPilot()
	 * @generated
	 * @ordered
	 */
	protected boolean pilot = PILOT_EDEFAULT;

	/**
	 * This is true if the Pilot attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pilotESet;

	/**
	 * The cached value of the '{@link #getSequenceElement() <em>Sequence Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceElement()
	 * @generated
	 * @ordered
	 */
	protected EList<RegMemElement> sequenceElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegMemSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getRegMemSequence();
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
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.REG_MEM_SEQUENCE__COUNT, oldCount, count));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.REG_MEM_SEQUENCE__MIN_INDEX, oldMinIndex, minIndex));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.REG_MEM_SEQUENCE__INDEX_STEP, oldIndexStep, indexStep));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.REG_MEM_SEQUENCE__INDEX_VAR, oldIndexVar, indexVar));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.REG_MEM_SEQUENCE__ALT_FORMAT, oldAltFormat, altFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPilot() {
		return pilot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPilot(boolean newPilot) {
		boolean oldPilot = pilot;
		pilot = newPilot;
		boolean oldPilotESet = pilotESet;
		pilotESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssencePackage.REG_MEM_SEQUENCE__PILOT, oldPilot, pilot, !oldPilotESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPilot() {
		boolean oldPilot = pilot;
		boolean oldPilotESet = pilotESet;
		pilot = PILOT_EDEFAULT;
		pilotESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EssencePackage.REG_MEM_SEQUENCE__PILOT, oldPilot, PILOT_EDEFAULT, oldPilotESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPilot() {
		return pilotESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegMemElement> getSequenceElement() {
		if (sequenceElement == null) {
			sequenceElement = new EObjectContainmentEList<RegMemElement>(RegMemElement.class, this, EssencePackage.REG_MEM_SEQUENCE__SEQUENCE_ELEMENT);
		}
		return sequenceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.REG_MEM_SEQUENCE__SEQUENCE_ELEMENT:
				return ((InternalEList<?>)getSequenceElement()).basicRemove(otherEnd, msgs);
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
			case EssencePackage.REG_MEM_SEQUENCE__COUNT:
				return getCount();
			case EssencePackage.REG_MEM_SEQUENCE__MIN_INDEX:
				return getMinIndex();
			case EssencePackage.REG_MEM_SEQUENCE__INDEX_STEP:
				return getIndexStep();
			case EssencePackage.REG_MEM_SEQUENCE__INDEX_VAR:
				return getIndexVar();
			case EssencePackage.REG_MEM_SEQUENCE__ALT_FORMAT:
				return getAltFormat();
			case EssencePackage.REG_MEM_SEQUENCE__PILOT:
				return isPilot();
			case EssencePackage.REG_MEM_SEQUENCE__SEQUENCE_ELEMENT:
				return getSequenceElement();
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
			case EssencePackage.REG_MEM_SEQUENCE__COUNT:
				setCount((String)newValue);
				return;
			case EssencePackage.REG_MEM_SEQUENCE__MIN_INDEX:
				setMinIndex((String)newValue);
				return;
			case EssencePackage.REG_MEM_SEQUENCE__INDEX_STEP:
				setIndexStep((String)newValue);
				return;
			case EssencePackage.REG_MEM_SEQUENCE__INDEX_VAR:
				setIndexVar((String)newValue);
				return;
			case EssencePackage.REG_MEM_SEQUENCE__ALT_FORMAT:
				setAltFormat((String)newValue);
				return;
			case EssencePackage.REG_MEM_SEQUENCE__PILOT:
				setPilot((Boolean)newValue);
				return;
			case EssencePackage.REG_MEM_SEQUENCE__SEQUENCE_ELEMENT:
				getSequenceElement().clear();
				getSequenceElement().addAll((Collection<? extends RegMemElement>)newValue);
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
			case EssencePackage.REG_MEM_SEQUENCE__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case EssencePackage.REG_MEM_SEQUENCE__MIN_INDEX:
				setMinIndex(MIN_INDEX_EDEFAULT);
				return;
			case EssencePackage.REG_MEM_SEQUENCE__INDEX_STEP:
				setIndexStep(INDEX_STEP_EDEFAULT);
				return;
			case EssencePackage.REG_MEM_SEQUENCE__INDEX_VAR:
				setIndexVar(INDEX_VAR_EDEFAULT);
				return;
			case EssencePackage.REG_MEM_SEQUENCE__ALT_FORMAT:
				setAltFormat(ALT_FORMAT_EDEFAULT);
				return;
			case EssencePackage.REG_MEM_SEQUENCE__PILOT:
				unsetPilot();
				return;
			case EssencePackage.REG_MEM_SEQUENCE__SEQUENCE_ELEMENT:
				getSequenceElement().clear();
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
			case EssencePackage.REG_MEM_SEQUENCE__COUNT:
				return COUNT_EDEFAULT == null ? count != null : !COUNT_EDEFAULT.equals(count);
			case EssencePackage.REG_MEM_SEQUENCE__MIN_INDEX:
				return MIN_INDEX_EDEFAULT == null ? minIndex != null : !MIN_INDEX_EDEFAULT.equals(minIndex);
			case EssencePackage.REG_MEM_SEQUENCE__INDEX_STEP:
				return INDEX_STEP_EDEFAULT == null ? indexStep != null : !INDEX_STEP_EDEFAULT.equals(indexStep);
			case EssencePackage.REG_MEM_SEQUENCE__INDEX_VAR:
				return INDEX_VAR_EDEFAULT == null ? indexVar != null : !INDEX_VAR_EDEFAULT.equals(indexVar);
			case EssencePackage.REG_MEM_SEQUENCE__ALT_FORMAT:
				return ALT_FORMAT_EDEFAULT == null ? altFormat != null : !ALT_FORMAT_EDEFAULT.equals(altFormat);
			case EssencePackage.REG_MEM_SEQUENCE__PILOT:
				return isSetPilot();
			case EssencePackage.REG_MEM_SEQUENCE__SEQUENCE_ELEMENT:
				return sequenceElement != null && !sequenceElement.isEmpty();
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
		result.append(" (count: ");
		result.append(count);
		result.append(", minIndex: ");
		result.append(minIndex);
		result.append(", indexStep: ");
		result.append(indexStep);
		result.append(", indexVar: ");
		result.append(indexVar);
		result.append(", altFormat: ");
		result.append(altFormat);
		result.append(", pilot: ");
		if (pilotESet) result.append(pilot); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RegMemSequenceImpl
