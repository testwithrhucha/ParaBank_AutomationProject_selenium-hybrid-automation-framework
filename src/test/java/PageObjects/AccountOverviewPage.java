package PageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountOverviewPage extends BasePage {

	public AccountOverviewPage(WebDriver driver) {
		super(driver);
	
	}
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	@FindBy(xpath = "//a[normalize-space()='Accounts Overview']")
	WebElement AccOvervewLnk;
	
	@FindBy(xpath = "//table[@id='accountTable']//tbody/tr")
	List<WebElement> accounts;
	
	public void accOverviewLinkClick()
	{
		AccOvervewLnk.click();
	}

	
	public int getAccountCount() {
	    return accounts.size();
	}

}


