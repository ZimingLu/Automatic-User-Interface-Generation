/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.ModelRoot#getConstDefBlock <em>Const Def Block</em>}</li>
 *   <li>{@link Essence.ModelRoot#getEssenceVersion <em>Essence Version</em>}</li>
 *   <li>{@link Essence.ModelRoot#getGenericDeclBlock <em>Generic Decl Block</em>}</li>
 *   <li>{@link Essence.ModelRoot#getModule <em>Module</em>}</li>
 *   <li>{@link Essence.ModelRoot#getParamDeclBlock <em>Param Decl Block</em>}</li>
 *   <li>{@link Essence.ModelRoot#getVLNV <em>VLNV</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getModelRoot()
 * @model abstract="true"
 *        extendedMetaData="name='ModelRoot' kind='elementOnly'"
 * @generated
 */
public interface ModelRoot extends SingleSourceNode {
	/**
	 * Returns the value of the '<em><b>Const Def Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Const Def Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const Def Block</em>' containment reference.
	 * @see #setConstDefBlock(ConstDefBlock)
	 * @see Essence.EssencePackage#getModelRoot_ConstDefBlock()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ConstDefBlock' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstDefBlock getConstDefBlock();

	/**
	 * Sets the value of the '{@link Essence.ModelRoot#getConstDefBlock <em>Const Def Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Const Def Block</em>' containment reference.
	 * @see #getConstDefBlock()
	 * @generated
	 */
	void setConstDefBlock(ConstDefBlock value);

	/**
	 * Returns the value of the '<em><b>Essence Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 20300
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Essence Version</em>' attribute.
	 * @see #isSetEssenceVersion()
	 * @see #unsetEssenceVersion()
	 * @see #setEssenceVersion(int)
	 * @see Essence.EssencePackage#getModelRoot_EssenceVersion()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='EssenceVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	int getEssenceVersion();

	/**
	 * Sets the value of the '{@link Essence.ModelRoot#getEssenceVersion <em>Essence Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Essence Version</em>' attribute.
	 * @see #isSetEssenceVersion()
	 * @see #unsetEssenceVersion()
	 * @see #getEssenceVersion()
	 * @generated
	 */
	void setEssenceVersion(int value);

	/**
	 * Unsets the value of the '{@link Essence.ModelRoot#getEssenceVersion <em>Essence Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEssenceVersion()
	 * @see #getEssenceVersion()
	 * @see #setEssenceVersion(int)
	 * @generated
	 */
	void unsetEssenceVersion();

	/**
	 * Returns whether the value of the '{@link Essence.ModelRoot#getEssenceVersion <em>Essence Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Essence Version</em>' attribute is set.
	 * @see #unsetEssenceVersion()
	 * @see #getEssenceVersion()
	 * @see #setEssenceVersion(int)
	 * @generated
	 */
	boolean isSetEssenceVersion();

	/**
	 * Returns the value of the '<em><b>Generic Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Decl Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Decl Block</em>' containment reference.
	 * @see #setGenericDeclBlock(GenericDeclBlock)
	 * @see Essence.EssencePackage#getModelRoot_GenericDeclBlock()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GenericDeclBlock' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericDeclBlock getGenericDeclBlock();

	/**
	 * Sets the value of the '{@link Essence.ModelRoot#getGenericDeclBlock <em>Generic Decl Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Decl Block</em>' containment reference.
	 * @see #getGenericDeclBlock()
	 * @generated
	 */
	void setGenericDeclBlock(GenericDeclBlock value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' containment reference list.
	 * @see Essence.EssencePackage#getModelRoot_Module()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Module' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Module> getModule();

	/**
	 * Returns the value of the '<em><b>Param Decl Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Decl Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Decl Block</em>' containment reference.
	 * @see #setParamDeclBlock(ParamDeclBlock)
	 * @see Essence.EssencePackage#getModelRoot_ParamDeclBlock()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ParamDeclBlock' namespace='##targetNamespace'"
	 * @generated
	 */
	ParamDeclBlock getParamDeclBlock();

	/**
	 * Sets the value of the '{@link Essence.ModelRoot#getParamDeclBlock <em>Param Decl Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Decl Block</em>' containment reference.
	 * @see #getParamDeclBlock()
	 * @generated
	 */
	void setParamDeclBlock(ParamDeclBlock value);

	/**
	 * Returns the value of the '<em><b>VLNV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VLNV</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VLNV</em>' containment reference.
	 * @see #setVLNV(VLNV)
	 * @see Essence.EssencePackage#getModelRoot_VLNV()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='VLNV' namespace='##targetNamespace'"
	 * @generated
	 */
	VLNV getVLNV();

	/**
	 * Sets the value of the '{@link Essence.ModelRoot#getVLNV <em>VLNV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VLNV</em>' containment reference.
	 * @see #getVLNV()
	 * @generated
	 */
	void setVLNV(VLNV value);

} // ModelRoot
