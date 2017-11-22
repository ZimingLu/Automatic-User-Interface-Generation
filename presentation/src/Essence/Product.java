/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.Product#getStep <em>Step</em>}</li>
 *   <li>{@link Essence.Product#getPackageInstance <em>Package Instance</em>}</li>
 *   <li>{@link Essence.Product#getSiliconInstance <em>Silicon Instance</em>}</li>
 *   <li>{@link Essence.Product#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getProduct()
 * @model extendedMetaData="name='Product' kind='elementOnly'"
 * @generated
 */
public interface Product extends ModelRoot {
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
	 * @see Essence.EssencePackage#getProduct_Step()
	 * @model dataType="Essence.StringExpr" required="true"
	 *        extendedMetaData="kind='element' name='Step' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStep();

	/**
	 * Sets the value of the '{@link Essence.Product#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(String value);

	/**
	 * Returns the value of the '<em><b>Package Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Instance</em>' containment reference.
	 * @see #setPackageInstance(PackageInstance)
	 * @see Essence.EssencePackage#getProduct_PackageInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PackageInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	PackageInstance getPackageInstance();

	/**
	 * Sets the value of the '{@link Essence.Product#getPackageInstance <em>Package Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Instance</em>' containment reference.
	 * @see #getPackageInstance()
	 * @generated
	 */
	void setPackageInstance(PackageInstance value);

	/**
	 * Returns the value of the '<em><b>Silicon Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Silicon Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Silicon Instance</em>' containment reference.
	 * @see #setSiliconInstance(SiliconInstance)
	 * @see Essence.EssencePackage#getProduct_SiliconInstance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SiliconInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	SiliconInstance getSiliconInstance();

	/**
	 * Sets the value of the '{@link Essence.Product#getSiliconInstance <em>Silicon Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Silicon Instance</em>' containment reference.
	 * @see #getSiliconInstance()
	 * @generated
	 */
	void setSiliconInstance(SiliconInstance value);

	/**
	 * Returns the value of the '<em><b>Net</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.Net}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' containment reference list.
	 * @see Essence.EssencePackage#getProduct_Net()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Net' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Net> getNet();

} // Product
