package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BillPayPage extends BasePage {

	public BillPayPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	@FindBy(xpath = "//a[normalize-space()='Bill Pay']")
	WebElement PayBillPageLink;

	@FindBy(xpath = "//input[@name='payee.name']")
	WebElement PayeeNameTxt;

	@FindBy(xpath = "//input[@name='payee.address.street']")
	WebElement addrsTxt;

	@FindBy(xpath = "//input[@name='payee.address.city']")
	WebElement CityTxt;

	@FindBy(xpath = "//input[@name='payee.address.state']")
	WebElement stateTxt;

	@FindBy(xpath = "//input[@name='payee.address.zipCode']")
	WebElement ZpCodeTxt;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[6]/td[2]/input[1]")
	WebElement PhNumTxt;

	@FindBy(xpath = "//input[@name='payee.accountNumber']")
	WebElement AccNumTxt;

	@FindBy(xpath = "//input[@name='verifyAccount']")
	WebElement VerifyAccNumTxt;

	@FindBy(xpath = "//input[@name='amount']")
	WebElement AmtTxt;

	@FindBy(xpath = "//select[@name='fromAccountId']")
	WebElement SelectAcc;

	@FindBy(xpath = "//input[@value='Send Payment']")
	WebElement BtnPayment;

	@FindBy(xpath = "//h1[normalize-space()='Bill Payment Complete']")
	WebElement Validationmsg;

	@FindBy(xpath = "//span[@id='validationModel-phoneNumber']")
	WebElement errmsg;

	@FindBy(xpath = "//span[@id='validationModel-verifyAccount-mismatch']")
	WebElement Accnumerrmsg;

	public void NavigateToBillPage() {
		PayBillPageLink.click();
	}

	public void EnterDataValid() {
		PayBillPageLink.click();
		PayeeNameTxt.sendKeys("John Dae");
		addrsTxt.sendKeys("at post abc");
		CityTxt.sendKeys("Pune");
		stateTxt.sendKeys("Maharasthra");
		ZpCodeTxt.sendKeys("423456");

	}

	public void EnterPhNum() {
		PhNumTxt.sendKeys("3487957634");
	}

	public void EnterAccNo(String accountNumber) {
		AccNumTxt.sendKeys(accountNumber);
	}

	public void ConfirmAccNum(String accountNumber) {
		VerifyAccNumTxt.sendKeys(accountNumber);
		AmtTxt.sendKeys("10");
	}

	public void selectAccountNum(String accountNumber) {
		Select sc = new Select(SelectAcc);
		sc.selectByVisibleText(accountNumber);
	}

	public void makePayment() {
		BtnPayment.click();
	}

	public void paymanetValidation() {
		String msg = Validationmsg.getText();
		Assert.assertEquals(msg, "Bill Payment Complete");
	}

	public void errmsgValidation() {
		String errmsgg = errmsg.getText();
		Assert.assertEquals(errmsgg, "Phone number is required.");

		String accnumMatcherrmsgg = Accnumerrmsg.getText();
		Assert.assertEquals(accnumMatcherrmsgg, "The account numbers do not match.");
	}
}
