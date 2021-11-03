package com.collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		//HashMap <String, Integer> hashMap1=new HashMap<String, Integer>();
		//HashMap uses Key value pair 
		HashMap <String, String> hashMap=new HashMap<String, String>();
		hashMap.put("Maharshtar", "Mumbai");
		hashMap.put("Karanatka", "Banglore");
		hashMap.put(" ", "Panji");
		hashMap.put("Delhi", "Noida");
		hashMap.put(null, null); 
		
//		System.out.println(hashMap);
//		System.out.println(hashMap.get("Maharshtar"));
//		
//		for (String str:hashMap.keySet()) { //to print keys i.e. Maharshtra is key
//			System.out.println(str);
//			
//		}for (String str1 :hashMap.values()) { //to print values i.e. Mumbai is value
//			System.out.println(str1);
//		}
	for(String str2:hashMap.keySet()) {
			System.out.println(str2+ " " +hashMap.get(str2));
		}
	}

}
/*
* Stores
* In HashMap we store a key-value pair.
* It maintains the mapping of key and value.
* In HashSet, we store objects.

Duplicate values
In Hashmap -It does not allow duplicate keys, but duplicate values are allowed.
Hashset- It does not allow duplicate values.

Null values
Hashmap: It can contain a single null key and multiple null values.
Hashset: It can contain a single null value.
* A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the same type, like: String keys and String values:
*/
