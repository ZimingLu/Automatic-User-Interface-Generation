/**
 */
package modelextension.impl;

import modelextension.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelextensionFactoryImpl extends EFactoryImpl implements ModelextensionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelextensionFactory init() {
		try {
			ModelextensionFactory theModelextensionFactory = (ModelextensionFactory)EPackage.Registry.INSTANCE.getEFactory(ModelextensionPackage.eNS_URI);
			if (theModelextensionFactory != null) {
				return theModelextensionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelextensionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelextensionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelextensionPackage.UNRESOLVED_REFERENCE: return createUnresolvedReference();
			case ModelextensionPackage.ESSENCE_BASE_EXTENSION: return createEssenceBaseExtension();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedReference createUnresolvedReference() {
		UnresolvedReferenceImpl unresolvedReference = new UnresolvedReferenceImpl();
		return unresolvedReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EssenceBaseExtension createEssenceBaseExtension() {
		EssenceBaseExtensionImpl essenceBaseExtension = new EssenceBaseExtensionImpl();
		return essenceBaseExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelextensionPackage getModelextensionPackage() {
		return (ModelextensionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelextensionPackage getPackage() {
		return ModelextensionPackage.eINSTANCE;
	}

} //ModelextensionFactoryImpl
