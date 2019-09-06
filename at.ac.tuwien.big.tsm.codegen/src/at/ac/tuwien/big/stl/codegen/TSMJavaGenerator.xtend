package at.ac.tuwien.big.stl.codegen

import at.ac.tuwien.big.tsm.StateMachine
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import at.ac.tuwien.big.tsm.State

class TSMJavaGenerator implements IGenerator {

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val EObject root = input.contents.get(0)
		generateFiles(root, fsa)
	}
	
	def dispatch generateFiles(StateMachine stateMachine, IFileSystemAccess fsa) {
		fsa.generateFile(stateMachine.packageName.replace(".", "/") + "/" + stateMachine.className + ".java", generateJavaClass(stateMachine));
	}
	
	def dispatch generateFiles(EObject object, IFileSystemAccess access) {
		println("TSMJavaGenerator: Ignoring model element: " + object)
	}
	
	private def generateJavaClass(StateMachine stateMachine) '''
		 package «stateMachine.packageName»;
		 
		 import java.util.concurrent.TimeUnit;
		 import at.ac.tuwien.big.stl.codegen.lib.TimeWatch;
		 
		 public class «stateMachine.className» {
		 
		 	static «stateMachine.stateEnumerationName» prevState = null;
		 	static «stateMachine.stateEnumerationName» state = «stateMachine.stateEnumerationName».«stateMachine.start.stateEnumValue»;
		 	static TimeWatch watch = null;
		 	
		 	public static void main(String[] args) {
		 		watch = TimeWatch.start();
		 		while (true) {
		 			runStateMachine();
		 		}
		 	}
		 	
		 	private static void runStateMachine() {
		 		«FOR State state : stateMachine.states»
		 		if (state == «stateMachine.stateEnumerationName».«state.stateEnumValue») {
		 			if (prevState != state) {
		 				System.out.println("«state.name»");
		 				prevState = state;
		 			}
		 			if (watch.time(TimeUnit.SECONDS) > «state.outgoing.get(0).timer.time») {
		 				System.out.println("«state.outgoing.get(0).name»");
		 				state = «stateMachine.stateEnumerationName».«state.outgoing.get(0).target.stateEnumValue»;
		 				watch.reset();
		 			}
		 		}
		 		«ENDFOR»
		 	}
		 	
		 	enum «stateMachine.name.toAlphaNumerical»States {
		 		«FOR State state : stateMachine.states SEPARATOR ', '»
		 		«state.stateEnumValue»
				«ENDFOR»
		 	}
		 }
	'''	

	/**
	 * Returns a String which is stripped of all non alpha-numerical values. 
	 * This is needed for computing the identifiers (id) of HTML elements as well as 
	 * the file names for details pages.
	 * 
	 * @param string String for which non alpha-numerical values should be removed
	 * @return String with removed non alpha-numerical values
	 */
	private def toAlphaNumerical(String string) {
		string.replaceAll("[^A-Za-z0-9]", "")
	}
	
	/**
	 * Computes name of enumeration that should be generated for a state machine.
	 * 
	 * @param stateMachine State machine for which an enumeration name should be computed
	 * @return Computed enumeration name
	 */
	private def getStateEnumerationName(StateMachine stateMachine) {
		stateMachine.name.toAlphaNumerical + "States"
	}
	
	/**
	 * Computes the enumeration literal for a state.
	 * 
	 * @param state State for which an enumeration literal should be computed
	 * @return Enumeration literal computed for the provided state
	 */
	private def getStateEnumValue(State state) {
		state.name.toAlphaNumerical.toUpperCase
	}
	
	/**
	 * Computes the name of the package that should be generated for a state machine.
	 * 
	 * @param stateMachine State machine for which a package name should be computed
	 * @return Computed package name
	 */
	private def getPackageName(StateMachine stateMachine) {
		"at.ac.tuwien.big.tsm." + stateMachine.name.toAlphaNumerical.toLowerCase
	}
	
	/**
	 * Computes the name of the class that should be generated for a state machine.
	 * 
	 * @param stateMachine for which a class name should be computed
	 * @return Computed class name
	 */
	private def getClassName(StateMachine stateMachine) {
		stateMachine.name.toAlphaNumerical
	}
}
