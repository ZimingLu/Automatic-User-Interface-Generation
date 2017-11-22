/**
 */
package Essence.impl;

import Essence.Bus;
import Essence.Component;
import Essence.DocumentRoot;
import Essence.EssencePackage;
import Essence.InterfaceDefinition;
import Essence.PadTypeDB;
import Essence.Product;
import Essence.SiPortDB;
import Essence.SiSignalDB;
import Essence.Silicon;
import Essence.TestDB;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Essence.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link Essence.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link Essence.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link Essence.impl.DocumentRootImpl#getBus <em>Bus</em>}</li>
 *   <li>{@link Essence.impl.DocumentRootImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link Essence.impl.DocumentRootImpl#getInterfaceDefinition <em>Interface Definition</em>}</li>
 *   <li>{@link Essence.impl.DocumentRootImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link Essence.impl.DocumentRootImpl#getPadTypeDB <em>Pad Type DB</em>}</li>
 *   <li>{@link Essence.impl.DocumentRootImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link Essence.impl.DocumentRootImpl#getSilicon <em>Silicon</em>}</li>
 *   <li>{@link Essence.impl.DocumentRootImpl#getSiPortDB <em>Si Port DB</em>}</li>
 *   <li>{@link Essence.impl.DocumentRootImpl#getSiSignalDB <em>Si Signal DB</em>}</li>
 *   <li>{@link Essence.impl.DocumentRootImpl#getSystem <em>System</em>}</li>
 *   <li>{@link Essence.impl.DocumentRootImpl#getTestDB <em>Test DB</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssencePackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, EssencePackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, EssencePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, EssencePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus getBus() {
		return (Bus)getMixed().get(EssencePackage.eINSTANCE.getDocumentRoot_Bus(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBus(Bus newBus, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EssencePackage.eINSTANCE.getDocumentRoot_Bus(), newBus, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBus(Bus newBus) {
		((FeatureMap.Internal)getMixed()).set(EssencePackage.eINSTANCE.getDocumentRoot_Bus(), newBus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		return (Component)getMixed().get(EssencePackage.eINSTANCE.getDocumentRoot_Component(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(Component newComponent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EssencePackage.eINSTANCE.getDocumentRoot_Component(), newComponent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		((FeatureMap.Internal)getMixed()).set(EssencePackage.eINSTANCE.getDocumentRoot_Component(), newComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDefinition getInterfaceDefinition() {
		return (InterfaceDefinition)getMixed().get(EssencePackage.eINSTANCE.getDocumentRoot_InterfaceDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaceDefinition(InterfaceDefinition newInterfaceDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EssencePackage.eINSTANCE.getDocumentRoot_InterfaceDefinition(), newInterfaceDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceDefinition(InterfaceDefinition newInterfaceDefinition) {
		((FeatureMap.Internal)getMixed()).set(EssencePackage.eINSTANCE.getDocumentRoot_InterfaceDefinition(), newInterfaceDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Essence.Package getPackage() {
		return (Essence.Package)getMixed().get(EssencePackage.eINSTANCE.getDocumentRoot_Package(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(Essence.Package newPackage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EssencePackage.eINSTANCE.getDocumentRoot_Package(), newPackage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(Essence.Package newPackage) {
		((FeatureMap.Internal)getMixed()).set(EssencePackage.eINSTANCE.getDocumentRoot_Package(), newPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PadTypeDB getPadTypeDB() {
		return (PadTypeDB)getMixed().get(EssencePackage.eINSTANCE.getDocumentRoot_PadTypeDB(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPadTypeDB(PadTypeDB newPadTypeDB, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EssencePackage.eINSTANCE.getDocumentRoot_PadTypeDB(), newPadTypeDB, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPadTypeDB(PadTypeDB newPadTypeDB) {
		((FeatureMap.Internal)getMixed()).set(EssencePackage.eINSTANCE.getDocumentRoot_PadTypeDB(), newPadTypeDB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product getProduct() {
		return (Product)getMixed().get(EssencePackage.eINSTANCE.getDocumentRoot_Product(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(Product newProduct, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EssencePackage.eINSTANCE.getDocumentRoot_Product(), newProduct, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(Product newProduct) {
		((FeatureMap.Internal)getMixed()).set(EssencePackage.eINSTANCE.getDocumentRoot_Product(), newProduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Silicon getSilicon() {
		return (Silicon)getMixed().get(EssencePackage.eINSTANCE.getDocumentRoot_Silicon(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSilicon(Silicon newSilicon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EssencePackage.eINSTANCE.getDocumentRoot_Silicon(), newSilicon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSilicon(Silicon newSilicon) {
		((FeatureMap.Internal)getMixed()).set(EssencePackage.eINSTANCE.getDocumentRoot_Silicon(), newSilicon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiPortDB getSiPortDB() {
		return (SiPortDB)getMixed().get(EssencePackage.eINSTANCE.getDocumentRoot_SiPortDB(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSiPortDB(SiPortDB newSiPortDB, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EssencePackage.eINSTANCE.getDocumentRoot_SiPortDB(), newSiPortDB, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiPortDB(SiPortDB newSiPortDB) {
		((FeatureMap.Internal)getMixed()).set(EssencePackage.eINSTANCE.getDocumentRoot_SiPortDB(), newSiPortDB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiSignalDB getSiSignalDB() {
		return (SiSignalDB)getMixed().get(EssencePackage.eINSTANCE.getDocumentRoot_SiSignalDB(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSiSignalDB(SiSignalDB newSiSignalDB, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EssencePackage.eINSTANCE.getDocumentRoot_SiSignalDB(), newSiSignalDB, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSiSignalDB(SiSignalDB newSiSignalDB) {
		((FeatureMap.Internal)getMixed()).set(EssencePackage.eINSTANCE.getDocumentRoot_SiSignalDB(), newSiSignalDB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Essence.System getSystem() {
		return (Essence.System)getMixed().get(EssencePackage.eINSTANCE.getDocumentRoot_System(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(Essence.System newSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EssencePackage.eINSTANCE.getDocumentRoot_System(), newSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(Essence.System newSystem) {
		((FeatureMap.Internal)getMixed()).set(EssencePackage.eINSTANCE.getDocumentRoot_System(), newSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestDB getTestDB() {
		return (TestDB)getMixed().get(EssencePackage.eINSTANCE.getDocumentRoot_TestDB(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestDB(TestDB newTestDB, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EssencePackage.eINSTANCE.getDocumentRoot_TestDB(), newTestDB, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestDB(TestDB newTestDB) {
		((FeatureMap.Internal)getMixed()).set(EssencePackage.eINSTANCE.getDocumentRoot_TestDB(), newTestDB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssencePackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case EssencePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case EssencePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case EssencePackage.DOCUMENT_ROOT__BUS:
				return basicSetBus(null, msgs);
			case EssencePackage.DOCUMENT_ROOT__COMPONENT:
				return basicSetComponent(null, msgs);
			case EssencePackage.DOCUMENT_ROOT__INTERFACE_DEFINITION:
				return basicSetInterfaceDefinition(null, msgs);
			case EssencePackage.DOCUMENT_ROOT__PACKAGE:
				return basicSetPackage(null, msgs);
			case EssencePackage.DOCUMENT_ROOT__PAD_TYPE_DB:
				return basicSetPadTypeDB(null, msgs);
			case EssencePackage.DOCUMENT_ROOT__PRODUCT:
				return basicSetProduct(null, msgs);
			case EssencePackage.DOCUMENT_ROOT__SILICON:
				return basicSetSilicon(null, msgs);
			case EssencePackage.DOCUMENT_ROOT__SI_PORT_DB:
				return basicSetSiPortDB(null, msgs);
			case EssencePackage.DOCUMENT_ROOT__SI_SIGNAL_DB:
				return basicSetSiSignalDB(null, msgs);
			case EssencePackage.DOCUMENT_ROOT__SYSTEM:
				return basicSetSystem(null, msgs);
			case EssencePackage.DOCUMENT_ROOT__TEST_DB:
				return basicSetTestDB(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EssencePackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case EssencePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case EssencePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case EssencePackage.DOCUMENT_ROOT__BUS:
				return getBus();
			case EssencePackage.DOCUMENT_ROOT__COMPONENT:
				return getComponent();
			case EssencePackage.DOCUMENT_ROOT__INTERFACE_DEFINITION:
				return getInterfaceDefinition();
			case EssencePackage.DOCUMENT_ROOT__PACKAGE:
				return getPackage();
			case EssencePackage.DOCUMENT_ROOT__PAD_TYPE_DB:
				return getPadTypeDB();
			case EssencePackage.DOCUMENT_ROOT__PRODUCT:
				return getProduct();
			case EssencePackage.DOCUMENT_ROOT__SILICON:
				return getSilicon();
			case EssencePackage.DOCUMENT_ROOT__SI_PORT_DB:
				return getSiPortDB();
			case EssencePackage.DOCUMENT_ROOT__SI_SIGNAL_DB:
				return getSiSignalDB();
			case EssencePackage.DOCUMENT_ROOT__SYSTEM:
				return getSystem();
			case EssencePackage.DOCUMENT_ROOT__TEST_DB:
				return getTestDB();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EssencePackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case EssencePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case EssencePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case EssencePackage.DOCUMENT_ROOT__BUS:
				setBus((Bus)newValue);
				return;
			case EssencePackage.DOCUMENT_ROOT__COMPONENT:
				setComponent((Component)newValue);
				return;
			case EssencePackage.DOCUMENT_ROOT__INTERFACE_DEFINITION:
				setInterfaceDefinition((InterfaceDefinition)newValue);
				return;
			case EssencePackage.DOCUMENT_ROOT__PACKAGE:
				setPackage((Essence.Package)newValue);
				return;
			case EssencePackage.DOCUMENT_ROOT__PAD_TYPE_DB:
				setPadTypeDB((PadTypeDB)newValue);
				return;
			case EssencePackage.DOCUMENT_ROOT__PRODUCT:
				setProduct((Product)newValue);
				return;
			case EssencePackage.DOCUMENT_ROOT__SILICON:
				setSilicon((Silicon)newValue);
				return;
			case EssencePackage.DOCUMENT_ROOT__SI_PORT_DB:
				setSiPortDB((SiPortDB)newValue);
				return;
			case EssencePackage.DOCUMENT_ROOT__SI_SIGNAL_DB:
				setSiSignalDB((SiSignalDB)newValue);
				return;
			case EssencePackage.DOCUMENT_ROOT__SYSTEM:
				setSystem((Essence.System)newValue);
				return;
			case EssencePackage.DOCUMENT_ROOT__TEST_DB:
				setTestDB((TestDB)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EssencePackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case EssencePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case EssencePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case EssencePackage.DOCUMENT_ROOT__BUS:
				setBus((Bus)null);
				return;
			case EssencePackage.DOCUMENT_ROOT__COMPONENT:
				setComponent((Component)null);
				return;
			case EssencePackage.DOCUMENT_ROOT__INTERFACE_DEFINITION:
				setInterfaceDefinition((InterfaceDefinition)null);
				return;
			case EssencePackage.DOCUMENT_ROOT__PACKAGE:
				setPackage((Essence.Package)null);
				return;
			case EssencePackage.DOCUMENT_ROOT__PAD_TYPE_DB:
				setPadTypeDB((PadTypeDB)null);
				return;
			case EssencePackage.DOCUMENT_ROOT__PRODUCT:
				setProduct((Product)null);
				return;
			case EssencePackage.DOCUMENT_ROOT__SILICON:
				setSilicon((Silicon)null);
				return;
			case EssencePackage.DOCUMENT_ROOT__SI_PORT_DB:
				setSiPortDB((SiPortDB)null);
				return;
			case EssencePackage.DOCUMENT_ROOT__SI_SIGNAL_DB:
				setSiSignalDB((SiSignalDB)null);
				return;
			case EssencePackage.DOCUMENT_ROOT__SYSTEM:
				setSystem((Essence.System)null);
				return;
			case EssencePackage.DOCUMENT_ROOT__TEST_DB:
				setTestDB((TestDB)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EssencePackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case EssencePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case EssencePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case EssencePackage.DOCUMENT_ROOT__BUS:
				return getBus() != null;
			case EssencePackage.DOCUMENT_ROOT__COMPONENT:
				return getComponent() != null;
			case EssencePackage.DOCUMENT_ROOT__INTERFACE_DEFINITION:
				return getInterfaceDefinition() != null;
			case EssencePackage.DOCUMENT_ROOT__PACKAGE:
				return getPackage() != null;
			case EssencePackage.DOCUMENT_ROOT__PAD_TYPE_DB:
				return getPadTypeDB() != null;
			case EssencePackage.DOCUMENT_ROOT__PRODUCT:
				return getProduct() != null;
			case EssencePackage.DOCUMENT_ROOT__SILICON:
				return getSilicon() != null;
			case EssencePackage.DOCUMENT_ROOT__SI_PORT_DB:
				return getSiPortDB() != null;
			case EssencePackage.DOCUMENT_ROOT__SI_SIGNAL_DB:
				return getSiSignalDB() != null;
			case EssencePackage.DOCUMENT_ROOT__SYSTEM:
				return getSystem() != null;
			case EssencePackage.DOCUMENT_ROOT__TEST_DB:
				return getTestDB() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
