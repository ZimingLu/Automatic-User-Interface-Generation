/**
 */
package model;

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
 *   <li>{@link model.SignalOwner#getSignal <em>Signal</em>}</li>
 *   <li>{@link model.SignalOwner#getSignalMap <em>Signal Map</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getSignalOwner()
 * @model abstract="true"
 *        extendedMetaData="name='SignalOwner' kind='elementOnly'"
 * @generated
 */
public interface SignalOwner extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>Signal</b></em>' containment reference list.
	 * The list contents are of type {@link model.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal</em>' containment reference list.
	 * @see model.ModelPackage#getSignalOwner_Signal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signal' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Signal> getSignal();

	/**
	 * Returns the value of the '<em><b>Signal Map</b></em>' containment reference list.
	 * The list contents are of type {@link model.SignalMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Map</em>' containment reference list.
	 * @see model.ModelPackage#getSignalOwner_SignalMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SignalMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SignalMap> getSignalMap();

} // SignalOwner
