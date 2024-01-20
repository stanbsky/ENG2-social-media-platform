/**
 */
package deployment.impl;

import deployment.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentFactoryImpl extends EFactoryImpl implements DeploymentFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static DeploymentFactory init() {
    try {
      DeploymentFactory theDeploymentFactory = (DeploymentFactory)EPackage.Registry.INSTANCE.getEFactory(DeploymentPackage.eNS_URI);
      if (theDeploymentFactory != null) {
        return theDeploymentFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DeploymentFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DeploymentFactoryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case DeploymentPackage.DEPLOYMENT: return createDeployment();
      case DeploymentPackage.MICROSERVICE: return createMicroservice();
      case DeploymentPackage.JAVA_CLASS: return createJavaClass();
      case DeploymentPackage.CONTROLLER: return createController();
      case DeploymentPackage.ENDPOINT: return createEndpoint();
      case DeploymentPackage.PARAMETER: return createParameter();
      case DeploymentPackage.HTTP_RESPONSE: return createHttpResponse();
      case DeploymentPackage.CLI_TOOL: return createCliTool();
      case DeploymentPackage.COMMAND: return createCommand();
      case DeploymentPackage.PRODUCER: return createProducer();
      case DeploymentPackage.TOPIC: return createTopic();
      case DeploymentPackage.EVENT: return createEvent();
      case DeploymentPackage.TABLE: return createTable();
      case DeploymentPackage.COLUMN: return createColumn();
      case DeploymentPackage.FOREIGN_KEY: return createForeignKey();
      case DeploymentPackage.JOIN_TABLE: return createJoinTable();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID()) {
      case DeploymentPackage.HTTP_METHOD:
        return createHttpMethodFromString(eDataType, initialValue);
      case DeploymentPackage.HTTP_RESPONSE_CODE:
        return createHttpResponseCodeFromString(eDataType, initialValue);
      case DeploymentPackage.MODEL:
        return createModelFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID()) {
      case DeploymentPackage.HTTP_METHOD:
        return convertHttpMethodToString(eDataType, instanceValue);
      case DeploymentPackage.HTTP_RESPONSE_CODE:
        return convertHttpResponseCodeToString(eDataType, instanceValue);
      case DeploymentPackage.MODEL:
        return convertModelToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Deployment createDeployment() {
    DeploymentImpl deployment = new DeploymentImpl();
    return deployment;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Microservice createMicroservice() {
    MicroserviceImpl microservice = new MicroserviceImpl();
    return microservice;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public JavaClass createJavaClass() {
    JavaClassImpl javaClass = new JavaClassImpl();
    return javaClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Controller createController() {
    ControllerImpl controller = new ControllerImpl();
    return controller;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Endpoint createEndpoint() {
    EndpointImpl endpoint = new EndpointImpl();
    return endpoint;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Parameter createParameter() {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public HttpResponse createHttpResponse() {
    HttpResponseImpl httpResponse = new HttpResponseImpl();
    return httpResponse;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public CliTool createCliTool() {
    CliToolImpl cliTool = new CliToolImpl();
    return cliTool;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Command createCommand() {
    CommandImpl command = new CommandImpl();
    return command;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Producer createProducer() {
    ProducerImpl producer = new ProducerImpl();
    return producer;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Topic createTopic() {
    TopicImpl topic = new TopicImpl();
    return topic;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Event createEvent() {
    EventImpl event = new EventImpl();
    return event;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Table createTable() {
    TableImpl table = new TableImpl();
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Column createColumn() {
    ColumnImpl column = new ColumnImpl();
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForeignKey createForeignKey() {
    ForeignKeyImpl foreignKey = new ForeignKeyImpl();
    return foreignKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinTable createJoinTable() {
    JoinTableImpl joinTable = new JoinTableImpl();
    return joinTable;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public HttpMethod createHttpMethodFromString(EDataType eDataType, String initialValue) {
    HttpMethod result = HttpMethod.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertHttpMethodToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public HttpResponseCode createHttpResponseCodeFromString(EDataType eDataType, String initialValue) {
    HttpResponseCode result = HttpResponseCode.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertHttpResponseCodeToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Model createModelFromString(EDataType eDataType, String initialValue) {
    Model result = Model.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertModelToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DeploymentPackage getDeploymentPackage() {
    return (DeploymentPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static DeploymentPackage getPackage() {
    return DeploymentPackage.eINSTANCE;
  }

} //DeploymentFactoryImpl
