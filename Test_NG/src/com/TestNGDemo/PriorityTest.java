package com.TestNGDemo;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority=1)
	public void method_A() {
		System.out.println("I am Method A");
	}
	@Test //if priority is not been assigened the TestNG will assign 0 by default
	public void method_B() {
		System.out.println("I am Method B");
	}
	@Test (priority=1)
	public void method_C() {
		System.out.println("I am Method C");
	}
	@Test (priority=-1) //lowest no will be considered to execute 1st
	public void method_D() {
		System.out.println("I am Method D");
	}@Test 
	public void method_F() {
		System.out.println("I am Method F");
	}
	@Test //if more than 1 method has not assigend priority the it will execute with alphabetical order
	public void method_E() {
	System.out.println("I am Method E");
	}

}
