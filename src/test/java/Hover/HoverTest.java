package Hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTest extends BaseTests {
    @Test
    public void testHoverUser1()
    {
        var hoversPage = homepage.clickHover();
       var caption = hoversPage.hoverOverFigure(1);
       assertTrue(caption.isCaptionDisplayed(),"Caption is not displayed");
       assertEquals(caption.getLink() ,"View profile", "link text is not correct");
       assertEquals(caption.getTitle(),"name: user1", "username is not correct");
    }
}
