package com.TestNGDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParaMPassingDemo{
		
	@Parameters({"Username" , "Password"})
	@Test
	public void loginTest(String uname, String pwd) {		
		System.out.println(uname);
		System.out.println(pwd);
	}

}
