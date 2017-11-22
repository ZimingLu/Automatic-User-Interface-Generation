/**
 */
package Essence;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Strobe Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Essence.EssencePackage#getStrobeType()
 * @model extendedMetaData="name='StrobeType'"
 * @generated
 */
public enum StrobeType implements Enumerator {
	/**
	 * The '<em><b>No Strobe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_STROBE_VALUE
	 * @generated
	 * @ordered
	 */
	NO_STROBE(0, "NoStrobe", "NoStrobe"),

	/**
	 * The '<em><b>Read Strobe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_STROBE_VALUE
	 * @generated
	 * @ordered
	 */
	READ_STROBE(1, "ReadStrobe", "ReadStrobe"),

	/**
	 * The '<em><b>Write Strobe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_STROBE_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE_STROBE(2, "WriteStrobe", "WriteStrobe"),

	/**
	 * The '<em><b>Read Write Strobe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_WRITE_STROBE_VALUE
	 * @generated
	 * @ordered
	 */
	READ_WRITE_STROBE(3, "ReadWriteStrobe", "ReadWriteStrobe");

	/**
	 * The '<em><b>No Strobe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Strobe</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_STROBE
	 * @model name="NoStrobe"
	 * @generated
	 * @ordered
	 */
	public static final int NO_STROBE_VALUE = 0;

	/**
	 * The '<em><b>Read Strobe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read Strobe</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_STROBE
	 * @model name="ReadStrobe"
	 * @generated
	 * @ordered
	 */
	public static final int READ_STROBE_VALUE = 1;

	/**
	 * The '<em><b>Write Strobe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Write Strobe</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITE_STROBE
	 * @model name="WriteStrobe"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_STROBE_VALUE = 2;

	/**
	 * The '<em><b>Read Write Strobe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read Write Strobe</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_WRITE_STROBE
	 * @model name="ReadWriteStrobe"
	 * @generated
	 * @ordered
	 */
	public static final int READ_WRITE_STROBE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Strobe Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StrobeType[] VALUES_ARRAY =
		new StrobeType[] {
			NO_STROBE,
			READ_STROBE,
			WRITE_STROBE,
			READ_WRITE_STROBE,
		};

	/**
	 * A public read-only list of all the '<em><b>Strobe Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StrobeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Strobe Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StrobeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StrobeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Strobe Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StrobeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StrobeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Strobe Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StrobeType get(int value) {
		switch (value) {
			case NO_STROBE_VALUE: return NO_STROBE;
			case READ_STROBE_VALUE: return READ_STROBE;
			case WRITE_STROBE_VALUE: return WRITE_STROBE;
			case READ_WRITE_STROBE_VALUE: return READ_WRITE_STROBE;
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
	private StrobeType(int value, String name, String literal) {
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
	
} //StrobeType
