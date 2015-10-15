package com.tutorial.standalone.workouts;

public class ThreadLockDemoClient {
	public static void main(String args[]){
		final ThreadLockDemo objectMthd = new ThreadLockDemo();
		Thread thread1 = new Thread("Method1"){
			public void run(){
				objectMthd.method1();
			}
		};
		Thread thread2 = new Thread("Method2"){
			public void run(){
				objectMthd.method2();
			}
		};
		thread1.start();thread2.start();
		thread1.interrupt();
	}
}
