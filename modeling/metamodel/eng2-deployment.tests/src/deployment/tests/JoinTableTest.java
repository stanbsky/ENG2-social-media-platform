/**
 */
package deployment.tests;

import deployment.DeploymentFactory;
import deployment.JoinTable;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Join Table</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JoinTableTest extends TableTest {

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(JoinTableTest.class);
  }

  /**
   * Constructs a new Join Table test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinTableTest(String name) {
    super(name);
  }

  /**
   * Returns the fixture for this Join Table test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected JoinTable getFixture() {
    return (JoinTable)fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception {
    setFixture(DeploymentFactory.eINSTANCE.createJoinTable());
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

} //JoinTableTest
