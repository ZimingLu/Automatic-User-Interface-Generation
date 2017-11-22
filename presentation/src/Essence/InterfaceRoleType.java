/**
 */
package Essence;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interface Role Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Essence.EssencePackage#getInterfaceRoleType()
 * @model extendedMetaData="name='InterfaceRoleType'"
 * @generated
 */
public enum InterfaceRoleType implements Enumerator {
	/**
	 * The '<em><b>Master</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_VALUE
	 * @generated
	 * @ordered
	 */
	MASTER(0, "Master", "Master"),

	/**
	 * The '<em><b>Slave</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLAVE_VALUE
	 * @generated
	 * @ordered
	 */
	SLAVE(1, "Slave", "Slave"),

	/**
	 * The '<em><b>System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEM(2, "System", "System"),

	/**
	 * The '<em><b>Monitor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONITOR_VALUE
	 * @generated
	 * @ordered
	 */
	MONITOR(3, "Monitor", "Monitor"),

	/**
	 * The '<em><b>Mirrored Master</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIRRORED_MASTER_VALUE
	 * @generated
	 * @ordered
	 */
	MIRRORED_MASTER(4, "MirroredMaster", "MirroredMaster"),

	/**
	 * The '<em><b>Mirrored Slave</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIRRORED_SLAVE_VALUE
	 * @generated
	 * @ordered
	 */
	MIRRORED_SLAVE(5, "MirroredSlave", "MirroredSlave"),

	/**
	 * The '<em><b>Mirrored System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIRRORED_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	MIRRORED_SYSTEM(6, "MirroredSystem", "MirroredSystem"),

	/**
	 * The '<em><b>Mirrored Monitor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIRRORED_MONITOR_VALUE
	 * @generated
	 * @ordered
	 */
	MIRRORED_MONITOR(7, "MirroredMonitor", "MirroredMonitor"),

	/**
	 * The '<em><b>Monitored Master</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONITORED_MASTER_VALUE
	 * @generated
	 * @ordered
	 */
	MONITORED_MASTER(8, "MonitoredMaster", "MonitoredMaster"),

	/**
	 * The '<em><b>Monitored Slave</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONITORED_SLAVE_VALUE
	 * @generated
	 * @ordered
	 */
	MONITORED_SLAVE(9, "MonitoredSlave", "MonitoredSlave"),

	/**
	 * The '<em><b>Monitored System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONITORED_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	MONITORED_SYSTEM(10, "MonitoredSystem", "MonitoredSystem"),

	/**
	 * The '<em><b>Mirrored Monitored Master</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIRRORED_MONITORED_MASTER_VALUE
	 * @generated
	 * @ordered
	 */
	MIRRORED_MONITORED_MASTER(11, "MirroredMonitoredMaster", "MirroredMonitoredMaster"),

	/**
	 * The '<em><b>Mirrored Monitored Slave</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIRRORED_MONITORED_SLAVE_VALUE
	 * @generated
	 * @ordered
	 */
	MIRRORED_MONITORED_SLAVE(12, "MirroredMonitoredSlave", "MirroredMonitoredSlave"),

	/**
	 * The '<em><b>Mirrored Monitored System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIRRORED_MONITORED_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	MIRRORED_MONITORED_SYSTEM(13, "MirroredMonitoredSystem", "MirroredMonitoredSystem"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(14, "None", "None"),

	/**
	 * The '<em><b>Internal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNAL_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNAL(15, "Internal", "Internal"),

	/**
	 * The '<em><b>Extension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENSION(16, "Extension", "Extension");

	/**
	 * The '<em><b>Master</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Master</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MASTER
	 * @model name="Master"
	 * @generated
	 * @ordered
	 */
	public static final int MASTER_VALUE = 0;

	/**
	 * The '<em><b>Slave</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Slave</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLAVE
	 * @model name="Slave"
	 * @generated
	 * @ordered
	 */
	public static final int SLAVE_VALUE = 1;

	/**
	 * The '<em><b>System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>System</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSTEM
	 * @model name="System"
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM_VALUE = 2;

	/**
	 * The '<em><b>Monitor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Monitor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONITOR
	 * @model name="Monitor"
	 * @generated
	 * @ordered
	 */
	public static final int MONITOR_VALUE = 3;

	/**
	 * The '<em><b>Mirrored Master</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mirrored Master</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIRRORED_MASTER
	 * @model name="MirroredMaster"
	 * @generated
	 * @ordered
	 */
	public static final int MIRRORED_MASTER_VALUE = 4;

	/**
	 * The '<em><b>Mirrored Slave</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mirrored Slave</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIRRORED_SLAVE
	 * @model name="MirroredSlave"
	 * @generated
	 * @ordered
	 */
	public static final int MIRRORED_SLAVE_VALUE = 5;

