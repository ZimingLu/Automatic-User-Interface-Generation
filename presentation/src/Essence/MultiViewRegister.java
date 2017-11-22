/**
 */
package Essence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi View Register</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Essence.MultiViewRegister#getXRefRegisterView <em>XRef Register View</em>}</li>
 *   <li>{@link Essence.MultiViewRegister#getRegisterView <em>Register View</em>}</li>
 * </ul>
 *
 * @see Essence.EssencePackage#getMultiViewRegister()
 * @model extendedMetaData="name='MultiViewRegister' kind='elementOnly'"
 * @generated
 */
public interface MultiViewRegister extends GeneralRegister {
	/**
	 * Returns the value of the '<em><b>XRef Register View</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.XRefRegisterView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Register View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Register View</em>' containment reference list.
	 * @see Essence.EssencePackage#getMultiViewRegister_XRefRegisterView()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='XRefRegisterView' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<XRefRegisterView> getXRefRegisterView();

	/**
	 * Returns the value of the '<em><b>Register View</b></em>' containment reference list.
	 * The list contents are of type {@link Essence.RegisterView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register View</em>' containment reference list.
	 * @see Essence.EssencePackage#getMultiViewRegister_RegisterView()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RegisterView' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RegisterView> getRegisterView();

} // MultiViewRegister
