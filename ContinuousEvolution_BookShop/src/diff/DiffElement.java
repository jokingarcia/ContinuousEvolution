/**
 */
package diff;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diff.DiffElement#getSubDiffElements <em>Sub Diff Elements</em>}</li>
 *   <li>{@link diff.DiffElement#getIsHiddenBy <em>Is Hidden By</em>}</li>
 *   <li>{@link diff.DiffElement#isConflicting <em>Conflicting</em>}</li>
 *   <li>{@link diff.DiffElement#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see diff.DiffPackage#getDiffElement()
 * @model abstract="true"
 * @generated
 */
public interface DiffElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Diff Elements</b></em>' containment reference list.
	 * The list contents are of type {@link diff.DiffElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Diff Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Diff Elements</em>' containment reference list.
	 * @see diff.DiffPackage#getDiffElement_SubDiffElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffElement> getSubDiffElements();

	/**
	 * Returns the value of the '<em><b>Is Hidden By</b></em>' reference list.
	 * The list contents are of type {@link diff.AbstractDiffExtension}.
	 * It is bidirectional and its opposite is '{@link diff.AbstractDiffExtension#getHideElements <em>Hide Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Hidden By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Hidden By</em>' reference list.
	 * @see diff.DiffPackage#getDiffElement_IsHiddenBy()
	 * @see diff.AbstractDiffExtension#getHideElements
	 * @model opposite="hideElements"
	 * @generated
	 */
	EList<AbstractDiffExtension> getIsHiddenBy();

	/**
	 * Returns the value of the '<em><b>Conflicting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conflicting</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflicting</em>' attribute.
	 * @see diff.DiffPackage#getDiffElement_Conflicting()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	boolean isConflicting();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"Addition"</code>.
	 * The literals are from the enumeration {@link diff.DifferenceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see diff.DifferenceKind
	 * @see diff.DiffPackage#getDiffElement_Kind()
	 * @model default="Addition" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	DifferenceKind getKind();

} // DiffElement
