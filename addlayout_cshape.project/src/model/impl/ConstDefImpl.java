/**
 */
package model.impl;

import model.ConstDef;
import model.ModelPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Const Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ConstDefImpl extends VarDefImpl implements ConstDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getConstDef();
	}

} //ConstDefImpl
