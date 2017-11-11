/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import model.IndexVarUser;
import model.ModelPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index Var User</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class IndexVarUserImpl extends SingleSourceNodeImpl implements IndexVarUser {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexVarUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getIndexVarUser();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, Integer> createIxVarMap() {
		return InternalModelServiceImpl.SEQUENCESERVICE.createIndexVarMap(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameValue(final Map<String, Integer> ixVars) {
		return InternalModelServiceImpl.EXPRESSIONSERVICE.getStringExpression(this, this.getName(), ixVars);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean getHiddenValue(final Map<String, Integer> ixVars) {
		return InternalModelServiceImpl.EXPRESSIONSERVICE.getBooleanExpression(this, this.getHidden(), ixVars);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortNameValue(final Map<String, Integer> ixVars) {
		return InternalModelServiceImpl.EXPRESSIONSERVICE.getStringExpression(this, this.getShortName(), ixVars);
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
			case ModelPackage.INDEX_VAR_USER___CREATE_IX_VAR_MAP:
				return createIxVarMap();
			case ModelPackage.INDEX_VAR_USER___GET_NAME_VALUE__MAP:
				return getNameValue((Map<String, Integer>)arguments.get(0));
			case ModelPackage.INDEX_VAR_USER___GET_HIDDEN_VALUE__MAP:
				return getHiddenValue((Map<String, Integer>)arguments.get(0));
			case ModelPackage.INDEX_VAR_USER___GET_SHORT_NAME_VALUE__MAP:
				return getShortNameValue((Map<String, Integer>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //IndexVarUserImpl
