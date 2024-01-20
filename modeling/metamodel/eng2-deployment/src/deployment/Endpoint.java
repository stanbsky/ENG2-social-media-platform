/**
 */
package deployment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployment.Endpoint#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link deployment.Endpoint#getUri <em>Uri</em>}</li>
 *   <li>{@link deployment.Endpoint#getTransactional <em>Transactional</em>}</li>
 *   <li>{@link deployment.Endpoint#getEmittedEvents <em>Emitted Events</em>}</li>
 *   <li>{@link deployment.Endpoint#getMethod <em>Method</em>}</li>
 *   <li>{@link deployment.Endpoint#getParameters <em>Parameters</em>}</li>
 *   <li>{@link deployment.Endpoint#getResponse <em>Response</em>}</li>
 *   <li>{@link deployment.Endpoint#getClientCommand <em>Client Command</em>}</li>
 * </ul>
 *
 * @see deployment.DeploymentPackage#getEndpoint()
 * @model
 * @generated
 */
public interface Endpoint extends EObject {
	/**
   * Returns the value of the '<em><b>Method Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Method Name</em>' attribute.
   * @see #setMethodName(String)
   * @see deployment.DeploymentPackage#getEndpoint_MethodName()
   * @model
   * @generated
   */
	String getMethodName();

	/**
   * Sets the value of the '{@link deployment.Endpoint#getMethodName <em>Method Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method Name</em>' attribute.
   * @see #getMethodName()
   * @generated
   */
	void setMethodName(String value);

	/**
   * Returns the value of the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' attribute.
   * @see #setUri(String)
   * @see deployment.DeploymentPackage#getEndpoint_Uri()
   * @model
   * @generated
   */
	String getUri();

	/**
   * Sets the value of the '{@link deployment.Endpoint#getUri <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' attribute.
   * @see #getUri()
   * @generated
   */
	void setUri(String value);

	/**
   * Returns the value of the '<em><b>Transactional</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Transactional</em>' attribute.
   * @see #setTransactional(Boolean)
   * @see deployment.DeploymentPackage#getEndpoint_Transactional()
   * @model
   * @generated
   */
	Boolean getTransactional();

	/**
   * Sets the value of the '{@link deployment.Endpoint#getTransactional <em>Transactional</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transactional</em>' attribute.
   * @see #getTransactional()
   * @generated
   */
	void setTransactional(Boolean value);

	/**
   * Returns the value of the '<em><b>Emitted Events</b></em>' containment reference list.
   * The list contents are of type {@link deployment.Event}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Emitted Events</em>' containment reference list.
   * @see deployment.DeploymentPackage#getEndpoint_EmittedEvents()
   * @model containment="true"
   * @generated
   */
	EList<Event> getEmittedEvents();

	/**
   * Returns the value of the '<em><b>Method</b></em>' attribute.
   * The literals are from the enumeration {@link deployment.HttpMethod}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' attribute.
   * @see deployment.HttpMethod
   * @see #setMethod(HttpMethod)
   * @see deployment.DeploymentPackage#getEndpoint_Method()
   * @model
   * @generated
   */
	HttpMethod getMethod();

	/**
   * Sets the value of the '{@link deployment.Endpoint#getMethod <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' attribute.
   * @see deployment.HttpMethod
   * @see #getMethod()
   * @generated
   */
	void setMethod(HttpMethod value);

	/**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link deployment.Parameter}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see deployment.DeploymentPackage#getEndpoint_Parameters()
   * @model containment="true"
   * @generated
   */
	EList<Parameter> getParameters();

	/**
   * Returns the value of the '<em><b>Response</b></em>' containment reference list.
   * The list contents are of type {@link deployment.HttpResponse}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Response</em>' containment reference list.
   * @see deployment.DeploymentPackage#getEndpoint_Response()
   * @model containment="true"
   * @generated
   */
	EList<HttpResponse> getResponse();

	/**
   * Returns the value of the '<em><b>Client Command</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Client Command</em>' reference.
   * @see #setClientCommand(Command)
   * @see deployment.DeploymentPackage#getEndpoint_ClientCommand()
   * @model
   * @generated
   */
	Command getClientCommand();

	/**
   * Sets the value of the '{@link deployment.Endpoint#getClientCommand <em>Client Command</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Client Command</em>' reference.
   * @see #getClientCommand()
   * @generated
   */
	void setClientCommand(Command value);

} // Endpoint
