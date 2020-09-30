/**
 */
package Draughts_Game;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Draughts_Game.Draughts_GamePackage
 * @generated
 */
public interface Draughts_GameFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Draughts_GameFactory eINSTANCE = Draughts_Game.impl.Draughts_GameFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Draughts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Draughts</em>'.
	 * @generated
	 */
	Draughts createDraughts();

	/**
	 * Returns a new object of class '<em>Man</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Man</em>'.
	 * @generated
	 */
	Man createMan();

	/**
	 * Returns a new object of class '<em>King</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>King</em>'.
	 * @generated
	 */
	King createKing();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Board</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Board</em>'.
	 * @generated
	 */
	Board createBoard();

	/**
	 * Returns a new object of class '<em>Square</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Square</em>'.
	 * @generated
	 */
	Square createSquare();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Draughts_GamePackage getDraughts_GamePackage();

} //Draughts_GameFactory
