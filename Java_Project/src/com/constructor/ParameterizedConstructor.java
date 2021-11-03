package com.constructor;

public class ParameterizedConstructor {
	String name;
	int age;
	
	public ParameterizedConstructor(String Myname, int Myage) {
		//this.name=Myname; when variable name in class and variable name in constructor are same
		name=Myname;
		age=Myage;		
		System.out.println("My name is: " +name + " my age is " +age);
	}

	public static void main(String[] args) {
		ParameterizedConstructor cons = new ParameterizedConstructor("Swati", 25);
		
	}

}
