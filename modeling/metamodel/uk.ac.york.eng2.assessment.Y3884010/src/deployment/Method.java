/**
 */
package deployment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployment.Method#getName <em>Name</em>}</li>
 *   <li>{@link deployment.Method#getTransactional <em>Transactional</em>}</li>
 *   <li>{@link deployment.Method#getParameters <em>Parameters</em>}</li>
 *   <li>{@link deployment.Method#getRequest <em>Request</em>}</li>
 *   <li>{@link deployment.Method#getResponse <em>Response</em>}</li>
 *   <li>{@link deployment.Method#getProduced <em>Produced</em>}</li>
 *   <li>{@link deployment.Method#getClientCommand <em>Client Command</em>}</li>
 * </ul>
 *
 * @see deployment.DeploymentPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see deployment.DeploymentPackage#getMethod_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link deployment.Method#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transactional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactional</em>' attribute.
	 * @see #setTransactional(Boolean)
	 * @see deployment.DeploymentPackage#getMethod_Transactional()
	 * @model
	 * @generated
	 */
	Boolean getTransactional();

	/**
	 * Sets the value of the '{@link deployment.Method#getTransactional <em>Transactional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transactional</em>' attribute.
	 * @see #getTransactional()
	 * @generated
	 */
	void setTransactional(Boolean value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link deployment.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see deployment.DeploymentPackage#getMethod_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(Request)
	 * @see deployment.DeploymentPackage#getMethod_Request()
	 * @model containment="true"
	 * @generated
	 */
	Request getRequest();

	/**
	 * Sets the value of the '{@link deployment.Method#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Request value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference list.
	 * The list contents are of type {@link deployment.Response}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' containment reference list.
	 * @see deployment.DeploymentPackage#getMethod_Response()
	 * @model containment="true"
	 * @generated
	 */
	EList<Response> getResponse();

	/**
	 * Returns the value of the '<em><b>Produced</b></em>' reference list.
	 * The list contents are of type {@link deployment.Topic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produced</em>' reference list.
	 * @see deployment.DeploymentPackage#getMethod_Produced()
	 * @model
	 * @generated
	 */
	EList<Topic> getProduced();

	/**
	 * Returns the value of the '<em><b>Client Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Command</em>' reference.
	 * @see #setClientCommand(Command)
	 * @see deployment.DeploymentPackage#getMethod_ClientCommand()
	 * @model
	 * @generated
	 */
	Command getClientCommand();

	/**
	 * Sets the value of the '{@link deployment.Method#getClientCommand <em>Client Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Command</em>' reference.
	 * @see #getClientCommand()
	 * @generated
	 */
	void setClientCommand(Command value);

} // Method
