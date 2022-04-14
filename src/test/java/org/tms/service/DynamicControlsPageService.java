package org.tms.service;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tms.driver.DriverSingleton;
import org.tms.page.DynamicControlsPage;

import java.time.Duration;

public class DynamicControlsPageService {

    private static final String DYNAMIC_CONTROLS_PAGE_URL = "http://the-internet.herokuapp.com/dynamic_controls";
    DynamicControlsPage dynamicControlsPage = new DynamicControlsPage();
    WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), Duration.ofSeconds(5));
    String xpathElementForWaiting = "//p[@id='message']";


    public String getTextOfCheckboxes() {
        dynamicControlsPage.openPage(DYNAMIC_CONTROLS_PAGE_URL);
        dynamicControlsPage.selectCheckbox();
        wait.until(ExpectedConditions.attributeToBe(By.xpath(xpathElementForWaiting),"id", "message"));
        return dynamicControlsPage.textOfCheckboxMethod();
    }

    public String getTextOfInput(){
        dynamicControlsPage.openPage(DYNAMIC_CONTROLS_PAGE_URL);
        dynamicControlsPage.disabledInputMethod();
        dynamicControlsPage.clickToEnableButton();
        wait.until(ExpectedConditions.attributeToBe(By.xpath(xpathElementForWaiting), "id", "message"));
        dynamicControlsPage.enableInputMethod();
        return dynamicControlsPage.textOfInputMethod();
    }
}
