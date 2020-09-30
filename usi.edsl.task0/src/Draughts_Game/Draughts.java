/**
 */
package Draughts_Game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Draughts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Draughts_Game.Draughts#getMen <em>Men</em>}</li>
 *   <li>{@link Draughts_Game.Draughts#getBoard <em>Board</em>}</li>
 *   <li>{@link Draughts_Game.Draughts#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see Draughts_Game.Draughts_GamePackage#getDraughts()
 * @model
 * @generated
 */
public interface Draughts extends EObject {
	/**
	 * Returns the value of the '<em><b>Men</b></em>' containment reference list.
	 * The list contents are of type {@link Draughts_Game.Man}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Men</em>' containment reference list.
	 * @see Draughts_Game.Draughts_GamePackage#getDraughts_Men()
	 * @model containment="true"
	 * @generated
	 */
	EList<Man> getMen();

	/**
	 * Returns the value of the '<em><b>Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' containment reference.
	 * @see #setBoard(Board)
	 * @see Draughts_Game.Draughts_GamePackage#getDraughts_Board()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Board getBoard();

	/**
	 * Sets the value of the '{@link Draughts_Game.Draughts#getBoard <em>Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' containment reference.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(Board value);

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link Draughts_Game.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see Draughts_Game.Draughts_GamePackage#getDraughts_Locations()
	 * @model containment="true" lower="64" upper="64"
	 * @generated
	 */
	EList<Location> getLocations();

} // Draughts
