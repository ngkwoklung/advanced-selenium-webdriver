package com.herokuapp.theinternet.horizontalslidertests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.HorizontalSliderPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliderTests extends TestUtilities {
    @Test
    public void sliderTest() {
        log.info("Starting sliderTest");
        HorizontalSliderPage horizontalSliderPage = new HorizontalSliderPage(driver, log);
        horizontalSliderPage.openPage();
        double value = 3.5;
        horizontalSliderPage.setSliderTo(value);
        String sliderValue = horizontalSliderPage.getSliderValue();
        Assert.assertEquals(String.valueOf(value), sliderValue, "Range is not correct. It is: " + sliderValue);
    }
}
