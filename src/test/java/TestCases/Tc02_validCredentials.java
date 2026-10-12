package TestCases;


import org.testng.annotations.Test;



import PageObjects.LoginPage;
import testBase.BaseClass;
import PageObjects.Utilities;
public class Tc02_validCredentials extends BaseClass{

 	
	@Test
	
	public void verify_account_login()
	{
		
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUsername( Utilities.username);
		lp.setPassword(Utilities.password);
		lp.loginbtnclick();
		
		
		
	}
	
	
	
	
}








