/**
 */
package modelextension;

import model.AccessLevel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common Access Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelextension.CommonAccessLevel#getCommonAccessLevel <em>Common Access Level</em>}</li>
 * </ul>
 *
 * @see modelextension.ModelextensionPackage#getCommonAccessLevel()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CommonAccessLevel extends EObject {
	/**
	 * Returns the value of the '<em><b>Common Access Level</b></em>' containment reference list.
	 * The list contents are of type {@link model.AccessLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Common Access Level</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common Access Level</em>' containment reference list.
	 * @see modelextension.ModelextensionPackage#getCommonAccessLevel_CommonAccessLevel()
	 * @model containment="true" transient="true" derived="true"
	 * @generated
	 */
	EList<AccessLevel> getCommonAccessLevel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (commonAccessLevel != null) {\n\tcommonAccessLevel.clear();\n\tcommonAccessLevel.addAll(InternalModelServiceImpl.BUSINESSLOGICSERVICE.getCommonAccessLevel(this));\n}'"
	 * @generated
	 */
	void refreshCommonAccessLevel();

} // CommonAccessLevel
