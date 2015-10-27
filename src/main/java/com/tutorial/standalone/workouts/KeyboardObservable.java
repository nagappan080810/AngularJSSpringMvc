package com.tutorial.standalone.workouts;

import java.util.Observable;
import java.util.Scanner;

public class KeyboardObservable extends Observable implements Runnable{

	public void run() {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		setChanged();
		//notify the observer a new line has been keyed in.
		notifyObservers(line);
	}

}
