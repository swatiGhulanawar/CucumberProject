package com.Java_Basics;

public class StringEquals {

	public static void main(String[] args) {
		String s1="Swati";
		String s2="Swati";
		String s3="swati";
		
		System.out.println(s1.equals(s3)); //didn't match as there is difference between upper and lower case
		System.out.println(s2.equals(s1));

	}

}
