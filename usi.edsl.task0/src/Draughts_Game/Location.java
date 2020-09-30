/**
 */
package Draughts_Game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Draughts_Game.Location#getRow <em>Row</em>}</li>
 *   <li>{@link Draughts_Game.Location#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @see Draughts_Game.Draughts_GamePackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Row</b></em>' attribute.
	 * The literals are from the enumeration {@link Draughts_Game.ROW}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' attribute.
	 * @see Draughts_Game.ROW
	 * @see #setRow(ROW)
	 * @see Draughts_Game.Draughts_GamePackage#getLocation_Row()
	 * @model
	 * @generated
	 */
	ROW getRow();

	/**
	 * Sets the value of the '{@link Draughts_Game.Location#getRow <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' attribute.
	 * @see Draughts_Game.ROW
	 * @see #getRow()
	 * @generated
	 */
	void setRow(ROW value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see #setColumn(char)
	 * @see Draughts_Game.Draughts_GamePackage#getLocation_Column()
	 * @model
	 * @generated
	 */
	char getColumn();

	/**
	 * Sets the value of the '{@link Draughts_Game.Location#getColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' attribute.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(char value);

} // Location
