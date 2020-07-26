package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class KeyPresses {

    WebDriver driver;
    private By inputField = By.id("target");
    private By result = By.id("result");

    public KeyPresses (WebDriver driver)
    {
        this.driver =driver;
        Alert x;
    }
    public void enterText(String text)
    {
        driver.findElement(inputField).sendKeys(text);
    }
    public String getResult()
    {
       return driver.findElement(result).getText();
    }
    public void enterPi()
    {
        enterText(Keys.chord(Keys.LEFT_SHIFT, "h") + "=3.14");
    }
}
