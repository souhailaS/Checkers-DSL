/**
 */
package Draughts_Game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Man</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Draughts_Game.Man#getCaptures <em>Captures</em>}</li>
 *   <li>{@link Draughts_Game.Man#getColor <em>Color</em>}</li>
 *   <li>{@link Draughts_Game.Man#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see Draughts_Game.Draughts_GamePackage#getMan()
 * @model
 * @generated
 */
public interface Man extends EObject {
	/**
	 * Returns the value of the '<em><b>Captures</b></em>' reference list.
	 * The list contents are of type {@link Draughts_Game.Man}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Captures</em>' reference list.
	 * @see Draughts_Game.Draughts_GamePackage#getMan_Captures()
	 * @model
	 * @generated
	 */
	EList<Man> getCaptures();

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link Draughts_Game.COLOR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see Draughts_Game.COLOR
	 * @see #setColor(COLOR)
	 * @see Draughts_Game.Draughts_GamePackage#getMan_Color()
	 * @model
	 * @generated
	 */
	COLOR getColor();

	/**
	 * Sets the value of the '{@link Draughts_Game.Man#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see Draughts_Game.COLOR
	 * @see #getColor()
	 * @generated
	 */
	void setColor(COLOR value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see Draughts_Game.Draughts_GamePackage#getMan_Location()
	 * @model
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link Draughts_Game.Man#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

} // Man
