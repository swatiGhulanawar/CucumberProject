package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverLaunch {
	
	WebDriver driver;
	public WebDriver initializeDriver() throws IOException {
		Properties property = new Properties(); 
		FileInputStream dataFile = new FileInputStream("C:\\Users\\swati\\eclipse-workspace\\PracticeFinalDemo\\src\\main\\java\\Resources\\Data.properties");
		property.load(dataFile);
		
		String browserName = property.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\swati\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browserName.equals("IE")) {
			//code for internet explorer			
		}else {
			//code for firefox
		}
		return driver;
		
	}

}
