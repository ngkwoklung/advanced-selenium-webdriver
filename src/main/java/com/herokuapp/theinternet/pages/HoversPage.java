package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HoversPage extends BasePageObject{
    private final String pageUrl = "https://the-internet.herokuapp.com/hovers";
    private final By avatarlocator = By.xpath("//div[@class='figure']");
    private final By viewProfileLinkLocator = By.xpath(".//a[contains(text(),'View profile')]");
    public HoversPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void openPage() {
        log.info("Opening page: " + pageUrl);
        openUrl(pageUrl);
        log.info("Page openend");
    }


    public void openUserProfile(int i) {
        List<WebElement> avatars = findAll(avatarlocator);
        WebElement specficAvatar = avatars.get(i-1);
        hoverOverElement(specficAvatar);
        specficAvatar.findElement(viewProfileLinkLocator).click();
    }
}
