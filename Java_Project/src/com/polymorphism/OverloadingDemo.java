package com.polymorphism;

public class OverloadingDemo {
	public void method1(String name, int age) {
		System.out.println(name+ " "+age);
	}
	public void method1(String name, int age, int hight) { //by changing the no of parameters 
	//public void method1(String name, long age) { //by changing the data type
		System.out.println(name+" "+age+" "+hight);
	}
	
	public static void main(String[] args) {
		OverloadingDemo m1 = new OverloadingDemo();
		m1.method1("Swati", 25);
		m1.method1("Jyoti", 25, 5);		
	}

}

/* There are two ways to overload the method in java
By changing number of arguments
By changing the data type */

//method overloading, multiple methods can have the same name with different parameters