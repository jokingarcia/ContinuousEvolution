/**
 */
package diff.impl;

import diff.DiffPackage;
import diff.UpdateUniqueReferenceValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Unique Reference Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link diff.impl.UpdateUniqueReferenceValueImpl#getLeftTarget <em>Left Target</em>}</li>
 *   <li>{@link diff.impl.UpdateUniqueReferenceValueImpl#getRightTarget <em>Right Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UpdateUniqueReferenceValueImpl extends UpdateReferenceImpl implements UpdateUniqueReferenceValue {
	/**
	 * The cached value of the '{@link #getLeftTarget() <em>Left Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftTarget()
	 * @generated
	 * @ordered
	 */
	protected EObject leftTarget;

	/**
	 * The cached value of the '{@link #getRightTarget() <em>Right Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightTarget()
	 * @generated
	 * @ordered
	 */
	protected EObject rightTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateUniqueReferenceValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiffPackage.Literals.UPDATE_UNIQUE_REFERENCE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getLeftTarget() {
		if (leftTarget != null && leftTarget.eIsProxy()) {
			InternalEObject oldLeftTarget = (InternalEObject)leftTarget;
			leftTarget = eResolveProxy(oldLeftTarget);
			if (leftTarget != oldLeftTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiffPackage.UPDATE_UNIQUE_REFERENCE_VALUE__LEFT_TARGET, oldLeftTarget, leftTarget));
			}
		}
		return leftTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetLeftTarget() {
		return leftTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftTarget(EObject newLeftTarget) {
		EObject oldLeftTarget = leftTarget;
		leftTarget = newLeftTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffPackage.UPDATE_UNIQUE_REFERENCE_VALUE__LEFT_TARGET, oldLeftTarget, leftTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRightTarget() {
		if (rightTarget != null && rightTarget.eIsProxy()) {
			InternalEObject oldRightTarget = (InternalEObject)rightTarget;
			rightTarget = eResolveProxy(oldRightTarget);
			if (rightTarget != oldRightTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiffPackage.UPDATE_UNIQUE_REFERENCE_VALUE__RIGHT_TARGET, oldRightTarget, rightTarget));
			}
		}
		return rightTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRightTarget() {
		return rightTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightTarget(EObject newRightTarget) {
		EObject oldRightTarget = rightTarget;
		rightTarget = newRightTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffPackage.UPDATE_UNIQUE_REFERENCE_VALUE__RIGHT_TARGET, oldRightTarget, rightTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiffPackage.UPDATE_UNIQUE_REFERENCE_VALUE__LEFT_TARGET:
				if (resolve) return getLeftTarget();
				return basicGetLeftTarget();
			case DiffPackage.UPDATE_UNIQUE_REFERENCE_VALUE__RIGHT_TARGET:
				if (resolve) return getRightTarget();
				return basicGetRightTarget();
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
			case DiffPackage.UPDATE_UNIQUE_REFERENCE_VALUE__LEFT_TARGET:
				setLeftTarget((EObject)newValue);
				return;
			case DiffPackage.UPDATE_UNIQUE_REFERENCE_VALUE__RIGHT_TARGET:
				setRightTarget((EObject)newValue);
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
			case DiffPackage.UPDATE_UNIQUE_REFERENCE_VALUE__LEFT_TARGET:
				setLeftTarget((EObject)null);
				return;
			case DiffPackage.UPDATE_UNIQUE_REFERENCE_VALUE__RIGHT_TARGET:
				setRightTarget((EObject)null);
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
			case DiffPackage.UPDATE_UNIQUE_REFERENCE_VALUE__LEFT_TARGET:
				return leftTarget != null;
			case DiffPackage.UPDATE_UNIQUE_REFERENCE_VALUE__RIGHT_TARGET:
				return rightTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //UpdateUniqueReferenceValueImpl
