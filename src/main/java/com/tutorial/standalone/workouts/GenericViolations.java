package com.tutorial.standalone.workouts;
import java.util.*;

public class GenericViolations {

	public static void main(String[] args) {
		Integer i = 10;
		Object o = i;
		List<Integer> list = new ArrayList<Integer>();
		addAndPrint(i, list);
		System.out.println("size ->"+list.size());
	}
	
	public static<E,F extends Collection<E>> void addAndPrint(E element, F collection){
		collection.add(element);
		for (E e:collection){
			System.out.println("value is"+e);
		}
	}

}
