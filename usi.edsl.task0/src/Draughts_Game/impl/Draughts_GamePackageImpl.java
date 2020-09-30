/**
 */
package Draughts_Game.impl;

import Draughts_Game.Board;
import Draughts_Game.Draughts;
import Draughts_Game.Draughts_GameFactory;
import Draughts_Game.Draughts_GamePackage;
import Draughts_Game.King;
import Draughts_Game.Location;
import Draughts_Game.Man;
import Draughts_Game.Square;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Draughts_GamePackageImpl extends EPackageImpl implements Draughts_GamePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass draughtsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass squareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rowEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum columnEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Draughts_Game.Draughts_GamePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Draughts_GamePackageImpl() {
		super(eNS_URI, Draughts_GameFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Draughts_GamePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Draughts_GamePackage init() {
		if (isInited) return (Draughts_GamePackage)EPackage.Registry.INSTANCE.getEPackage(Draughts_GamePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDraughts_GamePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Draughts_GamePackageImpl theDraughts_GamePackage = registeredDraughts_GamePackage instanceof Draughts_GamePackageImpl ? (Draughts_GamePackageImpl)registeredDraughts_GamePackage : new Draughts_GamePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDraughts_GamePackage.createPackageContents();

		// Initialize created meta-data
		theDraughts_GamePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDraughts_GamePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Draughts_GamePackage.eNS_URI, theDraughts_GamePackage);
		return theDraughts_GamePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDraughts() {
		return draughtsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDraughts_Men() {
		return (EReference)draughtsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDraughts_Board() {
		return (EReference)draughtsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDraughts_Locations() {
		return (EReference)draughtsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMan() {
		return manEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMan_Captures() {
		return (EReference)manEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMan_Color() {
		return (EAttribute)manEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMan_Location() {
		return (EReference)manEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKing() {
		return kingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Row() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Column() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoard() {
		return boardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoard_Squares() {
		return (EReference)boardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSquare() {
		return squareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSquare_Location() {
		return (EReference)squareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSquare_Mens() {
		return (EReference)squareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSquare_Color() {
		return (EAttribute)squareEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCOLOR() {
		return colorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getROW() {
		return rowEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCOLUMN() {
		return columnEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Draughts_GameFactory getDraughts_GameFactory() {
		return (Draughts_GameFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		draughtsEClass = createEClass(DRAUGHTS);
		createEReference(draughtsEClass, DRAUGHTS__MEN);
		createEReference(draughtsEClass, DRAUGHTS__BOARD);
		createEReference(draughtsEClass, DRAUGHTS__LOCATIONS);

		manEClass = createEClass(MAN);
		createEReference(manEClass, MAN__CAPTURES);
		createEAttribute(manEClass, MAN__COLOR);
		createEReference(manEClass, MAN__LOCATION);

		kingEClass = createEClass(KING);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__ROW);
		createEAttribute(locationEClass, LOCATION__COLUMN);

		boardEClass = createEClass(BOARD);
		createEReference(boardEClass, BOARD__SQUARES);

		squareEClass = createEClass(SQUARE);
		createEReference(squareEClass, SQUARE__LOCATION);
		createEReference(squareEClass, SQUARE__MENS);
		createEAttribute(squareEClass, SQUARE__COLOR);

		// Create enums
		colorEEnum = createEEnum(COLOR);
		rowEEnum = createEEnum(ROW);
		columnEEnum = createEEnum(COLUMN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		kingEClass.getESuperTypes().add(this.getMan());

		// Initialize classes, features, and operations; add parameters
		initEClass(draughtsEClass, Draughts.class, "Draughts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDraughts_Men(), this.getMan(), null, "men", null, 0, -1, Draughts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDraughts_Board(), this.getBoard(), null, "board", null, 1, 1, Draughts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDraughts_Locations(), this.getLocation(), null, "locations", null, 64, 64, Draughts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manEClass, Man.class, "Man", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMan_Captures(), this.getMan(), null, "captures", null, 0, -1, Man.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMan_Color(), this.getCOLOR(), "color", null, 0, 1, Man.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMan_Location(), this.getLocation(), null, "location", null, 0, 1, Man.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kingEClass, King.class, "King", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Row(), this.getROW(), "row", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Column(), ecorePackage.getEChar(), "column", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boardEClass, Board.class, "Board", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoard_Squares(), this.getSquare(), null, "squares", null, 64, 64, Board.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(squareEClass, Square.class, "Square", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSquare_Location(), this.getLocation(), null, "location", null, 1, 1, Square.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSquare_Mens(), this.getMan(), null, "mens", null, 0, 1, Square.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSquare_Color(), this.getCOLOR(), "color", null, 0, 1, Square.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(colorEEnum, Draughts_Game.COLOR.class, "COLOR");
		addEEnumLiteral(colorEEnum, Draughts_Game.COLOR.DARK);
		addEEnumLiteral(colorEEnum, Draughts_Game.COLOR.LIGHT);

		initEEnum(rowEEnum, Draughts_Game.ROW.class, "ROW");
		addEEnumLiteral(rowEEnum, Draughts_Game.ROW._1);
		addEEnumLiteral(rowEEnum, Draughts_Game.ROW._2);
		addEEnumLiteral(rowEEnum, Draughts_Game.ROW._3);
		addEEnumLiteral(rowEEnum, Draughts_Game.ROW._4);
		addEEnumLiteral(rowEEnum, Draughts_Game.ROW._5);
		addEEnumLiteral(rowEEnum, Draughts_Game.ROW._6);
		addEEnumLiteral(rowEEnum, Draughts_Game.ROW._7);
		addEEnumLiteral(rowEEnum, Draughts_Game.ROW._8);

		initEEnum(columnEEnum, Draughts_Game.COLUMN.class, "COLUMN");
		addEEnumLiteral(columnEEnum, Draughts_Game.COLUMN.A);
		addEEnumLiteral(columnEEnum, Draughts_Game.COLUMN.B);
		addEEnumLiteral(columnEEnum, Draughts_Game.COLUMN.C);
		addEEnumLiteral(columnEEnum, Draughts_Game.COLUMN.D);
		addEEnumLiteral(columnEEnum, Draughts_Game.COLUMN.E);
		addEEnumLiteral(columnEEnum, Draughts_Game.COLUMN.F);
		addEEnumLiteral(columnEEnum, Draughts_Game.COLUMN.G);
		addEEnumLiteral(columnEEnum, Draughts_Game.COLUMN.H);

		// Create resource
		createResource(eNS_URI);
	}

} //Draughts_GamePackageImpl
