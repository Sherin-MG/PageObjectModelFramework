package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrangeHRMLoginPOM {
	WebDriver driver;
	@BeforeSuite
	public void LaunchbWebpage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}
	@Test
	public void Login() throws InterruptedException {
		//LocatorsPOM locators = new LocatorsPOM();->to avoid dependency between class by creating object
				LocatorsPOM.username(driver).sendKeys("Admin");
				LocatorsPOM.password(driver).sendKeys("admin123");
				LocatorsPOM.loginbutton(driver).click();
				Thread.sleep(3000);
	}
	@AfterSuite
	public void closebrowser() {
		driver.quit();
		
	}
}