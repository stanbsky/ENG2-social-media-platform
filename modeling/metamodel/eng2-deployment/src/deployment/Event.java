/**
 */
package deployment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployment.Event#getKey <em>Key</em>}</li>
 *   <li>{@link deployment.Event#getValue <em>Value</em>}</li>
 *   <li>{@link deployment.Event#getTopic <em>Topic</em>}</li>
 * </ul>
 *
 * @see deployment.DeploymentPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject {
	/**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * The literals are from the enumeration {@link deployment.Model}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see deployment.Model
   * @see #setKey(Model)
   * @see deployment.DeploymentPackage#getEvent_Key()
   * @model
   * @generated
   */
	Model getKey();

	/**
   * Sets the value of the '{@link deployment.Event#getKey <em>Key</em>}' attribute.
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
   * @see deployment.DeploymentPackage#getEvent_Value()
   * @model
   * @generated
   */
	Model getValue();

	/**
   * Sets the value of the '{@link deployment.Event#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see deployment.Model
   * @see #getValue()
   * @generated
   */
	void setValue(Model value);

	/**
   * Returns the value of the '<em><b>Topic</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Topic</em>' reference.
   * @see #setTopic(Topic)
   * @see deployment.DeploymentPackage#getEvent_Topic()
   * @model
   * @generated
   */
	Topic getTopic();

	/**
   * Sets the value of the '{@link deployment.Event#getTopic <em>Topic</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Topic</em>' reference.
   * @see #getTopic()
   * @generated
   */
	void setTopic(Topic value);

} // Event
