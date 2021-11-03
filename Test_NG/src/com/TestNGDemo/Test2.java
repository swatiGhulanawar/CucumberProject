package com.TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	@Test //this is anotation
	public void test1() {
		System.out.println("@ Test2 1");
	}
	@BeforeTest //this will execute before @Test1 method
	public void test2() {
		System.out.println("Before Test2 2");
	}
	@AfterTest 
	public void test3() {
		System.out.println("After Test2 3");
	}
	@AfterMethod 
	public void test4() {
		System.out.println("After method2 4");
	}
	@BeforeMethod 
	public void test5() {
		System.out.println("Before method2 5");
	}
	@BeforeClass
	public void test6() {
		System.out.println("Before class2 6");
	}
	@AfterClass
	public void test7() {
		System.out.println("After class2 7");
	}
	@Test(groups= {"Regression"})
	public void test8() {
		System.out.println("Before suite2 7....Regression");
	}
	
	@Test (groups= {"Smoke"})
	public void testgroup() {
		System.out.println("to run the particular method......I am testgroup");
	}
	@Test (groups= {"Smoke"})
	public void testgroup1() {
		System.out.println("to run the particular method......I am testgroup1");
	}
}
