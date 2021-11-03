package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	public WebDriver driver;  //create driver object
	By Username =By.xpath("//input[@id='user_email']");
	By Password =By.xpath("//input[@id='user_password']");
	By Login =By.xpath("//input[@type='submit']");
	
	public LoginPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getUsername() {
		return driver.findElement(Username);
	}
	public WebElement getPassword() {
		return driver.findElement(Password);
	}
	public WebElement Login() {
		return driver.findElement(Login);
	}

}
