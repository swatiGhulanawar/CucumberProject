package com.Java_Basics;

public class StringTrim {
	//trim() method used to remove the whitespace from start/end of string 
	//this will not remove any space between string 

	public static void main(String[] args) {
		String myStr = " Hello World!       ";
		System.out.println("before trim:" +myStr);
		System.out.println("After trim:" +myStr.trim());

	}

}
