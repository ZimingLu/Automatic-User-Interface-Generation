/**
 */
package model.impl;

import model.GenericDecl;
import model.ModelPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class GenericDeclImpl extends VarDefImpl implements GenericDecl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getGenericDecl();
	}

} //GenericDeclImpl
