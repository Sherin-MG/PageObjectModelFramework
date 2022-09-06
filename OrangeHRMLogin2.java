package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrangeHRMLogin2 {
	WebDriver driver;
	public static WebElement username;
	public static WebElement password;
	@BeforeSuite
	public void launchbrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
	}
	@Test
	public void loginfunctionalities() throws InterruptedException {
		PageFactory.initElements(driver, OrangeHRMLogin2.class);
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		Thread.sleep(3000);
			
	}
	@AfterSuite
	public void closebrowser() {
		driver.quit();
}
}