/**
 */
package deployment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployment.Deployment#getMicroservices <em>Microservices</em>}</li>
 *   <li>{@link deployment.Deployment#getTopics <em>Topics</em>}</li>
 *   <li>{@link deployment.Deployment#getCliTool <em>Cli Tool</em>}</li>
 * </ul>
 *
 * @see deployment.DeploymentPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends EObject {
	/**
	 * Returns the value of the '<em><b>Microservices</b></em>' containment reference list.
	 * The list contents are of type {@link deployment.Microservice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microservices</em>' containment reference list.
	 * @see deployment.DeploymentPackage#getDeployment_Microservices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Microservice> getMicroservices();

	/**
	 * Returns the value of the '<em><b>Topics</b></em>' containment reference list.
	 * The list contents are of type {@link deployment.Topic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics</em>' containment reference list.
	 * @see deployment.DeploymentPackage#getDeployment_Topics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Topic> getTopics();

	/**
	 * Returns the value of the '<em><b>Cli Tool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cli Tool</em>' containment reference.
	 * @see #setCliTool(CliTool)
	 * @see deployment.DeploymentPackage#getDeployment_CliTool()
	 * @model containment="true"
	 * @generated
	 */
	CliTool getCliTool();

	/**
	 * Sets the value of the '{@link deployment.Deployment#getCliTool <em>Cli Tool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cli Tool</em>' containment reference.
	 * @see #getCliTool()
	 * @generated
	 */
	void setCliTool(CliTool value);

} // Deployment
