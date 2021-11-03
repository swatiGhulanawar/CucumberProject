package com.modifiers;

public class AccessModifiers { //public class can be accessed out side the package
	// class AccessModifiers {	
	
	//public void demo1() { //The code is accessible for all classes outside package
	//private void demo1() { //The code is only accessible within the declared class	
	protected void demo1() { //The code is accessible in the same package and subclasses
		System.out.println("Swati");
	}


}
/*
* For classes, you can use either public or default:
* Public:The class is accessible by any other class outside package
* Default:The class is only accessible by classes in the same package. This is used when you don't specify a modifier
*
* For attributes, methods and constructors, you can use the one of the following:
* public The code is accessible for all classes outside package
private The code is only accessible within the declared class
default The code is only accessible in the same package. This is used when you don't specify a modifier.
protected The code is accessible in the same package and subclasses.
*
*
*/