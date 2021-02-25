package test;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;

public class Testcase1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void LaunchBrowser() {
		

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		
		driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
	}
	
	@Test
	public void LoginTest() {
		
		
		LoginPage obj = new LoginPage(driver);
		
		obj.Login("abc@xyz.com", "123abc");
		
	}
	
	@AfterMethod
	public void CloseBrowser() {
		
		driver.quit();
	}

}
