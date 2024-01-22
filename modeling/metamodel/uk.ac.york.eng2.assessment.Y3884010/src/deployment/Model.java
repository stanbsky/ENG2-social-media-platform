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
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "None", "None"),

	/**
	 * The '<em><b>Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_VALUE
	 * @generated
	 * @ordered
	 */
	LONG(1, "Long", "Long"),

	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(2, "String", "String"),

	/**
	 * The '<em><b>Video</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO(3, "Video", "Video"),

	/**
	 * The '<em><b>Iterable Video</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITERABLE_VIDEO_VALUE
	 * @generated
	 * @ordered
	 */
	ITERABLE_VIDEO(4, "IterableVideo", "IterableVideo"),

	/**
	 * The '<em><b>Iterable User</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITERABLE_USER_VALUE
	 * @generated
	 * @ordered
	 */
	ITERABLE_USER(5, "IterableUser", "IterableUser"),

	/**
	 * The '<em><b>Video DTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_DTO_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO_DTO(6, "VideoDTO", "VideoDTO"),

	/**
	 * The '<em><b>Hashtag</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HASHTAG_VALUE
	 * @generated
	 * @ordered
	 */
	HASHTAG(7, "Hashtag", "Hashtag"),

	/**
	 * The '<em><b>Hashtag DTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HASHTAG_DTO_VALUE
	 * @generated
	 * @ordered
	 */
	HASHTAG_DTO(8, "HashtagDTO", "HashtagDTO"),

	/**
	 * The '<em><b>User</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_VALUE
	 * @generated
	 * @ordered
	 */
	USER(9, "User", "User"),

	/**
	 * The '<em><b>User DTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_DTO_VALUE
	 * @generated
	 * @ordered
	 */
	USER_DTO(10, "UserDTO", "UserDTO"),

	/**
	 * The '<em><b>User Video</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_VIDEO_VALUE
	 * @generated
	 * @ordered
	 */
	USER_VIDEO(11, "UserVideo", "UserVideo"),

	/**
	 * The '<em><b>Hashtag Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HASHTAG_SET_VALUE
	 * @generated
	 * @ordered
	 */
	HASHTAG_SET(12, "HashtagSet", "HashtagSet"),

	/**
	 * The '<em><b>Top10 DTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP10_DTO_VALUE
	 * @generated
	 * @ordered
	 */
	TOP10_DTO(13, "Top10DTO", "Top10DTO"),

	/**
	 * The '<em><b>Watchlist DTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATCHLIST_DTO_VALUE
	 * @generated
	 * @ordered
	 */
	WATCHLIST_DTO(14, "WatchlistDTO", "WatchlistDTO");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG
	 * @model name="Long"
	 * @generated
	 * @ordered
	 */
	public static final int LONG_VALUE = 1;

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model name="String"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 2;

	/**
	 * The '<em><b>Video</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO
	 * @model name="Video"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_VALUE = 3;

	/**
	 * The '<em><b>Iterable Video</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITERABLE_VIDEO
	 * @model name="IterableVideo"
	 * @generated
	 * @ordered
	 */
	public static final int ITERABLE_VIDEO_VALUE = 4;

	/**
	 * The '<em><b>Iterable User</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITERABLE_USER
	 * @model name="IterableUser"
	 * @generated
	 * @ordered
	 */
	public static final int ITERABLE_USER_VALUE = 5;

	/**
	 * The '<em><b>Video DTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_DTO
	 * @model name="VideoDTO"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_DTO_VALUE = 6;

	/**
	 * The '<em><b>Hashtag</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HASHTAG
	 * @model name="Hashtag"
	 * @generated
	 * @ordered
	 */
	public static final int HASHTAG_VALUE = 7;

	/**
	 * The '<em><b>Hashtag DTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HASHTAG_DTO
	 * @model name="HashtagDTO"
	 * @generated
	 * @ordered
	 */
	public static final int HASHTAG_DTO_VALUE = 8;

	/**
	 * The '<em><b>User</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER
	 * @model name="User"
	 * @generated
	 * @ordered
	 */
	public static final int USER_VALUE = 9;

	/**
	 * The '<em><b>User DTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_DTO
	 * @model name="UserDTO"
	 * @generated
	 * @ordered
	 */
	public static final int USER_DTO_VALUE = 10;

	/**
	 * The '<em><b>User Video</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_VIDEO
	 * @model name="UserVideo"
	 * @generated
	 * @ordered
	 */
	public static final int USER_VIDEO_VALUE = 11;

	/**
	 * The '<em><b>Hashtag Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HASHTAG_SET
	 * @model name="HashtagSet"
	 * @generated
	 * @ordered
	 */
	public static final int HASHTAG_SET_VALUE = 12;

	/**
	 * The '<em><b>Top10 DTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP10_DTO
	 * @model name="Top10DTO"
	 * @generated
	 * @ordered
	 */
	public static final int TOP10_DTO_VALUE = 13;

	/**
	 * The '<em><b>Watchlist DTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATCHLIST_DTO
	 * @model name="WatchlistDTO"
	 * @generated
	 * @ordered
	 */
	public static final int WATCHLIST_DTO_VALUE = 14;

	/**
	 * An array of all the '<em><b>Model</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Model[] VALUES_ARRAY =
		new Model[] {
			NONE,
			LONG,
			STRING,
			VIDEO,
			ITERABLE_VIDEO,
			ITERABLE_USER,
			VIDEO_DTO,
			HASHTAG,
			HASHTAG_DTO,
			USER,
			USER_DTO,
			USER_VIDEO,
			HASHTAG_SET,
			TOP10_DTO,
			WATCHLIST_DTO,
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
			case NONE_VALUE: return NONE;
			case LONG_VALUE: return LONG;
			case STRING_VALUE: return STRING;
			case VIDEO_VALUE: return VIDEO;
			case ITERABLE_VIDEO_VALUE: return ITERABLE_VIDEO;
			case ITERABLE_USER_VALUE: return ITERABLE_USER;
			case VIDEO_DTO_VALUE: return VIDEO_DTO;
			case HASHTAG_VALUE: return HASHTAG;
			case HASHTAG_DTO_VALUE: return HASHTAG_DTO;
			case USER_VALUE: return USER;
			case USER_DTO_VALUE: return USER_DTO;
			case USER_VIDEO_VALUE: return USER_VIDEO;
			case HASHTAG_SET_VALUE: return HASHTAG_SET;
			case TOP10_DTO_VALUE: return TOP10_DTO;
			case WATCHLIST_DTO_VALUE: return WATCHLIST_DTO;
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
