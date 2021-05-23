package hrm;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import ole.HomePgae;
import ole.LoginPage;

public class login {
	private WebDriver driver;
	private HomePgae home;
	private LoginPage login;

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");

		home = new HomePgae(driver);
		login = new LoginPage(driver);
	}

	@Test
	public void verifyAdminLogin() {
		login.userLogin("Admin", "admin123");

		assertTrue(home.getWelcomeText().contains("Welcome"));

	}

	@AfterMethod
	public void afterClass() {
		driver.quit();
	}

}
