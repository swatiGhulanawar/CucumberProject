package com.methods;

public class Methods {
	//void method
	public void test1() { //this is method
		System.out.println("I am method 1");
	}
	//static method
	public static void test2() {
		System.out.println("I am static method");
	}
	//void method dosen't have return method
	public void test3() {
		System.out.println("I am method 2");
	}
	//method with return type 
	public static int test4() {
		int a =20;
		return a;		
	}
	
	//This is parameterized method
	public void paraMethod (String name, int age)
	{
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		//class_name object = new class_name();
		
		Methods m=new Methods();
		m.test1();
		test2(); //static method called 
		m.test3();
		System.out.println(test4());
		m.paraMethod("Swati", 25);
		
	}

}
