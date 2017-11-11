/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Silicon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Silicon#getStep <em>Step</em>}</li>
 *   <li>{@link model.Silicon#getPadHeight <em>Pad Height</em>}</li>
 *   <li>{@link model.Silicon#getKerfWidth <em>Kerf Width</em>}</li>
 *   <li>{@link model.Silicon#getKerfHeight <em>Kerf Height</em>}</li>
 *   <li>{@link model.Silicon#getInstance <em>Instance</em>}</li>
 *   <li>{@link model.Silicon#getPad <em>Pad</em>}</li>
 *   <li>{@link model.Silicon#getPowerDomain <em>Power Domain</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getSilicon()
 * @model extendedMetaData="name='Silicon' kind='elementOnly'"
 * @generated
 */
public interface Silicon extends ModelRoot {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(String)
	 * @see model.ModelPackage#getSilicon_Step()
	 * @model dataType="model.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Step' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStep();

	/**
	 * Sets the value of the '{@link model.Silicon#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(String value);

	/**
	 * Returns the value of the '<em><b>Pad Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pad Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pad Height</em>' attribute.
	 * @see #setPadHeight(String)
	 * @see model.ModelPackage#getSilicon_PadHeight()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='PadHeight' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPadHeight();

	/**
	 * Sets the value of the '{@link model.Silicon#getPadHeight <em>Pad Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pad Height</em>' attribute.
	 * @see #getPadHeight()
	 * @generated
	 */
	void setPadHeight(String value);

	/**
	 * Returns the value of the '<em><b>Kerf Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kerf Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kerf Width</em>' attribute.
	 * @see #setKerfWidth(String)
	 * @see model.ModelPackage#getSilicon_KerfWidth()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='KerfWidth' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKerfWidth();

	/**
	 * Sets the value of the '{@link model.Silicon#getKerfWidth <em>Kerf Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kerf Width</em>' attribute.
	 * @see #getKerfWidth()
	 * @generated
	 */
	void setKerfWidth(String value);

	/**
	 * Returns the value of the '<em><b>Kerf Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kerf Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kerf Height</em>' attribute.
	 * @see #setKerfHeight(String)
	 * @see model.ModelPackage#getSilicon_KerfHeight()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='KerfHeight' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKerfHeight();

	/**
	 * Sets the value of the '{@link model.Silicon#getKerfHeight <em>Kerf Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kerf Height</em>' attribute.
	 * @see #getKerfHeight()
	 * @generated
	 */
	void setKerfHeight(String value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference list.
	 * The list contents are of type {@link model.SiInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference list.
	 * @see model.ModelPackage#getSilicon_Instance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Instance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SiInstance> getInstance();

	/**
	 * Returns the value of the '<em><b>Pad</b></em>' containment reference list.
	 * The list contents are of type {@link model.Pad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pad</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pad</em>' containment reference list.
	 * @see model.ModelPackage#getSilicon_Pad()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Pad' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Pad> getPad();

	/**
	 * Returns the value of the '<em><b>Power Domain</b></em>' containment reference list.
	 * The list contents are of type {@link model.PowerDomain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Domain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Domain</em>' containment reference list.
	 * @see model.ModelPackage#getSilicon_PowerDomain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PowerDomain' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PowerDomain> getPowerDomain();

} // Silicon
