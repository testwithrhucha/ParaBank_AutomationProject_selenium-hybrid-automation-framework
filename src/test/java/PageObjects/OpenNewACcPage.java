package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenNewACcPage extends BasePage {

	public OpenNewACcPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	
	
	@FindBy(xpath = "//a[normalize-space()='Open New Account']")
	WebElement  newaccLink;
	
	@FindBy(xpath = "//select[@id='type']")
	WebElement  SelectAccType;
	
	@FindBy(xpath = "//select[@id='fromAccountId']")
	WebElement  SelectexAcc;
	
	@FindBy(xpath = "//input[@value='Open New Account']")
	WebElement  btnCreateAcc;
	
	@FindBy(xpath="//p[normalize-space()='Congratulations, your account is now open.']")
	WebElement  confirmMsg;
	
	
	@FindBy(xpath="//a[@id='newAccountId']")
	WebElement getAccNumTxt;
	
	public void LinkClick()
	{
		newaccLink.click();
	}
	
	public void SelectTypeOfAccount()
	{
		SelectAccType.click();
		Select select = new Select(SelectAccType);
		 select.selectByValue("0");
		 
	}
	

	public void SelectExistingAccount()
	{
		SelectexAcc.click();
//		Select select = new Select(SelectexAcc);
//		 select.selectByValue("0");
		 
	}
	
	public void CreateAcc()
	{
		btnCreateAcc.click();
	}

	public String validateAccCreation()
	{
		
		 wait.until(ExpectedConditions.visibilityOf(confirmMsg));
		    return confirmMsg.getText();
		
	}
	
	public String getAccNum()
	{
		 wait.until(ExpectedConditions.visibilityOf(getAccNumTxt));
		 return getAccNumTxt.getText();
	}

}
