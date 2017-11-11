/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Bus#getExtVLNV <em>Ext VLNV</em>}</li>
 *   <li>{@link model.Bus#getMaxMasters <em>Max Masters</em>}</li>
 *   <li>{@link model.Bus#getMaxSlaves <em>Max Slaves</em>}</li>
 *   <li>{@link model.Bus#getNoneInterface <em>None Interface</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getBus()
 * @model extendedMetaData="name='Bus' kind='elementOnly'"
 * @generated
 */
public interface Bus extends ModelRoot {
	/**
	 * Returns the value of the '<em><b>Ext VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext VLNV</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext VLNV</em>' containment reference.
	 * @see #setExtVLNV(VLNV)
	 * @see model.ModelPackage#getBus_ExtVLNV()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ExtVLNV' namespace='##targetNamespace'"
	 * @generated
	 */
	VLNV getExtVLNV();

	/**
	 * Sets the value of the '{@link model.Bus#getExtVLNV <em>Ext VLNV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext VLNV</em>' containment reference.
	 * @see #getExtVLNV()
	 * @generated
	 */
	void setExtVLNV(VLNV value);

	/**
	 * Returns the value of the '<em><b>Max Masters</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Masters</em>' attribute.
	 * @see #setMaxMasters(String)
	 * @see model.ModelPackage#getBus_MaxMasters()
	 * @model default="1" dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='MaxMasters' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMaxMasters();

	/**
	 * Sets the value of the '{@link model.Bus#getMaxMasters <em>Max Masters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Masters</em>' attribute.
	 * @see #getMaxMasters()
	 * @generated
	 */
	void setMaxMasters(String value);

	/**
	 * Returns the value of the '<em><b>Max Slaves</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Slaves</em>' attribute.
	 * @see #setMaxSlaves(String)
	 * @see model.ModelPackage#getBus_MaxSlaves()
	 * @model default="1" dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='MaxSlaves' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMaxSlaves();

	/**
	 * Sets the value of the '{@link model.Bus#getMaxSlaves <em>Max Slaves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Slaves</em>' attribute.
	 * @see #getMaxSlaves()
	 * @generated
	 */
	void setMaxSlaves(String value);

	/**
	 * Returns the value of the '<em><b>None Interface</b></em>' containment reference list.
	 * The list contents are of type {@link model.NoneInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>None Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>None Interface</em>' containment reference list.
	 * @see model.ModelPackage#getBus_NoneInterface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NoneInterface' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NoneInterface> getNoneInterface();

} // Bus
