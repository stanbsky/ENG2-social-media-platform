/**
 */
package deployment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployment.Request#getVerb <em>Verb</em>}</li>
 *   <li>{@link deployment.Request#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see deployment.DeploymentPackage#getRequest()
 * @model
 * @generated
 */
public interface Request extends EObject {
	/**
	 * Returns the value of the '<em><b>Verb</b></em>' attribute.
	 * The literals are from the enumeration {@link deployment.HttpVerb}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verb</em>' attribute.
	 * @see deployment.HttpVerb
	 * @see #setVerb(HttpVerb)
	 * @see deployment.DeploymentPackage#getRequest_Verb()
	 * @model
	 * @generated
	 */
	HttpVerb getVerb();

	/**
	 * Sets the value of the '{@link deployment.Request#getVerb <em>Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verb</em>' attribute.
	 * @see deployment.HttpVerb
	 * @see #getVerb()
	 * @generated
	 */
	void setVerb(HttpVerb value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see deployment.DeploymentPackage#getRequest_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link deployment.Request#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // Request
