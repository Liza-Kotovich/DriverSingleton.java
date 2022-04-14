package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.service.FileUploaderPageService;

public class FileUploaderPageTest extends BaseTest {

    FileUploaderPageService fileUploaderPageService = new FileUploaderPageService();
    private String expectedNameOfTheFile = "дни.xlsx";

    @Test
    public void fileUploaderTest() {
        String actualNameOfTheFile = fileUploaderPageService.getTextOfTheFile();
        Assert.assertEquals(actualNameOfTheFile, expectedNameOfTheFile, "The actual name of the file does not match the expected one!");
    }
}
