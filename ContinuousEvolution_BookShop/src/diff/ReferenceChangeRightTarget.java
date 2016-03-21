/**
 */
package diff;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Change Right Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diff.ReferenceChangeRightTarget#getRightAddedTarget <em>Right Added Target</em>}</li>
 *   <li>{@link diff.ReferenceChangeRightTarget#getLeftAddedTarget <em>Left Added Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see diff.DiffPackage#getReferenceChangeRightTarget()
 * @model
 * @generated
 */
public interface ReferenceChangeRightTarget extends ReferenceChange {
	/**
	 * Returns the value of the '<em><b>Right Added Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Added Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Added Target</em>' reference.
	 * @see #setRightAddedTarget(EObject)
	 * @see diff.DiffPackage#getReferenceChangeRightTarget_RightAddedTarget()
	 * @model
	 * @generated
	 */
	EObject getRightAddedTarget();

	/**
	 * Sets the value of the '{@link diff.ReferenceChangeRightTarget#getRightAddedTarget <em>Right Added Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Added Target</em>' reference.
	 * @see #getRightAddedTarget()
	 * @generated
	 */
	void setRightAddedTarget(EObject value);

	/**
	 * Returns the value of the '<em><b>Left Added Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Added Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Added Target</em>' reference.
	 * @see #setLeftAddedTarget(EObject)
	 * @see diff.DiffPackage#getReferenceChangeRightTarget_LeftAddedTarget()
	 * @model
	 * @generated
	 */
	EObject getLeftAddedTarget();

	/**
	 * Sets the value of the '{@link diff.ReferenceChangeRightTarget#getLeftAddedTarget <em>Left Added Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Added Target</em>' reference.
	 * @see #getLeftAddedTarget()
	 * @generated
	 */
	void setLeftAddedTarget(EObject value);

} // ReferenceChangeRightTarget
