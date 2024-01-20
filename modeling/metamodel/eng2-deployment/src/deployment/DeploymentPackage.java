/**
 */
package deployment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see deployment.DeploymentFactory
 * @model kind="package"
 * @generated
 */
public interface DeploymentPackage extends EPackage {
	/**
   * The package name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNAME = "deployment";

	/**
   * The package namespace URI.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_URI = "https://Y3884010";

	/**
   * The package namespace name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_PREFIX = "";

	/**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	DeploymentPackage eINSTANCE = deployment.impl.DeploymentPackageImpl.init();

	/**
   * The meta object id for the '{@link deployment.impl.DeploymentImpl <em>Deployment</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see deployment.impl.DeploymentImpl
   * @see deployment.impl.DeploymentPackageImpl#getDeployment()
   * @generated
   */
	int DEPLOYMENT = 0;

	/**
   * The feature id for the '<em><b>Microservices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DEPLOYMENT__MICROSERVICES = 0;

	/**
   * The feature id for the '<em><b>Topics</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DEPLOYMENT__TOPICS = 1;

	/**
   * The feature id for the '<em><b>Cli Tool</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DEPLOYMENT__CLI_TOOL = 2;

	/**
   * The feature id for the '<em><b>Tables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__TABLES = 3;

  /**
   * The feature id for the '<em><b>Join Tables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__JOIN_TABLES = 4;

  /**
   * The number of structural features of the '<em>Deployment</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DEPLOYMENT_FEATURE_COUNT = 5;

	/**
   * The number of operations of the '<em>Deployment</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DEPLOYMENT_OPERATION_COUNT = 0;

	/**
   * The meta object id for the '{@link deployment.impl.MicroserviceImpl <em>Microservice</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see deployment.impl.MicroserviceImpl
   * @see deployment.impl.DeploymentPackageImpl#getMicroservice()
   * @generated
   */
	int MICROSERVICE = 1;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MICROSERVICE__NAME = 0;

	/**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MICROSERVICE__PORT = 1;

	/**
   * The feature id for the '<em><b>Controllers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MICROSERVICE__CONTROLLERS = 2;

	/**
   * The feature id for the '<em><b>Producers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MICROSERVICE__PRODUCERS = 3;

	/**
   * The number of structural features of the '<em>Microservice</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MICROSERVICE_FEATURE_COUNT = 4;

	/**
   * The number of operations of the '<em>Microservice</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MICROSERVICE_OPERATION_COUNT = 0;

	/**
   * The meta object id for the '{@link deployment.impl.JavaClassImpl <em>Java Class</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see deployment.impl.JavaClassImpl
   * @see deployment.impl.DeploymentPackageImpl#getJavaClass()
   * @generated
   */
	int JAVA_CLASS = 2;

	/**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int JAVA_CLASS__CLASS_NAME = 0;

	/**
   * The feature id for the '<em><b>Serdeable</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int JAVA_CLASS__SERDEABLE = 1;

	/**
   * The number of structural features of the '<em>Java Class</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int JAVA_CLASS_FEATURE_COUNT = 2;

	/**
   * The number of operations of the '<em>Java Class</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int JAVA_CLASS_OPERATION_COUNT = 0;

	/**
   * The meta object id for the '{@link deployment.impl.ControllerImpl <em>Controller</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see deployment.impl.ControllerImpl
   * @see deployment.impl.DeploymentPackageImpl#getController()
   * @generated
   */
	int CONTROLLER = 3;

