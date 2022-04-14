package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.service.DynamicControlsPageService;

public class DynamicControlsPageTest extends BaseTest {

    DynamicControlsPageService dynamicControlsPageService = new DynamicControlsPageService();
    private String expectedResultOfAlertMessage = "It's gone!";
    private String expectedResultOfInputMessage = "It's enabled!";

    @Test
    public void disappearanceOfTheCheckboxTest() {
        String actualResultOfAlertMessage = dynamicControlsPageService.getTextOfCheckboxes();
        Assert.assertEquals(actualResultOfAlertMessage, expectedResultOfAlertMessage, "The actual text of the checkbox does not match the expected one!");
    }

    @Test
    public void inputEnableTest() {
        String actualResultOfInputMessage = dynamicControlsPageService.getTextOfInput();
        Assert.assertEquals(actualResultOfInputMessage, expectedResultOfInputMessage, "The actual text of the input does not match the expected one!");
    }
}
