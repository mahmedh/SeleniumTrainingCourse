package DropDown;

import base.BaseTests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.function.DoublePredicate;

import static org.testng.Assert.*;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption()
    {
        var DropDownPage = homepage.clickDropDown();
        DropDownPage.selectFromDropDown("Option 1");
        List<String> selectedOptions = DropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorret no of selections");
        assertTrue(selectedOptions.contains("Option 1"),"Option not Selected");

    }
}
