package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	@FindBy(xpath = "//input[@name='username']")
	WebElement txtusername;

	@FindBy(xpath = "//input[@name='password']")
	WebElement txtpwd;

	@FindBy(xpath = "//input[@value='Log In']")
	WebElement btnLogin;

	@FindBy(xpath = "//p[@class='error']")
	WebElement confirmationMsg;

	@FindBy(xpath = "//img[@title='ParaBank']")
	WebElement Logo;

	public void setUsername(String username) {
		txtusername.sendKeys(username);
	}

	public void setPassword(String Password) {
		txtpwd.sendKeys(Password);
	}

	public void loginbtnclick() {
		btnLogin.click();
	}

//
	public String getConfirmationMsg() {
		try {
			return (confirmationMsg.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}

	}

	public void ValidateLogo() {
		Logo.isDisplayed();
	}
}
