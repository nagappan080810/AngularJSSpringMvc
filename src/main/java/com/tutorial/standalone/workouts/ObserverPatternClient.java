package com.tutorial.standalone.workouts;

public class ObserverPatternClient {

	public static void main(String[] args) {
		KeyboardObservable observable = new KeyboardObservable();
		NewLineKeyedListener listener = new NewLineKeyedListener();
		observable.addObserver(listener);
		Thread worker = new Thread(observable);
		//starting the worker thread to observerable the scanner for new lines get typed..
		worker.start();
	}

}
