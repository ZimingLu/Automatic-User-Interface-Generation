/**
 */
package model.impl;

import java.util.Collection;

import model.Function;
import model.ModelPackage;
import model.Test;
import model.TestReq;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.TestImpl#getParallelFactor <em>Parallel Factor</em>}</li>
 *   <li>{@link model.impl.TestImpl#getTestReq <em>Test Req</em>}</li>
 *   <li>{@link model.impl.TestImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestImpl extends SingleSourceNodeImpl implements Test {
	/**
	 * The default value of the '{@link #getParallelFactor() <em>Parallel Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelFactor()
	 * @generated
	 * @ordered
	 */
	protected static final String PARALLEL_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParallelFactor() <em>Parallel Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelFactor()
	 * @generated
	 * @ordered
	 */
	protected String parallelFactor = PARALLEL_FACTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestReq() <em>Test Req</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestReq()
	 * @generated
	 * @ordered
	 */
	protected TestReq testReq;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> function;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.eINSTANCE.getTest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParallelFactor() {
		return parallelFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallelFactor(String newParallelFactor) {
		String oldParallelFactor = parallelFactor;
		parallelFactor = newParallelFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TEST__PARALLEL_FACTOR, oldParallelFactor, parallelFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestReq getTestReq() {
		return testReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestReq(TestReq newTestReq, NotificationChain msgs) {
		TestReq oldTestReq = testReq;
		testReq = newTestReq;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.TEST__TEST_REQ, oldTestReq, newTestReq);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestReq(TestReq newTestReq) {
		if (newTestReq != testReq) {
			NotificationChain msgs = null;
			if (testReq != null)
				msgs = ((InternalEObject)testReq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TEST__TEST_REQ, null, msgs);
			if (newTestReq != null)
				msgs = ((InternalEObject)newTestReq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TEST__TEST_REQ, null, msgs);
			msgs = basicSetTestReq(newTestReq, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TEST__TEST_REQ, newTestReq, newTestReq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getFunction() {
		if (function == null) {
			function = new EObjectContainmentEList<Function>(Function.class, this, ModelPackage.TEST__FUNCTION);
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.TEST__TEST_REQ:
				return basicSetTestReq(null, msgs);
			case ModelPackage.TEST__FUNCTION:
				return ((InternalEList<?>)getFunction()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.TEST__PARALLEL_FACTOR:
				return getParallelFactor();
			case ModelPackage.TEST__TEST_REQ:
				return getTestReq();
			case ModelPackage.TEST__FUNCTION:
				return getFunction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.TEST__PARALLEL_FACTOR:
				setParallelFactor((String)newValue);
				return;
			case ModelPackage.TEST__TEST_REQ:
				setTestReq((TestReq)newValue);
				return;
			case ModelPackage.TEST__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends Function>)newValue);
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
			case ModelPackage.TEST__PARALLEL_FACTOR:
				setParallelFactor(PARALLEL_FACTOR_EDEFAULT);
				return;
			case ModelPackage.TEST__TEST_REQ:
				setTestReq((TestReq)null);
				return;
			case ModelPackage.TEST__FUNCTION:
				getFunction().clear();
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
			case ModelPackage.TEST__PARALLEL_FACTOR:
				return PARALLEL_FACTOR_EDEFAULT == null ? parallelFactor != null : !PARALLEL_FACTOR_EDEFAULT.equals(parallelFactor);
			case ModelPackage.TEST__TEST_REQ:
				return testReq != null;
			case ModelPackage.TEST__FUNCTION:
				return function != null && !function.isEmpty();
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
		result.append(" (parallelFactor: ");
		result.append(parallelFactor);
		result.append(')');
		return result.toString();
	}

} //TestImpl
