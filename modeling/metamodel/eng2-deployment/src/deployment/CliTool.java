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
 *   <li>{@link deployment.CliTool#getClients <em>Clients</em>}</li>
 * </ul>
 *
 * @see deployment.DeploymentPackage#getCliTool()
 * @model
 * @generated
 */
public interface CliTool extends JavaClass {
	/**
   * Returns the value of the '<em><b>Clients</b></em>' reference list.
   * The list contents are of type {@link deployment.Controller}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Clients</em>' reference list.
   * @see deployment.DeploymentPackage#getCliTool_Clients()
   * @model
   * @generated
   */
	EList<Controller> getClients();

} // CliTool
