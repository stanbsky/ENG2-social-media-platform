/**
 */
package deployment.impl;

import deployment.Command;
import deployment.DeploymentPackage;
import deployment.Method;
import deployment.Parameter;
import deployment.Request;
import deployment.Response;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deployment.impl.MethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link deployment.impl.MethodImpl#getTransactional <em>Transactional</em>}</li>
 *   <li>{@link deployment.impl.MethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link deployment.impl.MethodImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link deployment.impl.MethodImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link deployment.impl.MethodImpl#getProduced <em>Produced</em>}</li>
 *   <li>{@link deployment.impl.MethodImpl#getClientCommand <em>Client Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends MinimalEObjectImpl.Container implements Method {
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTransactional() <em>Transactional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransactional()
   * @generated
   * @ordered
   */
  protected static final Boolean TRANSACTIONAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTransactional() <em>Transactional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransactional()
   * @generated
   * @ordered
   */
  protected Boolean transactional = TRANSACTIONAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<Parameter> parameters;

  /**
   * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequest()
   * @generated
   * @ordered
   */
  protected Request request;

  /**
   * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponse()
   * @generated
   * @ordered
   */
  protected EList<Response> response;

  /**
   * The cached value of the '{@link #getProduced() <em>Produced</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProduced()
   * @generated
   * @ordered
   */
  protected EList<Topic> produced;

  /**
   * The cached value of the '{@link #getClientCommand() <em>Client Command</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClientCommand()
   * @generated
   * @ordered
   */
  protected Command clientCommand;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return DeploymentPackage.Literals.METHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.METHOD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean getTransactional() {
    return transactional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransactional(Boolean newTransactional) {
    Boolean oldTransactional = transactional;
    transactional = newTransactional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.METHOD__TRANSACTIONAL, oldTransactional, transactional));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParameters() {
    if (parameters == null) {
      parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, DeploymentPackage.METHOD__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Request getRequest() {
    return request;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequest(Request newRequest, NotificationChain msgs) {
    Request oldRequest = request;
    request = newRequest;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeploymentPackage.METHOD__REQUEST, oldRequest, newRequest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequest(Request newRequest) {
    if (newRequest != request) {
      NotificationChain msgs = null;
      if (request != null)
        msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeploymentPackage.METHOD__REQUEST, null, msgs);
      if (newRequest != null)
        msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeploymentPackage.METHOD__REQUEST, null, msgs);
      msgs = basicSetRequest(newRequest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.METHOD__REQUEST, newRequest, newRequest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Response> getResponse() {
    if (response == null) {
      response = new EObjectContainmentEList<Response>(Response.class, this, DeploymentPackage.METHOD__RESPONSE);
    }
    return response;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Topic> getProduced() {
    if (produced == null) {
      produced = new EObjectResolvingEList<Topic>(Topic.class, this, DeploymentPackage.METHOD__PRODUCED);
    }
    return produced;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command getClientCommand() {
    if (clientCommand != null && clientCommand.eIsProxy()) {
      InternalEObject oldClientCommand = (InternalEObject)clientCommand;
      clientCommand = (Command)eResolveProxy(oldClientCommand);
      if (clientCommand != oldClientCommand) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPackage.METHOD__CLIENT_COMMAND, oldClientCommand, clientCommand));
      }
    }
    return clientCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command basicGetClientCommand() {
    return clientCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClientCommand(Command newClientCommand) {
    Command oldClientCommand = clientCommand;
    clientCommand = newClientCommand;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.METHOD__CLIENT_COMMAND, oldClientCommand, clientCommand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DeploymentPackage.METHOD__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case DeploymentPackage.METHOD__REQUEST:
        return basicSetRequest(null, msgs);
      case DeploymentPackage.METHOD__RESPONSE:
        return ((InternalEList<?>)getResponse()).basicRemove(otherEnd, msgs);
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
      case DeploymentPackage.METHOD__NAME:
        return getName();
      case DeploymentPackage.METHOD__TRANSACTIONAL:
        return getTransactional();
      case DeploymentPackage.METHOD__PARAMETERS:
        return getParameters();
      case DeploymentPackage.METHOD__REQUEST:
        return getRequest();
      case DeploymentPackage.METHOD__RESPONSE:
        return getResponse();
      case DeploymentPackage.METHOD__PRODUCED:
        return getProduced();
      case DeploymentPackage.METHOD__CLIENT_COMMAND:
        if (resolve) return getClientCommand();
        return basicGetClientCommand();
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
      case DeploymentPackage.METHOD__NAME:
        setName((String)newValue);
        return;
      case DeploymentPackage.METHOD__TRANSACTIONAL:
        setTransactional((Boolean)newValue);
        return;
      case DeploymentPackage.METHOD__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameter>)newValue);
        return;
      case DeploymentPackage.METHOD__REQUEST:
        setRequest((Request)newValue);
        return;
      case DeploymentPackage.METHOD__RESPONSE:
        getResponse().clear();
        getResponse().addAll((Collection<? extends Response>)newValue);
        return;
      case DeploymentPackage.METHOD__PRODUCED:
        getProduced().clear();
        getProduced().addAll((Collection<? extends Topic>)newValue);
        return;
      case DeploymentPackage.METHOD__CLIENT_COMMAND:
        setClientCommand((Command)newValue);
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
      case DeploymentPackage.METHOD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DeploymentPackage.METHOD__TRANSACTIONAL:
        setTransactional(TRANSACTIONAL_EDEFAULT);
        return;
      case DeploymentPackage.METHOD__PARAMETERS:
        getParameters().clear();
        return;
      case DeploymentPackage.METHOD__REQUEST:
        setRequest((Request)null);
        return;
      case DeploymentPackage.METHOD__RESPONSE:
        getResponse().clear();
        return;
      case DeploymentPackage.METHOD__PRODUCED:
        getProduced().clear();
        return;
      case DeploymentPackage.METHOD__CLIENT_COMMAND:
        setClientCommand((Command)null);
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
      case DeploymentPackage.METHOD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DeploymentPackage.METHOD__TRANSACTIONAL:
        return TRANSACTIONAL_EDEFAULT == null ? transactional != null : !TRANSACTIONAL_EDEFAULT.equals(transactional);
      case DeploymentPackage.METHOD__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case DeploymentPackage.METHOD__REQUEST:
        return request != null;
      case DeploymentPackage.METHOD__RESPONSE:
        return response != null && !response.isEmpty();
      case DeploymentPackage.METHOD__PRODUCED:
        return produced != null && !produced.isEmpty();
      case DeploymentPackage.METHOD__CLIENT_COMMAND:
        return clientCommand != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", transactional: ");
    result.append(transactional);
    result.append(')');
    return result.toString();
  }

} //MethodImpl
