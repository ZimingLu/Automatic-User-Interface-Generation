/**
 */
package modelextension;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offset Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see modelextension.ModelextensionPackage#getOffsetSequence()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface OffsetSequence<T extends OffsetSequenceElement> extends Offset, SequenceBase<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ixVarsRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return com.infineon.essence.model.impl.InternalModelServiceImpl.SEQUENCESERVICE.getLength((OffsetSequence<?>)this, ixVars);'"
	 * @generated
	 */
	BigInteger getLength(Map<String, Integer> ixVars);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<T> getElement();

} // OffsetSequence
