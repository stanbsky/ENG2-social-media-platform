/**
 */
package deployment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployment.Topic#getName <em>Name</em>}</li>
 *   <li>{@link deployment.Topic#getKey <em>Key</em>}</li>
 *   <li>{@link deployment.Topic#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see deployment.DeploymentPackage#getTopic()
 * @model
 * @generated
 */
public interface Topic extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see deployment.DeploymentPackage#getTopic_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link deployment.Topic#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * The literals are from the enumeration {@link deployment.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see deployment.Model
	 * @see #setKey(Model)
	 * @see deployment.DeploymentPackage#getTopic_Key()
	 * @model
	 * @generated
	 */
	Model getKey();

	/**
	 * Sets the value of the '{@link deployment.Topic#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see deployment.Model
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Model value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link deployment.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see deployment.Model
	 * @see #setValue(Model)
	 * @see deployment.DeploymentPackage#getTopic_Value()
	 * @model
	 * @generated
	 */
	Model getValue();

	/**
	 * Sets the value of the '{@link deployment.Topic#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see deployment.Model
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Model value);

} // Topic
