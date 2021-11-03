package com.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList <String> myArray = new ArrayList <String>();
		myArray.add("Rose");
		myArray.add("Lotus");
		myArray.add("Rose");
		myArray.add("Orchid");
	
//	System.out.println("Removed from array list with index value 3: "+myArray.remove(3));
//	System.out.println("Index value of Rose is: "+myArray.indexOf("Rose"));
//	myArray.remove("Orchid");
//	//System.out.println("Removed directly passing the value of array: "+myArray.remove("Orchid"));
//	System.out.println("Size of array is: "+myArray.size());
//	System.out.println("Value of index_value 2: "+myArray.get(2));
//	System.out.println("Array "+myArray);		
		myArray.size();
	for (int i = 0; i<myArray.size(); i++) {
		System.out.println(myArray.get(i));
	}
	}

}

/*The ArrayList class is a re-sizable array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified
(if you want to add or remove elements to/from an array, you have to create a new one). 
While elements can be added and removed from an ArrayList whenever you want.
*/