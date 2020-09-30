/**
 */
package Draughts_Game.impl;

import Draughts_Game.COLOR;
import Draughts_Game.Draughts_GamePackage;
import Draughts_Game.Location;
import Draughts_Game.Man;
import Draughts_Game.Square;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Square</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Draughts_Game.impl.SquareImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link Draughts_Game.impl.SquareImpl#getMens <em>Mens</em>}</li>
 *   <li>{@link Draughts_Game.impl.SquareImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SquareImpl extends MinimalEObjectImpl.Container implements Square {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getMens() <em>Mens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMens()
	 * @generated
	 * @ordered
	 */
	protected Man mens;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final COLOR COLOR_EDEFAULT = COLOR.DARK;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected COLOR color = COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SquareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Draughts_GamePackage.Literals.SQUARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Draughts_GamePackage.SQUARE__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draughts_GamePackage.SQUARE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Man getMens() {
		return mens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMens(Man newMens, NotificationChain msgs) {
		Man oldMens = mens;
		mens = newMens;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Draughts_GamePackage.SQUARE__MENS, oldMens, newMens);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMens(Man newMens) {
		if (newMens != mens) {
			NotificationChain msgs = null;
			if (mens != null)
				msgs = ((InternalEObject)mens).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Draughts_GamePackage.SQUARE__MENS, null, msgs);
			if (newMens != null)
				msgs = ((InternalEObject)newMens).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Draughts_GamePackage.SQUARE__MENS, null, msgs);
			msgs = basicSetMens(newMens, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draughts_GamePackage.SQUARE__MENS, newMens, newMens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COLOR getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(COLOR newColor) {
		COLOR oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Draughts_GamePackage.SQUARE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Draughts_GamePackage.SQUARE__MENS:
				return basicSetMens(null, msgs);
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
			case Draughts_GamePackage.SQUARE__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case Draughts_GamePackage.SQUARE__MENS:
				return getMens();
			case Draughts_GamePackage.SQUARE__COLOR:
				return getColor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Draughts_GamePackage.SQUARE__LOCATION:
				setLocation((Location)newValue);
				return;
			case Draughts_GamePackage.SQUARE__MENS:
				setMens((Man)newValue);
				return;
			case Draughts_GamePackage.SQUARE__COLOR:
				setColor((COLOR)newValue);
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
			case Draughts_GamePackage.SQUARE__LOCATION:
				setLocation((Location)null);
				return;
			case Draughts_GamePackage.SQUARE__MENS:
				setMens((Man)null);
				return;
			case Draughts_GamePackage.SQUARE__COLOR:
				setColor(COLOR_EDEFAULT);
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
			case Draughts_GamePackage.SQUARE__LOCATION:
				return location != null;
			case Draughts_GamePackage.SQUARE__MENS:
				return mens != null;
			case Draughts_GamePackage.SQUARE__COLOR:
				return color != COLOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //SquareImpl
