/**
 */
package deployment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployment.Parameter#getKey <em>Key</em>}</li>
 *   <li>{@link deployment.Parameter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see deployment.DeploymentPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see deployment.DeploymentPackage#getParameter_Key()
   * @model
   * @generated
   */
	String getKey();

	/**
   * Sets the value of the '{@link deployment.Parameter#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
	void setKey(String value);

	/**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link deployment.Model}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see deployment.Model
   * @see #setValue(Model)
   * @see deployment.DeploymentPackage#getParameter_Value()
   * @model
   * @generated
   */
	Model getValue();

	/**
   * Sets the value of the '{@link deployment.Parameter#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see deployment.Model
   * @see #getValue()
   * @generated
   */
	void setValue(Model value);

} // Parameter
