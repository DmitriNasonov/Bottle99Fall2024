package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BrowseLanguage extends BasePage{


    public BrowseLanguage(WebDriver driver) {
        super(driver);

    }
    private List<WebElement> getSubMenuList(){
        return driver.findElements(By.xpath("//ul[@id = 'submenu']//a"));

    }
    public boolean verifySubMenuItems(){
        return getSubMenuList().get(0).getText().equals("0-9");

    }
}
