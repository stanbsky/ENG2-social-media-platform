/**
 */
package deployment.impl;

import deployment.CliTool;
import deployment.Controller;
import deployment.DeploymentPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cli Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deployment.impl.CliToolImpl#getClients <em>Clients</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CliToolImpl extends JavaClassImpl implements CliTool {
	/**
   * The cached value of the '{@link #getClients() <em>Clients</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getClients()
   * @generated
   * @ordered
   */
	protected EList<Controller> clients;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CliToolImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return DeploymentPackage.Literals.CLI_TOOL;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Controller> getClients() {
    if (clients == null) {
      clients = new EObjectResolvingEList<Controller>(Controller.class, this, DeploymentPackage.CLI_TOOL__CLIENTS);
    }
    return clients;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DeploymentPackage.CLI_TOOL__CLIENTS:
        return getClients();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case DeploymentPackage.CLI_TOOL__CLIENTS:
        getClients().clear();
        getClients().addAll((Collection<? extends Controller>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eUnset(int featureID) {
    switch (featureID) {
      case DeploymentPackage.CLI_TOOL__CLIENTS:
        getClients().clear();
        return;
    }
    super.eUnset(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean eIsSet(int featureID) {
    switch (featureID) {
      case DeploymentPackage.CLI_TOOL__CLIENTS:
        return clients != null && !clients.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CliToolImpl
