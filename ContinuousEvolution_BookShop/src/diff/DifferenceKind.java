/**
 */
package diff;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Difference Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see diff.DiffPackage#getDifferenceKind()
 * @model
 * @generated
 */
public enum DifferenceKind implements Enumerator {
	/**
	 * The '<em><b>Addition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDITION_VALUE
	 * @generated
	 * @ordered
	 */
	ADDITION(0, "Addition", "Addition"),

	/**
	 * The '<em><b>Deletion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETION_VALUE
	 * @generated
	 * @ordered
	 */
	DELETION(1, "Deletion", "Deletion"),

	/**
	 * The '<em><b>Change</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGE(2, "Change", "Change"),

	/**
	 * The '<em><b>Move</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVE_VALUE
	 * @generated
	 * @ordered
	 */
	MOVE(3, "Move", "Move"),

	/**
	 * The '<em><b>Conflict</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFLICT_VALUE
	 * @generated
	 * @ordered
	 */
	CONFLICT(4, "Conflict", "Conflict");

	/**
	 * The '<em><b>Addition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Addition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADDITION
	 * @model name="Addition"
	 * @generated
	 * @ordered
	 */
	public static final int ADDITION_VALUE = 0;

	/**
	 * The '<em><b>Deletion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deletion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETION
	 * @model name="Deletion"
	 * @generated
	 * @ordered
	 */
	public static final int DELETION_VALUE = 1;

	/**
	 * The '<em><b>Change</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Change</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHANGE
	 * @model name="Change"
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_VALUE = 2;

	/**
	 * The '<em><b>Move</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Move</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVE
	 * @model name="Move"
	 * @generated
	 * @ordered
	 */
	public static final int MOVE_VALUE = 3;

	/**
	 * The '<em><b>Conflict</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Conflict</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFLICT
	 * @model name="Conflict"
	 * @generated
	 * @ordered
	 */
	public static final int CONFLICT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Difference Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DifferenceKind[] VALUES_ARRAY =
		new DifferenceKind[] {
			ADDITION,
			DELETION,
			CHANGE,
			MOVE,
			CONFLICT,
		};

	/**
	 * A public read-only list of all the '<em><b>Difference Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DifferenceKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Difference Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DifferenceKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DifferenceKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Difference Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DifferenceKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DifferenceKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Difference Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DifferenceKind get(int value) {
		switch (value) {
			case ADDITION_VALUE: return ADDITION;
			case DELETION_VALUE: return DELETION;
			case CHANGE_VALUE: return CHANGE;
			case MOVE_VALUE: return MOVE;
			case CONFLICT_VALUE: return CONFLICT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DifferenceKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DifferenceKind
