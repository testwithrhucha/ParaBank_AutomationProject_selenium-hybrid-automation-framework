package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TransferFundsPage extends BasePage {

	public TransferFundsPage(WebDriver driver) {
		super(driver);

	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	// Transfer Funds link
	@FindBy(xpath = "//a[normalize-space()='Transfer Funds']")
	WebElement transferFundsLink;

	// Amount textbox
	@FindBy(xpath = "//input[@id='amount']")
	WebElement amountTxt;

	// From Account dropdown
	@FindBy(xpath = "//select[@id='fromAccountId']")
	WebElement fromAccountDropdown;

	// To Account dropdown
	@FindBy(xpath = "//select[@id='toAccountId']")
	WebElement toAccountDropdown;

	// Transfer button
	@FindBy(xpath = "//input[@value='Transfer']")
	WebElement transferBtn;

	// Success message
	@FindBy(xpath = "//h1[normalize-space()='Transfer Complete!']")
	WebElement successMsg;

	// Click Transfer Funds
	public void clickTransferFunds() {
		transferFundsLink.click();
	}

	// Enter amount
	public void enterAmount(String amount) {
		amountTxt.sendKeys(amount);
	}

	// Select From Account
	public void selectFromAccount(String accountNumber) {
		
		
		fromAccountDropdown.click();
		Select select = new Select(fromAccountDropdown);
		select.selectByVisibleText(accountNumber);
	}

	// Select To Account
	public void selectToAccount(String accountNumber) {
		
		toAccountDropdown.click();
	
		
		Select select = new Select(toAccountDropdown);
		select.selectByVisibleText(accountNumber);
	}

	// Click Transfer
	public void clickTransferButton() {
		transferBtn.click();
	}

	// Get success message
	public String getSuccessMessage() {

		wait.until(ExpectedConditions.visibilityOf(successMsg));

		return successMsg.getText();
	}

}
