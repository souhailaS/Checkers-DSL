/**
 */
package Draughts_Game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Square</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Draughts_Game.Square#getLocation <em>Location</em>}</li>
 *   <li>{@link Draughts_Game.Square#getMens <em>Mens</em>}</li>
 *   <li>{@link Draughts_Game.Square#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see Draughts_Game.Draughts_GamePackage#getSquare()
 * @model
 * @generated
 */
public interface Square extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see Draughts_Game.Draughts_GamePackage#getSquare_Location()
	 * @model required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link Draughts_Game.Square#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Mens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mens</em>' containment reference.
	 * @see #setMens(Man)
	 * @see Draughts_Game.Draughts_GamePackage#getSquare_Mens()
	 * @model containment="true"
	 * @generated
	 */
	Man getMens();

	/**
	 * Sets the value of the '{@link Draughts_Game.Square#getMens <em>Mens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mens</em>' containment reference.
	 * @see #getMens()
	 * @generated
	 */
	void setMens(Man value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link Draughts_Game.COLOR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see Draughts_Game.COLOR
	 * @see #setColor(COLOR)
	 * @see Draughts_Game.Draughts_GamePackage#getSquare_Color()
	 * @model
	 * @generated
	 */
	COLOR getColor();

	/**
	 * Sets the value of the '{@link Draughts_Game.Square#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see Draughts_Game.COLOR
	 * @see #getColor()
	 * @generated
	 */
	void setColor(COLOR value);

} // Square
