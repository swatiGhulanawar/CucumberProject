package com.abstaction;

public class InterfaceChildClass implements InterfaceDemo {

	@Override
	public void method1() {
		System.out.println("method 1");
	}

	@Override
	public void method2() {
		System.out.println("method 2");
	}
	public static void main(String[] args) {
		InterfaceChildClass icc = new InterfaceChildClass();
		icc.method1();
		icc.method2();
		
	}
}
