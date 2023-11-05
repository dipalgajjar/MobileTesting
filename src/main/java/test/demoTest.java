package test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pages.demopage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class demoTest extends BaseTest{
	
    @Test
    public void testSearchFunctionality() {
        homePage.clickSearchButton();
        homePage.setSearchInput("watch");
        driver.hideKeyboard();
        // Add assertions or verifications here
    }

    @Test
    public void testCategoryNavigation() {
        homePage.clickCategoryButton();
        // Add assertions or verifications here
    }
}
