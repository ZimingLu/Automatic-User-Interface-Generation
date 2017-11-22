/**
 */
package Essence;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Top Spin Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Essence.EssencePackage#getTopSpinType()
 * @model extendedMetaData="name='TopSpinType'"
 * @generated
 */
public enum TopSpinType implements Enumerator {
	/**
	 * The '<em><b>No Top Spin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_TOP_SPIN_VALUE
	 * @generated
	 * @ordered
	 */
	NO_TOP_SPIN(0, "noTopSpin", "noTopSpin"),

	/**
	 * The '<em><b>Clc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLC_VALUE
	 * @generated
	 * @ordered
	 */
	CLC(1, "clc", "clc"),

	/**
	 * The '<em><b>Clccnt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLCCNT_VALUE
	 * @generated
	 * @ordered
	 */
	CLCCNT(2, "clccnt", "clccnt"),

	/**
	 * The '<em><b>Clcstat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLCSTAT_VALUE
	 * @generated
	 * @ordered
	 */
	CLCSTAT(3, "clcstat", "clcstat"),

	/**
	 * The '<em><b>Config</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIG_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIG(4, "config", "config"),

	/**
	 * The '<em><b>Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROL(5, "control", "control"),

	/**
	 * The '<em><b>Dmae</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMAE_VALUE
	 * @generated
	 * @ordered
	 */
	DMAE(6, "dmae", "dmae"),

	/**
	 * The '<em><b>Errconf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERRCONF_VALUE
	 * @generated
	 * @ordered
	 */
	ERRCONF(7, "errconf", "errconf"),

	/**
	 * The '<em><b>Hwapivers</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HWAPIVERS_VALUE
	 * @generated
	 * @ordered
	 */
	HWAPIVERS(8, "hwapivers", "hwapivers"),

	/**
	 * The '<em><b>Icr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICR_VALUE
	 * @generated
	 * @ordered
	 */
	ICR(9, "icr", "icr"),

	/**
	 * The '<em><b>Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_VALUE
	 * @generated
	 * @ordered
	 */
	ID(10, "id", "id"),

	/**
	 * The '<em><b>Imsc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMSC_VALUE
	 * @generated
	 * @ordered
	 */
	IMSC(11, "imsc", "imsc"),

	/**
	 * The '<em><b>Irqsc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRQSC_VALUE
	 * @generated
	 * @ordered
	 */
	IRQSC(12, "irqsc", "irqsc"),

	/**
	 * The '<em><b>Irqsm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRQSM_VALUE
	 * @generated
	 * @ordered
	 */
	IRQSM(13, "irqsm", "irqsm"),

	/**
	 * The '<em><b>Irqss</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRQSS_VALUE
	 * @generated
	 * @ordered
	 */
	IRQSS(14, "irqss", "irqss"),

	/**
	 * The '<em><b>Isr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISR_VALUE
	 * @generated
	 * @ordered
	 */
	ISR(15, "isr", "isr"),

	/**
	 * The '<em><b>Mis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIS_VALUE
	 * @generated
	 * @ordered
	 */
	MIS(16, "mis", "mis"),

	/**
	 * The '<em><b>Msconf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSCONF_VALUE
	 * @generated
	 * @ordered
	 */
	MSCONF(17, "msconf", "msconf"),

	/**
	 * The '<em><b>Readonlysync</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READONLYSYNC_VALUE
	 * @generated
	 * @ordered
	 */
	READONLYSYNC(18, "readonlysync", "readonlysync"),

	/**
	 * The '<em><b>Ris</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIS_VALUE
	 * @generated
	 * @ordered
	 */
	RIS(19, "ris", "ris");

	/**
	 * The '<em><b>No Top Spin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Top Spin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_TOP_SPIN
	 * @model name="noTopSpin"
	 * @generated
	 * @ordered
	 */
	public static final int NO_TOP_SPIN_VALUE = 0;

	/**
	 * The '<em><b>Clc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Clc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLC
	 * @model name="clc"
	 * @generated
	 * @ordered
	 */
	public static final int CLC_VALUE = 1;

	/**
	 * The '<em><b>Clccnt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Clccnt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLCCNT
	 * @model name="clccnt"
	 * @generated
	 * @ordered
	 */
	public static final int CLCCNT_VALUE = 2;

	/**
	 * The '<em><b>Clcstat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Clcstat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLCSTAT
	 * @model name="clcstat"
	 * @generated
	 * @ordered
	 */
	public static final int CLCSTAT_VALUE = 3;

	/**
	 * The '<em><b>Config</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Config</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIG
	 * @model name="config"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIG_VALUE = 4;

	/**
	 * The '<em><b>Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Control</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTROL
	 * @model name="control"
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_VALUE = 5;

	/**
	 * The '<em><b>Dmae</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dmae</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DMAE
	 * @model name="dmae"
	 * @generated
	 * @ordered
	 */
	public static final int DMAE_VALUE = 6;

