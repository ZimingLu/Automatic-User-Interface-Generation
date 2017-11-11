/**
 */
package model;

import modelextension.EssenceBaseExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Essence Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.EssenceBase#getClassName <em>Class Name</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getEssenceBase()
 * @model abstract="true"
 *        extendedMetaData="name='EssenceBase' kind='empty'"
 * @generated
 */
public interface EssenceBase extends EssenceBaseExtension {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see model.ModelPackage#getEssenceBase_ClassName()
	 * @model required="true" transient="true" changeable="false" volatile="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='return this.eClass().getName();'"
	 * @generated
	 */
	String getClassName();

} // EssenceBase
