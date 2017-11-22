/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.SignalOwner#getSignal <em>Signal</em>}</li>
 *   <li>{@link Essence.SignalOwner#getSignalMap <em>Signal Map</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getSignalOwner()
 * @model abstract="true"
 *        extendedMetaData="name='SignalOwner' kind='elementOnly'"
 * @generated
 */
public interface SignalOwner extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' containment reference list.
	 * @see Essence.EssencePackage#getSignalOwner_Signal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signal' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Signal> getSignal();

	/**
	 * Returns the value of the '<em><b>Signal Map</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.SignalMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Map</em>' containment reference list.
	 * @see Essence.EssencePackage#getSignalOwner_SignalMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SignalMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SignalMap> getSignalMap();

} // SignalOwner
