/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.ProductInstance#getProductInterfaceMap <em>Product Interface Map</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getProductInstance()
 * @model extendedMetaData="name='ProductInstance' kind='elementOnly'"
 * @generated
 */
public interface ProductInstance extends Instance {
	/**
	 * Returns the value of the '<em><b>Product Interface Map</b></em>' containment reference list.
	 * The list contents are of type {@link model.ProductInterfaceMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Interface Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Interface Map</em>' containment reference list.
	 * @see model.ModelPackage#getProductInstance_ProductInterfaceMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProductInterfaceMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProductInterfaceMap> getProductInterfaceMap();

} // ProductInstance
