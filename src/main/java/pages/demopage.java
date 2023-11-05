package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class demopage {
	private AndroidDriver<WebElement> driver;

    public demopage(AndroidDriver<WebElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.solodroid.solomerce:id/search")
    private MobileElement searchButton;

    @AndroidFindBy(id = "com.solodroid.solomerce:id/search_src_text")
    private MobileElement searchInput;

    @AndroidFindBy(id = "com.solodroid.solomerce:id/nav_category")
    private MobileElement categoryButton;

    // Add more elements using AndroidFindBy annotations as needed

    public void clickSearchButton() {
        searchButton.click();
    }

    public void setSearchInput(String keyword) {
        searchInput.sendKeys(keyword);
    }

    public void clickCategoryButton() {
        categoryButton.click();
    }
}
