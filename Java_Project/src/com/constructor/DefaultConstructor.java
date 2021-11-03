package com.constructor;

public class DefaultConstructor {
	int x;
	
	public DefaultConstructor() {
		x=10;
		//System.out.println(x); we can print the values inside the constructor
	}

	public static void main(String[] args) {
		DefaultConstructor cons = new DefaultConstructor(); //cons is object of class
		//The constructor is called when an object of a class is created
		System.out.println(cons.x); //we can print the values in main method
		
	}

}
/*
*
* A constructor in Java is a special method that is used to initialize objects. 
* The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:
* Note that the constructor name must match the class name, and it cannot have
* a return type (like void).
*
* Also note that the constructor is called when the object is created.
*
* All classes have constructors by default: if you do not create a class
* constructor yourself, Java creates one for you. However, then you are not
* able to set initial values for object attributes.
*
*
*/