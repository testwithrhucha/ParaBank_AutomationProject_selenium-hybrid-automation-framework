package TestCases;

import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.RequestLoanPage;
import PageObjects.Utilities;
import testBase.BaseClass;

public class Tc09_ApplyForLoan extends BaseClass {

	@Test
	public void LoanapplyValidation() {
		
		
		  // Login
        LoginPage lp = new LoginPage(driver);

        lp.setUsername(Utilities.username);
        lp.setPassword(Utilities.password);
        lp.loginbtnclick();
        
		RequestLoanPage rlp = new RequestLoanPage(driver);
		rlp.NavigateToLoanPage();
		rlp.EnterLoanamt();
		rlp.EnterDownPayment();
		String accno = Utilities.accNo;
		rlp.SelectAcc(accno);
		rlp.BtnApplyClick();
	}
}
