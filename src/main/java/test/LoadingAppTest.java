package test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pages.LoadingAppPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoadingAppTest extends BaseTest{
	
	 @Test(priority = 1)
	    public void testSearchFunctionality() {
	    	LoadingAppPage lp = new LoadingAppPage(driver);
	        lp.SearchItem();
	        lp.EnterSearchText("Watch");
	        lp.HideKeyBoard();
	    }
	
	@Test(priority = 2)
    public void ClikableItems() throws InterruptedException {
    	LoadingAppPage lp = new LoadingAppPage(driver);
    	lp.ClickItem();

    	lp.AddToCart();

    	lp.AddNoOfItem();

    	lp.ClickAddBtn();

    	lp.GoToCart();

    	lp.VerifyCart();
    	
    	
    }
	
//	@Test(priority = 3)
//    public void AddNoOfItem() throws InterruptedException {
//    	LoadingAppPage lp = new LoadingAppPage(driver);
//    	lp.AddToCart();
//    	lp.AddNoOfItem();
//    	lp.ClickAddBtn();
//    	lp.GoToCart();
//    	lp.VerifyCart();
//    
//    	
//    }
	
   
    
    
   
}
