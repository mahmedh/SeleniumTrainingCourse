package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlertTests extends BaseTests {
    @Test
    public void testAcceptAlert()
    {
      var alertsPage = homepage.clickAlertsPage();
      alertsPage.triggerAlert();
      alertsPage.alert_clickToAccept();
      assertEquals(alertsPage.getResult(),"You successfuly clicked an alert","Result text is incorrect");
    }
    @Test
    public void testGetTextFromAlert()
    {
        var alertsPage = homepage.clickAlertsPage();
        alertsPage.triggerConfirm();
        String text =alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text,"I am a JS Confirm", " the text is incorrect");
    }
    @Test
    public void testPromptALert()
    {
        var alertsPage = homepage.clickAlertsPage();
        alertsPage.triggerPrompt();
        alertsPage.alert_sendKeys("Hamed");
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),"You entered: Hamed", "error in text entered");
    }
}
