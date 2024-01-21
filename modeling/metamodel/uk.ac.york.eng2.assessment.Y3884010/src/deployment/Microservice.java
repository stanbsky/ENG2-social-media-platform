/**
 */
package deployment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployment.Microservice#getName <em>Name</em>}</li>
 *   <li>{@link deployment.Microservice#getJavaPackage <em>Java Package</em>}</li>
 *   <li>{@link deployment.Microservice#getPort <em>Port</em>}</li>
 *   <li>{@link deployment.Microservice#getControllers <em>Controllers</em>}</li>
 *   <li>{@link deployment.Microservice#getProducers <em>Producers</em>}</li>
 * </ul>
 *
 * @see deployment.DeploymentPackage#getMicroservice()
 * @model
 * @generated
 */
public interface Microservice extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see deployment.DeploymentPackage#getMicroservice_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link deployment.Microservice#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Java Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Package</em>' attribute.
	 * @see #setJavaPackage(String)
	 * @see deployment.DeploymentPackage#getMicroservice_JavaPackage()
	 * @model
	 * @generated
	 */
	String getJavaPackage();

	/**
	 * Sets the value of the '{@link deployment.Microservice#getJavaPackage <em>Java Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Package</em>' attribute.
	 * @see #getJavaPackage()
	 * @generated
	 */
	void setJavaPackage(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(Short)
	 * @see deployment.DeploymentPackage#getMicroservice_Port()
	 * @model
	 * @generated
	 */
	Short getPort();

	/**
	 * Sets the value of the '{@link deployment.Microservice#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Short value);

	/**
	 * Returns the value of the '<em><b>Controllers</b></em>' containment reference list.
	 * The list contents are of type {@link deployment.Controller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controllers</em>' containment reference list.
	 * @see deployment.DeploymentPackage#getMicroservice_Controllers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Controller> getControllers();

	/**
	 * Returns the value of the '<em><b>Producers</b></em>' containment reference list.
	 * The list contents are of type {@link deployment.Producer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producers</em>' containment reference list.
	 * @see deployment.DeploymentPackage#getMicroservice_Producers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Producer> getProducers();

} // Microservice
