/**
 */
package diff;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diff.ReferenceChange#getReference <em>Reference</em>}</li>
 *   <li>{@link diff.ReferenceChange#getRightElement <em>Right Element</em>}</li>
 *   <li>{@link diff.ReferenceChange#getLeftElement <em>Left Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see diff.DiffPackage#getReferenceChange()
 * @model
 * @generated
 */
public interface ReferenceChange extends DiffElement {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(EReference)
	 * @see diff.DiffPackage#getReferenceChange_Reference()
	 * @model
	 * @generated
	 */
	EReference getReference();

	/**
	 * Sets the value of the '{@link diff.ReferenceChange#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(EReference value);

	/**
	 * Returns the value of the '<em><b>Right Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Element</em>' reference.
	 * @see #setRightElement(EObject)
	 * @see diff.DiffPackage#getReferenceChange_RightElement()
	 * @model
	 * @generated
	 */
	EObject getRightElement();

	/**
	 * Sets the value of the '{@link diff.ReferenceChange#getRightElement <em>Right Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Element</em>' reference.
	 * @see #getRightElement()
	 * @generated
	 */
	void setRightElement(EObject value);

	/**
	 * Returns the value of the '<em><b>Left Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Element</em>' reference.
	 * @see #setLeftElement(EObject)
	 * @see diff.DiffPackage#getReferenceChange_LeftElement()
	 * @model
	 * @generated
	 */
	EObject getLeftElement();

	/**
	 * Sets the value of the '{@link diff.ReferenceChange#getLeftElement <em>Left Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Element</em>' reference.
	 * @see #getLeftElement()
	 * @generated
	 */
	void setLeftElement(EObject value);

} // ReferenceChange
