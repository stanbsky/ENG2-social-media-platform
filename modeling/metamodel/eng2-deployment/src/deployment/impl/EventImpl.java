/**
 */
package deployment.impl;

import deployment.DeploymentPackage;
import deployment.Event;
import deployment.Model;
import deployment.Topic;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deployment.impl.EventImpl#getKey <em>Key</em>}</li>
 *   <li>{@link deployment.impl.EventImpl#getValue <em>Value</em>}</li>
 *   <li>{@link deployment.impl.EventImpl#getTopic <em>Topic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event {
	/**
   * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
	protected static final Model KEY_EDEFAULT = Model.MLONG;

	/**
   * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
	protected Model key = KEY_EDEFAULT;

	/**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
	protected static final Model VALUE_EDEFAULT = Model.MLONG;

	/**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
	protected Model value = VALUE_EDEFAULT;

	/**
   * The cached value of the '{@link #getTopic() <em>Topic</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTopic()
   * @generated
   * @ordered
   */
	protected Topic topic;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EventImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return DeploymentPackage.Literals.EVENT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Model getKey() {
    return key;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setKey(Model newKey) {
    Model oldKey = key;
    key = newKey == null ? KEY_EDEFAULT : newKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.EVENT__KEY, oldKey, key));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Model getValue() {
    return value;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setValue(Model newValue) {
    Model oldValue = value;
    value = newValue == null ? VALUE_EDEFAULT : newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.EVENT__VALUE, oldValue, value));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Topic getTopic() {
    if (topic != null && topic.eIsProxy()) {
      InternalEObject oldTopic = (InternalEObject)topic;
      topic = (Topic)eResolveProxy(oldTopic);
      if (topic != oldTopic) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPackage.EVENT__TOPIC, oldTopic, topic));
      }
    }
    return topic;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Topic basicGetTopic() {
    return topic;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTopic(Topic newTopic) {
    Topic oldTopic = topic;
    topic = newTopic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPackage.EVENT__TOPIC, oldTopic, topic));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DeploymentPackage.EVENT__KEY:
        return getKey();
      case DeploymentPackage.EVENT__VALUE:
        return getValue();
      case DeploymentPackage.EVENT__TOPIC:
        if (resolve) return getTopic();
        return basicGetTopic();
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
      case DeploymentPackage.EVENT__KEY:
        setKey((Model)newValue);
        return;
      case DeploymentPackage.EVENT__VALUE:
        setValue((Model)newValue);
        return;
      case DeploymentPackage.EVENT__TOPIC:
        setTopic((Topic)newValue);
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
      case DeploymentPackage.EVENT__KEY:
        setKey(KEY_EDEFAULT);
        return;
      case DeploymentPackage.EVENT__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case DeploymentPackage.EVENT__TOPIC:
        setTopic((Topic)null);
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
      case DeploymentPackage.EVENT__KEY:
        return key != KEY_EDEFAULT;
      case DeploymentPackage.EVENT__VALUE:
        return value != VALUE_EDEFAULT;
      case DeploymentPackage.EVENT__TOPIC:
        return topic != null;
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
    result.append(" (key: ");
    result.append(key);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //EventImpl
