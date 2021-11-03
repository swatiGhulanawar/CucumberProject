package Final_Demo;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.HomePageObjects;
import PageObjects.LoginPageObjects;
import Resources.BaseClass;

public class HomePage extends BaseClass {
	
	@Test(dataProvider="getData") 
	public void homePageNavigation(String username, String password) throws IOException {   
		//passed parameters username & password in homePageNavigation to get the data from Object
		driver = driverInitialization();
		driver.get("http://qaclickacademy.com");
		driver.manage().window().maximize();		
		
		HomePageObjects homePageObjects = new HomePageObjects(driver);
		homePageObjects.loginButton().click();
		
		LoginPageObjects loginPageObject = new LoginPageObjects(driver);
		loginPageObject.getUsername().sendKeys(username);
		loginPageObject.getPassword().sendKeys(password);
		loginPageObject.Login().click();
	}	
	@DataProvider 
	public Object [][] getData(){
		Object [][]data = new Object[2][2];		//creating the object for Object and passing the value 2 rows 3 columns 
		data[0][0]="test@test.com";				//index value will be considered to select row and column
		data[0][1]="Password123";
		data[1][0]="test@test.com";	
		data[1][1]="Password09876";
		return data;
	}	

}
