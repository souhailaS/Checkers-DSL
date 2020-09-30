/**
 */
package Draughts_Game.impl;

import Draughts_Game.Board;
import Draughts_Game.Draughts;
import Draughts_Game.Draughts_GamePackage;
import Draughts_Game.Location;
import Draughts_Game.Man;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Draughts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Draughts_Game.impl.DraughtsImpl#getMen <em>Men</em>}</li>
 *   <li>{@link Draughts_Game.impl.DraughtsImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link Draughts_Game.impl.DraughtsImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DraughtsImpl extends MinimalEObjectImpl.Container implements Draughts {
	/**
	 * The cached value of the '{@link #getMen() <em>Men</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMen()
	 * @generated
	 * @ordered
	 */
	protected EList<Man> men;

	/**
	 * The cached value of the '{@link #getBoard() <em>Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoard()
	 * @generated
	 * @ordered
	 */
	protected Board board;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DraughtsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Draughts_GamePackage.Literals.DRAUGHTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Man> getMen() {
		if (men == null) {
			men = new EObjectContainmentEList<Man>(Man.class, this, Draughts_GamePackage.DRAUGHTS__MEN);
		}
		return men;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board getBoard() {
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoard(Board newBoard, NotificationChain msgs) {
		Board oldBoard = board;
		board = newBoard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Draughts_GamePackage.DRAUGHTS__BOARD, oldBoard, newBoard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoard(Board newBoard) {
		if (newBoard != board) {
			NotificationChain msgs = null;
			if (board != null)
				msgs = ((InternalEObject)board).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Draughts_GamePackage.DRAUGHTS__BOARD, null, msgs);
			if (newBoard != null)
				msgs = ((InternalEObject)newBoard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Draughts_GamePackage.DRAUGHTS__BOARD, null, msgs);
			msgs = basicSetBoard(newBoard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draughts_GamePackage.DRAUGHTS__BOARD, newBoard, newBoard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<Location>(Location.class, this, Draughts_GamePackage.DRAUGHTS__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Draughts_GamePackage.DRAUGHTS__MEN:
				return ((InternalEList<?>)getMen()).basicRemove(otherEnd, msgs);
			case Draughts_GamePackage.DRAUGHTS__BOARD:
				return basicSetBoard(null, msgs);
			case Draughts_GamePackage.DRAUGHTS__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Draughts_GamePackage.DRAUGHTS__MEN:
				return getMen();
			case Draughts_GamePackage.DRAUGHTS__BOARD:
				return getBoard();
			case Draughts_GamePackage.DRAUGHTS__LOCATIONS:
				return getLocations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Draughts_GamePackage.DRAUGHTS__MEN:
				getMen().clear();
				getMen().addAll((Collection<? extends Man>)newValue);
				return;
			case Draughts_GamePackage.DRAUGHTS__BOARD:
				setBoard((Board)newValue);
				return;
			case Draughts_GamePackage.DRAUGHTS__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Draughts_GamePackage.DRAUGHTS__MEN:
				getMen().clear();
				return;
			case Draughts_GamePackage.DRAUGHTS__BOARD:
				setBoard((Board)null);
				return;
			case Draughts_GamePackage.DRAUGHTS__LOCATIONS:
				getLocations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Draughts_GamePackage.DRAUGHTS__MEN:
				return men != null && !men.isEmpty();
			case Draughts_GamePackage.DRAUGHTS__BOARD:
				return board != null;
			case Draughts_GamePackage.DRAUGHTS__LOCATIONS:
				return locations != null && !locations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DraughtsImpl