	/**
	 * The '<em><b>Mirrored System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mirrored System</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIRRORED_SYSTEM
	 * @model name="MirroredSystem"
	 * @generated
	 * @ordered
	 */
	public static final int MIRRORED_SYSTEM_VALUE = 6;

	/**
	 * The '<em><b>Mirrored Monitor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mirrored Monitor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIRRORED_MONITOR
	 * @model name="MirroredMonitor"
	 * @generated
	 * @ordered
	 */
	public static final int MIRRORED_MONITOR_VALUE = 7;

	/**
	 * The '<em><b>Monitored Master</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Monitored Master</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONITORED_MASTER
	 * @model name="MonitoredMaster"
	 * @generated
	 * @ordered
	 */
	public static final int MONITORED_MASTER_VALUE = 8;

	/**
	 * The '<em><b>Monitored Slave</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Monitored Slave</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONITORED_SLAVE
	 * @model name="MonitoredSlave"
	 * @generated
	 * @ordered
	 */
	public static final int MONITORED_SLAVE_VALUE = 9;

	/**
	 * The '<em><b>Monitored System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Monitored System</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONITORED_SYSTEM
	 * @model name="MonitoredSystem"
	 * @generated
	 * @ordered
	 */
	public static final int MONITORED_SYSTEM_VALUE = 10;

	/**
	 * The '<em><b>Mirrored Monitored Master</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mirrored Monitored Master</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIRRORED_MONITORED_MASTER
	 * @model name="MirroredMonitoredMaster"
	 * @generated
	 * @ordered
	 */
	public static final int MIRRORED_MONITORED_MASTER_VALUE = 11;

	/**
	 * The '<em><b>Mirrored Monitored Slave</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mirrored Monitored Slave</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIRRORED_MONITORED_SLAVE
	 * @model name="MirroredMonitoredSlave"
	 * @generated
	 * @ordered
	 */
	public static final int MIRRORED_MONITORED_SLAVE_VALUE = 12;

	/**
	 * The '<em><b>Mirrored Monitored System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mirrored Monitored System</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIRRORED_MONITORED_SYSTEM
	 * @model name="MirroredMonitoredSystem"
	 * @generated
	 * @ordered
	 */
	public static final int MIRRORED_MONITORED_SYSTEM_VALUE = 13;

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
	public static final int NONE_VALUE = 14;

	/**
	 * The '<em><b>Internal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Internal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERNAL
	 * @model name="Internal"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNAL_VALUE = 15;

	/**
	 * The '<em><b>Extension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Extension</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTENSION
	 * @model name="Extension"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION_VALUE = 16;

	/**
	 * An array of all the '<em><b>Interface Role Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InterfaceRoleType[] VALUES_ARRAY =
		new InterfaceRoleType[] {
			MASTER,
			SLAVE,
			SYSTEM,
			MONITOR,
			MIRRORED_MASTER,
			MIRRORED_SLAVE,
			MIRRORED_SYSTEM,
			MIRRORED_MONITOR,
			MONITORED_MASTER,
			MONITORED_SLAVE,
			MONITORED_SYSTEM,
			MIRRORED_MONITORED_MASTER,
			MIRRORED_MONITORED_SLAVE,
			MIRRORED_MONITORED_SYSTEM,
			NONE,
			INTERNAL,
			EXTENSION,
		};

	/**
	 * A public read-only list of all the '<em><b>Interface Role Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InterfaceRoleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Interface Role Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InterfaceRoleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterfaceRoleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interface Role Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InterfaceRoleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterfaceRoleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interface Role Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InterfaceRoleType get(int value) {
		switch (value) {
			case MASTER_VALUE: return MASTER;
			case SLAVE_VALUE: return SLAVE;
			case SYSTEM_VALUE: return SYSTEM;
			case MONITOR_VALUE: return MONITOR;
			case MIRRORED_MASTER_VALUE: return MIRRORED_MASTER;
			case MIRRORED_SLAVE_VALUE: return MIRRORED_SLAVE;
			case MIRRORED_SYSTEM_VALUE: return MIRRORED_SYSTEM;
			case MIRRORED_MONITOR_VALUE: return MIRRORED_MONITOR;
			case MONITORED_MASTER_VALUE: return MONITORED_MASTER;
			case MONITORED_SLAVE_VALUE: return MONITORED_SLAVE;
			case MONITORED_SYSTEM_VALUE: return MONITORED_SYSTEM;
			case MIRRORED_MONITORED_MASTER_VALUE: return MIRRORED_MONITORED_MASTER;
			case MIRRORED_MONITORED_SLAVE_VALUE: return MIRRORED_MONITORED_SLAVE;
			case MIRRORED_MONITORED_SYSTEM_VALUE: return MIRRORED_MONITORED_SYSTEM;
			case NONE_VALUE: return NONE;
			case INTERNAL_VALUE: return INTERNAL;
			case EXTENSION_VALUE: return EXTENSION;
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
	private InterfaceRoleType(int value, String name, String literal) {
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
	
} //InterfaceRoleType
