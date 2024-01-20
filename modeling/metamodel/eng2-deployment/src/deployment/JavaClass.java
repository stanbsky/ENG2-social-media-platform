/**
 */
package deployment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployment.JavaClass#getClassName <em>Class Name</em>}</li>
 *   <li>{@link deployment.JavaClass#getSerdeable <em>Serdeable</em>}</li>
 * </ul>
 *
 * @see deployment.DeploymentPackage#getJavaClass()
 * @model
 * @generated
 */
public interface JavaClass extends EObject {
	/**
   * Returns the value of the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Class Name</em>' attribute.
   * @see #setClassName(String)
   * @see deployment.DeploymentPackage#getJavaClass_ClassName()
   * @model
   * @generated
   */
	String getClassName();

	/**
   * Sets the value of the '{@link deployment.JavaClass#getClassName <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Name</em>' attribute.
   * @see #getClassName()
   * @generated
   */
	void setClassName(String value);

	/**
   * Returns the value of the '<em><b>Serdeable</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Serdeable</em>' attribute.
   * @see #setSerdeable(Boolean)
   * @see deployment.DeploymentPackage#getJavaClass_Serdeable()
   * @model
   * @generated
   */
	Boolean getSerdeable();

	/**
   * Sets the value of the '{@link deployment.JavaClass#getSerdeable <em>Serdeable</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Serdeable</em>' attribute.
   * @see #getSerdeable()
   * @generated
   */
	void setSerdeable(Boolean value);

} // JavaClass
