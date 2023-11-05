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

public class Day3 {	
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
//			WebElement search = driver.findElement(By.id("com.solodroid.solomerce:id/search"));
//			TouchAction swipeAction = new TouchAction<>(driver);
//			swipeAction.press(PointOption.point(450, 700)).waitAction().moveTo(PointOption.point(50, 700)).release().perform();
//			Thread.sleep(2000);
//			swipeAction.press(PointOption.point(50, 700)).waitAction().moveTo(PointOption.point(450, 700)).release().perform();
//			while(true) {
//				swipeAction.press(PointOption.point(655, 1100)).waitAction().moveTo(PointOption.point(450, 700)).release().perform();
//				if(driver.findElement(By.id("com.solodroid.solomerce:id/titler")).isDisplayed()) {
//					break;
//				}
//			}
			
			
			driver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector()"
					+ ".resourceId(\"com.solodroid.solomerce:id/viewpager\"))"
					+ ".scrollForward().scrollIntoView(new UiSelector()"
					+ ".textContains(\"Money Counter Kozure MC-101\"))");
			WebElement moneyC = driver.findElementByAndroidUIAutomator("new UiSelector()"
					+ ".textContains(\"Money Counter Kozure MC-101\")");
			moneyC.click();
			driver.findElementByAndroidUIAutomator("new UiSelector()"
							+ ".resourceId(\"com.solodroid.solomerce:id/product_image\")").click();
					
			MultiTouchAction action = new MultiTouchAction(driver);
			TouchAction touch1 = new TouchAction<>(driver);
			TouchAction touch2 = new TouchAction<>(driver);
			
			touch1.press(PointOption.point(200, 600)).moveTo(PointOption.point(200, 400)).release();
			touch1.press(PointOption.point(200, 650)).moveTo(PointOption.point(200,780)).release();
			action.add(touch1);
			action.add(touch2);
			action.perform();
			
			//========Refer Developer.android.com==========//
			
	}
}
		
