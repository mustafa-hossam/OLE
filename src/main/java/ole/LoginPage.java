package ole;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Element Locators
	
	private By UserName_text = By.id("txtUsername");
	private By Password_text = By.id("txtPassword");
	private By login_button = By.id("btnLogin");
	
	
	// Actions
	public void userLogin(String UserName, String Password) {
		driver.findElement(UserName_text).sendKeys(UserName);
		driver.findElement(Password_text).sendKeys(Password);
		driver.findElement(login_button).click();
	}

}


