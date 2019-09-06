/**
 */
package at.ac.tuwien.big.tsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.tsm.StateMachine#getStates <em>States</em>}</li>
 *   <li>{@link at.ac.tuwien.big.tsm.StateMachine#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link at.ac.tuwien.big.tsm.StateMachine#getStart <em>Start</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.tsm.TsmPackage#getStateMachine()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='StateNamesStartWithLowerCaseLetter'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot StateNamesStartWithLowerCaseLetter='self.states -&gt; forAll(s : State | s.name.at(1) = s.name.at(1).toLowerCase())'"
 * @generated
 */
public interface StateMachine extends NamedElement {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.tsm.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see at.ac.tuwien.big.tsm.TsmPackage#getStateMachine_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.tsm.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see at.ac.tuwien.big.tsm.TsmPackage#getStateMachine_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(State)
	 * @see at.ac.tuwien.big.tsm.TsmPackage#getStateMachine_Start()
	 * @model required="true"
	 * @generated
	 */
	State getStart();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.tsm.StateMachine#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(State value);

} // StateMachine
