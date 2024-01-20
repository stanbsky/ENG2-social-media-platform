/**
 */
package deployment.impl;

import deployment.Command;
import deployment.DeploymentPackage;
import deployment.Endpoint;
import deployment.Event;
import deployment.HttpMethod;
import deployment.HttpResponse;
import deployment.Parameter;

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
 * An implementation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deployment.impl.EndpointImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link deployment.impl.EndpointImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link deployment.impl.EndpointImpl#getTransactional <em>Transactional</em>}</li>
 *   <li>{@link deployment.impl.EndpointImpl#getEmittedEvents <em>Emitted Events</em>}</li>
 *   <li>{@link deployment.impl.EndpointImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link deployment.impl.EndpointImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link deployment.impl.EndpointImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link deployment.impl.EndpointImpl#getClientCommand <em>Client Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndpointImpl extends MinimalEObjectImpl.Container implements Endpoint {
	/**
   * The default value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMethodName()
   * @generated
   * @ordered
   */
	protected static final String METHOD_NAME_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMethodName()
   * @generated
   * @ordered
   */
	protected String methodName = METHOD_NAME_EDEFAULT;

	/**
   * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUri()
   * @generated
   * @ordered
   */
	protected static final String URI_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getUri()
   * @generated
   * @ordered
   */
	protected String uri = URI_EDEFAULT;

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
   * The cached value of the '{@link #getEmittedEvents() <em>Emitted Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEmittedEvents()
   * @generated
   * @ordered
   */
	protected EList<Event> emittedEvents;

	/**
   * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
	protected static final HttpMethod METHOD_EDEFAULT = HttpMethod.GET;

	/**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
	protected HttpMethod method = METHOD_EDEFAULT;

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
   * The cached value of the '{@link #getResponse() <em>Response</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getResponse()
   * @generated
   * @ordered
   */
	protected EList<HttpResponse> response;

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
	protected EndpointImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return DeploymentPackage.Literals.ENDPOINT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getMethodName() {
    return methodName;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMethodName(String newMethodName) {
    String oldMethodName = methodName;
    methodName = newMethodName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.ENDPOINT__METHOD_NAME, oldMethodName, methodName));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getUri() {
    return uri;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setUri(String newUri) {
    String oldUri = uri;
    uri = newUri;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.ENDPOINT__URI, oldUri, uri));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.ENDPOINT__TRANSACTIONAL, oldTransactional, transactional));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Event> getEmittedEvents() {
    if (emittedEvents == null) {
      emittedEvents = new EObjectContainmentEList<Event>(Event.class, this, DeploymentPackage.ENDPOINT__EMITTED_EVENTS);
    }
    return emittedEvents;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public HttpMethod getMethod() {
    return method;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMethod(HttpMethod newMethod) {
    HttpMethod oldMethod = method;
    method = newMethod == null ? METHOD_EDEFAULT : newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.ENDPOINT__METHOD, oldMethod, method));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Parameter> getParameters() {
    if (parameters == null) {
      parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, DeploymentPackage.ENDPOINT__PARAMETERS);
    }
    return parameters;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<HttpResponse> getResponse() {
    if (response == null) {
      response = new EObjectContainmentEList<HttpResponse>(HttpResponse.class, this, DeploymentPackage.ENDPOINT__RESPONSE);
    }
    return response;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPackage.ENDPOINT__CLIENT_COMMAND, oldClientCommand, clientCommand));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.ENDPOINT__CLIENT_COMMAND, oldClientCommand, clientCommand));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DeploymentPackage.ENDPOINT__EMITTED_EVENTS:
        return ((InternalEList<?>)getEmittedEvents()).basicRemove(otherEnd, msgs);
      case DeploymentPackage.ENDPOINT__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case DeploymentPackage.ENDPOINT__RESPONSE:
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
      case DeploymentPackage.ENDPOINT__METHOD_NAME:
        return getMethodName();
      case DeploymentPackage.ENDPOINT__URI:
        return getUri();
      case DeploymentPackage.ENDPOINT__TRANSACTIONAL:
        return getTransactional();
      case DeploymentPackage.ENDPOINT__EMITTED_EVENTS:
        return getEmittedEvents();
      case DeploymentPackage.ENDPOINT__METHOD:
        return getMethod();
      case DeploymentPackage.ENDPOINT__PARAMETERS:
        return getParameters();
      case DeploymentPackage.ENDPOINT__RESPONSE:
        return getResponse();
      case DeploymentPackage.ENDPOINT__CLIENT_COMMAND:
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
      case DeploymentPackage.ENDPOINT__METHOD_NAME:
        setMethodName((String)newValue);
        return;
      case DeploymentPackage.ENDPOINT__URI:
        setUri((String)newValue);
        return;
      case DeploymentPackage.ENDPOINT__TRANSACTIONAL:
        setTransactional((Boolean)newValue);
        return;
      case DeploymentPackage.ENDPOINT__EMITTED_EVENTS:
        getEmittedEvents().clear();
        getEmittedEvents().addAll((Collection<? extends Event>)newValue);
        return;
      case DeploymentPackage.ENDPOINT__METHOD:
        setMethod((HttpMethod)newValue);
        return;
      case DeploymentPackage.ENDPOINT__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameter>)newValue);
        return;
      case DeploymentPackage.ENDPOINT__RESPONSE:
        getResponse().clear();
        getResponse().addAll((Collection<? extends HttpResponse>)newValue);
        return;
      case DeploymentPackage.ENDPOINT__CLIENT_COMMAND:
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
      case DeploymentPackage.ENDPOINT__METHOD_NAME:
        setMethodName(METHOD_NAME_EDEFAULT);
        return;
      case DeploymentPackage.ENDPOINT__URI:
        setUri(URI_EDEFAULT);
        return;
      case DeploymentPackage.ENDPOINT__TRANSACTIONAL:
        setTransactional(TRANSACTIONAL_EDEFAULT);
        return;
      case DeploymentPackage.ENDPOINT__EMITTED_EVENTS:
        getEmittedEvents().clear();
        return;
      case DeploymentPackage.ENDPOINT__METHOD:
        setMethod(METHOD_EDEFAULT);
        return;
      case DeploymentPackage.ENDPOINT__PARAMETERS:
        getParameters().clear();
        return;
      case DeploymentPackage.ENDPOINT__RESPONSE:
        getResponse().clear();
        return;
      case DeploymentPackage.ENDPOINT__CLIENT_COMMAND:
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
      case DeploymentPackage.ENDPOINT__METHOD_NAME:
        return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
      case DeploymentPackage.ENDPOINT__URI:
        return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
      case DeploymentPackage.ENDPOINT__TRANSACTIONAL:
        return TRANSACTIONAL_EDEFAULT == null ? transactional != null : !TRANSACTIONAL_EDEFAULT.equals(transactional);
      case DeploymentPackage.ENDPOINT__EMITTED_EVENTS:
        return emittedEvents != null && !emittedEvents.isEmpty();
      case DeploymentPackage.ENDPOINT__METHOD:
        return method != METHOD_EDEFAULT;
      case DeploymentPackage.ENDPOINT__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case DeploymentPackage.ENDPOINT__RESPONSE:
        return response != null && !response.isEmpty();
      case DeploymentPackage.ENDPOINT__CLIENT_COMMAND:
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
    result.append(" (methodName: ");
    result.append(methodName);
    result.append(", uri: ");
    result.append(uri);
    result.append(", transactional: ");
    result.append(transactional);
    result.append(", method: ");
    result.append(method);
    result.append(')');
    return result.toString();
  }

} //EndpointImpl
