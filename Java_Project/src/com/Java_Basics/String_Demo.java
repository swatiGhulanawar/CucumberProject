package com.Java_Basics;

public class String_Demo {

	public static void main(String[] args) {
		String s="My name is Swati";
		int i = s.length(); //length will start counting from 1
		System.out.println("lenght of the string is:" +i); //string will count the value of space
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(0));//value will fetch from index value of the string
		System.out.println(s.codePointAt(1));
		System.out.println(s.concat(" I am learning JAVA"));
		System.out.println(s.substring(3)); //index value will count from 0
		System.out.println(s.substring(2, 10));
		System.out.println(s.subSequence(2, 10));
		System.out.println(s.replace('S', 's'));
		System.out.println(s.replaceAll("Swati", "Jyoti"));
		
				
		String str = "My name is \"Swati\" Ghulanawar";
		System.out.println(str);
		
		//This \ charter is black slash
		String str1 = "This \\ charter is black slash";
		System.out.println(str1);
		
		//contains
		System.out.println(s.contains("w"));
		
		//equals
		System.out.println(s.equals(s));		
		
		}

	}

