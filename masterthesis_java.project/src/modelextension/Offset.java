/**
 */
package modelextension;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offset</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see modelextension.ModelextensionPackage#getOffset()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Offset extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ixVarsRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return InternalModelServiceImpl.EXPRESSIONSERVICE.getIntegerExpression(this, this.getOffset(), ixVars);'"
	 * @generated
	 */
	BigInteger getOffsetValue(Map<String, Integer> ixVars);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setOffset(String offset);

} // Offset
