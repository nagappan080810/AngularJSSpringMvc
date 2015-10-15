package com.tutorial.standalone.workouts;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinClient {
	public static void main(String args[]){
		ForkJoinPool forkJoinPool = new ForkJoinPool(10);
		MyRecursiveAction recursiveAction = new MyRecursiveAction(50);
		forkJoinPool.invoke(recursiveAction);
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
