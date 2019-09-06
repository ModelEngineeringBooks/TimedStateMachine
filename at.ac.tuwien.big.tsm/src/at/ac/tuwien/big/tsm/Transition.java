/**
 */
package at.ac.tuwien.big.tsm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.tsm.Transition#getTimer <em>Timer</em>}</li>
 *   <li>{@link at.ac.tuwien.big.tsm.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link at.ac.tuwien.big.tsm.Transition#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.tsm.TsmPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer</em>' containment reference.
	 * @see #setTimer(TimeEvent)
	 * @see at.ac.tuwien.big.tsm.TsmPackage#getTransition_Timer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeEvent getTimer();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.tsm.Transition#getTimer <em>Timer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer</em>' containment reference.
	 * @see #getTimer()
	 * @generated
	 */
	void setTimer(TimeEvent value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.tsm.State#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see at.ac.tuwien.big.tsm.TsmPackage#getTransition_Target()
	 * @see at.ac.tuwien.big.tsm.State#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.tsm.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.tsm.State#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see at.ac.tuwien.big.tsm.TsmPackage#getTransition_Source()
	 * @see at.ac.tuwien.big.tsm.State#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.tsm.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

} // Transition
