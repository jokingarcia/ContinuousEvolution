/**
 */
package diff;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conflicting Diff Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diff.ConflictingDiffElement#getLeftParent <em>Left Parent</em>}</li>
 *   <li>{@link diff.ConflictingDiffElement#getRightParent <em>Right Parent</em>}</li>
 *   <li>{@link diff.ConflictingDiffElement#getOriginElement <em>Origin Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see diff.DiffPackage#getConflictingDiffElement()
 * @model
 * @generated
 */
public interface ConflictingDiffElement extends DiffElement {
	/**
	 * Returns the value of the '<em><b>Left Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Parent</em>' reference.
	 * @see #setLeftParent(EObject)
	 * @see diff.DiffPackage#getConflictingDiffElement_LeftParent()
	 * @model
	 * @generated
	 */
	EObject getLeftParent();

	/**
	 * Sets the value of the '{@link diff.ConflictingDiffElement#getLeftParent <em>Left Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Parent</em>' reference.
	 * @see #getLeftParent()
	 * @generated
	 */
	void setLeftParent(EObject value);

	/**
	 * Returns the value of the '<em><b>Right Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Parent</em>' reference.
	 * @see #setRightParent(EObject)
	 * @see diff.DiffPackage#getConflictingDiffElement_RightParent()
	 * @model
	 * @generated
	 */
	EObject getRightParent();

	/**
	 * Sets the value of the '{@link diff.ConflictingDiffElement#getRightParent <em>Right Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Parent</em>' reference.
	 * @see #getRightParent()
	 * @generated
	 */
	void setRightParent(EObject value);

	/**
	 * Returns the value of the '<em><b>Origin Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Element</em>' reference.
	 * @see #setOriginElement(EObject)
	 * @see diff.DiffPackage#getConflictingDiffElement_OriginElement()
	 * @model
	 * @generated
	 */
	EObject getOriginElement();

	/**
	 * Sets the value of the '{@link diff.ConflictingDiffElement#getOriginElement <em>Origin Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Element</em>' reference.
	 * @see #getOriginElement()
	 * @generated
	 */
	void setOriginElement(EObject value);

} // ConflictingDiffElement
