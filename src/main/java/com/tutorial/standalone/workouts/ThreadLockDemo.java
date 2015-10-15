package com.tutorial.standalone.workouts;

public class ThreadLockDemo {
	
	public void method1(){
		synchronized(Integer.class){
			System.out.println("method1 - Inside Integer block");
			synchronized(String.class){
				System.out.println("method1 - Inside String block nested within Integer block");
			}
		}
		
	}
	
	public void method2(){
		synchronized(String.class){
			System.out.println("method2 - Inside String block");
			synchronized(Integer.class){
				System.out.println("method2 - Inside Integer block nested within String block");
			}
		}
	}

}
