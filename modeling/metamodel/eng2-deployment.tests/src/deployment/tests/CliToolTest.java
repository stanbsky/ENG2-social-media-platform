/**
 */
package deployment.tests;

import deployment.CliTool;
import deployment.DeploymentFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cli Tool</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CliToolTest extends JavaClassTest {

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(CliToolTest.class);
  }

  /**
   * Constructs a new Cli Tool test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CliToolTest(String name) {
    super(name);
  }

  /**
   * Returns the fixture for this Cli Tool test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected CliTool getFixture() {
    return (CliTool)fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception {
    setFixture(DeploymentFactory.eINSTANCE.createCliTool());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception {
    setFixture(null);
  }

} //CliToolTest