	/**
	 * The '<em><b>Errconf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Errconf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERRCONF
	 * @model name="errconf"
	 * @generated
	 * @ordered
	 */
	public static final int ERRCONF_VALUE = 7;

	/**
	 * The '<em><b>Hwapivers</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hwapivers</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HWAPIVERS
	 * @model name="hwapivers"
	 * @generated
	 * @ordered
	 */
	public static final int HWAPIVERS_VALUE = 8;

	/**
	 * The '<em><b>Icr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Icr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICR
	 * @model name="icr"
	 * @generated
	 * @ordered
	 */
	public static final int ICR_VALUE = 9;

	/**
	 * The '<em><b>Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Id</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID
	 * @model name="id"
	 * @generated
	 * @ordered
	 */
	public static final int ID_VALUE = 10;

	/**
	 * The '<em><b>Imsc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Imsc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMSC
	 * @model name="imsc"
	 * @generated
	 * @ordered
	 */
	public static final int IMSC_VALUE = 11;

	/**
	 * The '<em><b>Irqsc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Irqsc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IRQSC
	 * @model name="irqsc"
	 * @generated
	 * @ordered
	 */
	public static final int IRQSC_VALUE = 12;

	/**
	 * The '<em><b>Irqsm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Irqsm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IRQSM
	 * @model name="irqsm"
	 * @generated
	 * @ordered
	 */
	public static final int IRQSM_VALUE = 13;

	/**
	 * The '<em><b>Irqss</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Irqss</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IRQSS
	 * @model name="irqss"
	 * @generated
	 * @ordered
	 */
	public static final int IRQSS_VALUE = 14;

	/**
	 * The '<em><b>Isr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Isr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISR
	 * @model name="isr"
	 * @generated
	 * @ordered
	 */
	public static final int ISR_VALUE = 15;

	/**
	 * The '<em><b>Mis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIS
	 * @model name="mis"
	 * @generated
	 * @ordered
	 */
	public static final int MIS_VALUE = 16;

	/**
	 * The '<em><b>Msconf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Msconf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSCONF
	 * @model name="msconf"
	 * @generated
	 * @ordered
	 */
	public static final int MSCONF_VALUE = 17;

	/**
	 * The '<em><b>Readonlysync</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Readonlysync</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READONLYSYNC
	 * @model name="readonlysync"
	 * @generated
	 * @ordered
	 */
	public static final int READONLYSYNC_VALUE = 18;

	/**
	 * The '<em><b>Ris</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ris</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIS
	 * @model name="ris"
	 * @generated
	 * @ordered
	 */
	public static final int RIS_VALUE = 19;

	/**
	 * An array of all the '<em><b>Top Spin Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TopSpinType[] VALUES_ARRAY =
		new TopSpinType[] {
			NO_TOP_SPIN,
			CLC,
			CLCCNT,
			CLCSTAT,
			CONFIG,
			CONTROL,
			DMAE,
			ERRCONF,
			HWAPIVERS,
			ICR,
			ID,
			IMSC,
			IRQSC,
			IRQSM,
			IRQSS,
			ISR,
			MIS,
			MSCONF,
			READONLYSYNC,
			RIS,
		};

	/**
	 * A public read-only list of all the '<em><b>Top Spin Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TopSpinType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Top Spin Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TopSpinType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TopSpinType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Top Spin Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TopSpinType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TopSpinType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Top Spin Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TopSpinType get(int value) {
		switch (value) {
			case NO_TOP_SPIN_VALUE: return NO_TOP_SPIN;
			case CLC_VALUE: return CLC;
			case CLCCNT_VALUE: return CLCCNT;
			case CLCSTAT_VALUE: return CLCSTAT;
			case CONFIG_VALUE: return CONFIG;
			case CONTROL_VALUE: return CONTROL;
			case DMAE_VALUE: return DMAE;
			case ERRCONF_VALUE: return ERRCONF;
			case HWAPIVERS_VALUE: return HWAPIVERS;
			case ICR_VALUE: return ICR;
			case ID_VALUE: return ID;
			case IMSC_VALUE: return IMSC;
			case IRQSC_VALUE: return IRQSC;
			case IRQSM_VALUE: return IRQSM;
			case IRQSS_VALUE: return IRQSS;
			case ISR_VALUE: return ISR;
			case MIS_VALUE: return MIS;
			case MSCONF_VALUE: return MSCONF;
			case READONLYSYNC_VALUE: return READONLYSYNC;
			case RIS_VALUE: return RIS;
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
	private TopSpinType(int value, String name, String literal) {
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
	
} //TopSpinType
