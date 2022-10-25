package com.herokuapp.theinternet.uploadtests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.FileUploaderPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadTests extends TestUtilities {

    @Test
    public void imageUpLoadTest() {
        log.info("Starting imageUploadTest");

        FileUploaderPage fileUploaderPage = new FileUploaderPage(driver, log);
        fileUploaderPage.openPage();

        String filename = "logo.png";
        fileUploaderPage.selectFile(filename);

        fileUploaderPage.pushUploadButton();

        String uploadedFilenames = fileUploaderPage.getUploadedFileNames();

        Assert.assertEquals(filename, uploadedFilenames);
    }
}
