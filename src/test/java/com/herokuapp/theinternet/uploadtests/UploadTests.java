package com.herokuapp.theinternet.uploadtests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.FileUploaderPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadTests extends TestUtilities {

    @Test(dataProvider="files")
    public void fileUpLoadTest(int no, String filename) {
        log.info("Starting fileUploadTest #" + no + " for " + filename);

        FileUploaderPage fileUploaderPage = new FileUploaderPage(driver, log);
        fileUploaderPage.openPage();

        fileUploaderPage.selectFile(filename);

        fileUploaderPage.pushUploadButton();

        String uploadedFilenames = fileUploaderPage.getUploadedFileNames();

        Assert.assertEquals(filename, uploadedFilenames);
    }
}
