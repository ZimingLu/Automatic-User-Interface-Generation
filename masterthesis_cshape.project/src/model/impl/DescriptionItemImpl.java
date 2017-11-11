/**
 */
package model.impl;

import model.DescriptionItem;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.DescriptionItemImpl#getHtml <em>Html</em>}</li>
 *   <li>{@link model.impl.DescriptionItemImpl#getDita <em>Dita</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescriptionItemImpl extends EssenceBaseImpl implements DescriptionItem {
	/**
	 * The default value of the '{@link #getHtml() <em>Html</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtml()
	 * @generated
	 * @ordered
	 */
	protected static final String HTML_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHtml() <em>Html</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtml()
	 * @generated
	 * @ordered
	 */
	protected String html = HTML_EDEFAULT;

	/**
	 * The default value of the '{@link #getDita() <em>Dita</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDita()
	 * @generated
	 * @ordered
	 */
	protected static final String DITA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDita() <em>Dita</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDita()
	 * @generated
	 * @ordered
	 */
	protected String dita = DITA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptionItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getDescriptionItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHtml() {
		return html;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHtml(String newHtml) {
		String oldHtml = html;
		html = newHtml;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DESCRIPTION_ITEM__HTML, oldHtml, html));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDita() {
		return dita;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDita(String newDita) {
		String oldDita = dita;
		dita = newDita;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DESCRIPTION_ITEM__DITA, oldDita, dita));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.DESCRIPTION_ITEM__HTML:
				return getHtml();
			case ModelPackage.DESCRIPTION_ITEM__DITA:
				return getDita();
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
			case ModelPackage.DESCRIPTION_ITEM__HTML:
				setHtml((String)newValue);
				return;
			case ModelPackage.DESCRIPTION_ITEM__DITA:
				setDita((String)newValue);
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
			case ModelPackage.DESCRIPTION_ITEM__HTML:
				setHtml(HTML_EDEFAULT);
				return;
			case ModelPackage.DESCRIPTION_ITEM__DITA:
				setDita(DITA_EDEFAULT);
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
			case ModelPackage.DESCRIPTION_ITEM__HTML:
				return HTML_EDEFAULT == null ? html != null : !HTML_EDEFAULT.equals(html);
			case ModelPackage.DESCRIPTION_ITEM__DITA:
				return DITA_EDEFAULT == null ? dita != null : !DITA_EDEFAULT.equals(dita);
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
		result.append(" (html: ");
		result.append(html);
		result.append(", dita: ");
		result.append(dita);
		result.append(')');
		return result.toString();
	}

} //DescriptionItemImpl
