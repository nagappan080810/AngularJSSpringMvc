package com.tutorial.standalone.workouts;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterClient {

	public static void main(String[] args) {
		final AtomicInteger integer = new AtomicInteger();
		final Counter counter = new Counter();
		Thread t1 = new Thread(){
			public void run(){
				counter.decrement();
				integer.decrementAndGet();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				counter.increment();
				integer.incrementAndGet();
			}
		};
		
		t1.start();t2.start();
//		t1.join();t2.join();
		counter.printValue();
		System.out.println("AtomicInteger value is "+integer.get());

	}

}
