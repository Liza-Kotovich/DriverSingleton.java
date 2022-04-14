package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicControlsPage extends Page {

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement checkbox;

    @FindBy(xpath = "//button[@onclick='swapCheckbox()']")
    private WebElement removeButton;

    @FindBy(xpath = "//p[@id='message']")
    private WebElement textOfWebelement;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement inputField;

    @FindBy(xpath = "//button[contains(text(),'Enable')]")
    private WebElement enableButton;

    @FindBy(xpath = "//button[contains(text(),'Disable')]")
    private WebElement disableButton;

    public DynamicControlsPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public void selectCheckbox() {
        checkbox.click();
        removeButton.click();
    }

    public String textOfCheckboxMethod() {
        return textOfWebelement.getAttribute("innerText");
    }

    public void disabledInputMethod() {
        if (inputField.isEnabled() == false) {
            enableButton.click();
        }
    }

    public void clickToEnableButton() {
        enableButton.click();
    }

    public String textOfInputMethod(){
        return textOfWebelement.getAttribute("innerText");
    }

    public void enableInputMethod(){
        if (inputField.isEnabled() == true){
            inputField.sendKeys("abc");
        }
    }

}