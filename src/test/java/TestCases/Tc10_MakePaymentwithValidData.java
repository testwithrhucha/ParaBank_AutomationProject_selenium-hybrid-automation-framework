package TestCases;

import org.testng.annotations.Test;

import PageObjects.BillPayPage;
import PageObjects.LoginPage;
import PageObjects.Utilities;
import testBase.BaseClass;

public class Tc10_MakePaymentwithValidData extends BaseClass {
	

	@Test
	public void PayementValidation()
	{
		  // Login
        LoginPage lp = new LoginPage(driver);

        lp.setUsername(Utilities.username);
        lp.setPassword(Utilities.password);
        lp.loginbtnclick();
        
        BillPayPage pg=new BillPayPage(driver);
        pg.NavigateToBillPage();
        pg.EnterDataValid();
        pg.EnterPhNum();
        String Accnum=Utilities.accNo;
        pg.EnterAccNo(Accnum);
        pg.selectAccountNum(Accnum);
        pg.makePayment();
	}
}