	/**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CONTROLLER__CLASS_NAME = JAVA_CLASS__CLASS_NAME;

	/**
   * The feature id for the '<em><b>Serdeable</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CONTROLLER__SERDEABLE = JAVA_CLASS__SERDEABLE;

	/**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CONTROLLER__URI = JAVA_CLASS_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER__METHODS = JAVA_CLASS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Controller</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CONTROLLER_FEATURE_COUNT = JAVA_CLASS_FEATURE_COUNT + 2;

	/**
   * The number of operations of the '<em>Controller</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CONTROLLER_OPERATION_COUNT = JAVA_CLASS_OPERATION_COUNT + 0;

	/**
   * The meta object id for the '{@link deployment.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see deployment.impl.MethodImpl
   * @see deployment.impl.DeploymentPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = 0;

  /**
   * The feature id for the '<em><b>Transactional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__TRANSACTIONAL = 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__PARAMETERS = 2;

  /**
   * The feature id for the '<em><b>Request</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__REQUEST = 3;

  /**
   * The feature id for the '<em><b>Response</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__RESPONSE = 4;

  /**
   * The feature id for the '<em><b>Produced</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__PRODUCED = 5;

  /**
   * The feature id for the '<em><b>Client Command</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__CLIENT_COMMAND = 6;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = 7;

  /**
   * The number of operations of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link deployment.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see deployment.impl.ParameterImpl
   * @see deployment.impl.DeploymentPackageImpl#getParameter()
   * @generated
   */
	int PARAMETER = 5;

	/**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PARAMETER__KEY = 0;

	/**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PARAMETER__VALUE = 1;

	/**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
   * The number of operations of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
   * The meta object id for the '{@link deployment.impl.RequestImpl <em>Request</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see deployment.impl.RequestImpl
   * @see deployment.impl.DeploymentPackageImpl#getRequest()
   * @generated
   */
  int REQUEST = 6;

  /**
   * The feature id for the '<em><b>Verb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST__VERB = 0;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST__URI = 1;

  /**
   * The number of structural features of the '<em>Request</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Request</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUEST_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link deployment.impl.ResponseImpl <em>Response</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see deployment.impl.ResponseImpl
   * @see deployment.impl.DeploymentPackageImpl#getResponse()
   * @generated
   */
  int RESPONSE = 7;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE__CODE = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE__BODY = 1;

  /**
   * The number of structural features of the '<em>Response</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Response</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link deployment.impl.CliToolImpl <em>Cli Tool</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see deployment.impl.CliToolImpl
   * @see deployment.impl.DeploymentPackageImpl#getCliTool()
   * @generated
   */
	int CLI_TOOL = 8;

	/**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLI_TOOL__CLASS_NAME = JAVA_CLASS__CLASS_NAME;

	/**
   * The feature id for the '<em><b>Serdeable</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLI_TOOL__SERDEABLE = JAVA_CLASS__SERDEABLE;

	/**
   * The feature id for the '<em><b>Clients</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLI_TOOL__CLIENTS = JAVA_CLASS_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Cli Tool</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLI_TOOL_FEATURE_COUNT = JAVA_CLASS_FEATURE_COUNT + 1;

	/**
   * The number of operations of the '<em>Cli Tool</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLI_TOOL_OPERATION_COUNT = JAVA_CLASS_OPERATION_COUNT + 0;

	/**
   * The meta object id for the '{@link deployment.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see deployment.impl.CommandImpl
   * @see deployment.impl.DeploymentPackageImpl#getCommand()
   * @generated
   */
	int COMMAND = 9;

	/**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COMMAND__CLASS_NAME = JAVA_CLASS__CLASS_NAME;

	/**
   * The feature id for the '<em><b>Serdeable</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COMMAND__SERDEABLE = JAVA_CLASS__SERDEABLE;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COMMAND__NAME = JAVA_CLASS_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COMMAND__DESCRIPTION = JAVA_CLASS_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COMMAND_FEATURE_COUNT = JAVA_CLASS_FEATURE_COUNT + 2;

	/**
   * The number of operations of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COMMAND_OPERATION_COUNT = JAVA_CLASS_OPERATION_COUNT + 0;

	/**
   * The meta object id for the '{@link deployment.impl.ProducerImpl <em>Producer</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see deployment.impl.ProducerImpl
   * @see deployment.impl.DeploymentPackageImpl#getProducer()
   * @generated
   */
	int PRODUCER = 10;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PRODUCER__NAME = 0;

