package TestCases;

import org.testng.annotations.Test;

import PageObjects.AccountOverviewPage;
import PageObjects.RegistrationPage;
import testBase.BaseClass;

public class Tc01_RegisterUserCopy extends BaseClass {
	@Test
	 
	public void RegisterUser()
	{
	
		RegistrationPage rp=new RegistrationPage(driver);
		rp.clickRegisterLink();
		rp.enterFirstName("John");
		rp.enterLastName("Dae");
		rp.enterAddress("at post abc");
		rp.enterCity("Pune");
		rp.enterState("Maharasthra");
		rp.enterZipCode("423456");
		rp.enterPhoneNumber("3487957634");
		rp.enterSSN("wer4");
		rp.enterUsername("xyz0404");
		rp.enterPassword("xyz0404");
		rp.enterConfirmPassword("xyz0404");
		rp.clickRegisterButton();
		AccountOverviewPage ag1 = new AccountOverviewPage(driver);
        ag1.logout();
	
	}
}
