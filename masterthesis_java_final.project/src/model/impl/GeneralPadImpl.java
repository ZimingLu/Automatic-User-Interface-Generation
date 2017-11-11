/**
 */
package model.impl;

import model.GeneralPad;
import model.ModelPackage;
import model.XRefPadType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Pad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.GeneralPadImpl#getXRefPadType <em>XRef Pad Type</em>}</li>
 *   <li>{@link model.impl.GeneralPadImpl#getLib <em>Lib</em>}</li>
 *   <li>{@link model.impl.GeneralPadImpl#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeneralPadImpl extends SinglePadImpl implements GeneralPad {
	/**
	 * The cached value of the '{@link #getXRefPadType() <em>XRef Pad Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRefPadType()
	 * @generated
	 * @ordered
	 */
	protected XRefPadType xRefPadType;

	/**
	 * The default value of the '{@link #getLib() <em>Lib</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLib()
	 * @generated
	 * @ordered
	 */
	protected static final String LIB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLib() <em>Lib</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLib()
	 * @generated
	 * @ordered
	 */
	protected String lib = LIB_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralPadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getGeneralPad();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRefPadType getXRefPadType() {
		return xRefPadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXRefPadType(XRefPadType newXRefPadType, NotificationChain msgs) {
		XRefPadType oldXRefPadType = xRefPadType;
		xRefPadType = newXRefPadType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.GENERAL_PAD__XREF_PAD_TYPE, oldXRefPadType, newXRefPadType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRefPadType(XRefPadType newXRefPadType) {
		if (newXRefPadType != xRefPadType) {
			NotificationChain msgs = null;
			if (xRefPadType != null)
				msgs = ((InternalEObject)xRefPadType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.GENERAL_PAD__XREF_PAD_TYPE, null, msgs);
			if (newXRefPadType != null)
				msgs = ((InternalEObject)newXRefPadType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.GENERAL_PAD__XREF_PAD_TYPE, null, msgs);
			msgs = basicSetXRefPadType(newXRefPadType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GENERAL_PAD__XREF_PAD_TYPE, newXRefPadType, newXRefPadType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLib() {
		return lib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLib(String newLib) {
		String oldLib = lib;
		lib = newLib;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GENERAL_PAD__LIB, oldLib, lib));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GENERAL_PAD__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.GENERAL_PAD__XREF_PAD_TYPE:
				return basicSetXRefPadType(null, msgs);
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
			case ModelPackage.GENERAL_PAD__XREF_PAD_TYPE:
				return getXRefPadType();
			case ModelPackage.GENERAL_PAD__LIB:
				return getLib();
			case ModelPackage.GENERAL_PAD__WIDTH:
				return getWidth();
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
			case ModelPackage.GENERAL_PAD__XREF_PAD_TYPE:
				setXRefPadType((XRefPadType)newValue);
				return;
			case ModelPackage.GENERAL_PAD__LIB:
				setLib((String)newValue);
				return;
			case ModelPackage.GENERAL_PAD__WIDTH:
				setWidth((String)newValue);
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
			case ModelPackage.GENERAL_PAD__XREF_PAD_TYPE:
				setXRefPadType((XRefPadType)null);
				return;
			case ModelPackage.GENERAL_PAD__LIB:
				setLib(LIB_EDEFAULT);
				return;
			case ModelPackage.GENERAL_PAD__WIDTH:
				setWidth(WIDTH_EDEFAULT);
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
			case ModelPackage.GENERAL_PAD__XREF_PAD_TYPE:
				return xRefPadType != null;
			case ModelPackage.GENERAL_PAD__LIB:
				return LIB_EDEFAULT == null ? lib != null : !LIB_EDEFAULT.equals(lib);
			case ModelPackage.GENERAL_PAD__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
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
		result.append(" (lib: ");
		result.append(lib);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //GeneralPadImpl
