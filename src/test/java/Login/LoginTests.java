package Login;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.BaseTests;
import org.junit.AfterClass;
import org.testng.annotations.Test;


import static org.testng.Assert.*;


public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfulLogin()
    {
      LoginPage loginPage = homepage.clickFormAuthentication();
      loginPage.setUsername("tomsmith");
      loginPage.setPassword("SuperSecretPassword!");
      SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
      String secureText =secureAreaPage.getAlertText();
      assertTrue(secureText.contains("You logged into a secure are"),"alert text is incorrect");

    }
    @Test
    public void learnGit()
    {
        
    }
    @Test
    public void learnGitFetch()
    {

    }
}
