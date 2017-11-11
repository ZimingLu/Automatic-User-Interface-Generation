/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Component#getInterface <em>Interface</em>}</li>
 *   <li>{@link model.Component#getRegViewBlock <em>Reg View Block</em>}</li>
 *   <li>{@link model.Component#getTopSpinClkStyle <em>Top Spin Clk Style</em>}</li>
 *   <li>{@link model.Component#getRegMemSet <em>Reg Mem Set</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getComponent()
 * @model extendedMetaData="name='Component' kind='elementOnly'"
 * @generated
 */
public interface Component extends ModelRoot {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link model.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see model.ModelPackage#getComponent_Interface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Interface' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Interface> getInterface();

	/**
	 * Returns the value of the '<em><b>Reg View Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg View Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg View Block</em>' containment reference.
	 * @see #setRegViewBlock(RegViewBlock)
	 * @see model.ModelPackage#getComponent_RegViewBlock()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RegViewBlock' namespace='##targetNamespace'"
	 * @generated
	 */
	RegViewBlock getRegViewBlock();

	/**
	 * Sets the value of the '{@link model.Component#getRegViewBlock <em>Reg View Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reg View Block</em>' containment reference.
	 * @see #getRegViewBlock()
	 * @generated
	 */
	void setRegViewBlock(RegViewBlock value);

	/**
	 * Returns the value of the '<em><b>Top Spin Clk Style</b></em>' attribute.
	 * The default value is <code>"asynchronous"</code>.
	 * The literals are from the enumeration {@link model.SyncMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Spin Clk Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Spin Clk Style</em>' attribute.
	 * @see model.SyncMode
	 * @see #isSetTopSpinClkStyle()
	 * @see #unsetTopSpinClkStyle()
	 * @see #setTopSpinClkStyle(SyncMode)
	 * @see model.ModelPackage#getComponent_TopSpinClkStyle()
	 * @model default="asynchronous" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TopSpinClkStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	SyncMode getTopSpinClkStyle();

	/**
	 * Sets the value of the '{@link model.Component#getTopSpinClkStyle <em>Top Spin Clk Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Spin Clk Style</em>' attribute.
	 * @see model.SyncMode
	 * @see #isSetTopSpinClkStyle()
	 * @see #unsetTopSpinClkStyle()
	 * @see #getTopSpinClkStyle()
	 * @generated
	 */
	void setTopSpinClkStyle(SyncMode value);

	/**
	 * Unsets the value of the '{@link model.Component#getTopSpinClkStyle <em>Top Spin Clk Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTopSpinClkStyle()
	 * @see #getTopSpinClkStyle()
	 * @see #setTopSpinClkStyle(SyncMode)
	 * @generated
	 */
	void unsetTopSpinClkStyle();

	/**
	 * Returns whether the value of the '{@link model.Component#getTopSpinClkStyle <em>Top Spin Clk Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Top Spin Clk Style</em>' attribute is set.
	 * @see #unsetTopSpinClkStyle()
	 * @see #getTopSpinClkStyle()
	 * @see #setTopSpinClkStyle(SyncMode)
	 * @generated
	 */
	boolean isSetTopSpinClkStyle();

	/**
	 * Returns the value of the '<em><b>Reg Mem Set</b></em>' containment reference list.
	 * The list contents are of type {@link model.RegMemSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reg Mem Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reg Mem Set</em>' containment reference list.
	 * @see model.ModelPackage#getComponent_RegMemSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RegMemSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RegMemSet> getRegMemSet();

} // Component
