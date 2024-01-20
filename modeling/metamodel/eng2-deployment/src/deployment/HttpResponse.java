/**
 */
package deployment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployment.HttpResponse#getResponseCode <em>Response Code</em>}</li>
 *   <li>{@link deployment.HttpResponse#getResponseBody <em>Response Body</em>}</li>
 * </ul>
 *
 * @see deployment.DeploymentPackage#getHttpResponse()
 * @model
 * @generated
 */
public interface HttpResponse extends EObject {
	/**
   * Returns the value of the '<em><b>Response Code</b></em>' attribute.
   * The literals are from the enumeration {@link deployment.HttpResponseCode}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Response Code</em>' attribute.
   * @see deployment.HttpResponseCode
   * @see #setResponseCode(HttpResponseCode)
   * @see deployment.DeploymentPackage#getHttpResponse_ResponseCode()
   * @model
   * @generated
   */
	HttpResponseCode getResponseCode();

	/**
   * Sets the value of the '{@link deployment.HttpResponse#getResponseCode <em>Response Code</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Response Code</em>' attribute.
   * @see deployment.HttpResponseCode
   * @see #getResponseCode()
   * @generated
   */
	void setResponseCode(HttpResponseCode value);

	/**
   * Returns the value of the '<em><b>Response Body</b></em>' attribute.
   * The literals are from the enumeration {@link deployment.Model}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Response Body</em>' attribute.
   * @see deployment.Model
   * @see #setResponseBody(Model)
   * @see deployment.DeploymentPackage#getHttpResponse_ResponseBody()
   * @model
   * @generated
   */
	Model getResponseBody();

	/**
   * Sets the value of the '{@link deployment.HttpResponse#getResponseBody <em>Response Body</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Response Body</em>' attribute.
   * @see deployment.Model
   * @see #getResponseBody()
   * @generated
   */
	void setResponseBody(Model value);

} // HttpResponse
