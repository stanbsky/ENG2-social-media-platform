/**
 */
package deployment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployment.Column#getName <em>Name</em>}</li>
 *   <li>{@link deployment.Column#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see deployment.DeploymentPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see deployment.DeploymentPackage#getColumn_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link deployment.Column#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link deployment.Model}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see deployment.Model
   * @see #setType(Model)
   * @see deployment.DeploymentPackage#getColumn_Type()
   * @model
   * @generated
   */
  Model getType();

  /**
   * Sets the value of the '{@link deployment.Column#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see deployment.Model
   * @see #getType()
   * @generated
   */
  void setType(Model value);

} // Column
