package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RequestLoanPage extends BasePage {

	public RequestLoanPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[normalize-space()='Request Loan']")
	WebElement LoanPageLink;

	@FindBy(xpath = "//input[@id='amount']")
	WebElement LoanAmtText;

	@FindBy(xpath = "//input[@id='downPayment']")
	WebElement DownPaymentTxt;

	@FindBy(xpath = "//select[@id='fromAccountId']")
	WebElement DrpFromAcc;

	@FindBy(xpath = "//input[@value='Apply Now']")
	WebElement BtnApply;

	public void NavigateToLoanPage()
	{
		LoanPageLink.click();
	}
	public void EnterLoanamt() {
		LoanAmtText.sendKeys("1000");
	}

	public void EnterDownPayment() {
		DownPaymentTxt.sendKeys("10");
	}

	public void SelectAcc(String accountNumber) {
		Select s = new Select(DrpFromAcc);
		s.selectByVisibleText(accountNumber);

	}

	public void BtnApplyClick() {
		BtnApply.click();
	}
}
