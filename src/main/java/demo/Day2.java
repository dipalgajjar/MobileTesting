package demo;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.HidesKeyboard;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.KeyEventFlag;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

public class Day2 {	
		public static void main(String[] args) throws MalformedURLException, InterruptedException {
			
//			com.solodroid.solomerce
//			.activities.ActivitySplash or .activities.MainActivity
//			Desired capabilities
			
			DesiredCapabilities dc = new DesiredCapabilities();
//			dc.setCapability("automationName", "UiAutomator2");
			dc.setCapability("platformName", "Android");
			dc.setCapability("platformVersion", "7.1.1");
			dc.setCapability("deviceName", "ZTE");
			dc.setCapability("appPackage", "com.solodroid.solomerce");
			dc.setCapability("appActivity", ".activities.ActivitySplash");
//			dc.setCapability("unlockType", "pattern");
//			dc.setCapability("unlockPin", "14789");
			AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("com.solodroid.solomerce:id/search")).click();
			driver.findElement(By.id("com.solodroid.solomerce:id/search_src_text")).sendKeys("watch");
			driver.hideKeyboard();
			Thread.sleep(3000);
			WebElement category = driver.findElement(By.id("com.solodroid.solomerce:id/nav_category"));
			Point categorysize = category.getLocation();
			System.out.println(categorysize.x);
			System.out.println(categorysize.y);
//			TouchAction action = new TouchAction(driver);
//			action.tap(PointOption.point(405,2320)).perform();
//			if(driver.getOrientation().equals(ScreenOrientation.LANDSCAPE)) {
//				driver.rotate(ScreenOrientation.PORTRAIT);
//			}
//			driver.rotate(ScreenOrientation.LANDSCAPE);
//			driver.runAppInBackground(Duration.ofSeconds(10));
//			driver.rotate(ScreenOrientation.PORTRAIT);
//			
//			driver.lockDevice();
//			System.out.println("Device is Locked");
//			Thread.sleep(8000);
//			driver.unlockDevice();
//			System.out.println("Device is Unlocked");
//			Thread.sleep(3000);
		//	driver.findElement(By.id("com.solodroid.solomerce:id/nav_profile")).click();
			
			System.out.println("Finished");
			Thread.sleep(3000);
		
	}
}
		
