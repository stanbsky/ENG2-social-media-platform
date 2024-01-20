/**
 */
package deployment.impl;

import deployment.DeploymentPackage;
import deployment.HttpResponse;
import deployment.HttpResponseCode;
import deployment.Model;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Http Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deployment.impl.HttpResponseImpl#getResponseCode <em>Response Code</em>}</li>
 *   <li>{@link deployment.impl.HttpResponseImpl#getResponseBody <em>Response Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HttpResponseImpl extends MinimalEObjectImpl.Container implements HttpResponse {
	/**
   * The default value of the '{@link #getResponseCode() <em>Response Code</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getResponseCode()
   * @generated
   * @ordered
   */
	protected static final HttpResponseCode RESPONSE_CODE_EDEFAULT = HttpResponseCode.OK;

	/**
   * The cached value of the '{@link #getResponseCode() <em>Response Code</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getResponseCode()
   * @generated
   * @ordered
   */
	protected HttpResponseCode responseCode = RESPONSE_CODE_EDEFAULT;

	/**
   * The default value of the '{@link #getResponseBody() <em>Response Body</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getResponseBody()
   * @generated
   * @ordered
   */
	protected static final Model RESPONSE_BODY_EDEFAULT = Model.MLONG;

	/**
   * The cached value of the '{@link #getResponseBody() <em>Response Body</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getResponseBody()
   * @generated
   * @ordered
   */
	protected Model responseBody = RESPONSE_BODY_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected HttpResponseImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return DeploymentPackage.Literals.HTTP_RESPONSE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public HttpResponseCode getResponseCode() {
    return responseCode;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setResponseCode(HttpResponseCode newResponseCode) {
    HttpResponseCode oldResponseCode = responseCode;
    responseCode = newResponseCode == null ? RESPONSE_CODE_EDEFAULT : newResponseCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.HTTP_RESPONSE__RESPONSE_CODE, oldResponseCode, responseCode));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Model getResponseBody() {
    return responseBody;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setResponseBody(Model newResponseBody) {
    Model oldResponseBody = responseBody;
    responseBody = newResponseBody == null ? RESPONSE_BODY_EDEFAULT : newResponseBody;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.HTTP_RESPONSE__RESPONSE_BODY, oldResponseBody, responseBody));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DeploymentPackage.HTTP_RESPONSE__RESPONSE_CODE:
        return getResponseCode();
      case DeploymentPackage.HTTP_RESPONSE__RESPONSE_BODY:
        return getResponseBody();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case DeploymentPackage.HTTP_RESPONSE__RESPONSE_CODE:
        setResponseCode((HttpResponseCode)newValue);
        return;
      case DeploymentPackage.HTTP_RESPONSE__RESPONSE_BODY:
        setResponseBody((Model)newValue);
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
      case DeploymentPackage.HTTP_RESPONSE__RESPONSE_CODE:
        setResponseCode(RESPONSE_CODE_EDEFAULT);
        return;
      case DeploymentPackage.HTTP_RESPONSE__RESPONSE_BODY:
        setResponseBody(RESPONSE_BODY_EDEFAULT);
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
      case DeploymentPackage.HTTP_RESPONSE__RESPONSE_CODE:
        return responseCode != RESPONSE_CODE_EDEFAULT;
      case DeploymentPackage.HTTP_RESPONSE__RESPONSE_BODY:
        return responseBody != RESPONSE_BODY_EDEFAULT;
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
    result.append(" (responseCode: ");
    result.append(responseCode);
    result.append(", responseBody: ");
    result.append(responseBody);
    result.append(')');
    return result.toString();
  }

} //HttpResponseImpl
