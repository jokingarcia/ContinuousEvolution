/**
 */
package diff;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diff.DiffGroup#getLeftParent <em>Left Parent</em>}</li>
 *   <li>{@link diff.DiffGroup#getSubchanges <em>Subchanges</em>}</li>
 * </ul>
 * </p>
 *
 * @see diff.DiffPackage#getDiffGroup()
 * @model
 * @generated
 */
public interface DiffGroup extends DiffElement {
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
	 * @see diff.DiffPackage#getDiffGroup_LeftParent()
	 * @model
	 * @generated
	 */
	EObject getLeftParent();

	/**
	 * Sets the value of the '{@link diff.DiffGroup#getLeftParent <em>Left Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Parent</em>' reference.
	 * @see #getLeftParent()
	 * @generated
	 */
	void setLeftParent(EObject value);

	/**
	 * Returns the value of the '<em><b>Subchanges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subchanges</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subchanges</em>' attribute.
	 * @see #isSetSubchanges()
	 * @see #unsetSubchanges()
	 * @see #setSubchanges(int)
	 * @see diff.DiffPackage#getDiffGroup_Subchanges()
	 * @model unsettable="true" transient="true" derived="true"
	 * @generated
	 */
	int getSubchanges();

	/**
	 * Sets the value of the '{@link diff.DiffGroup#getSubchanges <em>Subchanges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subchanges</em>' attribute.
	 * @see #isSetSubchanges()
	 * @see #unsetSubchanges()
	 * @see #getSubchanges()
	 * @generated
	 */
	void setSubchanges(int value);

	/**
	 * Unsets the value of the '{@link diff.DiffGroup#getSubchanges <em>Subchanges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubchanges()
	 * @see #getSubchanges()
	 * @see #setSubchanges(int)
	 * @generated
	 */
	void unsetSubchanges();

	/**
	 * Returns whether the value of the '{@link diff.DiffGroup#getSubchanges <em>Subchanges</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Subchanges</em>' attribute is set.
	 * @see #unsetSubchanges()
	 * @see #getSubchanges()
	 * @see #setSubchanges(int)
	 * @generated
	 */
	boolean isSetSubchanges();

} // DiffGroup
