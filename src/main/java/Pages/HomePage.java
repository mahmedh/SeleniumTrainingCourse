package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private By formAuthentication = By.linkText("Form Authentication");
    private WebDriver driver;
    private By usernameField = By.id("username");
    public HomePage(WebDriver driver)
    {
     this.driver =driver;
    }
    public LoginPage clickFormAuthentication()
    {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropDownPage clickDropDown()
    {
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
    private void clickLink(String link)
    {
        driver.findElement(By.linkText(link)).click();
    }
    public HoversPage clickHover()
    {
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public KeyPresses clickKeyPresses()
    {
        clickLink("Key Presses");
        return new KeyPresses(driver);
    }
    public AlertsPage clickAlertsPage()
    {
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }
    
}
