package base;

import Pages.HomePage;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homepage;
    @BeforeClass
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver","E:\\programs\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        goHome();
        driver.manage().window().maximize();
        homepage = new HomePage(driver);

//      driver.quit();

    }
    @BeforeMethod
    public void goHome()
    {
        driver.get("https://the-internet.herokuapp.com/");

    }
    @AfterClass
    public void quitChrome()
    {
              driver.quit();

    }

}
