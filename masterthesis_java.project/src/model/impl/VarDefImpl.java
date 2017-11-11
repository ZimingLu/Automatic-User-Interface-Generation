/**
 */
package model.impl;

import model.ModelPackage;
import model.VarDef;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.VarDefImpl#getType <em>Type</em>}</li>
 *   <li>{@link model.impl.VarDefImpl#getVarDefValue <em>Var Def Value</em>}</li>
 *   <li>{@link model.impl.VarDefImpl#getVarDefOverride <em>Var Def Override</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VarDefImpl extends SingleSourceNodeImpl implements VarDef {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVarDefValue() <em>Var Def Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarDefValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_DEF_VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVarDefOverride() <em>Var Def Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarDefOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_DEF_OVERRIDE_EDEFAULT = "";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getVarDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return this.eClass().getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVarDefValue() {
		if (this instanceof com.infineon.essence.model.ConstDef) {
			return (String)this.eGet(this.eClass().getEStructuralFeature("value"));
		} else {
			return (String)this.eGet(this.eClass().getEStructuralFeature("defaultValue"));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarDefValue(String newVarDefValue) {
		// TODO: implement this method to set the 'Var Def Value' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVarDefOverride() {
		// TODO: implement this method to return the 'Var Def Override' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarDefOverride(String newVarDefOverride) {
		// TODO: implement this method to set the 'Var Def Override' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.VAR_DEF__TYPE:
				return getType();
			case ModelPackage.VAR_DEF__VAR_DEF_VALUE:
				return getVarDefValue();
			case ModelPackage.VAR_DEF__VAR_DEF_OVERRIDE:
				return getVarDefOverride();
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
			case ModelPackage.VAR_DEF__VAR_DEF_VALUE:
				setVarDefValue((String)newValue);
				return;
			case ModelPackage.VAR_DEF__VAR_DEF_OVERRIDE:
				setVarDefOverride((String)newValue);
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
			case ModelPackage.VAR_DEF__VAR_DEF_VALUE:
				setVarDefValue(VAR_DEF_VALUE_EDEFAULT);
				return;
			case ModelPackage.VAR_DEF__VAR_DEF_OVERRIDE:
				setVarDefOverride(VAR_DEF_OVERRIDE_EDEFAULT);
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
			case ModelPackage.VAR_DEF__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case ModelPackage.VAR_DEF__VAR_DEF_VALUE:
				return VAR_DEF_VALUE_EDEFAULT == null ? getVarDefValue() != null : !VAR_DEF_VALUE_EDEFAULT.equals(getVarDefValue());
			case ModelPackage.VAR_DEF__VAR_DEF_OVERRIDE:
				return VAR_DEF_OVERRIDE_EDEFAULT == null ? getVarDefOverride() != null : !VAR_DEF_OVERRIDE_EDEFAULT.equals(getVarDefOverride());
		}
		return super.eIsSet(featureID);
	}

} //VarDefImpl
