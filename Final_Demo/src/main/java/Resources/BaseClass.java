package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	public WebDriver driverInitialization() throws IOException {
		// Properties files is used to store GUI element/locators
		Properties porperty = new Properties();
		// used to read data from file in the form of sequance byte
		FileInputStream files = new FileInputStream("C:\\Users\\swati\\eclipse-workspace\\Final_Demo\\src\\main\\java\\Resources\\Data.properties");
		porperty.load(files);
		String browserName = porperty.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\swati\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("explorer")) {
			// explorer driver code
		} else {
			// code for firfox browser
		}
		return driver;

	}
}
