package pageObjectModel;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrangeHRMLogin1 {
	WebDriver driver;
	@BeforeSuite
	public void launchbrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
	}
	@Test
	public void loginfunctionalities() throws InterruptedException {
		PageFactory.initElements(driver, LocatorsPOM1.class);
		LocatorsPOM1.username.sendKeys("Admin");
		LocatorsPOM1.password.sendKeys("admin123");
		LocatorsPOM1.login.click();
		Thread.sleep(3000);
			
	}
	@AfterSuite
	public void closebrowser() {
		driver.quit();
		
	}
	
}
