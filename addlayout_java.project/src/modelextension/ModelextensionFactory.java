/**
 */
package modelextension;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see modelextension.ModelextensionPackage
 * @generated
 */
public interface ModelextensionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelextensionFactory eINSTANCE = modelextension.impl.ModelextensionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Unresolved Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unresolved Reference</em>'.
	 * @generated
	 */
	UnresolvedReference createUnresolvedReference();

	/**
	 * Returns a new object of class '<em>Essence Base Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Essence Base Extension</em>'.
	 * @generated
	 */
	EssenceBaseExtension createEssenceBaseExtension();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelextensionPackage getModelextensionPackage();

} //ModelextensionFactory
