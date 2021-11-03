package com.TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	@Test //this is anotation
	public void test1() {
		System.out.println("@ Test 1");
	}
	@BeforeTest //this will execute before @Test1 method
	public void test2() {
		System.out.println("Before Test 2");
	}
	@AfterTest 
	public void test3() {
		System.out.println("After Test 3");
	}
	@AfterMethod 
	public void test4() {
		System.out.println("After method 4");
	}
	@BeforeMethod 
	public void test5() {
		System.out.println("Before method 5");
	}
	@BeforeClass
	public void test6() {
		System.out.println("Before class 6");
	}
	@AfterClass
	public void test7() {
		System.out.println("After class 7");
	}
	@AfterSuite
	public void test8() {
		System.out.println("After suite 7");
	}
}

/*
@BeforeTest --> it will run only once
@BeforeMethod  --> it will run before every method
@Test --> 
@AfterMethod
@AfterTest
*/
