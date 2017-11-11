/**
 */
package modelextension;

import java.math.BigInteger;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offset Sequence Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see modelextension.ModelextensionPackage#getOffsetSequenceElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface OffsetSequenceElement extends SequenceElementBase, Offset {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ixVarsRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return InternalModelServiceImpl.SEQUENCESERVICE.getLength(this, ixVars);'"
	 * @generated
	 */
	BigInteger getLength(Map<String, Integer> ixVars);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ixVarsRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return InternalModelServiceImpl.SEQUENCESERVICE.getFullLength(this, ixVars);'"
	 * @generated
	 */
	BigInteger getFullLength(Map<String, Integer> ixVars);

} // OffsetSequenceElement
