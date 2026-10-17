package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AccountOverviewPage;
import PageObjects.LoginPage;
import PageObjects.RegistrationPage;
import Utilities.DataProviders;
import testBase.BaseClass;

public class Tc13_LoginTestWithDataDriven extends BaseClass {

	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void DataDriverLoginTest(String uname, String password, String exp) {

		logger.info("**** Starting TC_003_LoginDDT *****");
		try {

			LoginPage lp = new LoginPage(driver);
			lp.setUsername(uname);
			lp.setPassword(password);
			lp.loginbtnclick();

			AccountOverviewPage ag = new AccountOverviewPage(driver);

			boolean targetPage = ag.isMyAccountPageExists();

			if (exp.equalsIgnoreCase("Valid")) {
				if (targetPage == true) {
					ag.logout();
					Assert.assertTrue(true);
				} else {
					Assert.assertTrue(false);
				}
			}

			if (exp.equalsIgnoreCase("Invalid")) {
				if (targetPage == true) {
					ag.logout();
					Assert.assertTrue(false);
				} else {
					Assert.assertTrue(true);
				}
			}
		} catch (Exception e) {
			Assert.fail("An exception occurred: " + e.getMessage());
		}

		logger.info("**** Finished TC_003_LoginDDT *****");
	}

}
