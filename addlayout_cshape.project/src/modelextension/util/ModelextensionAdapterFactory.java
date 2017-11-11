/**
 */
package modelextension.util;

import model.EssenceBase;
import model.SingleSourceNode;

import modelextension.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see modelextension.ModelextensionPackage
 * @generated
 */
public class ModelextensionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelextensionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelextensionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelextensionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelextensionSwitch<Adapter> modelSwitch =
		new ModelextensionSwitch<Adapter>() {
			@Override
			public Adapter caseUnresolvedReference(UnresolvedReference object) {
				return createUnresolvedReferenceAdapter();
			}
			@Override
			public Adapter caseEssenceBaseExtension(EssenceBaseExtension object) {
				return createEssenceBaseExtensionAdapter();
			}
			@Override
			public <T extends SequenceElementBase> Adapter caseSequenceBase(SequenceBase<T> object) {
				return createSequenceBaseAdapter();
			}
			@Override
			public Adapter caseSequenceElementBase(SequenceElementBase object) {
				return createSequenceElementBaseAdapter();
			}
			@Override
			public Adapter caseOffset(Offset object) {
				return createOffsetAdapter();
			}
			@Override
			public <T extends OffsetSequenceElement> Adapter caseOffsetSequence(OffsetSequence<T> object) {
				return createOffsetSequenceAdapter();
			}
			@Override
			public Adapter caseOffsetSequenceElement(OffsetSequenceElement object) {
				return createOffsetSequenceElementAdapter();
			}
			@Override
			public Adapter caseCommonAccessLevel(CommonAccessLevel object) {
				return createCommonAccessLevelAdapter();
			}
			@Override
			public Adapter caseDataTypeOwner(DataTypeOwner object) {
				return createDataTypeOwnerAdapter();
			}
			@Override
			public Adapter caseBitResetType(BitResetType object) {
				return createBitResetTypeAdapter();
			}
			@Override
			public Adapter caseEssenceBase(EssenceBase object) {
				return createEssenceBaseAdapter();
			}
			@Override
			public Adapter caseSingleSourceNode(SingleSourceNode object) {
				return createSingleSourceNodeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link modelextension.UnresolvedReference <em>Unresolved Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelextension.UnresolvedReference
	 * @generated
	 */
	public Adapter createUnresolvedReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelextension.EssenceBaseExtension <em>Essence Base Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelextension.EssenceBaseExtension
	 * @generated
	 */
	public Adapter createEssenceBaseExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelextension.SequenceBase <em>Sequence Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelextension.SequenceBase
	 * @generated
	 */
	public Adapter createSequenceBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelextension.SequenceElementBase <em>Sequence Element Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelextension.SequenceElementBase
	 * @generated
	 */
	public Adapter createSequenceElementBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelextension.Offset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelextension.Offset
	 * @generated
	 */
	public Adapter createOffsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelextension.OffsetSequence <em>Offset Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelextension.OffsetSequence
	 * @generated
	 */
	public Adapter createOffsetSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelextension.OffsetSequenceElement <em>Offset Sequence Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelextension.OffsetSequenceElement
	 * @generated
	 */
	public Adapter createOffsetSequenceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelextension.CommonAccessLevel <em>Common Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelextension.CommonAccessLevel
	 * @generated
	 */
	public Adapter createCommonAccessLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelextension.DataTypeOwner <em>Data Type Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelextension.DataTypeOwner
	 * @generated
	 */
	public Adapter createDataTypeOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modelextension.BitResetType <em>Bit Reset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modelextension.BitResetType
	 * @generated
	 */
	public Adapter createBitResetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.EssenceBase <em>Essence Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.EssenceBase
	 * @generated
	 */
	public Adapter createEssenceBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SingleSourceNode <em>Single Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SingleSourceNode
	 * @generated
	 */
	public Adapter createSingleSourceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelextensionAdapterFactory
