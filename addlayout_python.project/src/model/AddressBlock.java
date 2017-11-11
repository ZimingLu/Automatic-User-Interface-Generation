/**
 */
package model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.AddressBlock#getXRefRegMemSet <em>XRef Reg Mem Set</em>}</li>
 *   <li>{@link model.AddressBlock#getXRefMasterInterface <em>XRef Master Interface</em>}</li>
 *   <li>{@link model.AddressBlock#getXRefSlaveInterface <em>XRef Slave Interface</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getAddressBlock()
 * @model extendedMetaData="name='AddressBlock' kind='elementOnly'"
 * @generated
 */
public interface AddressBlock extends EssenceBase {
	/**
	 * Returns the value of the '<em><b>XRef Reg Mem Set</b></em>' containment reference list.
	 * The list contents are of type {@link model.XRefRegMemSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Reg Mem Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Reg Mem Set</em>' containment reference list.
	 * @see model.ModelPackage#getAddressBlock_XRefRegMemSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='XRefRegMemSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<XRefRegMemSet> getXRefRegMemSet();

	/**
	 * Returns the value of the '<em><b>XRef Master Interface</b></em>' containment reference list.
	 * The list contents are of type {@link model.XRefMasterInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Master Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Master Interface</em>' containment reference list.
	 * @see model.ModelPackage#getAddressBlock_XRefMasterInterface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='XRefMasterInterface' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<XRefMasterInterface> getXRefMasterInterface();

	/**
	 * Returns the value of the '<em><b>XRef Slave Interface</b></em>' containment reference list.
	 * The list contents are of type {@link model.XRefSlaveInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XRef Slave Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XRef Slave Interface</em>' containment reference list.
	 * @see model.ModelPackage#getAddressBlock_XRefSlaveInterface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='XRefSlaveInterface' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<XRefSlaveInterface> getXRefSlaveInterface();

} // AddressBlock
