package at.ac.tuwien.big.tsm.trafficlightstatemachine;

import java.util.concurrent.TimeUnit;
import at.ac.tuwien.big.stl.codegen.lib.TimeWatch;

public class TrafficLightStateMachine {

	static TrafficLightStateMachineStates prevState = null;
	static TrafficLightStateMachineStates state = TrafficLightStateMachineStates.GREEN;
	static TimeWatch watch = null;
	
	public static void main(String[] args) {
		watch = TimeWatch.start();
		while (true) {
			runStateMachine();
		}
	}
	
	private static void runStateMachine() {
		if (state == TrafficLightStateMachineStates.GREEN) {
			if (prevState != state) {
				System.out.println("green");
				prevState = state;
			}
			if (watch.time(TimeUnit.SECONDS) > 15) {
				System.out.println("green-to-yellow");
				state = TrafficLightStateMachineStates.YELLOW;
				watch.reset();
			}
		}
		if (state == TrafficLightStateMachineStates.YELLOW) {
			if (prevState != state) {
				System.out.println("yellow");
				prevState = state;
			}
			if (watch.time(TimeUnit.SECONDS) > 5) {
				System.out.println("yellow-to-red");
				state = TrafficLightStateMachineStates.RED;
				watch.reset();
			}
		}
		if (state == TrafficLightStateMachineStates.RED) {
			if (prevState != state) {
				System.out.println("red");
				prevState = state;
			}
			if (watch.time(TimeUnit.SECONDS) > 20) {
				System.out.println("red-to-green");
				state = TrafficLightStateMachineStates.GREEN;
				watch.reset();
			}
		}
	}
	
	enum TrafficLightStateMachineStates {
		GREEN, 
		YELLOW, 
		RED
	}
}
