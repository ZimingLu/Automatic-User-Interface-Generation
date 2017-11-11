/**
 */
package model;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Var User</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see model.ModelPackage#getIndexVarUser()
 * @model abstract="true"
 *        extendedMetaData="name='IndexVarUser' kind='elementOnly'"
 * @generated
 */
public interface IndexVarUser extends SingleSourceNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return InternalModelServiceImpl.SEQUENCESERVICE.createIndexVarMap(this);'"
	 * @generated
	 */
	Map<String, Integer> createIxVarMap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return InternalModelServiceImpl.EXPRESSIONSERVICE.getStringExpression(this, this.getName(), ixVars);'"
	 * @generated
	 */
	String getNameValue(Map<String, Integer> ixVars);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return InternalModelServiceImpl.EXPRESSIONSERVICE.getBooleanExpression(this, this.getHidden(), ixVars);'"
	 * @generated
	 */
	boolean getHiddenValue(Map<String, Integer> ixVars);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return InternalModelServiceImpl.EXPRESSIONSERVICE.getStringExpression(this, this.getShortName(), ixVars);'"
	 * @generated
	 */
	String getShortNameValue(Map<String, Integer> ixVars);

} // IndexVarUser
