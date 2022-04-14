package org.tms.service;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tms.driver.DriverSingleton;
import org.tms.page.FileUploaderPage;

import java.time.Duration;

public class FileUploaderPageService {

    private static final String FILE_UPLOADER_PAGE_URL = "http://the-internet.herokuapp.com/upload";
    FileUploaderPage fileUploaderPage = new FileUploaderPage();
    WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), Duration.ofSeconds(5));
    String xpathElementForWaiting = "//div[@id='uploaded-files']";

    public String getTextOfTheFile() {
        fileUploaderPage.openPage(FILE_UPLOADER_PAGE_URL);
        fileUploaderPage.selectFileMethod();
        fileUploaderPage.uploadFileMethod();
        wait.until(ExpectedConditions.attributeToBe(By.xpath(xpathElementForWaiting), "id", "uploaded-files"));
        return fileUploaderPage.textOfFile();
    }
}
