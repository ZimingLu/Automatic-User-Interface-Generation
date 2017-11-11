/**
 */
package modelextension;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Base</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see modelextension.ModelextensionPackage#getSequenceBase()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SequenceBase<T extends SequenceElementBase> extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ixVarsRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return InternalModelServiceImpl.EXPRESSIONSERVICE.getIntegerExpression(this, this.getCount(), ixVars);'"
	 * @generated
	 */
	BigInteger getCountValue(Map<String, Integer> ixVars);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ixVarsRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return InternalModelServiceImpl.EXPRESSIONSERVICE.getIntegerExpression(this, this.getMinIndex(), ixVars);'"
	 * @generated
	 */
	BigInteger getMinIndexValue(Map<String, Integer> ixVars);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ixVarsRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return InternalModelServiceImpl.EXPRESSIONSERVICE.getIntegerExpression(this, this.getIndexStep(), ixVars);'"
	 * @generated
	 */
	BigInteger getIndexStepValue(Map<String, Integer> ixVars);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getIndexVar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<T> getElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getAltFormat();

} // SequenceBase
