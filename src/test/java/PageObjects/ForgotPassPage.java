package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPassPage extends BasePage {

	public ForgotPassPage(WebDriver driver) {
		super(driver);
	
	}

	@FindBy(xpath="//a[normalize-space()='Forgot login info?']")
	WebElement forgotpassLink;
	
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement FnameTxt;

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement LnameTxt;

	@FindBy(xpath = "//input[@id='address.street']")
	WebElement addressTxt;

	@FindBy(xpath = "//input[@id='address.city']")
	WebElement CityTxt;

	@FindBy(xpath = "//input[@id='address.state']")
	WebElement StateTxt;

	@FindBy(xpath = "//input[@id='address.zipCode']")
	WebElement ZipCodeTxt;


	@FindBy(xpath = "//input[@id='ssn']")
	WebElement SSNTxt;
	
	@FindBy(xpath="//input[@value='Find My Login Info']")
	WebElement btnFinCredentials;
	
	@FindBy(xpath="//p[contains(text(),'Your login information was located successfully. Y')]")
	WebElement confirmMsg;
	public void clickRegisterLink() {
		forgotpassLink.click();
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

	
	public void enterSSN(String ssn) {
	    SSNTxt.sendKeys(ssn);
	}
	
	public void clickfindinfobtn()
	{
		btnFinCredentials.click();
	}
	
	public String getConfirmationMessage() {
	    return confirmMsg.getText();
	}

}
