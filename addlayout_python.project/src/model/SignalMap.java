/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.SignalMap#getXRefLocalSignal <em>XRef Local Signal</em>}</li>
 *   <li>{@link model.SignalMap#getXRefInterfaceDefSignal <em>XRef Interface Def Signal</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getSignalMap()
 * @model extendedMetaData="name='SignalMap' kind='elementOnly'"
 * @generated
 */
public interface SignalMap extends EssenceBase {
	/**
	 * Returns the value of the '<em><b>XRef Local Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Local Signal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Local Signal</em>' containment reference.
	 * @see #setXRefLocalSignal(XRefInternalSignal)
	 * @see model.ModelPackage#getSignalMap_XRefLocalSignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefLocalSignal' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefInternalSignal getXRefLocalSignal();

	/**
	 * Sets the value of the '{@link model.SignalMap#getXRefLocalSignal <em>XRef Local Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Local Signal</em>' containment reference.
	 * @see #getXRefLocalSignal()
	 * @generated
	 */
	void setXRefLocalSignal(XRefInternalSignal value);

	/**
	 * Returns the value of the '<em><b>XRef Interface Def Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Interface Def Signal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Interface Def Signal</em>' containment reference.
	 * @see #setXRefInterfaceDefSignal(XRefExternalSignal)
	 * @see model.ModelPackage#getSignalMap_XRefInterfaceDefSignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefInterfaceDefSignal' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefExternalSignal getXRefInterfaceDefSignal();

	/**
	 * Sets the value of the '{@link model.SignalMap#getXRefInterfaceDefSignal <em>XRef Interface Def Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Interface Def Signal</em>' containment reference.
	 * @see #getXRefInterfaceDefSignal()
	 * @generated
	 */
	void setXRefInterfaceDefSignal(XRefExternalSignal value);

} // SignalMap
