/**
 */
package deployment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Producer Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployment.ProducerMethod#getName <em>Name</em>}</li>
 *   <li>{@link deployment.ProducerMethod#getTopics <em>Topics</em>}</li>
 * </ul>
 *
 * @see deployment.DeploymentPackage#getProducerMethod()
 * @model
 * @generated
 */
public interface ProducerMethod extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see deployment.DeploymentPackage#getProducerMethod_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link deployment.ProducerMethod#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Topics</b></em>' reference list.
	 * The list contents are of type {@link deployment.Topic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topics</em>' reference list.
	 * @see deployment.DeploymentPackage#getProducerMethod_Topics()
	 * @model required="true"
	 * @generated
	 */
	EList<Topic> getTopics();

} // ProducerMethod
