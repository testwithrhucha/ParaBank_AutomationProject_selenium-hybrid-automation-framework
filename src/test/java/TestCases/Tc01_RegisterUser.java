package TestCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.RegistrationPage;
import PageObjects.Utilities;
import testBase.BaseClass;

public class Tc01_RegisterUser extends BaseClass {
	@Test(groups= {"Sanity","Master"})
	public void RegisterNewUser() throws InterruptedException {
		
		
		logger.info("**********Starting test case Register user*********");
		try {
		RegistrationPage rp = new RegistrationPage(driver);
		rp.clickRegisterLink();
		logger.info("**********Clicked on Register link*********");
		logger.info("**********Providing details*********");
		rp.enterFirstName("John");
		rp.enterLastName("Dae");
		rp.enterAddress("at post abc");
		rp.enterCity("Pune");
		rp.enterState("Maharasthra");
		rp.enterZipCode("423456");
		rp.enterPhoneNumber("3487957634");
		rp.enterSSN("wer4");
		Thread.sleep(3000);
		
		String uName=randomeString();

        Utilities.username = uName;
		rp.enterUsername(uName);

		String pass = randomAlphaNumeric();
		  Utilities.password= pass;
		rp.enterPassword(pass);
		rp.enterConfirmPassword(pass);

		rp.clickRegisterButton();
		//validate Registration
		logger.info("**********Validate registration*********");
		String msg = rp.getConfirmationMessage();
		System.out.println(msg);
		
		String Wcmsg=rp.getWelComeMessage();
		Assert.assertEquals(Wcmsg,"Welcome "+ uName);
		}
catch(Exception e)
		{
	logger.error("Test failed...........");
	logger.debug("debug logs");

		}
	}

	public String randomeString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}

	public String randomAlphaNumeric() {
		String str = RandomStringUtils.randomAlphabetic(3);
		String num = RandomStringUtils.randomNumeric(3);

		return (str + "@" + num);
	}

}
