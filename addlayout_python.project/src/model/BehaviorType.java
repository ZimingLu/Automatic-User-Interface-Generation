/**
 */
package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Behavior Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see model.ModelPackage#getBehaviorType()
 * @model extendedMetaData="name='BehaviorType'"
 * @generated
 */
public enum BehaviorType implements Enumerator {
	/**
	 * The '<em><b>Read Write</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_WRITE_VALUE
	 * @generated
	 * @ordered
	 */
	READ_WRITE(0, "ReadWrite", "ReadWrite"),

	/**
	 * The '<em><b>Read</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_VALUE
	 * @generated
	 * @ordered
	 */
	READ(1, "Read", "Read"),

	/**
	 * The '<em><b>Read Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	READ_ONLY(2, "ReadOnly", "ReadOnly"),

	/**
	 * The '<em><b>Write Read0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_READ0_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE_READ0(3, "WriteRead0", "WriteRead0"),

	/**
	 * The '<em><b>Write Read1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_READ1_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE_READ1(4, "WriteRead1", "WriteRead1"),

	/**
	 * The '<em><b>Write Read X</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_READ_X_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE_READ_X(5, "WriteReadX", "WriteReadX"),

	/**
	 * The '<em><b>Write Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE_ONLY(6, "WriteOnly", "WriteOnly"),

	/**
	 * The '<em><b>None Read0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_READ0_VALUE
	 * @generated
	 * @ordered
	 */
	NONE_READ0(7, "NoneRead0", "NoneRead0"),

	/**
	 * The '<em><b>None Read1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_READ1_VALUE
	 * @generated
	 * @ordered
	 */
	NONE_READ1(8, "NoneRead1", "NoneRead1"),

	/**
	 * The '<em><b>None Read X</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_READ_X_VALUE
	 * @generated
	 * @ordered
	 */
	NONE_READ_X(9, "NoneReadX", "NoneReadX"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(10, "None", "None"),

	/**
	 * The '<em><b>Read0 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ0_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	READ0_ONLY(11, "Read0Only", "Read0Only"),

	/**
	 * The '<em><b>Read1 Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ1_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	READ1_ONLY(12, "Read1Only", "Read1Only"),

	/**
	 * The '<em><b>Read XOnly</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_XONLY_VALUE
	 * @generated
	 * @ordered
	 */
	READ_XONLY(13, "ReadXOnly", "ReadXOnly"),

	/**
	 * The '<em><b>None Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	NONE_ONLY(14, "NoneOnly", "NoneOnly");

	/**
	 * The '<em><b>Read Write</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read Write</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_WRITE
	 * @model name="ReadWrite"
	 * @generated
	 * @ordered
	 */
	public static final int READ_WRITE_VALUE = 0;

	/**
	 * The '<em><b>Read</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ
	 * @model name="Read"
	 * @generated
	 * @ordered
	 */
	public static final int READ_VALUE = 1;

	/**
	 * The '<em><b>Read Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_ONLY
	 * @model name="ReadOnly"
	 * @generated
	 * @ordered
	 */
	public static final int READ_ONLY_VALUE = 2;

	/**
	 * The '<em><b>Write Read0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Write Read0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITE_READ0
	 * @model name="WriteRead0"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_READ0_VALUE = 3;

	/**
	 * The '<em><b>Write Read1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Write Read1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITE_READ1
	 * @model name="WriteRead1"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_READ1_VALUE = 4;

	/**
	 * The '<em><b>Write Read X</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Write Read X</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITE_READ_X
	 * @model name="WriteReadX"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_READ_X_VALUE = 5;

	/**
	 * The '<em><b>Write Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Write Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITE_ONLY
	 * @model name="WriteOnly"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_ONLY_VALUE = 6;

	/**
	 * The '<em><b>None Read0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None Read0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE_READ0
	 * @model name="NoneRead0"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_READ0_VALUE = 7;

	/**
	 * The '<em><b>None Read1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None Read1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE_READ1
	 * @model name="NoneRead1"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_READ1_VALUE = 8;

	/**
	 * The '<em><b>None Read X</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None Read X</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE_READ_X
	 * @model name="NoneReadX"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_READ_X_VALUE = 9;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 10;

	/**
	 * The '<em><b>Read0 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read0 Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ0_ONLY
	 * @model name="Read0Only"
	 * @generated
	 * @ordered
	 */
	public static final int READ0_ONLY_VALUE = 11;

	/**
	 * The '<em><b>Read1 Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read1 Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ1_ONLY
	 * @model name="Read1Only"
	 * @generated
	 * @ordered
	 */
	public static final int READ1_ONLY_VALUE = 12;

	/**
	 * The '<em><b>Read XOnly</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read XOnly</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_XONLY
	 * @model name="ReadXOnly"
	 * @generated
	 * @ordered
	 */
	public static final int READ_XONLY_VALUE = 13;

	/**
	 * The '<em><b>None Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE_ONLY
	 * @model name="NoneOnly"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_ONLY_VALUE = 14;

	/**
	 * An array of all the '<em><b>Behavior Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BehaviorType[] VALUES_ARRAY =
		new BehaviorType[] {
			READ_WRITE,
			READ,
			READ_ONLY,
			WRITE_READ0,
			WRITE_READ1,
			WRITE_READ_X,
			WRITE_ONLY,
			NONE_READ0,
			NONE_READ1,
			NONE_READ_X,
			NONE,
			READ0_ONLY,
			READ1_ONLY,
			READ_XONLY,
			NONE_ONLY,
		};

	/**
	 * A public read-only list of all the '<em><b>Behavior Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BehaviorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Behavior Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BehaviorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BehaviorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Behavior Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BehaviorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BehaviorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Behavior Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BehaviorType get(int value) {
		switch (value) {
			case READ_WRITE_VALUE: return READ_WRITE;
			case READ_VALUE: return READ;
			case READ_ONLY_VALUE: return READ_ONLY;
			case WRITE_READ0_VALUE: return WRITE_READ0;
			case WRITE_READ1_VALUE: return WRITE_READ1;
			case WRITE_READ_X_VALUE: return WRITE_READ_X;
			case WRITE_ONLY_VALUE: return WRITE_ONLY;
			case NONE_READ0_VALUE: return NONE_READ0;
			case NONE_READ1_VALUE: return NONE_READ1;
			case NONE_READ_X_VALUE: return NONE_READ_X;
			case NONE_VALUE: return NONE;
			case READ0_ONLY_VALUE: return READ0_ONLY;
			case READ1_ONLY_VALUE: return READ1_ONLY;
			case READ_XONLY_VALUE: return READ_XONLY;
			case NONE_ONLY_VALUE: return NONE_ONLY;
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
	private BehaviorType(int value, String name, String literal) {
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
	
} //BehaviorType
