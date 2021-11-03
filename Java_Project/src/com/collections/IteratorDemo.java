package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList <Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		Iterator <Integer> b=a.iterator();
//		System.out.println(b.next()); //to print the 1st element=10
//		System.out.println(b.next()); //to print next int value =20
//		System.out.println(a.get(4)); //by index value
		
		while(b.hasNext()) { //if the array list has multiple values and all we need to print them we can use while loop
			System.out.println(b.next());
			
		}

	}

}

/*
* An Iterator is an object that can be used to loop through collections, like
* ArrayList and HashSet. It is called an "iterator" because "iterating" is the
* technical term for looping.
*
* To use an Iterator, you must import it from the java.util package.
*/
