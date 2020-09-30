/**
 */
package Draughts_Game;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Draughts_Game.Draughts_GameFactory
 * @model kind="package"
 * @generated
 */
public interface Draughts_GamePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Draughts_Game";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.usi.ch/Draughts_Game";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Draughts_Game";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Draughts_GamePackage eINSTANCE = Draughts_Game.impl.Draughts_GamePackageImpl.init();

	/**
	 * The meta object id for the '{@link Draughts_Game.impl.DraughtsImpl <em>Draughts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Draughts_Game.impl.DraughtsImpl
	 * @see Draughts_Game.impl.Draughts_GamePackageImpl#getDraughts()
	 * @generated
	 */
	int DRAUGHTS = 0;

	/**
	 * The feature id for the '<em><b>Men</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAUGHTS__MEN = 0;

	/**
	 * The feature id for the '<em><b>Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAUGHTS__BOARD = 1;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAUGHTS__LOCATIONS = 2;

	/**
	 * The number of structural features of the '<em>Draughts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAUGHTS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Draughts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAUGHTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Draughts_Game.impl.ManImpl <em>Man</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Draughts_Game.impl.ManImpl
	 * @see Draughts_Game.impl.Draughts_GamePackageImpl#getMan()
	 * @generated
	 */
	int MAN = 1;

	/**
	 * The feature id for the '<em><b>Captures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__CAPTURES = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__COLOR = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN__LOCATION = 2;

	/**
	 * The number of structural features of the '<em>Man</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Man</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Draughts_Game.impl.KingImpl <em>King</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Draughts_Game.impl.KingImpl
	 * @see Draughts_Game.impl.Draughts_GamePackageImpl#getKing()
	 * @generated
	 */
	int KING = 2;

	/**
	 * The feature id for the '<em><b>Captures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KING__CAPTURES = MAN__CAPTURES;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KING__COLOR = MAN__COLOR;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KING__LOCATION = MAN__LOCATION;

	/**
	 * The number of structural features of the '<em>King</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KING_FEATURE_COUNT = MAN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>King</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KING_OPERATION_COUNT = MAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Draughts_Game.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Draughts_Game.impl.LocationImpl
	 * @see Draughts_Game.impl.Draughts_GamePackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ROW = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__COLUMN = 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Draughts_Game.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Draughts_Game.impl.BoardImpl
	 * @see Draughts_Game.impl.Draughts_GamePackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 4;

	/**
	 * The feature id for the '<em><b>Squares</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__SQUARES = 0;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Draughts_Game.impl.SquareImpl <em>Square</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Draughts_Game.impl.SquareImpl
	 * @see Draughts_Game.impl.Draughts_GamePackageImpl#getSquare()
	 * @generated
	 */
	int SQUARE = 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Mens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__MENS = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__COLOR = 2;

	/**
	 * The number of structural features of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Draughts_Game.COLOR <em>COLOR</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Draughts_Game.COLOR
	 * @see Draughts_Game.impl.Draughts_GamePackageImpl#getCOLOR()
	 * @generated
	 */
	int COLOR = 6;

	/**
	 * The meta object id for the '{@link Draughts_Game.ROW <em>ROW</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Draughts_Game.ROW
	 * @see Draughts_Game.impl.Draughts_GamePackageImpl#getROW()
	 * @generated
	 */
	int ROW = 7;

	/**
	 * The meta object id for the '{@link Draughts_Game.COLUMN <em>COLUMN</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Draughts_Game.COLUMN
	 * @see Draughts_Game.impl.Draughts_GamePackageImpl#getCOLUMN()
	 * @generated
	 */
	int COLUMN = 8;


	/**
	 * Returns the meta object for class '{@link Draughts_Game.Draughts <em>Draughts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Draughts</em>'.
	 * @see Draughts_Game.Draughts
	 * @generated
	 */
	EClass getDraughts();

	/**
	 * Returns the meta object for the containment reference list '{@link Draughts_Game.Draughts#getMen <em>Men</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Men</em>'.
	 * @see Draughts_Game.Draughts#getMen()
	 * @see #getDraughts()
	 * @generated
	 */
	EReference getDraughts_Men();

	/**
	 * Returns the meta object for the containment reference '{@link Draughts_Game.Draughts#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Board</em>'.
	 * @see Draughts_Game.Draughts#getBoard()
	 * @see #getDraughts()
	 * @generated
	 */
	EReference getDraughts_Board();

	/**
	 * Returns the meta object for the containment reference list '{@link Draughts_Game.Draughts#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see Draughts_Game.Draughts#getLocations()
	 * @see #getDraughts()
	 * @generated
	 */
	EReference getDraughts_Locations();

	/**
	 * Returns the meta object for class '{@link Draughts_Game.Man <em>Man</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Man</em>'.
	 * @see Draughts_Game.Man
	 * @generated
	 */
	EClass getMan();

	/**
	 * Returns the meta object for the reference list '{@link Draughts_Game.Man#getCaptures <em>Captures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Captures</em>'.
	 * @see Draughts_Game.Man#getCaptures()
	 * @see #getMan()
	 * @generated
	 */
	EReference getMan_Captures();

	/**
	 * Returns the meta object for the attribute '{@link Draughts_Game.Man#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see Draughts_Game.Man#getColor()
	 * @see #getMan()
	 * @generated
	 */
	EAttribute getMan_Color();

	/**
	 * Returns the meta object for the reference '{@link Draughts_Game.Man#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see Draughts_Game.Man#getLocation()
	 * @see #getMan()
	 * @generated
	 */
	EReference getMan_Location();

	/**
	 * Returns the meta object for class '{@link Draughts_Game.King <em>King</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>King</em>'.
	 * @see Draughts_Game.King
	 * @generated
	 */
	EClass getKing();

	/**
	 * Returns the meta object for class '{@link Draughts_Game.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see Draughts_Game.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link Draughts_Game.Location#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see Draughts_Game.Location#getRow()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Row();

	/**
	 * Returns the meta object for the attribute '{@link Draughts_Game.Location#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see Draughts_Game.Location#getColumn()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Column();

	/**
	 * Returns the meta object for class '{@link Draughts_Game.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see Draughts_Game.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the containment reference list '{@link Draughts_Game.Board#getSquares <em>Squares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Squares</em>'.
	 * @see Draughts_Game.Board#getSquares()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Squares();

	/**
	 * Returns the meta object for class '{@link Draughts_Game.Square <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Square</em>'.
	 * @see Draughts_Game.Square
	 * @generated
	 */
	EClass getSquare();

	/**
	 * Returns the meta object for the reference '{@link Draughts_Game.Square#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see Draughts_Game.Square#getLocation()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_Location();

	/**
	 * Returns the meta object for the containment reference '{@link Draughts_Game.Square#getMens <em>Mens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mens</em>'.
	 * @see Draughts_Game.Square#getMens()
	 * @see #getSquare()
	 * @generated
	 */
	EReference getSquare_Mens();

	/**
	 * Returns the meta object for the attribute '{@link Draughts_Game.Square#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see Draughts_Game.Square#getColor()
	 * @see #getSquare()
	 * @generated
	 */
	EAttribute getSquare_Color();

	/**
	 * Returns the meta object for enum '{@link Draughts_Game.COLOR <em>COLOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>COLOR</em>'.
	 * @see Draughts_Game.COLOR
	 * @generated
	 */
	EEnum getCOLOR();

	/**
	 * Returns the meta object for enum '{@link Draughts_Game.ROW <em>ROW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ROW</em>'.
	 * @see Draughts_Game.ROW
	 * @generated
	 */
	EEnum getROW();

	/**
	 * Returns the meta object for enum '{@link Draughts_Game.COLUMN <em>COLUMN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>COLUMN</em>'.
	 * @see Draughts_Game.COLUMN
	 * @generated
	 */
	EEnum getCOLUMN();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Draughts_GameFactory getDraughts_GameFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Draughts_Game.impl.DraughtsImpl <em>Draughts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Draughts_Game.impl.DraughtsImpl
		 * @see Draughts_Game.impl.Draughts_GamePackageImpl#getDraughts()
		 * @generated
		 */
		EClass DRAUGHTS = eINSTANCE.getDraughts();

		/**
		 * The meta object literal for the '<em><b>Men</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAUGHTS__MEN = eINSTANCE.getDraughts_Men();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAUGHTS__BOARD = eINSTANCE.getDraughts_Board();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAUGHTS__LOCATIONS = eINSTANCE.getDraughts_Locations();

		/**
		 * The meta object literal for the '{@link Draughts_Game.impl.ManImpl <em>Man</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Draughts_Game.impl.ManImpl
		 * @see Draughts_Game.impl.Draughts_GamePackageImpl#getMan()
		 * @generated
		 */
		EClass MAN = eINSTANCE.getMan();

		/**
		 * The meta object literal for the '<em><b>Captures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAN__CAPTURES = eINSTANCE.getMan_Captures();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAN__COLOR = eINSTANCE.getMan_Color();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAN__LOCATION = eINSTANCE.getMan_Location();

		/**
		 * The meta object literal for the '{@link Draughts_Game.impl.KingImpl <em>King</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Draughts_Game.impl.KingImpl
		 * @see Draughts_Game.impl.Draughts_GamePackageImpl#getKing()
		 * @generated
		 */
		EClass KING = eINSTANCE.getKing();

		/**
		 * The meta object literal for the '{@link Draughts_Game.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Draughts_Game.impl.LocationImpl
		 * @see Draughts_Game.impl.Draughts_GamePackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__ROW = eINSTANCE.getLocation_Row();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__COLUMN = eINSTANCE.getLocation_Column();

		/**
		 * The meta object literal for the '{@link Draughts_Game.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Draughts_Game.impl.BoardImpl
		 * @see Draughts_Game.impl.Draughts_GamePackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Squares</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__SQUARES = eINSTANCE.getBoard_Squares();

		/**
		 * The meta object literal for the '{@link Draughts_Game.impl.SquareImpl <em>Square</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Draughts_Game.impl.SquareImpl
		 * @see Draughts_Game.impl.Draughts_GamePackageImpl#getSquare()
		 * @generated
		 */
		EClass SQUARE = eINSTANCE.getSquare();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__LOCATION = eINSTANCE.getSquare_Location();

		/**
		 * The meta object literal for the '<em><b>Mens</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUARE__MENS = eINSTANCE.getSquare_Mens();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE__COLOR = eINSTANCE.getSquare_Color();

		/**
		 * The meta object literal for the '{@link Draughts_Game.COLOR <em>COLOR</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Draughts_Game.COLOR
		 * @see Draughts_Game.impl.Draughts_GamePackageImpl#getCOLOR()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getCOLOR();

		/**
		 * The meta object literal for the '{@link Draughts_Game.ROW <em>ROW</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Draughts_Game.ROW
		 * @see Draughts_Game.impl.Draughts_GamePackageImpl#getROW()
		 * @generated
		 */
		EEnum ROW = eINSTANCE.getROW();

		/**
		 * The meta object literal for the '{@link Draughts_Game.COLUMN <em>COLUMN</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Draughts_Game.COLUMN
		 * @see Draughts_Game.impl.Draughts_GamePackageImpl#getCOLUMN()
		 * @generated
		 */
		EEnum COLUMN = eINSTANCE.getCOLUMN();

	}

} //Draughts_GamePackage
