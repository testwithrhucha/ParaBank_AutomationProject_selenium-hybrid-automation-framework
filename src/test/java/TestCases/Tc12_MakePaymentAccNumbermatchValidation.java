package TestCases;

import org.testng.annotations.Test;

import PageObjects.BillPayPage;
import PageObjects.LoginPage;
import PageObjects.Utilities;
import testBase.BaseClass;

public class Tc12_MakePaymentAccNumbermatchValidation  extends BaseClass{
	@Test
	
	public void matchAccNumValidation()
	{
		LoginPage lp = new LoginPage(driver);

		lp.setUsername(Utilities.username);
		lp.setPassword(Utilities.password);
		lp.loginbtnclick();

		BillPayPage pg = new BillPayPage(driver);
		pg.NavigateToBillPage();
		pg.EnterDataValid();
		String Accnum = Utilities.accNo;
		pg.EnterAccNo(Accnum);
		pg.ConfirmAccNum("2367");
		pg.selectAccountNum(Accnum);
		pg.makePayment();
		pg.errmsgValidation();
	}
}
