/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.PowerDomain#getPowerConsumption <em>Power Consumption</em>}</li>
 *   <li>{@link model.PowerDomain#getMaxCurrent <em>Max Current</em>}</li>
 *   <li>{@link model.PowerDomain#getAverageCurrent <em>Average Current</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getPowerDomain()
 * @model extendedMetaData="name='PowerDomain' kind='elementOnly'"
 * @generated
 */
public interface PowerDomain extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>Power Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Consumption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Consumption</em>' attribute.
	 * @see #setPowerConsumption(String)
	 * @see model.ModelPackage#getPowerDomain_PowerConsumption()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='PowerConsumption' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPowerConsumption();

	/**
	 * Sets the value of the '{@link model.PowerDomain#getPowerConsumption <em>Power Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Consumption</em>' attribute.
	 * @see #getPowerConsumption()
	 * @generated
	 */
	void setPowerConsumption(String value);

	/**
	 * Returns the value of the '<em><b>Max Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Current</em>' attribute.
	 * @see #setMaxCurrent(String)
	 * @see model.ModelPackage#getPowerDomain_MaxCurrent()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='MaxCurrent' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMaxCurrent();

	/**
	 * Sets the value of the '{@link model.PowerDomain#getMaxCurrent <em>Max Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Current</em>' attribute.
	 * @see #getMaxCurrent()
	 * @generated
	 */
	void setMaxCurrent(String value);

	/**
	 * Returns the value of the '<em><b>Average Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Current</em>' attribute.
	 * @see #setAverageCurrent(String)
	 * @see model.ModelPackage#getPowerDomain_AverageCurrent()
	 * @model dataType="model.IntegerExpr" required="true"
	 *        extendedMetaData="kind='element' name='AverageCurrent' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAverageCurrent();

	/**
	 * Sets the value of the '{@link model.PowerDomain#getAverageCurrent <em>Average Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Current</em>' attribute.
	 * @see #getAverageCurrent()
	 * @generated
	 */
	void setAverageCurrent(String value);

} // PowerDomain
