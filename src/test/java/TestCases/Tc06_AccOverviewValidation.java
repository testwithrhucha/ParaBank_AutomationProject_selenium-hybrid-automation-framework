package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AccountOverviewPage;
import PageObjects.LoginPage;
import PageObjects.OpenNewACcPage;
import PageObjects.Utilities;
import testBase.BaseClass;

public class Tc06_AccOverviewValidation extends BaseClass{

	@Test
public void AccOverview()
{
	LoginPage lp=new LoginPage(driver);
	
	lp.setUsername( Utilities.username);
	lp.setPassword(Utilities.password);
	lp.loginbtnclick();
	
    AccountOverviewPage ap = new AccountOverviewPage(driver);

    // Go to Accounts Overview
    ap.accOverviewLinkClick();

    // Count existing accounts
    int beforeCount = ap.getAccountCount();

    System.out.println("Accounts before creation: " + beforeCount);

    
    OpenNewACcPage op =new OpenNewACcPage (driver);
	 
	op.LinkClick();
	op.SelectTypeOfAccount();
	op.SelectExistingAccount();
	op.CreateAcc(); 
	
  

    // Go back to Accounts Overview
    ap.accOverviewLinkClick();

    // Count accounts again
    int afterCount = ap.getAccountCount();

    System.out.println("Accounts after creation: " + afterCount);

    // Verify count increased by 1
    Assert.assertEquals(afterCount, beforeCount + 1);
	
	
	
}
	
}
