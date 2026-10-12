package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.ForgotPassPage;
import testBase.BaseClass;

public class Tc08_ForgotCredentialsValidation  extends BaseClass{
	@Test
	public void ValidationForgotCredentials() throws InterruptedException
	{
		ForgotPassPage fp=new ForgotPassPage(driver);
		fp.clickRegisterLink();
	
		fp.enterFirstName("John");
		fp.enterLastName("Dae");
		fp.enterAddress("at post abc");
		fp.enterCity("Pune");
		fp.enterState("Maharasthra");
		fp.enterZipCode("423456");
		fp.enterSSN("wer4");
		Thread.sleep(3000);
		fp.clickfindinfobtn();
		
		String msg=fp.getConfirmationMessage();
		Assert.assertEquals(msg,"Your login information was located successfully. You are now logged in.");
	}

	
	
	
	
}