	/**
   * The feature id for the '<em><b>Topic</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PRODUCER__TOPIC = 1;

	/**
   * The number of structural features of the '<em>Producer</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PRODUCER_FEATURE_COUNT = 2;

	/**
   * The number of operations of the '<em>Producer</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PRODUCER_OPERATION_COUNT = 0;

	/**
   * The meta object id for the '{@link deployment.impl.TopicImpl <em>Topic</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see deployment.impl.TopicImpl
   * @see deployment.impl.DeploymentPackageImpl#getTopic()
   * @generated
   */
	int TOPIC = 11;

	/**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TOPIC__NAME = 0;

	/**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TOPIC__KEY = 1;

	/**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TOPIC__VALUE = 2;

	/**
   * The number of structural features of the '<em>Topic</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TOPIC_FEATURE_COUNT = 3;

	/**
   * The number of operations of the '<em>Topic</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TOPIC_OPERATION_COUNT = 0;

	/**
   * The meta object id for the '{@link deployment.impl.TableImpl <em>Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see deployment.impl.TableImpl
   * @see deployment.impl.DeploymentPackageImpl#getTable()
   * @generated
   */
  int TABLE = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__COLUMNS = 1;

  /**
   * The number of structural features of the '<em>Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link deployment.impl.ColumnImpl <em>Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see deployment.impl.ColumnImpl
   * @see deployment.impl.DeploymentPackageImpl#getColumn()
   * @generated
   */
  int COLUMN = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__TYPE = 1;

  /**
   * The number of structural features of the '<em>Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link deployment.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see deployment.impl.ForeignKeyImpl
   * @see deployment.impl.DeploymentPackageImpl#getForeignKey()
   * @generated
   */
  int FOREIGN_KEY = 14;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Destination</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY__DESTINATION = 1;

  /**
   * The number of structural features of the '<em>Foreign Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Foreign Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link deployment.impl.JoinTableImpl <em>Join Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see deployment.impl.JoinTableImpl
   * @see deployment.impl.DeploymentPackageImpl#getJoinTable()
   * @generated
   */
  int JOIN_TABLE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TABLE__NAME = TABLE__NAME;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TABLE__COLUMNS = TABLE__COLUMNS;

  /**
   * The number of structural features of the '<em>Join Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TABLE_FEATURE_COUNT = TABLE_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Join Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TABLE_OPERATION_COUNT = TABLE_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link deployment.HttpVerb <em>Http Verb</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see deployment.HttpVerb
   * @see deployment.impl.DeploymentPackageImpl#getHttpVerb()
   * @generated
   */
  int HTTP_VERB = 16;

  /**
   * The meta object id for the '{@link deployment.HttpCode <em>Http Code</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see deployment.HttpCode
   * @see deployment.impl.DeploymentPackageImpl#getHttpCode()
   * @generated
   */
  int HTTP_CODE = 17;

  /**
   * The meta object id for the '{@link deployment.Model <em>Model</em>}' enum.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see deployment.Model
   * @see deployment.impl.DeploymentPackageImpl#getModel()
   * @generated
   */
	int MODEL = 18;


	/**
   * Returns the meta object for class '{@link deployment.Deployment <em>Deployment</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deployment</em>'.
   * @see deployment.Deployment
   * @generated
   */
	EClass getDeployment();

	/**
   * Returns the meta object for the containment reference list '{@link deployment.Deployment#getMicroservices <em>Microservices</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Microservices</em>'.
   * @see deployment.Deployment#getMicroservices()
   * @see #getDeployment()
   * @generated
   */
	EReference getDeployment_Microservices();

	/**
   * Returns the meta object for the containment reference list '{@link deployment.Deployment#getTopics <em>Topics</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Topics</em>'.
   * @see deployment.Deployment#getTopics()
   * @see #getDeployment()
   * @generated
   */
	EReference getDeployment_Topics();

