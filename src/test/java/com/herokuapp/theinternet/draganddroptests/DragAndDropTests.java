package com.herokuapp.theinternet.draganddroptests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.DragAndDropPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropTests extends TestUtilities {
    @Test
    public void dragAtoBTest() {
        log.info("Starting dragAtoBTest");

        DragAndDropPage dragAndDropPage = new DragAndDropPage(driver,log);
        dragAndDropPage.openPage();

        dragAndDropPage.dragAtoB();

        String columnAText = dragAndDropPage.getColumnAText();
        Assert.assertEquals(columnAText, "B");

        String columnBText = dragAndDropPage.getColumnBText();
        Assert.assertEquals(columnBText, "A");
    }
}
