package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement regLink;

	@FindBy(xpath = "//input[@id='customer.firstName']")
	WebElement FnameTxt;

	@FindBy(xpath = "//input[@id='customer.lastName']")
	WebElement LnameTxt;

	@FindBy(xpath = "//input[@id='customer.address.street']")
	WebElement addressTxt;

	@FindBy(xpath = "//input[@id='customer.address.city']")
	WebElement CityTxt;

	@FindBy(xpath = "//input[@id='customer.address.state']")
	WebElement StateTxt;

	@FindBy(xpath = "//input[@id='customer.address.zipCode']")
	WebElement ZipCodeTxt;

	@FindBy(xpath = "//input[@id='customer.phoneNumber']")
	WebElement PhoneNumTxt;

	@FindBy(xpath = "//input[@id='customer.ssn']")
	WebElement SSNTxt;
	
	@FindBy(xpath = "//input[@id='customer.username']")
	WebElement UserNameTxt;

	@FindBy(xpath = "//input[@id='customer.password']")
	WebElement PassText;
	

	@FindBy(xpath = "//input[@id='repeatedPassword']")
	WebElement ConfPassTXt;
	
	@FindBy(xpath="//input[@value='Register']")
	WebElement RegisterBtn;
	
	@FindBy(xpath = "//p[contains(text(),'Your account was created successfully. You are now')]")
	WebElement confirmMsg;

	@FindBy(css="h1.title")
	WebElement Welcomemsg;
	
	public void clickRegisterLink() {
	    regLink.click();
	}

	public void enterFirstName(String fname) {
	    FnameTxt.sendKeys(fname);
	}

	public void enterLastName(String lname) {
	    LnameTxt.sendKeys(lname);
	}

	public void enterAddress(String address) {
	    addressTxt.sendKeys(address);
	}

	public void enterCity(String city) {
	    CityTxt.sendKeys(city);
	}

	public void enterState(String state) {
	    StateTxt.sendKeys(state);
	}

	public void enterZipCode(String zipcode) {
	    ZipCodeTxt.sendKeys(zipcode);
	}

	public void enterPhoneNumber(String phone) {
	    PhoneNumTxt.sendKeys(phone);
	}

	public void enterSSN(String ssn) {
	    SSNTxt.sendKeys(ssn);
	}

	public void enterUsername(String username) {
	    UserNameTxt.sendKeys(username);
	}

	public void enterPassword(String password) {
	    PassText.sendKeys(password);
	}

	public void enterConfirmPassword(String confirmPassword) {
	    ConfPassTXt.sendKeys(confirmPassword);
	}

	public void clickRegisterButton() {
	    RegisterBtn.click();
	}

	public String getConfirmationMessage() {
	    return confirmMsg.getText();
	}
	
	public String getWelComeMessage() {
	    return Welcomemsg.getText();
	}
	
	
}