	/**
   * Returns the meta object for the containment reference '{@link deployment.Deployment#getCliTool <em>Cli Tool</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cli Tool</em>'.
   * @see deployment.Deployment#getCliTool()
   * @see #getDeployment()
   * @generated
   */
	EReference getDeployment_CliTool();

	/**
   * Returns the meta object for the containment reference list '{@link deployment.Deployment#getTables <em>Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tables</em>'.
   * @see deployment.Deployment#getTables()
   * @see #getDeployment()
   * @generated
   */
  EReference getDeployment_Tables();

  /**
   * Returns the meta object for the containment reference list '{@link deployment.Deployment#getJoinTables <em>Join Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Join Tables</em>'.
   * @see deployment.Deployment#getJoinTables()
   * @see #getDeployment()
   * @generated
   */
  EReference getDeployment_JoinTables();

  /**
   * Returns the meta object for class '{@link deployment.Microservice <em>Microservice</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Microservice</em>'.
   * @see deployment.Microservice
   * @generated
   */
	EClass getMicroservice();

	/**
   * Returns the meta object for the attribute '{@link deployment.Microservice#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see deployment.Microservice#getName()
   * @see #getMicroservice()
   * @generated
   */
	EAttribute getMicroservice_Name();

	/**
   * Returns the meta object for the attribute '{@link deployment.Microservice#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see deployment.Microservice#getPort()
   * @see #getMicroservice()
   * @generated
   */
	EAttribute getMicroservice_Port();

	/**
   * Returns the meta object for the containment reference list '{@link deployment.Microservice#getControllers <em>Controllers</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Controllers</em>'.
   * @see deployment.Microservice#getControllers()
   * @see #getMicroservice()
   * @generated
   */
	EReference getMicroservice_Controllers();

	/**
   * Returns the meta object for the containment reference list '{@link deployment.Microservice#getProducers <em>Producers</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Producers</em>'.
   * @see deployment.Microservice#getProducers()
   * @see #getMicroservice()
   * @generated
   */
	EReference getMicroservice_Producers();

	/**
   * Returns the meta object for class '{@link deployment.JavaClass <em>Java Class</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Java Class</em>'.
   * @see deployment.JavaClass
   * @generated
   */
	EClass getJavaClass();

	/**
   * Returns the meta object for the attribute '{@link deployment.JavaClass#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see deployment.JavaClass#getClassName()
   * @see #getJavaClass()
   * @generated
   */
	EAttribute getJavaClass_ClassName();

	/**
   * Returns the meta object for the attribute '{@link deployment.JavaClass#getSerdeable <em>Serdeable</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Serdeable</em>'.
   * @see deployment.JavaClass#getSerdeable()
   * @see #getJavaClass()
   * @generated
   */
	EAttribute getJavaClass_Serdeable();

	/**
   * Returns the meta object for class '{@link deployment.Controller <em>Controller</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Controller</em>'.
   * @see deployment.Controller
   * @generated
   */
	EClass getController();

	/**
   * Returns the meta object for the attribute '{@link deployment.Controller#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see deployment.Controller#getUri()
   * @see #getController()
   * @generated
   */
	EAttribute getController_Uri();

	/**
   * Returns the meta object for the containment reference list '{@link deployment.Controller#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see deployment.Controller#getMethods()
   * @see #getController()
   * @generated
   */
  EReference getController_Methods();

  /**
   * Returns the meta object for class '{@link deployment.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see deployment.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the attribute '{@link deployment.Method#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see deployment.Method#getName()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Name();

  /**
   * Returns the meta object for the attribute '{@link deployment.Method#getTransactional <em>Transactional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Transactional</em>'.
   * @see deployment.Method#getTransactional()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Transactional();

  /**
   * Returns the meta object for the containment reference list '{@link deployment.Method#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see deployment.Method#getParameters()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link deployment.Method#getRequest <em>Request</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Request</em>'.
   * @see deployment.Method#getRequest()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Request();

  /**
   * Returns the meta object for the containment reference list '{@link deployment.Method#getResponse <em>Response</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Response</em>'.
   * @see deployment.Method#getResponse()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Response();

  /**
   * Returns the meta object for the reference list '{@link deployment.Method#getProduced <em>Produced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Produced</em>'.
   * @see deployment.Method#getProduced()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Produced();

  /**
   * Returns the meta object for the reference '{@link deployment.Method#getClientCommand <em>Client Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Client Command</em>'.
   * @see deployment.Method#getClientCommand()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_ClientCommand();

  /**
   * Returns the meta object for class '{@link deployment.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see deployment.Parameter
   * @generated
   */
	EClass getParameter();

