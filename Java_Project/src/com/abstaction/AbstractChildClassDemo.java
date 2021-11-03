package com.abstaction;

public class AbstractChildClassDemo extends AbstractClassDemo {
	public void absMethod() {
		System.out.println("I am abstract method");
	}
		public static void main(String[] args) {
			AbstractChildClassDemo ACD= new AbstractChildClassDemo();
			ACD.absMethod();
			ACD.regMethod();
		}
	

}
