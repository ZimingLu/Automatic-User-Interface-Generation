/**
 */
package model.impl;

import java.io.IOException;

import java.net.URL;

import model.ModelFactory;
import model.ModelPackage;

import model.util.ModelValidator;

import modelextension.ModelextensionPackage;

import modelextension.impl.ModelextensionPackageImpl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "model.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessByIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessByNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitFieldElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitFieldGapElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitFieldSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitFieldSequenceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanGenDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busInterfaceMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busNoneInterfaceMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cablePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cableSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constDefBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataGenDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass essenceBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gapElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalPadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalRegisterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericDeclBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexVarUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceInterfaceMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instancePortMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceShellInterfaceMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceShellPortMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerGenDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDefCablePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDefPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDefRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDefTransactionalPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDefViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDefWirePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfacePortMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localInterfaceMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localPortMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodDataTypeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiPadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiViewRegisterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass netEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noneInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass padEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass padMultiplexedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass padNetMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass padNonMultiplexedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass padSpecialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass padSupplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass padTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass padTypeDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramDeclBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinNetMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productInterfaceMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productPadMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productPinMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regMemElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regMemSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regMemSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regViewBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnElementAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shellInterfaceMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shellPortMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siComponentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siInstanceInterfaceMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siInstancePortMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siInstanceShellInterfaceMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siInstanceShellPortMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siliconEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siliconInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleSubElementAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singlePadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleSourceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siPortDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siPortReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siSignalDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siSystemInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringGenDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subElementAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionalPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionalSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varDefBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vlnvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wirePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wireSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefDataVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefDirectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefExternalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefExternalInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefExternalPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefExternalSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefGenericDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefIFDPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefIndInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefIndirectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefIndPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefIndPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefIndSinglePadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefInternalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefInternalInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefInternalPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefInternalSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefMasterInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefNoneInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefPadTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefParamDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefPowerDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefRealPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefRegisterViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefRegMemSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefSinglePadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefSiPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefSiSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefSlaveInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRefVLNVEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum behaviorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum busErrorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum endianTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum functionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interfaceDefRoleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interfaceRoleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portInitiativeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reservedTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum signTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specialTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum strobeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum syncModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum topSpinTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum virtualTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType accessTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType actionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType behaviorTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanExprEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanLiteralEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType busErrorTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType commonExprEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType endianTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType functionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerExprEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerLiteralEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType interfaceDefRoleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType interfaceRoleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pathExprEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType portDirectionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType portInitiativeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType reservedTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType signTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType specialTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringExprEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringLiteralEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType strobeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType syncModeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType topSpinTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType virtualTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ModelextensionPackageImpl theModelextensionPackage = (ModelextensionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelextensionPackage.eNS_URI) instanceof ModelextensionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelextensionPackage.eNS_URI) : ModelextensionPackage.eINSTANCE);

		// Load packages
		theModelPackage.loadPackage();

		// Create package meta-data objects
		theModelextensionPackage.createPackageContents();

		// Initialize created meta-data
		theModelextensionPackage.initializePackageContents();

		// Fix loaded packages
		theModelPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theModelPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ModelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccess() {
		if (accessEClass == null) {
			accessEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(0);
		}
		return accessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccess_AccessType() {
        return (EAttribute)getAccess().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccess_StrobeType() {
        return (EAttribute)getAccess().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccess_ActionType() {
        return (EAttribute)getAccess().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccess_Clear() {
        return (EAttribute)getAccess().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccess_Enable() {
        return (EAttribute)getAccess().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccess_Interrupt() {
        return (EAttribute)getAccess().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccess_Pulse() {
        return (EAttribute)getAccess().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccess_Reset() {
        return (EAttribute)getAccess().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccess_Set() {
        return (EAttribute)getAccess().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccess_Status() {
        return (EAttribute)getAccess().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccess_Toggle() {
        return (EAttribute)getAccess().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccess_Register() {
        return (EAttribute)getAccess().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccess_Trigger() {
        return (EAttribute)getAccess().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessByIndex() {
		if (accessByIndexEClass == null) {
			accessByIndexEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(1);
		}
		return accessByIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessByIndex_Ascending() {
        return (EAttribute)getAccessByIndex().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessByIndex_Left() {
        return (EAttribute)getAccessByIndex().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessByIndex_Right() {
        return (EAttribute)getAccessByIndex().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessByIndex_SimpleSubElementAccess() {
        return (EReference)getAccessByIndex().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessByName() {
		if (accessByNameEClass == null) {
			accessByNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(2);
		}
		return accessByNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessByName_Name() {
        return (EAttribute)getAccessByName().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessByName_SimpleSubElementAccess() {
        return (EReference)getAccessByName().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessCondition() {
		if (accessConditionEClass == null) {
			accessConditionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(3);
		}
		return accessConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessCondition_AccessLevel() {
        return (EAttribute)getAccessCondition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessCondition_BusErrorType() {
        return (EAttribute)getAccessCondition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessLevel() {
		if (accessLevelEClass == null) {
			accessLevelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(4);
		}
		return accessLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessLevel_AccessLevel() {
        return (EAttribute)getAccessLevel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessLevel_AccessType() {
        return (EAttribute)getAccessLevel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressBlock() {
		if (addressBlockEClass == null) {
			addressBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(9);
		}
		return addressBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressBlock_XRefRegMemSet() {
        return (EReference)getAddressBlock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressBlock_XRefMasterInterface() {
        return (EReference)getAddressBlock().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressBlock_XRefSlaveInterface() {
        return (EReference)getAddressBlock().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArray() {
		if (arrayEClass == null) {
			arrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(10);
		}
		return arrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_DataType() {
        return (EReference)getArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_ArrayDimension() {
        return (EReference)getArray().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayDimension() {
		if (arrayDimensionEClass == null) {
			arrayDimensionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(11);
		}
		return arrayDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayDimension_Ascending() {
        return (EAttribute)getArrayDimension().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayDimension_Left() {
        return (EAttribute)getArrayDimension().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayDimension_Right() {
        return (EAttribute)getArrayDimension().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitField() {
		if (bitFieldEClass == null) {
			bitFieldEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(14);
		}
		return bitFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBitField_AccessExternal() {
        return (EReference)getBitField().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBitField_AccessInternal() {
        return (EReference)getBitField().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitField_MaxVal() {
        return (EAttribute)getBitField().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitField_MinVal() {
        return (EAttribute)getBitField().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitField_Reserved() {
        return (EAttribute)getBitField().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitField_SignInterpretation() {
        return (EAttribute)getBitField().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitField_Virtual() {
        return (EAttribute)getBitField().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitField_DefaultValue() {
        return (EAttribute)getBitField().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitField_DefaultMask() {
        return (EAttribute)getBitField().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBitField_AccessLevel() {
        return (EReference)getBitField().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBitField_EnumerationElement() {
        return (EReference)getBitField().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitField_CheckParent() {
        return (EAttribute)getBitField().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBitField__GetMinValValue__Map() {
        return getBitField().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBitField__GetMaxValValue__Map() {
        return getBitField().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitFieldElement() {
		if (bitFieldElementEClass == null) {
			bitFieldElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(15);
		}
		return bitFieldElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitFieldElement_Offset() {
        return (EAttribute)getBitFieldElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitFieldGapElement() {
		if (bitFieldGapElementEClass == null) {
			bitFieldGapElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(16);
		}
		return bitFieldGapElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitFieldSequence() {
		if (bitFieldSequenceEClass == null) {
			bitFieldSequenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(17);
		}
		return bitFieldSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitFieldSequence_Count() {
        return (EAttribute)getBitFieldSequence().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitFieldSequence_MinIndex() {
        return (EAttribute)getBitFieldSequence().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitFieldSequence_IndexStep() {
        return (EAttribute)getBitFieldSequence().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitFieldSequence_IndexVar() {
        return (EAttribute)getBitFieldSequence().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitFieldSequence_AltFormat() {
        return (EAttribute)getBitFieldSequence().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBitFieldSequence_BitFieldSequenceElement() {
        return (EReference)getBitFieldSequence().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBitFieldSequence__GetElement() {
        return getBitFieldSequence().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitFieldSequenceElement() {
		if (bitFieldSequenceElementEClass == null) {
			bitFieldSequenceElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(18);
		}
		return bitFieldSequenceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitFieldSequenceElement_Width() {
        return (EAttribute)getBitFieldSequenceElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanDecl() {
		if (booleanDeclEClass == null) {
			booleanDeclEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(19);
		}
		return booleanDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanDecl_DefaultValue() {
        return (EAttribute)getBooleanDecl().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanDef() {
		if (booleanDefEClass == null) {
			booleanDefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(20);
		}
		return booleanDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanDef_Value() {
        return (EAttribute)getBooleanDef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanGenDecl() {
		if (booleanGenDeclEClass == null) {
			booleanGenDeclEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(22);
		}
		return booleanGenDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanGenDecl_DefaultValue() {
        return (EAttribute)getBooleanGenDecl().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBus() {
		if (busEClass == null) {
			busEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(24);
		}
		return busEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBus_ExtVLNV() {
        return (EReference)getBus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBus_MaxMasters() {
        return (EAttribute)getBus().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBus_MaxSlaves() {
        return (EAttribute)getBus().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBus_NoneInterface() {
        return (EReference)getBus().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusInstance() {
		if (busInstanceEClass == null) {
			busInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(27);
		}
		return busInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusInstance_BusInterfaceMap() {
        return (EReference)getBusInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusInstance_BusNoneInterfaceMap() {
        return (EReference)getBusInstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusInterfaceMap() {
		if (busInterfaceMapEClass == null) {
			busInterfaceMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(28);
		}
		return busInterfaceMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusInterfaceMap_XRefConnection() {
        return (EReference)getBusInterfaceMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusNoneInterfaceMap() {
		if (busNoneInterfaceMapEClass == null) {
			busNoneInterfaceMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(29);
		}
		return busNoneInterfaceMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusNoneInterfaceMap_XRefBusNoneInterface() {
        return (EReference)getBusNoneInterfaceMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusNoneInterfaceMap_XRefConnection() {
        return (EReference)getBusNoneInterfaceMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusNoneInterfaceMap_InstancePortMap() {
        return (EReference)getBusNoneInterfaceMap().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCablePort() {
		if (cablePortEClass == null) {
			cablePortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(30);
		}
		return cablePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCablePort_DataType() {
        return (EReference)getCablePort().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCableSignal() {
		if (cableSignalEClass == null) {
			cableSignalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(31);
		}
		return cableSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCableSignal_DataType() {
        return (EReference)getCableSignal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexDataType() {
		if (complexDataTypeEClass == null) {
			complexDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(33);
		}
		return complexDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexDataType_Name() {
        return (EAttribute)getComplexDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		if (componentEClass == null) {
			componentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(34);
		}
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Interface() {
        return (EReference)getComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_RegViewBlock() {
        return (EReference)getComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_TopSpinClkStyle() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_RegMemSet() {
        return (EReference)getComponent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInstance() {
		if (componentInstanceEClass == null) {
			componentInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(35);
		}
		return componentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		if (connectionEClass == null) {
			connectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(36);
		}
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_ExtVLNV() {
        return (EReference)getConnection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstDef() {
		if (constDefEClass == null) {
			constDefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(37);
		}
		return constDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstDefBlock() {
		if (constDefBlockEClass == null) {
			constDefBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(38);
		}
		return constDefBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstDefBlock_ConstDef() {
        return (EReference)getConstDefBlock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDecl() {
		if (dataDeclEClass == null) {
			dataDeclEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(39);
		}
		return dataDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDecl_DataType() {
        return (EReference)getDataDecl().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDecl_DefaultValue() {
        return (EAttribute)getDataDecl().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDef() {
		if (dataDefEClass == null) {
			dataDefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(40);
		}
		return dataDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDef_DataType() {
        return (EReference)getDataDef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataDef_Value() {
        return (EAttribute)getDataDef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataGenDecl() {
		if (dataGenDeclEClass == null) {
			dataGenDeclEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(41);
		}
		return dataGenDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataGenDecl_DataType() {
        return (EReference)getDataGenDecl().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataGenDecl_DefaultValue() {
        return (EAttribute)getDataGenDecl().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		if (dataTypeEClass == null) {
			dataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(42);
		}
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeElement() {
		if (dataTypeElementEClass == null) {
			dataTypeElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(43);
		}
		return dataTypeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeElement_DataType() {
        return (EReference)getDataTypeElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeElement_Name() {
        return (EAttribute)getDataTypeElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionItem() {
		if (descriptionItemEClass == null) {
			descriptionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(44);
		}
		return descriptionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionItem_Html() {
        return (EAttribute)getDescriptionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionItem_Dita() {
        return (EAttribute)getDescriptionItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(45);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Bus() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Component() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InterfaceDefinition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Package() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PadTypeDB() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Product() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Silicon() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SiPortDB() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SiSignalDB() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_System() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TestDB() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnum() {
		if (enumEClass == null) {
			enumEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(48);
		}
		return enumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnum_EnumElement() {
        return (EReference)getEnum().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumElement() {
		if (enumElementEClass == null) {
			enumElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(49);
		}
		return enumElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumElement_Name() {
        return (EAttribute)getEnumElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumElement_Value() {
        return (EAttribute)getEnumElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		if (enumerationEClass == null) {
			enumerationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(50);
		}
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumeration_Value() {
        return (EAttribute)getEnumeration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationElement() {
		if (enumerationElementEClass == null) {
			enumerationElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(51);
		}
		return enumerationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationInteger() {
		if (enumerationIntegerEClass == null) {
			enumerationIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(52);
		}
		return enumerationIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationInteger_Value() {
        return (EAttribute)getEnumerationInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationSequence() {
		if (enumerationSequenceEClass == null) {
			enumerationSequenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(53);
		}
		return enumerationSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationSequence_Count() {
        return (EAttribute)getEnumerationSequence().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationSequence_MinIndex() {
        return (EAttribute)getEnumerationSequence().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationSequence_IndexStep() {
        return (EAttribute)getEnumerationSequence().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationSequence_IndexVar() {
        return (EAttribute)getEnumerationSequence().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationSequence_AltFormat() {
        return (EAttribute)getEnumerationSequence().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationSequence_Enumeration() {
        return (EReference)getEnumerationSequence().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnumerationSequence__GetElement() {
        return getEnumerationSequence().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationString() {
		if (enumerationStringEClass == null) {
			enumerationStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(54);
		}
		return enumerationStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationString_Value() {
        return (EAttribute)getEnumerationString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEssenceBase() {
		if (essenceBaseEClass == null) {
			essenceBaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(55);
		}
		return essenceBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEssenceBase_ClassName() {
        return (EAttribute)getEssenceBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		if (functionEClass == null) {
			functionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(56);
		}
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Type() {
        return (EAttribute)getFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Module() {
        return (EAttribute)getFunction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_XRefSignal() {
        return (EReference)getFunction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGapElement() {
		if (gapElementEClass == null) {
			gapElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(59);
		}
		return gapElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralInstance() {
		if (generalInstanceEClass == null) {
			generalInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(60);
		}
		return generalInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralInstance_ExtVLNV() {
        return (EReference)getGeneralInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralInstance_ParamMap() {
        return (EReference)getGeneralInstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralInstance_GenericMap() {
        return (EReference)getGeneralInstance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralInterface() {
		if (generalInterfaceEClass == null) {
			generalInterfaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(61);
		}
		return generalInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralInterface_InterfaceView() {
        return (EReference)getGeneralInterface().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralPad() {
		if (generalPadEClass == null) {
			generalPadEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(62);
		}
		return generalPadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralPad_XRefPadType() {
        return (EReference)getGeneralPad().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralPad_Lib() {
        return (EAttribute)getGeneralPad().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralPad_Width() {
        return (EAttribute)getGeneralPad().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralPort() {
		if (generalPortEClass == null) {
			generalPortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(63);
		}
		return generalPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralRegister() {
		if (generalRegisterEClass == null) {
			generalRegisterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(64);
		}
		return generalRegisterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralRegister_NoShadow() {
        return (EAttribute)getGeneralRegister().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralRegister_ResetType() {
        return (EReference)getGeneralRegister().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericDecl() {
		if (genericDeclEClass == null) {
			genericDeclEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(65);
		}
		return genericDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericDeclBlock() {
		if (genericDeclBlockEClass == null) {
			genericDeclBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(66);
		}
		return genericDeclBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericDeclBlock_GenericDecl() {
        return (EReference)getGenericDeclBlock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericMap() {
		if (genericMapEClass == null) {
			genericMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(67);
		}
		return genericMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericMap_XRefGenericDecl() {
        return (EReference)getGenericMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericMap_Value() {
        return (EAttribute)getGenericMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexVarUser() {
		if (indexVarUserEClass == null) {
			indexVarUserEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(68);
		}
		return indexVarUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIndexVarUser__CreateIxVarMap() {
        return getIndexVarUser().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIndexVarUser__GetNameValue__Map() {
        return getIndexVarUser().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIndexVarUser__GetHiddenValue__Map() {
        return getIndexVarUser().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIndexVarUser__GetShortNameValue__Map() {
        return getIndexVarUser().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstance() {
		if (instanceEClass == null) {
			instanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(69);
		}
		return instanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceInterfaceMap() {
		if (instanceInterfaceMapEClass == null) {
			instanceInterfaceMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(70);
		}
		return instanceInterfaceMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceInterfaceMap_XRefInstanceInterface() {
        return (EReference)getInstanceInterfaceMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceInterfaceMap_XRefConnection() {
        return (EReference)getInstanceInterfaceMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceInterfaceMap_InstancePortMap() {
        return (EReference)getInstanceInterfaceMap().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstancePortMap() {
		if (instancePortMapEClass == null) {
			instancePortMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(71);
		}
		return instancePortMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstancePortMap_XRefInstancePort() {
        return (EReference)getInstancePortMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstancePortMap_XRefSignal() {
        return (EReference)getInstancePortMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceShellInterfaceMap() {
		if (instanceShellInterfaceMapEClass == null) {
			instanceShellInterfaceMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(72);
		}
		return instanceShellInterfaceMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceShellInterfaceMap_XRefInstanceShellInterface() {
        return (EReference)getInstanceShellInterfaceMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceShellInterfaceMap_XRefConnection() {
        return (EReference)getInstanceShellInterfaceMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceShellInterfaceMap_InstanceShellPortMap() {
        return (EReference)getInstanceShellInterfaceMap().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceShellPortMap() {
		if (instanceShellPortMapEClass == null) {
			instanceShellPortMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(73);
		}
		return instanceShellPortMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceShellPortMap_XRefInstanceShellPort() {
        return (EReference)getInstanceShellPortMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceShellPortMap_XRefSignal() {
        return (EReference)getInstanceShellPortMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerDecl() {
		if (integerDeclEClass == null) {
			integerDeclEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(74);
		}
		return integerDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerDecl_DefaultValue() {
        return (EAttribute)getIntegerDecl().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerDecl_Enumeration() {
        return (EReference)getIntegerDecl().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerDef() {
		if (integerDefEClass == null) {
			integerDefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(75);
		}
		return integerDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerDef_Value() {
        return (EAttribute)getIntegerDef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerGenDecl() {
		if (integerGenDeclEClass == null) {
			integerGenDeclEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(77);
		}
		return integerGenDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerGenDecl_DefaultValue() {
        return (EAttribute)getIntegerGenDecl().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerGenDecl_Enumeration() {
        return (EReference)getIntegerGenDecl().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		if (interfaceEClass == null) {
			interfaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(79);
		}
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_AddressUnit() {
        return (EAttribute)getInterface().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_DataUnit() {
        return (EAttribute)getInterface().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_BaseAddress() {
        return (EAttribute)getInterface().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_ExtVLNV() {
        return (EReference)getInterface().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Range() {
        return (EAttribute)getInterface().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Role() {
        return (EAttribute)getInterface().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_SystemGroup() {
        return (EAttribute)getInterface().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_AddressBlock() {
        return (EReference)getInterface().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_ExtVLNVName() {
        return (EAttribute)getInterface().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceDefCablePort() {
		if (interfaceDefCablePortEClass == null) {
			interfaceDefCablePortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(80);
		}
		return interfaceDefCablePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceDefinition() {
		if (interfaceDefinitionEClass == null) {
			interfaceDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(81);
		}
		return interfaceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDefinition_AddressUnit() {
        return (EAttribute)getInterfaceDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDefinition_DataUnit() {
        return (EAttribute)getInterfaceDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDefinition_ExtVLNV() {
        return (EReference)getInterfaceDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDefinition_InterfaceDefView() {
        return (EReference)getInterfaceDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceDefPort() {
		if (interfaceDefPortEClass == null) {
			interfaceDefPortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(82);
		}
		return interfaceDefPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDefPort_XRefSignal() {
        return (EReference)getInterfaceDefPort().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDefPort_Direction() {
        return (EAttribute)getInterfaceDefPort().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceDefRole() {
		if (interfaceDefRoleEClass == null) {
			interfaceDefRoleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(83);
		}
		return interfaceDefRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDefRole_Role() {
        return (EAttribute)getInterfaceDefRole().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDefRole_SystemGroup() {
        return (EAttribute)getInterfaceDefRole().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDefRole_InterfaceDefPort() {
        return (EReference)getInterfaceDefRole().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceDefTransactionalPort() {
		if (interfaceDefTransactionalPortEClass == null) {
			interfaceDefTransactionalPortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(86);
		}
		return interfaceDefTransactionalPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDefTransactionalPort_Initiative() {
        return (EAttribute)getInterfaceDefTransactionalPort().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceDefView() {
		if (interfaceDefViewEClass == null) {
			interfaceDefViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(87);
		}
		return interfaceDefViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDefView_InterfaceDefRole() {
        return (EReference)getInterfaceDefView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceDefWirePort() {
		if (interfaceDefWirePortEClass == null) {
			interfaceDefWirePortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(88);
		}
		return interfaceDefWirePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceInstance() {
		if (interfaceInstanceEClass == null) {
			interfaceInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(89);
		}
		return interfaceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceInstance_InstanceInterfaceMap() {
        return (EReference)getInterfaceInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfacePortMap() {
		if (interfacePortMapEClass == null) {
			interfacePortMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(90);
		}
		return interfacePortMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfacePortMap_XRefLocalPort() {
        return (EReference)getInterfacePortMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfacePortMap_XRefInterfacePort() {
        return (EReference)getInterfacePortMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceView() {
		if (interfaceViewEClass == null) {
			interfaceViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(93);
		}
		return interfaceViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceView_InterfacePortMap() {
        return (EReference)getInterfaceView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceView_Port() {
        return (EReference)getInterfaceView().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceView_UnassignedPort() {
        return (EReference)getInterfaceView().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalInterfaceMap() {
		if (localInterfaceMapEClass == null) {
			localInterfaceMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(94);
		}
		return localInterfaceMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalInterfaceMap_XRefLocalInterface() {
        return (EReference)getLocalInterfaceMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalInterfaceMap_XRefConnection() {
        return (EReference)getLocalInterfaceMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalInterfaceMap_LocalPortMap() {
        return (EReference)getLocalInterfaceMap().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalPortMap() {
		if (localPortMapEClass == null) {
			localPortMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(95);
		}
		return localPortMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalPortMap_XRefLocalPort() {
        return (EReference)getLocalPortMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalPortMap_XRefSignal() {
        return (EReference)getLocalPortMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemory() {
		if (memoryEClass == null) {
			memoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(96);
		}
		return memoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemory_AccessType() {
        return (EAttribute)getMemory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemory_Size() {
        return (EAttribute)getMemory().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemory_Endianness() {
        return (EAttribute)getMemory().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodDataType() {
		if (methodDataTypeEClass == null) {
			methodDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(99);
		}
		return methodDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodDataType_ReturnDataType() {
        return (EReference)getMethodDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodDataType_Reference() {
        return (EAttribute)getMethodDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodDataType_MethodDataTypeElement() {
        return (EReference)getMethodDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodDataType_CheckVoid() {
        return (EAttribute)getMethodDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodDataTypeElement() {
		if (methodDataTypeElementEClass == null) {
			methodDataTypeElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(100);
		}
		return methodDataTypeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodDataTypeElement_DataType() {
        return (EReference)getMethodDataTypeElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodDataTypeElement_Name() {
        return (EAttribute)getMethodDataTypeElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodDataTypeElement_Reference() {
        return (EAttribute)getMethodDataTypeElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelRoot() {
		if (modelRootEClass == null) {
			modelRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(101);
		}
		return modelRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelRoot_ConstDefBlock() {
        return (EReference)getModelRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelRoot_EssenceVersion() {
        return (EAttribute)getModelRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelRoot_GenericDeclBlock() {
        return (EReference)getModelRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelRoot_Module() {
        return (EReference)getModelRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelRoot_ParamDeclBlock() {
        return (EReference)getModelRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelRoot_VLNV() {
        return (EReference)getModelRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelRoot_ParamMap() {
        return (EAttribute)getModelRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelRoot_GenericMap() {
        return (EAttribute)getModelRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		if (moduleEClass == null) {
			moduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(102);
		}
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Module() {
        return (EReference)getModule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiPad() {
		if (multiPadEClass == null) {
			multiPadEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(103);
		}
		return multiPadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiPad_SinglePad() {
        return (EReference)getMultiPad().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiViewRegister() {
		if (multiViewRegisterEClass == null) {
			multiViewRegisterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(104);
		}
		return multiViewRegisterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiViewRegister_XRefRegisterView() {
        return (EReference)getMultiViewRegister().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiViewRegister_RegisterView() {
        return (EReference)getMultiViewRegister().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNet() {
		if (netEClass == null) {
			netEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(105);
		}
		return netEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoneInterface() {
		if (noneInterfaceEClass == null) {
			noneInterfaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(106);
		}
		return noneInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		if (packageEClass == null) {
			packageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(107);
		}
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Type() {
        return (EAttribute)getPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Pin() {
        return (EReference)getPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageInstance() {
		if (packageInstanceEClass == null) {
			packageInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(108);
		}
		return packageInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageInstance_PinNetMap() {
        return (EReference)getPackageInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPad() {
		if (padEClass == null) {
			padEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(109);
		}
		return padEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPadMultiplexed() {
		if (padMultiplexedEClass == null) {
			padMultiplexedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(110);
		}
		return padMultiplexedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPadMultiplexed_ExtVLNV() {
        return (EReference)getPadMultiplexed().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPadMultiplexed_XRefPort() {
        return (EReference)getPadMultiplexed().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPadMultiplexed_PortGroup() {
        return (EAttribute)getPadMultiplexed().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPadNetMap() {
		if (padNetMapEClass == null) {
			padNetMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(111);
		}
		return padNetMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPadNetMap_XRefPad() {
        return (EReference)getPadNetMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPadNetMap_XRefNet() {
        return (EReference)getPadNetMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPadNonMultiplexed() {
		if (padNonMultiplexedEClass == null) {
			padNonMultiplexedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(112);
		}
		return padNonMultiplexedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPadNonMultiplexed_ExtVLNV() {
        return (EReference)getPadNonMultiplexed().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPadNonMultiplexed_SiPortReq() {
        return (EReference)getPadNonMultiplexed().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPadNonMultiplexed_XRefPadType() {
        return (EReference)getPadNonMultiplexed().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPadNonMultiplexed_Function() {
        return (EReference)getPadNonMultiplexed().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPadSpecial() {
		if (padSpecialEClass == null) {
			padSpecialEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(113);
		}
		return padSpecialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPadSupply() {
		if (padSupplyEClass == null) {
			padSupplyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(114);
		}
		return padSupplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPadSupply_Spec() {
        return (EAttribute)getPadSupply().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPadSupply_XRefPowerDomain() {
        return (EReference)getPadSupply().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPadType() {
		if (padTypeEClass == null) {
			padTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(115);
		}
		return padTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPadType_Lib() {
        return (EAttribute)getPadType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPadType_Type() {
        return (EAttribute)getPadType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPadType_DriverStrength() {
        return (EAttribute)getPadType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPadType_Set() {
        return (EAttribute)getPadType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPadType_Width() {
        return (EAttribute)getPadType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPadType_Spec() {
        return (EAttribute)getPadType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPadTypeDB() {
		if (padTypeDBEClass == null) {
			padTypeDBEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(116);
		}
		return padTypeDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPadTypeDB_PadType() {
        return (EReference)getPadTypeDB().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamDecl() {
		if (paramDeclEClass == null) {
			paramDeclEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(117);
		}
		return paramDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamDeclBlock() {
		if (paramDeclBlockEClass == null) {
			paramDeclBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(118);
		}
		return paramDeclBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamDeclBlock_ParamDecl() {
        return (EReference)getParamDeclBlock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamMap() {
		if (paramMapEClass == null) {
			paramMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(119);
		}
		return paramMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamMap_XRefParamDecl() {
        return (EReference)getParamMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamMap_Value() {
        return (EAttribute)getParamMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathRef() {
		if (pathRefEClass == null) {
			pathRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(121);
		}
		return pathRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathRef_Location() {
        return (EAttribute)getPathRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathRef_Name() {
        return (EAttribute)getPathRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPin() {
		if (pinEClass == null) {
			pinEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(122);
		}
		return pinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPinNetMap() {
		if (pinNetMapEClass == null) {
			pinNetMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(123);
		}
		return pinNetMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPinNetMap_XRefPin() {
        return (EReference)getPinNetMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPinNetMap_XRefNet() {
        return (EReference)getPinNetMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		if (portEClass == null) {
			portEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(124);
		}
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortRef() {
		if (portRefEClass == null) {
			portRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(129);
		}
		return portRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortRef_XRefLocalPort() {
        return (EReference)getPortRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerDomain() {
		if (powerDomainEClass == null) {
			powerDomainEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(130);
		}
		return powerDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerDomain_PowerConsumption() {
        return (EAttribute)getPowerDomain().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerDomain_MaxCurrent() {
        return (EAttribute)getPowerDomain().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerDomain_AverageCurrent() {
        return (EAttribute)getPowerDomain().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduct() {
		if (productEClass == null) {
			productEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(131);
		}
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_Step() {
        return (EAttribute)getProduct().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_PackageInstance() {
        return (EReference)getProduct().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_SiliconInstance() {
        return (EReference)getProduct().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_Net() {
        return (EReference)getProduct().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductInstance() {
		if (productInstanceEClass == null) {
			productInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(132);
		}
		return productInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductInstance_ProductInterfaceMap() {
        return (EReference)getProductInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductInterfaceMap() {
		if (productInterfaceMapEClass == null) {
			productInterfaceMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(133);
		}
		return productInterfaceMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductInterfaceMap_XRefConnection() {
        return (EReference)getProductInterfaceMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductInterfaceMap_ProductPinMap() {
        return (EReference)getProductInterfaceMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductInterfaceMap_ProductPadMap() {
        return (EReference)getProductInterfaceMap().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductPadMap() {
		if (productPadMapEClass == null) {
			productPadMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(134);
		}
		return productPadMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductPadMap_XRefPad() {
        return (EReference)getProductPadMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductPadMap_XRefSignal() {
        return (EReference)getProductPadMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductPinMap() {
		if (productPinMapEClass == null) {
			productPinMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(135);
		}
		return productPinMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductPinMap_XRefPin() {
        return (EReference)getProductPinMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductPinMap_XRefSignal() {
        return (EReference)getProductPinMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		if (propertyEClass == null) {
			propertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(136);
		}
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Key() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Property() {
        return (EReference)getProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
        return (EAttribute)getProperty().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealPort() {
		if (realPortEClass == null) {
			realPortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(137);
		}
		return realPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealPort_Direction() {
        return (EAttribute)getRealPort().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealPort_XRefDefaultValue() {
        return (EReference)getRealPort().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecord() {
		if (recordEClass == null) {
			recordEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(138);
		}
		return recordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecord_DataTypeElement() {
        return (EReference)getRecord().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		if (referenceEClass == null) {
			referenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(139);
		}
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegister() {
		if (registerEClass == null) {
			registerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(140);
		}
		return registerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegister_MirrorSize() {
        return (EAttribute)getRegister().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegister_TopSpinType() {
        return (EAttribute)getRegister().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegister_XRefRegisterView() {
        return (EReference)getRegister().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegister_BitFieldElement() {
        return (EReference)getRegister().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegister_BitField() {
        return (EReference)getRegister().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegister_BitFieldSequence() {
        return (EReference)getRegister().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisterView() {
		if (registerViewEClass == null) {
			registerViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(141);
		}
		return registerViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterView_Depth() {
        return (EAttribute)getRegisterView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterView_DepthVar() {
        return (EAttribute)getRegisterView().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterView_BitFieldElement() {
        return (EReference)getRegisterView().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegMemElement() {
		if (regMemElementEClass == null) {
			regMemElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(142);
		}
		return regMemElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegMemElement_Offset() {
        return (EAttribute)getRegMemElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegMemElement_RelOffset() {
        return (EAttribute)getRegMemElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegMemSequence() {
		if (regMemSequenceEClass == null) {
			regMemSequenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(143);
		}
		return regMemSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegMemSequence_Count() {
        return (EAttribute)getRegMemSequence().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegMemSequence_MinIndex() {
        return (EAttribute)getRegMemSequence().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegMemSequence_IndexStep() {
        return (EAttribute)getRegMemSequence().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegMemSequence_IndexVar() {
        return (EAttribute)getRegMemSequence().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegMemSequence_AltFormat() {
        return (EAttribute)getRegMemSequence().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegMemSequence_Pilot() {
        return (EAttribute)getRegMemSequence().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegMemSequence_SequenceElement() {
        return (EReference)getRegMemSequence().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegMemSequence__GetElement() {
        return getRegMemSequence().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegMemSet() {
		if (regMemSetEClass == null) {
			regMemSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(144);
		}
		return regMemSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegMemSet_AddressUnit() {
        return (EAttribute)getRegMemSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegMemSet_DataUnit() {
        return (EAttribute)getRegMemSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegMemSet_Special() {
        return (EAttribute)getRegMemSet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegMemSet_MessageType() {
        return (EAttribute)getRegMemSet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegMemSet_OpCode() {
        return (EAttribute)getRegMemSet().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegMemSet_RegMemElement() {
        return (EReference)getRegMemSet().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegViewBlock() {
		if (regViewBlockEClass == null) {
			regViewBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(145);
		}
		return regViewBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegViewBlock_RegisterView() {
        return (EReference)getRegViewBlock().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResetType() {
		if (resetTypeEClass == null) {
			resetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(148);
		}
		return resetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResetType_ResetLevel() {
        return (EAttribute)getResetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResetType_ResetMask() {
        return (EAttribute)getResetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResetType_ResetMode() {
        return (EAttribute)getResetType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResetType_ResetType() {
        return (EAttribute)getResetType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResetType_ResetValue() {
        return (EAttribute)getResetType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnDataType() {
		if (returnDataTypeEClass == null) {
			returnDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(149);
		}
		return returnDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnElementAccess() {
		if (returnElementAccessEClass == null) {
			returnElementAccessEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(150);
		}
		return returnElementAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnElementAccess_SimpleSubElementAccess() {
        return (EReference)getReturnElementAccess().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceElement() {
		if (sequenceElementEClass == null) {
			sequenceElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(151);
		}
		return sequenceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceElement_DataWidth() {
        return (EAttribute)getSequenceElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceElement_AccessCondition() {
        return (EReference)getSequenceElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShellInterfaceMap() {
		if (shellInterfaceMapEClass == null) {
			shellInterfaceMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(152);
		}
		return shellInterfaceMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShellInterfaceMap_XRefShellInterface() {
        return (EReference)getShellInterfaceMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShellInterfaceMap_XRefConnection() {
        return (EReference)getShellInterfaceMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShellInterfaceMap_ShellPortMap() {
        return (EReference)getShellInterfaceMap().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShellPortMap() {
		if (shellPortMapEClass == null) {
			shellPortMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(153);
		}
		return shellPortMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShellPortMap_XRefShellPort() {
        return (EReference)getShellPortMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShellPortMap_XRefSignal() {
        return (EReference)getShellPortMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiComponentInstance() {
		if (siComponentInstanceEClass == null) {
			siComponentInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(154);
		}
		return siComponentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignal() {
		if (signalEClass == null) {
			signalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(155);
		}
		return signalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignal_XRefDefaultValue() {
        return (EReference)getSignal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalMap() {
		if (signalMapEClass == null) {
			signalMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(156);
		}
		return signalMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalMap_XRefLocalSignal() {
        return (EReference)getSignalMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalMap_XRefInterfaceDefSignal() {
        return (EReference)getSignalMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalOwner() {
		if (signalOwnerEClass == null) {
			signalOwnerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(157);
		}
		return signalOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalOwner_Signal() {
        return (EReference)getSignalOwner().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalOwner_SignalMap() {
        return (EReference)getSignalOwner().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiInstance() {
		if (siInstanceEClass == null) {
			siInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(160);
		}
		return siInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiInstance_SiInstanceInterfaceMap() {
        return (EReference)getSiInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiInstanceInterfaceMap() {
		if (siInstanceInterfaceMapEClass == null) {
			siInstanceInterfaceMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(161);
		}
		return siInstanceInterfaceMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiInstanceInterfaceMap_XRefInstanceInterface() {
        return (EReference)getSiInstanceInterfaceMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiInstanceInterfaceMap_SiInstancePortMap() {
        return (EReference)getSiInstanceInterfaceMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiInstancePortMap() {
		if (siInstancePortMapEClass == null) {
			siInstancePortMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(162);
		}
		return siInstancePortMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiInstancePortMap_XRefInstancePort() {
        return (EReference)getSiInstancePortMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiInstancePortMap_XRefSignal() {
        return (EReference)getSiInstancePortMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiInstanceShellInterfaceMap() {
		if (siInstanceShellInterfaceMapEClass == null) {
			siInstanceShellInterfaceMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(163);
		}
		return siInstanceShellInterfaceMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiInstanceShellInterfaceMap_XRefInstanceShellInterface() {
        return (EReference)getSiInstanceShellInterfaceMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiInstanceShellInterfaceMap_SiInstanceShellPortMap() {
        return (EReference)getSiInstanceShellInterfaceMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiInstanceShellPortMap() {
		if (siInstanceShellPortMapEClass == null) {
			siInstanceShellPortMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(164);
		}
		return siInstanceShellPortMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiInstanceShellPortMap_XRefInstanceShellPort() {
        return (EReference)getSiInstanceShellPortMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiInstanceShellPortMap_XRefSignal() {
        return (EReference)getSiInstanceShellPortMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSilicon() {
		if (siliconEClass == null) {
			siliconEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(165);
		}
		return siliconEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSilicon_Step() {
        return (EAttribute)getSilicon().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSilicon_PadHeight() {
        return (EAttribute)getSilicon().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSilicon_KerfWidth() {
        return (EAttribute)getSilicon().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSilicon_KerfHeight() {
        return (EAttribute)getSilicon().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSilicon_Instance() {
        return (EReference)getSilicon().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSilicon_Pad() {
        return (EReference)getSilicon().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSilicon_PowerDomain() {
        return (EReference)getSilicon().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiliconInstance() {
		if (siliconInstanceEClass == null) {
			siliconInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(166);
		}
		return siliconInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiliconInstance_PadNetMap() {
        return (EReference)getSiliconInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleDataType() {
		if (simpleDataTypeEClass == null) {
			simpleDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(167);
		}
		return simpleDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleSubElementAccess() {
		if (simpleSubElementAccessEClass == null) {
			simpleSubElementAccessEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(168);
		}
		return simpleSubElementAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSinglePad() {
		if (singlePadEClass == null) {
			singlePadEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(169);
		}
		return singlePadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSinglePad_XCoordinate() {
        return (EAttribute)getSinglePad().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSinglePad_YCoordinate() {
        return (EAttribute)getSinglePad().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSinglePad_Spacer() {
        return (EAttribute)getSinglePad().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSinglePad_Opening() {
        return (EAttribute)getSinglePad().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSinglePad_Location() {
        return (EAttribute)getSinglePad().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSinglePad_PadCount() {
        return (EAttribute)getSinglePad().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSinglePad_Place() {
        return (EAttribute)getSinglePad().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSinglePad_Orientation() {
        return (EAttribute)getSinglePad().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSinglePad_Power() {
        return (EAttribute)getSinglePad().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSinglePad_Ground() {
        return (EAttribute)getSinglePad().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleSourceNode() {
		if (singleSourceNodeEClass == null) {
			singleSourceNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(170);
		}
		return singleSourceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleSourceNode_Custom() {
        return (EAttribute)getSingleSourceNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleSourceNode_Hidden() {
        return (EAttribute)getSingleSourceNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleSourceNode_ID() {
        return (EAttribute)getSingleSourceNode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleSourceNode_LongDescription() {
        return (EReference)getSingleSourceNode().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleSourceNode_Name() {
        return (EAttribute)getSingleSourceNode().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleSourceNode_ShortDescription() {
        return (EAttribute)getSingleSourceNode().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleSourceNode_ShortName() {
        return (EAttribute)getSingleSourceNode().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleSourceNode_Property() {
        return (EReference)getSingleSourceNode().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleSourceNode_XRefExtension() {
        return (EReference)getSingleSourceNode().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiPort() {
		if (siPortEClass == null) {
			siPortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(171);
		}
		return siPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSiPort_Pdr() {
        return (EAttribute)getSiPort().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiPort_XRefTest() {
        return (EReference)getSiPort().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiPort_SiPortReq() {
        return (EReference)getSiPort().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiPort_Function() {
        return (EReference)getSiPort().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiPortDB() {
		if (siPortDBEClass == null) {
			siPortDBEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(172);
		}
		return siPortDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiPortDB_SiPort() {
        return (EReference)getSiPortDB().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiPortReq() {
		if (siPortReqEClass == null) {
			siPortReqEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(173);
		}
		return siPortReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSiPortReq_DriverStrength() {
        return (EAttribute)getSiPortReq().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSiPortReq_Set() {
        return (EAttribute)getSiPortReq().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSiPortReq_Type() {
        return (EAttribute)getSiPortReq().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiSignal() {
		if (siSignalEClass == null) {
			siSignalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(174);
		}
		return siSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiSignalDB() {
		if (siSignalDBEClass == null) {
			siSignalDBEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(175);
		}
		return siSignalDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiSignalDB_SiSignal() {
        return (EReference)getSiSignalDB().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiSystemInstance() {
		if (siSystemInstanceEClass == null) {
			siSystemInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(176);
		}
		return siSystemInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiSystemInstance_SiInstanceShellInterfaceMap() {
        return (EReference)getSiSystemInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringDecl() {
		if (stringDeclEClass == null) {
			stringDeclEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(179);
		}
		return stringDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringDecl_DefaultValue() {
        return (EAttribute)getStringDecl().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringDecl_Enumeration() {
        return (EReference)getStringDecl().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringDef() {
		if (stringDefEClass == null) {
			stringDefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(180);
		}
		return stringDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringDef_Value() {
        return (EAttribute)getStringDef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringGenDecl() {
		if (stringGenDeclEClass == null) {
			stringGenDeclEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(182);
		}
		return stringGenDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringGenDecl_DefaultValue() {
        return (EAttribute)getStringGenDecl().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringGenDecl_Enumeration() {
        return (EReference)getStringGenDecl().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubElementAccess() {
		if (subElementAccessEClass == null) {
			subElementAccessEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(186);
		}
		return subElementAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		if (systemEClass == null) {
			systemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(189);
		}
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_ExtVLNV() {
        return (EReference)getSystem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Interface() {
        return (EReference)getSystem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Connection() {
        return (EReference)getSystem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_LocalInterfaceMap() {
        return (EReference)getSystem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Instance() {
        return (EReference)getSystem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_ShellInterfaceMap() {
        return (EReference)getSystem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemInstance() {
		if (systemInstanceEClass == null) {
			systemInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(190);
		}
		return systemInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemInstance_InstanceShellInterfaceMap() {
        return (EReference)getSystemInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTest() {
		if (testEClass == null) {
			testEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(191);
		}
		return testEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTest_ParallelFactor() {
        return (EAttribute)getTest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_TestReq() {
        return (EReference)getTest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_Function() {
        return (EReference)getTest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestDB() {
		if (testDBEClass == null) {
			testDBEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(192);
		}
		return testDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestDB_Test() {
        return (EReference)getTestDB().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestReq() {
		if (testReqEClass == null) {
			testReqEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(193);
		}
		return testReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestReq_DriverStrength() {
        return (EAttribute)getTestReq().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransactionalPort() {
		if (transactionalPortEClass == null) {
			transactionalPortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(196);
		}
		return transactionalPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactionalPort_DataType() {
        return (EReference)getTransactionalPort().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionalPort_Initiative() {
        return (EAttribute)getTransactionalPort().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransactionalSignal() {
		if (transactionalSignalEClass == null) {
			transactionalSignalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(197);
		}
		return transactionalSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactionalSignal_DataType() {
        return (EReference)getTransactionalSignal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnion() {
		if (unionEClass == null) {
			unionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(198);
		}
		return unionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnion_DataTypeElement() {
        return (EReference)getUnion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueDataType() {
		if (valueDataTypeEClass == null) {
			valueDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(199);
		}
		return valueDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueDataType_SignInterpretation() {
        return (EAttribute)getValueDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueDataType_ObjectType() {
        return (EAttribute)getValueDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueDataType_Vector() {
        return (EReference)getValueDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarDef() {
		if (varDefEClass == null) {
			varDefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(200);
		}
		return varDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarDef_Type() {
        return (EAttribute)getVarDef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarDef_VarDefValue() {
        return (EAttribute)getVarDef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarDef_VarDefOverride() {
        return (EAttribute)getVarDef().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarDefBlock() {
		if (varDefBlockEClass == null) {
			varDefBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(201);
		}
		return varDefBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVLNV() {
		if (vlnvEClass == null) {
			vlnvEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(204);
		}
		return vlnvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVLNV_Vendor() {
        return (EAttribute)getVLNV().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVLNV_Library() {
        return (EAttribute)getVLNV().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVLNV_Name() {
        return (EAttribute)getVLNV().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVLNV_Version() {
        return (EAttribute)getVLNV().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoid() {
		if (voidEClass == null) {
			voidEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(205);
		}
		return voidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWirePort() {
		if (wirePortEClass == null) {
			wirePortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(206);
		}
		return wirePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWirePort_DataType() {
        return (EReference)getWirePort().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWireSignal() {
		if (wireSignalEClass == null) {
			wireSignalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(207);
		}
		return wireSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWireSignal_DataType() {
        return (EReference)getWireSignal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRef() {
		if (xRefEClass == null) {
			xRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(208);
		}
		return xRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXRef_XRefTargetID() {
        return (EAttribute)getXRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXRef_XRefTarget() {
        return (EReference)getXRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefConnection() {
		if (xRefConnectionEClass == null) {
			xRefConnectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(209);
		}
		return xRefConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefDataVar() {
		if (xRefDataVarEClass == null) {
			xRefDataVarEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(210);
		}
		return xRefDataVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefDirect() {
		if (xRefDirectEClass == null) {
			xRefDirectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(211);
		}
		return xRefDirectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefExternal() {
		if (xRefExternalEClass == null) {
			xRefExternalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(212);
		}
		return xRefExternalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefExternalInterface() {
		if (xRefExternalInterfaceEClass == null) {
			xRefExternalInterfaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(213);
		}
		return xRefExternalInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefExternalPort() {
		if (xRefExternalPortEClass == null) {
			xRefExternalPortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(214);
		}
		return xRefExternalPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXRefExternalPort_SubElementAccess() {
        return (EReference)getXRefExternalPort().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefExternalSignal() {
		if (xRefExternalSignalEClass == null) {
			xRefExternalSignalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(215);
		}
		return xRefExternalSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXRefExternalSignal_SubElementAccess() {
        return (EReference)getXRefExternalSignal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefGenericDecl() {
		if (xRefGenericDeclEClass == null) {
			xRefGenericDeclEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(216);
		}
		return xRefGenericDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefIFDPort() {
		if (xRefIFDPortEClass == null) {
			xRefIFDPortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(217);
		}
		return xRefIFDPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXRefIFDPort_SubElementAccess() {
        return (EReference)getXRefIFDPort().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefIndInterface() {
		if (xRefIndInterfaceEClass == null) {
			xRefIndInterfaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(218);
		}
		return xRefIndInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefIndirect() {
		if (xRefIndirectEClass == null) {
			xRefIndirectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(219);
		}
		return xRefIndirectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefIndPin() {
		if (xRefIndPinEClass == null) {
			xRefIndPinEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(220);
		}
		return xRefIndPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefIndPort() {
		if (xRefIndPortEClass == null) {
			xRefIndPortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(221);
		}
		return xRefIndPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXRefIndPort_SubElementAccess() {
        return (EReference)getXRefIndPort().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefIndSinglePad() {
		if (xRefIndSinglePadEClass == null) {
			xRefIndSinglePadEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(222);
		}
		return xRefIndSinglePadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefInstance() {
		if (xRefInstanceEClass == null) {
			xRefInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(223);
		}
		return xRefInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefInternal() {
		if (xRefInternalEClass == null) {
			xRefInternalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(224);
		}
		return xRefInternalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefInternalInterface() {
		if (xRefInternalInterfaceEClass == null) {
			xRefInternalInterfaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(225);
		}
		return xRefInternalInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefInternalPort() {
		if (xRefInternalPortEClass == null) {
			xRefInternalPortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(226);
		}
		return xRefInternalPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXRefInternalPort_SubElementAccess() {
        return (EReference)getXRefInternalPort().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefInternalSignal() {
		if (xRefInternalSignalEClass == null) {
			xRefInternalSignalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(227);
		}
		return xRefInternalSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXRefInternalSignal_SubElementAccess() {
        return (EReference)getXRefInternalSignal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefMasterInterface() {
		if (xRefMasterInterfaceEClass == null) {
			xRefMasterInterfaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(228);
		}
		return xRefMasterInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXRefMasterInterface_Range() {
        return (EAttribute)getXRefMasterInterface().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXRefMasterInterface_SrcOffset() {
        return (EAttribute)getXRefMasterInterface().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXRefMasterInterface_TgtOffset() {
        return (EAttribute)getXRefMasterInterface().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefNet() {
		if (xRefNetEClass == null) {
			xRefNetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(229);
		}
		return xRefNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefNoneInterface() {
		if (xRefNoneInterfaceEClass == null) {
			xRefNoneInterfaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(230);
		}
		return xRefNoneInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefPadType() {
		if (xRefPadTypeEClass == null) {
			xRefPadTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(231);
		}
		return xRefPadTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefParamDecl() {
		if (xRefParamDeclEClass == null) {
			xRefParamDeclEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(232);
		}
		return xRefParamDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefPin() {
		if (xRefPinEClass == null) {
			xRefPinEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(233);
		}
		return xRefPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefPowerDomain() {
		if (xRefPowerDomainEClass == null) {
			xRefPowerDomainEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(234);
		}
		return xRefPowerDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefRealPort() {
		if (xRefRealPortEClass == null) {
			xRefRealPortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(235);
		}
		return xRefRealPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXRefRealPort_SubElementAccess() {
        return (EReference)getXRefRealPort().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefRegisterView() {
		if (xRefRegisterViewEClass == null) {
			xRefRegisterViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(236);
		}
		return xRefRegisterViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefRegMemSet() {
		if (xRefRegMemSetEClass == null) {
			xRefRegMemSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(237);
		}
		return xRefRegMemSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXRefRegMemSet_Offset() {
        return (EAttribute)getXRefRegMemSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXRefRegMemSet_AccessCondition() {
        return (EReference)getXRefRegMemSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefSinglePad() {
		if (xRefSinglePadEClass == null) {
			xRefSinglePadEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(238);
		}
		return xRefSinglePadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefSiPort() {
		if (xRefSiPortEClass == null) {
			xRefSiPortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(239);
		}
		return xRefSiPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefSiSignal() {
		if (xRefSiSignalEClass == null) {
			xRefSiSignalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(240);
		}
		return xRefSiSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefSlaveInterface() {
		if (xRefSlaveInterfaceEClass == null) {
			xRefSlaveInterfaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(241);
		}
		return xRefSlaveInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXRefSlaveInterface_Range() {
        return (EAttribute)getXRefSlaveInterface().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXRefSlaveInterface_SrcOffset() {
        return (EAttribute)getXRefSlaveInterface().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXRefSlaveInterface_TgtOffset() {
        return (EAttribute)getXRefSlaveInterface().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXRefSlaveInterface_XRefInstance() {
        return (EReference)getXRefSlaveInterface().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefTest() {
		if (xRefTestEClass == null) {
			xRefTestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(242);
		}
		return xRefTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRefVLNV() {
		if (xRefVLNVEClass == null) {
			xRefVLNVEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(243);
		}
		return xRefVLNVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXRefVLNV_ExtVLNV() {
        return (EReference)getXRefVLNV().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessType() {
		if (accessTypeEEnum == null) {
			accessTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(5);
		}
		return accessTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionType() {
		if (actionTypeEEnum == null) {
			actionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(7);
		}
		return actionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBehaviorType() {
		if (behaviorTypeEEnum == null) {
			behaviorTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(12);
		}
		return behaviorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBusErrorType() {
		if (busErrorTypeEEnum == null) {
			busErrorTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(25);
		}
		return busErrorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEndianType() {
		if (endianTypeEEnum == null) {
			endianTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(46);
		}
		return endianTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFunctionType() {
		if (functionTypeEEnum == null) {
			functionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(57);
		}
		return functionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInterfaceDefRoleType() {
		if (interfaceDefRoleTypeEEnum == null) {
			interfaceDefRoleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(84);
		}
		return interfaceDefRoleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInterfaceRoleType() {
		if (interfaceRoleTypeEEnum == null) {
			interfaceRoleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(91);
		}
		return interfaceRoleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageType() {
		if (messageTypeEEnum == null) {
			messageTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(97);
		}
		return messageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPortDirection() {
		if (portDirectionEEnum == null) {
			portDirectionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(125);
		}
		return portDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPortInitiative() {
		if (portInitiativeEEnum == null) {
			portInitiativeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(127);
		}
		return portInitiativeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReservedType() {
		if (reservedTypeEEnum == null) {
			reservedTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(146);
		}
		return reservedTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSignType() {
		if (signTypeEEnum == null) {
			signTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(158);
		}
		return signTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpecialType() {
		if (specialTypeEEnum == null) {
			specialTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(177);
		}
		return specialTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStrobeType() {
		if (strobeTypeEEnum == null) {
			strobeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(184);
		}
		return strobeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSyncMode() {
		if (syncModeEEnum == null) {
			syncModeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(187);
		}
		return syncModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTopSpinType() {
		if (topSpinTypeEEnum == null) {
			topSpinTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(194);
		}
		return topSpinTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVirtualType() {
		if (virtualTypeEEnum == null) {
			virtualTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(202);
		}
		return virtualTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAccessTypeObject() {
		if (accessTypeObjectEDataType == null) {
			accessTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(6);
		}
		return accessTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getActionTypeObject() {
		if (actionTypeObjectEDataType == null) {
			actionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(8);
		}
		return actionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBehaviorTypeObject() {
		if (behaviorTypeObjectEDataType == null) {
			behaviorTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(13);
		}
		return behaviorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBooleanExpr() {
		if (booleanExprEDataType == null) {
			booleanExprEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(21);
		}
		return booleanExprEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBooleanLiteral() {
		if (booleanLiteralEDataType == null) {
			booleanLiteralEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(23);
		}
		return booleanLiteralEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBusErrorTypeObject() {
		if (busErrorTypeObjectEDataType == null) {
			busErrorTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(26);
		}
		return busErrorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCommonExpr() {
		if (commonExprEDataType == null) {
			commonExprEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(32);
		}
		return commonExprEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEndianTypeObject() {
		if (endianTypeObjectEDataType == null) {
			endianTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(47);
		}
		return endianTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFunctionTypeObject() {
		if (functionTypeObjectEDataType == null) {
			functionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(58);
		}
		return functionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntegerExpr() {
		if (integerExprEDataType == null) {
			integerExprEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(76);
		}
		return integerExprEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntegerLiteral() {
		if (integerLiteralEDataType == null) {
			integerLiteralEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(78);
		}
		return integerLiteralEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInterfaceDefRoleTypeObject() {
		if (interfaceDefRoleTypeObjectEDataType == null) {
			interfaceDefRoleTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(85);
		}
		return interfaceDefRoleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInterfaceRoleTypeObject() {
		if (interfaceRoleTypeObjectEDataType == null) {
			interfaceRoleTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(92);
		}
		return interfaceRoleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMessageTypeObject() {
		if (messageTypeObjectEDataType == null) {
			messageTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(98);
		}
		return messageTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPathExpr() {
		if (pathExprEDataType == null) {
			pathExprEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(120);
		}
		return pathExprEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPortDirectionObject() {
		if (portDirectionObjectEDataType == null) {
			portDirectionObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(126);
		}
		return portDirectionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPortInitiativeObject() {
		if (portInitiativeObjectEDataType == null) {
			portInitiativeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(128);
		}
		return portInitiativeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getReservedTypeObject() {
		if (reservedTypeObjectEDataType == null) {
			reservedTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(147);
		}
		return reservedTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSignTypeObject() {
		if (signTypeObjectEDataType == null) {
			signTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(159);
		}
		return signTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSpecialTypeObject() {
		if (specialTypeObjectEDataType == null) {
			specialTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(178);
		}
		return specialTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStringExpr() {
		if (stringExprEDataType == null) {
			stringExprEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(181);
		}
		return stringExprEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStringLiteral() {
		if (stringLiteralEDataType == null) {
			stringLiteralEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(183);
		}
		return stringLiteralEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStrobeTypeObject() {
		if (strobeTypeObjectEDataType == null) {
			strobeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(185);
		}
		return strobeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSyncModeObject() {
		if (syncModeObjectEDataType == null) {
			syncModeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(188);
		}
		return syncModeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTopSpinTypeObject() {
		if (topSpinTypeObjectEDataType == null) {
			topSpinTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(195);
		}
		return topSpinTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVirtualTypeObject() {
		if (virtualTypeObjectEDataType == null) {
			virtualTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI).getEClassifiers().get(203);
		}
		return virtualTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("model." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //ModelPackageImpl