	/**
   * Returns the meta object for the attribute '{@link deployment.Parameter#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see deployment.Parameter#getKey()
   * @see #getParameter()
   * @generated
   */
	EAttribute getParameter_Key();

	/**
   * Returns the meta object for the attribute '{@link deployment.Parameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see deployment.Parameter#getValue()
   * @see #getParameter()
   * @generated
   */
	EAttribute getParameter_Value();

	/**
   * Returns the meta object for class '{@link deployment.Request <em>Request</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Request</em>'.
   * @see deployment.Request
   * @generated
   */
  EClass getRequest();

  /**
   * Returns the meta object for the attribute '{@link deployment.Request#getVerb <em>Verb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Verb</em>'.
   * @see deployment.Request#getVerb()
   * @see #getRequest()
   * @generated
   */
  EAttribute getRequest_Verb();

  /**
   * Returns the meta object for the attribute '{@link deployment.Request#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see deployment.Request#getUri()
   * @see #getRequest()
   * @generated
   */
  EAttribute getRequest_Uri();

  /**
   * Returns the meta object for class '{@link deployment.Response <em>Response</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Response</em>'.
   * @see deployment.Response
   * @generated
   */
  EClass getResponse();

  /**
   * Returns the meta object for the attribute '{@link deployment.Response#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see deployment.Response#getCode()
   * @see #getResponse()
   * @generated
   */
  EAttribute getResponse_Code();

  /**
   * Returns the meta object for the attribute '{@link deployment.Response#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Body</em>'.
   * @see deployment.Response#getBody()
   * @see #getResponse()
   * @generated
   */
  EAttribute getResponse_Body();

  /**
   * Returns the meta object for class '{@link deployment.CliTool <em>Cli Tool</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cli Tool</em>'.
   * @see deployment.CliTool
   * @generated
   */
	EClass getCliTool();

	/**
   * Returns the meta object for the reference list '{@link deployment.CliTool#getClients <em>Clients</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Clients</em>'.
   * @see deployment.CliTool#getClients()
   * @see #getCliTool()
   * @generated
   */
	EReference getCliTool_Clients();

	/**
   * Returns the meta object for class '{@link deployment.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see deployment.Command
   * @generated
   */
	EClass getCommand();

	/**
   * Returns the meta object for the attribute '{@link deployment.Command#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see deployment.Command#getName()
   * @see #getCommand()
   * @generated
   */
	EAttribute getCommand_Name();

	/**
   * Returns the meta object for the attribute '{@link deployment.Command#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see deployment.Command#getDescription()
   * @see #getCommand()
   * @generated
   */
	EAttribute getCommand_Description();

	/**
   * Returns the meta object for class '{@link deployment.Producer <em>Producer</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Producer</em>'.
   * @see deployment.Producer
   * @generated
   */
	EClass getProducer();

	/**
   * Returns the meta object for the attribute '{@link deployment.Producer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see deployment.Producer#getName()
   * @see #getProducer()
   * @generated
   */
	EAttribute getProducer_Name();

	/**
   * Returns the meta object for the reference list '{@link deployment.Producer#getTopic <em>Topic</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Topic</em>'.
   * @see deployment.Producer#getTopic()
   * @see #getProducer()
   * @generated
   */
	EReference getProducer_Topic();

	/**
   * Returns the meta object for class '{@link deployment.Topic <em>Topic</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Topic</em>'.
   * @see deployment.Topic
   * @generated
   */
	EClass getTopic();

