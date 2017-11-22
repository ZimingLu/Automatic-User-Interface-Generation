/**
 */
package Essence;

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
 *   <li>{@link Essence.Silicon#getStep <em>Step</em>}</li>
 *   <li>{@link Essence.Silicon#getPadHeight <em>Pad Height</em>}</li>
 *   <li>{@link Essence.Silicon#getKerfWidth <em>Kerf Width</em>}</li>
 *   <li>{@link Essence.Silicon#getKerfHeight <em>Kerf Height</em>}</li>
 *   <li>{@link Essence.Silicon#getInstance <em>Instance</em>}</li>
 *   <li>{@link Essence.Silicon#getPad <em>Pad</em>}</li>
 *   <li>{@link Essence.Silicon#getPowerDomain <em>Power Domain</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getSilicon()
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
	 * @see Essence.EssencePackage#getSilicon_Step()
	 * @model dataType="Essence.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Step' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStep();

	/**
	 * Sets the value of the '{@link Essence.Silicon#getStep <em>Step</em>}' attribute.
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
	 * @see Essence.EssencePackage#getSilicon_PadHeight()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='PadHeight' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPadHeight();

	/**
	 * Sets the value of the '{@link Essence.Silicon#getPadHeight <em>Pad Height</em>}' attribute.
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
	 * @see Essence.EssencePackage#getSilicon_KerfWidth()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='KerfWidth' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKerfWidth();

	/**
	 * Sets the value of the '{@link Essence.Silicon#getKerfWidth <em>Kerf Width</em>}' attribute.
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
	 * @see Essence.EssencePackage#getSilicon_KerfHeight()
	 * @model dataType="Essence.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='KerfHeight' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKerfHeight();

	/**
	 * Sets the value of the '{@link Essence.Silicon#getKerfHeight <em>Kerf Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kerf Height</em>' attribute.
	 * @see #getKerfHeight()
	 * @generated
	 */
	void setKerfHeight(String value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.SiInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference list.
	 * @see Essence.EssencePackage#getSilicon_Instance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Instance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SiInstance> getInstance();

	/**
	 * Returns the value of the '<em><b>Pad</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.Pad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pad</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pad</em>' containment reference list.
	 * @see Essence.EssencePackage#getSilicon_Pad()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Pad' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Pad> getPad();

	/**
	 * Returns the value of the '<em><b>Power Domain</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.PowerDomain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Domain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Domain</em>' containment reference list.
	 * @see Essence.EssencePackage#getSilicon_PowerDomain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PowerDomain' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PowerDomain> getPowerDomain();

} // Silicon
