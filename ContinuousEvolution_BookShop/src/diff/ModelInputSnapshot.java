/**
 */
package diff;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Input Snapshot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link diff.ModelInputSnapshot#getDate <em>Date</em>}</li>
 *   <li>{@link diff.ModelInputSnapshot#getDiff <em>Diff</em>}</li>
 * </ul>
 * </p>
 *
 * @see diff.DiffPackage#getModelInputSnapshot()
 * @model
 * @generated
 */
public interface ModelInputSnapshot extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see diff.DiffPackage#getModelInputSnapshot_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link diff.ModelInputSnapshot#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Diff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diff</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff</em>' containment reference.
	 * @see #setDiff(DiffModel)
	 * @see diff.DiffPackage#getModelInputSnapshot_Diff()
	 * @model containment="true"
	 * @generated
	 */
	DiffModel getDiff();

	/**
	 * Sets the value of the '{@link diff.ModelInputSnapshot#getDiff <em>Diff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff</em>' containment reference.
	 * @see #getDiff()
	 * @generated
	 */
	void setDiff(DiffModel value);

} // ModelInputSnapshot