	/**
   * Returns the meta object for the attribute '{@link deployment.Topic#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see deployment.Topic#getName()
   * @see #getTopic()
   * @generated
   */
	EAttribute getTopic_Name();

	/**
   * Returns the meta object for the attribute '{@link deployment.Topic#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see deployment.Topic#getKey()
   * @see #getTopic()
   * @generated
   */
	EAttribute getTopic_Key();

	/**
   * Returns the meta object for the attribute '{@link deployment.Topic#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see deployment.Topic#getValue()
   * @see #getTopic()
   * @generated
   */
	EAttribute getTopic_Value();

	/**
   * Returns the meta object for class '{@link deployment.Table <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table</em>'.
   * @see deployment.Table
   * @generated
   */
  EClass getTable();

  /**
   * Returns the meta object for the attribute '{@link deployment.Table#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see deployment.Table#getName()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_Name();

  /**
   * Returns the meta object for the containment reference list '{@link deployment.Table#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see deployment.Table#getColumns()
   * @see #getTable()
   * @generated
   */
  EReference getTable_Columns();

  /**
   * Returns the meta object for class '{@link deployment.Column <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column</em>'.
   * @see deployment.Column
   * @generated
   */
  EClass getColumn();

  /**
   * Returns the meta object for the attribute '{@link deployment.Column#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see deployment.Column#getName()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Name();

  /**
   * Returns the meta object for the attribute '{@link deployment.Column#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see deployment.Column#getType()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Type();

  /**
   * Returns the meta object for class '{@link deployment.ForeignKey <em>Foreign Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Foreign Key</em>'.
   * @see deployment.ForeignKey
   * @generated
   */
  EClass getForeignKey();

  /**
   * Returns the meta object for the reference '{@link deployment.ForeignKey#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see deployment.ForeignKey#getSource()
   * @see #getForeignKey()
   * @generated
   */
  EReference getForeignKey_Source();

  /**
   * Returns the meta object for the reference '{@link deployment.ForeignKey#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Destination</em>'.
   * @see deployment.ForeignKey#getDestination()
   * @see #getForeignKey()
   * @generated
   */
  EReference getForeignKey_Destination();

  /**
   * Returns the meta object for class '{@link deployment.JoinTable <em>Join Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join Table</em>'.
   * @see deployment.JoinTable
   * @generated
   */
  EClass getJoinTable();

  /**
   * Returns the meta object for enum '{@link deployment.HttpVerb <em>Http Verb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Http Verb</em>'.
   * @see deployment.HttpVerb
   * @generated
   */
  EEnum getHttpVerb();

  /**
   * Returns the meta object for enum '{@link deployment.HttpCode <em>Http Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Http Code</em>'.
   * @see deployment.HttpCode
   * @generated
   */
  EEnum getHttpCode();

  /**
   * Returns the meta object for enum '{@link deployment.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Model</em>'.
   * @see deployment.Model
   * @generated
   */
	EEnum getModel();

	/**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
	DeploymentFactory getDeploymentFactory();

	/**
   * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
   * @generated
   */
	interface Literals {
		/**
     * The meta object literal for the '{@link deployment.impl.DeploymentImpl <em>Deployment</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see deployment.impl.DeploymentImpl
     * @see deployment.impl.DeploymentPackageImpl#getDeployment()
     * @generated
     */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
     * The meta object literal for the '<em><b>Microservices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DEPLOYMENT__MICROSERVICES = eINSTANCE.getDeployment_Microservices();

