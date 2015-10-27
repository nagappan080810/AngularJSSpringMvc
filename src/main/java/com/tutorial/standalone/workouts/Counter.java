package com.tutorial.standalone.workouts;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Counter {
	private volatile Integer i = new Integer(0);
    private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
	ReentrantReadWriteLock.ReadLock rl =  rwl.readLock();
	ReentrantReadWriteLock.WriteLock wl =  rwl.writeLock();
	 
	public void increment(){
//		rl.unlock();
		wl.lock();
		try{
			i++;
		}finally{
			wl.unlock();
		}
	}
	
	public void decrement(){
//		rl.unlock();
		wl.lock();
		try{
			i--;
		}finally{
			wl.unlock();
		}
	}
	
	public void printValue(){
		rl.lock();
//		wl.unlock();
		try{
			System.out.println("value is "+i);
		}finally{
			rl.unlock();
		}
		}
		
	}