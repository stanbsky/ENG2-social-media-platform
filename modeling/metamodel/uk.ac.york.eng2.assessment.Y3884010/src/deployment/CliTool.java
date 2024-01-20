/**
 */
package deployment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cli Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployment.CliTool#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see deployment.DeploymentPackage#getCliTool()
 * @model
 * @generated
 */
public interface CliTool extends JavaClass {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link deployment.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see deployment.DeploymentPackage#getCliTool_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getCommands();

} // CliTool
