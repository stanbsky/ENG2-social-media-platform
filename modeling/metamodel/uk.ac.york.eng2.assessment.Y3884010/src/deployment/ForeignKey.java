/**
 */
package deployment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployment.ForeignKey#getSource <em>Source</em>}</li>
 *   <li>{@link deployment.ForeignKey#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see deployment.DeploymentPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Column)
	 * @see deployment.DeploymentPackage#getForeignKey_Source()
	 * @model
	 * @generated
	 */
	Column getSource();

	/**
	 * Sets the value of the '{@link deployment.ForeignKey#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Column value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Column)
	 * @see deployment.DeploymentPackage#getForeignKey_Destination()
	 * @model
	 * @generated
	 */
	Column getDestination();

	/**
	 * Sets the value of the '{@link deployment.ForeignKey#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Column value);

} // ForeignKey
