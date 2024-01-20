/**
 */
package deployment.impl;

import deployment.CliTool;
import deployment.Deployment;
import deployment.DeploymentPackage;
import deployment.JoinTable;
import deployment.Microservice;
import deployment.Table;
import deployment.Topic;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deployment.impl.DeploymentImpl#getMicroservices <em>Microservices</em>}</li>
 *   <li>{@link deployment.impl.DeploymentImpl#getTopics <em>Topics</em>}</li>
 *   <li>{@link deployment.impl.DeploymentImpl#getCliTool <em>Cli Tool</em>}</li>
 *   <li>{@link deployment.impl.DeploymentImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link deployment.impl.DeploymentImpl#getJoinTables <em>Join Tables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentImpl extends MinimalEObjectImpl.Container implements Deployment {
	/**
   * The cached value of the '{@link #getMicroservices() <em>Microservices</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMicroservices()
   * @generated
   * @ordered
   */
	protected EList<Microservice> microservices;

	/**
   * The cached value of the '{@link #getTopics() <em>Topics</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTopics()
   * @generated
   * @ordered
   */
	protected EList<Topic> topics;

	/**
   * The cached value of the '{@link #getCliTool() <em>Cli Tool</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCliTool()
   * @generated
   * @ordered
   */
	protected CliTool cliTool;

	/**
   * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTables()
   * @generated
   * @ordered
   */
  protected EList<Table> tables;

  /**
   * The cached value of the '{@link #getJoinTables() <em>Join Tables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoinTables()
   * @generated
   * @ordered
   */
  protected EList<JoinTable> joinTables;

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected DeploymentImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return DeploymentPackage.Literals.DEPLOYMENT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Microservice> getMicroservices() {
    if (microservices == null) {
      microservices = new EObjectContainmentEList<Microservice>(Microservice.class, this, DeploymentPackage.DEPLOYMENT__MICROSERVICES);
    }
    return microservices;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Topic> getTopics() {
    if (topics == null) {
      topics = new EObjectContainmentEList<Topic>(Topic.class, this, DeploymentPackage.DEPLOYMENT__TOPICS);
    }
    return topics;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CliTool getCliTool() {
    return cliTool;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetCliTool(CliTool newCliTool, NotificationChain msgs) {
    CliTool oldCliTool = cliTool;
    cliTool = newCliTool;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYMENT__CLI_TOOL, oldCliTool, newCliTool);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setCliTool(CliTool newCliTool) {
    if (newCliTool != cliTool) {
      NotificationChain msgs = null;
      if (cliTool != null)
        msgs = ((InternalEObject)cliTool).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeploymentPackage.DEPLOYMENT__CLI_TOOL, null, msgs);
      if (newCliTool != null)
        msgs = ((InternalEObject)newCliTool).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeploymentPackage.DEPLOYMENT__CLI_TOOL, null, msgs);
      msgs = basicSetCliTool(newCliTool, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.DEPLOYMENT__CLI_TOOL, newCliTool, newCliTool));
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Table> getTables() {
    if (tables == null) {
      tables = new EObjectContainmentEList<Table>(Table.class, this, DeploymentPackage.DEPLOYMENT__TABLES);
    }
    return tables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JoinTable> getJoinTables() {
    if (joinTables == null) {
      joinTables = new EObjectContainmentEList<JoinTable>(JoinTable.class, this, DeploymentPackage.DEPLOYMENT__JOIN_TABLES);
    }
    return joinTables;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DeploymentPackage.DEPLOYMENT__MICROSERVICES:
        return ((InternalEList<?>)getMicroservices()).basicRemove(otherEnd, msgs);
      case DeploymentPackage.DEPLOYMENT__TOPICS:
        return ((InternalEList<?>)getTopics()).basicRemove(otherEnd, msgs);
      case DeploymentPackage.DEPLOYMENT__CLI_TOOL:
        return basicSetCliTool(null, msgs);
      case DeploymentPackage.DEPLOYMENT__TABLES:
        return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
      case DeploymentPackage.DEPLOYMENT__JOIN_TABLES:
        return ((InternalEList<?>)getJoinTables()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DeploymentPackage.DEPLOYMENT__MICROSERVICES:
        return getMicroservices();
      case DeploymentPackage.DEPLOYMENT__TOPICS:
        return getTopics();
      case DeploymentPackage.DEPLOYMENT__CLI_TOOL:
        return getCliTool();
      case DeploymentPackage.DEPLOYMENT__TABLES:
        return getTables();
      case DeploymentPackage.DEPLOYMENT__JOIN_TABLES:
        return getJoinTables();
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
      case DeploymentPackage.DEPLOYMENT__MICROSERVICES:
        getMicroservices().clear();
        getMicroservices().addAll((Collection<? extends Microservice>)newValue);
        return;
      case DeploymentPackage.DEPLOYMENT__TOPICS:
        getTopics().clear();
        getTopics().addAll((Collection<? extends Topic>)newValue);
        return;
      case DeploymentPackage.DEPLOYMENT__CLI_TOOL:
        setCliTool((CliTool)newValue);
        return;
      case DeploymentPackage.DEPLOYMENT__TABLES:
        getTables().clear();
        getTables().addAll((Collection<? extends Table>)newValue);
        return;
      case DeploymentPackage.DEPLOYMENT__JOIN_TABLES:
        getJoinTables().clear();
        getJoinTables().addAll((Collection<? extends JoinTable>)newValue);
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
      case DeploymentPackage.DEPLOYMENT__MICROSERVICES:
        getMicroservices().clear();
        return;
      case DeploymentPackage.DEPLOYMENT__TOPICS:
        getTopics().clear();
        return;
      case DeploymentPackage.DEPLOYMENT__CLI_TOOL:
        setCliTool((CliTool)null);
        return;
      case DeploymentPackage.DEPLOYMENT__TABLES:
        getTables().clear();
        return;
      case DeploymentPackage.DEPLOYMENT__JOIN_TABLES:
        getJoinTables().clear();
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
      case DeploymentPackage.DEPLOYMENT__MICROSERVICES:
        return microservices != null && !microservices.isEmpty();
      case DeploymentPackage.DEPLOYMENT__TOPICS:
        return topics != null && !topics.isEmpty();
      case DeploymentPackage.DEPLOYMENT__CLI_TOOL:
        return cliTool != null;
      case DeploymentPackage.DEPLOYMENT__TABLES:
        return tables != null && !tables.isEmpty();
      case DeploymentPackage.DEPLOYMENT__JOIN_TABLES:
        return joinTables != null && !joinTables.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DeploymentImpl
