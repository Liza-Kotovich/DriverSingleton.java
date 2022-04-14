package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploaderPage extends Page {

    @FindBy(xpath = "//input[@id='file-upload']")
    private WebElement selectFileButton;

    @FindBy(xpath = "//input[@value='Upload']")
    private WebElement uploadButton;

    @FindBy(xpath = "//div[@id='uploaded-files']")
    private WebElement uploadFile;

    public FileUploaderPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public void selectFileMethod() {
        selectFileButton.sendKeys("C:\\my\\работа\\дни.xlsx");
    }

    public void uploadFileMethod() {
        uploadButton.click();
    }

    public String textOfFile() {
        return uploadFile.getAttribute("innerText");
    }
}
