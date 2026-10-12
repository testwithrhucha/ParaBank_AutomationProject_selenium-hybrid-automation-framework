package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.OpenNewACcPage;
import PageObjects.TransferFundsPage;
import PageObjects.Utilities;
import testBase.BaseClass;

public class Tc07_TransferFunds extends BaseClass{
	
	@Test
	public void transferFunds() {

        // Login
        LoginPage lp = new LoginPage(driver);

        lp.setUsername(Utilities.username);
        lp.setPassword(Utilities.password);
        lp.loginbtnclick();


        // Transfer Funds
        TransferFundsPage tp = new TransferFundsPage(driver);
        
        
        tp.clickTransferFunds();

        tp.enterAmount("50");
        
        
    
        String accno= Utilities.accNo;
    tp.selectFromAccount(accno);

   tp.selectToAccount(accno);
//
        tp.clickTransferButton();


        // Validate success message
//        String msg = tp.getSuccessMessage();
//
//        System.out.println("Transfer message: " + msg);
//
//        Assert.assertEquals(msg, "Transfer Complete!");
    }

}
