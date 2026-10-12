package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.OpenNewACcPage;
import PageObjects.Utilities;
import testBase.BaseClass;

public class Tc05_OpenNewAcc  extends BaseClass{
	
	@Test
	public void newacc()
	{
		LoginPage lp=new LoginPage(driver);
		
		lp.setUsername( Utilities.username);
		lp.setPassword(Utilities.password);
		lp.loginbtnclick();
		
		
		 OpenNewACcPage op =new OpenNewACcPage (driver);
		 
		op.LinkClick();
		op.SelectTypeOfAccount();
		op.SelectExistingAccount();
		op.CreateAcc();
		op.getAccNum();
		
		String accno = op.getAccNum();

		Utilities.accNo= accno;
		String validatemsg=op.validateAccCreation();
		Assert.assertEquals(validatemsg, "Congratulations, your account is now open.");
	}
	


}
