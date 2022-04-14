package org.tms.service;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.tms.driver.DriverSingleton;
import org.tms.page.ContextMenuPage;

public class ContextMenuPageService {

    private static final String CONTEXT_MENU_URL = "http://the-internet.herokuapp.com/context_menu";

    ContextMenuPage contextMenuPage = new ContextMenuPage();
    Alert alert;

    public void openAlert() {
        contextMenuPage.openPage(CONTEXT_MENU_URL)
                .rightClickOnTheBox();
    }

    public String getTextAlert() {
        alert = DriverSingleton.getDriver().switchTo().alert();
        return alert.getText();
    }

    public void closeAlert() {
        alert.accept();
    }
}

