package com.Interface;

public class ChildClass implements ParentClass,ChildClass1{
	//here interface classes are extended with implement keyword
	
	@Override
	public void Car1() { //body of Car1() is provided here
		System.out.println("Car is Blue");		
	}

	@Override
	public void Car2() { //body of Car2() is provided here
		System.out.println("Car is black");		
	}
	@Override
	public void Car3() {
		System.out.println("Car is White");		
	}
	
	public static void main(String[] args) {
		ChildClass interfaces = new ChildClass();
		interfaces.Car1();
		interfaces.Car2();
		interfaces.Car3();

	}


}
