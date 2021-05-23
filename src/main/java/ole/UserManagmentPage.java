package ole;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class UserManagmentPage {
WebDriver driver;
	
	//Constructor
	public UserManagmentPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Element Locators
	
	private By AddUser_button = By.id("btnAdd");
	private By UserRole_dropdown = By.id("systemUser_userType");
	private By EmployeeName_text = By.id("systemUser_employeeName_empName");
	private By UserName_text = By.id("systemUser_userName");
	private By Status_dropdwon = By.id("systemUser_status");
	private By Password_text = By.id("systemUser_password");
	private By ConfirmPassword_text = By.id("systemUser_confirmPassword");

			
	
	
	// Actions
	public void clickOnRegisterButton( String role, String Employee, String UserName,
			String Status, String Password, String ConfirmPassword) {
		
		driver.findElement(AddUser_button).click();
		new Select(driver.findElement(UserRole_dropdown)).selectByVisibleText(role);
		driver.findElement(EmployeeName_text).sendKeys(Employee);
		driver.findElement(UserName_text).sendKeys(UserName);
		new Select(driver.findElement(Status_dropdwon)).selectByVisibleText(Status);
		driver.findElement(Password_text).sendKeys(Password);
		driver.findElement(ConfirmPassword_text).sendKeys(ConfirmPassword);
		
		
	}
}
