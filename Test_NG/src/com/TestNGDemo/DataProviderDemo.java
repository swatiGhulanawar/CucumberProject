package com.TestNGDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@Test(dataProvider="getData")
	public void username(String username, String password) {
		System.out.println(username + "\n" + password);
	}	
	
	//syntax= public Object[][] nameOfDataProvider	
	@DataProvider                         //data provider annotation, same methods but can be run multiple times with different data sets 
	public Object [][] getData(){
		Object [][]data = new Object[2][2];		//creating the object for Object and passing the value 2 rows 3 columns 
		data[0][0]="test@test.com";				//index value will be considered to select row and column
		data[0][1]="Password123";
		data[1][0]="test1@test.com";
		data[1][1]="Password123";
		
		return data;
	}
}
