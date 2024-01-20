/**
 */
package deployment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Model</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see deployment.DeploymentPackage#getModel()
 * @model
 * @generated
 */
public enum Model implements Enumerator {
	/**
   * The '<em><b>MLong</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #MLONG_VALUE
   * @generated
   * @ordered
   */
	MLONG(0, "MLong", "MLong"),

	/**
   * The '<em><b>MString</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #MSTRING_VALUE
   * @generated
   * @ordered
   */
	MSTRING(1, "MString", "MString"),

	/**
   * The '<em><b>Video</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #VIDEO_VALUE
   * @generated
   * @ordered
   */
	VIDEO(2, "Video", "Video"),

	/**
   * The '<em><b>Video DTO</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #VIDEO_DTO_VALUE
   * @generated
   * @ordered
   */
	VIDEO_DTO(3, "VideoDTO", "VideoDTO"),

	/**
   * The '<em><b>Hashtag</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #HASHTAG_VALUE
   * @generated
   * @ordered
   */
	HASHTAG(4, "Hashtag", "Hashtag"),

	/**
   * The '<em><b>Hashtag DTO</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #HASHTAG_DTO_VALUE
   * @generated
   * @ordered
   */
	HASHTAG_DTO(5, "HashtagDTO", "HashtagDTO"),

	/**
   * The '<em><b>User</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #USER_VALUE
   * @generated
   * @ordered
   */
	USER(6, "User", "User"),

	/**
   * The '<em><b>User DTO</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #USER_DTO_VALUE
   * @generated
   * @ordered
   */
	USER_DTO(7, "UserDTO", "UserDTO");

	/**
   * The '<em><b>MLong</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #MLONG
   * @model name="MLong"
   * @generated
   * @ordered
   */
	public static final int MLONG_VALUE = 0;

	/**
   * The '<em><b>MString</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #MSTRING
   * @model name="MString"
   * @generated
   * @ordered
   */
	public static final int MSTRING_VALUE = 1;

	/**
   * The '<em><b>Video</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #VIDEO
   * @model name="Video"
   * @generated
   * @ordered
   */
	public static final int VIDEO_VALUE = 2;

	/**
   * The '<em><b>Video DTO</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #VIDEO_DTO
   * @model name="VideoDTO"
   * @generated
   * @ordered
   */
	public static final int VIDEO_DTO_VALUE = 3;

	/**
   * The '<em><b>Hashtag</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #HASHTAG
   * @model name="Hashtag"
   * @generated
   * @ordered
   */
	public static final int HASHTAG_VALUE = 4;

	/**
   * The '<em><b>Hashtag DTO</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #HASHTAG_DTO
   * @model name="HashtagDTO"
   * @generated
   * @ordered
   */
	public static final int HASHTAG_DTO_VALUE = 5;

	/**
   * The '<em><b>User</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #USER
   * @model name="User"
   * @generated
   * @ordered
   */
	public static final int USER_VALUE = 6;

	/**
   * The '<em><b>User DTO</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #USER_DTO
   * @model name="UserDTO"
   * @generated
   * @ordered
   */
	public static final int USER_DTO_VALUE = 7;

	/**
   * An array of all the '<em><b>Model</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final Model[] VALUES_ARRAY =
		new Model[] {
      MLONG,
      MSTRING,
      VIDEO,
      VIDEO_DTO,
      HASHTAG,
      HASHTAG_DTO,
      USER,
      USER_DTO,
    };

	/**
   * A public read-only list of all the '<em><b>Model</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<Model> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Model</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
	public static Model get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      Model result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Model</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
	public static Model getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      Model result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Model</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
	public static Model get(int value) {
    switch (value) {
      case MLONG_VALUE: return MLONG;
      case MSTRING_VALUE: return MSTRING;
      case VIDEO_VALUE: return VIDEO;
      case VIDEO_DTO_VALUE: return VIDEO_DTO;
      case HASHTAG_VALUE: return HASHTAG;
      case HASHTAG_DTO_VALUE: return HASHTAG_DTO;
      case USER_VALUE: return USER;
      case USER_DTO_VALUE: return USER_DTO;
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
	private Model(int value, String name, String literal) {
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
	
} //Model
