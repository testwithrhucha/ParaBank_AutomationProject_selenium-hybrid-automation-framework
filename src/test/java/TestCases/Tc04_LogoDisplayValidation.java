package TestCases;

import org.testng.annotations.Test;

import PageObjects.LoginPage;
import testBase.BaseClass;

public class Tc04_LogoDisplayValidation extends BaseClass {

	@Test
	public void logoValidation() {
		LoginPage lp = new LoginPage(driver);
		lp.ValidateLogo();

	}
}
