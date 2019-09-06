/**
 */
package at.ac.tuwien.big.tsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.tsm.State#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link at.ac.tuwien.big.tsm.State#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.tsm.TsmPackage#getState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OneOutgoingEdge'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OneOutgoingEdge='self.outgoing -&gt; size() = 1'"
 * @generated
 */
public interface State extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.tsm.Transition}.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.tsm.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see at.ac.tuwien.big.tsm.TsmPackage#getState_Incoming()
	 * @see at.ac.tuwien.big.tsm.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.tsm.Transition}.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.tsm.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see at.ac.tuwien.big.tsm.TsmPackage#getState_Outgoing()
	 * @see at.ac.tuwien.big.tsm.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoing();

} // State