		/**
     * The meta object literal for the '<em><b>Topics</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DEPLOYMENT__TOPICS = eINSTANCE.getDeployment_Topics();

		/**
     * The meta object literal for the '<em><b>Cli Tool</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DEPLOYMENT__CLI_TOOL = eINSTANCE.getDeployment_CliTool();

		/**
     * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT__TABLES = eINSTANCE.getDeployment_Tables();

    /**
     * The meta object literal for the '<em><b>Join Tables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT__JOIN_TABLES = eINSTANCE.getDeployment_JoinTables();

    /**
     * The meta object literal for the '{@link deployment.impl.MicroserviceImpl <em>Microservice</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see deployment.impl.MicroserviceImpl
     * @see deployment.impl.DeploymentPackageImpl#getMicroservice()
     * @generated
     */
		EClass MICROSERVICE = eINSTANCE.getMicroservice();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute MICROSERVICE__NAME = eINSTANCE.getMicroservice_Name();

		/**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute MICROSERVICE__PORT = eINSTANCE.getMicroservice_Port();

		/**
     * The meta object literal for the '<em><b>Controllers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference MICROSERVICE__CONTROLLERS = eINSTANCE.getMicroservice_Controllers();

		/**
     * The meta object literal for the '<em><b>Producers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference MICROSERVICE__PRODUCERS = eINSTANCE.getMicroservice_Producers();

		/**
     * The meta object literal for the '{@link deployment.impl.JavaClassImpl <em>Java Class</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see deployment.impl.JavaClassImpl
     * @see deployment.impl.DeploymentPackageImpl#getJavaClass()
     * @generated
     */
		EClass JAVA_CLASS = eINSTANCE.getJavaClass();

		/**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute JAVA_CLASS__CLASS_NAME = eINSTANCE.getJavaClass_ClassName();

		/**
     * The meta object literal for the '<em><b>Serdeable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute JAVA_CLASS__SERDEABLE = eINSTANCE.getJavaClass_Serdeable();

		/**
     * The meta object literal for the '{@link deployment.impl.ControllerImpl <em>Controller</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see deployment.impl.ControllerImpl
     * @see deployment.impl.DeploymentPackageImpl#getController()
     * @generated
     */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute CONTROLLER__URI = eINSTANCE.getController_Uri();

		/**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROLLER__METHODS = eINSTANCE.getController_Methods();

    /**
     * The meta object literal for the '{@link deployment.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deployment.impl.MethodImpl
     * @see deployment.impl.DeploymentPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

    /**
     * The meta object literal for the '<em><b>Transactional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__TRANSACTIONAL = eINSTANCE.getMethod_Transactional();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__PARAMETERS = eINSTANCE.getMethod_Parameters();

    /**
     * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__REQUEST = eINSTANCE.getMethod_Request();

    /**
     * The meta object literal for the '<em><b>Response</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__RESPONSE = eINSTANCE.getMethod_Response();

    /**
     * The meta object literal for the '<em><b>Produced</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__PRODUCED = eINSTANCE.getMethod_Produced();

    /**
     * The meta object literal for the '<em><b>Client Command</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__CLIENT_COMMAND = eINSTANCE.getMethod_ClientCommand();

    /**
     * The meta object literal for the '{@link deployment.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see deployment.impl.ParameterImpl
     * @see deployment.impl.DeploymentPackageImpl#getParameter()
     * @generated
     */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute PARAMETER__KEY = eINSTANCE.getParameter_Key();

		/**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
     * The meta object literal for the '{@link deployment.impl.RequestImpl <em>Request</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deployment.impl.RequestImpl
     * @see deployment.impl.DeploymentPackageImpl#getRequest()
     * @generated
     */
    EClass REQUEST = eINSTANCE.getRequest();

    /**
     * The meta object literal for the '<em><b>Verb</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUEST__VERB = eINSTANCE.getRequest_Verb();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUEST__URI = eINSTANCE.getRequest_Uri();

    /**
     * The meta object literal for the '{@link deployment.impl.ResponseImpl <em>Response</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deployment.impl.ResponseImpl
     * @see deployment.impl.DeploymentPackageImpl#getResponse()
     * @generated
     */
    EClass RESPONSE = eINSTANCE.getResponse();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESPONSE__CODE = eINSTANCE.getResponse_Code();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESPONSE__BODY = eINSTANCE.getResponse_Body();

