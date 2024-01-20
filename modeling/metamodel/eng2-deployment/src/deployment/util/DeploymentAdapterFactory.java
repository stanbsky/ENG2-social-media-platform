/**
 */
package deployment.util;

import deployment.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see deployment.DeploymentPackage
 * @generated
 */
public class DeploymentAdapterFactory extends AdapterFactoryImpl {
	/**
   * The cached model package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static DeploymentPackage modelPackage;

	/**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public DeploymentAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = DeploymentPackage.eINSTANCE;
    }
  }

	/**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
	@Override
	public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

	/**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected DeploymentSwitch<Adapter> modelSwitch =
		new DeploymentSwitch<Adapter>() {
      @Override
      public Adapter caseDeployment(Deployment object) {
        return createDeploymentAdapter();
      }
      @Override
      public Adapter caseMicroservice(Microservice object) {
        return createMicroserviceAdapter();
      }
      @Override
      public Adapter caseJavaClass(JavaClass object) {
        return createJavaClassAdapter();
      }
      @Override
      public Adapter caseController(Controller object) {
        return createControllerAdapter();
      }
      @Override
      public Adapter caseEndpoint(Endpoint object) {
        return createEndpointAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object) {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseHttpResponse(HttpResponse object) {
        return createHttpResponseAdapter();
      }
      @Override
      public Adapter caseCliTool(CliTool object) {
        return createCliToolAdapter();
      }
      @Override
      public Adapter caseCommand(Command object) {
        return createCommandAdapter();
      }
      @Override
      public Adapter caseProducer(Producer object) {
        return createProducerAdapter();
      }
      @Override
      public Adapter caseTopic(Topic object) {
        return createTopicAdapter();
      }
      @Override
      public Adapter caseEvent(Event object) {
        return createEventAdapter();
      }
      @Override
      public Adapter caseTable(Table object) {
        return createTableAdapter();
      }
      @Override
      public Adapter caseColumn(Column object) {
        return createColumnAdapter();
      }
      @Override
      public Adapter caseForeignKey(ForeignKey object) {
        return createForeignKeyAdapter();
      }
      @Override
      public Adapter caseJoinTable(JoinTable object) {
        return createJoinTableAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object) {
        return createEObjectAdapter();
      }
    };

	/**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
	@Override
	public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


	/**
   * Creates a new adapter for an object of class '{@link deployment.Deployment <em>Deployment</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see deployment.Deployment
   * @generated
   */
	public Adapter createDeploymentAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link deployment.Microservice <em>Microservice</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see deployment.Microservice
   * @generated
   */
	public Adapter createMicroserviceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link deployment.JavaClass <em>Java Class</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see deployment.JavaClass
   * @generated
   */
	public Adapter createJavaClassAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link deployment.Controller <em>Controller</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see deployment.Controller
   * @generated
   */
	public Adapter createControllerAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link deployment.Endpoint <em>Endpoint</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see deployment.Endpoint
   * @generated
   */
	public Adapter createEndpointAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link deployment.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see deployment.Parameter
   * @generated
   */
	public Adapter createParameterAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link deployment.HttpResponse <em>Http Response</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see deployment.HttpResponse
   * @generated
   */
	public Adapter createHttpResponseAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link deployment.CliTool <em>Cli Tool</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see deployment.CliTool
   * @generated
   */
	public Adapter createCliToolAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link deployment.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see deployment.Command
   * @generated
   */
	public Adapter createCommandAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link deployment.Producer <em>Producer</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see deployment.Producer
   * @generated
   */
	public Adapter createProducerAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link deployment.Topic <em>Topic</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see deployment.Topic
   * @generated
   */
	public Adapter createTopicAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link deployment.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see deployment.Event
   * @generated
   */
	public Adapter createEventAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link deployment.Table <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see deployment.Table
   * @generated
   */
  public Adapter createTableAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link deployment.Column <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see deployment.Column
   * @generated
   */
  public Adapter createColumnAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link deployment.ForeignKey <em>Foreign Key</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see deployment.ForeignKey
   * @generated
   */
  public Adapter createForeignKeyAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link deployment.JoinTable <em>Join Table</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see deployment.JoinTable
   * @generated
   */
  public Adapter createJoinTableAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
	public Adapter createEObjectAdapter() {
    return null;
  }

} //DeploymentAdapterFactory
