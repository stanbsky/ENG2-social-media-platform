/**
 */
package deployment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployment.Response#getCode <em>Code</em>}</li>
 *   <li>{@link deployment.Response#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see deployment.DeploymentPackage#getResponse()
 * @model
 * @generated
 */
public interface Response extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The literals are from the enumeration {@link deployment.HttpCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see deployment.HttpCode
	 * @see #setCode(HttpCode)
	 * @see deployment.DeploymentPackage#getResponse_Code()
	 * @model
	 * @generated
	 */
	HttpCode getCode();

	/**
	 * Sets the value of the '{@link deployment.Response#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see deployment.HttpCode
	 * @see #getCode()
	 * @generated
	 */
	void setCode(HttpCode value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * The literals are from the enumeration {@link deployment.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see deployment.Model
	 * @see #setBody(Model)
	 * @see deployment.DeploymentPackage#getResponse_Body()
	 * @model
	 * @generated
	 */
	Model getBody();

	/**
	 * Sets the value of the '{@link deployment.Response#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see deployment.Model
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Model value);

} // Response
