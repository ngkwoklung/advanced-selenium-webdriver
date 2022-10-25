package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DragAndDropPage extends BasePageObject{

    private final String pageUrl = "https://the-internet.herokuapp.com/drag_and_drop";
    private final By columnALocator = By.id("column-a");
    private final By columnBLocator = By.id("column-b");

    public DragAndDropPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void openPage() {
        log.info("Opening page: " + pageUrl);
        openUrl(pageUrl);
        log.info("Page opened");
    }

    public void dragAtoB() {
        log.info("Performing drag and drop A box to B box...");
        performDragAndDrop(columnALocator,columnBLocator);
    }

    public String getColumnAText() {
        log.info("Getting column A text");
        String text = find(columnALocator).getText();
        log.info("Column A text is: " + text);
        return text;
    }

    public String getColumnBText() {
        log.info("Getting column B text");
        String text = find(columnBLocator).getText();
        log.info("Column B text is: " + text);
        return text;
    }
}
