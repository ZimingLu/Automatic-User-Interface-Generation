/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Access#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link model.Access#getStrobeType <em>Strobe Type</em>}</li>
 *   <li>{@link model.Access#getActionType <em>Action Type</em>}</li>
 *   <li>{@link model.Access#isClear <em>Clear</em>}</li>
 *   <li>{@link model.Access#isEnable <em>Enable</em>}</li>
 *   <li>{@link model.Access#isInterrupt <em>Interrupt</em>}</li>
 *   <li>{@link model.Access#isPulse <em>Pulse</em>}</li>
 *   <li>{@link model.Access#isReset <em>Reset</em>}</li>
 *   <li>{@link model.Access#isSet <em>Set</em>}</li>
 *   <li>{@link model.Access#isStatus <em>Status</em>}</li>
 *   <li>{@link model.Access#isToggle <em>Toggle</em>}</li>
 *   <li>{@link model.Access#isRegister <em>Register</em>}</li>
 *   <li>{@link model.Access#isTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getAccess()
 * @model extendedMetaData="name='Access' kind='elementOnly'"
 * @generated
 */
public interface Access extends EssenceBase {
	/**
	 * Returns the value of the '<em><b>Access Type</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link model.AccessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Type</em>' attribute.
	 * @see model.AccessType
	 * @see #setAccessType(AccessType)
	 * @see model.ModelPackage#getAccess_AccessType()
	 * @model default="none" required="true"
	 *        extendedMetaData="kind='element' name='AccessType' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessType getAccessType();

	/**
	 * Sets the value of the '{@link model.Access#getAccessType <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type</em>' attribute.
	 * @see model.AccessType
	 * @see #getAccessType()
	 * @generated
	 */
	void setAccessType(AccessType value);

	/**
	 * Returns the value of the '<em><b>Strobe Type</b></em>' attribute.
	 * The default value is <code>"NoStrobe"</code>.
	 * The literals are from the enumeration {@link model.StrobeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strobe Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strobe Type</em>' attribute.
	 * @see model.StrobeType
	 * @see #setStrobeType(StrobeType)
	 * @see model.ModelPackage#getAccess_StrobeType()
	 * @model default="NoStrobe" required="true"
	 *        extendedMetaData="kind='element' name='StrobeType' namespace='##targetNamespace'"
	 * @generated
	 */
	StrobeType getStrobeType();

	/**
	 * Sets the value of the '{@link model.Access#getStrobeType <em>Strobe Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strobe Type</em>' attribute.
	 * @see model.StrobeType
	 * @see #getStrobeType()
	 * @generated
	 */
	void setStrobeType(StrobeType value);

	/**
	 * Returns the value of the '<em><b>Action Type</b></em>' attribute list.
	 * The list contents are of type {@link model.ActionType}.
	 * The literals are from the enumeration {@link model.ActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Type</em>' attribute list.
	 * @see model.ActionType
	 * @see model.ModelPackage#getAccess_ActionType()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='ActionType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActionType> getActionType();

	/**
	 * Returns the value of the '<em><b>Clear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clear</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clear</em>' attribute.
	 * @see #setClear(boolean)
	 * @see model.ModelPackage#getAccess_Clear()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isClear();

	/**
	 * Sets the value of the '{@link model.Access#isClear <em>Clear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clear</em>' attribute.
	 * @see #isClear()
	 * @generated
	 */
	void setClear(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable</em>' attribute.
	 * @see #setEnable(boolean)
	 * @see model.ModelPackage#getAccess_Enable()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isEnable();

	/**
	 * Sets the value of the '{@link model.Access#isEnable <em>Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable</em>' attribute.
	 * @see #isEnable()
	 * @generated
	 */
	void setEnable(boolean value);

	/**
	 * Returns the value of the '<em><b>Interrupt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interrupt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interrupt</em>' attribute.
	 * @see #setInterrupt(boolean)
	 * @see model.ModelPackage#getAccess_Interrupt()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isInterrupt();

	/**
	 * Sets the value of the '{@link model.Access#isInterrupt <em>Interrupt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interrupt</em>' attribute.
	 * @see #isInterrupt()
	 * @generated
	 */
	void setInterrupt(boolean value);

	/**
	 * Returns the value of the '<em><b>Pulse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pulse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pulse</em>' attribute.
	 * @see #setPulse(boolean)
	 * @see model.ModelPackage#getAccess_Pulse()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isPulse();

	/**
	 * Sets the value of the '{@link model.Access#isPulse <em>Pulse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pulse</em>' attribute.
	 * @see #isPulse()
	 * @generated
	 */
	void setPulse(boolean value);

	/**
	 * Returns the value of the '<em><b>Reset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset</em>' attribute.
	 * @see #setReset(boolean)
	 * @see model.ModelPackage#getAccess_Reset()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isReset();

	/**
	 * Sets the value of the '{@link model.Access#isReset <em>Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset</em>' attribute.
	 * @see #isReset()
	 * @generated
	 */
	void setReset(boolean value);

	/**
	 * Returns the value of the '<em><b>Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set</em>' attribute.
	 * @see #setSet(boolean)
	 * @see model.ModelPackage#getAccess_Set()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isSet();

	/**
	 * Sets the value of the '{@link model.Access#isSet <em>Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' attribute.
	 * @see #isSet()
	 * @generated
	 */
	void setSet(boolean value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(boolean)
	 * @see model.ModelPackage#getAccess_Status()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isStatus();

	/**
	 * Sets the value of the '{@link model.Access#isStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #isStatus()
	 * @generated
	 */
	void setStatus(boolean value);

	/**
	 * Returns the value of the '<em><b>Toggle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toggle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toggle</em>' attribute.
	 * @see #setToggle(boolean)
	 * @see model.ModelPackage#getAccess_Toggle()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isToggle();

	/**
	 * Sets the value of the '{@link model.Access#isToggle <em>Toggle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toggle</em>' attribute.
	 * @see #isToggle()
	 * @generated
	 */
	void setToggle(boolean value);

	/**
	 * Returns the value of the '<em><b>Register</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register</em>' attribute.
	 * @see #setRegister(boolean)
	 * @see model.ModelPackage#getAccess_Register()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isRegister();

	/**
	 * Sets the value of the '{@link model.Access#isRegister <em>Register</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register</em>' attribute.
	 * @see #isRegister()
	 * @generated
	 */
	void setRegister(boolean value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see #setTrigger(boolean)
	 * @see model.ModelPackage#getAccess_Trigger()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isTrigger();

	/**
	 * Sets the value of the '{@link model.Access#isTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see #isTrigger()
	 * @generated
	 */
	void setTrigger(boolean value);

} // Access
