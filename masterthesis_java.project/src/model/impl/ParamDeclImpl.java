/**
 */
package model.impl;

import model.ModelPackage;
import model.ParamDecl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ParamDeclImpl extends VarDefImpl implements ParamDecl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParamDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getParamDecl();
	}

} //ParamDeclImpl
