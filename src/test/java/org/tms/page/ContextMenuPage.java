package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class ContextMenuPage extends Page {

    @FindBy(xpath = "//div[@id='hot-spot']")
    private WebElement box;


    @FindBy(xpath = "//script[contains(text(),'You selected')]")
    private WebElement alert;

    public ContextMenuPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public void rightClickOnTheBox() {
        Actions actions = new Actions(driver);
        actions.contextClick(box).perform();
    }


}
