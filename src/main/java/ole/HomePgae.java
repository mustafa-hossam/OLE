package ole;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePgae {
	private WebDriver driver;

	// Constructor
	public HomePgae(WebDriver driver) {
		this.driver = driver;
	}

	// Element Locators
	private By welcome_text = By.id("welcome");
	private By UserManagment_select = By.id("menu_admin_viewAdminModule");

	// Actions
	public void clickOnRegisterButton() {
		driver.findElement(UserManagment_select).click();
	}
	
	public String getWelcomeText() {
		return driver.findElement(welcome_text).getText();
	}

}