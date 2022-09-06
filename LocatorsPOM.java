package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsPOM {
	
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@name='username']"));
	}
	
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.name("password"));
	}
	
	public static WebElement loginbutton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@type='submit']"));
	}

}
