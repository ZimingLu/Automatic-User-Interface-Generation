/**
 */
package Essence;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link Essence.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link Essence.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link Essence.DocumentRoot#getBus <em>Bus</em>}</li>
 *   <li>{@link Essence.DocumentRoot#getComponent <em>Component</em>}</li>
 *   <li>{@link Essence.DocumentRoot#getInterfaceDefinition <em>Interface Definition</em>}</li>
 *   <li>{@link Essence.DocumentRoot#getPackage <em>Package</em>}</li>
 *   <li>{@link Essence.DocumentRoot#getPadTypeDB <em>Pad Type DB</em>}</li>
 *   <li>{@link Essence.DocumentRoot#getProduct <em>Product</em>}</li>
 *   <li>{@link Essence.DocumentRoot#getSilicon <em>Silicon</em>}</li>
 *   <li>{@link Essence.DocumentRoot#getSiPortDB <em>Si Port DB</em>}</li>
 *   <li>{@link Essence.DocumentRoot#getSiSignalDB <em>Si Signal DB</em>}</li>
 *   <li>{@link Essence.DocumentRoot#getSystem <em>System</em>}</li>
 *   <li>{@link Essence.DocumentRoot#getTestDB <em>Test DB</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see Essence.EssencePackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see Essence.EssencePackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see Essence.EssencePackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Bus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus</em>' containment reference.
	 * @see #setBus(Bus)
	 * @see Essence.EssencePackage#getDocumentRoot_Bus()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Bus' namespace='##targetNamespace'"
	 * @generated
	 */
	Bus getBus();

	/**
	 * Sets the value of the '{@link Essence.DocumentRoot#getBus <em>Bus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus</em>' containment reference.
	 * @see #getBus()
	 * @generated
	 */
	void setBus(Bus value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference.
	 * @see #setComponent(Component)
	 * @see Essence.EssencePackage#getDocumentRoot_Component()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Component' namespace='##targetNamespace'"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link Essence.DocumentRoot#getComponent <em>Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' containment reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Interface Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Definition</em>' containment reference.
	 * @see #setInterfaceDefinition(InterfaceDefinition)
	 * @see Essence.EssencePackage#getDocumentRoot_InterfaceDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InterfaceDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	InterfaceDefinition getInterfaceDefinition();

	/**
	 * Sets the value of the '{@link Essence.DocumentRoot#getInterfaceDefinition <em>Interface Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Definition</em>' containment reference.
	 * @see #getInterfaceDefinition()
	 * @generated
	 */
	void setInterfaceDefinition(InterfaceDefinition value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' containment reference.
	 * @see #setPackage(Essence.Package)
	 * @see Essence.EssencePackage#getDocumentRoot_Package()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Package' namespace='##targetNamespace'"
	 * @generated
	 */
	Essence.Package getPackage();

	/**
	 * Sets the value of the '{@link Essence.DocumentRoot#getPackage <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' containment reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(Essence.Package value);

	/**
	 * Returns the value of the '<em><b>Pad Type DB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pad Type DB</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pad Type DB</em>' containment reference.
	 * @see #setPadTypeDB(PadTypeDB)
	 * @see Essence.EssencePackage#getDocumentRoot_PadTypeDB()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PadTypeDB' namespace='##targetNamespace'"
	 * @generated
	 */
	PadTypeDB getPadTypeDB();

	/**
	 * Sets the value of the '{@link Essence.DocumentRoot#getPadTypeDB <em>Pad Type DB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pad Type DB</em>' containment reference.
	 * @see #getPadTypeDB()
	 * @generated
	 */
	void setPadTypeDB(PadTypeDB value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' containment reference.
	 * @see #setProduct(Product)
	 * @see Essence.EssencePackage#getDocumentRoot_Product()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Product' namespace='##targetNamespace'"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link Essence.DocumentRoot#getProduct <em>Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' containment reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Silicon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Silicon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Silicon</em>' containment reference.
	 * @see #setSilicon(Silicon)
	 * @see Essence.EssencePackage#getDocumentRoot_Silicon()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Silicon' namespace='##targetNamespace'"
	 * @generated
	 */
	Silicon getSilicon();

	/**
	 * Sets the value of the '{@link Essence.DocumentRoot#getSilicon <em>Silicon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Silicon</em>' containment reference.
	 * @see #getSilicon()
	 * @generated
	 */
	void setSilicon(Silicon value);

	/**
	 * Returns the value of the '<em><b>Si Port DB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Si Port DB</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Si Port DB</em>' containment reference.
	 * @see #setSiPortDB(SiPortDB)
	 * @see Essence.EssencePackage#getDocumentRoot_SiPortDB()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SiPortDB' namespace='##targetNamespace'"
	 * @generated
	 */
	SiPortDB getSiPortDB();

	/**
	 * Sets the value of the '{@link Essence.DocumentRoot#getSiPortDB <em>Si Port DB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Si Port DB</em>' containment reference.
	 * @see #getSiPortDB()
	 * @generated
	 */
	void setSiPortDB(SiPortDB value);

	/**
	 * Returns the value of the '<em><b>Si Signal DB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Si Signal DB</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Si Signal DB</em>' containment reference.
	 * @see #setSiSignalDB(SiSignalDB)
	 * @see Essence.EssencePackage#getDocumentRoot_SiSignalDB()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SiSignalDB' namespace='##targetNamespace'"
	 * @generated
	 */
	SiSignalDB getSiSignalDB();

	/**
	 * Sets the value of the '{@link Essence.DocumentRoot#getSiSignalDB <em>Si Signal DB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Si Signal DB</em>' containment reference.
	 * @see #getSiSignalDB()
	 * @generated
	 */
	void setSiSignalDB(SiSignalDB value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(Essence.System)
	 * @see Essence.EssencePackage#getDocumentRoot_System()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='System' namespace='##targetNamespace'"
	 * @generated
	 */
	Essence.System getSystem();

	/**
	 * Sets the value of the '{@link Essence.DocumentRoot#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(Essence.System value);

	/**
	 * Returns the value of the '<em><b>Test DB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test DB</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test DB</em>' containment reference.
	 * @see #setTestDB(TestDB)
	 * @see Essence.EssencePackage#getDocumentRoot_TestDB()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TestDB' namespace='##targetNamespace'"
	 * @generated
	 */
	TestDB getTestDB();

	/**
	 * Sets the value of the '{@link Essence.DocumentRoot#getTestDB <em>Test DB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test DB</em>' containment reference.
	 * @see #getTestDB()
	 * @generated
	 */
	void setTestDB(TestDB value);

} // DocumentRoot
