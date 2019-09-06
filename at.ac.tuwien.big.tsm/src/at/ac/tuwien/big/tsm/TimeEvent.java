/**
 */
package at.ac.tuwien.big.tsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.tsm.TimeEvent#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.tsm.TsmPackage#getTimeEvent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TimeGreaterZero'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot TimeGreaterZero='self.time &gt; 0'"
 * @generated
 */
public interface TimeEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see at.ac.tuwien.big.tsm.TsmPackage#getTimeEvent_Time()
	 * @model required="true"
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.tsm.TimeEvent#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

} // TimeEvent
