package com.TestNGDemo;

import org.testng.annotations.Test;

public class Test3 {
	@Test(dependsOnMethods = {"c_test3","d_test6"})
	public void a_test1() {
		System.out.println("I am Test A");
	}
	@Test(enabled=false) //it will NOT execute the method
	public void b_test2() {
		System.out.println("I am Test B");
	}
	@Test 
	public void c_test3() {
		System.out.println("I am Test C");
	}	
	@Test
	public void d_test6() {
		System.out.println("I am Test D");
	}
	@Test //it will execute the method
	public void e_test7() {
		System.out.println("I am Test E ");
	}
	@Test //it will execute the method
	public void f_test8() {
		System.out.println("I am Test F ");
	}

}
