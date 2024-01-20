/**
 */
package deployment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Http Response Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see deployment.DeploymentPackage#getHttpResponseCode()
 * @model
 * @generated
 */
public enum HttpResponseCode implements Enumerator {
	/**
   * The '<em><b>OK</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #OK_VALUE
   * @generated
   * @ordered
   */
	OK(0, "OK", "OK"),

	/**
   * The '<em><b>CREATED</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #CREATED_VALUE
   * @generated
   * @ordered
   */
	CREATED(1, "CREATED", "CREATED"),

	/**
   * The '<em><b>NOT FOUND</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #NOT_FOUND_VALUE
   * @generated
   * @ordered
   */
	NOT_FOUND(2, "NOT_FOUND", "NOT_FOUND"),

	/**
   * The '<em><b>FORBIDDEN</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #FORBIDDEN_VALUE
   * @generated
   * @ordered
   */
	FORBIDDEN(3, "FORBIDDEN", "FORBIDDEN");

	/**
   * The '<em><b>OK</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #OK
   * @model
   * @generated
   * @ordered
   */
	public static final int OK_VALUE = 0;

	/**
   * The '<em><b>CREATED</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #CREATED
   * @model
   * @generated
   * @ordered
   */
	public static final int CREATED_VALUE = 1;

	/**
   * The '<em><b>NOT FOUND</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #NOT_FOUND
   * @model
   * @generated
   * @ordered
   */
	public static final int NOT_FOUND_VALUE = 2;

	/**
   * The '<em><b>FORBIDDEN</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #FORBIDDEN
   * @model
   * @generated
   * @ordered
   */
	public static final int FORBIDDEN_VALUE = 3;

	/**
   * An array of all the '<em><b>Http Response Code</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final HttpResponseCode[] VALUES_ARRAY =
		new HttpResponseCode[] {
      OK,
      CREATED,
      NOT_FOUND,
      FORBIDDEN,
    };

	/**
   * A public read-only list of all the '<em><b>Http Response Code</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<HttpResponseCode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Http Response Code</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
	public static HttpResponseCode get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      HttpResponseCode result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Http Response Code</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
	public static HttpResponseCode getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      HttpResponseCode result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Http Response Code</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
	public static HttpResponseCode get(int value) {
    switch (value) {
      case OK_VALUE: return OK;
      case CREATED_VALUE: return CREATED;
      case NOT_FOUND_VALUE: return NOT_FOUND;
      case FORBIDDEN_VALUE: return FORBIDDEN;
    }
    return null;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private final int value;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private final String name;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private final String literal;

	/**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private HttpResponseCode(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public int getValue() {
    return value;
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
	public String getLiteral() {
    return literal;
  }

	/**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    return literal;
  }
	
} //HttpResponseCode
