package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.LoginPage;

public class InValidLogin extends BaseTest
{
    @Test(priority=2)
    public void testInvalidLogin()
    {
    
     String un = Excel.getData(XL_PATH, "InvalidLogin", 1, 0);
     String pw = Excel.getData(XL_PATH, "InvalidLogin", 1, 1);
    	
    	
      //1:Enter Invalid UN
      LoginPage loginPage = new LoginPage(driver);
      loginPage.setUserName(un);
      //2.Enter Invalid PW
      loginPage.setPassword(pw);
      //3.Click on Login Button
      loginPage.clickLoginButton();
      //Err Msg Should Be Displayed
      boolean result = loginPage.verifyErrMsgIsDisplayed(wait);
      Assert.assertTrue(result);
    }
}
