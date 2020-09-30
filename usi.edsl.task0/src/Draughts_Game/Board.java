/**
 */
package Draughts_Game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Draughts_Game.Board#getSquares <em>Squares</em>}</li>
 * </ul>
 *
 * @see Draughts_Game.Draughts_GamePackage#getBoard()
 * @model
 * @generated
 */
public interface Board extends EObject {
	/**
	 * Returns the value of the '<em><b>Squares</b></em>' containment reference list.
	 * The list contents are of type {@link Draughts_Game.Square}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Squares</em>' containment reference list.
	 * @see Draughts_Game.Draughts_GamePackage#getBoard_Squares()
	 * @model containment="true" lower="64" upper="64"
	 * @generated
	 */
	EList<Square> getSquares();

} // Board
