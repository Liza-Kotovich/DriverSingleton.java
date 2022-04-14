package org.tms.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tms.driver.DriverSingleton;

import java.time.Duration;

public abstract class Page {

    protected WebDriver driver = DriverSingleton.getDriver();


    protected Page() {
        PageFactory.initElements(driver, this);
    }
    }
