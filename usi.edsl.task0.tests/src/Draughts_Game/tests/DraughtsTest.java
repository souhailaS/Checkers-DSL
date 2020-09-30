/**
 */
package Draughts_Game.tests;

import Draughts_Game.Draughts;
import Draughts_Game.Draughts_GameFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Draughts</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DraughtsTest extends TestCase {

	/**
	 * The fixture for this Draughts test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Draughts fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DraughtsTest.class);
	}

	/**
	 * Constructs a new Draughts test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DraughtsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Draughts test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Draughts fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Draughts test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Draughts getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Draughts_GameFactory.eINSTANCE.createDraughts());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DraughtsTest
