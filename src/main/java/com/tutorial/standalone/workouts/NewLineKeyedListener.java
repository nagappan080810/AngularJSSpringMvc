package com.tutorial.standalone.workouts;

import java.util.Observable;
import java.util.Observer;

public class NewLineKeyedListener implements Observer {

	public void update(Observable o, Object line) {
		// received new line to be printed in the console.
		System.out.println("Keyed Line is" + line);
	}
}
