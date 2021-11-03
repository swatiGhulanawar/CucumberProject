package com.collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		//random sequence prints and dosen't allow duplicate value and only allow single value
		HashSet<String> myHasSet = new HashSet<String>(); //hash map prints value without 
		myHasSet.add("India");
		myHasSet.add("Japan");
		myHasSet.add("ShriLanka");
		myHasSet.add("South India");
		System.out.println(myHasSet);
		
		for (String j : myHasSet) {
			System.out.println(j);	
		}

		
	}

}


