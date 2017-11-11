/**
 */
package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Bus Error Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see model.ModelPackage#getBusErrorType()
 * @model extendedMetaData="name='BusErrorType'"
 * @generated
 */
public enum BusErrorType implements Enumerator {
	/**
	 * The '<em><b>Read Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	READ_ERROR(0, "ReadError", "ReadError"),

	/**
	 * The '<em><b>Write Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE_ERROR(1, "WriteError", "WriteError"),

	/**
	 * The '<em><b>Read Write Error</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_WRITE_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	READ_WRITE_ERROR(2, "ReadWriteError", "ReadWriteError");

	/**
	 * The '<em><b>Read Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_ERROR
	 * @model name="ReadError"
	 * @generated
	 * @ordered
	 */
	public static final int READ_ERROR_VALUE = 0;

	/**
	 * The '<em><b>Write Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Write Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITE_ERROR
	 * @model name="WriteError"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_ERROR_VALUE = 1;

	/**
	 * The '<em><b>Read Write Error</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read Write Error</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_WRITE_ERROR
	 * @model name="ReadWriteError"
	 * @generated
	 * @ordered
	 */
	public static final int READ_WRITE_ERROR_VALUE = 2;

	/**
	 * An array of all the '<em><b>Bus Error Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BusErrorType[] VALUES_ARRAY =
		new BusErrorType[] {
			READ_ERROR,
			WRITE_ERROR,
			READ_WRITE_ERROR,
		};

	/**
	 * A public read-only list of all the '<em><b>Bus Error Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BusErrorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Bus Error Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BusErrorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BusErrorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bus Error Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BusErrorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BusErrorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bus Error Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BusErrorType get(int value) {
		switch (value) {
			case READ_ERROR_VALUE: return READ_ERROR;
			case WRITE_ERROR_VALUE: return WRITE_ERROR;
			case READ_WRITE_ERROR_VALUE: return READ_WRITE_ERROR;
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
	private BusErrorType(int value, String name, String literal) {
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
	
} //BusErrorType
