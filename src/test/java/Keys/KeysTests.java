package Keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {

    @Test
    public void testBackSpace()
    {
        var KeyPage = homepage.clickKeyPresses();
        KeyPage.enterText("a" + Keys.BACK_SPACE);
        assertEquals(KeyPage.getResult(), "You entered: BACK_SPACE");

    }
    @Test
    public void testPi()
    {
        var KeyPage = homepage.clickKeyPresses();

        KeyPage.enterPi();
    }

}
