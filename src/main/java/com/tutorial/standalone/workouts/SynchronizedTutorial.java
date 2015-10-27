package com.tutorial.standalone.workouts;

public class SynchronizedTutorial {
	private int noOfExecutions;
	
	public synchronized void printTable(int num){
		System.out.println("printing the table for "+num);
		for(int i=0; i<50;i++){
			System.out.println("Value for"+num+"*"+i+"="+num*i);
			noOfExecutions++;
			try{
				Thread.sleep(400);
			}catch(Exception e){
				
			}
		}
		System.out.println("num is "+noOfExecutions);
		
	}
	
	public static void main(String args[]){
		SynchronizedTutorial obj1 = new SynchronizedTutorial();
		SynchronizedTutorial obj2 = new SynchronizedTutorial();
		TableWriterThread t1 = new TableWriterThread(obj1, 3);
		TableWriterThread t3 = new TableWriterThread(obj1, 13);
		TableWriterThread t2 = new TableWriterThread(obj2, 11);
		TableWriterThread t4 = new TableWriterThread(obj2, 17);
		t1.start();t2.start();
		t3.start();t4.start();
	}
	
	static class TableWriterThread extends Thread{
		SynchronizedTutorial obj = new SynchronizedTutorial();
		Integer num ;
		public TableWriterThread(SynchronizedTutorial obj, Integer num){
			this.obj = obj;
			this.num = num;
		}
		public void run(){
			this.obj.printTable(num);
		}
		
	}

}