    /**
     * The meta object literal for the '{@link deployment.impl.CliToolImpl <em>Cli Tool</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see deployment.impl.CliToolImpl
     * @see deployment.impl.DeploymentPackageImpl#getCliTool()
     * @generated
     */
		EClass CLI_TOOL = eINSTANCE.getCliTool();

		/**
     * The meta object literal for the '<em><b>Clients</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference CLI_TOOL__CLIENTS = eINSTANCE.getCliTool_Clients();

		/**
     * The meta object literal for the '{@link deployment.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see deployment.impl.CommandImpl
     * @see deployment.impl.DeploymentPackageImpl#getCommand()
     * @generated
     */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

		/**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute COMMAND__DESCRIPTION = eINSTANCE.getCommand_Description();

		/**
     * The meta object literal for the '{@link deployment.impl.ProducerImpl <em>Producer</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see deployment.impl.ProducerImpl
     * @see deployment.impl.DeploymentPackageImpl#getProducer()
     * @generated
     */
		EClass PRODUCER = eINSTANCE.getProducer();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute PRODUCER__NAME = eINSTANCE.getProducer_Name();

		/**
     * The meta object literal for the '<em><b>Topic</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference PRODUCER__TOPIC = eINSTANCE.getProducer_Topic();

		/**
     * The meta object literal for the '{@link deployment.impl.TopicImpl <em>Topic</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see deployment.impl.TopicImpl
     * @see deployment.impl.DeploymentPackageImpl#getTopic()
     * @generated
     */
		EClass TOPIC = eINSTANCE.getTopic();

		/**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute TOPIC__NAME = eINSTANCE.getTopic_Name();

		/**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute TOPIC__KEY = eINSTANCE.getTopic_Key();

		/**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute TOPIC__VALUE = eINSTANCE.getTopic_Value();

		/**
     * The meta object literal for the '{@link deployment.impl.TableImpl <em>Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deployment.impl.TableImpl
     * @see deployment.impl.DeploymentPackageImpl#getTable()
     * @generated
     */
    EClass TABLE = eINSTANCE.getTable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

    /**
     * The meta object literal for the '{@link deployment.impl.ColumnImpl <em>Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deployment.impl.ColumnImpl
     * @see deployment.impl.DeploymentPackageImpl#getColumn()
     * @generated
     */
    EClass COLUMN = eINSTANCE.getColumn();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

    /**
     * The meta object literal for the '{@link deployment.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deployment.impl.ForeignKeyImpl
     * @see deployment.impl.DeploymentPackageImpl#getForeignKey()
     * @generated
     */
    EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREIGN_KEY__SOURCE = eINSTANCE.getForeignKey_Source();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREIGN_KEY__DESTINATION = eINSTANCE.getForeignKey_Destination();

    /**
     * The meta object literal for the '{@link deployment.impl.JoinTableImpl <em>Join Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deployment.impl.JoinTableImpl
     * @see deployment.impl.DeploymentPackageImpl#getJoinTable()
     * @generated
     */
    EClass JOIN_TABLE = eINSTANCE.getJoinTable();

    /**
     * The meta object literal for the '{@link deployment.HttpVerb <em>Http Verb</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deployment.HttpVerb
     * @see deployment.impl.DeploymentPackageImpl#getHttpVerb()
     * @generated
     */
    EEnum HTTP_VERB = eINSTANCE.getHttpVerb();

    /**
     * The meta object literal for the '{@link deployment.HttpCode <em>Http Code</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see deployment.HttpCode
     * @see deployment.impl.DeploymentPackageImpl#getHttpCode()
     * @generated
     */
    EEnum HTTP_CODE = eINSTANCE.getHttpCode();

    /**
     * The meta object literal for the '{@link deployment.Model <em>Model</em>}' enum.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see deployment.Model
     * @see deployment.impl.DeploymentPackageImpl#getModel()
     * @generated
     */
		EEnum MODEL = eINSTANCE.getModel();

	}

} //DeploymentPackage
