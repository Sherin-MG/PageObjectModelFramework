package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocatorsPOM1 {
	@FindBy(how = How.NAME,using = "username")
	public static WebElement username;
	@FindBy(how = How.NAME,using = "password")
	public static WebElement password;
	@FindBy(xpath = "//*[@type='submit']")
	public static WebElement login;


}
