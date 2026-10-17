package PageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountOverviewPage extends BasePage {

	public AccountOverviewPage(WebDriver driver) {
		super(driver);

	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	@FindBy(xpath = "//h1[normalize-space()='Accounts Overview']")
	WebElement AccOvervewLnk;

	@FindBy(xpath = "//table[@id='accountTable']//tbody/tr")
	List<WebElement> accounts;

	@FindBy(xpath = "//h1[normalize-space()='Accounts Overview']")
	WebElement Title;
	@FindBy(xpath = "//a[normalize-space()='Log Out']")
	WebElement LogoutLink;

	public void accOverviewLinkClick() {
		AccOvervewLnk.click();
	}

	public int getAccountCount() {
		return accounts.size();
	}

	public boolean isMyAccountPageExists() {
	    try {
	        wait.until(ExpectedConditions.visibilityOf(Title));
	        return true;
	    } catch (org.openqa.selenium.TimeoutException e) {
	        return false;
	    }
	}

	public void logout() {
		LogoutLink.click();
	}

}
