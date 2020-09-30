/**
 */
package Draughts_Game;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ROW</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Draughts_Game.Draughts_GamePackage#getROW()
 * @model
 * @generated
 */
public enum ROW implements Enumerator {
	/**
	 * The '<em><b>1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1_VALUE
	 * @generated
	 * @ordered
	 */
	_1(1, "_1", "_1"),

	/**
	 * The '<em><b>2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2_VALUE
	 * @generated
	 * @ordered
	 */
	_2(2, "_2", "_2"),

	/**
	 * The '<em><b>3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_3_VALUE
	 * @generated
	 * @ordered
	 */
	_3(3, "_3", "_3"),

	/**
	 * The '<em><b>4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_4_VALUE
	 * @generated
	 * @ordered
	 */
	_4(4, "_4", "_4"),

	/**
	 * The '<em><b>5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_5_VALUE
	 * @generated
	 * @ordered
	 */
	_5(5, "_5", "_5"),

	/**
	 * The '<em><b>6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_6_VALUE
	 * @generated
	 * @ordered
	 */
	_6(6, "_6", "_6"),

	/**
	 * The '<em><b>7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_7_VALUE
	 * @generated
	 * @ordered
	 */
	_7(7, "_7", "_7"),

	/**
	 * The '<em><b>8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_8_VALUE
	 * @generated
	 * @ordered
	 */
	_8(8, "_8", "_8");

	/**
	 * The '<em><b>1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _1_VALUE = 1;

	/**
	 * The '<em><b>2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _2_VALUE = 2;

	/**
	 * The '<em><b>3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _3_VALUE = 3;

	/**
	 * The '<em><b>4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _4_VALUE = 4;

	/**
	 * The '<em><b>5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _5_VALUE = 5;

	/**
	 * The '<em><b>6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_6
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _6_VALUE = 6;

	/**
	 * The '<em><b>7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_7
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _7_VALUE = 7;

	/**
	 * The '<em><b>8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_8
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int _8_VALUE = 8;

	/**
	 * An array of all the '<em><b>ROW</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ROW[] VALUES_ARRAY =
		new ROW[] {
			_1,
			_2,
			_3,
			_4,
			_5,
			_6,
			_7,
			_8,
		};

	/**
	 * A public read-only list of all the '<em><b>ROW</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ROW> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ROW</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ROW get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ROW result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ROW</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ROW getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ROW result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ROW</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ROW get(int value) {
		switch (value) {
			case _1_VALUE: return _1;
			case _2_VALUE: return _2;
			case _3_VALUE: return _3;
			case _4_VALUE: return _4;
			case _5_VALUE: return _5;
			case _6_VALUE: return _6;
			case _7_VALUE: return _7;
			case _8_VALUE: return _8;
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
	private ROW(int value, String name, String literal) {
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
	
} //ROW
