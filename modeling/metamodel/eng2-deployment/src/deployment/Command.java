/**
 */
package deployment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployment.Command#getName <em>Name</em>}</li>
 *   <li>{@link deployment.Command#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see deployment.DeploymentPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends JavaClass {
	/**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see deployment.DeploymentPackage#getCommand_Name()
   * @model
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link deployment.Command#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see deployment.DeploymentPackage#getCommand_Description()
   * @model
   * @generated
   */
	String getDescription();

	/**
   * Sets the value of the '{@link deployment.Command#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
	void setDescription(String value);

} // Command
