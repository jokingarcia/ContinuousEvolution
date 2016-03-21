/**
 */
package diff;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Change Left Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diff.ReferenceChangeLeftTarget#getLeftRemovedTarget <em>Left Removed Target</em>}</li>
 *   <li>{@link diff.ReferenceChangeLeftTarget#getRightRemovedTarget <em>Right Removed Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see diff.DiffPackage#getReferenceChangeLeftTarget()
 * @model
 * @generated
 */
public interface ReferenceChangeLeftTarget extends ReferenceChange {
	/**
	 * Returns the value of the '<em><b>Left Removed Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Removed Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Removed Target</em>' reference.
	 * @see #setLeftRemovedTarget(EObject)
	 * @see diff.DiffPackage#getReferenceChangeLeftTarget_LeftRemovedTarget()
	 * @model
	 * @generated
	 */
	EObject getLeftRemovedTarget();

	/**
	 * Sets the value of the '{@link diff.ReferenceChangeLeftTarget#getLeftRemovedTarget <em>Left Removed Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Removed Target</em>' reference.
	 * @see #getLeftRemovedTarget()
	 * @generated
	 */
	void setLeftRemovedTarget(EObject value);

	/**
	 * Returns the value of the '<em><b>Right Removed Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Removed Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Removed Target</em>' reference.
	 * @see #setRightRemovedTarget(EObject)
	 * @see diff.DiffPackage#getReferenceChangeLeftTarget_RightRemovedTarget()
	 * @model
	 * @generated
	 */
	EObject getRightRemovedTarget();

	/**
	 * Sets the value of the '{@link diff.ReferenceChangeLeftTarget#getRightRemovedTarget <em>Right Removed Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Removed Target</em>' reference.
	 * @see #getRightRemovedTarget()
	 * @generated
	 */
	void setRightRemovedTarget(EObject value);

} // ReferenceChangeLeftTarget
