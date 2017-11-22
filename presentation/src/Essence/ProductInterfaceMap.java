/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Interface Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.ProductInterfaceMap#getXRefConnection <em>XRef Connection</em>}</li>
 *   <li>{@link Essence.ProductInterfaceMap#getProductPinMap <em>Product Pin Map</em>}</li>
 *   <li>{@link Essence.ProductInterfaceMap#getProductPadMap <em>Product Pad Map</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getProductInterfaceMap()
 * @model extendedMetaData="name='ProductInterfaceMap' kind='elementOnly'"
 * @generated
 */
public interface ProductInterfaceMap extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>XRef Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Connection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Connection</em>' containment reference.
	 * @see #setXRefConnection(XRefConnection)
	 * @see Essence.EssencePackage#getProductInterfaceMap_XRefConnection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XRefConnection' namespace='##targetNamespace'"
	 * @generated
	 */
	XRefConnection getXRefConnection();

	/**
	 * Sets the value of the '{@link Essence.ProductInterfaceMap#getXRefConnection <em>XRef Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XRef Connection</em>' containment reference.
	 * @see #getXRefConnection()
	 * @generated
	 */
	void setXRefConnection(XRefConnection value);

	/**
	 * Returns the value of the '<em><b>Product Pin Map</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.ProductPinMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Pin Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Pin Map</em>' containment reference list.
	 * @see Essence.EssencePackage#getProductInterfaceMap_ProductPinMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProductPinMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProductPinMap> getProductPinMap();

	/**
	 * Returns the value of the '<em><b>Product Pad Map</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.ProductPadMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Pad Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Pad Map</em>' containment reference list.
	 * @see Essence.EssencePackage#getProductInterfaceMap_ProductPadMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProductPadMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProductPadMap> getProductPadMap();

} // ProductInterfaceMap
