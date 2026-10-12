package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import testBase.BaseClass;

public class Tc03_InvalidCredentials extends BaseClass{

	
@Test
		public void verify_account_login ()
		{
			LoginPage lp=new LoginPage(driver);
		
			lp.setUsername("rhucha");
			lp.setPassword("rhucha123");
			lp.loginbtnclick();
			
			String confmsg=lp.getConfirmationMsg();
			Assert.assertEquals(confmsg, "The username and password could not be verified.");
		}

		
		
		

	}


