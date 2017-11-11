/**
 */
package modelextension.util;

import model.EssenceBase;
import model.SingleSourceNode;

import modelextension.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see modelextension.ModelextensionPackage
 * @generated
 */
public class ModelextensionSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelextensionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelextensionSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelextensionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelextensionPackage.UNRESOLVED_REFERENCE: {
				UnresolvedReference unresolvedReference = (UnresolvedReference)theEObject;
				T1 result = caseUnresolvedReference(unresolvedReference);
				if (result == null) result = caseSingleSourceNode(unresolvedReference);
				if (result == null) result = caseEssenceBase(unresolvedReference);
				if (result == null) result = caseEssenceBaseExtension(unresolvedReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelextensionPackage.ESSENCE_BASE_EXTENSION: {
				EssenceBaseExtension essenceBaseExtension = (EssenceBaseExtension)theEObject;
				T1 result = caseEssenceBaseExtension(essenceBaseExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelextensionPackage.SEQUENCE_BASE: {
				SequenceBase<?> sequenceBase = (SequenceBase<?>)theEObject;
				T1 result = caseSequenceBase(sequenceBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelextensionPackage.SEQUENCE_ELEMENT_BASE: {
				SequenceElementBase sequenceElementBase = (SequenceElementBase)theEObject;
				T1 result = caseSequenceElementBase(sequenceElementBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelextensionPackage.OFFSET: {
				Offset offset = (Offset)theEObject;
				T1 result = caseOffset(offset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelextensionPackage.OFFSET_SEQUENCE: {
				OffsetSequence<?> offsetSequence = (OffsetSequence<?>)theEObject;
				T1 result = caseOffsetSequence(offsetSequence);
				if (result == null) result = caseOffset(offsetSequence);
				if (result == null) result = caseSequenceBase(offsetSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelextensionPackage.OFFSET_SEQUENCE_ELEMENT: {
				OffsetSequenceElement offsetSequenceElement = (OffsetSequenceElement)theEObject;
				T1 result = caseOffsetSequenceElement(offsetSequenceElement);
				if (result == null) result = caseSequenceElementBase(offsetSequenceElement);
				if (result == null) result = caseOffset(offsetSequenceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelextensionPackage.COMMON_ACCESS_LEVEL: {
				CommonAccessLevel commonAccessLevel = (CommonAccessLevel)theEObject;
				T1 result = caseCommonAccessLevel(commonAccessLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelextensionPackage.DATA_TYPE_OWNER: {
				DataTypeOwner dataTypeOwner = (DataTypeOwner)theEObject;
				T1 result = caseDataTypeOwner(dataTypeOwner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelextensionPackage.BIT_RESET_TYPE: {
				BitResetType bitResetType = (BitResetType)theEObject;
				T1 result = caseBitResetType(bitResetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnresolvedReference(UnresolvedReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Essence Base Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Essence Base Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEssenceBaseExtension(EssenceBaseExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends SequenceElementBase> T1 caseSequenceBase(SequenceBase<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Element Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Element Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSequenceElementBase(SequenceElementBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOffset(Offset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offset Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offset Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends OffsetSequenceElement> T1 caseOffsetSequence(OffsetSequence<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offset Sequence Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offset Sequence Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOffsetSequenceElement(OffsetSequenceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Common Access Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Common Access Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCommonAccessLevel(CommonAccessLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDataTypeOwner(DataTypeOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Reset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Reset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBitResetType(BitResetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Essence Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Essence Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEssenceBase(EssenceBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Source Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Source Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSingleSourceNode(SingleSourceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //ModelextensionSwitch
