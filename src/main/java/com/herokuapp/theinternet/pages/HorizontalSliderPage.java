package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage extends BasePageObject{
    
    private final String pageUrl = "http://the-internet.herokuapp.com/horizontal_slider";

    private final By rangeLocator = By.id("range");
    private final By sliderLocator = By.tagName("input");

    public HorizontalSliderPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void openPage() {
        log.info("Opening page: " + pageUrl);
        openUrl(pageUrl);
        log.info("Page opened!");
    }
    
    public void setSliderTo(double value) {
        log.info("Moving slider to " + value);

        // Move slider normal method
        // Find the xOffset using given value
        // int width = find(sliderLocator).getSize().getWidth();
        // double percent = Double.parseDouble(value) / 5;
        // int xOffset = (int) (width * percent);

        // Actions action = new Actions(driver);
        // action.dragAndDropBy(find(sliderLocator), xOffset, 0).build().perform();

        int steps = (int) (value / 0.5);

        pressKey(sliderLocator, Keys.ENTER);
        for (int i = 0; i < steps; i++) {
            pressKey(sliderLocator, Keys.ARROW_RIGHT);
        }
    }

    public String getSliderValue() {
        String value = find(rangeLocator).getText();
        log.info("Slider value is " + value);
        return value;
    }
}
